package com.bazaarvoice.bvandroidsdk;

import M6.b;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayResponse;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.d;

/* loaded from: classes4.dex */
public final class LoadCallDisplay<RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> extends LoadCall<RequestType, ResponseType> {
    private final ConversationsAnalyticsManager conversationsAnalyticsManager;
    ConversationsCallback<ResponseType> displayCallback;
    private final DisplayUiHandler<RequestType, ResponseType> displayUiHandler;
    ConversationsDisplayCallback<ResponseType> displayV7Callback;
    private final DisplayWorkerHandler<RequestType, ResponseType> displayWorkerHandler;
    private final RequestType request;

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseType fetch() throws BazaarException {
        Response responseExecute = null;
        try {
            try {
                try {
                    responseExecute = FirebasePerfOkHttpClient.execute(this.call);
                    ResponseType responsetypeDeserializeAndCloseResponse = deserializeAndCloseResponse(responseExecute);
                    this.conversationsAnalyticsManager.sendSuccessfulConversationsDisplayResponse(responsetypeDeserializeAndCloseResponse, getRequest());
                    if (responseExecute != null && responseExecute.getBody() != null) {
                        responseExecute.getBody().close();
                    }
                    return responsetypeDeserializeAndCloseResponse;
                } catch (Throwable th2) {
                    throw new BazaarException("Unknown exception", th2);
                }
            } catch (BazaarException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new BazaarException("Execution of call failed", e11);
            }
        } catch (Throwable th3) {
            if (responseExecute != null && responseExecute.getBody() != null) {
                responseExecute.getBody().close();
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseType fetchV7() throws ConversationsException {
        Response response = null;
        try {
            try {
                try {
                    Response responseExecute = FirebasePerfOkHttpClient.execute(this.call);
                    ResponseType responsetypeDeserializeAndCloseResponseV7 = deserializeAndCloseResponseV7(responseExecute);
                    if (responsetypeDeserializeAndCloseResponseV7 == null || responsetypeDeserializeAndCloseResponseV7.getHasErrors().booleanValue()) {
                        List<Error> errors = Collections.EMPTY_LIST;
                        if (responsetypeDeserializeAndCloseResponseV7 != null && responsetypeDeserializeAndCloseResponseV7.getErrors() != null) {
                            errors = responsetypeDeserializeAndCloseResponseV7.getErrors();
                        }
                        throw ConversationsException.withRequestErrors(errors);
                    }
                    this.conversationsAnalyticsManager.sendSuccessfulConversationsDisplayResponse(responsetypeDeserializeAndCloseResponseV7, getRequest());
                    if (responseExecute != null && responseExecute.getBody() != null) {
                        responseExecute.getBody().close();
                    }
                    return responsetypeDeserializeAndCloseResponseV7;
                } catch (IOException e10) {
                    throw ConversationsException.withNoRequestErrors("Execution of call failed", e10);
                }
            } catch (ConversationsException e11) {
                throw e11;
            } catch (Throwable th2) {
                throw ConversationsException.withNoRequestErrors("Unknown exception", th2);
            }
        } catch (Throwable th3) {
            if (0 != 0 && response.getBody() != null) {
                response.getBody().close();
            }
            throw th3;
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public void loadAsync(ConversationsCallback<ResponseType> conversationsCallback) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Beginning of async request");
        b.b();
        this.displayCallback = conversationsCallback;
        dispatchFetch();
    }

    private static class DisplayUiHandler<RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> extends Handler {
        private static final int CB_FAILURE = 2;
        private static final int CB_FAILURE_V7 = 4;
        private static final int CB_SUCCESS = 1;
        private static final int CB_SUCCESS_V7 = 3;
        private final LoadCallDisplay<RequestType, ResponseType> loadCallDisplay;

        public DisplayUiHandler(Looper looper, LoadCallDisplay<RequestType, ResponseType> loadCallDisplay) {
            super(looper);
            this.loadCallDisplay = loadCallDisplay;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Handle displayui message");
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        this.loadCallDisplay.completeWithFailureV7((ConversationsException) message.obj);
                        return;
                    }
                    this.loadCallDisplay.completeWithSuccessV7((ConversationsDisplayResponse) message.obj);
                    return;
                }
                this.loadCallDisplay.completeWithFailure((BazaarException) message.obj);
                return;
            }
            this.loadCallDisplay.completeWithSuccess((ConversationsDisplayResponse) message.obj);
        }
    }

    private static class DisplayWorkerHandler<RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> extends Handler {
        private static final int FETCH = 1;
        private static final int FETCH_V7 = 2;
        private final LoadCallDisplay<RequestType, ResponseType> loadCallDisplay;

        public DisplayWorkerHandler(Looper looper, LoadCallDisplay<RequestType, ResponseType> loadCallDisplay) {
            super(looper);
            this.loadCallDisplay = loadCallDisplay;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Handle display worker message");
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    this.loadCallDisplay.dispatchCompleteWithSuccess(this.loadCallDisplay.fetch());
                    return;
                } catch (BazaarException e10) {
                    BVSDK.getInstance().getBvPixel().track(this.loadCallDisplay.createErrorReportFromLoadCall(e10));
                    this.loadCallDisplay.dispatchCompleteWithFailure(e10);
                    return;
                }
            }
            if (i10 == 2) {
                try {
                    this.loadCallDisplay.dispatchCompleteWithSuccessV7(this.loadCallDisplay.fetchV7());
                } catch (ConversationsException e11) {
                    BVSDK.getInstance().getBvPixel().track(this.loadCallDisplay.createErrorReportFromLoadCall(e11));
                    this.loadCallDisplay.dispatchCompleteWithFailureV7(e11);
                }
            }
        }
    }

    ConversationsAnalyticsManager getConversationsAnalyticsManager() {
        return this.conversationsAnalyticsManager;
    }

    RequestType getRequest() {
        return this.request;
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public ResponseType loadSync() throws BazaarException {
        b.c();
        return (ResponseType) fetch();
    }

    LoadCallDisplay(RequestType requesttype, Class<ResponseType> cls, d dVar, ConversationsAnalyticsManager conversationsAnalyticsManager, OkHttpClient okHttpClient, Gson gson, Looper looper, Looper looper2) {
        super(requesttype, cls, okHttpClient, gson);
        this.call = dVar;
        this.request = requesttype;
        this.conversationsAnalyticsManager = conversationsAnalyticsManager;
        this.displayUiHandler = new DisplayUiHandler<>(looper, this);
        this.displayWorkerHandler = new DisplayWorkerHandler<>(looper2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithFailure(BazaarException bazaarException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Complete with failure");
        ConversationsCallback<ResponseType> conversationsCallback = this.displayCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onFailure(bazaarException);
            this.displayCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithFailureV7(ConversationsException conversationsException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Complete with Failure");
        ConversationsDisplayCallback<ResponseType> conversationsDisplayCallback = this.displayV7Callback;
        if (conversationsDisplayCallback != null) {
            conversationsDisplayCallback.onFailure(conversationsException);
            this.displayV7Callback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Complete with success");
        ConversationsCallback<ResponseType> conversationsCallback = this.displayCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onSuccess(responsetype);
            this.displayCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithSuccessV7(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Complete with success");
        ConversationsDisplayCallback<ResponseType> conversationsDisplayCallback = this.displayV7Callback;
        if (conversationsDisplayCallback != null) {
            conversationsDisplayCallback.onSuccess(responsetype);
            this.displayV7Callback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithFailure(BazaarException bazaarException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatch completed with error");
        DisplayUiHandler<RequestType, ResponseType> displayUiHandler = this.displayUiHandler;
        displayUiHandler.sendMessage(displayUiHandler.obtainMessage(2, bazaarException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithFailureV7(ConversationsException conversationsException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatch displayui complete with error");
        DisplayUiHandler<RequestType, ResponseType> displayUiHandler = this.displayUiHandler;
        displayUiHandler.sendMessage(displayUiHandler.obtainMessage(4, conversationsException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatch completed with success");
        DisplayUiHandler<RequestType, ResponseType> displayUiHandler = this.displayUiHandler;
        displayUiHandler.sendMessage(displayUiHandler.obtainMessage(1, responsetype));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithSuccessV7(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatch displayui complete");
        DisplayUiHandler<RequestType, ResponseType> displayUiHandler = this.displayUiHandler;
        displayUiHandler.sendMessage(displayUiHandler.obtainMessage(3, responsetype));
    }

    private void dispatchFetch() {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatching message to handler");
        DisplayWorkerHandler<RequestType, ResponseType> displayWorkerHandler = this.displayWorkerHandler;
        displayWorkerHandler.sendMessage(displayWorkerHandler.obtainMessage(1));
    }

    private void dispatchFetchV7() {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Dispatching displayworker message to handler");
        DisplayWorkerHandler<RequestType, ResponseType> displayWorkerHandler = this.displayWorkerHandler;
        displayWorkerHandler.sendMessage(displayWorkerHandler.obtainMessage(2));
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public void cancel() {
        super.cancel();
        this.displayCallback = null;
    }

    public ResponseType loadDisplaySync() throws ConversationsException {
        if (!b.g()) {
            return (ResponseType) fetchV7();
        }
        throw ConversationsException.withCallOnMainThread();
    }

    public void loadAsync(ConversationsDisplayCallback<ResponseType> conversationsDisplayCallback) {
        BVSDK.getInstance().bvLogger.v("BVConversationsDisplay", "Beginning of async request");
        b.b();
        this.displayV7Callback = conversationsDisplayCallback;
        dispatchFetchV7();
    }
}

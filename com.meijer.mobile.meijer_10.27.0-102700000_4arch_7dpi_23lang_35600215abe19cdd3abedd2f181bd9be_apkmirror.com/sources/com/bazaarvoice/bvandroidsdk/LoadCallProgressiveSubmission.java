package com.bazaarvoice.bvandroidsdk;

import L6.b;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.ConversationsResponse;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.d;

/* loaded from: classes4.dex */
public class LoadCallProgressiveSubmission<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends LoadCall<RequestType, ResponseType> {
    public static final String TAG = "BVProgressiveSubmission";
    private final ConversationsAnalyticsManager conversationsAnalyticsManager;
    private ConversationsCallback<ResponseType> conversationsCallback;
    private final ProgressiveSubmissionUiHandler displayUiHandler;
    private final ProgressiveSubmissionWorkerHandler displayWorkerHandler;
    private ConversationsSubmissionCallback<ResponseType> progressiveSubmissionCallback;
    private final RequestType request;

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    @Deprecated
    public void loadAsync(ConversationsCallback<ResponseType> conversationsCallback) {
        BVSDK.getInstance().bvLogger.v(TAG, "Beginning of async request");
        b.b();
        this.conversationsCallback = conversationsCallback;
        this.displayWorkerHandler.sendEmptyMessage(0);
    }

    private static class ProgressiveSubmissionUiHandler<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends Handler {
        private static final int CB_FAILURE = 2;
        private static final int CB_SUCCESS = 1;
        LoadCallProgressiveSubmission<RequestType, ResponseType> loadCallProgressiveSubmission;

        ProgressiveSubmissionUiHandler(Looper looper, LoadCallProgressiveSubmission<RequestType, ResponseType> loadCallProgressiveSubmission) {
            super(looper);
            this.loadCallProgressiveSubmission = loadCallProgressiveSubmission;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BVSDK.getInstance().bvLogger.v(LoadCallProgressiveSubmission.TAG, "Handle UI message");
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                this.loadCallProgressiveSubmission.completeWithException((ConversationsSubmissionException) message.obj);
                return;
            }
            this.loadCallProgressiveSubmission.completeWithSuccess((ConversationsResponse) message.obj);
        }
    }

    private static class ProgressiveSubmissionWorkerHandler<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends Handler {
        LoadCallProgressiveSubmission<RequestType, ResponseType> progressiveSubmissionCallback;

        ProgressiveSubmissionWorkerHandler(Looper looper, LoadCallProgressiveSubmission<RequestType, ResponseType> loadCallProgressiveSubmission) {
            super(looper);
            this.progressiveSubmissionCallback = loadCallProgressiveSubmission;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BVSDK.getInstance().bvLogger.v(LoadCallProgressiveSubmission.TAG, "Handle display worker message");
            try {
                this.progressiveSubmissionCallback.dispatchCompleteWithSuccess(this.progressiveSubmissionCallback.fetch());
            } catch (BazaarException e10) {
                this.progressiveSubmissionCallback.dispatchError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithSuccess(ResponseType responsetype) {
        this.displayUiHandler.sendMessage(this.displayUiHandler.obtainMessage(1, responsetype));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchError(BazaarException bazaarException) {
        this.displayUiHandler.sendMessage(this.displayUiHandler.obtainMessage(2, bazaarException));
    }

    private List<Error> getErrorsFromResponse(ResponseType responsetype) {
        return (responsetype == null || responsetype.getErrors() == null) ? new ArrayList() : responsetype.getErrors();
    }

    ConversationsAnalyticsManager getConversationsAnalyticsManager() {
        return this.conversationsAnalyticsManager;
    }

    RequestType getRequest() {
        return this.request;
    }

    LoadCallProgressiveSubmission(RequestType requesttype, Class<ResponseType> cls, ConversationsAnalyticsManager conversationsAnalyticsManager, Looper looper, Looper looper2, OkHttpClient okHttpClient, Gson gson, d dVar) {
        super(requesttype, cls, okHttpClient, gson);
        this.call = dVar;
        this.request = requesttype;
        this.conversationsAnalyticsManager = conversationsAnalyticsManager;
        this.displayUiHandler = new ProgressiveSubmissionUiHandler(looper, this);
        this.displayWorkerHandler = new ProgressiveSubmissionWorkerHandler(looper2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithException(ConversationsSubmissionException conversationsSubmissionException) {
        BVSDK.getInstance().bvLogger.v(TAG, "Complete with failure");
        ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback = this.progressiveSubmissionCallback;
        if (conversationsSubmissionCallback != null) {
            conversationsSubmissionCallback.onFailure(conversationsSubmissionException);
            this.progressiveSubmissionCallback = null;
            return;
        }
        ConversationsCallback<ResponseType> conversationsCallback = this.conversationsCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onFailure(conversationsSubmissionException);
            this.conversationsCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v(TAG, "Complete With Success");
        ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback = this.progressiveSubmissionCallback;
        if (conversationsSubmissionCallback != null) {
            conversationsSubmissionCallback.onSuccess(responsetype);
            this.progressiveSubmissionCallback = null;
            return;
        }
        ConversationsCallback<ResponseType> conversationsCallback = this.conversationsCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onSuccess(responsetype);
            this.conversationsCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseType fetch() throws ConversationsException {
        BVSDK.getInstance().bvLogger.v(TAG, "Fetching request");
        Response response = null;
        try {
            try {
                Response responseExecute = FirebasePerfOkHttpClient.execute(this.call);
                ResponseType responsetypeDeserializeAndCloseResponseV7 = deserializeAndCloseResponseV7(responseExecute);
                if (responsetypeDeserializeAndCloseResponseV7 != null && !responsetypeDeserializeAndCloseResponseV7.getHasErrors().booleanValue()) {
                    this.conversationsAnalyticsManager.sendSuccessfulConversationsSubmitResponse(this.request);
                    if (responseExecute != null && responseExecute.getBody() != null) {
                        responseExecute.getBody().close();
                    }
                    return responsetypeDeserializeAndCloseResponseV7;
                }
                List<Error> errorsFromResponse = getErrorsFromResponse(responsetypeDeserializeAndCloseResponseV7);
                if (responsetypeDeserializeAndCloseResponseV7 instanceof ProgressiveSubmitResponse) {
                    ProgressiveSubmitResponse progressiveSubmitResponse = (ProgressiveSubmitResponse) responsetypeDeserializeAndCloseResponseV7;
                    if (progressiveSubmitResponse.getData() != null) {
                        throw ConversationsSubmissionException.withRequestErrors(errorsFromResponse, progressiveSubmitResponse.getData().formValidationErrors);
                    }
                }
                throw ConversationsSubmissionException.withRequestErrors(errorsFromResponse, new ArrayList());
            } catch (Throwable th2) {
                if (0 != 0 && response.getBody() != null) {
                    response.getBody().close();
                }
                throw th2;
            }
        } catch (ConversationsSubmissionException e10) {
            throw e10;
        } catch (IOException e11) {
            throw ConversationsSubmissionException.withNoRequestErrors("Execution of call failed", (Throwable) e11);
        } catch (Throwable th3) {
            throw ConversationsSubmissionException.withNoRequestErrors("Unknown exception", th3);
        }
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public ResponseType loadSync() throws BazaarException {
        BVSDK.getInstance().bvLogger.v(TAG, "Beginning of sync request");
        b.c();
        return (ResponseType) fetch();
    }

    public void loadAsync(ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback) {
        BVSDK.getInstance().bvLogger.v(TAG, "Beginning of async request");
        b.b();
        this.progressiveSubmissionCallback = conversationsSubmissionCallback;
        this.displayWorkerHandler.sendEmptyMessage(0);
    }
}

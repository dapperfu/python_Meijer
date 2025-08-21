package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.ConversationsRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsResponse;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.d;

/* loaded from: classes4.dex */
abstract class LoadCall<RequestType extends ConversationsRequest, ResponseType extends ConversationsResponse> {
    d call;
    final Gson gson;
    final OkHttpClient okHttpClient;
    final RequestType requestTypeClass;
    final Class<ResponseType> responseTypeClass;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.bazaarvoice.bvandroidsdk.ConversationsResponse] */
    ResponseType deserializeAndCloseResponse(Response response) throws BazaarException {
        BazaarException bazaarException;
        ResponseType responsetype = null;
        try {
            try {
                ?? r12 = (ConversationsResponse) this.gson.m(response.getBody().charStream(), this.responseTypeClass);
                if (response.getBody() != null) {
                    response.getBody().close();
                }
                bazaarException = null;
                responsetype = r12;
            } catch (JsonIOException | JsonSyntaxException unused) {
                bazaarException = new BazaarException("Unable to parse JSON");
                if (response != null && response.getBody() != null) {
                    response.getBody().close();
                }
            }
            if (responsetype != null && responsetype.getHasErrors().booleanValue() && responsetype.getErrors().size() > 0) {
                bazaarException = new BazaarException("Request has errors");
            }
            if (bazaarException == null) {
                return responsetype;
            }
            throw bazaarException;
        } catch (Throwable th2) {
            if (response != null && response.getBody() != null) {
                response.getBody().close();
            }
            throw th2;
        }
    }

    public abstract void loadAsync(ConversationsCallback<ResponseType> conversationsCallback);

    public abstract ResponseType loadSync() throws BazaarException;

    public void cancel() {
        d dVar = this.call;
        if (dVar == null || dVar.getCanceled()) {
            return;
        }
        this.call.cancel();
    }

    BVErrorReport createErrorReportFromLoadCall(Exception exc) {
        String simpleName = this.requestTypeClass.getClass().getSimpleName();
        BVEventValues.BVProductType productTypeFromRequest = ConversationAnalyticsUtil.getProductTypeFromRequest(this.requestTypeClass);
        return exc instanceof ConversationsException ? new BVErrorReport(productTypeFromRequest, simpleName, ((ConversationsException) exc).getErrorListMessages()) : new BVErrorReport(productTypeFromRequest, simpleName, exc);
    }

    void errorOnMainThread(ConversationsCallback<ResponseType> conversationsCallback, BazaarException bazaarException) {
        BVSDK.getInstance().postPayloadToMainThread(new BVHandlerCallbackPayload(new BVHandlerCallback() { // from class: com.bazaarvoice.bvandroidsdk.LoadCall.2
            @Override // com.bazaarvoice.bvandroidsdk.BVHandlerCallback
            public void performOnMainThread(BVHandlerCallbackPayload bVHandlerCallbackPayload) {
                LoadCall.this.callbackMainThread(bVHandlerCallbackPayload);
            }
        }, conversationsCallback, null, bazaarException));
    }

    void successOnMainThread(ConversationsCallback<ResponseType> conversationsCallback, ConversationsResponse conversationsResponse) {
        BVSDK.getInstance().postPayloadToMainThread(new BVHandlerCallbackPayload(new BVHandlerCallback() { // from class: com.bazaarvoice.bvandroidsdk.LoadCall.1
            @Override // com.bazaarvoice.bvandroidsdk.BVHandlerCallback
            public void performOnMainThread(BVHandlerCallbackPayload bVHandlerCallbackPayload) {
                LoadCall.this.callbackMainThread(bVHandlerCallbackPayload);
            }
        }, conversationsCallback, conversationsResponse, null));
    }

    LoadCall(RequestType requesttype, Class<ResponseType> cls, OkHttpClient okHttpClient, Gson gson) {
        this.responseTypeClass = cls;
        this.requestTypeClass = requesttype;
        this.okHttpClient = okHttpClient;
        this.gson = gson;
    }

    void callbackMainThread(BVHandlerCallbackPayload bVHandlerCallbackPayload) {
        BVCallback externalCB = bVHandlerCallbackPayload.getExternalCB();
        if (bVHandlerCallbackPayload.getError() != null) {
            externalCB.onFailure(bVHandlerCallbackPayload.getError());
        } else {
            externalCB.onSuccess(bVHandlerCallbackPayload.getPayload());
        }
    }

    ResponseType deserializeAndCloseResponseV7(Response response) throws ConversationsSubmissionException {
        try {
            try {
                ResponseType responsetype = (ResponseType) this.gson.m(response.getBody().charStream(), this.responseTypeClass);
                if (response.getBody() != null) {
                    response.getBody().close();
                }
                return responsetype;
            } catch (JsonIOException e10) {
                e = e10;
                throw ConversationsSubmissionException.withNoRequestErrors("Unable to parse JSON", e);
            } catch (JsonSyntaxException e11) {
                e = e11;
                throw ConversationsSubmissionException.withNoRequestErrors("Unable to parse JSON", e);
            } catch (Throwable th2) {
                throw ConversationsSubmissionException.withNoRequestErrors("Unknown error", th2);
            }
        } catch (Throwable th3) {
            if (response != null && response.getBody() != null) {
                response.getBody().close();
            }
            throw th3;
        }
    }
}

package com.bazaarvoice.bvandroidsdk;

import M6.b;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.ConversationsResponse;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.PhotoUploadRequest;
import com.bazaarvoice.bvandroidsdk.VideoUploadRequest;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class LoadCallSubmission<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends LoadCall<RequestType, ResponseType> {
    private final ConversationsAnalyticsManager conversationsAnalyticsManager;
    private final RequestFactory requestFactory;
    private final RequestType submissionRequest;
    ConversationsCallback<ResponseType> submitCallback;
    private final SubmitUiHandler<RequestType, ResponseType> submitUiHandler;
    ConversationsSubmissionCallback<ResponseType> submitV7Callback;
    private final SubmitWorkerHandler<RequestType, ResponseType> submitWorkerHandler;

    private static class SubmitUiHandler<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends Handler {
        private static final int CB_FAILURE = 2;
        private static final int CB_FAILURE_V7 = 4;
        private static final int CB_SUCCESS = 1;
        private static final int CB_SUCCESS_V7 = 3;
        private final LoadCallSubmission<RequestType, ResponseType> loadCallSubmission;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.loadCallSubmission.completeWithSuccess((ConversationsResponse) message.obj);
                return;
            }
            if (i10 == 2) {
                this.loadCallSubmission.completeWithFailure((BazaarException) message.obj);
            } else if (i10 == 3) {
                this.loadCallSubmission.completeWithSuccessV7((ConversationsResponse) message.obj);
            } else {
                if (i10 != 4) {
                    return;
                }
                this.loadCallSubmission.completeWithFailureV7((ConversationsSubmissionException) message.obj);
            }
        }

        public SubmitUiHandler(Looper looper, LoadCallSubmission<RequestType, ResponseType> loadCallSubmission) {
            super(looper);
            this.loadCallSubmission = loadCallSubmission;
        }
    }

    private static class SubmitWorkerHandler<RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> extends Handler {
        private static final int SUBMIT = 1;
        private static final int SUBMIT_V7 = 2;
        private final LoadCallSubmission<RequestType, ResponseType> loadCallSubmission;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    this.loadCallSubmission.dispatchCompleteWithSuccess(this.loadCallSubmission.legacyLoadAsyncBehavior());
                    return;
                } catch (BazaarException e10) {
                    BVSDK.getInstance().getBvPixel().track(this.loadCallSubmission.createErrorReportFromLoadCall(e10));
                    this.loadCallSubmission.dispatchCompleteWithFailure(e10);
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
            try {
                this.loadCallSubmission.dispatchCompleteV7WithSuccess(this.loadCallSubmission.submitFlowV7());
            } catch (ConversationsSubmissionException e11) {
                BVSDK.getInstance().getBvPixel().track(this.loadCallSubmission.createErrorReportFromLoadCall(e11));
                this.loadCallSubmission.dispatchCompleteV7WithFailure(e11);
            }
        }

        public SubmitWorkerHandler(Looper looper, LoadCallSubmission<RequestType, ResponseType> loadCallSubmission) {
            super(looper);
            this.loadCallSubmission = loadCallSubmission;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseType legacyLoadAsyncBehavior() throws BazaarException {
        return (ResponseType) submitFlow(false);
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public void loadAsync(ConversationsCallback<ResponseType> conversationsCallback) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Begin async loading");
        this.submitCallback = conversationsCallback;
        dispatchSubmit();
    }

    private List<Photo> postPhotosAndSubmissionSync(List<PhotoUpload> list) throws BazaarException {
        Response responseExecute;
        BVSDK.getInstance().bvLogger.d("Submission", String.format("Preparing to submit %d photos", Integer.valueOf(list.size())));
        ArrayList arrayList = new ArrayList();
        try {
            for (PhotoUpload photoUpload : list) {
                PhotoUploadRequest photoUploadRequestBuild = new PhotoUploadRequest.Builder(photoUpload).build();
                BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload photo request ready");
                try {
                    responseExecute = FirebasePerfOkHttpClient.execute(this.okHttpClient.b(this.requestFactory.create(photoUploadRequestBuild)));
                    try {
                        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload photo request executed");
                        Photo photoDeserializePhotoResponse = deserializePhotoResponse(responseExecute);
                        photoDeserializePhotoResponse.setCaption(photoUpload.getCaption());
                        arrayList.add(photoDeserializePhotoResponse);
                        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload photo request complete");
                        if (responseExecute != null) {
                            responseExecute.getBody().close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (responseExecute != null) {
                            responseExecute.getBody().close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    responseExecute = null;
                }
            }
            return arrayList;
        } catch (ConversationsSubmissionException e10) {
            throw ConversationsSubmissionException.withRequestErrors(e10.getErrors(), e10.getFieldErrors());
        } catch (Throwable th4) {
            throw new BazaarException(th4.getMessage());
        }
    }

    private List<Video> postVideosAndSubmissionSync(List<VideoUpload> list) throws BazaarException {
        Response responseExecute;
        BVSDK.getInstance().bvLogger.d("Submission", String.format("Preparing to submit %d videos", Integer.valueOf(list.size())));
        ArrayList arrayList = new ArrayList();
        try {
            for (VideoUpload videoUpload : list) {
                VideoUploadRequest videoUploadRequestBuild = new VideoUploadRequest.Builder(videoUpload).build();
                BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload video request ready");
                try {
                    responseExecute = FirebasePerfOkHttpClient.execute(this.okHttpClient.b(this.requestFactory.create(videoUploadRequestBuild)));
                    try {
                        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload video request executed");
                        Video videoDeserializeVideoResponse = deserializeVideoResponse(responseExecute);
                        videoDeserializeVideoResponse.setCaption(videoUpload.getCaption());
                        arrayList.add(videoDeserializeVideoResponse);
                        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Upload video request complete");
                        if (responseExecute != null) {
                            responseExecute.getBody().close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (responseExecute != null) {
                            responseExecute.getBody().close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    responseExecute = null;
                }
            }
            return arrayList;
        } catch (ConversationsSubmissionException e10) {
            throw ConversationsSubmissionException.withRequestErrors(e10.getErrors(), e10.getFieldErrors());
        } catch (Throwable th4) {
            throw new BazaarException(th4.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x0039, IOException -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:4:0x0015, B:6:0x001b, B:17:0x0046, B:20:0x0055, B:12:0x003d, B:25:0x005f, B:26:0x0066), top: B:30:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[Catch: all -> 0x0039, IOException -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:4:0x0015, B:6:0x001b, B:17:0x0046, B:20:0x0055, B:12:0x003d, B:25:0x005f, B:26:0x0066), top: B:30:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ResponseType submit() throws java.lang.Throwable {
        /*
            r6 = this;
            com.bazaarvoice.bvandroidsdk.RequestFactory r0 = r6.requestFactory
            RequestType extends com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest r1 = r6.submissionRequest
            okhttp3.Request r0 = r0.create(r1)
            okhttp3.OkHttpClient r1 = r6.okHttpClient
            okhttp3.d r0 = r1.b(r0)
            r6.call = r0
            r1 = 0
            okhttp3.Response r0 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r0)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5b
            boolean r2 = r0.getIsSuccessful()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            if (r2 != 0) goto L3d
            com.bazaarvoice.bvandroidsdk.BazaarException r2 = new com.bazaarvoice.bvandroidsdk.BazaarException     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r4 = "Unsuccessful response for Conversations with error code: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            int r4 = r0.getCode()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r3.append(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
        L35:
            r5 = r2
            r2 = r1
            r1 = r5
            goto L44
        L39:
            r1 = move-exception
            goto L67
        L3b:
            r1 = move-exception
            goto L5f
        L3d:
            com.bazaarvoice.bvandroidsdk.ConversationsResponse r2 = r6.deserializeAndCloseResponse(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b com.bazaarvoice.bvandroidsdk.BazaarException -> L42
            goto L44
        L42:
            r2 = move-exception
            goto L35
        L44:
            if (r1 != 0) goto L55
            com.bazaarvoice.bvandroidsdk.ConversationsAnalyticsManager r1 = r6.conversationsAnalyticsManager     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            RequestType extends com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest r3 = r6.submissionRequest     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1.sendSuccessfulConversationsSubmitResponse(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            okhttp3.ResponseBody r0 = r0.getBody()
            r0.close()
            return r2
        L55:
            throw r1     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
        L56:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L67
        L5b:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L5f:
            com.bazaarvoice.bvandroidsdk.BazaarException r2 = new com.bazaarvoice.bvandroidsdk.BazaarException     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "Execution of call failed"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.Throwable -> L39
        L67:
            if (r0 == 0) goto L70
            okhttp3.ResponseBody r0 = r0.getBody()
            r0.close()
        L70:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bazaarvoice.bvandroidsdk.LoadCallSubmission.submit():com.bazaarvoice.bvandroidsdk.ConversationsResponse");
    }

    private ResponseType submitFlow(boolean z10) throws BazaarException {
        BazaarException error = this.submissionRequest.getError();
        if (error != null) {
            throw error;
        }
        if (this.submissionRequest.getAction() == Action.Preview) {
            return (ResponseType) submit();
        }
        this.submissionRequest.setForcePreview(true);
        ResponseType responsetype = (ResponseType) submit();
        if (responsetype.getHasErrors().booleanValue()) {
            if (z10) {
                throw new BazaarException("Request has form errors");
            }
            return responsetype;
        }
        if (this.submissionRequest.getPhotoUploads() != null && this.submissionRequest.getPhotoUploads().size() > 0) {
            this.submissionRequest.setPhotos(postPhotosAndSubmissionSync(this.submissionRequest.getPhotoUploads()));
        }
        if (this.submissionRequest.getVideoUploads() != null && this.submissionRequest.getVideoUploads().size() > 0) {
            this.submissionRequest.setVideos(postVideosAndSubmissionSync(this.submissionRequest.getVideoUploads()));
        }
        this.submissionRequest.setForcePreview(false);
        return (ResponseType) submit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseType submitFlowV7() throws ConversationsSubmissionException {
        boolean z10 = this.submissionRequest.getAction() == Action.Preview;
        boolean z11 = this.submissionRequest.getAction() == Action.Form;
        if (z10 || z11) {
            return (ResponseType) submitV7();
        }
        this.submissionRequest.setForcePreview(true);
        ResponseType responsetype = (ResponseType) submitV7();
        if (responsetype.getHasErrors().booleanValue()) {
            return responsetype;
        }
        if (this.submissionRequest.getPhotoUploads() != null && this.submissionRequest.getPhotoUploads().size() > 0) {
            try {
                this.submissionRequest.setPhotos(postPhotosAndSubmissionSync(this.submissionRequest.getPhotoUploads()));
            } catch (BazaarException e10) {
                e10.printStackTrace();
                if (!(e10 instanceof ConversationsSubmissionException)) {
                    throw ConversationsSubmissionException.withNoRequestErrors(e10.getMessage());
                }
                ConversationsSubmissionException conversationsSubmissionException = (ConversationsSubmissionException) e10;
                throw ConversationsSubmissionException.withRequestErrors(conversationsSubmissionException.getErrors(), conversationsSubmissionException.getFieldErrors());
            }
        }
        if (this.submissionRequest.getVideoUploads() != null && this.submissionRequest.getVideoUploads().size() > 0) {
            try {
                this.submissionRequest.setVideos(postVideosAndSubmissionSync(this.submissionRequest.getVideoUploads()));
            } catch (BazaarException e11) {
                e11.printStackTrace();
                if (!(e11 instanceof ConversationsSubmissionException)) {
                    throw ConversationsSubmissionException.withNoRequestErrors(e11.getMessage());
                }
                ConversationsSubmissionException conversationsSubmissionException2 = (ConversationsSubmissionException) e11;
                throw ConversationsSubmissionException.withRequestErrors(conversationsSubmissionException2.getErrors(), conversationsSubmissionException2.getFieldErrors());
            }
        }
        if (this.submissionRequest.getVideoUploads() != null && this.submissionRequest.getVideoUploads().size() > 0) {
            try {
                this.submissionRequest.setVideos(postVideosAndSubmissionSync(this.submissionRequest.getVideoUploads()));
            } catch (BazaarException e12) {
                e12.printStackTrace();
                if (!(e12 instanceof ConversationsSubmissionException)) {
                    throw ConversationsSubmissionException.withNoRequestErrors(e12.getMessage());
                }
                ConversationsSubmissionException conversationsSubmissionException3 = (ConversationsSubmissionException) e12;
                throw ConversationsSubmissionException.withRequestErrors(conversationsSubmissionException3.getErrors(), conversationsSubmissionException3.getFieldErrors());
            }
        }
        this.submissionRequest.setForcePreview(false);
        return (ResponseType) submitV7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[DONT_GENERATE, PHI: r0 r1 r2
      0x00a7: PHI (r0v9 okhttp3.Response) = (r0v8 okhttp3.Response), (r0v12 okhttp3.Response) binds: [B:33:0x00a5, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r1v7 java.lang.Object) = (r1v18 java.lang.Object), (r1v19 java.lang.Object) binds: [B:33:0x00a5, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r2v5 'e' com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException) = 
      (r2v4 'e' com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException)
      (r2v8 'e' com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException)
     binds: [B:33:0x00a5, B:39:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [ResponseType extends com.bazaarvoice.bvandroidsdk.ConversationsResponse] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bazaarvoice.bvandroidsdk.ConversationsResponse] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [okhttp3.Response] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ResponseType submitV7() throws com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException {
        /*
            r6 = this;
            com.bazaarvoice.bvandroidsdk.RequestFactory r0 = r6.requestFactory
            RequestType extends com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest r1 = r6.submissionRequest
            okhttp3.Request r0 = r0.create(r1)
            okhttp3.OkHttpClient r1 = r6.okHttpClient
            okhttp3.d r0 = r1.b(r0)
            r6.call = r0
            com.bazaarvoice.bvandroidsdk.BVSDK r0 = com.bazaarvoice.bvandroidsdk.BVSDK.getInstance()
            com.bazaarvoice.bvandroidsdk.BVLogger r0 = r0.bvLogger
            java.lang.String r1 = "BVConversationsSubmission"
            java.lang.String r2 = "Request prepared"
            r0.v(r1, r2)
            r0 = 0
            okhttp3.d r1 = r6.call     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9c
            okhttp3.Response r1 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r1)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9c
            boolean r2 = r1.getIsSuccessful()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            if (r2 != 0) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            java.lang.String r3 = "Unsuccessful response HTTP error code: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            int r3 = r1.getCode()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            r2.append(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException r2 = com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException.withNoRequestErrors(r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            goto L58
        L44:
            r2 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L9f
        L49:
            r2 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto Lb2
        L4f:
            com.bazaarvoice.bvandroidsdk.ConversationsResponse r2 = r6.deserializeAndCloseResponseV7(r1)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49 com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException -> L57
            r5 = r2
            r2 = r0
            r0 = r5
            goto L58
        L57:
            r2 = move-exception
        L58:
            if (r0 == 0) goto L91
            java.lang.Boolean r3 = r0.getHasErrors()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            if (r3 != 0) goto L6c
            com.bazaarvoice.bvandroidsdk.ConversationsAnalyticsManager r3 = r6.conversationsAnalyticsManager     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            RequestType extends com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest r4 = r6.submissionRequest     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            r3.sendSuccessfulConversationsSubmitResponse(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            goto L91
        L6c:
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            java.util.List r3 = r0.getErrors()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            if (r3 == 0) goto L79
            java.util.List r3 = r0.getErrors()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            goto L7a
        L79:
            r3 = r2
        L7a:
            boolean r4 = r0 instanceof com.bazaarvoice.bvandroidsdk.ConversationsSubmissionResponse     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            if (r4 == 0) goto L8d
            r2 = r0
            com.bazaarvoice.bvandroidsdk.ConversationsSubmissionResponse r2 = (com.bazaarvoice.bvandroidsdk.ConversationsSubmissionResponse) r2     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            java.util.List r4 = r2.getFieldErrors()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            java.util.List r2 = r2.getFormFields()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            addFormFieldsToFieldErrors(r2, r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
            r2 = r4
        L8d:
            com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException r2 = com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException.withRequestErrors(r3, r2)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L49
        L91:
            okhttp3.ResponseBody r1 = r1.getBody()
            r1.close()
            goto Lbb
        L99:
            r2 = move-exception
            r1 = r0
            goto L9f
        L9c:
            r2 = move-exception
            r1 = r0
            goto Lb2
        L9f:
            java.lang.String r3 = "Unknown error"
            com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException r2 = com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException.withNoRequestErrors(r3, r2)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lae
        La7:
            okhttp3.ResponseBody r0 = r0.getBody()
            r0.close()
        Lae:
            r0 = r1
            goto Lbb
        Lb0:
            r1 = move-exception
            goto Lbf
        Lb2:
            java.lang.String r3 = "Execution of call failed"
            com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException r2 = com.bazaarvoice.bvandroidsdk.ConversationsSubmissionException.withNoRequestErrors(r3, r2)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lae
            goto La7
        Lbb:
            if (r2 != 0) goto Lbe
            return r0
        Lbe:
            throw r2
        Lbf:
            if (r0 == 0) goto Lc8
            okhttp3.ResponseBody r0 = r0.getBody()
            r0.close()
        Lc8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bazaarvoice.bvandroidsdk.LoadCallSubmission.submitV7():com.bazaarvoice.bvandroidsdk.ConversationsResponse");
    }

    RequestType getRequest() {
        return this.submissionRequest;
    }

    LoadCallSubmission(RequestType requesttype, Class<ResponseType> cls, ConversationsAnalyticsManager conversationsAnalyticsManager, RequestFactory requestFactory, Looper looper, Looper looper2, OkHttpClient okHttpClient, Gson gson) {
        super(requesttype, cls, okHttpClient, gson);
        this.submissionRequest = requesttype;
        this.conversationsAnalyticsManager = conversationsAnalyticsManager;
        this.requestFactory = requestFactory;
        this.submitUiHandler = new SubmitUiHandler<>(looper2, this);
        this.submitWorkerHandler = new SubmitWorkerHandler<>(looper, this);
    }

    private static void addFormFieldsToFieldErrors(List<FormField> list, List<FieldError> list2) {
        for (FieldError fieldError : list2) {
            fieldError.setFormField(findFormFieldForError(list, fieldError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithFailure(BazaarException bazaarException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with failure");
        ConversationsCallback<ResponseType> conversationsCallback = this.submitCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onFailure(bazaarException);
            this.submitCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithFailureV7(ConversationsSubmissionException conversationsSubmissionException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Submit complete with failure");
        ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback = this.submitV7Callback;
        if (conversationsSubmissionCallback != null) {
            conversationsSubmissionCallback.onFailure(conversationsSubmissionException);
            this.submitV7Callback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with success");
        ConversationsCallback<ResponseType> conversationsCallback = this.submitCallback;
        if (conversationsCallback != null) {
            conversationsCallback.onSuccess(responsetype);
            this.submitCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeWithSuccessV7(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Submit complete with success");
        ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback = this.submitV7Callback;
        if (conversationsSubmissionCallback != null) {
            conversationsSubmissionCallback.onSuccess(responsetype);
            this.submitV7Callback = null;
        }
    }

    private Photo deserializePhotoResponse(Response response) throws ConversationsSubmissionException {
        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Deserialize photo response");
        PhotoUploadResponse photoUploadResponse = (PhotoUploadResponse) this.gson.m(response.getBody().charStream(), PhotoUploadResponse.class);
        response.getBody().close();
        if (photoUploadResponse.getHasErrors().booleanValue()) {
            BVSDK.getInstance().bvLogger.e("BVConversationsSubmission", "Failed to deserialize photo");
            List<Error> errors = Collections.EMPTY_LIST;
            if (photoUploadResponse.getErrors() != null) {
                errors = photoUploadResponse.getErrors();
            }
            List<FieldError> fieldErrors = photoUploadResponse.getFieldErrors();
            addFormFieldsToFieldErrors(photoUploadResponse.getFormFields(), fieldErrors);
            throw ConversationsSubmissionException.withRequestErrors(errors, fieldErrors);
        }
        return photoUploadResponse.getPhoto();
    }

    private Video deserializeVideoResponse(Response response) throws ConversationsSubmissionException {
        BVSDK.getInstance().bvLogger.d("BVConversationsSubmission", "Deserialize video response");
        VideoUploadResponse videoUploadResponse = (VideoUploadResponse) this.gson.m(response.getBody().charStream(), VideoUploadResponse.class);
        response.getBody().close();
        if (videoUploadResponse.getHasErrors().booleanValue()) {
            BVSDK.getInstance().bvLogger.e("BVConversationsSubmission", "Failed to deserialize photo");
            List<Error> errors = Collections.EMPTY_LIST;
            if (videoUploadResponse.getErrors() != null) {
                errors = videoUploadResponse.getErrors();
            }
            List<FieldError> fieldErrors = videoUploadResponse.getFieldErrors();
            addFormFieldsToFieldErrors(videoUploadResponse.getFormFields(), fieldErrors);
            throw ConversationsSubmissionException.withRequestErrors(errors, fieldErrors);
        }
        return videoUploadResponse.getVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteV7WithFailure(ConversationsSubmissionException conversationsSubmissionException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with failure");
        SubmitUiHandler<RequestType, ResponseType> submitUiHandler = this.submitUiHandler;
        submitUiHandler.sendMessage(submitUiHandler.obtainMessage(4, conversationsSubmissionException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteV7WithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with success");
        SubmitUiHandler<RequestType, ResponseType> submitUiHandler = this.submitUiHandler;
        submitUiHandler.sendMessage(submitUiHandler.obtainMessage(3, responsetype));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithFailure(BazaarException bazaarException) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with failure");
        SubmitUiHandler<RequestType, ResponseType> submitUiHandler = this.submitUiHandler;
        submitUiHandler.sendMessage(submitUiHandler.obtainMessage(2, bazaarException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCompleteWithSuccess(ResponseType responsetype) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch complete with success");
        SubmitUiHandler<RequestType, ResponseType> submitUiHandler = this.submitUiHandler;
        submitUiHandler.sendMessage(submitUiHandler.obtainMessage(1, responsetype));
    }

    private void dispatchSubmit() {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch submit message");
        SubmitWorkerHandler<RequestType, ResponseType> submitWorkerHandler = this.submitWorkerHandler;
        submitWorkerHandler.sendMessage(submitWorkerHandler.obtainMessage(1));
    }

    private void dispatchSubmitV7() {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Dispatch submit");
        SubmitWorkerHandler<RequestType, ResponseType> submitWorkerHandler = this.submitWorkerHandler;
        submitWorkerHandler.sendMessage(submitWorkerHandler.obtainMessage(2));
    }

    private static FormField findFormFieldForError(List<FormField> list, FieldError fieldError) {
        for (FormField formField : list) {
            if (formField.getId().equals(fieldError.getField())) {
                return formField;
            }
        }
        return null;
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public void cancel() {
        super.cancel();
        this.submitCallback = null;
        this.submitV7Callback = null;
    }

    public ResponseType loadSubmissionSync() throws ConversationsSubmissionException {
        if (!b.g()) {
            return (ResponseType) submitFlowV7();
        }
        throw ConversationsSubmissionException.withCallOnMainThread();
    }

    @Override // com.bazaarvoice.bvandroidsdk.LoadCall
    public ResponseType loadSync() throws BazaarException {
        b.c();
        return (ResponseType) submitFlow(true);
    }

    public void loadAsync(ConversationsSubmissionCallback<ResponseType> conversationsSubmissionCallback) {
        BVSDK.getInstance().bvLogger.v("BVConversationsSubmission", "Begin conversations async load");
        this.submitV7Callback = conversationsSubmissionCallback;
        dispatchSubmitV7();
    }
}

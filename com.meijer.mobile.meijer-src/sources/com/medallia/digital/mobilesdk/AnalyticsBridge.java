package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class AnalyticsBridge extends Observable implements m8 {
    private static final String ANALYTICS_TABLE_SIZE = "analyticsSize";
    private static final String CLEAR_DATA = "clearData";
    private static final String JSON_ACTION = "action";
    private static final String JSON_ACTION_BUTTONS_ENABLED = "actionButtonsEnabled";
    private static final String JSON_ACTIVITY_NAME = "activityName";
    private static final String JSON_APPEARANCE_MODE = "appearanceMode";
    private static final String JSON_APP_RATING_ID = "appRatingId";
    private static final String JSON_CUSTOM_PARAMETER_NAME = "customParameterName";
    private static final String JSON_CUSTOM_PARAMETER_NAMES = "customParameterNames";
    private static final String JSON_DB_SIZE = "dbSize";
    private static final String JSON_DEFERRED_REASON = "deferredReason";
    private static final String JSON_DELAY = "delay";
    private static final String JSON_DELIVERED_TIMESTAMP = "deliveredTimestamp";
    private static final String JSON_DURATION = "duration";
    private static final String JSON_END_TIME = "endTime";
    private static final String JSON_ENGAGEMENT_ID = "engagementId";
    private static final String JSON_ENGAGEMENT_TYPE = "engagementType";
    private static final String JSON_ERROR_CODE = "errorCode";
    private static final String JSON_ERROR_MESSAGE = "errorMessage";
    private static final String JSON_FEEDBACK_CLIENT_CORRELATION_ID = "feedbackClientCorrelationId";
    private static final String JSON_FEEDBACK_UUID = "feedbackUUID";
    private static final String JSON_FILE_PATH = "filePath";
    private static final String JSON_FORMS_RESOURCES_SIZE = "formsResourcesSize";
    private static final String JSON_FORM_ID = "formId";
    private static final String JSON_FORM_LOADING_TIME = "formLoadingTime";
    private static final String JSON_FORM_LOCALE_DISPLAY = "formLocaleDisplay";
    private static final String JSON_FORM_LOCALE_SET = "formLocaleSet";
    private static final String JSON_FORM_STATUS = "formStatus";
    private static final String JSON_FORM_TIME_TO_DISPLAY = "timeToDisplay";
    private static final String JSON_FORM_TRIGGER_TYPE = "formTriggerType";
    private static final String JSON_FORM_VIEW_TYPE = "formViewType";
    private static final String JSON_ID = "id";
    private static final String JSON_INITIATOR = "initiator";
    private static final String JSON_INTERFACE_TYPE = "interfaceType";
    private static final String JSON_INVITATION_SKIPPED_REASON = "invitationSkippedReason";
    private static final String JSON_INVITATION_TYPE = "invitationType";
    private static final String JSON_INVITE_TYPE = "inviteType";
    private static final String JSON_IS_FAST_LOADING_FORM = "isFastLoadingForm";
    private static final String JSON_IS_USER_ID_EMPTY = "isUserIdEmpty";
    private static final String JSON_IS_VALID = "isValid";
    private static final String JSON_KILLED_OS_VERSION = "killedOsVersion";
    private static final String JSON_KILLED_SDK_VERSION = "killedSdkVersion";
    private static final String JSON_KILL_SDK_TIMESTAMP = "killSdkTimestamp";
    private static final String JSON_LAST_SUBMIT_TIMESTAMP = "lastSubmitTimestamp";
    private static final String JSON_LOCALE = "locale";
    private static final String JSON_LOG_LEVEL = "logLevel";
    private static final String JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID = "mediaCaptureClientCorrelationId";
    private static final String JSON_MEDIA_CHANNEL_ID = "channelId";
    private static final String JSON_MEDIA_TYPE_CAPTURE = "mediaTypeCapture";
    private static final String JSON_METHOD = "method";
    private static final String JSON_NUMBER_OF_FEEDBACKS = "numberOfFeedbacks";
    private static final String JSON_NUMBER_OF_RETRIES = "numberOfRetries";
    private static final String JSON_PAYLOAD_SIZE = "payloadSizeInKB";
    private static final String JSON_PREVIOUS_SESSION_ID = "previousSessionId";
    private static final String JSON_PRE_INIT = "preInit";
    private static final String JSON_REASON = "reason";
    private static final String JSON_RELOADING_FORM_NUMBER = "reloadingFormNumber";
    private static final String JSON_RESPONSE_CODE = "responseCode";
    private static final String JSON_RESTORE_TIME = "restoreTime";
    private static final String JSON_RESULT = "result";
    private static final String JSON_RESULT_FROM_JS = "resultFromJs";
    private static final String JSON_SESSION_INACTIVITY_TIME = "sessionInactivityTime";
    private static final String JSON_START_TIME = "startTime";
    private static final String JSON_STATUS = "status";
    private static final String JSON_STICKY_MODE = "stickyMode";
    private static final String JSON_SUBMISSION_BLOCK_REASON = "blockReason";
    private static final String JSON_SUBMISSION_TRIGGER = "submissionTrigger";
    private static final String JSON_SUBMITTED_TIMESTAMP = "submittedTimestamp";
    private static final String JSON_TARGET_ENGINE_SIZE = "targetEngineSize";
    private static final String JSON_TEMPLATES_SIZE = "templatesSize";
    private static final String JSON_TIMESTAMP_LAST_CACHED_DATA = "timestampLastCachedData";
    private static final String JSON_TIME_IN_BACKGROUND = "timeInBackground";
    private static final String JSON_TOTAL_DIRECTORY_SIZE = "totalDirectorySize";
    private static final String JSON_TYP_CLOSE_BUTTON = "closeButtonSelected";
    private static final String JSON_TYP_IMAGE = "image";
    private static final String JSON_URL = "url";
    private static final String UJ_TABLE_SIZE = "ujSize";
    private static AnalyticsBridge instance;
    private boolean isDigitalAnalyticsEnabled;
    private boolean isSdkRunning;
    private final ArrayList<k> pendingEvents = new ArrayList<>();
    private final ArrayList<Pair<b, JSONObject>> preInitEvents = new ArrayList<>();
    private final j analyticsGenerator = new j();
    private boolean isTreResourceReady = false;
    private boolean isFormResourcesReady = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92186a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92187b;

        static {
            int[] iArr = new int[c.values().length];
            f92187b = iArr;
            try {
                iArr[c.success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92187b[c.pending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92187b[c.failure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f92186a = iArr2;
            try {
                iArr2[b.init.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92186a[b.initCallback.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92186a[b.initOfflineMechanism.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92186a[b.disableIntercept.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f92186a[b.enableIntercept.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f92186a[b.logger.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f92186a[b.setCustomParameter.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f92186a[b.setCustomParameters.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f92186a[b.updateCustomLocale.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f92186a[b.setCustomAppearance.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f92186a[b.internalError.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f92186a[b.setActivity.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f92186a[b.stopSDK.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f92186a[b.revertStopSDK.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f92186a[b.setFormListener.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f92186a[b.setFeedbackListener.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f92186a[b.setInvitationListener.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f92186a[b.setInterceptListener.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f92186a[b.setCustomInterceptListener.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f92186a[b.preloadMechanism.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f92186a[b.deleteStorage.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f92186a[b.restoreFromKillSDK.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f92186a[b.restClient.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f92186a[b.setUserId.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    protected enum b {
        init,
        initCallback,
        initOfflineMechanism,
        disableIntercept,
        enableIntercept,
        logger,
        setCustomParameter,
        setCustomParameters,
        updateCustomLocale,
        internalError,
        crash,
        setActivity,
        stopSDK,
        revertStopSDK,
        setFormListener,
        setFeedbackListener,
        setInvitationListener,
        setInterceptListener,
        setCustomInterceptListener,
        preloadMechanism,
        deleteStorage,
        restoreFromKillSDK,
        setCustomAppearance,
        restClient,
        setUserId,
        setTouchEventListener
    }

    protected enum c {
        success,
        failure,
        pending
    }

    AnalyticsBridge() {
    }

    private void deleteStorageV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.i(jSONObject));
    }

    private void disableInterceptV2() {
        reportOrStashToPending(this.analyticsGenerator.a());
    }

    private void enableInterceptV2() {
        reportOrStashToPending(this.analyticsGenerator.b());
    }

    private JSONArray getAndClearInitCallbackEventsFromStorage() {
        String strA;
        JSONArray jSONArray;
        SharedPreferences sharedPreferencesC = d7.b().c();
        d7.a aVar = d7.a.INIT_CALLBACK_EVENT;
        JSONArray jSONArray2 = null;
        if (sharedPreferencesC.contains(aVar.toString()) && (strA = d7.b().a(aVar, (String) null)) != null) {
            try {
                jSONArray = new JSONArray(strA);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                d7.b().a(aVar);
                return jSONArray;
            } catch (Exception e11) {
                e = e11;
                jSONArray2 = jSONArray;
                a4.c(e.getMessage());
                return jSONArray2;
            }
        }
        return jSONArray2;
    }

    protected static AnalyticsBridge getInstance() {
        if (instance == null) {
            instance = new AnalyticsBridge();
        }
        return instance;
    }

    private void initCallbackV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.s(jSONObject));
    }

    private void initOfflineMechanismV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.t(jSONObject));
    }

    private void initV2() {
        reportOrStashToPending(this.analyticsGenerator.c());
    }

    private void internalErrorV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.v(jSONObject));
    }

    private void loggerV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.E(jSONObject));
    }

    private void preloadMechanismV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.J(jSONObject));
    }

    private void report(k kVar) {
        if (this.isDigitalAnalyticsEnabled) {
            setChanged();
            notifyObservers(kVar);
        }
    }

    private void reportRestClientV2Event(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.R(jSONObject));
    }

    private void restoreFromKillSDKV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.S(jSONObject));
    }

    private void revertStopSDKV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.T(jSONObject));
    }

    private void setActivityV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.U(jSONObject));
    }

    private void setCustomAppearanceV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.V(jSONObject));
    }

    private void setCustomInterceptListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.d());
    }

    private void setCustomParameterV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.X(jSONObject));
    }

    private void setCustomParametersV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.Y(jSONObject));
    }

    private void setFeedbackListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.e());
    }

    private void setFormListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.f());
    }

    private void setInterceptListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.g());
    }

    private void setInvitationListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.h());
    }

    private void setTouchEventListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.i());
    }

    private void setUserIdV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.c0(jSONObject));
    }

    private void stopSDKV2(JSONObject jSONObject) throws JSONException {
        f1.a().b(this.analyticsGenerator.f0(jSONObject));
    }

    private void updateCustomLocaleV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.l0(jSONObject));
    }

    protected void addObserverToAnalyticsItems(Observer observer) {
        addObserver(observer);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(getClass().getSimpleName());
        deleteObservers();
        this.pendingEvents.clear();
        this.isSdkRunning = false;
        instance = null;
    }

    protected String exportPendingEventsToJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<k> it = this.pendingEvents.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next != null) {
                    jSONArray.put(next.toJsonString());
                }
            }
            return jSONArray.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected void initAnalytics(boolean z10, r1 r1Var, i iVar, HashMap<String, Object> map) {
        this.isDigitalAnalyticsEnabled = z10;
        this.isSdkRunning = true;
        this.analyticsGenerator.a(iVar, map, z10, r1Var);
    }

    void regeneratePreInitEvents() throws JSONException {
        if (!this.preInitEvents.isEmpty()) {
            Iterator<Pair<b, JSONObject>> it = this.preInitEvents.iterator();
            while (it.hasNext()) {
                Pair<b, JSONObject> next = it.next();
                b bVar = (b) next.first;
                if (bVar != null) {
                    switch (a.f92186a[bVar.ordinal()]) {
                        case 1:
                            initV2();
                            break;
                        case 2:
                            initCallbackV2((JSONObject) next.second);
                            break;
                        case 3:
                            initOfflineMechanismV2((JSONObject) next.second);
                            break;
                        case 4:
                            disableInterceptV2();
                            break;
                        case 5:
                            enableInterceptV2();
                            break;
                        case 6:
                            loggerV2((JSONObject) next.second);
                            break;
                        case 7:
                            setCustomParameterV2((JSONObject) next.second);
                            break;
                        case 8:
                            setCustomParametersV2((JSONObject) next.second);
                            break;
                        case 9:
                            updateCustomLocaleV2((JSONObject) next.second);
                            break;
                        case 10:
                            setCustomAppearanceV2((JSONObject) next.second);
                            break;
                        case 11:
                            internalErrorV2((JSONObject) next.second);
                            break;
                        case 12:
                            setActivityV2((JSONObject) next.second);
                            break;
                        case 13:
                            stopSDKV2((JSONObject) next.second);
                            break;
                        case 14:
                            revertStopSDKV2((JSONObject) next.second);
                            break;
                        case 15:
                            setFormListenerV2();
                            break;
                        case 16:
                            setFeedbackListenerV2();
                            break;
                        case 17:
                            setInvitationListenerV2();
                            break;
                        case 18:
                            setInterceptListenerV2();
                            break;
                        case 19:
                            setCustomInterceptListenerV2();
                            break;
                        case 20:
                            preloadMechanismV2((JSONObject) next.second);
                            break;
                        case 21:
                            deleteStorageV2((JSONObject) next.second);
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            restoreFromKillSDKV2((JSONObject) next.second);
                            break;
                        case 23:
                            reportRestClientV2Event((JSONObject) next.second);
                            break;
                        case 24:
                            setUserIdV2((JSONObject) next.second);
                            break;
                    }
                }
            }
            this.preInitEvents.clear();
        }
        JSONArray andClearInitCallbackEventsFromStorage = getAndClearInitCallbackEventsFromStorage();
        if (andClearInitCallbackEventsFromStorage != null) {
            for (int i10 = 0; i10 < andClearInitCallbackEventsFromStorage.length(); i10++) {
                try {
                    initCallbackV2(andClearInitCallbackEventsFromStorage.getJSONObject(i10));
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected void reportAnalyticsSubmissionBlockedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = zzbz.UNKNOWN_CONTENT_TYPE;
            }
            jSONObject.put(JSON_SUBMISSION_TRIGGER, str);
            jSONObject.put(JSON_SUBMISSION_BLOCK_REASON, "submissionInProgress");
            reportOrStashToPending(this.analyticsGenerator.a(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCloseEngagementEvent(String str, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INTERFACE_TYPE, str2);
            jSONObject.put(JSON_ENGAGEMENT_ID, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str);
            reportOrStashToPending(this.analyticsGenerator.b(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCodeFormReadyEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.c(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCustomInterceptAcceptedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.d(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCustomInterceptDeclinedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.e(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCustomInterceptDeferredEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.f(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCustomInterceptSkippedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.g(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportCustomInterceptTriggerCallbackEvent(c cVar, String str, String str2, Integer num, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar);
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str3);
            reportOrStashToPending(this.analyticsGenerator.h(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public void reportDeleteStorageEvent(String str, boolean z10) throws JSONException {
        try {
            c cVar = z10 ? c.success : c.failure;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FILE_PATH, str);
            jSONObject.put(JSON_STATUS, cVar);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                deleteStorageV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.deleteStorage, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportDisableInterceptEvent() {
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            disableInterceptV2();
        } else {
            this.preInitEvents.add(new Pair<>(b.disableIntercept, null));
        }
    }

    protected void reportEnableInterceptEvent() {
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            enableInterceptV2();
        } else {
            this.preInitEvents.add(new Pair<>(b.enableIntercept, null));
        }
    }

    protected void reportFeedbackRetryMechanismEvent(int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i10);
            reportOrStashToPending(this.analyticsGenerator.j(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormClosedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.k(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormDismissedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.l(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormDisplayedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, long j10, String str2, String str3, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TIME_TO_DISPLAY, j10);
            jSONObject.put(JSON_FORM_LOCALE_SET, str2);
            jSONObject.put(JSON_FORM_LOCALE_DISPLAY, str3);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.m(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormLoadSpinnerEvent(String str, Long l10, FormViewType formViewType, FormTriggerType formTriggerType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_DELAY, l10);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType);
            reportOrStashToPending(this.analyticsGenerator.n(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormLoadedEvent(String str, FormTriggerType formTriggerType, long j10, FormViewType formViewType, boolean z10, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_LOADING_TIME, j10);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z10 ? 1 : 0);
            jSONObject.put(JSON_RELOADING_FORM_NUMBER, i10);
            reportOrStashToPending(this.analyticsGenerator.o(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormSubmittedEvent(String str, FormTriggerType formTriggerType, long j10, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_LAST_SUBMIT_TIMESTAMP, j10);
            reportOrStashToPending(this.analyticsGenerator.p(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportFormThankYouPromptEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z10, boolean z11, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_TYP_CLOSE_BUTTON, z10);
            jSONObject.put(JSON_TYP_IMAGE, z11);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.q(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportHandleNotificationEvent(String str, FormViewType formViewType, boolean z10, c cVar, MDExternalError mDExternalError) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_PRE_INIT, z10);
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, mDExternalError != null ? Integer.valueOf(mDExternalError.getErrorCode()) : null);
            jSONObject.put(JSON_ERROR_MESSAGE, mDExternalError != null ? mDExternalError.getMessage() : null);
            reportOrStashToPending(this.analyticsGenerator.r(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInitCallbackEvent(c cVar, Integer num, String str, long j10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            jSONObject.put(JSON_DURATION, j10);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initCallbackV2(jSONObject);
                return;
            }
            if (cVar != c.failure) {
                this.preInitEvents.add(new Pair<>(b.initCallback, jSONObject));
                return;
            }
            d7 d7VarB = d7.b();
            d7.a aVar = d7.a.INIT_CALLBACK_EVENT;
            String strA = d7VarB.a(aVar, (String) null);
            JSONArray jSONArray = strA == null ? new JSONArray() : new JSONArray(strA);
            jSONArray.put(jSONObject);
            d7.b().b(aVar, jSONArray.toString());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInitEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.init, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInitOfflineMechanismEvent(long j10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TIMESTAMP_LAST_CACHED_DATA, j10);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initOfflineMechanismV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.initOfflineMechanism, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInterceptMechanismEvent(long j10, long j11, String str, Reason reason, c cVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_INVITATION_SKIPPED_REASON, reason == null ? null : reason.name());
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            reportOrStashToPending(this.analyticsGenerator.u(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInternalErrorEvent(int i10, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ERROR_CODE, i10);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                internalErrorV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.internalError, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInvitationAcceptedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var != null ? e3Var.b() : e3.c.No.toString());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var != null && e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.w(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInvitationDeclinedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.x(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInvitationDeferredEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.y(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportInvitationDisplayedEvent(String str, String str2, e3 e3Var, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var != null && e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var != null ? e3Var.b() : e3.c.No.toString());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode != null ? mDAppearanceMode.toString() : com.google.maps.android.BuildConfig.TRAVIS);
            reportOrStashToPending(this.analyticsGenerator.z(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportLoadingIndicatorClosedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.A(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportLoadingIndicatorCompletedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.B(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportLoadingIndicatorShownEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.C(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportLoadingIndicatorTimeoutEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.D(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportLoggerEvent(MDLogLevel mDLogLevel) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_LOG_LEVEL, mDLogLevel != null ? mDLogLevel.toString() : null);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                loggerV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.logger, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean reportMedalliaCrashEventImmediate(String str, long j10, String str2, Long l10) throws JSONException {
        try {
            if (!this.isSdkRunning) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_REASON, str);
            jSONObject.put("propertyId", l10);
            jSONObject.put("deviceId", d7.b().a(d7.a.DEVICE_ID, (String) null));
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("osName", "Android");
            jSONObject.put("sdkVersion", "4.8.1");
            k kVarA = this.analyticsGenerator.a(jSONObject, str2, j10);
            if (kVarA != null) {
                return f1.a().b(kVarA);
            }
            return true;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return false;
        }
    }

    protected void reportMediaCaptureCollectedEvent(e5 e5Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, e5Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, e5Var.b() != null ? e5Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_MEDIA_TYPE_CAPTURE, j5.d(e5Var.f()));
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, e5Var.d());
            reportOrStashToPending(this.analyticsGenerator.F(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportMediaCaptureSubmitEvent(e5 e5Var, c cVar, MDExternalError mDExternalError, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, e5Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, e5Var.b() != null ? e5Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_MEDIA_CHANNEL_ID, str);
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, e5Var.d());
            jSONObject.put(JSON_ERROR_MESSAGE, mDExternalError != null ? mDExternalError.getMessage() : null);
            reportOrStashToPending(this.analyticsGenerator.G(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportMediaFeedbackRetryMechanismEvent(int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i10);
            reportOrStashToPending(this.analyticsGenerator.H(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportNativeTargetEvaluatorEvent(long j10, long j11, String str, j2.a aVar, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put(JSON_RESULT, str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(this.analyticsGenerator.I(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    void reportOrStashToPending(k kVar) {
        if (!this.isDigitalAnalyticsEnabled || kVar == null) {
            return;
        }
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            report(kVar);
        } else {
            this.pendingEvents.add(kVar);
        }
    }

    protected void reportPreloadMechanismEvent(long j10, long j11, String str, j2.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                preloadMechanismV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.preloadMechanism, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportPromptAcceptedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            reportOrStashToPending(this.analyticsGenerator.K(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportPromptDeclinedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.L(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportPromptDeferredEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.M(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportPromptDisplayedEvent(String str, String str2, e3 e3Var, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.N(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportPromptTriggeredEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APP_RATING_ID, str);
            reportOrStashToPending(this.analyticsGenerator.O(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportRefreshSessionEvent(long j10, long j11, long j12, long j13, String str, c cVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_TIME_IN_BACKGROUND, j12);
            jSONObject.put(JSON_SESSION_INACTIVITY_TIME, j13);
            jSONObject.put(JSON_PREVIOUS_SESSION_ID, str);
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            reportOrStashToPending(this.analyticsGenerator.P(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportResourcesSizeEvent() throws JSONException {
        Double maxDbFileSizeInMb;
        if (!this.isTreResourceReady || !this.isFormResourcesReady) {
            a4.e("Can't report ResourcesSizeEvent, Resources not ready yet");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TARGET_ENGINE_SIZE, g2.e());
            jSONObject.put(JSON_FORMS_RESOURCES_SIZE, g2.c());
            jSONObject.put(JSON_TEMPLATES_SIZE, g2.f());
            jSONObject.put(JSON_TOTAL_DIRECTORY_SIZE, g2.b());
            jSONObject.put(JSON_DB_SIZE, f1.a().c());
            try {
                maxDbFileSizeInMb = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getMaxDbFileSizeInMb();
            } catch (Exception unused) {
                a4.b("Unable to get maxDbFileSize from config, use default value");
                maxDbFileSizeInMb = null;
            }
            if (f1.a().a(maxDbFileSizeInMb)) {
                jSONObject.put(ANALYTICS_TABLE_SIZE, f1.a().c(b0.a.AnalyticsData));
                jSONObject.put(UJ_TABLE_SIZE, f1.a().c(b0.a.UserJourneyData));
            }
            reportOrStashToPending(this.analyticsGenerator.Q(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportRestClientEvent(long j10, long j11, String str, int i10, int i11, Double d10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_URL, str);
            jSONObject.put(JSON_RESPONSE_CODE, i10);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, i11);
            jSONObject.put(JSON_PAYLOAD_SIZE, d10);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                reportRestClientV2Event(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.restClient, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportRestoreFromKillSDKEvent(long j10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESTORE_TIME, j10);
            jSONObject.put(JSON_KILL_SDK_TIMESTAMP, d7.b().a(d7.a.SDK_KILL_TIMESTAMP, 0L));
            jSONObject.put(JSON_KILLED_SDK_VERSION, d7.b().a(d7.a.LAST_SDK_VERSION, (String) null));
            jSONObject.put(JSON_KILLED_OS_VERSION, d7.b().a(d7.a.LAST_OS_VERSION, (String) null));
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                restoreFromKillSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.restoreFromKillSDK, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportRevertStopSdkEvent() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                revertStopSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.revertStopSDK, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetActivityEvent(Activity activity) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (activity != null) {
                jSONObject.put(JSON_ACTIVITY_NAME, activity.getClass().getSimpleName());
            }
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setActivityV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setActivity, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetCustomAppearanceEvent(MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            setCustomAppearanceV2(jSONObject);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetCustomInterceptCallbackEvent(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            reportOrStashToPending(this.analyticsGenerator.W(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetCustomInterceptListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setCustomInterceptListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setCustomInterceptListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetCustomParameterEvent(String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_CUSTOM_PARAMETER_NAME, str);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setCustomParameterV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setCustomParameter, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetCustomParametersEvent(Map<String, Object> map, boolean z10) throws JSONException {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = map.keySet().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(JSON_CUSTOM_PARAMETER_NAMES, jSONArray);
                jSONObject.put(JSON_PRE_INIT, z10);
                if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                    setCustomParametersV2(jSONObject);
                    return;
                }
                this.preInitEvents.add(new Pair<>(b.setCustomParameters, jSONObject));
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    protected void reportSetFeedbackCallbackEvent(String str, String str2, FormTriggerType formTriggerType, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, str3);
            reportOrStashToPending(this.analyticsGenerator.Z(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetFeedbackListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setFeedbackListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setFeedbackListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetFormCallbackEvent(String str, String str2, FormTriggerType formTriggerType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            reportOrStashToPending(this.analyticsGenerator.a0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetFormListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setFormListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setFormListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetInterceptCallbackEvent(String str, String str2, String str3, String str4, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put("id", str2);
            jSONObject.put(JSON_INVITE_TYPE, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str4);
            if (e3Var != null) {
                jSONObject.put(JSON_STICKY_MODE, e3Var.b());
                jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
                if (e3Var.d()) {
                    jSONObject.put(JSON_DEFERRED_REASON, e3Var.a());
                }
            }
            reportOrStashToPending(this.analyticsGenerator.b0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetInterceptListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setInterceptListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setInterceptListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Deprecated
    protected void reportSetInvitationListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setInvitationListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setInvitationListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public void reportSetTouchEventListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setTouchEventListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setTouchEventListener, null));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSetUserIdEvent(Boolean bool) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_IS_USER_ID_EMPTY, bool);
            setUserIdV2(jSONObject);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportShowFormCallbackEvent(c cVar, Integer num, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            reportOrStashToPending(this.analyticsGenerator.d0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportShowFormEvent(String str, FormViewType formViewType, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z10 ? 1 : 0);
            reportOrStashToPending(this.analyticsGenerator.e0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportStopSDKEventImmediated(boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CLEAR_DATA, z10);
            f1.a().b(new c0(jSONObject, GroupType.api, Lifetime.Application, "StopSDK"));
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                stopSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.stopSDK, jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportSubmitFeedbackEvent(c2 c2Var, long j10, c cVar, String str) throws JSONException {
        k kVarI0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, c2Var.b() != null ? c2Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_FEEDBACK_UUID, str);
            jSONObject.put(JSON_SUBMITTED_TIMESTAMP, c2Var.e());
            jSONObject.put(JSON_DELIVERED_TIMESTAMP, j10);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, c2Var.d());
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, c2Var.c() != null ? c2Var.c().toString() : null);
            jSONObject.put(JSON_FORM_ID, c2Var.getFormId());
            int i10 = a.f92187b[cVar.ordinal()];
            if (i10 == 1) {
                kVarI0 = this.analyticsGenerator.i0(jSONObject);
            } else if (i10 == 2) {
                kVarI0 = this.analyticsGenerator.h0(jSONObject);
            } else if (i10 != 3) {
                return;
            } else {
                kVarI0 = this.analyticsGenerator.g0(jSONObject);
            }
            reportOrStashToPending(kVarI0);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportTargetEvaluatorEvent(long j10, long j11, String str, j2.a aVar, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j10);
            jSONObject.put(JSON_END_TIME, j11);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put(JSON_RESULT_FROM_JS, str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(this.analyticsGenerator.j0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void reportTouchEventCallbackEvent(int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ACTION, i10);
            reportOrStashToPending(this.analyticsGenerator.k0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public void setFormResourcesReady(boolean z10) {
        this.isFormResourcesReady = z10;
    }

    public void setTreResourceReady(boolean z10) {
        this.isTreResourceReady = z10;
    }

    protected void updateCustomLocaleEvent(String str, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_LOCALE, str);
            jSONObject.put(JSON_IS_VALID, z10);
            reportOrStashToPending(this.analyticsGenerator.l0(jSONObject));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}

package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.c5;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.x3;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class BaseFormCommunicator implements LifeCycle.h {
    public static final String DEFAULT_FONT_SCALE = "1.0";
    static final int DELAY = 500;
    j2 formData;
    String formId;
    FormTriggerType formTriggerType;
    FormViewType formViewType;
    private final boolean isFeedbackSubmitIndicatorEnabled;
    i2 listener;
    y3 localizationContract;
    e5 mediaData;
    g5 mediaDataFromJS;
    private final Integer textAreaLimit;
    ArrayList<String> unSupportedVideoFormats;
    Map<String, JSONObject> runAsyncResults = new ConcurrentHashMap();
    String uniqueFunctionResult = null;
    String feedbackClientCorrelationId = null;
    boolean audioRecording = false;
    boolean hasMediaData = false;
    final Handler handler = new Handler(Looper.getMainLooper());

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92220a;

        a(String str) {
            this.f92220a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            Toast.makeText(i4.c().b(), this.f92220a, 0).show();
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f92222a;

        b(ArrayList arrayList) {
            this.f92222a = arrayList;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            a4.e("List of Permissions Granted : " + this.f92222a);
            Activity activity = (Activity) i4.c().d().getBaseContext();
            String strD = BaseFormCommunicator.this.mediaDataFromJS.d();
            if (this.f92222a.isEmpty() || strD == null) {
                int i10 = c.f92225b[j5.a(strD).ordinal()];
                c5.b().b(i10 != 1 ? i10 != 2 ? null : "android.permission.RECORD_AUDIO" : "android.permission.CAMERA");
                BaseFormCommunicator.this.handlePermissionsDenied();
                return;
            }
            int i11 = c.f92225b[j5.a(strD).ordinal()];
            if (i11 == 1) {
                if (this.f92222a.contains("android.permission.CAMERA")) {
                    c5.b().a(activity, BaseFormCommunicator.this.mediaDataFromJS.e());
                }
            } else if (i11 == 2 && this.f92222a.contains("android.permission.RECORD_AUDIO")) {
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                c5 c5VarB = c5.b();
                BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                baseFormCommunicator.mediaData = c5VarB.a(strD, baseFormCommunicator2.formId, baseFormCommunicator2.formData.b(), BaseFormCommunicator.this.mediaDataFromJS.c());
                BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                baseFormCommunicator3.handleResponse(baseFormCommunicator3.mediaData, c5.k.allowAudioPermission);
                BaseFormCommunicator.this.audioRecording = true;
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92224a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92225b;

        static {
            int[] iArr = new int[j5.values().length];
            f92225b = iArr;
            try {
                iArr[j5.video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92225b[j5.audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[z4.values().length];
            f92224a = iArr2;
            try {
                iArr2[z4.select.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92224a[z4.end.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class d extends v4 {
        d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.b("FormId: " + BaseFormCommunicator.this.formId + " ready");
            i2 i2Var = BaseFormCommunicator.this.listener;
            if (i2Var != null) {
                i2Var.onReady();
            }
        }
    }

    class e extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92227a;

        e(String str) {
            this.f92227a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (d7.b().a(d7.a.SDK_STOPPED, false)) {
                a4.e("Feedback can’t be sent because of stop sdk");
                return;
            }
            if (new m3().b()) {
                a4.e("Submit sdk was cancelled by sdk kill");
                return;
            }
            a4.e("FormId: " + BaseFormCommunicator.this.formId + " sendFeedbackToMobileSdk was called - feedbackData = " + this.f92227a);
            BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
            if (baseFormCommunicator.mediaData != null) {
                baseFormCommunicator.hasMediaData = true;
            }
            baseFormCommunicator.notifySendFeedback();
            s7.e().b(BaseFormCommunicator.this.formId);
            String str = this.f92227a;
            if (str == null || str.equals("undefined") || this.f92227a.isEmpty()) {
                a4.e("Submit feedback data - null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f92227a);
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                    BaseFormCommunicator.this.feedbackClientCorrelationId = jSONObject.getString("uuid");
                    jSONObject2.put("uuid", l3.a((Object) BaseFormCommunicator.this.feedbackClientCorrelationId));
                }
                if (jSONObject.has("dynamicData") && !jSONObject.isNull("dynamicData")) {
                    jSONObject2.put("dynamicData", l3.a(jSONObject.getJSONObject("dynamicData")));
                }
                t4 t4VarE = t4.e();
                d7.a aVar = d7.a.OCQ_USER_ID;
                if (t4VarE.a(aVar) != null && !t4.e().a(aVar).isEmpty()) {
                    jSONObject.put("cuid", t4.e().a(aVar));
                }
                BaseFormCommunicator.this.sendFeedbackPayloadAndUpdateRatingCollectors(jSONObject2);
                BaseFormCommunicator.this.addMobileDeviceData(jSONObject);
                BaseFormCommunicator.this.addFormMissingData(jSONObject);
                BaseFormCommunicator.this.addBridgeData(jSONObject);
                BaseFormCommunicator.this.separateCustomParams(jSONObject);
                jSONObject.put("appearanceMode", v7.c().a());
                j2 j2Var = BaseFormCommunicator.this.formData;
                if (j2Var != null && j2Var.getInviteData() != null) {
                    jSONObject.put("mobileInvitationType", BaseFormCommunicator.this.formData.getInviteData().getType());
                }
                BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                String string = jSONObject.toString();
                String string2 = jSONObject2.has("uuid") ? jSONObject2.getString("uuid") : null;
                BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                baseFormCommunicator2.sendFeedback(new c2(string, string2, baseFormCommunicator3.formId, baseFormCommunicator3.formTriggerType, System.currentTimeMillis(), 0));
                BaseFormCommunicator baseFormCommunicator4 = BaseFormCommunicator.this;
                e5 e5Var = baseFormCommunicator4.mediaData;
                if (e5Var != null) {
                    if (baseFormCommunicator4.audioRecording) {
                        c5.b().a(BaseFormCommunicator.this.mediaData.e());
                        return;
                    }
                    e5Var.a(baseFormCommunicator4.feedbackClientCorrelationId);
                    p4 p4VarD = p4.d();
                    BaseFormCommunicator baseFormCommunicator5 = BaseFormCommunicator.this;
                    p4VarD.a(baseFormCommunicator5.mediaData, baseFormCommunicator5.getMediaCapture(), Boolean.valueOf(BaseFormCommunicator.this.isPreviewApp()));
                    if (BaseFormCommunicator.this.isPreviewApp()) {
                        return;
                    }
                    AnalyticsBridge.getInstance().reportMediaCaptureCollectedEvent(BaseFormCommunicator.this.mediaData);
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class f extends v4 {
        f() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e("FormId: " + BaseFormCommunicator.this.formId + " submitSuccess was called");
            BaseFormCommunicator.this.notifySendFeedback();
        }
    }

    class g extends v4 {
        g() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            i2 i2Var = BaseFormCommunicator.this.listener;
            if (i2Var != null) {
                i2Var.onClose();
                a4.e("FormId: " + BaseFormCommunicator.this.formId + " close was called");
            }
        }
    }

    class h implements a5<z4> {
        h() {
        }

        @Override // com.medallia.digital.mobilesdk.a5
        public void a(z4 z4Var) {
            BaseFormCommunicator.this.createMediaData();
        }
    }

    class i extends v4 {
        i() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
            c5 c5VarB = c5.b();
            BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
            baseFormCommunicator.mediaData = c5VarB.a(baseFormCommunicator2.mediaDataFromJS, baseFormCommunicator2.formData, baseFormCommunicator2.isPreviewApp());
            BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
            if (baseFormCommunicator3.mediaData != null) {
                baseFormCommunicator3.handleResponse(null, c5.k.allowAudioPermission);
                BaseFormCommunicator.this.audioRecording = true;
            }
        }
    }

    class j implements a5<z4> {
        j() {
        }

        @Override // com.medallia.digital.mobilesdk.a5
        public void a(z4 z4Var) {
            try {
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.invokeJSResponse(baseFormCommunicator.uniqueFunctionResult, new JSONObject().put("response", z4Var));
                e5 e5Var = BaseFormCommunicator.this.mediaData;
                if (e5Var != null) {
                    g2.c(e5Var.e());
                    BaseFormCommunicator.this.mediaData = null;
                }
            } catch (JSONException e10) {
                a4.c("Message" + e10.getMessage());
            }
        }
    }

    class k extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z4 f92234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5 f92235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j2 f92236c;

        k(z4 z4Var, a5 a5Var, j2 j2Var) {
            this.f92234a = z4Var;
            this.f92235b = a5Var;
            this.f92236c = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            c5.b().a(this.f92234a, this.f92235b, this.f92236c, BaseFormCommunicator.this.isPreviewApp());
        }
    }

    class l extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f92238a;

        class a extends v4 {
            a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                c5.b().c();
            }
        }

        class b extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f92241a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f92242b;

            class a implements a5<z4> {
                a() {
                }

                @Override // com.medallia.digital.mobilesdk.a5
                public void a(z4 z4Var) {
                    if (b.this.f92241a.equals(j5.upload.toString())) {
                        g2.c(b.this.f92242b);
                        c5.b().a((Activity) i4.c().d().getBaseContext());
                    } else {
                        g2.c(b.this.f92242b);
                        c5.b().a((Activity) i4.c().d().getBaseContext(), BaseFormCommunicator.this.mediaDataFromJS.e());
                    }
                }
            }

            b(String str, String str2) {
                this.f92241a = str;
                this.f92242b = str2;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                c5.b().a();
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.showCustomAlert(z4.videoTimeLimitation, baseFormCommunicator.formData, new a());
            }
        }

        l(Intent intent) {
            this.f92238a = intent;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            String string = UUID.randomUUID().toString();
            String strD = BaseFormCommunicator.this.mediaDataFromJS.d();
            Intent intent = this.f92238a;
            if (intent == null || strD == null || intent.getData() == null) {
                a4.c("Can not handle Video Media Capture");
                return;
            }
            BaseFormCommunicator.this.handler.postDelayed(new a(), 1L);
            try {
                boolean zA = c5.b().a(this.f92238a.getData(), BaseFormCommunicator.this.unSupportedVideoFormats);
                String strA = c5.b().a(this.f92238a.getData(), string, strD);
                if (c5.b().a(this.f92238a.getData(), BaseFormCommunicator.this.mediaDataFromJS.e())) {
                    BaseFormCommunicator.this.handler.postDelayed(new b(strD, strA), 500L);
                } else if (strA != null) {
                    BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                    baseFormCommunicator.mediaData = new e5(string, null, strA, baseFormCommunicator.formId, baseFormCommunicator.formData.b(), j5.b(strD), System.currentTimeMillis(), BaseFormCommunicator.this.mediaDataFromJS.c(), 0);
                    BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                    baseFormCommunicator2.handleResponse(baseFormCommunicator2.mediaData, zA ? c5.k.finishMediaRecording : c5.k.unSupportedMediaFormat);
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                BaseFormCommunicator.this.handleResponse(null, c5.k.finishMediaRecording);
            }
        }
    }

    public enum m {
        MOBILE_DEVICE_DATA("mobileDeviceData"),
        DEVICE_RESOLUTION("deviceResolution"),
        DEVICE_LOCALE("deviceLocale"),
        DEVICE_VENDOR("deviceVendor");


        /* renamed from: a, reason: collision with root package name */
        private final String f92250a;

        m(String str) {
            this.f92250a = str;
        }

        public String a() {
            return this.f92250a;
        }
    }

    public enum n {
        FORM_LANGUAGE("formLanguage");


        /* renamed from: a, reason: collision with root package name */
        private final String f92253a;

        n(String str) {
            this.f92253a = str;
        }

        public String a() {
            return this.f92253a;
        }
    }

    BaseFormCommunicator(j2 j2Var, i2 i2Var, FormTriggerType formTriggerType, FormViewType formViewType, y3 y3Var, boolean z10, Integer num) {
        this.listener = i2Var;
        this.formData = j2Var;
        if (j2Var != null) {
            this.formId = j2Var.getFormId();
        }
        this.formTriggerType = formTriggerType;
        this.formViewType = formViewType;
        this.localizationContract = y3Var;
        this.isFeedbackSubmitIndicatorEnabled = z10;
        this.textAreaLimit = num;
        LifeCycle.b().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomAlert(z4 z4Var, j2 j2Var, a5<z4> a5Var) {
        w7.b().a().execute(new k(z4Var, a5Var, j2Var));
    }

    protected void addBridgeData(JSONObject jSONObject) throws JSONException {
        x6 x6Var = x6.f94339a;
        if (x6Var.h() && x6Var.i() && jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (x6Var.d() != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("leadId", x6Var.d());
                    jSONObject2.put("decibel", jSONObject3);
                }
                if (x6Var.e() != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("sessionId", x6Var.e());
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("integrationName", "decibelInsight");
                    jSONObject5.put("parameters", jSONObject4);
                    jSONObject2.put("recordedSessions", jSONObject5);
                }
                if (x6Var.f() != null) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("tid", x6Var.f());
                    jSONObject2.put("mxo", jSONObject6);
                }
                jSONObject.put("integrations", jSONObject2);
            } catch (Exception e10) {
                a4.b(e10.getMessage());
            }
        }
    }

    protected void addFormMissingData(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                j2 j2Var = this.formData;
                if (j2Var != null && j2Var.getFormLanguage() != null) {
                    jSONObject.put(n.FORM_LANGUAGE.a(), l3.a((Object) this.formData.getFormLanguage()));
                }
            } catch (Exception e10) {
                a4.b(e10.getMessage());
            }
        }
    }

    protected void addMobileDeviceData(JSONObject jSONObject) throws JSONException {
        try {
            m mVar = m.MOBILE_DEVICE_DATA;
            JSONObject jSONObject2 = (!jSONObject.has(mVar.a()) || jSONObject.isNull(mVar.a())) ? null : jSONObject.getJSONObject(mVar.a());
            if (jSONObject2 != null) {
                jSONObject2.put(m.DEVICE_RESOLUTION.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceResolution()));
                jSONObject2.put(m.DEVICE_LOCALE.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getLanguage()));
                jSONObject2.put(m.DEVICE_VENDOR.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceVendor()));
                jSONObject.put(mVar.a(), jSONObject2);
            }
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    @JavascriptInterface
    public String asyncMediaAlertResponse(String str) {
        return asyncMediaResultResponse(str);
    }

    @JavascriptInterface
    public String asyncMediaCaptureResult(String str) {
        return asyncMediaResultResponse(str);
    }

    protected String asyncMediaResultResponse(String str) {
        JSONObject jSONObject = this.runAsyncResults.get(str);
        this.runAsyncResults.remove(str);
        c5.b().a();
        return jSONObject != null ? jSONObject.toString() : "";
    }

    protected void checkWhichPermissionsGranted(ArrayList<String> arrayList) {
        w7.b().a().execute(new b(arrayList));
    }

    @JavascriptInterface
    public void close() {
        w7.b().a().execute(new g());
    }

    protected void createMediaData() {
        w7.b().a().execute(new i());
    }

    @JavascriptInterface
    public String getCustomParams() {
        return getCustomParamsString();
    }

    abstract String getCustomParamsString();

    @JavascriptInterface
    public String getDeviceData() {
        return provideDeviceData();
    }

    @JavascriptInterface
    public String getFontScale() {
        if (i4.c().b() == null || i4.c().b().getResources() == null || i4.c().b().getResources().getConfiguration() == null) {
            a4.e("can't get font scale - returning default value 1.0");
            return "1.0";
        }
        a4.e("font scale: " + i4.c().b().getResources().getConfiguration().fontScale);
        return String.valueOf(i4.c().b().getResources().getConfiguration().fontScale);
    }

    protected boolean getHasMediaData() {
        return this.hasMediaData;
    }

    protected abstract b5 getMediaCapture();

    protected e5 getMediaData() {
        return this.mediaData;
    }

    @JavascriptInterface
    public String getProvisions() {
        return getProvisionsData();
    }

    abstract String getProvisionsData();

    @JavascriptInterface
    public String getSDKData() {
        return provideSdkData();
    }

    @JavascriptInterface
    public String getSecretToken() {
        C11691b c11691bA = w2.c().a();
        a4.b("FormId: " + this.formId + " getSecretToken was called");
        if (c11691bA != null) {
            return c11691bA.a();
        }
        return null;
    }

    @JavascriptInterface
    public String getTextAreaLimit() {
        return String.valueOf(getTextAreaLimitInteger());
    }

    Integer getTextAreaLimitInteger() {
        return this.textAreaLimit;
    }

    protected void handlePermissionsDenied() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            showCustomAlert(z4.permission, this.formData, null);
            jSONObject.put("action", c5.k.denyPermission.a());
            jSONObject.put("captureData", "");
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
            a4.e("No Permissions Granted - result: " + jSONObject);
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    void handleResponse(e5 e5Var, c5.k kVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String strB = getMediaCapture() == null ? "" : getMediaCapture().b();
        try {
            jSONObject.put("action", kVar.a());
            jSONObject.put("captureData", jSONObject2.put("path", e5Var != null ? e5Var.e() : "").put("mediaCaptureClientCorrelationId", e5Var != null ? e5Var.d() : "").put("llChannelId", strB));
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void handleStopAudioMediaCapture() throws JSONException {
        try {
            this.audioRecording = false;
            c5.b().d();
            handleResponse(this.mediaData, c5.k.finishMediaRecording);
        } catch (Exception e10) {
            a4.c("Failed to recording audio " + e10.getMessage());
            g2.c(this.mediaData.e());
            handleResponse(null, c5.k.allowAudioPermission);
        }
    }

    public void handleVideoMediaCapture(Intent intent) {
        w7.b().a().execute(new l(intent));
    }

    protected void invokeJSResponse(String str, JSONObject jSONObject) {
        try {
            jsResolve(str, true, jSONObject);
        } catch (Exception e10) {
            try {
                jsResolve(str, false, jSONObject.put("error", e10.toString()));
            } catch (JSONException unused) {
                a4.c(e10.getMessage());
            }
        }
    }

    protected abstract boolean isDarkMode();

    protected abstract boolean isPreviewApp();

    protected void jsResolve(String str, boolean z10, JSONObject jSONObject) {
        this.runAsyncResults.put(str, jSONObject);
        this.listener.mediaCaptureResult("javascript:" + str + ".callback(" + z10 + ")");
    }

    @JavascriptInterface
    public void mediaCaptureDeleted(String str, String str2) {
        this.uniqueFunctionResult = str;
        try {
            g5 g5Var = new g5(new JSONObject(str2));
            this.mediaDataFromJS = g5Var;
            if (z4.valueOf(g5Var.a()) != z4.forceDelete) {
                showCustomAlert(z4.valueOf(this.mediaDataFromJS.a()), this.formData, new j());
            } else {
                g2.c(this.mediaData.e());
                this.mediaData = null;
            }
        } catch (Exception e10) {
            a4.c("Can not create response object " + e10.getMessage());
        }
    }

    @JavascriptInterface
    public void mediaCaptureSelected(String str, String str2) throws JSONException {
        boolean zIsRequestMediaCapturePermissions;
        b5 mediaCaptureConfiguration;
        this.uniqueFunctionResult = str;
        boolean zA = x8.a();
        if (isPreviewApp() || t0.c().a() == null || t0.c().a().getSdkConfiguration() == null) {
            zIsRequestMediaCapturePermissions = true;
        } else {
            zIsRequestMediaCapturePermissions = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain() != null ? t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().isRequestMediaCapturePermissions() : true;
            if (t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig() != null && (mediaCaptureConfiguration = t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getMediaCaptureConfiguration()) != null) {
                this.unSupportedVideoFormats = mediaCaptureConfiguration.g();
            }
        }
        if (!zIsRequestMediaCapturePermissions) {
            showCustomAlert(z4.permission, this.formData, null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", c5.k.denyPermission.a());
                jSONObject.put("captureData", "");
                invokeJSResponse(this.uniqueFunctionResult, jSONObject);
                a4.e("No Permissions Granted - result: " + jSONObject);
                return;
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
                return;
            }
        }
        if (str2 == null || str2.equals("undefined") || str2.isEmpty()) {
            a4.e("Media Data is not valid");
            return;
        }
        a4.b("Media data: " + str2);
        try {
            g5 g5Var = new g5(new JSONObject(str2));
            this.mediaDataFromJS = g5Var;
            int i10 = c.f92224a[z4.valueOf(g5Var.a()).ordinal()];
            if (i10 == 1) {
                if (zA) {
                    showCustomAlert(z4.select, this.formData, new h());
                    return;
                } else {
                    createMediaData();
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
            if (this.audioRecording) {
                handleStopAudioMediaCapture();
            } else {
                handlePermissionsDenied();
            }
        } catch (Exception e11) {
            a4.c("Can not parse media data object " + e11.getMessage());
        }
    }

    abstract void notifySendFeedback();

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        a4.e("From is in background");
        if (!this.audioRecording || this.mediaData == null) {
            return;
        }
        c5.b().a(this.mediaData.e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
    }

    abstract String provideDeviceData();

    abstract String provideSdkData();

    @JavascriptInterface
    public void ready() {
        w7.b().a().execute(new d());
    }

    @JavascriptInterface
    public void sendErrorToMobileSdk(String str) {
        a4.c("Live Form Error: " + str);
    }

    abstract void sendFeedback(c2 c2Var);

    abstract void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject);

    @JavascriptInterface
    public void sendFeedbackToMobileSdk(String str) {
        w7.b().a().execute(new e(str));
    }

    abstract void separateCustomParams(JSONObject jSONObject);

    protected void setListener(i2 i2Var) {
        this.listener = i2Var;
    }

    protected void showAccessibilityToastIfNeeded() {
        y3 y3Var;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) i4.c().b().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && this.isFeedbackSubmitIndicatorEnabled) {
                String strA = "Feedback Submitted Successfully";
                if (this.formData != null && (y3Var = this.localizationContract) != null) {
                    ResourceContract resourceContractF = y3Var.f();
                    strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.formData.getFormLanguage(), x3.c.SUBMIT, (x3.a) null);
                }
                if (this.formData != null) {
                    w7.b().c().execute(new a(strA));
                }
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @JavascriptInterface
    public void submitFailed() {
        a4.e("FormId: " + this.formId + " submitFailed was called");
    }

    @JavascriptInterface
    public void submitPending() {
        submitPending(true);
    }

    @JavascriptInterface
    public void submitSuccess() {
        w7.b().a().execute(new f());
    }

    BaseFormCommunicator(String str, i2 i2Var, FormTriggerType formTriggerType, FormViewType formViewType, y3 y3Var, boolean z10, Integer num) {
        this.listener = i2Var;
        this.formId = str;
        this.formData = r2.e().c(str);
        this.formTriggerType = formTriggerType;
        this.formViewType = formViewType;
        this.localizationContract = y3Var;
        this.isFeedbackSubmitIndicatorEnabled = z10;
        this.textAreaLimit = num;
        LifeCycle.b().a(this);
    }

    @JavascriptInterface
    public void submitPending(boolean z10) {
        i2 i2Var;
        a4.e("FormId: " + this.formId + " submitPending was called - shouldClose = " + z10);
        if (z10 && (i2Var = this.listener) != null) {
            i2Var.onClose();
        }
        showAccessibilityToastIfNeeded();
    }
}

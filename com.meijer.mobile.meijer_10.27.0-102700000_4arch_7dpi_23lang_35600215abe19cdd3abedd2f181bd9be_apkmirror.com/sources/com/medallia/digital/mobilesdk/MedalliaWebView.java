package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fullstory.FS;
import j$.net.URLEncoder;
import java.util.ArrayList;

/* loaded from: classes7.dex */
class MedalliaWebView extends WebView implements i2 {
    protected static final int DEFAULT_FORM_FONT_ZOOM = 100;
    protected static final String JS_COMMUNICATOR_NAME = "NebulaAndroid";
    private boolean blockNetworkInForm;
    private BaseFormCommunicator formCommunicator;
    private i2 formCommunicatorListener;
    private j2 formData;
    private String formJsonFileLocalUrl;
    private String formJsonQueryParams;
    private o2 formPreviewData;
    private boolean isFeedbackSubmitIndicatorEnabled;
    private boolean isNewLiveFormEnable;
    private boolean isPinchGestureEnabled;
    private boolean isPreviewApp;
    private boolean isRenderFinished;
    private e listener;
    private long loadingTime;
    private y3 localizationContract;
    private int maxFontSize;
    private b5 mediaCaptureConfiguration;
    private int minFontSize;
    private String preloadFormJsonFileLocalUrl;
    private ArrayList<String> redirectLinks;
    private int reloadingNumber;
    private Integer textAreaLimit;
    private f type;
    private final long webViewId;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f91569a;

        a(String str) {
            this.f91569a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MedalliaWebView medalliaWebView = MedalliaWebView.this;
            String str = this.f91569a;
            FS.trackWebView(medalliaWebView);
            medalliaWebView.loadUrl(str);
        }
    }

    class b extends y4 {
        b(j2 j2Var, boolean z10, ArrayList arrayList) {
            super(j2Var, z10, arrayList);
        }

        @Override // com.medallia.digital.mobilesdk.y4, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null) {
                try {
                    if (str.equals("about:blank")) {
                        return;
                    }
                    if (MedalliaWebView.this.listener != null) {
                        MedalliaWebView.this.listener.b();
                    }
                    MedalliaWebView.this.setVisibility(0);
                    MedalliaWebView.this.isRenderFinished = true;
                    MedalliaWebView.this.loadingTime = System.currentTimeMillis() - MedalliaWebView.this.loadingTime;
                    if (!MedalliaWebView.this.isPreviewApp) {
                        AnalyticsBridge.getInstance().reportFormLoadedEvent(MedalliaWebView.this.formData.getFormId(), MedalliaWebView.this.formData.getFormType(), MedalliaWebView.this.loadingTime, MedalliaWebView.this.formData.getFormViewType(), MedalliaWebView.this.isPreload(), MedalliaWebView.this.reloadingNumber);
                    }
                    MedalliaWebView.access$508(MedalliaWebView.this);
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail.didCrash()) {
                a4.c("Renderer crashed");
                return true;
            }
            a4.f("Renderer was killed to reclaim memory");
            return true;
        }
    }

    class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    class d extends v4 {
        d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (MedalliaWebView.this.formData == null) {
                return;
            }
            MedalliaWebView.this.evaluateJavascript("(function(){NebulaForm.show({\"triggerType\": \"" + MedalliaWebView.this.formData.getFormType() + "\"}); })();", null);
        }
    }

    protected interface e {
        void a();

        void b();
    }

    enum f {
        showForm,
        invitationProducer,
        preload,
        preview
    }

    protected MedalliaWebView(Context context, f fVar, j2 j2Var, long j10) {
        super(context);
        this.blockNetworkInForm = true;
        this.isRenderFinished = false;
        this.reloadingNumber = 1;
        this.redirectLinks = new ArrayList<>();
        this.isPinchGestureEnabled = false;
        this.isNewLiveFormEnable = false;
        this.type = fVar;
        this.webViewId = j10;
        this.formData = j2Var;
        this.blockNetworkInForm = j2Var.k();
        this.redirectLinks = j2Var.e();
    }

    static /* synthetic */ int access$508(MedalliaWebView medalliaWebView) {
        int i10 = medalliaWebView.reloadingNumber;
        medalliaWebView.reloadingNumber = i10 + 1;
        return i10;
    }

    private String appendQueryParams(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        try {
            if (str.contains("?")) {
                sb2.append(str2);
                sb2.append("=");
                sb2.append(URLEncoder.encode("../" + str3, "UTF-8"));
            } else {
                sb2.append("?");
                sb2.append(str2);
                sb2.append("=");
                sb2.append(URLEncoder.encode("../" + str3, "UTF-8"));
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return sb2.toString();
    }

    private void invokeFormShow() {
        d dVar = new d();
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(dVar);
        } catch (Exception e10) {
            a4.c("FormId: " + this.formData.getFormId() + " failed to showForm " + e10.getMessage());
            new Handler(Looper.getMainLooper()).post(dVar);
        }
    }

    public void clearAndDestroy() {
        removeJavascriptInterface(JS_COMMUNICATOR_NAME);
        FS.trackWebView(this);
        loadUrl("about:blank");
        stopLoading();
        clearHistory();
        removeAllViews();
        destroyDrawingCache();
        destroy();
    }

    public BaseFormCommunicator getFormCommunicator() {
        return this.formCommunicator;
    }

    protected j2 getFormData() {
        return this.formData;
    }

    protected String getLoadedFormId() {
        j2 j2Var = this.formData;
        if (j2Var == null) {
            return null;
        }
        return j2Var.getFormId();
    }

    protected long getLoadingTime() {
        return this.loadingTime;
    }

    protected int getTextZoomFontSize() {
        int i10;
        int i11;
        if (!this.isNewLiveFormEnable || (i10 = this.minFontSize) <= 0 || (i11 = this.maxFontSize) <= 0) {
            return 100;
        }
        return Math.max(i10, Math.min(i11, getSettings().getTextZoom()));
    }

    protected long getWebViewId() {
        return this.webViewId;
    }

    protected f getWebViewType() {
        return this.type;
    }

    protected boolean isPreload() {
        j2 j2Var = this.formData;
        return j2Var != null && j2Var.l();
    }

    protected boolean isRenderFinished() {
        return this.isRenderFinished;
    }

    protected void load(e eVar) {
        if (eVar != null) {
            this.listener = eVar;
        }
        if (this.formData != null) {
            this.isRenderFinished = false;
            setVisibility(8);
            clearCache(false);
            setWebChromeClient(new WebChromeClient());
            getSettings().setJavaScriptEnabled(true);
            getSettings().setNeedInitialFocus(false);
            getSettings().setAllowFileAccess(true);
            getSettings().setCacheMode(2);
            getSettings().setDomStorageEnabled(true);
            getSettings().setSupportZoom(false);
            getSettings().setTextZoom(getTextZoomFontSize());
            getSettings().setAllowContentAccess(false);
            if (this.isPinchGestureEnabled) {
                getSettings().setSupportZoom(true);
                getSettings().setBuiltInZoomControls(true);
                getSettings().setDisplayZoomControls(false);
            }
            getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            FS.setWebViewClient(this, new b(this.formData, this.blockNetworkInForm, this.redirectLinks));
            setWebChromeClient(new c());
            this.formCommunicator = this.isPreviewApp ? new FormCommunicatorPreviews(this.formData, null, this.formPreviewData, this, this.mediaCaptureConfiguration, this.isFeedbackSubmitIndicatorEnabled, this.textAreaLimit) : new FormCommunicator(this.formData.getFormId(), this, this.formData.getFormType(), this.formData.getFormViewType(), this.localizationContract, this.isFeedbackSubmitIndicatorEnabled, this.textAreaLimit);
            addJavascriptInterface(this.formCommunicator, JS_COMMUNICATOR_NAME);
            String strAppendQueryParams = String.format("file:///%s", this.formData.g());
            if (!TextUtils.isEmpty(this.formJsonQueryParams)) {
                strAppendQueryParams = appendQueryParams(strAppendQueryParams, this.formJsonQueryParams, this.formData.l() ? this.preloadFormJsonFileLocalUrl : this.formJsonFileLocalUrl);
            }
            FS.trackWebView(this);
            loadUrl(strAppendQueryParams);
            this.loadingTime = System.currentTimeMillis();
        }
    }

    @Override // com.medallia.digital.mobilesdk.i2
    public void mediaCaptureResult(String str) {
        a4.e("Response from SDK to LiveForm " + str);
        post(new a(str));
    }

    @Override // com.medallia.digital.mobilesdk.i2
    public void onClose() {
        if (!isPreload()) {
            this.formData = null;
        }
        i2 i2Var = this.formCommunicatorListener;
        if (i2Var != null) {
            i2Var.onClose();
        }
    }

    @Override // com.medallia.digital.mobilesdk.i2
    public void onReady() {
        invokeFormShow();
        i2 i2Var = this.formCommunicatorListener;
        if (i2Var != null) {
            i2Var.onReady();
        }
        e eVar = this.listener;
        if (eVar != null) {
            eVar.a();
        }
    }

    protected void reloadWebView() {
        if (isPreload()) {
            this.loadingTime = System.currentTimeMillis();
            setVisibility(8);
            clearCache(false);
            reload();
        }
    }

    protected void setConfiguration(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getPropertyConfiguration() == null || configurationContract.getSdkConfiguration() == null) {
            return;
        }
        this.formJsonQueryParams = configurationContract.getPropertyConfiguration().getFormFileLocationQueryParam();
        this.preloadFormJsonFileLocalUrl = configurationContract.getPropertyConfiguration().getPreloadFormJsonFileLocalUrl();
        this.formJsonFileLocalUrl = configurationContract.getPropertyConfiguration().getFormJsonFileLocalUrl();
        this.localizationContract = configurationContract.getLocalization();
        this.isNewLiveFormEnable = configurationContract.getPropertyConfiguration().isNewLiveFormEnable();
        FormConfigurations formConfigurations = configurationContract.getSdkConfiguration().getFormConfigurations();
        if (formConfigurations != null) {
            if (formConfigurations.getRedirectLinks() != null) {
                this.redirectLinks = formConfigurations.getRedirectLinks();
            }
            this.isPinchGestureEnabled = formConfigurations.isPinchGestureEnabled();
            this.minFontSize = formConfigurations.getMinFontSize();
            this.maxFontSize = formConfigurations.getMaxFontSize();
        }
        MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig();
        if (medalliaDigitalClientConfig == null) {
            return;
        }
        if (medalliaDigitalClientConfig.getBlockNetworkInForm() != null) {
            this.blockNetworkInForm = medalliaDigitalClientConfig.getBlockNetworkInForm().booleanValue();
        }
        if (configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.isFeedbackSubmitIndicatorEnabled = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isFeedbackSubmitIndicatorEnabled();
        }
        if (configurationContract.getPropertyConfiguration() == null || configurationContract.getPropertyConfiguration().getTextAreaLimit() == null) {
            return;
        }
        this.textAreaLimit = configurationContract.getPropertyConfiguration().getTextAreaLimit();
    }

    protected void setFormCommunicatorListener(i2 i2Var) {
        this.formCommunicatorListener = i2Var;
    }

    protected void setLoadingListener(e eVar) {
        this.listener = eVar;
    }

    public void setType(f fVar) {
        this.type = fVar;
    }

    protected MedalliaWebView(Context context, boolean z10, o2 o2Var, f fVar, j2 j2Var, long j10, b5 b5Var, boolean z11, boolean z12, int i10, int i11, boolean z13, Integer num) {
        super(context);
        this.blockNetworkInForm = true;
        this.isRenderFinished = false;
        this.reloadingNumber = 1;
        this.redirectLinks = new ArrayList<>();
        this.isPinchGestureEnabled = false;
        this.isNewLiveFormEnable = false;
        this.type = fVar;
        this.webViewId = j10;
        this.formData = j2Var;
        this.isPreviewApp = z10;
        this.formPreviewData = o2Var;
        this.blockNetworkInForm = j2Var.k();
        this.redirectLinks = j2Var.e();
        this.mediaCaptureConfiguration = b5Var;
        this.isPinchGestureEnabled = z11;
        this.isNewLiveFormEnable = z12;
        this.minFontSize = i10;
        this.maxFontSize = i11;
        this.isFeedbackSubmitIndicatorEnabled = z13;
        this.textAreaLimit = num;
    }
}

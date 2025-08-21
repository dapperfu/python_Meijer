package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.d7;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class MedalliaDigital {
    private static final m3 killSwitch = new m3();
    private static r4 medalliaDigitalBrain;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f92396a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f92397b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92398c;

        a(MDResultCallback mDResultCallback, Application application, String str) {
            this.f92396a = mDResultCallback;
            this.f92397b = application;
            this.f92398c = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (MedalliaDigital.isBelowApi28()) {
                this.f92396a.onError(new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED));
                return;
            }
            if (this.f92397b == null) {
                this.f92396a.onError(new MDExternalError(MDExternalError.ExternalError.APPLICATION_IS_NULL));
                return;
            }
            if (i4.c().b() == null) {
                i4.a(this.f92397b);
                if (MedalliaDigital.isSdkStopped()) {
                    this.f92396a.onError(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED));
                    return;
                } else {
                    LifeCycle.b();
                    d7.b().a(this.f92397b);
                }
            }
            if (MedalliaDigital.isSdkStopped()) {
                this.f92396a.onError(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED));
                return;
            }
            a4.e("SDK init started");
            MedalliaDigital.initMedalliaDigitalBrainIfNecessary();
            MedalliaDigital.medalliaDigitalBrain.b(this.f92398c, this.f92396a);
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92399a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f92400b;

        b(String str, MDResultCallback mDResultCallback) {
            this.f92399a = str;
            this.f92400b = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            MedalliaDigital.medalliaDigitalBrain.c(this.f92399a, this.f92400b);
        }
    }

    public static void closeEngagement(MDResultCallback mDResultCallback) {
        MDExternalError mDExternalError;
        a4.e("Close Engagement was called");
        if (isBelowApi28()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
        } else if (isSdkStopped()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
        } else if (isSdkKilled()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
        } else {
            r4 r4Var = medalliaDigitalBrain;
            if (r4Var != null) {
                r4Var.a(mDResultCallback);
                return;
            } else if (mDResultCallback == null) {
                return;
            } else {
                mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED);
            }
        }
        a4.c(mDExternalError.getMessage());
        mDResultCallback.onError(mDExternalError);
    }

    public static void customInterceptTrigger(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        if (isBelowApi28()) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
            a4.c(mDExternalError.getMessage());
            mDFailureCallback.onError(mDExternalError);
        } else if (isSdkStopped()) {
            MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
            a4.c(mDExternalError2.getMessage());
            mDFailureCallback.onError(mDExternalError2);
        } else if (!isSdkKilled()) {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(str, mDInterceptActionType, mDFailureCallback);
        } else {
            MDExternalError mDExternalError3 = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
            a4.c(mDExternalError3.getMessage());
            mDFailureCallback.onError(mDExternalError3);
        }
    }

    public static void disableIntercept() {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(false);
        }
    }

    public static void enableIntercept() {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(true);
        }
    }

    protected static r4 getMedalliaDigitalBrain() {
        return medalliaDigitalBrain;
    }

    public static void handleNotification(String str, MDResultCallback mDResultCallback) {
        if (isBelowApi28()) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
            a4.c(mDExternalError.getMessage());
            mDResultCallback.onError(mDExternalError);
        } else if (isSdkStopped()) {
            MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
            a4.c(mDExternalError2.getMessage());
            mDResultCallback.onError(mDExternalError2);
        } else if (!isSdkKilled()) {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(str, mDResultCallback);
        } else {
            MDExternalError mDExternalError3 = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
            a4.c(mDExternalError3.getMessage());
            mDResultCallback.onError(mDExternalError3);
        }
    }

    public static void init(Application application, String str, MDResultCallback mDResultCallback) {
        w7.b().a().execute(new a(mDResultCallback, application, str));
    }

    protected static void initMedalliaDigitalBrainIfNecessary() {
        if (medalliaDigitalBrain == null) {
            medalliaDigitalBrain = new r4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isBelowApi28() {
        return Build.VERSION.SDK_INT < 28;
    }

    private static boolean isSdkKilled() {
        return killSwitch.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSdkStopped() {
        return d7.b().a(d7.a.SDK_STOPPED, false);
    }

    public static void revertStopSDK() {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.i();
        }
    }

    public static void setActivity(Activity activity) throws JSONException {
        a4.e("setActivity was called");
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(activity);
        }
    }

    public static void setCustomAppearance(MDAppearanceMode mDAppearanceMode) throws JSONException {
        a4.e("setCustomAppearance was called: " + mDAppearanceMode.name());
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDAppearanceMode);
        }
    }

    public static void setCustomInterceptListener(MDCustomInterceptListener mDCustomInterceptListener) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDCustomInterceptListener);
        }
    }

    public static void setCustomParameter(String str, Object obj) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(str, obj);
        }
    }

    public static void setCustomParameters(HashMap<String, Object> map) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(map);
        }
    }

    public static void setDebugForm(boolean z10) {
        a4.e("setDebugForm was called");
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.b(z10);
        }
    }

    public static void setFeedbackListener(MDFeedbackListener mDFeedbackListener) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDFeedbackListener);
        }
    }

    public static void setFormListener(MDFormListener mDFormListener) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDFormListener);
        }
    }

    public static void setInterceptListener(MDInterceptListener mDInterceptListener) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDInterceptListener);
        }
    }

    public static void setLogLevel(MDLogLevel mDLogLevel) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDLogLevel);
        }
    }

    public static void setSdkFramework(MDSdkFrameworkType mDSdkFrameworkType) {
        if (isBelowApi28()) {
            return;
        }
        a4.e("setSdkFramework was called");
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDSdkFrameworkType);
        }
    }

    public static void setTouchEventListener(MDTouchListener mDTouchListener) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(mDTouchListener);
        }
    }

    public static void setUserId(String str) {
        a4.e("setUserId was called");
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.b(str);
        }
    }

    public static void showForm(String str, MDResultCallback mDResultCallback) {
        a4.e("Show form was called");
        if (isBelowApi28()) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
            a4.c(mDExternalError.getMessage());
            mDResultCallback.onError(mDExternalError);
            return;
        }
        if (isSdkStopped()) {
            MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
            a4.c(mDExternalError2.getMessage());
            mDResultCallback.onError(mDExternalError2);
        } else if (isSdkKilled()) {
            MDExternalError mDExternalError3 = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
            a4.c(mDExternalError3.getMessage());
            mDResultCallback.onError(mDExternalError3);
        } else if (medalliaDigitalBrain != null) {
            w7.b().a().execute(new b(str, mDResultCallback));
        } else if (mDResultCallback != null) {
            MDExternalError mDExternalError4 = new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED);
            a4.c(mDExternalError4.getMessage());
            mDResultCallback.onError(mDExternalError4);
        }
    }

    public static void stopSDK(boolean z10) {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.c(z10);
        }
    }

    protected static void updateBrainOnMigration() {
        medalliaDigitalBrain = null;
        initMedalliaDigitalBrainIfNecessary();
    }

    public static void updateCustomLocale(String str, MDCallback mDCallback) throws JSONException {
        if (isBelowApi28()) {
            return;
        }
        if (isSdkStopped()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
        } else if (isSdkKilled()) {
            a4.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.a(str, mDCallback);
        }
    }
}

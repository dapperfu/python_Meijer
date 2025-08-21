package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.maps.android.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8563jb0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C8563jb0 f76298a = new C8563jb0();

    private C8563jb0() {
    }

    public static final C8563jb0 a() {
        return f76298a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            String strConcat = "javascript: ".concat(String.valueOf(str));
            com.fullstory.FS.trackWebView(webView);
            webView.loadUrl(strConcat);
            return true;
        }
    }

    final void b(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C6772Da0.f67101a.getClass();
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append(BuildConfig.TRAVIS);
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb2.append(string);
                } else {
                    sb2.append('\"');
                    sb2.append(string);
                    sb2.append('\"');
                }
            } else {
                sb2.append(obj);
            }
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append(")}");
        String string2 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            k(webView, string2);
        } else {
            handler.post(new RunnableC8458ib0(this, webView, string2));
        }
    }

    public final void c(WebView webView, String str) {
        b(webView, "finishSession", str);
    }

    public final void d(WebView webView, String str, JSONObject jSONObject) {
        b(webView, "init", jSONObject, str);
    }

    public final void e(WebView webView, String str, float f10) {
        b(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public final void f(WebView webView, JSONObject jSONObject) {
        b(webView, "setLastActivity", jSONObject);
    }

    public final void g(WebView webView, String str, String str2) {
        b(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, String str2) {
        b(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void i(WebView webView, String str, String str2) {
        b(webView, "setState", str2, str);
    }

    public final void j(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}

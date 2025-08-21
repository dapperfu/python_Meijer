package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzcy {
    private static final zzcy zza = new zzcy();

    private zzcy() {
    }

    public static final zzcy zza() {
        return zza;
    }

    public static final boolean zzj(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            String strConcat = "javascript: ".concat(String.valueOf(str));
            FS.trackWebView(webView);
            webView.loadUrl(strConcat);
            return true;
        }
    }

    final void zzb(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            zzci.zza.getClass();
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
            zzj(webView, string2);
        } else {
            handler.post(new zzcx(this, webView, string2));
        }
    }

    public final void zzc(WebView webView, String str) {
        zzb(webView, "finishSession", str);
    }

    public final void zzd(WebView webView, String str, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject, str);
    }

    public final void zze(WebView webView, String str, float f10) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public final void zzf(WebView webView, JSONObject jSONObject) {
        zzb(webView, "setLastActivity", jSONObject);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzb(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzh(WebView webView, String str, String str2) {
        zzb(webView, "setState", str2, str);
    }

    public final void zzi(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}

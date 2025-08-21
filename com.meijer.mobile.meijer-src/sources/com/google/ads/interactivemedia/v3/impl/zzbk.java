package com.google.ads.interactivemedia.v3.impl;

import M4.e;
import M4.f;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.internal.zzahj;
import com.google.ads.interactivemedia.v3.internal.zzek;
import com.google.ads.interactivemedia.v3.internal.zzfh;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzqf;
import com.google.ads.interactivemedia.v3.internal.zzrr;
import com.google.ads.interactivemedia.v3.internal.zzuu;
import com.google.ads.interactivemedia.v3.internal.zzvd;

@SuppressLint({"SetJavaScriptEnabled", "NewApi", "ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class zzbk {
    private WebView zza;
    private zzbh zzc;
    private final zzahj zze;
    private final zzek zzf = new zzek();
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private zzfh zzd = new zzfh();

    public final WebView zza() {
        return this.zza;
    }

    protected final void zzi(zzbh zzbhVar) {
        this.zzc = zzbhVar;
    }

    public static zzbk zzb(WebView webView, Uri uri, zzahj zzahjVar) {
        zzbk zzbkVar = new zzbk(webView, zzahjVar);
        webView.setBackgroundColor(0);
        webView.getSettings().setMixedContentMode(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        if (f.a("WEB_MESSAGE_LISTENER")) {
            String str = String.format("%s://%s", uri.getScheme(), uri.getHost());
            if (uri.getPort() != -1) {
                str = String.format("%s:%s", str, Integer.valueOf(uri.getPort()));
            }
            e.a(zzbkVar.zza, "androidWebViewCompatSender", zzrr.zzm(str), new zzbg(zzbkVar));
        }
        FS.setWebViewClient(webView, new zzbj(zzbkVar, zzbkVar.zze));
        webView.setWebChromeClient(new WebChromeClient());
        webView.setOnTouchListener(zzbkVar.zzf);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        String string = uri.toString();
        FS.trackWebView(webView);
        webView.loadUrl(string);
        return zzbkVar;
    }

    private final void zzk(String str, ValueCallback valueCallback, ValueCallback valueCallback2) {
        WebView webView = this.zza;
        if (webView == null) {
            zzfk.zzd("WebView not available at evaluateJavascript");
            return;
        }
        try {
            webView.evaluateJavascript(str, valueCallback);
        } catch (IllegalStateException unused) {
            WebView webView2 = this.zza;
            FS.trackWebView(webView2);
            webView2.loadUrl(str);
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
        }
    }

    public final void zzd() {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }

    final /* synthetic */ void zze() {
        WebView webView = this.zza;
        if (webView != null) {
            webView.destroy();
            this.zza = null;
        }
        this.zzc = null;
        this.zzd = null;
    }

    final /* synthetic */ void zzf(String str, final zzvd zzvdVar) {
        zzk(str, new ValueCallback() { // from class: com.google.ads.interactivemedia.v3.impl.zzbb
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzvdVar.zzc(zzqf.zzh((String) obj));
            }
        }, new ValueCallback() { // from class: com.google.ads.interactivemedia.v3.impl.zzbc
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzvdVar.zzc(zzqf.zzf());
            }
        });
    }

    final /* synthetic */ void zzg(JavaScriptMessage javaScriptMessage) {
        zzfh zzfhVar;
        if (this.zza == null || (zzfhVar = this.zzd) == null) {
            zzfk.zzd("Attempted to send bridge message after cleanup: ".concat(javaScriptMessage.toString()));
            return;
        }
        String strZzc = zzfhVar.zzc(javaScriptMessage);
        zzfk.zzc("Sending Javascript msg: " + javaScriptMessage.toString() + "; URL: " + strZzc);
        zzk(strZzc, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzh(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = ", Message Type: "
            com.google.ads.interactivemedia.v3.internal.zzfh r1 = r5.zzd
            if (r1 == 0) goto L96
            int r2 = r7.hashCode()     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            r3 = 48
            r4 = 1
            if (r2 == r3) goto L1e
            r3 = 52
            if (r2 == r3) goto L14
            goto L28
        L14:
            java.lang.String r2 = "4"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L28
            r2 = r4
            goto L29
        L1e:
            java.lang.String r2 = "0"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L28
            r2 = 0
            goto L29
        L28:
            r2 = -1
        L29:
            if (r2 == 0) goto L36
            if (r2 == r4) goto L2f
            r1 = 0
            goto L3a
        L2f:
            com.google.ads.interactivemedia.v3.impl.JavaScriptMessage r1 = r1.zzb(r6)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            goto L3a
        L34:
            r1 = move-exception
            goto L60
        L36:
            com.google.ads.interactivemedia.v3.impl.JavaScriptMessage r1 = r1.zza(r6)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
        L3a:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            r3.<init>()     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            java.lang.String r4 = "Received Javascript msg: "
            r3.append(r4)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            r3.append(r2)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            com.google.ads.interactivemedia.v3.internal.zzfk.zzc(r2)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L7b
            com.google.ads.interactivemedia.v3.impl.zzbh r6 = r5.zzc
            if (r6 != 0) goto L5c
            java.lang.String r6 = "Received JS Message without a listener."
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r6)
            return
        L5c:
            r6.zza(r1)
            return
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid internal message. Message could not be be parsed: "
            r2.append(r3)
            r2.append(r6)
            r2.append(r0)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            com.google.ads.interactivemedia.v3.internal.zzfk.zzb(r6, r1)
            return
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid internal message. Make sure the Google IMA SDK library is up to date. Message: "
            r1.append(r2)
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r6)
            return
        L96:
            java.lang.String r6 = "Received JS Message after JavaScriptWebView destroyed"
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.impl.zzbk.zzh(java.lang.String, java.lang.String):void");
    }

    public final void zzj(final JavaScriptMessage javaScriptMessage) {
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(javaScriptMessage);
            }
        });
    }

    private zzbk(WebView webView, zzahj zzahjVar) {
        this.zza = webView;
        this.zze = zzahjVar;
    }

    public final zzuu zzc(final String str) {
        final zzvd zzvdVarZzs = zzvd.zzs();
        this.zzb.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzbf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(str, zzvdVarZzs);
            }
        });
        return zzvdVarZzs;
    }
}

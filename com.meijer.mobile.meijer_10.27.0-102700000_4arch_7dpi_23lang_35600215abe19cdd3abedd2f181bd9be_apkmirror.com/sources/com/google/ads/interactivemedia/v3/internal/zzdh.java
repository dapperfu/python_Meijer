package com.google.ads.interactivemedia.v3.internal;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;

/* loaded from: classes4.dex */
final class zzdh extends WebViewClient {
    final /* synthetic */ zzdj zza;

    zzdh(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        FS.log_w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        if (this.zza.zza() == webView) {
            FS.log_w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzm(null);
        }
        webView.destroy();
        return true;
    }
}

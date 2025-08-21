package com.google.ads.interactivemedia.v3.impl;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzan extends WebViewClient {
    final /* synthetic */ zzao zza;

    zzan(zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.zza.zzb.zzb(str)) {
            return true;
        }
        Iterator it = this.zza.zzc.iterator();
        while (it.hasNext()) {
            ((CompanionAdSlot.ClickListener) it.next()).onCompanionAdClick();
        }
        return true;
    }
}

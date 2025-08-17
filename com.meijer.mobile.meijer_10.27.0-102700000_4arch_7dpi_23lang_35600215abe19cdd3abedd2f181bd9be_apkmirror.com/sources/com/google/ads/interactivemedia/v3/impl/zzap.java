package com.google.ads.interactivemedia.v3.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class zzap extends WebView {
    @SuppressLint({"SetJavaScriptEnabled"})
    public static zzap zza(Context context, com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, List list, zzgi zzgiVar) {
        zzap zzapVar = new zzap(context);
        zzapVar.getSettings().setJavaScriptEnabled(true);
        zzapVar.getSettings().setSupportMultipleWindows(true);
        zzapVar.setBackgroundColor(0);
        zzapVar.setWebChromeClient(new zzao(context, zzgiVar, list));
        if (zzbeVar.type() == com.google.ads.interactivemedia.v3.impl.data.zzbd.Html) {
            String strEncodeToString = Base64.encodeToString(zzbeVar.src().getBytes(), 1);
            FS.trackWebView(zzapVar);
            zzapVar.loadData(strEncodeToString, "text/html", "base64");
            return zzapVar;
        }
        if (zzbeVar.type() == com.google.ads.interactivemedia.v3.impl.data.zzbd.IFrame) {
            String strSrc = zzbeVar.src();
            FS.trackWebView(zzapVar);
            zzapVar.loadUrl(strSrc);
            return zzapVar;
        }
        throw new IllegalArgumentException("Companion type " + String.valueOf(zzbeVar.type()) + " is not valid for a CompanionWebView");
    }

    private zzap(Context context) {
        super(context);
    }
}

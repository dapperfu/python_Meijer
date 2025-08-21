package com.radiusnetworks.flybuy.sdk;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class b {
    public static void a(FlyBuyCore flyBuyCore, String str, Exception exc) {
        flyBuyCore.getCrashManager().log(str);
        flyBuyCore.getCrashManager().reportCrash(exc);
    }
}

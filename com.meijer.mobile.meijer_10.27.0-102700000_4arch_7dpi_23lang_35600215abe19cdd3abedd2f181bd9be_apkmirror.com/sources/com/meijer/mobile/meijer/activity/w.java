package com.meijer.mobile.meijer.activity;

import okhttp3.Headers;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class w implements InterfaceC16421a<UniversalLinkBypassActivity> {
    public static void a(UniversalLinkBypassActivity universalLinkBypassActivity, Headers headers) {
        universalLinkBypassActivity.globalHeaders = headers;
    }

    public static void b(UniversalLinkBypassActivity universalLinkBypassActivity, Cl.e eVar) {
        universalLinkBypassActivity.meijerIntent = eVar;
    }
}

package com.meijer.mobile.meijer.activity;

import lu.InterfaceC15612a;
import okhttp3.Headers;

/* loaded from: classes10.dex */
public final class w implements InterfaceC15612a<UniversalLinkBypassActivity> {
    public static void a(UniversalLinkBypassActivity universalLinkBypassActivity, Headers headers) {
        universalLinkBypassActivity.globalHeaders = headers;
    }

    public static void b(UniversalLinkBypassActivity universalLinkBypassActivity, Dl.e eVar) {
        universalLinkBypassActivity.meijerIntent = eVar;
    }
}

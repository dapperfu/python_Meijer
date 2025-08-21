package com.meijer.mobile.models;

import okhttp3.OkHttpClient;
import xu.InterfaceC18226d;

/* loaded from: classes10.dex */
public final class CaptivePortalTester_Factory implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18226d<OkHttpClient> f114376a;

    public static CaptivePortalTester_Factory create(InterfaceC18226d<OkHttpClient> interfaceC18226d) {
        return new CaptivePortalTester_Factory(interfaceC18226d);
    }

    public static CaptivePortalTester newInstance(OkHttpClient okHttpClient) {
        return new CaptivePortalTester(okHttpClient);
    }

    @Override // gv.InterfaceC14411a
    public CaptivePortalTester get() {
        return newInstance(this.f114376a.get());
    }

    private CaptivePortalTester_Factory(InterfaceC18226d<OkHttpClient> interfaceC18226d) {
        this.f114376a = interfaceC18226d;
    }
}

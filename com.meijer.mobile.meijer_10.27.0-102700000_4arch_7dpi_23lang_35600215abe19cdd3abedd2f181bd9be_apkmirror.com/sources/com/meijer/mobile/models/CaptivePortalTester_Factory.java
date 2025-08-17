package com.meijer.mobile.models;

import Bu.d;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class CaptivePortalTester_Factory implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d<OkHttpClient> f113523a;

    public static CaptivePortalTester_Factory create(d<OkHttpClient> dVar) {
        return new CaptivePortalTester_Factory(dVar);
    }

    public static CaptivePortalTester newInstance(OkHttpClient okHttpClient) {
        return new CaptivePortalTester(okHttpClient);
    }

    @Override // kv.InterfaceC15323a
    public CaptivePortalTester get() {
        return newInstance(this.f113523a.get());
    }

    private CaptivePortalTester_Factory(d<OkHttpClient> dVar) {
        this.f113523a = dVar;
    }
}

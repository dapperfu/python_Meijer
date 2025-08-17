package com.google.android.gms.ads;

import Mc.C4112e1;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a;

/* loaded from: classes4.dex */
public abstract class a<T extends a<T>> {

    /* renamed from: a, reason: collision with root package name */
    protected final C4112e1 f64547a;

    protected abstract T c();

    public T a(String str) {
        this.f64547a.q(str);
        return (T) c();
    }

    public T b(Class<Object> cls, Bundle bundle) {
        this.f64547a.r(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f64547a.t("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) c();
    }

    @Deprecated
    public final a d(String str) {
        this.f64547a.s(str);
        return c();
    }

    @Deprecated
    public final a e(boolean z10) {
        this.f64547a.u(z10);
        return c();
    }

    @Deprecated
    public final a f(boolean z10) {
        this.f64547a.a(z10);
        return c();
    }

    protected a() {
        C4112e1 c4112e1 = new C4112e1();
        this.f64547a = c4112e1;
        c4112e1.s("B3EEABB8EE11C2BE770B684D95219ECB");
    }
}

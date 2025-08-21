package com.google.android.gms.ads;

import Oc.C4390e1;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a;

/* loaded from: classes4.dex */
public abstract class a<T extends a<T>> {

    /* renamed from: a, reason: collision with root package name */
    protected final C4390e1 f65387a;

    protected abstract T c();

    public T a(String str) {
        this.f65387a.q(str);
        return (T) c();
    }

    public T b(Class<Object> cls, Bundle bundle) {
        this.f65387a.r(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f65387a.t("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) c();
    }

    @Deprecated
    public final a d(String str) {
        this.f65387a.s(str);
        return c();
    }

    @Deprecated
    public final a e(boolean z10) {
        this.f65387a.u(z10);
        return c();
    }

    @Deprecated
    public final a f(boolean z10) {
        this.f65387a.a(z10);
        return c();
    }

    protected a() {
        C4390e1 c4390e1 = new C4390e1();
        this.f65387a = c4390e1;
        c4390e1.s("B3EEABB8EE11C2BE770B684D95219ECB");
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.kb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8670kb0 implements InterfaceC7924db0 {

    /* renamed from: d, reason: collision with root package name */
    private static C8670kb0 f76513d;

    /* renamed from: a, reason: collision with root package name */
    private float f76514a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private C7481Ya0 f76515b;

    /* renamed from: c, reason: collision with root package name */
    private C7817cb0 f76516c;

    public C8670kb0(C7514Za0 c7514Za0, C7448Xa0 c7448Xa0) {
    }

    public static C8670kb0 b() {
        if (f76513d == null) {
            f76513d = new C8670kb0(new C7514Za0(), new C7448Xa0());
        }
        return f76513d;
    }

    public final float a() {
        return this.f76514a;
    }

    public final void c(Context context) {
        this.f76515b = new C7481Ya0(new Handler(), context, new C7415Wa0(), this);
    }

    public final void d(float f10) {
        this.f76514a = f10;
        if (this.f76516c == null) {
            this.f76516c = C7817cb0.a();
        }
        Iterator it = this.f76516c.b().iterator();
        while (it.hasNext()) {
            ((C7010Ka0) it.next()).g().l(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7924db0
    public final void zzc(boolean z10) {
        if (z10) {
            C7113Nb0.d().i();
        } else {
            C7113Nb0.d().h();
        }
    }

    public final void e() {
        C7711bb0.i().e(this);
        C7711bb0.i().f();
        C7113Nb0.d().i();
        this.f76515b.a();
    }

    public final void f() {
        C7113Nb0.d().j();
        C7711bb0.i().g();
        this.f76515b.b();
    }
}

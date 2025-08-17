package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.kb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8545kb0 implements InterfaceC7799db0 {

    /* renamed from: d, reason: collision with root package name */
    private static C8545kb0 f75673d;

    /* renamed from: a, reason: collision with root package name */
    private float f75674a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private C7356Ya0 f75675b;

    /* renamed from: c, reason: collision with root package name */
    private C7692cb0 f75676c;

    public C8545kb0(C7389Za0 c7389Za0, C7323Xa0 c7323Xa0) {
    }

    public static C8545kb0 b() {
        if (f75673d == null) {
            f75673d = new C8545kb0(new C7389Za0(), new C7323Xa0());
        }
        return f75673d;
    }

    public final float a() {
        return this.f75674a;
    }

    public final void c(Context context) {
        this.f75675b = new C7356Ya0(new Handler(), context, new C7290Wa0(), this);
    }

    public final void d(float f10) {
        this.f75674a = f10;
        if (this.f75676c == null) {
            this.f75676c = C7692cb0.a();
        }
        Iterator it = this.f75676c.b().iterator();
        while (it.hasNext()) {
            ((C6885Ka0) it.next()).g().l(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7799db0
    public final void zzc(boolean z10) {
        if (z10) {
            C6988Nb0.d().i();
        } else {
            C6988Nb0.d().h();
        }
    }

    public final void e() {
        C7586bb0.i().e(this);
        C7586bb0.i().f();
        C6988Nb0.d().i();
        this.f75675b.a();
    }

    public final void f() {
        C6988Nb0.d().j();
        C7586bb0.i().g();
        this.f75675b.b();
    }
}

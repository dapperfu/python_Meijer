package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ka0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6885Ka0 extends AbstractC6749Ga0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6817Ia0 f68114a;

    /* renamed from: c, reason: collision with root package name */
    private C7259Vb0 f68116c;

    /* renamed from: d, reason: collision with root package name */
    private C9507tb0 f68117d;

    /* renamed from: g, reason: collision with root package name */
    private final String f68120g;

    /* renamed from: b, reason: collision with root package name */
    private final C8119gb0 f68115b = new C8119gb0();

    /* renamed from: e, reason: collision with root package name */
    private boolean f68118e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f68119f = false;

    public final C9507tb0 g() {
        return this.f68117d;
    }

    public final String h() {
        return this.f68120g;
    }

    public final List i() {
        return this.f68115b.a();
    }

    public final boolean j() {
        return this.f68118e && !this.f68119f;
    }

    private final void k(View view) {
        this.f68116c = new C7259Vb0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6749Ga0
    public final void b(View view, EnumC6986Na0 enumC6986Na0, String str) {
        if (this.f68119f) {
            return;
        }
        this.f68115b.b(view, enumC6986Na0, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6749Ga0
    public final void c() {
        if (this.f68119f) {
            return;
        }
        this.f68116c.clear();
        if (!this.f68119f) {
            this.f68115b.c();
        }
        this.f68119f = true;
        this.f68117d.e();
        C7692cb0.a().e(this);
        this.f68117d.c();
        this.f68117d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6749Ga0
    public final void d(View view) {
        if (this.f68119f || f() == view) {
            return;
        }
        k(view);
        this.f68117d.b();
        Collection<C6885Ka0> collectionC = C7692cb0.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (C6885Ka0 c6885Ka0 : collectionC) {
            if (c6885Ka0 != this && c6885Ka0.f() == view) {
                c6885Ka0.f68116c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6749Ga0
    public final void e() {
        if (this.f68118e || this.f68117d == null) {
            return;
        }
        this.f68118e = true;
        C7692cb0.a().f(this);
        this.f68117d.l(C8545kb0.b().a());
        this.f68117d.g(C7479ab0.a().b());
        this.f68117d.i(this, this.f68114a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.f68116c.get();
    }

    C6885Ka0(C6783Ha0 c6783Ha0, C6817Ia0 c6817Ia0, String str) {
        this.f68114a = c6817Ia0;
        this.f68120g = str;
        k(null);
        if (c6817Ia0.d() != EnumC6851Ja0.HTML && c6817Ia0.d() != EnumC6851Ja0.JAVASCRIPT) {
            this.f68117d = new C9935xb0(str, c6817Ia0.i(), null);
        } else {
            this.f68117d = new C9614ub0(str, c6817Ia0.a());
        }
        this.f68117d.o();
        C7692cb0.a().d(this);
        this.f68117d.f(c6783Ha0);
    }
}

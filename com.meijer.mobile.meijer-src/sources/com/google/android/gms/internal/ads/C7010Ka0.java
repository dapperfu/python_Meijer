package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ka0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7010Ka0 extends AbstractC6874Ga0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6942Ia0 f68954a;

    /* renamed from: c, reason: collision with root package name */
    private C7384Vb0 f68956c;

    /* renamed from: d, reason: collision with root package name */
    private C9632tb0 f68957d;

    /* renamed from: g, reason: collision with root package name */
    private final String f68960g;

    /* renamed from: b, reason: collision with root package name */
    private final C8244gb0 f68955b = new C8244gb0();

    /* renamed from: e, reason: collision with root package name */
    private boolean f68958e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f68959f = false;

    public final C9632tb0 g() {
        return this.f68957d;
    }

    public final String h() {
        return this.f68960g;
    }

    public final List i() {
        return this.f68955b.a();
    }

    public final boolean j() {
        return this.f68958e && !this.f68959f;
    }

    private final void k(View view) {
        this.f68956c = new C7384Vb0(view);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6874Ga0
    public final void b(View view, EnumC7111Na0 enumC7111Na0, String str) {
        if (this.f68959f) {
            return;
        }
        this.f68955b.b(view, enumC7111Na0, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6874Ga0
    public final void c() {
        if (this.f68959f) {
            return;
        }
        this.f68956c.clear();
        if (!this.f68959f) {
            this.f68955b.c();
        }
        this.f68959f = true;
        this.f68957d.e();
        C7817cb0.a().e(this);
        this.f68957d.c();
        this.f68957d = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6874Ga0
    public final void d(View view) {
        if (this.f68959f || f() == view) {
            return;
        }
        k(view);
        this.f68957d.b();
        Collection<C7010Ka0> collectionC = C7817cb0.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (C7010Ka0 c7010Ka0 : collectionC) {
            if (c7010Ka0 != this && c7010Ka0.f() == view) {
                c7010Ka0.f68956c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6874Ga0
    public final void e() {
        if (this.f68958e || this.f68957d == null) {
            return;
        }
        this.f68958e = true;
        C7817cb0.a().f(this);
        this.f68957d.l(C8670kb0.b().a());
        this.f68957d.g(C7604ab0.a().b());
        this.f68957d.i(this, this.f68954a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.f68956c.get();
    }

    C7010Ka0(C6908Ha0 c6908Ha0, C6942Ia0 c6942Ia0, String str) {
        this.f68954a = c6942Ia0;
        this.f68960g = str;
        k(null);
        if (c6942Ia0.d() != EnumC6976Ja0.HTML && c6942Ia0.d() != EnumC6976Ja0.JAVASCRIPT) {
            this.f68957d = new C10060xb0(str, c6942Ia0.i(), null);
        } else {
            this.f68957d = new C9739ub0(str, c6942Ia0.a());
        }
        this.f68957d.o();
        C7817cb0.a().d(this);
        this.f68957d.f(c6908Ha0);
    }
}

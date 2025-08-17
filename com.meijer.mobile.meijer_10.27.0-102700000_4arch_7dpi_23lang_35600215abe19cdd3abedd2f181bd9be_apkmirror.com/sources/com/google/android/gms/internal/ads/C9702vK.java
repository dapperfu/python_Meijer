package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9702vK {

    /* renamed from: a, reason: collision with root package name */
    public final Object f79041a;

    /* renamed from: b, reason: collision with root package name */
    private C9481tF0 f79042b = new C9481tF0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f79043c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79044d;

    public final void c(UJ uj2) {
        this.f79044d = true;
        if (this.f79043c) {
            this.f79043c = false;
            uj2.a(this.f79041a, this.f79042b.b());
        }
    }

    public final void a(int i10, InterfaceC9487tJ interfaceC9487tJ) {
        if (this.f79044d) {
            return;
        }
        if (i10 != -1) {
            this.f79042b.a(i10);
        }
        this.f79043c = true;
        interfaceC9487tJ.zza(this.f79041a);
    }

    public final void b(UJ uj2) {
        if (this.f79044d || !this.f79043c) {
            return;
        }
        C9483tG0 c9483tG0B = this.f79042b.b();
        this.f79042b = new C9481tF0();
        this.f79043c = false;
        uj2.a(this.f79041a, c9483tG0B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9702vK.class != obj.getClass()) {
            return false;
        }
        return this.f79041a.equals(((C9702vK) obj).f79041a);
    }

    public final int hashCode() {
        return this.f79041a.hashCode();
    }

    public C9702vK(Object obj) {
        this.f79041a = obj;
    }
}

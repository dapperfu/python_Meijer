package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9827vK {

    /* renamed from: a, reason: collision with root package name */
    public final Object f79881a;

    /* renamed from: b, reason: collision with root package name */
    private C9606tF0 f79882b = new C9606tF0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f79883c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79884d;

    public final void c(UJ uj2) {
        this.f79884d = true;
        if (this.f79883c) {
            this.f79883c = false;
            uj2.a(this.f79881a, this.f79882b.b());
        }
    }

    public final void a(int i10, InterfaceC9612tJ interfaceC9612tJ) {
        if (this.f79884d) {
            return;
        }
        if (i10 != -1) {
            this.f79882b.a(i10);
        }
        this.f79883c = true;
        interfaceC9612tJ.zza(this.f79881a);
    }

    public final void b(UJ uj2) {
        if (this.f79884d || !this.f79883c) {
            return;
        }
        C9608tG0 c9608tG0B = this.f79882b.b();
        this.f79882b = new C9606tF0();
        this.f79883c = false;
        uj2.a(this.f79881a, c9608tG0B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9827vK.class != obj.getClass()) {
            return false;
        }
        return this.f79881a.equals(((C9827vK) obj).f79881a);
    }

    public final int hashCode() {
        return this.f79881a.hashCode();
    }

    public C9827vK(Object obj) {
        this.f79881a = obj;
    }
}

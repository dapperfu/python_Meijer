package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class DE implements InterfaceC10243zD {

    /* renamed from: a, reason: collision with root package name */
    private int f67031a = ((Integer) Oc.A.c().a(C8784lf.f77301p1)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private int f67032b = ((Integer) Oc.A.c().a(C8784lf.f76865Jc)).intValue();

    public final synchronized int a() {
        return this.f67031a;
    }

    public final synchronized int b() {
        return this.f67032b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final synchronized void z0(C8733l60 c8733l60) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77315q1)).booleanValue()) {
            try {
                C7773c60 c7773c60 = c8733l60.f76589b.f76177b;
                this.f67031a = c7773c60.f73944c;
                this.f67032b = c7773c60.f73945d;
            } catch (NullPointerException unused) {
            }
        }
    }
}

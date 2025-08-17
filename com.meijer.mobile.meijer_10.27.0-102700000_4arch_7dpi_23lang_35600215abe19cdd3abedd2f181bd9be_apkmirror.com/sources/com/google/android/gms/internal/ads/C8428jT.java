package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8428jT implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC8323iT f75446a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9408sf0 f75447b;

    public C8428jT(InterfaceC8323iT interfaceC8323iT, InterfaceC9408sf0 interfaceC9408sf0) {
        this.f75446a = interfaceC8323iT;
        this.f75447b = interfaceC9408sf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        return this.f75446a.a(c8608l60, z50);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(C8608l60 c8608l60, Z50 z50) {
        return Mj0.m(this.f75446a.b(c8608l60, z50), this.f75447b, C6908Kq.f68174a);
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8553jT implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC8448iT f76286a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9533sf0 f76287b;

    public C8553jT(InterfaceC8448iT interfaceC8448iT, InterfaceC9533sf0 interfaceC9533sf0) {
        this.f76286a = interfaceC8448iT;
        this.f76287b = interfaceC9533sf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        return this.f76286a.a(c8733l60, z50);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(C8733l60 c8733l60, Z50 z50) {
        return Mj0.m(this.f76286a.b(c8733l60, z50), this.f76287b, C7033Kq.f69014a);
    }
}

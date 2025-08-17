package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7952ez implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f73963a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f73964b;

    public C7952ez(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f73963a = interfaceC10088yy0;
        this.f73964b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7845dz zzb() {
        return new C7845dz(((C6916Ky) this.f73963a).a(), (Executor) this.f73964b.zzb());
    }
}

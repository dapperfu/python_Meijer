package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8077ez implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f74803a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f74804b;

    public C8077ez(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f74803a = interfaceC10213yy0;
        this.f74804b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7970dz zzb() {
        return new C7970dz(((C7041Ky) this.f74803a).a(), (Executor) this.f74804b.zzb());
    }
}

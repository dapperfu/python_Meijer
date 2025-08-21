package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8931mz implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f77783a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f77784b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f77785c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f77786d;

    public C8931mz(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f77783a = interfaceC10213yy0;
        this.f77784b = interfaceC10213yy02;
        this.f77785c = interfaceC10213yy03;
        this.f77786d = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C8398hz(((JA) this.f77783a).zzb(), ((C8824lz) this.f77784b).a(), ((C8717kz) this.f77785c).a(), (Executor) this.f77786d.zzb());
    }
}

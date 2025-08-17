package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8806mz implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f76943a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f76944b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f76945c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f76946d;

    public C8806mz(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f76943a = interfaceC10088yy0;
        this.f76944b = interfaceC10088yy02;
        this.f76945c = interfaceC10088yy03;
        this.f76946d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C8273hz(((JA) this.f76943a).zzb(), ((C8699lz) this.f76944b).a(), ((C8592kz) this.f76945c).a(), (Executor) this.f76946d.zzb());
    }
}

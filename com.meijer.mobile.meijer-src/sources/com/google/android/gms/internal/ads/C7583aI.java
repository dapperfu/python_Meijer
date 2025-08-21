package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.aI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7583aI implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73236a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f73237b;

    public C7583aI(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f73236a = interfaceC10213yy0;
        this.f73237b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7686bG((Context) this.f73236a.zzb(), new HashSet(), ((C7313Sz) this.f73237b).a());
    }
}

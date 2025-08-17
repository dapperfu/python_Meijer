package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.aI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7458aI implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72396a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f72397b;

    public C7458aI(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f72396a = interfaceC10088yy0;
        this.f72397b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7561bG((Context) this.f72396a.zzb(), new HashSet(), ((C7188Sz) this.f72397b).a());
    }
}

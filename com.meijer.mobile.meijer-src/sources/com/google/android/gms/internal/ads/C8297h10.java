package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.h10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8297h10 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f75412a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f75413b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f75414c;

    public C8297h10(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f75412a = interfaceC10213yy0;
        this.f75413b = interfaceC10213yy02;
        this.f75414c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8083f10 zzb() {
        return new C8083f10((ApplicationInfo) this.f75412a.zzb(), (PackageInfo) this.f75413b.zzb(), ((C9990wu) this.f75414c).a());
    }
}

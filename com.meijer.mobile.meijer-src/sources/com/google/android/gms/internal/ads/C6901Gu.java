package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import sd.C17067f;

/* renamed from: com.google.android.gms.internal.ads.Gu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6901Gu implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68140a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68141b;

    public C6901Gu(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f68140a = interfaceC10213yy0;
        this.f68141b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C17067f.a(((C9990wu) this.f68140a).a()).f(((ApplicationInfo) this.f68141b.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

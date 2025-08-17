package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.ads.Gu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6776Gu implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67300a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67301b;

    public C6776Gu(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f67300a = interfaceC10088yy0;
        this.f67301b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C16519f.a(((C9865wu) this.f67300a).a()).f(((ApplicationInfo) this.f67301b.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8290gy0 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9464ry0 f75404a;

    public static void a(InterfaceC9464ry0 interfaceC9464ry0, InterfaceC9464ry0 interfaceC9464ry02) {
        C8290gy0 c8290gy0 = (C8290gy0) interfaceC9464ry0;
        if (c8290gy0.f75404a != null) {
            throw new IllegalStateException();
        }
        c8290gy0.f75404a = interfaceC9464ry02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final Object zzb() {
        InterfaceC9464ry0 interfaceC9464ry0 = this.f75404a;
        if (interfaceC9464ry0 != null) {
            return interfaceC9464ry0.zzb();
        }
        throw new IllegalStateException();
    }
}

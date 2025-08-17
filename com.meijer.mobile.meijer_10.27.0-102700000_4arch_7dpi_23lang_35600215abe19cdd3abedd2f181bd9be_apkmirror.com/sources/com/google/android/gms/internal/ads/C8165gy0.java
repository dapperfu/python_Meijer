package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8165gy0 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9339ry0 f74564a;

    public static void a(InterfaceC9339ry0 interfaceC9339ry0, InterfaceC9339ry0 interfaceC9339ry02) {
        C8165gy0 c8165gy0 = (C8165gy0) interfaceC9339ry0;
        if (c8165gy0.f74564a != null) {
            throw new IllegalStateException();
        }
        c8165gy0.f74564a = interfaceC9339ry02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final Object zzb() {
        InterfaceC9339ry0 interfaceC9339ry0 = this.f74564a;
        if (interfaceC9339ry0 != null) {
            return interfaceC9339ry0.zzb();
        }
        throw new IllegalStateException();
    }
}

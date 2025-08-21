package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8609jy0 implements InterfaceC8502iy0, InterfaceC7863cy0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C8609jy0 f76380b = new C8609jy0(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f76381a;

    private C8609jy0(Object obj) {
        this.f76381a = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final Object zzb() {
        return this.f76381a;
    }

    public static InterfaceC8502iy0 a(Object obj) {
        C9358qy0.a(obj, "instance cannot be null");
        return new C8609jy0(obj);
    }

    public static InterfaceC8502iy0 b(Object obj) {
        return obj == null ? f76380b : new C8609jy0(obj);
    }
}

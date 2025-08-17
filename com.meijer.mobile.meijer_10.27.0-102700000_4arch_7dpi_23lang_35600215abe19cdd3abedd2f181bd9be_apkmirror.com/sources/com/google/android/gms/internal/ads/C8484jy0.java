package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8484jy0 implements InterfaceC8377iy0, InterfaceC7738cy0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C8484jy0 f75540b = new C8484jy0(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f75541a;

    private C8484jy0(Object obj) {
        this.f75541a = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final Object zzb() {
        return this.f75541a;
    }

    public static InterfaceC8377iy0 a(Object obj) {
        C9233qy0.a(obj, "instance cannot be null");
        return new C8484jy0(obj);
    }

    public static InterfaceC8377iy0 b(Object obj) {
        return obj == null ? f75540b : new C8484jy0(obj);
    }
}

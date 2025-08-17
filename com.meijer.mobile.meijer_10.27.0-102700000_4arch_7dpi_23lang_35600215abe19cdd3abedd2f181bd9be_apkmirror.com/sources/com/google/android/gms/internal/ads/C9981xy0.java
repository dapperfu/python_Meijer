package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9981xy0 implements InterfaceC9339ry0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f79894c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC9339ry0 f79895a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f79896b = f79894c;

    private C9981xy0(InterfaceC9339ry0 interfaceC9339ry0) {
        this.f79895a = interfaceC9339ry0;
    }

    public static InterfaceC9339ry0 a(InterfaceC9339ry0 interfaceC9339ry0) {
        return ((interfaceC9339ry0 instanceof C9981xy0) || (interfaceC9339ry0 instanceof C8272hy0)) ? interfaceC9339ry0 : new C9981xy0(interfaceC9339ry0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final Object zzb() {
        Object obj = this.f79896b;
        if (obj != f79894c) {
            return obj;
        }
        InterfaceC9339ry0 interfaceC9339ry0 = this.f79895a;
        if (interfaceC9339ry0 == null) {
            return this.f79896b;
        }
        Object objZzb = interfaceC9339ry0.zzb();
        this.f79896b = objZzb;
        this.f79895a = null;
        return objZzb;
    }
}

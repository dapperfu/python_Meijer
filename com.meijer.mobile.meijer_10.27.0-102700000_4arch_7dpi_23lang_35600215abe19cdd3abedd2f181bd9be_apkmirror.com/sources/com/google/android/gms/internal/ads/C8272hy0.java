package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8272hy0 implements InterfaceC9339ry0, InterfaceC7738cy0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f74851c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC9339ry0 f74852a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f74853b = f74851c;

    private C8272hy0(InterfaceC9339ry0 interfaceC9339ry0) {
        this.f74852a = interfaceC9339ry0;
    }

    public static InterfaceC9339ry0 b(InterfaceC9339ry0 interfaceC9339ry0) {
        return interfaceC9339ry0 instanceof C8272hy0 ? interfaceC9339ry0 : new C8272hy0(interfaceC9339ry0);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f74853b;
            Object obj2 = f74851c;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.f74852a.zzb();
            Object obj3 = this.f74853b;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.f74853b = objZzb;
            this.f74852a = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static InterfaceC7738cy0 a(InterfaceC9339ry0 interfaceC9339ry0) {
        return interfaceC9339ry0 instanceof InterfaceC7738cy0 ? (InterfaceC7738cy0) interfaceC9339ry0 : new C8272hy0(interfaceC9339ry0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final Object zzb() {
        Object obj = this.f74853b;
        return obj == f74851c ? c() : obj;
    }
}

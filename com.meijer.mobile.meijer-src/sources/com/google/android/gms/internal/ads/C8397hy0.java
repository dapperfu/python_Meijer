package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8397hy0 implements InterfaceC9464ry0, InterfaceC7863cy0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f75691c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC9464ry0 f75692a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f75693b = f75691c;

    private C8397hy0(InterfaceC9464ry0 interfaceC9464ry0) {
        this.f75692a = interfaceC9464ry0;
    }

    public static InterfaceC9464ry0 b(InterfaceC9464ry0 interfaceC9464ry0) {
        return interfaceC9464ry0 instanceof C8397hy0 ? interfaceC9464ry0 : new C8397hy0(interfaceC9464ry0);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f75693b;
            Object obj2 = f75691c;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.f75692a.zzb();
            Object obj3 = this.f75693b;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.f75693b = objZzb;
            this.f75692a = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static InterfaceC7863cy0 a(InterfaceC9464ry0 interfaceC9464ry0) {
        return interfaceC9464ry0 instanceof InterfaceC7863cy0 ? (InterfaceC7863cy0) interfaceC9464ry0 : new C8397hy0(interfaceC9464ry0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final Object zzb() {
        Object obj = this.f75693b;
        return obj == f75691c ? c() : obj;
    }
}

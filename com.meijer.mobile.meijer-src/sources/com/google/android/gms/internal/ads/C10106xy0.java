package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10106xy0 implements InterfaceC9464ry0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f80734c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC9464ry0 f80735a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f80736b = f80734c;

    private C10106xy0(InterfaceC9464ry0 interfaceC9464ry0) {
        this.f80735a = interfaceC9464ry0;
    }

    public static InterfaceC9464ry0 a(InterfaceC9464ry0 interfaceC9464ry0) {
        return ((interfaceC9464ry0 instanceof C10106xy0) || (interfaceC9464ry0 instanceof C8397hy0)) ? interfaceC9464ry0 : new C10106xy0(interfaceC9464ry0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final Object zzb() {
        Object obj = this.f80736b;
        if (obj != f80734c) {
            return obj;
        }
        InterfaceC9464ry0 interfaceC9464ry0 = this.f80735a;
        if (interfaceC9464ry0 == null) {
            return this.f80736b;
        }
        Object objZzb = interfaceC9464ry0.zzb();
        this.f80736b = objZzb;
        this.f80735a = null;
        return objZzb;
    }
}

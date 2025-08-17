package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7399Zf0 implements InterfaceC7300Wf0 {

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC7300Wf0 f72220d = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Yf0
        @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C7596bg0 f72221a = new C7596bg0();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC7300Wf0 f72222b;

    /* renamed from: c, reason: collision with root package name */
    private Object f72223c;

    public final String toString() {
        Object obj = this.f72222b;
        if (obj == f72220d) {
            obj = "<supplier that returned " + String.valueOf(this.f72223c) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
    public final Object zza() {
        InterfaceC7300Wf0 interfaceC7300Wf0 = this.f72222b;
        InterfaceC7300Wf0 interfaceC7300Wf02 = f72220d;
        if (interfaceC7300Wf0 != interfaceC7300Wf02) {
            synchronized (this.f72221a) {
                try {
                    if (this.f72222b != interfaceC7300Wf02) {
                        Object objZza = this.f72222b.zza();
                        this.f72223c = objZza;
                        this.f72222b = interfaceC7300Wf02;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f72223c;
    }

    C7399Zf0(InterfaceC7300Wf0 interfaceC7300Wf0) {
        this.f72222b = interfaceC7300Wf0;
    }
}

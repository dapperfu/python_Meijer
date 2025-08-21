package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7524Zf0 implements InterfaceC7425Wf0 {

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC7425Wf0 f73060d = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Yf0
        @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C7721bg0 f73061a = new C7721bg0();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC7425Wf0 f73062b;

    /* renamed from: c, reason: collision with root package name */
    private Object f73063c;

    public final String toString() {
        Object obj = this.f73062b;
        if (obj == f73060d) {
            obj = "<supplier that returned " + String.valueOf(this.f73063c) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
    public final Object zza() {
        InterfaceC7425Wf0 interfaceC7425Wf0 = this.f73062b;
        InterfaceC7425Wf0 interfaceC7425Wf02 = f73060d;
        if (interfaceC7425Wf0 != interfaceC7425Wf02) {
            synchronized (this.f73061a) {
                try {
                    if (this.f73062b != interfaceC7425Wf02) {
                        Object objZza = this.f73062b.zza();
                        this.f73063c = objZza;
                        this.f73062b = interfaceC7425Wf02;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f73063c;
    }

    C7524Zf0(InterfaceC7425Wf0 interfaceC7425Wf0) {
        this.f73062b = interfaceC7425Wf0;
    }
}

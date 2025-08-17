package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Xf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7333Xf0 implements Serializable, InterfaceC7300Wf0 {

    /* renamed from: a, reason: collision with root package name */
    private final transient C7596bg0 f71374a = new C7596bg0();

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC7300Wf0 f71375b;

    /* renamed from: c, reason: collision with root package name */
    volatile transient boolean f71376c;

    /* renamed from: d, reason: collision with root package name */
    transient Object f71377d;

    public final String toString() {
        Object obj;
        if (this.f71376c) {
            obj = "<supplier that returned " + String.valueOf(this.f71377d) + ">";
        } else {
            obj = this.f71375b;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
    public final Object zza() {
        if (!this.f71376c) {
            synchronized (this.f71374a) {
                try {
                    if (!this.f71376c) {
                        Object objZza = this.f71375b.zza();
                        this.f71377d = objZza;
                        this.f71376c = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f71377d;
    }

    C7333Xf0(InterfaceC7300Wf0 interfaceC7300Wf0) {
        this.f71375b = interfaceC7300Wf0;
    }
}

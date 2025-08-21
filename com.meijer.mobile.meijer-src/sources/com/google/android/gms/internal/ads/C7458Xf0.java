package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Xf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7458Xf0 implements Serializable, InterfaceC7425Wf0 {

    /* renamed from: a, reason: collision with root package name */
    private final transient C7721bg0 f72214a = new C7721bg0();

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC7425Wf0 f72215b;

    /* renamed from: c, reason: collision with root package name */
    volatile transient boolean f72216c;

    /* renamed from: d, reason: collision with root package name */
    transient Object f72217d;

    public final String toString() {
        Object obj;
        if (this.f72216c) {
            obj = "<supplier that returned " + String.valueOf(this.f72217d) + ">";
        } else {
            obj = this.f72215b;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
    public final Object zza() {
        if (!this.f72216c) {
            synchronized (this.f72214a) {
                try {
                    if (!this.f72216c) {
                        Object objZza = this.f72215b.zza();
                        this.f72217d = objZza;
                        this.f72216c = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f72217d;
    }

    C7458Xf0(InterfaceC7425Wf0 interfaceC7425Wf0) {
        this.f72215b = interfaceC7425Wf0;
    }
}

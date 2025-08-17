package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes6.dex */
public final class MA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7953ez0 f68564a;

    @Deprecated
    public final MA0 a(final InterfaceC7550bA0 interfaceC7550bA0) {
        C7953ez0 c7953ez0 = this.f68564a;
        C8086gC.f(!c7953ez0.f73982r);
        interfaceC7550bA0.getClass();
        c7953ez0.f73970f = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Wy0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return interfaceC7550bA0;
            }
        };
        return this;
    }

    @Deprecated
    public final MA0 b(final WG0 wg0) {
        C7953ez0 c7953ez0 = this.f68564a;
        C8086gC.f(!c7953ez0.f73982r);
        wg0.getClass();
        c7953ez0.f73969e = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.dz0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return wg0;
            }
        };
        return this;
    }

    @Deprecated
    public final NA0 c() {
        C7953ez0 c7953ez0 = this.f68564a;
        C8086gC.f(!c7953ez0.f73982r);
        c7953ez0.f73982r = true;
        return new NA0(c7953ez0);
    }

    @Deprecated
    public MA0(Context context, C7248Us c7248Us) {
        this.f68564a = new C7953ez0(context, c7248Us);
    }
}

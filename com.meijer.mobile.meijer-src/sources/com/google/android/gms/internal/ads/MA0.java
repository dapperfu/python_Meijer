package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes6.dex */
public final class MA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8078ez0 f69404a;

    @Deprecated
    public final MA0 a(final InterfaceC7675bA0 interfaceC7675bA0) {
        C8078ez0 c8078ez0 = this.f69404a;
        C8211gC.f(!c8078ez0.f74822r);
        interfaceC7675bA0.getClass();
        c8078ez0.f74810f = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Wy0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return interfaceC7675bA0;
            }
        };
        return this;
    }

    @Deprecated
    public final MA0 b(final WG0 wg0) {
        C8078ez0 c8078ez0 = this.f69404a;
        C8211gC.f(!c8078ez0.f74822r);
        wg0.getClass();
        c8078ez0.f74809e = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.dz0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return wg0;
            }
        };
        return this;
    }

    @Deprecated
    public final NA0 c() {
        C8078ez0 c8078ez0 = this.f69404a;
        C8211gC.f(!c8078ez0.f74822r);
        c8078ez0.f74822r = true;
        return new NA0(c8078ez0);
    }

    @Deprecated
    public MA0(Context context, C7373Us c7373Us) {
        this.f69404a = new C8078ez0(context, c7373Us);
    }
}

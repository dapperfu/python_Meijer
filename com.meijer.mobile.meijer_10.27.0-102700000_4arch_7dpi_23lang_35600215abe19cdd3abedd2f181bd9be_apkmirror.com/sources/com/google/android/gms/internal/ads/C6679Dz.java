package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Dz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6679Dz implements InterfaceC6713Ez {

    /* renamed from: a, reason: collision with root package name */
    private final Map f66310a;

    C6679Dz(Map map) {
        this.f66310a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6713Ez
    public final InterfaceC8323iT c(int i10, String str) {
        return (InterfaceC8323iT) this.f66310a.get(str);
    }
}

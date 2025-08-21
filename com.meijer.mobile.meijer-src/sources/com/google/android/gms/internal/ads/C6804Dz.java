package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Dz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6804Dz implements InterfaceC6838Ez {

    /* renamed from: a, reason: collision with root package name */
    private final Map f67150a;

    C6804Dz(Map map) {
        this.f67150a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6838Ez
    public final InterfaceC8448iT c(int i10, String str) {
        return (InterfaceC8448iT) this.f67150a.get(str);
    }
}

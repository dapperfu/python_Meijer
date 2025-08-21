package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ah0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7616ah0 extends AbstractC10070xg0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f73304a;

    /* renamed from: b, reason: collision with root package name */
    final Object f73305b;

    C7616ah0(Object obj, Object obj2) {
        this.f73304a = obj;
        this.f73305b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10070xg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f73304a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10070xg0, java.util.Map.Entry
    public final Object getValue() {
        return this.f73305b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

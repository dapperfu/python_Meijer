package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.ah0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7491ah0 extends AbstractC9945xg0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f72464a;

    /* renamed from: b, reason: collision with root package name */
    final Object f72465b;

    C7491ah0(Object obj, Object obj2) {
        this.f72464a = obj;
        this.f72465b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9945xg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f72464a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9945xg0, java.util.Map.Entry
    public final Object getValue() {
        return this.f72465b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

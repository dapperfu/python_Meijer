package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10320o0<K> implements Map.Entry<K, Object> {

    /* renamed from: a, reason: collision with root package name */
    private Map.Entry<K, C10314m0> f81532a;

    private C10320o0(Map.Entry<K, C10314m0> entry) {
        this.f81532a = entry;
    }

    public final C10314m0 a() {
        return this.f81532a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f81532a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f81532a.getValue() == null) {
            return null;
        }
        return C10314m0.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof J0) {
            return this.f81532a.getValue().c((J0) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

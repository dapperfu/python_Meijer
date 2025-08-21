package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11142c1<K> implements Map.Entry<K, Object> {

    /* renamed from: a, reason: collision with root package name */
    private Map.Entry<K, C11134a1> f85358a;

    private C11142c1(Map.Entry<K, C11134a1> entry) {
        this.f85358a = entry;
    }

    public final C11134a1 a() {
        return this.f85358a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f85358a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f85358a.getValue() == null) {
            return null;
        }
        return C11134a1.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC11208w1) {
            return this.f85358a.getValue().a((InterfaceC11208w1) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

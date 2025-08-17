package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10504q5 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Map.Entry f82354a;

    public final C10521s5 a() {
        return (C10521s5) this.f82354a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f82354a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C10521s5) this.f82354a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof K5) {
            return ((C10521s5) this.f82354a.getValue()).a((K5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
final class Wu0 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Map.Entry f71197a;

    public final Zu0 a() {
        return (Zu0) this.f71197a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f71197a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((Zu0) this.f71197a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC9120pv0) {
            return ((Zu0) this.f71197a.getValue()).c((InterfaceC9120pv0) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

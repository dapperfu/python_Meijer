package Dd;

import java.io.Serializable;

/* renamed from: Dd.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3130f0 extends J implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f6043a;

    /* renamed from: b, reason: collision with root package name */
    final Object f6044b;

    @Override // Dd.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f6043a;
    }

    @Override // Dd.J, java.util.Map.Entry
    public final Object getValue() {
        return this.f6044b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    C3130f0(Object obj, Object obj2) {
        this.f6043a = obj;
        this.f6044b = obj2;
    }
}

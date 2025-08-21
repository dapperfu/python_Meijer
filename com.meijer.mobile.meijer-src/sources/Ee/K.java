package Ee;

import java.io.Serializable;

/* loaded from: classes6.dex */
class K<K, V> extends AbstractC3216e<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final K f7197a;

    /* renamed from: b, reason: collision with root package name */
    final V f7198b;

    @Override // Ee.AbstractC3216e, java.util.Map.Entry
    public final K getKey() {
        return this.f7197a;
    }

    @Override // Ee.AbstractC3216e, java.util.Map.Entry
    public final V getValue() {
        return this.f7198b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }

    K(K k10, V v10) {
        this.f7197a = k10;
        this.f7198b = v10;
    }
}

package Ce;

import java.io.Serializable;

/* loaded from: classes6.dex */
class K<K, V> extends AbstractC3013e<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final K f3885a;

    /* renamed from: b, reason: collision with root package name */
    final V f3886b;

    @Override // Ce.AbstractC3013e, java.util.Map.Entry
    public final K getKey() {
        return this.f3885a;
    }

    @Override // Ce.AbstractC3013e, java.util.Map.Entry
    public final V getValue() {
        return this.f3886b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }

    K(K k10, V v10) {
        this.f3885a = k10;
        this.f3886b = v10;
    }
}

package Ee;

import java.util.Map;

/* renamed from: Ee.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3216e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (De.l.a(getKey(), entry.getKey()) && De.l.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }

    AbstractC3216e() {
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int iHashCode;
        K key = getKey();
        V value = getValue();
        int iHashCode2 = 0;
        if (key == null) {
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
        }
        if (value != null) {
            iHashCode2 = value.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }
}

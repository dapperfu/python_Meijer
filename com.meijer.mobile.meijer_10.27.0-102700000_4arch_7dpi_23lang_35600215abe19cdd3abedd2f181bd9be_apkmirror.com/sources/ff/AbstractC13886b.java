package ff;

import java.util.Map;

/* renamed from: ff.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC13886b<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    public String toString() {
        return getKey() + "=" + getValue();
    }

    AbstractC13886b() {
    }
}

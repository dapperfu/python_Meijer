package hf;

import java.util.Map;

/* renamed from: hf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC14516b<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    public String toString() {
        return getKey() + "=" + getValue();
    }

    AbstractC14516b() {
    }
}

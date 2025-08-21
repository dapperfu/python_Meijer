package ug;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ug.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC17407e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map f163940a = new HashMap();

    protected abstract V a(K k10);

    public V b(K k10) {
        synchronized (this.f163940a) {
            try {
                if (this.f163940a.containsKey(k10)) {
                    return (V) this.f163940a.get(k10);
                }
                V vA = a(k10);
                this.f163940a.put(k10, vA);
                return vA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

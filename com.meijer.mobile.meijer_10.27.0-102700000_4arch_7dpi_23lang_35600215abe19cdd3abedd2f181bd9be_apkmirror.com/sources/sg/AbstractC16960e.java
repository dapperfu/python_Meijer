package sg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: sg.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC16960e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map f160454a = new HashMap();

    protected abstract V a(K k10);

    public V b(K k10) {
        synchronized (this.f160454a) {
            try {
                if (this.f160454a.containsKey(k10)) {
                    return (V) this.f160454a.get(k10);
                }
                V vA = a(k10);
                this.f160454a.put(k10, vA);
                return vA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

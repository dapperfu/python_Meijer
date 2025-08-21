package p;

import java.util.HashMap;
import java.util.Map;
import p.C16327b;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16326a<K, V> extends C16327b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<K, C16327b.c<K, V>> f155935e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f155935e.containsKey(k10);
    }

    @Override // p.C16327b
    protected C16327b.c<K, V> e(K k10) {
        return this.f155935e.get(k10);
    }

    @Override // p.C16327b
    public V l(K k10, V v10) {
        C16327b.c<K, V> cVarE = e(k10);
        if (cVarE != null) {
            return cVarE.f155942b;
        }
        this.f155935e.put(k10, k(k10, v10));
        return null;
    }

    @Override // p.C16327b
    public V m(K k10) {
        V v10 = (V) super.m(k10);
        this.f155935e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> n(K k10) {
        if (contains(k10)) {
            return this.f155935e.get(k10).f155944d;
        }
        return null;
    }
}

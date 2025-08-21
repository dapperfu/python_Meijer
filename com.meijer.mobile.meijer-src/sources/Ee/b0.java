package Ee;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class b0 {

    private static class a<K, V> extends AbstractC3214c<K, V> {

        /* renamed from: g, reason: collision with root package name */
        transient De.w<? extends List<V>> f7344g;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ee.AbstractC3215d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public List<V> s() {
            return this.f7344g.get();
        }

        a(Map<K, Collection<V>> map, De.w<? extends List<V>> wVar) {
            super(map);
            this.f7344g = (De.w) De.p.q(wVar);
        }

        @Override // Ee.AbstractC3217f
        Map<K, Collection<V>> e() {
            return u();
        }

        @Override // Ee.AbstractC3217f
        Set<K> g() {
            return v();
        }
    }

    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        abstract Z<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(Z<?, ?> z10, Object obj) {
        if (obj == z10) {
            return true;
        }
        if (obj instanceof Z) {
            return z10.b().equals(((Z) obj).b());
        }
        return false;
    }

    public static <K, V> T<K, V> b(Map<K, Collection<V>> map, De.w<? extends List<V>> wVar) {
        return new a(map, wVar);
    }
}

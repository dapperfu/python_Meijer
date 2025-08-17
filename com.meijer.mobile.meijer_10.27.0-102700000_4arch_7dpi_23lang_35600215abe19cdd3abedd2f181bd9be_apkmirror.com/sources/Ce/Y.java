package Ce;

import Ce.s0;
import com.google.android.gms.common.api.a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class Y {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements Be.g<Map.Entry<?, ?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4011a = new a("KEY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f4012b = new C0070b("VALUE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f4013c = a();

        private b(String str, int i10) {
        }

        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Be.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: Ce.Y$b$b, reason: collision with other inner class name */
        enum C0070b extends b {
            C0070b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Be.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        /* synthetic */ b(String str, int i10, X x10) {
            this(str, i10);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f4011a, f4012b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4013c.clone();
        }
    }

    static class d<K, V> extends s0.e<K> {

        /* renamed from: a, reason: collision with root package name */
        final Map<K, V> f4014a;

        Map<K, V> a() {
            return this.f4014a;
        }

        d(Map<K, V> map) {
            this.f4014a = (Map) Be.p.q(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final Map<K, V> f4015a;

        final Map<K, V> a() {
            return this.f4015a;
        }

        e(Map<K, V> map) {
            this.f4015a = (Map) Be.p.q(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Y.l(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Be.l.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Be.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = s0.f();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Be.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = s0.f();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f4016a;

        /* renamed from: b, reason: collision with root package name */
        private transient Collection<V> f4017b;

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f4016a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f4016a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f4017b;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f4017b = collectionB;
            return collectionB;
        }

        f() {
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : a.e.API_PRIORITY_OTHER;
        }
        C3030w.b(i10, "expectedSize");
        return i10 + 1;
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class a<K, V> extends w0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.w0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    static abstract class c<K, V> extends s0.e<Map.Entry<K, V>> {
        abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // Ce.s0.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Be.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                return s0.j(this, collection.iterator());
            }
        }

        @Override // Ce.s0.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Be.p.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = s0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new K(k10, v10);
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> f(int i10) {
        return new LinkedHashMap<>(a(i10));
    }

    static <V> Be.g<Map.Entry<?, V>, V> k() {
        return b.f4012b;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return S.g(l(map.entrySet().iterator()), obj);
    }

    static boolean g(Map<?, ?> map, Object obj) {
        Be.p.q(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        Be.p.q(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        Be.p.q(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map<?, ?> map) {
        StringBuilder sbB = C3031x.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }
}

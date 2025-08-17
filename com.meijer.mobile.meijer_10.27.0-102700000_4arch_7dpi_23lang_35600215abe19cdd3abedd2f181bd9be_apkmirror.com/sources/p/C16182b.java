package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16182b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    c<K, V> f155263a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f155264b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f155265c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f155266d = 0;

    /* renamed from: p.b$a */
    static class a<K, V> extends e<K, V> {
        @Override // p.C16182b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f155270d;
        }

        @Override // p.C16182b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f155269c;
        }

        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: p.b$b, reason: collision with other inner class name */
    private static class C2408b<K, V> extends e<K, V> {
        @Override // p.C16182b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f155269c;
        }

        @Override // p.C16182b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f155270d;
        }

        C2408b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: p.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f155267a;

        /* renamed from: b, reason: collision with root package name */
        final V f155268b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f155269c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f155270d;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f155267a.equals(cVar.f155267a) && this.f155268b.equals(cVar.f155268b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f155267a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f155268b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f155267a.hashCode() ^ this.f155268b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f155267a + "=" + this.f155268b;
        }

        c(K k10, V v10) {
            this.f155267a = k10;
            this.f155268b = v10;
        }
    }

    /* renamed from: p.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private c<K, V> f155271a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f155272b = true;

        d() {
        }

        @Override // p.C16182b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f155271a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f155270d;
                this.f155271a = cVar3;
                this.f155272b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f155272b) {
                this.f155272b = false;
                this.f155271a = C16182b.this.f155263a;
            } else {
                c<K, V> cVar = this.f155271a;
                this.f155271a = cVar != null ? cVar.f155269c : null;
            }
            return this.f155271a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f155272b) {
                return C16182b.this.f155263a != null;
            }
            c<K, V> cVar = this.f155271a;
            return (cVar == null || cVar.f155269c == null) ? false : true;
        }
    }

    /* renamed from: p.b$e */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f155274a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f155275b;

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        private c<K, V> f() {
            c<K, V> cVar = this.f155275b;
            c<K, V> cVar2 = this.f155274a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // p.C16182b.f
        public void a(c<K, V> cVar) {
            if (this.f155274a == cVar && cVar == this.f155275b) {
                this.f155275b = null;
                this.f155274a = null;
            }
            c<K, V> cVar2 = this.f155274a;
            if (cVar2 == cVar) {
                this.f155274a = c(cVar2);
            }
            if (this.f155275b == cVar) {
                this.f155275b = f();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f155275b;
            this.f155275b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f155275b != null;
        }

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f155274a = cVar2;
            this.f155275b = cVar;
        }
    }

    /* renamed from: p.b$f */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16182b)) {
            return false;
        }
        C16182b c16182b = (C16182b) obj;
        if (size() != c16182b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c16182b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry<K, V> a() {
        return this.f155263a;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2408b c2408b = new C2408b(this.f155264b, this.f155263a);
        this.f155265c.put(c2408b, Boolean.FALSE);
        return c2408b;
    }

    protected c<K, V> e(K k10) {
        c<K, V> cVar = this.f155263a;
        while (cVar != null && !cVar.f155267a.equals(k10)) {
            cVar = cVar.f155269c;
        }
        return cVar;
    }

    public C16182b<K, V>.d f() {
        C16182b<K, V>.d dVar = new d();
        this.f155265c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f155264b;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f155263a, this.f155264b);
        this.f155265c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f155266d++;
        c<K, V> cVar2 = this.f155264b;
        if (cVar2 == null) {
            this.f155263a = cVar;
            this.f155264b = cVar;
            return cVar;
        }
        cVar2.f155269c = cVar;
        cVar.f155270d = cVar2;
        this.f155264b = cVar;
        return cVar;
    }

    public int size() {
        return this.f155266d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public V l(K k10, V v10) {
        c<K, V> cVarE = e(k10);
        if (cVarE != null) {
            return cVarE.f155268b;
        }
        k(k10, v10);
        return null;
    }

    public V m(K k10) {
        c<K, V> cVarE = e(k10);
        if (cVarE == null) {
            return null;
        }
        this.f155266d--;
        if (!this.f155265c.isEmpty()) {
            Iterator<f<K, V>> it = this.f155265c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f155270d;
        if (cVar != null) {
            cVar.f155269c = cVarE.f155269c;
        } else {
            this.f155263a = cVarE.f155269c;
        }
        c<K, V> cVar2 = cVarE.f155269c;
        if (cVar2 != null) {
            cVar2.f155270d = cVar;
        } else {
            this.f155264b = cVar;
        }
        cVarE.f155269c = null;
        cVarE.f155270d = null;
        return cVarE.f155268b;
    }
}

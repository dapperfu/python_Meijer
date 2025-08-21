package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16327b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    c<K, V> f155937a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f155938b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f155939c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f155940d = 0;

    /* renamed from: p.b$a */
    static class a<K, V> extends e<K, V> {
        @Override // p.C16327b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f155944d;
        }

        @Override // p.C16327b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f155943c;
        }

        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: p.b$b, reason: collision with other inner class name */
    private static class C2412b<K, V> extends e<K, V> {
        @Override // p.C16327b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f155943c;
        }

        @Override // p.C16327b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f155944d;
        }

        C2412b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: p.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f155941a;

        /* renamed from: b, reason: collision with root package name */
        final V f155942b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f155943c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f155944d;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f155941a.equals(cVar.f155941a) && this.f155942b.equals(cVar.f155942b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f155941a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f155942b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f155941a.hashCode() ^ this.f155942b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f155941a + "=" + this.f155942b;
        }

        c(K k10, V v10) {
            this.f155941a = k10;
            this.f155942b = v10;
        }
    }

    /* renamed from: p.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private c<K, V> f155945a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f155946b = true;

        d() {
        }

        @Override // p.C16327b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f155945a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f155944d;
                this.f155945a = cVar3;
                this.f155946b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f155946b) {
                this.f155946b = false;
                this.f155945a = C16327b.this.f155937a;
            } else {
                c<K, V> cVar = this.f155945a;
                this.f155945a = cVar != null ? cVar.f155943c : null;
            }
            return this.f155945a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f155946b) {
                return C16327b.this.f155937a != null;
            }
            c<K, V> cVar = this.f155945a;
            return (cVar == null || cVar.f155943c == null) ? false : true;
        }
    }

    /* renamed from: p.b$e */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f155948a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f155949b;

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        private c<K, V> f() {
            c<K, V> cVar = this.f155949b;
            c<K, V> cVar2 = this.f155948a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // p.C16327b.f
        public void a(c<K, V> cVar) {
            if (this.f155948a == cVar && cVar == this.f155949b) {
                this.f155949b = null;
                this.f155948a = null;
            }
            c<K, V> cVar2 = this.f155948a;
            if (cVar2 == cVar) {
                this.f155948a = c(cVar2);
            }
            if (this.f155949b == cVar) {
                this.f155949b = f();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f155949b;
            this.f155949b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f155949b != null;
        }

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f155948a = cVar2;
            this.f155949b = cVar;
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
        if (!(obj instanceof C16327b)) {
            return false;
        }
        C16327b c16327b = (C16327b) obj;
        if (size() != c16327b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c16327b.iterator();
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
        return this.f155937a;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2412b c2412b = new C2412b(this.f155938b, this.f155937a);
        this.f155939c.put(c2412b, Boolean.FALSE);
        return c2412b;
    }

    protected c<K, V> e(K k10) {
        c<K, V> cVar = this.f155937a;
        while (cVar != null && !cVar.f155941a.equals(k10)) {
            cVar = cVar.f155943c;
        }
        return cVar;
    }

    public C16327b<K, V>.d f() {
        C16327b<K, V>.d dVar = new d();
        this.f155939c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f155938b;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f155937a, this.f155938b);
        this.f155939c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f155940d++;
        c<K, V> cVar2 = this.f155938b;
        if (cVar2 == null) {
            this.f155937a = cVar;
            this.f155938b = cVar;
            return cVar;
        }
        cVar2.f155943c = cVar;
        cVar.f155944d = cVar2;
        this.f155938b = cVar;
        return cVar;
    }

    public int size() {
        return this.f155940d;
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
            return cVarE.f155942b;
        }
        k(k10, v10);
        return null;
    }

    public V m(K k10) {
        c<K, V> cVarE = e(k10);
        if (cVarE == null) {
            return null;
        }
        this.f155940d--;
        if (!this.f155939c.isEmpty()) {
            Iterator<f<K, V>> it = this.f155939c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f155944d;
        if (cVar != null) {
            cVar.f155943c = cVarE.f155943c;
        } else {
            this.f155937a = cVarE.f155943c;
        }
        c<K, V> cVar2 = cVarE.f155943c;
        if (cVar2 != null) {
            cVar2.f155944d = cVar;
        } else {
            this.f155938b = cVar;
        }
        cVarE.f155943c = null;
        cVarE.f155944d = null;
        return cVarE.f155942b;
    }
}

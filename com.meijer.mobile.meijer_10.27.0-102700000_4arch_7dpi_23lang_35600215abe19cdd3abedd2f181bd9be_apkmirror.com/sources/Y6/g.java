package Y6;

import Y6.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class g<K extends l, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f40138a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f40139b = new HashMap();

    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f40140a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f40141b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f40142c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f40143d;

        a() {
            this(null);
        }

        a(K k10) {
            this.f40143d = this;
            this.f40142c = this;
            this.f40140a = k10;
        }

        public void a(V v10) {
            if (this.f40141b == null) {
                this.f40141b = new ArrayList();
            }
            this.f40141b.add(v10);
        }

        public int c() {
            List<V> list = this.f40141b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f40141b.remove(iC - 1);
            }
            return null;
        }
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f40143d;
        aVar2.f40142c = aVar.f40142c;
        aVar.f40142c.f40143d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f40142c.f40143d = aVar;
        aVar.f40143d.f40142c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f40139b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f40139b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f40139b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f40139b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f40138a.f40143d; !aVar.equals(this.f40138a); aVar = aVar.f40143d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f40139b.remove(aVar.f40140a);
            ((l) aVar.f40140a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f40138a.f40142c;
        boolean z10 = false;
        while (!aVar.equals(this.f40138a)) {
            sb2.append('{');
            sb2.append(aVar.f40140a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f40142c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }

    g() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f40138a;
        aVar.f40143d = aVar2;
        aVar.f40142c = aVar2.f40142c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f40138a;
        aVar.f40143d = aVar2.f40143d;
        aVar.f40142c = aVar2;
        g(aVar);
    }
}

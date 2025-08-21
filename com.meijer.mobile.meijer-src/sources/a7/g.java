package a7;

import a7.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class g<K extends l, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f45270a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f45271b = new HashMap();

    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f45272a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f45273b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f45274c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f45275d;

        a() {
            this(null);
        }

        a(K k10) {
            this.f45275d = this;
            this.f45274c = this;
            this.f45272a = k10;
        }

        public void a(V v10) {
            if (this.f45273b == null) {
                this.f45273b = new ArrayList();
            }
            this.f45273b.add(v10);
        }

        public int c() {
            List<V> list = this.f45273b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f45273b.remove(iC - 1);
            }
            return null;
        }
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f45275d;
        aVar2.f45274c = aVar.f45274c;
        aVar.f45274c.f45275d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f45274c.f45275d = aVar;
        aVar.f45275d.f45274c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f45271b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f45271b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f45271b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f45271b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f45270a.f45275d; !aVar.equals(this.f45270a); aVar = aVar.f45275d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f45271b.remove(aVar.f45272a);
            ((l) aVar.f45272a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f45270a.f45274c;
        boolean z10 = false;
        while (!aVar.equals(this.f45270a)) {
            sb2.append('{');
            sb2.append(aVar.f45272a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f45274c;
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
        a<K, V> aVar2 = this.f45270a;
        aVar.f45275d = aVar2;
        aVar.f45274c = aVar2.f45274c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f45270a;
        aVar.f45275d = aVar2.f45275d;
        aVar.f45274c = aVar2;
        g(aVar);
    }
}

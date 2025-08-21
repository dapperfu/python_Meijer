package df;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C13676c<?> f128425a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f128426b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f128427c = new HashSet();

        void a(b bVar) {
            this.f128426b.add(bVar);
        }

        void b(b bVar) {
            this.f128427c.add(bVar);
        }

        C13676c<?> c() {
            return this.f128425a;
        }

        Set<b> d() {
            return this.f128426b;
        }

        boolean e() {
            return this.f128426b.isEmpty();
        }

        boolean f() {
            return this.f128427c.isEmpty();
        }

        void g(b bVar) {
            this.f128427c.remove(bVar);
        }

        b(C13676c<?> c13676c) {
            this.f128425a = c13676c;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final C13672A<?> f128428a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f128429b;

        private c(C13672A<?> c13672a, boolean z10) {
            this.f128428a = c13672a;
            this.f128429b = z10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f128428a.equals(this.f128428a) && cVar.f128429b == this.f128429b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f128428a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f128429b).hashCode();
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<C13676c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<C13676c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C13676c<?> next = it.next();
            b bVar3 = new b(next);
            for (C13672A<? super Object> c13672a : next.j()) {
                c cVar = new c(c13672a, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f128429b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c13672a));
                }
                set2.add(bVar3);
            }
        }
    }

    static void a(List<C13676c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }
}

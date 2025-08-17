package bf;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C6245c<?> f60190a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f60191b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f60192c = new HashSet();

        void a(b bVar) {
            this.f60191b.add(bVar);
        }

        void b(b bVar) {
            this.f60192c.add(bVar);
        }

        C6245c<?> c() {
            return this.f60190a;
        }

        Set<b> d() {
            return this.f60191b;
        }

        boolean e() {
            return this.f60191b.isEmpty();
        }

        boolean f() {
            return this.f60192c.isEmpty();
        }

        void g(b bVar) {
            this.f60192c.remove(bVar);
        }

        b(C6245c<?> c6245c) {
            this.f60190a = c6245c;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final C6241A<?> f60193a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f60194b;

        private c(C6241A<?> c6241a, boolean z10) {
            this.f60193a = c6241a;
            this.f60194b = z10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f60193a.equals(this.f60193a) && cVar.f60194b == this.f60194b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f60193a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f60194b).hashCode();
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

    private static Set<b> c(List<C6245c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<C6245c<?>> it = list.iterator();
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
            C6245c<?> next = it.next();
            b bVar3 = new b(next);
            for (C6241A<? super Object> c6241a : next.j()) {
                c cVar = new c(c6241a, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f60194b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c6241a));
                }
                set2.add(bVar3);
            }
        }
    }

    static void a(List<C6245c<?>> list) {
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

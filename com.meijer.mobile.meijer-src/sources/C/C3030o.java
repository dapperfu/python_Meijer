package C;

import F.InterfaceC3290z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: C.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3030o {

    /* renamed from: c, reason: collision with root package name */
    public static final C3030o f3866c = new a().b(0).a();

    /* renamed from: d, reason: collision with root package name */
    public static final C3030o f3867d = new a().b(1).a();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<InterfaceC3028m> f3868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3869b;

    /* renamed from: C.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedHashSet<InterfaceC3028m> f3870a = new LinkedHashSet<>();

        /* renamed from: b, reason: collision with root package name */
        private String f3871b;

        public a b(int i10) {
            o2.i.j(i10 != -1, "The specified lens facing is invalid.");
            this.f3870a.add(new F.U(i10));
            return this;
        }

        public C3030o a() {
            return new C3030o(this.f3870a, this.f3871b);
        }
    }

    public LinkedHashSet<InterfaceC3290z> a(LinkedHashSet<InterfaceC3290z> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC3290z> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List<InterfaceC3029n> listB = b(arrayList);
        LinkedHashSet<InterfaceC3290z> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC3290z> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC3290z next = it2.next();
            if (listB.contains(next.a())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<InterfaceC3029n> b(List<InterfaceC3029n> list) {
        List<InterfaceC3029n> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC3028m> it = this.f3868a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<InterfaceC3028m> c() {
        return this.f3868a;
    }

    public Integer d() {
        Iterator<InterfaceC3028m> it = this.f3868a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC3028m next = it.next();
            if (next instanceof F.U) {
                Integer numValueOf = Integer.valueOf(((F.U) next).b());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    C3030o(LinkedHashSet<InterfaceC3028m> linkedHashSet, String str) {
        this.f3868a = linkedHashSet;
        this.f3869b = str;
    }

    public InterfaceC3290z e(LinkedHashSet<InterfaceC3290z> linkedHashSet) {
        Iterator<InterfaceC3290z> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}

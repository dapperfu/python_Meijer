package C;

import F.InterfaceC3628z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: C.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2972o {

    /* renamed from: c, reason: collision with root package name */
    public static final C2972o f3408c = new a().b(0).a();

    /* renamed from: d, reason: collision with root package name */
    public static final C2972o f3409d = new a().b(1).a();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<InterfaceC2970m> f3410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3411b;

    /* renamed from: C.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedHashSet<InterfaceC2970m> f3412a = new LinkedHashSet<>();

        /* renamed from: b, reason: collision with root package name */
        private String f3413b;

        public a b(int i10) {
            o2.i.j(i10 != -1, "The specified lens facing is invalid.");
            this.f3412a.add(new F.U(i10));
            return this;
        }

        public C2972o a() {
            return new C2972o(this.f3412a, this.f3413b);
        }
    }

    public LinkedHashSet<InterfaceC3628z> a(LinkedHashSet<InterfaceC3628z> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC3628z> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List<InterfaceC2971n> listB = b(arrayList);
        LinkedHashSet<InterfaceC3628z> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC3628z> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC3628z next = it2.next();
            if (listB.contains(next.a())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<InterfaceC2971n> b(List<InterfaceC2971n> list) {
        List<InterfaceC2971n> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC2970m> it = this.f3410a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<InterfaceC2970m> c() {
        return this.f3410a;
    }

    public Integer d() {
        Iterator<InterfaceC2970m> it = this.f3410a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC2970m next = it.next();
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

    C2972o(LinkedHashSet<InterfaceC2970m> linkedHashSet, String str) {
        this.f3410a = linkedHashSet;
        this.f3411b = str;
    }

    public InterfaceC3628z e(LinkedHashSet<InterfaceC3628z> linkedHashSet) {
        Iterator<InterfaceC3628z> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}

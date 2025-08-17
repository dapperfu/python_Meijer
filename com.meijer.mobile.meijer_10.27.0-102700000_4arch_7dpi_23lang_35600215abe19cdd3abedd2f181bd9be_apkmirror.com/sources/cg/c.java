package cg;

import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes7.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f61777a;

    /* renamed from: b, reason: collision with root package name */
    private final d f61778b;

    public static /* synthetic */ i b(InterfaceC6246d interfaceC6246d) {
        return new c(interfaceC6246d.d(f.class), d.a());
    }

    public static C6245c<i> c() {
        return C6245c.e(i.class).b(q.o(f.class)).f(new bf.g() { // from class: cg.b
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return c.b(interfaceC6246d);
            }
        }).d();
    }

    private static String d(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // cg.i
    public String a() {
        if (this.f61778b.b().isEmpty()) {
            return this.f61777a;
        }
        return this.f61777a + ' ' + d(this.f61778b.b());
    }

    c(Set<f> set, d dVar) {
        this.f61777a = d(set);
        this.f61778b = dVar;
    }
}

package eg;

import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f130159a;

    /* renamed from: b, reason: collision with root package name */
    private final d f130160b;

    public static /* synthetic */ i b(InterfaceC13677d interfaceC13677d) {
        return new c(interfaceC13677d.b(f.class), d.a());
    }

    public static C13676c<i> c() {
        return C13676c.e(i.class).b(q.o(f.class)).f(new df.g() { // from class: eg.b
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return c.b(interfaceC13677d);
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

    @Override // eg.i
    public String a() {
        if (this.f130160b.b().isEmpty()) {
            return this.f130159a;
        }
        return this.f130159a + ' ' + d(this.f130160b.b());
    }

    c(Set<f> set, d dVar) {
        this.f130159a = d(set);
        this.f130160b = dVar;
    }
}

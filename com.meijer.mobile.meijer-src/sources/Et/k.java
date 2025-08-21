package Et;

import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;
import java.util.List;
import ut.C17467a;
import xt.InterfaceC18221a;
import yt.C18373a;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f8562d = C13785b.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18221a f8563a;

    /* renamed from: b, reason: collision with root package name */
    final bb.e f8564b;

    /* renamed from: c, reason: collision with root package name */
    final yt.c f8565c;

    private float a(C17467a c17467a, C17467a c17467a2) {
        return Math.max(0.0f, (this.f8563a.a(c17467a, c17467a2) - c17467a.f164532d) - c17467a2.f164532d);
    }

    private static float c(C17467a c17467a, C17467a c17467a2) {
        return (c17467a2.f164533e - c17467a.f164533e) / 1000.0f;
    }

    final boolean b(List<C17467a> list, C17467a c17467a) {
        double dB = C18373a.b(80.0d);
        Iterator<C17467a> it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            if (c(it.next(), c17467a) >= 15.0f) {
                if (a(r6, c17467a) / r8 > dB) {
                    i10++;
                }
                i11++;
            }
        }
        float size = (i10 * 1.0f) / list.size();
        if (i11 < 3 || size < 0.4f) {
            return true;
        }
        String.format("Speed to fix appears too fast - ratio:  %g  reasonable: %g  fix: %s", Float.valueOf(size), Double.valueOf(dB), c17467a);
        for (C17467a c17467a2 : list) {
            float fC = c(c17467a2, c17467a);
            String.format("  %sSpeed needed: %g   Distance: %g   Time: %g   Historical fix: %s", fC >= 15.0f ? "" : "IGNORED - ", Float.valueOf(a(c17467a2, c17467a) / c(c17467a2, c17467a)), Float.valueOf(a(c17467a2, c17467a)), Float.valueOf(fC), c17467a2.toString());
        }
        return false;
    }

    public k(InterfaceC18221a interfaceC18221a, bb.e eVar, yt.c cVar) {
        this.f8563a = interfaceC18221a;
        this.f8564b = eVar;
        this.f8565c = cVar;
    }
}

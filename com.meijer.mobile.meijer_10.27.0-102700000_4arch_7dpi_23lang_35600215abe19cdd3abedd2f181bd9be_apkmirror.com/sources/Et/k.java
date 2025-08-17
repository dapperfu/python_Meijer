package Et;

import cb.C6380a;
import cb.C6381b;
import java.util.Iterator;
import java.util.List;
import ut.C17315a;
import xt.InterfaceC18093a;
import yt.C18302a;

/* loaded from: classes11.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f9850d = C6381b.a(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18093a f9851a;

    /* renamed from: b, reason: collision with root package name */
    final Za.e f9852b;

    /* renamed from: c, reason: collision with root package name */
    final yt.c f9853c;

    private float a(C17315a c17315a, C17315a c17315a2) {
        return Math.max(0.0f, (this.f9851a.a(c17315a, c17315a2) - c17315a.f163454d) - c17315a2.f163454d);
    }

    private static float c(C17315a c17315a, C17315a c17315a2) {
        return (c17315a2.f163455e - c17315a.f163455e) / 1000.0f;
    }

    final boolean b(List<C17315a> list, C17315a c17315a) {
        double dB = C18302a.b(80.0d);
        Iterator<C17315a> it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            if (c(it.next(), c17315a) >= 15.0f) {
                if (a(r6, c17315a) / r8 > dB) {
                    i10++;
                }
                i11++;
            }
        }
        float size = (i10 * 1.0f) / list.size();
        if (i11 < 3 || size < 0.4f) {
            return true;
        }
        String.format("Speed to fix appears too fast - ratio:  %g  reasonable: %g  fix: %s", Float.valueOf(size), Double.valueOf(dB), c17315a);
        for (C17315a c17315a2 : list) {
            float fC = c(c17315a2, c17315a);
            String.format("  %sSpeed needed: %g   Distance: %g   Time: %g   Historical fix: %s", fC >= 15.0f ? "" : "IGNORED - ", Float.valueOf(a(c17315a2, c17315a) / c(c17315a2, c17315a)), Float.valueOf(a(c17315a2, c17315a)), Float.valueOf(fC), c17315a2.toString());
        }
        return false;
    }

    public k(InterfaceC18093a interfaceC18093a, Za.e eVar, yt.c cVar) {
        this.f9851a = interfaceC18093a;
        this.f9852b = eVar;
        this.f9853c = cVar;
    }
}

package zt;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ut.C17324j;
import ut.InterfaceC17325k;

/* loaded from: classes11.dex */
public class g {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f173275f = C6381b.a(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final C18572b f173276a;

    /* renamed from: b, reason: collision with root package name */
    private At.a f173277b;

    /* renamed from: c, reason: collision with root package name */
    At.a f173278c;

    /* renamed from: d, reason: collision with root package name */
    final ArrayList<InterfaceC17325k> f173279d;

    /* renamed from: e, reason: collision with root package name */
    private final C18574d f173280e;

    final void a() {
        for (int size = this.f173279d.size() - 1; size >= 0; size--) {
            this.f173279d.get(size).f(this.f173277b);
        }
    }

    public final void b(List<C17324j> list) {
        C18574d c18574d = this.f173280e;
        c18574d.f173269d = c18574d.f173266a.a();
        c18574d.f173267b++;
        this.f173279d.size();
        Iterator<InterfaceC17325k> it = this.f173279d.iterator();
        boolean zB = true;
        while (it.hasNext()) {
            InterfaceC17325k next = it.next();
            if (zB) {
                next.getClass();
                zB = next.b(this.f173277b, list);
            } else {
                next.getClass();
            }
        }
        a();
        C18574d c18574d2 = this.f173280e;
        long jA = c18574d2.f173266a.a() - c18574d2.f173269d;
        c18574d2.f173268c += jA;
        C6382c c6382c = C18574d.f173265e;
        c6382c.e("Current cycle time: {} sec", Double.valueOf(jA / 1000.0d));
        c6382c.e("Total cycle count: {}", Long.valueOf(c18574d2.f173267b));
        c6382c.e("Average cycle time: {} sec", Double.valueOf((c18574d2.f173268c / c18574d2.f173267b) / 1000.0d));
    }

    public String toString() {
        return "Chain:" + System.getProperty("line.separator");
    }

    public g(List<InterfaceC17325k> list, C18572b c18572b, C18574d c18574d, At.a aVar, At.a aVar2) {
        this.f173276a = c18572b;
        this.f173280e = c18574d;
        this.f173277b = aVar;
        this.f173278c = aVar2;
        this.f173279d = new ArrayList<>(list);
    }
}

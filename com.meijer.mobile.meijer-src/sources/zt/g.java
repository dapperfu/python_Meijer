package zt;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ut.C17476j;
import ut.InterfaceC17477k;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f173236f = C13785b.a(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final C18548b f173237a;

    /* renamed from: b, reason: collision with root package name */
    private At.a f173238b;

    /* renamed from: c, reason: collision with root package name */
    At.a f173239c;

    /* renamed from: d, reason: collision with root package name */
    final ArrayList<InterfaceC17477k> f173240d;

    /* renamed from: e, reason: collision with root package name */
    private final C18550d f173241e;

    final void a() {
        for (int size = this.f173240d.size() - 1; size >= 0; size--) {
            this.f173240d.get(size).f(this.f173238b);
        }
    }

    public final void b(List<C17476j> list) {
        C18550d c18550d = this.f173241e;
        c18550d.f173230d = c18550d.f173227a.a();
        c18550d.f173228b++;
        this.f173240d.size();
        Iterator<InterfaceC17477k> it = this.f173240d.iterator();
        boolean zB = true;
        while (it.hasNext()) {
            InterfaceC17477k next = it.next();
            if (zB) {
                next.getClass();
                zB = next.b(this.f173238b, list);
            } else {
                next.getClass();
            }
        }
        a();
        C18550d c18550d2 = this.f173241e;
        long jA = c18550d2.f173227a.a() - c18550d2.f173230d;
        c18550d2.f173229c += jA;
        C13786c c13786c = C18550d.f173226e;
        c13786c.e("Current cycle time: {} sec", Double.valueOf(jA / 1000.0d));
        c13786c.e("Total cycle count: {}", Long.valueOf(c18550d2.f173228b));
        c13786c.e("Average cycle time: {} sec", Double.valueOf((c18550d2.f173229c / c18550d2.f173228b) / 1000.0d));
    }

    public String toString() {
        return "Chain:" + System.getProperty("line.separator");
    }

    public g(List<InterfaceC17477k> list, C18548b c18548b, C18550d c18550d, At.a aVar, At.a aVar2) {
        this.f173237a = c18548b;
        this.f173241e = c18550d;
        this.f173238b = aVar;
        this.f173239c = aVar2;
        this.f173240d = new ArrayList<>(list);
    }
}

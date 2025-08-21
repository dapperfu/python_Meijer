package zt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import ut.C17467a;
import ut.C17473g;
import ut.C17476j;
import ut.InterfaceC17472f;

/* loaded from: classes13.dex */
public final class i implements InterfaceC17472f {

    /* renamed from: a, reason: collision with root package name */
    private final g f173244a;

    /* renamed from: b, reason: collision with root package name */
    private h f173245b;

    /* renamed from: c, reason: collision with root package name */
    private C17473g f173246c;

    @Override // ut.InterfaceC17472f
    public final void a() {
        ArrayList arrayList = new ArrayList();
        this.f173244a.b(arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f173245b.a((C17476j) it.next());
            }
        }
        this.f173246c.d();
    }

    @Override // ut.InterfaceC17472f
    public final void b() {
        g gVar = this.f173244a;
        for (int size = gVar.f173240d.size() - 1; size >= 0; size--) {
            gVar.f173240d.get(size).c(gVar.f173239c);
        }
    }

    @Override // ut.InterfaceC17472f
    public final C17473g c() {
        return this.f173246c;
    }

    @Override // ut.InterfaceC17472f
    public final void h(C17473g c17473g) {
        this.f173246c = c17473g;
    }

    public i(g gVar) {
        this.f173244a = gVar;
    }

    @Override // ut.InterfaceC17472f
    public final void b(h hVar) {
        this.f173245b = hVar;
    }

    @Override // ut.InterfaceC17472f
    public final void a(C17467a c17467a) {
        ArrayList arrayList = new ArrayList();
        g gVar = this.f173244a;
        C18548b c18548b = gVar.f173237a;
        C17467a c17467aA = c18548b.f173214b.a(c17467a);
        if (c17467aA != null) {
            if (c18548b.f173220h && c18548b.f173221i.e()) {
                C18548b.f173212l.d("Using passive fix: " + c17467a, new Object[0]);
            } else {
                Objects.toString(c17467a);
            }
            arrayList.addAll(c18548b.d(c17467aA));
        }
        gVar.a();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f173245b.a((C17476j) it.next());
            }
        }
        this.f173246c.d();
    }
}

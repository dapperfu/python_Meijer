package zt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import ut.C17315a;
import ut.C17321g;
import ut.C17324j;
import ut.InterfaceC17320f;

/* loaded from: classes12.dex */
public final class i implements InterfaceC17320f {

    /* renamed from: a, reason: collision with root package name */
    private final g f173283a;

    /* renamed from: b, reason: collision with root package name */
    private h f173284b;

    /* renamed from: c, reason: collision with root package name */
    private C17321g f173285c;

    @Override // ut.InterfaceC17320f
    public final void a() {
        ArrayList arrayList = new ArrayList();
        this.f173283a.b(arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f173284b.a((C17324j) it.next());
            }
        }
        this.f173285c.d();
    }

    @Override // ut.InterfaceC17320f
    public final void b() {
        g gVar = this.f173283a;
        for (int size = gVar.f173279d.size() - 1; size >= 0; size--) {
            gVar.f173279d.get(size).c(gVar.f173278c);
        }
    }

    @Override // ut.InterfaceC17320f
    public final C17321g c() {
        return this.f173285c;
    }

    @Override // ut.InterfaceC17320f
    public final void h(C17321g c17321g) {
        this.f173285c = c17321g;
    }

    public i(g gVar) {
        this.f173283a = gVar;
    }

    @Override // ut.InterfaceC17320f
    public final void b(h hVar) {
        this.f173284b = hVar;
    }

    @Override // ut.InterfaceC17320f
    public final void a(C17315a c17315a) {
        ArrayList arrayList = new ArrayList();
        g gVar = this.f173283a;
        C18572b c18572b = gVar.f173276a;
        C17315a c17315aA = c18572b.f173253b.a(c17315a);
        if (c17315aA != null) {
            if (c18572b.f173259h && c18572b.f173260i.e()) {
                C18572b.f173251l.d("Using passive fix: " + c17315a, new Object[0]);
            } else {
                Objects.toString(c17315a);
            }
            arrayList.addAll(c18572b.d(c17315aA));
        }
        gVar.a();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f173284b.a((C17324j) it.next());
            }
        }
        this.f173285c.d();
    }
}

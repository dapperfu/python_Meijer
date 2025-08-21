package qt;

import Db.g;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kt.C15422h;
import kt.C15423i;
import qt.C16765b;
import ut.C17478l;

/* loaded from: classes12.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f158996c = C13785b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f158997a;

    /* renamed from: b, reason: collision with root package name */
    private final a f158998b = new a();

    protected class a extends g<InterfaceC16764a> {
        protected a() {
        }
    }

    @Override // qt.d
    public final List<C15423i> a() {
        ArrayList arrayList = new ArrayList(this.f158997a.f149575a.b());
        Collections.sort(arrayList, new rt.b());
        return arrayList;
    }

    @Override // qt.d
    public final void b(C17478l c17478l) {
        C15422h c15422h = c17478l.f164594b;
        Long id2 = c15422h.getId();
        C15423i c15423i = new C15423i();
        c15423i.i(c17478l.f164593a);
        c15423i.d(id2);
        c15423i.e(c17478l.f164596d);
        c15423i.f(c17478l.f164595c.name());
        C16765b c16765b = new C16765b();
        c16765b.f158987b = c15423i.g();
        c16765b.f158988c = c15423i.a();
        c16765b.f158990e = c15423i.b();
        if ("AT".equals(c15423i.c())) {
            c16765b.f158986a = C16765b.a.f158993a;
        } else if ("LEFT".equals(c15423i.c())) {
            c16765b.f158986a = C16765b.a.f158994b;
        }
        c16765b.f158989d = c15422h.c();
        c16765b.f158991f = c17478l.f164597e;
        c16765b.f158992g = c17478l.f164598f;
        c15422h.c2();
        c15422h.a2();
        throw null;
    }

    public e(c cVar) {
        this.f158997a = cVar;
    }

    @Override // qt.d
    public final void a(InterfaceC16764a interfaceC16764a) {
        this.f158998b.a(interfaceC16764a);
    }
}

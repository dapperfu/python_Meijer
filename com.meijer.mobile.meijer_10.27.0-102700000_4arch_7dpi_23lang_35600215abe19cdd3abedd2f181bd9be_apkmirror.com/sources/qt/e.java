package qt;

import Bb.g;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kt.C15319h;
import kt.C15320i;
import qt.C16606b;
import ut.C17326l;

/* loaded from: classes11.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f157559c = C6381b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f157560a;

    /* renamed from: b, reason: collision with root package name */
    private final a f157561b = new a();

    protected class a extends g<InterfaceC16605a> {
        protected a() {
        }
    }

    @Override // qt.d
    public final List<C15320i> a() {
        ArrayList arrayList = new ArrayList(this.f157560a.f139561a.b());
        Collections.sort(arrayList, new rt.b());
        return arrayList;
    }

    @Override // qt.d
    public final void b(C17326l c17326l) {
        C15319h c15319h = c17326l.f163516b;
        Long id2 = c15319h.getId();
        C15320i c15320i = new C15320i();
        c15320i.i(c17326l.f163515a);
        c15320i.d(id2);
        c15320i.e(c17326l.f163518d);
        c15320i.f(c17326l.f163517c.name());
        C16606b c16606b = new C16606b();
        c16606b.f157550b = c15320i.g();
        c16606b.f157551c = c15320i.a();
        c16606b.f157553e = c15320i.b();
        if ("AT".equals(c15320i.c())) {
            c16606b.f157549a = C16606b.a.f157556a;
        } else if ("LEFT".equals(c15320i.c())) {
            c16606b.f157549a = C16606b.a.f157557b;
        }
        c16606b.f157552d = c15319h.c();
        c16606b.f157554f = c17326l.f163519e;
        c16606b.f157555g = c17326l.f163520f;
        c15319h.d2();
        c15319h.a2();
        throw null;
    }

    public e(c cVar) {
        this.f157560a = cVar;
    }

    @Override // qt.d
    public final void a(InterfaceC16605a interfaceC16605a) {
        this.f157561b.a(interfaceC16605a);
    }
}

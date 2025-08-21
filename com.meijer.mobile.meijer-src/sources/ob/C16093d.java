package ob;

import Cb.a;
import android.app.ActivityManager;
import android.content.Intent;
import eb.C13784a;
import eb.C13785b;
import hb.C14495b;
import hb.C14499f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import jb.C14972a;
import kt.C15423i;
import kt.r;
import lt.C15611d;
import lt.EnumC15608a;
import lt.EnumC15610c;
import mt.C15767b;
import nb.C15926a;
import nt.InterfaceC16021c;
import ob.C16096g.a;

/* renamed from: ob.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16093d implements Cb.d {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f153791i = C13785b.a(C16093d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final b f153792a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final C16096g f153793b;

    /* renamed from: c, reason: collision with root package name */
    private Cb.b f153794c;

    /* renamed from: d, reason: collision with root package name */
    private Fb.d f153795d;

    /* renamed from: e, reason: collision with root package name */
    private C14972a f153796e;

    /* renamed from: f, reason: collision with root package name */
    private final Db.e f153797f;

    /* renamed from: g, reason: collision with root package name */
    private final Db.b f153798g;

    /* renamed from: h, reason: collision with root package name */
    private Nb.e f153799h;

    /* renamed from: ob.d$a */
    final class a implements InterfaceC16021c<List<C15926a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cb.a f153800a;

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(List<C15926a> list) {
            List<C15926a> list2 = list;
            try {
                C13784a unused = C16093d.f153791i;
                b bVar = C16093d.this.f153792a;
                Cb.a aVar = this.f153800a;
                C16098i c16098iH = C16093d.h(list2, aVar);
                C14972a c14972a = C16093d.this.f153796e;
                for (C15926a c15926a : list2) {
                    C15611d c15611d = new C15611d();
                    c15611d.m(lt.e.CONTENT_DELIVERED.name());
                    c15611d.g(String.valueOf(aVar.k()));
                    c15611d.h(String.valueOf(aVar.h()));
                    HashMap map = new HashMap();
                    map.put(EnumC15608a.CONTENT_ID.name(), c15926a.h());
                    map.put(EnumC15608a.TRIGGER_ID.name(), aVar.g().l());
                    map.put(EnumC15608a.TRIGGER_TYPE.name(), r.PLACE.name());
                    map.put(EnumC15608a.PLACE_EVENT_TYPE.name(), aVar.d());
                    map.put(EnumC15610c.VISIT_ID.name(), aVar.g().m());
                    c15611d.f(map);
                    c14972a.f140238a.c(c15611d);
                }
                C16102m c16102m = new C16102m(C16093d.this.f153793b.f153811d, list2, aVar);
                Iterator<InterfaceC16099j> it = bVar.iterator();
                while (it.hasNext()) {
                    InterfaceC16099j next = it.next();
                    try {
                        if (aVar.c().equals(a.b.ARRIVE_EVENT)) {
                            next.e(c16098iH, c16102m.a());
                        } else if (aVar.c().equals(a.b.DEPART_EVENT)) {
                            next.b(c16098iH, c16102m.a());
                        }
                    } catch (Exception unused2) {
                        C13784a unused3 = C16093d.f153791i;
                    }
                }
                c16102m.b();
            } catch (InterruptedException unused4) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused5) {
                C13784a unused6 = C16093d.f153791i;
                this.f153800a.i();
            }
        }

        a(Cb.a aVar) {
            this.f153800a = aVar;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = C16093d.f153791i;
        }
    }

    /* renamed from: ob.d$b */
    protected class b extends Db.g<InterfaceC16099j> {
        protected b() {
        }

        protected final List<C16094e> p(List<C15926a> list, Cb.a aVar, int i10) throws InterruptedException, TimeoutException {
            ArrayList arrayList = new ArrayList();
            C16098i c16098iH = aVar != null ? C16093d.h(list, aVar) : null;
            for (C15926a c15926a : list) {
                C14972a c14972a = C16093d.this.f153796e;
                c14972a.f140238a.c(c14972a.c(c15926a, lt.e.CONTENT_NOTIFIED.name()));
                C16101l c16101l = new C16101l(c15926a);
                Iterator<InterfaceC16099j> it = iterator();
                while (it.hasNext()) {
                    InterfaceC16099j next = it.next();
                    if (c16098iH != null) {
                        try {
                            C13784a unused = C16093d.f153791i;
                            next.a(c15926a, c16098iH, i10, c16101l.a());
                        } catch (Exception unused2) {
                            C13784a unused3 = C16093d.f153791i;
                        }
                    } else {
                        C13784a unused4 = C16093d.f153791i;
                        next.d(c15926a, i10, c16101l.a());
                    }
                }
                arrayList.add(c16101l.b());
            }
            return arrayList;
        }

        protected final void q(List<C15926a> list) throws InterruptedException, TimeoutException {
            for (C15926a c15926a : list) {
                C14972a c14972a = C16093d.this.f153796e;
                C15611d c15611d = new C15611d();
                c15611d.m(lt.e.CONTENT_DELIVERED.name());
                HashMap map = new HashMap();
                map.put(EnumC15608a.CONTENT_ID.name(), c15926a.h());
                r rVarA = C14972a.a(c15926a.l());
                if (rVarA != r.PUSH && rVarA != r.TIME) {
                    c15926a.l();
                } else {
                    map.put(EnumC15608a.TRIGGER_TYPE.name(), rVarA.name());
                    c15611d.f(map);
                    c14972a.f140238a.c(c15611d);
                }
            }
            C16102m c16102m = new C16102m(C16093d.this.f153793b.f153811d, list, null);
            Iterator<InterfaceC16099j> it = iterator();
            while (it.hasNext()) {
                try {
                    it.next().c(list, c16102m.a());
                } catch (Exception unused) {
                    C13784a unused2 = C16093d.f153791i;
                }
            }
            c16102m.b();
        }

        protected final boolean r(List<C15926a> list) {
            Iterator<InterfaceC16099j> it = iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                InterfaceC16099j next = it.next();
                try {
                    C13784a unused = C16093d.f153791i;
                    next.a(list);
                } catch (Exception unused2) {
                    C13784a unused3 = C16093d.f153791i;
                }
                z10 = true;
            }
            return z10;
        }
    }

    @Override // Cb.d
    public final void b(Cb.a aVar) {
    }

    @Override // Cb.d
    public final void g(Cb.c cVar) {
    }

    static /* synthetic */ C16098i h(List list, Cb.a aVar) {
        C16098i c16098i = new C16098i();
        c16098i.f153825a = list;
        c16098i.f153826b = aVar.g();
        c16098i.f153827c = aVar.a();
        if (aVar.c().equals(a.b.DEPART_EVENT)) {
            c16098i.f153828d = aVar.b();
        }
        return c16098i;
    }

    private boolean l() {
        return this.f153797f.J() && this.f153798g.s();
    }

    private void n(Cb.a aVar) {
        C16096g c16096g = this.f153793b;
        a aVar2 = new a(aVar);
        C15926a.EnumC2352a enumC2352aC = C16095f.c(aVar.c());
        C15423i c15423iC = Ab.a.c(aVar, c16096g.f153810c.x().d());
        Kb.l lVar = new Kb.l(c16096g.f153808a);
        Boolean bool = Boolean.FALSE;
        lVar.i(c16096g.f153809b.d(Kb.j.f16528a, "content", "search" + C16096g.a(bool)), c15423iC, C15767b[].class, c16096g.new a(enumC2352aC, aVar, aVar2));
    }

    public final List<C16094e> e(List<C15926a> list, Cb.a aVar, int i10) {
        try {
            return this.f153792a.p(list, aVar, i10);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
            return null;
        } catch (TimeoutException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final void i(List<String> list) {
        ActivityManager.AppTask appTaskA;
        HashSet hashSet = new HashSet();
        list.size();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            C15926a c15926aH = C14495b.a().f135205B.h(it.next());
            arrayList.add(c15926aH);
            C14972a c14972a = this.f153796e;
            c14972a.f140238a.c(c14972a.c(c15926aH, lt.e.CONTENT_CLICKED.name()));
            String strB = c15926aH.b();
            if (strB != null && c15926aH.n() && !hashSet.contains(strB)) {
                hashSet.add(strB);
                C14499f.a();
                Nb.r.a(strB, C14499f.c());
                z10 = true;
            }
        }
        if (this.f153792a.r(arrayList)) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        try {
            Nb.e eVar = this.f153799h;
            Intent launchIntentForPackage = eVar.f20755a.getPackageManager().getLaunchIntentForPackage(eVar.f20755a.getPackageName());
            if (launchIntentForPackage != null) {
                if ((eVar.f20756b.f20788a >= 21) && (appTaskA = eVar.a(launchIntentForPackage)) != null && appTaskA.getTaskInfo() != null) {
                    appTaskA.moveToFront();
                } else {
                    launchIntentForPackage.addFlags(268435456);
                    eVar.f20755a.startActivity(launchIntentForPackage);
                }
            }
        } catch (Exception unused) {
        }
    }

    public C16093d(Cb.b bVar, C16096g c16096g, Fb.d dVar, C14972a c14972a, Db.e eVar, Db.b bVar2, Nb.e eVar2) {
        this.f153794c = bVar;
        this.f153793b = c16096g;
        this.f153795d = dVar;
        this.f153796e = c14972a;
        this.f153794c.f(this);
        this.f153797f = eVar;
        this.f153798g = bVar2;
        this.f153799h = eVar2;
    }

    @Override // Cb.d
    public final void c(Cb.a aVar) {
        if (l()) {
            n(aVar);
        }
    }

    @Override // Cb.d
    public final void d(Cb.a aVar) {
        if (l()) {
            n(aVar);
        }
    }

    public final void j(C15926a c15926a) throws InterruptedException, TimeoutException {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c15926a);
            this.f153793b.f153811d.b(arrayList);
            this.f153792a.q(arrayList);
        }
    }
}

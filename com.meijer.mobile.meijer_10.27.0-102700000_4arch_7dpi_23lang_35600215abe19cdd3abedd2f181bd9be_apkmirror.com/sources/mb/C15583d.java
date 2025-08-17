package mb;

import Ab.a;
import android.app.ActivityManager;
import android.content.Intent;
import cb.C6380a;
import cb.C6381b;
import fb.C13865b;
import fb.C13869f;
import hb.C14394a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kt.C15320i;
import kt.r;
import lb.C15392a;
import lt.C15500d;
import lt.EnumC15497a;
import lt.EnumC15499c;
import mb.C15586g.a;
import mt.C15708b;
import nt.InterfaceC15945c;
import yb.C18199a;

/* renamed from: mb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15583d implements Ab.d {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f150004i = C6381b.a(C15583d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final b f150005a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final C15586g f150006b;

    /* renamed from: c, reason: collision with root package name */
    private Ab.b f150007c;

    /* renamed from: d, reason: collision with root package name */
    private Db.d f150008d;

    /* renamed from: e, reason: collision with root package name */
    private C14394a f150009e;

    /* renamed from: f, reason: collision with root package name */
    private final Bb.e f150010f;

    /* renamed from: g, reason: collision with root package name */
    private final Bb.b f150011g;

    /* renamed from: h, reason: collision with root package name */
    private Lb.e f150012h;

    /* renamed from: mb.d$a */
    final class a implements InterfaceC15945c<List<C15392a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ab.a f150013a;

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(List<C15392a> list) {
            List<C15392a> list2 = list;
            try {
                C6380a unused = C15583d.f150004i;
                b bVar = C15583d.this.f150005a;
                Ab.a aVar = this.f150013a;
                C15588i c15588iH = C15583d.h(list2, aVar);
                C14394a c14394a = C15583d.this.f150009e;
                for (C15392a c15392a : list2) {
                    C15500d c15500d = new C15500d();
                    c15500d.m(lt.e.CONTENT_DELIVERED.name());
                    c15500d.g(String.valueOf(aVar.k()));
                    c15500d.h(String.valueOf(aVar.h()));
                    HashMap map = new HashMap();
                    map.put(EnumC15497a.CONTENT_ID.name(), c15392a.h());
                    map.put(EnumC15497a.TRIGGER_ID.name(), aVar.g().l());
                    map.put(EnumC15497a.TRIGGER_TYPE.name(), r.PLACE.name());
                    map.put(EnumC15497a.PLACE_EVENT_TYPE.name(), aVar.d());
                    map.put(EnumC15499c.VISIT_ID.name(), aVar.g().m());
                    c15500d.f(map);
                    c14394a.f134549a.c(c15500d);
                }
                C15592m c15592m = new C15592m(C15583d.this.f150006b.f150024d, list2, aVar);
                Iterator<InterfaceC15589j> it = bVar.iterator();
                while (it.hasNext()) {
                    InterfaceC15589j next = it.next();
                    try {
                        if (aVar.c().equals(a.b.ARRIVE_EVENT)) {
                            next.c(c15588iH, c15592m.a());
                        } else if (aVar.c().equals(a.b.DEPART_EVENT)) {
                            next.b(c15588iH, c15592m.a());
                        }
                    } catch (Exception unused2) {
                        C6380a unused3 = C15583d.f150004i;
                    }
                }
                c15592m.b();
            } catch (InterruptedException unused4) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused5) {
                C6380a unused6 = C15583d.f150004i;
                this.f150013a.i();
            }
        }

        a(Ab.a aVar) {
            this.f150013a = aVar;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = C15583d.f150004i;
        }
    }

    /* renamed from: mb.d$b */
    protected class b extends Bb.g<InterfaceC15589j> {
        protected b() {
        }

        protected final List<C15584e> p(List<C15392a> list, Ab.a aVar, int i10) throws InterruptedException, TimeoutException {
            ArrayList arrayList = new ArrayList();
            C15588i c15588iH = aVar != null ? C15583d.h(list, aVar) : null;
            for (C15392a c15392a : list) {
                C14394a c14394a = C15583d.this.f150009e;
                c14394a.f134549a.c(c14394a.c(c15392a, lt.e.CONTENT_NOTIFIED.name()));
                C15591l c15591l = new C15591l(c15392a);
                Iterator<InterfaceC15589j> it = iterator();
                while (it.hasNext()) {
                    InterfaceC15589j next = it.next();
                    if (c15588iH != null) {
                        try {
                            C6380a unused = C15583d.f150004i;
                            next.a(c15392a, c15588iH, i10, c15591l.a());
                        } catch (Exception unused2) {
                            C6380a unused3 = C15583d.f150004i;
                        }
                    } else {
                        C6380a unused4 = C15583d.f150004i;
                        next.e(c15392a, i10, c15591l.a());
                    }
                }
                arrayList.add(c15591l.b());
            }
            return arrayList;
        }

        protected final void q(List<C15392a> list) throws InterruptedException, TimeoutException {
            for (C15392a c15392a : list) {
                C14394a c14394a = C15583d.this.f150009e;
                C15500d c15500d = new C15500d();
                c15500d.m(lt.e.CONTENT_DELIVERED.name());
                HashMap map = new HashMap();
                map.put(EnumC15497a.CONTENT_ID.name(), c15392a.h());
                r rVarA = C14394a.a(c15392a.l());
                if (rVarA != r.PUSH && rVarA != r.TIME) {
                    c15392a.l();
                } else {
                    map.put(EnumC15497a.TRIGGER_TYPE.name(), rVarA.name());
                    c15500d.f(map);
                    c14394a.f134549a.c(c15500d);
                }
            }
            C15592m c15592m = new C15592m(C15583d.this.f150006b.f150024d, list, null);
            Iterator<InterfaceC15589j> it = iterator();
            while (it.hasNext()) {
                try {
                    it.next().d(list, c15592m.a());
                } catch (Exception unused) {
                    C6380a unused2 = C15583d.f150004i;
                }
            }
            c15592m.b();
        }

        protected final boolean r(List<C15392a> list) {
            Iterator<InterfaceC15589j> it = iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                InterfaceC15589j next = it.next();
                try {
                    C6380a unused = C15583d.f150004i;
                    next.a(list);
                } catch (Exception unused2) {
                    C6380a unused3 = C15583d.f150004i;
                }
                z10 = true;
            }
            return z10;
        }
    }

    @Override // Ab.d
    public final void b(Ab.a aVar) {
    }

    @Override // Ab.d
    public final void g(Ab.c cVar) {
    }

    static /* synthetic */ C15588i h(List list, Ab.a aVar) {
        C15588i c15588i = new C15588i();
        c15588i.f150038a = list;
        c15588i.f150039b = aVar.g();
        c15588i.f150040c = aVar.a();
        if (aVar.c().equals(a.b.DEPART_EVENT)) {
            c15588i.f150041d = aVar.b();
        }
        return c15588i;
    }

    private boolean l() {
        return this.f150010f.J() && this.f150011g.s();
    }

    private void n(Ab.a aVar) {
        C15586g c15586g = this.f150006b;
        a aVar2 = new a(aVar);
        C15392a.EnumC2285a enumC2285aC = C15585f.c(aVar.c());
        C15320i c15320iC = C18199a.c(aVar, c15586g.f150023c.x().d());
        Ib.l lVar = new Ib.l(c15586g.f150021a);
        Boolean bool = Boolean.FALSE;
        lVar.i(c15586g.f150022b.d(Ib.j.f13782a, "content", "search" + C15586g.a(bool)), c15320iC, C15708b[].class, c15586g.new a(enumC2285aC, aVar, aVar2));
    }

    public final List<C15584e> e(List<C15392a> list, Ab.a aVar, int i10) {
        try {
            return this.f150005a.p(list, aVar, i10);
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
            C15392a c15392aH = C13865b.a().f130859B.h(it.next());
            arrayList.add(c15392aH);
            C14394a c14394a = this.f150009e;
            c14394a.f134549a.c(c14394a.c(c15392aH, lt.e.CONTENT_CLICKED.name()));
            String strB = c15392aH.b();
            if (strB != null && c15392aH.n() && !hashSet.contains(strB)) {
                hashSet.add(strB);
                C13869f.a();
                Lb.r.a(strB, C13869f.c());
                z10 = true;
            }
        }
        if (this.f150005a.r(arrayList)) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        try {
            Lb.e eVar = this.f150012h;
            Intent launchIntentForPackage = eVar.f17935a.getPackageManager().getLaunchIntentForPackage(eVar.f17935a.getPackageName());
            if (launchIntentForPackage != null) {
                if ((eVar.f17936b.f17968a >= 21) && (appTaskA = eVar.a(launchIntentForPackage)) != null && appTaskA.getTaskInfo() != null) {
                    appTaskA.moveToFront();
                } else {
                    launchIntentForPackage.addFlags(268435456);
                    eVar.f17935a.startActivity(launchIntentForPackage);
                }
            }
        } catch (Exception unused) {
        }
    }

    public C15583d(Ab.b bVar, C15586g c15586g, Db.d dVar, C14394a c14394a, Bb.e eVar, Bb.b bVar2, Lb.e eVar2) {
        this.f150007c = bVar;
        this.f150006b = c15586g;
        this.f150008d = dVar;
        this.f150009e = c14394a;
        this.f150007c.f(this);
        this.f150010f = eVar;
        this.f150011g = bVar2;
        this.f150012h = eVar2;
    }

    @Override // Ab.d
    public final void c(Ab.a aVar) {
        if (l()) {
            n(aVar);
        }
    }

    @Override // Ab.d
    public final void d(Ab.a aVar) {
        if (l()) {
            n(aVar);
        }
    }

    public final void j(C15392a c15392a) throws InterruptedException, TimeoutException {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c15392a);
            this.f150006b.f150024d.b(arrayList);
            this.f150005a.q(arrayList);
        }
    }
}

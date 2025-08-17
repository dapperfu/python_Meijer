package Et;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ut.C17315a;
import ut.InterfaceC17316b;
import zt.InterfaceC18576f;

/* loaded from: classes11.dex */
public class c extends tt.f<InterfaceC17316b> implements Dt.c {

    /* renamed from: d, reason: collision with root package name */
    public static final C6380a f9804d = C6381b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final C6382c f9805e = C6383d.a(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final g f9806b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC17316b> f9807c = new CopyOnWriteArrayList();

    private void k(C17315a c17315a) {
        synchronized (this) {
            Iterator<InterfaceC17316b> it = iterator();
            while (it.hasNext()) {
                InterfaceC17316b next = it.next();
                try {
                    next.a(c17315a);
                } catch (Exception e10) {
                    f9805e.g("Listener failed {}", next, e10);
                }
            }
        }
    }

    @Override // Dt.c
    public final C17315a a() {
        g gVar = this.f9806b;
        gVar.f9822c = gVar.d();
        Iterator<InterfaceC18576f> it = gVar.f9824e.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            int iA = it.next().a();
            if (iA > i10) {
                i10 = iA;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("network");
        gVar.f9830k = gVar.f9820a.a();
        gVar.f9831l = Long.MAX_VALUE;
        if (!gVar.f()) {
            i10 = 3;
        }
        long j10 = i10;
        int i11 = 0;
        C17315a c17315aE = null;
        while (i11 < j10 && c17315aE == null) {
            c17315aE = gVar.e(arrayList);
            i11++;
        }
        if (gVar.f() && c17315aE == null) {
            arrayList.add("gps");
            gVar.f9831l = gVar.f9820a.a();
            while (i11 < 7 && c17315aE == null) {
                c17315aE = gVar.e(arrayList);
                i11++;
            }
        }
        gVar.f9821b.a();
        if (c17315aE != null) {
            k(c17315aE);
        }
        return c17315aE;
    }

    public c(g gVar) {
        this.f9806b = gVar;
    }

    @Override // Dt.c
    public final void e(InterfaceC17316b interfaceC17316b) {
        h(interfaceC17316b);
    }

    @Override // Dt.c
    public final C17315a a(C17315a c17315a) {
        b bVarD = this.f9806b.d();
        bVarD.b(c17315a);
        C17315a c17315aA = bVarD.a(450.0f);
        if (c17315aA != null) {
            k(c17315aA);
        }
        return c17315aA;
    }
}

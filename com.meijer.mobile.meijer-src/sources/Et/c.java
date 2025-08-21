package Et;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ut.C17467a;
import ut.InterfaceC17468b;
import zt.InterfaceC18552f;

/* loaded from: classes12.dex */
public class c extends tt.f<InterfaceC17468b> implements Dt.c {

    /* renamed from: d, reason: collision with root package name */
    public static final C13784a f8516d = C13785b.a(c.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final C13786c f8517e = C13787d.a(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final g f8518b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC17468b> f8519c = new CopyOnWriteArrayList();

    private void k(C17467a c17467a) {
        synchronized (this) {
            Iterator<InterfaceC17468b> it = iterator();
            while (it.hasNext()) {
                InterfaceC17468b next = it.next();
                try {
                    next.a(c17467a);
                } catch (Exception e10) {
                    f8517e.g("Listener failed {}", next, e10);
                }
            }
        }
    }

    @Override // Dt.c
    public final C17467a a() {
        g gVar = this.f8518b;
        gVar.f8534c = gVar.d();
        Iterator<InterfaceC18552f> it = gVar.f8536e.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            int iA = it.next().a();
            if (iA > i10) {
                i10 = iA;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("network");
        gVar.f8542k = gVar.f8532a.a();
        gVar.f8543l = Long.MAX_VALUE;
        if (!gVar.f()) {
            i10 = 3;
        }
        long j10 = i10;
        int i11 = 0;
        C17467a c17467aE = null;
        while (i11 < j10 && c17467aE == null) {
            c17467aE = gVar.e(arrayList);
            i11++;
        }
        if (gVar.f() && c17467aE == null) {
            arrayList.add("gps");
            gVar.f8543l = gVar.f8532a.a();
            while (i11 < 7 && c17467aE == null) {
                c17467aE = gVar.e(arrayList);
                i11++;
            }
        }
        gVar.f8533b.a();
        if (c17467aE != null) {
            k(c17467aE);
        }
        return c17467aE;
    }

    public c(g gVar) {
        this.f8518b = gVar;
    }

    @Override // Dt.c
    public final void e(InterfaceC17468b interfaceC17468b) {
        h(interfaceC17468b);
    }

    @Override // Dt.c
    public final C17467a a(C17467a c17467a) {
        b bVarD = this.f8518b.d();
        bVarD.b(c17467a);
        C17467a c17467aA = bVarD.a(450.0f);
        if (c17467aA != null) {
            k(c17467aA);
        }
        return c17467aA;
    }
}

package pt;

import Ob.g;
import Ob.h;
import java.util.ArrayList;
import kt.C15319h;
import kt.l;

/* renamed from: pt.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16420f {
    public static g a(C15319h c15319h) {
        g gVar = new g();
        gVar.l(c15319h.getId());
        gVar.n(c15319h.c());
        gVar.m(c15319h.getName());
        gVar.j(c15319h.w());
        if (c15319h.b() != null) {
            ArrayList arrayList = new ArrayList();
            for (l lVar : c15319h.b()) {
                h hVar = new h();
                hVar.c(lVar.a());
                hVar.d(lVar.b());
                arrayList.add(hVar);
            }
            gVar.h(arrayList);
        }
        return gVar;
    }
}

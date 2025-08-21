package pt;

import Qb.g;
import Qb.h;
import java.util.ArrayList;
import kt.C15422h;
import kt.l;

/* renamed from: pt.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16546f {
    public static g a(C15422h c15422h) {
        g gVar = new g();
        gVar.l(c15422h.getId());
        gVar.n(c15422h.c());
        gVar.m(c15422h.getName());
        gVar.j(c15422h.w());
        if (c15422h.b() != null) {
            ArrayList arrayList = new ArrayList();
            for (l lVar : c15422h.b()) {
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

package Db;

import Ob.g;
import Ob.h;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class c {
    public static b a(g gVar) {
        return b(gVar, new b());
    }

    public static b b(g gVar, b bVar) {
        bVar.v(gVar.e());
        bVar.x(gVar.g());
        bVar.w(gVar.f());
        bVar.r(gVar.c());
        bVar.s(gVar.d());
        if (gVar.a() != null) {
            ArrayList arrayList = new ArrayList();
            for (h hVar : gVar.a()) {
                a aVar = new a();
                aVar.c(hVar.a());
                aVar.d(hVar.b());
                arrayList.add(aVar);
            }
            bVar.q(arrayList);
        }
        return bVar;
    }
}

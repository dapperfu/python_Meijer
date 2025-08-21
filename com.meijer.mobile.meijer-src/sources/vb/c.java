package vb;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    static List<Qb.h> a(List<Sb.a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Sb.a aVar : list) {
                Qb.h hVar = new Qb.h();
                hVar.c(aVar.a());
                hVar.d(aVar.b());
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }
}

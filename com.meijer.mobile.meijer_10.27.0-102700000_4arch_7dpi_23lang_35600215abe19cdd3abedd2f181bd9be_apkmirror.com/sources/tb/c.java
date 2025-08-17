package tb;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    static List<Ob.h> a(List<Qb.a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Qb.a aVar : list) {
                Ob.h hVar = new Ob.h();
                hVar.c(aVar.a());
                hVar.d(aVar.b());
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }
}

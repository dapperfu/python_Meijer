package Ob;

import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class r {

    static class a implements Comparator<h> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(h hVar, h hVar2) {
            return new Double(hVar.g()).compareTo(new Double(hVar2.g()));
        }

        a() {
        }
    }

    static class b implements Comparator<e> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(e eVar, e eVar2) {
            return eVar.d().compareTo(eVar2.d());
        }

        b() {
        }
    }

    public static Rb.b a(h hVar) {
        e eVar;
        Rb.f fVar;
        if (hVar == null) {
            return null;
        }
        Rb.b bVar = new Rb.b();
        bVar.c(hVar.e());
        d dVarI = hVar.i();
        bVar.b(dVarI == null ? null : new Rb.a(dVarI.a(), dVarI.b(), dVarI.o()));
        bVar.d(Double.valueOf(hVar.g()));
        ArrayList arrayList = new ArrayList();
        for (m mVar : hVar.j()) {
            String strE = hVar.e();
            if (mVar == null) {
                eVar = null;
            } else {
                eVar = new e(strE, mVar.d());
                k kVarG = mVar.g();
                if (kVarG == null) {
                    fVar = null;
                } else {
                    fVar = new Rb.f();
                    fVar.d(kVarG.h());
                    fVar.b(kVarG.f());
                    fVar.e(kVarG.j());
                    fVar.c(b(kVarG.g()).intValue());
                    fVar.a(b(kVarG.e()).intValue());
                }
                eVar.c(fVar);
                eVar.a(Integer.valueOf((int) (mVar.e() / l8.b.f93364b)));
                eVar.b(null);
            }
            arrayList.add(eVar);
        }
        bVar.e(arrayList);
        return bVar;
    }

    private static Integer b(Integer num) {
        if (num == null) {
            return null;
        }
        return Integer.valueOf(num.intValue() / 60);
    }

    public static void c(List<Rb.b> list) {
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<Rb.b> it = list.iterator();
            while (it.hasNext()) {
                Iterator<Rb.e> it2 = it.next().a().iterator();
                while (it2.hasNext()) {
                    arrayList.add((e) it2.next());
                }
            }
            Collections.sort(arrayList, new b());
            e eVar = (e) arrayList.get(0);
            int i10 = 1;
            while (i10 < arrayList.size()) {
                e eVar2 = (e) arrayList.get(i10);
                eVar2.b(eVar.e());
                i10++;
                eVar = eVar2;
            }
        }
    }
}

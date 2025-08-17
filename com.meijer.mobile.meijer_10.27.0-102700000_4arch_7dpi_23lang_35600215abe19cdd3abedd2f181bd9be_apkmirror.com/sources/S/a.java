package S;

import C.C2979w;
import androidx.camera.core.impl.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class a {
    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static C2979w d(Set<D<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<D<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        return a(arrayList);
    }

    private static C2979w a(List<C2979w> list) {
        if (list.isEmpty()) {
            return null;
        }
        C2979w c2979w = list.get(0);
        Integer numValueOf = Integer.valueOf(c2979w.b());
        Integer numValueOf2 = Integer.valueOf(c2979w.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            C2979w c2979w2 = list.get(i10);
            numValueOf = c(numValueOf, Integer.valueOf(c2979w2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(c2979w2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new C2979w(numValueOf.intValue(), numValueOf2.intValue());
    }
}

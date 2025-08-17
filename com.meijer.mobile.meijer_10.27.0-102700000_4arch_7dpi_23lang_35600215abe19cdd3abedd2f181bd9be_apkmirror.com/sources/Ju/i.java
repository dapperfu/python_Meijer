package Ju;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f16149a = Logger.getLogger(i.class.getName());

    public abstract List<Double> c();

    public static final i a(List<Double> list) {
        Iu.c.c(list, "bucketBoundaries");
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            double dDoubleValue = ((Double) arrayList.get(0)).doubleValue();
            int i10 = 1;
            while (i10 < arrayList.size()) {
                double dDoubleValue2 = ((Double) arrayList.get(i10)).doubleValue();
                Iu.c.a(dDoubleValue < dDoubleValue2, "Bucket boundaries not sorted.");
                i10++;
                dDoubleValue = dDoubleValue2;
            }
        }
        return new d(Collections.unmodifiableList(b(arrayList)));
    }

    private static List<Double> b(List<Double> list) {
        int i10 = 0;
        int i11 = 0;
        for (Double d10 : list) {
            if (d10.doubleValue() > 0.0d) {
                break;
            }
            if (d10.doubleValue() == 0.0d) {
                i11++;
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            f16149a.log(Level.WARNING, "Dropping " + i10 + " negative bucket boundaries, the values must be strictly > 0.");
        }
        return list.subList(i10 + i11, list.size());
    }
}

package Ug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f36004a = new HashMap();

    int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f36004a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return Tg.a.b(arrayList);
    }

    void b(int i10) {
        Integer num = this.f36004a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f36004a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }

    b() {
    }
}

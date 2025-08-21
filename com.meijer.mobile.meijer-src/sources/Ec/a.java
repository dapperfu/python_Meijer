package Ec;

import android.util.SparseArray;
import java.util.HashMap;
import rc.EnumC16886f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<EnumC16886f> f7077a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<EnumC16886f, Integer> f7078b;

    static {
        HashMap<EnumC16886f, Integer> map = new HashMap<>();
        f7078b = map;
        map.put(EnumC16886f.DEFAULT, 0);
        f7078b.put(EnumC16886f.VERY_LOW, 1);
        f7078b.put(EnumC16886f.HIGHEST, 2);
        for (EnumC16886f enumC16886f : f7078b.keySet()) {
            f7077a.append(f7078b.get(enumC16886f).intValue(), enumC16886f);
        }
    }

    public static int a(EnumC16886f enumC16886f) {
        Integer num = f7078b.get(enumC16886f);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC16886f);
    }

    public static EnumC16886f b(int i10) {
        EnumC16886f enumC16886f = f7077a.get(i10);
        if (enumC16886f != null) {
            return enumC16886f;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}

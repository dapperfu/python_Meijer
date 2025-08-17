package Cc;

import android.util.SparseArray;
import java.util.HashMap;
import pc.EnumC16282f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<EnumC16282f> f3765a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<EnumC16282f, Integer> f3766b;

    static {
        HashMap<EnumC16282f, Integer> map = new HashMap<>();
        f3766b = map;
        map.put(EnumC16282f.DEFAULT, 0);
        f3766b.put(EnumC16282f.VERY_LOW, 1);
        f3766b.put(EnumC16282f.HIGHEST, 2);
        for (EnumC16282f enumC16282f : f3766b.keySet()) {
            f3765a.append(f3766b.get(enumC16282f).intValue(), enumC16282f);
        }
    }

    public static int a(EnumC16282f enumC16282f) {
        Integer num = f3766b.get(enumC16282f);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC16282f);
    }

    public static EnumC16282f b(int i10) {
        EnumC16282f enumC16282f = f3765a.get(i10);
        if (enumC16282f != null) {
            return enumC16282f;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}

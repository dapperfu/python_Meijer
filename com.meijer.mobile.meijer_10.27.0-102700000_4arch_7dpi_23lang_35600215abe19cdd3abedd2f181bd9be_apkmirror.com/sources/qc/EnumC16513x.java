package qc;

import android.util.SparseArray;

/* renamed from: qc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC16513x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray<EnumC16513x> f157188h;

    /* renamed from: a, reason: collision with root package name */
    private final int f157190a;

    static {
        EnumC16513x enumC16513x = DEFAULT;
        EnumC16513x enumC16513x2 = UNMETERED_ONLY;
        EnumC16513x enumC16513x3 = UNMETERED_OR_DAILY;
        EnumC16513x enumC16513x4 = FAST_IF_RADIO_AWAKE;
        EnumC16513x enumC16513x5 = NEVER;
        EnumC16513x enumC16513x6 = UNRECOGNIZED;
        SparseArray<EnumC16513x> sparseArray = new SparseArray<>();
        f157188h = sparseArray;
        sparseArray.put(0, enumC16513x);
        sparseArray.put(1, enumC16513x2);
        sparseArray.put(2, enumC16513x3);
        sparseArray.put(3, enumC16513x4);
        sparseArray.put(4, enumC16513x5);
        sparseArray.put(-1, enumC16513x6);
    }

    EnumC16513x(int i10) {
        this.f157190a = i10;
    }
}

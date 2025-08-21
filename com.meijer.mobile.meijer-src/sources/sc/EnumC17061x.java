package sc;

import android.util.SparseArray;

/* renamed from: sc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC17061x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray<EnumC17061x> f160303h;

    /* renamed from: a, reason: collision with root package name */
    private final int f160305a;

    static {
        EnumC17061x enumC17061x = DEFAULT;
        EnumC17061x enumC17061x2 = UNMETERED_ONLY;
        EnumC17061x enumC17061x3 = UNMETERED_OR_DAILY;
        EnumC17061x enumC17061x4 = FAST_IF_RADIO_AWAKE;
        EnumC17061x enumC17061x5 = NEVER;
        EnumC17061x enumC17061x6 = UNRECOGNIZED;
        SparseArray<EnumC17061x> sparseArray = new SparseArray<>();
        f160303h = sparseArray;
        sparseArray.put(0, enumC17061x);
        sparseArray.put(1, enumC17061x2);
        sparseArray.put(2, enumC17061x3);
        sparseArray.put(3, enumC17061x4);
        sparseArray.put(4, enumC17061x5);
        sparseArray.put(-1, enumC17061x6);
    }

    EnumC17061x(int i10) {
        this.f160305a = i10;
    }
}

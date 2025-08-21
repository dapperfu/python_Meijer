package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139348a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f139348a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139348a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139348a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f139348a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f139348a[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f139348a[ChronoField.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

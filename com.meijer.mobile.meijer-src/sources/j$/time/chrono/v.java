package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139378a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f139378a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139378a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139378a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

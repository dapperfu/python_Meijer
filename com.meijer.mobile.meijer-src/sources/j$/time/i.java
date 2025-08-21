package j$.time;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139493a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f139493a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139493a[ChronoField.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

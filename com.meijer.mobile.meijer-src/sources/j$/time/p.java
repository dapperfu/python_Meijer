package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139506a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139507b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f139507b = iArr;
        try {
            iArr[ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139507b[ChronoUnit.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139507b[ChronoUnit.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f139507b[ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f139507b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f139507b[ChronoUnit.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f139506a = iArr2;
        try {
            iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f139506a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f139506a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f139506a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f139506a[ChronoField.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}

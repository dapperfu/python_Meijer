package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139504a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139505b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f139505b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139505b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139505b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f139505b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f139505b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f139504a = iArr2;
        try {
            iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f139504a[ChronoField.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f139504a[ChronoField.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

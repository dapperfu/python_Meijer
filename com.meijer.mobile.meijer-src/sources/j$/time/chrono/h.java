package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139344a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f139344a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139344a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

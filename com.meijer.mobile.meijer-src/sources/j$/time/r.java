package j$.time;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139511a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f139511a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139511a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

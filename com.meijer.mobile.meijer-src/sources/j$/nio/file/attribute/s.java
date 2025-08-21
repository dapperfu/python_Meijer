package j$.nio.file.attribute;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139225a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f139225a = iArr;
        try {
            iArr[TimeUnit.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139225a[TimeUnit.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139225a[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f139225a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f139225a[TimeUnit.MILLISECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f139225a[TimeUnit.MICROSECONDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f139225a[TimeUnit.NANOSECONDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}

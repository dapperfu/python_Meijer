package j$.time.format;

/* renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC14877b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139425a;

    static {
        int[] iArr = new int[SignStyle.values().length];
        f139425a = iArr;
        try {
            iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139425a[SignStyle.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139425a[SignStyle.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f139425a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

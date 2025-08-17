package fsimpl;

/* renamed from: fsimpl.eq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
/* synthetic */ class C14072eq {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f132177a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f132178b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f132179c;

    static {
        int[] iArr = new int[eF.values().length];
        f132179c = iArr;
        try {
            iArr[eF.CONFIRM_READY.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f132179c[eF.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
        }
        int[] iArr2 = new int[eA.values().length];
        f132178b = iArr2;
        try {
            iArr2[eA.END.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f132178b[eA.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
        }
        try {
            f132178b[eA.DELETE_CONTINUE.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
        }
        int[] iArr3 = new int[eI.values().length];
        f132177a = iArr3;
        try {
            iArr3[eI.NATURAL.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
        }
        try {
            f132177a[eI.MONOTONIC.ordinal()] = 2;
        } catch (NoSuchFieldError e16) {
        }
    }
}

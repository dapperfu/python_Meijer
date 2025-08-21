package fsimpl;

/* renamed from: fsimpl.eq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
/* synthetic */ class C14197eq {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f133427a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f133428b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f133429c;

    static {
        int[] iArr = new int[eF.values().length];
        f133429c = iArr;
        try {
            iArr[eF.CONFIRM_READY.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f133429c[eF.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
        }
        int[] iArr2 = new int[eA.values().length];
        f133428b = iArr2;
        try {
            iArr2[eA.END.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f133428b[eA.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
        }
        try {
            f133428b[eA.DELETE_CONTINUE.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
        }
        int[] iArr3 = new int[eI.values().length];
        f133427a = iArr3;
        try {
            iArr3[eI.NATURAL.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
        }
        try {
            f133427a[eI.MONOTONIC.ordinal()] = 2;
        } catch (NoSuchFieldError e16) {
        }
    }
}

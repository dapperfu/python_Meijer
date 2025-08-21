package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC14854a;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139161a;

    static {
        int[] iArr = new int[EnumC14854a.values().length];
        f139161a = iArr;
        try {
            iArr[EnumC14854a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f139161a[EnumC14854a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f139161a[EnumC14854a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

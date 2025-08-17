package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC14766a;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138572a;

    static {
        int[] iArr = new int[EnumC14766a.values().length];
        f138572a = iArr;
        try {
            iArr[EnumC14766a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f138572a[EnumC14766a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f138572a[EnumC14766a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

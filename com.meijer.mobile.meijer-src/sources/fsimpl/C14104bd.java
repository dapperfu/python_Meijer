package fsimpl;

import android.graphics.Shader;

/* renamed from: fsimpl.bd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
/* synthetic */ class C14104bd {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f133066a;

    static {
        int[] iArr = new int[Shader.TileMode.values().length];
        f133066a = iArr;
        try {
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f133066a[Shader.TileMode.MIRROR.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f133066a[Shader.TileMode.REPEAT.ordinal()] = 3;
        } catch (NoSuchFieldError e12) {
        }
    }
}

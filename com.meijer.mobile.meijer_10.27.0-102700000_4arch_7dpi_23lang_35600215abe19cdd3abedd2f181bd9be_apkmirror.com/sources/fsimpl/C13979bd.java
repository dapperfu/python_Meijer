package fsimpl;

import android.graphics.Shader;

/* renamed from: fsimpl.bd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
/* synthetic */ class C13979bd {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f131816a;

    static {
        int[] iArr = new int[Shader.TileMode.values().length];
        f131816a = iArr;
        try {
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f131816a[Shader.TileMode.MIRROR.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f131816a[Shader.TileMode.REPEAT.ordinal()] = 3;
        } catch (NoSuchFieldError e12) {
        }
    }
}

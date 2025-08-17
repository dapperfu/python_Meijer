package v;

import androidx.camera.core.impl.E;

/* loaded from: classes.dex */
public class V1 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f163891a;

        static {
            int[] iArr = new int[E.b.values().length];
            f163891a = iArr;
            try {
                iArr[E.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163891a[E.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163891a[E.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163891a[E.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f163891a[E.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(E.b bVar, int i10) {
        int i11 = a.f163891a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 2;
    }

    public static int b(E.b bVar, int i10) {
        int i11 = a.f163891a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 1;
    }
}

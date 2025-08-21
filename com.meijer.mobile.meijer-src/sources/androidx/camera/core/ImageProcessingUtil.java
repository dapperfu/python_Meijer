package androidx.camera.core;

import C.P;
import F.S;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    private static int f47464a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    private static boolean k(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    public static /* synthetic */ void b(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    public static boolean c(n nVar) {
        if (!l(nVar)) {
            P.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(nVar) == a.ERROR_CONVERSION) {
            P.c("ImageProcessingUtil", "One pixel shift for YUV failure");
            return false;
        }
        return true;
    }

    private static a d(n nVar) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iF = nVar.getPlanes()[0].f();
        int iF2 = nVar.getPlanes()[1].f();
        int iF3 = nVar.getPlanes()[2].f();
        int iG = nVar.getPlanes()[0].g();
        int iG2 = nVar.getPlanes()[1].g();
        if (nativeShiftPixel(nVar.getPlanes()[0].e(), iF, nVar.getPlanes()[1].e(), iF2, nVar.getPlanes()[2].e(), iF3, iG, iG2, width, height, iG, iG2, iG2) != 0) {
            return a.ERROR_CONVERSION;
        }
        return a.SUCCESS;
    }

    public static n e(S s10, byte[] bArr) {
        boolean z10;
        if (s10.c() == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.a(z10);
        o2.i.g(bArr);
        Surface surface = s10.getSurface();
        o2.i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            P.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n nVarB = s10.b();
        if (nVarB == null) {
            P.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return nVarB;
    }

    public static Bitmap f(n nVar) {
        if (nVar.getFormat() == 35) {
            int width = nVar.getWidth();
            int height = nVar.getHeight();
            int iF = nVar.getPlanes()[0].f();
            int iF2 = nVar.getPlanes()[1].f();
            int iF3 = nVar.getPlanes()[2].f();
            int iG = nVar.getPlanes()[0].g();
            int iG2 = nVar.getPlanes()[1].g();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
            if (nativeConvertAndroid420ToBitmap(nVar.getPlanes()[0].e(), iF, nVar.getPlanes()[1].e(), iF2, nVar.getPlanes()[2].e(), iF3, iG, iG2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
                return bitmapCreateBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static n g(final n nVar, S s10, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!l(nVar)) {
            P.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!k(i10)) {
            P.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(nVar, s10.getSurface(), byteBuffer, i10, z10) == a.ERROR_CONVERSION) {
            P.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            P.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f47464a)));
            f47464a++;
        }
        final n nVarB = s10.b();
        if (nVarB == null) {
            P.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarB);
        sVar.a(new e.a() { // from class: C.J
            @Override // androidx.camera.core.e.a
            public final void a(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.b(nVarB, nVar, nVar2);
            }
        });
        return sVar;
    }

    private static a h(n nVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iF = nVar.getPlanes()[0].f();
        int iF2 = nVar.getPlanes()[1].f();
        int iF3 = nVar.getPlanes()[2].f();
        int iG = nVar.getPlanes()[0].g();
        int iG2 = nVar.getPlanes()[1].g();
        if (z10) {
            i11 = iG;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = iG2;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = iG2;
        } else {
            i13 = 0;
        }
        if (nativeConvertAndroid420ToABGR(nVar.getPlanes()[0].e(), iF, nVar.getPlanes()[1].e(), iF2, nVar.getPlanes()[2].e(), iF3, iG, iG2, surface, byteBuffer, width, height, i11, i12, i13, i10) != 0) {
            return a.ERROR_CONVERSION;
        }
        return a.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean l(n nVar) {
        if (nVar.getFormat() == 35 && nVar.getPlanes().length == 3) {
            return true;
        }
        return false;
    }

    public static n m(n nVar, S s10, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        final n nVar2;
        a aVarN;
        if (!l(nVar)) {
            P.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!k(i10)) {
            P.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if (i10 > 0) {
            nVar2 = nVar;
            aVarN = n(nVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10);
        } else {
            nVar2 = nVar;
            aVarN = aVar;
        }
        if (aVarN == aVar) {
            P.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final n nVarB = s10.b();
        if (nVarB == null) {
            P.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarB);
        sVar.a(new e.a() { // from class: C.K
            @Override // androidx.camera.core.e.a
            public final void a(androidx.camera.core.n nVar3) {
                ImageProcessingUtil.a(nVarB, nVar2, nVar3);
            }
        });
        return sVar;
    }

    private static a n(n nVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iF = nVar.getPlanes()[0].f();
        int iF2 = nVar.getPlanes()[1].f();
        int iF3 = nVar.getPlanes()[2].f();
        int iG = nVar.getPlanes()[1].g();
        Image imageB = K.a.b(imageWriter);
        if (imageB == null) {
            return a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(nVar.getPlanes()[0].e(), iF, nVar.getPlanes()[1].e(), iF2, nVar.getPlanes()[2].e(), iF3, iG, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) != 0) {
            return a.ERROR_CONVERSION;
        }
        K.a.d(imageWriter, imageB);
        return a.SUCCESS;
    }

    public static boolean o(Surface surface, byte[] bArr) {
        o2.i.g(bArr);
        o2.i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            P.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return false;
        }
        return true;
    }
}

package androidx.camera.core.internal.utils;

import G.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import o2.i;

/* loaded from: classes.dex */
public final class ImageUtil {
    public static Bitmap c(n.a[] aVarArr, int i10, int i11) {
        i.b(aVarArr.length == 1, "Expect a single plane");
        i.b(aVarArr[0].g() == 4, "Expect pixelStride=4");
        i.b(aVarArr[0].f() == i10 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].e().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, aVarArr[0].e(), aVarArr[0].f());
        return bitmapCreateBitmap;
    }

    public static boolean h(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static final class CodecFailedException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private final a f47529a;

        public enum a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(String str, a aVar) {
            super(str);
            this.f47529a = aVar;
        }
    }

    public static Rational f(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? g(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational g(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static Bitmap j(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap a(n nVar) {
        int format = nVar.getFormat();
        if (format != 1) {
            if (format != 35) {
                if (format != 256 && format != 4101) {
                    throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
                }
                return b(nVar);
            }
            return ImageProcessingUtil.f(nVar);
        }
        return d(nVar);
    }

    private static Bitmap b(n nVar) {
        byte[] bArrI = i(nVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    private static Bitmap d(n nVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        nVar.getPlanes()[0].e().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, nVar.getPlanes()[0].e(), nVar.getPlanes()[0].f());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer e(Bitmap bitmap) {
        boolean z10;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            z10 = true;
        } else {
            z10 = false;
        }
        i.b(z10, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static byte[] i(n nVar) {
        if (h(nVar.getFormat())) {
            ByteBuffer byteBufferE = nVar.getPlanes()[0].e();
            byte[] bArr = new byte[byteBufferE.capacity()];
            byteBufferE.rewind();
            byteBufferE.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
    }

    public static byte[] k(n nVar, Rect rect, int i10, int i11) throws CodecFailedException {
        if (nVar.getFormat() == 35) {
            YuvImage yuvImage = new YuvImage(l(nVar), 17, nVar.getWidth(), nVar.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            G.i iVar = new G.i(byteArrayOutputStream, h.b(nVar, i11));
            if (rect == null) {
                rect = new Rect(0, 0, nVar.getWidth(), nVar.getHeight());
            }
            if (yuvImage.compressToJpeg(rect, i10, iVar)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.a.ENCODE_FAILED);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
    }

    public static byte[] l(n nVar) {
        n.a aVar = nVar.getPlanes()[0];
        n.a aVar2 = nVar.getPlanes()[1];
        n.a aVar3 = nVar.getPlanes()[2];
        ByteBuffer byteBufferE = aVar.e();
        ByteBuffer byteBufferE2 = aVar2.e();
        ByteBuffer byteBufferE3 = aVar3.e();
        byteBufferE.rewind();
        byteBufferE2.rewind();
        byteBufferE3.rewind();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[((nVar.getWidth() * nVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i10 = 0; i10 < nVar.getHeight(); i10++) {
            byteBufferE.get(bArr, width, nVar.getWidth());
            width += nVar.getWidth();
            byteBufferE.position(Math.min(iRemaining, (byteBufferE.position() - nVar.getWidth()) + aVar.f()));
        }
        int height = nVar.getHeight() / 2;
        int width2 = nVar.getWidth() / 2;
        int iF = aVar3.f();
        int iF2 = aVar2.f();
        int iG = aVar3.g();
        int iG2 = aVar2.g();
        byte[] bArr2 = new byte[iF];
        byte[] bArr3 = new byte[iF2];
        for (int i11 = 0; i11 < height; i11++) {
            byteBufferE3.get(bArr2, 0, Math.min(iF, byteBufferE3.remaining()));
            byteBufferE2.get(bArr3, 0, Math.min(iF2, byteBufferE2.remaining()));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < width2; i14++) {
                int i15 = width + 1;
                bArr[width] = bArr2[i12];
                width += 2;
                bArr[i15] = bArr3[i13];
                i12 += iG;
                i13 += iG2;
            }
        }
        return bArr;
    }
}

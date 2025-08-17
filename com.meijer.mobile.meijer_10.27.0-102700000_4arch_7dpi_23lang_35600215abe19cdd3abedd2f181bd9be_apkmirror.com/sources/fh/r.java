package fh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private n f131135a;

    /* renamed from: b, reason: collision with root package name */
    private int f131136b;

    /* renamed from: c, reason: collision with root package name */
    private int f131137c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f131138d;

    /* renamed from: e, reason: collision with root package name */
    private int f131139e = 1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f131140f;

    public Bitmap b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f131135a.d(), this.f131135a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f131135a.b(), this.f131136b, this.f131135a.d(), this.f131135a.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f131137c == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f131137c);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }

    public com.google.zxing.k a() {
        n nVarA = this.f131135a.h(this.f131137c).a(this.f131138d, this.f131139e);
        return new com.google.zxing.k(nVarA.b(), nVarA.d(), nVarA.c(), 0, 0, nVarA.d(), nVarA.c(), false);
    }

    public boolean c() {
        return this.f131137c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f131138d = rect;
    }

    public void e(boolean z10) {
        this.f131140f = z10;
    }

    public r(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f131135a = new n(bArr, i10, i11);
        this.f131137c = i13;
        this.f131136b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    public com.google.zxing.o f(com.google.zxing.o oVar) {
        float fC = (oVar.c() * this.f131139e) + this.f131138d.left;
        float fD = (oVar.d() * this.f131139e) + this.f131138d.top;
        if (this.f131140f) {
            fC = this.f131135a.d() - fC;
        }
        return new com.google.zxing.o(fC, fD);
    }
}

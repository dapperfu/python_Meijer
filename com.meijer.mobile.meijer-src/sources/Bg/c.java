package Bg;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import com.medallia.digital.mobilesdk.l3;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c f2743a = new c();

    public static c c() {
        return f2743a;
    }

    public ByteBuffer b(Ag.a aVar, boolean z10) throws MlKitException {
        int iE = aVar.e();
        if (iE != -1) {
            if (iE == 17) {
                return z10 ? a((ByteBuffer) r.l(aVar.c())) : (ByteBuffer) r.l(aVar.c());
            }
            if (iE == 35) {
                return d((Image.Plane[]) r.l(aVar.h()), aVar.j(), aVar.f());
            }
            if (iE == 842094169) {
                return e((ByteBuffer) r.l(aVar.c()), z10);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) r.l(aVar.b());
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i10;
        ByteBuffer byteBufferAllocate = z10 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i12];
                int i16 = i15 >> 16;
                int i17 = i15 >> 8;
                int i18 = i15 & l3.f93323c;
                int i19 = i11 + 1;
                int i20 = i16 & l3.f93323c;
                int i21 = i17 & l3.f93323c;
                byteBufferAllocate.put(i11, (byte) Math.min(l3.f93323c, (((((i20 * 66) + (i21 * 129)) + (i18 * 25)) + 128) >> 8) + 16));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    int i22 = ((((i20 * 112) - (i21 * 94)) - (i18 * 18)) + 128) >> 8;
                    int i23 = (((((i20 * (-38)) - (i21 * 74)) + (i18 * 112)) + 128) >> 8) + 128;
                    int i24 = i10 + 1;
                    byteBufferAllocate.put(i10, (byte) Math.min(l3.f93323c, i22 + 128));
                    i10 += 2;
                    byteBufferAllocate.put(i24, (byte) Math.min(l3.f93323c, i23));
                }
                i12++;
                i14++;
                i11 = i19;
            }
        }
        return byteBufferAllocate;
    }

    public ByteBuffer d(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            f(planeArr[0], i10, i11, bArr, 0, 1);
            f(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            f(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    private c() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, boolean z10) {
        ByteBuffer byteBufferAllocateDirect;
        int i10;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit / 6;
        if (z10) {
            byteBufferAllocateDirect = ByteBuffer.allocate(iLimit);
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iLimit);
        }
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            byteBufferAllocateDirect.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            byteBufferAllocateDirect.put(i10 + i13, byteBuffer.get(((i13 % 2) * i11) + i10 + (i13 / 2)));
        }
        return byteBufferAllocateDirect;
    }

    private static final void f(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit != 0) {
            int i14 = i10 / (i11 / iLimit);
            int rowStride = 0;
            for (int i15 = 0; i15 < iLimit; i15++) {
                int pixelStride = rowStride;
                for (int i16 = 0; i16 < i14; i16++) {
                    bArr[i12] = buffer.get(pixelStride);
                    i12 += i13;
                    pixelStride += plane.getPixelStride();
                }
                rowStride += plane.getRowStride();
            }
        }
    }
}

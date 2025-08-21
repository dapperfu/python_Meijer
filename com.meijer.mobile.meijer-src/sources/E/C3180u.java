package E;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* renamed from: E.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3180u implements O.A<O.B<androidx.camera.core.n>, Bitmap> {
    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(O.B<androidx.camera.core.n> b10) throws Throwable {
        androidx.camera.core.q qVar;
        Bitmap bitmapJ;
        androidx.camera.core.q qVar2 = null;
        try {
            try {
                if (b10.e() == 35) {
                    androidx.camera.core.n nVarC = b10.c();
                    boolean z10 = b10.f() % 180 != 0;
                    qVar = new androidx.camera.core.q(androidx.camera.core.o.a(z10 ? nVarC.getHeight() : nVarC.getWidth(), z10 ? nVarC.getWidth() : nVarC.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.n nVarG = ImageProcessingUtil.g(nVarC, qVar, ByteBuffer.allocateDirect(nVarC.getWidth() * nVarC.getHeight() * 4), b10.f(), false);
                        nVarC.close();
                        if (nVarG == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapJ = ImageUtil.a(nVarG);
                        nVarG.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new ImageCaptureException(0, "Can't convert " + (b10.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        qVar2 = qVar;
                        if (qVar2 != null) {
                            qVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (b10.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b10.e());
                    }
                    androidx.camera.core.n nVarC2 = b10.c();
                    Bitmap bitmapA = ImageUtil.a(nVarC2);
                    nVarC2.close();
                    qVar = null;
                    bitmapJ = ImageUtil.j(bitmapA, b10.f());
                }
                if (qVar != null) {
                    qVar.close();
                }
                return bitmapJ;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

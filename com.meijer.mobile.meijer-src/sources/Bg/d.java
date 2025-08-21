package Bg;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.C6653j;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C6653j f2744a = new C6653j("MLKitImageUtils", "");

    /* renamed from: b, reason: collision with root package name */
    private static final d f2745b = new d();

    public static d b() {
        return f2745b;
    }

    private d() {
    }

    public com.google.android.gms.dynamic.b a(Ag.a aVar) throws MlKitException {
        int iE = aVar.e();
        if (iE != -1) {
            if (iE != 17) {
                if (iE != 35) {
                    if (iE != 842094169) {
                        throw new MlKitException("Unsupported image format: " + aVar.e(), 3);
                    }
                } else {
                    return com.google.android.gms.dynamic.d.I2(aVar.g());
                }
            }
            return com.google.android.gms.dynamic.d.I2((ByteBuffer) r.l(aVar.c()));
        }
        return com.google.android.gms.dynamic.d.I2((Bitmap) r.l(aVar.b()));
    }

    public int c(Ag.a aVar) {
        if (aVar.e() == -1) {
            return ((Bitmap) r.l(aVar.b())).getAllocationByteCount();
        }
        if (aVar.e() != 17 && aVar.e() != 842094169) {
            if (aVar.e() != 35) {
                return 0;
            }
            return (((Image.Plane[]) r.l(aVar.h()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) r.l(aVar.c())).limit();
    }
}

package zg;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.C6528j;
import com.google.android.gms.common.internal.r;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import yg.C18212a;

/* renamed from: zg.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18458d {

    /* renamed from: a, reason: collision with root package name */
    private static final C6528j f171830a = new C6528j("MLKitImageUtils", "");

    /* renamed from: b, reason: collision with root package name */
    private static final C18458d f171831b = new C18458d();

    public static C18458d b() {
        return f171831b;
    }

    private C18458d() {
    }

    public com.google.android.gms.dynamic.b a(C18212a c18212a) throws MlKitException {
        int iE = c18212a.e();
        if (iE != -1) {
            if (iE != 17) {
                if (iE != 35) {
                    if (iE != 842094169) {
                        throw new MlKitException("Unsupported image format: " + c18212a.e(), 3);
                    }
                } else {
                    return com.google.android.gms.dynamic.d.F2(c18212a.g());
                }
            }
            return com.google.android.gms.dynamic.d.F2((ByteBuffer) r.l(c18212a.c()));
        }
        return com.google.android.gms.dynamic.d.F2((Bitmap) r.l(c18212a.b()));
    }

    public int c(C18212a c18212a) {
        if (c18212a.e() == -1) {
            return ((Bitmap) r.l(c18212a.b())).getAllocationByteCount();
        }
        if (c18212a.e() != 17 && c18212a.e() != 842094169) {
            if (c18212a.e() != 35) {
                return 0;
            }
            return (((Image.Plane[]) r.l(c18212a.h()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) r.l(c18212a.c())).limit();
    }
}

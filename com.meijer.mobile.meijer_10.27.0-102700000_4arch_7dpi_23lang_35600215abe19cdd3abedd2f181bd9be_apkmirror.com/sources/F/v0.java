package F;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class v0 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);


        /* renamed from: a, reason: collision with root package name */
        final int f10055a;

        int b() {
            return this.f10055a;
        }

        a(int i10) {
            this.f10055a = i10;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public static v0 a(b bVar, a aVar) {
        return new C3609f(bVar, aVar, 0L);
    }

    public static v0 b(b bVar, a aVar, long j10) {
        return new C3609f(bVar, aVar, j10);
    }

    public static b e(int i10) {
        return i10 == 35 ? b.YUV : i10 == 256 ? b.JPEG : i10 == 4101 ? b.JPEG_R : i10 == 32 ? b.RAW : b.PRIV;
    }

    v0() {
    }

    public static v0 h(int i10, int i11, Size size, w0 w0Var) {
        b bVarE = e(i11);
        a aVar = a.NOT_SUPPORT;
        int iB = N.c.b(size);
        if (i10 == 1) {
            if (iB <= N.c.b(w0Var.i(i11))) {
                aVar = a.s720p;
            } else if (iB <= N.c.b(w0Var.g(i11))) {
                aVar = a.s1440p;
            }
        } else if (iB <= N.c.b(w0Var.b())) {
            aVar = a.VGA;
        } else if (iB <= N.c.b(w0Var.e())) {
            aVar = a.PREVIEW;
        } else if (iB <= N.c.b(w0Var.f())) {
            aVar = a.RECORD;
        } else if (iB <= N.c.b(w0Var.c(i11))) {
            aVar = a.MAXIMUM;
        } else {
            Size sizeK = w0Var.k(i11);
            if (sizeK != null && iB <= N.c.b(sizeK)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(bVarE, aVar);
    }

    public final boolean g(v0 v0Var) {
        b bVarD = v0Var.d();
        if (v0Var.c().b() <= c().b() && bVarD == d()) {
            return true;
        }
        return false;
    }
}

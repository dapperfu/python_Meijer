package g1;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lg1/B;", "", "a", "(Lg1/B;)Z", "b", "c", "d", "k", "LU0/f;", "h", "(Lg1/B;)J", "i", "ignoreConsumed", "j", "(Lg1/B;Z)J", "", "e", "(Lg1/B;)V", "LH1/r;", "size", "f", "(Lg1/B;J)Z", "LU0/k;", "extendedTouchPadding", "g", "(Lg1/B;JJ)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {
    public static final long h(PointerInputChange pointerInputChange) {
        return j(pointerInputChange, false);
    }

    public static final long i(PointerInputChange pointerInputChange) {
        return j(pointerInputChange, true);
    }

    public static final boolean k(PointerInputChange pointerInputChange) {
        return !U0.f.j(j(pointerInputChange, true), U0.f.INSTANCE.c());
    }

    public static final boolean a(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.p() && !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.p() && pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean d(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static final void e(PointerInputChange pointerInputChange) {
        pointerInputChange.a();
    }

    @Deprecated
    public static final boolean f(PointerInputChange pointerInputChange, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        boolean z13 = false;
        if (fIntBitsToFloat < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fIntBitsToFloat > i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z11 | z10;
        if (fIntBitsToFloat2 < 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 | z12;
        if (fIntBitsToFloat2 > i11) {
            z13 = true;
        }
        return z15 | z13;
    }

    public static final boolean g(PointerInputChange pointerInputChange, long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zG = O.g(pointerInputChange.getType(), O.INSTANCE.d());
        long position = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zG ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        float f13 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat4;
        boolean z13 = false;
        if (fIntBitsToFloat < (-f11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fIntBitsToFloat > f12) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z11 | z10;
        if (fIntBitsToFloat2 < (-fIntBitsToFloat4)) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 | z12;
        if (fIntBitsToFloat2 > f13) {
            z13 = true;
        }
        return z15 | z13;
    }

    private static final long j(PointerInputChange pointerInputChange, boolean z10) {
        long jP = U0.f.p(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        if (!z10 && pointerInputChange.p()) {
            return U0.f.INSTANCE.c();
        }
        return jP;
    }
}

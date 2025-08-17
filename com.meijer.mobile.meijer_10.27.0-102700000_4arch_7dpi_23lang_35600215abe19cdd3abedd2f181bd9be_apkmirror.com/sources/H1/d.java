package H1;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u0006*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\t*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\t*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"LH1/d;", "LH1/l;", "LH1/h;", "", "I1", "(F)F", "", "E0", "(F)I", "LH1/v;", "N0", "(J)F", "N1", "(J)I", "K", "(I)F", "w", "(I)J", "L", "x", "(F)J", "LH1/k;", "LU0/k;", "T", "(J)J", "p", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface d extends l {
    default float K(int i10) {
        return h.p(i10 / getDensity());
    }

    float getDensity();

    default int E0(float f10) {
        float fI1 = I1(f10);
        if (Float.isInfinite(fI1)) {
            return a.e.API_PRIORITY_OTHER;
        }
        return Math.round(fI1);
    }

    default float I1(float f10) {
        return f10 * getDensity();
    }

    default float L(float f10) {
        return h.p(f10 / getDensity());
    }

    default float N0(long j10) {
        if (!x.g(v.g(j10), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        return I1(t(j10));
    }

    default int N1(long j10) {
        return Math.round(N0(j10));
    }

    default long w(int i10) {
        return o(K(i10));
    }

    default long x(float f10) {
        return o(L(f10));
    }

    default long T(long j10) {
        if (j10 != 9205357640488583168L) {
            float fI1 = I1(k.h(j10));
            float fI12 = I1(k.g(j10));
            return U0.k.d((Float.floatToRawIntBits(fI12) & 4294967295L) | (Float.floatToRawIntBits(fI1) << 32));
        }
        return U0.k.INSTANCE.a();
    }

    default long p(long j10) {
        if (j10 != 9205357640488583168L) {
            return i.b(L(Float.intBitsToFloat((int) (j10 >> 32))), L(Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
        return k.INSTANCE.a();
    }
}

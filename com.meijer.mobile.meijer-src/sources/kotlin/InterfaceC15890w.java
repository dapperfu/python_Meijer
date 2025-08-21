package kotlin;

import H1.v;
import H1.w;
import H1.x;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import i0.C14592e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\n*\u00020\u000bH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0018*\u00020\u0019H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u0082\u0001\u0001\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Ln0/w;", "Landroidx/compose/ui/layout/K;", "", "index", "LH1/b;", "constraints", "", "Landroidx/compose/ui/layout/f0;", "p0", "(IJ)Ljava/util/List;", "LH1/v;", "LH1/h;", "t", "(J)F", "K", "(I)F", "", "L", "(F)F", "x", "(F)J", "w", "(I)J", "o", "LH1/k;", "LU0/k;", "T", "(J)J", "p", "Ln0/x;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15890w extends K {
    @Override // H1.d
    default float K(int i10) {
        return H1.h.p(i10 / getDensity());
    }

    List<f0> p0(int index, long constraints);

    @Override // H1.d
    default long w(int i10) {
        return w.h(i10 / (getFontScale() * getDensity()));
    }

    @Override // H1.d
    default float L(float f10) {
        return H1.h.p(f10 / getDensity());
    }

    @Override // H1.l
    default long o(float f10) {
        return w.h(f10 / getFontScale());
    }

    @Override // H1.l
    default float t(long j10) {
        if (!x.g(v.g(j10), x.INSTANCE.b())) {
            C14592e.c("Only Sp can convert to Px");
        }
        return H1.h.p(v.h(j10) * getFontScale());
    }

    @Override // H1.d
    default long x(float f10) {
        return w.h(f10 / (getFontScale() * getDensity()));
    }

    @Override // H1.d
    default long T(long j10) {
        if (j10 != 9205357640488583168L) {
            float fI1 = I1(H1.k.h(j10));
            float fI12 = I1(H1.k.g(j10));
            return U0.k.d((Float.floatToRawIntBits(fI12) & 4294967295L) | (Float.floatToRawIntBits(fI1) << 32));
        }
        return U0.k.INSTANCE.a();
    }

    @Override // H1.d
    default long p(long j10) {
        if (j10 != 9205357640488583168L) {
            return H1.i.b(L(Float.intBitsToFloat((int) (j10 >> 32))), L(Float.intBitsToFloat((int) (j10 & 4294967295L))));
        }
        return H1.k.INSTANCE.a();
    }
}

package H1;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u001c\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0018\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001e\u0010\u001a\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a*\u0010 \u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"", "widthVal", "heightVal", "", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "LH1/b;", "h", "(IIII)J", "c", "(I)I", "a", "otherConstraints", "e", "(JJ)J", "LH1/r;", "d", "width", "g", "(JI)I", "height", "f", "horizontal", "vertical", "i", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    public static final int c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        if (i10 < 262143) {
            return 18;
        }
        return l3.f92484c;
    }

    public static final long d(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iN = b.n(j10);
        int iL = b.l(j10);
        if (i10 < iN) {
            i10 = iN;
        }
        if (i10 <= iL) {
            iL = i10;
        }
        int i11 = (int) (j11 & 4294967295L);
        int iM = b.m(j10);
        int iK = b.k(j10);
        if (i11 < iM) {
            i11 = iM;
        }
        if (i11 <= iK) {
            iK = i11;
        }
        return r.c((iL << 32) | (iK & 4294967295L));
    }

    public static /* synthetic */ long j(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return i(j10, i10, i11);
    }

    public static final void k(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    public static final Void l(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    public static final long e(long j10, long j11) {
        int iN = b.n(j10);
        int iL = b.l(j10);
        int iM = b.m(j10);
        int iK = b.k(j10);
        int iN2 = b.n(j11);
        if (iN2 < iN) {
            iN2 = iN;
        }
        if (iN2 > iL) {
            iN2 = iL;
        }
        int iL2 = b.l(j11);
        if (iL2 >= iN) {
            iN = iL2;
        }
        if (iN <= iL) {
            iL = iN;
        }
        int iM2 = b.m(j11);
        if (iM2 < iM) {
            iM2 = iM;
        }
        if (iM2 > iK) {
            iM2 = iK;
        }
        int iK2 = b.k(j11);
        if (iK2 >= iM) {
            iM = iK2;
        }
        if (iM <= iK) {
            iK = iM;
        }
        return a(iN2, iL, iM2, iK);
    }

    public static final int f(long j10, int i10) {
        int iM = b.m(j10);
        int iK = b.k(j10);
        if (i10 < iM) {
            i10 = iM;
        }
        if (i10 > iK) {
            return iK;
        }
        return i10;
    }

    public static final int g(long j10, int i10) {
        int iN = b.n(j10);
        int iL = b.l(j10);
        if (i10 < iN) {
            i10 = iN;
        }
        if (i10 > iL) {
            return iL;
        }
        return i10;
    }

    public static final long h(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (i13 == Integer.MAX_VALUE) {
            i14 = i12;
        } else {
            i14 = i13;
        }
        int iC = c(i14);
        if (i11 == Integer.MAX_VALUE) {
            i15 = i10;
        } else {
            i15 = i11;
        }
        int iC2 = c(i15);
        if (iC + iC2 > 31) {
            k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iC2 - 13;
        return b.b(((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iC2 + 2)) | ((i17 & (~(i17 >> 31))) << (iC2 + 33)));
    }

    public static final long i(long j10, int i10, int i11) {
        int iN = b.n(j10) + i10;
        int i12 = 0;
        if (iN < 0) {
            iN = 0;
        }
        int iL = b.l(j10);
        if (iL != Integer.MAX_VALUE && (iL = iL + i10) < 0) {
            iL = 0;
        }
        int iM = b.m(j10) + i11;
        if (iM < 0) {
            iM = 0;
        }
        int iK = b.k(j10);
        if (iK == Integer.MAX_VALUE || (iK = iK + i11) >= 0) {
            i12 = iK;
        }
        return a(iN, iL, iM, i12);
    }
}

package j0;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\rJ;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0088\u0001\u000e\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lj0/B;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "a", "(IIII)J", "LH1/b;", "c", "Lj0/y;", "orientation", "(JLj0/y;)J", "value", "b", "(J)J", "f", "d", "(JIIII)J", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: j0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14793B {
    private static long b(long j10) {
        return j10;
    }

    public static long c(long j10, y yVar) {
        y yVar2 = y.f139163a;
        return a(yVar == yVar2 ? H1.b.n(j10) : H1.b.m(j10), yVar == yVar2 ? H1.b.l(j10) : H1.b.k(j10), yVar == yVar2 ? H1.b.m(j10) : H1.b.n(j10), yVar == yVar2 ? H1.b.k(j10) : H1.b.l(j10));
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = H1.b.n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = H1.b.l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = H1.b.m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = H1.b.k(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static final long f(long j10, y yVar) {
        return yVar == y.f139163a ? H1.c.a(H1.b.n(j10), H1.b.l(j10), H1.b.m(j10), H1.b.k(j10)) : H1.c.a(H1.b.m(j10), H1.b.k(j10), H1.b.n(j10), H1.b.l(j10));
    }

    public static long a(int i10, int i11, int i12, int i13) {
        return b(H1.c.a(i10, i11, i12, i13));
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13);
    }
}

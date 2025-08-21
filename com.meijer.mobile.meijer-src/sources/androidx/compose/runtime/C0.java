package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/C0;", "", "LZ/J;", "list", "b", "(LZ/J;)LZ/J;", "", "value", "", "a", "(LZ/J;I)V", "", "d", "(LZ/J;)Z", "e", "(LZ/J;)I", "f", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C0 {
    public static Z.J b(Z.J j10) {
        return j10;
    }

    public static /* synthetic */ Z.J c(Z.J j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            j10 = new Z.J(0, i11, null);
        }
        return b(j10);
    }

    public static final void a(Z.J j10, int i10) {
        if (j10._size == 0 || !(j10.e(0) == i10 || j10.e(j10._size - 1) == i10)) {
            int i11 = j10._size;
            j10.k(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iE = j10.e(i12);
                if (i10 <= iE) {
                    break;
                }
                j10.p(i11, iE);
                i11 = i12;
            }
            j10.p(i11, i10);
        }
    }

    public static final boolean d(Z.J j10) {
        return j10._size != 0;
    }

    public static final int f(Z.J j10) {
        int iE;
        int i10 = j10._size;
        int iE2 = j10.e(0);
        while (j10._size != 0 && j10.e(0) == iE2) {
            j10.p(0, j10.i());
            j10.o(j10._size - 1);
            int i11 = j10._size;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iE3 = j10.e(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iE4 = j10.e(i15);
                if (i14 >= i11 || (iE = j10.e(i14)) <= iE4) {
                    if (iE4 > iE3) {
                        j10.p(i13, iE4);
                        j10.p(i15, iE3);
                        i13 = i15;
                    }
                } else if (iE > iE3) {
                    j10.p(i13, iE);
                    j10.p(i14, iE3);
                    i13 = i14;
                }
            }
        }
        return iE2;
    }

    public static final int e(Z.J j10) {
        return j10.d();
    }
}

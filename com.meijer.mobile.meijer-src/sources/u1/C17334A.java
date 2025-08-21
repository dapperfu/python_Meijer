package u1;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/y;", "range", "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "start", "end", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", "d", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17334A {
    private static final long d(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            A1.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return androidx.compose.ui.text.y.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int iN = androidx.compose.ui.text.y.n(j10);
        if (iN < i10) {
            iN = i10;
        }
        if (iN > i11) {
            iN = i11;
        }
        int i12 = androidx.compose.ui.text.y.i(j10);
        if (i12 >= i10) {
            i10 = i12;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        if (iN == androidx.compose.ui.text.y.n(j10) && i11 == androidx.compose.ui.text.y.i(j10)) {
            return j10;
        }
        return b(iN, i11);
    }

    public static final String e(CharSequence charSequence, long j10) {
        return charSequence.subSequence(androidx.compose.ui.text.y.l(j10), androidx.compose.ui.text.y.k(j10)).toString();
    }
}

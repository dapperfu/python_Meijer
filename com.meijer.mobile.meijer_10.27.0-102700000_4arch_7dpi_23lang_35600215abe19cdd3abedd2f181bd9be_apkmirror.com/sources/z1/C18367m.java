package z1;

import kotlin.Metadata;
import u1.C17207A;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/y;", "target", "deleted", "a", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18367m {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = androidx.compose.ui.text.y.l(j10);
        int iK = androidx.compose.ui.text.y.k(j10);
        if (androidx.compose.ui.text.y.p(j11, j10)) {
            if (androidx.compose.ui.text.y.d(j11, j10)) {
                iL = androidx.compose.ui.text.y.l(j11);
                iK = iL;
            } else {
                if (androidx.compose.ui.text.y.d(j10, j11)) {
                    iJ = androidx.compose.ui.text.y.j(j11);
                } else if (androidx.compose.ui.text.y.e(j11, iL)) {
                    iL = androidx.compose.ui.text.y.l(j11);
                    iJ = androidx.compose.ui.text.y.j(j11);
                } else {
                    iK = androidx.compose.ui.text.y.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > androidx.compose.ui.text.y.l(j11)) {
            iL -= androidx.compose.ui.text.y.j(j11);
            iJ = androidx.compose.ui.text.y.j(j11);
            iK -= iJ;
        }
        return C17207A.b(iL, iK);
    }
}

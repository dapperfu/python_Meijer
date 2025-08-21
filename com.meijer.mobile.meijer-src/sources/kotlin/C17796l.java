package kotlin;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Selection;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lw0/D;", "Lu1/v;", "textLayoutResult", "LU0/f;", "localPosition", "previousHandlePosition", "", "selectableId", "", "a", "(Lw0/D;Lu1/v;JJJ)V", "Lw0/p$a;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "e", "(Lw0/p$a;Ljava/util/Comparator;JI)I", "position", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Lw0/f;", "f", "(JLandroidx/compose/ui/geometry/Rect;)Lw0/f;", "g", "anchorSelectableId", "c", "(Lw0/D;JJ)Lw0/f;", "currentDirection", "otherDirection", "", "h", "(Lw0/f;Lw0/f;)Z", "d", "(JLu1/v;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17796l {
    public static final void a(C17765D c17765d, TextLayoutResult textLayoutResult, long j10, long j11, long j12) {
        EnumC17790f enumC17790f;
        EnumC17790f enumC17790f2;
        long j13;
        EnumC17790f enumC17790fB;
        EnumC17790f enumC17790f3;
        EnumC17790f enumC17790fB2;
        EnumC17790f enumC17790f4;
        EnumC17790f enumC17790f5;
        int iD;
        int iE;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Rect rect = new Rect(0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L));
        EnumC17790f enumC17790fF = f(j10, rect);
        EnumC17790f enumC17790fG = g(j10, rect);
        if (c17765d.getIsStartHandle()) {
            Selection previousSelection = c17765d.getPreviousSelection();
            enumC17790f = enumC17790fG;
            enumC17790f2 = enumC17790fF;
            j13 = j12;
            enumC17790f4 = enumC17790f2;
            enumC17790fB2 = b(enumC17790f2, enumC17790f, c17765d, j12, previousSelection != null ? previousSelection.getEnd() : null);
            enumC17790f3 = enumC17790fB2;
            enumC17790f5 = enumC17790f3;
            enumC17790fB = enumC17790f;
        } else {
            enumC17790f = enumC17790fG;
            enumC17790f2 = enumC17790fF;
            Selection previousSelection2 = c17765d.getPreviousSelection();
            j13 = j12;
            enumC17790fB = b(enumC17790f2, enumC17790f, c17765d, j13, previousSelection2 != null ? previousSelection2.getStart() : null);
            enumC17790f3 = enumC17790f2;
            enumC17790fB2 = enumC17790f;
            enumC17790f4 = enumC17790fB;
            enumC17790f5 = enumC17790f4;
        }
        if (h(C17766E.f(enumC17790f2, enumC17790f), enumC17790f5)) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            if (c17765d.getIsStartHandle()) {
                iE = d(j10, textLayoutResult);
                Selection previousSelection3 = c17765d.getPreviousSelection();
                iD = (previousSelection3 == null || (end = previousSelection3.getEnd()) == null) ? iE : e(end, c17765d.g(), j13, length);
            } else {
                iD = d(j10, textLayoutResult);
                Selection previousSelection4 = c17765d.getPreviousSelection();
                iE = (previousSelection4 == null || (start = previousSelection4.getStart()) == null) ? iD : e(start, c17765d.g(), j13, length);
            }
            c17765d.a(j13, iE, enumC17790f4, enumC17790fB, iD, enumC17790f3, enumC17790fB2, (9223372034707292159L & j11) == 9205357640488583168L ? -1 : d(j11, textLayoutResult), textLayoutResult);
        }
    }

    private static final EnumC17790f b(EnumC17790f enumC17790f, EnumC17790f enumC17790f2, C17765D c17765d, long j10, Selection.AnchorInfo anchorInfo) {
        EnumC17790f enumC17790fC;
        return (anchorInfo == null || (enumC17790fC = c(c17765d, anchorInfo.getSelectableId(), j10)) == null) ? C17766E.f(enumC17790f, enumC17790f2) : enumC17790fC;
    }

    private static final EnumC17790f f(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        return Float.intBitsToFloat(i10) < rect.getLeft() ? EnumC17790f.f166727a : Float.intBitsToFloat(i10) > rect.l() ? EnumC17790f.f166729c : EnumC17790f.f166728b;
    }

    private static final boolean h(EnumC17790f enumC17790f, EnumC17790f enumC17790f2) {
        return enumC17790f == EnumC17790f.f166728b || enumC17790f != enumC17790f2;
    }

    private static final EnumC17790f c(C17765D c17765d, long j10, long j11) {
        int iCompare = c17765d.g().compare(Long.valueOf(j10), Long.valueOf(j11));
        if (iCompare < 0) {
            return EnumC17790f.f166727a;
        }
        if (iCompare > 0) {
            return EnumC17790f.f166729c;
        }
        return EnumC17790f.f166728b;
    }

    private static final int e(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j10, int i10) {
        int iCompare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j10));
        if (iCompare < 0) {
            return 0;
        }
        if (iCompare > 0) {
            return i10;
        }
        return anchorInfo.getOffset();
    }

    private static final int d(long j10, TextLayoutResult textLayoutResult) {
        int i10 = (int) (4294967295L & j10);
        if (Float.intBitsToFloat(i10) <= 0.0f) {
            return 0;
        }
        if (Float.intBitsToFloat(i10) >= textLayoutResult.getMultiParagraph().getHeight()) {
            return textLayoutResult.getLayoutInput().getText().length();
        }
        return textLayoutResult.x(j10);
    }

    private static final EnumC17790f g(long j10, Rect rect) {
        int i10 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) < rect.getTop()) {
            return EnumC17790f.f166727a;
        }
        if (Float.intBitsToFloat(i10) > rect.i()) {
            return EnumC17790f.f166729c;
        }
        return EnumC17790f.f166728b;
    }
}

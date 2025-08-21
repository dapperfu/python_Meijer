package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u1.Placeholder;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ar\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lu1/v;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "", "maxLines", "", "softWrap", "LF1/t;", "overflow", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Ly1/l$b;", "fontFamilyResolver", "LH1/b;", "constraints", "a", "(Lu1/v;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ljava/util/List;IZILH1/d;LH1/t;Ly1/l$b;J)Z", "offset", "", "b", "(Lu1/v;I)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {
    public static final float b(TextLayoutResult textLayoutResult, int i10) {
        if (i10 < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().p(i10), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i10 > androidx.compose.ui.text.g.o(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().r(iMin);
    }

    public static final boolean a(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, H1.d dVar, H1.t tVar, AbstractC18269l.b bVar, long j10) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().a() || !Intrinsics.e(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().G(textStyle) || !Intrinsics.e(layoutInput.g(), list) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z10 || !F1.t.g(layoutInput.getOverflow(), i11) || !Intrinsics.e(layoutInput.getDensity(), dVar) || layoutInput.getLayoutDirection() != tVar || !Intrinsics.e(layoutInput.getFontFamilyResolver(), bVar) || H1.b.n(j10) != H1.b.n(layoutInput.getConstraints())) {
            return false;
        }
        if (!z10 && !F1.t.g(i11, F1.t.INSTANCE.b())) {
            return true;
        }
        if (H1.b.l(j10) != H1.b.l(layoutInput.getConstraints()) || H1.b.k(j10) != H1.b.k(layoutInput.getConstraints())) {
            return false;
        }
        return true;
    }
}

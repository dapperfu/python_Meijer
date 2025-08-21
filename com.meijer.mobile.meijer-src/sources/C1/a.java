package C1;

import F1.k;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.A;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.f;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.C18239F;
import kotlin.C18263f;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "LC1/v;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(Landroidx/compose/ui/text/AnnotatedString;LH1/d;Ly1/l$b;LC1/v;)Landroid/text/SpannableString;", "Landroidx/compose/ui/text/s;", "spanStyle", "", "start", "end", "", "a", "(Landroid/text/SpannableString;Landroidx/compose/ui/text/s;IILH1/d;Ly1/l$b;)V", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/f$b;", "c", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroidx/compose/ui/text/AnnotatedString$d;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i10, int i11, H1.d dVar, AbstractC18269l.b bVar) {
        D1.c.m(spannableString, spanStyle.g(), i10, i11);
        D1.c.q(spannableString, spanStyle.getFontSize(), dVar, i10, i11);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.e();
            }
            C18280w fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(C18263f.c(fontWeight, fontStyle != null ? fontStyle.getValue() : C18280w.INSTANCE.b())), i10, i11, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof C18239F) {
                spannableString.setSpan(new TypefaceSpan(((C18239F) spanStyle.getFontFamily()).getName()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC18269l fontFamily = spanStyle.getFontFamily();
                C18281x fontSynthesis = spanStyle.getFontSynthesis();
                Object value = AbstractC18269l.b.a(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : C18281x.INSTANCE.a(), 6, null).getValue();
                Intrinsics.h(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(l.f4039a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            F1.k textDecoration = spanStyle.getTextDecoration();
            k.Companion companion = F1.k.INSTANCE;
            if (textDecoration.d(companion.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i10, i11, 33);
        }
        D1.c.u(spannableString, spanStyle.getLocaleList(), i10, i11);
        D1.c.i(spannableString, spanStyle.getBackground(), i10, i11);
    }

    public static final SpannableString b(AnnotatedString annotatedString, H1.d dVar, AbstractC18269l.b bVar, v vVar) {
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> listI = annotatedString.i();
        if (listI != null) {
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<SpanStyle> range = listI.get(i10);
                a(spannableString, SpanStyle.b(range.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.getStart(), range.getEnd(), dVar, bVar);
            }
        }
        List<AnnotatedString.Range<A>> listL = annotatedString.l(0, annotatedString.length());
        int size2 = listL.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<A> range2 = listL.get(i11);
            spannableString.setSpan(D1.e.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> listM = annotatedString.m(0, annotatedString.length());
        int size3 = listM.size();
        for (int i12 = 0; i12 < size3; i12++) {
            AnnotatedString.Range<UrlAnnotation> range3 = listM.get(i12);
            spannableString.setSpan(vVar.c(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        List<AnnotatedString.Range<androidx.compose.ui.text.f>> listE = annotatedString.e(0, annotatedString.length());
        int size4 = listE.size();
        for (int i13 = 0; i13 < size4; i13++) {
            AnnotatedString.Range<androidx.compose.ui.text.f> range4 = listE.get(i13);
            if (range4.h() != range4.f()) {
                androidx.compose.ui.text.f fVarG = range4.g();
                if ((fVarG instanceof f.b) && fVarG.getLinkInteractionListener() == null) {
                    spannableString.setSpan(vVar.b(c(range4)), range4.h(), range4.f(), 33);
                } else {
                    spannableString.setSpan(vVar.a(range4), range4.h(), range4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final AnnotatedString.Range<f.b> c(AnnotatedString.Range<androidx.compose.ui.text.f> range) {
        androidx.compose.ui.text.f fVarG = range.g();
        Intrinsics.h(fVarG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new AnnotatedString.Range<>((f.b) fVarG, range.h(), range.f());
    }
}

package v1;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Lv1/r0;", "a", "(II)J", "Lv1/o0;", "l", "(Lv1/o0;)J", "", "Lx1/h;", "i", "([Lx1/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "h", "(Lv1/o0;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lx1/h;)Landroid/graphics/Paint$FontMetricsInt;", "j", "(Lv1/o0;)[Lx1/h;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "Lv1/n0;", "Lv1/n0;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final n0 f164412a = new n0();

    /* renamed from: b, reason: collision with root package name */
    private static final long f164413b = a(0, 0);

    public static final long a(int i10, int i11) {
        return r0.a((i11 & 4294967295L) | (i10 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(x1.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (x1.h hVar : hVarArr) {
            if (hVar.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.getFirstAscentDiff()));
            }
            if (hVar.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f164413b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(o0 o0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, x1.h[] hVarArr) {
        int iM = o0Var.m() - 1;
        if (o0Var.i().getLineStart(iM) != o0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        x1.h hVar = (x1.h) ArraysKt.f0(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.getTrimLastLineBottom()) ? hVar.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutB = j0.b(j0.f164362a, spannableString, textPaint, a.e.API_PRIORITY_OTHER, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, o0Var.h(), o0Var.e(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutB.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutB.getLineDescent(0);
        fontMetricsInt.top = staticLayoutB.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutB.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1.h[] j(o0 o0Var) {
        if (!(o0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = o0Var.G();
        Intrinsics.h(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!U.a((Spanned) charSequenceG, x1.h.class) && o0Var.G().length() > 0) {
            return null;
        }
        CharSequence charSequenceG2 = o0Var.G();
        Intrinsics.h(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (x1.h[]) ((Spanned) charSequenceG2).getSpans(0, o0Var.G().length(), x1.h.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(o0 o0Var) {
        int topPadding;
        int bottomPadding;
        if (!o0Var.h() && !o0Var.J()) {
            TextPaint paint = o0Var.i().getPaint();
            CharSequence text = o0Var.i().getText();
            Rect rectC = T.c(paint, text, o0Var.i().getLineStart(0), o0Var.i().getLineEnd(0));
            int lineAscent = o0Var.i().getLineAscent(0);
            int i10 = rectC.top;
            if (i10 < lineAscent) {
                topPadding = lineAscent - i10;
            } else {
                topPadding = o0Var.i().getTopPadding();
            }
            if (o0Var.m() != 1) {
                int iM = o0Var.m() - 1;
                rectC = T.c(paint, text, o0Var.i().getLineStart(iM), o0Var.i().getLineEnd(iM));
            }
            int lineDescent = o0Var.i().getLineDescent(o0Var.m() - 1);
            int i11 = rectC.bottom;
            if (i11 > lineDescent) {
                bottomPadding = i11 - lineDescent;
            } else {
                bottomPadding = o0Var.i().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return f164413b;
            }
            return a(topPadding, bottomPadding);
        }
        return f164413b;
    }

    public static final boolean m(Layout layout, int i10) {
        if (layout.getEllipsisCount(i10) > 0) {
            return true;
        }
        return false;
    }
}

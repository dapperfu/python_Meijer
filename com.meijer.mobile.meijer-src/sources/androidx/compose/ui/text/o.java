package androidx.compose.ui.text;

import F1.LineHeightStyle;
import F1.TextIndent;
import F1.e;
import F1.f;
import F1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17335B;
import u1.C17337b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001af\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/n;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/n;Landroidx/compose/ui/text/n;F)Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/p;", "c", "(Landroidx/compose/ui/text/p;Landroidx/compose/ui/text/p;F)Landroidx/compose/ui/text/p;", "style", "LH1/t;", "direction", "e", "(Landroidx/compose/ui/text/n;LH1/t;)Landroidx/compose/ui/text/n;", "LF1/j;", "textAlign", "LF1/l;", "textDirection", "LH1/v;", "lineHeight", "LF1/q;", "textIndent", "platformStyle", "LF1/h;", "lineHeightStyle", "LF1/f;", "lineBreak", "LF1/e;", "hyphens", "LF1/s;", "textMotion", "a", "(Landroidx/compose/ui/text/n;IIJLF1/q;Landroidx/compose/ui/text/p;LF1/h;IILF1/s;)Landroidx/compose/ui/text/n;", "other", "d", "(Landroidx/compose/ui/text/n;Landroidx/compose/ui/text/p;)Landroidx/compose/ui/text/p;", "J", "DefaultLineHeight", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final long f52787a = H1.v.INSTANCE.a();

    public static final ParagraphStyle a(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar) {
        long j11;
        long j12;
        int textAlign = i10;
        TextIndent textIndent2 = textIndent;
        j.Companion companion = F1.j.INSTANCE;
        if (F1.j.k(textAlign, companion.g()) || F1.j.k(textAlign, paragraphStyle.getTextAlign())) {
            if (H1.v.f(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (H1.v.e(j12, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || Intrinsics.e(textIndent2, paragraphStyle.getTextIndent())) && ((F1.l.j(i11, F1.l.INSTANCE.f()) || F1.l.j(i11, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || Intrinsics.e(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || Intrinsics.e(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((F1.f.f(i12, F1.f.INSTANCE.b()) || F1.f.f(i12, paragraphStyle.getLineBreak())) && ((F1.e.g(i13, F1.e.INSTANCE.c()) || F1.e.g(i13, paragraphStyle.getHyphens())) && (sVar == null || Intrinsics.e(sVar, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long lineHeight = H1.v.f(j12) == j11 ? paragraphStyle.getLineHeight() : j12;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (F1.j.k(textAlign, companion.g())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !F1.l.j(i11, F1.l.INSTANCE.f()) ? i11 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, d(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !F1.f.f(i12, F1.f.INSTANCE.b()) ? i12 : paragraphStyle.getLineBreak(), !F1.e.g(i13, F1.e.INSTANCE.c()) ? i13 : paragraphStyle.getHyphens(), sVar == null ? paragraphStyle.getTextMotion() : sVar, null);
    }

    public static final ParagraphStyle b(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f10) {
        int value = ((F1.j) u1.n.d(F1.j.h(paragraphStyle.getTextAlign()), F1.j.h(paragraphStyle2.getTextAlign()), f10)).getValue();
        int value2 = ((F1.l) u1.n.d(F1.l.g(paragraphStyle.getTextDirection()), F1.l.g(paragraphStyle2.getTextDirection()), f10)).getValue();
        long jF = u1.n.f(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f10);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.a();
        }
        return new ParagraphStyle(value, value2, jF, F1.r.a(textIndent, textIndent2, f10), c(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f10), (LineHeightStyle) u1.n.d(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f10), ((F1.f) u1.n.d(F1.f.c(paragraphStyle.getLineBreak()), F1.f.c(paragraphStyle2.getLineBreak()), f10)).getMask(), ((F1.e) u1.n.d(F1.e.d(paragraphStyle.getHyphens()), F1.e.d(paragraphStyle2.getHyphens()), f10)).getValue(), (F1.s) u1.n.d(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f10), null);
    }

    private static final PlatformParagraphStyle c(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f10) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.a();
        }
        return C17337b.b(platformParagraphStyle, platformParagraphStyle2, f10);
    }

    public static final ParagraphStyle e(ParagraphStyle paragraphStyle, H1.t tVar) {
        int textAlign = paragraphStyle.getTextAlign();
        j.Companion companion = F1.j.INSTANCE;
        int iF = F1.j.k(textAlign, companion.g()) ? companion.f() : paragraphStyle.getTextAlign();
        int iE = C17335B.e(tVar, paragraphStyle.getTextDirection());
        long lineHeight = H1.v.f(paragraphStyle.getLineHeight()) == 0 ? f52787a : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        f.Companion companion2 = F1.f.INSTANCE;
        int iA = F1.f.f(lineBreak, companion2.b()) ? companion2.a() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        e.Companion companion3 = F1.e.INSTANCE;
        int iB = F1.e.g(hyphens, companion3.c()) ? companion3.b() : paragraphStyle.getHyphens();
        F1.s textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = F1.s.INSTANCE.a();
        }
        return new ParagraphStyle(iF, iE, lineHeight, textIndent2, platformStyle, lineHeightStyle, iA, iB, textMotion, null);
    }

    private static final PlatformParagraphStyle d(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().d(platformParagraphStyle);
    }
}

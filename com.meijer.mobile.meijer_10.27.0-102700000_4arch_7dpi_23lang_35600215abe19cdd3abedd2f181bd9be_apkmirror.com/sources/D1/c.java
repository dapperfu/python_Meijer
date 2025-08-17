package D1;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.k;
import H1.v;
import H1.w;
import H1.x;
import V0.AbstractC5324i0;
import V0.C5349s0;
import V0.Shadow;
import V0.SolidColor;
import V0.z1;
import X0.g;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.C5913b;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.C18153w;
import kotlin.C18154x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import x1.C17989a;
import x1.C17990b;
import x1.f;
import x1.h;
import x1.l;
import x1.m;
import x1.n;
import x1.o;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a.\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a*\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001a\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001aa\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104\u001aY\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0002¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001012\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00112\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000609H\u0000¢\u0006\u0004\b;\u0010<\u001a$\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a.\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a6\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a-\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b^\u0010_\u001a.\u0010`\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b`\u0010L\u001a0\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bc\u0010d\u001a5\u0010h\u001a\u00020\u0006*\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bh\u0010i\u001a\u0013\u0010j\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010m\u001a\u000201*\u0004\u0018\u0001012\u0006\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bm\u0010n\"\u0018\u0010q\u001a\u00020#*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "w", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "LF1/q;", "textIndent", "", "contextFontSize", "LH1/d;", "density", "A", "(Landroid/text/Spannable;LF1/q;FLH1/d;)V", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "l", "(Landroid/text/Spannable;Ljava/util/List;FLH1/d;LF1/q;)V", "LH1/v;", "size", "g", "(JFLH1/d;)F", "lineHeight", "LF1/h;", "lineHeightStyle", "s", "(Landroid/text/Spannable;JFLH1/d;LF1/h;)V", "t", "(Landroid/text/Spannable;JFLH1/d;)V", "h", "", "e", "(LH1/d;)Z", "Landroidx/compose/ui/text/z;", "contextTextStyle", "Lkotlin/Function4;", "Ly1/l;", "Ly1/B;", "Ly1/w;", "Ly1/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "y", "(Landroid/text/Spannable;Landroidx/compose/ui/text/z;Ljava/util/List;LH1/d;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/ui/text/s;", "style", "x", "(Landroid/text/Spannable;Landroidx/compose/ui/text/s;IILH1/d;)V", "o", "(Landroid/text/Spannable;Landroidx/compose/ui/text/z;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "b", "(Landroidx/compose/ui/text/s;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLH1/d;)Landroid/text/style/MetricAffectingSpan;", "LV0/B1;", "shadow", "v", "(Landroid/text/Spannable;LV0/B1;II)V", "LX0/g;", "drawStyle", "n", "(Landroid/text/Spannable;LX0/g;II)V", "LV0/q0;", "color", "i", "(Landroid/text/Spannable;JII)V", "LB1/e;", "localeList", "u", "(Landroid/text/Spannable;LB1/e;II)V", "LF1/o;", "textGeometricTransform", "r", "(Landroid/text/Spannable;LF1/o;II)V", "", "fontFeatureSettings", "p", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "q", "(Landroid/text/Spannable;JLH1/d;II)V", "LF1/k;", "textDecoration", "z", "(Landroid/text/Spannable;LF1/k;II)V", "m", "LF1/a;", "baselineShift", "j", "(Landroid/text/Spannable;LF1/a;II)V", "LV0/i0;", "brush", "alpha", "k", "(Landroid/text/Spannable;LV0/i0;FII)V", "d", "(Landroidx/compose/ui/text/z;)Z", "spanStyle", "f", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;)Landroidx/compose/ui/text/s;", "c", "(Landroidx/compose/ui/text/s;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/s;", "spanStyle", "", "start", "end", "", "a", "(Landroidx/compose/ui/text/s;II)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Spannable f5012f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function4<AbstractC18142l, FontWeight, C18153w, C18154x, Typeface> f5013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, Function4<? super AbstractC18142l, ? super FontWeight, ? super C18153w, ? super C18154x, ? extends Typeface> function4) {
            super(3);
            this.f5012f = spannable;
            this.f5013g = function4;
        }

        public final void a(SpanStyle spanStyle, int i10, int i11) {
            Spannable spannable = this.f5012f;
            Function4<AbstractC18142l, FontWeight, C18153w, C18154x, Typeface> function4 = this.f5013g;
            AbstractC18142l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.e();
            }
            C18153w fontStyle = spanStyle.getFontStyle();
            C18153w c18153wC = C18153w.c(fontStyle != null ? fontStyle.getValue() : C18153w.INSTANCE.b());
            C18154x fontSynthesis = spanStyle.getFontSynthesis();
            spannable.setSpan(new o(function4.invoke(fontFamily, fontWeight, c18153wC, C18154x.e(fontSynthesis != null ? fontSynthesis.getValue() : C18154x.INSTANCE.a()))), i10, i11, 33);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
            a(spanStyle, num.intValue(), num2.intValue());
            return Unit.f142422a;
        }
    }

    public static final void A(Spannable spannable, TextIndent textIndent, float f10, H1.d dVar) {
        if (textIndent != null) {
            if ((v.e(textIndent.getFirstLine(), w.i(0)) && v.e(textIndent.getRestLine(), w.i(0))) || v.f(textIndent.getFirstLine()) == 0 || v.f(textIndent.getRestLine()) == 0) {
                return;
            }
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            float fH = 0.0f;
            float fN0 = x.g(jG, companion.b()) ? dVar.N0(textIndent.getFirstLine()) : x.g(jG, companion.a()) ? v.h(textIndent.getFirstLine()) * f10 : 0.0f;
            long jG2 = v.g(textIndent.getRestLine());
            if (x.g(jG2, companion.b())) {
                fH = dVar.N0(textIndent.getRestLine());
            } else if (x.g(jG2, companion.a())) {
                fH = v.h(textIndent.getRestLine()) * f10;
            }
            w(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fN0), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }

    private static final SpanStyle f(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.y(spanStyle2);
    }

    private static final float g(long j10, float f10, H1.d dVar) {
        if (v.e(j10, v.INSTANCE.a())) {
            return f10;
        }
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return dVar.N0(j10);
        }
        if (x.g(jG, companion.a())) {
            return v.h(j10) * f10;
        }
        return Float.NaN;
    }

    public static final void i(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            w(spannable, new BackgroundColorSpan(C5349s0.j(j10)), i10, i11);
        }
    }

    private static final void j(Spannable spannable, F1.a aVar, int i10, int i11) {
        if (aVar != null) {
            w(spannable, new C17989a(aVar.getMultiplier()), i10, i11);
        }
    }

    private static final void k(Spannable spannable, AbstractC5324i0 abstractC5324i0, float f10, int i10, int i11) {
        if (abstractC5324i0 != null) {
            if (abstractC5324i0 instanceof SolidColor) {
                m(spannable, ((SolidColor) abstractC5324i0).getValue(), i10, i11);
            } else if (abstractC5324i0 instanceof z1) {
                w(spannable, new E1.e((z1) abstractC5324i0, f10), i10, i11);
            }
        }
    }

    public static final void l(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, float f10, H1.d dVar, TextIndent textIndent) {
        H1.d dVar2 = dVar;
        float fH = 0.0f;
        if (textIndent != null) {
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            if (x.g(jG, companion.b())) {
                fH = dVar2.N0(textIndent.getFirstLine());
            } else if (x.g(jG, companion.a())) {
                fH = v.h(textIndent.getFirstLine()) * f10;
            }
        }
        float f11 = fH;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            AnnotatedString.Range<? extends AnnotatedString.a> range = list.get(i10);
            AnnotatedString.a aVarG = range.g();
            Bullet bullet = aVarG instanceof Bullet ? (Bullet) aVarG : null;
            if (bullet != null) {
                float fG = g(bullet.getSize(), f10, dVar2);
                float fG2 = g(bullet.getPadding(), f10, dVar2);
                if (!Float.isNaN(fG) && !Float.isNaN(fG2)) {
                    w(spannable, new E1.b(bullet.getShape(), fG, fG, fG2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), dVar2, f11), range.h(), range.f());
                }
            }
            i10++;
            dVar2 = dVar;
        }
    }

    public static final void m(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            w(spannable, new ForegroundColorSpan(C5349s0.j(j10)), i10, i11);
        }
    }

    private static final void n(Spannable spannable, g gVar, int i10, int i11) {
        if (gVar != null) {
            w(spannable, new E1.c(gVar), i10, i11);
        }
    }

    private static final void o(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, Function4<? super AbstractC18142l, ? super FontWeight, ? super C18153w, ? super C18154x, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.a> range = list.get(i10);
            if ((range.g() instanceof SpanStyle) && (d.d((SpanStyle) range.g()) || ((SpanStyle) range.g()).getFontSynthesis() != null)) {
                Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        b(d(textStyle) ? new SpanStyle(0L, 0L, textStyle.o(), textStyle.m(), textStyle.n(), textStyle.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new a(spannable, function4));
    }

    private static final void p(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            w(spannable, new C17990b(str), i10, i11);
        }
    }

    private static final void r(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            w(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            w(spannable, new m(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    public static final void u(Spannable spannable, LocaleList localeList, int i10, int i11) {
        if (localeList != null) {
            w(spannable, D1.a.f5011a.a(localeList), i10, i11);
        }
    }

    private static final void v(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            w(spannable, new l(C5349s0.j(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), d.b(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void w(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    public static final void z(Spannable spannable, k kVar, int i10, int i11) {
        if (kVar != null) {
            k.Companion companion = k.INSTANCE;
            w(spannable, new n(kVar.d(companion.d()), kVar.d(companion.b())), i10, i11);
        }
    }

    private static final MetricAffectingSpan a(long j10, H1.d dVar) {
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return new f(dVar.N0(j10));
        }
        if (x.g(jG, companion.a())) {
            return new x1.e(v.h(j10));
        }
        return null;
    }

    public static final void b(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> function3) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                function3.invoke(f(spanStyle, list.get(0).g()), Integer.valueOf(list.get(0).h()), Integer.valueOf(list.get(0).f()));
                return;
            }
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i11);
            iArr[i11] = range.h();
            iArr[i11 + size] = range.f();
        }
        ArraysKt.L(iArr);
        int iE0 = ArraysKt.e0(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iE0) {
                int size3 = list2.size();
                SpanStyle spanStyleF = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i14);
                    if (range2.h() != range2.f() && C5913b.i(iE0, i13, range2.h(), range2.f())) {
                        spanStyleF = f(spanStyleF, range2.g());
                    }
                }
                if (spanStyleF != null) {
                    function3.invoke(spanStyleF, Integer.valueOf(iE0), Integer.valueOf(i13));
                }
                iE0 = i13;
            }
        }
    }

    private static final boolean c(SpanStyle spanStyle) {
        long jG = v.g(spanStyle.getLetterSpacing());
        x.Companion companion = x.INSTANCE;
        if (!x.g(jG, companion.b()) && !x.g(v.g(spanStyle.getLetterSpacing()), companion.a())) {
            return false;
        }
        return true;
    }

    private static final boolean d(TextStyle textStyle) {
        if (!d.d(textStyle.getSpanStyle()) && textStyle.n() == null) {
            return false;
        }
        return true;
    }

    private static final boolean e(H1.d dVar) {
        if (dVar.getFontScale() > 1.05d) {
            return true;
        }
        return false;
    }

    private static final float h(long j10, float f10, H1.d dVar) {
        float fH;
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            if (!e(dVar)) {
                return dVar.N0(j10);
            }
            fH = v.h(j10) / v.h(dVar.x(f10));
        } else if (x.g(jG, companion.a())) {
            fH = v.h(j10);
        } else {
            return Float.NaN;
        }
        return fH * f10;
    }

    public static final void q(Spannable spannable, long j10, H1.d dVar, int i10, int i11) {
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            w(spannable, new AbsoluteSizeSpan(MathKt.d(dVar.N0(j10)), false), i10, i11);
        } else if (x.g(jG, companion.a())) {
            w(spannable, new RelativeSizeSpan(v.h(j10)), i10, i11);
        }
    }

    public static final void s(Spannable spannable, long j10, float f10, H1.d dVar, LineHeightStyle lineHeightStyle) {
        int length;
        float fH = h(j10, f10, dVar);
        if (!Float.isNaN(fH)) {
            if (spannable.length() == 0 || StringsKt.H1(spannable) == '\n') {
                length = spannable.length() + 1;
            } else {
                length = spannable.length();
            }
            w(spannable, new h(fH, 0, length, LineHeightStyle.d.h(lineHeightStyle.getTrim()), LineHeightStyle.d.i(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.c.f(lineHeightStyle.getMode(), LineHeightStyle.c.INSTANCE.b())), 0, spannable.length());
        }
    }

    public static final void t(Spannable spannable, long j10, float f10, H1.d dVar) {
        float fH = h(j10, f10, dVar);
        if (!Float.isNaN(fH)) {
            w(spannable, new x1.g(fH), 0, spannable.length());
        }
    }

    private static final void x(Spannable spannable, SpanStyle spanStyle, int i10, int i11, H1.d dVar) {
        j(spannable, spanStyle.getBaselineShift(), i10, i11);
        m(spannable, spanStyle.g(), i10, i11);
        k(spannable, spanStyle.f(), spanStyle.c(), i10, i11);
        z(spannable, spanStyle.getTextDecoration(), i10, i11);
        q(spannable, spanStyle.getFontSize(), dVar, i10, i11);
        p(spannable, spanStyle.getFontFeatureSettings(), i10, i11);
        r(spannable, spanStyle.getTextGeometricTransform(), i10, i11);
        u(spannable, spanStyle.getLocaleList(), i10, i11);
        i(spannable, spanStyle.getBackground(), i10, i11);
        v(spannable, spanStyle.getShadow(), i10, i11);
        n(spannable, spanStyle.getDrawStyle(), i10, i11);
    }

    public static final void y(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, H1.d dVar, Function4<? super AbstractC18142l, ? super FontWeight, ? super C18153w, ? super C18154x, ? extends Typeface> function4) {
        MetricAffectingSpan metricAffectingSpanA;
        o(spannable, textStyle, list, function4);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.a> range = list.get(i10);
            if (range.g() instanceof SpanStyle) {
                int iH = range.h();
                int iF = range.f();
                if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                    x(spannable, (SpanStyle) range.g(), iH, iF, dVar);
                    if (c((SpanStyle) range.g())) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<? extends AnnotatedString.a> range2 = list.get(i11);
                AnnotatedString.a aVarG = range2.g();
                if (aVarG instanceof SpanStyle) {
                    int iH2 = range2.h();
                    int iF2 = range2.f();
                    if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanA = a(((SpanStyle) aVarG).getLetterSpacing(), dVar)) != null) {
                        w(spannable, metricAffectingSpanA, iH2, iF2);
                    }
                }
            }
        }
    }
}

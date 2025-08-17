package D1;

import B1.LocaleList;
import C1.i;
import F1.TextGeometricTransform;
import F1.s;
import H1.v;
import H1.x;
import U0.k;
import V0.C5346q0;
import android.graphics.Typeface;
import androidx.compose.ui.text.SpanStyle;
import kotlin.AbstractC18142l;
import kotlin.C18153w;
import kotlin.C18154x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LC1/i;", "Landroidx/compose/ui/text/s;", "style", "Lkotlin/Function4;", "Ly1/l;", "Ly1/B;", "Ly1/w;", "Ly1/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "LH1/d;", "density", "", "requiresLetterSpacing", "a", "(LC1/i;Landroidx/compose/ui/text/s;Lkotlin/jvm/functions/Function4;LH1/d;Z)Landroidx/compose/ui/text/s;", "LH1/v;", "letterSpacing", "LV0/q0;", "background", "LF1/a;", "baselineShift", "c", "(JZJLF1/a;)Landroidx/compose/ui/text/s;", "LF1/s;", "textMotion", "", "e", "(LC1/i;LF1/s;)V", "d", "(Landroidx/compose/ui/text/s;)Z", "", "blurRadius", "b", "(F)F", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d {
    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final SpanStyle c(long j10, boolean z10, long j11, F1.a aVar) {
        long j12 = j11;
        boolean z11 = false;
        boolean z12 = z10 && x.g(v.g(j10), x.INSTANCE.b()) && v.h(j10) != 0.0f;
        C5346q0.Companion companion = C5346q0.INSTANCE;
        boolean z13 = (C5346q0.s(j12, companion.j()) || C5346q0.s(j12, companion.i())) ? false : true;
        if (aVar != null) {
            if (!F1.a.g(aVar.getMultiplier(), F1.a.INSTANCE.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jA = z12 ? j10 : v.INSTANCE.a();
        if (!z13) {
            j12 = companion.j();
        }
        return new SpanStyle(0L, 0L, null, null, null, null, null, jA, z11 ? aVar : null, null, null, j12, null, null, null, null, 63103, null);
    }

    public static final void e(i iVar, s sVar) {
        if (sVar == null) {
            sVar = s.INSTANCE.a();
        }
        iVar.setFlags(sVar.getSubpixelTextPositioning() ? iVar.getFlags() | 128 : iVar.getFlags() & (-129));
        int linearity = sVar.getLinearity();
        s.b.Companion companion = s.b.INSTANCE;
        if (s.b.g(linearity, companion.b())) {
            iVar.setFlags(iVar.getFlags() | 64);
            iVar.setHinting(0);
        } else if (s.b.g(linearity, companion.a())) {
            iVar.getFlags();
            iVar.setHinting(1);
        } else if (!s.b.g(linearity, companion.c())) {
            iVar.getFlags();
        } else {
            iVar.getFlags();
            iVar.setHinting(0);
        }
    }

    public static final SpanStyle a(i iVar, SpanStyle spanStyle, Function4<? super AbstractC18142l, ? super FontWeight, ? super C18153w, ? super C18154x, ? extends Typeface> function4, H1.d dVar, boolean z10) {
        int iB;
        int iA;
        long jG = v.g(spanStyle.getFontSize());
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            iVar.setTextSize(dVar.N0(spanStyle.getFontSize()));
        } else if (x.g(jG, companion.a())) {
            iVar.setTextSize(iVar.getTextSize() * v.h(spanStyle.getFontSize()));
        }
        if (d(spanStyle)) {
            AbstractC18142l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.e();
            }
            C18153w fontStyle = spanStyle.getFontStyle();
            if (fontStyle != null) {
                iB = fontStyle.getValue();
            } else {
                iB = C18153w.INSTANCE.b();
            }
            C18153w c18153wC = C18153w.c(iB);
            C18154x fontSynthesis = spanStyle.getFontSynthesis();
            if (fontSynthesis != null) {
                iA = fontSynthesis.getValue();
            } else {
                iA = C18154x.INSTANCE.a();
            }
            iVar.setTypeface(function4.invoke(fontFamily, fontWeight, c18153wC, C18154x.e(iA)));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.e(spanStyle.getLocaleList(), LocaleList.INSTANCE.a())) {
            a.f5011a.b(iVar, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.e(spanStyle.getFontFeatureSettings(), "")) {
            iVar.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.e(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            iVar.setTextScaleX(iVar.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            iVar.setTextSkewX(iVar.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        iVar.f(spanStyle.g());
        iVar.e(spanStyle.f(), k.INSTANCE.a(), spanStyle.c());
        iVar.h(spanStyle.getShadow());
        iVar.i(spanStyle.getTextDecoration());
        iVar.g(spanStyle.getDrawStyle());
        if (x.g(v.g(spanStyle.getLetterSpacing()), companion.b()) && v.h(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = iVar.getTextSize() * iVar.getTextScaleX();
            float fN0 = dVar.N0(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                iVar.setLetterSpacing(fN0 / textSize);
            }
        } else if (x.g(v.g(spanStyle.getLetterSpacing()), companion.a())) {
            iVar.setLetterSpacing(v.h(spanStyle.getLetterSpacing()));
        }
        return c(spanStyle.getLetterSpacing(), z10, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final boolean d(SpanStyle spanStyle) {
        if (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }
}

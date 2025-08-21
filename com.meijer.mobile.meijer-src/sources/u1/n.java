package u1;

import B1.LocaleList;
import F1.TextGeometricTransform;
import V0.C1;
import V0.C5489q0;
import V0.C5492s0;
import V0.Shadow;
import androidx.compose.ui.text.SpanStyle;
import kotlin.AbstractC18269l;
import kotlin.C18238E;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aÀ\u0001\u0010\u0002\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00102\b\u00104\u001a\u0004\u0018\u000103H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u00105\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u00109\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00109\"\u0014\u0010<\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109\"\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109\"\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"LH1/v;", "a", "b", "", "t", "f", "(JJF)J", "T", "fraction", "d", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/text/s;", "start", "stop", "c", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;F)Landroidx/compose/ui/text/s;", "Lu1/k;", "e", "(Lu1/k;Lu1/k;F)Lu1/k;", "style", "h", "(Landroidx/compose/ui/text/s;)Landroidx/compose/ui/text/s;", "LV0/q0;", "color", "LV0/i0;", "brush", "alpha", "fontSize", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "Ly1/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LF1/a;", "baselineShift", "LF1/o;", "textGeometricTransform", "LB1/e;", "localeList", "background", "LF1/k;", "textDecoration", "LV0/B1;", "shadow", "platformStyle", "LX0/g;", "drawStyle", "(Landroidx/compose/ui/text/s;JLV0/i0;FJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;Lu1/k;LX0/g;)Landroidx/compose/ui/text/s;", "other", "g", "(Landroidx/compose/ui/text/s;Lu1/k;)Lu1/k;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "LF1/n;", "LF1/n;", "DefaultColorForegroundStyle", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final long f163650a = H1.w.i(14);

    /* renamed from: b, reason: collision with root package name */
    private static final long f163651b = H1.w.i(0);

    /* renamed from: c, reason: collision with root package name */
    private static final long f163652c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f163653d;

    /* renamed from: e, reason: collision with root package name */
    private static final F1.n f163654e;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r11
      0x003a: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:41:0x00ab, B:53:0x00dd, B:50:0x00d1, B:47:0x00c5, B:44:0x00b9, B:39:0x009d, B:34:0x008e, B:28:0x0076, B:25:0x006e, B:22:0x0062, B:19:0x0056, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle b(androidx.compose.ui.text.SpanStyle r23, long r24, V0.AbstractC5467i0 r26, float r27, long r28, kotlin.FontWeight r30, kotlin.C18280w r31, kotlin.C18281x r32, kotlin.AbstractC18269l r33, java.lang.String r34, long r35, F1.a r37, F1.TextGeometricTransform r38, B1.LocaleList r39, long r40, F1.k r42, V0.Shadow r43, u1.k r44, X0.g r45) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n.b(androidx.compose.ui.text.s, long, V0.i0, float, long, y1.B, y1.w, y1.x, y1.l, java.lang.String, long, F1.a, F1.o, B1.e, long, F1.k, V0.B1, u1.k, X0.g):androidx.compose.ui.text.s");
    }

    public static final <T> T d(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LF1/n;", "c", "()LF1/n;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<F1.n> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f163655f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final F1.n invoke() {
            return n.f163654e;
        }
    }

    static {
        C5489q0.Companion companion = C5489q0.INSTANCE;
        f163652c = companion.i();
        long jA = companion.a();
        f163653d = jA;
        f163654e = F1.n.INSTANCE.b(jA);
    }

    public static final SpanStyle c(SpanStyle spanStyle, SpanStyle spanStyle2, float f10) {
        F1.n nVarB = F1.m.b(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f10);
        AbstractC18269l abstractC18269l = (AbstractC18269l) d(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f10);
        long jF = f(spanStyle.getFontSize(), spanStyle2.getFontSize(), f10);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.e();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.e();
        }
        FontWeight fontWeightA = C18238E.a(fontWeight, fontWeight2, f10);
        C18280w c18280w = (C18280w) d(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f10);
        C18281x c18281x = (C18281x) d(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f10);
        String str = (String) d(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f10);
        long jF2 = f(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f10);
        F1.a baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : F1.a.e(0.0f);
        F1.a baselineShift2 = spanStyle2.getBaselineShift();
        float fA = F1.b.a(multiplier, baselineShift2 != null ? baselineShift2.getMultiplier() : F1.a.e(0.0f), f10);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransformA = F1.p.a(textGeometricTransform, textGeometricTransform2, f10);
        LocaleList localeList = (LocaleList) d(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f10);
        long jH = C5492s0.h(spanStyle.getBackground(), spanStyle2.getBackground(), f10);
        F1.k kVar = (F1.k) d(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f10);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(nVarB, jF, fontWeightA, c18280w, c18281x, abstractC18269l, str, jF2, F1.a.d(fA), textGeometricTransformA, localeList, jH, kVar, C1.a(shadow, shadow2, f10), e(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f10), (X0.g) d(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f10), (DefaultConstructorMarker) null);
    }

    private static final k e(k kVar, k kVar2, float f10) {
        if (kVar == null && kVar2 == null) {
            return null;
        }
        if (kVar == null) {
            kVar = k.INSTANCE.a();
        }
        if (kVar2 == null) {
            kVar2 = k.INSTANCE.a();
        }
        return C17337b.c(kVar, kVar2, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        if (H1.v.f(j10) == 0 || H1.v.f(j11) == 0) {
            return ((H1.v) d(H1.v.b(j10), H1.v.b(j11), f10)).getPackedValue();
        }
        return H1.w.j(j10, j11, f10);
    }

    private static final k g(SpanStyle spanStyle, k kVar) {
        if (spanStyle.getPlatformStyle() == null) {
            return kVar;
        }
        if (kVar == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().b(kVar);
    }

    public static final SpanStyle h(SpanStyle spanStyle) {
        long fontSize;
        int iB;
        int iA;
        long letterSpacing;
        float fA;
        F1.n nVarC = spanStyle.getTextForegroundStyle().c(a.f163655f);
        if (H1.v.f(spanStyle.getFontSize()) == 0) {
            fontSize = f163650a;
        } else {
            fontSize = spanStyle.getFontSize();
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.e();
        }
        FontWeight fontWeight2 = fontWeight;
        C18280w fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            iB = fontStyle.getValue();
        } else {
            iB = C18280w.INSTANCE.b();
        }
        C18280w c18280wC = C18280w.c(iB);
        C18281x fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            iA = fontSynthesis.getValue();
        } else {
            iA = C18281x.INSTANCE.a();
        }
        C18281x c18281xE = C18281x.e(iA);
        AbstractC18269l fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = AbstractC18269l.INSTANCE.b();
        }
        AbstractC18269l abstractC18269l = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (H1.v.f(spanStyle.getLetterSpacing()) == 0) {
            letterSpacing = f163651b;
        } else {
            letterSpacing = spanStyle.getLetterSpacing();
        }
        long j10 = letterSpacing;
        F1.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            fA = baselineShift.getMultiplier();
        } else {
            fA = F1.a.INSTANCE.a();
        }
        F1.a aVarD = F1.a.d(fA);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.a();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = f163652c;
        }
        long j11 = background;
        F1.k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = F1.k.INSTANCE.c();
        }
        F1.k kVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        k platformStyle = spanStyle.getPlatformStyle();
        X0.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = X0.j.f41494a;
        }
        return new SpanStyle(nVarC, fontSize, fontWeight2, c18280wC, c18281xE, abstractC18269l, str, j10, aVarD, textGeometricTransform2, localeList2, j11, kVar, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}

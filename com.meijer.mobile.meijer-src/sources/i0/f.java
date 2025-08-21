package i0;

import B1.LocaleList;
import F1.TextGeometricTransform;
import F1.k;
import H1.v;
import V0.C5489q0;
import V0.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010?\u001a\u0004\b@\u0010A\"\u0004\b/\u0010BR(\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b'\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bU\u0010$\"\u0004\b!\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bO\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bI\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Li0/f;", "", "LV0/q0;", "color", "LH1/v;", "fontSize", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "Ly1/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LF1/a;", "baselineShift", "LF1/o;", "textGeometricTransform", "LB1/e;", "localeList", "background", "LF1/k;", "textDecoration", "LV0/B1;", "shadow", "<init>", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/s;", "m", "()Landroidx/compose/ui/text/s;", "a", "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "b", "getFontSize-XSAIIZE", "e", "Ly1/B;", "getFontWeight", "()Ly1/B;", "h", "(Ly1/B;)V", "d", "Ly1/w;", "getFontStyle-4Lr2A7w", "()Ly1/w;", "f", "(Ly1/w;)V", "Ly1/x;", "getFontSynthesis-ZQGJjVo", "()Ly1/x;", "g", "(Ly1/x;)V", "Ly1/l;", "getFontFamily", "()Ly1/l;", "setFontFamily", "(Ly1/l;)V", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getLetterSpacing-XSAIIZE", "i", "LF1/a;", "getBaselineShift-5SSeXJ0", "()LF1/a;", "(LF1/a;)V", "j", "LF1/o;", "getTextGeometricTransform", "()LF1/o;", "l", "(LF1/o;)V", "k", "LB1/e;", "getLocaleList", "()LB1/e;", "setLocaleList", "(LB1/e;)V", "getBackground-0d7_KjU", "LF1/k;", "getTextDecoration", "()LF1/k;", "(LF1/k;)V", "n", "LV0/B1;", "getShadow", "()LV0/B1;", "(LV0/B1;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long fontSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FontWeight fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C18280w fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C18281x fontSynthesis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private AbstractC18269l fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String fontFeatureSettings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long letterSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private F1.a baselineShift;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextGeometricTransform textGeometricTransform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private LocaleList localeList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long background;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private k textDecoration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    public /* synthetic */ f(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, k kVar, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, shadow);
    }

    private f(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, k kVar, Shadow shadow) {
        this.color = j10;
        this.fontSize = j11;
        this.fontWeight = fontWeight;
        this.fontStyle = c18280w;
        this.fontSynthesis = c18281x;
        this.fontFamily = abstractC18269l;
        this.fontFeatureSettings = str;
        this.letterSpacing = j12;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j13;
        this.textDecoration = kVar;
        this.shadow = shadow;
    }

    public final void a(long j10) {
        this.background = j10;
    }

    public final void b(F1.a aVar) {
        this.baselineShift = aVar;
    }

    public final void c(long j10) {
        this.color = j10;
    }

    public final void d(String str) {
        this.fontFeatureSettings = str;
    }

    public final void e(long j10) {
        this.fontSize = j10;
    }

    public final void f(C18280w c18280w) {
        this.fontStyle = c18280w;
    }

    public final void g(C18281x c18281x) {
        this.fontSynthesis = c18281x;
    }

    public final void h(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public final void i(long j10) {
        this.letterSpacing = j10;
    }

    public final void j(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void k(k kVar) {
        this.textDecoration = kVar;
    }

    public final void l(TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    public final SpanStyle m() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, null, null, 49152, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, k kVar, Shadow shadow, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long j14 = (i10 & 1) != 0 ? C5489q0.INSTANCE.j() : j10;
        long jA = (i10 & 2) != 0 ? v.INSTANCE.a() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        C18280w c18280w2 = (i10 & 8) != 0 ? null : c18280w;
        C18281x c18281x2 = (i10 & 16) != 0 ? null : c18281x;
        AbstractC18269l abstractC18269l2 = (i10 & 32) != 0 ? null : abstractC18269l;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jA2 = (i10 & 128) != 0 ? v.INSTANCE.a() : j12;
        F1.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long j15 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? C5489q0.INSTANCE.j() : j13;
        C18280w c18280w3 = c18280w2;
        C18281x c18281x3 = c18281x2;
        AbstractC18269l abstractC18269l3 = abstractC18269l2;
        String str3 = str2;
        long j16 = jA2;
        F1.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j17 = j15;
        this(j14, jA, fontWeight2, c18280w3, c18281x3, abstractC18269l3, str3, j16, aVar3, textGeometricTransform3, localeList3, j17, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : shadow, null);
    }
}

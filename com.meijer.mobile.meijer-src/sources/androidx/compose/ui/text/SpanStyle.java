package androidx.compose.ui.text;

import B1.LocaleList;
import F1.TextGeometricTransform;
import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÈ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u0010/J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u00106R\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\bF\u0010TR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bB\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b@\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bY\u0010d\u001a\u0004\bQ\u0010eR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010=R\u0013\u0010h\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bJ\u0010gR\u0011\u0010k\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\b>\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/AnnotatedString$a;", "LF1/n;", "textForegroundStyle", "LH1/v;", "fontSize", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "Ly1/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LF1/a;", "baselineShift", "LF1/o;", "textGeometricTransform", "LB1/e;", "localeList", "LV0/q0;", "background", "LF1/k;", "textDecoration", "LV0/B1;", "shadow", "Lu1/k;", "platformStyle", "LX0/g;", "drawStyle", "<init>", "(LF1/n;JLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;Lu1/k;LX0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;Lu1/k;LX0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "y", "(Landroidx/compose/ui/text/s;)Landroidx/compose/ui/text/s;", "a", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;Lu1/k;LX0/g;)Landroidx/compose/ui/text/s;", "", "", "equals", "(Ljava/lang/Object;)Z", "v", "(Landroidx/compose/ui/text/s;)Z", "w", "", "hashCode", "()I", "x", "toString", "()Ljava/lang/String;", "LF1/n;", "t", "()LF1/n;", "b", "J", "k", "()J", "c", "Ly1/B;", "n", "()Ly1/B;", "d", "Ly1/w;", "l", "()Ly1/w;", "e", "Ly1/x;", "m", "()Ly1/x;", "f", "Ly1/l;", "i", "()Ly1/l;", "g", "Ljava/lang/String;", "j", "h", "o", "LF1/a;", "()LF1/a;", "LF1/o;", "u", "()LF1/o;", "LB1/e;", "p", "()LB1/e;", "LF1/k;", "s", "()LF1/k;", "LV0/B1;", "r", "()LV0/B1;", "Lu1/k;", "q", "()Lu1/k;", "LX0/g;", "()LX0/g;", "LV0/i0;", "()LV0/i0;", "brush", "", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.s, reason: from toString */
/* loaded from: classes.dex */
public final class SpanStyle implements AnnotatedString.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final F1.n textForegroundStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C18280w fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final C18281x fontSynthesis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18269l fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final F1.a baselineShift;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final F1.k textDecoration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shadow shadow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final u1.k platformStyle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final X0.g drawStyle;

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, shadow, kVar2, gVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return v(spanStyle) && w(spanStyle);
    }

    public final boolean v(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return H1.v.e(this.fontSize, other.fontSize) && Intrinsics.e(this.fontWeight, other.fontWeight) && Intrinsics.e(this.fontStyle, other.fontStyle) && Intrinsics.e(this.fontSynthesis, other.fontSynthesis) && Intrinsics.e(this.fontFamily, other.fontFamily) && Intrinsics.e(this.fontFeatureSettings, other.fontFeatureSettings) && H1.v.e(this.letterSpacing, other.letterSpacing) && Intrinsics.e(this.baselineShift, other.baselineShift) && Intrinsics.e(this.textGeometricTransform, other.textGeometricTransform) && Intrinsics.e(this.localeList, other.localeList) && C5489q0.s(this.background, other.background) && Intrinsics.e(this.platformStyle, other.platformStyle);
    }

    public /* synthetic */ SpanStyle(F1.n nVar, long j10, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j11, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, j10, fontWeight, c18280w, c18281x, abstractC18269l, str, j11, aVar, textGeometricTransform, localeList, j12, kVar, shadow, kVar2, gVar);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar, int i10, Object obj) {
        long jG = (i10 & 1) != 0 ? spanStyle.g() : j10;
        return spanStyle.a(jG, (i10 & 2) != 0 ? spanStyle.fontSize : j11, (i10 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i10 & 8) != 0 ? spanStyle.fontStyle : c18280w, (i10 & 16) != 0 ? spanStyle.fontSynthesis : c18281x, (i10 & 32) != 0 ? spanStyle.fontFamily : abstractC18269l, (i10 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i10 & 128) != 0 ? spanStyle.letterSpacing : j12, (i10 & 256) != 0 ? spanStyle.baselineShift : aVar, (i10 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i10 & 1024) != 0 ? spanStyle.localeList : localeList, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? spanStyle.background : j13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? spanStyle.textDecoration : kVar, (i10 & 8192) != 0 ? spanStyle.shadow : shadow, (i10 & 16384) != 0 ? spanStyle.platformStyle : kVar2, (i10 & 32768) != 0 ? spanStyle.drawStyle : gVar);
    }

    public final SpanStyle a(long color, long fontSize, FontWeight fontWeight, C18280w fontStyle, C18281x fontSynthesis, AbstractC18269l fontFamily, String fontFeatureSettings, long letterSpacing, F1.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, F1.k textDecoration, Shadow shadow, u1.k platformStyle, X0.g drawStyle) {
        return new SpanStyle(C5489q0.s(color, g()) ? this.textForegroundStyle : F1.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.textForegroundStyle.a();
    }

    /* renamed from: d, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: e, reason: from getter */
    public final F1.a getBaselineShift() {
        return this.baselineShift;
    }

    public final AbstractC5467i0 f() {
        return this.textForegroundStyle.getBrush();
    }

    public final long g() {
        return this.textForegroundStyle.b();
    }

    /* renamed from: h, reason: from getter */
    public final X0.g getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC18269l getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: j, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: k, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: l, reason: from getter */
    public final C18280w getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: m, reason: from getter */
    public final C18281x getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* renamed from: n, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: o, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* renamed from: p, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* renamed from: q, reason: from getter */
    public final u1.k getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: s, reason: from getter */
    public final F1.k getTextDecoration() {
        return this.textDecoration;
    }

    /* renamed from: t, reason: from getter */
    public final F1.n getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C5489q0.z(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) H1.v.j(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) H1.v.j(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) C5489q0.z(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    /* renamed from: u, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean w(SpanStyle other) {
        return Intrinsics.e(this.textForegroundStyle, other.textForegroundStyle) && Intrinsics.e(this.textDecoration, other.textDecoration) && Intrinsics.e(this.shadow, other.shadow) && Intrinsics.e(this.drawStyle, other.drawStyle);
    }

    public final int x() {
        int i10 = H1.v.i(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = (i10 + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        C18280w c18280w = this.fontStyle;
        int iG = (iHashCode + (c18280w != null ? C18280w.g(c18280w.getValue()) : 0)) * 31;
        C18281x c18281x = this.fontSynthesis;
        int i11 = (iG + (c18281x != null ? C18281x.i(c18281x.getValue()) : 0)) * 31;
        AbstractC18269l abstractC18269l = this.fontFamily;
        int iHashCode2 = (i11 + (abstractC18269l != null ? abstractC18269l.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + H1.v.i(this.letterSpacing)) * 31;
        F1.a aVar = this.baselineShift;
        int iH = (iHashCode3 + (aVar != null ? F1.a.h(aVar.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iH + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + C5489q0.y(this.background)) * 31;
        u1.k kVar = this.platformStyle;
        return iHashCode5 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final SpanStyle y(SpanStyle other) {
        return other == null ? this : u1.n.b(this, other.textForegroundStyle.b(), other.textForegroundStyle.getBrush(), other.textForegroundStyle.a(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    private SpanStyle(F1.n nVar, long j10, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j11, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar) {
        this.textForegroundStyle = nVar;
        this.fontSize = j10;
        this.fontWeight = fontWeight;
        this.fontStyle = c18280w;
        this.fontSynthesis = c18281x;
        this.fontFamily = abstractC18269l;
        this.fontFeatureSettings = str;
        this.letterSpacing = j11;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j12;
        this.textDecoration = kVar;
        this.shadow = shadow;
        this.platformStyle = kVar2;
        this.drawStyle = gVar;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iG;
        int i10;
        int iHashCode3;
        int iHashCode4;
        int iH;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iY = C5489q0.y(g()) * 31;
        AbstractC5467i0 abstractC5467i0F = f();
        int iHashCode10 = 0;
        if (abstractC5467i0F != null) {
            iHashCode = abstractC5467i0F.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode11 = (((((iY + iHashCode) * 31) + Float.hashCode(c())) * 31) + H1.v.i(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        if (fontWeight != null) {
            iHashCode2 = fontWeight.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i11 = (iHashCode11 + iHashCode2) * 31;
        C18280w c18280w = this.fontStyle;
        if (c18280w != null) {
            iG = C18280w.g(c18280w.getValue());
        } else {
            iG = 0;
        }
        int i12 = (i11 + iG) * 31;
        C18281x c18281x = this.fontSynthesis;
        if (c18281x != null) {
            i10 = C18281x.i(c18281x.getValue());
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        AbstractC18269l abstractC18269l = this.fontFamily;
        if (abstractC18269l != null) {
            iHashCode3 = abstractC18269l.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i14 = (i13 + iHashCode3) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            iHashCode4 = str.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i15 = (((i14 + iHashCode4) * 31) + H1.v.i(this.letterSpacing)) * 31;
        F1.a aVar = this.baselineShift;
        if (aVar != null) {
            iH = F1.a.h(aVar.getMultiplier());
        } else {
            iH = 0;
        }
        int i16 = (i15 + iH) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            iHashCode5 = textGeometricTransform.hashCode();
        } else {
            iHashCode5 = 0;
        }
        int i17 = (i16 + iHashCode5) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            iHashCode6 = localeList.hashCode();
        } else {
            iHashCode6 = 0;
        }
        int iY2 = (((i17 + iHashCode6) * 31) + C5489q0.y(this.background)) * 31;
        F1.k kVar = this.textDecoration;
        if (kVar != null) {
            iHashCode7 = kVar.hashCode();
        } else {
            iHashCode7 = 0;
        }
        int i18 = (iY2 + iHashCode7) * 31;
        Shadow shadow = this.shadow;
        if (shadow != null) {
            iHashCode8 = shadow.hashCode();
        } else {
            iHashCode8 = 0;
        }
        int i19 = (i18 + iHashCode8) * 31;
        u1.k kVar2 = this.platformStyle;
        if (kVar2 != null) {
            iHashCode9 = kVar2.hashCode();
        } else {
            iHashCode9 = 0;
        }
        int i20 = (i19 + iHashCode9) * 31;
        X0.g gVar = this.drawStyle;
        if (gVar != null) {
            iHashCode10 = gVar.hashCode();
        }
        return i20 + iHashCode10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long j14 = (i10 & 1) != 0 ? C5489q0.INSTANCE.j() : j10;
        long jA = (i10 & 2) != 0 ? H1.v.INSTANCE.a() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        C18280w c18280w2 = (i10 & 8) != 0 ? null : c18280w;
        C18281x c18281x2 = (i10 & 16) != 0 ? null : c18281x;
        AbstractC18269l abstractC18269l2 = (i10 & 32) != 0 ? null : abstractC18269l;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jA2 = (i10 & 128) != 0 ? H1.v.INSTANCE.a() : j12;
        F1.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long j15 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? C5489q0.INSTANCE.j() : j13;
        F1.k kVar3 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar;
        long j16 = j14;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        u1.k kVar4 = (i10 & 16384) != 0 ? null : kVar2;
        long j17 = jA;
        FontWeight fontWeight3 = fontWeight2;
        F1.k kVar5 = kVar3;
        C18280w c18280w3 = c18280w2;
        C18281x c18281x3 = c18281x2;
        AbstractC18269l abstractC18269l3 = abstractC18269l2;
        String str3 = str2;
        long j18 = jA2;
        F1.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j19 = j15;
        this(j16, j17, fontWeight3, c18280w3, c18281x3, abstractC18269l3, str3, j18, aVar3, textGeometricTransform3, localeList3, j19, kVar5, shadow2, kVar4, (i10 & 32768) != 0 ? null : gVar, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow shadow, u1.k kVar2, X0.g gVar) {
        this(F1.n.INSTANCE.b(j10), j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, shadow, kVar2, gVar, (DefaultConstructorMarker) null);
    }
}

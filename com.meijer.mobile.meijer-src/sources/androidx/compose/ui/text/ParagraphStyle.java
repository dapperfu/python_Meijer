package androidx.compose.ui.text;

import F1.LineHeightStyle;
import F1.TextIndent;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jr\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010!R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010!R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b-\u0010!R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b)\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/AnnotatedString$a;", "LF1/j;", "textAlign", "LF1/l;", "textDirection", "LH1/v;", "lineHeight", "LF1/q;", "textIndent", "Landroidx/compose/ui/text/p;", "platformStyle", "LF1/h;", "lineHeightStyle", "LF1/f;", "lineBreak", "LF1/e;", "hyphens", "LF1/s;", "textMotion", "<init>", "(IIJLF1/q;Landroidx/compose/ui/text/p;LF1/h;IILF1/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "l", "(Landroidx/compose/ui/text/n;)Landroidx/compose/ui/text/n;", "a", "(IIJLF1/q;Landroidx/compose/ui/text/p;LF1/h;IILF1/s;)Landroidx/compose/ui/text/n;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "b", "i", "c", "J", "e", "()J", "d", "LF1/q;", "j", "()LF1/q;", "Landroidx/compose/ui/text/p;", "g", "()Landroidx/compose/ui/text/p;", "f", "LF1/h;", "()LF1/h;", "LF1/s;", "k", "()LF1/s;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.n, reason: from toString */
/* loaded from: classes.dex */
public final class ParagraphStyle implements AnnotatedString.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textAlign;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textDirection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextIndent textIndent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformParagraphStyle platformStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LineHeightStyle lineHeightStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lineBreak;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hyphens;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final F1.s textMotion;

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, sVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return F1.j.k(this.textAlign, paragraphStyle.textAlign) && F1.l.j(this.textDirection, paragraphStyle.textDirection) && H1.v.e(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.e(this.textIndent, paragraphStyle.textIndent) && Intrinsics.e(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.e(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && F1.f.f(this.lineBreak, paragraphStyle.lineBreak) && F1.e.g(this.hyphens, paragraphStyle.hyphens) && Intrinsics.e(this.textMotion, paragraphStyle.textMotion);
    }

    private ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar) {
        this.textAlign = i10;
        this.textDirection = i11;
        this.lineHeight = j10;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i12;
        this.hyphens = i13;
        this.textMotion = sVar;
        if (H1.v.e(j10, H1.v.INSTANCE.a())) {
            return;
        }
        if (H1.v.h(j10) >= 0.0f) {
            return;
        }
        A1.a.c("lineHeight can't be negative (" + H1.v.h(j10) + ')');
    }

    public static /* synthetic */ ParagraphStyle b(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = paragraphStyle.textAlign;
        }
        if ((i14 & 2) != 0) {
            i11 = paragraphStyle.textDirection;
        }
        if ((i14 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i14 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i14 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i14 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i14 & 64) != 0) {
            i12 = paragraphStyle.lineBreak;
        }
        if ((i14 & 128) != 0) {
            i13 = paragraphStyle.hyphens;
        }
        if ((i14 & 256) != 0) {
            sVar = paragraphStyle.textMotion;
        }
        int i15 = i13;
        F1.s sVar2 = sVar;
        long j11 = j10;
        return paragraphStyle.a(i10, i11, j11, textIndent, platformParagraphStyle, lineHeightStyle, i12, i15, sVar2);
    }

    public final ParagraphStyle a(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, F1.s textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, null);
    }

    /* renamed from: c, reason: from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    /* renamed from: d, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: e, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: f, reason: from getter */
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* renamed from: g, reason: from getter */
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: h, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        int iL = ((((F1.j.l(this.textAlign) * 31) + F1.l.k(this.textDirection)) * 31) + H1.v.i(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iL + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + F1.f.j(this.lineBreak)) * 31) + F1.e.h(this.hyphens)) * 31;
        F1.s sVar = this.textMotion;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    /* renamed from: j, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    /* renamed from: k, reason: from getter */
    public final F1.s getTextMotion() {
        return this.textMotion;
    }

    public final ParagraphStyle l(ParagraphStyle other) {
        return other == null ? this : o.a(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) F1.j.m(this.textAlign)) + ", textDirection=" + ((Object) F1.l.l(this.textDirection)) + ", lineHeight=" + ((Object) H1.v.j(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) F1.f.k(this.lineBreak)) + ", hyphens=" + ((Object) F1.e.i(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int iG = (i14 & 1) != 0 ? F1.j.INSTANCE.g() : i10;
        int iF = (i14 & 2) != 0 ? F1.l.INSTANCE.f() : i11;
        long jA = (i14 & 4) != 0 ? H1.v.INSTANCE.a() : j10;
        TextIndent textIndent2 = (i14 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i14 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 32) != 0 ? null : lineHeightStyle;
        int iB = (i14 & 64) != 0 ? F1.f.INSTANCE.b() : i12;
        int iC = (i14 & 128) != 0 ? F1.e.INSTANCE.c() : i13;
        this(iG, iF, jA, textIndent2, platformParagraphStyle2, lineHeightStyle2, iB, iC, (i14 & 256) == 0 ? sVar : null, null);
    }
}

package v1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bE\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\b:\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bF\u0010H¨\u0006I"}, d2 = {"Lv1/l0;", "", "", "text", "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "a", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "b", "I", "q", "()I", "c", "e", "d", "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "u", "f", "Landroid/text/TextDirectionHeuristic;", "s", "()Landroid/text/TextDirectionHeuristic;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "h", "n", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "j", "k", "F", "m", "()F", "l", "Z", "()Z", "t", "p", "[I", "()[I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextPaint paint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextDirectionHeuristic textDir;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Layout.Alignment alignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int ellipsizedWidth;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingExtra;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int justificationMode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int breakStrategy;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakStyle;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakWordStyle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int hyphenationFrequency;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int[] leftIndents;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int[] rightIndents;

    /* renamed from: a, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: b, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    /* renamed from: c, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* renamed from: d, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* renamed from: e, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: f, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: h, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    /* renamed from: i, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    /* renamed from: j, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* renamed from: k, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* renamed from: l, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* renamed from: m, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* renamed from: n, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: o, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    /* renamed from: p, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* renamed from: q, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: r, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* renamed from: s, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* renamed from: u, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public l0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.text = charSequence;
        this.start = i10;
        this.end = i11;
        this.paint = textPaint;
        this.width = i12;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i13;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i14;
        this.lineSpacingMultiplier = f10;
        this.lineSpacingExtra = f11;
        this.justificationMode = i15;
        this.includePadding = z10;
        this.useFallbackLineSpacing = z11;
        this.breakStrategy = i16;
        this.lineBreakStyle = i17;
        this.lineBreakWordStyle = i18;
        this.hyphenationFrequency = i19;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (i10 >= 0 && i10 <= i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            A1.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 >= 0 && i11 <= length) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            A1.a.a("invalid end value");
        }
        if (i13 >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            A1.a.a("invalid maxLines value");
        }
        if (i12 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            A1.a.a("invalid width value");
        }
        if (i14 >= 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z16) {
            A1.a.a("invalid ellipsizedWidth value");
        }
        if (!(f10 >= 0.0f)) {
            A1.a.a("invalid lineSpacingMultiplier value");
        }
    }
}

package v1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import w1.C17749i;
import x1.C17989a;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010*J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u001d\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u000f¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b9\u0010*J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b<\u0010*J%\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ9\u0010I\u001a\u0004\u0018\u00010\u00182\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\b2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0G¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020A2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ-\u0010R\u001a\u00020A2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010L\u001a\u00020K2\u0006\u0010Q\u001a\u00020\b¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\u00020D2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020A2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000fH\u0000¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010_R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bT\u0010`\u001a\u0004\ba\u0010[R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bc\u0010[R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010h\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bb\u0010[R\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010jR \u0010r\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010m\u0012\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u0017\u0010v\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bn\u0010s\u001a\u0004\bt\u0010uR \u0010z\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bw\u0010s\u0012\u0004\by\u0010q\u001a\u0004\bx\u0010uR \u0010}\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b'\u0010s\u0012\u0004\b|\u0010q\u001a\u0004\b{\u0010uR\u0014\u0010~\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010\u007f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010BR\u0015\u0010\u0080\u0001\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010`R\u0019\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010sR \u0010\u0088\u0001\u001a\f\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010\u0087\u0001R\u0016\u0010E\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010\u008a\u0001R\u001b\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bw\u0010\u008e\u0001R\u0013\u0010\u0091\u0001\u001a\u00020i8F¢\u0006\u0007\u001a\u0005\bs\u0010\u0090\u0001R\u0014\u0010\u0094\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0012\u0010\u0095\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bg\u0010u¨\u0006\u0096\u0001"}, d2 = {"Lv1/o0;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Lv1/O;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILv1/O;)V", "line", "g", "(I)F", "lineIndex", "t", "u", "w", "l", "k", "s", "v", "(I)I", "p", "x", "o", "n", "vertical", "r", "horizontal", "y", "(IF)I", "offset", "upstream", "A", "(IZ)F", "D", "q", "K", "(I)Z", "z", "start", "end", "Landroid/graphics/Path;", "dest", "", "F", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "C", "(Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "", "array", "b", "(I[F)V", "startOffset", "endOffset", "arrayStart", "a", "(II[FI)V", "c", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "L", "(Landroid/graphics/Canvas;)V", "J", "()Z", "Landroid/text/TextPaint;", "H", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "Z", "h", "d", "e", "Lv1/O;", "getLayoutIntrinsics", "()Lv1/O;", "f", "didExceedMaxLines", "Lw1/i;", "Lw1/i;", "backingWordIterator", "Landroid/text/Layout;", "Landroid/text/Layout;", "i", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "m", "()I", "lineCount", "j", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Lx1/h;", "[Lx1/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Lv1/M;", "Lv1/M;", "backingLayoutHelper", "()Lv1/M;", "layoutHelper", "()Lw1/i;", "wordIterator", "G", "()Ljava/lang/CharSequence;", "text", "height", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextUtils.TruncateAt ellipsize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final O layoutIntrinsics;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C17749i backingWordIterator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final x1.h[] lineHeightSpans;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private C17459M backingLayoutHelper;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public o0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, O o10) {
        boolean z12;
        int i18;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutA;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = o10;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = q0.k(i11);
        Layout.Alignment alignmentA = m0.f164389a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C17989a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsE = o10.e();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsE == null || o10.i() > f10 || z14) {
                z12 = true;
                this.isBoringLayout = false;
                i18 = i12;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                textPaint2 = textPaint;
                layoutA = j0.f164362a.a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i18, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                z12 = true;
                this.isBoringLayout = true;
                layoutA = C17470k.f164365a.a(charSequence, textPaint, iCeil, metricsE, alignmentA, z10, z11, truncateAt, iCeil);
                textPaint2 = textPaint;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.layout = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.lineCount = iMin;
            int i19 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i18 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length())) ? z12 : z13;
            long jL = q0.l(this);
            x1.h[] hVarArrJ = q0.j(this);
            this.lineHeightSpans = hVarArrJ;
            long jI = hVarArrJ != null ? q0.i(hVarArrJ) : q0.f164413b;
            this.topPadding = Math.max(r0.c(jL), r0.c(jI));
            this.bottomPadding = Math.max(r0.b(jL), r0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = q0.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.lastLineExtra = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) s(i19)) : z13;
            this.lastLineFontMetrics = fontMetricsIntH;
            this.leftPadding = x1.d.b(layoutA, i19, null, 2, null);
            this.rightPadding = x1.d.d(layoutA, i19, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(o0 o0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return o0Var.A(i10, z10);
    }

    public static /* synthetic */ float E(o0 o0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return o0Var.D(i10, z10);
    }

    private final float g(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final C17459M j() {
        C17459M c17459m = this.backingLayoutHelper;
        if (c17459m != null) {
            Intrinsics.g(c17459m);
            return c17459m;
        }
        C17459M c17459m2 = new C17459M(this.layout);
        this.backingLayoutHelper = c17459m2;
        return c17459m2;
    }

    public final int[] C(RectF rect, int granularity, Function2<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        return Build.VERSION.SDK_INT >= 34 ? C17465f.f164358a.c(this, rect, granularity, inclusionStrategy) : p0.d(this, this.layout, j(), rect, granularity, inclusionStrategy);
    }

    public final void F(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final CharSequence G() {
        return this.layout.getText();
    }

    /* renamed from: H, reason: from getter */
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final C17749i I() {
        C17749i c17749i = this.backingWordIterator;
        if (c17749i != null) {
            return c17749i;
        }
        C17749i c17749i2 = new C17749i(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = c17749i2;
        return c17749i2;
    }

    public final boolean J() {
        if (this.isBoringLayout) {
            C17470k c17470k = C17470k.f164365a;
            Layout layout = this.layout;
            Intrinsics.h(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c17470k.b((BoringLayout) layout);
        }
        j0 j0Var = j0.f164362a;
        Layout layout2 = this.layout;
        Intrinsics.h(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return j0Var.c((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean K(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void L(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i10 = this.topPadding;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            n0 n0Var = q0.f164412a;
            n0Var.a(canvas);
            this.layout.draw(n0Var);
            int i11 = this.topPadding;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int startOffset, int endOffset, float[] array, int arrayStart) {
        float fD;
        float fE;
        int length = G().length();
        if (!(startOffset >= 0)) {
            A1.a.a("startOffset must be > 0");
        }
        if (!(startOffset < length)) {
            A1.a.a("startOffset must be less than text length");
        }
        if (!(endOffset > startOffset)) {
            A1.a.a("endOffset must be greater than startOffset");
        }
        if (!(endOffset <= length)) {
            A1.a.a("endOffset must be smaller or equal to text length");
        }
        if (!(array.length - arrayStart >= (endOffset - startOffset) * 4)) {
            A1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iQ = q(startOffset);
        int iQ2 = q(endOffset - 1);
        C17456J c17456j = new C17456J(this);
        if (iQ > iQ2) {
            return;
        }
        int i10 = iQ;
        int i11 = arrayStart;
        while (true) {
            int iV = v(i10);
            int iP = p(i10);
            int iMin = Math.min(endOffset, iP);
            float fW = w(i10);
            float fL = l(i10);
            boolean z10 = z(i10) == 1;
            for (int iMax = Math.max(startOffset, iV); iMax < iMin; iMax++) {
                boolean zK = K(iMax);
                if (z10 && !zK) {
                    fD = c17456j.b(iMax);
                    fE = c17456j.c(iMax + 1);
                } else if (z10 && zK) {
                    fE = c17456j.d(iMax);
                    fD = c17456j.e(iMax + 1);
                } else if (z10 || !zK) {
                    fD = c17456j.d(iMax);
                    fE = c17456j.e(iMax + 1);
                } else {
                    fE = c17456j.b(iMax);
                    fD = c17456j.c(iMax + 1);
                }
                array[i11] = fD;
                array[i11 + 1] = fW;
                array[i11 + 2] = fE;
                array[i11 + 3] = fL;
                i11 += 4;
            }
            if (i10 == iQ2) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: d, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int f() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: i, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final float k(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : w(line) - this.lastLineFontMetrics.ascent);
    }

    public final float l(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int n(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int o(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int p(int lineIndex) {
        return (q0.m(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(lineIndex);
    }

    public final int q(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int r(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float t(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float u(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int v(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float w(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int x(int lineIndex) {
        return (q0.m(this.layout, lineIndex) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex) : j().e(lineIndex);
    }

    public final int y(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * g(line)));
    }

    public final int z(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float A(int offset, boolean upstream) {
        return j().c(offset, true, upstream) + g(q(offset));
    }

    public final float D(int offset, boolean upstream) {
        return j().c(offset, false, upstream) + g(q(offset));
    }

    public final void b(int lineIndex, float[] array) {
        boolean z10;
        float fD;
        float fE;
        int iV = v(lineIndex);
        int iP = p(lineIndex);
        int i10 = 0;
        boolean z11 = true;
        if (array.length >= (iP - iV) * 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            A1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C17456J c17456j = new C17456J(this);
        if (z(lineIndex) != 1) {
            z11 = false;
        }
        while (iV < iP) {
            boolean zK = K(iV);
            if (z11 && !zK) {
                fD = c17456j.b(iV);
                fE = c17456j.c(iV + 1);
            } else if (z11 && zK) {
                fE = c17456j.d(iV);
                fD = c17456j.e(iV + 1);
            } else if (zK) {
                fE = c17456j.b(iV);
                fD = c17456j.c(iV + 1);
            } else {
                fD = c17456j.d(iV);
                fE = c17456j.e(iV + 1);
            }
            array[i10] = fD;
            array[i10 + 1] = fE;
            i10 += 2;
            iV++;
        }
    }

    public final RectF c(int offset) {
        boolean z10;
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(offset);
        float fW = w(iQ);
        float fL = l(iQ);
        if (z(iQ) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (z10 && !zIsRtlCharAt) {
            fD = A(offset, false);
            fD2 = A(offset + 1, true);
        } else {
            if (z10 && zIsRtlCharAt) {
                fA = D(offset, false);
                fA2 = D(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(offset, false);
                fA2 = A(offset + 1, true);
            } else {
                fD = D(offset, false);
                fD2 = D(offset + 1, true);
            }
            float f10 = fA;
            fD = fA2;
            fD2 = f10;
        }
        return new RectF(fD, fW, fD2, fL);
    }

    public final float s(int lineIndex) {
        return l(lineIndex) - w(lineIndex);
    }

    public /* synthetic */ o0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, O o10, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        O o11;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & 256) != 0 ? false : z10;
        boolean z13 = (i18 & 512) != 0 ? true : z11;
        int i21 = (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : i13;
        int i23 = (i18 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & 16384) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            o11 = new O(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            o11 = o10;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, o11);
    }
}

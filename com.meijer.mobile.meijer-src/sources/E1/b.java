package E1;

import H1.t;
import U0.k;
import V0.AbstractC5467i0;
import V0.D1;
import X0.g;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u00069"}, d2 = {"LE1/b;", "Landroid/text/style/LeadingMarginSpan;", "LV0/D1;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "LV0/i0;", "brush", "alpha", "LX0/g;", "drawStyle", "LH1/d;", "density", "textIndentPx", "<init>", "(LV0/D1;FFFLV0/i0;FLX0/g;LH1/d;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", "p", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "a", "LV0/D1;", "b", "F", "d", "LV0/i0;", "e", "f", "LX0/g;", "g", "LH1/d;", "h", "I", "minimumRequiredIndent", "i", "diff", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D1 shape;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float bulletWidthPx;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float bulletHeightPx;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5467i0 brush;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g drawStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int minimumRequiredIndent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int diff;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f6973g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6974h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Canvas f6975i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Paint f6976j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6977k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f6978l;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, int i10, Canvas canvas, Paint paint, int i11, float f10) {
            super(0);
            this.f6973g = j10;
            this.f6974h = i10;
            this.f6975i = canvas;
            this.f6976j = paint;
            this.f6977k = i11;
            this.f6978l = f10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            E1.a.d(b.this.shape.a(this.f6973g, this.f6974h > 0 ? t.f13338a : t.f13339b, b.this.density), this.f6975i, this.f6976j, this.f6977k, this.f6978l, this.f6974h);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c10, Paint p10, int x10, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        if (c10 == null) {
            return;
        }
        float f10 = (top + bottom) / 2.0f;
        int iF = RangesKt.f(x10 - this.minimumRequiredIndent, 0);
        Intrinsics.h(text, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) text).getSpanStart(this) != start || p10 == null) {
            return;
        }
        Paint.Style style = p10.getStyle();
        E1.a.f(p10, this.drawStyle);
        float f11 = this.bulletWidthPx;
        float f12 = this.bulletHeightPx;
        long jD = k.d((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        E1.a.e(p10, this.brush, this.alpha, jD, new a(jD, dir, c10, p10, iF, f10));
        p10.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i10 = this.diff;
        if (i10 >= 0) {
            return 0;
        }
        return Math.abs(i10);
    }

    public b(D1 d12, float f10, float f11, float f12, AbstractC5467i0 abstractC5467i0, float f13, g gVar, H1.d dVar, float f14) {
        this.shape = d12;
        this.bulletWidthPx = f10;
        this.bulletHeightPx = f11;
        this.brush = abstractC5467i0;
        this.alpha = f13;
        this.drawStyle = gVar;
        this.density = dVar;
        int iD = MathKt.d(f10 + f12);
        this.minimumRequiredIndent = iD;
        this.diff = MathKt.d(f14) - iD;
    }
}

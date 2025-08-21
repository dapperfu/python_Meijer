package C1;

import F1.k;
import V0.AbstractC5467i0;
import V0.C5449c0;
import V0.C5489q0;
import V0.C5492s0;
import V0.P;
import V0.Shadow;
import V0.o1;
import V0.p1;
import X0.Stroke;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R\u001e\u00102\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u00101R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u00103\u0012\u0004\b8\u0010\n\u001a\u0004\b4\u00105\"\u0004\b6\u00107R2\u0010A\u001a\u0012\u0012\f\u0012\n\u0018\u00010:j\u0004\u0018\u0001`;\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010H\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b\u0011\u0010B\u0012\u0004\bG\u0010\n\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010K\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010JR*\u0010O\u001a\u00020'2\u0006\u0010L\u001a\u00020'8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010M\"\u0004\b+\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"LC1/i;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "", "a", "()V", "LF1/k;", "textDecoration", "i", "(LF1/k;)V", "LV0/B1;", "shadow", "h", "(LV0/B1;)V", "LV0/q0;", "color", "f", "(J)V", "LV0/i0;", "brush", "LU0/k;", "size", "alpha", "e", "(LV0/i0;JF)V", "LX0/g;", "drawStyle", "g", "(LX0/g;)V", "LV0/o1;", "LV0/o1;", "backingComposePaint", "b", "LF1/k;", "LV0/c0;", "c", "I", "backingBlendMode", "d", "LV0/B1;", "getShadow$ui_text_release", "()LV0/B1;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "LV0/q0;", "lastColor", "LV0/i0;", "getBrush$ui_text_release", "()LV0/i0;", "setBrush$ui_text_release", "(LV0/i0;)V", "getBrush$ui_text_release$annotations", "Landroidx/compose/runtime/z1;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Landroidx/compose/runtime/z1;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/z1;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/z1;)V", "shaderState", "LU0/k;", "getBrushSize-VsRJwc0$ui_text_release", "()LU0/k;", "setBrushSize-iaC8Vc4$ui_text_release", "(LU0/k;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "LX0/g;", "()LV0/o1;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i extends TextPaint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o1 backingComposePaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private F1.k textDecoration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int backingBlendMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C5489q0 lastColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private AbstractC5467i0 brush;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private z1<? extends Shader> shaderState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private U0.k brushSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private X0.g drawStyle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Shader> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f4037f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f4038g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5467i0 abstractC5467i0, long j10) {
            super(0);
            this.f4037f = abstractC5467i0;
            this.f4038g = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            return ((V0.z1) this.f4037f).b(this.f4038g);
        }
    }

    private final void a() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final o1 c() {
        o1 o1Var = this.backingComposePaint;
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1VarB = P.b(this);
        this.backingComposePaint = o1VarB;
        return o1VarB;
    }

    /* renamed from: b, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void d(int i10) {
        if (C5449c0.E(i10, this.backingBlendMode)) {
            return;
        }
        c().s(i10);
        this.backingBlendMode = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(V0.AbstractC5467i0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.a()
            return
        L6:
            boolean r0 = r5 instanceof V0.SolidColor
            if (r0 == 0) goto L18
            V0.E1 r5 = (V0.SolidColor) r5
            long r5 = r5.getValue()
            long r5 = F1.m.c(r5, r8)
            r4.f(r5)
            return
        L18:
            boolean r0 = r5 instanceof V0.z1
            if (r0 == 0) goto L6d
            V0.i0 r0 = r4.brush
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            U0.k r0 = r4.brushSize
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.getPackedValue()
            boolean r0 = U0.k.f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.brush = r5
            U0.k r0 = U0.k.c(r6)
            r4.brushSize = r0
            C1.i$a r0 = new C1.i$a
            r0.<init>(r5, r6)
            androidx.compose.runtime.z1 r5 = androidx.compose.runtime.o1.e(r0)
            r4.shaderState = r5
        L54:
            V0.o1 r5 = r4.c()
            androidx.compose.runtime.z1<? extends android.graphics.Shader> r6 = r4.shaderState
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.D(r6)
            r4.lastColor = r7
            C1.j.a(r4, r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.i.e(V0.i0, long, float):void");
    }

    public final void f(long color) {
        C5489q0 c5489q0 = this.lastColor;
        if (c5489q0 == null ? false : C5489q0.s(c5489q0.getValue(), color)) {
            return;
        }
        if (color != 16) {
            this.lastColor = C5489q0.m(color);
            setColor(C5492s0.j(color));
            a();
        }
    }

    public final void g(X0.g drawStyle) {
        if (drawStyle == null || Intrinsics.e(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.e(drawStyle, X0.j.f41494a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            c().H(p1.INSTANCE.b());
            Stroke stroke = (Stroke) drawStyle;
            c().I(stroke.getWidth());
            c().F(stroke.getMiter());
            c().w(stroke.getJoin());
            c().r(stroke.getCap());
            c().t(stroke.getPathEffect());
        }
    }

    public final void h(Shadow shadow) {
        if (shadow == null || Intrinsics.e(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.e(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(D1.d.b(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & 4294967295L)), C5492s0.j(this.shadow.getColor()));
        }
    }

    public final void i(F1.k textDecoration) {
        if (textDecoration == null || Intrinsics.e(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        k.Companion companion = F1.k.INSTANCE;
        setUnderlineText(textDecoration.d(companion.d()));
        setStrikeThruText(this.textDecoration.d(companion.b()));
    }

    public i(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.textDecoration = F1.k.INSTANCE.c();
        this.backingBlendMode = X0.f.INSTANCE.a();
        this.shadow = Shadow.INSTANCE.a();
    }
}

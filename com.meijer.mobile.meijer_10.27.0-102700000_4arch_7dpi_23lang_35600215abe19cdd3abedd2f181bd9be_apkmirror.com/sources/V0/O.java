package V0;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010#\"\u0004\b\u0016\u0010$R*\u0010'\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u0002002\u0006\u0010\u001a\u001a\u0002008V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00105\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b\u000e\u0010$R*\u00109\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R*\u0010=\u001a\u00020:2\u0006\u0010\u001a\u001a\u00020:8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R$\u0010@\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010#\"\u0004\b?\u0010$R*\u0010D\u001a\u00020A2\u0006\u0010\u001a\u001a\u00020A8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R4\u0010I\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010N\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"LV0/O;", "LV0/o1;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "C", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "LV0/c0;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "LV0/r0;", "d", "LV0/r0;", "internalColorFilter", "LV0/r1;", "value", "e", "LV0/r1;", "y", "()LV0/r1;", "t", "(LV0/r1;)V", "pathEffect", "", "()F", "(F)V", "alpha", "LV0/q0;", "color", "()J", "x", "(J)V", "q", "()I", "s", "(I)V", "blendMode", "LV0/p1;", "getStyle-TiuSbCo", "H", "style", "J", "strokeWidth", "LV0/F1;", "v", "r", "strokeCap", "LV0/G1;", "A", "w", "strokeJoin", "B", "F", "strokeMiterLimit", "LV0/b1;", "G", "u", "filterQuality", "E", "()Landroid/graphics/Shader;", "D", "(Landroid/graphics/Shader;)V", "shader", "f", "()LV0/r0;", "z", "(LV0/r0;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O implements o1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint internalPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C5347r0 internalColorFilter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private r1 pathEffect;

    public O(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = C5306c0.INSTANCE.B();
    }

    @Override // V0.o1
    public int A() {
        return P.g(this.internalPaint);
    }

    @Override // V0.o1
    public float B() {
        return P.h(this.internalPaint);
    }

    @Override // V0.o1
    /* renamed from: C, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // V0.o1
    public void D(Shader shader) {
        this.internalShader = shader;
        P.q(this.internalPaint, shader);
    }

    @Override // V0.o1
    /* renamed from: E, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // V0.o1
    public void F(float f10) {
        P.t(this.internalPaint, f10);
    }

    @Override // V0.o1
    public int G() {
        return P.e(this.internalPaint);
    }

    @Override // V0.o1
    public void H(int i10) {
        P.v(this.internalPaint, i10);
    }

    @Override // V0.o1
    public void I(float f10) {
        P.u(this.internalPaint, f10);
    }

    @Override // V0.o1
    public float J() {
        return P.i(this.internalPaint);
    }

    @Override // V0.o1
    public float a() {
        return P.c(this.internalPaint);
    }

    @Override // V0.o1
    public long b() {
        return P.d(this.internalPaint);
    }

    @Override // V0.o1
    public void d(float f10) {
        P.k(this.internalPaint, f10);
    }

    @Override // V0.o1
    /* renamed from: f, reason: from getter */
    public C5347r0 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // V0.o1
    /* renamed from: q, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // V0.o1
    public void r(int i10) {
        P.r(this.internalPaint, i10);
    }

    @Override // V0.o1
    public void s(int i10) {
        if (C5306c0.E(this._blendMode, i10)) {
            return;
        }
        this._blendMode = i10;
        P.l(this.internalPaint, i10);
    }

    @Override // V0.o1
    public void t(r1 r1Var) {
        P.p(this.internalPaint, r1Var);
        this.pathEffect = r1Var;
    }

    @Override // V0.o1
    public void u(int i10) {
        P.o(this.internalPaint, i10);
    }

    @Override // V0.o1
    public int v() {
        return P.f(this.internalPaint);
    }

    @Override // V0.o1
    public void w(int i10) {
        P.s(this.internalPaint, i10);
    }

    @Override // V0.o1
    public void x(long j10) {
        P.m(this.internalPaint, j10);
    }

    @Override // V0.o1
    /* renamed from: y, reason: from getter */
    public r1 getPathEffect() {
        return this.pathEffect;
    }

    @Override // V0.o1
    public void z(C5347r0 c5347r0) {
        this.internalColorFilter = c5347r0;
        P.n(this.internalPaint, c5347r0);
    }

    public O() {
        this(P.j());
    }
}

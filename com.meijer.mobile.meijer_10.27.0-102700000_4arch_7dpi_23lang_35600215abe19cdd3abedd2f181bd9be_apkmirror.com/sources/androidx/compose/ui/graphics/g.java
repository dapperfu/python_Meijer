package androidx.compose.ui.graphics;

import H1.t;
import U0.k;
import V0.AbstractC5337m1;
import V0.C5313e1;
import V0.C5346q0;
import V0.D1;
import V0.x1;
import V0.y1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R*\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R*\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014\"\u0004\b\u001e\u0010\u0016R*\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R0\u0010-\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020)8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b\"\u0010*\"\u0004\b+\u0010,R0\u00101\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020)8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R*\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014\"\u0004\b2\u0010\u0016R*\u00107\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u0014\"\u0004\b5\u0010\u0016R*\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u0010\u0014\"\u0004\b8\u0010\u0016R*\u0010<\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b;\u0010\u0014\"\u0004\b.\u0010\u0016R0\u0010@\u001a\u00020=2\u0006\u0010\u0010\u001a\u00020=8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R*\u0010H\u001a\u00020A2\u0006\u0010\u0010\u001a\u00020A8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010P\u001a\u00020I2\u0006\u0010\u0010\u001a\u00020I8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010T\u001a\u00020Q2\u0006\u0010\u0010\u001a\u00020Q8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010\t\u001a\u0004\bR\u0010\u000b\"\u0004\bS\u0010\rR(\u0010W\u001a\u00020U8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bR\u0010&\u001a\u0004\b\u0011\u0010*\"\u0004\bV\u0010,R\"\u0010^\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR.\u0010m\u001a\u0004\u0018\u00010g2\b\u0010h\u001a\u0004\u0018\u00010g8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010i\u001a\u0004\b\u0012\u0010j\"\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0014R\u0014\u0010q\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0014R.\u0010s\u001a\u0004\u0018\u00010r2\b\u0010\u0010\u001a\u0004\u0018\u00010r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\b\t\u0010u\"\u0004\b%\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/g;", "Landroidx/compose/ui/graphics/e;", "<init>", "()V", "", "O", "X", "", "a", "I", "B", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "b", "F", "G", "()F", "h", "(F)V", "scaleX", "c", "V", "m", "scaleY", "d", "alpha", "e", "Q", "n", "translationX", "f", "P", "translationY", "g", "J", "H", "shadowElevation", "LV0/q0;", "()J", "z", "(J)V", "ambientShadowColor", "i", "N", "E", "spotShadowColor", "j", "S", "rotationX", "k", "v", "rotationY", "l", "y", "rotationZ", "C", "cameraDistance", "Landroidx/compose/ui/graphics/i;", "D0", "F0", "transformOrigin", "LV0/D1;", "o", "LV0/D1;", "M", "()LV0/D1;", "K1", "(LV0/D1;)V", "shape", "", "p", "Z", "q", "()Z", "D", "(Z)V", "clip", "Landroidx/compose/ui/graphics/c;", "r", "u", "compositingStrategy", "LU0/k;", "W", "size", "LH1/d;", "s", "LH1/d;", "()LH1/d;", "R", "(LH1/d;)V", "graphicsDensity", "LH1/t;", "t", "LH1/t;", "A", "()LH1/t;", "U", "(LH1/t;)V", "layoutDirection", "LV0/m1;", "<set-?>", "LV0/m1;", "()LV0/m1;", "setOutline$ui_release", "(LV0/m1;)V", "outline", "getDensity", "density", "F1", "fontScale", "LV0/y1;", "renderEffect", "LV0/y1;", "()LV0/y1;", "(LV0/y1;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private AbstractC5337m1 outline;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = C5313e1.a();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = C5313e1.a();

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = i.INSTANCE.a();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private D1 shape = x1.a();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy = c.INSTANCE.a();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long size = k.INSTANCE.a();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private H1.d graphicsDensity = H1.f.b(1.0f, 0.0f, 2, null);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.f12006a;

    public y1 I() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.e
    public void g(y1 y1Var) {
        if (Intrinsics.e(null, y1Var)) {
            return;
        }
        this.mutatedFields |= 131072;
    }

    /* renamed from: A, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: B, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: C, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.e
    public void D(boolean z10) {
        if (this.clip != z10) {
            this.mutatedFields |= 16384;
            this.clip = z10;
        }
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: D0, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.e
    public void E(long j10) {
        if (C5346q0.s(this.spotShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j10;
    }

    /* renamed from: F, reason: from getter */
    public final AbstractC5337m1 getOutline() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.e
    public void F0(long j10) {
        if (i.e(this.transformOrigin, j10)) {
            return;
        }
        this.mutatedFields |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.transformOrigin = j10;
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: G, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.e
    public void H(float f10) {
        if (this.shadowElevation == f10) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f10;
    }

    /* renamed from: J, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.e
    public void K1(D1 d12) {
        if (Intrinsics.e(this.shape, d12)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = d12;
    }

    /* renamed from: M, reason: from getter */
    public D1 getShape() {
        return this.shape;
    }

    /* renamed from: N, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void O() {
        h(1.0f);
        m(1.0f);
        d(1.0f);
        n(0.0f);
        e(0.0f);
        H(0.0f);
        z(C5313e1.a());
        E(C5313e1.a());
        j(0.0f);
        k(0.0f);
        l(0.0f);
        i(8.0f);
        F0(i.INSTANCE.a());
        K1(x1.a());
        D(false);
        g(null);
        u(c.INSTANCE.a());
        W(k.INSTANCE.a());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: P, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: Q, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    public final void R(H1.d dVar) {
        this.graphicsDensity = dVar;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: S, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    public final void U(t tVar) {
        this.layoutDirection = tVar;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: V, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    public void W(long j10) {
        this.size = j10;
    }

    /* renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: b, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.e
    public void d(float f10) {
        if (this.alpha == f10) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void e(float f10) {
        if (this.translationY == f10) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f10;
    }

    /* renamed from: f, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // H1.d
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.e
    public void h(float f10) {
        if (this.scaleX == f10) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void i(float f10) {
        if (this.cameraDistance == f10) {
            return;
        }
        this.mutatedFields |= RecyclerView.m.FLAG_MOVED;
        this.cameraDistance = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void j(float f10) {
        if (this.rotationX == f10) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void k(float f10) {
        if (this.rotationY == f10) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void l(float f10) {
        if (this.rotationZ == f10) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void m(float f10) {
        if (this.scaleY == f10) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f10;
    }

    @Override // androidx.compose.ui.graphics.e
    public void n(float f10) {
        if (this.translationX == f10) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f10;
    }

    /* renamed from: q, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    /* renamed from: r, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: s, reason: from getter */
    public final H1.d getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.ui.graphics.e
    public void u(int i10) {
        if (c.e(this.compositingStrategy, i10)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i10;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: v, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.e
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.e
    public void z(long j10) {
        if (C5346q0.s(this.ambientShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j10;
    }

    public final void X() {
        this.outline = getShape().a(getSize(), this.layoutDirection, this.graphicsDensity);
    }
}

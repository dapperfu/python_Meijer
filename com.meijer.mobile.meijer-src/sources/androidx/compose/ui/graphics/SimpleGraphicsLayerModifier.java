package androidx.compose.ui.graphics;

import V0.C5489q0;
import V0.D1;
import V0.y1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bC\u0010.\"\u0004\bD\u00100R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\\\u0010K\u001a\u0004\b]\u0010M\"\u0004\bP\u0010OR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010K\u001a\u0004\b^\u0010M\"\u0004\b_\u0010OR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bZ\u0010`\u001a\u0004\ba\u0010b\"\u0004\b@\u0010cR'\u0010h\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u001d0d¢\u0006\u0002\bf8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010gR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Landroidx/compose/ui/graphics/h;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/i;", "transformOrigin", "LV0/D1;", "shape", "", "clip", "LV0/y1;", "renderEffect", "LV0/q0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/c;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLV0/D1;ZLV0/y1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "T2", "()V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "o", "F", "G", "()F", "h", "(F)V", "p", "V", "m", "q", "L2", "d", "r", "Q", "n", "s", "P", "e", "t", "Q2", "H", "u", "S", "j", "v", "k", "w", "y", "l", "x", "C", "i", "J", "D0", "()J", "F0", "(J)V", "z", "LV0/D1;", "R2", "()LV0/D1;", "K1", "(LV0/D1;)V", "A", "Z", "N2", "()Z", "D", "(Z)V", "B", "M2", "S2", "E", "I", "O2", "()I", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "layerBlock", "LV0/y1;", "P2", "()LV0/y1;", "g", "(LV0/y1;)V", "o2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.graphics.h, reason: from toString */
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.c implements D {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clip;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private long ambientShadowColor;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private long spotShadowColor;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private int compositingStrategy;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function1<? super e, Unit> layerBlock;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleX;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleY;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationX;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationY;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private float shadowElevation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationX;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationY;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationZ;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private float cameraDistance;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private long transformOrigin;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private D1 shape;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.graphics.h$a */
    static final class a extends Lambda implements Function1<e, Unit> {
        a() {
            super(1);
        }

        public final void a(e eVar) {
            eVar.h(SimpleGraphicsLayerModifier.this.getScaleX());
            eVar.m(SimpleGraphicsLayerModifier.this.getScaleY());
            eVar.d(SimpleGraphicsLayerModifier.this.getAlpha());
            eVar.n(SimpleGraphicsLayerModifier.this.getTranslationX());
            eVar.e(SimpleGraphicsLayerModifier.this.getTranslationY());
            eVar.H(SimpleGraphicsLayerModifier.this.getShadowElevation());
            eVar.j(SimpleGraphicsLayerModifier.this.getRotationX());
            eVar.k(SimpleGraphicsLayerModifier.this.getRotationY());
            eVar.l(SimpleGraphicsLayerModifier.this.getRotationZ());
            eVar.i(SimpleGraphicsLayerModifier.this.getCameraDistance());
            eVar.F0(SimpleGraphicsLayerModifier.this.getTransformOrigin());
            eVar.K1(SimpleGraphicsLayerModifier.this.getShape());
            eVar.D(SimpleGraphicsLayerModifier.this.getClip());
            SimpleGraphicsLayerModifier.this.P2();
            eVar.g(null);
            eVar.z(SimpleGraphicsLayerModifier.this.getAmbientShadowColor());
            eVar.E(SimpleGraphicsLayerModifier.this.getSpotShadowColor());
            eVar.u(SimpleGraphicsLayerModifier.this.getCompositingStrategy());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.graphics.h$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f50996f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ SimpleGraphicsLayerModifier f50997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
            super(1);
            this.f50996f = f0Var;
            this.f50997g = simpleGraphicsLayerModifier;
        }

        public final void a(f0.a aVar) {
            f0.a.v(aVar, this.f50996f, 0, 0, 0.0f, this.f50997g.layerBlock, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, D1 d12, boolean z10, y1 y1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, d12, z10, y1Var, j11, j12, i10);
    }

    public final y1 P2() {
        return null;
    }

    public final void T2() {
        NodeCoordinator wrapped = C5957k.j(this, C5952f0.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.H3(this.layerBlock, true);
        }
    }

    public final void g(y1 y1Var) {
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, D1 d12, boolean z10, y1 y1Var, long j11, long j12, int i10) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = d12;
        this.clip = z10;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
        this.layerBlock = new a();
    }

    /* renamed from: C, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void D(boolean z10) {
        this.clip = z10;
    }

    /* renamed from: D0, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void E(long j10) {
        this.spotShadowColor = j10;
    }

    public final void F0(long j10) {
        this.transformOrigin = j10;
    }

    /* renamed from: G, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final void H(float f10) {
        this.shadowElevation = f10;
    }

    public final void K1(D1 d12) {
        this.shape = d12;
    }

    /* renamed from: L2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: M2, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: N2, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: O2, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: P, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: Q, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: Q2, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: R2, reason: from getter */
    public final D1 getShape() {
        return this.shape;
    }

    /* renamed from: S, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: S2, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: V, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final void d(float f10) {
        this.alpha = f10;
    }

    public final void e(float f10) {
        this.translationY = f10;
    }

    public final void h(float f10) {
        this.scaleX = f10;
    }

    public final void i(float f10) {
        this.cameraDistance = f10;
    }

    public final void j(float f10) {
        this.rotationX = f10;
    }

    public final void k(float f10) {
        this.rotationY = f10;
    }

    public final void l(float f10) {
        this.rotationZ = f10;
    }

    public final void m(float f10) {
        this.scaleY = f10;
    }

    public final void n(float f10) {
        this.translationX = f10;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) i.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C5489q0.z(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C5489q0.z(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) c.g(this.compositingStrategy)) + ')';
    }

    public final void u(int i10) {
        this.compositingStrategy = i10;
    }

    /* renamed from: v, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: y, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void z(long j10) {
        this.ambientShadowColor = j10;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new b(f0VarK0, this), 4, null);
    }
}

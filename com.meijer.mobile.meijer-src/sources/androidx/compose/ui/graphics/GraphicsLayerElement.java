package androidx.compose.ui.graphics;

import V0.C5489q0;
import V0.D1;
import V0.y1;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\bA\u00100R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b!\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010ER\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010ER\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/graphics/h;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/i;", "transformOrigin", "LV0/D1;", "shape", "", "clip", "LV0/y1;", "renderEffect", "LV0/q0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/c;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLV0/D1;ZLV0/y1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "k", "()Landroidx/compose/ui/graphics/h;", "node", "", "n", "(Landroidx/compose/ui/graphics/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getScaleX", "()F", "c", "getScaleY", "d", "getAlpha", "e", "getTranslationX", "f", "getTranslationY", "g", "getShadowElevation", "h", "getRotationX", "i", "getRotationY", "j", "getRotationZ", "getCameraDistance", "l", "J", "getTransformOrigin-SzJe1aQ", "()J", "m", "LV0/D1;", "getShape", "()LV0/D1;", "Z", "getClip", "()Z", "o", "getAmbientShadowColor-0d7_KjU", "p", "getSpotShadowColor-0d7_KjU", "q", "I", "getCompositingStrategy--NrFUSI", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends Y<SimpleGraphicsLayerModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleY;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationY;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final float shadowElevation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationX;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationY;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationZ;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraDistance;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final D1 shape;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final int compositingStrategy;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, D1 d12, boolean z10, y1 y1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, d12, z10, y1Var, j11, j12, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && i.e(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.e(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Intrinsics.e(null, null) && C5489q0.s(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && C5489q0.s(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && c.e(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + i.h(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 961) + C5489q0.y(this.ambientShadowColor)) * 31) + C5489q0.y(this.spotShadowColor)) * 31) + c.f(this.compositingStrategy);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) i.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C5489q0.z(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C5489q0.z(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) c.g(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, D1 d12, boolean z10, y1 y1Var, long j11, long j12, int i10) {
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
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public SimpleGraphicsLayerModifier b() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, null, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(SimpleGraphicsLayerModifier node) {
        node.h(this.scaleX);
        node.m(this.scaleY);
        node.d(this.alpha);
        node.n(this.translationX);
        node.e(this.translationY);
        node.H(this.shadowElevation);
        node.j(this.rotationX);
        node.k(this.rotationY);
        node.l(this.rotationZ);
        node.i(this.cameraDistance);
        node.F0(this.transformOrigin);
        node.K1(this.shape);
        node.D(this.clip);
        node.g(null);
        node.z(this.ambientShadowColor);
        node.E(this.spotShadowColor);
        node.u(this.compositingStrategy);
        node.T2();
    }
}

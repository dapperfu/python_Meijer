package androidx.compose.ui.draw;

import H1.h;
import V0.BlockGraphicsLayerModifier;
import V0.C5489q0;
import V0.D1;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/Y;", "LV0/h0;", "LH1/h;", "elevation", "LV0/D1;", "shape", "", "clip", "LV0/q0;", "ambientColor", "spotColor", "<init>", "(FLV0/D1;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "n", "()Lkotlin/jvm/functions/Function1;", "k", "()LV0/h0;", "node", "y", "(LV0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "t", "()F", "c", "LV0/D1;", "w", "()LV0/D1;", "d", "Z", "q", "()Z", "e", "J", "p", "()J", "f", "x", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends Y<BlockGraphicsLayerModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final D1 shape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            eVar.H(eVar.I1(ShadowGraphicsLayerElement.this.getElevation()));
            eVar.K1(ShadowGraphicsLayerElement.this.getShape());
            eVar.D(ShadowGraphicsLayerElement.this.getClip());
            eVar.z(ShadowGraphicsLayerElement.this.getAmbientColor());
            eVar.E(ShadowGraphicsLayerElement.this.getSpotColor());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, D1 d12, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, d12, z10, j10, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return h.u(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.e(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && C5489q0.s(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && C5489q0.s(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((h.w(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + C5489q0.y(this.ambientColor)) * 31) + C5489q0.y(this.spotColor);
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) h.z(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) C5489q0.z(this.ambientColor)) + ", spotColor=" + ((Object) C5489q0.z(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, D1 d12, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = d12;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }

    private final Function1<androidx.compose.ui.graphics.e, Unit> n() {
        return new a();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier b() {
        return new BlockGraphicsLayerModifier(n());
    }

    /* renamed from: p, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: t, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: w, reason: from getter */
    public final D1 getShape() {
        return this.shape;
    }

    /* renamed from: x, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(BlockGraphicsLayerModifier node) {
        node.M2(n());
        node.L2();
    }
}

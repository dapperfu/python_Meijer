package androidx.compose.foundation;

import V0.AbstractC5324i0;
import V0.C5346q0;
import V0.D1;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BF\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/c;", "LV0/q0;", "color", "LV0/i0;", "brush", "", "alpha", "LV0/D1;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(JLV0/i0;FLV0/D1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "n", "()Landroidx/compose/foundation/c;", "node", "o", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "LV0/i0;", "d", "F", "e", "LV0/D1;", "f", "Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends Y<c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5324i0 brush;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D1 shape;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<N0, Unit> inspectorInfo;

    public /* synthetic */ BackgroundElement(long j10, AbstractC5324i0 abstractC5324i0, float f10, D1 d12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC5324i0, f10, d12, function1);
    }

    public /* synthetic */ BackgroundElement(long j10, AbstractC5324i0 abstractC5324i0, float f10, D1 d12, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5346q0.INSTANCE.j() : j10, (i10 & 2) != 0 ? null : abstractC5324i0, f10, d12, function1, null);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && C5346q0.s(this.color, backgroundElement.color) && Intrinsics.e(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && Intrinsics.e(this.shape, backgroundElement.shape);
    }

    public int hashCode() {
        int iY = C5346q0.y(this.color) * 31;
        AbstractC5324i0 abstractC5324i0 = this.brush;
        return ((((iY + (abstractC5324i0 != null ? abstractC5324i0.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.Q2(this.color);
        node.P2(this.brush);
        node.d(this.alpha);
        node.K1(this.shape);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j10, AbstractC5324i0 abstractC5324i0, float f10, D1 d12, Function1<? super N0, Unit> function1) {
        this.color = j10;
        this.brush = abstractC5324i0;
        this.alpha = f10;
        this.shape = d12;
        this.inspectorInfo = function1;
    }
}

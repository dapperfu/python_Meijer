package androidx.compose.foundation.layout;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.platform.N0;
import k0.C15086a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/E;", "LH1/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "n", "()Landroidx/compose/foundation/layout/E;", "node", "o", "(Landroidx/compose/foundation/layout/E;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "c", "getTop-D9Ej5fM", "setTop-0680j_4", "d", "getEnd-D9Ej5fM", "setEnd-0680j_4", "e", "getBottom-D9Ej5fM", "setBottom-0680j_4", "f", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "g", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class PaddingElement extends Y<E> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<N0, Unit> inspectorInfo;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1<? super N0, Unit> function1) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        this.inspectorInfo = function1;
        boolean z11 = true;
        boolean z12 = f10 >= 0.0f || Float.isNaN(f10);
        float f14 = this.top;
        boolean z13 = z12 & (f14 >= 0.0f || Float.isNaN(f14));
        float f15 = this.end;
        boolean z14 = z13 & (f15 >= 0.0f || Float.isNaN(f15));
        float f16 = this.bottom;
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z11 = false;
        }
        if (!z14 || !z11) {
            C15086a.a("Padding must be non-negative");
        }
    }

    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && H1.h.u(this.start, paddingElement.start) && H1.h.u(this.top, paddingElement.top) && H1.h.u(this.end, paddingElement.end) && H1.h.u(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    public int hashCode() {
        return (((((((H1.h.w(this.start) * 31) + H1.h.w(this.top)) * 31) + H1.h.w(this.end)) * 31) + H1.h.w(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public E b() {
        return new E(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(E node) {
        node.Q2(this.start);
        node.R2(this.top);
        node.O2(this.end);
        node.N2(this.bottom);
        node.P2(this.rtlAware);
    }
}

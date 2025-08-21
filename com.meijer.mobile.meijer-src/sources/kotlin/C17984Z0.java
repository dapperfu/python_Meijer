package kotlin;

import V0.C5489q0;
import V0.InterfaceC5502x0;
import androidx.compose.ui.node.InterfaceC5956j;
import d0.InterfaceC13561B;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lx0/Z0;", "Ld0/B;", "", "bounded", "LH1/h;", "radius", "LV0/x0;", "colorProducer", "LV0/q0;", "color", "<init>", "(ZFLV0/x0;J)V", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh0/j;", "interactionSource", "Landroidx/compose/ui/node/j;", "a", "(Lh0/j;)Landroidx/compose/ui/node/j;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "F", "c", "LV0/x0;", "d", "J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.Z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17984Z0 implements InterfaceC13561B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5502x0 colorProducer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/q0;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.Z0$a */
    static final class a implements InterfaceC5502x0 {
        a() {
        }

        @Override // V0.InterfaceC5502x0
        public final long a() {
            return C17984Z0.this.color;
        }
    }

    public /* synthetic */ C17984Z0(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    private C17984Z0(boolean z10, float f10, InterfaceC5502x0 interfaceC5502x0, long j10) {
        this.bounded = z10;
        this.radius = f10;
        this.colorProducer = interfaceC5502x0;
        this.color = j10;
    }

    @Override // d0.InterfaceC13561B
    public InterfaceC5956j a(h0.j interactionSource) {
        InterfaceC5502x0 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new C17981Y(interactionSource, this.bounded, this.radius, aVar, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17984Z0)) {
            return false;
        }
        C17984Z0 c17984z0 = (C17984Z0) other;
        if (this.bounded == c17984z0.bounded && H1.h.u(this.radius, c17984z0.radius) && Intrinsics.e(this.colorProducer, c17984z0.colorProducer)) {
            return C5489q0.s(this.color, c17984z0.color);
        }
        return false;
    }

    @Override // d0.InterfaceC13561B
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + H1.h.w(this.radius)) * 31;
        InterfaceC5502x0 interfaceC5502x0 = this.colorProducer;
        return ((iHashCode + (interfaceC5502x0 != null ? interfaceC5502x0.hashCode() : 0)) * 31) + C5489q0.y(this.color);
    }

    private C17984Z0(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC5502x0) null, j10);
    }
}

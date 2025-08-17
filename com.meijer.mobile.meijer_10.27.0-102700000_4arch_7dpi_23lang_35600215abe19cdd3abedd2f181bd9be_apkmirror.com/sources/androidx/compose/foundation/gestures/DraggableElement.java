package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.Y;
import g1.PointerInputChange;
import h0.l;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13819r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bµ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012<\u0010\u0016\u001a8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u0015\u0012<\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-RJ\u0010\u0016\u001a8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102RJ\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f¢\u0006\u0002\b\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/gestures/f;", "Lf0/r;", "state", "Lf0/z;", "orientation", "", "enabled", "Lh0/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lqv/O;", "LU0/f;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Lf0/r;Lf0/z;ZLh0/l;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "n", "()Landroidx/compose/foundation/gestures/f;", "node", "o", "(Landroidx/compose/foundation/gestures/f;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lf0/r;", "c", "Lf0/z;", "d", "Z", "e", "Lh0/l;", "f", "g", "Lkotlin/jvm/functions/Function3;", "h", "i", "j", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends Y<f> {

    /* renamed from: k, reason: collision with root package name */
    private static final Function1<PointerInputChange, Boolean> f48113k = a.f48122f;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13819r state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC16622O, U0.f, Continuation<? super Unit>, Object> onDragStarted;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> onDragStopped;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/B;", "it", "", "a", "(Lg1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<PointerInputChange, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48122f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return Intrinsics.e(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && Intrinsics.e(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && Intrinsics.e(this.onDragStarted, draggableElement.onDragStarted) && Intrinsics.e(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        l lVar = this.interactionSource;
        return ((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f b() {
        return new f(this.state, f48113k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(f node) {
        node.t3(this.state, f48113k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(InterfaceC13819r interfaceC13819r, EnumC13827z enumC13827z, boolean z10, l lVar, boolean z11, Function3<? super InterfaceC16622O, ? super U0.f, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super InterfaceC16622O, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z12) {
        this.state = interfaceC13819r;
        this.orientation = enumC13827z;
        this.enabled = z10;
        this.interactionSource = lVar;
        this.startDragImmediately = z11;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z12;
    }
}

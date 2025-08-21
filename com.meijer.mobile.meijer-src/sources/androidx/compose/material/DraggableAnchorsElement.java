package androidx.compose.material;

import H1.r;
import androidx.compose.ui.node.Y;
import kotlin.C17997e;
import kotlin.EnumC13937z;
import kotlin.InterfaceC17986a0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002Bg\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012H\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#RV\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/material/b;", "Lx0/e;", "state", "Lkotlin/Function2;", "LH1/r;", "Lkotlin/ParameterName;", "name", "size", "LH1/b;", "constraints", "Lkotlin/Pair;", "Lx0/a0;", "anchors", "Lf0/z;", "orientation", "<init>", "(Lx0/e;Lkotlin/jvm/functions/Function2;Lf0/z;)V", "k", "()Landroidx/compose/material/b;", "node", "", "n", "(Landroidx/compose/material/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lx0/e;", "c", "Lkotlin/jvm/functions/Function2;", "d", "Lf0/z;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends Y<b<T>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17997e<T> state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<r, H1.b, Pair<InterfaceC17986a0<T>, T>> anchors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final EnumC13937z orientation;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) other;
        return Intrinsics.e(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b<T> b() {
        return new b<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(b<T> node) {
        node.O2(this.state);
        node.M2(this.anchors);
        node.N2(this.orientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(C17997e<T> c17997e, Function2<? super r, ? super H1.b, ? extends Pair<? extends InterfaceC17986a0<T>, ? extends T>> function2, EnumC13937z enumC13937z) {
        this.state = c17997e;
        this.anchors = function2;
        this.orientation = enumC13937z;
    }
}

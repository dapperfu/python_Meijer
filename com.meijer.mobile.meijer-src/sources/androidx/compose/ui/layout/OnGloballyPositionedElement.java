package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/layout/U;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onGloballyPositioned", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "k", "()Landroidx/compose/ui/layout/U;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "n", "(Landroidx/compose/ui/layout/U;)V", "b", "Lkotlin/jvm/functions/Function1;", "getOnGloballyPositioned", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends androidx.compose.ui.node.Y<U> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<LayoutCoordinates, Unit> onGloballyPositioned;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnGloballyPositionedElement) && this.onGloballyPositioned == ((OnGloballyPositionedElement) other).onGloballyPositioned;
    }

    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public U b() {
        return new U(this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(U node) {
        node.K2(this.onGloballyPositioned);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(Function1<? super LayoutCoordinates, Unit> function1) {
        this.onGloballyPositioned = function1;
    }
}

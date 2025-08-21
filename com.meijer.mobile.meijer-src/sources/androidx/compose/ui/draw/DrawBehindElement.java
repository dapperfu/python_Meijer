package androidx.compose.ui.draw;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Landroidx/compose/ui/node/Y;", "LT0/f;", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "k", "()LT0/f;", "node", "n", "(LT0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends Y<T0.f> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<X0.f, Unit> onDraw;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawBehindElement) && Intrinsics.e(this.onDraw, ((DrawBehindElement) other).onDraw);
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.onDraw + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public T0.f b() {
        return new T0.f(this.onDraw);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(T0.f node) {
        node.K2(this.onDraw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(Function1<? super X0.f, Unit> function1) {
        this.onDraw = function1;
    }
}

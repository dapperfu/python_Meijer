package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.Y;
import i1.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/input/rotary/b;", "Lkotlin/Function1;", "Li1/b;", "", "onRotaryScrollEvent", "onPreRotaryScrollEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "k", "()Landroidx/compose/ui/input/rotary/b;", "node", "", "n", "(Landroidx/compose/ui/input/rotary/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lkotlin/jvm/functions/Function1;", "getOnRotaryScrollEvent", "()Lkotlin/jvm/functions/Function1;", "c", "getOnPreRotaryScrollEvent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends Y<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<RotaryScrollEvent, Boolean> onPreRotaryScrollEvent;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) other;
        return Intrinsics.e(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && Intrinsics.e(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    public int hashCode() {
        Function1<RotaryScrollEvent, Boolean> function1 = this.onRotaryScrollEvent;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<RotaryScrollEvent, Boolean> function12 = this.onPreRotaryScrollEvent;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b b() {
        return new b(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(b node) {
        node.K2(this.onRotaryScrollEvent);
        node.L2(this.onPreRotaryScrollEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(Function1<? super RotaryScrollEvent, Boolean> function1, Function1<? super RotaryScrollEvent, Boolean> function12) {
        this.onRotaryScrollEvent = function1;
        this.onPreRotaryScrollEvent = function12;
    }
}

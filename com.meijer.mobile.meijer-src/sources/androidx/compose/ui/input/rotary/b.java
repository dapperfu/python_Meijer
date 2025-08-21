package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import i1.InterfaceC14593a;
import i1.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/rotary/b;", "Li1/a;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function1;", "Li1/b;", "", "onEvent", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "event", "X", "(Li1/b;)Z", "Y1", "o", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "K2", "(Lkotlin/jvm/functions/Function1;)V", "p", "getOnPreEvent", "L2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends Modifier.c implements InterfaceC14593a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super RotaryScrollEvent, Boolean> onEvent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Function1<? super RotaryScrollEvent, Boolean> onPreEvent;

    public final void K2(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final void L2(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }

    @Override // i1.InterfaceC14593a
    public boolean X(RotaryScrollEvent event) {
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    @Override // i1.InterfaceC14593a
    public boolean Y1(RotaryScrollEvent event) {
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    public b(Function1<? super RotaryScrollEvent, Boolean> function1, Function1<? super RotaryScrollEvent, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }
}

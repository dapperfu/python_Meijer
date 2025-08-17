package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import e1.C13602b;
import e1.InterfaceC13605e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/c;", "Le1/e;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function1;", "Le1/b;", "", "onEvent", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "event", "r1", "(Landroid/view/KeyEvent;)Z", "V0", "o", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "K2", "(Lkotlin/jvm/functions/Function1;)V", "p", "getOnPreEvent", "L2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends Modifier.c implements InterfaceC13605e {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C13602b, Boolean> onEvent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C13602b, Boolean> onPreEvent;

    public final void K2(Function1<? super C13602b, Boolean> function1) {
        this.onEvent = function1;
    }

    public final void L2(Function1<? super C13602b, Boolean> function1) {
        this.onPreEvent = function1;
    }

    @Override // e1.InterfaceC13605e
    public boolean V0(KeyEvent event) {
        Function1<? super C13602b, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(C13602b.a(event)).booleanValue();
        }
        return false;
    }

    @Override // e1.InterfaceC13605e
    public boolean r1(KeyEvent event) {
        Function1<? super C13602b, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(C13602b.a(event)).booleanValue();
        }
        return false;
    }

    public c(Function1<? super C13602b, Boolean> function1, Function1<? super C13602b, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }
}

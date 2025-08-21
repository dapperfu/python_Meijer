package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/e;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/E;", "", "onFocusChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusState", "U", "(Landroidx/compose/ui/focus/E;)V", "o", "Lkotlin/jvm/functions/Function1;", "getOnFocusChanged", "()Lkotlin/jvm/functions/Function1;", "K2", "p", "Landroidx/compose/ui/focus/E;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5904e extends Modifier.c implements InterfaceC5908i {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super E, Unit> onFocusChanged;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private E focusState;

    public final void K2(Function1<? super E, Unit> function1) {
        this.onFocusChanged = function1;
    }

    @Override // androidx.compose.ui.focus.InterfaceC5908i
    public void U(E focusState) {
        if (Intrinsics.e(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public C5904e(Function1<? super E, Unit> function1) {
        this.onFocusChanged = function1;
    }
}

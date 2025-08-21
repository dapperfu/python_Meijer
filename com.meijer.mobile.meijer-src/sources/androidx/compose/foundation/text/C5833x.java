package androidx.compose.foundation.text;

import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.input.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/x;", "Landroidx/compose/foundation/text/y;", "Landroidx/compose/ui/platform/D1;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/D1;)V", "Landroidx/compose/ui/text/input/a;", "imeAction", "", "d", "(I)V", "a", "Landroidx/compose/ui/platform/D1;", "Landroidx/compose/foundation/text/z;", "b", "Landroidx/compose/foundation/text/z;", "c", "()Landroidx/compose/foundation/text/z;", "f", "(Landroidx/compose/foundation/text/z;)V", "keyboardActions", "Landroidx/compose/ui/focus/o;", "Landroidx/compose/ui/focus/o;", "()Landroidx/compose/ui/focus/o;", "e", "(Landroidx/compose/ui/focus/o;)V", "focusManager", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5833x implements InterfaceC5834y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D1 keyboardController;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public C5835z keyboardActions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public InterfaceC5914o focusManager;

    public void a(int imeAction) {
        a.Companion companion = androidx.compose.ui.text.input.a.INSTANCE;
        if (androidx.compose.ui.text.input.a.m(imeAction, companion.d())) {
            b().e(C5905f.INSTANCE.e());
            return;
        }
        if (androidx.compose.ui.text.input.a.m(imeAction, companion.f())) {
            b().e(C5905f.INSTANCE.f());
            return;
        }
        if (!androidx.compose.ui.text.input.a.m(imeAction, companion.b())) {
            if (androidx.compose.ui.text.input.a.m(imeAction, companion.c()) ? true : androidx.compose.ui.text.input.a.m(imeAction, companion.g()) ? true : androidx.compose.ui.text.input.a.m(imeAction, companion.h()) ? true : androidx.compose.ui.text.input.a.m(imeAction, companion.a())) {
                return;
            }
            androidx.compose.ui.text.input.a.m(imeAction, companion.e());
        } else {
            D1 d12 = this.keyboardController;
            if (d12 != null) {
                d12.b();
            }
        }
    }

    public final InterfaceC5914o b() {
        InterfaceC5914o interfaceC5914o = this.focusManager;
        if (interfaceC5914o != null) {
            return interfaceC5914o;
        }
        Intrinsics.x("focusManager");
        return null;
    }

    public final C5835z c() {
        C5835z c5835z = this.keyboardActions;
        if (c5835z != null) {
            return c5835z;
        }
        Intrinsics.x("keyboardActions");
        return null;
    }

    public final void d(int imeAction) {
        Function1<InterfaceC5834y, Unit> function1G;
        a.Companion companion = androidx.compose.ui.text.input.a.INSTANCE;
        Unit unit = null;
        if (androidx.compose.ui.text.input.a.m(imeAction, companion.b())) {
            function1G = c().b();
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.c())) {
            function1G = c().c();
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.d())) {
            function1G = c().d();
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.f())) {
            function1G = c().e();
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.g())) {
            function1G = c().f();
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.h())) {
            function1G = c().g();
        } else {
            if (!(androidx.compose.ui.text.input.a.m(imeAction, companion.a()) ? true : androidx.compose.ui.text.input.a.m(imeAction, companion.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1G = null;
        }
        if (function1G != null) {
            function1G.invoke(this);
            unit = Unit.f143329a;
        }
        if (unit == null) {
            a(imeAction);
        }
    }

    public final void e(InterfaceC5914o interfaceC5914o) {
        this.focusManager = interfaceC5914o;
    }

    public final void f(C5835z c5835z) {
        this.keyboardActions = c5835z;
    }

    public C5833x(D1 d12) {
        this.keyboardController = d12;
    }
}

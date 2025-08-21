package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/window/e;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "b", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "d", "(Landroid/view/View;Ljava/lang/Object;)V", "e", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f53148a = new e();

    @JvmStatic
    public static final OnBackInvokedCallback b(final Function0<Unit> onDismissRequest) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.d
            public final void onBackInvoked() {
                e.c(onDismissRequest);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @JvmStatic
    public static final void d(View view, Object backCallback) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) backCallback);
    }

    @JvmStatic
    public static final void e(View view, Object backCallback) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
    }

    private e() {
    }
}

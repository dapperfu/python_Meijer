package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "key1", "Lkotlin/Function2;", "Lg1/J;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "e", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "c", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "key2", "d", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "", "keys", "f", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "pointerInputEventHandler", "Lg1/W;", "a", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lg1/W;", "Lg1/q;", "Lg1/q;", "EmptyPointerEvent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private static final C14314q f133886a = new C14314q(CollectionsKt.m());

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function2 f133887a;

        public final boolean equals(Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f133887a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(J j10, Continuation continuation) {
            return this.f133887a.invoke(j10, continuation);
        }

        a(Function2 function2) {
            this.f133887a = function2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final W a(PointerInputEventHandler pointerInputEventHandler) {
        return new X(null, null, null, pointerInputEventHandler);
    }

    public static final Modifier c(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    public static final Modifier d(Modifier modifier, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }
}

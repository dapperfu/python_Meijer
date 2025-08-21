package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/b0;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "O", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "X2", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5840b0 extends CoroutineContext.Element {

    /* renamed from: X2, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f50420a;

    <R> Object O(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.b0$a */
    public static final class a {
        public static <R> R a(InterfaceC5840b0 interfaceC5840b0, R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.a(interfaceC5840b0, r10, function2);
        }

        public static <E extends CoroutineContext.Element> E b(InterfaceC5840b0 interfaceC5840b0, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.b(interfaceC5840b0, key);
        }

        public static CoroutineContext c(InterfaceC5840b0 interfaceC5840b0, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.c(interfaceC5840b0, key);
        }

        public static CoroutineContext d(InterfaceC5840b0 interfaceC5840b0, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(interfaceC5840b0, coroutineContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/b0$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/b0;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.b0$b, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key<InterfaceC5840b0> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f50420a = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }
}

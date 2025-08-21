package mv;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 *2\u00020\u0001:\u0001+J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u00020\u001a2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010$\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00000&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lmv/C0;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "D", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "", "d", "(Ljava/util/concurrent/CancellationException;)V", "Lmv/w;", "child", "Lmv/u;", "u", "(Lmv/w;)Lmv/u;", "o0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lmv/h0;", "R", "(Lkotlin/jvm/functions/Function1;)Lmv/h0;", "onCancelling", "invokeImmediately", "z", "(ZZLkotlin/jvm/functions/Function1;)Lmv/h0;", "a", "isActive", "A", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "p", "()Lkotlin/sequences/Sequence;", "children", "u3", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* loaded from: classes14.dex */
public interface C0 extends CoroutineContext.Element {

    /* renamed from: u3, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f151648a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(C0 c02, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            c02.d(cancellationException);
        }

        public static <R> R b(C0 c02, R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.a(c02, r10, function2);
        }

        public static <E extends CoroutineContext.Element> E c(C0 c02, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.b(c02, key);
        }

        public static CoroutineContext d(C0 c02, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.c(c02, key);
        }

        public static CoroutineContext e(C0 c02, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(c02, coroutineContext);
        }
    }

    boolean A();

    CancellationException D();

    InterfaceC15804h0 R(Function1<? super Throwable, Unit> handler);

    boolean a();

    void d(CancellationException cause);

    boolean isCancelled();

    Object o0(Continuation<? super Unit> continuation);

    Sequence<C0> p();

    boolean start();

    InterfaceC15829u u(InterfaceC15833w child);

    InterfaceC15804h0 z(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmv/C0$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lmv/C0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.C0$b, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key<C0> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f151648a = new Companion();

        private Companion() {
        }
    }
}

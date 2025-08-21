package mv;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J|\u0010\u0010\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001e\u001a\u00020\u000e2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u001bj\u0002`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000e*\u00020 2\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b!\u0010\"J<\u0010#\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u00002#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bH'¢\u0006\u0004\b#\u0010$Jp\u0010%\u001a\u00020\u000e\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H&¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lmv/n;", "T", "Lkotlin/coroutines/Continuation;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "W", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "I", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "X", "(Ljava/lang/Object;)V", "", "N", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "F", "(Lkotlin/jvm/functions/Function1;)V", "Lmv/K;", "B", "(Lmv/K;Ljava/lang/Object;)V", "M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "U", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "a", "()Z", "isActive", "A", "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* renamed from: mv.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC15815n<T> extends Continuation<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC15815n interfaceC15815n, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC15815n.N(th2);
        }
    }

    boolean A();

    void B(AbstractC15779K abstractC15779K, T t10);

    void F(Function1<? super Throwable, Unit> handler);

    Object I(Throwable exception);

    @Deprecated
    void M(T value, Function1<? super Throwable, Unit> onCancellation);

    boolean N(Throwable cause);

    <R extends T> void U(R value, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    <R extends T> Object W(R value, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    void X(Object token);

    boolean a();
}

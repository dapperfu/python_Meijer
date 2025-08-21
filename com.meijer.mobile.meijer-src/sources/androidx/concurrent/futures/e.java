package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/common/util/concurrent/q;", "a", "(Lcom/google/common/util/concurrent/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "b", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "concurrent-futures-ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T> f53214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<T> qVar) {
            super(1);
            this.f53214f = qVar;
        }

        public final void a(Throwable th2) {
            this.f53214f.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    public static final <T> Object a(q<T> qVar, Continuation<? super T> continuation) throws Throwable {
        try {
            if (qVar.isDone()) {
                return androidx.concurrent.futures.a.w(qVar);
            }
            C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
            c15819p.C();
            qVar.addListener(new g(qVar, c15819p), d.INSTANCE);
            c15819p.F(new a(qVar));
            Object objU = c15819p.u();
            if (objU == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objU;
        } catch (ExecutionException e10) {
            throw b(e10);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.g(cause);
        return cause;
    }
}

package O4;

import N4.AbstractC4333v;
import N4.EnumC4319g;
import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lcom/google/common/util/concurrent/q;", "Landroidx/work/c;", "worker", "d", "(Lcom/google/common/util/concurrent/q;Landroidx/work/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23205a;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f23206f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q<T> f23207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.c cVar, com.google.common.util.concurrent.q<T> qVar) {
            super(1);
            this.f23206f = cVar;
            this.f23207g = qVar;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof WorkerStoppedException) {
                this.f23206f.stop(((WorkerStoppedException) th2).getReason());
            }
            this.f23207g.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    static {
        String strI = AbstractC4333v.i("WorkerWrapper");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkerWrapper\")");
        f23205a = strI;
    }

    public static final <T> Object d(com.google.common.util.concurrent.q<T> qVar, androidx.work.c cVar, Continuation<? super T> continuation) throws Throwable {
        try {
            if (qVar.isDone()) {
                return e(qVar);
            }
            C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
            c16658p.C();
            qVar.addListener(new C(qVar, c16658p), EnumC4319g.INSTANCE);
            c16658p.F(new a(cVar, qVar));
            Object objV = c16658p.v();
            if (objV == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objV;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.g(cause);
        return cause;
    }
}

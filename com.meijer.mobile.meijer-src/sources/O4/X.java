package O4;

import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lcom/google/common/util/concurrent/q;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class X {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> com.google.common.util.concurrent.q<T> e(final Executor executor, final Function0<? extends T> function0) {
        com.google.common.util.concurrent.q<T> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O4.U
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return X.f(executor, function0, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture {\n        val …        }\n        }\n    }");
        return qVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Executor executor, final Function0 function0, final c.a it) {
        Intrinsics.j(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: O4.V
            @Override // java.lang.Runnable
            public final void run() {
                X.g(atomicBoolean);
            }
        }, EnumC4359g.INSTANCE);
        executor.execute(new Runnable() { // from class: O4.W
            @Override // java.lang.Runnable
            public final void run() {
                X.h(atomicBoolean, it, function0);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean, c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}

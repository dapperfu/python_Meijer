package N4;

import N4.z;
import androidx.concurrent.futures.c;
import androidx.view.C5988D;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LN4/K;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", "LN4/z;", "c", "(LN4/K;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)LN4/z;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class D {
    public static final z c(final K tracer, final String label, final Executor executor, final Function0<Unit> block) {
        Intrinsics.j(tracer, "tracer");
        Intrinsics.j(label, "label");
        Intrinsics.j(executor, "executor");
        Intrinsics.j(block, "block");
        final C5988D c5988d = new C5988D(z.f21449b);
        com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: N4.B
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return D.d(executor, tracer, label, block, c5988d, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->…}\n            }\n        }");
        return new A(c5988d, qVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Executor executor, final K k10, final String str, final Function0 function0, final C5988D c5988d, final c.a completer) {
        Intrinsics.j(completer, "completer");
        executor.execute(new Runnable() { // from class: N4.C
            @Override // java.lang.Runnable
            public final void run() {
                D.e(k10, str, function0, c5988d, completer);
            }
        });
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(K k10, String str, Function0 function0, C5988D c5988d, c.a aVar) {
        boolean zIsEnabled = k10.isEnabled();
        if (zIsEnabled) {
            try {
                k10.a(str);
            } finally {
                if (zIsEnabled) {
                    k10.d();
                }
            }
        }
        try {
            function0.invoke();
            z.b.c cVar = z.f21448a;
            c5988d.m(cVar);
            aVar.c(cVar);
        } catch (Throwable th2) {
            c5988d.m(new z.b.a(th2));
            aVar.f(th2);
        }
        Unit unit = Unit.f142422a;
    }
}

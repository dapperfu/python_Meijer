package mv;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import rv.C16946A;
import rv.CoroutineScope;
import sv.C17169b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aL\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u001b\u0010\"\u001a\u00020\u001e*\u00020\u00008F¢\u0006\f\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lmv/O;", "Lkotlin/coroutines/CoroutineContext;", "context", "j", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;)Lmv/O;", "b", "()Lmv/O;", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lmv/O;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "(Lmv/O;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(Lmv/O;Ljava/lang/String;Ljava/lang/Throwable;)V", "h", "(Lmv/O;)V", "", "i", "(Lmv/O;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.P, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15784P {
    public static final InterfaceC15783O a(CoroutineContext coroutineContext) {
        if (coroutineContext.g(C0.INSTANCE) == null) {
            coroutineContext = coroutineContext.n0(F0.b(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    public static final InterfaceC15783O b() {
        return new CoroutineScope(X0.b(null, 1, null).n0(C15800f0.c()));
    }

    public static /* synthetic */ void e(InterfaceC15783O interfaceC15783O, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(interfaceC15783O, str, th2);
    }

    public static /* synthetic */ void f(InterfaceC15783O interfaceC15783O, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(interfaceC15783O, cancellationException);
    }

    public static final <R> Object g(Function2<? super InterfaceC15783O, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C16946A c16946a = new C16946A(continuation.getF143270a(), continuation);
        Object objD = C17169b.d(c16946a, c16946a, function2);
        if (objD == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objD;
    }

    public static final InterfaceC15783O j(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext) {
        return new CoroutineScope(interfaceC15783O.getCoroutineContext().n0(coroutineContext));
    }

    public static final void c(InterfaceC15783O interfaceC15783O, String str, Throwable th2) {
        d(interfaceC15783O, C15822q0.a(str, th2));
    }

    public static final void d(InterfaceC15783O interfaceC15783O, CancellationException cancellationException) {
        C0 c02 = (C0) interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
        if (c02 != null) {
            c02.d(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC15783O).toString());
    }

    public static final void h(InterfaceC15783O interfaceC15783O) {
        E0.i(interfaceC15783O.getCoroutineContext());
    }

    public static final boolean i(InterfaceC15783O interfaceC15783O) {
        C0 c02 = (C0) interfaceC15783O.getCoroutineContext().g(C0.INSTANCE);
        if (c02 != null) {
            return c02.a();
        }
        return true;
    }
}

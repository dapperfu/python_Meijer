package qv;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0016\u001a\u00020\u000f*\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u000f*\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001f\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \"\u0015\u0010#\u001a\u00020\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010&\u001a\u00020\u0000*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lqv/C0;", "", "invokeImmediately", "Lqv/G0;", "handler", "Lqv/h0;", "l", "(Lqv/C0;ZLqv/G0;)Lqv/h0;", "parent", "Lqv/A;", "a", "(Lqv/C0;)Lqv/A;", "handle", "h", "(Lqv/C0;Lqv/h0;)Lqv/h0;", "", "g", "(Lqv/C0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "j", "(Lqv/C0;)V", "i", "(Lkotlin/coroutines/CoroutineContext;)V", "", "message", "", "d", "(Lqv/C0;Ljava/lang/String;Ljava/lang/Throwable;)V", "n", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "k", "(Lkotlin/coroutines/CoroutineContext;)Lqv/C0;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
public final /* synthetic */ class F0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, G0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((G0) this.receiver).w(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    public static final Object g(C0 c02, Continuation<? super Unit> continuation) {
        C0.a.a(c02, null, 1, null);
        Object objN0 = c02.n0(continuation);
        return objN0 == IntrinsicsKt.f() ? objN0 : Unit.f142422a;
    }

    public static /* synthetic */ InterfaceC16643h0 m(C0 c02, boolean z10, G0 g02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return E0.l(c02, z10, g02);
    }

    public static final InterfaceC16608A a(C0 c02) {
        return new D0(c02);
    }

    public static /* synthetic */ InterfaceC16608A b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return E0.a(c02);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 != null) {
            c02.d(cancellationException);
        }
    }

    public static /* synthetic */ void e(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        E0.c(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void f(C0 c02, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        E0.d(c02, str, th2);
    }

    public static final InterfaceC16643h0 h(C0 c02, InterfaceC16643h0 interfaceC16643h0) {
        return m(c02, false, new C16647j0(interfaceC16643h0), 1, null);
    }

    public static final void i(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 != null) {
            E0.j(c02);
        }
    }

    public static final C0 k(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final InterfaceC16643h0 l(C0 c02, boolean z10, G0 g02) {
        return c02 instanceof H0 ? ((H0) c02).B0(z10, g02) : c02.u(g02.v(), z10, new a(g02));
    }

    public static final boolean n(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.g(C0.INSTANCE);
        if (c02 != null) {
            return c02.a();
        }
        return true;
    }

    public static final void d(C0 c02, String str, Throwable th2) {
        c02.d(C16661q0.a(str, th2));
    }

    public static final void j(C0 c02) {
        if (c02.a()) {
        } else {
            throw c02.z();
        }
    }
}

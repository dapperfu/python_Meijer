package qv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17627A;
import vv.C17638L;
import wv.C17865a;
import wv.C17866b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001aZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqv/O;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lqv/Q;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lqv/C0;", "c", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;Lqv/Q;Lkotlin/jvm/functions/Function2;)Lqv/C0;", "T", "Lqv/W;", "a", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;Lqv/Q;Lkotlin/jvm/functions/Function2;)Lqv/W;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension
/* renamed from: qv.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C16648k {
    public static /* synthetic */ W b(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        if ((i10 & 2) != 0) {
            enumC16624Q = EnumC16624Q.f157611a;
        }
        return C16644i.a(interfaceC16622O, coroutineContext, enumC16624Q, function2);
    }

    public static /* synthetic */ C0 d(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        if ((i10 & 2) != 0) {
            enumC16624Q = EnumC16624Q.f157611a;
        }
        return C16644i.c(interfaceC16622O, coroutineContext, enumC16624Q, function2);
    }

    public static final <T> W<T> a(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2) {
        X x10;
        CoroutineContext coroutineContextK = C16616I.k(interfaceC16622O, coroutineContext);
        if (enumC16624Q.e()) {
            x10 = new J0(coroutineContextK, function2);
        } else {
            x10 = new X(coroutineContextK, true);
        }
        ((AbstractC16628a) x10).i1(enumC16624Q, x10, function2);
        return (W<T>) x10;
    }

    public static final C0 c(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        AbstractC16628a u02;
        CoroutineContext coroutineContextK = C16616I.k(interfaceC16622O, coroutineContext);
        if (enumC16624Q.e()) {
            u02 = new K0(coroutineContextK, function2);
        } else {
            u02 = new U0(coroutineContextK, true);
        }
        u02.i1(enumC16624Q, u02, function2);
        return u02;
    }

    public static final <T> Object e(CoroutineContext coroutineContext, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object objK1;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextJ = C16616I.j(context, coroutineContext);
        E0.i(coroutineContextJ);
        if (coroutineContextJ == context) {
            C17627A c17627a = new C17627A(coroutineContextJ, continuation);
            objK1 = C17866b.d(c17627a, c17627a, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.e(coroutineContextJ.g(key), context.g(key))) {
                f1 f1Var = new f1(coroutineContextJ, continuation);
                CoroutineContext context2 = f1Var.getContext();
                Object objI = C17638L.i(context2, null);
                try {
                    Object objD = C17866b.d(f1Var, f1Var, function2);
                    C17638L.f(context2, objI);
                    objK1 = objD;
                } catch (Throwable th2) {
                    C17638L.f(context2, objI);
                    throw th2;
                }
            } else {
                C16631b0 c16631b0 = new C16631b0(coroutineContextJ, continuation);
                C17865a.c(function2, c16631b0, c16631b0);
                objK1 = c16631b0.k1();
            }
        }
        if (objK1 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objK1;
    }
}

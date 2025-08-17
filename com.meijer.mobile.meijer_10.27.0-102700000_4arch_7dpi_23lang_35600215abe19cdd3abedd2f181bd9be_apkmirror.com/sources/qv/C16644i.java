package qv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"qv/j", "qv/k"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16644i {
    public static final <T> W<T> a(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2) {
        return C16648k.a(interfaceC16622O, coroutineContext, enumC16624Q, function2);
    }

    public static final C0 c(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, EnumC16624Q enumC16624Q, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C16648k.c(interfaceC16622O, coroutineContext, enumC16624Q, function2);
    }

    public static final <T> T e(CoroutineContext coroutineContext, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) C16646j.a(coroutineContext, function2);
    }

    public static final <T> Object g(CoroutineContext coroutineContext, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return C16648k.e(coroutineContext, function2, continuation);
    }
}

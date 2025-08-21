package mv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"mv/j", "mv/k"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15805i {
    public static final <T> W<T> a(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, EnumC15785Q enumC15785Q, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2) {
        return C15809k.a(interfaceC15783O, coroutineContext, enumC15785Q, function2);
    }

    public static final C0 c(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, EnumC15785Q enumC15785Q, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C15809k.c(interfaceC15783O, coroutineContext, enumC15785Q, function2);
    }

    public static final <T> T e(CoroutineContext coroutineContext, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) C15807j.a(coroutineContext, function2);
    }

    public static final <T> Object g(CoroutineContext coroutineContext, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return C15809k.e(coroutineContext, function2, continuation);
    }
}

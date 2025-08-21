package tv;

import io.reactivex.u;
import io.reactivex.v;
import io.reactivex.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15777I;
import mv.C15832v0;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aP\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "Lio/reactivex/u;", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/u;", "scope", "d", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/u;", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class n {
    public static final <T> u<T> b(CoroutineContext coroutineContext, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2) {
        if (coroutineContext.g(C0.INSTANCE) == null) {
            return d(C15832v0.f151773a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ u c(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        return b(coroutineContext, function2);
    }

    private static final <T> u<T> d(final InterfaceC15783O interfaceC15783O, final CoroutineContext coroutineContext, final Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2) {
        return u.d(new x() { // from class: tv.m
            @Override // io.reactivex.x
            public final void a(v vVar) {
                n.e(interfaceC15783O, coroutineContext, function2, vVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, Function2 function2, v vVar) {
        l lVar = new l(C15777I.k(interfaceC15783O, coroutineContext), vVar);
        vVar.b(new d(lVar));
        lVar.i1(EnumC15785Q.f151685a, lVar, function2);
    }
}

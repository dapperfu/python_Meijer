package tv;

import io.reactivex.o;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
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
import ov.t;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aX\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022/\b\u0001\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\u000b\u0010\f\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004¢\u0006\u0002\b\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lov/t;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/reactivex/l;", "b", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/l;", "Lmv/O;", "scope", "d", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/l;", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class k {
    public static final <T> io.reactivex.l<T> b(CoroutineContext coroutineContext, @BuilderInference Function2<? super t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.g(C0.INSTANCE) == null) {
            return d(C15832v0.f151773a, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ io.reactivex.l c(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        return b(coroutineContext, function2);
    }

    private static final <T> io.reactivex.l<T> d(final InterfaceC15783O interfaceC15783O, final CoroutineContext coroutineContext, final Function2<? super t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return io.reactivex.l.create(new o() { // from class: tv.j
            @Override // io.reactivex.o
            public final void a(io.reactivex.n nVar) {
                k.e(interfaceC15783O, coroutineContext, function2, nVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext, Function2 function2, io.reactivex.n nVar) {
        i iVar = new i(C15777I.k(interfaceC15783O, coroutineContext), nVar);
        nVar.b(new d(iVar));
        iVar.i1(EnumC15785Q.f151685a, iVar, function2);
    }
}

package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmv/O;", "Lkotlin/coroutines/CoroutineContext;", "context", "k", "(Lmv/O;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "j", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "h", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "", "oldValue", "Lmv/f1;", "m", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lmv/f1;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "l", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lmv/f1;", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.I, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15777I {
    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext e(Ref.ObjectRef objectRef, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof InterfaceC15773E)) {
            return coroutineContext.n0(element);
        }
        CoroutineContext.Element elementG = ((CoroutineContext) objectRef.f143742a).g(element.getKey());
        if (elementG == null) {
            return coroutineContext.n0(z10 ? ((InterfaceC15773E) element).T() : (InterfaceC15773E) element);
        }
        objectRef.f143742a = ((CoroutineContext) objectRef.f143742a).x0(element.getKey());
        return coroutineContext.n0(((InterfaceC15773E) element).m(elementG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof InterfaceC15773E ? coroutineContext.n0(((InterfaceC15773E) element).T()) : coroutineContext.n0(element);
    }

    private static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.b(Boolean.FALSE, new Function2() { // from class: mv.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C15777I.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10 || (element instanceof InterfaceC15773E);
    }

    public static final f1<?> l(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C15792b0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof f1) {
                return (f1) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final f1<?> m(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.g(g1.f151738a) == null) {
            return null;
        }
        f1<?> f1VarL = l((CoroutineStackFrame) continuation);
        if (f1VarL != null) {
            f1VarL.m1(coroutineContext, obj);
        }
        return f1VarL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zH = h(coroutineContext);
        boolean zH2 = h(coroutineContext2);
        if (!zH && !zH2) {
            return coroutineContext.n0(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f143553a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.b(emptyCoroutineContext, new Function2() { // from class: mv.G
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C15777I.e(objectRef, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zH2) {
            objectRef.f143742a = ((CoroutineContext) objectRef.f143742a).b(emptyCoroutineContext, new Function2() { // from class: mv.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15777I.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.n0((CoroutineContext) objectRef.f143742a);
    }

    public static final CoroutineContext j(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!h(coroutineContext2)) {
            return coroutineContext.n0(coroutineContext2);
        }
        return d(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext k(InterfaceC15783O interfaceC15783O, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextD = d(interfaceC15783O.getCoroutineContext(), coroutineContext, true);
        if (coroutineContextD != C15800f0.a() && coroutineContextD.g(ContinuationInterceptor.INSTANCE) == null) {
            return coroutineContextD.n0(C15800f0.a());
        }
        return coroutineContextD;
    }
}

package yv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import mv.InterfaceC15780L;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u001d\u001a\u00028\u0000\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\f2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyv/b;", "Lmv/L;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "g", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "x0", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "n0", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C18376b implements InterfaceC15780L {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C18375a f172152a = C18375a.f172147b;

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        return (R) this.f172152a.b(initial, operation);
    }

    public boolean equals(Object other) {
        return (other instanceof C18376b) || (other instanceof C18375a);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) this.f172152a.g(key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.f172152a.getKey();
    }

    public int hashCode() {
        return C18375a.f172147b.hashCode();
    }

    @Override // mv.InterfaceC15780L
    public void m0(CoroutineContext context, Throwable exception) {
        this.f172152a.m0(context, exception);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext context) {
        return this.f172152a.n0(context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return this.f172152a.x0(key);
    }
}

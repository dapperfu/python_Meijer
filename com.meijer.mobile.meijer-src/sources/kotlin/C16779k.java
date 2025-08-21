package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Lqv/k;", "Lkotlin/coroutines/CoroutineContext;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "g", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "n0", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "x0", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16779k implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f159069a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Throwable e;

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        return (R) this.f159069a.b(initial, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) this.f159069a.g(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext context) {
        return this.f159069a.n0(context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return this.f159069a.x0(key);
    }

    public C16779k(Throwable th2, CoroutineContext coroutineContext) {
        this.f159069a = coroutineContext;
        this.e = th2;
    }
}

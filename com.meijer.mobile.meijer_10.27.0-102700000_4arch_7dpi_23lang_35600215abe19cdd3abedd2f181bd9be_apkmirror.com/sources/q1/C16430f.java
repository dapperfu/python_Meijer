package q1;

import P0.j;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lq1/f;", "LP0/j;", "<init>", "()V", "", "D", "()F", "scaleFactor", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16430f implements P0.j {

    /* renamed from: a, reason: collision with root package name */
    public static final C16430f f156678a = new C16430f();

    @Override // P0.j
    public float D() {
        return 0.0f;
    }

    private C16430f() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext F0(CoroutineContext.Key<?> key) {
        return j.a.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) j.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) j.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext m0(CoroutineContext coroutineContext) {
        return j.a.d(this, coroutineContext);
    }
}

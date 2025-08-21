package B2;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\fB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LB2/N;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "LB2/j;", "instance", "<init>", "(LB2/N;LB2/j;)V", "LB2/h;", "candidate", "", "e", "(LB2/h;)V", "a", "LB2/N;", "b", "LB2/j;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "c", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    private static final String f2238d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N parent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C2913j<?> instance;

    public N(N n10, C2913j<?> instance) {
        Intrinsics.j(instance, "instance");
        this.parent = n10;
        this.instance = instance;
    }

    public final void e(InterfaceC2911h<?> candidate) {
        Intrinsics.j(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(f2238d.toString());
        }
        N n10 = this.parent;
        if (n10 != null) {
            n10.e(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return Companion.C0042a.f2241a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }
}

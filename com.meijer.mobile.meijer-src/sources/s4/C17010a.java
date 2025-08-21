package s4;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ls4/a;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ls4/l;", "connectionWrapper", "<init>", "(Ls4/l;)V", "a", "Ls4/l;", "e", "()Ls4/l;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "b", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17010a implements CoroutineContext.Element {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l connectionWrapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls4/a$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Ls4/a;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s4.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key<C17010a> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public C17010a(l connectionWrapper) {
        Intrinsics.j(connectionWrapper, "connectionWrapper");
        this.connectionWrapper = connectionWrapper;
    }

    /* renamed from: e, reason: from getter */
    public final l getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<C17010a> getKey() {
        return INSTANCE;
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

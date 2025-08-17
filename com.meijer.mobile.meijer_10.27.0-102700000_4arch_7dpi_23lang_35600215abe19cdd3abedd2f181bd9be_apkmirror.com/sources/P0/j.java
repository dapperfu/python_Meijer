package P0;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LP0/j;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "D", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "T2", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface j extends CoroutineContext.Element {

    /* renamed from: T2, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f24516a;

    float D();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <R> R a(j jVar, R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.a(jVar, r10, function2);
        }

        public static <E extends CoroutineContext.Element> E b(j jVar, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.b(jVar, key);
        }

        public static CoroutineContext c(j jVar, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.c(jVar, key);
        }

        public static CoroutineContext d(j jVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(jVar, coroutineContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LP0/j$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "LP0/j;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: P0.j$b, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key<j> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f24516a = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }
}

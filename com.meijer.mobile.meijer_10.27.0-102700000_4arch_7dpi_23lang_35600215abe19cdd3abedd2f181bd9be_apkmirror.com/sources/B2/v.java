package B2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16674x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LB2/v;", "T", "", "<init>", "()V", "a", "LB2/v$a;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class v<T> {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B`\u00121\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011RB\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"LB2/v$a;", "T", "LB2/v;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "Lqv/x;", "ack", "LB2/H;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lqv/x;LB2/H;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", "d", "()Lkotlin/jvm/functions/Function2;", "b", "Lqv/x;", "()Lqv/x;", "c", "LB2/H;", "()LB2/H;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends v<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function2<T, Continuation<? super T>, Object> transform;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC16674x<T> ack;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final H<T> lastState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext callerContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, InterfaceC16674x<T> ack, H<T> h10, CoroutineContext callerContext) {
            super(null);
            Intrinsics.j(transform, "transform");
            Intrinsics.j(ack, "ack");
            Intrinsics.j(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = h10;
            this.callerContext = callerContext;
        }

        public final InterfaceC16674x<T> a() {
            return this.ack;
        }

        /* renamed from: b, reason: from getter */
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        public H<T> c() {
            return this.lastState;
        }

        public final Function2<T, Continuation<? super T>, Object> d() {
            return this.transform;
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v() {
    }
}

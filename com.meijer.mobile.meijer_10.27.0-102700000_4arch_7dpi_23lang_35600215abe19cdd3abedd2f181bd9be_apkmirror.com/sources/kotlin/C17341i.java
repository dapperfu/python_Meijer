package kotlin;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import sv.EnumC17050a;
import sv.r;
import sv.t;
import sv.v;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Luv/i;", "T", "Luv/d;", "", "Ltv/f;", "flows", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "Lqv/O;", "scope", "Lsv/v;", "n", "(Lqv/O;)Lsv/v;", "Lsv/t;", "", "i", "(Lsv/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17341i<T> extends AbstractC17336d<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iterable<InterfaceC17152f<T>> flows;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: uv.i$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163570a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f163571b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17355x<T> f163572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17152f<? extends T> interfaceC17152f, C17355x<T> c17355x, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163571b = interfaceC17152f;
            this.f163572c = c17355x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f163571b, this.f163572c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163570a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<T> interfaceC17152f = this.f163571b;
                C17355x<T> c17355x = this.f163572c;
                this.f163570a = 1;
                if (interfaceC17152f.collect(c17355x, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public /* synthetic */ C17341i(Iterable iterable, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC17050a.f161240a : enumC17050a);
    }

    @Override // kotlin.AbstractC17336d
    protected Object i(t<? super T> tVar, Continuation<? super Unit> continuation) {
        C17355x c17355x = new C17355x(tVar);
        Iterator<InterfaceC17152f<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            C16648k.d(tVar, null, null, new a(it.next(), c17355x, null), 3, null);
        }
        return Unit.f142422a;
    }

    @Override // kotlin.AbstractC17336d
    protected AbstractC17336d<T> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return new C17341i(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC17336d
    public v<T> n(InterfaceC16622O scope) {
        return r.b(scope, this.context, this.capacity, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17341i(Iterable<? extends InterfaceC17152f<? extends T>> iterable, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(coroutineContext, i10, enumC17050a);
        this.flows = iterable;
    }
}

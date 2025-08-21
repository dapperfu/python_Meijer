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
import mv.C15809k;
import mv.InterfaceC15783O;
import ov.EnumC16325a;
import ov.r;
import ov.t;
import ov.v;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqv/i;", "T", "Lqv/d;", "", "Lpv/f;", "flows", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "Lmv/O;", "scope", "Lov/v;", "n", "(Lmv/O;)Lov/v;", "Lov/t;", "", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16777i<T> extends AbstractC16772d<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iterable<InterfaceC16561f<T>> flows;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: qv.i$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f159047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16791x<T> f159048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16561f<? extends T> interfaceC16561f, C16791x<T> c16791x, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159047b = interfaceC16561f;
            this.f159048c = c16791x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f159047b, this.f159048c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159046a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<T> interfaceC16561f = this.f159047b;
                C16791x<T> c16791x = this.f159048c;
                this.f159046a = 1;
                if (interfaceC16561f.collect(c16791x, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ C16777i(Iterable iterable, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    @Override // kotlin.AbstractC16772d
    protected Object i(t<? super T> tVar, Continuation<? super Unit> continuation) {
        C16791x c16791x = new C16791x(tVar);
        Iterator<InterfaceC16561f<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            C15809k.d(tVar, null, null, new a(it.next(), c16791x, null), 3, null);
        }
        return Unit.f143329a;
    }

    @Override // kotlin.AbstractC16772d
    protected AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16777i(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC16772d
    public v<T> n(InterfaceC15783O scope) {
        return r.b(scope, this.context, this.capacity, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16777i(Iterable<? extends InterfaceC16561f<? extends T>> iterable, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(coroutineContext, i10, enumC16325a);
        this.flows = iterable;
    }
}

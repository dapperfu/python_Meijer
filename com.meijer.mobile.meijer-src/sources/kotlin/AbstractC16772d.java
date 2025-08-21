package kotlin;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15787T;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import ov.EnumC16325a;
import ov.r;
import ov.t;
import ov.v;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lqv/d;", "T", "Lqv/o;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "Lpv/f;", "k", "()Lpv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lpv/f;", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "Lov/t;", "scope", "", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmv/O;", "Lov/v;", "n", "(Lmv/O;)Lov/v;", "Lpv/g;", "collector", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "I", "c", "Lov/a;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "l", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "m", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC16772d<T> implements InterfaceC16783o<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int capacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final EnumC16325a onBufferOverflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: qv.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159015a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f159016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f159017c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC16772d<T> f159018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16562g<? super T> interfaceC16562g, AbstractC16772d<T> abstractC16772d, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159017c = interfaceC16562g;
            this.f159018d = abstractC16772d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f159017c, this.f159018d, continuation);
            aVar.f159016b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159015a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f159016b;
                InterfaceC16562g<T> interfaceC16562g = this.f159017c;
                v<T> vVarN = this.f159018d.n(interfaceC15783O);
                this.f159015a = 1;
                if (C16563h.w(interfaceC16562g, vVarN, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lov/t;", "it", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: qv.d$b */
    static final class b extends SuspendLambda implements Function2<t<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159019a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f159020b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC16772d<T> f159021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC16772d<T> abstractC16772d, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f159021c = abstractC16772d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f159021c, continuation);
            bVar.f159020b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super T> tVar, Continuation<? super Unit> continuation) {
            return ((b) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159019a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t<? super T> tVar = (t) this.f159020b;
                AbstractC16772d<T> abstractC16772d = this.f159021c;
                this.f159019a = 1;
                if (abstractC16772d.i(tVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    protected String g() {
        return null;
    }

    protected abstract Object i(t<? super T> tVar, Continuation<? super Unit> continuation);

    protected abstract AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow);

    public InterfaceC16561f<T> k() {
        return null;
    }

    static /* synthetic */ <T> Object h(AbstractC16772d<T> abstractC16772d, InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        Object objG = C15784P.g(new a(interfaceC16562g, abstractC16772d, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlin.InterfaceC16783o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv.InterfaceC16561f<T> a(kotlin.coroutines.CoroutineContext r2, int r3, ov.EnumC16325a r4) {
        /*
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlin.coroutines.CoroutineContext r2 = r2.n0(r0)
            ov.a r0 = ov.EnumC16325a.f155824a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            ov.a r4 = r1.onBufferOverflow
        L25:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            ov.a r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            qv.d r2 = r1.j(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC16772d.a(kotlin.coroutines.CoroutineContext, int, ov.a):pv.f");
    }

    public final Function2<t<? super T>, Continuation<? super Unit>, Object> l() {
        return new b(this, null);
    }

    public final int m() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public v<T> n(InterfaceC15783O scope) {
        return r.e(scope, this.context, m(), this.onBufferOverflow, EnumC15785Q.f151687c, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        if (this.context != EmptyCoroutineContext.f143553a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != EnumC16325a.f155824a) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return C15787T.a(this) + '[' + CollectionsKt.B0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public AbstractC16772d(CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = enumC16325a;
    }

    @Override // pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        return h(this, interfaceC16562g, continuation);
    }
}

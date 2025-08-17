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
import qv.C16623P;
import qv.C16626T;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import sv.EnumC17050a;
import sv.r;
import sv.t;
import sv.v;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Luv/d;", "T", "Luv/o;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "Ltv/f;", "k", "()Ltv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "Lsv/t;", "scope", "", "i", "(Lsv/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/O;", "Lsv/v;", "n", "(Lqv/O;)Lsv/v;", "Ltv/g;", "collector", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", "b", "I", "c", "Lsv/a;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "l", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "m", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC17336d<T> implements InterfaceC17347o<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final int capacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final EnumC17050a onBufferOverflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: uv.d$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163539a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f163540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<T> f163541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC17336d<T> f163542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17153g<? super T> interfaceC17153g, AbstractC17336d<T> abstractC17336d, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163541c = interfaceC17153g;
            this.f163542d = abstractC17336d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f163541c, this.f163542d, continuation);
            aVar.f163540b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163539a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f163540b;
                InterfaceC17153g<T> interfaceC17153g = this.f163541c;
                v<T> vVarN = this.f163542d.n(interfaceC16622O);
                this.f163539a = 1;
                if (C17154h.w(interfaceC17153g, vVarN, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lsv/t;", "it", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: uv.d$b */
    static final class b extends SuspendLambda implements Function2<t<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163543a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f163544b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17336d<T> f163545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC17336d<T> abstractC17336d, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163545c = abstractC17336d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f163545c, continuation);
            bVar.f163544b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super T> tVar, Continuation<? super Unit> continuation) {
            return ((b) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163543a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t<? super T> tVar = (t) this.f163544b;
                AbstractC17336d<T> abstractC17336d = this.f163545c;
                this.f163543a = 1;
                if (abstractC17336d.i(tVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    protected String g() {
        return null;
    }

    protected abstract Object i(t<? super T> tVar, Continuation<? super Unit> continuation);

    protected abstract AbstractC17336d<T> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow);

    public InterfaceC17152f<T> k() {
        return null;
    }

    static /* synthetic */ <T> Object h(AbstractC17336d<T> abstractC17336d, InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(interfaceC17153g, abstractC17336d, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlin.InterfaceC17347o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.InterfaceC17152f<T> a(kotlin.coroutines.CoroutineContext r2, int r3, sv.EnumC17050a r4) {
        /*
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlin.coroutines.CoroutineContext r2 = r2.m0(r0)
            sv.a r0 = sv.EnumC17050a.f161240a
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
            sv.a r4 = r1.onBufferOverflow
        L25:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            sv.a r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            uv.d r2 = r1.j(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC17336d.a(kotlin.coroutines.CoroutineContext, int, sv.a):tv.f");
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

    public v<T> n(InterfaceC16622O scope) {
        return r.e(scope, this.context, m(), this.onBufferOverflow, EnumC16624Q.f157613c, null, l(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        if (this.context != EmptyCoroutineContext.f142646a) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != EnumC17050a.f161240a) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return C16626T.a(this) + '[' + CollectionsKt.B0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public AbstractC17336d(CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = enumC17050a;
    }

    @Override // tv.InterfaceC17152f
    public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        return h(this, interfaceC17153g, continuation);
    }
}

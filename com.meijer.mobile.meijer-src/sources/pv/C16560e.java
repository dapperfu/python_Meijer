package pv;

import kotlin.C16786r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018RH\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpv/e;", "T", "Lpv/f;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "<init>", "(Lpv/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lpv/f;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16560e<T> implements InterfaceC16561f<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<T> upstream;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Function1<T, Object> keySelector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Function2<Object, Object, Boolean> areEquivalent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pv.e$a */
    static final class a<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C16560e<T> f157513a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f157514b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16562g<T> f157515c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        /* renamed from: pv.e$a$a, reason: collision with other inner class name */
        static final class C2439a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<T> f157517b;

            /* renamed from: c, reason: collision with root package name */
            int f157518c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2439a(a<? super T> aVar, Continuation<? super C2439a> continuation) {
                super(continuation);
                this.f157517b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157516a = obj;
                this.f157518c |= Integer.MIN_VALUE;
                return this.f157517b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(C16560e<T> c16560e, Ref.ObjectRef<Object> objectRef, InterfaceC16562g<? super T> interfaceC16562g) {
            this.f157513a = c16560e;
            this.f157514b = objectRef;
            this.f157515c = interfaceC16562g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16562g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16560e.a.C2439a
                if (r0 == 0) goto L13
                r0 = r7
                pv.e$a$a r0 = (pv.C16560e.a.C2439a) r0
                int r1 = r0.f157518c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157518c = r1
                goto L18
            L13:
                pv.e$a$a r0 = new pv.e$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f157516a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157518c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.ResultKt.b(r7)
                pv.e<T> r7 = r5.f157513a
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.keySelector
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f157514b
                T r2 = r2.f143742a
                rv.E r4 = kotlin.C16786r.f159079a
                if (r2 == r4) goto L58
                pv.e<T> r4 = r5.f157513a
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.areEquivalent
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f157514b
                r2.f143742a = r7
                pv.g<T> r7 = r5.f157515c
                r0.f157518c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16560e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = (T) C16786r.f159079a;
        Object objCollect = this.upstream.collect(new a(this, objectRef, interfaceC16562g), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16560e(InterfaceC16561f<? extends T> interfaceC16561f, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.upstream = interfaceC16561f;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }
}

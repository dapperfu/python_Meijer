package pv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpv/N;", "Lpv/L;", "<init>", "()V", "Lpv/P;", "", "subscriptionCount", "Lpv/f;", "Lpv/J;", "a", "(Lpv/P;)Lpv/f;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class N implements L {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv/g;", "Lpv/J;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super J>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157455a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f157456b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P<Integer> f157457c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pv.N$a$a, reason: collision with other inner class name */
        static final class C2436a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f157458a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g<J> f157459b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: pv.N$a$a$a, reason: collision with other inner class name */
            static final class C2437a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f157460a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2436a<T> f157461b;

                /* renamed from: c, reason: collision with root package name */
                int f157462c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2437a(C2436a<? super T> c2436a, Continuation<? super C2437a> continuation) {
                    super(continuation);
                    this.f157461b = c2436a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f157460a = obj;
                    this.f157462c |= Integer.MIN_VALUE;
                    return this.f157461b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2436a(Ref.BooleanRef booleanRef, InterfaceC16562g<? super J> interfaceC16562g) {
                this.f157458a = booleanRef;
                this.f157459b = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pv.N.a.C2436a.C2437a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pv.N$a$a$a r0 = (pv.N.a.C2436a.C2437a) r0
                    int r1 = r0.f157462c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f157462c = r1
                    goto L18
                L13:
                    pv.N$a$a$a r0 = new pv.N$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f157460a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f157462c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f157458a
                    boolean r6 = r5.f143735a
                    if (r6 != 0) goto L4e
                    r5.f143735a = r3
                    pv.g<pv.J> r5 = r4.f157459b
                    pv.J r6 = pv.J.f157442a
                    r0.f157462c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pv.N.a.C2436a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P<Integer> p10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f157457c = p10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f157457c, continuation);
            aVar.f157456b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super J> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157455a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f157456b;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                P<Integer> p10 = this.f157457c;
                C2436a c2436a = new C2436a(booleanRef, interfaceC16562g);
                this.f157455a = 1;
                if (p10.collect(c2436a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // pv.L
    public InterfaceC16561f<J> a(P<Integer> subscriptionCount) {
        return C16563h.E(new a(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}

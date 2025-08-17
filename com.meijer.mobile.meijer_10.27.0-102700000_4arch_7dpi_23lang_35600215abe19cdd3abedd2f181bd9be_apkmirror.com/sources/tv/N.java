package tv;

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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltv/N;", "Ltv/L;", "<init>", "()V", "Ltv/P;", "", "subscriptionCount", "Ltv/f;", "Ltv/J;", "a", "(Ltv/P;)Ltv/f;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
final class N implements L {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "Ltv/J;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super J>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162141a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P<Integer> f162143c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tv.N$a$a, reason: collision with other inner class name */
        static final class C2543a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f162144a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g<J> f162145b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: tv.N$a$a$a, reason: collision with other inner class name */
            static final class C2544a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f162146a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2543a<T> f162147b;

                /* renamed from: c, reason: collision with root package name */
                int f162148c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2544a(C2543a<? super T> c2543a, Continuation<? super C2544a> continuation) {
                    super(continuation);
                    this.f162147b = c2543a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f162146a = obj;
                    this.f162148c |= Integer.MIN_VALUE;
                    return this.f162147b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2543a(Ref.BooleanRef booleanRef, InterfaceC17153g<? super J> interfaceC17153g) {
                this.f162144a = booleanRef;
                this.f162145b = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof tv.N.a.C2543a.C2544a
                    if (r0 == 0) goto L13
                    r0 = r6
                    tv.N$a$a$a r0 = (tv.N.a.C2543a.C2544a) r0
                    int r1 = r0.f162148c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f162148c = r1
                    goto L18
                L13:
                    tv.N$a$a$a r0 = new tv.N$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f162146a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f162148c
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
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f162144a
                    boolean r6 = r5.f142828a
                    if (r6 != 0) goto L4e
                    r5.f142828a = r3
                    tv.g<tv.J> r5 = r4.f162145b
                    tv.J r6 = tv.J.f162128a
                    r0.f162148c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: tv.N.a.C2543a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P<Integer> p10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162143c = p10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f162143c, continuation);
            aVar.f162142b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super J> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f162141a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f162142b;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                P<Integer> p10 = this.f162143c;
                C2543a c2543a = new C2543a(booleanRef, interfaceC17153g);
                this.f162141a = 1;
                if (p10.collect(c2543a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // tv.L
    public InterfaceC17152f<J> a(P<Integer> subscriptionCount) {
        return C17154h.E(new a(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}

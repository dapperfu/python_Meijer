package Z4;

import O4.AbstractC4373v;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LS4/i;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "c", "(LS4/i;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f43604a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Z4.a$a, reason: collision with other inner class name */
    public static final class C0923a implements InterfaceC16561f<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f43605a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @SourceDebugExtension
        /* renamed from: Z4.a$a$a, reason: collision with other inner class name */
        public static final class C0924a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f43606a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", f = "ConstraintTrackingWorker.kt", l = {223}, m = "emit")
            /* renamed from: Z4.a$a$a$a, reason: collision with other inner class name */
            public static final class C0925a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f43607a;

                /* renamed from: b, reason: collision with root package name */
                int f43608b;

                public C0925a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f43607a = obj;
                    this.f43608b |= Integer.MIN_VALUE;
                    return C0924a.this.emit(null, this);
                }
            }

            public C0924a(InterfaceC16562g interfaceC16562g) {
                this.f43606a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Z4.a.C0923a.C0924a.C0925a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Z4.a$a$a$a r0 = (Z4.a.C0923a.C0924a.C0925a) r0
                    int r1 = r0.f43608b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43608b = r1
                    goto L18
                L13:
                    Z4.a$a$a$a r0 = new Z4.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f43607a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f43608b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f43606a
                    boolean r2 = r5 instanceof S4.b.ConstraintsNotMet
                    if (r2 == 0) goto L43
                    r0.f43608b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Z4.a.C0923a.C0924a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C0923a(InterfaceC16561f interfaceC16561f) {
            this.f43605a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Object> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f43605a.collect(new C0924a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", f = "ConstraintTrackingWorker.kt", l = {160}, m = "awaitConstraintsNotMet")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f43610a;

        /* renamed from: b, reason: collision with root package name */
        int f43611b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43610a = obj;
            this.f43611b |= Integer.MIN_VALUE;
            return a.c(null, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS4/b;", "it", "", "<anonymous>", "(LS4/b;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<S4.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f43612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WorkSpec f43613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(WorkSpec workSpec, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f43613b = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f43613b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S4.b bVar, Continuation<? super Unit> continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f43612a == 0) {
                ResultKt.b(obj);
                String str = a.f43604a;
                WorkSpec workSpec = this.f43613b;
                AbstractC4373v.e().a(str, "Constraints changed for " + workSpec);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        String strI = AbstractC4373v.i("ConstraintTrkngWrkr");
        Intrinsics.i(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f43604a = strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(S4.i r4, androidx.work.impl.model.WorkSpec r5, kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof Z4.a.b
            if (r0 == 0) goto L13
            r0 = r6
            Z4.a$b r0 = (Z4.a.b) r0
            int r1 = r0.f43611b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43611b = r1
            goto L18
        L13:
            Z4.a$b r0 = new Z4.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f43610a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f43611b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r6)
            pv.f r4 = r4.b(r5)
            Z4.a$c r6 = new Z4.a$c
            r2 = 0
            r6.<init>(r5, r2)
            pv.f r4 = pv.C16563h.O(r4, r6)
            Z4.a$a r5 = new Z4.a$a
            r5.<init>(r4)
            r0.f43611b = r3
            java.lang.Object r6 = pv.C16563h.A(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            S4.b$b r6 = (S4.b.ConstraintsNotMet) r6
            int r4 = r6.getReason()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.a.c(S4.i, androidx.work.impl.model.WorkSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

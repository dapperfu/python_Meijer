package Y4;

import N4.AbstractC4333v;
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
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LR4/i;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "c", "(LR4/i;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40106a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Y4.a$a, reason: collision with other inner class name */
    public static final class C0860a implements InterfaceC17152f<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f40107a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @SourceDebugExtension
        /* renamed from: Y4.a$a$a, reason: collision with other inner class name */
        public static final class C0861a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f40108a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", f = "ConstraintTrackingWorker.kt", l = {223}, m = "emit")
            /* renamed from: Y4.a$a$a$a, reason: collision with other inner class name */
            public static final class C0862a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f40109a;

                /* renamed from: b, reason: collision with root package name */
                int f40110b;

                public C0862a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f40109a = obj;
                    this.f40110b |= Integer.MIN_VALUE;
                    return C0861a.this.emit(null, this);
                }
            }

            public C0861a(InterfaceC17153g interfaceC17153g) {
                this.f40108a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Y4.a.C0860a.C0861a.C0862a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Y4.a$a$a$a r0 = (Y4.a.C0860a.C0861a.C0862a) r0
                    int r1 = r0.f40110b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40110b = r1
                    goto L18
                L13:
                    Y4.a$a$a$a r0 = new Y4.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40109a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f40110b
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
                    tv.g r6 = r4.f40108a
                    boolean r2 = r5 instanceof R4.b.ConstraintsNotMet
                    if (r2 == 0) goto L43
                    r0.f40110b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Y4.a.C0860a.C0861a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C0860a(InterfaceC17152f interfaceC17152f) {
            this.f40107a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Object> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f40107a.collect(new C0861a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", f = "ConstraintTrackingWorker.kt", l = {160}, m = "awaitConstraintsNotMet")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40112a;

        /* renamed from: b, reason: collision with root package name */
        int f40113b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40112a = obj;
            this.f40113b |= Integer.MIN_VALUE;
            return a.c(null, null, this);
        }

        b(Continuation<? super b> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR4/b;", "it", "", "<anonymous>", "(LR4/b;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<R4.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f40114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WorkSpec f40115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(WorkSpec workSpec, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f40115b = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f40115b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R4.b bVar, Continuation<? super Unit> continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f40114a == 0) {
                ResultKt.b(obj);
                String str = a.f40106a;
                WorkSpec workSpec = this.f40115b;
                AbstractC4333v.e().a(str, "Constraints changed for " + workSpec);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        String strI = AbstractC4333v.i("ConstraintTrkngWrkr");
        Intrinsics.i(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f40106a = strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(R4.i r4, androidx.work.impl.model.WorkSpec r5, kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof Y4.a.b
            if (r0 == 0) goto L13
            r0 = r6
            Y4.a$b r0 = (Y4.a.b) r0
            int r1 = r0.f40113b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40113b = r1
            goto L18
        L13:
            Y4.a$b r0 = new Y4.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40112a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40113b
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
            tv.f r4 = r4.b(r5)
            Y4.a$c r6 = new Y4.a$c
            r2 = 0
            r6.<init>(r5, r2)
            tv.f r4 = tv.C17154h.O(r4, r6)
            Y4.a$a r5 = new Y4.a$a
            r5.<init>(r4)
            r0.f40113b = r3
            java.lang.Object r6 = tv.C17154h.A(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            R4.b$b r6 = (R4.b.ConstraintsNotMet) r6
            int r4 = r6.getReason()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.a.c(R4.i, androidx.work.impl.model.WorkSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package androidx.room;

import android.os.CancellationSignal;
import androidx.room.C6118d;
import java.util.concurrent.Callable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;
import tv.InterfaceC17152f;
import z4.InterfaceC18380b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/d;", "", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6118d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0016\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00150\u0014\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/room/d$a;", "", "<init>", "()V", "R", "Landroidx/room/G;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "e", "(Landroidx/room/G;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "d", "(Landroidx/room/G;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tableNames", "Ltv/f;", "Lkotlin/jvm/JvmSuppressWildcards;", "b", "(Landroidx/room/G;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Ltv/f;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.room.d$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {48, 49}, m = "execute")
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        static final class C1143a<R> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f58536a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f58537b;

            /* renamed from: d, reason: collision with root package name */
            int f58539d;

            C1143a(Continuation<? super C1143a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f58537b = obj;
                this.f58539d |= Integer.MIN_VALUE;
                return Companion.this.e(null, false, null, this);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lqv/O;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.d$a$b */
        static final class b<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super R>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f58540a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable<R> f58541b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f58541b = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f58541b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super R> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f58540a == 0) {
                    ResultKt.b(obj);
                    return this.f58541b.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {64, 94}, m = "execute")
        /* renamed from: androidx.room.d$a$c */
        static final class c<R> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f58542a;

            /* renamed from: b, reason: collision with root package name */
            Object f58543b;

            /* renamed from: c, reason: collision with root package name */
            Object f58544c;

            /* renamed from: d, reason: collision with root package name */
            Object f58545d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f58546e;

            /* renamed from: g, reason: collision with root package name */
            int f58548g;

            c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f58546e = obj;
                this.f58548g |= Integer.MIN_VALUE;
                return Companion.this.d(null, false, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        static final class C1144d implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f58549a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0 f58550b;

            C1144d(CancellationSignal cancellationSignal, C0 c02) {
                this.f58549a = cancellationSignal;
                this.f58550b = c02;
            }

            public final void a(Throwable th2) {
                CancellationSignal cancellationSignal = this.f58549a;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                C0.a.a(this.f58550b, null, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.d$a$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f58551a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable<R> f58552b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16654n<R> f58553c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f58552b, this.f58553c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(Callable<R> callable, InterfaceC16654n<? super R> interfaceC16654n, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f58552b = callable;
                this.f58553c = interfaceC16654n;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f58551a == 0) {
                    ResultKt.b(obj);
                    try {
                        this.f58553c.resumeWith(Result.b(this.f58552b.call()));
                    } catch (Throwable th2) {
                        Continuation continuation = this.f58553c;
                        Result.Companion companion = Result.INSTANCE;
                        continuation.resumeWith(Result.b(ResultKt.a(th2)));
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(Callable callable, InterfaceC18380b it) {
            Intrinsics.j(it, "it");
            return callable.call();
        }

        @Deprecated
        @JvmStatic
        public final <R> InterfaceC17152f<R> b(G db2, boolean inTransaction, String[] tableNames, final Callable<R> callable) {
            Intrinsics.j(db2, "db");
            Intrinsics.j(tableNames, "tableNames");
            Intrinsics.j(callable, "callable");
            return s4.j.a(db2, inTransaction, tableNames, new Function1() { // from class: androidx.room.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6118d.Companion.c(callable, (InterfaceC18380b) obj);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @kotlin.Deprecated
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object d(androidx.room.G r17, boolean r18, android.os.CancellationSignal r19, java.util.concurrent.Callable<R> r20, kotlin.coroutines.Continuation<? super R> r21) {
            /*
                r16 = this;
                r0 = r17
                r1 = r21
                boolean r2 = r1 instanceof androidx.room.C6118d.Companion.c
                if (r2 == 0) goto L19
                r2 = r1
                androidx.room.d$a$c r2 = (androidx.room.C6118d.Companion.c) r2
                int r3 = r2.f58548g
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L19
                int r3 = r3 - r4
                r2.f58548g = r3
                r3 = r16
                goto L20
            L19:
                androidx.room.d$a$c r2 = new androidx.room.d$a$c
                r3 = r16
                r2.<init>(r1)
            L20:
                java.lang.Object r1 = r2.f58546e
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r5 = r2.f58548g
                r6 = 2
                r7 = 1
                if (r5 == 0) goto L61
                if (r5 == r7) goto L4c
                if (r5 != r6) goto L44
                java.lang.Object r0 = r2.f58545d
                kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
                java.lang.Object r0 = r2.f58544c
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r0 = r2.f58543b
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                java.lang.Object r0 = r2.f58542a
                androidx.room.G r0 = (androidx.room.G) r0
                kotlin.ResultKt.b(r1)
                return r1
            L44:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L4c:
                java.lang.Object r0 = r2.f58544c
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r5 = r2.f58543b
                android.os.CancellationSignal r5 = (android.os.CancellationSignal) r5
                java.lang.Object r8 = r2.f58542a
                androidx.room.G r8 = (androidx.room.G) r8
                kotlin.ResultKt.b(r1)
                r15 = r5
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r15
                goto L8a
            L61:
                kotlin.ResultKt.b(r1)
                boolean r1 = r0.isOpenInternal()
                if (r1 == 0) goto L75
                boolean r1 = r0.inTransaction()
                if (r1 == 0) goto L75
                java.lang.Object r0 = r20.call()
                return r0
            L75:
                r2.f58542a = r0
                r1 = r19
                r2.f58543b = r1
                r5 = r20
                r2.f58544c = r5
                r2.f58548g = r7
                r8 = r18
                java.lang.Object r8 = w4.C17754b.d(r0, r8, r2)
                if (r8 != r4) goto L8a
                goto Lcb
            L8a:
                r10 = r8
                kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
                r2.f58542a = r0
                r2.f58543b = r1
                r2.f58544c = r5
                r2.f58545d = r10
                r2.f58548g = r6
                qv.p r6 = new qv.p
                kotlin.coroutines.Continuation r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r2)
                r6.<init>(r8, r7)
                r6.C()
                qv.O r9 = r0.getCoroutineScope()
                androidx.room.d$a$e r12 = new androidx.room.d$a$e
                r0 = 0
                r12.<init>(r5, r6, r0)
                r13 = 2
                r14 = 0
                r11 = 0
                qv.C0 r0 = qv.C16644i.d(r9, r10, r11, r12, r13, r14)
                androidx.room.d$a$d r5 = new androidx.room.d$a$d
                r5.<init>(r1, r0)
                r6.F(r5)
                java.lang.Object r0 = r6.v()
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                if (r0 != r1) goto Lc9
                kotlin.coroutines.jvm.internal.DebugProbesKt.c(r2)
            Lc9:
                if (r0 != r4) goto Lcc
            Lcb:
                return r4
            Lcc:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C6118d.Companion.d(androidx.room.G, boolean, android.os.CancellationSignal, java.util.concurrent.Callable, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @kotlin.Deprecated
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object e(androidx.room.G r6, boolean r7, java.util.concurrent.Callable<R> r8, kotlin.coroutines.Continuation<? super R> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof androidx.room.C6118d.Companion.C1143a
                if (r0 == 0) goto L13
                r0 = r9
                androidx.room.d$a$a r0 = (androidx.room.C6118d.Companion.C1143a) r0
                int r1 = r0.f58539d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f58539d = r1
                goto L18
            L13:
                androidx.room.d$a$a r0 = new androidx.room.d$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f58537b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f58539d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.b(r9)
                return r9
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f58536a
                r8 = r6
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                kotlin.ResultKt.b(r9)
                goto L5c
            L3d:
                kotlin.ResultKt.b(r9)
                boolean r9 = r6.isOpenInternal()
                if (r9 == 0) goto L51
                boolean r9 = r6.inTransaction()
                if (r9 == 0) goto L51
                java.lang.Object r6 = r8.call()
                return r6
            L51:
                r0.f58536a = r8
                r0.f58539d = r4
                java.lang.Object r9 = w4.C17754b.d(r6, r7, r0)
                if (r9 != r1) goto L5c
                goto L6e
            L5c:
                kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
                androidx.room.d$a$b r6 = new androidx.room.d$a$b
                r7 = 0
                r6.<init>(r8, r7)
                r0.f58536a = r7
                r0.f58539d = r3
                java.lang.Object r6 = qv.C16644i.g(r9, r6, r0)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C6118d.Companion.e(androidx.room.G, boolean, java.util.concurrent.Callable, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Deprecated
    @JvmStatic
    public static final <R> InterfaceC17152f<R> a(G g10, boolean z10, String[] strArr, Callable<R> callable) {
        return INSTANCE.b(g10, z10, strArr, callable);
    }

    @Deprecated
    @JvmStatic
    public static final <R> Object b(G g10, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.d(g10, z10, cancellationSignal, callable, continuation);
    }

    @Deprecated
    @JvmStatic
    public static final <R> Object c(G g10, boolean z10, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.e(g10, z10, callable, continuation);
    }
}

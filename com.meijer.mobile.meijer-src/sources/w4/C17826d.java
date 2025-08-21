package w4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.G;
import androidx.room.T;
import androidx.room.W;
import androidx.room.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import t4.C17178a;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"R", "Landroidx/room/G;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "LA4/b;", "block", "e", "(Landroidx/room/G;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Landroidx/room/G;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "c", "(Landroidx/room/G;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB4/f;", "sqLiteQuery", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "f", "(Landroidx/room/G;LB4/f;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "LB4/c;", "", "b", "(LB4/c;)V", "Ljava/io/File;", "databaseFile", "", "g", "(Ljava/io/File;)I", "a", "()Landroid/os/CancellationSignal;", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
@SourceDebugExtension
/* renamed from: w4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17826d {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {247}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: w4.d$a */
    static final class a<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f166872b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f166873c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f166874d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<A4.b, R> f166875e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/X;", "transactor", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: w4.d$a$a, reason: collision with other inner class name */
        public static final class C2650a extends SuspendLambda implements Function2<X, Continuation<? super R>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f166876a;

            /* renamed from: b, reason: collision with root package name */
            int f166877b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f166878c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f166879d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f166880e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ G f166881f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f166882g;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: w4.d$a$a$a, reason: collision with other inner class name */
            public static final class C2651a extends SuspendLambda implements Function2<W<R>, Continuation<? super R>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f166883a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f166884b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1 f166885c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2651a(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.f166885c = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C2651a c2651a = new C2651a(continuation, this.f166885c);
                    c2651a.f166884b = obj;
                    return c2651a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(W<R> w10, Continuation<? super R> continuation) {
                    return ((C2651a) create(w10, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f166883a == 0) {
                        ResultKt.b(obj);
                        W w10 = (W) this.f166884b;
                        Intrinsics.h(w10, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f166885c.invoke(((s4.m) w10).c());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2650a(boolean z10, boolean z11, G g10, Continuation continuation, Function1 function1) {
                super(2, continuation);
                this.f166879d = z10;
                this.f166880e = z11;
                this.f166881f = g10;
                this.f166882g = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2650a c2650a = new C2650a(this.f166879d, this.f166880e, this.f166881f, continuation, this.f166882g);
                c2650a.f166878c = obj;
                return c2650a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(X x10, Continuation<? super R> continuation) {
                return ((C2650a) create(x10, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
              0x00a2: PHI (r1v11 androidx.room.X) = (r1v8 androidx.room.X), (r1v18 androidx.room.X) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
              0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: w4.C17826d.a.C2650a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(G g10, boolean z10, boolean z11, Function1<? super A4.b, ? extends R> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f166872b = g10;
            this.f166873c = z10;
            this.f166874d = z11;
            this.f166875e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f166872b, this.f166873c, this.f166874d, this.f166875e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166871a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            if ((!this.f166872b.inCompatibilityMode$room_runtime_release() || !this.f166872b.inTransaction()) && this.f166873c) {
                z10 = true;
            } else {
                z10 = false;
            }
            G g10 = this.f166872b;
            boolean z11 = this.f166874d;
            C2650a c2650a = new C2650a(z10, z11, g10, null, this.f166875e);
            this.f166871a = 1;
            Object objUseConnection$room_runtime_release = g10.useConnection$room_runtime_release(z11, c2650a, this);
            if (objUseConnection$room_runtime_release == objF) {
                return objF;
            }
            return objUseConnection$room_runtime_release;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {113}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: w4.d$b */
    public static final class b<R> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f166887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f166888c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f166889d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f166890e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, G g10, boolean z10, boolean z11, Function1 function1) {
            super(2, continuation);
            this.f166887b = g10;
            this.f166888c = z10;
            this.f166889d = z11;
            this.f166890e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(continuation, this.f166887b, this.f166888c, this.f166889d, this.f166890e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super R> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166886a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            G g10 = this.f166887b;
            boolean z10 = this.f166888c;
            C2652d c2652d = new C2652d(this.f166889d, z10, g10, null, this.f166890e);
            this.f166886a = 1;
            Object objUseConnection$room_runtime_release = g10.useConnection$room_runtime_release(z10, c2652d, this);
            if (objUseConnection$room_runtime_release == objF) {
                return objF;
            }
            return objUseConnection$room_runtime_release;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {249, 251, 251}, m = "performSuspending")
    /* renamed from: w4.d$c */
    static final class c<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f166891a;

        /* renamed from: b, reason: collision with root package name */
        Object f166892b;

        /* renamed from: c, reason: collision with root package name */
        boolean f166893c;

        /* renamed from: d, reason: collision with root package name */
        boolean f166894d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f166895e;

        /* renamed from: f, reason: collision with root package name */
        int f166896f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f166895e = obj;
            this.f166896f |= Integer.MIN_VALUE;
            return C17824b.f(null, false, false, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/X;", "transactor", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: w4.d$d, reason: collision with other inner class name */
    public static final class C2652d<R> extends SuspendLambda implements Function2<X, Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f166897a;

        /* renamed from: b, reason: collision with root package name */
        int f166898b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f166899c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f166900d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f166901e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f166902f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f166903g;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: w4.d$d$a */
        public static final class a extends SuspendLambda implements Function2<W<R>, Continuation<? super R>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f166904a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f166905b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f166906c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function1 function1) {
                super(2, continuation);
                this.f166906c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation, this.f166906c);
                aVar.f166905b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(W<R> w10, Continuation<? super R> continuation) {
                return ((a) create(w10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f166904a == 0) {
                    ResultKt.b(obj);
                    W w10 = (W) this.f166905b;
                    Intrinsics.h(w10, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f166906c.invoke(((s4.m) w10).c());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2652d(boolean z10, boolean z11, G g10, Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.f166900d = z10;
            this.f166901e = z11;
            this.f166902f = g10;
            this.f166903g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2652d c2652d = new C2652d(this.f166900d, this.f166901e, this.f166902f, continuation, this.f166903g);
            c2652d.f166899c = obj;
            return c2652d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X x10, Continuation<? super R> continuation) {
            return ((C2652d) create(x10, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 androidx.room.X) = (r1v8 androidx.room.X), (r1v18 androidx.room.X) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.C17826d.C2652d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Deprecated
    public static final CancellationSignal a() {
        return new CancellationSignal();
    }

    @Deprecated
    public static final void b(B4.c db2) {
        Intrinsics.j(db2, "db");
        C17824b.b(new C17178a(db2));
    }

    public static final <R> R d(G db2, boolean z10, boolean z11, Function1<? super A4.b, ? extends R> block) {
        Intrinsics.j(db2, "db");
        Intrinsics.j(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        return (R) s4.n.a(new a(db2, z11, z10, block, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object e(androidx.room.G r14, boolean r15, boolean r16, kotlin.jvm.functions.Function1<? super A4.b, ? extends R> r17, kotlin.coroutines.Continuation<? super R> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof w4.C17826d.c
            if (r1 == 0) goto L16
            r1 = r0
            w4.d$c r1 = (w4.C17826d.c) r1
            int r2 = r1.f166896f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f166896f = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            w4.d$c r1 = new w4.d$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f166895e
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f166896f
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.ResultKt.b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.f166894d
            boolean r15 = r6.f166893c
            java.lang.Object r1 = r6.f166892b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.f166891a
            androidx.room.G r3 = (androidx.room.G) r3
            kotlin.ResultKt.b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.ResultKt.b(r0)
            return r0
        L53:
            kotlin.ResultKt.b(r0)
            boolean r0 = r14.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L7f
            boolean r0 = r14.isOpenInternal()
            if (r0 == 0) goto L7f
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7f
            w4.d$d r0 = new w4.d$d
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.f166896f = r8
            java.lang.Object r14 = r14.useConnection$room_runtime_release(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.f166891a = r14
            r5 = r17
            r6.f166892b = r5
            r6.f166893c = r15
            r6.f166894d = r4
            r6.f166896f = r3
            java.lang.Object r3 = w4.C17824b.d(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            w4.d$b r8 = new w4.d$b
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.f166891a = r14
            r6.f166892b = r14
            r6.f166896f = r2
            java.lang.Object r14 = mv.C15805i.g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C17826d.e(androidx.room.G, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Cursor f(G db2, B4.f sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        Intrinsics.j(db2, "db");
        Intrinsics.j(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? C17823a.a(cursorQuery) : cursorQuery;
    }

    public static final int g(File databaseFile) throws IOException {
        Intrinsics.j(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            CloseableKt.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.a(channel, th2);
                throw th3;
            }
        }
    }

    public static final Object c(G g10, boolean z10, Continuation<? super CoroutineContext> continuation) {
        ContinuationInterceptor transactionDispatcher;
        CoroutineContext coroutineContextN0;
        if (g10.inCompatibilityMode$room_runtime_release()) {
            T t10 = (T) continuation.getContext().g(T.INSTANCE);
            if (t10 != null && (transactionDispatcher = t10.getTransactionDispatcher()) != null && (coroutineContextN0 = g10.getQueryContext().n0(transactionDispatcher)) != null) {
                return coroutineContextN0;
            }
            if (z10) {
                return g10.getTransactionContext$room_runtime_release();
            }
            return g10.getQueryContext();
        }
        return g10.getCoroutineScope().getCoroutineContext();
    }
}

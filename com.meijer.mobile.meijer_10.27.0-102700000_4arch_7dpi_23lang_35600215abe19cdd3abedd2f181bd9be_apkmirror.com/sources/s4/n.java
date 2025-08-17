package s4;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16644i;
import qv.C16646j;
import qv.C16671v0;
import qv.C16678z;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import qv.InterfaceC16674x;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lkotlin/Function2;", "Lqv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lqv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    static final class a<T> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160184a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f160185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC16622O, Continuation<? super T>, Object> f160186c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: s4.n$a$a, reason: collision with other inner class name */
        static final class C2499a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f160187a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f160188b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16674x<T> f160189c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC16622O, Continuation<? super T>, Object> f160190d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2499a(InterfaceC16674x<T> interfaceC16674x, Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C2499a> continuation) {
                super(2, continuation);
                this.f160189c = interfaceC16674x;
                this.f160190d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2499a c2499a = new C2499a(this.f160189c, this.f160190d, continuation);
                c2499a.f160188b = obj;
                return c2499a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2499a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC16674x<T> interfaceC16674x;
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f160187a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC16674x = (InterfaceC16674x) this.f160188b;
                        try {
                            ResultKt.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion = Result.INSTANCE;
                            objB = Result.b(ResultKt.a(th));
                            C16678z.c(interfaceC16674x, objB);
                            return Unit.f142422a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f160188b;
                    InterfaceC16674x<T> interfaceC16674x2 = this.f160189c;
                    Function2<InterfaceC16622O, Continuation<? super T>, Object> function2 = this.f160190d;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        this.f160188b = interfaceC16674x2;
                        this.f160187a = 1;
                        obj = function2.invoke(interfaceC16622O, this);
                        if (obj == objF) {
                            return objF;
                        }
                        interfaceC16674x = interfaceC16674x2;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC16674x = interfaceC16674x2;
                        Result.Companion companion3 = Result.INSTANCE;
                        objB = Result.b(ResultKt.a(th));
                        C16678z.c(interfaceC16674x, objB);
                        return Unit.f142422a;
                    }
                }
                objB = Result.b(obj);
                C16678z.c(interfaceC16674x, objB);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lqv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f160191a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16674x<T> f160192b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC16674x<T> interfaceC16674x, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f160192b = interfaceC16674x;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f160192b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super T> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f160191a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16674x<T> interfaceC16674x = this.f160192b;
                this.f160191a = 1;
                Object objB = interfaceC16674x.B(this);
                if (objB == objF) {
                    return objF;
                }
                return objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f160186c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f160186c, continuation);
            aVar.f160185b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super T> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f160184a == 0) {
                ResultKt.b(obj);
                CoroutineContext.Element elementG = ((InterfaceC16622O) this.f160185b).getCoroutineContext().g(ContinuationInterceptor.INSTANCE);
                Intrinsics.g(elementG);
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) elementG;
                InterfaceC16674x interfaceC16674xB = C16678z.b(null, 1, null);
                C16644i.c(C16671v0.f157699a, continuationInterceptor, EnumC16624Q.f157614d, new C2499a(interfaceC16674xB, this.f160186c, null));
                while (!interfaceC16674xB.A()) {
                    try {
                        return C16644i.e(continuationInterceptor, new b(interfaceC16674xB, null));
                    } catch (InterruptedException unused) {
                    }
                }
                return interfaceC16674xB.i();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> T a(Function2<? super InterfaceC16622O, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.j(block, "block");
        Thread.interrupted();
        return (T) C16646j.b(null, new a(block, null), 1, null);
    }
}

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
import mv.C15805i;
import mv.C15807j;
import mv.C15832v0;
import mv.C15839z;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import mv.InterfaceC15835x;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    static final class a<T> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160047a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f160048b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super T>, Object> f160049c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: s4.n$a$a, reason: collision with other inner class name */
        static final class C2495a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f160050a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f160051b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15835x<T> f160052c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super T>, Object> f160053d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2495a(InterfaceC15835x<T> interfaceC15835x, Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C2495a> continuation) {
                super(2, continuation);
                this.f160052c = interfaceC15835x;
                this.f160053d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2495a c2495a = new C2495a(this.f160052c, this.f160053d, continuation);
                c2495a.f160051b = obj;
                return c2495a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C2495a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC15835x<T> interfaceC15835x;
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f160050a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC15835x = (InterfaceC15835x) this.f160051b;
                        try {
                            ResultKt.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion = Result.INSTANCE;
                            objB = Result.b(ResultKt.a(th));
                            C15839z.c(interfaceC15835x, objB);
                            return Unit.f143329a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f160051b;
                    InterfaceC15835x<T> interfaceC15835x2 = this.f160052c;
                    Function2<InterfaceC15783O, Continuation<? super T>, Object> function2 = this.f160053d;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        this.f160051b = interfaceC15835x2;
                        this.f160050a = 1;
                        obj = function2.invoke(interfaceC15783O, this);
                        if (obj == objF) {
                            return objF;
                        }
                        interfaceC15835x = interfaceC15835x2;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC15835x = interfaceC15835x2;
                        Result.Companion companion3 = Result.INSTANCE;
                        objB = Result.b(ResultKt.a(th));
                        C15839z.c(interfaceC15835x, objB);
                        return Unit.f143329a;
                    }
                }
                objB = Result.b(obj);
                C15839z.c(interfaceC15835x, objB);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f160054a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15835x<T> f160055b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC15835x<T> interfaceC15835x, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f160055b = interfaceC15835x;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f160055b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f160054a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC15835x<T> interfaceC15835x = this.f160055b;
                this.f160054a = 1;
                Object objH = interfaceC15835x.H(this);
                if (objH == objF) {
                    return objF;
                }
                return objH;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f160049c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f160049c, continuation);
            aVar.f160048b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f160047a == 0) {
                ResultKt.b(obj);
                CoroutineContext.Element elementG = ((InterfaceC15783O) this.f160048b).getCoroutineContext().g(ContinuationInterceptor.INSTANCE);
                Intrinsics.g(elementG);
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) elementG;
                InterfaceC15835x interfaceC15835xB = C15839z.b(null, 1, null);
                C15805i.c(C15832v0.f151773a, continuationInterceptor, EnumC15785Q.f151688d, new C2495a(interfaceC15835xB, this.f160049c, null));
                while (!interfaceC15835xB.A()) {
                    try {
                        return C15805i.e(continuationInterceptor, new b(interfaceC15835xB, null));
                    } catch (InterruptedException unused) {
                    }
                }
                return interfaceC15835xB.i();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> T a(Function2<? super InterfaceC15783O, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.j(block, "block");
        Thread.interrupted();
        return (T) C15807j.b(null, new a(block, null), 1, null);
    }
}

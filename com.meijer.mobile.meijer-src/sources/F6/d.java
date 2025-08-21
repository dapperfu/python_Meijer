package F6;

import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mv.Z;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import z6.C18455d;
import z6.C18456e;
import z6.InterfaceC18449A;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LF6/d;", "LF6/a;", "LI6/a;", "networkMonitor", "<init>", "(LI6/a;)V", "Lz6/A$a;", "D", "Lz6/d;", "request", "LF6/b;", "chain", "Lpv/f;", "Lz6/e;", "a", "(Lz6/d;LF6/b;)Lpv/f;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d implements F6.a {

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz6/A$a;", "D", "Lpv/g;", "Lz6/e;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", l = {65, 67}, m = "invokeSuspend")
    static final class a<D> extends SuspendLambda implements Function2<InterfaceC16562g<? super C18456e<D>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9066a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f9069d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C18455d<D> f9070e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<C18456e<D>> f9071f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, d dVar, C18455d<D> c18455d, InterfaceC16561f<C18456e<D>> interfaceC16561f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f9068c = z10;
            this.f9069d = dVar;
            this.f9070e = c18455d;
            this.f9071f = interfaceC16561f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f9068c, this.f9069d, this.f9070e, this.f9071f, continuation);
            aVar.f9067b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super C18456e<D>> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9066a;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f9067b;
                if (this.f9068c) {
                    d.b(this.f9069d);
                }
                InterfaceC16561f<C18456e<D>> interfaceC16561f = this.f9071f;
                this.f9066a = 2;
                if (C16563h.x(interfaceC16562g, interfaceC16561f, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz6/A$a;", "D", "Lz6/e;", "it", "", "<anonymous>", "(Lz6/e;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", l = {}, m = "invokeSuspend")
    static final class b<D> extends SuspendLambda implements Function2<C18456e<D>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9072a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9074c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f9075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Ref.IntRef intRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f9074c = z10;
            this.f9075d = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f9074c, this.f9075d, continuation);
            bVar.f9073b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18456e<D> c18456e, Continuation<? super Unit> continuation) {
            return ((b) create(c18456e, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws f {
            ApolloException apolloException;
            IntrinsicsKt.f();
            if (this.f9072a == 0) {
                ResultKt.b(obj);
                C18456e c18456e = (C18456e) this.f9073b;
                if (this.f9074c && (apolloException = c18456e.exception) != null) {
                    Intrinsics.g(apolloException);
                    if (g.c(apolloException)) {
                        throw f.f9082a;
                    }
                }
                this.f9075d.f143740a = 0;
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lz6/A$a;", "D", "Lpv/g;", "Lz6/e;", "", "cause", "", "<unused var>", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", l = {79, 81}, m = "invokeSuspend")
    static final class c<D> extends SuspendLambda implements Function4<InterfaceC16562g<? super C18456e<D>>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9076a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f9078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f9079d;

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l10, Continuation<? super Boolean> continuation) {
            return d((InterfaceC16562g) obj, th2, l10.longValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.IntRef intRef, d dVar, Continuation<? super c> continuation) {
            super(4, continuation);
            this.f9078c = intRef;
            this.f9079d = dVar;
        }

        public final Object d(InterfaceC16562g<? super C18456e<D>> interfaceC16562g, Throwable th2, long j10, Continuation<? super Boolean> continuation) {
            c cVar = new c(this.f9078c, this.f9079d, continuation);
            cVar.f9077b = th2;
            return cVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9076a;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (((Throwable) this.f9077b) instanceof f) {
                    this.f9078c.f143740a++;
                    d.b(this.f9079d);
                    Duration.Companion companion = Duration.INSTANCE;
                    long jR = DurationKt.r(Math.pow(2.0d, this.f9078c.f143740a), DurationUnit.f148417e);
                    this.f9076a = 2;
                    if (Z.c(jR, this) == objF) {
                        return objF;
                    }
                } else {
                    z10 = false;
                }
            }
            return Boxing.a(z10);
        }
    }

    @Override // F6.a
    public <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> a(C18455d<D> request, F6.b chain) {
        Intrinsics.j(request, "request");
        Intrinsics.j(chain, "chain");
        Boolean failFastIfOffline = request.getFailFastIfOffline();
        boolean zBooleanValue = failFastIfOffline != null ? failFastIfOffline.booleanValue() : false;
        Boolean retryOnError = request.getRetryOnError();
        boolean zBooleanValue2 = retryOnError != null ? retryOnError.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2) {
            return chain.a(request);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        return C16563h.U(C16563h.O(C16563h.E(new a(zBooleanValue, this, request, chain.a(request), null)), new b(zBooleanValue2, intRef, null)), new c(intRef, this, null));
    }

    public d(I6.a aVar) {
    }

    public static final /* synthetic */ I6.a b(d dVar) {
        dVar.getClass();
        return null;
    }
}

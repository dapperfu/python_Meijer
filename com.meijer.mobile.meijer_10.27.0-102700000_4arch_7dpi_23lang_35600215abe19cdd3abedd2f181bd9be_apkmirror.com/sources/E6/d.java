package E6;

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
import qv.Z;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import y6.C18176d;
import y6.C18177e;
import y6.InterfaceC18167A;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LE6/d;", "LE6/a;", "LH6/a;", "networkMonitor", "<init>", "(LH6/a;)V", "Ly6/A$a;", "D", "Ly6/d;", "request", "LE6/b;", "chain", "Ltv/f;", "Ly6/e;", "a", "(Ly6/d;LE6/b;)Ltv/f;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d implements E6.a {

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6/A$a;", "D", "Ltv/g;", "Ly6/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", l = {65, 67}, m = "invokeSuspend")
    static final class a<D> extends SuspendLambda implements Function2<InterfaceC17153g<? super C18177e<D>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7649a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f7652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C18176d<D> f7653e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<C18177e<D>> f7654f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, d dVar, C18176d<D> c18176d, InterfaceC17152f<C18177e<D>> interfaceC17152f, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7651c = z10;
            this.f7652d = dVar;
            this.f7653e = c18176d;
            this.f7654f = interfaceC17152f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f7651c, this.f7652d, this.f7653e, this.f7654f, continuation);
            aVar.f7650b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super C18177e<D>> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7649a;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f7650b;
                if (this.f7651c) {
                    d.b(this.f7652d);
                }
                InterfaceC17152f<C18177e<D>> interfaceC17152f = this.f7654f;
                this.f7649a = 2;
                if (C17154h.x(interfaceC17153g, interfaceC17152f, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6/A$a;", "D", "Ly6/e;", "it", "", "<anonymous>", "(Ly6/e;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", l = {}, m = "invokeSuspend")
    static final class b<D> extends SuspendLambda implements Function2<C18177e<D>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7655a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7657c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f7658d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Ref.IntRef intRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f7657c = z10;
            this.f7658d = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f7657c, this.f7658d, continuation);
            bVar.f7656b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18177e<D> c18177e, Continuation<? super Unit> continuation) {
            return ((b) create(c18177e, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws f {
            ApolloException apolloException;
            IntrinsicsKt.f();
            if (this.f7655a == 0) {
                ResultKt.b(obj);
                C18177e c18177e = (C18177e) this.f7656b;
                if (this.f7657c && (apolloException = c18177e.exception) != null) {
                    Intrinsics.g(apolloException);
                    if (g.c(apolloException)) {
                        throw f.f7665a;
                    }
                }
                this.f7658d.f142833a = 0;
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ly6/A$a;", "D", "Ltv/g;", "Ly6/e;", "", "cause", "", "<unused var>", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", l = {79, 81}, m = "invokeSuspend")
    static final class c<D> extends SuspendLambda implements Function4<InterfaceC17153g<? super C18177e<D>>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7659a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f7661c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f7662d;

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l10, Continuation<? super Boolean> continuation) {
            return d((InterfaceC17153g) obj, th2, l10.longValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.IntRef intRef, d dVar, Continuation<? super c> continuation) {
            super(4, continuation);
            this.f7661c = intRef;
            this.f7662d = dVar;
        }

        public final Object d(InterfaceC17153g<? super C18177e<D>> interfaceC17153g, Throwable th2, long j10, Continuation<? super Boolean> continuation) {
            c cVar = new c(this.f7661c, this.f7662d, continuation);
            cVar.f7660b = th2;
            return cVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7659a;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (((Throwable) this.f7660b) instanceof f) {
                    this.f7661c.f142833a++;
                    d.b(this.f7662d);
                    Duration.Companion companion = Duration.INSTANCE;
                    long jR = DurationKt.r(Math.pow(2.0d, this.f7661c.f142833a), DurationUnit.f147509e);
                    this.f7659a = 2;
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

    @Override // E6.a
    public <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> a(C18176d<D> request, E6.b chain) {
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
        return C17154h.U(C17154h.O(C17154h.E(new a(zBooleanValue, this, request, chain.a(request), null)), new b(zBooleanValue2, intRef, null)), new c(intRef, this, null));
    }

    public d(H6.a aVar) {
    }

    public static final /* synthetic */ H6.a b(d dVar) {
        dVar.getClass();
        return null;
    }
}

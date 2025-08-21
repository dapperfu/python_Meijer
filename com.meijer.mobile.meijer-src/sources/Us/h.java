package Us;

import Ev.AbstractC3260b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.client.j;
import gw.InterfaceC14418g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.C15819p;
import mv.E0;
import mv.InterfaceC15783O;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000P\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0087@¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011\u001a]\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0012*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u001d\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0002\b\u0016H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001aP\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0012*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0007H\u0080@¢\u0006\u0004\b\u001a\u0010\u001b\u001a2\u0010\u001d\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0012*\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020\b*\u00020#H\u0082@¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Raw", "Dto", "Lcom/okta/authfoundation/client/h;", "Lzv/a;", "deserializationStrategy", "Lokhttp3/Request;", "request", "Lkotlin/Function1;", "Lokhttp3/Response;", "", "shouldAttemptJsonDeserialization", "responseMapper", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "o", "(Lcom/okta/authfoundation/client/h;Lzv/a;Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "s", "(Lcom/okta/authfoundation/client/h;Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlin/Function2;", "Lcom/okta/authfoundation/client/j;", "Lgw/g;", "Lkotlin/ExtensionFunctionType;", "responseHandler", "j", "(Lcom/okta/authfoundation/client/h;Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lcom/okta/authfoundation/client/j;Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ignoreRateLimit", "i", "(Lcom/okta/authfoundation/client/j;Lokhttp3/Request;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configuration", "responseBody", "u", "(Lokhttp3/Response;Lcom/okta/authfoundation/client/j;Lgw/g;)Lcom/okta/authfoundation/client/OAuth2ClientResult;", "Lokhttp3/d;", "h", "(Lokhttp3/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.internal.NetworkUtilsKt", f = "NetworkUtils.kt", l = {135, 136}, m = "executeRequest")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37711a;

        /* renamed from: b, reason: collision with root package name */
        Object f37712b;

        /* renamed from: c, reason: collision with root package name */
        Object f37713c;

        /* renamed from: d, reason: collision with root package name */
        Object f37714d;

        /* renamed from: e, reason: collision with root package name */
        Object f37715e;

        /* renamed from: f, reason: collision with root package name */
        int f37716f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37717g;

        /* renamed from: h, reason: collision with root package name */
        int f37718h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37717g = obj;
            this.f37718h |= Integer.MIN_VALUE;
            return h.i(null, null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "<anonymous>", "(Lmv/O;)Lcom/okta/authfoundation/client/OAuth2ClientResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.client.internal.NetworkUtilsKt$internalPerformRequest$5", f = "NetworkUtils.kt", l = {107}, m = "invokeSuspend")
    static final class b<T> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OAuth2ClientResult<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f37720b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Request f37721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Response, Boolean> f37722d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC14418g, T> f37723e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(j jVar, Request request, Function1<? super Response, Boolean> function1, Function1<? super InterfaceC14418g, ? extends T> function12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37720b = jVar;
            this.f37721c = request;
            this.f37722d = function1;
            this.f37723e = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f37720b, this.f37721c, this.f37722d, this.f37723e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OAuth2ClientResult<T>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objU;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f37719a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    j jVar = this.f37720b;
                    Request request = this.f37721c;
                    Function1<Response, Boolean> function1 = this.f37722d;
                    this.f37719a = 1;
                    obj = h.i(jVar, request, function1, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                Response response = (Response) obj;
                Function1<Response, Boolean> function12 = this.f37722d;
                Function1<InterfaceC14418g, T> function13 = this.f37723e;
                j jVar2 = this.f37720b;
                try {
                    ResponseBody body = response.getBody();
                    Intrinsics.g(body);
                    InterfaceC14418g source = body.getBodySource();
                    if (!function12.invoke(response).booleanValue()) {
                        objU = h.u(response, jVar2, source);
                    } else {
                        objU = new OAuth2ClientResult.a(function13.invoke(source));
                    }
                    CloseableKt.a(response, null);
                    return objU;
                } finally {
                }
            } catch (Exception e10) {
                return new OAuth2ClientResult.Error(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> OAuth2ClientResult<T> u(Response response, j jVar, InterfaceC14418g interfaceC14418g) {
        Us.b bVar;
        try {
            AbstractC3260b json = jVar.getJson();
            json.getSerializersModule();
            bVar = (Us.b) Gv.a.a(json, Us.b.INSTANCE.serializer(), interfaceC14418g);
        } catch (Exception unused) {
            bVar = null;
        }
        return new OAuth2ClientResult.Error(new OAuth2ClientResult.Error.HttpResponseException(response.getCode(), bVar != null ? bVar.getError() : null, bVar != null ? bVar.getErrorDescription() : null));
    }

    private static final Object h(okhttp3.d dVar, Continuation<? super Response> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        Us.a aVar = new Us.a(dVar, c15819p);
        FirebasePerfOkHttpClient.enqueue(dVar, aVar);
        c15819p.F(aVar);
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c8 -> B:13:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(com.okta.authfoundation.client.j r22, okhttp3.Request r23, kotlin.jvm.functions.Function1<? super okhttp3.Response, java.lang.Boolean> r24, kotlin.coroutines.Continuation<? super okhttp3.Response> r25) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Us.h.i(com.okta.authfoundation.client.j, okhttp3.Request, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object l(com.okta.authfoundation.client.h hVar, Request request, Function1 function1, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: Us.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(h.m((Response) obj2));
                }
            };
        }
        return j(hVar, request, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Response it) {
        Intrinsics.j(it, "it");
        return it.getIsSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(com.okta.authfoundation.client.h hVar, Function2 function2, InterfaceC14418g it) {
        Intrinsics.j(it, "it");
        return function2.invoke(hVar.getConfiguration(), it);
    }

    public static final <Raw, Dto> Object o(final com.okta.authfoundation.client.h hVar, final InterfaceC18555a<? extends Raw> interfaceC18555a, Request request, Function1<? super Response, Boolean> function1, final Function1<? super Raw, ? extends Dto> function12, Continuation<? super OAuth2ClientResult<Dto>> continuation) {
        if (request.d("accept") == null) {
            request = request.g().a("accept", "application/json").b();
        }
        return j(hVar, request, function1, new Function2() { // from class: Us.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h.r(hVar, interfaceC18555a, function12, (j) obj, (InterfaceC14418g) obj2);
            }
        }, continuation);
    }

    public static /* synthetic */ Object p(com.okta.authfoundation.client.h hVar, InterfaceC18555a interfaceC18555a, Request request, Function1 function1, Function1 function12, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: Us.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(h.q((Response) obj2));
                }
            };
        }
        return o(hVar, interfaceC18555a, request, function1, function12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(Response it) {
        Intrinsics.j(it, "it");
        return it.getIsSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(com.okta.authfoundation.client.h hVar, InterfaceC18555a interfaceC18555a, Function1 function1, j internalPerformRequest, InterfaceC14418g responseBody) {
        Intrinsics.j(internalPerformRequest, "$this$internalPerformRequest");
        Intrinsics.j(responseBody, "responseBody");
        return function1.invoke(Gv.a.a(hVar.getConfiguration().getJson(), interfaceC18555a, responseBody));
    }

    public static final Object s(com.okta.authfoundation.client.h hVar, Request request, Continuation<? super OAuth2ClientResult<Unit>> continuation) {
        return l(hVar, request, null, new Function2() { // from class: Us.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h.t((j) obj, (InterfaceC14418g) obj2);
            }
        }, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(j internalPerformRequest, InterfaceC14418g it) {
        Intrinsics.j(internalPerformRequest, "$this$internalPerformRequest");
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    public static final <T> Object j(final com.okta.authfoundation.client.h hVar, Request request, Function1<? super Response, Boolean> function1, final Function2<? super j, ? super InterfaceC14418g, ? extends T> function2, Continuation<? super OAuth2ClientResult<T>> continuation) {
        return k(hVar.getConfiguration(), request, function1, new Function1() { // from class: Us.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.n(hVar, function2, (InterfaceC14418g) obj);
            }
        }, continuation);
    }

    public static final <T> Object k(j jVar, Request request, Function1<? super Response, Boolean> function1, Function1<? super InterfaceC14418g, ? extends T> function12, Continuation<? super OAuth2ClientResult<T>> continuation) {
        E0.i(continuation.getContext());
        return C15805i.g(jVar.getIoDispatcher(), new b(jVar, request, function1, function12, null), continuation);
    }
}

package I6;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kw.InterfaceC15329f;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.d;
import qv.C16658p;
import z6.C18399i;
import z6.EnumC18398h;
import z6.HttpHeader;
import z6.InterfaceC18395e;
import z6.k;
import z6.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LI6/j;", "LI6/c;", "Lkotlin/Function0;", "Lokhttp3/d$a;", "httpCallFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/d$a;)V", "", "timeoutMillis", "(J)V", "connectTimeoutMillis", "readTimeoutMillis", "(JJ)V", "Lz6/i;", "request", "Lz6/k;", "q1", "(Lz6/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "a", "Lkotlin/jvm/functions/Function0;", "b", "Lkotlin/Lazy;", "g", "()Lokhttp3/d$a;", "callFactory", "c", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class j implements c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<d.a> httpCallFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy callFactory;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u00020\r*\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LI6/j$a;", "", "<init>", "()V", "Lz6/i;", "Lokhttp3/Request;", "c", "(Lz6/i;)Lokhttp3/Request;", "Lokhttp3/d$a;", "request", "Lokhttp3/Response;", "a", "(Lokhttp3/d$a;Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz6/k;", "b", "(Lokhttp3/Response;)Lz6/k;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: I6.j$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: I6.j$a$a, reason: collision with other inner class name */
        static final class C0216a implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ okhttp3.d f13662a;

            C0216a(okhttp3.d dVar) {
                this.f13662a = dVar;
            }

            public final void a(Throwable th2) {
                this.f13662a.cancel();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"I6/j$a$b", "Lokhttp3/RequestBody;", "Lokhttp3/j;", "contentType", "()Lokhttp3/j;", "", "contentLength", "()J", "", "isOneShot", "()Z", "Lkw/f;", "sink", "", "writeTo", "(Lkw/f;)V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: I6.j$a$b */
        public static final class b extends RequestBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC18395e f13663a;

            b(InterfaceC18395e interfaceC18395e) {
                this.f13663a = interfaceC18395e;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.f13663a.getContentLength();
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType */
            public okhttp3.j getContentType() {
                return okhttp3.j.INSTANCE.a(this.f13663a.getContentType());
            }

            @Override // okhttp3.RequestBody
            public boolean isOneShot() {
                return this.f13663a instanceof m;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC15329f sink) {
                Intrinsics.j(sink, "sink");
                this.f13663a.a(sink);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Object a(d.a aVar, Request request, Continuation<? super Response> continuation) throws IOException {
            C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
            c16658p.C();
            okhttp3.d dVarB = aVar.b(request);
            c16658p.F(new C0216a(dVarB));
            Response responseExecute = null;
            try {
                responseExecute = FirebasePerfOkHttpClient.execute(dVarB);
                e = null;
            } catch (IOException e10) {
                e = e10;
            }
            if (e != null) {
                Result.Companion companion = Result.INSTANCE;
                c16658p.resumeWith(Result.b(ResultKt.a(new ApolloNetworkException("Failed to execute GraphQL http network request", e))));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                Intrinsics.g(responseExecute);
                c16658p.resumeWith(Result.b(responseExecute));
            }
            Object objV = c16658p.v();
            if (objV == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objV;
        }

        public final k b(Response response) {
            Intrinsics.j(response, "<this>");
            k.a aVar = new k.a(response.getCode());
            ResponseBody body = response.getBody();
            Intrinsics.g(body);
            k.a aVarB = aVar.b(body.getSource());
            Headers headers = response.getHeaders();
            IntRange intRangeX = RangesKt.x(0, headers.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
            Iterator<Integer> it = intRangeX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(new HttpHeader(headers.h(iNextInt), headers.p(iNextInt)));
            }
            return aVarB.a(arrayList).c();
        }

        public final Request c(C18399i c18399i) {
            Intrinsics.j(c18399i, "<this>");
            Request.a aVarN = new Request.a().t(c18399i.getUrl()).n(H6.d.e(c18399i.b()));
            if (c18399i.getMethod() == EnumC18398h.f171617a) {
                aVarN.f();
            } else {
                InterfaceC18395e body = c18399i.getBody();
                if (body == null) {
                    throw new IllegalStateException("HTTP POST requires a request body");
                }
                aVarN.p(new b(body));
            }
            return aVarN.b();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", l = {53}, m = "execute")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f13664a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13665b;

        /* renamed from: d, reason: collision with root package name */
        int f13667d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13665b = obj;
            this.f13667d |= Integer.MIN_VALUE;
            return j.this.q1(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Function0<? extends d.a> httpCallFactory) {
        Intrinsics.j(httpCallFactory, "httpCallFactory");
        this.httpCallFactory = httpCallFactory;
        this.callFactory = LazyKt.b(new Function0() { // from class: I6.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.d(this.f13658a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.a c(d.a aVar) {
        return aVar;
    }

    @Override // I6.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.a d(j jVar) {
        return jVar.httpCallFactory.invoke();
    }

    private final d.a g() {
        return (d.a) this.callFactory.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // I6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q1(z6.C18399i r6, kotlin.coroutines.Continuation<? super z6.k> r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof I6.j.b
            if (r0 == 0) goto L13
            r0 = r7
            I6.j$b r0 = (I6.j.b) r0
            int r1 = r0.f13667d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13667d = r1
            goto L18
        L13:
            I6.j$b r0 = new I6.j$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13665b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f13667d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f13664a
            I6.j$a r6 = (I6.j.Companion) r6
            kotlin.ResultKt.b(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            I6.j$a r7 = I6.j.INSTANCE
            okhttp3.d$a r2 = r5.g()
            okhttp3.Request r6 = r7.c(r6)
            r0.f13664a = r7
            r0.f13667d = r3
            java.lang.Object r6 = r7.a(r2, r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r4 = r7
            r7 = r6
            r6 = r4
        L50:
            okhttp3.Response r7 = (okhttp3.Response) r7
            z6.k r6 = r6.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.j.q1(z6.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(final d.a httpCallFactory) {
        this((Function0<? extends d.a>) new Function0() { // from class: I6.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.c(httpCallFactory);
            }
        });
        Intrinsics.j(httpCallFactory, "httpCallFactory");
    }

    public j(long j10) {
        this(j10, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(long j10, long j11) {
        OkHttpClient.Builder builderC = H6.d.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this(builderC.d(j10, timeUnit).V(j11, timeUnit).a());
    }
}

package I6;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.InterfaceC15330g;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import y6.C18168B;
import y6.C18176d;
import y6.C18177e;
import y6.InterfaceC18167A;
import y6.p;
import y6.w;
import z6.C18394d;
import z6.C18399i;
import z6.HttpHeader;
import z6.InterfaceC18400j;
import z6.k;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u00045)93B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJG\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u000e*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00132\n\u0010\"\u001a\u00060 j\u0002`!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J3\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\b)\u0010*JA\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"LI6/g;", "LH6/b;", "Lz6/j;", "httpRequestComposer", "LI6/c;", "engine", "", "LI6/e;", "interceptors", "", "exposeErrorBody", "<init>", "(Lz6/j;LI6/c;Ljava/util/List;Z)V", "Ly6/A$a;", "D", "Ly6/A;", "operation", "", "throwable", "Ly6/e;", "j", "(Ly6/A;Ljava/lang/Throwable;)Ly6/e;", "Lz6/k;", "httpResponse", "Ltv/f;", "i", "(Ly6/A;Lz6/k;)Ltv/f;", "Ly6/p;", "customScalarAdapters", "n", "(Ly6/A;Ly6/p;Lz6/k;)Ltv/f;", "m", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "", "millisStart", "o", "(Ly6/e;Ljava/util/UUID;Lz6/k;J)Ly6/e;", "Ly6/d;", "request", "a", "(Ly6/d;)Ltv/f;", "Lz6/i;", "httpRequest", "k", "(Ly6/d;Lz6/i;Ly6/p;)Ltv/f;", "", "dispose", "()V", "Lz6/j;", "b", "LI6/c;", "c", "Ljava/util/List;", "l", "()Ljava/util/List;", "d", "Z", "LI6/g$c;", "e", "LI6/g$c;", "engineInterceptor", "f", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g implements H6.b {

    /* renamed from: f, reason: collision with root package name */
    private static final b f13606f = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18400j httpRequestComposer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I6.c engine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<I6.e> interceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean exposeErrorBody;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c engineInterceptor;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"LI6/g$a;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)LI6/g$a;", "", "exposeErrorBody", "b", "(Z)LI6/g$a;", "LI6/c;", "httpEngine", "c", "(LI6/c;)LI6/g$a;", "", "LI6/e;", "interceptors", "d", "(Ljava/util/List;)LI6/g$a;", "LI6/g;", "a", "()LI6/g;", "Lz6/j;", "Lz6/j;", "httpRequestComposer", "Ljava/lang/String;", "LI6/c;", "engine", "", "Ljava/util/List;", "Z", "Lz6/f;", "f", "headers", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private InterfaceC18400j httpRequestComposer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String serverUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private I6.c engine;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean exposeErrorBody;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<I6.e> interceptors = new ArrayList();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers = new ArrayList();

        public final g a() {
            InterfaceC18400j c18394d = this.httpRequestComposer;
            if (c18394d != null && this.serverUrl != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'");
            }
            if (c18394d == null) {
                String str = this.serverUrl;
                c18394d = str != null ? new C18394d(str) : null;
                if (c18394d == null) {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                }
            }
            InterfaceC18400j interfaceC18400j = c18394d;
            if (!this.headers.isEmpty()) {
                this.interceptors.add(new d(this.headers));
            }
            I6.c cVarC = this.engine;
            if (cVarC == null) {
                cVarC = I6.a.c(0L, 1, null);
            }
            return new g(interfaceC18400j, cVarC, this.interceptors, this.exposeErrorBody, null);
        }

        public final a b(boolean exposeErrorBody) {
            this.exposeErrorBody = exposeErrorBody;
            return this;
        }

        public final a c(I6.c httpEngine) {
            Intrinsics.j(httpEngine, "httpEngine");
            this.engine = httpEngine;
            return this;
        }

        public final a d(List<? extends I6.e> interceptors) {
            Intrinsics.j(interceptors, "interceptors");
            this.interceptors.clear();
            this.interceptors.addAll(interceptors);
            return this;
        }

        public final a e(String serverUrl) {
            Intrinsics.j(serverUrl, "serverUrl");
            this.serverUrl = serverUrl;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI6/g$b;", "", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LI6/g$c;", "LI6/e;", "<init>", "(LI6/g;)V", "Lz6/i;", "request", "LI6/f;", "chain", "Lz6/k;", "a", "(Lz6/i;LI6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements I6.e {
        public c() {
        }

        @Override // I6.e
        public Object a(C18399i c18399i, I6.f fVar, Continuation<? super k> continuation) {
            return g.this.engine.q1(c18399i, continuation);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LI6/g$d;", "LI6/e;", "", "Lz6/f;", "headers", "<init>", "(Ljava/util/List;)V", "Lz6/i;", "request", "LI6/f;", "chain", "Lz6/k;", "a", "(Lz6/i;LI6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class d implements I6.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        @Override // I6.e
        public Object a(C18399i c18399i, I6.f fVar, Continuation<? super k> continuation) {
            return fVar.a(C18399i.f(c18399i, null, null, 3, null).c(this.headers).e(), continuation);
        }

        public d(List<HttpHeader> headers) {
            Intrinsics.j(headers, "headers");
            this.headers = headers;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6/A$a;", "D", "Ltv/g;", "Ly6/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {71, 107}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e<D> extends SuspendLambda implements Function2<InterfaceC17153g<? super C18177e<D>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f13620a;

        /* renamed from: b, reason: collision with root package name */
        int f13621b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13622c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C18399i f13624e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18176d<D> f13625f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f13626g;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements InterfaceC17152f<C18177e<D>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f f13627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f13628b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18176d f13629c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k f13630d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f13631e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: I6.g$e$a$a, reason: collision with other inner class name */
            public static final class C0212a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17153g f13632a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f13633b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C18176d f13634c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ k f13635d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ long f13636e;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {50}, m = "emit")
                /* renamed from: I6.g$e$a$a$a, reason: collision with other inner class name */
                public static final class C0213a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f13637a;

                    /* renamed from: b, reason: collision with root package name */
                    int f13638b;

                    public C0213a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f13637a = obj;
                        this.f13638b |= Integer.MIN_VALUE;
                        return C0212a.this.emit(null, this);
                    }
                }

                public C0212a(InterfaceC17153g interfaceC17153g, g gVar, C18176d c18176d, k kVar, long j10) {
                    this.f13632a = interfaceC17153g;
                    this.f13633b = gVar;
                    this.f13634c = c18176d;
                    this.f13635d = kVar;
                    this.f13636e = j10;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof I6.g.e.a.C0212a.C0213a
                        if (r0 == 0) goto L13
                        r0 = r12
                        I6.g$e$a$a$a r0 = (I6.g.e.a.C0212a.C0213a) r0
                        int r1 = r0.f13638b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f13638b = r1
                        goto L18
                    L13:
                        I6.g$e$a$a$a r0 = new I6.g$e$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f13637a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f13638b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.b(r12)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        kotlin.ResultKt.b(r12)
                        tv.g r12 = r10.f13632a
                        r5 = r11
                        y6.e r5 = (y6.C18177e) r5
                        I6.g r4 = r10.f13633b
                        y6.d r11 = r10.f13634c
                        java.util.UUID r6 = r11.getRequestUuid()
                        z6.k r7 = r10.f13635d
                        long r8 = r10.f13636e
                        y6.e r11 = I6.g.h(r4, r5, r6, r7, r8)
                        r0.f13638b = r3
                        java.lang.Object r11 = r12.emit(r11, r0)
                        if (r11 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r11 = kotlin.Unit.f142422a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: I6.g.e.a.C0212a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC17152f interfaceC17152f, g gVar, C18176d c18176d, k kVar, long j10) {
                this.f13627a = interfaceC17152f;
                this.f13628b = gVar;
                this.f13629c = c18176d;
                this.f13630d = kVar;
                this.f13631e = j10;
            }

            @Override // tv.InterfaceC17152f
            public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
                Object objCollect = this.f13627a.collect(new C0212a(interfaceC17153g, this.f13628b, this.f13629c, this.f13630d, this.f13631e), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C18399i c18399i, C18176d<D> c18176d, p pVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f13624e = c18399i;
            this.f13625f = c18176d;
            this.f13626g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(this.f13624e, this.f13625f, this.f13626g, continuation);
            eVar.f13622c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super C18177e<D>> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
        
            if (tv.C17154h.x(r3, r7, r14) != r1) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: I6.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f<D> implements InterfaceC17152f<C18177e<D>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f13640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC18167A f13641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f13642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f13643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f13644e;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f13645a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC18167A f13646b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f13647c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f13648d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f13649e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {112}, m = "emit")
            /* renamed from: I6.g$f$a$a, reason: collision with other inner class name */
            public static final class C0214a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f13650a;

                /* renamed from: b, reason: collision with root package name */
                int f13651b;

                public C0214a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f13650a = obj;
                    this.f13651b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, InterfaceC18167A interfaceC18167A, p pVar, g gVar, Ref.ObjectRef objectRef) {
                this.f13645a = interfaceC17153g;
                this.f13646b = interfaceC18167A;
                this.f13647c = pVar;
                this.f13648d = gVar;
                this.f13649e = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof I6.g.f.a.C0214a
                    if (r0 == 0) goto L13
                    r0 = r13
                    I6.g$f$a$a r0 = (I6.g.f.a.C0214a) r0
                    int r1 = r0.f13651b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13651b = r1
                    goto L18
                L13:
                    I6.g$f$a$a r0 = new I6.g$f$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f13650a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f13651b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r13)
                    goto L98
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.ResultKt.b(r13)
                    tv.g r13 = r11.f13645a
                    kw.g r12 = (kw.InterfaceC15330g) r12
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f13649e
                    T r4 = r2.f142835a
                    if (r4 != 0) goto L45
                    F6.c r4 = new F6.c
                    r4.<init>()
                    r2.f142835a = r4
                L45:
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f13649e
                    T r2 = r2.f142835a
                    F6.c r2 = (F6.c) r2
                    java.util.Map r12 = r2.g(r12)
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f13649e
                    T r2 = r2.f142835a
                    F6.c r2 = (F6.c) r2
                    java.util.Set r8 = r2.c()
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f13649e
                    T r2 = r2.f142835a
                    F6.c r2 = (F6.c) r2
                    boolean r2 = r2.getHasNext()
                    r2 = r2 ^ r3
                    kotlin.jvm.internal.Ref$ObjectRef r4 = r11.f13649e
                    T r4 = r4.f142835a
                    F6.c r4 = (F6.c) r4
                    boolean r4 = r4.getIsEmptyPayload()
                    if (r4 == 0) goto L72
                    r12 = 0
                    goto L8d
                L72:
                    C6.f r4 = C6.a.b(r12)
                    y6.A r5 = r11.f13646b
                    y6.p r7 = r11.f13647c
                    r9 = 2
                    r10 = 0
                    r6 = 0
                    y6.e r12 = y6.C18168B.b(r4, r5, r6, r7, r8, r9, r10)
                    y6.e$a r12 = r12.a()
                    y6.e$a r12 = r12.g(r2)
                    y6.e r12 = r12.b()
                L8d:
                    if (r12 == 0) goto L98
                    r0.f13651b = r3
                    java.lang.Object r12 = r13.emit(r12, r0)
                    if (r12 != r1) goto L98
                    return r1
                L98:
                    kotlin.Unit r12 = kotlin.Unit.f142422a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: I6.g.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC17152f interfaceC17152f, InterfaceC18167A interfaceC18167A, p pVar, g gVar, Ref.ObjectRef objectRef) {
            this.f13640a = interfaceC17152f;
            this.f13641b = interfaceC18167A;
            this.f13642c = pVar;
            this.f13643d = gVar;
            this.f13644e = objectRef;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f13640a.collect(new a(interfaceC17153g, this.f13641b, this.f13642c, this.f13643d, this.f13644e), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly6/A$a;", "D", "Ltv/g;", "Ly6/e;", "", "throwable", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {236}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: I6.g$g, reason: collision with other inner class name */
    static final class C0215g<D> extends SuspendLambda implements Function3<InterfaceC17153g<? super C18177e<D>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13653a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13654b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f13655c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC18167A<D> f13656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0215g(InterfaceC18167A<D> interfaceC18167A, Continuation<? super C0215g> continuation) {
            super(3, continuation);
            this.f13656d = interfaceC18167A;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super C18177e<D>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C0215g c0215g = new C0215g(this.f13656d, continuation);
            c0215g.f13654b = interfaceC17153g;
            c0215g.f13655c = th2;
            return c0215g.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13653a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f13654b;
                Throwable th2 = (Throwable) this.f13655c;
                if (th2 instanceof ApolloException) {
                    InterfaceC18167A<D> interfaceC18167A = this.f13656d;
                    UUID uuidRandomUUID = UUID.randomUUID();
                    Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
                    C18177e c18177eB = new C18177e.a(interfaceC18167A, uuidRandomUUID).e((ApolloException) th2).b();
                    this.f13654b = null;
                    this.f13653a = 1;
                    if (interfaceC17153g.emit(c18177eB, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    public /* synthetic */ g(InterfaceC18400j interfaceC18400j, I6.c cVar, List list, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18400j, cVar, list, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g(InterfaceC18400j interfaceC18400j, I6.c cVar, List<? extends I6.e> list, boolean z10) {
        this.httpRequestComposer = interfaceC18400j;
        this.engine = cVar;
        this.interceptors = list;
        this.exposeErrorBody = z10;
        this.engineInterceptor = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> i(InterfaceC18167A<D> operation, k httpResponse) throws IOException {
        InterfaceC15330g interfaceC15330gA;
        if (this.exposeErrorBody) {
            interfaceC15330gA = httpResponse.a();
        } else {
            InterfaceC15330g interfaceC15330gA2 = httpResponse.a();
            if (interfaceC15330gA2 != null) {
                interfaceC15330gA2.close();
            }
            interfaceC15330gA = null;
        }
        InterfaceC15330g interfaceC15330g = interfaceC15330gA;
        return C17154h.G(j(operation, new ApolloHttpException(httpResponse.getStatusCode(), httpResponse.b(), interfaceC15330g, "Http request failed with status code `" + httpResponse.getStatusCode() + "`", null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> C18177e<D> j(InterfaceC18167A<D> operation, Throwable throwable) {
        ApolloException apolloNetworkException = throwable instanceof ApolloException ? (ApolloException) throwable : new ApolloNetworkException("Error while reading JSON response", throwable);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        return new C18177e.a(operation, uuidRandomUUID).e(apolloNetworkException).g(true).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> m(InterfaceC18167A<D> operation, p customScalarAdapters, k httpResponse) {
        return C17154h.g(new f(F6.g.e(httpResponse), operation, customScalarAdapters, this, new Ref.ObjectRef()), new C0215g(operation, null));
    }

    @Override // H6.b
    public <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> a(C18176d<D> request) {
        Intrinsics.j(request, "request");
        w.b bVarC = request.getExecutionContext().c(p.INSTANCE);
        Intrinsics.g(bVarC);
        return k(request, this.httpRequestComposer.a(request), (p) bVarC);
    }

    @Override // H6.b
    public void dispose() {
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((I6.e) it.next()).dispose();
        }
        this.engine.close();
    }

    public final <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> k(C18176d<D> request, C18399i httpRequest, p customScalarAdapters) {
        Intrinsics.j(request, "request");
        Intrinsics.j(httpRequest, "httpRequest");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        return C17154h.E(new e(httpRequest, request, customScalarAdapters, null));
    }

    public final List<I6.e> l() {
        return this.interceptors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> n(InterfaceC18167A<D> operation, p customScalarAdapters, k httpResponse) {
        InterfaceC15330g interfaceC15330gA = httpResponse.a();
        Intrinsics.g(interfaceC15330gA);
        return C17154h.G(C18168B.b(C6.a.c(interfaceC15330gA), operation, null, customScalarAdapters, null, 2, null).a().g(true).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> C18177e<D> o(C18177e<D> c18177e, UUID uuid, k kVar, long j10) {
        C18177e.a<D> aVarH = c18177e.a().h(uuid);
        if (kVar != null) {
            aVarH.a(new I6.d(j10, G6.a.a(), kVar.getStatusCode(), kVar.b()));
        }
        return aVarH.b();
    }
}

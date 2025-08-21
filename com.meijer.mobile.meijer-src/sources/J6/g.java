package J6;

import A6.HttpHeader;
import A6.k;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import gw.InterfaceC14418g;
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
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import z6.C18450B;
import z6.C18455d;
import z6.C18456e;
import z6.InterfaceC18449A;
import z6.p;
import z6.w;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u00045)93B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJG\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u000e*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00132\n\u0010\"\u001a\u00060 j\u0002`!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J3\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\b)\u0010*JA\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"LJ6/g;", "LI6/b;", "LA6/j;", "httpRequestComposer", "LJ6/c;", "engine", "", "LJ6/e;", "interceptors", "", "exposeErrorBody", "<init>", "(LA6/j;LJ6/c;Ljava/util/List;Z)V", "Lz6/A$a;", "D", "Lz6/A;", "operation", "", "throwable", "Lz6/e;", "j", "(Lz6/A;Ljava/lang/Throwable;)Lz6/e;", "LA6/k;", "httpResponse", "Lpv/f;", "i", "(Lz6/A;LA6/k;)Lpv/f;", "Lz6/p;", "customScalarAdapters", "n", "(Lz6/A;Lz6/p;LA6/k;)Lpv/f;", "m", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "", "millisStart", "o", "(Lz6/e;Ljava/util/UUID;LA6/k;J)Lz6/e;", "Lz6/d;", "request", "a", "(Lz6/d;)Lpv/f;", "LA6/i;", "httpRequest", "k", "(Lz6/d;LA6/i;Lz6/p;)Lpv/f;", "", "dispose", "()V", "LA6/j;", "b", "LJ6/c;", "c", "Ljava/util/List;", "l", "()Ljava/util/List;", "d", "Z", "LJ6/g$c;", "e", "LJ6/g$c;", "engineInterceptor", "f", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g implements I6.b {

    /* renamed from: f, reason: collision with root package name */
    private static final b f15550f = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A6.j httpRequestComposer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final J6.c engine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<J6.e> interceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean exposeErrorBody;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c engineInterceptor;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"LJ6/g$a;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)LJ6/g$a;", "", "exposeErrorBody", "b", "(Z)LJ6/g$a;", "LJ6/c;", "httpEngine", "c", "(LJ6/c;)LJ6/g$a;", "", "LJ6/e;", "interceptors", "d", "(Ljava/util/List;)LJ6/g$a;", "LJ6/g;", "a", "()LJ6/g;", "LA6/j;", "LA6/j;", "httpRequestComposer", "Ljava/lang/String;", "LJ6/c;", "engine", "", "Ljava/util/List;", "Z", "LA6/f;", "f", "headers", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private A6.j httpRequestComposer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String serverUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private J6.c engine;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean exposeErrorBody;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<J6.e> interceptors = new ArrayList();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers = new ArrayList();

        public final g a() {
            A6.j dVar = this.httpRequestComposer;
            if (dVar != null && this.serverUrl != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'");
            }
            if (dVar == null) {
                String str = this.serverUrl;
                dVar = str != null ? new A6.d(str) : null;
                if (dVar == null) {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                }
            }
            A6.j jVar = dVar;
            if (!this.headers.isEmpty()) {
                this.interceptors.add(new d(this.headers));
            }
            J6.c cVarC = this.engine;
            if (cVarC == null) {
                cVarC = J6.a.c(0L, 1, null);
            }
            return new g(jVar, cVarC, this.interceptors, this.exposeErrorBody, null);
        }

        public final a b(boolean exposeErrorBody) {
            this.exposeErrorBody = exposeErrorBody;
            return this;
        }

        public final a c(J6.c httpEngine) {
            Intrinsics.j(httpEngine, "httpEngine");
            this.engine = httpEngine;
            return this;
        }

        public final a d(List<? extends J6.e> interceptors) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ6/g$b;", "", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJ6/g$c;", "LJ6/e;", "<init>", "(LJ6/g;)V", "LA6/i;", "request", "LJ6/f;", "chain", "LA6/k;", "a", "(LA6/i;LJ6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements J6.e {
        public c() {
        }

        @Override // J6.e
        public Object a(A6.i iVar, J6.f fVar, Continuation<? super k> continuation) {
            return g.this.engine.e3(iVar, continuation);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LJ6/g$d;", "LJ6/e;", "", "LA6/f;", "headers", "<init>", "(Ljava/util/List;)V", "LA6/i;", "request", "LJ6/f;", "chain", "LA6/k;", "a", "(LA6/i;LJ6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class d implements J6.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        @Override // J6.e
        public Object a(A6.i iVar, J6.f fVar, Continuation<? super k> continuation) {
            return fVar.a(A6.i.f(iVar, null, null, 3, null).c(this.headers).e(), continuation);
        }

        public d(List<HttpHeader> headers) {
            Intrinsics.j(headers, "headers");
            this.headers = headers;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz6/A$a;", "D", "Lpv/g;", "Lz6/e;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {71, 107}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e<D> extends SuspendLambda implements Function2<InterfaceC16562g<? super C18456e<D>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f15564a;

        /* renamed from: b, reason: collision with root package name */
        int f15565b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15566c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A6.i f15568e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18455d<D> f15569f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f15570g;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements InterfaceC16561f<C18456e<D>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f15571a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f15572b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18455d f15573c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k f15574d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f15575e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: J6.g$e$a$a, reason: collision with other inner class name */
            public static final class C0251a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f15576a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f15577b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C18455d f15578c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ k f15579d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ long f15580e;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {50}, m = "emit")
                /* renamed from: J6.g$e$a$a$a, reason: collision with other inner class name */
                public static final class C0252a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f15581a;

                    /* renamed from: b, reason: collision with root package name */
                    int f15582b;

                    public C0252a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f15581a = obj;
                        this.f15582b |= Integer.MIN_VALUE;
                        return C0251a.this.emit(null, this);
                    }
                }

                public C0251a(InterfaceC16562g interfaceC16562g, g gVar, C18455d c18455d, k kVar, long j10) {
                    this.f15576a = interfaceC16562g;
                    this.f15577b = gVar;
                    this.f15578c = c18455d;
                    this.f15579d = kVar;
                    this.f15580e = j10;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof J6.g.e.a.C0251a.C0252a
                        if (r0 == 0) goto L13
                        r0 = r12
                        J6.g$e$a$a$a r0 = (J6.g.e.a.C0251a.C0252a) r0
                        int r1 = r0.f15582b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f15582b = r1
                        goto L18
                    L13:
                        J6.g$e$a$a$a r0 = new J6.g$e$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f15581a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f15582b
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
                        pv.g r12 = r10.f15576a
                        r5 = r11
                        z6.e r5 = (z6.C18456e) r5
                        J6.g r4 = r10.f15577b
                        z6.d r11 = r10.f15578c
                        java.util.UUID r6 = r11.getRequestUuid()
                        A6.k r7 = r10.f15579d
                        long r8 = r10.f15580e
                        z6.e r11 = J6.g.h(r4, r5, r6, r7, r8)
                        r0.f15582b = r3
                        java.lang.Object r11 = r12.emit(r11, r0)
                        if (r11 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r11 = kotlin.Unit.f143329a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J6.g.e.a.C0251a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC16561f interfaceC16561f, g gVar, C18455d c18455d, k kVar, long j10) {
                this.f15571a = interfaceC16561f;
                this.f15572b = gVar;
                this.f15573c = c18455d;
                this.f15574d = kVar;
                this.f15575e = j10;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f15571a.collect(new C0251a(interfaceC16562g, this.f15572b, this.f15573c, this.f15574d, this.f15575e), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(A6.i iVar, C18455d<D> c18455d, p pVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f15568e = iVar;
            this.f15569f = c18455d;
            this.f15570g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(this.f15568e, this.f15569f, this.f15570g, continuation);
            eVar.f15566c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super C18456e<D>> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
        
            if (pv.C16563h.x(r3, r7, r14) != r1) goto L45;
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
            throw new UnsupportedOperationException("Method not decompiled: J6.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f<D> implements InterfaceC16561f<C18456e<D>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f15584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC18449A f15585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f15586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f15587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f15588e;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f15589a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC18449A f15590b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f15591c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f15592d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f15593e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {112}, m = "emit")
            /* renamed from: J6.g$f$a$a, reason: collision with other inner class name */
            public static final class C0253a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f15594a;

                /* renamed from: b, reason: collision with root package name */
                int f15595b;

                public C0253a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f15594a = obj;
                    this.f15595b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, InterfaceC18449A interfaceC18449A, p pVar, g gVar, Ref.ObjectRef objectRef) {
                this.f15589a = interfaceC16562g;
                this.f15590b = interfaceC18449A;
                this.f15591c = pVar;
                this.f15592d = gVar;
                this.f15593e = objectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof J6.g.f.a.C0253a
                    if (r0 == 0) goto L13
                    r0 = r13
                    J6.g$f$a$a r0 = (J6.g.f.a.C0253a) r0
                    int r1 = r0.f15595b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f15595b = r1
                    goto L18
                L13:
                    J6.g$f$a$a r0 = new J6.g$f$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f15594a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f15595b
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
                    pv.g r13 = r11.f15589a
                    gw.g r12 = (gw.InterfaceC14418g) r12
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f15593e
                    T r4 = r2.f143742a
                    if (r4 != 0) goto L45
                    G6.c r4 = new G6.c
                    r4.<init>()
                    r2.f143742a = r4
                L45:
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f15593e
                    T r2 = r2.f143742a
                    G6.c r2 = (G6.c) r2
                    java.util.Map r12 = r2.f(r12)
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f15593e
                    T r2 = r2.f143742a
                    G6.c r2 = (G6.c) r2
                    java.util.Set r8 = r2.c()
                    kotlin.jvm.internal.Ref$ObjectRef r2 = r11.f15593e
                    T r2 = r2.f143742a
                    G6.c r2 = (G6.c) r2
                    boolean r2 = r2.getHasNext()
                    r2 = r2 ^ r3
                    kotlin.jvm.internal.Ref$ObjectRef r4 = r11.f15593e
                    T r4 = r4.f143742a
                    G6.c r4 = (G6.c) r4
                    boolean r4 = r4.getIsEmptyPayload()
                    if (r4 == 0) goto L72
                    r12 = 0
                    goto L8d
                L72:
                    D6.f r4 = D6.a.c(r12)
                    z6.A r5 = r11.f15590b
                    z6.p r7 = r11.f15591c
                    r9 = 2
                    r10 = 0
                    r6 = 0
                    z6.e r12 = z6.C18450B.b(r4, r5, r6, r7, r8, r9, r10)
                    z6.e$a r12 = r12.a()
                    z6.e$a r12 = r12.g(r2)
                    z6.e r12 = r12.b()
                L8d:
                    if (r12 == 0) goto L98
                    r0.f15595b = r3
                    java.lang.Object r12 = r13.emit(r12, r0)
                    if (r12 != r1) goto L98
                    return r1
                L98:
                    kotlin.Unit r12 = kotlin.Unit.f143329a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: J6.g.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC16561f interfaceC16561f, InterfaceC18449A interfaceC18449A, p pVar, g gVar, Ref.ObjectRef objectRef) {
            this.f15584a = interfaceC16561f;
            this.f15585b = interfaceC18449A;
            this.f15586c = pVar;
            this.f15587d = gVar;
            this.f15588e = objectRef;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f15584a.collect(new a(interfaceC16562g, this.f15585b, this.f15586c, this.f15587d, this.f15588e), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz6/A$a;", "D", "Lpv/g;", "Lz6/e;", "", "throwable", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {236}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: J6.g$g, reason: collision with other inner class name */
    static final class C0254g<D> extends SuspendLambda implements Function3<InterfaceC16562g<? super C18456e<D>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15597a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15598b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC18449A<D> f15600d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0254g(InterfaceC18449A<D> interfaceC18449A, Continuation<? super C0254g> continuation) {
            super(3, continuation);
            this.f15600d = interfaceC18449A;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super C18456e<D>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C0254g c0254g = new C0254g(this.f15600d, continuation);
            c0254g.f15598b = interfaceC16562g;
            c0254g.f15599c = th2;
            return c0254g.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f15597a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f15598b;
                Throwable th2 = (Throwable) this.f15599c;
                if (th2 instanceof ApolloException) {
                    InterfaceC18449A<D> interfaceC18449A = this.f15600d;
                    UUID uuidRandomUUID = UUID.randomUUID();
                    Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
                    C18456e c18456eB = new C18456e.a(interfaceC18449A, uuidRandomUUID).e((ApolloException) th2).b();
                    this.f15598b = null;
                    this.f15597a = 1;
                    if (interfaceC16562g.emit(c18456eB, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ g(A6.j jVar, J6.c cVar, List list, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, cVar, list, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g(A6.j jVar, J6.c cVar, List<? extends J6.e> list, boolean z10) {
        this.httpRequestComposer = jVar;
        this.engine = cVar;
        this.interceptors = list;
        this.exposeErrorBody = z10;
        this.engineInterceptor = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> i(InterfaceC18449A<D> operation, k httpResponse) throws IOException {
        InterfaceC14418g interfaceC14418gA;
        if (this.exposeErrorBody) {
            interfaceC14418gA = httpResponse.a();
        } else {
            InterfaceC14418g interfaceC14418gA2 = httpResponse.a();
            if (interfaceC14418gA2 != null) {
                interfaceC14418gA2.close();
            }
            interfaceC14418gA = null;
        }
        InterfaceC14418g interfaceC14418g = interfaceC14418gA;
        return C16563h.G(j(operation, new ApolloHttpException(httpResponse.getStatusCode(), httpResponse.b(), interfaceC14418g, "Http request failed with status code `" + httpResponse.getStatusCode() + "`", null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18449A.a> C18456e<D> j(InterfaceC18449A<D> operation, Throwable throwable) {
        ApolloException apolloNetworkException = throwable instanceof ApolloException ? (ApolloException) throwable : new ApolloNetworkException("Error while reading JSON response", throwable);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        return new C18456e.a(operation, uuidRandomUUID).e(apolloNetworkException).g(true).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> m(InterfaceC18449A<D> operation, p customScalarAdapters, k httpResponse) {
        return C16563h.g(new f(G6.g.e(httpResponse), operation, customScalarAdapters, this, new Ref.ObjectRef()), new C0254g(operation, null));
    }

    @Override // I6.b
    public <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> a(C18455d<D> request) {
        Intrinsics.j(request, "request");
        w.b bVarC = request.getExecutionContext().c(p.INSTANCE);
        Intrinsics.g(bVarC);
        return k(request, this.httpRequestComposer.a(request), (p) bVarC);
    }

    @Override // I6.b
    public void dispose() {
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((J6.e) it.next()).dispose();
        }
        this.engine.close();
    }

    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> k(C18455d<D> request, A6.i httpRequest, p customScalarAdapters) {
        Intrinsics.j(request, "request");
        Intrinsics.j(httpRequest, "httpRequest");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        return C16563h.E(new e(httpRequest, request, customScalarAdapters, null));
    }

    public final List<J6.e> l() {
        return this.interceptors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> n(InterfaceC18449A<D> operation, p customScalarAdapters, k httpResponse) {
        InterfaceC14418g interfaceC14418gA = httpResponse.a();
        Intrinsics.g(interfaceC14418gA);
        return C16563h.G(C18450B.b(D6.a.b(interfaceC14418gA), operation, null, customScalarAdapters, null, 2, null).a().g(true).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18449A.a> C18456e<D> o(C18456e<D> c18456e, UUID uuid, k kVar, long j10) {
        C18456e.a<D> aVarH = c18456e.a().h(uuid);
        if (kVar != null) {
            aVarH.a(new J6.d(j10, H6.a.a(), kVar.getStatusCode(), kVar.b()));
        }
        return aVarH.b();
    }
}

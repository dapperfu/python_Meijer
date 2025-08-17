package J6;

import Qv.u;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kw.C15331h;
import okhttp3.Response;
import okhttp3.m;
import qv.InterfaceC16674x;
import sv.w;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\bJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJ6/d;", "LJ6/g;", "Lkotlin/Function0;", "Lokhttp3/m$a;", "webSocketFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/m$a;)V", "()V", "", "url", "", "Lz6/f;", "headers", "LJ6/f;", "a", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Lazy;", "f", "()Lokhttp3/m$a;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy webSocketFactory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {85}, m = "open")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f14589a;

        /* renamed from: b, reason: collision with root package name */
        Object f14590b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14591c;

        /* renamed from: e, reason: collision with root package name */
        int f14593e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14591c = obj;
            this.f14593e |= Integer.MIN_VALUE;
            return d.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"J6/d$b", "LJ6/f;", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkw/h;", "data", "", "b", "(Lkw/h;)V", "string", "a", "(Ljava/lang/String;)V", "close", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ sv.g<String> f14594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f14595b;

        b(sv.g<String> gVar, m mVar) {
            this.f14594a = gVar;
            this.f14595b = mVar;
        }

        @Override // J6.f
        public void a(String string) {
            Intrinsics.j(string, "string");
            if (this.f14595b.a(string)) {
                return;
            }
            w.a.a(this.f14594a, null, 1, null);
        }

        @Override // J6.f
        public void b(C15331h data) {
            Intrinsics.j(data, "data");
            if (this.f14595b.b(data)) {
                return;
            }
            w.a.a(this.f14594a, null, 1, null);
        }

        @Override // J6.f
        public void close() {
            this.f14595b.f(1000, null);
        }

        @Override // J6.f
        public Object e(Continuation<? super String> continuation) {
            return this.f14594a.e(continuation);
        }
    }

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"J6/d$c", "LQv/u;", "Lokhttp3/m;", "webSocket", "Lokhttp3/Response;", "response", "", "f", "(Lokhttp3/m;Lokhttp3/Response;)V", "", "text", "d", "(Lokhttp3/m;Ljava/lang/String;)V", "Lkw/h;", "bytes", "e", "(Lokhttp3/m;Lkw/h;)V", "", "t", "c", "(Lokhttp3/m;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "code", "reason", "b", "(Lokhttp3/m;ILjava/lang/String;)V", "a", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16674x<Unit> f14596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ sv.g<String> f14597b;

        c(InterfaceC16674x<Unit> interfaceC16674x, sv.g<String> gVar) {
            this.f14596a = interfaceC16674x;
            this.f14597b = gVar;
        }

        @Override // Qv.u
        public void a(m webSocket, int code, String reason) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(reason, "reason");
            w.a.a(this.f14597b, null, 1, null);
        }

        @Override // Qv.u
        public void b(m webSocket, int code, String reason) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(reason, "reason");
            this.f14596a.Z(Unit.f142422a);
            this.f14597b.q(new ApolloWebSocketClosedException(code, reason, null, 4, null));
        }

        @Override // Qv.u
        public void c(m webSocket, Throwable t10, Response response) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(t10, "t");
            this.f14596a.Z(Unit.f142422a);
            this.f14597b.q(new ApolloNetworkException("Web socket communication error", t10));
        }

        @Override // Qv.u
        public void d(m webSocket, String text) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(text, "text");
            this.f14597b.k(text);
        }

        @Override // Qv.u
        public void e(m webSocket, C15331h bytes) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(bytes, "bytes");
            this.f14597b.k(bytes.c0());
        }

        @Override // Qv.u
        public void f(m webSocket, Response response) {
            Intrinsics.j(webSocket, "webSocket");
            Intrinsics.j(response, "response");
            this.f14596a.Z(Unit.f142422a);
        }
    }

    public d(final Function0<? extends m.a> webSocketFactory) {
        Intrinsics.j(webSocketFactory, "webSocketFactory");
        this.webSocketFactory = LazyKt.b(new Function0() { // from class: J6.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.h(webSocketFactory);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m.a e(m.a aVar) {
        return aVar;
    }

    private final m.a f() {
        return (m.a) this.webSocketFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(m mVar, Throwable th2) {
        mVar.f(1001, null);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // J6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, java.util.List<z6.HttpHeader> r7, kotlin.coroutines.Continuation<? super J6.f> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof J6.d.a
            if (r0 == 0) goto L13
            r0 = r8
            J6.d$a r0 = (J6.d.a) r0
            int r1 = r0.f14593e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14593e = r1
            goto L18
        L13:
            J6.d$a r0 = new J6.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14591c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f14593e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f14590b
            okhttp3.m r6 = (okhttp3.m) r6
            java.lang.Object r7 = r0.f14589a
            sv.g r7 = (sv.g) r7
            kotlin.ResultKt.b(r8)
            goto L79
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.ResultKt.b(r8)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r4 = 0
            sv.g r8 = sv.j.b(r8, r4, r4, r2, r4)
            qv.x r2 = qv.C16678z.b(r4, r3, r4)
            okhttp3.Request$a r4 = new okhttp3.Request$a
            r4.<init>()
            okhttp3.Request$a r6 = r4.t(r6)
            okhttp3.Headers r7 = H6.d.e(r7)
            okhttp3.Request$a r6 = r6.n(r7)
            okhttp3.Request r6 = r6.b()
            okhttp3.m$a r7 = r5.f()
            J6.d$c r4 = new J6.d$c
            r4.<init>(r2, r8)
            okhttp3.m r6 = r7.a(r6, r4)
            r0.f14589a = r8
            r0.f14590b = r6
            r0.f14593e = r3
            java.lang.Object r7 = r2.B(r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            r7 = r8
        L79:
            J6.b r8 = new J6.b
            r8.<init>()
            r7.f(r8)
            J6.d$b r8 = new J6.d$b
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.d.a(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(final m.a webSocketFactory) {
        this((Function0<? extends m.a>) new Function0() { // from class: J6.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.e(webSocketFactory);
            }
        });
        Intrinsics.j(webSocketFactory, "webSocketFactory");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m.a h(Function0 function0) {
        return (m.a) function0.invoke();
    }

    public d() {
        this(H6.d.c().a());
    }
}

package K6;

import K6.j;
import com.apollographql.apollo.exception.ApolloNetworkException;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;
import z6.C18455d;
import z6.InterfaceC18449A;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001$B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LK6/e;", "LK6/j;", "LK6/f;", "webSocketConnection", "LK6/j$b;", "listener", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "LK6/i;", "frameType", "<init>", "(LK6/f;LK6/j$b;JLkotlin/jvm/functions/Function1;LK6/i;)V", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageMap", "d", "(Ljava/util/Map;)V", "Lz6/A$a;", "D", "Lz6/d;", "request", "k", "(Lz6/d;)V", "l", "c", "J", "Lkotlin/jvm/functions/Function1;", "e", "LK6/i;", "a", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends j {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long connectionAcknowledgeTimeoutMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i frameType;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R:\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LK6/e$a;", "LK6/j$a;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "LK6/i;", "frameType", "<init>", "(JLkotlin/jvm/functions/Function1;LK6/i;)V", "LK6/f;", "webSocketConnection", "LK6/j$b;", "listener", "Lmv/O;", "scope", "LK6/j;", "a", "(LK6/f;LK6/j$b;Lmv/O;)LK6/j;", "J", "b", "Lkotlin/jvm/functions/Function1;", "c", "LK6/i;", "getName", "()Ljava/lang/String;", "name", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements j.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long connectionAcknowledgeTimeoutMs;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Function1<Continuation<? super Map<String, ? extends Object>>, Object> connectionPayload;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final i frameType;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: K6.e$a$a, reason: collision with other inner class name */
        static final class C0272a extends SuspendLambda implements Function1<Continuation, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f16314a;

            C0272a(Continuation<? super C0272a> continuation) {
                super(1, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C0272a(continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0272a) create(continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f16314a == 0) {
                    ResultKt.b(obj);
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public a(long j10, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, i frameType) {
            Intrinsics.j(connectionPayload, "connectionPayload");
            Intrinsics.j(frameType, "frameType");
            this.connectionAcknowledgeTimeoutMs = j10;
            this.connectionPayload = connectionPayload;
            this.frameType = frameType;
        }

        @Override // K6.j.a
        public j a(f webSocketConnection, j.b listener, InterfaceC15783O scope) {
            Intrinsics.j(webSocketConnection, "webSocketConnection");
            Intrinsics.j(listener, "listener");
            Intrinsics.j(scope, "scope");
            return new e(webSocketConnection, listener, this.connectionAcknowledgeTimeoutMs, this.connectionPayload, this.frameType);
        }

        @Override // K6.j.a
        public String getName() {
            return "graphql-ws";
        }

        public /* synthetic */ a(long j10, Function1 function1, i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 10000L : j10, (i10 & 2) != 0 ? new C0272a(null) : function1, (i10 & 4) != 0 ? i.f16399a : iVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", l = {31, 38}, m = "connectionInit")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f16315a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16316b;

        /* renamed from: d, reason: collision with root package name */
        int f16318d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16316b = obj;
            this.f16318d |= Integer.MIN_VALUE;
            return e.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2", f = "SubscriptionWsProtocol.kt", l = {39}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16319a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f16319a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                e eVar = e.this;
                this.f16319a = 1;
                obj = eVar.e(this);
                if (obj == objF) {
                    return objF;
                }
            }
            Map map = (Map) obj;
            Object obj2 = map.get("type");
            if (Intrinsics.e(obj2, "connection_ack")) {
                return Unit.f143329a;
            }
            if (!Intrinsics.e(obj2, "connection_error")) {
                System.out.println((Object) ("unknown message while waiting for connection_ack: '" + obj2));
                return Unit.f143329a;
            }
            throw new ApolloNetworkException("Connection error:\n" + map, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public e(f webSocketConnection, j.b listener, long j10, Function1<? super Continuation<? super Map<String, ? extends Object>>, ? extends Object> connectionPayload, i frameType) {
        super(webSocketConnection, listener);
        Intrinsics.j(webSocketConnection, "webSocketConnection");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(connectionPayload, "connectionPayload");
        Intrinsics.j(frameType, "frameType");
        this.connectionAcknowledgeTimeoutMs = j10;
        this.connectionPayload = connectionPayload;
        this.frameType = frameType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (mv.d1.c(r4, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K6.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof K6.e.b
            if (r0 == 0) goto L13
            r0 = r7
            K6.e$b r0 = (K6.e.b) r0
            int r1 = r0.f16318d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16318d = r1
            goto L18
        L13:
            K6.e$b r0 = new K6.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16316b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f16318d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            goto L7d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f16315a
            java.util.Map r2 = (java.util.Map) r2
            kotlin.ResultKt.b(r7)
            goto L5c
        L3c:
            kotlin.ResultKt.b(r7)
            java.lang.String r7 = "type"
            java.lang.String r2 = "connection_init"
            kotlin.Pair r7 = kotlin.TuplesKt.a(r7, r2)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r7}
            java.util.Map r2 = kotlin.collections.MapsKt.r(r7)
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> r7 = r6.connectionPayload
            r0.f16315a = r2
            r0.f16318d = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L5c
            goto L7c
        L5c:
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L65
            java.lang.String r4 = "payload"
            r2.put(r4, r7)
        L65:
            K6.i r7 = r6.frameType
            r6.h(r2, r7)
            long r4 = r6.connectionAcknowledgeTimeoutMs
            K6.e$c r7 = new K6.e$c
            r2 = 0
            r7.<init>(r2)
            r0.f16315a = r2
            r0.f16318d = r3
            java.lang.Object r7 = mv.d1.c(r4, r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.e.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // K6.j
    public void d(Map<String, ? extends Object> messageMap) {
        Intrinsics.j(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        if (Intrinsics.e(obj, "data")) {
            j.b listener = getListener();
            Object obj2 = messageMap.get(PreferencesHelper.PREF_ID);
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            listener.c((String) obj2, (Map) obj3);
            return;
        }
        if (Intrinsics.e(obj, "error")) {
            Object obj4 = messageMap.get(PreferencesHelper.PREF_ID);
            if (obj4 instanceof String) {
                getListener().b((String) obj4, (Map) messageMap.get("payload"));
                return;
            } else {
                getListener().d((Map) messageMap.get("payload"));
                return;
            }
        }
        if (Intrinsics.e(obj, "complete")) {
            j.b listener2 = getListener();
            Object obj5 = messageMap.get(PreferencesHelper.PREF_ID);
            Intrinsics.h(obj5, "null cannot be cast to non-null type kotlin.String");
            listener2.a((String) obj5);
        }
    }

    @Override // K6.j
    public <D extends InterfaceC18449A.a> void k(C18455d<D> request) {
        Intrinsics.j(request, "request");
        h(MapsKt.o(TuplesKt.a("type", "start"), TuplesKt.a(PreferencesHelper.PREF_ID, request.getRequestUuid().toString()), TuplesKt.a("payload", A6.d.INSTANCE.k(request))), this.frameType);
    }

    @Override // K6.j
    public <D extends InterfaceC18449A.a> void l(C18455d<D> request) {
        Intrinsics.j(request, "request");
        h(MapsKt.o(TuplesKt.a("type", "stop"), TuplesKt.a(PreferencesHelper.PREF_ID, request.getRequestUuid().toString())), this.frameType);
    }
}

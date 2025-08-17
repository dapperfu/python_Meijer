package J6;

import J6.e;
import J6.j;
import K6.m;
import com.apollographql.apollo.exception.ApolloException;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l8;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C0;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.Z;
import sv.EnumC17050a;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import y6.C18176d;
import y6.C18177e;
import y6.InterfaceC18167A;
import z6.HttpHeader;

@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001Q\u0018\u00002\u00020\u0001:\u0001-B\u008e\u0001\b\u0002\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00129\u0010\u0016\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\b\b\u0000\u0010\u001f*\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0'\"\b\b\u0000\u0010\u001f*\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+R*\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104RG\u0010\u0016\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020<0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"LJ6/h;", "LH6/b;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "serverUrl", "", "Lz6/f;", "headers", "LJ6/g;", "webSocketEngine", "", "idleTimeoutMillis", "LJ6/j$a;", "protocolFactory", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "", "reopenWhen", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;LJ6/g;JLJ6/j$a;Lkotlin/jvm/functions/Function3;)V", "Lqv/O;", "scope", "", "h", "(Lqv/O;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly6/A$a;", "D", "Ly6/d;", "request", "Lcom/apollographql/apollo/exception/ApolloException;", "apolloException", "Ly6/e;", "g", "(Ly6/d;Lcom/apollographql/apollo/exception/ApolloException;)Ly6/e;", "Ltv/f;", "a", "(Ly6/d;)Ltv/f;", "dispose", "()V", "Lkotlin/jvm/functions/Function1;", "b", "Ljava/util/List;", "c", "LJ6/g;", "d", "J", "e", "LJ6/j$a;", "f", "Lkotlin/jvm/functions/Function3;", "Lsv/g;", "LK6/f;", "Lsv/g;", "messages", "Ltv/A;", "LK6/d;", "Ltv/A;", "mutableEvents", "Ltv/F;", "i", "Ltv/F;", "events", "Ltv/P;", "", "j", "Ltv/P;", "getSubscriptionCount", "()Ltv/P;", "subscriptionCount", "Lqv/K;", "k", "Lqv/K;", "backgroundDispatcher", "l", "Lqv/O;", "coroutineScope", "J6/h$i", "m", "LJ6/h$i;", "listener", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h implements H6.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Continuation<? super String>, Object> serverUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final J6.g webSocketEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long idleTimeoutMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j.a protocolFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function3<Throwable, Long, Continuation<? super Boolean>, Object> reopenWhen;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sv.g<K6.f> messages;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<K6.d> mutableEvents;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<K6.d> events;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final P<Integer> subscriptionCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K backgroundDispatcher;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i listener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {94}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14624a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14625b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f14625b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14624a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f14625b;
                h hVar = h.this;
                this.f14624a = 1;
                if (hVar.h(interfaceC16622O, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u001f\u001a\u00020\u000029\u0010\u001e\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R.\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010$R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+RI\u0010\u001e\u001a5\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,¨\u0006-"}, d2 = {"LJ6/h$b;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)LJ6/h$b;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "f", "(Lkotlin/jvm/functions/Function1;)LJ6/h$b;", "LJ6/g;", "webSocketEngine", "g", "(LJ6/g;)LJ6/h$b;", "", "idleTimeoutMillis", "b", "(J)LJ6/h$b;", "LJ6/j$a;", "protocolFactory", "c", "(LJ6/j$a;)LJ6/h$b;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "", "reopenWhen", "d", "(Lkotlin/jvm/functions/Function3;)LJ6/h$b;", "LJ6/h;", "a", "()LJ6/h;", "Lkotlin/jvm/functions/Function1;", "", "Lz6/f;", "Ljava/util/List;", "headers", "LJ6/g;", "Ljava/lang/Long;", "LJ6/j$a;", "Lkotlin/jvm/functions/Function3;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Continuation<? super String>, ? extends Object> serverUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> headers = new ArrayList();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private J6.g webSocketEngine;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Long idleTimeoutMillis;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private j.a protocolFactory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f14633a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f14634b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f14634b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new a(this.f14634b, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super String> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f14633a == 0) {
                    ResultKt.b(obj);
                    return this.f14634b;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final h a() {
            Function1<? super Continuation<? super String>, ? extends Object> function1 = this.serverUrl;
            if (function1 == null) {
                throw new IllegalStateException("No serverUrl specified");
            }
            List<HttpHeader> list = this.headers;
            J6.g dVar = this.webSocketEngine;
            if (dVar == null) {
                dVar = new J6.d();
            }
            Long l10 = this.idleTimeoutMillis;
            long jLongValue = l10 != null ? l10.longValue() : l8.b.f92525b;
            j.a aVar = this.protocolFactory;
            if (aVar == null) {
                aVar = new e.a(0L, null, null, 7, null);
            }
            return new h(function1, list, dVar, jLongValue, aVar, this.reopenWhen, null);
        }

        public final b c(j.a protocolFactory) {
            Intrinsics.j(protocolFactory, "protocolFactory");
            this.protocolFactory = protocolFactory;
            return this;
        }

        public final b d(Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> reopenWhen) {
            this.reopenWhen = reopenWhen;
            return this;
        }

        public final b e(String serverUrl) {
            Intrinsics.j(serverUrl, "serverUrl");
            this.serverUrl = new a(serverUrl, null);
            return this;
        }

        public final b f(Function1<? super Continuation<? super String>, ? extends Object> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public final b g(J6.g webSocketEngine) {
            Intrinsics.j(webSocketEngine, "webSocketEngine");
            this.webSocketEngine = webSocketEngine;
            return this;
        }

        public final b b(long idleTimeoutMillis) {
            this.idleTimeoutMillis = Long.valueOf(idleTimeoutMillis);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements InterfaceC17152f<K6.d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f14635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18176d f14636b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f14637a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18176d f14638b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
            /* renamed from: J6.h$c$a$a, reason: collision with other inner class name */
            public static final class C0232a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14639a;

                /* renamed from: b, reason: collision with root package name */
                int f14640b;

                public C0232a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14639a = obj;
                    this.f14640b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C18176d c18176d) {
                this.f14637a = interfaceC17153g;
                this.f14638b = c18176d;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof J6.h.c.a.C0232a
                    if (r0 == 0) goto L13
                    r0 = r8
                    J6.h$c$a$a r0 = (J6.h.c.a.C0232a) r0
                    int r1 = r0.f14640b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14640b = r1
                    goto L18
                L13:
                    J6.h$c$a$a r0 = new J6.h$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f14639a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f14640b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r8)
                    goto L5c
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.ResultKt.b(r8)
                    tv.g r8 = r6.f14637a
                    r2 = r7
                    K6.d r2 = (K6.d) r2
                    java.lang.String r4 = r2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
                    y6.d r5 = r6.f14638b
                    java.util.UUID r5 = r5.getRequestUuid()
                    java.lang.String r5 = r5.toString()
                    boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r5)
                    if (r4 != 0) goto L53
                    java.lang.String r2 = r2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
                    if (r2 != 0) goto L5c
                L53:
                    r0.f14640b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L5c
                    return r1
                L5c:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: J6.h.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f, C18176d c18176d) {
            this.f14635a = interfaceC17152f;
            this.f14636b = c18176d;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super K6.d> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f14635a.collect(new a(interfaceC17153g, this.f14636b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d<D> implements InterfaceC17152f<C18177e<D>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f14642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F6.c f14643b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f14644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ F6.c f14645b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
            /* renamed from: J6.h$d$a$a, reason: collision with other inner class name */
            public static final class C0233a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14646a;

                /* renamed from: b, reason: collision with root package name */
                int f14647b;

                public C0233a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14646a = obj;
                    this.f14647b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, F6.c cVar) {
                this.f14644a = interfaceC17153g;
                this.f14645b = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof J6.h.d.a.C0233a
                    if (r0 == 0) goto L13
                    r0 = r6
                    J6.h$d$a$a r0 = (J6.h.d.a.C0233a) r0
                    int r1 = r0.f14647b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14647b = r1
                    goto L18
                L13:
                    J6.h$d$a$a r0 = new J6.h$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f14646a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f14647b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f14644a
                    r2 = r5
                    y6.e r2 = (y6.C18177e) r2
                    F6.c r2 = r4.f14645b
                    boolean r2 = r2.getIsEmptyPayload()
                    if (r2 != 0) goto L4a
                    r0.f14647b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: J6.h.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC17152f interfaceC17152f, F6.c cVar) {
            this.f14642a = interfaceC17152f;
            this.f14643b = cVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f14642a.collect(new a(interfaceC17153g, this.f14643b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e<D> implements InterfaceC17152f<C18177e<D>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f14649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18176d f14650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F6.c f14651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f14652d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f14653a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18176d f14654b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ F6.c f14655c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f14656d;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
            /* renamed from: J6.h$e$a$a, reason: collision with other inner class name */
            public static final class C0234a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14657a;

                /* renamed from: b, reason: collision with root package name */
                int f14658b;

                public C0234a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14657a = obj;
                    this.f14658b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C18176d c18176d, F6.c cVar, h hVar) {
                this.f14653a = interfaceC17153g;
                this.f14654b = c18176d;
                this.f14655c = cVar;
                this.f14656d = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    Method dump skipped, instructions count: 300
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: J6.h.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC17152f interfaceC17152f, C18176d c18176d, F6.c cVar, h hVar) {
            this.f14649a = interfaceC17152f;
            this.f14650b = c18176d;
            this.f14651c = cVar;
            this.f14652d = hVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f14649a.collect(new a(interfaceC17153g, this.f14650b, this.f14651c, this.f14652d), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "LK6/d;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$1", f = "WebSocketNetworkTransport.kt", l = {269}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC17153g<? super K6.d>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14660a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C18176d<D> f14662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C18176d<D> c18176d, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f14662c = c18176d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new f(this.f14662c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super K6.d> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14660a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sv.g gVar = h.this.messages;
                K6.l lVar = new K6.l(this.f14662c);
                this.f14660a = 1;
                if (gVar.r(lVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "LK6/d;", "it", "", "<anonymous>", "(Ltv/g;LK6/d;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", l = {284, 297}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function3<InterfaceC17153g<? super K6.d>, K6.d, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14663a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14664b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14665c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18176d<D> f14666d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C18176d<D> c18176d, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f14666d = c18176d;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super K6.d> interfaceC17153g, K6.d dVar, Continuation<? super Boolean> continuation) {
            g gVar = new g(this.f14666d, continuation);
            gVar.f14664b = interfaceC17153g;
            gVar.f14665c = dVar;
            return gVar.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f14663a
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r8)
                goto L76
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.ResultKt.b(r8)
                goto L83
            L1f:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f14664b
                tv.g r8 = (tv.InterfaceC17153g) r8
                java.lang.Object r1 = r7.f14665c
                K6.d r1 = (K6.d) r1
                boolean r5 = r1 instanceof K6.h
                if (r5 == 0) goto L2f
                goto L83
            L2f:
                boolean r5 = r1 instanceof K6.b
                if (r5 == 0) goto L34
                goto L83
            L34:
                boolean r5 = r1 instanceof K6.g
                r6 = 0
                if (r5 == 0) goto L44
                r7.f14664b = r6
                r7.f14663a = r4
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L83
                goto L82
            L44:
                boolean r3 = r1 instanceof K6.e
                if (r3 == 0) goto L78
                y6.d<D> r8 = r7.f14666d
                y6.A r8 = r8.g()
                java.lang.String r8 = r8.name()
                K6.e r1 = (K6.e) r1
                java.util.Map r0 = r1.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Received general error while executing operation "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = ": "
                r1.append(r8)
                r1.append(r0)
                java.lang.String r8 = r1.toString()
                java.io.PrintStream r0 = java.lang.System.out
                r0.println(r8)
            L76:
                r3 = r4
                goto L83
            L78:
                r7.f14664b = r6
                r7.f14663a = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L76
            L82:
                return r0
            L83:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: J6.h.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly6/A$a;", "D", "Ltv/g;", "Ly6/e;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6", f = "WebSocketNetworkTransport.kt", l = {334}, m = "invokeSuspend")
    /* renamed from: J6.h$h, reason: collision with other inner class name */
    static final class C0235h<D> extends SuspendLambda implements Function3<InterfaceC17153g<? super C18177e<D>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14667a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C18176d<D> f14669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0235h(C18176d<D> c18176d, Continuation<? super C0235h> continuation) {
            super(3, continuation);
            this.f14669c = c18176d;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super C18177e<D>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            return h.this.new C0235h(this.f14669c, continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14667a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sv.g gVar = h.this.messages;
                m mVar = new m(this.f14669c);
                this.f14667a = 1;
                if (gVar.r(mVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"J6/h$i", "LJ6/j$b;", "", PreferencesHelper.PREF_ID, "", "", "payload", "", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "a", "(Ljava/lang/String;)V", "d", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements j.b {
        i() {
        }

        @Override // J6.j.b
        public void a(String id2) {
            Intrinsics.j(id2, "id");
            h.this.messages.k(new K6.h(id2));
        }

        @Override // J6.j.b
        public void b(String id2, Map<String, ? extends Object> payload) {
            Intrinsics.j(id2, "id");
            h.this.messages.k(new K6.i(id2, payload));
        }

        @Override // J6.j.b
        public void c(String id2, Map<String, ? extends Object> payload) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(payload, "payload");
            h.this.messages.k(new K6.j(id2, payload));
        }

        @Override // J6.j.b
        public void d(Map<String, ? extends Object> payload) {
            h.this.messages.k(new K6.e(payload));
        }

        @Override // J6.j.b
        public void e(Throwable cause) {
            Intrinsics.j(cause, "cause");
            h.this.messages.k(new K6.g(cause));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", l = {149, 154, 156, 191, 190, HttpResponseStatus.SUCCESS_OK, 210, 214, 241}, m = "supervise")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f14671a;

        /* renamed from: b, reason: collision with root package name */
        Object f14672b;

        /* renamed from: c, reason: collision with root package name */
        Object f14673c;

        /* renamed from: d, reason: collision with root package name */
        Object f14674d;

        /* renamed from: e, reason: collision with root package name */
        Object f14675e;

        /* renamed from: f, reason: collision with root package name */
        Object f14676f;

        /* renamed from: g, reason: collision with root package name */
        Object f14677g;

        /* renamed from: h, reason: collision with root package name */
        long f14678h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14679i;

        /* renamed from: k, reason: collision with root package name */
        int f14681k;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14679i = obj;
            this.f14681k |= Integer.MIN_VALUE;
            return h.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$3", f = "WebSocketNetworkTransport.kt", l = {225}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<J6.j> f14683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Ref.ObjectRef<J6.j> objectRef, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f14683b = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f14683b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14682a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                J6.j jVar = this.f14683b.f142835a;
                Intrinsics.g(jVar);
                this.f14682a = 1;
                if (jVar.f(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {251}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14684a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<J6.j> f14686c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C0> f14687d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C0> f14688e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Ref.ObjectRef<J6.j> objectRef, Ref.ObjectRef<C0> objectRef2, Ref.ObjectRef<C0> objectRef3, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f14686c = objectRef;
            this.f14687d = objectRef2;
            this.f14688e = objectRef3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new l(this.f14686c, this.f14687d, this.f14688e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14684a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                long j10 = h.this.idleTimeoutMillis;
                this.f14684a = 1;
                if (Z.b(j10, this) == objF) {
                    return objF;
                }
            }
            h.i(this.f14686c, this.f14687d, this.f14688e);
            return Unit.f142422a;
        }
    }

    public /* synthetic */ h(Function1 function1, List list, J6.g gVar, long j10, j.a aVar, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, list, gVar, j10, aVar, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:86|(1:164)|87|88|(3:95|(3:98|(5:172|100|104|105|(6:108|162|109|110|168|111))(1:173)|96)|171)(1:92)|101|102|160|103|104|105|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:108|162|109|110|168|111) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0364, code lost:
    
        if (r0.b(r2) != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0382, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0383, code lost:
    
        r5 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03bf, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0462, code lost:
    
        if (r0.r(r7, r2) == r6) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e5, code lost:
    
        r5 = r12;
        r7 = r13;
        r12 = r14;
        r13 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:90:0x02da, B:95:0x02eb], limit reached: 166 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f5 A[Catch: Exception -> 0x02e4, TryCatch #5 {Exception -> 0x02e4, blocks: (B:87:0x02ce, B:90:0x02da, B:101:0x030a, B:95:0x02eb, B:96:0x02ef, B:98:0x02f5, B:100:0x0305), top: B:164:0x02ce }] */
    /* JADX WARN: Type inference failed for: r0v37, types: [J6.j, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [T, qv.C0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [T, qv.C0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0403 -> B:144:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0424 -> B:144:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0442 -> B:144:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0462 -> B:144:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0241 -> B:36:0x01a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(qv.InterfaceC16622O r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.h.h(qv.O, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(Function1<? super Continuation<? super String>, ? extends Object> function1, List<HttpHeader> list, J6.g gVar, long j10, j.a aVar, Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        this.serverUrl = function1;
        this.headers = list;
        this.webSocketEngine = gVar;
        this.idleTimeoutMillis = j10;
        this.protocolFactory = aVar;
        this.reopenWhen = function3;
        this.messages = sv.j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        InterfaceC17139A<K6.d> interfaceC17139AA = C17146H.a(0, a.e.API_PRIORITY_OTHER, EnumC17050a.f161240a);
        this.mutableEvents = interfaceC17139AA;
        this.events = C17154h.b(interfaceC17139AA);
        this.subscriptionCount = interfaceC17139AA.c();
        AbstractC16618K abstractC16618KV0 = AbstractC16618K.V0(C16639f0.a(), 1, null, 2, null);
        this.backgroundDispatcher = abstractC16618KV0;
        InterfaceC16622O interfaceC16622OA = C16623P.a(abstractC16618KV0);
        this.coroutineScope = interfaceC16622OA;
        C16648k.d(interfaceC16622OA, null, null, new a(null), 3, null);
        this.listener = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Ref.ObjectRef<J6.j> objectRef, Ref.ObjectRef<C0> objectRef2, Ref.ObjectRef<C0> objectRef3) {
        J6.j jVar = objectRef.f142835a;
        if (jVar != null) {
            jVar.a();
        }
        objectRef.f142835a = null;
        C0 c02 = objectRef2.f142835a;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        objectRef2.f142835a = null;
        C0 c03 = objectRef3.f142835a;
        if (c03 != null) {
            C0.a.a(c03, null, 1, null);
        }
        objectRef3.f142835a = null;
    }

    @Override // H6.b
    public <D extends InterfaceC18167A.a> InterfaceC17152f<C18177e<D>> a(C18176d<D> request) {
        Intrinsics.j(request, "request");
        F6.c cVar = new F6.c();
        return C17154h.N(new d(new e(F6.f.a(new c(C17154h.Q(this.events, new f(request, null)), request), new g(request, null)), request, cVar, this), cVar), new C0235h(request, null));
    }

    @Override // H6.b
    public void dispose() {
        this.messages.k(K6.c.f16307a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends InterfaceC18167A.a> C18177e<D> g(C18176d<D> request, ApolloException apolloException) {
        return new C18177e.a(request.g(), request.getRequestUuid()).e(apolloException).g(true).b();
    }
}

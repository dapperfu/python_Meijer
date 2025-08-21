package y6;

import A6.HttpHeader;
import A6.h;
import F6.e;
import J6.g;
import K6.g;
import K6.h;
import K6.j;
import com.apollographql.apollo.exception.ApolloException;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15800f0;
import mv.C15805i;
import mv.InterfaceC15783O;
import ov.t;
import pv.C16563h;
import pv.C16568m;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import z6.C18455d;
import z6.C18456e;
import z6.E;
import z6.InterfaceC18449A;
import z6.p;
import z6.w;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u001d B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016\"\b\b\u0000\u0010\b*\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016\"\b\b\u0000\u0010\b*\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010)\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b(\u0010&R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010;\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R&\u0010A\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00108R\u0016\u0010F\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010-R\u0014\u0010L\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010Q\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b?\u0010PR\u001c\u0010V\u001a\u0004\u0018\u00010R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bH\u0010UR\"\u0010Y\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010-\u001a\u0004\bB\u0010/R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\bJ\u0010[R\u001c\u0010^\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\bX\u0010[R\u001c\u0010`\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010E\u001a\u0004\b<\u0010[R\u001c\u0010b\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010E\u001a\u0004\b7\u0010[R\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010d¨\u0006g"}, d2 = {"Ly6/b;", "", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ly6/b$a;", "builder", "<init>", "(Ly6/b$a;)V", "D", "Lz6/E;", "query", "Ly6/a;", "w", "(Lz6/E;)Ly6/a;", "", "close", "()V", "Lz6/A$a;", "Lz6/d;", "apolloRequest", "", "throwing", "Lpv/f;", "Lz6/e;", "d", "(Lz6/d;Z)Lpv/f;", "c", "u", "()Ly6/b$a;", "a", "Ly6/b$a;", "Ly6/c;", "b", "Ly6/c;", "concurrencyInfo", "LI6/b;", "LI6/b;", "getNetworkTransport", "()LI6/b;", "networkTransport", "getSubscriptionNetworkTransport", "subscriptionNetworkTransport", "", "LF6/a;", "e", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "interceptors", "Lz6/p;", "f", "Lz6/p;", "getCustomScalarAdapters", "()Lz6/p;", "customScalarAdapters", "g", "LF6/a;", "getCacheInterceptor", "()LF6/a;", "cacheInterceptor", "h", "autoPersistedQueryInterceptor", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "retryOnError", "j", "retryOnErrorInterceptor", "k", "Ljava/lang/Boolean;", "failFastIfOffline", "LG6/b;", "l", "listeners", "m", "Z", "sendEnhancedClientAwareness", "Lz6/w;", "n", "Lz6/w;", "()Lz6/w;", "executionContext", "LA6/h;", "o", "LA6/h;", "()LA6/h;", "httpMethod", "LA6/f;", "p", "httpHeaders", "q", "()Ljava/lang/Boolean;", "sendApqExtensions", "r", "sendDocument", "s", "enableAutoPersistedQueries", "t", "canBeBatched", "LF6/e;", "LF6/e;", "networkInterceptor", "v", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18292b implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a builder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18293c concurrencyInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final I6.b networkTransport;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I6.b subscriptionNetworkTransport;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<F6.a> interceptors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p customScalarAdapters;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final F6.a cacheInterceptor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final F6.a autoPersistedQueryInterceptor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Function1<C18455d<?>, Boolean> retryOnError;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final F6.a retryOnErrorInterceptor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Boolean failFastIfOffline;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<G6.b> listeners;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean sendEnhancedClientAwareness;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final w executionContext;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final h httpMethod;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> httpHeaders;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendApqExtensions;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendDocument;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Boolean enableAutoPersistedQueries;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Boolean canBeBatched;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final e networkInterceptor;

    @Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\bC\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\u00002\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0013J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00002\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010\nJ\u0019\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b)\u0010\nJ\u0019\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b+\u0010\nJ\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010\nJ\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020!¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010!¢\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b8\u0010\nJ\u001b\u0010;\u001a\u00020\u00002\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001c¢\u0006\u0004\b;\u0010 J\u0017\u0010=\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010!¢\u0006\u0004\b=\u00100J-\u0010?\u001a\u00020\u00002\u001e\u0010<\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b¢\u0006\u0004\b?\u0010\u000fJ\u0017\u0010B\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJH\u0010Q\u001a\u00020\u000029\u0010P\u001a5\b\u0001\u0012\u0004\u0012\u00020M\u0012\u0013\u0012\u00110@¢\u0006\f\bN\u0012\b\b\"\u0012\u0004\b\b(O\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010L¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00002\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010S¢\u0006\u0004\bX\u0010VJ\u0015\u0010[\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u001d\u0010_\u001a\u00020\u00002\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u001cH\u0007¢\u0006\u0004\b_\u0010 J\u001b\u0010a\u001a\u00020\u00002\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0004\ba\u0010 J\u0017\u0010d\u001a\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\bd\u0010eJ\u0015\u0010h\u001a\u00020\u00002\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\r\u0010k\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020\u0000¢\u0006\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010pR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00100r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010sR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\bk\u0010s\u001a\u0004\bu\u0010vR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u0002090r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010sR\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010s\u001a\u0004\bx\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020]0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010sR \u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010s\u001a\u0004\bz\u0010vR$\u0010g\u001a\u00020f2\u0006\u0010#\u001a\u00020f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bd\u0010{\u001a\u0004\b|\u0010}R)\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010#\u001a\u0004\u0018\u00010\u00188\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b+\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R5\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\bh\u0010s\u001a\u0005\b\u0081\u0001\u0010vR+\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b\t\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0082\u0001\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R,\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0082\u0001\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001R,\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001R,\u0010T\u001a\u0004\u0018\u00010S2\b\u0010#\u001a\u0004\u0018\u00010S8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010W\u001a\u0004\u0018\u00010S2\b\u0010#\u001a\u0004\u0018\u00010S8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R,\u0010c\u001a\u0004\u0018\u00010b2\b\u0010#\u001a\u0004\u0018\u00010b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0090\u0001\u001a\u0006\b\u008e\u0001\u0010\u0091\u0001R+\u00101\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b|\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u00104\u001a\u0004\u0018\u0001032\b\u0010#\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010<\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0092\u0001\u001a\u0006\b\u0099\u0001\u0010\u0094\u0001R,\u0010A\u001a\u0004\u0018\u00010@2\b\u0010#\u001a\u0004\u0018\u00010@8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R,\u0010E\u001a\u0004\u0018\u00010D2\b\u0010#\u001a\u0004\u0018\u00010D8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R+\u00107\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bx\u0010\u0082\u0001\u001a\u0006\b\u009a\u0001\u0010\u0084\u0001R+\u0010I\u001a\u0004\u0018\u00010H2\b\u0010#\u001a\u0004\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u008e\u0001\u0010P\u001a5\b\u0001\u0012\u0004\u0012\u00020M\u0012\u0013\u0012\u00110@¢\u0006\f\bN\u0012\b\b\"\u0012\u0004\b\b(O\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010L29\u0010#\u001a5\b\u0001\u0012\u0004\u0012\u00020M\u0012\u0013\u0012\u00110@¢\u0006\f\bN\u0012\b\b\"\u0012\u0004\b\b(O\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001RX\u0010ª\u0001\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u001e\u0010#\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bu\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001RR\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0018\u0010#\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@BX\u0087\u000e¢\u0006\u0016\n\u0005\bz\u0010§\u0001\u0012\u0005\b¬\u0001\u0010\u0003\u001a\u0006\b«\u0001\u0010©\u0001R3\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0087\u000e¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u00ad\u0001\u0012\u0005\b°\u0001\u0010\u0003\u001a\u0006\b®\u0001\u0010¯\u0001R3\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0087\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010\u0082\u0001\u0012\u0005\b±\u0001\u0010\u0003\u001a\u0006\b\u0095\u0001\u0010\u0084\u0001R,\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010\u00ad\u0001\u001a\u0006\b\u0087\u0001\u0010¯\u0001R,\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u00ad\u0001\u001a\u0006\b\u0085\u0001\u0010¯\u0001R'\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010'\u001a\u0006\b²\u0001\u0010³\u0001R\u0013\u0010Z\u001a\u00020Y8F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010´\u0001¨\u0006µ\u0001"}, d2 = {"Ly6/b$a;", "", "<init>", "()V", "", "sendEnhancedClientAwareness", "b0", "(Z)Ly6/b$a;", "failFastIfOffline", "k", "(Ljava/lang/Boolean;)Ly6/b$a;", "Lkotlin/Function1;", "Lz6/d;", "retryOnError", "X", "(Lkotlin/jvm/functions/Function1;)Ly6/b$a;", "LF6/a;", "retryOnErrorInterceptor", "Y", "(LF6/a;)Ly6/b$a;", "cacheInterceptor", "d", "autoPersistedQueryInterceptor", "b", "LA6/h;", "httpMethod", "S", "(LA6/h;)Ly6/b$a;", "", "LA6/f;", "httpHeaders", "Q", "(Ljava/util/List;)Ly6/b$a;", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Ly6/b$a;", "sendApqExtensions", "Z", "sendDocument", "a0", "enableAutoPersistedQueries", "i", "canBeBatched", "e", "serverUrl", "c0", "(Ljava/lang/String;)Ly6/b$a;", "httpServerUrl", "T", "LJ6/c;", "httpEngine", "O", "(LJ6/c;)Ly6/b$a;", "httpExposeErrorBody", "P", "LJ6/e;", "httpInterceptors", "R", "webSocketServerUrl", "h0", "Lkotlin/coroutines/Continuation;", "i0", "", "webSocketIdleTimeoutMillis", "f0", "(Ljava/lang/Long;)Ly6/b$a;", "LK6/j$a;", "wsProtocolFactory", "j0", "(LK6/j$a;)Ly6/b$a;", "LK6/g;", "webSocketEngine", "e0", "(LK6/g;)Ly6/b$a;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "attempt", "webSocketReopenWhen", "g0", "(Lkotlin/jvm/functions/Function3;)Ly6/b$a;", "LI6/b;", "networkTransport", "W", "(LI6/b;)Ly6/b$a;", "subscriptionNetworkTransport", "d0", "Lz6/p;", "customScalarAdapters", "g", "(Lz6/p;)Ly6/b$a;", "LG6/b;", "listeners", "V", "interceptors", "U", "Lmv/K;", "dispatcher", "h", "(Lmv/K;)Ly6/b$a;", "Lz6/w;", "executionContext", "j", "(Lz6/w;)Ly6/b$a;", "Ly6/b;", "c", "()Ly6/b;", "f", "()Ly6/b$a;", "Lz6/p$a;", "Lz6/p$a;", "_customScalarAdaptersBuilder", "", "Ljava/util/List;", "_interceptors", "z", "()Ljava/util/List;", "_httpInterceptors", "w", "_listeners", "A", "Lz6/w;", "r", "()Lz6/w;", "LA6/h;", "x", "()LA6/h;", "v", "Ljava/lang/Boolean;", "E", "()Ljava/lang/Boolean;", "l", "F", "m", "q", "n", "o", "LI6/b;", "B", "()LI6/b;", "p", "H", "Lmv/K;", "()Lmv/K;", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "s", "LJ6/c;", "t", "()LJ6/c;", "M", "u", "Ljava/lang/Long;", "J", "()Ljava/lang/Long;", "LK6/j$a;", "N", "()LK6/j$a;", "LK6/g;", "I", "()LK6/g;", "Lkotlin/jvm/functions/Function3;", "L", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "K", "()Lkotlin/jvm/functions/Function1;", "webSocketReopenServerUrl", "C", "getRetryOnError$annotations", "LF6/a;", "D", "()LF6/a;", "getRetryOnErrorInterceptor$annotations", "getFailFastIfOffline$annotations", "G", "()Z", "()Lz6/p;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.b$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private Function1<? super C18455d<?>, Boolean> retryOnError;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private F6.a retryOnErrorInterceptor;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private Boolean failFastIfOffline;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private F6.a cacheInterceptor;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private F6.a autoPersistedQueryInterceptor;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private boolean sendEnhancedClientAwareness;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p.a _customScalarAdaptersBuilder = new p.a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<F6.a> _interceptors;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<F6.a> interceptors;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<J6.e> _httpInterceptors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<J6.e> httpInterceptors;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<G6.b> _listeners;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final List<G6.b> listeners;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private w executionContext;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private h httpMethod;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> httpHeaders;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Boolean sendApqExtensions;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Boolean sendDocument;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Boolean enableAutoPersistedQueries;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Boolean canBeBatched;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private I6.b networkTransport;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private I6.b subscriptionNetworkTransport;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K dispatcher;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private String httpServerUrl;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private J6.c httpEngine;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private String webSocketServerUrl;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private Long webSocketIdleTimeoutMillis;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private j.a wsProtocolFactory;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private Boolean httpExposeErrorBody;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private g webSocketEngine;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> webSocketReopenWhen;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Continuation<? super String>, ? extends Object> webSocketReopenServerUrl;

        public final List<G6.b> A() {
            return this.listeners;
        }

        /* renamed from: B, reason: from getter */
        public final I6.b getNetworkTransport() {
            return this.networkTransport;
        }

        public final Function1<C18455d<?>, Boolean> C() {
            return this.retryOnError;
        }

        /* renamed from: D, reason: from getter */
        public final F6.a getRetryOnErrorInterceptor() {
            return this.retryOnErrorInterceptor;
        }

        /* renamed from: E, reason: from getter */
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        /* renamed from: F, reason: from getter */
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        /* renamed from: G, reason: from getter */
        public final boolean getSendEnhancedClientAwareness() {
            return this.sendEnhancedClientAwareness;
        }

        /* renamed from: H, reason: from getter */
        public final I6.b getSubscriptionNetworkTransport() {
            return this.subscriptionNetworkTransport;
        }

        /* renamed from: I, reason: from getter */
        public final g getWebSocketEngine() {
            return this.webSocketEngine;
        }

        /* renamed from: J, reason: from getter */
        public final Long getWebSocketIdleTimeoutMillis() {
            return this.webSocketIdleTimeoutMillis;
        }

        public final Function1<Continuation<? super String>, Object> K() {
            return this.webSocketReopenServerUrl;
        }

        public final Function3<Throwable, Long, Continuation<? super Boolean>, Object> L() {
            return this.webSocketReopenWhen;
        }

        /* renamed from: M, reason: from getter */
        public final String getWebSocketServerUrl() {
            return this.webSocketServerUrl;
        }

        /* renamed from: N, reason: from getter */
        public final j.a getWsProtocolFactory() {
            return this.wsProtocolFactory;
        }

        public final a O(J6.c httpEngine) {
            this.httpEngine = httpEngine;
            return this;
        }

        public final a P(Boolean httpExposeErrorBody) {
            this.httpExposeErrorBody = httpExposeErrorBody;
            return this;
        }

        public a Q(List<HttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        public final a R(List<? extends J6.e> httpInterceptors) {
            Intrinsics.j(httpInterceptors, "httpInterceptors");
            this._httpInterceptors.clear();
            this._httpInterceptors.addAll(httpInterceptors);
            return this;
        }

        public a S(h httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public final a T(String httpServerUrl) {
            this.httpServerUrl = httpServerUrl;
            return this;
        }

        public final a U(List<? extends F6.a> interceptors) {
            Intrinsics.j(interceptors, "interceptors");
            this._interceptors.clear();
            CollectionsKt.C(this._interceptors, interceptors);
            return this;
        }

        public final a V(List<? extends G6.b> listeners) {
            Intrinsics.j(listeners, "listeners");
            this._listeners.clear();
            this._listeners.addAll(listeners);
            return this;
        }

        public final a W(I6.b networkTransport) {
            this.networkTransport = networkTransport;
            return this;
        }

        public final a X(Function1<? super C18455d<?>, Boolean> retryOnError) {
            this.retryOnError = retryOnError;
            return this;
        }

        public final a Y(F6.a retryOnErrorInterceptor) {
            this.retryOnErrorInterceptor = retryOnErrorInterceptor;
            return this;
        }

        public a Z(Boolean sendApqExtensions) {
            this.sendApqExtensions = sendApqExtensions;
            return this;
        }

        public a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            List<HttpHeader> listV = v();
            if (listV == null) {
                listV = CollectionsKt.m();
            }
            this.httpHeaders = CollectionsKt.Q0(listV, new HttpHeader(name, value));
            return this;
        }

        public a a0(Boolean sendDocument) {
            this.sendDocument = sendDocument;
            return this;
        }

        public final a b(F6.a autoPersistedQueryInterceptor) {
            this.autoPersistedQueryInterceptor = autoPersistedQueryInterceptor;
            return this;
        }

        public final a b0(boolean sendEnhancedClientAwareness) {
            this.sendEnhancedClientAwareness = sendEnhancedClientAwareness;
            return this;
        }

        public final C18292b c() {
            return new C18292b(f(), null);
        }

        public final a c0(String serverUrl) {
            Intrinsics.j(serverUrl, "serverUrl");
            this.httpServerUrl = serverUrl;
            return this;
        }

        public final a d(F6.a cacheInterceptor) {
            this.cacheInterceptor = cacheInterceptor;
            return this;
        }

        public final a d0(I6.b subscriptionNetworkTransport) {
            this.subscriptionNetworkTransport = subscriptionNetworkTransport;
            return this;
        }

        public a e(Boolean canBeBatched) {
            this.canBeBatched = canBeBatched;
            return this;
        }

        public final a e0(g webSocketEngine) {
            this.webSocketEngine = webSocketEngine;
            return this;
        }

        public final a f() {
            return new a().g(this._customScalarAdaptersBuilder.b()).U(this.interceptors).h(this.dispatcher).j(getExecutionContext()).S(getHttpMethod()).Q(v()).T(this.httpServerUrl).O(this.httpEngine).P(this.httpExposeErrorBody).R(this.httpInterceptors).Z(getSendApqExtensions()).a0(getSendDocument()).i(getEnableAutoPersistedQueries()).e(getCanBeBatched()).W(this.networkTransport).d0(this.subscriptionNetworkTransport).h0(this.webSocketServerUrl).i0(this.webSocketReopenServerUrl).e0(this.webSocketEngine).g0(this.webSocketReopenWhen).f0(this.webSocketIdleTimeoutMillis).j0(this.wsProtocolFactory).X(this.retryOnError).Y(this.retryOnErrorInterceptor).d(this.cacheInterceptor).b(this.autoPersistedQueryInterceptor).k(this.failFastIfOffline).V(this.listeners).b0(this.sendEnhancedClientAwareness);
        }

        public final a f0(Long webSocketIdleTimeoutMillis) {
            this.webSocketIdleTimeoutMillis = webSocketIdleTimeoutMillis;
            return this;
        }

        public final a g(p customScalarAdapters) {
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            this._customScalarAdaptersBuilder.c();
            this._customScalarAdaptersBuilder.a(customScalarAdapters);
            return this;
        }

        public final a g0(Function3<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> webSocketReopenWhen) {
            this.webSocketReopenWhen = webSocketReopenWhen;
            return this;
        }

        public final a h(AbstractC15779K dispatcher) {
            this.dispatcher = dispatcher;
            return this;
        }

        public final a h0(String webSocketServerUrl) {
            this.webSocketServerUrl = webSocketServerUrl;
            return this;
        }

        public a i(Boolean enableAutoPersistedQueries) {
            this.enableAutoPersistedQueries = enableAutoPersistedQueries;
            return this;
        }

        public final a i0(Function1<? super Continuation<? super String>, ? extends Object> webSocketServerUrl) {
            this.webSocketReopenServerUrl = webSocketServerUrl;
            return this;
        }

        public final a j(w executionContext) {
            Intrinsics.j(executionContext, "executionContext");
            this.executionContext = executionContext;
            return this;
        }

        public final a j0(j.a wsProtocolFactory) {
            this.wsProtocolFactory = wsProtocolFactory;
            return this;
        }

        public final a k(Boolean failFastIfOffline) {
            this.failFastIfOffline = failFastIfOffline;
            return this;
        }

        /* renamed from: l, reason: from getter */
        public final F6.a getAutoPersistedQueryInterceptor() {
            return this.autoPersistedQueryInterceptor;
        }

        /* renamed from: m, reason: from getter */
        public final F6.a getCacheInterceptor() {
            return this.cacheInterceptor;
        }

        /* renamed from: n, reason: from getter */
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        public final p o() {
            return this._customScalarAdaptersBuilder.b();
        }

        /* renamed from: p, reason: from getter */
        public final AbstractC15779K getDispatcher() {
            return this.dispatcher;
        }

        /* renamed from: q, reason: from getter */
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        /* renamed from: r, reason: from getter */
        public w getExecutionContext() {
            return this.executionContext;
        }

        /* renamed from: s, reason: from getter */
        public final Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        /* renamed from: t, reason: from getter */
        public final J6.c getHttpEngine() {
            return this.httpEngine;
        }

        /* renamed from: u, reason: from getter */
        public final Boolean getHttpExposeErrorBody() {
            return this.httpExposeErrorBody;
        }

        public List<HttpHeader> v() {
            return this.httpHeaders;
        }

        public final List<J6.e> w() {
            return this.httpInterceptors;
        }

        /* renamed from: x, reason: from getter */
        public h getHttpMethod() {
            return this.httpMethod;
        }

        /* renamed from: y, reason: from getter */
        public final String getHttpServerUrl() {
            return this.httpServerUrl;
        }

        public final List<F6.a> z() {
            return this.interceptors;
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this._interceptors = arrayList;
            this.interceptors = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this._httpInterceptors = arrayList2;
            this.httpInterceptors = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this._listeners = arrayList3;
            this.listeners = arrayList3;
            this.executionContext = w.f172509b;
            this.sendEnhancedClientAwareness = true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz6/A$a;", "D", "Lz6/e;", "response", "", "<anonymous>", "(Lz6/e;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.ApolloClient$apolloResponses$1$1", f = "ApolloClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: y6.b$c */
    static final class c<D> extends SuspendLambda implements Function2<C18456e<D>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171285a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f171286b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f171286b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18456e<D> c18456e, Continuation<? super Unit> continuation) {
            return ((c) create(c18456e, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f171285a == 0) {
                ResultKt.b(obj);
                ApolloException apolloException = ((C18456e) this.f171286b).exception;
                if (apolloException == null) {
                    return Unit.f143329a;
                }
                Intrinsics.g(apolloException);
                throw apolloException;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz6/A$a;", "D", "Lov/t;", "Lz6/e;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", l = {262}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: y6.b$d */
    static final class d<D> extends SuspendLambda implements Function2<t<? super C18456e<D>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171287a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f171288b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18455d<D> f171290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f171291e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", l = {263}, m = "invokeSuspend")
        /* renamed from: y6.b$d$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f171292a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C18292b f171293b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18455d<D> f171294c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f171295d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ t<C18456e<D>> f171296e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: y6.b$d$a$a, reason: collision with other inner class name */
            static final class C2758a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ t<C18456e<D>> f171297a;

                /* JADX WARN: Multi-variable type inference failed */
                C2758a(t<? super C18456e<D>> tVar) {
                    this.f171297a = tVar;
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(C18456e<D> c18456e, Continuation<? super Unit> continuation) {
                    Object objR = this.f171297a.r(c18456e, continuation);
                    return objR == IntrinsicsKt.f() ? objR : Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C18292b c18292b, C18455d<D> c18455d, boolean z10, t<? super C18456e<D>> tVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f171293b = c18292b;
                this.f171294c = c18455d;
                this.f171295d = z10;
                this.f171296e = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f171293b, this.f171294c, this.f171295d, this.f171296e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f171292a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16561f interfaceC16561fC = this.f171293b.c(this.f171294c, this.f171295d);
                    C2758a c2758a = new C2758a(this.f171296e);
                    this.f171292a = 1;
                    if (interfaceC16561fC.collect(c2758a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C18455d<D> c18455d, boolean z10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f171290d = c18455d;
            this.f171291e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C18292b.this.new d(this.f171290d, this.f171291e, continuation);
            dVar.f171288b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super C18456e<D>> tVar, Continuation<? super Unit> continuation) {
            return ((d) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171287a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    t tVar = (t) this.f171288b;
                    List list = C18292b.this.listeners;
                    C18455d<D> c18455d = this.f171290d;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((G6.b) it.next()).b(c18455d);
                    }
                    AbstractC15779K dispatcher = C18292b.this.concurrencyInfo.getDispatcher();
                    a aVar = new a(C18292b.this, this.f171290d, this.f171291e, tVar, null);
                    this.f171287a = 1;
                    if (C15805i.g(dispatcher, aVar, this) == objF) {
                        return objF;
                    }
                }
                List list2 = C18292b.this.listeners;
                C18455d<D> c18455d2 = this.f171290d;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((G6.b) it2.next()).a(c18455d2);
                }
                return Unit.f143329a;
            } catch (Throwable th2) {
                List list3 = C18292b.this.listeners;
                C18455d<D> c18455d3 = this.f171290d;
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    ((G6.b) it3.next()).a(c18455d3);
                }
                throw th2;
            }
        }
    }

    public /* synthetic */ C18292b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private C18292b(a aVar) {
        I6.b bVarA;
        I6.b bVarA2;
        this.builder = aVar;
        this.interceptors = aVar.z();
        this.customScalarAdapters = aVar.o();
        this.cacheInterceptor = aVar.getCacheInterceptor();
        this.autoPersistedQueryInterceptor = aVar.getAutoPersistedQueryInterceptor();
        this.retryOnError = aVar.C();
        this.retryOnErrorInterceptor = aVar.getRetryOnErrorInterceptor();
        this.failFastIfOffline = aVar.getFailFastIfOffline();
        this.listeners = aVar.A();
        this.sendEnhancedClientAwareness = aVar.getSendEnhancedClientAwareness();
        this.executionContext = aVar.getExecutionContext();
        this.httpMethod = aVar.getHttpMethod();
        this.httpHeaders = aVar.v();
        this.sendApqExtensions = aVar.getSendApqExtensions();
        this.sendDocument = aVar.getSendDocument();
        this.enableAutoPersistedQueries = aVar.getEnableAutoPersistedQueries();
        this.canBeBatched = aVar.getCanBeBatched();
        if (aVar.getNetworkTransport() != null) {
            if (aVar.getHttpServerUrl() != null) {
                throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set. Configure httpServerUrl on the networkTransport directly.");
            }
            if (aVar.getHttpEngine() != null) {
                throw new IllegalStateException("Apollo: 'httpEngine' or 'okHttpClient' has no effect if 'networkTransport' is set. Configure httpEngine on the networkTransport directly.");
            }
            if (!aVar.w().isEmpty()) {
                throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set. Configure the interceptors on the networkTransport directly.");
            }
            if (aVar.getHttpExposeErrorBody() != null) {
                throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set. Configure httpExposeErrorBody on the networkTransport directly.");
            }
            bVarA = aVar.getNetworkTransport();
            Intrinsics.g(bVarA);
        } else {
            if (aVar.getHttpServerUrl() == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required");
            }
            g.a aVar2 = new g.a();
            String httpServerUrl = aVar.getHttpServerUrl();
            Intrinsics.g(httpServerUrl);
            g.a aVarE = aVar2.e(httpServerUrl);
            if (aVar.getHttpEngine() != null) {
                J6.c httpEngine = aVar.getHttpEngine();
                Intrinsics.g(httpEngine);
                aVarE.c(httpEngine);
            }
            if (aVar.getHttpExposeErrorBody() != null) {
                Boolean httpExposeErrorBody = aVar.getHttpExposeErrorBody();
                Intrinsics.g(httpExposeErrorBody);
                aVarE.b(httpExposeErrorBody.booleanValue());
            }
            bVarA = aVarE.d(aVar.w()).a();
        }
        this.networkTransport = bVarA;
        if (aVar.getSubscriptionNetworkTransport() == null) {
            String webSocketServerUrl = aVar.getWebSocketServerUrl();
            webSocketServerUrl = webSocketServerUrl == null ? aVar.getHttpServerUrl() : webSocketServerUrl;
            if (webSocketServerUrl == null) {
                bVarA2 = bVarA;
            } else {
                h.b bVarE = new h.b().e(webSocketServerUrl);
                if (aVar.getWebSocketEngine() != null) {
                    K6.g webSocketEngine = aVar.getWebSocketEngine();
                    Intrinsics.g(webSocketEngine);
                    bVarE.g(webSocketEngine);
                }
                if (aVar.getWebSocketIdleTimeoutMillis() != null) {
                    Long webSocketIdleTimeoutMillis = aVar.getWebSocketIdleTimeoutMillis();
                    Intrinsics.g(webSocketIdleTimeoutMillis);
                    bVarE.b(webSocketIdleTimeoutMillis.longValue());
                }
                if (aVar.getWsProtocolFactory() != null) {
                    j.a wsProtocolFactory = aVar.getWsProtocolFactory();
                    Intrinsics.g(wsProtocolFactory);
                    bVarE.c(wsProtocolFactory);
                }
                if (aVar.L() != null) {
                    bVarE.d(aVar.L());
                }
                if (aVar.K() != null) {
                    bVarE.f(aVar.K());
                }
                bVarA2 = bVarE.a();
            }
        } else {
            if (aVar.getWebSocketServerUrl() != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketServerUrl on the subscriptionNetworkTransport directly.");
            }
            if (aVar.getWebSocketEngine() != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' or 'okHttpClient' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketEngine on the subscriptionNetworkTransport directly.");
            }
            if (aVar.getWebSocketIdleTimeoutMillis() != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketIdleTimeoutMillis on the subscriptionNetworkTransport directly.");
            }
            if (aVar.getWsProtocolFactory() != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set. Configure wsProtocolFactory on the subscriptionNetworkTransport directly.");
            }
            if (aVar.L() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketReopenWhen on the subscriptionNetworkTransport directly.");
            }
            if (aVar.K() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set. Configure webSocketReopenServerUrl on the subscriptionNetworkTransport directly.");
            }
            bVarA2 = aVar.getSubscriptionNetworkTransport();
            Intrinsics.g(bVarA2);
        }
        this.subscriptionNetworkTransport = bVarA2;
        AbstractC15779K dispatcher = aVar.getDispatcher();
        dispatcher = dispatcher == null ? G6.e.a() : dispatcher;
        this.concurrencyInfo = new C18293c(dispatcher, C15784P.a(dispatcher));
        this.networkInterceptor = new e(bVarA, bVarA2);
    }

    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> c(C18455d<D> apolloRequest, boolean throwing) {
        Intrinsics.j(apolloRequest, "apolloRequest");
        C18455d.a<D> aVarM = apolloRequest.m();
        aVarM.e(this.concurrencyInfo.f(this.customScalarAdapters).f(getExecutionContext()).f(aVarM.getExecutionContext()));
        A6.h httpMethod = aVarM.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = getHttpMethod();
        }
        aVarM.r(httpMethod);
        Boolean sendApqExtensions = aVarM.getSendApqExtensions();
        if (sendApqExtensions == null) {
            sendApqExtensions = getSendApqExtensions();
        }
        aVarM.v(sendApqExtensions);
        Boolean sendDocument = aVarM.getSendDocument();
        if (sendDocument == null) {
            sendDocument = getSendDocument();
        }
        aVarM.w(sendDocument);
        Boolean enableAutoPersistedQueries = aVarM.getEnableAutoPersistedQueries();
        if (enableAutoPersistedQueries == null) {
            enableAutoPersistedQueries = getEnableAutoPersistedQueries();
        }
        aVarM.d(enableAutoPersistedQueries);
        List listC = CollectionsKt.c();
        if (!Intrinsics.e(aVarM.getIgnoreApolloClientHttpHeaders(), Boolean.TRUE)) {
            List<HttpHeader> listJ = j();
            if (listJ == null) {
                listJ = CollectionsKt.m();
            }
            listC.addAll(listJ);
        }
        List<HttpHeader> listK = aVarM.k();
        if (listK == null) {
            listK = CollectionsKt.m();
        }
        listC.addAll(listK);
        aVarM.q(CollectionsKt.a(listC));
        Boolean canBeBatched = aVarM.getCanBeBatched();
        if (canBeBatched == null) {
            canBeBatched = getCanBeBatched();
        }
        if (canBeBatched != null) {
            aVarM.a("X-APOLLO-CAN-BE-BATCHED", canBeBatched.toString());
        }
        Boolean retryOnError = aVarM.getRetryOnError();
        if (retryOnError == null) {
            Function1<C18455d<?>, Boolean> function1 = this.retryOnError;
            retryOnError = function1 != null ? function1.invoke(apolloRequest) : null;
        }
        aVarM.u(retryOnError);
        Boolean failFastIfOffline = aVarM.getFailFastIfOffline();
        if (failFastIfOffline == null) {
            failFastIfOffline = this.failFastIfOffline;
        }
        aVarM.f(failFastIfOffline);
        aVarM.x(this.sendEnhancedClientAwareness);
        C18455d<D> c18455dB = aVarM.b();
        List listC2 = CollectionsKt.c();
        listC2.addAll(this.interceptors);
        F6.a aVar = this.cacheInterceptor;
        if (aVar != null) {
            listC2.add(aVar);
        }
        F6.a aVar2 = this.autoPersistedQueryInterceptor;
        if (aVar2 != null) {
            listC2.add(aVar2);
        }
        F6.a aVarA = this.retryOnErrorInterceptor;
        if (aVarA == null) {
            aVarA = F6.g.a();
        }
        listC2.add(aVarA);
        listC2.add(this.networkInterceptor);
        InterfaceC16561f<C18456e<D>> interfaceC16561fA = new F6.c(CollectionsKt.a(listC2), 0).a(c18455dB);
        return throwing ? C16563h.O(interfaceC16561fA, new c(null)) : interfaceC16561fA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C15784P.f(this.concurrencyInfo.getCoroutineScope(), null, 1, null);
        this.networkTransport.dispose();
        this.subscriptionNetworkTransport.dispose();
    }

    public final <D extends InterfaceC18449A.a> InterfaceC16561f<C18456e<D>> d(C18455d<D> apolloRequest, boolean throwing) {
        Intrinsics.j(apolloRequest, "apolloRequest");
        return C16568m.b(C16563h.H(C16563h.i(new d(apolloRequest, throwing, null)), C15800f0.d()), a.e.API_PRIORITY_OTHER, null, 2, null);
    }

    /* renamed from: g, reason: from getter */
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    /* renamed from: h, reason: from getter */
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    /* renamed from: i, reason: from getter */
    public w getExecutionContext() {
        return this.executionContext;
    }

    public List<HttpHeader> j() {
        return this.httpHeaders;
    }

    /* renamed from: l, reason: from getter */
    public A6.h getHttpMethod() {
        return this.httpMethod;
    }

    /* renamed from: m, reason: from getter */
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    /* renamed from: p, reason: from getter */
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    public final a u() {
        return this.builder.f();
    }

    public final <D> C18291a<D> w(E<D> query) {
        Intrinsics.j(query, "query");
        return new C18291a<>(this, query);
    }
}

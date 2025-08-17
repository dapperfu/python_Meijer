package hw;

import Qv.r;
import Qv.u;
import Vv.o;
import hw.k;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kw.C15331h;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.m;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0005<A5;CBI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001d¢\u0006\u0004\b3\u0010\u001fJ\u0017\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020+H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u00109J\u0017\u0010<\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u00109J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020+H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00142\u0006\u00104\u001a\u00020+H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\bE\u0010FJ'\u0010H\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010+2\u0006\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0014H\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u001dH\u0000¢\u0006\u0004\bL\u0010\u001fJ/\u0010P\u001a\u00020\u001d2\n\u0010;\u001a\u00060Mj\u0002`N2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010O\u001a\u00020\u0014¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010RR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010WR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010XR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010WR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010WR\u0014\u0010Z\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010YR$\u0010b\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010YR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00170v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010xR\u0016\u0010{\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010WR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010|R\u0016\u0010\u007f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010~R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010YR\u0018\u0010\u0082\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R\u0018\u0010\u0084\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u0017\u0010\u0085\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010~R\u0018\u0010\u0087\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010~R\u0017\u0010\u0088\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010|¨\u0006\u008a\u0001"}, d2 = {"Lhw/h;", "Lokhttp3/m;", "Lhw/k$a;", "", "LUv/d;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "LQv/u;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lhw/i;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(LUv/d;Lokhttp3/Request;LQv/u;Ljava/util/Random;JLhw/i;JJ)V", "", "B", "(Lhw/i;)Z", "Lkw/h;", "data", "", "formatOpcode", "E", "(Lkw/h;I)Z", "", "D", "()V", "q", "Lokhttp3/OkHttpClient;", "client", "t", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "LVv/i;", "exchange", "r", "(Lokhttp3/Response;LVv/i;)V", "", "name", "Lhw/h$d;", "streams", "z", "(Ljava/lang/String;Lhw/h$d;)V", "C", "(Lokhttp3/Response;)V", "x", "text", "d", "(Ljava/lang/String;)V", "bytes", "g", "(Lkw/h;)V", "payload", "e", "c", "code", "reason", "h", "(ILjava/lang/String;)V", "a", "(Ljava/lang/String;)Z", "b", "(Lkw/h;)Z", "f", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "s", "(ILjava/lang/String;J)Z", "G", "()Z", "H", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isWriter", "u", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "Lokhttp3/Request;", "LQv/u;", "getListener$okhttp", "()LQv/u;", "Ljava/util/Random;", "J", "Lhw/i;", "Ljava/lang/String;", "key", "Lokhttp3/d;", "i", "Lokhttp3/d;", "getCall$okhttp", "()Lokhttp3/d;", "setCall$okhttp", "(Lokhttp3/d;)V", "call", "LUv/a;", "j", "LUv/a;", "writerTask", "Lhw/k;", "k", "Lhw/k;", "reader", "Lhw/l;", "l", "Lhw/l;", "writer", "LUv/c;", "m", "LUv/c;", "taskQueue", "n", "o", "Lhw/h$d;", "Ljava/util/ArrayDeque;", "p", "Ljava/util/ArrayDeque;", "pongQueue", "messageAndCloseQueue", "queueSize", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "v", "failed", "w", "sentPingCount", "receivedPingCount", "y", "receivedPongCount", "awaitingPong", "A", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class h implements m, k.a {

    /* renamed from: B, reason: collision with root package name */
    private static final List<r> f136422B = CollectionsKt.e(r.f31479d);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request originalRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long pingIntervalMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private WebSocketExtensions extensions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minimumDeflateSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long webSocketCloseTimeout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private okhttp3.d call;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Uv.a writerTask;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private k reader;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private l writer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Uv.c taskQueue;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private d streams;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<C15331h> pongQueue;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Object> messageAndCloseQueue;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long queueSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enqueuedClose;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int receivedCloseCode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String receivedCloseReason;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean failed;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int sentPingCount;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int receivedPingCount;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int receivedPongCount;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean awaitingPong;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhw/h$a;", "", "", "code", "Lkw/h;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILkw/h;J)V", "a", "I", "b", "()I", "Lkw/h;", "c", "()Lkw/h;", "J", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C15331h reason;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long cancelAfterCloseMillis;

        /* renamed from: a, reason: from getter */
        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        /* renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: c, reason: from getter */
        public final C15331h getReason() {
            return this.reason;
        }

        public a(int i10, C15331h c15331h, long j10) {
            this.code = i10;
            this.reason = c15331h;
            this.cancelAfterCloseMillis = j10;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lhw/h$c;", "", "", "formatOpcode", "Lkw/h;", "data", "<init>", "(ILkw/h;)V", "a", "I", "b", "()I", "Lkw/h;", "()Lkw/h;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int formatOpcode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C15331h data;

        public c(int i10, C15331h data) {
            Intrinsics.j(data, "data");
            this.formatOpcode = i10;
            this.data = data;
        }

        /* renamed from: a, reason: from getter */
        public final C15331h getData() {
            return this.data;
        }

        /* renamed from: b, reason: from getter */
        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhw/h$d;", "Ljava/io/Closeable;", "", "client", "Lkw/g;", "source", "Lkw/f;", "sink", "<init>", "(ZLkw/g;Lkw/f;)V", "", "a", "()V", "Z", "b", "()Z", "Lkw/g;", "d", "()Lkw/g;", "c", "Lkw/f;", "()Lkw/f;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15330g source;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15329f sink;

        public abstract void a();

        public d(boolean z10, InterfaceC15330g source, InterfaceC15329f sink) {
            Intrinsics.j(source, "source");
            Intrinsics.j(sink, "sink");
            this.client = z10;
            this.source = source;
            this.sink = sink;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        /* renamed from: c, reason: from getter */
        public final InterfaceC15329f getSink() {
            return this.sink;
        }

        /* renamed from: d, reason: from getter */
        public final InterfaceC15330g getSource() {
            return this.source;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhw/h$e;", "LUv/a;", "<init>", "(Lhw/h;)V", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class e extends Uv.a {
        public e() {
            super(h.this.name + " writer", false, 2, null);
        }

        @Override // Uv.a
        public long f() throws IOException {
            try {
                return h.this.G() ? 0L : -1L;
            } catch (IOException e10) {
                h.v(h.this, e10, null, true, 2, null);
                return -1L;
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"hw/h$f", "LQv/b;", "Lokhttp3/d;", "call", "Lokhttp3/Response;", "response", "", "onResponse", "(Lokhttp3/d;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/d;Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements Qv.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Request f136459b;

        f(Request request) {
            this.f136459b = request;
        }

        @Override // Qv.b
        public void onFailure(okhttp3.d call, IOException e10) throws IOException {
            Intrinsics.j(call, "call");
            Intrinsics.j(e10, "e");
            h.v(h.this, e10, null, false, 6, null);
        }

        @Override // Qv.b
        public void onResponse(okhttp3.d call, Response response) throws Throwable {
            Intrinsics.j(call, "call");
            Intrinsics.j(response, "response");
            Vv.i exchange = response.getExchange();
            try {
                h.this.r(response, exchange);
                Intrinsics.g(exchange);
                d dVarP = exchange.p();
                WebSocketExtensions iVarA = WebSocketExtensions.INSTANCE.a(response.getHeaders());
                h.this.extensions = iVarA;
                if (!h.this.B(iVarA)) {
                    h hVar = h.this;
                    synchronized (hVar) {
                        hVar.messageAndCloseQueue.clear();
                        hVar.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                h.this.z(Rv.k.f33048c + " WebSocket " + this.f136459b.getUrl().v(), dVarP);
                h.this.C(response);
            } catch (IOException e10) {
                h.v(h.this, e10, response, false, 4, null);
                Rv.h.f(response);
                if (exchange != null) {
                    exchange.x();
                }
            }
        }
    }

    private final synchronized boolean E(C15331h data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.V() > 16777216) {
                f(1001, null);
                return false;
            }
            this.queueSize += data.V();
            this.messageAndCloseQueue.add(new c(formatOpcode, data));
            D();
            return true;
        }
        return false;
    }

    public final void H() throws IOException {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                l lVar = this.writer;
                if (lVar == null) {
                    return;
                }
                int i10 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                Unit unit = Unit.f142422a;
                if (i10 == -1) {
                    try {
                        lVar.d(C15331h.f148095e);
                        return;
                    } catch (IOException e10) {
                        v(this, e10, null, true, 2, null);
                        return;
                    }
                }
                v(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null, true, 2, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hw.k.a
    public synchronized void c(C15331h payload) {
        Intrinsics.j(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // hw.k.a
    public synchronized void e(C15331h payload) {
        try {
            Intrinsics.j(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                D();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    public final synchronized boolean s(int code, String reason, long cancelAfterCloseMillis) {
        C15331h c15331hD;
        try {
            j.f136467a.c(code);
            if (reason != null) {
                c15331hD = C15331h.INSTANCE.d(reason);
                if (c15331hD.V() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
                }
            } else {
                c15331hD = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new a(code, c15331hD, cancelAfterCloseMillis));
                D();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void x() throws IOException {
        boolean z10;
        int i10;
        String str;
        k kVar;
        d dVar;
        synchronized (this) {
            try {
                z10 = this.failed;
                i10 = this.receivedCloseCode;
                str = this.receivedCloseReason;
                kVar = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    final l lVar = this.writer;
                    if (lVar != null) {
                        this.writer = null;
                        Uv.c.d(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: hw.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return h.y(lVar);
                            }
                        }, 2, null);
                    }
                    this.taskQueue.q();
                }
                dVar = this.writer == null ? this.streams : null;
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 && dVar != null && this.receivedCloseCode != -1) {
            u uVar = this.listener;
            Intrinsics.g(str);
            uVar.a(this, i10, str);
        }
        if (kVar != null) {
            Rv.h.f(kVar);
        }
        if (dVar != null) {
            Rv.h.f(dVar);
        }
    }

    public h(Uv.d taskRunner, Request originalRequest, u listener, Random random, long j10, WebSocketExtensions iVar, long j11, long j12) {
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(originalRequest, "originalRequest");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = iVar;
        this.minimumDeflateSize = j11;
        this.webSocketCloseTimeout = j12;
        this.taskQueue = taskRunner.k();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.e("GET", originalRequest.getMethod())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.getMethod()).toString());
        }
        C15331h.Companion companion = C15331h.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f142422a;
        this.key = C15331h.Companion.g(companion, bArr, 0, 0, 3, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B(WebSocketExtensions iVar) {
        if (!iVar.unknownValues && iVar.clientMaxWindowBits == null) {
            return iVar.serverMaxWindowBits == null || new IntRange(8, 15).p(iVar.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void D() {
        if (!Rv.k.f33047b || Thread.holdsLock(this)) {
            Uv.a aVar = this.writerTask;
            if (aVar != null) {
                Uv.c.m(this.taskQueue, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public static /* synthetic */ void v(h hVar, Exception exc, Response response, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            response = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        hVar.u(exc, response, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit w(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) throws IOException {
        Rv.h.f((Closeable) objectRef.f142835a);
        d dVar = (d) objectRef2.f142835a;
        if (dVar != null) {
            Rv.h.f(dVar);
        }
        return Unit.f142422a;
    }

    public final void C(Response response) throws IOException {
        Intrinsics.j(response, "response");
        try {
            try {
                this.listener.f(this, response);
                while (this.receivedCloseCode == -1) {
                    k kVar = this.reader;
                    Intrinsics.g(kVar);
                    kVar.a();
                }
            } catch (Exception e10) {
                v(this, e10, null, false, 6, null);
                x();
            }
        } finally {
            x();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {all -> 0x0091, blocks: (B:34:0x0088, B:37:0x0093, B:39:0x0097, B:40:0x00a7, B:42:0x00b6, B:45:0x00b9, B:46:0x00ba, B:47:0x00bb, B:49:0x00bf, B:51:0x00d1, B:58:0x00e5, B:59:0x00ea, B:41:0x00a8), top: B:67:0x0086, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:34:0x0088, B:37:0x0093, B:39:0x0097, B:40:0x00a7, B:42:0x00b6, B:45:0x00b9, B:46:0x00ba, B:47:0x00bb, B:49:0x00bf, B:51:0x00d1, B:58:0x00e5, B:59:0x00ea, B:41:0x00a8), top: B:67:0x0086, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hw.h.G():boolean");
    }

    @Override // okhttp3.m
    public boolean a(String text) {
        Intrinsics.j(text, "text");
        return E(C15331h.INSTANCE.d(text), 1);
    }

    @Override // okhttp3.m
    public boolean b(C15331h bytes) {
        Intrinsics.j(bytes, "bytes");
        return E(bytes, 2);
    }

    @Override // hw.k.a
    public void d(String text) throws IOException {
        Intrinsics.j(text, "text");
        this.listener.d(this, text);
    }

    @Override // okhttp3.m
    public boolean f(int code, String reason) {
        return s(code, reason, this.webSocketCloseTimeout);
    }

    @Override // hw.k.a
    public void g(C15331h bytes) throws IOException {
        Intrinsics.j(bytes, "bytes");
        this.listener.e(this, bytes);
    }

    @Override // hw.k.a
    public void h(int code, String reason) {
        Intrinsics.j(reason, "reason");
        if (code == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
            Unit unit = Unit.f142422a;
        }
        this.listener.b(this, code, reason);
    }

    public void q() {
        okhttp3.d dVar = this.call;
        Intrinsics.g(dVar);
        dVar.cancel();
    }

    public final void r(Response response, Vv.i exchange) throws IOException {
        Intrinsics.j(response, "response");
        if (response.getCode() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.getCode() + ' ' + response.getMessage() + '\'');
        }
        String strJ = Response.j(response, "Connection", null, 2, null);
        if (!StringsKt.H("Upgrade", strJ, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strJ + '\'');
        }
        String strJ2 = Response.j(response, "Upgrade", null, 2, null);
        if (!StringsKt.H("websocket", strJ2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strJ2 + '\'');
        }
        String strJ3 = Response.j(response, "Sec-WebSocket-Accept", null, 2, null);
        String strA = C15331h.INSTANCE.d(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").T().a();
        if (Intrinsics.e(strA, strJ3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strJ3 + '\'');
    }

    public final void t(OkHttpClient client) {
        Intrinsics.j(client, "client");
        if (this.originalRequest.d("Sec-WebSocket-Extensions") != null) {
            v(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient okHttpClientA = client.B().i(okhttp3.g.f154358b).S(f136422B).a();
        Request requestB = this.originalRequest.g().m("Upgrade", "websocket").m("Connection", "Upgrade").m("Sec-WebSocket-Key", this.key).m("Sec-WebSocket-Version", "13").m("Sec-WebSocket-Extensions", "permessage-deflate").b();
        o oVar = new o(okHttpClientA, requestB, true);
        this.call = oVar;
        Intrinsics.g(oVar);
        oVar.b2(new f(requestB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, hw.l] */
    public final void u(Exception e10, Response response, boolean isWriter) throws IOException {
        Intrinsics.j(e10, "e");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                d dVar = this.streams;
                ?? r02 = this.writer;
                objectRef2.f142835a = r02;
                T t10 = 0;
                t10 = 0;
                this.writer = null;
                if (r02 != 0 && this.reader == null) {
                    t10 = dVar;
                }
                objectRef.f142835a = t10;
                if (!isWriter && objectRef2.f142835a != 0) {
                    Uv.c.d(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: hw.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.w(objectRef2, objectRef);
                        }
                    }, 2, null);
                }
                this.taskQueue.q();
                Unit unit = Unit.f142422a;
                try {
                    this.listener.c(this, e10, response);
                    if (dVar != null) {
                        dVar.a();
                    }
                    if (isWriter) {
                        l lVar = (l) objectRef2.f142835a;
                        if (lVar != null) {
                            Rv.h.f(lVar);
                        }
                        d dVar2 = (d) objectRef.f142835a;
                        if (dVar2 != null) {
                            Rv.h.f(dVar2);
                        }
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(String name, d streams) throws Throwable {
        Throwable th2;
        Intrinsics.j(name, "name");
        Intrinsics.j(streams, "streams");
        WebSocketExtensions iVar = this.extensions;
        Intrinsics.g(iVar);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new l(streams.getClient(), streams.getSink(), this.random, iVar.perMessageDeflate, iVar.a(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new e();
                long j10 = this.pingIntervalMillis;
                if (j10 != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                        this.taskQueue.l(name + " ping", nanos, new Function0() { // from class: hw.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Long.valueOf(h.A(this.f136418a, nanos));
                            }
                        });
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    D();
                }
                Unit unit = Unit.f142422a;
                this.reader = new k(streams.getClient(), streams.getSource(), this, iVar.perMessageDeflate, iVar.a(!streams.getClient()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(h hVar, long j10) throws IOException {
        hVar.H();
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(h hVar) {
        hVar.q();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(l lVar) throws IOException {
        Rv.h.f(lVar);
        return Unit.f142422a;
    }
}

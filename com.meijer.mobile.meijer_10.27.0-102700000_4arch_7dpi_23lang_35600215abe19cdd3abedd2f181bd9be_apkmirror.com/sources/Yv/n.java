package Yv;

import Yv.b;
import Yv.n;
import Yv.t;
import Zv.WindowCounter;
import io.constructor.data.local.PreferencesHelper;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import okhttp3.Headers;
import okhttp3.internal.http2.ConnectionShutdownException;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 É\u00012\u00020\u00012\u00020\u0002:\u0004Uf`ZB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*H\u0000¢\u0006\u0004\b/\u0010-J\u001f\u00101\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b1\u00102J%\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0013¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00132\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J)\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u001b¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0000¢\u0006\u0004\bH\u00109J\u0017\u0010I\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\bK\u0010LJ-\u0010N\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bN\u0010OJ/\u0010R\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\bT\u0010-R\u001a\u0010X\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010j\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\"\u0010p\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\u0016\u0010v\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010@R\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0016\u0010\u0082\u0001\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0088\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0088\u0001R \u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001d\u0010\u009f\u0001\u001a\u00030\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010¤\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u009c\u0001\u001a\u0006\b¡\u0001\u0010\u009e\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010ª\u0001\u001a\u00030¥\u00018\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R*\u0010¯\u0001\u001a\u00020\u001b2\u0007\u0010«\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u0088\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010«\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b°\u0001\u0010\u0088\u0001\u001a\u0006\b±\u0001\u0010®\u0001R \u0010¸\u0001\u001a\u00030³\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001d\u0010¾\u0001\u001a\u00030¹\u00018\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R!\u0010Ä\u0001\u001a\u00070¿\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001¨\u0006Ê\u0001"}, d2 = {"LYv/n;", "Ljava/io/Closeable;", "", "LYv/n$a;", "builder", "<init>", "(LYv/n$a;)V", "", "associatedStreamId", "", "LYv/c;", "requestHeaders", "", "out", "LYv/u;", "K0", "(ILjava/util/List;Z)LYv/u;", "Ljava/io/IOException;", "e", "", "c0", "(Ljava/io/IOException;)V", PreferencesHelper.PREF_ID, "r0", "(I)LYv/u;", "streamId", "a1", "", "read", "j1", "(J)V", "L0", "(Ljava/util/List;Z)LYv/u;", "outFinished", "alternating", "o1", "(IZLjava/util/List;)V", "Lkw/e;", "buffer", "byteCount", "m1", "(IZLkw/e;J)V", "LYv/a;", "errorCode", "A1", "(ILYv/a;)V", "statusCode", "w1", "unacknowledgedBytesRead", "D1", "(IJ)V", "reply", "payload1", "payload2", "r1", "(ZII)V", "flush", "()V", "f1", "(LYv/a;)V", "close", "connectionCode", "streamCode", "cause", "Z", "(LYv/a;LYv/a;Ljava/io/IOException;)V", "sendConnectionPreface", "g1", "(Z)V", "nowNs", "J0", "(J)Z", "c1", "Z0", "(I)Z", "W0", "(ILjava/util/List;)V", "inFinished", "U0", "(ILjava/util/List;Z)V", "Lkw/g;", "source", "R0", "(ILkw/g;IZ)V", "Y0", "a", "e0", "()Z", "client", "LYv/n$c;", "b", "LYv/n$c;", "l0", "()LYv/n$c;", "listener", "", "c", "Ljava/util/Map;", "v0", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "h0", "()Ljava/lang/String;", "connectionName", "I", "j0", "()I", "d1", "(I)V", "lastGoodStreamId", "f", "m0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "LUv/d;", "h", "LUv/d;", "taskRunner", "LUv/c;", "i", "LUv/c;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "LYv/x;", "l", "LYv/x;", "pushObserver", "m", "J", "intervalPingsSent", "n", "intervalPongsReceived", "o", "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", "r", "degradedPongDeadlineNs", "LYv/b;", "s", "LYv/b;", "i0", "()LYv/b;", "flowControlListener", "LYv/y;", "t", "LYv/y;", "n0", "()LYv/y;", "okHttpSettings", "u", "q0", "e1", "(LYv/y;)V", "peerSettings", "LZv/a;", "v", "LZv/a;", "getReadBytes", "()LZv/a;", "readBytes", "value", "w", "getWriteBytesTotal", "()J", "writeBytesTotal", "x", "z0", "writeBytesMaximum", "Ljava/net/Socket;", "y", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "LYv/v;", "z", "LYv/v;", "F0", "()LYv/v;", "writer", "LYv/n$d;", "A", "LYv/n$d;", "getReaderRunnable", "()LYv/n$d;", "readerRunnable", "", "B", "Ljava/util/Set;", "currentPushRequests", "C", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class n implements Closeable {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final y f41892D;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final d readerRunnable;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> currentPushRequests;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, u> streams;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String connectionName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Uv.d taskRunner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Uv.c writerQueue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Uv.c pushQueue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Uv.c settingsListenerQueue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final x pushObserver;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long intervalPingsSent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long intervalPongsReceived;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long degradedPingsSent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long degradedPongsReceived;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long awaitPongsReceived;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b flowControlListener;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final y okHttpSettings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private y peerSettings;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final WindowCounter readBytes;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final v writer;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00103\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b:\u0010B\"\u0004\bC\u0010DR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010H\"\u0004\bI\u0010JR\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010L\u001a\u0004\b@\u0010M\"\u0004\bN\u0010OR\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010P\u001a\u0004\b4\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, d2 = {"LYv/n$a;", "", "", "client", "LUv/d;", "taskRunner", "<init>", "(ZLUv/d;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lkw/g;", "source", "Lkw/f;", "sink", "s", "(Ljava/net/Socket;Ljava/lang/String;Lkw/g;Lkw/f;)LYv/n$a;", "LYv/n$c;", "listener", "m", "(LYv/n$c;)LYv/n$a;", "", "pingIntervalMillis", "n", "(I)LYv/n$a;", "LYv/b;", "flowControlListener", "b", "(LYv/b;)LYv/n$a;", "LYv/n;", "a", "()LYv/n;", "Z", "c", "()Z", "setClient$okhttp", "(Z)V", "LUv/d;", "l", "()LUv/d;", "Ljava/net/Socket;", "j", "()Ljava/net/Socket;", "q", "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", "e", "Lkw/g;", "k", "()Lkw/g;", "r", "(Lkw/g;)V", "f", "Lkw/f;", "i", "()Lkw/f;", "p", "(Lkw/f;)V", "g", "LYv/n$c;", "()LYv/n$c;", "setListener$okhttp", "(LYv/n$c;)V", "LYv/x;", "h", "LYv/x;", "()LYv/x;", "setPushObserver$okhttp", "(LYv/x;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "LYv/b;", "()LYv/b;", "setFlowControlListener$okhttp", "(LYv/b;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Uv.d taskRunner;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public InterfaceC15330g source;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public InterfaceC15329f sink;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private c listener;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private x pushObserver;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private b flowControlListener;

        public a(boolean z10, Uv.d taskRunner) {
            Intrinsics.j(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = c.f41932b;
            this.pushObserver = x.f42009b;
            this.flowControlListener = b.a.f41830a;
        }

        public final n a() {
            return new n(this);
        }

        public final a b(b flowControlListener) {
            Intrinsics.j(flowControlListener, "flowControlListener");
            this.flowControlListener = flowControlListener;
            return this;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String d() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.y("connectionName");
            return null;
        }

        /* renamed from: e, reason: from getter */
        public final b getFlowControlListener() {
            return this.flowControlListener;
        }

        /* renamed from: f, reason: from getter */
        public final c getListener() {
            return this.listener;
        }

        /* renamed from: g, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* renamed from: h, reason: from getter */
        public final x getPushObserver() {
            return this.pushObserver;
        }

        public final InterfaceC15329f i() {
            InterfaceC15329f interfaceC15329f = this.sink;
            if (interfaceC15329f != null) {
                return interfaceC15329f;
            }
            Intrinsics.y("sink");
            return null;
        }

        public final Socket j() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.y("socket");
            return null;
        }

        public final InterfaceC15330g k() {
            InterfaceC15330g interfaceC15330g = this.source;
            if (interfaceC15330g != null) {
                return interfaceC15330g;
            }
            Intrinsics.y("source");
            return null;
        }

        /* renamed from: l, reason: from getter */
        public final Uv.d getTaskRunner() {
            return this.taskRunner;
        }

        public final a m(c listener) {
            Intrinsics.j(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final a n(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final void o(String str) {
            Intrinsics.j(str, "<set-?>");
            this.connectionName = str;
        }

        public final void p(InterfaceC15329f interfaceC15329f) {
            Intrinsics.j(interfaceC15329f, "<set-?>");
            this.sink = interfaceC15329f;
        }

        public final void q(Socket socket) {
            Intrinsics.j(socket, "<set-?>");
            this.socket = socket;
        }

        public final void r(InterfaceC15330g interfaceC15330g) {
            Intrinsics.j(interfaceC15330g, "<set-?>");
            this.source = interfaceC15330g;
        }

        @JvmOverloads
        public final a s(Socket socket, String peerName, InterfaceC15330g source, InterfaceC15329f sink) throws IOException {
            String str;
            Intrinsics.j(socket, "socket");
            Intrinsics.j(peerName, "peerName");
            Intrinsics.j(source, "source");
            Intrinsics.j(sink, "sink");
            q(socket);
            if (this.client) {
                str = Rv.k.f33048c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            r(source);
            p(sink);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LYv/n$b;", "", "<init>", "()V", "LYv/y;", "DEFAULT_SETTINGS", "LYv/y;", "a", "()LYv/y;", "", "OKHTTP_CLIENT_WINDOW_SIZE", "I", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final y a() {
            return n.f41892D;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"LYv/n$c;", "", "<init>", "()V", "LYv/u;", "stream", "", "e", "(LYv/u;)V", "LYv/n;", "connection", "LYv/y;", "settings", "c", "(LYv/n;LYv/y;)V", "a", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final c f41932b = new a();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Yv/n$c$a", "LYv/n$c;", "LYv/u;", "stream", "", "e", "(LYv/u;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            @Override // Yv.n.c
            public void e(u stream) throws IOException {
                Intrinsics.j(stream, "stream");
                stream.e(Yv.a.f41820j, null);
            }

            a() {
            }
        }

        public void c(n connection, y settings) {
            Intrinsics.j(connection, "connection");
            Intrinsics.j(settings, "settings");
        }

        public abstract void e(u stream) throws IOException;
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"LYv/n$d;", "LYv/t$c;", "Lkotlin/Function0;", "", "LYv/t;", "reader", "<init>", "(LYv/n;LYv/t;)V", "w", "()V", "", "inFinished", "", "streamId", "Lkw/g;", "source", "length", "g", "(ZILkw/g;I)V", "associatedStreamId", "", "LYv/c;", "headerBlock", "a", "(ZIILjava/util/List;)V", "LYv/a;", "errorCode", "f", "(ILYv/a;)V", "clearPrevious", "LYv/y;", "settings", "o", "(ZLYv/y;)V", "t", "e", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "Lkw/h;", "debugData", "c", "(ILYv/a;Lkw/h;)V", "", "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "l", "(IIIZ)V", "promisedStreamId", "requestHeaders", "d", "(IILjava/util/List;)V", "LYv/t;", "getReader$okhttp", "()LYv/t;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class d implements t.c, Function0<Unit> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final t reader;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f41934b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(n nVar, int i10, int i11) throws IOException {
            nVar.r1(true, i10, i11);
            return Unit.f142422a;
        }

        @Override // Yv.t.c
        public void e() {
        }

        @Override // Yv.t.c
        public void l(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        public d(n nVar, t reader) {
            Intrinsics.j(reader, "reader");
            this.f41934b = nVar;
            this.reader = reader;
        }

        @Override // Yv.t.c
        public void a(boolean inFinished, int streamId, int associatedStreamId, List<Yv.c> headerBlock) {
            Intrinsics.j(headerBlock, "headerBlock");
            if (this.f41934b.Z0(streamId)) {
                this.f41934b.U0(streamId, headerBlock, inFinished);
                return;
            }
            final n nVar = this.f41934b;
            synchronized (nVar) {
                u uVarR0 = nVar.r0(streamId);
                if (uVarR0 != null) {
                    Unit unit = Unit.f142422a;
                    uVarR0.y(Rv.k.s(headerBlock), inFinished);
                    return;
                }
                if (nVar.isShutdown) {
                    return;
                }
                if (streamId <= nVar.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == nVar.getNextStreamId() % 2) {
                    return;
                }
                final u uVar = new u(streamId, nVar, false, inFinished, Rv.k.s(headerBlock));
                nVar.d1(streamId);
                nVar.v0().put(Integer.valueOf(streamId), uVar);
                Uv.c.d(nVar.taskRunner.k(), nVar.getConnectionName() + '[' + streamId + "] onStream", 0L, false, new Function0() { // from class: Yv.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.d.v(nVar, uVar);
                    }
                }, 6, null);
            }
        }

        @Override // Yv.t.c
        public void b(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                n nVar = this.f41934b;
                synchronized (nVar) {
                    nVar.writeBytesMaximum = nVar.getWriteBytesMaximum() + windowSizeIncrement;
                    Intrinsics.h(nVar, "null cannot be cast to non-null type java.lang.Object");
                    nVar.notifyAll();
                    Unit unit = Unit.f142422a;
                }
                return;
            }
            u uVarR0 = this.f41934b.r0(streamId);
            if (uVarR0 != null) {
                synchronized (uVarR0) {
                    uVarR0.b(windowSizeIncrement);
                    Unit unit2 = Unit.f142422a;
                }
            }
        }

        @Override // Yv.t.c
        public void c(int lastGoodStreamId, Yv.a errorCode, C15331h debugData) {
            int i10;
            Object[] array;
            Intrinsics.j(errorCode, "errorCode");
            Intrinsics.j(debugData, "debugData");
            debugData.V();
            n nVar = this.f41934b;
            synchronized (nVar) {
                array = nVar.v0().values().toArray(new u[0]);
                nVar.isShutdown = true;
                Unit unit = Unit.f142422a;
            }
            for (u uVar : (u[]) array) {
                if (uVar.getId() > lastGoodStreamId && uVar.t()) {
                    uVar.z(Yv.a.f41820j);
                    this.f41934b.a1(uVar.getId());
                }
            }
        }

        @Override // Yv.t.c
        public void d(int streamId, int promisedStreamId, List<Yv.c> requestHeaders) {
            Intrinsics.j(requestHeaders, "requestHeaders");
            this.f41934b.W0(promisedStreamId, requestHeaders);
        }

        @Override // Yv.t.c
        public void f(int streamId, Yv.a errorCode) {
            Intrinsics.j(errorCode, "errorCode");
            if (this.f41934b.Z0(streamId)) {
                this.f41934b.Y0(streamId, errorCode);
                return;
            }
            u uVarA1 = this.f41934b.a1(streamId);
            if (uVarA1 != null) {
                uVarA1.z(errorCode);
            }
        }

        @Override // Yv.t.c
        public void g(boolean inFinished, int streamId, InterfaceC15330g source, int length) throws IOException {
            Intrinsics.j(source, "source");
            if (this.f41934b.Z0(streamId)) {
                this.f41934b.R0(streamId, source, length, inFinished);
                return;
            }
            u uVarR0 = this.f41934b.r0(streamId);
            if (uVarR0 == null) {
                this.f41934b.A1(streamId, Yv.a.f41814d);
                long j10 = length;
                this.f41934b.j1(j10);
                source.skip(j10);
                return;
            }
            uVarR0.x(source, length);
            if (inFinished) {
                uVarR0.y(Headers.f153997c, true);
            }
        }

        @Override // Yv.t.c
        public void k(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                Uv.c cVar = this.f41934b.writerQueue;
                String str = this.f41934b.getConnectionName() + " ping";
                final n nVar = this.f41934b;
                Uv.c.d(cVar, str, 0L, false, new Function0() { // from class: Yv.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.d.x(nVar, payload1, payload2);
                    }
                }, 6, null);
                return;
            }
            n nVar2 = this.f41934b;
            synchronized (nVar2) {
                try {
                    if (payload1 == 1) {
                        nVar2.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            nVar2.awaitPongsReceived++;
                            Intrinsics.h(nVar2, "null cannot be cast to non-null type java.lang.Object");
                            nVar2.notifyAll();
                        }
                        Unit unit = Unit.f142422a;
                    } else {
                        nVar2.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Yv.t.c
        public void o(final boolean clearPrevious, final y settings) {
            Intrinsics.j(settings, "settings");
            Uv.c.d(this.f41934b.writerQueue, this.f41934b.getConnectionName() + " applyAndAckSettings", 0L, false, new Function0() { // from class: Yv.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.d.y(this.f41940a, clearPrevious, settings);
                }
            }, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, Yv.y] */
        public final void t(boolean clearPrevious, y settings) {
            ?? r02;
            long jC;
            int i10;
            u[] uVarArr;
            y settings2 = settings;
            Intrinsics.j(settings2, "settings");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            v writer = this.f41934b.getWriter();
            final n nVar = this.f41934b;
            synchronized (writer) {
                synchronized (nVar) {
                    try {
                        y peerSettings = nVar.getPeerSettings();
                        if (clearPrevious) {
                            r02 = settings2;
                        } else {
                            y yVar = new y();
                            yVar.g(peerSettings);
                            yVar.g(settings2);
                            r02 = yVar;
                        }
                        objectRef.f142835a = r02;
                        jC = r02.c() - peerSettings.c();
                        uVarArr = (jC == 0 || nVar.v0().isEmpty()) ? null : (u[]) nVar.v0().values().toArray(new u[0]);
                        nVar.e1((y) objectRef.f142835a);
                        Uv.c.d(nVar.settingsListenerQueue, nVar.getConnectionName() + " onSettings", 0L, false, new Function0() { // from class: Yv.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.d.u(nVar, objectRef);
                            }
                        }, 6, null);
                        Unit unit = Unit.f142422a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    nVar.getWriter().a((y) objectRef.f142835a);
                } catch (IOException e10) {
                    nVar.c0(e10);
                }
                Unit unit2 = Unit.f142422a;
            }
            if (uVarArr != null) {
                for (u uVar : uVarArr) {
                    synchronized (uVar) {
                        uVar.b(jC);
                        Unit unit3 = Unit.f142422a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [Yv.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [Yv.t, java.io.Closeable] */
        public void w() throws Throwable {
            Yv.a aVar;
            Yv.a aVar2 = Yv.a.f41815e;
            IOException e10 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    Yv.a aVar3 = Yv.a.f41813c;
                    try {
                        this.f41934b.Z(aVar3, Yv.a.f41821k, null);
                        aVar = aVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        Yv.a aVar4 = Yv.a.f41814d;
                        n nVar = this.f41934b;
                        nVar.Z(aVar4, aVar4, e10);
                        aVar = nVar;
                        aVar2 = this.reader;
                        Rv.h.f(aVar2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f41934b.Z(aVar, aVar2, e10);
                    Rv.h.f(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar2;
                this.f41934b.Z(aVar, aVar2, e10);
                Rv.h.f(this.reader);
                throw th;
            }
            aVar2 = this.reader;
            Rv.h.f(aVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit u(n nVar, Ref.ObjectRef objectRef) {
            nVar.getListener().c(nVar, (y) objectRef.f142835a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(n nVar, u uVar) {
            try {
                nVar.getListener().e(uVar);
            } catch (IOException e10) {
                okhttp3.internal.platform.c.INSTANCE.e().k("Http2Connection.Listener failure for " + nVar.getConnectionName(), 4, e10);
                try {
                    uVar.e(Yv.a.f41814d, e10);
                } catch (IOException unused) {
                }
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(d dVar, boolean z10, y yVar) {
            dVar.t(z10, yVar);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            w();
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(n nVar) throws IOException {
        nVar.r1(false, 2, 0);
        return Unit.f142422a;
    }

    public static /* synthetic */ void i1(n nVar, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        nVar.g1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(n nVar, long j10) throws IOException {
        boolean z10;
        synchronized (nVar) {
            long j11 = nVar.intervalPongsReceived;
            long j12 = nVar.intervalPingsSent;
            if (j11 < j12) {
                z10 = true;
            } else {
                nVar.intervalPingsSent = j12 + 1;
                z10 = false;
            }
        }
        if (z10) {
            nVar.c0(null);
            return -1L;
        }
        nVar.r1(false, 1, 0);
        return j10;
    }

    public final boolean J0(long nowNs) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (nowNs >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final u a1(int streamId) {
        u uVarRemove;
        synchronized (this) {
            uVarRemove = this.streams.remove(Integer.valueOf(streamId));
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return uVarRemove;
    }

    public final void c1() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            Unit unit = Unit.f142422a;
            Uv.c.d(this.writerQueue, this.connectionName + " ping", 0L, false, new Function0() { // from class: Yv.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b1(this.f41872a);
                }
            }, 6, null);
        }
    }

    public final void j1(long read) {
        synchronized (this) {
            try {
                WindowCounter.c(this.readBytes, read, 0L, 2, null);
                long jA = this.readBytes.a();
                if (jA >= this.okHttpSettings.c() / 2) {
                    D1(0, jA);
                    WindowCounter.c(this.readBytes, 0L, jA, 1, null);
                }
                this.flowControlListener.b(this.readBytes);
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u r0(int id2) {
        u uVar;
        synchronized (this) {
            uVar = this.streams.get(Integer.valueOf(id2));
        }
        return uVar;
    }

    static {
        y yVar = new y();
        yVar.h(4, 65535);
        yVar.h(5, 16384);
        f41892D = yVar;
    }

    public n(a builder) {
        Intrinsics.j(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String strD = builder.d();
        this.connectionName = strD;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        Uv.d taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        Uv.c cVarK = taskRunner.k();
        this.writerQueue = cVarK;
        this.pushQueue = taskRunner.k();
        this.settingsListenerQueue = taskRunner.k();
        this.pushObserver = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        y yVar = new y();
        if (builder.getClient()) {
            yVar.h(4, 16777216);
        }
        this.okHttpSettings = yVar;
        this.peerSettings = f41892D;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.c();
        this.socket = builder.j();
        this.writer = new v(builder.i(), client);
        this.readerRunnable = new d(this, new t(builder.k(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            cVarK.l(strD + " ping", nanos, new Function0() { // from class: Yv.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(n.l(this.f41867a, nanos));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(n nVar, int i10, long j10) throws IOException {
        try {
            nVar.writer.w(i10, j10);
        } catch (IOException e10) {
            nVar.c0(e10);
        }
        return Unit.f142422a;
    }

    private final u K0(int associatedStreamId, List<Yv.c> requestHeaders, boolean out) throws Throwable {
        Throwable th2;
        boolean z10 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    f1(Yv.a.f41820j);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new ConnectionShutdownException();
                                }
                                int i10 = this.nextStreamId;
                                this.nextStreamId = i10 + 2;
                                u uVar = new u(i10, this, z10, false, null);
                                boolean z11 = !out || this.writeBytesTotal >= this.writeBytesMaximum || uVar.getWriteBytesTotal() >= uVar.getWriteBytesMaximum();
                                if (uVar.u()) {
                                    this.streams.put(Integer.valueOf(i10), uVar);
                                }
                                Unit unit = Unit.f142422a;
                                if (associatedStreamId == 0) {
                                    this.writer.i(z10, i10, requestHeaders);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.m(associatedStreamId, i10, requestHeaders);
                                }
                                if (z11) {
                                    this.writer.flush();
                                }
                                return uVar;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(n nVar, int i10, C15328e c15328e, int i11, boolean z10) {
        try {
            boolean zB = nVar.pushObserver.b(i10, c15328e, i11, z10);
            if (zB) {
                nVar.writer.p(i10, Yv.a.f41821k);
            }
            if (zB || z10) {
                synchronized (nVar) {
                    nVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f142422a;
                }
            }
        } catch (IOException unused) {
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(n nVar, int i10, List list, boolean z10) {
        boolean zD = nVar.pushObserver.d(i10, list, z10);
        if (zD) {
            try {
                nVar.writer.p(i10, Yv.a.f41821k);
            } catch (IOException unused) {
            }
        }
        if (zD || z10) {
            synchronized (nVar) {
                nVar.currentPushRequests.remove(Integer.valueOf(i10));
                Unit unit = Unit.f142422a;
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(n nVar, int i10, List list) {
        if (nVar.pushObserver.c(i10, list)) {
            try {
                nVar.writer.p(i10, Yv.a.f41821k);
                synchronized (nVar) {
                    nVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f142422a;
                }
            } catch (IOException unused) {
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(n nVar, int i10, Yv.a aVar) {
        nVar.pushObserver.a(i10, aVar);
        synchronized (nVar) {
            nVar.currentPushRequests.remove(Integer.valueOf(i10));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(IOException e10) throws IOException {
        Yv.a aVar = Yv.a.f41814d;
        Z(aVar, aVar, e10);
    }

    public final void A1(final int streamId, final Yv.a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        Uv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] writeSynReset", 0L, false, new Function0() { // from class: Yv.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.z1(this.f41873a, streamId, errorCode);
            }
        }, 6, null);
    }

    public final void D1(final int streamId, final long unacknowledgedBytesRead) {
        Uv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] windowUpdate", 0L, false, new Function0() { // from class: Yv.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.C1(this.f41869a, streamId, unacknowledgedBytesRead);
            }
        }, 6, null);
    }

    /* renamed from: F0, reason: from getter */
    public final v getWriter() {
        return this.writer;
    }

    public final u L0(List<Yv.c> requestHeaders, boolean out) throws IOException {
        Intrinsics.j(requestHeaders, "requestHeaders");
        return K0(0, requestHeaders, out);
    }

    public final void R0(final int streamId, InterfaceC15330g source, final int byteCount, final boolean inFinished) throws IOException {
        Intrinsics.j(source, "source");
        final C15328e c15328e = new C15328e();
        long j10 = byteCount;
        source.B1(j10);
        source.read(c15328e, j10);
        Uv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onData", 0L, false, new Function0() { // from class: Yv.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.N0(this.f41876a, streamId, c15328e, byteCount, inFinished);
            }
        }, 6, null);
    }

    public final void U0(final int streamId, final List<Yv.c> requestHeaders, final boolean inFinished) {
        Intrinsics.j(requestHeaders, "requestHeaders");
        Uv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onHeaders", 0L, false, new Function0() { // from class: Yv.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.S0(this.f41887a, streamId, requestHeaders, inFinished);
            }
        }, 6, null);
    }

    public final void W0(final int streamId, final List<Yv.c> requestHeaders) {
        Intrinsics.j(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                A1(streamId, Yv.a.f41814d);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            Uv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onRequest", 0L, false, new Function0() { // from class: Yv.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.V0(this.f41881a, streamId, requestHeaders);
                }
            }, 6, null);
        }
    }

    public final void Y0(final int streamId, final Yv.a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        Uv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onReset", 0L, false, new Function0() { // from class: Yv.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.X0(this.f41884a, streamId, errorCode);
            }
        }, 6, null);
    }

    public final void Z(Yv.a connectionCode, Yv.a streamCode, IOException cause) throws IOException {
        int i10;
        Object[] array;
        Intrinsics.j(connectionCode, "connectionCode");
        Intrinsics.j(streamCode, "streamCode");
        if (Rv.k.f33047b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            f1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new u[0]);
                    this.streams.clear();
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u[] uVarArr = (u[]) array;
        if (uVarArr != null) {
            for (u uVar : uVarArr) {
                try {
                    uVar.e(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.q();
        this.pushQueue.q();
        this.settingsListenerQueue.q();
    }

    public final boolean Z0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Z(Yv.a.f41813c, Yv.a.f41821k, null);
    }

    public final void d1(int i10) {
        this.lastGoodStreamId = i10;
    }

    /* renamed from: e0, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    public final void e1(y yVar) {
        Intrinsics.j(yVar, "<set-?>");
        this.peerSettings = yVar;
    }

    public final void f1(Yv.a statusCode) throws IOException {
        Intrinsics.j(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                intRef.f142833a = i10;
                Unit unit = Unit.f142422a;
                this.writer.h(i10, statusCode, Rv.h.f33041a);
            }
        }
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    @JvmOverloads
    public final void g1(boolean sendConnectionPreface) throws IOException {
        if (sendConnectionPreface) {
            this.writer.b();
            this.writer.u(this.okHttpSettings);
            if (this.okHttpSettings.c() != 65535) {
                this.writer.w(0, r9 - 65535);
            }
        }
        Uv.c.d(this.taskRunner.k(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    /* renamed from: h0, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* renamed from: i0, reason: from getter */
    public final b getFlowControlListener() {
        return this.flowControlListener;
    }

    /* renamed from: j0, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* renamed from: l0, reason: from getter */
    public final c getListener() {
        return this.listener;
    }

    /* renamed from: m0, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.j());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.Unit.f142422a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1(int r9, boolean r10, kw.C15328e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            Yv.v r12 = r8.writer
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map<java.lang.Integer, Yv.u> r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.h(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            Yv.v r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            Yv.v r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yv.n.m1(int, boolean, kw.e, long):void");
    }

    /* renamed from: n0, reason: from getter */
    public final y getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void o1(int streamId, boolean outFinished, List<Yv.c> alternating) throws IOException {
        Intrinsics.j(alternating, "alternating");
        this.writer.i(outFinished, streamId, alternating);
    }

    /* renamed from: q0, reason: from getter */
    public final y getPeerSettings() {
        return this.peerSettings;
    }

    public final void r1(boolean reply, int payload1, int payload2) throws IOException {
        try {
            this.writer.l(reply, payload1, payload2);
        } catch (IOException e10) {
            c0(e10);
        }
    }

    public final Map<Integer, u> v0() {
        return this.streams;
    }

    public final void w1(int streamId, Yv.a statusCode) throws IOException {
        Intrinsics.j(statusCode, "statusCode");
        this.writer.p(streamId, statusCode);
    }

    /* renamed from: z0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(n nVar, int i10, Yv.a aVar) throws IOException {
        try {
            nVar.w1(i10, aVar);
        } catch (IOException e10) {
            nVar.c0(e10);
        }
        return Unit.f142422a;
    }
}

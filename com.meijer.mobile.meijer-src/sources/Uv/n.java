package Uv;

import Uv.b;
import Uv.n;
import Uv.t;
import Vv.WindowCounter;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14417f;
import gw.InterfaceC14418g;
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
import okhttp3.Headers;
import okhttp3.internal.http2.ConnectionShutdownException;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 Ê\u00012\u00020\u00012\u00020\u0002:\u0004Uga[B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020*H\u0000¢\u0006\u0004\b/\u0010-J\u001f\u00101\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b1\u00102J%\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0013¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00132\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u00109J)\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u001b¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0000¢\u0006\u0004\bH\u00109J\u0017\u0010I\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\bK\u0010LJ-\u0010N\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bN\u0010OJ/\u0010R\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\fH\u0000¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\bT\u0010-R\u001a\u0010Y\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\"\u0010q\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\u0016\u0010w\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010VR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0016\u0010\u0083\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0089\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0089\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0089\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010 \u0001\u001a\u00030\u009b\u00018\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¥\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0006\b¢\u0001\u0010\u009f\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010«\u0001\u001a\u00030¦\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R*\u0010°\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0089\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R*\u0010³\u0001\u001a\u00020\u001b2\u0007\u0010¬\u0001\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0089\u0001\u001a\u0006\b²\u0001\u0010¯\u0001R \u0010¹\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001d\u0010¿\u0001\u001a\u00030º\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Å\u0001\u001a\u00070À\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ë\u0001"}, d2 = {"LUv/n;", "Ljava/io/Closeable;", "", "LUv/n$a;", "builder", "<init>", "(LUv/n$a;)V", "", "associatedStreamId", "", "LUv/c;", "requestHeaders", "", "out", "LUv/u;", "I0", "(ILjava/util/List;Z)LUv/u;", "Ljava/io/IOException;", "e", "", "b0", "(Ljava/io/IOException;)V", PreferencesHelper.PREF_ID, "s0", "(I)LUv/u;", "streamId", "Z0", "", "read", "k1", "(J)V", "J0", "(Ljava/util/List;Z)LUv/u;", "outFinished", "alternating", "q1", "(IZLjava/util/List;)V", "Lgw/e;", "buffer", "byteCount", "n1", "(IZLgw/e;J)V", "LUv/a;", "errorCode", "A1", "(ILUv/a;)V", "statusCode", "y1", "unacknowledgedBytesRead", "D1", "(IJ)V", "reply", "payload1", "payload2", "r1", "(ZII)V", "flush", "()V", "f1", "(LUv/a;)V", "close", "connectionCode", "streamCode", "cause", "Y", "(LUv/a;LUv/a;Ljava/io/IOException;)V", "sendConnectionPreface", "h1", "(Z)V", "nowNs", "H0", "(J)Z", "c1", "Y0", "(I)Z", "U0", "(ILjava/util/List;)V", "inFinished", "S0", "(ILjava/util/List;Z)V", "Lgw/g;", "source", "P0", "(ILgw/g;IZ)V", "X0", "a", "Z", "e0", "()Z", "client", "LUv/n$c;", "b", "LUv/n$c;", "m0", "()LUv/n$c;", "listener", "", "c", "Ljava/util/Map;", "v0", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "h0", "()Ljava/lang/String;", "connectionName", "I", "k0", "()I", "d1", "(I)V", "lastGoodStreamId", "f", "n0", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "LQv/d;", "h", "LQv/d;", "taskRunner", "LQv/c;", "i", "LQv/c;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "LUv/x;", "l", "LUv/x;", "pushObserver", "m", "J", "intervalPingsSent", "n", "intervalPongsReceived", "o", "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", "r", "degradedPongDeadlineNs", "LUv/b;", "s", "LUv/b;", "j0", "()LUv/b;", "flowControlListener", "LUv/y;", "t", "LUv/y;", "o0", "()LUv/y;", "okHttpSettings", "u", "r0", "e1", "(LUv/y;)V", "peerSettings", "LVv/a;", "v", "LVv/a;", "getReadBytes", "()LVv/a;", "readBytes", "value", "w", "getWriteBytesTotal", "()J", "writeBytesTotal", "x", "x0", "writeBytesMaximum", "Ljava/net/Socket;", "y", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "LUv/v;", "z", "LUv/v;", "E0", "()LUv/v;", "writer", "LUv/n$d;", "A", "LUv/n$d;", "getReaderRunnable", "()LUv/n$d;", "readerRunnable", "", "B", "Ljava/util/Set;", "currentPushRequests", "C", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class n implements Closeable {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final y f39117D;

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
    private final Qv.d taskRunner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Qv.c writerQueue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Qv.c pushQueue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Qv.c settingsListenerQueue;

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

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00103\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b:\u0010B\"\u0004\bC\u0010DR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010H\"\u0004\bI\u0010JR\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010L\u001a\u0004\b@\u0010M\"\u0004\bN\u0010OR\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010P\u001a\u0004\b4\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, d2 = {"LUv/n$a;", "", "", "client", "LQv/d;", "taskRunner", "<init>", "(ZLQv/d;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lgw/g;", "source", "Lgw/f;", "sink", "s", "(Ljava/net/Socket;Ljava/lang/String;Lgw/g;Lgw/f;)LUv/n$a;", "LUv/n$c;", "listener", "m", "(LUv/n$c;)LUv/n$a;", "", "pingIntervalMillis", "n", "(I)LUv/n$a;", "LUv/b;", "flowControlListener", "b", "(LUv/b;)LUv/n$a;", "LUv/n;", "a", "()LUv/n;", "Z", "c", "()Z", "setClient$okhttp", "(Z)V", "LQv/d;", "l", "()LQv/d;", "Ljava/net/Socket;", "j", "()Ljava/net/Socket;", "q", "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", "e", "Lgw/g;", "k", "()Lgw/g;", "r", "(Lgw/g;)V", "f", "Lgw/f;", "i", "()Lgw/f;", "p", "(Lgw/f;)V", "g", "LUv/n$c;", "()LUv/n$c;", "setListener$okhttp", "(LUv/n$c;)V", "LUv/x;", "h", "LUv/x;", "()LUv/x;", "setPushObserver$okhttp", "(LUv/x;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "LUv/b;", "()LUv/b;", "setFlowControlListener$okhttp", "(LUv/b;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Qv.d taskRunner;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public InterfaceC14418g source;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public InterfaceC14417f sink;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private c listener;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private x pushObserver;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private b flowControlListener;

        public a(boolean z10, Qv.d taskRunner) {
            Intrinsics.j(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = c.f39157b;
            this.pushObserver = x.f39234b;
            this.flowControlListener = b.a.f39055a;
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
            Intrinsics.x("connectionName");
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

        public final InterfaceC14417f i() {
            InterfaceC14417f interfaceC14417f = this.sink;
            if (interfaceC14417f != null) {
                return interfaceC14417f;
            }
            Intrinsics.x("sink");
            return null;
        }

        public final Socket j() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.x("socket");
            return null;
        }

        public final InterfaceC14418g k() {
            InterfaceC14418g interfaceC14418g = this.source;
            if (interfaceC14418g != null) {
                return interfaceC14418g;
            }
            Intrinsics.x("source");
            return null;
        }

        /* renamed from: l, reason: from getter */
        public final Qv.d getTaskRunner() {
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

        public final void p(InterfaceC14417f interfaceC14417f) {
            Intrinsics.j(interfaceC14417f, "<set-?>");
            this.sink = interfaceC14417f;
        }

        public final void q(Socket socket) {
            Intrinsics.j(socket, "<set-?>");
            this.socket = socket;
        }

        public final void r(InterfaceC14418g interfaceC14418g) {
            Intrinsics.j(interfaceC14418g, "<set-?>");
            this.source = interfaceC14418g;
        }

        @JvmOverloads
        public final a s(Socket socket, String peerName, InterfaceC14418g source, InterfaceC14417f sink) throws IOException {
            String str;
            Intrinsics.j(socket, "socket");
            Intrinsics.j(peerName, "peerName");
            Intrinsics.j(source, "source");
            Intrinsics.j(sink, "sink");
            q(socket);
            if (this.client) {
                str = Nv.k.f22782c + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            o(str);
            r(source);
            p(sink);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LUv/n$b;", "", "<init>", "()V", "LUv/y;", "DEFAULT_SETTINGS", "LUv/y;", "a", "()LUv/y;", "", "OKHTTP_CLIENT_WINDOW_SIZE", "I", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Uv.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final y a() {
            return n.f39117D;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LUv/n$c;", "", "<init>", "()V", "LUv/u;", "stream", "", "d", "(LUv/u;)V", "LUv/n;", "connection", "LUv/y;", "settings", "b", "(LUv/n;LUv/y;)V", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final c f39157b = new a();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Uv/n$c$a", "LUv/n$c;", "LUv/u;", "stream", "", "d", "(LUv/u;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            @Override // Uv.n.c
            public void d(u stream) throws IOException {
                Intrinsics.j(stream, "stream");
                stream.e(Uv.a.f39045j, null);
            }

            a() {
            }
        }

        public void b(n connection, y settings) {
            Intrinsics.j(connection, "connection");
            Intrinsics.j(settings, "settings");
        }

        public abstract void d(u stream) throws IOException;
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"LUv/n$d;", "LUv/t$c;", "Lkotlin/Function0;", "", "LUv/t;", "reader", "<init>", "(LUv/n;LUv/t;)V", "w", "()V", "", "inFinished", "", "streamId", "Lgw/g;", "source", "length", "g", "(ZILgw/g;I)V", "associatedStreamId", "", "LUv/c;", "headerBlock", "a", "(ZIILjava/util/List;)V", "LUv/a;", "errorCode", "f", "(ILUv/a;)V", "clearPrevious", "LUv/y;", "settings", "e", "(ZLUv/y;)V", "t", "d", "ack", "payload1", "payload2", "k", "(ZII)V", "lastGoodStreamId", "Lgw/h;", "debugData", "o", "(ILUv/a;Lgw/h;)V", "", "windowSizeIncrement", "b", "(IJ)V", "streamDependency", "weight", "exclusive", "l", "(IIIZ)V", "promisedStreamId", "requestHeaders", "c", "(IILjava/util/List;)V", "LUv/t;", "getReader$okhttp", "()LUv/t;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class d implements t.c, Function0<Unit> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final t reader;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f39159b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(n nVar, int i10, int i11) throws IOException {
            nVar.r1(true, i10, i11);
            return Unit.f143329a;
        }

        @Override // Uv.t.c
        public void d() {
        }

        @Override // Uv.t.c
        public void l(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        public d(n nVar, t reader) {
            Intrinsics.j(reader, "reader");
            this.f39159b = nVar;
            this.reader = reader;
        }

        @Override // Uv.t.c
        public void a(boolean inFinished, int streamId, int associatedStreamId, List<Uv.c> headerBlock) {
            Intrinsics.j(headerBlock, "headerBlock");
            if (this.f39159b.Y0(streamId)) {
                this.f39159b.S0(streamId, headerBlock, inFinished);
                return;
            }
            final n nVar = this.f39159b;
            synchronized (nVar) {
                u uVarS0 = nVar.s0(streamId);
                if (uVarS0 != null) {
                    Unit unit = Unit.f143329a;
                    uVarS0.y(Nv.k.s(headerBlock), inFinished);
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
                final u uVar = new u(streamId, nVar, false, inFinished, Nv.k.s(headerBlock));
                nVar.d1(streamId);
                nVar.v0().put(Integer.valueOf(streamId), uVar);
                Qv.c.d(nVar.taskRunner.k(), nVar.getConnectionName() + '[' + streamId + "] onStream", 0L, false, new Function0() { // from class: Uv.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.d.v(nVar, uVar);
                    }
                }, 6, null);
            }
        }

        @Override // Uv.t.c
        public void b(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                n nVar = this.f39159b;
                synchronized (nVar) {
                    nVar.writeBytesMaximum = nVar.getWriteBytesMaximum() + windowSizeIncrement;
                    Intrinsics.h(nVar, "null cannot be cast to non-null type java.lang.Object");
                    nVar.notifyAll();
                    Unit unit = Unit.f143329a;
                }
                return;
            }
            u uVarS0 = this.f39159b.s0(streamId);
            if (uVarS0 != null) {
                synchronized (uVarS0) {
                    uVarS0.b(windowSizeIncrement);
                    Unit unit2 = Unit.f143329a;
                }
            }
        }

        @Override // Uv.t.c
        public void c(int streamId, int promisedStreamId, List<Uv.c> requestHeaders) {
            Intrinsics.j(requestHeaders, "requestHeaders");
            this.f39159b.U0(promisedStreamId, requestHeaders);
        }

        @Override // Uv.t.c
        public void e(final boolean clearPrevious, final y settings) {
            Intrinsics.j(settings, "settings");
            Qv.c.d(this.f39159b.writerQueue, this.f39159b.getConnectionName() + " applyAndAckSettings", 0L, false, new Function0() { // from class: Uv.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.d.y(this.f39165a, clearPrevious, settings);
                }
            }, 6, null);
        }

        @Override // Uv.t.c
        public void f(int streamId, Uv.a errorCode) {
            Intrinsics.j(errorCode, "errorCode");
            if (this.f39159b.Y0(streamId)) {
                this.f39159b.X0(streamId, errorCode);
                return;
            }
            u uVarZ0 = this.f39159b.Z0(streamId);
            if (uVarZ0 != null) {
                uVarZ0.z(errorCode);
            }
        }

        @Override // Uv.t.c
        public void g(boolean inFinished, int streamId, InterfaceC14418g source, int length) throws IOException {
            Intrinsics.j(source, "source");
            if (this.f39159b.Y0(streamId)) {
                this.f39159b.P0(streamId, source, length, inFinished);
                return;
            }
            u uVarS0 = this.f39159b.s0(streamId);
            if (uVarS0 == null) {
                this.f39159b.A1(streamId, Uv.a.f39039d);
                long j10 = length;
                this.f39159b.k1(j10);
                source.skip(j10);
                return;
            }
            uVarS0.x(source, length);
            if (inFinished) {
                uVarS0.y(Headers.f154305c, true);
            }
        }

        @Override // Uv.t.c
        public void k(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                Qv.c cVar = this.f39159b.writerQueue;
                String str = this.f39159b.getConnectionName() + " ping";
                final n nVar = this.f39159b;
                Qv.c.d(cVar, str, 0L, false, new Function0() { // from class: Uv.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.d.x(nVar, payload1, payload2);
                    }
                }, 6, null);
                return;
            }
            n nVar2 = this.f39159b;
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
                        Unit unit = Unit.f143329a;
                    } else {
                        nVar2.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Uv.t.c
        public void o(int lastGoodStreamId, Uv.a errorCode, C14419h debugData) {
            int i10;
            Object[] array;
            Intrinsics.j(errorCode, "errorCode");
            Intrinsics.j(debugData, "debugData");
            debugData.V();
            n nVar = this.f39159b;
            synchronized (nVar) {
                array = nVar.v0().values().toArray(new u[0]);
                nVar.isShutdown = true;
                Unit unit = Unit.f143329a;
            }
            for (u uVar : (u[]) array) {
                if (uVar.getId() > lastGoodStreamId && uVar.t()) {
                    uVar.z(Uv.a.f39045j);
                    this.f39159b.Z0(uVar.getId());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, Uv.y] */
        public final void t(boolean clearPrevious, y settings) {
            ?? r02;
            long jC;
            int i10;
            u[] uVarArr;
            y settings2 = settings;
            Intrinsics.j(settings2, "settings");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            v writer = this.f39159b.getWriter();
            final n nVar = this.f39159b;
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
                        objectRef.f143742a = r02;
                        jC = r02.c() - peerSettings.c();
                        uVarArr = (jC == 0 || nVar.v0().isEmpty()) ? null : (u[]) nVar.v0().values().toArray(new u[0]);
                        nVar.e1((y) objectRef.f143742a);
                        Qv.c.d(nVar.settingsListenerQueue, nVar.getConnectionName() + " onSettings", 0L, false, new Function0() { // from class: Uv.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.d.u(nVar, objectRef);
                            }
                        }, 6, null);
                        Unit unit = Unit.f143329a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    nVar.getWriter().a((y) objectRef.f143742a);
                } catch (IOException e10) {
                    nVar.b0(e10);
                }
                Unit unit2 = Unit.f143329a;
            }
            if (uVarArr != null) {
                for (u uVar : uVarArr) {
                    synchronized (uVar) {
                        uVar.b(jC);
                        Unit unit3 = Unit.f143329a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [Uv.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [Uv.t, java.io.Closeable] */
        public void w() throws Throwable {
            Uv.a aVar;
            Uv.a aVar2 = Uv.a.f39040e;
            IOException e10 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    Uv.a aVar3 = Uv.a.f39038c;
                    try {
                        this.f39159b.Y(aVar3, Uv.a.f39046k, null);
                        aVar = aVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        Uv.a aVar4 = Uv.a.f39039d;
                        n nVar = this.f39159b;
                        nVar.Y(aVar4, aVar4, e10);
                        aVar = nVar;
                        aVar2 = this.reader;
                        Nv.h.f(aVar2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f39159b.Y(aVar, aVar2, e10);
                    Nv.h.f(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar2;
                this.f39159b.Y(aVar, aVar2, e10);
                Nv.h.f(this.reader);
                throw th;
            }
            aVar2 = this.reader;
            Nv.h.f(aVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit u(n nVar, Ref.ObjectRef objectRef) {
            nVar.getListener().b(nVar, (y) objectRef.f143742a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(n nVar, u uVar) {
            try {
                nVar.getListener().d(uVar);
            } catch (IOException e10) {
                okhttp3.internal.platform.c.INSTANCE.e().k("Http2Connection.Listener failure for " + nVar.getConnectionName(), 4, e10);
                try {
                    uVar.e(Uv.a.f39039d, e10);
                } catch (IOException unused) {
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(d dVar, boolean z10, y yVar) {
            dVar.t(z10, yVar);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            w();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(n nVar) throws IOException {
        nVar.r1(false, 2, 0);
        return Unit.f143329a;
    }

    public static /* synthetic */ void j1(n nVar, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        nVar.h1(z10);
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
            nVar.b0(null);
            return -1L;
        }
        nVar.r1(false, 1, 0);
        return j10;
    }

    public final boolean H0(long nowNs) {
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

    public final u Z0(int streamId) {
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
            Unit unit = Unit.f143329a;
            Qv.c.d(this.writerQueue, this.connectionName + " ping", 0L, false, new Function0() { // from class: Uv.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a1(this.f39097a);
                }
            }, 6, null);
        }
    }

    public final void k1(long read) {
        synchronized (this) {
            try {
                WindowCounter.c(this.readBytes, read, 0L, 2, null);
                long jA = this.readBytes.a();
                if (jA >= this.okHttpSettings.c() / 2) {
                    D1(0, jA);
                    WindowCounter.c(this.readBytes, 0L, jA, 1, null);
                }
                this.flowControlListener.b(this.readBytes);
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u s0(int id2) {
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
        f39117D = yVar;
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
        Qv.d taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        Qv.c cVarK = taskRunner.k();
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
        this.peerSettings = f39117D;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.c();
        this.socket = builder.j();
        this.writer = new v(builder.i(), client);
        this.readerRunnable = new d(this, new t(builder.k(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            cVarK.l(strD + " ping", nanos, new Function0() { // from class: Uv.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(n.l(this.f39092a, nanos));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(n nVar, int i10, long j10) throws IOException {
        try {
            nVar.writer.w(i10, j10);
        } catch (IOException e10) {
            nVar.b0(e10);
        }
        return Unit.f143329a;
    }

    private final u I0(int associatedStreamId, List<Uv.c> requestHeaders, boolean out) throws Throwable {
        Throwable th2;
        boolean z10 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    f1(Uv.a.f39045j);
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
                                Unit unit = Unit.f143329a;
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
    public static final Unit K0(n nVar, int i10, C14416e c14416e, int i11, boolean z10) {
        try {
            boolean zB = nVar.pushObserver.b(i10, c14416e, i11, z10);
            if (zB) {
                nVar.writer.p(i10, Uv.a.f39046k);
            }
            if (zB || z10) {
                synchronized (nVar) {
                    nVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f143329a;
                }
            }
        } catch (IOException unused) {
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(n nVar, int i10, List list, boolean z10) {
        boolean zD = nVar.pushObserver.d(i10, list, z10);
        if (zD) {
            try {
                nVar.writer.p(i10, Uv.a.f39046k);
            } catch (IOException unused) {
            }
        }
        if (zD || z10) {
            synchronized (nVar) {
                nVar.currentPushRequests.remove(Integer.valueOf(i10));
                Unit unit = Unit.f143329a;
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T0(n nVar, int i10, List list) {
        if (nVar.pushObserver.c(i10, list)) {
            try {
                nVar.writer.p(i10, Uv.a.f39046k);
                synchronized (nVar) {
                    nVar.currentPushRequests.remove(Integer.valueOf(i10));
                    Unit unit = Unit.f143329a;
                }
            } catch (IOException unused) {
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W0(n nVar, int i10, Uv.a aVar) {
        nVar.pushObserver.a(i10, aVar);
        synchronized (nVar) {
            nVar.currentPushRequests.remove(Integer.valueOf(i10));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(IOException e10) throws IOException {
        Uv.a aVar = Uv.a.f39039d;
        Y(aVar, aVar, e10);
    }

    public final void A1(final int streamId, final Uv.a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        Qv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] writeSynReset", 0L, false, new Function0() { // from class: Uv.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.z1(this.f39098a, streamId, errorCode);
            }
        }, 6, null);
    }

    public final void D1(final int streamId, final long unacknowledgedBytesRead) {
        Qv.c.d(this.writerQueue, this.connectionName + '[' + streamId + "] windowUpdate", 0L, false, new Function0() { // from class: Uv.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.B1(this.f39094a, streamId, unacknowledgedBytesRead);
            }
        }, 6, null);
    }

    /* renamed from: E0, reason: from getter */
    public final v getWriter() {
        return this.writer;
    }

    public final u J0(List<Uv.c> requestHeaders, boolean out) throws IOException {
        Intrinsics.j(requestHeaders, "requestHeaders");
        return I0(0, requestHeaders, out);
    }

    public final void P0(final int streamId, InterfaceC14418g source, final int byteCount, final boolean inFinished) throws IOException {
        Intrinsics.j(source, "source");
        final C14416e c14416e = new C14416e();
        long j10 = byteCount;
        source.C1(j10);
        source.read(c14416e, j10);
        Qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onData", 0L, false, new Function0() { // from class: Uv.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.K0(this.f39101a, streamId, c14416e, byteCount, inFinished);
            }
        }, 6, null);
    }

    public final void S0(final int streamId, final List<Uv.c> requestHeaders, final boolean inFinished) {
        Intrinsics.j(requestHeaders, "requestHeaders");
        Qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onHeaders", 0L, false, new Function0() { // from class: Uv.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.Q0(this.f39112a, streamId, requestHeaders, inFinished);
            }
        }, 6, null);
    }

    public final void U0(final int streamId, final List<Uv.c> requestHeaders) {
        Intrinsics.j(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                A1(streamId, Uv.a.f39039d);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            Qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onRequest", 0L, false, new Function0() { // from class: Uv.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.T0(this.f39106a, streamId, requestHeaders);
                }
            }, 6, null);
        }
    }

    public final void X0(final int streamId, final Uv.a errorCode) {
        Intrinsics.j(errorCode, "errorCode");
        Qv.c.d(this.pushQueue, this.connectionName + '[' + streamId + "] onReset", 0L, false, new Function0() { // from class: Uv.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.W0(this.f39109a, streamId, errorCode);
            }
        }, 6, null);
    }

    public final void Y(Uv.a connectionCode, Uv.a streamCode, IOException cause) throws IOException {
        int i10;
        Object[] array;
        Intrinsics.j(connectionCode, "connectionCode");
        Intrinsics.j(streamCode, "streamCode");
        if (Nv.k.f22781b && Thread.holdsLock(this)) {
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
                Unit unit = Unit.f143329a;
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

    public final boolean Y0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Y(Uv.a.f39038c, Uv.a.f39046k, null);
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

    public final void f1(Uv.a statusCode) throws IOException {
        Intrinsics.j(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                intRef.f143740a = i10;
                Unit unit = Unit.f143329a;
                this.writer.h(i10, statusCode, Nv.h.f22775a);
            }
        }
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    /* renamed from: h0, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    @JvmOverloads
    public final void h1(boolean sendConnectionPreface) throws IOException {
        if (sendConnectionPreface) {
            this.writer.b();
            this.writer.u(this.okHttpSettings);
            if (this.okHttpSettings.c() != 65535) {
                this.writer.w(0, r9 - 65535);
            }
        }
        Qv.c.d(this.taskRunner.k(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    /* renamed from: j0, reason: from getter */
    public final b getFlowControlListener() {
        return this.flowControlListener;
    }

    /* renamed from: k0, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* renamed from: m0, reason: from getter */
    public final c getListener() {
        return this.listener;
    }

    /* renamed from: n0, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.j());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.Unit.f143329a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(int r9, boolean r10, gw.C14416e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            Uv.v r12 = r8.writer
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
            java.util.Map<java.lang.Integer, Uv.u> r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
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
            Uv.v r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            Uv.v r4 = r8.writer
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
        throw new UnsupportedOperationException("Method not decompiled: Uv.n.n1(int, boolean, gw.e, long):void");
    }

    /* renamed from: o0, reason: from getter */
    public final y getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void q1(int streamId, boolean outFinished, List<Uv.c> alternating) throws IOException {
        Intrinsics.j(alternating, "alternating");
        this.writer.i(outFinished, streamId, alternating);
    }

    /* renamed from: r0, reason: from getter */
    public final y getPeerSettings() {
        return this.peerSettings;
    }

    public final void r1(boolean reply, int payload1, int payload2) throws IOException {
        try {
            this.writer.l(reply, payload1, payload2);
        } catch (IOException e10) {
            b0(e10);
        }
    }

    public final Map<Integer, u> v0() {
        return this.streams;
    }

    /* renamed from: x0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void y1(int streamId, Uv.a statusCode) throws IOException {
        Intrinsics.j(statusCode, "statusCode");
        this.writer.p(streamId, statusCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(n nVar, int i10, Uv.a aVar) throws IOException {
        try {
            nVar.y1(i10, aVar);
        } catch (IOException e10) {
            nVar.b0(e10);
        }
        return Unit.f143329a;
    }
}

package okhttp3;

import Mv.r;
import Mv.t;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001-B\u0083\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u001eJ%\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001d¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u0010,R\u0017\u0010\t\u001a\u00020\b8G¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\t\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8G¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\r\u001a\u00020\f8G¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u000e8G¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\b\u000f\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b\u0010\u0010FR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008G¢\u0006\f\n\u0004\b \u0010E\u001a\u0004\b\u0011\u0010FR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008G¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\bH\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00138G¢\u0006\f\n\u0004\b@\u0010J\u001a\u0004\bM\u0010LR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168AX\u0080\u0004¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\b7\u0010OR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010Y\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0017\u0010^\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b#\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010`\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010]R\u0011\u0010a\u001a\u00020R8G¢\u0006\u0006\u001a\u0004\b1\u0010V¨\u0006b"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "request", "LMv/r;", "protocol", "", "message", "", "code", "Lokhttp3/i;", "handshake", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "LRv/i;", "exchange", "LMv/t;", "trailersSource", "<init>", "(Lokhttp3/Request;LMv/r;Ljava/lang/String;ILokhttp3/i;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLRv/i;LMv/t;)V", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "i", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Response$a;", "p", "()Lokhttp3/Response$a;", "LMv/e;", "c", "()Ljava/util/List;", "", "close", "()V", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/Request;", "A", "()Lokhttp3/Request;", "b", "LMv/r;", "w", "()LMv/r;", "Ljava/lang/String;", "m", "d", "I", "()I", "e", "Lokhttp3/i;", "g", "()Lokhttp3/i;", "f", "Lokhttp3/Headers;", "l", "()Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "()Lokhttp3/ResponseBody;", "h", "Lokhttp3/Response;", "()Lokhttp3/Response;", "j", "u", "k", "J", "B", "()J", "z", "LRv/i;", "()LRv/i;", "n", "LMv/t;", "Lokhttp3/c;", "o", "Lokhttp3/c;", "getLazyCacheControl$okhttp", "()Lokhttp3/c;", "setLazyCacheControl$okhttp", "(Lokhttp3/c;)V", "lazyCacheControl", "", "Z", "m1", "()Z", "isSuccessful", "q", "isRedirect", "cacheControl", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Response implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r protocol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i handshake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ResponseBody body;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Response networkResponse;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Response cacheResponse;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Response priorResponse;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Rv.i exchange;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private t trailersSource;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private c lazyCacheControl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuccessful;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean isRedirect;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b/\u0010-J\u0019\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b1\u0010-J\u0017\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u000206H\u0016¢\u0006\u0004\b;\u00109J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010$\u001a\u00020[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010f\u001a\u0004\bg\u0010A\"\u0004\bh\u0010\u0006R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010f\u001a\u0004\bi\u0010A\"\u0004\bj\u0010\u0006R$\u00100\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010f\u001a\u0004\bk\u0010A\"\u0004\bl\u0010\u0006R\"\u00107\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010:\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010m\u001a\u0004\br\u0010o\"\u0004\bs\u0010qR$\u0010=\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010?R\"\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lokhttp3/Response$a;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "", "name", "", "e", "(Ljava/lang/String;Lokhttp3/Response;)V", "Lokhttp3/Request;", "request", "q", "(Lokhttp3/Request;)Lokhttp3/Response$a;", "LMv/r;", "protocol", "o", "(LMv/r;)Lokhttp3/Response$a;", "", "code", "f", "(I)Lokhttp3/Response$a;", "message", "l", "(Ljava/lang/String;)Lokhttp3/Response$a;", "Lokhttp3/i;", "handshake", "h", "(Lokhttp3/i;)Lokhttp3/Response$a;", "value", "i", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$a;", "a", "Lokhttp3/Headers;", "headers", "j", "(Lokhttp3/Headers;)Lokhttp3/Response$a;", "Lokhttp3/ResponseBody;", "body", "b", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$a;", "networkResponse", "m", "(Lokhttp3/Response;)Lokhttp3/Response$a;", "cacheResponse", "d", "priorResponse", "n", "LMv/t;", "trailersSource", "s", "(LMv/t;)Lokhttp3/Response$a;", "", "sentRequestAtMillis", "r", "(J)Lokhttp3/Response$a;", "receivedResponseAtMillis", "p", "LRv/i;", "exchange", "k", "(LRv/i;)V", "c", "()Lokhttp3/Response;", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "LMv/r;", "getProtocol$okhttp", "()LMv/r;", "setProtocol$okhttp", "(LMv/r;)V", "I", "g", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/i;", "getHandshake$okhttp", "()Lokhttp3/i;", "setHandshake$okhttp", "(Lokhttp3/i;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "getHeaders$okhttp", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "LRv/i;", "getExchange$okhttp", "()LRv/i;", "setExchange$okhttp", "LMv/t;", "getTrailersSource$okhttp", "()LMv/t;", "setTrailersSource$okhttp", "(LMv/t;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Request request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private r protocol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private i handshake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Headers.a headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private ResponseBody body;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Response networkResponse;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Response cacheResponse;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Response priorResponse;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Rv.i exchange;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private t trailersSource;

        public a() {
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = t.f20514b;
            this.headers = new Headers.a();
        }

        private final void e(String name, Response response) {
            if (response != null) {
                if (response.getNetworkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.getCacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public a b(ResponseBody body) {
            Intrinsics.j(body, "body");
            this.body = body;
            return this;
        }

        public Response c() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            r rVar = this.protocol;
            if (rVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, rVar, str, i10, this.handshake, this.headers.f(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(Response cacheResponse) {
            e("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public a f(int code) {
            this.code = code;
            return this;
        }

        /* renamed from: g, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public a h(i handshake) {
            this.handshake = handshake;
            return this;
        }

        public a i(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.headers.j(name, value);
            return this;
        }

        public a j(Headers headers) {
            Intrinsics.j(headers, "headers");
            this.headers = headers.k();
            return this;
        }

        public final void k(Rv.i exchange) {
            Intrinsics.j(exchange, "exchange");
            this.exchange = exchange;
        }

        public a l(String message) {
            Intrinsics.j(message, "message");
            this.message = message;
            return this;
        }

        public a m(Response networkResponse) {
            e("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public a n(Response priorResponse) {
            this.priorResponse = priorResponse;
            return this;
        }

        public a o(r protocol) {
            Intrinsics.j(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public a p(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public a q(Request request) {
            Intrinsics.j(request, "request");
            this.request = request;
            return this;
        }

        public a r(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public a s(t trailersSource) {
            Intrinsics.j(trailersSource, "trailersSource");
            this.trailersSource = trailersSource;
            return this;
        }

        public a(Response response) {
            Intrinsics.j(response, "response");
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = t.f20514b;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().k();
            this.body = response.getBody();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
            this.trailersSource = response.trailersSource;
        }
    }

    public Response(Request request, r protocol, String message, int i10, i iVar, Headers headers, ResponseBody body, Response response, Response response2, Response response3, long j10, long j11, Rv.i iVar2, t trailersSource) {
        Intrinsics.j(request, "request");
        Intrinsics.j(protocol, "protocol");
        Intrinsics.j(message, "message");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(body, "body");
        Intrinsics.j(trailersSource, "trailersSource");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = iVar;
        this.headers = headers;
        this.body = body;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = iVar2;
        this.trailersSource = trailersSource;
        boolean z10 = true;
        this.isSuccessful = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES /* 300 */:
                case HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY /* 301 */:
                case HttpResponseStatus.REDIRECTION_FOUND /* 302 */:
                case HttpResponseStatus.REDIRECTION_SEE_OTHER /* 303 */:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.isRedirect = z10;
    }

    @JvmOverloads
    public final String h(String name) {
        Intrinsics.j(name, "name");
        return j(this, name, null, 2, null);
    }

    public static /* synthetic */ String j(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.i(str, str2);
    }

    @JvmName
    /* renamed from: A, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    @JvmName
    /* renamed from: B, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @JvmName
    public final c b() {
        c cVar = this.lazyCacheControl;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.INSTANCE.a(this.headers);
        this.lazyCacheControl = cVarA;
        return cVarA;
    }

    @JvmName
    /* renamed from: body, reason: from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    public final List<Mv.e> c() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.m();
            }
            str = "Proxy-Authenticate";
        }
        return Sv.e.a(headers, str);
    }

    @JvmName
    /* renamed from: cacheResponse, reason: from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    @JvmName
    /* renamed from: code, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @JvmName
    /* renamed from: d, reason: from getter */
    public final Rv.i getExchange() {
        return this.exchange;
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final i getHandshake() {
        return this.handshake;
    }

    public final List<String> headers(String name) {
        Intrinsics.j(name, "name");
        return this.headers.q(name);
    }

    @JvmOverloads
    public final String i(String name, String defaultValue) {
        Intrinsics.j(name, "name");
        String str = this.headers.get(name);
        return str == null ? defaultValue : str;
    }

    @JvmName
    /* renamed from: l, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @JvmName
    /* renamed from: m, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: m1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @JvmName
    /* renamed from: networkResponse, reason: from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    public final a p() {
        return new a(this);
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    @JvmName
    /* renamed from: u, reason: from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    @JvmName
    /* renamed from: w, reason: from getter */
    public final r getProtocol() {
        return this.protocol;
    }

    @JvmName
    /* renamed from: z, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }
}

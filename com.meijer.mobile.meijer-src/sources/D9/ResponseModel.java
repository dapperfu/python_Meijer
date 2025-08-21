package D9;

import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import u9.C17361a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0097\b\u0018\u00002\u00020\u0001:\u0001\u0012B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0012¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u0017R(\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b&\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LD9/c;", "", "", "statusCode", "", "message", "", "headers", "Ljava/net/HttpCookie;", "cookies", "body", "", "timestamp", "LA9/c;", "requestModel", "<init>", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;JLA9/c;)V", "", "a", "(I)V", "b", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;JLA9/c;)LD9/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "j", "Ljava/lang/String;", "g", "c", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "d", "e", "J", "k", "()J", "LA9/c;", "i", "()LA9/c;", "Lorg/json/JSONObject;", "h", "()Lorg/json/JSONObject;", "parsedBody", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: D9.c, reason: from toString */
/* loaded from: classes4.dex */
public /* data */ class ResponseModel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, HttpCookie> cookies;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final A9.c requestModel;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00002\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\b0\u0006¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"R$\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006&"}, d2 = {"LD9/c$a;", "", "Lu9/a;", "timestampProvider", "<init>", "(Lu9/a;)V", "", "", "", "headers", "Ljava/net/HttpCookie;", "d", "(Ljava/util/Map;)Ljava/util/Map;", "", "statusCode", "h", "(I)LD9/c$a;", "message", "f", "(Ljava/lang/String;)LD9/c$a;", "e", "(Ljava/util/Map;)LD9/c$a;", "body", "a", "LA9/c;", "requestModel", "g", "(LA9/c;)LD9/c$a;", "LD9/c;", "b", "()LD9/c;", "c", "Lu9/a;", "Ljava/lang/Integer;", "Ljava/lang/String;", "Ljava/util/Map;", "cookies", "LA9/c;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: D9.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C17361a timestampProvider;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Integer statusCode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> headers;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Map<String, HttpCookie> cookies;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String body;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private A9.c requestModel;

        @JvmOverloads
        public a(C17361a timestampProvider) {
            Intrinsics.j(timestampProvider, "timestampProvider");
            this.timestampProvider = timestampProvider;
            this.headers = new HashMap();
            this.cookies = new HashMap();
        }

        private final Map<String, HttpCookie> d(Map<String, ? extends List<String>> headers) {
            HashMap map = new HashMap();
            Iterator<T> it = headers.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (StringsKt.H((String) entry.getKey(), "set-cookie", true)) {
                    Iterator it2 = ((Iterable) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        for (HttpCookie httpCookie : HttpCookie.parse((String) it2.next())) {
                            map.put(httpCookie.getName(), httpCookie);
                        }
                    }
                }
            }
            return map;
        }

        public final a a(String body) {
            this.body = body;
            return this;
        }

        public final ResponseModel b() {
            Integer num = this.statusCode;
            Intrinsics.g(num);
            int iIntValue = num.intValue();
            String str = this.message;
            Intrinsics.g(str);
            Map<String, String> map = this.headers;
            Map<String, HttpCookie> map2 = this.cookies;
            String str2 = this.body;
            long jA = this.timestampProvider.a();
            A9.c cVar = this.requestModel;
            Intrinsics.g(cVar);
            return new ResponseModel(iIntValue, str, map, map2, str2, jA, cVar);
        }

        public final Map<String, String> c(Map<String, ? extends List<String>> headers) {
            Intrinsics.j(headers, "headers");
            HashMap map = new HashMap();
            for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
                map.put(entry.getKey(), CollectionsKt.B0(entry.getValue(), ", ", null, null, 0, null, null, 62, null));
            }
            return map;
        }

        public final a e(Map<String, ? extends List<String>> headers) {
            Intrinsics.j(headers, "headers");
            this.headers = c(headers);
            this.cookies = d(headers);
            return this;
        }

        public final a f(String message) {
            this.message = message;
            return this;
        }

        public final a g(A9.c requestModel) {
            this.requestModel = requestModel;
            return this;
        }

        public final a h(int statusCode) {
            this.statusCode = Integer.valueOf(statusCode);
            return this;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseModel)) {
            return false;
        }
        ResponseModel responseModel = (ResponseModel) other;
        return getStatusCode() == responseModel.getStatusCode() && Intrinsics.e(getMessage(), responseModel.getMessage()) && Intrinsics.e(f(), responseModel.f()) && Intrinsics.e(e(), responseModel.e()) && Intrinsics.e(getBody(), responseModel.getBody()) && getTimestamp() == responseModel.getTimestamp() && Intrinsics.e(getRequestModel(), responseModel.getRequestModel());
    }

    public JSONObject h() {
        try {
            String body = getBody();
            if (body != null) {
                return new JSONObject(body);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public ResponseModel(int i10, String message, Map<String, String> headers, Map<String, HttpCookie> cookies, String str, long j10, A9.c requestModel) {
        Intrinsics.j(message, "message");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(cookies, "cookies");
        Intrinsics.j(requestModel, "requestModel");
        this.statusCode = i10;
        this.message = message;
        this.headers = headers;
        this.cookies = cookies;
        this.body = str;
        this.timestamp = j10;
        this.requestModel = requestModel;
        a(getStatusCode());
    }

    private void a(int statusCode) {
        if (statusCode < 200 || statusCode >= 600) {
            throw new IllegalArgumentException("Status code must be between 2xx and 5xx!");
        }
    }

    public static /* synthetic */ ResponseModel c(ResponseModel responseModel, int i10, String str, Map map, Map map2, String str2, long j10, A9.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            i10 = responseModel.getStatusCode();
        }
        if ((i11 & 2) != 0) {
            str = responseModel.getMessage();
        }
        if ((i11 & 4) != 0) {
            map = responseModel.f();
        }
        if ((i11 & 8) != 0) {
            map2 = responseModel.e();
        }
        if ((i11 & 16) != 0) {
            str2 = responseModel.getBody();
        }
        if ((i11 & 32) != 0) {
            j10 = responseModel.getTimestamp();
        }
        if ((i11 & 64) != 0) {
            cVar = responseModel.getRequestModel();
        }
        A9.c cVar2 = cVar;
        long j11 = j10;
        String str3 = str2;
        Map map3 = map;
        return responseModel.b(i10, str, map3, map2, str3, j11, cVar2);
    }

    public final ResponseModel b(int statusCode, String message, Map<String, String> headers, Map<String, HttpCookie> cookies, String body, long timestamp, A9.c requestModel) {
        Intrinsics.j(message, "message");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(cookies, "cookies");
        Intrinsics.j(requestModel, "requestModel");
        return new ResponseModel(statusCode, message, headers, cookies, body, timestamp, requestModel);
    }

    /* renamed from: d, reason: from getter */
    public String getBody() {
        return this.body;
    }

    public Map<String, HttpCookie> e() {
        return this.cookies;
    }

    public Map<String, String> f() {
        return this.headers;
    }

    /* renamed from: g, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    /* renamed from: i, reason: from getter */
    public A9.c getRequestModel() {
        return this.requestModel;
    }

    /* renamed from: j, reason: from getter */
    public int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: k, reason: from getter */
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = ((((((Integer.hashCode(getStatusCode()) * 31) + getMessage().hashCode()) * 31) + f().hashCode()) * 31) + e().hashCode()) * 31;
        if (getBody() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getBody().hashCode();
        }
        return ((((iHashCode2 + iHashCode) * 31) + Long.hashCode(getTimestamp())) * 31) + getRequestModel().hashCode();
    }

    public String toString() {
        return "ResponseModel(statusCode=" + getStatusCode() + ", message=" + getMessage() + ", headers=" + f() + ", cookies=" + e() + ", body=" + getBody() + ", timestamp=" + getTimestamp() + ", requestModel=" + getRequestModel() + ")";
    }
}

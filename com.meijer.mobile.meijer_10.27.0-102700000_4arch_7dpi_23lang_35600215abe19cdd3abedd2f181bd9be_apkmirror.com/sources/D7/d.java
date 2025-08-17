package D7;

import G7.d;
import W7.EndPointInfo;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.d;
import org.json.JSONException;
import v7.InterfaceC17517b;
import x7.LocalServerData;
import x8.f;
import y7.ServerDataUpdate;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"LD7/d;", "LD7/c;", "Lokhttp3/d$a;", "client", "LF7/b;", "configRequestFactory", "LF7/c;", "dataRequestFactory", "LG7/a;", "configurationsParser", "Lv7/b;", "connectivityChecker", "<init>", "(Lokhttp3/d$a;LF7/b;LF7/c;LG7/a;Lv7/b;)V", "Lokhttp3/Response;", "response", "Lx7/f;", "currentServerData", "LW7/a;", "endPointInfo", "LG7/d;", "c", "(Lokhttp3/Response;Lx7/f;LW7/a;)LG7/d;", "LD7/b;", "request", "a", "(LD7/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LD7/a;", "b", "(LD7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/d$a;", "LF7/b;", "LF7/c;", "d", "LG7/a;", "e", "Lv7/b;", "", "f", "Ljava/lang/String;", "noInternetConnectionRetryReason", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final F7.b configRequestFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final F7.c dataRequestFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G7.a configurationsParser;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17517b connectivityChecker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String noInternetConnectionRetryReason;

    public d(d.a client, F7.b configRequestFactory, F7.c dataRequestFactory, G7.a configurationsParser, InterfaceC17517b connectivityChecker) {
        Intrinsics.j(client, "client");
        Intrinsics.j(configRequestFactory, "configRequestFactory");
        Intrinsics.j(dataRequestFactory, "dataRequestFactory");
        Intrinsics.j(configurationsParser, "configurationsParser");
        Intrinsics.j(connectivityChecker, "connectivityChecker");
        this.client = client;
        this.configRequestFactory = configRequestFactory;
        this.dataRequestFactory = dataRequestFactory;
        this.configurationsParser = configurationsParser;
        this.connectivityChecker = connectivityChecker;
        this.noInternetConnectionRetryReason = "No internet connection";
    }

    @Override // D7.c
    public Object a(b bVar, Continuation<? super G7.d> continuation) {
        try {
            if (!this.connectivityChecker.b()) {
                f.a("dtxCommunication", "data request failed: no connectivity");
                return new d.Retry(this.noInternetConnectionRetryReason, null);
            }
            d.a aVar = this.client;
            Request requestA = this.dataRequestFactory.a(bVar);
            f.a("dtxCommunication", "data request: " + requestA);
            f.a("dtxCommunication", "data request body: " + bVar.getBody());
            return c(FirebasePerfOkHttpClient.execute(aVar.b(requestA)), bVar.getServerData(), bVar.getEndPointInfo());
        } catch (Exception e10) {
            f.b("dtxCommunication", "data request failed with exception:", e10);
            return d.C0160d.f11275a;
        }
    }

    @Override // D7.c
    public Object b(a aVar, Continuation<? super G7.d> continuation) {
        try {
            if (!this.connectivityChecker.b()) {
                f.a("dtxCommunication", "config request failed: no connectivity");
                return new d.Retry(this.noInternetConnectionRetryReason, null);
            }
            d.a aVar2 = this.client;
            Request requestA = this.configRequestFactory.a(aVar);
            f.a("dtxCommunication", "config request: " + requestA);
            return c(FirebasePerfOkHttpClient.execute(aVar2.b(requestA)), aVar.getServerData(), aVar.getEndPointInfo());
        } catch (Exception e10) {
            f.b("dtxCommunication", "config request failed with exception:", e10);
            return d.C0160d.f11275a;
        }
    }

    private final G7.d c(Response response, LocalServerData currentServerData, EndPointInfo endPointInfo) throws JSONException, IOException {
        Long lX;
        long jT;
        String strString = null;
        if (G7.e.c(response)) {
            String str = response.getHeaders().get("Retry-After");
            if (str != null) {
                lX = StringsKt.x(str);
            } else {
                lX = null;
            }
            if (lX == null) {
                jT = e.f5067a;
            } else {
                Duration.Companion companion = Duration.INSTANCE;
                jT = DurationKt.t(lX.longValue(), DurationUnit.f147509e);
            }
            f.a("dtxCommunication", "erroneous response: too many requests; retry-after: " + lX);
            return new d.TooManyRequests(jT, null);
        }
        if (G7.e.d(response)) {
            ResponseBody body = response.getBody();
            if (body != null) {
                strString = body.string();
            }
            f.a("dtxCommunication", "erroneous response: unexpected response code: " + response.getCode() + "; body: " + strString);
            return d.C0160d.f11275a;
        }
        ResponseBody body2 = response.getBody();
        if (body2 != null) {
            strString = body2.string();
        }
        if (strString == null) {
            f.a("dtxCommunication", "erroneous response: no body; response code: " + response.getCode());
            return d.C0160d.f11275a;
        }
        ServerDataUpdate serverDataUpdateB = this.configurationsParser.b(strString, currentServerData, endPointInfo);
        if (serverDataUpdateB == null) {
            f.a("dtxCommunication", "erroneous config received: parsing error; response code: " + response.getCode() + "; body: " + strString);
            return d.C0160d.f11275a;
        }
        if (G7.e.b(response)) {
            f.a("dtxCommunication", "successful response: " + strString);
            return new d.Success(serverDataUpdateB);
        }
        f.a("dtxCommunication", "retrying due to erroneous response code: " + response.getCode() + "; body: " + strString);
        return new d.Retry(String.valueOf(response.getCode()), serverDataUpdateB);
    }
}

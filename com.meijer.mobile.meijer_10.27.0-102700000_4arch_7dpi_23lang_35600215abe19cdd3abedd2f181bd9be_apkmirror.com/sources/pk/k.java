package pk;

import Jk.AppVersion;
import Qv.q;
import com.google.maps.internal.HttpHeaders;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lpk/k;", "Lokhttp3/Interceptor;", "LJk/a;", "appVersion", "<init>", "(LJk/a;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "a", "()Ljava/lang/String;", "LJk/a;", "b", "Ljava/lang/String;", "envName", "c", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class k implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String envName;

    public k(AppVersion appVersion) {
        Intrinsics.j(appVersion, "appVersion");
        this.appVersion = appVersion;
        appVersion = appVersion.getIsPlayStore() ? null : appVersion;
        String environment = appVersion != null ? appVersion.getEnvironment() : null;
        String upperCase = (environment == null ? "" : environment).toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        this.envName = upperCase;
    }

    public final String a() {
        return CollectionsKt.B0(CollectionsKt.r("Meijer" + this.envName + '/' + this.appVersion.getVersionCode(), "okhttp/" + q.VERSION, System.getProperty("http.agent")), " ", null, null, 0, null, null, 62, null);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        return chain.proceed(chain.request().g().m(HttpHeaders.USER_AGENT, a()).b());
    }
}

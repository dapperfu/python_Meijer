package C7;

import com.fullstory.FS;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LC7/b;", "", "<init>", "()V", "Lokhttp3/OkHttpClient$Builder;", "a", "()Lokhttp3/OkHttpClient$Builder;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3725a = new b();

    public final OkHttpClient.Builder a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.d(10L, timeUnit).b0(15L, timeUnit).V(15L, timeUnit);
    }

    private b() {
    }
}

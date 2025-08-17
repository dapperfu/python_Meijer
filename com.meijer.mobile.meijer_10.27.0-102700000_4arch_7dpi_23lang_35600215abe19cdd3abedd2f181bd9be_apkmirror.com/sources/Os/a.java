package Os;

import com.meijer.mobile.weeklyad.service.flipp.BuildConfig;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LOs/a;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "a", "()Lokhttp3/HttpUrl;", "", "b", "()Ljava/lang/String;", "c", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24411a = new a();

    public final HttpUrl a() {
        return HttpUrl.INSTANCE.c(BuildConfig.FLIPP_BASE_URL);
    }

    public final String b() {
        return BuildConfig.FLIPP_ACCESS_TOKEN;
    }

    public final String c() {
        return BuildConfig.FLIPP_MERCHANT_ID;
    }

    private a() {
    }
}

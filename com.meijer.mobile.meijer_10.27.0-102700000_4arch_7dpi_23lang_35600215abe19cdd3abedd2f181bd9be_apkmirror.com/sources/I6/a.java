package I6;

import com.medallia.digital.mobilesdk.l8;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "timeoutMillis", "LI6/c;", "a", "(J)LI6/c;", "Lokhttp3/OkHttpClient;", "okHttpClient", "b", "(Lokhttp3/OkHttpClient;)LI6/c;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class a {
    public static final c a(long j10) {
        return new j(j10);
    }

    public static final c b(OkHttpClient okHttpClient) {
        Intrinsics.j(okHttpClient, "okHttpClient");
        return new j(okHttpClient);
    }

    public static /* synthetic */ c c(long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = l8.b.f92525b;
        }
        return a(j10);
    }
}

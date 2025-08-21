package Mv;

import gw.C14419h;
import kotlin.Metadata;
import okhttp3.Response;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LMv/u;", "", "<init>", "()V", "Lokhttp3/m;", "webSocket", "Lokhttp3/Response;", "response", "", "f", "(Lokhttp3/m;Lokhttp3/Response;)V", "", "text", "e", "(Lokhttp3/m;Ljava/lang/String;)V", "Lgw/h;", "bytes", "d", "(Lokhttp3/m;Lgw/h;)V", "", "code", "reason", "b", "(Lokhttp3/m;ILjava/lang/String;)V", "a", "", "t", "c", "(Lokhttp3/m;Ljava/lang/Throwable;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class u {
    public abstract void a(okhttp3.m webSocket, int code, String reason);

    public abstract void b(okhttp3.m webSocket, int code, String reason);

    public abstract void c(okhttp3.m webSocket, Throwable t10, Response response);

    public abstract void d(okhttp3.m webSocket, C14419h bytes);

    public abstract void e(okhttp3.m webSocket, String text);

    public abstract void f(okhttp3.m webSocket, Response response);
}

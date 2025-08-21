package okhttp3;

import gw.L;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lokhttp3/d;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "LMv/b;", "responseCallback", "", "y1", "(LMv/b;)V", "cancel", "()V", "", "isCanceled", "()Z", "Lgw/L;", "timeout", "()Lgw/L;", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d extends Cloneable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lokhttp3/d$a;", "", "Lokhttp3/Request;", "request", "Lokhttp3/d;", "b", "(Lokhttp3/Request;)Lokhttp3/d;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        d b(Request request);
    }

    void cancel();

    Response execute() throws IOException;

    boolean isCanceled();

    Request request();

    L timeout();

    void y1(Mv.b responseCallback);
}

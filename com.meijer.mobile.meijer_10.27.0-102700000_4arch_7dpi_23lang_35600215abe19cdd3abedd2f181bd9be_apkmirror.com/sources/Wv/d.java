package Wv;

import Qv.s;
import Vv.o;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kw.I;
import kw.J;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#À\u0006\u0003"}, d2 = {"LWv/d;", "", "Lokhttp3/Request;", "request", "", "contentLength", "Lkw/I;", "d", "(Lokhttp3/Request;J)Lkw/I;", "", "e", "(Lokhttp3/Request;)V", "h", "()V", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "(Z)Lokhttp3/Response$a;", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Response;)J", "Lkw/J;", "b", "(Lokhttp3/Response;)Lkw/J;", "cancel", "LWv/d$a;", "i", "()LWv/d$a;", "carrier", "f", "()Z", "isResponseComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"LWv/d$a;", "", "LVv/o;", "call", "Ljava/io/IOException;", "e", "", "a", "(LVv/o;Ljava/io/IOException;)V", "d", "()V", "cancel", "LQv/s;", "f", "()LQv/s;", PlaceTypes.ROUTE, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(o call, IOException e10);

        void cancel();

        void d();

        /* renamed from: f */
        s getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String();
    }

    void a() throws IOException;

    J b(Response response) throws IOException;

    long c(Response response) throws IOException;

    void cancel();

    I d(Request request, long contentLength) throws IOException;

    void e(Request request) throws IOException;

    boolean f();

    Response.a g(boolean expectContinue) throws IOException;

    void h() throws IOException;

    /* renamed from: i */
    a getCarrier();
}

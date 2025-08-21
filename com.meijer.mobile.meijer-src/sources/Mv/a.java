package Mv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"LMv/a;", "", "LMv/s;", PlaceTypes.ROUTE, "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "a", "(LMv/s;Lokhttp3/Response;)Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f20441a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final a f20439b = new Companion.C0359a();

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final a f20440c = new Ov.a(null, 1, 0 == true ? 1 : 0);

    Request a(s route, Response response) throws IOException;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"LMv/a$a;", "", "<init>", "()V", "LMv/a;", "NONE", "LMv/a;", "JAVA_NET_AUTHENTICATOR", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Mv.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f20441a = new Companion();

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LMv/a$a$a;", "LMv/a;", "<init>", "()V", "LMv/s;", PlaceTypes.ROUTE, "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "a", "(LMv/s;Lokhttp3/Response;)Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: Mv.a$a$a, reason: collision with other inner class name */
        private static final class C0359a implements a {
            @Override // Mv.a
            public Request a(s route, Response response) {
                Intrinsics.j(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }
}

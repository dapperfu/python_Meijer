package Rv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"LRv/g;", "", "<init>", "()V", "LMv/s;", PlaceTypes.ROUTE, "Lokhttp3/d;", "call", "", "d", "(LMv/s;Lokhttp3/d;)V", "Ljava/io/IOException;", "Lokio/IOException;", "failure", "c", "(LMv/s;Lokhttp3/d;Ljava/io/IOException;)V", "LMv/f;", "connection", "b", "(LMv/f;LMv/s;Lokhttp3/d;)V", "f", "(LMv/f;)V", "e", "(LMv/f;Lokhttp3/d;)V", "g", "h", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final g f34104b = new a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRv/g$b;", "", "<init>", "()V", "LRv/g;", "NONE", "LRv/g;", "a", "()LRv/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Rv.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final g a() {
            return g.f34104b;
        }
    }

    public void b(Mv.f connection, Mv.s route, okhttp3.d call) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(route, "route");
        Intrinsics.j(call, "call");
    }

    public void c(Mv.s route, okhttp3.d call, IOException failure) {
        Intrinsics.j(route, "route");
        Intrinsics.j(call, "call");
        Intrinsics.j(failure, "failure");
    }

    public void d(Mv.s route, okhttp3.d call) {
        Intrinsics.j(route, "route");
        Intrinsics.j(call, "call");
    }

    public void e(Mv.f connection, okhttp3.d call) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(call, "call");
    }

    public void f(Mv.f connection) {
        Intrinsics.j(connection, "connection");
    }

    public void g(Mv.f connection, okhttp3.d call) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(call, "call");
    }

    public void h(Mv.f connection) {
        Intrinsics.j(connection, "connection");
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Rv/g$a", "LRv/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends g {
        a() {
        }
    }
}

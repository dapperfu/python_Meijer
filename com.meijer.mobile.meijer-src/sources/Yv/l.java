package Yv;

import Mv.r;
import Yv.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.Conscrypt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LYv/l;", "LYv/n;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "a", "()Z", "", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "LMv/r;", "protocols", "", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final m.a f43328b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f43329c;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Yv/l$a", "LYv/m$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "LYv/n;", "c", "(Ljavax/net/ssl/SSLSocket;)LYv/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements m.a {
        @Override // Yv.m.a
        public boolean b(SSLSocket sslSocket) {
            Intrinsics.j(sslSocket, "sslSocket");
            return l.INSTANCE.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // Yv.m.a
        public n c(SSLSocket sslSocket) {
            Intrinsics.j(sslSocket, "sslSocket");
            return new l();
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LYv/l$b;", "", "<init>", "()V", "", "major", "minor", "patch", "", "a", "(III)Z", "LYv/m$a;", "factory", "LYv/m$a;", "b", "()LYv/m$a;", "isSupported", "Z", "c", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean a(int major, int minor, int patch) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != major) {
                if (version.major() <= major) {
                    return false;
                }
                return true;
            }
            if (version.minor() != minor) {
                if (version.minor() <= minor) {
                    return false;
                }
                return true;
            }
            if (version.patch() < patch) {
                return false;
            }
            return true;
        }

        public final m.a b() {
            return l.f43328b;
        }

        public final boolean c() {
            return l.f43329c;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f43328b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f43329c = z10;
    }

    @Override // Yv.n
    public boolean a() {
        return f43329c;
    }

    @Override // Yv.n
    public boolean b(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // Yv.n
    public String c(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        if (b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // Yv.n
    public void d(SSLSocket sslSocket, String hostname, List<? extends r> protocols) {
        Intrinsics.j(sslSocket, "sslSocket");
        Intrinsics.j(protocols, "protocols");
        if (b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) okhttp3.internal.platform.c.INSTANCE.b(protocols).toArray(new String[0]));
        }
    }
}

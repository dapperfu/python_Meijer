package cw;

import Qv.r;
import cw.m;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcw/k;", "Lcw/n;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "a", "()Z", "", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "LQv/r;", "protocols", "", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final m.a f126797b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f126798c;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"cw/k$a", "Lcw/m$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lcw/n;", "c", "(Ljavax/net/ssl/SSLSocket;)Lcw/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements m.a {
        @Override // cw.m.a
        public boolean b(SSLSocket sslSocket) {
            Intrinsics.j(sslSocket, "sslSocket");
            k.INSTANCE.b();
            return false;
        }

        @Override // cw.m.a
        public n c(SSLSocket sslSocket) {
            Intrinsics.j(sslSocket, "sslSocket");
            return new k();
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcw/k$b;", "", "<init>", "()V", "Lcw/m$a;", "factory", "Lcw/m$a;", "a", "()Lcw/m$a;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: cw.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final m.a a() {
            return k.f126797b;
        }

        public final boolean b() {
            return k.f126798c;
        }
    }

    @Override // cw.n
    public boolean b(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        return false;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f126797b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f126798c = z10;
    }

    @Override // cw.n
    public boolean a() {
        return f126798c;
    }

    @Override // cw.n
    public String c(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.e(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // cw.n
    public void d(SSLSocket sslSocket, String hostname, List<? extends r> protocols) {
        Intrinsics.j(sslSocket, "sslSocket");
        Intrinsics.j(protocols, "protocols");
        if (b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.INSTANCE.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}

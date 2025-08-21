package Yv;

import Mv.r;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LYv/e;", "LYv/n;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "a", "()Z", "", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "LMv/r;", "protocols", "", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"NewApi"})
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LYv/e$a;", "", "<init>", "()V", "LYv/n;", "a", "()LYv/n;", "", "b", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean b() {
            return okhttp3.internal.platform.c.INSTANCE.f() && Build.VERSION.SDK_INT >= 29;
        }

        public final n a() {
            if (b()) {
                return new e();
            }
            return null;
        }
    }

    @Override // Yv.n
    public boolean a() {
        return INSTANCE.b();
    }

    @Override // Yv.n
    public boolean b(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // Yv.n
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!Intrinsics.e(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // Yv.n
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sslSocket, String hostname, List<? extends r> protocols) throws IOException {
        Intrinsics.j(sslSocket, "sslSocket");
        Intrinsics.j(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.INSTANCE.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}

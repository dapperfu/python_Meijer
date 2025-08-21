package okhttp3.internal.platform;

import Mv.r;
import bw.e;
import com.google.android.libraries.places.api.model.PlaceTypes;
import gw.C14416e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010'\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u001f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\u0006¨\u0006>"}, d2 = {"Lokhttp3/internal/platform/c;", "", "<init>", "()V", "", "g", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "LMv/r;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", PlaceTypes.ADDRESS, "", "connectTimeout", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "k", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "j", "(Ljava/lang/String;)Z", "closer", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lbw/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "Lbw/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lbw/e;", "Ljavax/net/ssl/SSLSocketFactory;", "o", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f154692b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f154693c;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/platform/c$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/c;", "d", "()Lokhttp3/internal/platform/c;", "e", "", "LMv/r;", "protocols", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)[B", "", "f", "()Z", "isAndroid", "platform", "Lokhttp3/internal/platform/c;", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: okhttp3.internal.platform.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c d() {
            return d.f154694a.a();
        }

        public final List<String> b(List<? extends r> protocols) {
            Intrinsics.j(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((r) obj) != r.f20500c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends r> protocols) {
            Intrinsics.j(protocols, "protocols");
            C14416e c14416e = new C14416e();
            for (String str : b(protocols)) {
                c14416e.writeByte(str.length());
                c14416e.G0(str);
            }
            return c14416e.d2();
        }

        public final boolean f() {
            return d.f154694a.c();
        }

        @JvmStatic
        public final c e() {
            return c.f154692b;
        }
    }

    public void b(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
    }

    public void e(SSLSocket sslSocket, String hostname, List<r> protocols) {
        throw null;
    }

    public String h(SSLSocket sslSocket) {
        throw null;
    }

    public boolean j(String hostname) {
        throw null;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f154692b = companion.d();
        f154693c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static /* synthetic */ void l(c cVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        cVar.k(str, i10, th2);
    }

    public bw.c c(X509TrustManager trustManager) {
        Intrinsics.j(trustManager, "trustManager");
        return new bw.a(d(trustManager));
    }

    public e d(X509TrustManager trustManager) {
        Intrinsics.j(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new bw.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.j(socket, "socket");
        Intrinsics.j(address, "address");
        socket.connect(address, connectTimeout);
    }

    public final String g() {
        return "OkHttp";
    }

    public Object i(String closer) {
        Intrinsics.j(closer, "closer");
        if (f154693c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public void k(String message, int level, Throwable t10) {
        Intrinsics.j(message, "message");
        f154693c.log(level == 5 ? Level.WARNING : Level.INFO, message, t10);
    }

    public void m(String message, Object stackTrace) {
        Intrinsics.j(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) stackTrace);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.i(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) throws KeyManagementException {
        Intrinsics.j(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            Intrinsics.i(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.g(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.i(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.i(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}

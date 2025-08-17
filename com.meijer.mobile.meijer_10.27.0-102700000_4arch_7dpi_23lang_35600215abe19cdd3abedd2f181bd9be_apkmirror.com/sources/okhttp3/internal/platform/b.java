package okhttp3.internal.platform;

import Qv.r;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import bw.e;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import cw.f;
import cw.j;
import cw.k;
import cw.l;
import cw.m;
import cw.n;
import cw.o;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u000289B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0011\u0010\u0018\u001a\r\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u00170\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R$\u00104\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106¨\u0006:"}, d2 = {"Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/c;", "Lbw/e;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", PlaceTypes.ADDRESS, "", "connectTimeout", "", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LQv/r;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "j", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lfw/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lfw/c;", "Lfw/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lfw/e;", "message", "level", "", "t", "k", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "Landroid/content/Context;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "applicationContext", "Lcw/n;", "Ljava/util/List;", "socketAdapters", "b", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class b extends c implements e {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f154377g = "OkHttp";

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f154378h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Context applicationContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<n> socketAdapters;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/b$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.internal.platform.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f154378h;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/platform/b$b;", "Lfw/e;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljava/lang/reflect/Method;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class CustomTrustRootIndex implements fw.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final X509TrustManager trustManager;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Method findByIssuerAndSignatureMethod;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return Intrinsics.e(this.trustManager, customTrustRootIndex.trustManager) && Intrinsics.e(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }

        public CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.j(trustManager, "trustManager");
            Intrinsics.j(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        @Override // fw.e
        public X509Certificate a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.j(cert, "cert");
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                Intrinsics.h(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    static {
        f154378h = c.INSTANCE.f() && Build.VERSION.SDK_INT < 29;
    }

    @Override // okhttp3.internal.platform.c
    public fw.c c(X509TrustManager trustManager) {
        Intrinsics.j(trustManager, "trustManager");
        f fVarA = f.INSTANCE.a(trustManager);
        return fVarA != null ? fVarA : super.c(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public fw.e d(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.g(declaredMethod);
            return new CustomTrustRootIndex(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void e(SSLSocket sslSocket, String hostname, List<r> protocols) {
        Object next;
        Intrinsics.j(sslSocket, "sslSocket");
        Intrinsics.j(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((n) next).b(sslSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void f(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        Intrinsics.j(socket, "socket");
        Intrinsics.j(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // bw.e
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // okhttp3.internal.platform.c
    public String h(SSLSocket sslSocket) {
        Object next;
        Intrinsics.j(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).b(sslSocket)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public boolean j(String hostname) {
        Intrinsics.j(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void k(String message, int level, Throwable t10) {
        Intrinsics.j(message, "message");
        if (level == 5) {
            FS.log_w(f154377g, message, t10);
        } else {
            FS.log_i(f154377g, message, t10);
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.n();
    }

    @Override // bw.e
    public void setApplicationContext(Context context) {
        this.applicationContext = context;
    }

    public b() {
        List listR = CollectionsKt.r(o.Companion.b(o.INSTANCE, null, 1, null), new m(j.INSTANCE.d()), new m(l.INSTANCE.b()), new m(k.INSTANCE.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((n) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }
}

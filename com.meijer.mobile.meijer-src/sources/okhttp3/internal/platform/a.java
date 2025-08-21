package okhttp3.internal.platform;

import Mv.r;
import Xv.e;
import Yv.f;
import Yv.j;
import Yv.k;
import Yv.l;
import Yv.m;
import Yv.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/¨\u00063"}, d2 = {"Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/c;", "LXv/e;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbw/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lbw/e;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LMv/r;", "protocols", "", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/String;)Z", "Lbw/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "Landroid/content/Context;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "applicationContext", "LYv/n;", "Ljava/util/List;", "socketAdapters", "f", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class a extends c implements e {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f154681g;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Context applicationContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<n> socketAdapters;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/a$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f154681g;
        }
    }

    static {
        f154681g = c.INSTANCE.f() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // okhttp3.internal.platform.c
    public bw.c c(X509TrustManager trustManager) {
        Intrinsics.j(trustManager, "trustManager");
        f fVarA = f.INSTANCE.a(trustManager);
        return fVarA != null ? fVarA : super.c(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public bw.e d(X509TrustManager trustManager) {
        Intrinsics.j(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public void e(SSLSocket sslSocket, String hostname, List<? extends r> protocols) {
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

    @Override // Xv.e
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
    public Object i(String closer) {
        Intrinsics.j(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.i(closer);
        }
        CloseGuard closeGuardA = Xv.b.a();
        closeGuardA.open(closer);
        return closeGuardA;
    }

    @Override // okhttp3.internal.platform.c
    @SuppressLint({"NewApi"})
    public boolean j(String hostname) {
        Intrinsics.j(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void m(String message, Object stackTrace) {
        Intrinsics.j(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.m(message, stackTrace);
        } else {
            Intrinsics.h(stackTrace, "null cannot be cast to non-null type android.util.CloseGuard");
            Xv.c.a(stackTrace).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.n();
    }

    @Override // Xv.e
    public void setApplicationContext(Context context) {
        this.applicationContext = context;
    }

    public a() {
        List listR = CollectionsKt.r(Yv.e.INSTANCE.a(), new m(j.INSTANCE.d()), new m(l.INSTANCE.b()), new m(k.INSTANCE.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((n) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }
}

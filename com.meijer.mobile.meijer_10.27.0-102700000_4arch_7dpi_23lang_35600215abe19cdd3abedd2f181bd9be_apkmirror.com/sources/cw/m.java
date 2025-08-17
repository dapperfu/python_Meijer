package cw;

import Qv.r;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcw/m;", "Lcw/n;", "Lcw/m$a;", "socketAdapterFactory", "<init>", "(Lcw/m$a;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", "(Ljavax/net/ssl/SSLSocket;)Lcw/n;", "", "a", "()Z", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "LQv/r;", "protocols", "", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lcw/m$a;", "Lcw/n;", "delegate", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a socketAdapterFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private n delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcw/m$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lcw/n;", "c", "(Ljavax/net/ssl/SSLSocket;)Lcw/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        boolean b(SSLSocket sslSocket);

        n c(SSLSocket sslSocket);
    }

    private final synchronized n e(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.b(sslSocket)) {
                this.delegate = this.socketAdapterFactory.c(sslSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.delegate;
    }

    @Override // cw.n
    public boolean a() {
        return true;
    }

    public m(a socketAdapterFactory) {
        Intrinsics.j(socketAdapterFactory, "socketAdapterFactory");
        this.socketAdapterFactory = socketAdapterFactory;
    }

    @Override // cw.n
    public boolean b(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        return this.socketAdapterFactory.b(sslSocket);
    }

    @Override // cw.n
    public String c(SSLSocket sslSocket) {
        Intrinsics.j(sslSocket, "sslSocket");
        n nVarE = e(sslSocket);
        if (nVarE != null) {
            return nVarE.c(sslSocket);
        }
        return null;
    }

    @Override // cw.n
    public void d(SSLSocket sslSocket, String hostname, List<? extends r> protocols) {
        Intrinsics.j(sslSocket, "sslSocket");
        Intrinsics.j(protocols, "protocols");
        n nVarE = e(sslSocket);
        if (nVarE != null) {
            nVarE.d(sslSocket, hostname, protocols);
        }
    }
}

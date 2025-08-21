package bw;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbw/c;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbw/c$a;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lbw/c;", "a", "(Ljavax/net/ssl/X509TrustManager;)Lbw/c;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: bw.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a(X509TrustManager trustManager) {
            Intrinsics.j(trustManager, "trustManager");
            return okhttp3.internal.platform.c.INSTANCE.e().c(trustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException;
}

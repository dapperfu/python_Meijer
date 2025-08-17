package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 #2\u00020\u0001:\u0001\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010!R\u0018\u0010&\u001a\u00020\u0014*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"Lokhttp3/i;", "", "Lokhttp3/l;", "tlsVersion", "Lokhttp3/e;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/l;Lokhttp3/e;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/l;", "g", "()Lokhttp3/l;", "b", "Lokhttp3/e;", "()Lokhttp3/e;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lkotlin/Lazy;", "e", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l tlsVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e cipherSuite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Certificate> localCertificates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy peerCertificates;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/i$a;", "", "<init>", "()V", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/i;", "c", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/i;", "Lokhttp3/l;", "tlsVersion", "Lokhttp3/e;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "peerCertificates", "localCertificates", "d", "(Lokhttp3/l;Lokhttp3/e;Ljava/util/List;Ljava/util/List;)Lokhttp3/i;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: okhttp3.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(List list) {
            return list;
        }

        private Companion() {
        }

        @JvmStatic
        @JvmName
        public final i c(SSLSession sSLSession) throws IOException {
            final List listM;
            Intrinsics.j(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.e(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.e(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            e eVarB = e.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.e("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            l lVarA = l.INSTANCE.a(protocol);
            try {
                listM = Rv.k.y(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM = CollectionsKt.m();
            }
            return new i(lVarA, eVarB, Rv.k.y(sSLSession.getLocalCertificates()), new Function0() { // from class: Qv.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.Companion.f(listM);
                }
            });
        }

        @JvmStatic
        public final i d(l tlsVersion, e cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            Intrinsics.j(tlsVersion, "tlsVersion");
            Intrinsics.j(cipherSuite, "cipherSuite");
            Intrinsics.j(peerCertificates, "peerCertificates");
            Intrinsics.j(localCertificates, "localCertificates");
            final List listX = Rv.k.x(peerCertificates);
            return new i(tlsVersion, cipherSuite, Rv.k.x(localCertificates), new Function0() { // from class: Qv.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.Companion.e(listX);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(l tlsVersion, e cipherSuite, List<? extends Certificate> localCertificates, final Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.j(tlsVersion, "tlsVersion");
        Intrinsics.j(cipherSuite, "cipherSuite");
        Intrinsics.j(localCertificates, "localCertificates");
        Intrinsics.j(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = LazyKt.b(new Function0() { // from class: Qv.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return okhttp3.i.f(peerCertificatesFn);
            }
        });
    }

    private final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final e getCipherSuite() {
        return this.cipherSuite;
    }

    @JvmName
    public final List<Certificate> d() {
        return this.localCertificates;
    }

    @JvmName
    public final List<Certificate> e() {
        return (List) this.peerCertificates.getValue();
    }

    public boolean equals(Object other) {
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return iVar.tlsVersion == this.tlsVersion && Intrinsics.e(iVar.cipherSuite, this.cipherSuite) && Intrinsics.e(iVar.e(), e()) && Intrinsics.e(iVar.localCertificates, this.localCertificates);
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final l getTlsVersion() {
        return this.tlsVersion;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + e().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(Function0 function0) {
        try {
            return (List) function0.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return CollectionsKt.m();
        }
    }

    public String toString() {
        List<Certificate> listE = e();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}

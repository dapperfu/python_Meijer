package Mv;

import gw.C14419h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0003(!\u000fB#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LMv/d;", "", "", "LMv/d$c;", "pins", "Lbw/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lbw/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "b", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "e", "(Ljava/lang/String;)Ljava/util/List;", "g", "(Lbw/c;)LMv/d;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lbw/c;", "f", "()Lbw/c;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final d f20446d = new a().a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<c> pins;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bw.c certificateChainCleaner;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LMv/d$a;", "", "<init>", "()V", "LMv/d;", "a", "()LMv/d;", "", "LMv/d$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<c> pins = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final d a() {
            return new d(CollectionsKt.o1(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LMv/d$b;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lgw/h;", "b", "(Ljava/security/cert/X509Certificate;)Lgw/h;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "LMv/d;", "DEFAULT", "LMv/d;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Mv.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String a(Certificate certificate) {
            Intrinsics.j(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).a();
        }

        @JvmStatic
        public final C14419h b(X509Certificate x509Certificate) {
            Intrinsics.j(x509Certificate, "<this>");
            C14419h.Companion companion = C14419h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.i(encoded, "getEncoded(...)");
            return C14419h.Companion.g(companion, encoded, 0, 0, 3, null).T();
        }

        @JvmStatic
        public final C14419h c(X509Certificate x509Certificate) {
            Intrinsics.j(x509Certificate, "<this>");
            C14419h.Companion companion = C14419h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.i(encoded, "getEncoded(...)");
            return C14419h.Companion.g(companion, encoded, 0, 0, 3, null).U();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"LMv/d$c;", "", "", "hostname", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "pattern", "b", "hashAlgorithm", "Lgw/h;", "Lgw/h;", "()Lgw/h;", "hash", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String pattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String hashAlgorithm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C14419h hash;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.e(this.pattern, cVar.pattern) && Intrinsics.e(this.hashAlgorithm, cVar.hashAlgorithm) && Intrinsics.e(this.hash, cVar.hash);
        }

        /* renamed from: a, reason: from getter */
        public final C14419h getHash() {
            return this.hash;
        }

        /* renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final boolean c(String hostname) {
            Intrinsics.j(hostname, "hostname");
            if (StringsKt.W(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return StringsKt.L(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!StringsKt.W(this.pattern, "*.", false, 2, null)) {
                return Intrinsics.e(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return StringsKt.L(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && StringsKt.w0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public d(Set<c> pins, bw.c cVar) {
        Intrinsics.j(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(d dVar, List list, String str) {
        List<Certificate> listA;
        bw.c cVar = dVar.certificateChainCleaner;
        if (cVar != null && (listA = cVar.a(list, str)) != null) {
            list = listA;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (Certificate certificate : list2) {
            Intrinsics.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final void b(final String hostname, final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.j(hostname, "hostname");
        Intrinsics.j(peerCertificates, "peerCertificates");
        d(hostname, new Function0() { // from class: Mv.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.c(this.f20442a, peerCertificates, hostname);
            }
        });
    }

    public final void d(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.j(hostname, "hostname");
        Intrinsics.j(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listE = e(hostname);
        if (listE.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            C14419h c14419hC = null;
            C14419h c14419hB = null;
            for (c cVar : listE) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                if (Intrinsics.e(hashAlgorithm, "sha256")) {
                    if (c14419hC == null) {
                        c14419hC = INSTANCE.c(x509Certificate);
                    }
                    if (Intrinsics.e(cVar.getHash(), c14419hC)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.e(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (c14419hB == null) {
                        c14419hB = INSTANCE.b(x509Certificate);
                    }
                    if (Intrinsics.e(cVar.getHash(), c14419hB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : listE) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final List<c> e(String hostname) {
        Intrinsics.j(hostname, "hostname");
        Set<c> set = this.pins;
        List<c> listM = CollectionsKt.m();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listM.isEmpty()) {
                    listM = new ArrayList<>();
                }
                Intrinsics.h(listM, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                TypeIntrinsics.c(listM).add(obj);
            }
        }
        return listM;
    }

    public boolean equals(Object other) {
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return Intrinsics.e(dVar.pins, this.pins) && Intrinsics.e(dVar.certificateChainCleaner, this.certificateChainCleaner);
    }

    /* renamed from: f, reason: from getter */
    public final bw.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final d g(bw.c certificateChainCleaner) {
        Intrinsics.j(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.e(this.certificateChainCleaner, certificateChainCleaner) ? this : new d(this.pins, certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        bw.c cVar = this.certificateChainCleaner;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ d(Set set, bw.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}

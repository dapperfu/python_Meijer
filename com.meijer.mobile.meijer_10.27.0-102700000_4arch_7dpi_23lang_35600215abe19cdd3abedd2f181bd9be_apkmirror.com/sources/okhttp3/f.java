package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u001e\u0011B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\"\u0010!R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\b#\u0010)R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\b,\u0010)¨\u0006."}, d2 = {"Lokhttp3/f;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "g", "(Ljavax/net/ssl/SSLSocket;Z)Lokhttp3/f;", "", "b", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "f", "()Z", "h", "c", "[Ljava/lang/String;", "d", "()[Ljava/lang/String;", "", "Lokhttp3/e;", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/l;", "i", "tlsVersions", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    private static final List<e> f154343f;

    /* renamed from: g, reason: collision with root package name */
    private static final List<e> f154344g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final f f154345h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final f f154346i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final f f154347j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final f f154348k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\t\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u0005¨\u0006("}, d2 = {"Lokhttp3/f$a;", "", "", "tls", "<init>", "(Z)V", "Lokhttp3/f;", "connectionSpec", "(Lokhttp3/f;)V", "", "Lokhttp3/e;", "cipherSuites", "c", "([Lokhttp3/e;)Lokhttp3/f$a;", "", "b", "([Ljava/lang/String;)Lokhttp3/f$a;", "Lokhttp3/l;", "tlsVersions", "f", "([Lokhttp3/l;)Lokhttp3/f$a;", "e", "supportsTlsExtensions", "d", "(Z)Lokhttp3/f$a;", "a", "()Lokhttp3/f;", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String[] cipherSuites;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String[] tlsVersions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(boolean z10) {
            this.tls = z10;
        }

        public final f a() {
            return new f(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final a b(String... cipherSuites) {
            Intrinsics.j(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.cipherSuites = (String[]) objArrCopyOf;
            return this;
        }

        public final a c(e... cipherSuites) {
            Intrinsics.j(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (e eVar : cipherSuites) {
                arrayList.add(eVar.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Deprecated
        public final a d(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        public final a e(String... tlsVersions) {
            Intrinsics.j(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.tlsVersions = (String[]) objArrCopyOf;
            return this;
        }

        public final a f(l... tlsVersions) {
            Intrinsics.j(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (l lVar : tlsVersions) {
                arrayList.add(lVar.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(f connectionSpec) {
            Intrinsics.j(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.getCipherSuitesAsString();
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.getSupportsTlsExtensions();
        }
    }

    static {
        e eVar = e.f154314o1;
        e eVar2 = e.f154317p1;
        e eVar3 = e.f154320q1;
        e eVar4 = e.f154272a1;
        e eVar5 = e.f154284e1;
        e eVar6 = e.f154275b1;
        e eVar7 = e.f154287f1;
        e eVar8 = e.f154305l1;
        e eVar9 = e.f154302k1;
        List<e> listP = CollectionsKt.p(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
        f154343f = listP;
        List<e> listP2 = CollectionsKt.p(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, e.f154242L0, e.f154244M0, e.f154298j0, e.f154301k0, e.f154233H, e.f154241L, e.f154303l);
        f154344g = listP2;
        a aVar = new a(true);
        e[] eVarArr = (e[]) listP.toArray(new e[0]);
        a aVarC = aVar.c((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        l lVar = l.f154422c;
        l lVar2 = l.f154423d;
        f154345h = aVarC.f(lVar, lVar2).d(true).a();
        a aVar2 = new a(true);
        e[] eVarArr2 = (e[]) listP2.toArray(new e[0]);
        f154346i = aVar2.c((e[]) Arrays.copyOf(eVarArr2, eVarArr2.length)).f(lVar, lVar2).d(true).a();
        a aVar3 = new a(true);
        e[] eVarArr3 = (e[]) listP2.toArray(new e[0]);
        f154347j = aVar3.c((e[]) Arrays.copyOf(eVarArr3, eVarArr3.length)).f(lVar, lVar2, l.f154424e, l.f154425f).d(true).a();
        f154348k = new a(false).a();
    }

    public final void b(SSLSocket sslSocket, boolean isFallback) {
        Intrinsics.j(sslSocket, "sslSocket");
        f fVarG = g(sslSocket, isFallback);
        if (fVarG.i() != null) {
            sslSocket.setEnabledProtocols(fVarG.tlsVersionsAsString);
        }
        if (fVarG.c() != null) {
            sslSocket.setEnabledCipherSuites(fVarG.cipherSuitesAsString);
        }
    }

    @JvmName
    public final List<e> c() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e.INSTANCE.b(str));
        }
        return arrayList;
    }

    /* renamed from: d, reason: from getter */
    public final String[] getCipherSuitesAsString() {
        return this.cipherSuitesAsString;
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.j(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !Rv.h.n(strArr, socket.getEnabledProtocols(), ComparisonsKt.f())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || Rv.h.n(strArr2, socket.getEnabledCipherSuites(), e.INSTANCE.c());
    }

    public boolean equals(Object other) {
        if (!(other instanceof f)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z10 = this.isTls;
        f fVar = (f) other;
        if (z10 != fVar.isTls) {
            return false;
        }
        return !z10 || (Arrays.equals(this.cipherSuitesAsString, fVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, fVar.tlsVersionsAsString) && this.supportsTlsExtensions == fVar.supportsTlsExtensions);
    }

    @JvmName
    /* renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    @JvmName
    /* renamed from: h, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    @JvmName
    public final List<l> i() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(l.INSTANCE.a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    public f(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.isTls = z10;
        this.supportsTlsExtensions = z11;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final f g(SSLSocket sslSocket, boolean isFallback) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        Intrinsics.g(enabledCipherSuites);
        String[] strArrC = Rv.a.c(this, enabledCipherSuites);
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.i(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = Rv.h.w(enabledProtocols2, this.tlsVersionsAsString, ComparisonsKt.f());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.g(supportedCipherSuites);
        int iO = Rv.h.o(supportedCipherSuites, "TLS_FALLBACK_SCSV", e.INSTANCE.c());
        if (isFallback && iO != -1) {
            String str = supportedCipherSuites[iO];
            Intrinsics.i(str, "get(...)");
            strArrC = Rv.h.g(strArrC, str);
        }
        return new a(this).b((String[]) Arrays.copyOf(strArrC, strArrC.length)).e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }
}

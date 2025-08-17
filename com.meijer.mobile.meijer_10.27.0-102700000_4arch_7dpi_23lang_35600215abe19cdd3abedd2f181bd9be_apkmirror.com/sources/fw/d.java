package fw;

import Rv.f;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.L;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfw/d;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "h", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "g", "b", "(Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Z", "pattern", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "c", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "e", "a", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f132420a = new d();

    private final boolean f(String hostname, String pattern) {
        if (hostname != null && hostname.length() != 0 && !StringsKt.W(hostname, ".", false, 2, null) && !StringsKt.G(hostname, "..", false, 2, null) && pattern != null && pattern.length() != 0 && !StringsKt.W(pattern, ".", false, 2, null) && !StringsKt.G(pattern, "..", false, 2, null)) {
            if (!StringsKt.G(hostname, ".", false, 2, null)) {
                hostname = hostname + '.';
            }
            String str = hostname;
            if (!StringsKt.G(pattern, ".", false, 2, null)) {
                pattern = pattern + '.';
            }
            String strB = b(pattern);
            if (!StringsKt.c0(strB, "*", false, 2, null)) {
                return Intrinsics.e(str, strB);
            }
            if (!StringsKt.W(strB, "*.", false, 2, null) || StringsKt.o0(strB, '*', 1, false, 4, null) != -1 || str.length() < strB.length() || Intrinsics.e("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            if (!StringsKt.G(str, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || StringsKt.v0(str, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final List<String> a(X509Certificate certificate) throws CertificateParsingException {
        Intrinsics.j(certificate, "certificate");
        return CollectionsKt.P0(c(certificate, 7), c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        Intrinsics.j(host, "host");
        Intrinsics.j(certificate, "certificate");
        return f.a(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.j(host, "host");
        Intrinsics.j(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    private d() {
    }

    private final String b(String str) {
        if (d(str)) {
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> c(X509Certificate certificate, int type) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.e(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.m();
        }
    }

    private final boolean d(String str) {
        if (str.length() != ((int) L.b(str, 0, 0, 3, null))) {
            return false;
        }
        return true;
    }

    private final boolean g(String hostname, X509Certificate certificate) throws CertificateParsingException {
        String strB = b(hostname);
        List<String> listC = c(certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (f132420a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String ipAddress, X509Certificate certificate) throws CertificateParsingException {
        String strK = f.k(ipAddress);
        List<String> listC = c(certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(strK, f.k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }
}

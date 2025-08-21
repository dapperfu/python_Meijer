package s6;

import android.content.Context;
import android.util.Pair;
import h6.C14478i;
import h6.E;
import h6.u;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final C17027g f160064a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC17026f f160065b;

    private C14478i a(Context context, String str, String str2) {
        C17027g c17027g;
        Pair<EnumC17023c, InputStream> pairA;
        E<C14478i> eL;
        if (str2 == null || (c17027g = this.f160064a) == null || (pairA = c17027g.a(str)) == null) {
            return null;
        }
        EnumC17023c enumC17023c = (EnumC17023c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f160066a[enumC17023c.ordinal()];
        if (i10 == 1) {
            eL = u.L(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            eL = u.u(inputStream, str2);
        } else {
            try {
                eL = u.u(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                eL = new E<>(e10);
            }
        }
        if (eL.b() != null) {
            return eL.b();
        }
        return null;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f160066a;

        static {
            int[] iArr = new int[EnumC17023c.values().length];
            f160066a = iArr;
            try {
                iArr[EnumC17023c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160066a[EnumC17023c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private E<C14478i> b(Context context, String str, String str2) throws IOException {
        E<C14478i> e10;
        v6.g.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC17024d interfaceC17024dA = this.f160065b.a(str);
                if (interfaceC17024dA.m1()) {
                    e10 = e(context, str, interfaceC17024dA.L0(), interfaceC17024dA.F0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(e10.b() != null);
                    v6.g.a(sb2.toString());
                } else {
                    e10 = new E<>(new IllegalArgumentException(interfaceC17024dA.E()));
                }
                try {
                    interfaceC17024dA.close();
                    return e10;
                } catch (IOException e11) {
                    v6.g.d("LottieFetchResult close failed ", e11);
                    return e10;
                }
            } catch (Exception e12) {
                E<C14478i> e13 = new E<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e14) {
                        v6.g.d("LottieFetchResult close failed ", e14);
                    }
                }
                return e13;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e15) {
                v6.g.d("LottieFetchResult close failed ", e15);
                throw th2;
            }
        }
    }

    private E<C14478i> d(String str, InputStream inputStream, String str2) throws IOException {
        C17027g c17027g;
        return (str2 == null || (c17027g = this.f160064a) == null) ? u.u(new GZIPInputStream(inputStream), null) : u.u(new GZIPInputStream(new FileInputStream(c17027g.g(str, inputStream, EnumC17023c.GZIP))), str);
    }

    private E<C14478i> e(Context context, String str, InputStream inputStream, String str2, String str3) throws NoSuchAlgorithmException, IOException {
        E<C14478i> eG;
        EnumC17023c enumC17023c;
        C17027g c17027g;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            v6.g.a("Handling zip response.");
            EnumC17023c enumC17023c2 = EnumC17023c.ZIP;
            eG = g(context, str, inputStream, str3);
            enumC17023c = enumC17023c2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            v6.g.a("Handling gzip response.");
            enumC17023c = EnumC17023c.GZIP;
            eG = d(str, inputStream, str3);
        } else {
            v6.g.a("Received json response.");
            enumC17023c = EnumC17023c.JSON;
            eG = f(str, inputStream, str3);
        }
        if (str3 != null && eG.b() != null && (c17027g = this.f160064a) != null) {
            c17027g.f(str, enumC17023c);
        }
        return eG;
    }

    private E<C14478i> f(String str, InputStream inputStream, String str2) throws IOException {
        C17027g c17027g;
        return (str2 == null || (c17027g = this.f160064a) == null) ? u.u(inputStream, null) : u.u(new FileInputStream(c17027g.g(str, inputStream, EnumC17023c.JSON).getAbsolutePath()), str);
    }

    private E<C14478i> g(Context context, String str, InputStream inputStream, String str2) throws IOException {
        C17027g c17027g;
        return (str2 == null || (c17027g = this.f160064a) == null) ? u.L(context, new ZipInputStream(inputStream), null) : u.L(context, new ZipInputStream(new FileInputStream(c17027g.g(str, inputStream, EnumC17023c.ZIP))), str);
    }

    public h(C17027g c17027g, InterfaceC17026f interfaceC17026f) {
        this.f160064a = c17027g;
        this.f160065b = interfaceC17026f;
    }

    public E<C14478i> c(Context context, String str, String str2) {
        C14478i c14478iA = a(context, str, str2);
        if (c14478iA != null) {
            return new E<>(c14478iA);
        }
        v6.g.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}

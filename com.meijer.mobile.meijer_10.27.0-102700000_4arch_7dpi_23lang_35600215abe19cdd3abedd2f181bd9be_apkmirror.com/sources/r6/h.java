package r6;

import android.content.Context;
import android.util.Pair;
import g6.C14209i;
import g6.E;
import g6.u;
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
    private final g f157849a;

    /* renamed from: b, reason: collision with root package name */
    private final f f157850b;

    private C14209i a(Context context, String str, String str2) {
        g gVar;
        Pair<EnumC16726c, InputStream> pairA;
        E<C14209i> eL;
        if (str2 == null || (gVar = this.f157849a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        EnumC16726c enumC16726c = (EnumC16726c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f157851a[enumC16726c.ordinal()];
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
        static final /* synthetic */ int[] f157851a;

        static {
            int[] iArr = new int[EnumC16726c.values().length];
            f157851a = iArr;
            try {
                iArr[EnumC16726c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f157851a[EnumC16726c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private E<C14209i> b(Context context, String str, String str2) throws IOException {
        E<C14209i> e10;
        u6.g.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC16727d interfaceC16727dA = this.f157850b.a(str);
                if (interfaceC16727dA.l1()) {
                    e10 = e(context, str, interfaceC16727dA.O0(), interfaceC16727dA.H0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(e10.b() != null);
                    u6.g.a(sb2.toString());
                } else {
                    e10 = new E<>(new IllegalArgumentException(interfaceC16727dA.E()));
                }
                try {
                    interfaceC16727dA.close();
                    return e10;
                } catch (IOException e11) {
                    u6.g.d("LottieFetchResult close failed ", e11);
                    return e10;
                }
            } catch (Exception e12) {
                E<C14209i> e13 = new E<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e14) {
                        u6.g.d("LottieFetchResult close failed ", e14);
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
                u6.g.d("LottieFetchResult close failed ", e15);
                throw th2;
            }
        }
    }

    private E<C14209i> d(String str, InputStream inputStream, String str2) throws IOException {
        g gVar;
        return (str2 == null || (gVar = this.f157849a) == null) ? u.u(new GZIPInputStream(inputStream), null) : u.u(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, EnumC16726c.GZIP))), str);
    }

    private E<C14209i> e(Context context, String str, InputStream inputStream, String str2, String str3) throws NoSuchAlgorithmException, IOException {
        E<C14209i> eG;
        EnumC16726c enumC16726c;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            u6.g.a("Handling zip response.");
            EnumC16726c enumC16726c2 = EnumC16726c.ZIP;
            eG = g(context, str, inputStream, str3);
            enumC16726c = enumC16726c2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            u6.g.a("Handling gzip response.");
            enumC16726c = EnumC16726c.GZIP;
            eG = d(str, inputStream, str3);
        } else {
            u6.g.a("Received json response.");
            enumC16726c = EnumC16726c.JSON;
            eG = f(str, inputStream, str3);
        }
        if (str3 != null && eG.b() != null && (gVar = this.f157849a) != null) {
            gVar.f(str, enumC16726c);
        }
        return eG;
    }

    private E<C14209i> f(String str, InputStream inputStream, String str2) throws IOException {
        g gVar;
        return (str2 == null || (gVar = this.f157849a) == null) ? u.u(inputStream, null) : u.u(new FileInputStream(gVar.g(str, inputStream, EnumC16726c.JSON).getAbsolutePath()), str);
    }

    private E<C14209i> g(Context context, String str, InputStream inputStream, String str2) throws IOException {
        g gVar;
        return (str2 == null || (gVar = this.f157849a) == null) ? u.L(context, new ZipInputStream(inputStream), null) : u.L(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, EnumC16726c.ZIP))), str);
    }

    public h(g gVar, f fVar) {
        this.f157849a = gVar;
        this.f157850b = fVar;
    }

    public E<C14209i> c(Context context, String str, String str2) {
        C14209i c14209iA = a(context, str, str2);
        if (c14209iA != null) {
            return new E<>(c14209iA);
        }
        u6.g.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}

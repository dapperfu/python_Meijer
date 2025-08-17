package g6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.q2;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kw.InterfaceC15330g;
import t6.AbstractC17067c;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, com.airbnb.lottie.q<C14209i>> f132974a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<G> f132975b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f132976c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f132977d = {31, -117, 8};

    public static com.airbnb.lottie.q<C14209i> K(ZipInputStream zipInputStream, String str) {
        return J(null, zipInputStream, str);
    }

    public static E<C14209i> L(Context context, ZipInputStream zipInputStream, String str) {
        return M(context, zipInputStream, str, true);
    }

    private static com.airbnb.lottie.q<C14209i> l(final String str, Callable<E<C14209i>> callable, Runnable runnable) {
        C14209i c14209iA = str == null ? null : n6.g.b().a(str);
        com.airbnb.lottie.q<C14209i> qVar = c14209iA != null ? new com.airbnb.lottie.q<>(c14209iA) : null;
        if (str != null) {
            Map<String, com.airbnb.lottie.q<C14209i>> map = f132974a;
            if (map.containsKey(str)) {
                qVar = map.get(str);
            }
        }
        if (qVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return qVar;
        }
        com.airbnb.lottie.q<C14209i> qVar2 = new com.airbnb.lottie.q<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qVar2.d(new InterfaceC14200A() { // from class: g6.o
                @Override // g6.InterfaceC14200A
                public final void onResult(Object obj) {
                    u.k(str, atomicBoolean, (C14209i) obj);
                }
            });
            qVar2.c(new InterfaceC14200A() { // from class: g6.p
                @Override // g6.InterfaceC14200A
                public final void onResult(Object obj) {
                    u.b(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, com.airbnb.lottie.q<C14209i>> map2 = f132974a;
                map2.put(str, qVar2);
                if (map2.size() == 1) {
                    S(false);
                }
            }
        }
        return qVar2;
    }

    public static com.airbnb.lottie.q<C14209i> r(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        return l(str, new Callable() { // from class: g6.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.s(applicationContext, inputStream, str);
            }
        }, null);
    }

    public static E<C14209i> u(InputStream inputStream, String str) {
        return v(inputStream, str, true);
    }

    public static E<C14209i> w(AbstractC17067c abstractC17067c, String str) {
        return x(abstractC17067c, str, true);
    }

    public static E<C14209i> z(kw.J j10, String str) {
        return A(j10, str, true);
    }

    public static com.airbnb.lottie.q<C14209i> B(final String str, final String str2) {
        return l(str2, new Callable() { // from class: g6.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.C(str, str2);
            }
        }, null);
    }

    public static E<C14209i> C(String str, String str2) {
        return z(kw.w.k(new ByteArrayInputStream(str.getBytes())), str2);
    }

    public static com.airbnb.lottie.q<C14209i> E(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: g6.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.d(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static E<C14209i> G(Context context, int i10, String str) {
        C14209i c14209iA = str == null ? null : n6.g.b().a(str);
        if (c14209iA != null) {
            return new E<>(c14209iA);
        }
        try {
            InterfaceC15330g interfaceC15330gD = kw.w.d(kw.w.k(context.getResources().openRawResource(i10)));
            if (Q(interfaceC15330gD).booleanValue()) {
                return L(context, new ZipInputStream(interfaceC15330gD.T3()), str);
            }
            if (!O(interfaceC15330gD).booleanValue()) {
                return w(AbstractC17067c.h(interfaceC15330gD), str);
            }
            try {
                return u(new GZIPInputStream(interfaceC15330gD.T3()), str);
            } catch (IOException e10) {
                return new E<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new E<>((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.q<C14209i> H(Context context, String str) {
        return I(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.q<C14209i> I(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: g6.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.c(context, str, str2);
            }
        }, null);
    }

    public static com.airbnb.lottie.q<C14209i> J(final Context context, final ZipInputStream zipInputStream, final String str) {
        return l(str, new Callable() { // from class: g6.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.L(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: g6.k
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                u6.q.c(zipInputStream);
            }
        });
    }

    private static E<C14209i> N(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        C14209i c14209iA;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c14209iA = null;
        } else {
            try {
                c14209iA = n6.g.b().a(str);
            } catch (IOException e10) {
                return new E<>((Throwable) e10);
            }
        }
        if (c14209iA != null) {
            return new E<>(c14209iA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C14209i c14209iB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c14209iB = y(AbstractC17067c.h(kw.w.d(kw.w.k(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(q2.f92724c);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(q2.f92724c);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new E<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream2 = new FileOutputStream(file);
                    } finally {
                    }
                } catch (Throwable th2) {
                    u6.g.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                }
                try {
                    byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int i10 = zipInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    fileOutputStream.close();
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        u6.g.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                } catch (Throwable th3) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c14209iB == null) {
            return new E<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            z zVarM = m(c14209iB, (String) entry.getKey());
            if (zVarM != null) {
                zVarM.g(u6.q.m((Bitmap) entry.getValue(), zVarM.f(), zVarM.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (n6.c cVar : c14209iB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                u6.g.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, z>> it = c14209iB.j().entrySet().iterator();
            while (it.hasNext()) {
                z value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strC = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.g(u6.q.m(bitmapDecodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        u6.g.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            n6.g.b().c(str, c14209iB);
        }
        return new E<>(c14209iB);
    }

    private static Boolean O(InterfaceC15330g interfaceC15330g) {
        return R(interfaceC15330g, f132977d);
    }

    private static Boolean Q(InterfaceC15330g interfaceC15330g) {
        return R(interfaceC15330g, f132976c);
    }

    private static void S(boolean z10) {
        ArrayList arrayList = new ArrayList(f132975b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((G) arrayList.get(i10)).a(z10);
        }
    }

    private static String T(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(P(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, com.airbnb.lottie.q<C14209i>> map = f132974a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    public static /* synthetic */ void k(String str, AtomicBoolean atomicBoolean, C14209i c14209i) {
        Map<String, com.airbnb.lottie.q<C14209i>> map = f132974a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    public static com.airbnb.lottie.q<C14209i> n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static E<C14209i> p(Context context, String str) {
        return q(context, str, "asset_" + str);
    }

    public static E<C14209i> q(Context context, String str, String str2) {
        C14209i c14209iA = str2 == null ? null : n6.g.b().a(str2);
        if (c14209iA != null) {
            return new E<>(c14209iA);
        }
        try {
            return s(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new E<>((Throwable) e10);
        }
    }

    public static E<C14209i> s(Context context, InputStream inputStream, String str) {
        C14209i c14209iA = str == null ? null : n6.g.b().a(str);
        if (c14209iA != null) {
            return new E<>(c14209iA);
        }
        try {
            InterfaceC15330g interfaceC15330gD = kw.w.d(kw.w.k(inputStream));
            return Q(interfaceC15330gD).booleanValue() ? L(context, new ZipInputStream(interfaceC15330gD.T3()), str) : O(interfaceC15330gD).booleanValue() ? u(new GZIPInputStream(interfaceC15330gD.T3()), str) : w(AbstractC17067c.h(interfaceC15330gD), str);
        } catch (IOException e10) {
            return new E<>((Throwable) e10);
        }
    }

    public static com.airbnb.lottie.q<C14209i> t(final InputStream inputStream, final String str) {
        return l(str, new Callable() { // from class: g6.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.u(inputStream, str);
            }
        }, new Runnable() { // from class: g6.m
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                u6.q.c(inputStream);
            }
        });
    }

    private static E<C14209i> y(AbstractC17067c abstractC17067c, String str, boolean z10) throws IOException {
        C14209i c14209iA;
        try {
            if (str == null) {
                c14209iA = null;
            } else {
                try {
                    c14209iA = n6.g.b().a(str);
                } catch (Exception e10) {
                    E<C14209i> e11 = new E<>(e10);
                    if (z10) {
                        u6.q.c(abstractC17067c);
                    }
                    return e11;
                }
            }
            if (c14209iA != null) {
                E<C14209i> e12 = new E<>(c14209iA);
                if (z10) {
                    u6.q.c(abstractC17067c);
                }
                return e12;
            }
            C14209i c14209iA2 = s6.w.a(abstractC17067c);
            if (str != null) {
                n6.g.b().c(str, c14209iA2);
            }
            E<C14209i> e13 = new E<>(c14209iA2);
            if (z10) {
                u6.q.c(abstractC17067c);
            }
            return e13;
        } catch (Throwable th2) {
            if (z10) {
                u6.q.c(abstractC17067c);
            }
            throw th2;
        }
    }

    public static E<C14209i> A(kw.J j10, String str, boolean z10) {
        return y(AbstractC17067c.h(kw.w.d(j10)), str, z10);
    }

    public static com.airbnb.lottie.q<C14209i> D(Context context, int i10) {
        return E(context, i10, T(context, i10));
    }

    public static E<C14209i> F(Context context, int i10) {
        return G(context, i10, T(context, i10));
    }

    public static E<C14209i> M(Context context, ZipInputStream zipInputStream, String str, boolean z10) throws IOException {
        try {
            return N(context, zipInputStream, str);
        } finally {
            if (z10) {
                u6.q.c(zipInputStream);
            }
        }
    }

    private static boolean P(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private static Boolean R(InterfaceC15330g interfaceC15330g, byte[] bArr) {
        try {
            InterfaceC15330g interfaceC15330gPeek = interfaceC15330g.peek();
            for (byte b10 : bArr) {
                if (interfaceC15330gPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            interfaceC15330gPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            u6.g.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ E c(Context context, String str, String str2) {
        E<C14209i> eC = C14205e.j(context).c(context, str, str2);
        if (str2 != null && eC.b() != null) {
            n6.g.b().c(str2, eC.b());
        }
        return eC;
    }

    public static /* synthetic */ E d(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return G(context, i10, str);
    }

    private static z m(C14209i c14209i, String str) {
        for (z zVar : c14209i.j().values()) {
            if (zVar.c().equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.q<C14209i> o(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: g6.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.q(applicationContext, str, str2);
            }
        }, null);
    }

    public static E<C14209i> v(InputStream inputStream, String str, boolean z10) {
        return A(kw.w.k(inputStream), str, z10);
    }

    public static E<C14209i> x(AbstractC17067c abstractC17067c, String str, boolean z10) {
        return y(abstractC17067c, str, z10);
    }
}

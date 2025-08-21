package h6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.q2;
import gw.InterfaceC14418g;
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
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, com.airbnb.lottie.q<C14478i>> f135150a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<G> f135151b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f135152c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f135153d = {31, -117, 8};

    public static com.airbnb.lottie.q<C14478i> K(ZipInputStream zipInputStream, String str) {
        return J(null, zipInputStream, str);
    }

    public static E<C14478i> L(Context context, ZipInputStream zipInputStream, String str) {
        return M(context, zipInputStream, str, true);
    }

    private static com.airbnb.lottie.q<C14478i> l(final String str, Callable<E<C14478i>> callable, Runnable runnable) {
        C14478i c14478iA = str == null ? null : o6.g.b().a(str);
        com.airbnb.lottie.q<C14478i> qVar = c14478iA != null ? new com.airbnb.lottie.q<>(c14478iA) : null;
        if (str != null) {
            Map<String, com.airbnb.lottie.q<C14478i>> map = f135150a;
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
        com.airbnb.lottie.q<C14478i> qVar2 = new com.airbnb.lottie.q<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qVar2.d(new InterfaceC14469A() { // from class: h6.o
                @Override // h6.InterfaceC14469A
                public final void onResult(Object obj) {
                    u.k(str, atomicBoolean, (C14478i) obj);
                }
            });
            qVar2.c(new InterfaceC14469A() { // from class: h6.p
                @Override // h6.InterfaceC14469A
                public final void onResult(Object obj) {
                    u.b(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, com.airbnb.lottie.q<C14478i>> map2 = f135150a;
                map2.put(str, qVar2);
                if (map2.size() == 1) {
                    S(false);
                }
            }
        }
        return qVar2;
    }

    public static com.airbnb.lottie.q<C14478i> r(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        return l(str, new Callable() { // from class: h6.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.s(applicationContext, inputStream, str);
            }
        }, null);
    }

    public static E<C14478i> u(InputStream inputStream, String str) {
        return v(inputStream, str, true);
    }

    public static E<C14478i> w(AbstractC17353c abstractC17353c, String str) {
        return x(abstractC17353c, str, true);
    }

    public static E<C14478i> z(gw.K k10, String str) {
        return A(k10, str, true);
    }

    public static com.airbnb.lottie.q<C14478i> B(final String str, final String str2) {
        return l(str2, new Callable() { // from class: h6.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.C(str, str2);
            }
        }, null);
    }

    public static E<C14478i> C(String str, String str2) {
        return z(gw.w.i(new ByteArrayInputStream(str.getBytes())), str2);
    }

    public static com.airbnb.lottie.q<C14478i> E(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: h6.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.d(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static E<C14478i> G(Context context, int i10, String str) {
        C14478i c14478iA = str == null ? null : o6.g.b().a(str);
        if (c14478iA != null) {
            return new E<>(c14478iA);
        }
        try {
            InterfaceC14418g interfaceC14418gC = gw.w.c(gw.w.i(context.getResources().openRawResource(i10)));
            if (Q(interfaceC14418gC).booleanValue()) {
                return L(context, new ZipInputStream(interfaceC14418gC.T3()), str);
            }
            if (!O(interfaceC14418gC).booleanValue()) {
                return w(AbstractC17353c.h(interfaceC14418gC), str);
            }
            try {
                return u(new GZIPInputStream(interfaceC14418gC.T3()), str);
            } catch (IOException e10) {
                return new E<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new E<>((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.q<C14478i> H(Context context, String str) {
        return I(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.q<C14478i> I(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: h6.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.c(context, str, str2);
            }
        }, null);
    }

    public static com.airbnb.lottie.q<C14478i> J(final Context context, final ZipInputStream zipInputStream, final String str) {
        return l(str, new Callable() { // from class: h6.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.L(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: h6.k
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                v6.q.c(zipInputStream);
            }
        });
    }

    private static E<C14478i> N(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        C14478i c14478iA;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c14478iA = null;
        } else {
            try {
                c14478iA = o6.g.b().a(str);
            } catch (IOException e10) {
                return new E<>((Throwable) e10);
            }
        }
        if (c14478iA != null) {
            return new E<>(c14478iA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C14478i c14478iB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c14478iB = y(AbstractC17353c.h(gw.w.c(gw.w.i(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(q2.f93563c);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(q2.f93563c);
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
                    v6.g.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
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
                        v6.g.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
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
        if (c14478iB == null) {
            return new E<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            z zVarM = m(c14478iB, (String) entry.getKey());
            if (zVarM != null) {
                zVarM.g(v6.q.m((Bitmap) entry.getValue(), zVarM.f(), zVarM.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (o6.c cVar : c14478iB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                v6.g.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, z>> it = c14478iB.j().entrySet().iterator();
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
                            value.g(v6.q.m(bitmapDecodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        v6.g.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            o6.g.b().c(str, c14478iB);
        }
        return new E<>(c14478iB);
    }

    private static Boolean O(InterfaceC14418g interfaceC14418g) {
        return R(interfaceC14418g, f135153d);
    }

    private static Boolean Q(InterfaceC14418g interfaceC14418g) {
        return R(interfaceC14418g, f135152c);
    }

    private static void S(boolean z10) {
        ArrayList arrayList = new ArrayList(f135151b);
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
        Map<String, com.airbnb.lottie.q<C14478i>> map = f135150a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    public static /* synthetic */ void k(String str, AtomicBoolean atomicBoolean, C14478i c14478i) {
        Map<String, com.airbnb.lottie.q<C14478i>> map = f135150a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    public static com.airbnb.lottie.q<C14478i> n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static E<C14478i> p(Context context, String str) {
        return q(context, str, "asset_" + str);
    }

    public static E<C14478i> q(Context context, String str, String str2) {
        C14478i c14478iA = str2 == null ? null : o6.g.b().a(str2);
        if (c14478iA != null) {
            return new E<>(c14478iA);
        }
        try {
            return s(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new E<>((Throwable) e10);
        }
    }

    public static E<C14478i> s(Context context, InputStream inputStream, String str) {
        C14478i c14478iA = str == null ? null : o6.g.b().a(str);
        if (c14478iA != null) {
            return new E<>(c14478iA);
        }
        try {
            InterfaceC14418g interfaceC14418gC = gw.w.c(gw.w.i(inputStream));
            return Q(interfaceC14418gC).booleanValue() ? L(context, new ZipInputStream(interfaceC14418gC.T3()), str) : O(interfaceC14418gC).booleanValue() ? u(new GZIPInputStream(interfaceC14418gC.T3()), str) : w(AbstractC17353c.h(interfaceC14418gC), str);
        } catch (IOException e10) {
            return new E<>((Throwable) e10);
        }
    }

    public static com.airbnb.lottie.q<C14478i> t(final InputStream inputStream, final String str) {
        return l(str, new Callable() { // from class: h6.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.u(inputStream, str);
            }
        }, new Runnable() { // from class: h6.m
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                v6.q.c(inputStream);
            }
        });
    }

    private static E<C14478i> y(AbstractC17353c abstractC17353c, String str, boolean z10) throws IOException {
        C14478i c14478iA;
        try {
            if (str == null) {
                c14478iA = null;
            } else {
                try {
                    c14478iA = o6.g.b().a(str);
                } catch (Exception e10) {
                    E<C14478i> e11 = new E<>(e10);
                    if (z10) {
                        v6.q.c(abstractC17353c);
                    }
                    return e11;
                }
            }
            if (c14478iA != null) {
                E<C14478i> e12 = new E<>(c14478iA);
                if (z10) {
                    v6.q.c(abstractC17353c);
                }
                return e12;
            }
            C14478i c14478iA2 = t6.w.a(abstractC17353c);
            if (str != null) {
                o6.g.b().c(str, c14478iA2);
            }
            E<C14478i> e13 = new E<>(c14478iA2);
            if (z10) {
                v6.q.c(abstractC17353c);
            }
            return e13;
        } catch (Throwable th2) {
            if (z10) {
                v6.q.c(abstractC17353c);
            }
            throw th2;
        }
    }

    public static E<C14478i> A(gw.K k10, String str, boolean z10) {
        return y(AbstractC17353c.h(gw.w.c(k10)), str, z10);
    }

    public static com.airbnb.lottie.q<C14478i> D(Context context, int i10) {
        return E(context, i10, T(context, i10));
    }

    public static E<C14478i> F(Context context, int i10) {
        return G(context, i10, T(context, i10));
    }

    public static E<C14478i> M(Context context, ZipInputStream zipInputStream, String str, boolean z10) throws IOException {
        try {
            return N(context, zipInputStream, str);
        } finally {
            if (z10) {
                v6.q.c(zipInputStream);
            }
        }
    }

    private static boolean P(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private static Boolean R(InterfaceC14418g interfaceC14418g, byte[] bArr) {
        try {
            InterfaceC14418g interfaceC14418gPeek = interfaceC14418g.peek();
            for (byte b10 : bArr) {
                if (interfaceC14418gPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            interfaceC14418gPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            v6.g.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ E c(Context context, String str, String str2) {
        E<C14478i> eC = C14474e.j(context).c(context, str, str2);
        if (str2 != null && eC.b() != null) {
            o6.g.b().c(str2, eC.b());
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

    private static z m(C14478i c14478i, String str) {
        for (z zVar : c14478i.j().values()) {
            if (zVar.c().equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.q<C14478i> o(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: h6.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.q(applicationContext, str, str2);
            }
        }, null);
    }

    public static E<C14478i> v(InputStream inputStream, String str, boolean z10) {
        return A(gw.w.i(inputStream), str, z10);
    }

    public static E<C14478i> x(AbstractC17353c abstractC17353c, String str, boolean z10) {
        return y(abstractC17353c, str, z10);
    }
}

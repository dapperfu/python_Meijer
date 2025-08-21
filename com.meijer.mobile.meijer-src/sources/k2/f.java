package k2;

import C.C3040z;
import Z.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.core.graphics.TypefaceCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k2.g;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    static final LruCache<String, Typeface> f141369a = new LruCache<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f141370b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f141371c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final n0<String, ArrayList<InterfaceC16068a<e>>> f141372d = new n0<>();

    class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f141373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f141374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k2.e f141375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f141376d;

        a(String str, Context context, k2.e eVar, int i10) {
            this.f141373a = str;
            this.f141374b = context;
            this.f141375c = eVar;
            this.f141376d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f141373a, this.f141374b, C3040z.a(new Object[]{this.f141375c}), this.f141376d);
        }
    }

    class b implements InterfaceC16068a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15079a f141377a;

        b(C15079a c15079a) {
            this.f141377a = c15079a;
        }

        @Override // o2.InterfaceC16068a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f141377a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f141378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f141379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f141380c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f141381d;

        c(String str, Context context, List list, int i10) {
            this.f141378a = str;
            this.f141379b = context;
            this.f141380c = list;
            this.f141381d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f141378a, this.f141379b, this.f141380c, this.f141381d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements InterfaceC16068a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f141382a;

        d(String str) {
            this.f141382a = str;
        }

        @Override // o2.InterfaceC16068a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f141371c) {
                try {
                    n0<String, ArrayList<InterfaceC16068a<e>>> n0Var = f.f141372d;
                    ArrayList<InterfaceC16068a<e>> arrayList = n0Var.get(this.f141382a);
                    if (arrayList == null) {
                        return;
                    }
                    n0Var.remove(this.f141382a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f141383a;

        /* renamed from: b, reason: collision with root package name */
        final int f141384b;

        e(int i10) {
            this.f141383a = null;
            this.f141384b = i10;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f141384b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f141383a = typeface;
            this.f141384b = 0;
        }
    }

    private static String a(List<k2.e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    static e c(String str, Context context, List<k2.e> list, int i10) {
        H4.a.c("getFontSync");
        try {
            LruCache<String, Typeface> lruCache = f141369a;
            Typeface typefaceD = lruCache.d(str);
            if (typefaceD != null) {
                return new e(typefaceD);
            }
            g.a aVarE = k2.d.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.b(context, null, aVarE.c(), i10) : TypefaceCompat.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            lruCache.f(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            H4.a.f();
        }
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            if (aVar.e() != 1) {
                return -3;
            }
            return -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static Typeface d(Context context, List<k2.e> list, int i10, Executor executor, C15079a c15079a) {
        String strA = a(list, i10);
        Typeface typefaceD = f141369a.d(strA);
        if (typefaceD != null) {
            c15079a.b(new e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(c15079a);
        synchronized (f141371c) {
            try {
                n0<String, ArrayList<InterfaceC16068a<e>>> n0Var = f141372d;
                ArrayList<InterfaceC16068a<e>> arrayList = n0Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC16068a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                n0Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f141370b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, k2.e eVar, C15079a c15079a, int i10, int i11) {
        String strA = a(C3040z.a(new Object[]{eVar}), i10);
        Typeface typefaceD = f141369a.d(strA);
        if (typefaceD != null) {
            c15079a.b(new e(typefaceD));
            return typefaceD;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, C3040z.a(new Object[]{eVar}), i10);
            c15079a.b(eVarC);
            return eVarC.f141383a;
        }
        try {
            e eVar2 = (e) h.d(f141370b, new a(strA, context, eVar, i10), i11);
            c15079a.b(eVar2);
            return eVar2.f141383a;
        } catch (InterruptedException unused) {
            c15079a.b(new e(-3));
            return null;
        }
    }
}

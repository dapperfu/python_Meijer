package androidx.core.graphics;

import C.C3040z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import b2.C6324e;
import b2.C6327h;
import com.fullstory.FS;
import java.util.List;
import k2.g;

/* loaded from: classes.dex */
public class TypefaceCompat {

    /* renamed from: a, reason: collision with root package name */
    private static final e f54088a;
    private static final LruCache<String, Typeface> sTypefaceCache;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private C6327h.e f54089a;

        @Override // k2.g.c
        public void a(int i10) {
            C6327h.e eVar = this.f54089a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // k2.g.c
        public void b(Typeface typeface) {
            C6327h.e eVar = this.f54089a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }

        public a(C6327h.e eVar) {
            this.f54089a = eVar;
        }
    }

    private static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceTypefaceCreateDerived = FS.typefaceCreateDerived(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceTypefaceCreateDerived)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    static {
        H4.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f54088a = new d();
        } else if (i10 >= 28) {
            f54088a = new c2.g();
        } else if (i10 >= 26) {
            f54088a = new c();
        } else if (b.k()) {
            f54088a = new b();
        } else {
            f54088a = new androidx.core.graphics.a();
        }
        sTypefaceCache = new LruCache<>(16);
        H4.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return FS.typefaceCreateDerived(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        H4.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f54088a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            H4.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        H4.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f54088a.c(context, cancellationSignal, list, i10);
        } finally {
            H4.a.f();
        }
    }

    public static Typeface d(Context context, C6324e.b bVar, Resources resources, int i10, String str, int i11, int i12, C6327h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof C6324e.C1188e) {
            C6324e.C1188e c1188e = (C6324e.C1188e) bVar;
            Typeface typefaceH = h(c1188e.d());
            if (typefaceH != null) {
                if (eVar != null) {
                    eVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = g.c(context, c1188e.a() != null ? C3040z.a(new Object[]{c1188e.c(), c1188e.a()}) : C3040z.a(new Object[]{c1188e.c()}), i12, !z10 ? eVar != null : c1188e.b() != 0, z10 ? c1188e.e() : -1, C6327h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f54088a.a(context, (C6324e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            sTypefaceCache.f(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceE = f54088a.e(context, resources, i10, str, i12);
        if (typefaceE != null) {
            sTypefaceCache.f(f(resources, i10, str, i11, i12), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return sTypefaceCache.d(f(resources, i10, str, i11, i12));
    }

    private TypefaceCompat() {
    }
}

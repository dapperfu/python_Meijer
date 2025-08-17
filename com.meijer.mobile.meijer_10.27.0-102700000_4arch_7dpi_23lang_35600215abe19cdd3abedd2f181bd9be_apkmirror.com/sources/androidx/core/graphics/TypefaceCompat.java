package androidx.core.graphics;

import C.C2982z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import b2.C6184e;
import b2.C6187h;
import com.fullstory.FS;
import java.util.List;
import k2.g;

/* loaded from: classes.dex */
public class TypefaceCompat {

    /* renamed from: a, reason: collision with root package name */
    private static final e f53864a;
    private static final LruCache<String, Typeface> sTypefaceCache;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        private C6187h.e f53865a;

        @Override // k2.g.c
        public void a(int i10) {
            C6187h.e eVar = this.f53865a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // k2.g.c
        public void b(Typeface typeface) {
            C6187h.e eVar = this.f53865a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }

        public a(C6187h.e eVar) {
            this.f53865a = eVar;
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
        G4.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f53864a = new d();
        } else if (i10 >= 28) {
            f53864a = new c2.g();
        } else if (i10 >= 26) {
            f53864a = new c();
        } else if (b.k()) {
            f53864a = new b();
        } else {
            f53864a = new androidx.core.graphics.a();
        }
        sTypefaceCache = new LruCache<>(16);
        G4.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return FS.typefaceCreateDerived(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        G4.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f53864a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            G4.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        G4.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f53864a.c(context, cancellationSignal, list, i10);
        } finally {
            G4.a.f();
        }
    }

    public static Typeface d(Context context, C6184e.b bVar, Resources resources, int i10, String str, int i11, int i12, C6187h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof C6184e.C1175e) {
            C6184e.C1175e c1175e = (C6184e.C1175e) bVar;
            Typeface typefaceH = h(c1175e.d());
            if (typefaceH != null) {
                if (eVar != null) {
                    eVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = g.c(context, c1175e.a() != null ? C2982z.a(new Object[]{c1175e.c(), c1175e.a()}) : C2982z.a(new Object[]{c1175e.c()}), i12, !z10 ? eVar != null : c1175e.b() != 0, z10 ? c1175e.e() : -1, C6187h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f53864a.a(context, (C6184e.c) bVar, resources, i12);
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
        Typeface typefaceE = f53864a.e(context, resources, i10, str, i12);
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

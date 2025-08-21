package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import b2.C6324e;
import c2.h;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k2.g;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, C6324e.c> f54117a = new ConcurrentHashMap<>();

    class a implements b<g.b> {
        a() {
        }

        @Override // androidx.core.graphics.e.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.e.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    private static <T> T g(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(bVar.b(t11) - i10) * 2) + (bVar.a(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, C6324e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        throw null;
    }

    private static <T> T f(T[] tArr, int i10, b<T> bVar) {
        return (T) g(tArr, (i10 & 1) == 0 ? HttpResponseStatus.ERROR_BAD_REQUEST : 700, (i10 & 2) != 0, bVar);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<g.b[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected g.b h(g.b[] bVarArr, int i10) {
        return (g.b) f(bVarArr, i10, new a());
    }

    e() {
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = h.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (!h.d(fileE, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(fileE.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = h.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (!h.c(fileE, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(fileE.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }
}

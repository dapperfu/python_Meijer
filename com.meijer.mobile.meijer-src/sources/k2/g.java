package k2;

import C.C3040z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.TypefaceCompat;
import java.util.Collections;
import java.util.List;
import o2.i;

/* loaded from: classes.dex */
public class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f141385a;

        /* renamed from: b, reason: collision with root package name */
        private final List<b[]> f141386b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f141385a = i10;
            this.f141386b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return this.f141386b.get(0);
        }

        public List<b[]> d() {
            return this.f141386b;
        }

        public int e() {
            return this.f141385a;
        }

        boolean f() {
            return this.f141386b.size() > 1;
        }

        a(int i10, List<b[]> list) {
            this.f141385a = i10;
            this.f141386b = list;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f141387a;

        /* renamed from: b, reason: collision with root package name */
        private final int f141388b;

        /* renamed from: c, reason: collision with root package name */
        private final int f141389c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f141390d;

        /* renamed from: e, reason: collision with root package name */
        private final int f141391e;

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f141391e;
        }

        public int c() {
            return this.f141388b;
        }

        public Uri d() {
            return this.f141387a;
        }

        public int e() {
            return this.f141389c;
        }

        public boolean f() {
            return this.f141390d;
        }

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f141387a = (Uri) i.g(uri);
            this.f141388b = i10;
            this.f141389c = i11;
            this.f141390d = z10;
            this.f141391e = i12;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return TypefaceCompat.b(context, cancellationSignal, bVarArr, 0);
    }

    public static Typeface c(Context context, List<e> list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C15079a c15079a = new C15079a(cVar, h.b(handler));
        if (!z10) {
            return f.d(context, list, i10, null, c15079a);
        }
        if (list.size() <= 1) {
            return f.e(context, list.get(0), c15079a, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, C3040z.a(new Object[]{eVar}), cancellationSignal);
    }
}

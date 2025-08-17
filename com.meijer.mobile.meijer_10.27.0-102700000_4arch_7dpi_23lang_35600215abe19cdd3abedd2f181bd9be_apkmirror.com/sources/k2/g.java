package k2;

import C.C2982z;
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
        private final int f141192a;

        /* renamed from: b, reason: collision with root package name */
        private final List<b[]> f141193b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f141192a = i10;
            this.f141193b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return this.f141193b.get(0);
        }

        public List<b[]> d() {
            return this.f141193b;
        }

        public int e() {
            return this.f141192a;
        }

        boolean f() {
            return this.f141193b.size() > 1;
        }

        a(int i10, List<b[]> list) {
            this.f141192a = i10;
            this.f141193b = list;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f141194a;

        /* renamed from: b, reason: collision with root package name */
        private final int f141195b;

        /* renamed from: c, reason: collision with root package name */
        private final int f141196c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f141197d;

        /* renamed from: e, reason: collision with root package name */
        private final int f141198e;

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f141198e;
        }

        public int c() {
            return this.f141195b;
        }

        public Uri d() {
            return this.f141194a;
        }

        public int e() {
            return this.f141196c;
        }

        public boolean f() {
            return this.f141197d;
        }

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f141194a = (Uri) i.g(uri);
            this.f141195b = i10;
            this.f141196c = i11;
            this.f141197d = z10;
            this.f141198e = i12;
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
        C15088a c15088a = new C15088a(cVar, h.b(handler));
        if (!z10) {
            return f.d(context, list, i10, null, c15088a);
        }
        if (list.size() <= 1) {
            return f.e(context, list.get(0), c15088a, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, C2982z.a(new Object[]{eVar}), cancellationSignal);
    }
}

package c3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d3.C13466a;
import d3.P;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6350a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f61391a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f61392b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f61393c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f61394d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61395e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61396f;

    /* renamed from: g, reason: collision with root package name */
    public final int f61397g;

    /* renamed from: h, reason: collision with root package name */
    public final float f61398h;

    /* renamed from: i, reason: collision with root package name */
    public final int f61399i;

    /* renamed from: j, reason: collision with root package name */
    public final float f61400j;

    /* renamed from: k, reason: collision with root package name */
    public final float f61401k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f61402l;

    /* renamed from: m, reason: collision with root package name */
    public final int f61403m;

    /* renamed from: n, reason: collision with root package name */
    public final int f61404n;

    /* renamed from: o, reason: collision with root package name */
    public final float f61405o;

    /* renamed from: p, reason: collision with root package name */
    public final int f61406p;

    /* renamed from: q, reason: collision with root package name */
    public final float f61407q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final C6350a f61382r = new b().o("").a();

    /* renamed from: s, reason: collision with root package name */
    private static final String f61383s = P.y0(0);

    /* renamed from: t, reason: collision with root package name */
    private static final String f61384t = P.y0(17);

    /* renamed from: u, reason: collision with root package name */
    private static final String f61385u = P.y0(1);

    /* renamed from: v, reason: collision with root package name */
    private static final String f61386v = P.y0(2);

    /* renamed from: w, reason: collision with root package name */
    private static final String f61387w = P.y0(3);

    /* renamed from: x, reason: collision with root package name */
    private static final String f61388x = P.y0(18);

    /* renamed from: y, reason: collision with root package name */
    private static final String f61389y = P.y0(4);

    /* renamed from: z, reason: collision with root package name */
    private static final String f61390z = P.y0(5);

    /* renamed from: A, reason: collision with root package name */
    private static final String f61371A = P.y0(6);

    /* renamed from: B, reason: collision with root package name */
    private static final String f61372B = P.y0(7);

    /* renamed from: C, reason: collision with root package name */
    private static final String f61373C = P.y0(8);

    /* renamed from: D, reason: collision with root package name */
    private static final String f61374D = P.y0(9);

    /* renamed from: E, reason: collision with root package name */
    private static final String f61375E = P.y0(10);

    /* renamed from: F, reason: collision with root package name */
    private static final String f61376F = P.y0(11);

    /* renamed from: G, reason: collision with root package name */
    private static final String f61377G = P.y0(12);

    /* renamed from: H, reason: collision with root package name */
    private static final String f61378H = P.y0(13);

    /* renamed from: I, reason: collision with root package name */
    private static final String f61379I = P.y0(14);

    /* renamed from: J, reason: collision with root package name */
    private static final String f61380J = P.y0(15);

    /* renamed from: K, reason: collision with root package name */
    private static final String f61381K = P.y0(16);

    /* renamed from: c3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f61408a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f61409b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f61410c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f61411d;

        /* renamed from: e, reason: collision with root package name */
        private float f61412e;

        /* renamed from: f, reason: collision with root package name */
        private int f61413f;

        /* renamed from: g, reason: collision with root package name */
        private int f61414g;

        /* renamed from: h, reason: collision with root package name */
        private float f61415h;

        /* renamed from: i, reason: collision with root package name */
        private int f61416i;

        /* renamed from: j, reason: collision with root package name */
        private int f61417j;

        /* renamed from: k, reason: collision with root package name */
        private float f61418k;

        /* renamed from: l, reason: collision with root package name */
        private float f61419l;

        /* renamed from: m, reason: collision with root package name */
        private float f61420m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f61421n;

        /* renamed from: o, reason: collision with root package name */
        private int f61422o;

        /* renamed from: p, reason: collision with root package name */
        private int f61423p;

        /* renamed from: q, reason: collision with root package name */
        private float f61424q;

        public b b() {
            this.f61421n = false;
            return this;
        }

        public b() {
            this.f61408a = null;
            this.f61409b = null;
            this.f61410c = null;
            this.f61411d = null;
            this.f61412e = -3.4028235E38f;
            this.f61413f = Integer.MIN_VALUE;
            this.f61414g = Integer.MIN_VALUE;
            this.f61415h = -3.4028235E38f;
            this.f61416i = Integer.MIN_VALUE;
            this.f61417j = Integer.MIN_VALUE;
            this.f61418k = -3.4028235E38f;
            this.f61419l = -3.4028235E38f;
            this.f61420m = -3.4028235E38f;
            this.f61421n = false;
            this.f61422o = -16777216;
            this.f61423p = Integer.MIN_VALUE;
        }

        public C6350a a() {
            return new C6350a(this.f61408a, this.f61410c, this.f61411d, this.f61409b, this.f61412e, this.f61413f, this.f61414g, this.f61415h, this.f61416i, this.f61417j, this.f61418k, this.f61419l, this.f61420m, this.f61421n, this.f61422o, this.f61423p, this.f61424q);
        }

        public int c() {
            return this.f61414g;
        }

        public int d() {
            return this.f61416i;
        }

        public CharSequence e() {
            return this.f61408a;
        }

        public b f(Bitmap bitmap) {
            this.f61409b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f61420m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f61412e = f10;
            this.f61413f = i10;
            return this;
        }

        public b i(int i10) {
            this.f61414g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f61411d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f61415h = f10;
            return this;
        }

        public b l(int i10) {
            this.f61416i = i10;
            return this;
        }

        public b m(float f10) {
            this.f61424q = f10;
            return this;
        }

        public b n(float f10) {
            this.f61419l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f61408a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f61410c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f61418k = f10;
            this.f61417j = i10;
            return this;
        }

        public b r(int i10) {
            this.f61423p = i10;
            return this;
        }

        public b s(int i10) {
            this.f61422o = i10;
            this.f61421n = true;
            return this;
        }

        private b(C6350a c6350a) {
            this.f61408a = c6350a.f61391a;
            this.f61409b = c6350a.f61394d;
            this.f61410c = c6350a.f61392b;
            this.f61411d = c6350a.f61393c;
            this.f61412e = c6350a.f61395e;
            this.f61413f = c6350a.f61396f;
            this.f61414g = c6350a.f61397g;
            this.f61415h = c6350a.f61398h;
            this.f61416i = c6350a.f61399i;
            this.f61417j = c6350a.f61404n;
            this.f61418k = c6350a.f61405o;
            this.f61419l = c6350a.f61400j;
            this.f61420m = c6350a.f61401k;
            this.f61421n = c6350a.f61402l;
            this.f61422o = c6350a.f61403m;
            this.f61423p = c6350a.f61406p;
            this.f61424q = c6350a.f61407q;
        }
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C6350a.class == obj.getClass()) {
            C6350a c6350a = (C6350a) obj;
            if (TextUtils.equals(this.f61391a, c6350a.f61391a) && this.f61392b == c6350a.f61392b && this.f61393c == c6350a.f61393c && ((bitmap = this.f61394d) != null ? !((bitmap2 = c6350a.f61394d) == null || !bitmap.sameAs(bitmap2)) : c6350a.f61394d == null) && this.f61395e == c6350a.f61395e && this.f61396f == c6350a.f61396f && this.f61397g == c6350a.f61397g && this.f61398h == c6350a.f61398h && this.f61399i == c6350a.f61399i && this.f61400j == c6350a.f61400j && this.f61401k == c6350a.f61401k && this.f61402l == c6350a.f61402l && this.f61403m == c6350a.f61403m && this.f61404n == c6350a.f61404n && this.f61405o == c6350a.f61405o && this.f61406p == c6350a.f61406p && this.f61407q == c6350a.f61407q) {
                return true;
            }
        }
        return false;
    }

    private C6350a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            C13466a.e(bitmap);
        } else {
            C13466a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f61391a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f61391a = charSequence.toString();
        } else {
            this.f61391a = null;
        }
        this.f61392b = alignment;
        this.f61393c = alignment2;
        this.f61394d = bitmap;
        this.f61395e = f10;
        this.f61396f = i10;
        this.f61397g = i11;
        this.f61398h = f11;
        this.f61399i = i12;
        this.f61400j = f13;
        this.f61401k = f14;
        this.f61402l = z10;
        this.f61403m = i14;
        this.f61404n = i13;
        this.f61405o = f12;
        this.f61406p = i15;
        this.f61407q = f15;
    }

    public static C6350a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f61383s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f61384t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C6352c.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f61385u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f61386v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f61387w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f61388x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f61389y;
        if (bundle.containsKey(str)) {
            String str2 = f61390z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f61371A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f61372B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f61373C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f61375E;
        if (bundle.containsKey(str6)) {
            String str7 = f61374D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f61376F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f61377G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f61378H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f61379I, false)) {
            bVar.b();
        }
        String str11 = f61380J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f61381K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f61391a;
        if (charSequence != null) {
            bundle.putCharSequence(f61383s, charSequence);
            CharSequence charSequence2 = this.f61391a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = C6352c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f61384t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f61385u, this.f61392b);
        bundle.putSerializable(f61386v, this.f61393c);
        bundle.putFloat(f61389y, this.f61395e);
        bundle.putInt(f61390z, this.f61396f);
        bundle.putInt(f61371A, this.f61397g);
        bundle.putFloat(f61372B, this.f61398h);
        bundle.putInt(f61373C, this.f61399i);
        bundle.putInt(f61374D, this.f61404n);
        bundle.putFloat(f61375E, this.f61405o);
        bundle.putFloat(f61376F, this.f61400j);
        bundle.putFloat(f61377G, this.f61401k);
        bundle.putBoolean(f61379I, this.f61402l);
        bundle.putInt(f61378H, this.f61403m);
        bundle.putInt(f61380J, this.f61406p);
        bundle.putFloat(f61381K, this.f61407q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public int hashCode() {
        return Objects.hash(this.f61391a, this.f61392b, this.f61393c, this.f61394d, Float.valueOf(this.f61395e), Integer.valueOf(this.f61396f), Integer.valueOf(this.f61397g), Float.valueOf(this.f61398h), Integer.valueOf(this.f61399i), Float.valueOf(this.f61400j), Float.valueOf(this.f61401k), Boolean.valueOf(this.f61402l), Integer.valueOf(this.f61403m), Integer.valueOf(this.f61404n), Float.valueOf(this.f61405o), Integer.valueOf(this.f61406p), Float.valueOf(this.f61407q));
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f61394d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C13466a.g(this.f61394d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f61388x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }
}

package c3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d3.C13599a;
import d3.P;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6476a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f61190a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f61191b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f61192c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f61193d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61194e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61195f;

    /* renamed from: g, reason: collision with root package name */
    public final int f61196g;

    /* renamed from: h, reason: collision with root package name */
    public final float f61197h;

    /* renamed from: i, reason: collision with root package name */
    public final int f61198i;

    /* renamed from: j, reason: collision with root package name */
    public final float f61199j;

    /* renamed from: k, reason: collision with root package name */
    public final float f61200k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f61201l;

    /* renamed from: m, reason: collision with root package name */
    public final int f61202m;

    /* renamed from: n, reason: collision with root package name */
    public final int f61203n;

    /* renamed from: o, reason: collision with root package name */
    public final float f61204o;

    /* renamed from: p, reason: collision with root package name */
    public final int f61205p;

    /* renamed from: q, reason: collision with root package name */
    public final float f61206q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final C6476a f61181r = new b().o("").a();

    /* renamed from: s, reason: collision with root package name */
    private static final String f61182s = P.y0(0);

    /* renamed from: t, reason: collision with root package name */
    private static final String f61183t = P.y0(17);

    /* renamed from: u, reason: collision with root package name */
    private static final String f61184u = P.y0(1);

    /* renamed from: v, reason: collision with root package name */
    private static final String f61185v = P.y0(2);

    /* renamed from: w, reason: collision with root package name */
    private static final String f61186w = P.y0(3);

    /* renamed from: x, reason: collision with root package name */
    private static final String f61187x = P.y0(18);

    /* renamed from: y, reason: collision with root package name */
    private static final String f61188y = P.y0(4);

    /* renamed from: z, reason: collision with root package name */
    private static final String f61189z = P.y0(5);

    /* renamed from: A, reason: collision with root package name */
    private static final String f61170A = P.y0(6);

    /* renamed from: B, reason: collision with root package name */
    private static final String f61171B = P.y0(7);

    /* renamed from: C, reason: collision with root package name */
    private static final String f61172C = P.y0(8);

    /* renamed from: D, reason: collision with root package name */
    private static final String f61173D = P.y0(9);

    /* renamed from: E, reason: collision with root package name */
    private static final String f61174E = P.y0(10);

    /* renamed from: F, reason: collision with root package name */
    private static final String f61175F = P.y0(11);

    /* renamed from: G, reason: collision with root package name */
    private static final String f61176G = P.y0(12);

    /* renamed from: H, reason: collision with root package name */
    private static final String f61177H = P.y0(13);

    /* renamed from: I, reason: collision with root package name */
    private static final String f61178I = P.y0(14);

    /* renamed from: J, reason: collision with root package name */
    private static final String f61179J = P.y0(15);

    /* renamed from: K, reason: collision with root package name */
    private static final String f61180K = P.y0(16);

    /* renamed from: c3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f61207a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f61208b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f61209c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f61210d;

        /* renamed from: e, reason: collision with root package name */
        private float f61211e;

        /* renamed from: f, reason: collision with root package name */
        private int f61212f;

        /* renamed from: g, reason: collision with root package name */
        private int f61213g;

        /* renamed from: h, reason: collision with root package name */
        private float f61214h;

        /* renamed from: i, reason: collision with root package name */
        private int f61215i;

        /* renamed from: j, reason: collision with root package name */
        private int f61216j;

        /* renamed from: k, reason: collision with root package name */
        private float f61217k;

        /* renamed from: l, reason: collision with root package name */
        private float f61218l;

        /* renamed from: m, reason: collision with root package name */
        private float f61219m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f61220n;

        /* renamed from: o, reason: collision with root package name */
        private int f61221o;

        /* renamed from: p, reason: collision with root package name */
        private int f61222p;

        /* renamed from: q, reason: collision with root package name */
        private float f61223q;

        public b b() {
            this.f61220n = false;
            return this;
        }

        public b() {
            this.f61207a = null;
            this.f61208b = null;
            this.f61209c = null;
            this.f61210d = null;
            this.f61211e = -3.4028235E38f;
            this.f61212f = Integer.MIN_VALUE;
            this.f61213g = Integer.MIN_VALUE;
            this.f61214h = -3.4028235E38f;
            this.f61215i = Integer.MIN_VALUE;
            this.f61216j = Integer.MIN_VALUE;
            this.f61217k = -3.4028235E38f;
            this.f61218l = -3.4028235E38f;
            this.f61219m = -3.4028235E38f;
            this.f61220n = false;
            this.f61221o = -16777216;
            this.f61222p = Integer.MIN_VALUE;
        }

        public C6476a a() {
            return new C6476a(this.f61207a, this.f61209c, this.f61210d, this.f61208b, this.f61211e, this.f61212f, this.f61213g, this.f61214h, this.f61215i, this.f61216j, this.f61217k, this.f61218l, this.f61219m, this.f61220n, this.f61221o, this.f61222p, this.f61223q);
        }

        public int c() {
            return this.f61213g;
        }

        public int d() {
            return this.f61215i;
        }

        public CharSequence e() {
            return this.f61207a;
        }

        public b f(Bitmap bitmap) {
            this.f61208b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f61219m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f61211e = f10;
            this.f61212f = i10;
            return this;
        }

        public b i(int i10) {
            this.f61213g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f61210d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f61214h = f10;
            return this;
        }

        public b l(int i10) {
            this.f61215i = i10;
            return this;
        }

        public b m(float f10) {
            this.f61223q = f10;
            return this;
        }

        public b n(float f10) {
            this.f61218l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f61207a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f61209c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f61217k = f10;
            this.f61216j = i10;
            return this;
        }

        public b r(int i10) {
            this.f61222p = i10;
            return this;
        }

        public b s(int i10) {
            this.f61221o = i10;
            this.f61220n = true;
            return this;
        }

        private b(C6476a c6476a) {
            this.f61207a = c6476a.f61190a;
            this.f61208b = c6476a.f61193d;
            this.f61209c = c6476a.f61191b;
            this.f61210d = c6476a.f61192c;
            this.f61211e = c6476a.f61194e;
            this.f61212f = c6476a.f61195f;
            this.f61213g = c6476a.f61196g;
            this.f61214h = c6476a.f61197h;
            this.f61215i = c6476a.f61198i;
            this.f61216j = c6476a.f61203n;
            this.f61217k = c6476a.f61204o;
            this.f61218l = c6476a.f61199j;
            this.f61219m = c6476a.f61200k;
            this.f61220n = c6476a.f61201l;
            this.f61221o = c6476a.f61202m;
            this.f61222p = c6476a.f61205p;
            this.f61223q = c6476a.f61206q;
        }
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C6476a.class == obj.getClass()) {
            C6476a c6476a = (C6476a) obj;
            if (TextUtils.equals(this.f61190a, c6476a.f61190a) && this.f61191b == c6476a.f61191b && this.f61192c == c6476a.f61192c && ((bitmap = this.f61193d) != null ? !((bitmap2 = c6476a.f61193d) == null || !bitmap.sameAs(bitmap2)) : c6476a.f61193d == null) && this.f61194e == c6476a.f61194e && this.f61195f == c6476a.f61195f && this.f61196g == c6476a.f61196g && this.f61197h == c6476a.f61197h && this.f61198i == c6476a.f61198i && this.f61199j == c6476a.f61199j && this.f61200k == c6476a.f61200k && this.f61201l == c6476a.f61201l && this.f61202m == c6476a.f61202m && this.f61203n == c6476a.f61203n && this.f61204o == c6476a.f61204o && this.f61205p == c6476a.f61205p && this.f61206q == c6476a.f61206q) {
                return true;
            }
        }
        return false;
    }

    private C6476a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            C13599a.e(bitmap);
        } else {
            C13599a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f61190a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f61190a = charSequence.toString();
        } else {
            this.f61190a = null;
        }
        this.f61191b = alignment;
        this.f61192c = alignment2;
        this.f61193d = bitmap;
        this.f61194e = f10;
        this.f61195f = i10;
        this.f61196g = i11;
        this.f61197h = f11;
        this.f61198i = i12;
        this.f61199j = f13;
        this.f61200k = f14;
        this.f61201l = z10;
        this.f61202m = i14;
        this.f61203n = i13;
        this.f61204o = f12;
        this.f61205p = i15;
        this.f61206q = f15;
    }

    public static C6476a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f61182s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f61183t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C6478c.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f61184u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f61185v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f61186w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f61187x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f61188y;
        if (bundle.containsKey(str)) {
            String str2 = f61189z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f61170A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f61171B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f61172C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f61174E;
        if (bundle.containsKey(str6)) {
            String str7 = f61173D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f61175F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f61176G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f61177H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f61178I, false)) {
            bVar.b();
        }
        String str11 = f61179J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f61180K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f61190a;
        if (charSequence != null) {
            bundle.putCharSequence(f61182s, charSequence);
            CharSequence charSequence2 = this.f61190a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = C6478c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f61183t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f61184u, this.f61191b);
        bundle.putSerializable(f61185v, this.f61192c);
        bundle.putFloat(f61188y, this.f61194e);
        bundle.putInt(f61189z, this.f61195f);
        bundle.putInt(f61170A, this.f61196g);
        bundle.putFloat(f61171B, this.f61197h);
        bundle.putInt(f61172C, this.f61198i);
        bundle.putInt(f61173D, this.f61203n);
        bundle.putFloat(f61174E, this.f61204o);
        bundle.putFloat(f61175F, this.f61199j);
        bundle.putFloat(f61176G, this.f61200k);
        bundle.putBoolean(f61178I, this.f61201l);
        bundle.putInt(f61177H, this.f61202m);
        bundle.putInt(f61179J, this.f61205p);
        bundle.putFloat(f61180K, this.f61206q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public int hashCode() {
        return Objects.hash(this.f61190a, this.f61191b, this.f61192c, this.f61193d, Float.valueOf(this.f61194e), Integer.valueOf(this.f61195f), Integer.valueOf(this.f61196g), Float.valueOf(this.f61197h), Integer.valueOf(this.f61198i), Float.valueOf(this.f61199j), Float.valueOf(this.f61200k), Boolean.valueOf(this.f61201l), Integer.valueOf(this.f61202m), Integer.valueOf(this.f61203n), Float.valueOf(this.f61204o), Integer.valueOf(this.f61205p), Float.valueOf(this.f61206q));
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f61193d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C13599a.g(this.f61193d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f61187x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }
}

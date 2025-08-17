package ce;

import ae.d;
import ae.i;
import ae.j;
import ae.k;
import ae.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.s;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.Locale;
import oe.C16026c;
import oe.C16027d;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ce.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6387b {

    /* renamed from: a, reason: collision with root package name */
    private final a f61713a;

    /* renamed from: b, reason: collision with root package name */
    private final a f61714b;

    /* renamed from: c, reason: collision with root package name */
    final float f61715c;

    /* renamed from: d, reason: collision with root package name */
    final float f61716d;

    /* renamed from: e, reason: collision with root package name */
    final float f61717e;

    /* renamed from: f, reason: collision with root package name */
    final float f61718f;

    /* renamed from: g, reason: collision with root package name */
    final float f61719g;

    /* renamed from: h, reason: collision with root package name */
    final float f61720h;

    /* renamed from: i, reason: collision with root package name */
    final int f61721i;

    /* renamed from: j, reason: collision with root package name */
    final int f61722j;

    /* renamed from: k, reason: collision with root package name */
    int f61723k;

    /* renamed from: ce.b$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1219a();

        /* renamed from: A, reason: collision with root package name */
        private Integer f61724A;

        /* renamed from: B, reason: collision with root package name */
        private Integer f61725B;

        /* renamed from: C, reason: collision with root package name */
        private Integer f61726C;

        /* renamed from: D, reason: collision with root package name */
        private Boolean f61727D;

        /* renamed from: a, reason: collision with root package name */
        private int f61728a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f61729b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f61730c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f61731d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f61732e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f61733f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f61734g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f61735h;

        /* renamed from: i, reason: collision with root package name */
        private int f61736i;

        /* renamed from: j, reason: collision with root package name */
        private String f61737j;

        /* renamed from: k, reason: collision with root package name */
        private int f61738k;

        /* renamed from: l, reason: collision with root package name */
        private int f61739l;

        /* renamed from: m, reason: collision with root package name */
        private int f61740m;

        /* renamed from: n, reason: collision with root package name */
        private Locale f61741n;

        /* renamed from: o, reason: collision with root package name */
        private CharSequence f61742o;

        /* renamed from: p, reason: collision with root package name */
        private CharSequence f61743p;

        /* renamed from: q, reason: collision with root package name */
        private int f61744q;

        /* renamed from: r, reason: collision with root package name */
        private int f61745r;

        /* renamed from: s, reason: collision with root package name */
        private Integer f61746s;

        /* renamed from: t, reason: collision with root package name */
        private Boolean f61747t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f61748u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f61749v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f61750w;

        /* renamed from: x, reason: collision with root package name */
        private Integer f61751x;

        /* renamed from: y, reason: collision with root package name */
        private Integer f61752y;

        /* renamed from: z, reason: collision with root package name */
        private Integer f61753z;

        /* renamed from: ce.b$a$a, reason: collision with other inner class name */
        class C1219a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            C1219a() {
            }
        }

        public a() {
            this.f61736i = l3.f92484c;
            this.f61738k = -2;
            this.f61739l = -2;
            this.f61740m = -2;
            this.f61747t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f61728a);
            parcel.writeSerializable(this.f61729b);
            parcel.writeSerializable(this.f61730c);
            parcel.writeSerializable(this.f61731d);
            parcel.writeSerializable(this.f61732e);
            parcel.writeSerializable(this.f61733f);
            parcel.writeSerializable(this.f61734g);
            parcel.writeSerializable(this.f61735h);
            parcel.writeInt(this.f61736i);
            parcel.writeString(this.f61737j);
            parcel.writeInt(this.f61738k);
            parcel.writeInt(this.f61739l);
            parcel.writeInt(this.f61740m);
            CharSequence charSequence = this.f61742o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f61743p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f61744q);
            parcel.writeSerializable(this.f61746s);
            parcel.writeSerializable(this.f61748u);
            parcel.writeSerializable(this.f61749v);
            parcel.writeSerializable(this.f61750w);
            parcel.writeSerializable(this.f61751x);
            parcel.writeSerializable(this.f61752y);
            parcel.writeSerializable(this.f61753z);
            parcel.writeSerializable(this.f61726C);
            parcel.writeSerializable(this.f61724A);
            parcel.writeSerializable(this.f61725B);
            parcel.writeSerializable(this.f61747t);
            parcel.writeSerializable(this.f61741n);
            parcel.writeSerializable(this.f61727D);
        }

        a(Parcel parcel) {
            this.f61736i = l3.f92484c;
            this.f61738k = -2;
            this.f61739l = -2;
            this.f61740m = -2;
            this.f61747t = Boolean.TRUE;
            this.f61728a = parcel.readInt();
            this.f61729b = (Integer) parcel.readSerializable();
            this.f61730c = (Integer) parcel.readSerializable();
            this.f61731d = (Integer) parcel.readSerializable();
            this.f61732e = (Integer) parcel.readSerializable();
            this.f61733f = (Integer) parcel.readSerializable();
            this.f61734g = (Integer) parcel.readSerializable();
            this.f61735h = (Integer) parcel.readSerializable();
            this.f61736i = parcel.readInt();
            this.f61737j = parcel.readString();
            this.f61738k = parcel.readInt();
            this.f61739l = parcel.readInt();
            this.f61740m = parcel.readInt();
            this.f61742o = parcel.readString();
            this.f61743p = parcel.readString();
            this.f61744q = parcel.readInt();
            this.f61746s = (Integer) parcel.readSerializable();
            this.f61748u = (Integer) parcel.readSerializable();
            this.f61749v = (Integer) parcel.readSerializable();
            this.f61750w = (Integer) parcel.readSerializable();
            this.f61751x = (Integer) parcel.readSerializable();
            this.f61752y = (Integer) parcel.readSerializable();
            this.f61753z = (Integer) parcel.readSerializable();
            this.f61726C = (Integer) parcel.readSerializable();
            this.f61724A = (Integer) parcel.readSerializable();
            this.f61725B = (Integer) parcel.readSerializable();
            this.f61747t = (Boolean) parcel.readSerializable();
            this.f61741n = (Locale) parcel.readSerializable();
            this.f61727D = (Boolean) parcel.readSerializable();
        }
    }

    C6387b(Context context, int i10, int i11, int i12, a aVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        a aVar2 = new a();
        this.f61714b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f61728a = i10;
        }
        TypedArray typedArrayB = b(context, aVar.f61728a, i11, i12);
        Resources resources = context.getResources();
        this.f61715c = typedArrayB.getDimensionPixelSize(l.f44931K, -1);
        this.f61721i = context.getResources().getDimensionPixelSize(d.f44588X);
        this.f61722j = context.getResources().getDimensionPixelSize(d.f44590Z);
        this.f61716d = typedArrayB.getDimensionPixelSize(l.f45045U, -1);
        this.f61717e = typedArrayB.getDimension(l.f45023S, resources.getDimension(d.f44623q));
        this.f61719g = typedArrayB.getDimension(l.f45078X, resources.getDimension(d.f44625r));
        this.f61718f = typedArrayB.getDimension(l.f44919J, resources.getDimension(d.f44623q));
        this.f61720h = typedArrayB.getDimension(l.f45034T, resources.getDimension(d.f44625r));
        boolean z10 = true;
        this.f61723k = typedArrayB.getInt(l.f45160e0, 1);
        aVar2.f61736i = aVar.f61736i == -2 ? l3.f92484c : aVar.f61736i;
        if (aVar.f61738k != -2) {
            aVar2.f61738k = aVar.f61738k;
        } else if (typedArrayB.hasValue(l.f45148d0)) {
            aVar2.f61738k = typedArrayB.getInt(l.f45148d0, 0);
        } else {
            aVar2.f61738k = -1;
        }
        if (aVar.f61737j != null) {
            aVar2.f61737j = aVar.f61737j;
        } else if (typedArrayB.hasValue(l.f44967N)) {
            aVar2.f61737j = typedArrayB.getString(l.f44967N);
        }
        aVar2.f61742o = aVar.f61742o;
        aVar2.f61743p = aVar.f61743p == null ? context.getString(j.f44759m) : aVar.f61743p;
        aVar2.f61744q = aVar.f61744q == 0 ? i.f44741a : aVar.f61744q;
        aVar2.f61745r = aVar.f61745r == 0 ? j.f44764r : aVar.f61745r;
        if (aVar.f61747t != null && !aVar.f61747t.booleanValue()) {
            z10 = false;
        }
        aVar2.f61747t = Boolean.valueOf(z10);
        aVar2.f61739l = aVar.f61739l == -2 ? typedArrayB.getInt(l.f45124b0, -2) : aVar.f61739l;
        aVar2.f61740m = aVar.f61740m == -2 ? typedArrayB.getInt(l.f45136c0, -2) : aVar.f61740m;
        aVar2.f61732e = Integer.valueOf(aVar.f61732e == null ? typedArrayB.getResourceId(l.f44943L, k.f44787c) : aVar.f61732e.intValue());
        aVar2.f61733f = Integer.valueOf(aVar.f61733f == null ? typedArrayB.getResourceId(l.f44955M, 0) : aVar.f61733f.intValue());
        aVar2.f61734g = Integer.valueOf(aVar.f61734g == null ? typedArrayB.getResourceId(l.f45056V, k.f44787c) : aVar.f61734g.intValue());
        aVar2.f61735h = Integer.valueOf(aVar.f61735h == null ? typedArrayB.getResourceId(l.f45067W, 0) : aVar.f61735h.intValue());
        aVar2.f61729b = Integer.valueOf(aVar.f61729b == null ? H(context, typedArrayB, l.f44895H) : aVar.f61729b.intValue());
        aVar2.f61731d = Integer.valueOf(aVar.f61731d == null ? typedArrayB.getResourceId(l.f44979O, k.f44791g) : aVar.f61731d.intValue());
        if (aVar.f61730c != null) {
            aVar2.f61730c = aVar.f61730c;
        } else if (typedArrayB.hasValue(l.f44990P)) {
            aVar2.f61730c = Integer.valueOf(H(context, typedArrayB, l.f44990P));
        } else {
            aVar2.f61730c = Integer.valueOf(new C16027d(context, aVar2.f61731d.intValue()).i().getDefaultColor());
        }
        aVar2.f61746s = Integer.valueOf(aVar.f61746s == null ? typedArrayB.getInt(l.f44907I, 8388661) : aVar.f61746s.intValue());
        aVar2.f61748u = Integer.valueOf(aVar.f61748u == null ? typedArrayB.getDimensionPixelSize(l.f45012R, resources.getDimensionPixelSize(d.f44589Y)) : aVar.f61748u.intValue());
        aVar2.f61749v = Integer.valueOf(aVar.f61749v == null ? typedArrayB.getDimensionPixelSize(l.f45001Q, resources.getDimensionPixelSize(d.f44627s)) : aVar.f61749v.intValue());
        aVar2.f61750w = Integer.valueOf(aVar.f61750w == null ? typedArrayB.getDimensionPixelOffset(l.f45089Y, 0) : aVar.f61750w.intValue());
        aVar2.f61751x = Integer.valueOf(aVar.f61751x == null ? typedArrayB.getDimensionPixelOffset(l.f45172f0, 0) : aVar.f61751x.intValue());
        aVar2.f61752y = Integer.valueOf(aVar.f61752y == null ? typedArrayB.getDimensionPixelOffset(l.f45100Z, aVar2.f61750w.intValue()) : aVar.f61752y.intValue());
        aVar2.f61753z = Integer.valueOf(aVar.f61753z == null ? typedArrayB.getDimensionPixelOffset(l.f45184g0, aVar2.f61751x.intValue()) : aVar.f61753z.intValue());
        aVar2.f61726C = Integer.valueOf(aVar.f61726C == null ? typedArrayB.getDimensionPixelOffset(l.f45112a0, 0) : aVar.f61726C.intValue());
        aVar2.f61724A = Integer.valueOf(aVar.f61724A == null ? 0 : aVar.f61724A.intValue());
        aVar2.f61725B = Integer.valueOf(aVar.f61725B == null ? 0 : aVar.f61725B.intValue());
        aVar2.f61727D = Boolean.valueOf(aVar.f61727D == null ? typedArrayB.getBoolean(l.f44883G, false) : aVar.f61727D.booleanValue());
        typedArrayB.recycle();
        if (aVar.f61741n == null) {
            aVar2.f61741n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f61741n = aVar.f61741n;
        }
        this.f61713a = aVar;
    }

    private TypedArray b(Context context, int i10, int i11, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = com.google.android.material.drawable.d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return s.i(context, attributeSetI, l.f44871F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    void a() {
        M(-1);
    }

    int A() {
        return this.f61714b.f61731d.intValue();
    }

    int B() {
        return this.f61714b.f61753z.intValue();
    }

    int C() {
        return this.f61714b.f61751x.intValue();
    }

    boolean D() {
        return this.f61714b.f61738k != -1;
    }

    boolean E() {
        return this.f61714b.f61737j != null;
    }

    boolean F() {
        return this.f61714b.f61727D.booleanValue();
    }

    boolean G() {
        return this.f61714b.f61747t.booleanValue();
    }

    void I(int i10) {
        this.f61713a.f61736i = i10;
        this.f61714b.f61736i = i10;
    }

    void J(int i10) {
        this.f61713a.f61744q = i10;
        this.f61714b.f61744q = i10;
    }

    void K(int i10) {
        this.f61713a.f61752y = Integer.valueOf(i10);
        this.f61714b.f61752y = Integer.valueOf(i10);
    }

    void L(int i10) {
        this.f61713a.f61750w = Integer.valueOf(i10);
        this.f61714b.f61750w = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f61713a.f61738k = i10;
        this.f61714b.f61738k = i10;
    }

    void N(int i10) {
        this.f61713a.f61753z = Integer.valueOf(i10);
        this.f61714b.f61753z = Integer.valueOf(i10);
    }

    void O(int i10) {
        this.f61713a.f61751x = Integer.valueOf(i10);
        this.f61714b.f61751x = Integer.valueOf(i10);
    }

    void P(boolean z10) {
        this.f61713a.f61747t = Boolean.valueOf(z10);
        this.f61714b.f61747t = Boolean.valueOf(z10);
    }

    int c() {
        return this.f61714b.f61724A.intValue();
    }

    int d() {
        return this.f61714b.f61725B.intValue();
    }

    int e() {
        return this.f61714b.f61736i;
    }

    int f() {
        return this.f61714b.f61729b.intValue();
    }

    int g() {
        return this.f61714b.f61746s.intValue();
    }

    int h() {
        return this.f61714b.f61748u.intValue();
    }

    int i() {
        return this.f61714b.f61733f.intValue();
    }

    int j() {
        return this.f61714b.f61732e.intValue();
    }

    int k() {
        return this.f61714b.f61730c.intValue();
    }

    int l() {
        return this.f61714b.f61749v.intValue();
    }

    int m() {
        return this.f61714b.f61735h.intValue();
    }

    int n() {
        return this.f61714b.f61734g.intValue();
    }

    int o() {
        return this.f61714b.f61745r;
    }

    CharSequence p() {
        return this.f61714b.f61742o;
    }

    CharSequence q() {
        return this.f61714b.f61743p;
    }

    int r() {
        return this.f61714b.f61744q;
    }

    int s() {
        return this.f61714b.f61752y.intValue();
    }

    int t() {
        return this.f61714b.f61750w.intValue();
    }

    int u() {
        return this.f61714b.f61726C.intValue();
    }

    int v() {
        return this.f61714b.f61739l;
    }

    int w() {
        return this.f61714b.f61740m;
    }

    int x() {
        return this.f61714b.f61738k;
    }

    Locale y() {
        return this.f61714b.f61741n;
    }

    String z() {
        return this.f61714b.f61737j;
    }

    private static int H(Context context, TypedArray typedArray, int i10) {
        return C16026c.a(context, typedArray, i10).getDefaultColor();
    }
}

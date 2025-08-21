package ee;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import ce.d;
import ce.i;
import ce.j;
import ce.k;
import ce.l;
import com.google.android.material.internal.s;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import qe.C16634c;
import qe.C16635d;

/* renamed from: ee.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13791b {

    /* renamed from: a, reason: collision with root package name */
    private final a f130095a;

    /* renamed from: b, reason: collision with root package name */
    private final a f130096b;

    /* renamed from: c, reason: collision with root package name */
    final float f130097c;

    /* renamed from: d, reason: collision with root package name */
    final float f130098d;

    /* renamed from: e, reason: collision with root package name */
    final float f130099e;

    /* renamed from: f, reason: collision with root package name */
    final float f130100f;

    /* renamed from: g, reason: collision with root package name */
    final float f130101g;

    /* renamed from: h, reason: collision with root package name */
    final float f130102h;

    /* renamed from: i, reason: collision with root package name */
    final int f130103i;

    /* renamed from: j, reason: collision with root package name */
    final int f130104j;

    /* renamed from: k, reason: collision with root package name */
    int f130105k;

    /* renamed from: ee.b$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2046a();

        /* renamed from: A, reason: collision with root package name */
        private Integer f130106A;

        /* renamed from: B, reason: collision with root package name */
        private Integer f130107B;

        /* renamed from: C, reason: collision with root package name */
        private Integer f130108C;

        /* renamed from: D, reason: collision with root package name */
        private Boolean f130109D;

        /* renamed from: a, reason: collision with root package name */
        private int f130110a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f130111b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f130112c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f130113d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f130114e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f130115f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f130116g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f130117h;

        /* renamed from: i, reason: collision with root package name */
        private int f130118i;

        /* renamed from: j, reason: collision with root package name */
        private String f130119j;

        /* renamed from: k, reason: collision with root package name */
        private int f130120k;

        /* renamed from: l, reason: collision with root package name */
        private int f130121l;

        /* renamed from: m, reason: collision with root package name */
        private int f130122m;

        /* renamed from: n, reason: collision with root package name */
        private Locale f130123n;

        /* renamed from: o, reason: collision with root package name */
        private CharSequence f130124o;

        /* renamed from: p, reason: collision with root package name */
        private CharSequence f130125p;

        /* renamed from: q, reason: collision with root package name */
        private int f130126q;

        /* renamed from: r, reason: collision with root package name */
        private int f130127r;

        /* renamed from: s, reason: collision with root package name */
        private Integer f130128s;

        /* renamed from: t, reason: collision with root package name */
        private Boolean f130129t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f130130u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f130131v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f130132w;

        /* renamed from: x, reason: collision with root package name */
        private Integer f130133x;

        /* renamed from: y, reason: collision with root package name */
        private Integer f130134y;

        /* renamed from: z, reason: collision with root package name */
        private Integer f130135z;

        /* renamed from: ee.b$a$a, reason: collision with other inner class name */
        class C2046a implements Parcelable.Creator<a> {
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

            C2046a() {
            }
        }

        public a() {
            this.f130118i = l3.f93323c;
            this.f130120k = -2;
            this.f130121l = -2;
            this.f130122m = -2;
            this.f130129t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f130110a);
            parcel.writeSerializable(this.f130111b);
            parcel.writeSerializable(this.f130112c);
            parcel.writeSerializable(this.f130113d);
            parcel.writeSerializable(this.f130114e);
            parcel.writeSerializable(this.f130115f);
            parcel.writeSerializable(this.f130116g);
            parcel.writeSerializable(this.f130117h);
            parcel.writeInt(this.f130118i);
            parcel.writeString(this.f130119j);
            parcel.writeInt(this.f130120k);
            parcel.writeInt(this.f130121l);
            parcel.writeInt(this.f130122m);
            CharSequence charSequence = this.f130124o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f130125p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f130126q);
            parcel.writeSerializable(this.f130128s);
            parcel.writeSerializable(this.f130130u);
            parcel.writeSerializable(this.f130131v);
            parcel.writeSerializable(this.f130132w);
            parcel.writeSerializable(this.f130133x);
            parcel.writeSerializable(this.f130134y);
            parcel.writeSerializable(this.f130135z);
            parcel.writeSerializable(this.f130108C);
            parcel.writeSerializable(this.f130106A);
            parcel.writeSerializable(this.f130107B);
            parcel.writeSerializable(this.f130129t);
            parcel.writeSerializable(this.f130123n);
            parcel.writeSerializable(this.f130109D);
        }

        a(Parcel parcel) {
            this.f130118i = l3.f93323c;
            this.f130120k = -2;
            this.f130121l = -2;
            this.f130122m = -2;
            this.f130129t = Boolean.TRUE;
            this.f130110a = parcel.readInt();
            this.f130111b = (Integer) parcel.readSerializable();
            this.f130112c = (Integer) parcel.readSerializable();
            this.f130113d = (Integer) parcel.readSerializable();
            this.f130114e = (Integer) parcel.readSerializable();
            this.f130115f = (Integer) parcel.readSerializable();
            this.f130116g = (Integer) parcel.readSerializable();
            this.f130117h = (Integer) parcel.readSerializable();
            this.f130118i = parcel.readInt();
            this.f130119j = parcel.readString();
            this.f130120k = parcel.readInt();
            this.f130121l = parcel.readInt();
            this.f130122m = parcel.readInt();
            this.f130124o = parcel.readString();
            this.f130125p = parcel.readString();
            this.f130126q = parcel.readInt();
            this.f130128s = (Integer) parcel.readSerializable();
            this.f130130u = (Integer) parcel.readSerializable();
            this.f130131v = (Integer) parcel.readSerializable();
            this.f130132w = (Integer) parcel.readSerializable();
            this.f130133x = (Integer) parcel.readSerializable();
            this.f130134y = (Integer) parcel.readSerializable();
            this.f130135z = (Integer) parcel.readSerializable();
            this.f130108C = (Integer) parcel.readSerializable();
            this.f130106A = (Integer) parcel.readSerializable();
            this.f130107B = (Integer) parcel.readSerializable();
            this.f130129t = (Boolean) parcel.readSerializable();
            this.f130123n = (Locale) parcel.readSerializable();
            this.f130109D = (Boolean) parcel.readSerializable();
        }
    }

    C13791b(Context context, int i10, int i11, int i12, a aVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        a aVar2 = new a();
        this.f130096b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f130110a = i10;
        }
        TypedArray typedArrayB = b(context, aVar.f130110a, i11, i12);
        Resources resources = context.getResources();
        this.f130097c = typedArrayB.getDimensionPixelSize(l.f61946K, -1);
        this.f130103i = context.getResources().getDimensionPixelSize(d.f61603X);
        this.f130104j = context.getResources().getDimensionPixelSize(d.f61605Z);
        this.f130098d = typedArrayB.getDimensionPixelSize(l.f62060U, -1);
        this.f130099e = typedArrayB.getDimension(l.f62038S, resources.getDimension(d.f61638q));
        this.f130101g = typedArrayB.getDimension(l.f62093X, resources.getDimension(d.f61640r));
        this.f130100f = typedArrayB.getDimension(l.f61934J, resources.getDimension(d.f61638q));
        this.f130102h = typedArrayB.getDimension(l.f62049T, resources.getDimension(d.f61640r));
        boolean z10 = true;
        this.f130105k = typedArrayB.getInt(l.f62175e0, 1);
        aVar2.f130118i = aVar.f130118i == -2 ? l3.f93323c : aVar.f130118i;
        if (aVar.f130120k != -2) {
            aVar2.f130120k = aVar.f130120k;
        } else if (typedArrayB.hasValue(l.f62163d0)) {
            aVar2.f130120k = typedArrayB.getInt(l.f62163d0, 0);
        } else {
            aVar2.f130120k = -1;
        }
        if (aVar.f130119j != null) {
            aVar2.f130119j = aVar.f130119j;
        } else if (typedArrayB.hasValue(l.f61982N)) {
            aVar2.f130119j = typedArrayB.getString(l.f61982N);
        }
        aVar2.f130124o = aVar.f130124o;
        aVar2.f130125p = aVar.f130125p == null ? context.getString(j.f61774m) : aVar.f130125p;
        aVar2.f130126q = aVar.f130126q == 0 ? i.f61756a : aVar.f130126q;
        aVar2.f130127r = aVar.f130127r == 0 ? j.f61779r : aVar.f130127r;
        if (aVar.f130129t != null && !aVar.f130129t.booleanValue()) {
            z10 = false;
        }
        aVar2.f130129t = Boolean.valueOf(z10);
        aVar2.f130121l = aVar.f130121l == -2 ? typedArrayB.getInt(l.f62139b0, -2) : aVar.f130121l;
        aVar2.f130122m = aVar.f130122m == -2 ? typedArrayB.getInt(l.f62151c0, -2) : aVar.f130122m;
        aVar2.f130114e = Integer.valueOf(aVar.f130114e == null ? typedArrayB.getResourceId(l.f61958L, k.f61802c) : aVar.f130114e.intValue());
        aVar2.f130115f = Integer.valueOf(aVar.f130115f == null ? typedArrayB.getResourceId(l.f61970M, 0) : aVar.f130115f.intValue());
        aVar2.f130116g = Integer.valueOf(aVar.f130116g == null ? typedArrayB.getResourceId(l.f62071V, k.f61802c) : aVar.f130116g.intValue());
        aVar2.f130117h = Integer.valueOf(aVar.f130117h == null ? typedArrayB.getResourceId(l.f62082W, 0) : aVar.f130117h.intValue());
        aVar2.f130111b = Integer.valueOf(aVar.f130111b == null ? H(context, typedArrayB, l.f61910H) : aVar.f130111b.intValue());
        aVar2.f130113d = Integer.valueOf(aVar.f130113d == null ? typedArrayB.getResourceId(l.f61994O, k.f61806g) : aVar.f130113d.intValue());
        if (aVar.f130112c != null) {
            aVar2.f130112c = aVar.f130112c;
        } else if (typedArrayB.hasValue(l.f62005P)) {
            aVar2.f130112c = Integer.valueOf(H(context, typedArrayB, l.f62005P));
        } else {
            aVar2.f130112c = Integer.valueOf(new C16635d(context, aVar2.f130113d.intValue()).i().getDefaultColor());
        }
        aVar2.f130128s = Integer.valueOf(aVar.f130128s == null ? typedArrayB.getInt(l.f61922I, 8388661) : aVar.f130128s.intValue());
        aVar2.f130130u = Integer.valueOf(aVar.f130130u == null ? typedArrayB.getDimensionPixelSize(l.f62027R, resources.getDimensionPixelSize(d.f61604Y)) : aVar.f130130u.intValue());
        aVar2.f130131v = Integer.valueOf(aVar.f130131v == null ? typedArrayB.getDimensionPixelSize(l.f62016Q, resources.getDimensionPixelSize(d.f61642s)) : aVar.f130131v.intValue());
        aVar2.f130132w = Integer.valueOf(aVar.f130132w == null ? typedArrayB.getDimensionPixelOffset(l.f62104Y, 0) : aVar.f130132w.intValue());
        aVar2.f130133x = Integer.valueOf(aVar.f130133x == null ? typedArrayB.getDimensionPixelOffset(l.f62187f0, 0) : aVar.f130133x.intValue());
        aVar2.f130134y = Integer.valueOf(aVar.f130134y == null ? typedArrayB.getDimensionPixelOffset(l.f62115Z, aVar2.f130132w.intValue()) : aVar.f130134y.intValue());
        aVar2.f130135z = Integer.valueOf(aVar.f130135z == null ? typedArrayB.getDimensionPixelOffset(l.f62199g0, aVar2.f130133x.intValue()) : aVar.f130135z.intValue());
        aVar2.f130108C = Integer.valueOf(aVar.f130108C == null ? typedArrayB.getDimensionPixelOffset(l.f62127a0, 0) : aVar.f130108C.intValue());
        aVar2.f130106A = Integer.valueOf(aVar.f130106A == null ? 0 : aVar.f130106A.intValue());
        aVar2.f130107B = Integer.valueOf(aVar.f130107B == null ? 0 : aVar.f130107B.intValue());
        aVar2.f130109D = Boolean.valueOf(aVar.f130109D == null ? typedArrayB.getBoolean(l.f61898G, false) : aVar.f130109D.booleanValue());
        typedArrayB.recycle();
        if (aVar.f130123n == null) {
            aVar2.f130123n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f130123n = aVar.f130123n;
        }
        this.f130095a = aVar;
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
        return s.i(context, attributeSetI, l.f61886F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    void a() {
        M(-1);
    }

    int A() {
        return this.f130096b.f130113d.intValue();
    }

    int B() {
        return this.f130096b.f130135z.intValue();
    }

    int C() {
        return this.f130096b.f130133x.intValue();
    }

    boolean D() {
        return this.f130096b.f130120k != -1;
    }

    boolean E() {
        return this.f130096b.f130119j != null;
    }

    boolean F() {
        return this.f130096b.f130109D.booleanValue();
    }

    boolean G() {
        return this.f130096b.f130129t.booleanValue();
    }

    void I(int i10) {
        this.f130095a.f130118i = i10;
        this.f130096b.f130118i = i10;
    }

    void J(int i10) {
        this.f130095a.f130126q = i10;
        this.f130096b.f130126q = i10;
    }

    void K(int i10) {
        this.f130095a.f130134y = Integer.valueOf(i10);
        this.f130096b.f130134y = Integer.valueOf(i10);
    }

    void L(int i10) {
        this.f130095a.f130132w = Integer.valueOf(i10);
        this.f130096b.f130132w = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f130095a.f130120k = i10;
        this.f130096b.f130120k = i10;
    }

    void N(int i10) {
        this.f130095a.f130135z = Integer.valueOf(i10);
        this.f130096b.f130135z = Integer.valueOf(i10);
    }

    void O(int i10) {
        this.f130095a.f130133x = Integer.valueOf(i10);
        this.f130096b.f130133x = Integer.valueOf(i10);
    }

    void P(boolean z10) {
        this.f130095a.f130129t = Boolean.valueOf(z10);
        this.f130096b.f130129t = Boolean.valueOf(z10);
    }

    int c() {
        return this.f130096b.f130106A.intValue();
    }

    int d() {
        return this.f130096b.f130107B.intValue();
    }

    int e() {
        return this.f130096b.f130118i;
    }

    int f() {
        return this.f130096b.f130111b.intValue();
    }

    int g() {
        return this.f130096b.f130128s.intValue();
    }

    int h() {
        return this.f130096b.f130130u.intValue();
    }

    int i() {
        return this.f130096b.f130115f.intValue();
    }

    int j() {
        return this.f130096b.f130114e.intValue();
    }

    int k() {
        return this.f130096b.f130112c.intValue();
    }

    int l() {
        return this.f130096b.f130131v.intValue();
    }

    int m() {
        return this.f130096b.f130117h.intValue();
    }

    int n() {
        return this.f130096b.f130116g.intValue();
    }

    int o() {
        return this.f130096b.f130127r;
    }

    CharSequence p() {
        return this.f130096b.f130124o;
    }

    CharSequence q() {
        return this.f130096b.f130125p;
    }

    int r() {
        return this.f130096b.f130126q;
    }

    int s() {
        return this.f130096b.f130134y.intValue();
    }

    int t() {
        return this.f130096b.f130132w.intValue();
    }

    int u() {
        return this.f130096b.f130108C.intValue();
    }

    int v() {
        return this.f130096b.f130121l;
    }

    int w() {
        return this.f130096b.f130122m;
    }

    int x() {
        return this.f130096b.f130120k;
    }

    Locale y() {
        return this.f130096b.f130123n;
    }

    String z() {
        return this.f130096b.f130119j;
    }

    private static int H(Context context, TypedArray typedArray, int i10) {
        return C16634c.a(context, typedArray, i10).getDefaultColor();
    }
}

package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import b2.C6330k;
import com.google.android.gms.common.api.a;
import java.util.List;
import k4.AbstractC15085a;
import k4.C15086b;
import k4.c;
import k4.e;
import k4.g;

/* loaded from: classes4.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    private List<Preference> f57904A;

    /* renamed from: B, reason: collision with root package name */
    private b f57905B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f57906C;

    /* renamed from: a, reason: collision with root package name */
    private Context f57907a;

    /* renamed from: b, reason: collision with root package name */
    private int f57908b;

    /* renamed from: c, reason: collision with root package name */
    private int f57909c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f57910d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f57911e;

    /* renamed from: f, reason: collision with root package name */
    private int f57912f;

    /* renamed from: g, reason: collision with root package name */
    private String f57913g;

    /* renamed from: h, reason: collision with root package name */
    private Intent f57914h;

    /* renamed from: i, reason: collision with root package name */
    private String f57915i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57916j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57917k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57918l;

    /* renamed from: m, reason: collision with root package name */
    private String f57919m;

    /* renamed from: n, reason: collision with root package name */
    private Object f57920n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f57921o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57922p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f57923q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f57924r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f57925s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f57926t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f57927u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57928v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f57929w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f57930x;

    /* renamed from: y, reason: collision with root package name */
    private int f57931y;

    /* renamed from: z, reason: collision with root package name */
    private int f57932z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.O(view);
        }
    }

    public interface b<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f57908b = a.e.API_PRIORITY_OTHER;
        this.f57909c = 0;
        this.f57916j = true;
        this.f57917k = true;
        this.f57918l = true;
        this.f57921o = true;
        this.f57922p = true;
        this.f57923q = true;
        this.f57924r = true;
        this.f57925s = true;
        this.f57927u = true;
        this.f57930x = true;
        this.f57931y = e.f141433a;
        this.f57906C = new a();
        this.f57907a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141565r0, i10, i11);
        this.f57912f = C6330k.l(typedArrayObtainStyledAttributes, g.f141481P0, g.f141568s0, 0);
        this.f57913g = C6330k.m(typedArrayObtainStyledAttributes, g.f141490S0, g.f141586y0);
        this.f57910d = C6330k.n(typedArrayObtainStyledAttributes, g.f141515a1, g.f141580w0);
        this.f57911e = C6330k.n(typedArrayObtainStyledAttributes, g.f141511Z0, g.f141589z0);
        this.f57908b = C6330k.d(typedArrayObtainStyledAttributes, g.f141496U0, g.f141436A0, a.e.API_PRIORITY_OTHER);
        this.f57915i = C6330k.m(typedArrayObtainStyledAttributes, g.f141478O0, g.f141451F0);
        this.f57931y = C6330k.l(typedArrayObtainStyledAttributes, g.f141493T0, g.f141577v0, e.f141433a);
        this.f57932z = C6330k.l(typedArrayObtainStyledAttributes, g.f141518b1, g.f141439B0, 0);
        this.f57916j = C6330k.b(typedArrayObtainStyledAttributes, g.f141475N0, g.f141574u0, true);
        this.f57917k = C6330k.b(typedArrayObtainStyledAttributes, g.f141502W0, g.f141583x0, true);
        this.f57918l = C6330k.b(typedArrayObtainStyledAttributes, g.f141499V0, g.f141571t0, true);
        this.f57919m = C6330k.m(typedArrayObtainStyledAttributes, g.f141469L0, g.f141442C0);
        int i12 = g.f141460I0;
        this.f57924r = C6330k.b(typedArrayObtainStyledAttributes, i12, i12, this.f57917k);
        int i13 = g.f141463J0;
        this.f57925s = C6330k.b(typedArrayObtainStyledAttributes, i13, i13, this.f57917k);
        if (typedArrayObtainStyledAttributes.hasValue(g.f141466K0)) {
            this.f57920n = L(typedArrayObtainStyledAttributes, g.f141466K0);
        } else if (typedArrayObtainStyledAttributes.hasValue(g.f141445D0)) {
            this.f57920n = L(typedArrayObtainStyledAttributes, g.f141445D0);
        }
        this.f57930x = C6330k.b(typedArrayObtainStyledAttributes, g.f141505X0, g.f141448E0, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.f141508Y0);
        this.f57926t = zHasValue;
        if (zHasValue) {
            this.f57927u = C6330k.b(typedArrayObtainStyledAttributes, g.f141508Y0, g.f141454G0, true);
        }
        this.f57928v = C6330k.b(typedArrayObtainStyledAttributes, g.f141484Q0, g.f141457H0, false);
        int i14 = g.f141487R0;
        this.f57923q = C6330k.b(typedArrayObtainStyledAttributes, i14, i14, true);
        int i15 = g.f141472M0;
        this.f57929w = C6330k.b(typedArrayObtainStyledAttributes, i15, i15, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected void H() {
    }

    protected void J() {
    }

    protected Object L(TypedArray typedArray, int i10) {
        return null;
    }

    protected boolean U() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    public AbstractC15085a w() {
        return null;
    }

    public C15086b z() {
        return null;
    }

    public final b C() {
        return this.f57905B;
    }

    public CharSequence D() {
        return this.f57910d;
    }

    public boolean E() {
        return !TextUtils.isEmpty(this.f57913g);
    }

    public boolean F() {
        return this.f57916j && this.f57921o && this.f57922p;
    }

    public boolean G() {
        return this.f57917k;
    }

    public void I(boolean z10) {
        List<Preference> list = this.f57904A;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).K(this, z10);
        }
    }

    public void K(Preference preference, boolean z10) {
        if (this.f57921o == z10) {
            this.f57921o = !z10;
            I(T());
            H();
        }
    }

    public void M(Preference preference, boolean z10) {
        if (this.f57922p == z10) {
            this.f57922p = !z10;
            I(T());
            H();
        }
    }

    public final void S(b bVar) {
        this.f57905B = bVar;
        H();
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f57908b;
        int i11 = preference.f57908b;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f57910d;
        CharSequence charSequence2 = preference.f57910d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f57910d.toString());
    }

    public Context e() {
        return this.f57907a;
    }

    StringBuilder l() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceD = D();
        if (!TextUtils.isEmpty(charSequenceD)) {
            sb2.append(charSequenceD);
            sb2.append(' ');
        }
        CharSequence charSequenceB = B();
        if (!TextUtils.isEmpty(charSequenceB)) {
            sb2.append(charSequenceB);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String m() {
        return this.f57915i;
    }

    public Intent o() {
        return this.f57914h;
    }

    public CharSequence B() {
        if (C() != null) {
            return C().a(this);
        }
        return this.f57911e;
    }

    public void N() {
        if (F() && G()) {
            J();
            z();
            if (this.f57914h != null) {
                e().startActivity(this.f57914h);
            }
        }
    }

    protected void O(View view) {
        N();
    }

    protected boolean P(boolean z10) {
        if (!U()) {
            return false;
        }
        if (z10 == p(!z10)) {
            return true;
        }
        w();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean Q(int i10) {
        if (!U()) {
            return false;
        }
        if (i10 == t(~i10)) {
            return true;
        }
        w();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean R(String str) {
        if (!U()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, u(null))) {
            return true;
        }
        w();
        obj.getClass();
        throw null;
    }

    public boolean T() {
        return !F();
    }

    protected boolean p(boolean z10) {
        if (!U()) {
            return z10;
        }
        w();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected int t(int i10) {
        if (!U()) {
            return i10;
        }
        w();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String toString() {
        return l().toString();
    }

    protected String u(String str) {
        if (!U()) {
            return str;
        }
        w();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6330k.a(context, c.f141428g, R.attr.preferenceStyle));
    }
}

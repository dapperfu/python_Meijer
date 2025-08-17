package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import b2.C6190k;
import com.google.android.gms.common.api.a;
import java.util.List;
import k4.AbstractC15094a;
import k4.c;
import k4.e;
import k4.g;

/* loaded from: classes4.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    private List<Preference> f57680A;

    /* renamed from: B, reason: collision with root package name */
    private b f57681B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f57682C;

    /* renamed from: a, reason: collision with root package name */
    private Context f57683a;

    /* renamed from: b, reason: collision with root package name */
    private int f57684b;

    /* renamed from: c, reason: collision with root package name */
    private int f57685c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f57686d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f57687e;

    /* renamed from: f, reason: collision with root package name */
    private int f57688f;

    /* renamed from: g, reason: collision with root package name */
    private String f57689g;

    /* renamed from: h, reason: collision with root package name */
    private Intent f57690h;

    /* renamed from: i, reason: collision with root package name */
    private String f57691i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57692j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57693k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57694l;

    /* renamed from: m, reason: collision with root package name */
    private String f57695m;

    /* renamed from: n, reason: collision with root package name */
    private Object f57696n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f57697o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57698p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f57699q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f57700r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f57701s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f57702t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f57703u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57704v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f57705w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f57706x;

    /* renamed from: y, reason: collision with root package name */
    private int f57707y;

    /* renamed from: z, reason: collision with root package name */
    private int f57708z;

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
        this.f57684b = a.e.API_PRIORITY_OTHER;
        this.f57685c = 0;
        this.f57692j = true;
        this.f57693k = true;
        this.f57694l = true;
        this.f57697o = true;
        this.f57698p = true;
        this.f57699q = true;
        this.f57700r = true;
        this.f57701s = true;
        this.f57703u = true;
        this.f57706x = true;
        this.f57707y = e.f141240a;
        this.f57682C = new a();
        this.f57683a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141372r0, i10, i11);
        this.f57688f = C6190k.l(typedArrayObtainStyledAttributes, g.f141288P0, g.f141375s0, 0);
        this.f57689g = C6190k.m(typedArrayObtainStyledAttributes, g.f141297S0, g.f141393y0);
        this.f57686d = C6190k.n(typedArrayObtainStyledAttributes, g.f141322a1, g.f141387w0);
        this.f57687e = C6190k.n(typedArrayObtainStyledAttributes, g.f141318Z0, g.f141396z0);
        this.f57684b = C6190k.d(typedArrayObtainStyledAttributes, g.f141303U0, g.f141243A0, a.e.API_PRIORITY_OTHER);
        this.f57691i = C6190k.m(typedArrayObtainStyledAttributes, g.f141285O0, g.f141258F0);
        this.f57707y = C6190k.l(typedArrayObtainStyledAttributes, g.f141300T0, g.f141384v0, e.f141240a);
        this.f57708z = C6190k.l(typedArrayObtainStyledAttributes, g.f141325b1, g.f141246B0, 0);
        this.f57692j = C6190k.b(typedArrayObtainStyledAttributes, g.f141282N0, g.f141381u0, true);
        this.f57693k = C6190k.b(typedArrayObtainStyledAttributes, g.f141309W0, g.f141390x0, true);
        this.f57694l = C6190k.b(typedArrayObtainStyledAttributes, g.f141306V0, g.f141378t0, true);
        this.f57695m = C6190k.m(typedArrayObtainStyledAttributes, g.f141276L0, g.f141249C0);
        int i12 = g.f141267I0;
        this.f57700r = C6190k.b(typedArrayObtainStyledAttributes, i12, i12, this.f57693k);
        int i13 = g.f141270J0;
        this.f57701s = C6190k.b(typedArrayObtainStyledAttributes, i13, i13, this.f57693k);
        if (typedArrayObtainStyledAttributes.hasValue(g.f141273K0)) {
            this.f57696n = L(typedArrayObtainStyledAttributes, g.f141273K0);
        } else if (typedArrayObtainStyledAttributes.hasValue(g.f141252D0)) {
            this.f57696n = L(typedArrayObtainStyledAttributes, g.f141252D0);
        }
        this.f57706x = C6190k.b(typedArrayObtainStyledAttributes, g.f141312X0, g.f141255E0, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.f141315Y0);
        this.f57702t = zHasValue;
        if (zHasValue) {
            this.f57703u = C6190k.b(typedArrayObtainStyledAttributes, g.f141315Y0, g.f141261G0, true);
        }
        this.f57704v = C6190k.b(typedArrayObtainStyledAttributes, g.f141291Q0, g.f141264H0, false);
        int i14 = g.f141294R0;
        this.f57699q = C6190k.b(typedArrayObtainStyledAttributes, i14, i14, true);
        int i15 = g.f141279M0;
        this.f57705w = C6190k.b(typedArrayObtainStyledAttributes, i15, i15, false);
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

    public AbstractC15094a w() {
        return null;
    }

    public k4.b z() {
        return null;
    }

    public final b C() {
        return this.f57681B;
    }

    public CharSequence D() {
        return this.f57686d;
    }

    public boolean E() {
        return !TextUtils.isEmpty(this.f57689g);
    }

    public boolean F() {
        return this.f57692j && this.f57697o && this.f57698p;
    }

    public boolean G() {
        return this.f57693k;
    }

    public void I(boolean z10) {
        List<Preference> list = this.f57680A;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).K(this, z10);
        }
    }

    public void K(Preference preference, boolean z10) {
        if (this.f57697o == z10) {
            this.f57697o = !z10;
            I(T());
            H();
        }
    }

    public void M(Preference preference, boolean z10) {
        if (this.f57698p == z10) {
            this.f57698p = !z10;
            I(T());
            H();
        }
    }

    public final void S(b bVar) {
        this.f57681B = bVar;
        H();
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f57684b;
        int i11 = preference.f57684b;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f57686d;
        CharSequence charSequence2 = preference.f57686d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f57686d.toString());
    }

    public Context e() {
        return this.f57683a;
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
        return this.f57691i;
    }

    public Intent o() {
        return this.f57690h;
    }

    public CharSequence B() {
        if (C() != null) {
            return C().a(this);
        }
        return this.f57687e;
    }

    public void N() {
        if (F() && G()) {
            J();
            z();
            if (this.f57690h != null) {
                e().startActivity(this.f57690h);
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
        this(context, attributeSet, C6190k.a(context, c.f141235g, R.attr.preferenceStyle));
    }
}

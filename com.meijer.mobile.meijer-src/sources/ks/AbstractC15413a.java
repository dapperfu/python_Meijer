package ks;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import gs.C14405a;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: ks.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15413a<T> extends RecyclerView.h<RecyclerView.F> {

    /* renamed from: a, reason: collision with root package name */
    private List<b<T>> f148823a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<T> f148824b;

    /* renamed from: c, reason: collision with root package name */
    private SparseArray<b<T>> f148825c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<b<T>, e> f148826d;

    /* renamed from: e, reason: collision with root package name */
    private int f148827e;

    /* renamed from: f, reason: collision with root package name */
    private int f148828f;

    /* renamed from: g, reason: collision with root package name */
    private SparseBooleanArray f148829g;

    /* renamed from: h, reason: collision with root package name */
    private SparseBooleanArray f148830h;

    /* renamed from: i, reason: collision with root package name */
    private final int f148831i;

    /* renamed from: j, reason: collision with root package name */
    private final int f148832j;

    /* renamed from: k, reason: collision with root package name */
    private final int f148833k;

    /* renamed from: l, reason: collision with root package name */
    private int f148834l;

    /* renamed from: m, reason: collision with root package name */
    private int f148835m;

    /* renamed from: n, reason: collision with root package name */
    private SparseIntArray f148836n;

    /* renamed from: o, reason: collision with root package name */
    private View f148837o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.F f148838p;

    /* renamed from: q, reason: collision with root package name */
    private View f148839q;

    /* renamed from: r, reason: collision with root package name */
    private RecyclerView.F f148840r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f148841s;

    /* renamed from: t, reason: collision with root package name */
    private final Context f148842t;

    /* renamed from: u, reason: collision with root package name */
    private final LayoutInflater f148843u;

    /* renamed from: ks.a$b */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f148844a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f148845b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f148846c;

        /* renamed from: d, reason: collision with root package name */
        public final List<T> f148847d;

        /* renamed from: e, reason: collision with root package name */
        public final int f148848e;

        /* renamed from: f, reason: collision with root package name */
        public final int f148849f;

        /* renamed from: g, reason: collision with root package name */
        public final int f148850g;

        /* renamed from: h, reason: collision with root package name */
        public final int f148851h;

        /* renamed from: i, reason: collision with root package name */
        public final int f148852i;

        /* renamed from: j, reason: collision with root package name */
        public final int f148853j;

        public b(int i10, CharSequence charSequence, List<T> list, int i11, int i12) {
            this(i10, charSequence, null, list, i11, i12, 0, 0, 0, 0);
        }

        public b(int i10, CharSequence charSequence, List<T> list, int i11, int i12, int i13, int i14) {
            this(i10, charSequence, null, list, i11, i12, i13, i14, 0, 0);
        }

        public int a() {
            List<T> list = this.f148847d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            return String.format(Locale.US, "%1$s (%2$d)", this.f148845b, Integer.valueOf(a()));
        }

        public b(int i10, CharSequence charSequence, CharSequence charSequence2, List<T> list, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f148844a = i10;
            this.f148845b = charSequence;
            this.f148846c = charSequence2;
            this.f148847d = list;
            this.f148848e = i11 == 0 ? C14405a.f134456f : i11;
            this.f148849f = i12;
            this.f148850g = i13 == 0 ? C14405a.f134455e : i13;
            this.f148851h = i14;
            this.f148852i = i15 == 0 ? C14405a.f134454d : i15;
            this.f148853j = i16;
        }
    }

    /* renamed from: ks.a$c */
    public static class c extends f {
        @Override // ks.AbstractC15413a.f
        public void b(b bVar) {
            this.f148858a.setText(bVar.f148846c);
        }

        public c(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$d */
    public static class d extends f {
        @Override // ks.AbstractC15413a.f
        public void b(b bVar) {
            this.f148858a.setText(bVar.toString());
        }

        public d(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f148854a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f148855b;

        /* renamed from: c, reason: collision with root package name */
        private final int f148856c;

        /* renamed from: d, reason: collision with root package name */
        private final int f148857d;

        private e(boolean z10, boolean z11, int i10, int i11) {
            this.f148854a = z10;
            this.f148855b = z11;
            this.f148856c = i10;
            this.f148857d = i11;
        }
    }

    protected AbstractC15413a(Context context, List<b<T>> list) {
        this(context, list, false, 0, 0, 0, 0, 0);
    }

    protected void A() {
        B(true);
    }

    public int j(T t10) {
        if (t10 == null) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f148827e; i10++) {
            if (s(i10, t10)) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: ks.a$a, reason: collision with other inner class name */
    public static class C2286a extends RecyclerView.F {
        public C2286a(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$f */
    public static abstract class f extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        TextView f148858a;

        public abstract void b(b bVar);

        protected f(View view) {
            super(view);
            this.f148858a = (TextView) view.findViewById(C14405a.f134451a);
        }
    }

    protected AbstractC15413a(Context context, List<b<T>> list, boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f148823a = list;
        this.f148841s = z10;
        this.f148831i = i10;
        this.f148832j = i11;
        this.f148833k = i12;
        this.f148834l = i13;
        this.f148835m = i14;
        this.f148842t = context;
        this.f148843u = LayoutInflater.from(context);
        z();
        A();
    }

    private void C(b bVar, e eVar, e eVar2) {
        if (this.f148841s || !bVar.f148847d.isEmpty()) {
            if (eVar2.f148854a) {
                notifyItemChanged(eVar2.f148856c);
            }
            if (eVar2.f148855b) {
                notifyItemChanged(eVar2.f148857d);
                return;
            }
            return;
        }
        if (eVar.f148854a) {
            notifyItemRemoved(eVar.f148856c);
        }
        if (eVar.f148855b) {
            notifyItemRemoved(eVar.f148857d);
        }
    }

    private void z() {
        List<b<T>> list = this.f148823a;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f148836n = new SparseIntArray();
        for (b<T> bVar : this.f148823a) {
            int i10 = bVar.f148848e;
            if (i10 != 0 && i10 != C14405a.f134456f) {
                this.f148836n.put(i10, bVar.f148849f);
            }
            int i11 = bVar.f148850g;
            if (i11 != 0 && i11 != C14405a.f134455e) {
                this.f148836n.put(i11, bVar.f148851h);
            }
            int i12 = bVar.f148852i;
            if (i12 != 0 && i12 != C14405a.f134454d) {
                this.f148836n.put(i12, bVar.f148853j);
            }
        }
    }

    protected synchronized void B(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        try {
            SparseArray<T> sparseArray = new SparseArray<>();
            SparseArray<b<T>> sparseArray2 = new SparseArray<>();
            HashMap<b<T>, e> map = new HashMap<>();
            boolean z13 = false;
            this.f148828f = 0;
            if (o()) {
                sparseArray2.put(0, null);
                sparseArray.put(0, null);
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z14 = this.f148831i != 0;
            boolean z15 = this.f148832j != 0;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            List<b<T>> list = this.f148823a;
            if (list != null && !list.isEmpty()) {
                int i14 = i10;
                for (b<T> bVar : this.f148823a) {
                    if (this.f148841s || !bVar.f148847d.isEmpty()) {
                        this.f148828f += bVar.f148847d.size();
                        if ((bVar.f148850g == C14405a.f134455e || bVar.f148851h == 0) && (!z14 || bVar.f148845b == null)) {
                            z11 = z13;
                            i11 = i14;
                        } else {
                            sparseBooleanArray.put(i14, true);
                            i11 = i14 + 1;
                            sparseArray2.put(i14, bVar);
                            z11 = true;
                        }
                        for (T t10 : bVar.f148847d) {
                            sparseArray2.put(i11, bVar);
                            sparseArray.put(i11, t10);
                            i11++;
                        }
                        if ((bVar.f148852i == C14405a.f134454d || bVar.f148853j == 0) && (!z15 || bVar.f148846c == null)) {
                            i12 = i11 - 1;
                            i13 = i11;
                            z12 = false;
                        } else {
                            sparseBooleanArray2.put(i11, true);
                            i13 = i11 + 1;
                            sparseArray2.put(i11, bVar);
                            z12 = true;
                            i12 = i11;
                        }
                        map.put(bVar, new e(z11, z12, i14, i12));
                        i14 = i13;
                        z13 = false;
                    }
                }
                i10 = i14;
            }
            if (n()) {
                i10++;
            }
            this.f148827e = i10;
            this.f148829g = sparseBooleanArray;
            this.f148830h = sparseBooleanArray2;
            this.f148824b = sparseArray;
            this.f148825c = sparseArray2;
            this.f148826d = map;
            if (z10) {
                notifyDataSetChanged();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(b<T> bVar, int i10, T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("Cannot add null item.");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot add item to a null section.");
        }
        if (i10 < 0 || i10 > bVar.f148847d.size()) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "Given section position (%d) is out of bounds. Section size is %d.", Integer.valueOf(i10), Integer.valueOf(bVar.f148847d.size())));
        }
        b<T> bVarK = k(t10);
        if (bVar == bVarK) {
            return;
        }
        if (bVarK == null) {
            bVar.f148847d.add(i10, t10);
            B(false);
            notifyItemInserted(j(t10));
            notifyItemChanged(m(bVar));
            return;
        }
        int iJ = j(t10);
        e eVar = this.f148826d.get(bVarK);
        bVarK.f148847d.remove(t10);
        bVar.f148847d.add(i10, t10);
        B(false);
        notifyItemChanged(m(bVar));
        notifyItemMoved(iJ, j(t10));
        C(bVarK, eVar, this.f148826d.get(bVarK));
    }

    public void c(b<T> bVar, T t10) {
        a(bVar, bVar != null ? bVar.f148847d.size() : -1, t10);
    }

    protected <V extends View> V g(ViewGroup viewGroup, int i10) {
        if (i10 == C14405a.f134453c) {
            if (this.f148837o == null) {
                this.f148837o = p(this.f148834l, viewGroup);
            }
            return (V) this.f148837o;
        }
        if (i10 != C14405a.f134452b) {
            return (V) p(i10 == C14405a.f134455e ? this.f148831i : i10 == C14405a.f134454d ? this.f148832j : i10 == C14405a.f134456f ? this.f148833k : this.f148836n.get(i10), viewGroup);
        }
        if (this.f148839q == null) {
            this.f148839q = p(this.f148835m, viewGroup);
        }
        return (V) this.f148839q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f148827e;
    }

    public Context h() {
        return this.f148842t;
    }

    public b<T> k(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("Cannot search for null item within SectionedAdapter.");
        }
        for (b<T> bVar : this.f148823a) {
            if (bVar.f148847d.contains(t10)) {
                return bVar;
            }
        }
        return null;
    }

    public b<T> l(int i10) {
        List<b<T>> list = this.f148823a;
        if (list == null || list.isEmpty() || i10 == -1 || r(i10) || q(i10)) {
            return null;
        }
        return this.f148825c.get(i10);
    }

    public int m(b<T> bVar) {
        e eVar = this.f148826d.get(bVar);
        if (eVar == null || !eVar.f148854a) {
            return -1;
        }
        return eVar.f148856c;
    }

    public boolean n() {
        return (this.f148835m == 0 && this.f148839q == null) ? false : true;
    }

    public boolean o() {
        return (this.f148834l == 0 && this.f148837o == null) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        if (f10 instanceof f) {
            ((f) f10).b(l(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == C14405a.f134453c) {
            if (this.f148838p == null) {
                this.f148838p = new C2286a(g(viewGroup, i10));
            }
            return this.f148838p;
        }
        if (i10 == C14405a.f134452b) {
            if (this.f148840r == null) {
                this.f148840r = new C2286a(g(viewGroup, i10));
            }
            return this.f148840r;
        }
        if (i10 == C14405a.f134455e) {
            if (this.f148831i != 0) {
                return new d(g(viewGroup, i10));
            }
            throw new IllegalArgumentException("Cannot create section header when section header resource is undefined.");
        }
        if (i10 == C14405a.f134454d) {
            if (this.f148832j != 0) {
                return new c(g(viewGroup, i10));
            }
            throw new IllegalArgumentException("Cannot create section footer when section footer resource is undefined.");
        }
        if (i10 == C14405a.f134456f) {
            throw new IllegalArgumentException("No view holder defined for default recycler item.");
        }
        try {
            throw new IllegalArgumentException(String.format("No view holder defined for view type: %s", this.f148842t.getResources().getResourceName(i10)));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(String.format(Locale.US, "No view holder defined for view type: %d", Integer.valueOf(i10)));
        }
    }

    protected <V extends View> V p(int i10, ViewGroup viewGroup) {
        if (i10 != 0) {
            return (V) this.f148843u.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public boolean t(int i10) {
        return this.f148830h.get(i10);
    }

    public boolean u(int i10) {
        return this.f148829g.get(i10);
    }

    public void w(T t10) {
        int iJ;
        if (t10 == null || (iJ = j(t10)) == -1) {
            return;
        }
        b<T> bVarL = l(iJ);
        e eVar = this.f148826d.get(bVarL);
        bVarL.f148847d.remove(t10);
        B(false);
        notifyItemRemoved(iJ);
        C(bVarL, eVar, this.f148826d.get(bVarL));
    }

    public void x(View view) {
        View view2 = this.f148837o;
        if (view2 != view) {
            boolean z10 = view2 == null;
            this.f148837o = view;
            this.f148834l = 0;
            this.f148838p = null;
            B(false);
            if (z10) {
                notifyItemInserted(0);
            } else {
                notifyItemChanged(0);
            }
        }
    }

    public void y(List<b<T>> list) {
        this.f148823a = list;
        z();
        A();
    }

    public T getItem(int i10) {
        if (!r(i10) && !q(i10)) {
            return this.f148824b.get(i10);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (o() && i10 == 0) {
            return C14405a.f134453c;
        }
        if (n() && i10 == i()) {
            return C14405a.f134452b;
        }
        if (u(i10)) {
            return l(i10).f148850g;
        }
        if (t(i10)) {
            return l(i10).f148852i;
        }
        return l(i10).f148848e;
    }

    public int i() {
        if (n()) {
            return this.f148827e - 1;
        }
        return -1;
    }

    public boolean q(int i10) {
        if (n() && i10 == i()) {
            return true;
        }
        return false;
    }

    public boolean r(int i10) {
        if (o() && i10 == 0) {
            return true;
        }
        return false;
    }

    protected boolean s(int i10, T t10) {
        if (getItem(i10) == t10) {
            return true;
        }
        return false;
    }

    public void v() {
        if (o()) {
            this.f148834l = 0;
            this.f148837o = null;
            this.f148838p = null;
            B(false);
            notifyItemRemoved(0);
        }
    }
}

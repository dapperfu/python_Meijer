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
import gs.C14309a;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: ks.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15310a<T> extends RecyclerView.h<RecyclerView.F> {

    /* renamed from: a, reason: collision with root package name */
    private List<b<T>> f147913a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<T> f147914b;

    /* renamed from: c, reason: collision with root package name */
    private SparseArray<b<T>> f147915c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<b<T>, e> f147916d;

    /* renamed from: e, reason: collision with root package name */
    private int f147917e;

    /* renamed from: f, reason: collision with root package name */
    private int f147918f;

    /* renamed from: g, reason: collision with root package name */
    private SparseBooleanArray f147919g;

    /* renamed from: h, reason: collision with root package name */
    private SparseBooleanArray f147920h;

    /* renamed from: i, reason: collision with root package name */
    private final int f147921i;

    /* renamed from: j, reason: collision with root package name */
    private final int f147922j;

    /* renamed from: k, reason: collision with root package name */
    private final int f147923k;

    /* renamed from: l, reason: collision with root package name */
    private int f147924l;

    /* renamed from: m, reason: collision with root package name */
    private int f147925m;

    /* renamed from: n, reason: collision with root package name */
    private SparseIntArray f147926n;

    /* renamed from: o, reason: collision with root package name */
    private View f147927o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.F f147928p;

    /* renamed from: q, reason: collision with root package name */
    private View f147929q;

    /* renamed from: r, reason: collision with root package name */
    private RecyclerView.F f147930r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f147931s;

    /* renamed from: t, reason: collision with root package name */
    private final Context f147932t;

    /* renamed from: u, reason: collision with root package name */
    private final LayoutInflater f147933u;

    /* renamed from: ks.a$b */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f147934a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f147935b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f147936c;

        /* renamed from: d, reason: collision with root package name */
        public final List<T> f147937d;

        /* renamed from: e, reason: collision with root package name */
        public final int f147938e;

        /* renamed from: f, reason: collision with root package name */
        public final int f147939f;

        /* renamed from: g, reason: collision with root package name */
        public final int f147940g;

        /* renamed from: h, reason: collision with root package name */
        public final int f147941h;

        /* renamed from: i, reason: collision with root package name */
        public final int f147942i;

        /* renamed from: j, reason: collision with root package name */
        public final int f147943j;

        public b(int i10, CharSequence charSequence, List<T> list, int i11, int i12) {
            this(i10, charSequence, null, list, i11, i12, 0, 0, 0, 0);
        }

        public b(int i10, CharSequence charSequence, List<T> list, int i11, int i12, int i13, int i14) {
            this(i10, charSequence, null, list, i11, i12, i13, i14, 0, 0);
        }

        public int a() {
            List<T> list = this.f147937d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            return String.format(Locale.US, "%1$s (%2$d)", this.f147935b, Integer.valueOf(a()));
        }

        public b(int i10, CharSequence charSequence, CharSequence charSequence2, List<T> list, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f147934a = i10;
            this.f147935b = charSequence;
            this.f147936c = charSequence2;
            this.f147937d = list;
            this.f147938e = i11 == 0 ? C14309a.f134083f : i11;
            this.f147939f = i12;
            this.f147940g = i13 == 0 ? C14309a.f134082e : i13;
            this.f147941h = i14;
            this.f147942i = i15 == 0 ? C14309a.f134081d : i15;
            this.f147943j = i16;
        }
    }

    /* renamed from: ks.a$c */
    public static class c extends f {
        @Override // ks.AbstractC15310a.f
        public void b(b bVar) {
            this.f147948a.setText(bVar.f147936c);
        }

        public c(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$d */
    public static class d extends f {
        @Override // ks.AbstractC15310a.f
        public void b(b bVar) {
            this.f147948a.setText(bVar.toString());
        }

        public d(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f147944a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f147945b;

        /* renamed from: c, reason: collision with root package name */
        private final int f147946c;

        /* renamed from: d, reason: collision with root package name */
        private final int f147947d;

        private e(boolean z10, boolean z11, int i10, int i11) {
            this.f147944a = z10;
            this.f147945b = z11;
            this.f147946c = i10;
            this.f147947d = i11;
        }
    }

    protected AbstractC15310a(Context context, List<b<T>> list) {
        this(context, list, false, 0, 0, 0, 0, 0);
    }

    protected void A() {
        B(true);
    }

    public int j(T t10) {
        if (t10 == null) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f147917e; i10++) {
            if (s(i10, t10)) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: ks.a$a, reason: collision with other inner class name */
    public static class C2277a extends RecyclerView.F {
        public C2277a(View view) {
            super(view);
        }
    }

    /* renamed from: ks.a$f */
    public static abstract class f extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        TextView f147948a;

        public abstract void b(b bVar);

        protected f(View view) {
            super(view);
            this.f147948a = (TextView) view.findViewById(C14309a.f134078a);
        }
    }

    protected AbstractC15310a(Context context, List<b<T>> list, boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f147913a = list;
        this.f147931s = z10;
        this.f147921i = i10;
        this.f147922j = i11;
        this.f147923k = i12;
        this.f147924l = i13;
        this.f147925m = i14;
        this.f147932t = context;
        this.f147933u = LayoutInflater.from(context);
        z();
        A();
    }

    private void C(b bVar, e eVar, e eVar2) {
        if (this.f147931s || !bVar.f147937d.isEmpty()) {
            if (eVar2.f147944a) {
                notifyItemChanged(eVar2.f147946c);
            }
            if (eVar2.f147945b) {
                notifyItemChanged(eVar2.f147947d);
                return;
            }
            return;
        }
        if (eVar.f147944a) {
            notifyItemRemoved(eVar.f147946c);
        }
        if (eVar.f147945b) {
            notifyItemRemoved(eVar.f147947d);
        }
    }

    private void z() {
        List<b<T>> list = this.f147913a;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f147926n = new SparseIntArray();
        for (b<T> bVar : this.f147913a) {
            int i10 = bVar.f147938e;
            if (i10 != 0 && i10 != C14309a.f134083f) {
                this.f147926n.put(i10, bVar.f147939f);
            }
            int i11 = bVar.f147940g;
            if (i11 != 0 && i11 != C14309a.f134082e) {
                this.f147926n.put(i11, bVar.f147941h);
            }
            int i12 = bVar.f147942i;
            if (i12 != 0 && i12 != C14309a.f134081d) {
                this.f147926n.put(i12, bVar.f147943j);
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
            this.f147918f = 0;
            if (o()) {
                sparseArray2.put(0, null);
                sparseArray.put(0, null);
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z14 = this.f147921i != 0;
            boolean z15 = this.f147922j != 0;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            List<b<T>> list = this.f147913a;
            if (list != null && !list.isEmpty()) {
                int i14 = i10;
                for (b<T> bVar : this.f147913a) {
                    if (this.f147931s || !bVar.f147937d.isEmpty()) {
                        this.f147918f += bVar.f147937d.size();
                        if ((bVar.f147940g == C14309a.f134082e || bVar.f147941h == 0) && (!z14 || bVar.f147935b == null)) {
                            z11 = z13;
                            i11 = i14;
                        } else {
                            sparseBooleanArray.put(i14, true);
                            i11 = i14 + 1;
                            sparseArray2.put(i14, bVar);
                            z11 = true;
                        }
                        for (T t10 : bVar.f147937d) {
                            sparseArray2.put(i11, bVar);
                            sparseArray.put(i11, t10);
                            i11++;
                        }
                        if ((bVar.f147942i == C14309a.f134081d || bVar.f147943j == 0) && (!z15 || bVar.f147936c == null)) {
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
            this.f147917e = i10;
            this.f147919g = sparseBooleanArray;
            this.f147920h = sparseBooleanArray2;
            this.f147914b = sparseArray;
            this.f147915c = sparseArray2;
            this.f147916d = map;
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
        if (i10 < 0 || i10 > bVar.f147937d.size()) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "Given section position (%d) is out of bounds. Section size is %d.", Integer.valueOf(i10), Integer.valueOf(bVar.f147937d.size())));
        }
        b<T> bVarK = k(t10);
        if (bVar == bVarK) {
            return;
        }
        if (bVarK == null) {
            bVar.f147937d.add(i10, t10);
            B(false);
            notifyItemInserted(j(t10));
            notifyItemChanged(m(bVar));
            return;
        }
        int iJ = j(t10);
        e eVar = this.f147916d.get(bVarK);
        bVarK.f147937d.remove(t10);
        bVar.f147937d.add(i10, t10);
        B(false);
        notifyItemChanged(m(bVar));
        notifyItemMoved(iJ, j(t10));
        C(bVarK, eVar, this.f147916d.get(bVarK));
    }

    public void c(b<T> bVar, T t10) {
        a(bVar, bVar != null ? bVar.f147937d.size() : -1, t10);
    }

    protected <V extends View> V f(ViewGroup viewGroup, int i10) {
        if (i10 == C14309a.f134080c) {
            if (this.f147927o == null) {
                this.f147927o = p(this.f147924l, viewGroup);
            }
            return (V) this.f147927o;
        }
        if (i10 != C14309a.f134079b) {
            return (V) p(i10 == C14309a.f134082e ? this.f147921i : i10 == C14309a.f134081d ? this.f147922j : i10 == C14309a.f134083f ? this.f147923k : this.f147926n.get(i10), viewGroup);
        }
        if (this.f147929q == null) {
            this.f147929q = p(this.f147925m, viewGroup);
        }
        return (V) this.f147929q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f147917e;
    }

    public Context h() {
        return this.f147932t;
    }

    public b<T> k(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("Cannot search for null item within SectionedAdapter.");
        }
        for (b<T> bVar : this.f147913a) {
            if (bVar.f147937d.contains(t10)) {
                return bVar;
            }
        }
        return null;
    }

    public b<T> l(int i10) {
        List<b<T>> list = this.f147913a;
        if (list == null || list.isEmpty() || i10 == -1 || r(i10) || q(i10)) {
            return null;
        }
        return this.f147915c.get(i10);
    }

    public int m(b<T> bVar) {
        e eVar = this.f147916d.get(bVar);
        if (eVar == null || !eVar.f147944a) {
            return -1;
        }
        return eVar.f147946c;
    }

    public boolean n() {
        return (this.f147925m == 0 && this.f147929q == null) ? false : true;
    }

    public boolean o() {
        return (this.f147924l == 0 && this.f147927o == null) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) {
        if (f10 instanceof f) {
            ((f) f10).b(l(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == C14309a.f134080c) {
            if (this.f147928p == null) {
                this.f147928p = new C2277a(f(viewGroup, i10));
            }
            return this.f147928p;
        }
        if (i10 == C14309a.f134079b) {
            if (this.f147930r == null) {
                this.f147930r = new C2277a(f(viewGroup, i10));
            }
            return this.f147930r;
        }
        if (i10 == C14309a.f134082e) {
            if (this.f147921i != 0) {
                return new d(f(viewGroup, i10));
            }
            throw new IllegalArgumentException("Cannot create section header when section header resource is undefined.");
        }
        if (i10 == C14309a.f134081d) {
            if (this.f147922j != 0) {
                return new c(f(viewGroup, i10));
            }
            throw new IllegalArgumentException("Cannot create section footer when section footer resource is undefined.");
        }
        if (i10 == C14309a.f134083f) {
            throw new IllegalArgumentException("No view holder defined for default recycler item.");
        }
        try {
            throw new IllegalArgumentException(String.format("No view holder defined for view type: %s", this.f147932t.getResources().getResourceName(i10)));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(String.format(Locale.US, "No view holder defined for view type: %d", Integer.valueOf(i10)));
        }
    }

    protected <V extends View> V p(int i10, ViewGroup viewGroup) {
        if (i10 != 0) {
            return (V) this.f147933u.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public boolean t(int i10) {
        return this.f147920h.get(i10);
    }

    public boolean u(int i10) {
        return this.f147919g.get(i10);
    }

    public void w(T t10) {
        int iJ;
        if (t10 == null || (iJ = j(t10)) == -1) {
            return;
        }
        b<T> bVarL = l(iJ);
        e eVar = this.f147916d.get(bVarL);
        bVarL.f147937d.remove(t10);
        B(false);
        notifyItemRemoved(iJ);
        C(bVarL, eVar, this.f147916d.get(bVarL));
    }

    public void x(View view) {
        View view2 = this.f147927o;
        if (view2 != view) {
            boolean z10 = view2 == null;
            this.f147927o = view;
            this.f147924l = 0;
            this.f147928p = null;
            B(false);
            if (z10) {
                notifyItemInserted(0);
            } else {
                notifyItemChanged(0);
            }
        }
    }

    public void y(List<b<T>> list) {
        this.f147913a = list;
        z();
        A();
    }

    public T getItem(int i10) {
        if (!r(i10) && !q(i10)) {
            return this.f147914b.get(i10);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (o() && i10 == 0) {
            return C14309a.f134080c;
        }
        if (n() && i10 == i()) {
            return C14309a.f134079b;
        }
        if (u(i10)) {
            return l(i10).f147940g;
        }
        if (t(i10)) {
            return l(i10).f147942i;
        }
        return l(i10).f147938e;
    }

    public int i() {
        if (n()) {
            return this.f147917e - 1;
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
            this.f147924l = 0;
            this.f147927o = null;
            this.f147928p = null;
            B(false);
            notifyItemRemoved(0);
        }
    }
}

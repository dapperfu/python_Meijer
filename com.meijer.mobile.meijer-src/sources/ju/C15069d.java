package ju;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.C15066a;
import ju.g;

/* renamed from: ju.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15069d<VH extends g> extends RecyclerView.h<VH> implements InterfaceC15070e {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC15068c> f141266a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f141267b = 1;

    /* renamed from: c, reason: collision with root package name */
    private h f141268c;

    /* renamed from: d, reason: collision with root package name */
    private C15066a.InterfaceC2238a f141269d;

    /* renamed from: e, reason: collision with root package name */
    private C15066a f141270e;

    /* renamed from: f, reason: collision with root package name */
    private final GridLayoutManager.c f141271f;

    /* renamed from: ju.d$a */
    class a implements C15066a.InterfaceC2238a {
        a() {
        }

        @Override // androidx.recyclerview.widget.r
        public void a(int i10, int i11) {
            C15069d.this.notifyItemRangeInserted(i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void b(int i10, int i11) {
            C15069d.this.notifyItemRangeRemoved(i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void c(int i10, int i11, Object obj) {
            C15069d.this.notifyItemRangeChanged(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.r
        public void d(int i10, int i11) {
            C15069d.this.notifyItemMoved(i10, i11);
        }
    }

    /* renamed from: ju.d$b */
    class b extends GridLayoutManager.c {
        b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i10) {
            try {
                return C15069d.this.j(i10).k(C15069d.this.f141267b, i10);
            } catch (IndexOutOfBoundsException unused) {
                return C15069d.this.f141267b;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh2, int i10) {
    }

    public void x(Collection<? extends InterfaceC15068c> collection) {
        y(collection, true);
    }

    private int l(int i10) {
        int iA = 0;
        Iterator<InterfaceC15068c> it = this.f141266a.subList(0, i10).iterator();
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    private h<VH> m(int i10) {
        h hVar = this.f141268c;
        if (hVar != null && hVar.l() == i10) {
            return this.f141268c;
        }
        for (int i11 = 0; i11 < getTotalNumberOfTabs(); i11++) {
            h<VH> hVarJ = j(i11);
            if (hVarJ.l() == i10) {
                return hVarJ;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i10);
    }

    private void w(Collection<? extends InterfaceC15068c> collection) {
        Iterator<InterfaceC15068c> it = this.f141266a.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
        this.f141266a.clear();
        this.f141266a.addAll(collection);
        Iterator<? extends InterfaceC15068c> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().c(this);
        }
    }

    public void c(InterfaceC15068c interfaceC15068c) {
        if (interfaceC15068c == null) {
            throw new RuntimeException("Group cannot be null");
        }
        int totalNumberOfTabs = getTotalNumberOfTabs();
        interfaceC15068c.c(this);
        this.f141266a.add(interfaceC15068c);
        notifyItemRangeInserted(totalNumberOfTabs, interfaceC15068c.a());
    }

    public int g(InterfaceC15068c interfaceC15068c) {
        int iIndexOf = this.f141266a.indexOf(interfaceC15068c);
        if (iIndexOf == -1) {
            return -1;
        }
        int iA = 0;
        for (int i10 = 0; i10 < iIndexOf; i10++) {
            iA += this.f141266a.get(i10).a();
        }
        return iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return f.b(this.f141266a);
    }

    public InterfaceC15068c h(int i10) {
        int iA = 0;
        for (InterfaceC15068c interfaceC15068c : this.f141266a) {
            if (i10 - iA < interfaceC15068c.a()) {
                return interfaceC15068c;
            }
            iA += interfaceC15068c.a();
        }
        throw new IndexOutOfBoundsException("Requested position " + i10 + " in group adapter but there are only " + iA + " items");
    }

    public int i() {
        return this.f141266a.size();
    }

    public h j(int i10) {
        return f.a(this.f141266a, i10);
    }

    public void y(Collection<? extends InterfaceC15068c> collection, boolean z10) {
        h.e eVarC = androidx.recyclerview.widget.h.c(new C15067b(new ArrayList(this.f141266a), collection), z10);
        w(collection);
        eVarC.b(this.f141269d);
    }

    public C15069d() {
        a aVar = new a();
        this.f141269d = aVar;
        this.f141270e = new C15066a(aVar);
        this.f141271f = new b();
    }

    private void u(int i10, InterfaceC15068c interfaceC15068c) {
        int iL = l(i10);
        interfaceC15068c.g(this);
        this.f141266a.remove(i10);
        notifyItemRangeRemoved(iL, interfaceC15068c.a());
    }

    @Override // ju.InterfaceC15070e
    public void b(InterfaceC15068c interfaceC15068c, int i10, int i11, Object obj) {
        notifyItemRangeChanged(g(interfaceC15068c) + i10, i11, obj);
    }

    @Override // ju.InterfaceC15070e
    public void d(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        notifyItemRangeRemoved(g(interfaceC15068c) + i10, i11);
    }

    @Override // ju.InterfaceC15070e
    public void e(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        int iG = g(interfaceC15068c);
        notifyItemMoved(i10 + iG, iG + i11);
    }

    @Override // ju.InterfaceC15070e
    public void f(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        notifyItemRangeInserted(g(interfaceC15068c) + i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return j(i10).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        h hVarJ = j(i10);
        this.f141268c = hVarJ;
        if (hVarJ != null) {
            return hVarJ.l();
        }
        throw new RuntimeException("Invalid position " + i10);
    }

    public h k(VH vh2) {
        return vh2.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh2, int i10, List<Object> list) {
        j(i10).e(vh2, i10, list, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        h<VH> hVarM = m(i10);
        return (VH) hVarM.f(layoutInflaterFrom.inflate(hVarM.j(), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(VH vh2) {
        return vh2.e().p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(VH vh2) {
        super.onViewAttachedToWindow(vh2);
        k(vh2).r(vh2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(VH vh2) {
        super.onViewDetachedFromWindow(vh2);
        k(vh2).s(vh2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(VH vh2) {
        vh2.e().t(vh2);
    }

    public void v(int i10) {
        u(i10, h(i10));
    }
}

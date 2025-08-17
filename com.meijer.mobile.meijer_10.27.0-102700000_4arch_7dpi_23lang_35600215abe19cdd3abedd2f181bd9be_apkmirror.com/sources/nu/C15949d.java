package nu;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nu.C15946a;
import nu.g;

/* renamed from: nu.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15949d<VH extends g> extends RecyclerView.h<VH> implements InterfaceC15950e {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC15948c> f152816a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f152817b = 1;

    /* renamed from: c, reason: collision with root package name */
    private h f152818c;

    /* renamed from: d, reason: collision with root package name */
    private C15946a.InterfaceC2369a f152819d;

    /* renamed from: e, reason: collision with root package name */
    private C15946a f152820e;

    /* renamed from: f, reason: collision with root package name */
    private final GridLayoutManager.c f152821f;

    /* renamed from: nu.d$a */
    class a implements C15946a.InterfaceC2369a {
        a() {
        }

        @Override // androidx.recyclerview.widget.r
        public void a(int i10, int i11) {
            C15949d.this.notifyItemRangeInserted(i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void b(int i10, int i11) {
            C15949d.this.notifyItemRangeRemoved(i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void c(int i10, int i11, Object obj) {
            C15949d.this.notifyItemRangeChanged(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.r
        public void d(int i10, int i11) {
            C15949d.this.notifyItemMoved(i10, i11);
        }
    }

    /* renamed from: nu.d$b */
    class b extends GridLayoutManager.c {
        b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i10) {
            try {
                return C15949d.this.j(i10).k(C15949d.this.f152817b, i10);
            } catch (IndexOutOfBoundsException unused) {
                return C15949d.this.f152817b;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh2, int i10) {
    }

    public void x(Collection<? extends InterfaceC15948c> collection) {
        y(collection, true);
    }

    private int l(int i10) {
        int iA = 0;
        Iterator<InterfaceC15948c> it = this.f152816a.subList(0, i10).iterator();
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    private h<VH> m(int i10) {
        h hVar = this.f152818c;
        if (hVar != null && hVar.l() == i10) {
            return this.f152818c;
        }
        for (int i11 = 0; i11 < getTotalNumberOfTabs(); i11++) {
            h<VH> hVarJ = j(i11);
            if (hVarJ.l() == i10) {
                return hVarJ;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i10);
    }

    private void w(Collection<? extends InterfaceC15948c> collection) {
        Iterator<InterfaceC15948c> it = this.f152816a.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
        this.f152816a.clear();
        this.f152816a.addAll(collection);
        Iterator<? extends InterfaceC15948c> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().c(this);
        }
    }

    public void c(InterfaceC15948c interfaceC15948c) {
        if (interfaceC15948c == null) {
            throw new RuntimeException("Group cannot be null");
        }
        int totalNumberOfTabs = getTotalNumberOfTabs();
        interfaceC15948c.c(this);
        this.f152816a.add(interfaceC15948c);
        notifyItemRangeInserted(totalNumberOfTabs, interfaceC15948c.a());
    }

    public int f(InterfaceC15948c interfaceC15948c) {
        int iIndexOf = this.f152816a.indexOf(interfaceC15948c);
        if (iIndexOf == -1) {
            return -1;
        }
        int iA = 0;
        for (int i10 = 0; i10 < iIndexOf; i10++) {
            iA += this.f152816a.get(i10).a();
        }
        return iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return f.b(this.f152816a);
    }

    public InterfaceC15948c h(int i10) {
        int iA = 0;
        for (InterfaceC15948c interfaceC15948c : this.f152816a) {
            if (i10 - iA < interfaceC15948c.a()) {
                return interfaceC15948c;
            }
            iA += interfaceC15948c.a();
        }
        throw new IndexOutOfBoundsException("Requested position " + i10 + " in group adapter but there are only " + iA + " items");
    }

    public int i() {
        return this.f152816a.size();
    }

    public h j(int i10) {
        return f.a(this.f152816a, i10);
    }

    public void y(Collection<? extends InterfaceC15948c> collection, boolean z10) {
        h.e eVarC = androidx.recyclerview.widget.h.c(new C15947b(new ArrayList(this.f152816a), collection), z10);
        w(collection);
        eVarC.b(this.f152819d);
    }

    public C15949d() {
        a aVar = new a();
        this.f152819d = aVar;
        this.f152820e = new C15946a(aVar);
        this.f152821f = new b();
    }

    private void u(int i10, InterfaceC15948c interfaceC15948c) {
        int iL = l(i10);
        interfaceC15948c.f(this);
        this.f152816a.remove(i10);
        notifyItemRangeRemoved(iL, interfaceC15948c.a());
    }

    @Override // nu.InterfaceC15950e
    public void b(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        int iF = f(interfaceC15948c);
        notifyItemMoved(i10 + iF, iF + i11);
    }

    @Override // nu.InterfaceC15950e
    public void d(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        notifyItemRangeInserted(f(interfaceC15948c) + i10, i11);
    }

    @Override // nu.InterfaceC15950e
    public void e(InterfaceC15948c interfaceC15948c, int i10, int i11, Object obj) {
        notifyItemRangeChanged(f(interfaceC15948c) + i10, i11, obj);
    }

    @Override // nu.InterfaceC15950e
    public void g(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        notifyItemRangeRemoved(f(interfaceC15948c) + i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return j(i10).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        h hVarJ = j(i10);
        this.f152818c = hVarJ;
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
        return (VH) hVarM.g(layoutInflaterFrom.inflate(hVarM.j(), viewGroup, false));
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

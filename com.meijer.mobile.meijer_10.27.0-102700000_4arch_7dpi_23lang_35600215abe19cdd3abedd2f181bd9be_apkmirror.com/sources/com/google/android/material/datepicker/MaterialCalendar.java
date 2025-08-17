package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import q2.y;

/* loaded from: classes4.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: o, reason: collision with root package name */
    static final Object f86786o = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: p, reason: collision with root package name */
    static final Object f86787p = "NAVIGATION_PREV_TAG";

    /* renamed from: q, reason: collision with root package name */
    static final Object f86788q = "NAVIGATION_NEXT_TAG";

    /* renamed from: r, reason: collision with root package name */
    static final Object f86789r = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b, reason: collision with root package name */
    private int f86790b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f86791c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.material.datepicker.a f86792d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.datepicker.g f86793e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.k f86794f;

    /* renamed from: g, reason: collision with root package name */
    private l f86795g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.c f86796h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f86797i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView f86798j;

    /* renamed from: k, reason: collision with root package name */
    private View f86799k;

    /* renamed from: l, reason: collision with root package name */
    private View f86800l;

    /* renamed from: m, reason: collision with root package name */
    private View f86801m;

    /* renamed from: n, reason: collision with root package name */
    private View f86802n;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.m f86803a;

        a(com.google.android.material.datepicker.m mVar) {
            this.f86803a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iU2 = MaterialCalendar.this.Z0().u2() - 1;
            if (iU2 >= 0) {
                MaterialCalendar.this.i1(this.f86803a.c(iU2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f86805a;

        b(int i10) {
            this.f86805a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f86798j.smoothScrollToPosition(this.f86805a);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.r0(null);
        }
    }

    class d extends o {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f86808I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f86808I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void e2(RecyclerView.B b10, int[] iArr) {
            if (this.f86808I == 0) {
                iArr[0] = MaterialCalendar.this.f86798j.getWidth();
                iArr[1] = MaterialCalendar.this.f86798j.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f86798j.getHeight();
                iArr[1] = MaterialCalendar.this.f86798j.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.m
        public void a(long j10) {
            if (MaterialCalendar.this.f86792d.g().b1(j10)) {
                MaterialCalendar.this.f86791c.M3(j10);
                Iterator<n<S>> it = MaterialCalendar.this.f86872a.iterator();
                while (it.hasNext()) {
                    it.next().a(MaterialCalendar.this.f86791c.K());
                }
                MaterialCalendar.this.f86798j.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f86797i != null) {
                    MaterialCalendar.this.f86797i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.R0(false);
        }
    }

    class g extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f86812a = q.i();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f86813b = q.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if ((recyclerView.getAdapter() instanceof r) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                r rVar = (r) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (o2.d<Long, Long> dVar : MaterialCalendar.this.f86791c.W1()) {
                    Long l10 = dVar.f153138a;
                    if (l10 != null && dVar.f153139b != null) {
                        this.f86812a.setTimeInMillis(l10.longValue());
                        this.f86813b.setTimeInMillis(dVar.f153139b.longValue());
                        int iF = rVar.f(this.f86812a.get(1));
                        int iF2 = rVar.f(this.f86813b.get(1));
                        View viewU = gridLayoutManager.U(iF);
                        View viewU2 = gridLayoutManager.U(iF2);
                        int iP3 = iF / gridLayoutManager.p3();
                        int iP32 = iF2 / gridLayoutManager.p3();
                        int i10 = iP3;
                        while (i10 <= iP32) {
                            if (gridLayoutManager.U(gridLayoutManager.p3() * i10) != null) {
                                canvas.drawRect((i10 != iP3 || viewU == null) ? 0 : viewU.getLeft() + (viewU.getWidth() / 2), r9.getTop() + MaterialCalendar.this.f86796h.f86896d.c(), (i10 != iP32 || viewU2 == null) ? recyclerView.getWidth() : viewU2.getLeft() + (viewU2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.f86796h.f86896d.b(), MaterialCalendar.this.f86796h.f86900h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            String string;
            super.g(view, yVar);
            if (MaterialCalendar.this.f86802n.getVisibility() == 0) {
                string = MaterialCalendar.this.getString(ae.j.f44744C);
            } else {
                string = MaterialCalendar.this.getString(ae.j.f44742A);
            }
            yVar.C0(string);
        }
    }

    class i extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.m f86816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f86817b;

        i(com.google.android.material.datepicker.m mVar, MaterialButton materialButton) {
            this.f86816a = mVar;
            this.f86817b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f86817b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iR2 = i10 < 0 ? MaterialCalendar.this.Z0().r2() : MaterialCalendar.this.Z0().u2();
            MaterialCalendar.this.f86794f = this.f86816a.c(iR2);
            this.f86817b.setText(this.f86816a.f(iR2));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.l1();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.m f86820a;

        k(com.google.android.material.datepicker.m mVar) {
            this.f86820a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iR2 = MaterialCalendar.this.Z0().r2() + 1;
            if (iR2 < MaterialCalendar.this.f86798j.getAdapter().getItemCount()) {
                MaterialCalendar.this.i1(this.f86820a.c(iR2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    private void H0(View view, com.google.android.material.datepicker.m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ae.f.f44703v);
        materialButton.setTag(f86789r);
        ViewCompat.m0(materialButton, new h());
        View viewFindViewById = view.findViewById(ae.f.f44705x);
        this.f86799k = viewFindViewById;
        viewFindViewById.setTag(f86787p);
        View viewFindViewById2 = view.findViewById(ae.f.f44704w);
        this.f86800l = viewFindViewById2;
        viewFindViewById2.setTag(f86788q);
        this.f86801m = view.findViewById(ae.f.f44660F);
        this.f86802n = view.findViewById(ae.f.f44655A);
        j1(l.DAY);
        materialButton.setText(this.f86794f.C());
        this.f86798j.addOnScrollListener(new i(mVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f86800l.setOnClickListener(new k(mVar));
        this.f86799k.setOnClickListener(new a(mVar));
    }

    private RecyclerView.o J0() {
        return new g();
    }

    public static <T> MaterialCalendar<T> g1(com.google.android.material.datepicker.d<T> dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void h1(int i10) {
        this.f86798j.post(new b(i10));
    }

    private void k1() {
        ViewCompat.m0(this.f86798j, new f());
    }

    com.google.android.material.datepicker.a K0() {
        return this.f86792d;
    }

    com.google.android.material.datepicker.c L0() {
        return this.f86796h;
    }

    com.google.android.material.datepicker.k O0() {
        return this.f86794f;
    }

    public com.google.android.material.datepicker.d<S> T0() {
        return this.f86791c;
    }

    LinearLayoutManager Z0() {
        return (LinearLayoutManager) this.f86798j.getLayoutManager();
    }

    void i1(com.google.android.material.datepicker.k kVar) {
        com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) this.f86798j.getAdapter();
        int iH = mVar.h(kVar);
        int iH2 = iH - mVar.h(this.f86794f);
        boolean z10 = Math.abs(iH2) > 3;
        boolean z11 = iH2 > 0;
        this.f86794f = kVar;
        if (z10 && z11) {
            this.f86798j.scrollToPosition(iH - 3);
            h1(iH);
        } else if (!z10) {
            h1(iH);
        } else {
            this.f86798j.scrollToPosition(iH + 3);
            h1(iH);
        }
    }

    void j1(l lVar) {
        this.f86795g = lVar;
        if (lVar == l.YEAR) {
            this.f86797i.getLayoutManager().O1(((r) this.f86797i.getAdapter()).f(this.f86794f.f86909c));
            this.f86801m.setVisibility(0);
            this.f86802n.setVisibility(8);
            this.f86799k.setVisibility(8);
            this.f86800l.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f86801m.setVisibility(8);
            this.f86802n.setVisibility(0);
            this.f86799k.setVisibility(0);
            this.f86800l.setVisibility(0);
            i1(this.f86794f);
        }
    }

    void l1() {
        l lVar = this.f86795g;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            j1(l.DAY);
        } else if (lVar == l.DAY) {
            j1(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f86790b);
        this.f86796h = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.k kVarN = this.f86792d.n();
        if (MaterialDatePicker.i1(contextThemeWrapper)) {
            i10 = ae.h.f44739y;
            i11 = 1;
        } else {
            i10 = ae.h.f44737w;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(Y0(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(ae.f.f44656B);
        ViewCompat.m0(gridView, new c());
        int i12 = this.f86792d.i();
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new com.google.android.material.datepicker.h(i12) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(kVarN.f86910d);
        gridView.setEnabled(false);
        this.f86798j = (RecyclerView) viewInflate.findViewById(ae.f.f44659E);
        this.f86798j.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f86798j.setTag(f86786o);
        com.google.android.material.datepicker.m mVar = new com.google.android.material.datepicker.m(contextThemeWrapper, this.f86791c, this.f86792d, this.f86793e, new e());
        this.f86798j.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(ae.g.f44710c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ae.f.f44660F);
        this.f86797i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f86797i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f86797i.setAdapter(new r(this));
            this.f86797i.addItemDecoration(J0());
        }
        if (viewInflate.findViewById(ae.f.f44703v) != null) {
            H0(viewInflate, mVar);
        }
        if (!MaterialDatePicker.i1(contextThemeWrapper)) {
            new u().b(this.f86798j);
        }
        this.f86798j.scrollToPosition(mVar.h(this.f86794f));
        k1();
        return viewInflate;
    }

    static int X0(Context context) {
        return context.getResources().getDimensionPixelSize(ae.d.f44598d0);
    }

    private static int Y0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ae.d.f44612k0) + resources.getDimensionPixelOffset(ae.d.f44614l0) + resources.getDimensionPixelOffset(ae.d.f44610j0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ae.d.f44602f0);
        int i10 = com.google.android.material.datepicker.l.f86914g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ae.d.f44598d0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ae.d.f44608i0)) + resources.getDimensionPixelOffset(ae.d.f44594b0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f86790b = bundle.getInt("THEME_RES_ID_KEY");
        this.f86791c = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f86792d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f86793e = (com.google.android.material.datepicker.g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f86794f = (com.google.android.material.datepicker.k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f86790b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f86791c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f86792d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f86793e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f86794f);
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean r0(n<S> nVar) {
        return super.r0(nVar);
    }
}

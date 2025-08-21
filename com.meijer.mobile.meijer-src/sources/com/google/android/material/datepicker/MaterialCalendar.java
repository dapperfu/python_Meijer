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
    static final Object f87626o = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: p, reason: collision with root package name */
    static final Object f87627p = "NAVIGATION_PREV_TAG";

    /* renamed from: q, reason: collision with root package name */
    static final Object f87628q = "NAVIGATION_NEXT_TAG";

    /* renamed from: r, reason: collision with root package name */
    static final Object f87629r = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b, reason: collision with root package name */
    private int f87630b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f87631c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.material.datepicker.a f87632d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.datepicker.g f87633e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.k f87634f;

    /* renamed from: g, reason: collision with root package name */
    private l f87635g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.c f87636h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f87637i;

    /* renamed from: j, reason: collision with root package name */
    private RecyclerView f87638j;

    /* renamed from: k, reason: collision with root package name */
    private View f87639k;

    /* renamed from: l, reason: collision with root package name */
    private View f87640l;

    /* renamed from: m, reason: collision with root package name */
    private View f87641m;

    /* renamed from: n, reason: collision with root package name */
    private View f87642n;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.m f87643a;

        a(com.google.android.material.datepicker.m mVar) {
            this.f87643a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iU2 = MaterialCalendar.this.a1().u2() - 1;
            if (iU2 >= 0) {
                MaterialCalendar.this.i1(this.f87643a.c(iU2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87645a;

        b(int i10) {
            this.f87645a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f87638j.smoothScrollToPosition(this.f87645a);
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
        final /* synthetic */ int f87648I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f87648I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void e2(RecyclerView.B b10, int[] iArr) {
            if (this.f87648I == 0) {
                iArr[0] = MaterialCalendar.this.f87638j.getWidth();
                iArr[1] = MaterialCalendar.this.f87638j.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f87638j.getHeight();
                iArr[1] = MaterialCalendar.this.f87638j.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.m
        public void a(long j10) {
            if (MaterialCalendar.this.f87632d.g().a1(j10)) {
                MaterialCalendar.this.f87631c.M3(j10);
                Iterator<n<S>> it = MaterialCalendar.this.f87712a.iterator();
                while (it.hasNext()) {
                    it.next().a(MaterialCalendar.this.f87631c.K());
                }
                MaterialCalendar.this.f87638j.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f87637i != null) {
                    MaterialCalendar.this.f87637i.getAdapter().notifyDataSetChanged();
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
        private final Calendar f87652a = q.i();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f87653b = q.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if ((recyclerView.getAdapter() instanceof r) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                r rVar = (r) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (o2.d<Long, Long> dVar : MaterialCalendar.this.f87631c.W1()) {
                    Long l10 = dVar.f153583a;
                    if (l10 != null && dVar.f153584b != null) {
                        this.f87652a.setTimeInMillis(l10.longValue());
                        this.f87653b.setTimeInMillis(dVar.f153584b.longValue());
                        int iG = rVar.g(this.f87652a.get(1));
                        int iG2 = rVar.g(this.f87653b.get(1));
                        View viewU = gridLayoutManager.U(iG);
                        View viewU2 = gridLayoutManager.U(iG2);
                        int iP3 = iG / gridLayoutManager.p3();
                        int iP32 = iG2 / gridLayoutManager.p3();
                        int i10 = iP3;
                        while (i10 <= iP32) {
                            if (gridLayoutManager.U(gridLayoutManager.p3() * i10) != null) {
                                canvas.drawRect((i10 != iP3 || viewU == null) ? 0 : viewU.getLeft() + (viewU.getWidth() / 2), r9.getTop() + MaterialCalendar.this.f87636h.f87736d.c(), (i10 != iP32 || viewU2 == null) ? recyclerView.getWidth() : viewU2.getLeft() + (viewU2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.f87636h.f87736d.b(), MaterialCalendar.this.f87636h.f87740h);
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
            if (MaterialCalendar.this.f87642n.getVisibility() == 0) {
                string = MaterialCalendar.this.getString(ce.j.f61759C);
            } else {
                string = MaterialCalendar.this.getString(ce.j.f61757A);
            }
            yVar.C0(string);
        }
    }

    class i extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.m f87656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f87657b;

        i(com.google.android.material.datepicker.m mVar, MaterialButton materialButton) {
            this.f87656a = mVar;
            this.f87657b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f87657b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iR2 = i10 < 0 ? MaterialCalendar.this.a1().r2() : MaterialCalendar.this.a1().u2();
            MaterialCalendar.this.f87634f = this.f87656a.c(iR2);
            this.f87657b.setText(this.f87656a.g(iR2));
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
        final /* synthetic */ com.google.android.material.datepicker.m f87660a;

        k(com.google.android.material.datepicker.m mVar) {
            this.f87660a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iR2 = MaterialCalendar.this.a1().r2() + 1;
            if (iR2 < MaterialCalendar.this.f87638j.getAdapter().getItemCount()) {
                MaterialCalendar.this.i1(this.f87660a.c(iR2));
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

    private void J0(View view, com.google.android.material.datepicker.m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ce.f.f61718v);
        materialButton.setTag(f87629r);
        ViewCompat.m0(materialButton, new h());
        View viewFindViewById = view.findViewById(ce.f.f61720x);
        this.f87639k = viewFindViewById;
        viewFindViewById.setTag(f87627p);
        View viewFindViewById2 = view.findViewById(ce.f.f61719w);
        this.f87640l = viewFindViewById2;
        viewFindViewById2.setTag(f87628q);
        this.f87641m = view.findViewById(ce.f.f61675F);
        this.f87642n = view.findViewById(ce.f.f61670A);
        j1(l.DAY);
        materialButton.setText(this.f87634f.C());
        this.f87638j.addOnScrollListener(new i(mVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f87640l.setOnClickListener(new k(mVar));
        this.f87639k.setOnClickListener(new a(mVar));
    }

    private RecyclerView.o K0() {
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
        this.f87638j.post(new b(i10));
    }

    private void k1() {
        ViewCompat.m0(this.f87638j, new f());
    }

    com.google.android.material.datepicker.a L0() {
        return this.f87632d;
    }

    com.google.android.material.datepicker.c M0() {
        return this.f87636h;
    }

    com.google.android.material.datepicker.k N0() {
        return this.f87634f;
    }

    public com.google.android.material.datepicker.d<S> U0() {
        return this.f87631c;
    }

    LinearLayoutManager a1() {
        return (LinearLayoutManager) this.f87638j.getLayoutManager();
    }

    void i1(com.google.android.material.datepicker.k kVar) {
        com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) this.f87638j.getAdapter();
        int iH = mVar.h(kVar);
        int iH2 = iH - mVar.h(this.f87634f);
        boolean z10 = Math.abs(iH2) > 3;
        boolean z11 = iH2 > 0;
        this.f87634f = kVar;
        if (z10 && z11) {
            this.f87638j.scrollToPosition(iH - 3);
            h1(iH);
        } else if (!z10) {
            h1(iH);
        } else {
            this.f87638j.scrollToPosition(iH + 3);
            h1(iH);
        }
    }

    void j1(l lVar) {
        this.f87635g = lVar;
        if (lVar == l.YEAR) {
            this.f87637i.getLayoutManager().O1(((r) this.f87637i.getAdapter()).g(this.f87634f.f87749c));
            this.f87641m.setVisibility(0);
            this.f87642n.setVisibility(8);
            this.f87639k.setVisibility(8);
            this.f87640l.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f87641m.setVisibility(8);
            this.f87642n.setVisibility(0);
            this.f87639k.setVisibility(0);
            this.f87640l.setVisibility(0);
            i1(this.f87634f);
        }
    }

    void l1() {
        l lVar = this.f87635g;
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
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f87630b);
        this.f87636h = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.k kVarN = this.f87632d.n();
        if (MaterialDatePicker.i1(contextThemeWrapper)) {
            i10 = ce.h.f61754y;
            i11 = 1;
        } else {
            i10 = ce.h.f61752w;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(Y0(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(ce.f.f61671B);
        ViewCompat.m0(gridView, new c());
        int i12 = this.f87632d.i();
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new com.google.android.material.datepicker.h(i12) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(kVarN.f87750d);
        gridView.setEnabled(false);
        this.f87638j = (RecyclerView) viewInflate.findViewById(ce.f.f61674E);
        this.f87638j.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f87638j.setTag(f87626o);
        com.google.android.material.datepicker.m mVar = new com.google.android.material.datepicker.m(contextThemeWrapper, this.f87631c, this.f87632d, this.f87633e, new e());
        this.f87638j.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(ce.g.f61725c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ce.f.f61675F);
        this.f87637i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f87637i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f87637i.setAdapter(new r(this));
            this.f87637i.addItemDecoration(K0());
        }
        if (viewInflate.findViewById(ce.f.f61718v) != null) {
            J0(viewInflate, mVar);
        }
        if (!MaterialDatePicker.i1(contextThemeWrapper)) {
            new u().b(this.f87638j);
        }
        this.f87638j.scrollToPosition(mVar.h(this.f87634f));
        k1();
        return viewInflate;
    }

    static int V0(Context context) {
        return context.getResources().getDimensionPixelSize(ce.d.f61613d0);
    }

    private static int Y0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ce.d.f61627k0) + resources.getDimensionPixelOffset(ce.d.f61629l0) + resources.getDimensionPixelOffset(ce.d.f61625j0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ce.d.f61617f0);
        int i10 = com.google.android.material.datepicker.l.f87754g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ce.d.f61613d0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ce.d.f61623i0)) + resources.getDimensionPixelOffset(ce.d.f61609b0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f87630b = bundle.getInt("THEME_RES_ID_KEY");
        this.f87631c = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f87632d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f87633e = (com.google.android.material.datepicker.g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f87634f = (com.google.android.material.datepicker.k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f87630b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f87631c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f87632d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f87633e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f87634f);
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean u0(n<S> nVar) {
        return super.u0(nVar);
    }
}

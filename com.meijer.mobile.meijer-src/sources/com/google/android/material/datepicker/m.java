package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes4.dex */
class m extends RecyclerView.h<b> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f87762a;

    /* renamed from: b, reason: collision with root package name */
    private final d<?> f87763b;

    /* renamed from: c, reason: collision with root package name */
    private final g f87764c;

    /* renamed from: d, reason: collision with root package name */
    private final MaterialCalendar.m f87765d;

    /* renamed from: e, reason: collision with root package name */
    private final int f87766e;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f87767a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f87767a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f87767a.getAdapter().r(i10)) {
                m.this.f87765d.a(this.f87767a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        final TextView f87769a;

        /* renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f87770b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ce.f.f61721y);
            this.f87769a = textView;
            ViewCompat.n0(textView, true);
            this.f87770b = (MaterialCalendarGridView) linearLayout.findViewById(ce.f.f61717u);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    k c(int i10) {
        return this.f87762a.n().F(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f87762a.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f87762a.n().F(i10).E();
    }

    int h(k kVar) {
        return this.f87762a.n().G(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        k kVarF = this.f87762a.n().F(i10);
        bVar.f87769a.setText(kVarF.C());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f87770b.findViewById(ce.f.f61717u);
        if (materialCalendarGridView.getAdapter() == null || !kVarF.equals(materialCalendarGridView.getAdapter().f87756a)) {
            l lVar = new l(kVarF, this.f87763b, this.f87762a, this.f87764c);
            materialCalendarGridView.setNumColumns(kVarF.f87750d);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    m(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g gVar, MaterialCalendar.m mVar) {
        int iV0;
        k kVarN = aVar.n();
        k kVarH = aVar.h();
        k kVarK = aVar.k();
        if (kVarN.compareTo(kVarK) <= 0) {
            if (kVarK.compareTo(kVarH) <= 0) {
                int iV02 = l.f87754g * MaterialCalendar.V0(context);
                if (MaterialDatePicker.i1(context)) {
                    iV0 = MaterialCalendar.V0(context);
                } else {
                    iV0 = 0;
                }
                this.f87766e = iV02 + iV0;
                this.f87762a = aVar;
                this.f87763b = dVar;
                this.f87764c = gVar;
                this.f87765d = mVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    CharSequence g(int i10) {
        return c(i10).C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ce.h.f61753x, viewGroup, false);
        if (MaterialDatePicker.i1(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f87766e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}

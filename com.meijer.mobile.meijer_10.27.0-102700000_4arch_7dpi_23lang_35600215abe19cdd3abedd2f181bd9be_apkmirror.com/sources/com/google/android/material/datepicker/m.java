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
    private final com.google.android.material.datepicker.a f86922a;

    /* renamed from: b, reason: collision with root package name */
    private final d<?> f86923b;

    /* renamed from: c, reason: collision with root package name */
    private final g f86924c;

    /* renamed from: d, reason: collision with root package name */
    private final MaterialCalendar.m f86925d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86926e;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f86927a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f86927a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f86927a.getAdapter().r(i10)) {
                m.this.f86925d.a(this.f86927a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        final TextView f86929a;

        /* renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f86930b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ae.f.f44706y);
            this.f86929a = textView;
            ViewCompat.n0(textView, true);
            this.f86930b = (MaterialCalendarGridView) linearLayout.findViewById(ae.f.f44702u);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    k c(int i10) {
        return this.f86922a.n().F(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f86922a.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f86922a.n().F(i10).E();
    }

    int h(k kVar) {
        return this.f86922a.n().G(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        k kVarF = this.f86922a.n().F(i10);
        bVar.f86929a.setText(kVarF.C());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f86930b.findViewById(ae.f.f44702u);
        if (materialCalendarGridView.getAdapter() == null || !kVarF.equals(materialCalendarGridView.getAdapter().f86916a)) {
            l lVar = new l(kVarF, this.f86923b, this.f86922a, this.f86924c);
            materialCalendarGridView.setNumColumns(kVarF.f86910d);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    m(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g gVar, MaterialCalendar.m mVar) {
        int iX0;
        k kVarN = aVar.n();
        k kVarH = aVar.h();
        k kVarK = aVar.k();
        if (kVarN.compareTo(kVarK) <= 0) {
            if (kVarK.compareTo(kVarH) <= 0) {
                int iX02 = l.f86914g * MaterialCalendar.X0(context);
                if (MaterialDatePicker.i1(context)) {
                    iX0 = MaterialCalendar.X0(context);
                } else {
                    iX0 = 0;
                }
                this.f86926e = iX02 + iX0;
                this.f86922a = aVar;
                this.f86923b = dVar;
                this.f86924c = gVar;
                this.f86925d = mVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    CharSequence f(int i10) {
        return c(i10).C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(ae.h.f44738x, viewGroup, false);
        if (MaterialDatePicker.i1(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f86926e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}

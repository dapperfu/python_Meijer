package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
class r extends RecyclerView.h<b> {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCalendar<?> f86936a;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f86937a;

        a(int i10) {
            this.f86937a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r.this.f86936a.i1(r.this.f86936a.K0().f(k.b(this.f86937a, r.this.f86936a.O0().f86908b)));
            r.this.f86936a.j1(MaterialCalendar.l.DAY);
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        final TextView f86939a;

        b(TextView textView) {
            super(textView);
            this.f86939a = textView;
        }
    }

    private View.OnClickListener c(int i10) {
        return new a(i10);
    }

    int f(int i10) {
        return i10 - this.f86936a.K0().n().f86909c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f86936a.K0().o();
    }

    int h(int i10) {
        return this.f86936a.K0().n().f86909c + i10;
    }

    r(MaterialCalendar<?> materialCalendar) {
        this.f86936a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        com.google.android.material.datepicker.b bVar2;
        int iH = h(i10);
        bVar.f86939a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iH)));
        TextView textView = bVar.f86939a;
        textView.setContentDescription(e.e(textView.getContext(), iH));
        c cVarL0 = this.f86936a.L0();
        Calendar calendarG = q.g();
        if (calendarG.get(1) == iH) {
            bVar2 = cVarL0.f86898f;
        } else {
            bVar2 = cVarL0.f86896d;
        }
        Iterator<Long> it = this.f86936a.T0().o3().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iH) {
                bVar2 = cVarL0.f86897e;
            }
        }
        bVar2.d(bVar.f86939a);
        bVar.f86939a.setOnClickListener(c(iH));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ae.h.f44740z, viewGroup, false));
    }
}

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
    private final MaterialCalendar<?> f87776a;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87777a;

        a(int i10) {
            this.f87777a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r.this.f87776a.i1(r.this.f87776a.L0().f(k.b(this.f87777a, r.this.f87776a.N0().f87748b)));
            r.this.f87776a.j1(MaterialCalendar.l.DAY);
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        final TextView f87779a;

        b(TextView textView) {
            super(textView);
            this.f87779a = textView;
        }
    }

    private View.OnClickListener c(int i10) {
        return new a(i10);
    }

    int g(int i10) {
        return i10 - this.f87776a.L0().n().f87749c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.f87776a.L0().o();
    }

    int h(int i10) {
        return this.f87776a.L0().n().f87749c + i10;
    }

    r(MaterialCalendar<?> materialCalendar) {
        this.f87776a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        com.google.android.material.datepicker.b bVar2;
        int iH = h(i10);
        bVar.f87779a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iH)));
        TextView textView = bVar.f87779a;
        textView.setContentDescription(e.e(textView.getContext(), iH));
        c cVarM0 = this.f87776a.M0();
        Calendar calendarG = q.g();
        if (calendarG.get(1) == iH) {
            bVar2 = cVarM0.f87738f;
        } else {
            bVar2 = cVarM0.f87736d;
        }
        Iterator<Long> it = this.f87776a.U0().o3().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iH) {
                bVar2 = cVarM0.f87737e;
            }
        }
        bVar2.d(bVar.f87779a);
        bVar.f87779a.setOnClickListener(c(iH));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ce.h.f61755z, viewGroup, false));
    }
}

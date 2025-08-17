package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class o extends LinearLayoutManager {

    class a extends androidx.recyclerview.widget.p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Z1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        a2(aVar);
    }

    o(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }
}

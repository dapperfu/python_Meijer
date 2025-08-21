package com.meijer.mobile.ui.legacy.adapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f120080a = new SparseIntArray(0);

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f120080a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public List<e> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        if (f120080a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

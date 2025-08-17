package com.meijer.mobile.weeklyad;

import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DataBinderMapperImpl extends androidx.databinding.e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f119132a = new SparseIntArray(0);

    @Override // androidx.databinding.e
    public androidx.databinding.p c(androidx.databinding.f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f119132a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public List<androidx.databinding.e> a() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.design.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.i18n.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.legacy.databinding.viewmodel.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.coupon.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.legacy.adapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.legacy.progressview.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.navigation.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public androidx.databinding.p b(androidx.databinding.f fVar, View view, int i10) {
        if (f119132a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

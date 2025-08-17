package com.meijer.mobile.ui.navigation;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.p;
import java.util.ArrayList;
import java.util.List;
import ps.h0;
import qs.C16602b;
import qs.C16604d;

/* loaded from: classes11.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f119125a;

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f119125a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f119125a = sparseIntArray;
        sparseIntArray.put(h0.f156544a, 1);
        sparseIntArray.put(h0.f156545b, 2);
    }

    @Override // androidx.databinding.e
    public List<e> a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.design.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.i18n.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        int i11 = f119125a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/navigation_drawer_layout_0".equals(tag)) {
                return new C16602b(fVar, view);
            }
            throw new IllegalArgumentException("The tag for navigation_drawer_layout is invalid. Received: " + tag);
        }
        if (i11 != 2) {
            return null;
        }
        if ("layout/view_navigation_header_0".equals(tag)) {
            return new C16604d(fVar, view);
        }
        throw new IllegalArgumentException("The tag for view_navigation_header is invalid. Received: " + tag);
    }
}

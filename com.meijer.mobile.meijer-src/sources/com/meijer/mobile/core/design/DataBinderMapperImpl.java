package com.meijer.mobile.core.design;

import Cj.m;
import Oj.r;
import Oj.t;
import Oj.x;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f96847a;

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f96847a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f96847a = sparseIntArray;
        sparseIntArray.put(m.f4993r, 1);
        sparseIntArray.put(m.f4995t, 2);
        sparseIntArray.put(m.f5001z, 3);
    }

    @Override // androidx.databinding.e
    public List<e> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.i18n.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        int i11 = f96847a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/dds_how_to_pager_layout_0".equals(tag)) {
                return new r(fVar, view);
            }
            throw new IllegalArgumentException("The tag for dds_how_to_pager_layout is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/view_animation_frame_options_0".equals(tag)) {
                return new t(fVar, view);
            }
            throw new IllegalArgumentException("The tag for view_animation_frame_options is invalid. Received: " + tag);
        }
        if (i11 != 3) {
            return null;
        }
        if ("layout/view_how_tos_0".equals(tag)) {
            return new x(fVar, view);
        }
        throw new IllegalArgumentException("The tag for view_how_tos is invalid. Received: " + tag);
    }
}

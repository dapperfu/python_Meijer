package com.meijer.mobile.ui.legacy.progressview;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.p;
import java.util.ArrayList;
import java.util.List;
import ls.C15496c;
import ms.C15706b;

/* loaded from: classes11.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f119108a;

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f119108a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 1) {
                if ("layout/merge_widget_progress_view_0".equals(tag)) {
                    return new C15706b(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for merge_widget_progress_view is invalid. Received: " + tag);
            }
        }
        return null;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f119108a = sparseIntArray;
        sparseIntArray.put(C15496c.f149338a, 1);
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
        int i11 = f119108a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 != 1) {
            return null;
        }
        if ("layout/merge_widget_progress_view_0".equals(tag)) {
            return new C15706b(fVar, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for merge_widget_progress_view is invalid. Received: " + tag);
    }
}

package com.meijer.mobile.ui.coupon;

import Rr.b;
import Rr.d;
import Rr.h;
import Rr.j;
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
    private static final SparseIntArray f120079a;

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f120079a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f120079a = sparseIntArray;
        sparseIntArray.put(Nr.e.f22632a, 1);
        sparseIntArray.put(Nr.e.f22633b, 2);
        sparseIntArray.put(Nr.e.f22634c, 3);
        sparseIntArray.put(Nr.e.f22635d, 4);
        sparseIntArray.put(Nr.e.f22636e, 5);
    }

    @Override // androidx.databinding.e
    public List<e> a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.design.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.i18n.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.legacy.databinding.viewmodel.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.navigation.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        int i11 = f120079a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/coupons_intro_header_0".equals(tag)) {
                return new b(fVar, view);
            }
            throw new IllegalArgumentException("The tag for coupons_intro_header is invalid. Received: " + tag);
        }
        if (i11 == 2) {
            if ("layout/list_item_coupon_section_header_0".equals(tag)) {
                return new d(fVar, view);
            }
            throw new IllegalArgumentException("The tag for list_item_coupon_section_header is invalid. Received: " + tag);
        }
        if (i11 == 3) {
            if ("layout/list_item_special_offer_banner_0".equals(tag)) {
                return new Rr.f(fVar, view);
            }
            throw new IllegalArgumentException("The tag for list_item_special_offer_banner is invalid. Received: " + tag);
        }
        if (i11 == 4) {
            if ("layout/view_ad_0".equals(tag)) {
                return new h(fVar, view);
            }
            throw new IllegalArgumentException("The tag for view_ad is invalid. Received: " + tag);
        }
        if (i11 != 5) {
            return null;
        }
        if ("layout/view_coupon_list_0".equals(tag)) {
            return new j(fVar, view);
        }
        throw new IllegalArgumentException("The tag for view_coupon_list is invalid. Received: " + tag);
    }
}

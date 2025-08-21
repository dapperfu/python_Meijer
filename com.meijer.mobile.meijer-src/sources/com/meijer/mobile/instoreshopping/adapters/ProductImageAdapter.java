package com.meijer.mobile.instoreshopping.adapters;

import com.meijer.mobile.instoreshopping.service.productimages.model.response.ProductImagesResponse;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/instoreshopping/adapters/ProductImageAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/k;", "data", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/ProductImagesResponse;", "listAdapter", "", "", "fromJson", "(Lcom/squareup/moshi/k;Lcom/squareup/moshi/h;)Ljava/util/Map;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProductImageAdapter {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.c.values().length];
            try {
                iArr[k.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @f
    public final Map<String, List<ProductImagesResponse>> fromJson(k data, h<List<ProductImagesResponse>> listAdapter) throws IOException {
        List<ProductImagesResponse> listM;
        Intrinsics.j(data, "data");
        Intrinsics.j(listAdapter, "listAdapter");
        k.c cVarL = data.l();
        HashMap map = new HashMap();
        if (cVarL == k.c.BEGIN_OBJECT) {
            data.b();
            while (data.hasNext()) {
                String strNextName = data.nextName();
                k.c cVarL2 = data.l();
                if ((cVarL2 == null ? -1 : a.$EnumSwitchMapping$0[cVarL2.ordinal()]) == 1) {
                    listM = listAdapter.fromJson(data);
                    if (listM == null) {
                        listM = CollectionsKt.m();
                    }
                } else {
                    data.skipValue();
                    listM = CollectionsKt.m();
                }
                map.put(strNextName, listM);
            }
            data.d();
        }
        return map;
    }
}

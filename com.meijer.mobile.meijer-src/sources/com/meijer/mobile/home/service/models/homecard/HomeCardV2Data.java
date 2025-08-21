package com.meijer.mobile.home.service.models.homecard;

import com.meijer.mobile.home.service.models.departmentcard.HomeDepartmentJson;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.ResultData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/home/service/models/homecard/HomeCardV2Data;", "", "", "Lio/constructor/data/model/common/ResultData;", "products", "Lcom/meijer/mobile/home/service/models/departmentcard/HomeDepartmentJson;", "departments", "", "onViewBeacon", "onLoadBeacon", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/homecard/HomeCardV2Data;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HomeCardV2Data {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ResultData> products;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HomeDepartmentJson> departments;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onViewBeacon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onLoadBeacon;

    public HomeCardV2Data() {
        this(null, null, null, null, 15, null);
    }

    public final HomeCardV2Data copy(@g(name = "products") List<ResultData> products, @g(name = "departments") List<HomeDepartmentJson> departments, @g(name = "onViewBeacon") String onViewBeacon, @g(name = "onLoadBeacon") String onLoadBeacon) {
        Intrinsics.j(products, "products");
        Intrinsics.j(departments, "departments");
        return new HomeCardV2Data(products, departments, onViewBeacon, onLoadBeacon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCardV2Data)) {
            return false;
        }
        HomeCardV2Data homeCardV2Data = (HomeCardV2Data) other;
        return Intrinsics.e(this.products, homeCardV2Data.products) && Intrinsics.e(this.departments, homeCardV2Data.departments) && Intrinsics.e(this.onViewBeacon, homeCardV2Data.onViewBeacon) && Intrinsics.e(this.onLoadBeacon, homeCardV2Data.onLoadBeacon);
    }

    public int hashCode() {
        int iHashCode = ((this.products.hashCode() * 31) + this.departments.hashCode()) * 31;
        String str = this.onViewBeacon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onLoadBeacon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HomeCardV2Data(products=" + this.products + ", departments=" + this.departments + ", onViewBeacon=" + this.onViewBeacon + ", onLoadBeacon=" + this.onLoadBeacon + ')';
    }

    public HomeCardV2Data(@g(name = "products") List<ResultData> products, @g(name = "departments") List<HomeDepartmentJson> departments, @g(name = "onViewBeacon") String str, @g(name = "onLoadBeacon") String str2) {
        Intrinsics.j(products, "products");
        Intrinsics.j(departments, "departments");
        this.products = products;
        this.departments = departments;
        this.onViewBeacon = str;
        this.onLoadBeacon = str2;
    }

    public final List<HomeDepartmentJson> a() {
        return this.departments;
    }

    /* renamed from: b, reason: from getter */
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    /* renamed from: c, reason: from getter */
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    public final List<ResultData> d() {
        return this.products;
    }

    public /* synthetic */ HomeCardV2Data(List list, List list2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? CollectionsKt.m() : list2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}

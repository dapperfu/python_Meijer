package Tl;

import Vl.MarketingBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"LTl/a;", "", "", "LVl/i;", "cmsBannerList", "", "specialOffersBanner", "targetBannerList", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "Ljava/lang/String;", "c", "getTargetBannerList", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Tl.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class MarketingBannersDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MarketingBanner> cmsBannerList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialOffersBanner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MarketingBanner> targetBannerList;

    public MarketingBannersDecorator() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingBannersDecorator)) {
            return false;
        }
        MarketingBannersDecorator marketingBannersDecorator = (MarketingBannersDecorator) other;
        return Intrinsics.e(this.cmsBannerList, marketingBannersDecorator.cmsBannerList) && Intrinsics.e(this.specialOffersBanner, marketingBannersDecorator.specialOffersBanner) && Intrinsics.e(this.targetBannerList, marketingBannersDecorator.targetBannerList);
    }

    public MarketingBannersDecorator(List<MarketingBanner> list, String str, List<MarketingBanner> targetBannerList) {
        Intrinsics.j(targetBannerList, "targetBannerList");
        this.cmsBannerList = list;
        this.specialOffersBanner = str;
        this.targetBannerList = targetBannerList;
    }

    public final List<MarketingBanner> a() {
        List listM1 = CollectionsKt.m1(this.targetBannerList);
        List<MarketingBanner> list = this.cmsBannerList;
        if (list != null) {
            for (MarketingBanner marketingBanner : list) {
                Iterator it = listM1.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    if (((MarketingBanner) it.next()) == null) {
                        break;
                    }
                    i10++;
                }
                if (i10 > -1) {
                    listM1.set(i10, marketingBanner);
                }
            }
        }
        List<MarketingBanner> listP0 = CollectionsKt.p0(listM1);
        if (listP0.isEmpty()) {
            listP0 = null;
        }
        return listP0;
    }

    public final List<MarketingBanner> b() {
        return this.cmsBannerList;
    }

    /* renamed from: c, reason: from getter */
    public final String getSpecialOffersBanner() {
        return this.specialOffersBanner;
    }

    public int hashCode() {
        List<MarketingBanner> list = this.cmsBannerList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.specialOffersBanner;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.targetBannerList.hashCode();
    }

    public String toString() {
        return "MarketingBannersDecorator(cmsBannerList=" + this.cmsBannerList + ", specialOffersBanner=" + this.specialOffersBanner + ", targetBannerList=" + this.targetBannerList + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public /* synthetic */ MarketingBannersDecorator(List list, String str, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i10 & 1) != 0 ? null : list;
        str = (i10 & 2) != 0 ? null : str;
        if ((i10 & 4) != 0) {
            list2 = new ArrayList(5);
            for (int i11 = 0; i11 < 5; i11++) {
                list2.add(null);
            }
        }
        this(list, str, list2);
    }
}

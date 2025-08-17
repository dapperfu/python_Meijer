package com.meijer.mobile.home.service.models.contentManagementSystem;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "", "", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "bottomBanners", "topBanner", "", "specialOffersBannerURL", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "c", "()Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HomeCMSBannerResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("bottomBanners")
    private final List<CMSBanner> bottomBanners;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("topBanner")
    private final CMSBanner topBanner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("specialOffersBannerURL")
    private final String specialOffersBannerURL;

    public HomeCMSBannerResponse() {
        this(null, null, null, 7, null);
    }

    public final HomeCMSBannerResponse copy(@g(name = "bottomBanners") List<CMSBanner> bottomBanners, @g(name = "topBanner") CMSBanner topBanner, @g(name = "specialOffersBannerURL") String specialOffersBannerURL) {
        return new HomeCMSBannerResponse(bottomBanners, topBanner, specialOffersBannerURL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCMSBannerResponse)) {
            return false;
        }
        HomeCMSBannerResponse homeCMSBannerResponse = (HomeCMSBannerResponse) other;
        return Intrinsics.e(this.bottomBanners, homeCMSBannerResponse.bottomBanners) && Intrinsics.e(this.topBanner, homeCMSBannerResponse.topBanner) && Intrinsics.e(this.specialOffersBannerURL, homeCMSBannerResponse.specialOffersBannerURL);
    }

    public int hashCode() {
        List<CMSBanner> list = this.bottomBanners;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        CMSBanner cMSBanner = this.topBanner;
        int iHashCode2 = (iHashCode + (cMSBanner == null ? 0 : cMSBanner.hashCode())) * 31;
        String str = this.specialOffersBannerURL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HomeCMSBannerResponse(bottomBanners=" + this.bottomBanners + ", topBanner=" + this.topBanner + ", specialOffersBannerURL=" + this.specialOffersBannerURL + ')';
    }

    public HomeCMSBannerResponse(@g(name = "bottomBanners") List<CMSBanner> list, @g(name = "topBanner") CMSBanner cMSBanner, @g(name = "specialOffersBannerURL") String str) {
        this.bottomBanners = list;
        this.topBanner = cMSBanner;
        this.specialOffersBannerURL = str;
    }

    public final List<CMSBanner> a() {
        return this.bottomBanners;
    }

    /* renamed from: b, reason: from getter */
    public final String getSpecialOffersBannerURL() {
        return this.specialOffersBannerURL;
    }

    /* renamed from: c, reason: from getter */
    public final CMSBanner getTopBanner() {
        return this.topBanner;
    }

    public /* synthetic */ HomeCMSBannerResponse(List list, CMSBanner cMSBanner, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? null : cMSBanner, (i10 & 4) != 0 ? null : str);
    }
}

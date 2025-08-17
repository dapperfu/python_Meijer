package Ul;

import hi.AbstractC14482i;
import hi.C14476c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001c"}, d2 = {"LUl/i;", "", "", "bannerContentDescription", "bannerImageURL", "linkURL", "", "analyticsEntries", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "Lhi/i$b;", "d", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ul.i, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class MarketingBanner {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerContentDescription;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerImageURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String linkURL;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> analyticsEntries;

    public MarketingBanner(String str, String bannerImageURL, String str2, Map<String, String> map) {
        Intrinsics.j(bannerImageURL, "bannerImageURL");
        this.bannerContentDescription = str;
        this.bannerImageURL = bannerImageURL;
        this.linkURL = str2;
        this.analyticsEntries = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingBanner)) {
            return false;
        }
        MarketingBanner marketingBanner = (MarketingBanner) other;
        return Intrinsics.e(this.bannerContentDescription, marketingBanner.bannerContentDescription) && Intrinsics.e(this.bannerImageURL, marketingBanner.bannerImageURL) && Intrinsics.e(this.linkURL, marketingBanner.linkURL) && Intrinsics.e(this.analyticsEntries, marketingBanner.analyticsEntries);
    }

    /* renamed from: a, reason: from getter */
    public final String getBannerContentDescription() {
        return this.bannerContentDescription;
    }

    /* renamed from: b, reason: from getter */
    public final String getBannerImageURL() {
        return this.bannerImageURL;
    }

    /* renamed from: c, reason: from getter */
    public final String getLinkURL() {
        return this.linkURL;
    }

    public final List<AbstractC14482i.Extra> d() {
        Map<String, String> map = this.analyticsEntries;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(C14476c.b(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public int hashCode() {
        String str = this.bannerContentDescription;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.bannerImageURL.hashCode()) * 31;
        String str2 = this.linkURL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.analyticsEntries;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "MarketingBanner(bannerContentDescription=" + this.bannerContentDescription + ", bannerImageURL=" + this.bannerImageURL + ", linkURL=" + this.linkURL + ", analyticsEntries=" + this.analyticsEntries + ')';
    }

    public /* synthetic */ MarketingBanner(String str, String str2, String str3, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : map);
    }
}

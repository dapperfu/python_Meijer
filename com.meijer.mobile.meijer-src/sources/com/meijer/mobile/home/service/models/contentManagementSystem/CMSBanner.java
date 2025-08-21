package com.meijer.mobile.home.service.models.contentManagementSystem;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "", "", "deeplinkURL", "bannerURL", "", "locationIndex", "analyticsTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "d", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CMSBanner {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("deeplinkURL")
    private final String deeplinkURL;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("bannerURL")
    private final String bannerURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("locationIndex")
    private final int locationIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("analyticsTag")
    private final String analyticsTag;

    @JvmOverloads
    public CMSBanner() {
        this(null, null, 0, null, 15, null);
    }

    public final CMSBanner copy(@g(name = "deeplinkURL") String deeplinkURL, @g(name = "bannerURL") String bannerURL, @g(name = "locationIndex") int locationIndex, @g(name = "analyticsTag") String analyticsTag) {
        return new CMSBanner(deeplinkURL, bannerURL, locationIndex, analyticsTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CMSBanner)) {
            return false;
        }
        CMSBanner cMSBanner = (CMSBanner) other;
        return Intrinsics.e(this.deeplinkURL, cMSBanner.deeplinkURL) && Intrinsics.e(this.bannerURL, cMSBanner.bannerURL) && this.locationIndex == cMSBanner.locationIndex && Intrinsics.e(this.analyticsTag, cMSBanner.analyticsTag);
    }

    public int hashCode() {
        String str = this.deeplinkURL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerURL;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.locationIndex)) * 31;
        String str3 = this.analyticsTag;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CMSBanner(deeplinkURL=" + this.deeplinkURL + ", bannerURL=" + this.bannerURL + ", locationIndex=" + this.locationIndex + ", analyticsTag=" + this.analyticsTag + ')';
    }

    @JvmOverloads
    public CMSBanner(@g(name = "deeplinkURL") String str) {
        this(str, null, 0, null, 14, null);
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsTag() {
        return this.analyticsTag;
    }

    /* renamed from: b, reason: from getter */
    public final String getBannerURL() {
        return this.bannerURL;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeeplinkURL() {
        return this.deeplinkURL;
    }

    /* renamed from: d, reason: from getter */
    public final int getLocationIndex() {
        return this.locationIndex;
    }

    @JvmOverloads
    public CMSBanner(@g(name = "deeplinkURL") String str, @g(name = "bannerURL") String str2) {
        this(str, str2, 0, null, 12, null);
    }

    @JvmOverloads
    public CMSBanner(@g(name = "deeplinkURL") String str, @g(name = "bannerURL") String str2, @g(name = "locationIndex") int i10) {
        this(str, str2, i10, null, 8, null);
    }

    @JvmOverloads
    public CMSBanner(@g(name = "deeplinkURL") String str, @g(name = "bannerURL") String str2, @g(name = "locationIndex") int i10, @g(name = "analyticsTag") String str3) {
        this.deeplinkURL = str;
        this.bannerURL = str2;
        this.locationIndex = i10;
        this.analyticsTag = str3;
    }

    public /* synthetic */ CMSBanner(String str, String str2, int i10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str3);
    }
}

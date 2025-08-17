package com.meijer.mobile.weeklyad.services.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\f\u001a\u00020\b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015JÈ\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b*\u0010\u001bR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b+\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b \u0010\u0019¨\u00062"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPublicationJson;", "", "", "flyerType", "firstPageImageUrlLarge", "firstPageThumbnailUrlMedium", "firstPageImageUrlSmall", "firstPageThumbnailUrl", "", "totalPages", "flyerID", "flyerRunId", "flyerTypeId", "sfmlUrl", "storefrontUrl", "postalCode", "validFrom", "validTo", "name", "externalDisplayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPublicationJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "c", "e", "d", "f", "I", "n", "g", "i", "j", "l", "k", "m", "o", "p", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlippWeeklyAdPublicationJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String flyerType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstPageImageUrlLarge;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstPageThumbnailUrlMedium;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstPageImageUrlSmall;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstPageThumbnailUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalPages;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerID;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerRunId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerTypeId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sfmlUrl;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storefrontUrl;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validFrom;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validTo;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalDisplayName;

    public FlippWeeklyAdPublicationJson() {
        this(null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, 65535, null);
    }

    public final FlippWeeklyAdPublicationJson copy(@g(name = "flyer_type") String flyerType, @g(name = "first_page_thumbnail_2000h_url") String firstPageImageUrlLarge, @g(name = "first_page_thumbnail_400h_url") String firstPageThumbnailUrlMedium, @g(name = "first_page_thumbnail_150h_url") String firstPageImageUrlSmall, @g(name = "first_page_thumbnail_url") String firstPageThumbnailUrl, @g(name = "total_pages") int totalPages, @g(name = PreferencesHelper.PREF_ID) int flyerID, @g(name = "flyer_run_id") int flyerRunId, @g(name = "flyer_type_id") int flyerTypeId, @g(name = "sfml_url") String sfmlUrl, @g(name = "storefront_payload_url") String storefrontUrl, @g(name = PlaceTypes.POSTAL_CODE) String postalCode, @g(name = "valid_from") String validFrom, @g(name = "valid_to") String validTo, @g(name = "name") String name, @g(name = "external_display_name") String externalDisplayName) {
        return new FlippWeeklyAdPublicationJson(flyerType, firstPageImageUrlLarge, firstPageThumbnailUrlMedium, firstPageImageUrlSmall, firstPageThumbnailUrl, totalPages, flyerID, flyerRunId, flyerTypeId, sfmlUrl, storefrontUrl, postalCode, validFrom, validTo, name, externalDisplayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlippWeeklyAdPublicationJson)) {
            return false;
        }
        FlippWeeklyAdPublicationJson flippWeeklyAdPublicationJson = (FlippWeeklyAdPublicationJson) other;
        return Intrinsics.e(this.flyerType, flippWeeklyAdPublicationJson.flyerType) && Intrinsics.e(this.firstPageImageUrlLarge, flippWeeklyAdPublicationJson.firstPageImageUrlLarge) && Intrinsics.e(this.firstPageThumbnailUrlMedium, flippWeeklyAdPublicationJson.firstPageThumbnailUrlMedium) && Intrinsics.e(this.firstPageImageUrlSmall, flippWeeklyAdPublicationJson.firstPageImageUrlSmall) && Intrinsics.e(this.firstPageThumbnailUrl, flippWeeklyAdPublicationJson.firstPageThumbnailUrl) && this.totalPages == flippWeeklyAdPublicationJson.totalPages && this.flyerID == flippWeeklyAdPublicationJson.flyerID && this.flyerRunId == flippWeeklyAdPublicationJson.flyerRunId && this.flyerTypeId == flippWeeklyAdPublicationJson.flyerTypeId && Intrinsics.e(this.sfmlUrl, flippWeeklyAdPublicationJson.sfmlUrl) && Intrinsics.e(this.storefrontUrl, flippWeeklyAdPublicationJson.storefrontUrl) && Intrinsics.e(this.postalCode, flippWeeklyAdPublicationJson.postalCode) && Intrinsics.e(this.validFrom, flippWeeklyAdPublicationJson.validFrom) && Intrinsics.e(this.validTo, flippWeeklyAdPublicationJson.validTo) && Intrinsics.e(this.name, flippWeeklyAdPublicationJson.name) && Intrinsics.e(this.externalDisplayName, flippWeeklyAdPublicationJson.externalDisplayName);
    }

    public int hashCode() {
        String str = this.flyerType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstPageImageUrlLarge;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstPageThumbnailUrlMedium;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstPageImageUrlSmall;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstPageThumbnailUrl;
        int iHashCode5 = (((((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.flyerID)) * 31) + Integer.hashCode(this.flyerRunId)) * 31) + Integer.hashCode(this.flyerTypeId)) * 31;
        String str6 = this.sfmlUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.storefrontUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postalCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.validFrom;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.validTo;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.externalDisplayName;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "FlippWeeklyAdPublicationJson(flyerType=" + this.flyerType + ", firstPageImageUrlLarge=" + this.firstPageImageUrlLarge + ", firstPageThumbnailUrlMedium=" + this.firstPageThumbnailUrlMedium + ", firstPageImageUrlSmall=" + this.firstPageImageUrlSmall + ", firstPageThumbnailUrl=" + this.firstPageThumbnailUrl + ", totalPages=" + this.totalPages + ", flyerID=" + this.flyerID + ", flyerRunId=" + this.flyerRunId + ", flyerTypeId=" + this.flyerTypeId + ", sfmlUrl=" + this.sfmlUrl + ", storefrontUrl=" + this.storefrontUrl + ", postalCode=" + this.postalCode + ", validFrom=" + this.validFrom + ", validTo=" + this.validTo + ", name=" + this.name + ", externalDisplayName=" + this.externalDisplayName + ')';
    }

    public FlippWeeklyAdPublicationJson(@g(name = "flyer_type") String str, @g(name = "first_page_thumbnail_2000h_url") String str2, @g(name = "first_page_thumbnail_400h_url") String str3, @g(name = "first_page_thumbnail_150h_url") String str4, @g(name = "first_page_thumbnail_url") String str5, @g(name = "total_pages") int i10, @g(name = PreferencesHelper.PREF_ID) int i11, @g(name = "flyer_run_id") int i12, @g(name = "flyer_type_id") int i13, @g(name = "sfml_url") String str6, @g(name = "storefront_payload_url") String str7, @g(name = PlaceTypes.POSTAL_CODE) String str8, @g(name = "valid_from") String str9, @g(name = "valid_to") String str10, @g(name = "name") String str11, @g(name = "external_display_name") String str12) {
        this.flyerType = str;
        this.firstPageImageUrlLarge = str2;
        this.firstPageThumbnailUrlMedium = str3;
        this.firstPageImageUrlSmall = str4;
        this.firstPageThumbnailUrl = str5;
        this.totalPages = i10;
        this.flyerID = i11;
        this.flyerRunId = i12;
        this.flyerTypeId = i13;
        this.sfmlUrl = str6;
        this.storefrontUrl = str7;
        this.postalCode = str8;
        this.validFrom = str9;
        this.validTo = str10;
        this.name = str11;
        this.externalDisplayName = str12;
    }

    /* renamed from: a, reason: from getter */
    public final String getExternalDisplayName() {
        return this.externalDisplayName;
    }

    /* renamed from: b, reason: from getter */
    public final String getFirstPageImageUrlLarge() {
        return this.firstPageImageUrlLarge;
    }

    /* renamed from: c, reason: from getter */
    public final String getFirstPageImageUrlSmall() {
        return this.firstPageImageUrlSmall;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstPageThumbnailUrl() {
        return this.firstPageThumbnailUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getFirstPageThumbnailUrlMedium() {
        return this.firstPageThumbnailUrlMedium;
    }

    /* renamed from: f, reason: from getter */
    public final int getFlyerID() {
        return this.flyerID;
    }

    /* renamed from: g, reason: from getter */
    public final int getFlyerRunId() {
        return this.flyerRunId;
    }

    /* renamed from: h, reason: from getter */
    public final String getFlyerType() {
        return this.flyerType;
    }

    /* renamed from: i, reason: from getter */
    public final int getFlyerTypeId() {
        return this.flyerTypeId;
    }

    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: k, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: l, reason: from getter */
    public final String getSfmlUrl() {
        return this.sfmlUrl;
    }

    /* renamed from: m, reason: from getter */
    public final String getStorefrontUrl() {
        return this.storefrontUrl;
    }

    /* renamed from: n, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: o, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* renamed from: p, reason: from getter */
    public final String getValidTo() {
        return this.validTo;
    }

    public /* synthetic */ FlippWeeklyAdPublicationJson(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, int i13, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? 0 : i10, (i14 & 64) != 0 ? 0 : i11, (i14 & 128) != 0 ? 0 : i12, (i14 & 256) == 0 ? i13 : 0, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : str7, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str8, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str9, (i14 & 8192) != 0 ? null : str10, (i14 & 16384) != 0 ? null : str11, (i14 & 32768) != 0 ? null : str12);
    }
}

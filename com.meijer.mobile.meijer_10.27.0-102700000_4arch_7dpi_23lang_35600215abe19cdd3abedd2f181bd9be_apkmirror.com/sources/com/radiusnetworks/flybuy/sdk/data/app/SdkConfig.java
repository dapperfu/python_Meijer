package com.radiusnetworks.flybuy.sdk.data.app;

import com.radiusnetworks.flybuy.api.model.PickupLocationFilters;
import com.radiusnetworks.flybuy.api.model.PickupStates;
import com.radiusnetworks.flybuy.sdk.data.notify.NotifyConfig;
import com.radiusnetworks.flybuy.sdk.data.places.PlacesConfig;
import com.radiusnetworks.flybuy.sdk.data.wrongsitearrival.WrongSiteArrivalConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jt\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\tHÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "", "appUpgrade", "Lcom/radiusnetworks/flybuy/sdk/data/app/AppUpgrade;", "nearbySitesFeatureUrl", "", "notifyConfig", "Lcom/radiusnetworks/flybuy/sdk/data/notify/NotifyConfig;", "notifyMaxSites", "", "wrongSiteArrivalConfig", "Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "etaConfig", "Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;", "pickupLocationFilters", "Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "pickupStates", "Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "placesConfig", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;", "(Lcom/radiusnetworks/flybuy/sdk/data/app/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/notify/NotifyConfig;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;)V", "getAppUpgrade", "()Lcom/radiusnetworks/flybuy/sdk/data/app/AppUpgrade;", "getEtaConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;", "getNearbySitesFeatureUrl", "()Ljava/lang/String;", "getNotifyConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/notify/NotifyConfig;", "getNotifyMaxSites", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPickupLocationFilters", "()Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "getPickupStates", "()Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "getPlacesConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;", "getWrongSiteArrivalConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/radiusnetworks/flybuy/sdk/data/app/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/notify/NotifyConfig;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;)Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "equals", "", "other", "hashCode", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SdkConfig {
    private final AppUpgrade appUpgrade;
    private final ETAConfig etaConfig;
    private final String nearbySitesFeatureUrl;
    private final NotifyConfig notifyConfig;
    private final Integer notifyMaxSites;
    private final PickupLocationFilters pickupLocationFilters;
    private final PickupStates pickupStates;
    private final PlacesConfig placesConfig;
    private final WrongSiteArrivalConfig wrongSiteArrivalConfig;

    public SdkConfig(AppUpgrade appUpgrade, String str, NotifyConfig notifyConfig, Integer num, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETAConfig eTAConfig, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, PlacesConfig placesConfig) {
        Intrinsics.j(wrongSiteArrivalConfig, "wrongSiteArrivalConfig");
        Intrinsics.j(pickupLocationFilters, "pickupLocationFilters");
        Intrinsics.j(pickupStates, "pickupStates");
        this.appUpgrade = appUpgrade;
        this.nearbySitesFeatureUrl = str;
        this.notifyConfig = notifyConfig;
        this.notifyMaxSites = num;
        this.wrongSiteArrivalConfig = wrongSiteArrivalConfig;
        this.etaConfig = eTAConfig;
        this.pickupLocationFilters = pickupLocationFilters;
        this.pickupStates = pickupStates;
        this.placesConfig = placesConfig;
    }

    public static /* synthetic */ SdkConfig copy$default(SdkConfig sdkConfig, AppUpgrade appUpgrade, String str, NotifyConfig notifyConfig, Integer num, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETAConfig eTAConfig, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, PlacesConfig placesConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appUpgrade = sdkConfig.appUpgrade;
        }
        if ((i10 & 2) != 0) {
            str = sdkConfig.nearbySitesFeatureUrl;
        }
        if ((i10 & 4) != 0) {
            notifyConfig = sdkConfig.notifyConfig;
        }
        if ((i10 & 8) != 0) {
            num = sdkConfig.notifyMaxSites;
        }
        if ((i10 & 16) != 0) {
            wrongSiteArrivalConfig = sdkConfig.wrongSiteArrivalConfig;
        }
        if ((i10 & 32) != 0) {
            eTAConfig = sdkConfig.etaConfig;
        }
        if ((i10 & 64) != 0) {
            pickupLocationFilters = sdkConfig.pickupLocationFilters;
        }
        if ((i10 & 128) != 0) {
            pickupStates = sdkConfig.pickupStates;
        }
        if ((i10 & 256) != 0) {
            placesConfig = sdkConfig.placesConfig;
        }
        PickupStates pickupStates2 = pickupStates;
        PlacesConfig placesConfig2 = placesConfig;
        ETAConfig eTAConfig2 = eTAConfig;
        PickupLocationFilters pickupLocationFilters2 = pickupLocationFilters;
        WrongSiteArrivalConfig wrongSiteArrivalConfig2 = wrongSiteArrivalConfig;
        NotifyConfig notifyConfig2 = notifyConfig;
        return sdkConfig.copy(appUpgrade, str, notifyConfig2, num, wrongSiteArrivalConfig2, eTAConfig2, pickupLocationFilters2, pickupStates2, placesConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final AppUpgrade getAppUpgrade() {
        return this.appUpgrade;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNearbySitesFeatureUrl() {
        return this.nearbySitesFeatureUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final NotifyConfig getNotifyConfig() {
        return this.notifyConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getNotifyMaxSites() {
        return this.notifyMaxSites;
    }

    /* renamed from: component5, reason: from getter */
    public final WrongSiteArrivalConfig getWrongSiteArrivalConfig() {
        return this.wrongSiteArrivalConfig;
    }

    /* renamed from: component6, reason: from getter */
    public final ETAConfig getEtaConfig() {
        return this.etaConfig;
    }

    /* renamed from: component7, reason: from getter */
    public final PickupLocationFilters getPickupLocationFilters() {
        return this.pickupLocationFilters;
    }

    /* renamed from: component8, reason: from getter */
    public final PickupStates getPickupStates() {
        return this.pickupStates;
    }

    /* renamed from: component9, reason: from getter */
    public final PlacesConfig getPlacesConfig() {
        return this.placesConfig;
    }

    public final SdkConfig copy(AppUpgrade appUpgrade, String nearbySitesFeatureUrl, NotifyConfig notifyConfig, Integer notifyMaxSites, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETAConfig etaConfig, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, PlacesConfig placesConfig) {
        Intrinsics.j(wrongSiteArrivalConfig, "wrongSiteArrivalConfig");
        Intrinsics.j(pickupLocationFilters, "pickupLocationFilters");
        Intrinsics.j(pickupStates, "pickupStates");
        return new SdkConfig(appUpgrade, nearbySitesFeatureUrl, notifyConfig, notifyMaxSites, wrongSiteArrivalConfig, etaConfig, pickupLocationFilters, pickupStates, placesConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfig)) {
            return false;
        }
        SdkConfig sdkConfig = (SdkConfig) other;
        return Intrinsics.e(this.appUpgrade, sdkConfig.appUpgrade) && Intrinsics.e(this.nearbySitesFeatureUrl, sdkConfig.nearbySitesFeatureUrl) && Intrinsics.e(this.notifyConfig, sdkConfig.notifyConfig) && Intrinsics.e(this.notifyMaxSites, sdkConfig.notifyMaxSites) && Intrinsics.e(this.wrongSiteArrivalConfig, sdkConfig.wrongSiteArrivalConfig) && Intrinsics.e(this.etaConfig, sdkConfig.etaConfig) && Intrinsics.e(this.pickupLocationFilters, sdkConfig.pickupLocationFilters) && Intrinsics.e(this.pickupStates, sdkConfig.pickupStates) && Intrinsics.e(this.placesConfig, sdkConfig.placesConfig);
    }

    public int hashCode() {
        AppUpgrade appUpgrade = this.appUpgrade;
        int iHashCode = (appUpgrade == null ? 0 : appUpgrade.hashCode()) * 31;
        String str = this.nearbySitesFeatureUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NotifyConfig notifyConfig = this.notifyConfig;
        int iHashCode3 = (iHashCode2 + (notifyConfig == null ? 0 : notifyConfig.hashCode())) * 31;
        Integer num = this.notifyMaxSites;
        int iHashCode4 = (this.wrongSiteArrivalConfig.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        ETAConfig eTAConfig = this.etaConfig;
        int iHashCode5 = (this.pickupStates.hashCode() + ((this.pickupLocationFilters.hashCode() + ((iHashCode4 + (eTAConfig == null ? 0 : eTAConfig.hashCode())) * 31)) * 31)) * 31;
        PlacesConfig placesConfig = this.placesConfig;
        return iHashCode5 + (placesConfig != null ? placesConfig.hashCode() : 0);
    }

    public String toString() {
        return "SdkConfig(appUpgrade=" + this.appUpgrade + ", nearbySitesFeatureUrl=" + this.nearbySitesFeatureUrl + ", notifyConfig=" + this.notifyConfig + ", notifyMaxSites=" + this.notifyMaxSites + ", wrongSiteArrivalConfig=" + this.wrongSiteArrivalConfig + ", etaConfig=" + this.etaConfig + ", pickupLocationFilters=" + this.pickupLocationFilters + ", pickupStates=" + this.pickupStates + ", placesConfig=" + this.placesConfig + ')';
    }

    public final AppUpgrade getAppUpgrade() {
        return this.appUpgrade;
    }

    public final ETAConfig getEtaConfig() {
        return this.etaConfig;
    }

    public final String getNearbySitesFeatureUrl() {
        return this.nearbySitesFeatureUrl;
    }

    public final NotifyConfig getNotifyConfig() {
        return this.notifyConfig;
    }

    public final Integer getNotifyMaxSites() {
        return this.notifyMaxSites;
    }

    public final PickupLocationFilters getPickupLocationFilters() {
        return this.pickupLocationFilters;
    }

    public final PickupStates getPickupStates() {
        return this.pickupStates;
    }

    public final PlacesConfig getPlacesConfig() {
        return this.placesConfig;
    }

    public final WrongSiteArrivalConfig getWrongSiteArrivalConfig() {
        return this.wrongSiteArrivalConfig;
    }

    public /* synthetic */ SdkConfig(AppUpgrade appUpgrade, String str, NotifyConfig notifyConfig, Integer num, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETAConfig eTAConfig, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, PlacesConfig placesConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appUpgrade, str, notifyConfig, num, (i10 & 16) != 0 ? WrongSiteArrivalConfig.INSTANCE.getDEFAULT_CONFIG() : wrongSiteArrivalConfig, eTAConfig, pickupLocationFilters, pickupStates, placesConfig);
    }
}

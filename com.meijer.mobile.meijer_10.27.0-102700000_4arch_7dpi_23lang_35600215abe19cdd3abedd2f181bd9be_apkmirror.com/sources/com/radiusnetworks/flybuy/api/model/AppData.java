package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jz\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AppData;", "", "upgrade", "Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "nearbySitesFeatureUrl", "", "pickupLocationFilters", "Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "pickupStates", "Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "notifyMaxSites", "", "notifyConfig", "Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "wrongSiteArrivalConfig", "Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "etaSettings", "Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "placesConfig", "Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;", "(Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/api/model/ETASettings;Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;)V", "getEtaSettings", "()Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "getNearbySitesFeatureUrl", "()Ljava/lang/String;", "getNotifyConfig", "()Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "getNotifyMaxSites", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPickupLocationFilters", "()Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "getPickupStates", "()Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "getPlacesConfig", "()Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;", "getUpgrade", "()Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "getWrongSiteArrivalConfig", "()Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/api/model/ETASettings;Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;)Lcom/radiusnetworks/flybuy/api/model/AppData;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AppData {

    @InterfaceC15617c("eta_settings")
    private final ETASettings etaSettings;

    @InterfaceC15617c("nearby_sites_feature_url")
    private final String nearbySitesFeatureUrl;

    @InterfaceC15617c("notify")
    private final NotifyConfig notifyConfig;

    @InterfaceC15617c("notify_max_sites")
    private final Integer notifyMaxSites;

    @InterfaceC15617c("pickup_location_filters")
    private final PickupLocationFilters pickupLocationFilters;

    @InterfaceC15617c("pickup_states")
    private final PickupStates pickupStates;

    @InterfaceC15617c("places")
    private final PlacesConfig placesConfig;

    @InterfaceC15617c("upgrade")
    private final AppUpgrade upgrade;

    @InterfaceC15617c("wrong_site_arrival")
    private final WrongSiteArrivalConfig wrongSiteArrivalConfig;

    public AppData() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ AppData copy$default(AppData appData, AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appUpgrade = appData.upgrade;
        }
        if ((i10 & 2) != 0) {
            str = appData.nearbySitesFeatureUrl;
        }
        if ((i10 & 4) != 0) {
            pickupLocationFilters = appData.pickupLocationFilters;
        }
        if ((i10 & 8) != 0) {
            pickupStates = appData.pickupStates;
        }
        if ((i10 & 16) != 0) {
            num = appData.notifyMaxSites;
        }
        if ((i10 & 32) != 0) {
            notifyConfig = appData.notifyConfig;
        }
        if ((i10 & 64) != 0) {
            wrongSiteArrivalConfig = appData.wrongSiteArrivalConfig;
        }
        if ((i10 & 128) != 0) {
            eTASettings = appData.etaSettings;
        }
        if ((i10 & 256) != 0) {
            placesConfig = appData.placesConfig;
        }
        ETASettings eTASettings2 = eTASettings;
        PlacesConfig placesConfig2 = placesConfig;
        NotifyConfig notifyConfig2 = notifyConfig;
        WrongSiteArrivalConfig wrongSiteArrivalConfig2 = wrongSiteArrivalConfig;
        Integer num2 = num;
        PickupLocationFilters pickupLocationFilters2 = pickupLocationFilters;
        return appData.copy(appUpgrade, str, pickupLocationFilters2, pickupStates, num2, notifyConfig2, wrongSiteArrivalConfig2, eTASettings2, placesConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final AppUpgrade getUpgrade() {
        return this.upgrade;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNearbySitesFeatureUrl() {
        return this.nearbySitesFeatureUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final PickupLocationFilters getPickupLocationFilters() {
        return this.pickupLocationFilters;
    }

    /* renamed from: component4, reason: from getter */
    public final PickupStates getPickupStates() {
        return this.pickupStates;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getNotifyMaxSites() {
        return this.notifyMaxSites;
    }

    /* renamed from: component6, reason: from getter */
    public final NotifyConfig getNotifyConfig() {
        return this.notifyConfig;
    }

    /* renamed from: component7, reason: from getter */
    public final WrongSiteArrivalConfig getWrongSiteArrivalConfig() {
        return this.wrongSiteArrivalConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final ETASettings getEtaSettings() {
        return this.etaSettings;
    }

    /* renamed from: component9, reason: from getter */
    public final PlacesConfig getPlacesConfig() {
        return this.placesConfig;
    }

    public final AppData copy(AppUpgrade upgrade, String nearbySitesFeatureUrl, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer notifyMaxSites, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings etaSettings, PlacesConfig placesConfig) {
        return new AppData(upgrade, nearbySitesFeatureUrl, pickupLocationFilters, pickupStates, notifyMaxSites, notifyConfig, wrongSiteArrivalConfig, etaSettings, placesConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppData)) {
            return false;
        }
        AppData appData = (AppData) other;
        return Intrinsics.e(this.upgrade, appData.upgrade) && Intrinsics.e(this.nearbySitesFeatureUrl, appData.nearbySitesFeatureUrl) && Intrinsics.e(this.pickupLocationFilters, appData.pickupLocationFilters) && Intrinsics.e(this.pickupStates, appData.pickupStates) && Intrinsics.e(this.notifyMaxSites, appData.notifyMaxSites) && Intrinsics.e(this.notifyConfig, appData.notifyConfig) && Intrinsics.e(this.wrongSiteArrivalConfig, appData.wrongSiteArrivalConfig) && Intrinsics.e(this.etaSettings, appData.etaSettings) && Intrinsics.e(this.placesConfig, appData.placesConfig);
    }

    public final ETASettings getEtaSettings() {
        return this.etaSettings;
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

    public final AppUpgrade getUpgrade() {
        return this.upgrade;
    }

    public final WrongSiteArrivalConfig getWrongSiteArrivalConfig() {
        return this.wrongSiteArrivalConfig;
    }

    public int hashCode() {
        AppUpgrade appUpgrade = this.upgrade;
        int iHashCode = (appUpgrade == null ? 0 : appUpgrade.hashCode()) * 31;
        String str = this.nearbySitesFeatureUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PickupLocationFilters pickupLocationFilters = this.pickupLocationFilters;
        int iHashCode3 = (iHashCode2 + (pickupLocationFilters == null ? 0 : pickupLocationFilters.hashCode())) * 31;
        PickupStates pickupStates = this.pickupStates;
        int iHashCode4 = (iHashCode3 + (pickupStates == null ? 0 : pickupStates.hashCode())) * 31;
        Integer num = this.notifyMaxSites;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        NotifyConfig notifyConfig = this.notifyConfig;
        int iHashCode6 = (iHashCode5 + (notifyConfig == null ? 0 : notifyConfig.hashCode())) * 31;
        WrongSiteArrivalConfig wrongSiteArrivalConfig = this.wrongSiteArrivalConfig;
        int iHashCode7 = (iHashCode6 + (wrongSiteArrivalConfig == null ? 0 : wrongSiteArrivalConfig.hashCode())) * 31;
        ETASettings eTASettings = this.etaSettings;
        int iHashCode8 = (iHashCode7 + (eTASettings == null ? 0 : eTASettings.hashCode())) * 31;
        PlacesConfig placesConfig = this.placesConfig;
        return iHashCode8 + (placesConfig != null ? placesConfig.hashCode() : 0);
    }

    public String toString() {
        return "AppData(upgrade=" + this.upgrade + ", nearbySitesFeatureUrl=" + this.nearbySitesFeatureUrl + ", pickupLocationFilters=" + this.pickupLocationFilters + ", pickupStates=" + this.pickupStates + ", notifyMaxSites=" + this.notifyMaxSites + ", notifyConfig=" + this.notifyConfig + ", wrongSiteArrivalConfig=" + this.wrongSiteArrivalConfig + ", etaSettings=" + this.etaSettings + ", placesConfig=" + this.placesConfig + ')';
    }

    public AppData(AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig) {
        this.upgrade = appUpgrade;
        this.nearbySitesFeatureUrl = str;
        this.pickupLocationFilters = pickupLocationFilters;
        this.pickupStates = pickupStates;
        this.notifyMaxSites = num;
        this.notifyConfig = notifyConfig;
        this.wrongSiteArrivalConfig = wrongSiteArrivalConfig;
        this.etaSettings = eTASettings;
        this.placesConfig = placesConfig;
    }

    public /* synthetic */ AppData(AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : appUpgrade, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : pickupLocationFilters, (i10 & 8) != 0 ? null : pickupStates, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : notifyConfig, (i10 & 64) != 0 ? null : wrongSiteArrivalConfig, (i10 & 128) != 0 ? null : eTASettings, (i10 & 256) != 0 ? null : placesConfig);
    }
}

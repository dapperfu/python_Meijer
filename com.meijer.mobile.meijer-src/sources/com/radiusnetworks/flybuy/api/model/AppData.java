package com.radiusnetworks.flybuy.api.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018¢\u0006\u0002\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J¤\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u000bHÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006B"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AppData;", "", "upgrade", "Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "nearbySitesFeatureUrl", "", "pickupLocationFilters", "Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "pickupStates", "Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "notifyMaxSites", "", "notifyConfig", "Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "wrongSiteArrivalConfig", "Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "etaSettings", "Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "placesConfig", "Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;", "pushServiceType", "pushTopics", "Ljava/util/ArrayList;", "Lcom/radiusnetworks/flybuy/api/model/PushTopic;", "Lkotlin/collections/ArrayList;", "(Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/api/model/ETASettings;Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;Ljava/lang/String;Ljava/util/ArrayList;)V", "getEtaSettings", "()Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "getNearbySitesFeatureUrl", "()Ljava/lang/String;", "getNotifyConfig", "()Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "getNotifyMaxSites", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPickupLocationFilters", "()Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "getPickupStates", "()Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "getPlacesConfig", "()Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;", "getPushServiceType", "getPushTopics", "()Ljava/util/ArrayList;", "getUpgrade", "()Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;", "getWrongSiteArrivalConfig", "()Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/radiusnetworks/flybuy/api/model/AppUpgrade;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;Lcom/radiusnetworks/flybuy/api/model/PickupStates;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;Lcom/radiusnetworks/flybuy/api/model/ETASettings;Lcom/radiusnetworks/flybuy/api/model/PlacesConfig;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/radiusnetworks/flybuy/api/model/AppData;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AppData {

    @InterfaceC16127c("eta_settings")
    private final ETASettings etaSettings;

    @InterfaceC16127c("nearby_sites_feature_url")
    private final String nearbySitesFeatureUrl;

    @InterfaceC16127c("notify")
    private final NotifyConfig notifyConfig;

    @InterfaceC16127c("notify_max_sites")
    private final Integer notifyMaxSites;

    @InterfaceC16127c("pickup_location_filters")
    private final PickupLocationFilters pickupLocationFilters;

    @InterfaceC16127c("pickup_states")
    private final PickupStates pickupStates;

    @InterfaceC16127c("places")
    private final PlacesConfig placesConfig;

    @InterfaceC16127c("push_service_type")
    private final String pushServiceType;

    @InterfaceC16127c("push_topics")
    private final ArrayList<PushTopic> pushTopics;

    @InterfaceC16127c("upgrade")
    private final AppUpgrade upgrade;

    @InterfaceC16127c("wrong_site_arrival")
    private final WrongSiteArrivalConfig wrongSiteArrivalConfig;

    public AppData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ AppData copy$default(AppData appData, AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig, String str2, ArrayList arrayList, int i10, Object obj) {
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
        if ((i10 & 512) != 0) {
            str2 = appData.pushServiceType;
        }
        if ((i10 & 1024) != 0) {
            arrayList = appData.pushTopics;
        }
        String str3 = str2;
        ArrayList arrayList2 = arrayList;
        ETASettings eTASettings2 = eTASettings;
        PlacesConfig placesConfig2 = placesConfig;
        NotifyConfig notifyConfig2 = notifyConfig;
        WrongSiteArrivalConfig wrongSiteArrivalConfig2 = wrongSiteArrivalConfig;
        Integer num2 = num;
        PickupLocationFilters pickupLocationFilters2 = pickupLocationFilters;
        return appData.copy(appUpgrade, str, pickupLocationFilters2, pickupStates, num2, notifyConfig2, wrongSiteArrivalConfig2, eTASettings2, placesConfig2, str3, arrayList2);
    }

    /* renamed from: component1, reason: from getter */
    public final AppUpgrade getUpgrade() {
        return this.upgrade;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPushServiceType() {
        return this.pushServiceType;
    }

    public final ArrayList<PushTopic> component11() {
        return this.pushTopics;
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

    public final AppData copy(AppUpgrade upgrade, String nearbySitesFeatureUrl, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer notifyMaxSites, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings etaSettings, PlacesConfig placesConfig, String pushServiceType, ArrayList<PushTopic> pushTopics) {
        return new AppData(upgrade, nearbySitesFeatureUrl, pickupLocationFilters, pickupStates, notifyMaxSites, notifyConfig, wrongSiteArrivalConfig, etaSettings, placesConfig, pushServiceType, pushTopics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppData)) {
            return false;
        }
        AppData appData = (AppData) other;
        return Intrinsics.e(this.upgrade, appData.upgrade) && Intrinsics.e(this.nearbySitesFeatureUrl, appData.nearbySitesFeatureUrl) && Intrinsics.e(this.pickupLocationFilters, appData.pickupLocationFilters) && Intrinsics.e(this.pickupStates, appData.pickupStates) && Intrinsics.e(this.notifyMaxSites, appData.notifyMaxSites) && Intrinsics.e(this.notifyConfig, appData.notifyConfig) && Intrinsics.e(this.wrongSiteArrivalConfig, appData.wrongSiteArrivalConfig) && Intrinsics.e(this.etaSettings, appData.etaSettings) && Intrinsics.e(this.placesConfig, appData.placesConfig) && Intrinsics.e(this.pushServiceType, appData.pushServiceType) && Intrinsics.e(this.pushTopics, appData.pushTopics);
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
        int iHashCode9 = (iHashCode8 + (placesConfig == null ? 0 : placesConfig.hashCode())) * 31;
        String str2 = this.pushServiceType;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<PushTopic> arrayList = this.pushTopics;
        return iHashCode10 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "AppData(upgrade=" + this.upgrade + ", nearbySitesFeatureUrl=" + this.nearbySitesFeatureUrl + ", pickupLocationFilters=" + this.pickupLocationFilters + ", pickupStates=" + this.pickupStates + ", notifyMaxSites=" + this.notifyMaxSites + ", notifyConfig=" + this.notifyConfig + ", wrongSiteArrivalConfig=" + this.wrongSiteArrivalConfig + ", etaSettings=" + this.etaSettings + ", placesConfig=" + this.placesConfig + ", pushServiceType=" + this.pushServiceType + ", pushTopics=" + this.pushTopics + ')';
    }

    public AppData(AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig, String str2, ArrayList<PushTopic> arrayList) {
        this.upgrade = appUpgrade;
        this.nearbySitesFeatureUrl = str;
        this.pickupLocationFilters = pickupLocationFilters;
        this.pickupStates = pickupStates;
        this.notifyMaxSites = num;
        this.notifyConfig = notifyConfig;
        this.wrongSiteArrivalConfig = wrongSiteArrivalConfig;
        this.etaSettings = eTASettings;
        this.placesConfig = placesConfig;
        this.pushServiceType = str2;
        this.pushTopics = arrayList;
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

    public final String getPushServiceType() {
        return this.pushServiceType;
    }

    public final ArrayList<PushTopic> getPushTopics() {
        return this.pushTopics;
    }

    public final AppUpgrade getUpgrade() {
        return this.upgrade;
    }

    public final WrongSiteArrivalConfig getWrongSiteArrivalConfig() {
        return this.wrongSiteArrivalConfig;
    }

    public /* synthetic */ AppData(AppUpgrade appUpgrade, String str, PickupLocationFilters pickupLocationFilters, PickupStates pickupStates, Integer num, NotifyConfig notifyConfig, WrongSiteArrivalConfig wrongSiteArrivalConfig, ETASettings eTASettings, PlacesConfig placesConfig, String str2, ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : appUpgrade, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : pickupLocationFilters, (i10 & 8) != 0 ? null : pickupStates, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : notifyConfig, (i10 & 64) != 0 ? null : wrongSiteArrivalConfig, (i10 & 128) != 0 ? null : eTASettings, (i10 & 256) != 0 ? null : placesConfig, (i10 & 512) != 0 ? null : str2, (i10 & 1024) != 0 ? null : arrayList);
    }
}

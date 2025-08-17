package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jx\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00065"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyCampaign;", "", PreferencesHelper.PREF_ID, "", "regionType", "Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignRegionType;", "startDay", "", "endDay", "repeatability", "Lcom/radiusnetworks/flybuy/api/model/NotifyRepeatability;", "geofenceRadiusMeters", "content", "Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;", "deferOnPickup", "", "beaconUUID", "beaconMajor", "(ILcom/radiusnetworks/flybuy/api/model/NotifyCampaignRegionType;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/NotifyRepeatability;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;ZLjava/lang/String;Ljava/lang/Integer;)V", "getBeaconMajor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBeaconUUID", "()Ljava/lang/String;", "getContent", "()Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;", "getDeferOnPickup", "()Z", "getEndDay", "getGeofenceRadiusMeters", "getId", "()I", "getRegionType", "()Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignRegionType;", "getRepeatability", "()Lcom/radiusnetworks/flybuy/api/model/NotifyRepeatability;", "getStartDay", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/radiusnetworks/flybuy/api/model/NotifyCampaignRegionType;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/NotifyRepeatability;Ljava/lang/Integer;Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/NotifyCampaign;", "equals", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyCampaign {

    @InterfaceC15617c("beacon_major")
    private final Integer beaconMajor;

    @InterfaceC15617c("beacon_uuid")
    private final String beaconUUID;
    private final NotifyCampaignContent content;

    @InterfaceC15617c("defer_on_pickup")
    private final boolean deferOnPickup;

    @InterfaceC15617c("end_day")
    private final String endDay;

    @InterfaceC15617c("geofence_radius_meters")
    private final Integer geofenceRadiusMeters;
    private final int id;

    @InterfaceC15617c("region_type")
    private final NotifyCampaignRegionType regionType;
    private final NotifyRepeatability repeatability;

    @InterfaceC15617c("start_day")
    private final String startDay;

    public NotifyCampaign(int i10, NotifyCampaignRegionType regionType, String startDay, String endDay, NotifyRepeatability repeatability, Integer num, NotifyCampaignContent content, boolean z10, String str, Integer num2) {
        Intrinsics.j(regionType, "regionType");
        Intrinsics.j(startDay, "startDay");
        Intrinsics.j(endDay, "endDay");
        Intrinsics.j(repeatability, "repeatability");
        Intrinsics.j(content, "content");
        this.id = i10;
        this.regionType = regionType;
        this.startDay = startDay;
        this.endDay = endDay;
        this.repeatability = repeatability;
        this.geofenceRadiusMeters = num;
        this.content = content;
        this.deferOnPickup = z10;
        this.beaconUUID = str;
        this.beaconMajor = num2;
    }

    public static /* synthetic */ NotifyCampaign copy$default(NotifyCampaign notifyCampaign, int i10, NotifyCampaignRegionType notifyCampaignRegionType, String str, String str2, NotifyRepeatability notifyRepeatability, Integer num, NotifyCampaignContent notifyCampaignContent, boolean z10, String str3, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = notifyCampaign.id;
        }
        if ((i11 & 2) != 0) {
            notifyCampaignRegionType = notifyCampaign.regionType;
        }
        if ((i11 & 4) != 0) {
            str = notifyCampaign.startDay;
        }
        if ((i11 & 8) != 0) {
            str2 = notifyCampaign.endDay;
        }
        if ((i11 & 16) != 0) {
            notifyRepeatability = notifyCampaign.repeatability;
        }
        if ((i11 & 32) != 0) {
            num = notifyCampaign.geofenceRadiusMeters;
        }
        if ((i11 & 64) != 0) {
            notifyCampaignContent = notifyCampaign.content;
        }
        if ((i11 & 128) != 0) {
            z10 = notifyCampaign.deferOnPickup;
        }
        if ((i11 & 256) != 0) {
            str3 = notifyCampaign.beaconUUID;
        }
        if ((i11 & 512) != 0) {
            num2 = notifyCampaign.beaconMajor;
        }
        String str4 = str3;
        Integer num3 = num2;
        NotifyCampaignContent notifyCampaignContent2 = notifyCampaignContent;
        boolean z11 = z10;
        NotifyRepeatability notifyRepeatability2 = notifyRepeatability;
        Integer num4 = num;
        return notifyCampaign.copy(i10, notifyCampaignRegionType, str, str2, notifyRepeatability2, num4, notifyCampaignContent2, z11, str4, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getBeaconMajor() {
        return this.beaconMajor;
    }

    /* renamed from: component2, reason: from getter */
    public final NotifyCampaignRegionType getRegionType() {
        return this.regionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartDay() {
        return this.startDay;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndDay() {
        return this.endDay;
    }

    /* renamed from: component5, reason: from getter */
    public final NotifyRepeatability getRepeatability() {
        return this.repeatability;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    /* renamed from: component7, reason: from getter */
    public final NotifyCampaignContent getContent() {
        return this.content;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDeferOnPickup() {
        return this.deferOnPickup;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBeaconUUID() {
        return this.beaconUUID;
    }

    public final NotifyCampaign copy(int id2, NotifyCampaignRegionType regionType, String startDay, String endDay, NotifyRepeatability repeatability, Integer geofenceRadiusMeters, NotifyCampaignContent content, boolean deferOnPickup, String beaconUUID, Integer beaconMajor) {
        Intrinsics.j(regionType, "regionType");
        Intrinsics.j(startDay, "startDay");
        Intrinsics.j(endDay, "endDay");
        Intrinsics.j(repeatability, "repeatability");
        Intrinsics.j(content, "content");
        return new NotifyCampaign(id2, regionType, startDay, endDay, repeatability, geofenceRadiusMeters, content, deferOnPickup, beaconUUID, beaconMajor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyCampaign)) {
            return false;
        }
        NotifyCampaign notifyCampaign = (NotifyCampaign) other;
        return this.id == notifyCampaign.id && this.regionType == notifyCampaign.regionType && Intrinsics.e(this.startDay, notifyCampaign.startDay) && Intrinsics.e(this.endDay, notifyCampaign.endDay) && this.repeatability == notifyCampaign.repeatability && Intrinsics.e(this.geofenceRadiusMeters, notifyCampaign.geofenceRadiusMeters) && Intrinsics.e(this.content, notifyCampaign.content) && this.deferOnPickup == notifyCampaign.deferOnPickup && Intrinsics.e(this.beaconUUID, notifyCampaign.beaconUUID) && Intrinsics.e(this.beaconMajor, notifyCampaign.beaconMajor);
    }

    public final Integer getBeaconMajor() {
        return this.beaconMajor;
    }

    public final String getBeaconUUID() {
        return this.beaconUUID;
    }

    public final NotifyCampaignContent getContent() {
        return this.content;
    }

    public final boolean getDeferOnPickup() {
        return this.deferOnPickup;
    }

    public final String getEndDay() {
        return this.endDay;
    }

    public final Integer getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    public final int getId() {
        return this.id;
    }

    public final NotifyCampaignRegionType getRegionType() {
        return this.regionType;
    }

    public final NotifyRepeatability getRepeatability() {
        return this.repeatability;
    }

    public final String getStartDay() {
        return this.startDay;
    }

    public String toString() {
        return "NotifyCampaign(id=" + this.id + ", regionType=" + this.regionType + ", startDay=" + this.startDay + ", endDay=" + this.endDay + ", repeatability=" + this.repeatability + ", geofenceRadiusMeters=" + this.geofenceRadiusMeters + ", content=" + this.content + ", deferOnPickup=" + this.deferOnPickup + ", beaconUUID=" + this.beaconUUID + ", beaconMajor=" + this.beaconMajor + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.repeatability.hashCode() + a.a(this.endDay, a.a(this.startDay, (this.regionType.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31)) * 31;
        Integer num = this.geofenceRadiusMeters;
        int iHashCode2 = (this.content.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        boolean z10 = this.deferOnPickup;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode2 + i10) * 31;
        String str = this.beaconUUID;
        int iHashCode3 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.beaconMajor;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}

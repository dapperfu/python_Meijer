package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifySite;", "", PreferencesHelper.PREF_ID, "", "distanceMeters", "", "latitude", "longitude", "beaconMinor", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBeaconMinor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDistanceMeters", "()Ljava/lang/String;", "getId", "()I", "getLatitude", "getLongitude", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/NotifySite;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotifySite {

    @InterfaceC16127c("beacon_minor")
    private final Integer beaconMinor;

    @InterfaceC16127c("distance_meters")
    private final String distanceMeters;
    private final int id;
    private final String latitude;
    private final String longitude;

    public static /* synthetic */ NotifySite copy$default(NotifySite notifySite, int i10, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = notifySite.id;
        }
        if ((i11 & 2) != 0) {
            str = notifySite.distanceMeters;
        }
        if ((i11 & 4) != 0) {
            str2 = notifySite.latitude;
        }
        if ((i11 & 8) != 0) {
            str3 = notifySite.longitude;
        }
        if ((i11 & 16) != 0) {
            num = notifySite.beaconMinor;
        }
        Integer num2 = num;
        String str4 = str2;
        return notifySite.copy(i10, str, str4, str3, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDistanceMeters() {
        return this.distanceMeters;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBeaconMinor() {
        return this.beaconMinor;
    }

    public final NotifySite copy(int id2, String distanceMeters, String latitude, String longitude, Integer beaconMinor) {
        Intrinsics.j(distanceMeters, "distanceMeters");
        Intrinsics.j(latitude, "latitude");
        Intrinsics.j(longitude, "longitude");
        return new NotifySite(id2, distanceMeters, latitude, longitude, beaconMinor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifySite)) {
            return false;
        }
        NotifySite notifySite = (NotifySite) other;
        return this.id == notifySite.id && Intrinsics.e(this.distanceMeters, notifySite.distanceMeters) && Intrinsics.e(this.latitude, notifySite.latitude) && Intrinsics.e(this.longitude, notifySite.longitude) && Intrinsics.e(this.beaconMinor, notifySite.beaconMinor);
    }

    public String toString() {
        return "NotifySite(id=" + this.id + ", distanceMeters=" + this.distanceMeters + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", beaconMinor=" + this.beaconMinor + ')';
    }

    public NotifySite(int i10, String distanceMeters, String latitude, String longitude, Integer num) {
        Intrinsics.j(distanceMeters, "distanceMeters");
        Intrinsics.j(latitude, "latitude");
        Intrinsics.j(longitude, "longitude");
        this.id = i10;
        this.distanceMeters = distanceMeters;
        this.latitude = latitude;
        this.longitude = longitude;
        this.beaconMinor = num;
    }

    public final Integer getBeaconMinor() {
        return this.beaconMinor;
    }

    public final String getDistanceMeters() {
        return this.distanceMeters;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int iA = a.a(this.longitude, a.a(this.latitude, a.a(this.distanceMeters, Integer.hashCode(this.id) * 31, 31), 31), 31);
        Integer num = this.beaconMinor;
        return iA + (num == null ? 0 : num.hashCode());
    }
}

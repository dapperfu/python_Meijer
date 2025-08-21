package com.radiusnetworks.flybuy.sdk.data.room.domain;

import android.location.Location;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.api.model.Geofence;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegionKt;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006BÑ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "", "site", "Lcom/radiusnetworks/flybuy/api/model/Site;", "pickupConfig", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "(Lcom/radiusnetworks/flybuy/api/model/Site;Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;)V", PreferencesHelper.PREF_ID, "", "name", "", "phone", "streetAddress", "fullAddress", PlaceTypes.LOCALITY, "region", PlaceTypes.COUNTRY, "postalCode", "latitude", "longitude", "coverPhotoUrl", "iconUrl", "instructions", "description", "partnerIdentifier", "geofence", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "wrongSiteArrivalRadius", "", "operationalStatus", "prearrivalSeconds", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;DLjava/lang/String;ILcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;)V", "getCountry", "()Ljava/lang/String;", "getCoverPhotoUrl", "getDescription", "getFullAddress", "getGeofence", "()Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "getIconUrl", "getId", "()I", "getInstructions", "getLatitude", "getLocality", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "getLongitude", "getName", "getOperationalStatus", "getPartnerIdentifier", "getPhone", "getPickupConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "getPostalCode", "getPrearrivalSeconds", "getRegion", "getStreetAddress", "getWrongSiteArrivalRadius", "()D", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Site {
    public static final String DEFAULT_OPERATIONAL_STATUS = "live";
    private static final double WRONG_SITE_ARRIVAL_RADIUS = 250.0d;
    private final String country;
    private final String coverPhotoUrl;
    private final String description;
    private final String fullAddress;
    private final CircularRegion geofence;
    private final String iconUrl;
    private final int id;
    private final String instructions;
    private final String latitude;
    private final String locality;
    private final String longitude;
    private final String name;
    private final String operationalStatus;
    private final String partnerIdentifier;
    private final String phone;
    private final PickupConfig pickupConfig;
    private final String postalCode;
    private final int prearrivalSeconds;
    private final String region;
    private final String streetAddress;
    private final double wrongSiteArrivalRadius;

    public Site(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, CircularRegion circularRegion, double d10, String operationalStatus, int i11, PickupConfig pickupConfig) {
        Intrinsics.j(operationalStatus, "operationalStatus");
        Intrinsics.j(pickupConfig, "pickupConfig");
        this.id = i10;
        this.name = str;
        this.phone = str2;
        this.streetAddress = str3;
        this.fullAddress = str4;
        this.locality = str5;
        this.region = str6;
        this.country = str7;
        this.postalCode = str8;
        this.latitude = str9;
        this.longitude = str10;
        this.coverPhotoUrl = str11;
        this.iconUrl = str12;
        this.instructions = str13;
        this.description = str14;
        this.partnerIdentifier = str15;
        this.geofence = circularRegion;
        this.wrongSiteArrivalRadius = d10;
        this.operationalStatus = operationalStatus;
        this.prearrivalSeconds = i11;
        this.pickupConfig = pickupConfig;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCoverPhotoUrl() {
        return this.coverPhotoUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final CircularRegion getGeofence() {
        return this.geofence;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final Location getLocation() {
        String str = this.latitude;
        Double dT = str != null ? StringsKt.t(str) : null;
        String str2 = this.longitude;
        Double dT2 = str2 != null ? StringsKt.t(str2) : null;
        if (dT == null || dT2 == null) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(dT.doubleValue());
        location.setLongitude(dT2.doubleValue());
        return location;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOperationalStatus() {
        return this.operationalStatus;
    }

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final PickupConfig getPickupConfig() {
        return this.pickupConfig;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final int getPrearrivalSeconds() {
        return this.prearrivalSeconds;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public final double getWrongSiteArrivalRadius() {
        return this.wrongSiteArrivalRadius;
    }

    public /* synthetic */ Site(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, CircularRegion circularRegion, double d10, String str16, int i11, PickupConfig pickupConfig, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, (i12 & 32768) != 0 ? null : str15, (i12 & 65536) != 0 ? null : circularRegion, d10, str16, i11, pickupConfig);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Site(com.radiusnetworks.flybuy.api.model.Site site, PickupConfig pickupConfig) {
        Intrinsics.j(site, "site");
        int id2 = site.getId();
        String name = site.getName();
        String type = site.getType();
        String streetAddress = site.getStreetAddress();
        String fullAddress = site.getFullAddress();
        String locality = site.getLocality();
        String region = site.getRegion();
        String country = site.getCountry();
        String postalCode = site.getPostalCode();
        String latitude = site.getLatitude();
        String longitude = site.getLongitude();
        String coverPhotoURL = site.getCoverPhotoURL();
        String projectLogoURL = site.getProjectLogoURL();
        String instructions = site.getInstructions();
        String description = site.getDescription();
        String partnerIdentifier = site.getPartnerIdentifier();
        Geofence geofence = site.getGeofence();
        CircularRegion circularRegion = geofence != null ? CircularRegionKt.toCircularRegion(geofence) : null;
        Double wrongSiteArrivalRadius = site.getWrongSiteArrivalRadius();
        double dDoubleValue = wrongSiteArrivalRadius != null ? wrongSiteArrivalRadius.doubleValue() : 250.0d;
        String operationalStatus = site.getOperationalStatus();
        String str = operationalStatus == null ? "live" : operationalStatus;
        Integer prearrivalSeconds = site.getPrearrivalSeconds();
        this(id2, name, type, streetAddress, fullAddress, locality, region, country, postalCode, latitude, longitude, coverPhotoURL, projectLogoURL, instructions, description, partnerIdentifier, circularRegion, dDoubleValue, str, prearrivalSeconds != null ? prearrivalSeconds.intValue() : 0, pickupConfig == null ? PickupConfig.INSTANCE.getDEFAULT_PICKUP_CONFIG() : pickupConfig);
    }
}

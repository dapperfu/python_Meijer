package com.radiusnetworks.flybuy.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¸\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0005HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b6\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>¨\u0006`"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Site;", "", "type", "", PreferencesHelper.PREF_ID, "", "partnerIdentifier", "name", "fullAddress", "streetAddress", PlaceTypes.LOCALITY, "region", PlaceTypes.COUNTRY, "postalCode", "longitude", "latitude", "instructions", "description", "coverPhotoURL", "phone", "displayName", "projectAccentColor", "projectAccentTextColor", "projectLogoURL", "geofence", "Lcom/radiusnetworks/flybuy/api/model/Geofence;", "wrongSiteArrivalRadius", "", "operationalStatus", "prearrivalSeconds", "pickupConfigId", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/Geofence;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCountry", "()Ljava/lang/String;", "getCoverPhotoURL", "getDescription", "getDisplayName", "getFullAddress", "getGeofence", "()Lcom/radiusnetworks/flybuy/api/model/Geofence;", "getId", "()I", "getInstructions", "getLatitude", "getLocality", "getLongitude", "getName", "getOperationalStatus", "getPartnerIdentifier", "getPhone", "getPickupConfigId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPostalCode", "getPrearrivalSeconds", "getProjectAccentColor", "getProjectAccentTextColor", "getProjectLogoURL", "getRegion", "getStreetAddress", "getType", "getWrongSiteArrivalRadius", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/Geofence;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/Site;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Site {

    @InterfaceC16127c(PlaceTypes.COUNTRY)
    private final String country;

    @InterfaceC16127c("cover_photo_url")
    private final String coverPhotoURL;

    @InterfaceC16127c("description")
    private final String description;

    @InterfaceC16127c("display_name")
    private final String displayName;

    @InterfaceC16127c("full_address")
    private final String fullAddress;

    @InterfaceC16127c("geofence")
    private final Geofence geofence;
    private final int id;

    @InterfaceC16127c("instructions")
    private final String instructions;

    @InterfaceC16127c("latitude")
    private final String latitude;

    @InterfaceC16127c(PlaceTypes.LOCALITY)
    private final String locality;

    @InterfaceC16127c("longitude")
    private final String longitude;

    @InterfaceC16127c("name")
    private final String name;

    @InterfaceC16127c("operational_status")
    private final String operationalStatus;

    @InterfaceC16127c("partner_identifier")
    private final String partnerIdentifier;

    @InterfaceC16127c("phone")
    private final String phone;

    @InterfaceC16127c("pickup_config_id")
    private final Integer pickupConfigId;

    @InterfaceC16127c(PlaceTypes.POSTAL_CODE)
    private final String postalCode;

    @InterfaceC16127c("prearrival_seconds")
    private final Integer prearrivalSeconds;

    @InterfaceC16127c("project_accent_color")
    private final String projectAccentColor;

    @InterfaceC16127c("project_accent_text_color")
    private final String projectAccentTextColor;

    @InterfaceC16127c("project_logo_url")
    private final String projectLogoURL;

    @InterfaceC16127c("region")
    private final String region;

    @InterfaceC16127c(PlaceTypes.STREET_ADDRESS)
    private final String streetAddress;
    private final String type;

    @InterfaceC16127c("wrong_site_arrival_radius")
    private final Double wrongSiteArrivalRadius;

    public static /* synthetic */ Site copy$default(Site site, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Geofence geofence, Double d10, String str20, Integer num, Integer num2, int i11, Object obj) {
        Integer num3;
        Integer num4;
        String str21 = (i11 & 1) != 0 ? site.type : str;
        int i12 = (i11 & 2) != 0 ? site.id : i10;
        String str22 = (i11 & 4) != 0 ? site.partnerIdentifier : str2;
        String str23 = (i11 & 8) != 0 ? site.name : str3;
        String str24 = (i11 & 16) != 0 ? site.fullAddress : str4;
        String str25 = (i11 & 32) != 0 ? site.streetAddress : str5;
        String str26 = (i11 & 64) != 0 ? site.locality : str6;
        String str27 = (i11 & 128) != 0 ? site.region : str7;
        String str28 = (i11 & 256) != 0 ? site.country : str8;
        String str29 = (i11 & 512) != 0 ? site.postalCode : str9;
        String str30 = (i11 & 1024) != 0 ? site.longitude : str10;
        String str31 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? site.latitude : str11;
        String str32 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? site.instructions : str12;
        String str33 = (i11 & 8192) != 0 ? site.description : str13;
        String str34 = str21;
        String str35 = (i11 & 16384) != 0 ? site.coverPhotoURL : str14;
        String str36 = (i11 & 32768) != 0 ? site.phone : str15;
        String str37 = (i11 & 65536) != 0 ? site.displayName : str16;
        String str38 = (i11 & 131072) != 0 ? site.projectAccentColor : str17;
        String str39 = (i11 & 262144) != 0 ? site.projectAccentTextColor : str18;
        String str40 = (i11 & 524288) != 0 ? site.projectLogoURL : str19;
        Geofence geofence2 = (i11 & 1048576) != 0 ? site.geofence : geofence;
        Double d11 = (i11 & 2097152) != 0 ? site.wrongSiteArrivalRadius : d10;
        String str41 = (i11 & 4194304) != 0 ? site.operationalStatus : str20;
        Integer num5 = (i11 & 8388608) != 0 ? site.prearrivalSeconds : num;
        if ((i11 & 16777216) != 0) {
            num4 = num5;
            num3 = site.pickupConfigId;
        } else {
            num3 = num2;
            num4 = num5;
        }
        return site.copy(str34, i12, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str35, str36, str37, str38, str39, str40, geofence2, d11, str41, num4, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component13, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCoverPhotoURL() {
        return this.coverPhotoURL;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component17, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component18, reason: from getter */
    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    /* renamed from: component19, reason: from getter */
    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component20, reason: from getter */
    public final String getProjectLogoURL() {
        return this.projectLogoURL;
    }

    /* renamed from: component21, reason: from getter */
    public final Geofence getGeofence() {
        return this.geofence;
    }

    /* renamed from: component22, reason: from getter */
    public final Double getWrongSiteArrivalRadius() {
        return this.wrongSiteArrivalRadius;
    }

    /* renamed from: component23, reason: from getter */
    public final String getOperationalStatus() {
        return this.operationalStatus;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getPrearrivalSeconds() {
        return this.prearrivalSeconds;
    }

    /* renamed from: component25, reason: from getter */
    public final Integer getPickupConfigId() {
        return this.pickupConfigId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final Site copy(String type, int id2, String partnerIdentifier, String name, String fullAddress, String streetAddress, String locality, String region, String country, String postalCode, String longitude, String latitude, String instructions, String description, String coverPhotoURL, String phone, String displayName, String projectAccentColor, String projectAccentTextColor, String projectLogoURL, Geofence geofence, Double wrongSiteArrivalRadius, String operationalStatus, Integer prearrivalSeconds, Integer pickupConfigId) {
        return new Site(type, id2, partnerIdentifier, name, fullAddress, streetAddress, locality, region, country, postalCode, longitude, latitude, instructions, description, coverPhotoURL, phone, displayName, projectAccentColor, projectAccentTextColor, projectLogoURL, geofence, wrongSiteArrivalRadius, operationalStatus, prearrivalSeconds, pickupConfigId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Site)) {
            return false;
        }
        Site site = (Site) other;
        return Intrinsics.e(this.type, site.type) && this.id == site.id && Intrinsics.e(this.partnerIdentifier, site.partnerIdentifier) && Intrinsics.e(this.name, site.name) && Intrinsics.e(this.fullAddress, site.fullAddress) && Intrinsics.e(this.streetAddress, site.streetAddress) && Intrinsics.e(this.locality, site.locality) && Intrinsics.e(this.region, site.region) && Intrinsics.e(this.country, site.country) && Intrinsics.e(this.postalCode, site.postalCode) && Intrinsics.e(this.longitude, site.longitude) && Intrinsics.e(this.latitude, site.latitude) && Intrinsics.e(this.instructions, site.instructions) && Intrinsics.e(this.description, site.description) && Intrinsics.e(this.coverPhotoURL, site.coverPhotoURL) && Intrinsics.e(this.phone, site.phone) && Intrinsics.e(this.displayName, site.displayName) && Intrinsics.e(this.projectAccentColor, site.projectAccentColor) && Intrinsics.e(this.projectAccentTextColor, site.projectAccentTextColor) && Intrinsics.e(this.projectLogoURL, site.projectLogoURL) && Intrinsics.e(this.geofence, site.geofence) && Intrinsics.e(this.wrongSiteArrivalRadius, site.wrongSiteArrivalRadius) && Intrinsics.e(this.operationalStatus, site.operationalStatus) && Intrinsics.e(this.prearrivalSeconds, site.prearrivalSeconds) && Intrinsics.e(this.pickupConfigId, site.pickupConfigId);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (Integer.hashCode(this.id) + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.partnerIdentifier;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fullAddress;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.streetAddress;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.locality;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.region;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.longitude;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.latitude;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.instructions;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.description;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.coverPhotoURL;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.phone;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.displayName;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.projectAccentColor;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.projectAccentTextColor;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.projectLogoURL;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Geofence geofence = this.geofence;
        int iHashCode20 = (iHashCode19 + (geofence == null ? 0 : geofence.hashCode())) * 31;
        Double d10 = this.wrongSiteArrivalRadius;
        int iHashCode21 = (iHashCode20 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str20 = this.operationalStatus;
        int iHashCode22 = (iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num = this.prearrivalSeconds;
        int iHashCode23 = (iHashCode22 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pickupConfigId;
        return iHashCode23 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Site(type=" + this.type + ", id=" + this.id + ", partnerIdentifier=" + this.partnerIdentifier + ", name=" + this.name + ", fullAddress=" + this.fullAddress + ", streetAddress=" + this.streetAddress + ", locality=" + this.locality + ", region=" + this.region + ", country=" + this.country + ", postalCode=" + this.postalCode + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", instructions=" + this.instructions + ", description=" + this.description + ", coverPhotoURL=" + this.coverPhotoURL + ", phone=" + this.phone + ", displayName=" + this.displayName + ", projectAccentColor=" + this.projectAccentColor + ", projectAccentTextColor=" + this.projectAccentTextColor + ", projectLogoURL=" + this.projectLogoURL + ", geofence=" + this.geofence + ", wrongSiteArrivalRadius=" + this.wrongSiteArrivalRadius + ", operationalStatus=" + this.operationalStatus + ", prearrivalSeconds=" + this.prearrivalSeconds + ", pickupConfigId=" + this.pickupConfigId + ')';
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCoverPhotoURL() {
        return this.coverPhotoURL;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final Geofence getGeofence() {
        return this.geofence;
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

    public final Integer getPickupConfigId() {
        return this.pickupConfigId;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final Integer getPrearrivalSeconds() {
        return this.prearrivalSeconds;
    }

    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    public final String getProjectLogoURL() {
        return this.projectLogoURL;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public final String getType() {
        return this.type;
    }

    public final Double getWrongSiteArrivalRadius() {
        return this.wrongSiteArrivalRadius;
    }

    public Site(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Geofence geofence, Double d10, String str20, Integer num, Integer num2) {
        this.type = str;
        this.id = i10;
        this.partnerIdentifier = str2;
        this.name = str3;
        this.fullAddress = str4;
        this.streetAddress = str5;
        this.locality = str6;
        this.region = str7;
        this.country = str8;
        this.postalCode = str9;
        this.longitude = str10;
        this.latitude = str11;
        this.instructions = str12;
        this.description = str13;
        this.coverPhotoURL = str14;
        this.phone = str15;
        this.displayName = str16;
        this.projectAccentColor = str17;
        this.projectAccentTextColor = str18;
        this.projectLogoURL = str19;
        this.geofence = geofence;
        this.wrongSiteArrivalRadius = d10;
        this.operationalStatus = str20;
        this.prearrivalSeconds = num;
        this.pickupConfigId = num2;
    }
}

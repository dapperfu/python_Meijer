package com.radiusnetworks.flybuy.api.model;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u001cJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jè\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b6\u0010%R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b7\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#¨\u0006S"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/OrderEventRequestData;", "", "orderId", "", "eventType", "Lcom/radiusnetworks/flybuy/api/model/OrderEventType;", "longitude", "", "latitude", "accuracy", "", "speed", "etaSeconds", "customerState", "", "beacons", "", "Lcom/radiusnetworks/flybuy/api/model/Beacon;", "locationPermission", "Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;", "state", "customerRatingValue", "customerRatingComments", "spotIdentifier", "possibleWrongSiteId", "etaSource", "locationAt", "pickupType", "(ILcom/radiusnetworks/flybuy/api/model/OrderEventType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccuracy", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBeacons", "()Ljava/util/List;", "getCustomerRatingComments", "()Ljava/lang/String;", "getCustomerRatingValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustomerState", "getEtaSeconds", "getEtaSource", "getEventType", "()Lcom/radiusnetworks/flybuy/api/model/OrderEventType;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLocationAt", "getLocationPermission", "()Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;", "getLongitude", "getOrderId", "()I", "getPickupType", "getPossibleWrongSiteId", "getSpeed", "getSpotIdentifier", "getState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/radiusnetworks/flybuy/api/model/OrderEventType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/radiusnetworks/flybuy/api/model/LocationPermissionState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/model/OrderEventRequestData;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderEventRequestData {

    @InterfaceC15617c("accuracy")
    private final Float accuracy;

    @InterfaceC15617c("beacons")
    private final List<Beacon> beacons;

    @InterfaceC15617c("customer_rating_comments")
    private final String customerRatingComments;

    @InterfaceC15617c("customer_rating_value")
    private final Integer customerRatingValue;

    @InterfaceC15617c("customer_state")
    private final String customerState;

    @InterfaceC15617c("eta_seconds")
    private final Integer etaSeconds;

    @InterfaceC15617c("eta_source")
    private final String etaSource;

    @InterfaceC15617c("event_type")
    private final OrderEventType eventType;

    @InterfaceC15617c("latitude")
    private final Double latitude;

    @InterfaceC15617c("location_at")
    private final String locationAt;

    @InterfaceC15617c("location_permission")
    private final LocationPermissionState locationPermission;

    @InterfaceC15617c("longitude")
    private final Double longitude;

    @InterfaceC15617c("order_id")
    private final int orderId;

    @InterfaceC15617c("pickup_type")
    private final String pickupType;

    @InterfaceC15617c("possible_wrong_site_id")
    private final Integer possibleWrongSiteId;

    @InterfaceC15617c("speed")
    private final Float speed;

    @InterfaceC15617c("spot_identifier")
    private final String spotIdentifier;

    @InterfaceC15617c("state")
    private final String state;

    @ExperimentalUnsignedTypes
    public OrderEventRequestData(int i10, OrderEventType eventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List<Beacon> list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7) {
        Intrinsics.j(eventType, "eventType");
        this.orderId = i10;
        this.eventType = eventType;
        this.longitude = d10;
        this.latitude = d11;
        this.accuracy = f10;
        this.speed = f11;
        this.etaSeconds = num;
        this.customerState = str;
        this.beacons = list;
        this.locationPermission = locationPermissionState;
        this.state = str2;
        this.customerRatingValue = num2;
        this.customerRatingComments = str3;
        this.spotIdentifier = str4;
        this.possibleWrongSiteId = num3;
        this.etaSource = str5;
        this.locationAt = str6;
        this.pickupType = str7;
    }

    public static /* synthetic */ OrderEventRequestData copy$default(OrderEventRequestData orderEventRequestData, int i10, OrderEventType orderEventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7, int i11, Object obj) {
        String str8;
        String str9;
        int i12 = (i11 & 1) != 0 ? orderEventRequestData.orderId : i10;
        OrderEventType orderEventType2 = (i11 & 2) != 0 ? orderEventRequestData.eventType : orderEventType;
        Double d12 = (i11 & 4) != 0 ? orderEventRequestData.longitude : d10;
        Double d13 = (i11 & 8) != 0 ? orderEventRequestData.latitude : d11;
        Float f12 = (i11 & 16) != 0 ? orderEventRequestData.accuracy : f10;
        Float f13 = (i11 & 32) != 0 ? orderEventRequestData.speed : f11;
        Integer num4 = (i11 & 64) != 0 ? orderEventRequestData.etaSeconds : num;
        String str10 = (i11 & 128) != 0 ? orderEventRequestData.customerState : str;
        List list2 = (i11 & 256) != 0 ? orderEventRequestData.beacons : list;
        LocationPermissionState locationPermissionState2 = (i11 & 512) != 0 ? orderEventRequestData.locationPermission : locationPermissionState;
        String str11 = (i11 & 1024) != 0 ? orderEventRequestData.state : str2;
        Integer num5 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? orderEventRequestData.customerRatingValue : num2;
        String str12 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderEventRequestData.customerRatingComments : str3;
        String str13 = (i11 & 8192) != 0 ? orderEventRequestData.spotIdentifier : str4;
        int i13 = i12;
        Integer num6 = (i11 & 16384) != 0 ? orderEventRequestData.possibleWrongSiteId : num3;
        String str14 = (i11 & 32768) != 0 ? orderEventRequestData.etaSource : str5;
        String str15 = (i11 & 65536) != 0 ? orderEventRequestData.locationAt : str6;
        if ((i11 & 131072) != 0) {
            str9 = str15;
            str8 = orderEventRequestData.pickupType;
        } else {
            str8 = str7;
            str9 = str15;
        }
        return orderEventRequestData.copy(i13, orderEventType2, d12, d13, f12, f13, num4, str10, list2, locationPermissionState2, str11, num5, str12, str13, num6, str14, str9, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrderId() {
        return this.orderId;
    }

    /* renamed from: component10, reason: from getter */
    public final LocationPermissionState getLocationPermission() {
        return this.locationPermission;
    }

    /* renamed from: component11, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getCustomerRatingValue() {
        return this.customerRatingValue;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCustomerRatingComments() {
        return this.customerRatingComments;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getPossibleWrongSiteId() {
        return this.possibleWrongSiteId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getEtaSource() {
        return this.etaSource;
    }

    /* renamed from: component17, reason: from getter */
    public final String getLocationAt() {
        return this.locationAt;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderEventType getEventType() {
        return this.eventType;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getSpeed() {
        return this.speed;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getEtaSeconds() {
        return this.etaSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCustomerState() {
        return this.customerState;
    }

    public final List<Beacon> component9() {
        return this.beacons;
    }

    public final OrderEventRequestData copy(int orderId, OrderEventType eventType, Double longitude, Double latitude, Float accuracy, Float speed, Integer etaSeconds, String customerState, List<Beacon> beacons, LocationPermissionState locationPermission, String state, Integer customerRatingValue, String customerRatingComments, String spotIdentifier, Integer possibleWrongSiteId, String etaSource, String locationAt, String pickupType) {
        Intrinsics.j(eventType, "eventType");
        return new OrderEventRequestData(orderId, eventType, longitude, latitude, accuracy, speed, etaSeconds, customerState, beacons, locationPermission, state, customerRatingValue, customerRatingComments, spotIdentifier, possibleWrongSiteId, etaSource, locationAt, pickupType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEventRequestData)) {
            return false;
        }
        OrderEventRequestData orderEventRequestData = (OrderEventRequestData) other;
        return this.orderId == orderEventRequestData.orderId && this.eventType == orderEventRequestData.eventType && Intrinsics.e(this.longitude, orderEventRequestData.longitude) && Intrinsics.e(this.latitude, orderEventRequestData.latitude) && Intrinsics.e(this.accuracy, orderEventRequestData.accuracy) && Intrinsics.e(this.speed, orderEventRequestData.speed) && Intrinsics.e(this.etaSeconds, orderEventRequestData.etaSeconds) && Intrinsics.e(this.customerState, orderEventRequestData.customerState) && Intrinsics.e(this.beacons, orderEventRequestData.beacons) && this.locationPermission == orderEventRequestData.locationPermission && Intrinsics.e(this.state, orderEventRequestData.state) && Intrinsics.e(this.customerRatingValue, orderEventRequestData.customerRatingValue) && Intrinsics.e(this.customerRatingComments, orderEventRequestData.customerRatingComments) && Intrinsics.e(this.spotIdentifier, orderEventRequestData.spotIdentifier) && Intrinsics.e(this.possibleWrongSiteId, orderEventRequestData.possibleWrongSiteId) && Intrinsics.e(this.etaSource, orderEventRequestData.etaSource) && Intrinsics.e(this.locationAt, orderEventRequestData.locationAt) && Intrinsics.e(this.pickupType, orderEventRequestData.pickupType);
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final List<Beacon> getBeacons() {
        return this.beacons;
    }

    public final String getCustomerRatingComments() {
        return this.customerRatingComments;
    }

    public final Integer getCustomerRatingValue() {
        return this.customerRatingValue;
    }

    public final String getCustomerState() {
        return this.customerState;
    }

    public final Integer getEtaSeconds() {
        return this.etaSeconds;
    }

    public final String getEtaSource() {
        return this.etaSource;
    }

    public final OrderEventType getEventType() {
        return this.eventType;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final String getLocationAt() {
        return this.locationAt;
    }

    public final LocationPermissionState getLocationPermission() {
        return this.locationPermission;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final Integer getPossibleWrongSiteId() {
        return this.possibleWrongSiteId;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (this.eventType.hashCode() + (Integer.hashCode(this.orderId) * 31)) * 31;
        Double d10 = this.longitude;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.latitude;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Float f10 = this.accuracy;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.speed;
        int iHashCode5 = (iHashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num = this.etaSeconds;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.customerState;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<Beacon> list = this.beacons;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        LocationPermissionState locationPermissionState = this.locationPermission;
        int iHashCode9 = (iHashCode8 + (locationPermissionState == null ? 0 : locationPermissionState.hashCode())) * 31;
        String str2 = this.state;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.customerRatingValue;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.customerRatingComments;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.spotIdentifier;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.possibleWrongSiteId;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.etaSource;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.locationAt;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pickupType;
        return iHashCode16 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "OrderEventRequestData(orderId=" + this.orderId + ", eventType=" + this.eventType + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", accuracy=" + this.accuracy + ", speed=" + this.speed + ", etaSeconds=" + this.etaSeconds + ", customerState=" + this.customerState + ", beacons=" + this.beacons + ", locationPermission=" + this.locationPermission + ", state=" + this.state + ", customerRatingValue=" + this.customerRatingValue + ", customerRatingComments=" + this.customerRatingComments + ", spotIdentifier=" + this.spotIdentifier + ", possibleWrongSiteId=" + this.possibleWrongSiteId + ", etaSource=" + this.etaSource + ", locationAt=" + this.locationAt + ", pickupType=" + this.pickupType + ')';
    }

    public /* synthetic */ OrderEventRequestData(int i10, OrderEventType orderEventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, orderEventType, (i11 & 4) != 0 ? null : d10, (i11 & 8) != 0 ? null : d11, (i11 & 16) != 0 ? null : f10, (i11 & 32) != 0 ? null : f11, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : locationPermissionState, (i11 & 1024) != 0 ? null : str2, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str3, (i11 & 8192) != 0 ? null : str4, (i11 & 16384) != 0 ? null : num3, (32768 & i11) != 0 ? null : str5, (65536 & i11) != 0 ? null : str6, (i11 & 131072) != 0 ? null : str7);
    }
}

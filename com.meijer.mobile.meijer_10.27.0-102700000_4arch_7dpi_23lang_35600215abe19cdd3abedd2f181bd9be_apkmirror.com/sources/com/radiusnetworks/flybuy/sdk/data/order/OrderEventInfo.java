package com.radiusnetworks.flybuy.sdk.data.order;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.sdk.data.beacons.Beacon;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionState;
import j$.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u0010,J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0012\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b3\u0010,J\u0012\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b4\u0010,J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b6\u0010,J\u0012\u00107\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b9\u0010,Jê\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b<\u0010,J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010 J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bH\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bK\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010,R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bS\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bT\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bU\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bV\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bW\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bX\u0010*R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bY\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b[\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\b\\\u0010,¨\u0006]"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "", "", "orderId", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;", "eventType", "", "longitude", "latitude", "", "accuracy", "speed", "etaSeconds", "", "customerState", "", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/Beacon;", "beacons", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "locationPermission", "state", "customerRatingValue", "customerRatingComments", "spotIdentifier", "possibleWrongSiteId", "etaSource", "j$/time/Instant", "locationAt", "pickupType", "<init>", "(ILcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;)V", "component1", "()I", "component2", "()Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;", "component3", "()Ljava/lang/Double;", "component4", "component5", "()Ljava/lang/Float;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/lang/String;", "component9", "()Ljava/util/List;", "component10", "()Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lj$/time/Instant;", "component18", "copy", "(ILcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOrderId", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;", "getEventType", "Ljava/lang/Double;", "getLongitude", "getLatitude", "Ljava/lang/Float;", "getAccuracy", "getSpeed", "Ljava/lang/Integer;", "getEtaSeconds", "Ljava/lang/String;", "getCustomerState", "Ljava/util/List;", "getBeacons", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "getLocationPermission", "getState", "getCustomerRatingValue", "getCustomerRatingComments", "getSpotIdentifier", "getPossibleWrongSiteId", "getEtaSource", "Lj$/time/Instant;", "getLocationAt", "getPickupType", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderEventInfo {
    private final Float accuracy;
    private final List<Beacon> beacons;
    private final String customerRatingComments;
    private final Integer customerRatingValue;
    private final String customerState;
    private final Integer etaSeconds;
    private final String etaSource;
    private final OrderEventType eventType;
    private final Double latitude;
    private final Instant locationAt;
    private final LocationPermissionState locationPermission;
    private final Double longitude;
    private final int orderId;
    private final String pickupType;
    private final Integer possibleWrongSiteId;
    private final Float speed;
    private final String spotIdentifier;
    private final String state;

    public OrderEventInfo(int i10, OrderEventType eventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List<Beacon> list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, Instant instant, String str6) {
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
        this.locationAt = instant;
        this.pickupType = str6;
    }

    public static /* synthetic */ OrderEventInfo copy$default(OrderEventInfo orderEventInfo, int i10, OrderEventType orderEventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, Instant instant, String str6, int i11, Object obj) {
        String str7;
        Instant instant2;
        int i12 = (i11 & 1) != 0 ? orderEventInfo.orderId : i10;
        OrderEventType orderEventType2 = (i11 & 2) != 0 ? orderEventInfo.eventType : orderEventType;
        Double d12 = (i11 & 4) != 0 ? orderEventInfo.longitude : d10;
        Double d13 = (i11 & 8) != 0 ? orderEventInfo.latitude : d11;
        Float f12 = (i11 & 16) != 0 ? orderEventInfo.accuracy : f10;
        Float f13 = (i11 & 32) != 0 ? orderEventInfo.speed : f11;
        Integer num4 = (i11 & 64) != 0 ? orderEventInfo.etaSeconds : num;
        String str8 = (i11 & 128) != 0 ? orderEventInfo.customerState : str;
        List list2 = (i11 & 256) != 0 ? orderEventInfo.beacons : list;
        LocationPermissionState locationPermissionState2 = (i11 & 512) != 0 ? orderEventInfo.locationPermission : locationPermissionState;
        String str9 = (i11 & 1024) != 0 ? orderEventInfo.state : str2;
        Integer num5 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? orderEventInfo.customerRatingValue : num2;
        String str10 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderEventInfo.customerRatingComments : str3;
        String str11 = (i11 & 8192) != 0 ? orderEventInfo.spotIdentifier : str4;
        int i13 = i12;
        Integer num6 = (i11 & 16384) != 0 ? orderEventInfo.possibleWrongSiteId : num3;
        String str12 = (i11 & 32768) != 0 ? orderEventInfo.etaSource : str5;
        Instant instant3 = (i11 & 65536) != 0 ? orderEventInfo.locationAt : instant;
        if ((i11 & 131072) != 0) {
            instant2 = instant3;
            str7 = orderEventInfo.pickupType;
        } else {
            str7 = str6;
            instant2 = instant3;
        }
        return orderEventInfo.copy(i13, orderEventType2, d12, d13, f12, f13, num4, str8, list2, locationPermissionState2, str9, num5, str10, str11, num6, str12, instant2, str7);
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
    public final Instant getLocationAt() {
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

    public final OrderEventInfo copy(int orderId, OrderEventType eventType, Double longitude, Double latitude, Float accuracy, Float speed, Integer etaSeconds, String customerState, List<Beacon> beacons, LocationPermissionState locationPermission, String state, Integer customerRatingValue, String customerRatingComments, String spotIdentifier, Integer possibleWrongSiteId, String etaSource, Instant locationAt, String pickupType) {
        Intrinsics.j(eventType, "eventType");
        return new OrderEventInfo(orderId, eventType, longitude, latitude, accuracy, speed, etaSeconds, customerState, beacons, locationPermission, state, customerRatingValue, customerRatingComments, spotIdentifier, possibleWrongSiteId, etaSource, locationAt, pickupType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEventInfo)) {
            return false;
        }
        OrderEventInfo orderEventInfo = (OrderEventInfo) other;
        return this.orderId == orderEventInfo.orderId && this.eventType == orderEventInfo.eventType && Intrinsics.e(this.longitude, orderEventInfo.longitude) && Intrinsics.e(this.latitude, orderEventInfo.latitude) && Intrinsics.e(this.accuracy, orderEventInfo.accuracy) && Intrinsics.e(this.speed, orderEventInfo.speed) && Intrinsics.e(this.etaSeconds, orderEventInfo.etaSeconds) && Intrinsics.e(this.customerState, orderEventInfo.customerState) && Intrinsics.e(this.beacons, orderEventInfo.beacons) && this.locationPermission == orderEventInfo.locationPermission && Intrinsics.e(this.state, orderEventInfo.state) && Intrinsics.e(this.customerRatingValue, orderEventInfo.customerRatingValue) && Intrinsics.e(this.customerRatingComments, orderEventInfo.customerRatingComments) && Intrinsics.e(this.spotIdentifier, orderEventInfo.spotIdentifier) && Intrinsics.e(this.possibleWrongSiteId, orderEventInfo.possibleWrongSiteId) && Intrinsics.e(this.etaSource, orderEventInfo.etaSource) && Intrinsics.e(this.locationAt, orderEventInfo.locationAt) && Intrinsics.e(this.pickupType, orderEventInfo.pickupType);
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
        Instant instant = this.locationAt;
        int iHashCode16 = (iHashCode15 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str6 = this.pickupType;
        return iHashCode16 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "OrderEventInfo(orderId=" + this.orderId + ", eventType=" + this.eventType + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", accuracy=" + this.accuracy + ", speed=" + this.speed + ", etaSeconds=" + this.etaSeconds + ", customerState=" + this.customerState + ", beacons=" + this.beacons + ", locationPermission=" + this.locationPermission + ", state=" + this.state + ", customerRatingValue=" + this.customerRatingValue + ", customerRatingComments=" + this.customerRatingComments + ", spotIdentifier=" + this.spotIdentifier + ", possibleWrongSiteId=" + this.possibleWrongSiteId + ", etaSource=" + this.etaSource + ", locationAt=" + this.locationAt + ", pickupType=" + this.pickupType + ')';
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

    public final Instant getLocationAt() {
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

    public /* synthetic */ OrderEventInfo(int i10, OrderEventType orderEventType, Double d10, Double d11, Float f10, Float f11, Integer num, String str, List list, LocationPermissionState locationPermissionState, String str2, Integer num2, String str3, String str4, Integer num3, String str5, Instant instant, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, orderEventType, (i11 & 4) != 0 ? null : d10, (i11 & 8) != 0 ? null : d11, (i11 & 16) != 0 ? null : f10, (i11 & 32) != 0 ? null : f11, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : locationPermissionState, (i11 & 1024) != 0 ? null : str2, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str3, (i11 & 8192) != 0 ? null : str4, (i11 & 16384) != 0 ? null : num3, (32768 & i11) != 0 ? null : str5, (65536 & i11) != 0 ? null : instant, (i11 & 131072) != 0 ? null : str6);
    }
}

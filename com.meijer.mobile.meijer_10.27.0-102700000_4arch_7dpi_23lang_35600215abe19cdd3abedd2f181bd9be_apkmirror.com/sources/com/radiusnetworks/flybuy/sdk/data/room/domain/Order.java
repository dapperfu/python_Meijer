package com.radiusnetworks.flybuy.sdk.data.room.domain;

import com.radiusnetworks.flybuy.sdk.data.common.InputType;
import com.radiusnetworks.flybuy.sdk.data.common.InputTypeKt;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Instant;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bQ\b\u0007\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u0089\u0001B\u008b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010&\u001a\u00020\u001f\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010*\u001a\u00020\u001f\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020\u001f\u0012\u0006\u0010.\u001a\u00020\u001f\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b5\u0010;J\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bF\u0010ER\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bH\u0010ER\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010A\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010KR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010A\u001a\u0004\bL\u0010=\"\u0004\bM\u0010KR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bN\u0010ER\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bO\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bP\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bQ\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bR\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bS\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bT\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bU\u0010=R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bY\u0010=R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010A\u001a\u0004\bc\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010A\u001a\u0004\bd\u0010=R \u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010e\u0012\u0004\bh\u0010i\u001a\u0004\bf\u0010gR \u0010!\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010e\u0012\u0004\bk\u0010i\u001a\u0004\bj\u0010gR \u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010e\u0012\u0004\bm\u0010i\u001a\u0004\bl\u0010gR \u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010e\u0012\u0004\bo\u0010i\u001a\u0004\bn\u0010gR\"\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010A\u0012\u0004\bq\u0010i\u001a\u0004\bp\u0010=R\"\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010A\u0012\u0004\bs\u0010i\u001a\u0004\br\u0010=R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010e\u001a\u0004\bt\u0010g\"\u0004\bu\u0010vR\"\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010A\u0012\u0004\bx\u0010i\u001a\u0004\bw\u0010=R\"\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010A\u0012\u0004\bz\u0010i\u001a\u0004\by\u0010=R\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\b{\u0010=R\u001a\u0010*\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010e\u001a\u0004\b|\u0010gR\u001a\u0010,\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010}\u001a\u0004\b~\u0010\u007fR\u001b\u0010-\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b-\u0010e\u001a\u0005\b\u0080\u0001\u0010gR\u001b\u0010.\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b.\u0010e\u001a\u0005\b\u0081\u0001\u0010gR\u001d\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b0\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b1\u0010`\u001a\u0005\b\u0085\u0001\u0010bR\u001a\u00102\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b2\u0010A\u001a\u0005\b\u0086\u0001\u0010=R\u001a\u00103\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b3\u0010C\u001a\u0005\b\u0087\u0001\u0010ER\u001a\u00104\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b4\u0010C\u001a\u0005\b\u0088\u0001\u0010E¨\u0006\u008a\u0001"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "", "", PreferencesHelper.PREF_ID, "", "type", "j$/time/Instant", "createdAt", "arrivedAt", "updatedAt", "redeemedAt", "customerState", "state", "etaAt", "displayName", "displayDetail", "partnerIdentifier", "partnerIdentifierForCustomer", "partnerIdentifierForCrew", "redemptionCode", "customerId", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "pickupWindow", "pickupType", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "site", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customer", "customerRatingValue", "customerRatingComments", "pushToken", "", "alwaysShowVehicleInfoFields", "customerNameEditingEnabled", "pickupTypeSelectionEnabled", "requireVehicleInfoIfVisible", "curbsideLocalizedString", "pickupLocalizedString", "locationTrackingEnabled", "projectAccentColor", "projectAccentTextColor", "spotIdentifier", "spotIdentifierEntryEnabled", "Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "spotIdentifierInputType", "wrongSiteDetectionEnabled", "distanceFilteringDisabled", "", "wrongSiteSearchRadius", "wrongSiteId", "handoffVehicleLocation", "estimatedReadyAt", "orderFiredAt", "<init>", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/radiusnetworks/flybuy/sdk/data/common/InputType;ZZDLjava/lang/Integer;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;)V", "Lcom/radiusnetworks/flybuy/api/model/Order;", "order", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "pickupConfig", "(Lcom/radiusnetworks/flybuy/api/model/Order;Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;)V", "getIdString", "()Ljava/lang/String;", "I", "getId", "()I", "Ljava/lang/String;", "getType", "Lj$/time/Instant;", "getCreatedAt", "()Lj$/time/Instant;", "getArrivedAt", "getUpdatedAt", "getRedeemedAt", "getCustomerState", "setCustomerState", "(Ljava/lang/String;)V", "getState", "setState", "getEtaAt", "getDisplayName", "getDisplayDetail", "getPartnerIdentifier", "getPartnerIdentifierForCustomer", "getPartnerIdentifierForCrew", "getRedemptionCode", "getCustomerId", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "getPickupWindow", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "getPickupType", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "getSite", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "getCustomer", "()Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "Ljava/lang/Integer;", "getCustomerRatingValue", "()Ljava/lang/Integer;", "getCustomerRatingComments", "getPushToken", "Z", "getAlwaysShowVehicleInfoFields", "()Z", "getAlwaysShowVehicleInfoFields$annotations", "()V", "getCustomerNameEditingEnabled", "getCustomerNameEditingEnabled$annotations", "getPickupTypeSelectionEnabled", "getPickupTypeSelectionEnabled$annotations", "getRequireVehicleInfoIfVisible", "getRequireVehicleInfoIfVisible$annotations", "getCurbsideLocalizedString", "getCurbsideLocalizedString$annotations", "getPickupLocalizedString", "getPickupLocalizedString$annotations", "getLocationTrackingEnabled", "setLocationTrackingEnabled", "(Z)V", "getProjectAccentColor", "getProjectAccentColor$annotations", "getProjectAccentTextColor", "getProjectAccentTextColor$annotations", "getSpotIdentifier", "getSpotIdentifierEntryEnabled", "Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "getSpotIdentifierInputType", "()Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "getWrongSiteDetectionEnabled", "getDistanceFilteringDisabled", "D", "getWrongSiteSearchRadius", "()D", "getWrongSiteId", "getHandoffVehicleLocation", "getEstimatedReadyAt", "getOrderFiredAt", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class Order {
    public static final double WRONG_SITE_SEARCH_RADIUS = 40000.0d;
    private final boolean alwaysShowVehicleInfoFields;
    private final Instant arrivedAt;
    private final Instant createdAt;
    private final String curbsideLocalizedString;
    private final CustomerInfo customer;
    private final String customerId;
    private final boolean customerNameEditingEnabled;
    private final String customerRatingComments;
    private final Integer customerRatingValue;
    private String customerState;
    private final String displayDetail;
    private final String displayName;
    private final boolean distanceFilteringDisabled;
    private final Instant estimatedReadyAt;
    private final Instant etaAt;
    private final String handoffVehicleLocation;
    private final int id;
    private boolean locationTrackingEnabled;
    private final Instant orderFiredAt;
    private final String partnerIdentifier;
    private final String partnerIdentifierForCrew;
    private final String partnerIdentifierForCustomer;
    private final String pickupLocalizedString;
    private final String pickupType;
    private final boolean pickupTypeSelectionEnabled;
    private final PickupWindow pickupWindow;
    private final String projectAccentColor;
    private final String projectAccentTextColor;
    private final String pushToken;
    private final Instant redeemedAt;
    private final String redemptionCode;
    private final boolean requireVehicleInfoIfVisible;
    private final Site site;
    private final String spotIdentifier;
    private final boolean spotIdentifierEntryEnabled;
    private final InputType spotIdentifierInputType;
    private String state;
    private final String type;
    private final Instant updatedAt;
    private final boolean wrongSiteDetectionEnabled;
    private final Integer wrongSiteId;
    private final double wrongSiteSearchRadius;

    public Order(int i10, String str, Instant createdAt, Instant instant, Instant updatedAt, Instant instant2, String customerState, String state, Instant instant3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PickupWindow pickupWindow, String str9, Site site, CustomerInfo customer, Integer num, String str10, String str11, boolean z10, boolean z11, boolean z12, boolean z13, String str12, String str13, boolean z14, String str14, String str15, String str16, boolean z15, InputType spotIdentifierInputType, boolean z16, boolean z17, double d10, Integer num2, String str17, Instant instant4, Instant instant5) {
        Intrinsics.j(createdAt, "createdAt");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(customerState, "customerState");
        Intrinsics.j(state, "state");
        Intrinsics.j(site, "site");
        Intrinsics.j(customer, "customer");
        Intrinsics.j(spotIdentifierInputType, "spotIdentifierInputType");
        this.id = i10;
        this.type = str;
        this.createdAt = createdAt;
        this.arrivedAt = instant;
        this.updatedAt = updatedAt;
        this.redeemedAt = instant2;
        this.customerState = customerState;
        this.state = state;
        this.etaAt = instant3;
        this.displayName = str2;
        this.displayDetail = str3;
        this.partnerIdentifier = str4;
        this.partnerIdentifierForCustomer = str5;
        this.partnerIdentifierForCrew = str6;
        this.redemptionCode = str7;
        this.customerId = str8;
        this.pickupWindow = pickupWindow;
        this.pickupType = str9;
        this.site = site;
        this.customer = customer;
        this.customerRatingValue = num;
        this.customerRatingComments = str10;
        this.pushToken = str11;
        this.alwaysShowVehicleInfoFields = z10;
        this.customerNameEditingEnabled = z11;
        this.pickupTypeSelectionEnabled = z12;
        this.requireVehicleInfoIfVisible = z13;
        this.curbsideLocalizedString = str12;
        this.pickupLocalizedString = str13;
        this.locationTrackingEnabled = z14;
        this.projectAccentColor = str14;
        this.projectAccentTextColor = str15;
        this.spotIdentifier = str16;
        this.spotIdentifierEntryEnabled = z15;
        this.spotIdentifierInputType = spotIdentifierInputType;
        this.wrongSiteDetectionEnabled = z16;
        this.distanceFilteringDisabled = z17;
        this.wrongSiteSearchRadius = d10;
        this.wrongSiteId = num2;
        this.handoffVehicleLocation = str17;
        this.estimatedReadyAt = instant4;
        this.orderFiredAt = instant5;
    }

    @Deprecated
    public static /* synthetic */ void getAlwaysShowVehicleInfoFields$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getCurbsideLocalizedString$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getCustomerNameEditingEnabled$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getPickupLocalizedString$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getPickupTypeSelectionEnabled$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getProjectAccentColor$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getProjectAccentTextColor$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getRequireVehicleInfoIfVisible$annotations() {
    }

    public final boolean getAlwaysShowVehicleInfoFields() {
        return this.alwaysShowVehicleInfoFields;
    }

    public final Instant getArrivedAt() {
        return this.arrivedAt;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurbsideLocalizedString() {
        return this.curbsideLocalizedString;
    }

    public final CustomerInfo getCustomer() {
        return this.customer;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final boolean getCustomerNameEditingEnabled() {
        return this.customerNameEditingEnabled;
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

    public final String getDisplayDetail() {
        return this.displayDetail;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getDistanceFilteringDisabled() {
        return this.distanceFilteringDisabled;
    }

    public final Instant getEstimatedReadyAt() {
        return this.estimatedReadyAt;
    }

    public final Instant getEtaAt() {
        return this.etaAt;
    }

    public final String getHandoffVehicleLocation() {
        return this.handoffVehicleLocation;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIdString() {
        return String.valueOf(this.id);
    }

    public final boolean getLocationTrackingEnabled() {
        return this.locationTrackingEnabled;
    }

    public final Instant getOrderFiredAt() {
        return this.orderFiredAt;
    }

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    public final String getPickupLocalizedString() {
        return this.pickupLocalizedString;
    }

    public final String getPickupType() {
        return this.pickupType;
    }

    public final boolean getPickupTypeSelectionEnabled() {
        return this.pickupTypeSelectionEnabled;
    }

    public final PickupWindow getPickupWindow() {
        return this.pickupWindow;
    }

    public final String getProjectAccentColor() {
        return this.projectAccentColor;
    }

    public final String getProjectAccentTextColor() {
        return this.projectAccentTextColor;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final Instant getRedeemedAt() {
        return this.redeemedAt;
    }

    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    public final boolean getRequireVehicleInfoIfVisible() {
        return this.requireVehicleInfoIfVisible;
    }

    public final Site getSite() {
        return this.site;
    }

    public final String getSpotIdentifier() {
        return this.spotIdentifier;
    }

    public final boolean getSpotIdentifierEntryEnabled() {
        return this.spotIdentifierEntryEnabled;
    }

    public final InputType getSpotIdentifierInputType() {
        return this.spotIdentifierInputType;
    }

    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean getWrongSiteDetectionEnabled() {
        return this.wrongSiteDetectionEnabled;
    }

    public final Integer getWrongSiteId() {
        return this.wrongSiteId;
    }

    public final double getWrongSiteSearchRadius() {
        return this.wrongSiteSearchRadius;
    }

    public final void setCustomerState(String str) {
        Intrinsics.j(str, "<set-?>");
        this.customerState = str;
    }

    public final void setLocationTrackingEnabled(boolean z10) {
        this.locationTrackingEnabled = z10;
    }

    public final void setState(String str) {
        Intrinsics.j(str, "<set-?>");
        this.state = str;
    }

    public /* synthetic */ Order(int i10, String str, Instant instant, Instant instant2, Instant instant3, Instant instant4, String str2, String str3, Instant instant5, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PickupWindow pickupWindow, String str11, Site site, CustomerInfo customerInfo, Integer num, String str12, String str13, boolean z10, boolean z11, boolean z12, boolean z13, String str14, String str15, boolean z14, String str16, String str17, String str18, boolean z15, InputType inputType, boolean z16, boolean z17, double d10, Integer num2, String str19, Instant instant6, Instant instant7, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, instant, instant2, instant3, instant4, str2, str3, instant5, str4, str5, str6, str7, str8, str9, str10, pickupWindow, str11, site, customerInfo, num, str12, str13, z10, z11, z12, z13, str14, str15, z14, str16, str17, str18, z15, inputType, z16, z17, (i12 & 32) != 0 ? 40000.0d : d10, num2, str19, instant6, instant7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Order(com.radiusnetworks.flybuy.api.model.Order order, PickupConfig pickupConfig) {
        Intrinsics.j(order, "order");
        int id2 = order.getId();
        String type = order.getType();
        Instant instant = Instant.parse(order.getCreatedAt());
        Intrinsics.i(instant, "parse(...)");
        Instant instant2 = order.getArrivedAt() != null ? Instant.parse(order.getArrivedAt()) : null;
        String updatedAt = order.getUpdatedAt();
        Instant instant3 = Instant.parse(updatedAt == null ? order.getCreatedAt() : updatedAt);
        Intrinsics.i(instant3, "parse(...)");
        Instant instant4 = order.getRedeemedAt() != null ? Instant.parse(order.getRedeemedAt()) : null;
        String customerState = order.getCustomerState();
        String orderState = order.getOrderState();
        String etaAt = order.getEtaAt();
        Instant instant5 = etaAt != null ? Instant.parse(etaAt) : null;
        String displayName = order.getDisplayName();
        String displayDetail = order.getDisplayDetail();
        String partnerIdentifier = order.getPartnerIdentifier();
        String partnerIdentifierForCustomer = order.getPartnerIdentifierForCustomer();
        String partnerIdentifierForCrew = order.getPartnerIdentifierForCrew();
        String redemptionCode = order.getRedemptionCode();
        String customerId = order.getCustomerId();
        String pickupWindow = order.getPickupWindow();
        PickupWindow pickupWindow2 = pickupWindow != null ? PickupWindowKt.toPickupWindow(pickupWindow) : null;
        String pickupType = order.getPickupType();
        Site site = OrderKt.toSite(order, pickupConfig);
        CustomerInfo customerInfo = OrderKt.getCustomerInfo(order);
        Integer customerRatingValue = order.getCustomerRatingValue();
        String customerRatingComments = order.getCustomerRatingComments();
        String pushToken = order.getPushToken();
        boolean projectMobileFlowAlwaysShowVehicleInfoFields = order.getProjectMobileFlowAlwaysShowVehicleInfoFields();
        boolean projectMobileFlowCustomerNameEditingEnabled = order.getProjectMobileFlowCustomerNameEditingEnabled();
        boolean projectMobileFlowPickupTypeSelectionEnabled = order.getProjectMobileFlowPickupTypeSelectionEnabled();
        boolean projectMobileFlowRequireVehicleInfoIfVisible = order.getProjectMobileFlowRequireVehicleInfoIfVisible();
        String curbsideLocalizedString = order.getCurbsideLocalizedString();
        String pickupLocalizedString = order.getPickupLocalizedString();
        boolean locationTrackingEnabled = order.getLocationTrackingEnabled();
        String projectAccentColor = order.getProjectAccentColor();
        String projectAccentTextColor = order.getProjectAccentTextColor();
        String spotIdentifier = order.getSpotIdentifier();
        boolean spotIdentifierEntryEnabled = order.getSpotIdentifierEntryEnabled();
        InputType inputType = InputTypeKt.toInputType(order.getSpotIdentifierInputType());
        boolean wrongSiteDetectionEnabled = order.getWrongSiteDetectionEnabled();
        boolean distanceFilteringDisabled = order.getDistanceFilteringDisabled();
        Double wrongSiteSearchRadius = order.getWrongSiteSearchRadius();
        this(id2, type, instant, instant2, instant3, instant4, customerState, orderState, instant5, displayName, displayDetail, partnerIdentifier, partnerIdentifierForCustomer, partnerIdentifierForCrew, redemptionCode, customerId, pickupWindow2, pickupType, site, customerInfo, customerRatingValue, customerRatingComments, pushToken, projectMobileFlowAlwaysShowVehicleInfoFields, projectMobileFlowCustomerNameEditingEnabled, projectMobileFlowPickupTypeSelectionEnabled, projectMobileFlowRequireVehicleInfoIfVisible, curbsideLocalizedString, pickupLocalizedString, locationTrackingEnabled, projectAccentColor, projectAccentTextColor, spotIdentifier, spotIdentifierEntryEnabled, inputType, wrongSiteDetectionEnabled, distanceFilteringDisabled, wrongSiteSearchRadius != null ? wrongSiteSearchRadius.doubleValue() : 40000.0d, order.getWrongSiteId(), order.getHandoffVehicleLocation(), order.getEstimatedReadyAt() != null ? Instant.parse(order.getEstimatedReadyAt()) : null, order.getOrderFiredAt() != null ? Instant.parse(order.getOrderFiredAt()) : null);
    }
}

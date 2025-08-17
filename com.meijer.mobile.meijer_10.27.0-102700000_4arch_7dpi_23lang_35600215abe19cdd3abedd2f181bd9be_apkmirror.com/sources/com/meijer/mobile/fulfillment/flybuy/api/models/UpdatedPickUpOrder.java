package com.meijer.mobile.fulfillment.flybuy.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0003\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J¸\u0003\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b7\u0010-R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\bC\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b6\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bK\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00105\u001a\u0004\b?\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bM\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\b9\u0010-R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u00105\u001a\u0004\bO\u0010-R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bG\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bP\u0010-R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u00105\u001a\u0004\bW\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bX\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\bY\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bV\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010H\u001a\u0004\bZ\u0010JR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u00105\u001a\u0004\bA\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u00105\u001a\u0004\b;\u0010-R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u00105\u001a\u0004\b=\u0010-R\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bQ\u0010JR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00105\u001a\u0004\bR\u0010-R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\bE\u0010-R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\b[\u0010-¨\u0006\\"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/UpdatedPickUpOrder;", "", "", "areaName", "createdAt", "customerRatingComments", "deliveryErroredAt", "pickupWindow", "type", "redemptionCode", "partnerIdentifier", "customerRatingValue", "updatedAt", "pickupType", "", PreferencesHelper.PREF_ID, "state", "arrivedAt", "pushToken", "deliveryErrorReviewedAt", "customerLicensePlate", "deliveryIdentifier", "customerCarColor", "", "tagIds", "deliverySource", "customerState", "etaAt", "partnerIdentifierForCrew", "partnerIdentifierForCustomer", "sitePartnerIdentifier", "partnerDisplayIdentifier", "siteId", "customerName", "customerCarType", "customerId", "orderId", "orderState", "customerRatingValueString", "redemptionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/UpdatedPickUpOrder;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "i", "d", "n", "e", "z", "f", "H", "g", "B", "h", "v", "j", "I", "k", "y", "l", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "m", "F", "o", "A", "p", "q", "s", "t", "Ljava/util/List;", "G", "()Ljava/util/List;", "u", "w", "x", "E", "D", "C", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UpdatedPickUpOrder {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerDisplayIdentifier;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer siteId;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerName;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerCarType;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer orderId;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderState;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerRatingValueString;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionUrl;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String areaName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerRatingComments;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryErroredAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupWindow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerIdentifier;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerRatingValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedAt;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer id;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String arrivedAt;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pushToken;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryErrorReviewedAt;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerLicensePlate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryIdentifier;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerCarColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> tagIds;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliverySource;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String etaAt;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerIdentifierForCrew;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerIdentifierForCustomer;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sitePartnerIdentifier;

    public UpdatedPickUpOrder() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public final UpdatedPickUpOrder copy(@g(name = "area_name") String areaName, @g(name = "created_at") String createdAt, @g(name = "customer_rating_comments") String customerRatingComments, @g(name = "delivery_errored_at") String deliveryErroredAt, @g(name = "pickup_window") String pickupWindow, @g(name = "type") String type, @g(name = "redemption_code") String redemptionCode, @g(name = "partner_identifier") String partnerIdentifier, @g(name = "customer_rating_value") String customerRatingValue, @g(name = "updated_at") String updatedAt, @g(name = "pickup_type") String pickupType, @g(name = PreferencesHelper.PREF_ID) Integer id2, @g(name = "state") String state, @g(name = "arrived_at") String arrivedAt, @g(name = "push_token") String pushToken, @g(name = "delivery_error_reviewed_at") String deliveryErrorReviewedAt, @g(name = "customer_license_plate") String customerLicensePlate, @g(name = "delivery_identifier") String deliveryIdentifier, @g(name = "customer_car_color") String customerCarColor, @g(name = "tag_ids") List<Integer> tagIds, @g(name = "delivery_source") String deliverySource, @g(name = "customer_state") String customerState, @g(name = "eta_at") String etaAt, @g(name = "partner_identifier_for_crew") String partnerIdentifierForCrew, @g(name = "partner_identifier_for_customer") String partnerIdentifierForCustomer, @g(name = "site_partner_identifier") String sitePartnerIdentifier, @g(name = "partner_display_identifier") String partnerDisplayIdentifier, @g(name = "site_id") Integer siteId, @g(name = "customer_name") String customerName, @g(name = "customer_car_type") String customerCarType, @g(name = "customer_id") String customerId, @g(name = "order_id") Integer orderId, @g(name = "order_state") String orderState, @g(name = "customer_rating_value_string") String customerRatingValueString, @g(name = "redemption_url") String redemptionUrl) {
        Intrinsics.j(tagIds, "tagIds");
        return new UpdatedPickUpOrder(areaName, createdAt, customerRatingComments, deliveryErroredAt, pickupWindow, type, redemptionCode, partnerIdentifier, customerRatingValue, updatedAt, pickupType, id2, state, arrivedAt, pushToken, deliveryErrorReviewedAt, customerLicensePlate, deliveryIdentifier, customerCarColor, tagIds, deliverySource, customerState, etaAt, partnerIdentifierForCrew, partnerIdentifierForCustomer, sitePartnerIdentifier, partnerDisplayIdentifier, siteId, customerName, customerCarType, customerId, orderId, orderState, customerRatingValueString, redemptionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatedPickUpOrder)) {
            return false;
        }
        UpdatedPickUpOrder updatedPickUpOrder = (UpdatedPickUpOrder) other;
        return Intrinsics.e(this.areaName, updatedPickUpOrder.areaName) && Intrinsics.e(this.createdAt, updatedPickUpOrder.createdAt) && Intrinsics.e(this.customerRatingComments, updatedPickUpOrder.customerRatingComments) && Intrinsics.e(this.deliveryErroredAt, updatedPickUpOrder.deliveryErroredAt) && Intrinsics.e(this.pickupWindow, updatedPickUpOrder.pickupWindow) && Intrinsics.e(this.type, updatedPickUpOrder.type) && Intrinsics.e(this.redemptionCode, updatedPickUpOrder.redemptionCode) && Intrinsics.e(this.partnerIdentifier, updatedPickUpOrder.partnerIdentifier) && Intrinsics.e(this.customerRatingValue, updatedPickUpOrder.customerRatingValue) && Intrinsics.e(this.updatedAt, updatedPickUpOrder.updatedAt) && Intrinsics.e(this.pickupType, updatedPickUpOrder.pickupType) && Intrinsics.e(this.id, updatedPickUpOrder.id) && Intrinsics.e(this.state, updatedPickUpOrder.state) && Intrinsics.e(this.arrivedAt, updatedPickUpOrder.arrivedAt) && Intrinsics.e(this.pushToken, updatedPickUpOrder.pushToken) && Intrinsics.e(this.deliveryErrorReviewedAt, updatedPickUpOrder.deliveryErrorReviewedAt) && Intrinsics.e(this.customerLicensePlate, updatedPickUpOrder.customerLicensePlate) && Intrinsics.e(this.deliveryIdentifier, updatedPickUpOrder.deliveryIdentifier) && Intrinsics.e(this.customerCarColor, updatedPickUpOrder.customerCarColor) && Intrinsics.e(this.tagIds, updatedPickUpOrder.tagIds) && Intrinsics.e(this.deliverySource, updatedPickUpOrder.deliverySource) && Intrinsics.e(this.customerState, updatedPickUpOrder.customerState) && Intrinsics.e(this.etaAt, updatedPickUpOrder.etaAt) && Intrinsics.e(this.partnerIdentifierForCrew, updatedPickUpOrder.partnerIdentifierForCrew) && Intrinsics.e(this.partnerIdentifierForCustomer, updatedPickUpOrder.partnerIdentifierForCustomer) && Intrinsics.e(this.sitePartnerIdentifier, updatedPickUpOrder.sitePartnerIdentifier) && Intrinsics.e(this.partnerDisplayIdentifier, updatedPickUpOrder.partnerDisplayIdentifier) && Intrinsics.e(this.siteId, updatedPickUpOrder.siteId) && Intrinsics.e(this.customerName, updatedPickUpOrder.customerName) && Intrinsics.e(this.customerCarType, updatedPickUpOrder.customerCarType) && Intrinsics.e(this.customerId, updatedPickUpOrder.customerId) && Intrinsics.e(this.orderId, updatedPickUpOrder.orderId) && Intrinsics.e(this.orderState, updatedPickUpOrder.orderState) && Intrinsics.e(this.customerRatingValueString, updatedPickUpOrder.customerRatingValueString) && Intrinsics.e(this.redemptionUrl, updatedPickUpOrder.redemptionUrl);
    }

    public int hashCode() {
        String str = this.areaName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerRatingComments;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryErroredAt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pickupWindow;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.redemptionCode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.partnerIdentifier;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.customerRatingValue;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updatedAt;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.pickupType;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.state;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.arrivedAt;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.pushToken;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.deliveryErrorReviewedAt;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.customerLicensePlate;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.deliveryIdentifier;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.customerCarColor;
        int iHashCode19 = (((iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31) + this.tagIds.hashCode()) * 31;
        String str19 = this.deliverySource;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.customerState;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.etaAt;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.partnerIdentifierForCrew;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.partnerIdentifierForCustomer;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.sitePartnerIdentifier;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.partnerDisplayIdentifier;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Integer num2 = this.siteId;
        int iHashCode27 = (iHashCode26 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str26 = this.customerName;
        int iHashCode28 = (iHashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.customerCarType;
        int iHashCode29 = (iHashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.customerId;
        int iHashCode30 = (iHashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Integer num3 = this.orderId;
        int iHashCode31 = (iHashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str29 = this.orderState;
        int iHashCode32 = (iHashCode31 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.customerRatingValueString;
        int iHashCode33 = (iHashCode32 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.redemptionUrl;
        return iHashCode33 + (str31 != null ? str31.hashCode() : 0);
    }

    public String toString() {
        return "UpdatedPickUpOrder(areaName=" + this.areaName + ", createdAt=" + this.createdAt + ", customerRatingComments=" + this.customerRatingComments + ", deliveryErroredAt=" + this.deliveryErroredAt + ", pickupWindow=" + this.pickupWindow + ", type=" + this.type + ", redemptionCode=" + this.redemptionCode + ", partnerIdentifier=" + this.partnerIdentifier + ", customerRatingValue=" + this.customerRatingValue + ", updatedAt=" + this.updatedAt + ", pickupType=" + this.pickupType + ", id=" + this.id + ", state=" + this.state + ", arrivedAt=" + this.arrivedAt + ", pushToken=" + this.pushToken + ", deliveryErrorReviewedAt=" + this.deliveryErrorReviewedAt + ", customerLicensePlate=" + this.customerLicensePlate + ", deliveryIdentifier=" + this.deliveryIdentifier + ", customerCarColor=" + this.customerCarColor + ", tagIds=" + this.tagIds + ", deliverySource=" + this.deliverySource + ", customerState=" + this.customerState + ", etaAt=" + this.etaAt + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", sitePartnerIdentifier=" + this.sitePartnerIdentifier + ", partnerDisplayIdentifier=" + this.partnerDisplayIdentifier + ", siteId=" + this.siteId + ", customerName=" + this.customerName + ", customerCarType=" + this.customerCarType + ", customerId=" + this.customerId + ", orderId=" + this.orderId + ", orderState=" + this.orderState + ", customerRatingValueString=" + this.customerRatingValueString + ", redemptionUrl=" + this.redemptionUrl + ')';
    }

    public UpdatedPickUpOrder(@g(name = "area_name") String str, @g(name = "created_at") String str2, @g(name = "customer_rating_comments") String str3, @g(name = "delivery_errored_at") String str4, @g(name = "pickup_window") String str5, @g(name = "type") String str6, @g(name = "redemption_code") String str7, @g(name = "partner_identifier") String str8, @g(name = "customer_rating_value") String str9, @g(name = "updated_at") String str10, @g(name = "pickup_type") String str11, @g(name = PreferencesHelper.PREF_ID) Integer num, @g(name = "state") String str12, @g(name = "arrived_at") String str13, @g(name = "push_token") String str14, @g(name = "delivery_error_reviewed_at") String str15, @g(name = "customer_license_plate") String str16, @g(name = "delivery_identifier") String str17, @g(name = "customer_car_color") String str18, @g(name = "tag_ids") List<Integer> tagIds, @g(name = "delivery_source") String str19, @g(name = "customer_state") String str20, @g(name = "eta_at") String str21, @g(name = "partner_identifier_for_crew") String str22, @g(name = "partner_identifier_for_customer") String str23, @g(name = "site_partner_identifier") String str24, @g(name = "partner_display_identifier") String str25, @g(name = "site_id") Integer num2, @g(name = "customer_name") String str26, @g(name = "customer_car_type") String str27, @g(name = "customer_id") String str28, @g(name = "order_id") Integer num3, @g(name = "order_state") String str29, @g(name = "customer_rating_value_string") String str30, @g(name = "redemption_url") String str31) {
        Intrinsics.j(tagIds, "tagIds");
        this.areaName = str;
        this.createdAt = str2;
        this.customerRatingComments = str3;
        this.deliveryErroredAt = str4;
        this.pickupWindow = str5;
        this.type = str6;
        this.redemptionCode = str7;
        this.partnerIdentifier = str8;
        this.customerRatingValue = str9;
        this.updatedAt = str10;
        this.pickupType = str11;
        this.id = num;
        this.state = str12;
        this.arrivedAt = str13;
        this.pushToken = str14;
        this.deliveryErrorReviewedAt = str15;
        this.customerLicensePlate = str16;
        this.deliveryIdentifier = str17;
        this.customerCarColor = str18;
        this.tagIds = tagIds;
        this.deliverySource = str19;
        this.customerState = str20;
        this.etaAt = str21;
        this.partnerIdentifierForCrew = str22;
        this.partnerIdentifierForCustomer = str23;
        this.sitePartnerIdentifier = str24;
        this.partnerDisplayIdentifier = str25;
        this.siteId = num2;
        this.customerName = str26;
        this.customerCarType = str27;
        this.customerId = str28;
        this.orderId = num3;
        this.orderState = str29;
        this.customerRatingValueString = str30;
        this.redemptionUrl = str31;
    }

    /* renamed from: A, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: B, reason: from getter */
    public final String getRedemptionCode() {
        return this.redemptionCode;
    }

    /* renamed from: C, reason: from getter */
    public final String getRedemptionUrl() {
        return this.redemptionUrl;
    }

    /* renamed from: D, reason: from getter */
    public final Integer getSiteId() {
        return this.siteId;
    }

    /* renamed from: E, reason: from getter */
    public final String getSitePartnerIdentifier() {
        return this.sitePartnerIdentifier;
    }

    /* renamed from: F, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final List<Integer> G() {
        return this.tagIds;
    }

    /* renamed from: H, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: I, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: a, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    /* renamed from: b, reason: from getter */
    public final String getArrivedAt() {
        return this.arrivedAt;
    }

    /* renamed from: c, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: d, reason: from getter */
    public final String getCustomerCarColor() {
        return this.customerCarColor;
    }

    /* renamed from: e, reason: from getter */
    public final String getCustomerCarType() {
        return this.customerCarType;
    }

    /* renamed from: f, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: g, reason: from getter */
    public final String getCustomerLicensePlate() {
        return this.customerLicensePlate;
    }

    /* renamed from: h, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: i, reason: from getter */
    public final String getCustomerRatingComments() {
        return this.customerRatingComments;
    }

    /* renamed from: j, reason: from getter */
    public final String getCustomerRatingValue() {
        return this.customerRatingValue;
    }

    /* renamed from: k, reason: from getter */
    public final String getCustomerRatingValueString() {
        return this.customerRatingValueString;
    }

    /* renamed from: l, reason: from getter */
    public final String getCustomerState() {
        return this.customerState;
    }

    /* renamed from: m, reason: from getter */
    public final String getDeliveryErrorReviewedAt() {
        return this.deliveryErrorReviewedAt;
    }

    /* renamed from: n, reason: from getter */
    public final String getDeliveryErroredAt() {
        return this.deliveryErroredAt;
    }

    /* renamed from: o, reason: from getter */
    public final String getDeliveryIdentifier() {
        return this.deliveryIdentifier;
    }

    /* renamed from: p, reason: from getter */
    public final String getDeliverySource() {
        return this.deliverySource;
    }

    /* renamed from: q, reason: from getter */
    public final String getEtaAt() {
        return this.etaAt;
    }

    /* renamed from: r, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: s, reason: from getter */
    public final Integer getOrderId() {
        return this.orderId;
    }

    /* renamed from: t, reason: from getter */
    public final String getOrderState() {
        return this.orderState;
    }

    /* renamed from: u, reason: from getter */
    public final String getPartnerDisplayIdentifier() {
        return this.partnerDisplayIdentifier;
    }

    /* renamed from: v, reason: from getter */
    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    /* renamed from: w, reason: from getter */
    public final String getPartnerIdentifierForCrew() {
        return this.partnerIdentifierForCrew;
    }

    /* renamed from: x, reason: from getter */
    public final String getPartnerIdentifierForCustomer() {
        return this.partnerIdentifierForCustomer;
    }

    /* renamed from: y, reason: from getter */
    public final String getPickupType() {
        return this.pickupType;
    }

    /* renamed from: z, reason: from getter */
    public final String getPickupWindow() {
        return this.pickupWindow;
    }

    public /* synthetic */ UpdatedPickUpOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List list, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Integer num2, String str26, String str27, String str28, Integer num3, String str29, String str30, String str31, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str12, (i10 & 8192) != 0 ? null : str13, (i10 & 16384) != 0 ? null : str14, (i10 & 32768) != 0 ? null : str15, (i10 & 65536) != 0 ? null : str16, (i10 & 131072) != 0 ? null : str17, (i10 & 262144) != 0 ? null : str18, (i10 & 524288) != 0 ? CollectionsKt.m() : list, (i10 & 1048576) != 0 ? null : str19, (i10 & 2097152) != 0 ? null : str20, (i10 & 4194304) != 0 ? null : str21, (i10 & 8388608) != 0 ? null : str22, (i10 & 16777216) != 0 ? null : str23, (i10 & 33554432) != 0 ? null : str24, (i10 & 67108864) != 0 ? null : str25, (i10 & 134217728) != 0 ? null : num2, (i10 & 268435456) != 0 ? null : str26, (i10 & 536870912) != 0 ? null : str27, (i10 & 1073741824) != 0 ? null : str28, (i10 & Integer.MIN_VALUE) != 0 ? null : num3, (i11 & 1) != 0 ? null : str29, (i11 & 2) != 0 ? null : str30, (i11 & 4) != 0 ? null : str31);
    }
}

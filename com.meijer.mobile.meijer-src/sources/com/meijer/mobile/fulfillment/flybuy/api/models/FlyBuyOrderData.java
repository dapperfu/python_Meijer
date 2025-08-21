package com.meijer.mobile.fulfillment.flybuy.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B·\u0003\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*JÀ\u0003\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\b8\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bM\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bO\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bQ\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\b<\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bR\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b5\u0010.R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b=\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bB\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bV\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bW\u0010.R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bX\u0010.R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u00106\u001a\u0004\bE\u0010.R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u00106\u001a\u0004\b@\u0010.R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\b>\u0010.R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u00106\u001a\u0004\bD\u0010.R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00106\u001a\u0004\bI\u0010.R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\bK\u0010.R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u00106\u001a\u0004\bG\u0010.R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00106\u001a\u0004\bZ\u0010.R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u00106\u001a\u0004\bY\u0010.R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\b[\u0010.R\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b\\\u0010UR\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bN\u0010.R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bP\u0010.¨\u0006]"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;", "", "", "type", "", NotificationsManager.INTENT_EXTRA_ORDER_ID, "order_state", "redemption_url", "customer_state", PreferencesHelper.PREF_ID, "arrived_at", "eta_at", "partner_identifier", "partner_display_identifier", "partner_identifier_for_crew", "partner_identifier_for_customer", "state", "redemption_code", "created_at", "updated_at", "area_name", "", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyAreaJson;", "possible_areas", "customer_id", NotificationsManager.INTENT_EXTRA_SITE_ID, "site_partner_identifier", "spot_identifier", "customer_name", "customer_car_type", "customer_car_color", "customer_license_plate", "customer_rating_value", "customer_rating_value_string", "customer_rating_comments", "pickup_window", "pickup_type", "push_token", "tag_ids", "delivery_error_reviewed_at", "delivery_errored_at", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "H", "b", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "c", "r", "d", "B", "e", "l", "f", "p", "g", "h", "o", "i", "t", "j", "s", "k", "u", "v", "m", "F", "n", "A", "I", "Ljava/util/List;", "y", "()Ljava/util/List;", "C", "D", "E", "w", "x", "z", "G", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlyBuyOrderData {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_rating_value;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_rating_value_string;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_rating_comments;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickup_window;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickup_type;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String push_token;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> tag_ids;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String delivery_error_reviewed_at;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String delivery_errored_at;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer order_id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String order_state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemption_url;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer id;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String arrived_at;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eta_at;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partner_identifier;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partner_display_identifier;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partner_identifier_for_crew;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partner_identifier_for_customer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemption_code;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String created_at;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updated_at;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String area_name;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FlyBuyAreaJson> possible_areas;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer customer_id;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer site_id;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String site_partner_identifier;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String spot_identifier;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_name;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_car_type;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_car_color;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer_license_plate;

    public FlyBuyOrderData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public final FlyBuyOrderData copy(@g(name = "type") String type, @g(name = NotificationsManager.INTENT_EXTRA_ORDER_ID) Integer order_id, @g(name = "order_state") String order_state, @g(name = "redemption_url") String redemption_url, @g(name = "customer_state") String customer_state, @g(name = PreferencesHelper.PREF_ID) Integer id2, @g(name = "arrived_at") String arrived_at, @g(name = "eta_at") String eta_at, @g(name = "partner_identifier") String partner_identifier, @g(name = "partner_display_identifier") String partner_display_identifier, @g(name = "partner_identifier_for_crew") String partner_identifier_for_crew, @g(name = "partner_identifier_for_customer") String partner_identifier_for_customer, @g(name = "state") String state, @g(name = "redemption_code") String redemption_code, @g(name = "created_at") String created_at, @g(name = "updated_at") String updated_at, @g(name = "area_name") String area_name, @g(name = "possible_areas") List<FlyBuyAreaJson> possible_areas, @g(name = "customer_id") Integer customer_id, @g(name = NotificationsManager.INTENT_EXTRA_SITE_ID) Integer site_id, @g(name = "site_partner_identifier") String site_partner_identifier, @g(name = "spot_identifier") String spot_identifier, @g(name = "customer_name") String customer_name, @g(name = "customer_car_type") String customer_car_type, @g(name = "customer_car_color") String customer_car_color, @g(name = "customer_license_plate") String customer_license_plate, @g(name = "customer_rating_value") String customer_rating_value, @g(name = "customer_rating_value_string") String customer_rating_value_string, @g(name = "customer_rating_comments") String customer_rating_comments, @g(name = "pickup_window") String pickup_window, @g(name = "pickup_type") String pickup_type, @g(name = "push_token") String push_token, @g(name = "tag_ids") List<Integer> tag_ids, @g(name = "delivery_error_reviewed_at") String delivery_error_reviewed_at, @g(name = "delivery_errored_at") String delivery_errored_at) {
        return new FlyBuyOrderData(type, order_id, order_state, redemption_url, customer_state, id2, arrived_at, eta_at, partner_identifier, partner_display_identifier, partner_identifier_for_crew, partner_identifier_for_customer, state, redemption_code, created_at, updated_at, area_name, possible_areas, customer_id, site_id, site_partner_identifier, spot_identifier, customer_name, customer_car_type, customer_car_color, customer_license_plate, customer_rating_value, customer_rating_value_string, customer_rating_comments, pickup_window, pickup_type, push_token, tag_ids, delivery_error_reviewed_at, delivery_errored_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyOrderData)) {
            return false;
        }
        FlyBuyOrderData flyBuyOrderData = (FlyBuyOrderData) other;
        return Intrinsics.e(this.type, flyBuyOrderData.type) && Intrinsics.e(this.order_id, flyBuyOrderData.order_id) && Intrinsics.e(this.order_state, flyBuyOrderData.order_state) && Intrinsics.e(this.redemption_url, flyBuyOrderData.redemption_url) && Intrinsics.e(this.customer_state, flyBuyOrderData.customer_state) && Intrinsics.e(this.id, flyBuyOrderData.id) && Intrinsics.e(this.arrived_at, flyBuyOrderData.arrived_at) && Intrinsics.e(this.eta_at, flyBuyOrderData.eta_at) && Intrinsics.e(this.partner_identifier, flyBuyOrderData.partner_identifier) && Intrinsics.e(this.partner_display_identifier, flyBuyOrderData.partner_display_identifier) && Intrinsics.e(this.partner_identifier_for_crew, flyBuyOrderData.partner_identifier_for_crew) && Intrinsics.e(this.partner_identifier_for_customer, flyBuyOrderData.partner_identifier_for_customer) && Intrinsics.e(this.state, flyBuyOrderData.state) && Intrinsics.e(this.redemption_code, flyBuyOrderData.redemption_code) && Intrinsics.e(this.created_at, flyBuyOrderData.created_at) && Intrinsics.e(this.updated_at, flyBuyOrderData.updated_at) && Intrinsics.e(this.area_name, flyBuyOrderData.area_name) && Intrinsics.e(this.possible_areas, flyBuyOrderData.possible_areas) && Intrinsics.e(this.customer_id, flyBuyOrderData.customer_id) && Intrinsics.e(this.site_id, flyBuyOrderData.site_id) && Intrinsics.e(this.site_partner_identifier, flyBuyOrderData.site_partner_identifier) && Intrinsics.e(this.spot_identifier, flyBuyOrderData.spot_identifier) && Intrinsics.e(this.customer_name, flyBuyOrderData.customer_name) && Intrinsics.e(this.customer_car_type, flyBuyOrderData.customer_car_type) && Intrinsics.e(this.customer_car_color, flyBuyOrderData.customer_car_color) && Intrinsics.e(this.customer_license_plate, flyBuyOrderData.customer_license_plate) && Intrinsics.e(this.customer_rating_value, flyBuyOrderData.customer_rating_value) && Intrinsics.e(this.customer_rating_value_string, flyBuyOrderData.customer_rating_value_string) && Intrinsics.e(this.customer_rating_comments, flyBuyOrderData.customer_rating_comments) && Intrinsics.e(this.pickup_window, flyBuyOrderData.pickup_window) && Intrinsics.e(this.pickup_type, flyBuyOrderData.pickup_type) && Intrinsics.e(this.push_token, flyBuyOrderData.push_token) && Intrinsics.e(this.tag_ids, flyBuyOrderData.tag_ids) && Intrinsics.e(this.delivery_error_reviewed_at, flyBuyOrderData.delivery_error_reviewed_at) && Intrinsics.e(this.delivery_errored_at, flyBuyOrderData.delivery_errored_at);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.order_id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.order_state;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redemption_url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customer_state;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.id;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.arrived_at;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eta_at;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.partner_identifier;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.partner_display_identifier;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.partner_identifier_for_crew;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.partner_identifier_for_customer;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.state;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.redemption_code;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.created_at;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.updated_at;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.area_name;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<FlyBuyAreaJson> list = this.possible_areas;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.customer_id;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.site_id;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str16 = this.site_partner_identifier;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.spot_identifier;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.customer_name;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.customer_car_type;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.customer_car_color;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.customer_license_plate;
        int iHashCode26 = (iHashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.customer_rating_value;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.customer_rating_value_string;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.customer_rating_comments;
        int iHashCode29 = (iHashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.pickup_window;
        int iHashCode30 = (iHashCode29 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.pickup_type;
        int iHashCode31 = (iHashCode30 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.push_token;
        int iHashCode32 = (iHashCode31 + (str27 == null ? 0 : str27.hashCode())) * 31;
        List<Integer> list2 = this.tag_ids;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str28 = this.delivery_error_reviewed_at;
        int iHashCode34 = (iHashCode33 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.delivery_errored_at;
        return iHashCode34 + (str29 != null ? str29.hashCode() : 0);
    }

    public String toString() {
        return "FlyBuyOrderData(type=" + this.type + ", order_id=" + this.order_id + ", order_state=" + this.order_state + ", redemption_url=" + this.redemption_url + ", customer_state=" + this.customer_state + ", id=" + this.id + ", arrived_at=" + this.arrived_at + ", eta_at=" + this.eta_at + ", partner_identifier=" + this.partner_identifier + ", partner_display_identifier=" + this.partner_display_identifier + ", partner_identifier_for_crew=" + this.partner_identifier_for_crew + ", partner_identifier_for_customer=" + this.partner_identifier_for_customer + ", state=" + this.state + ", redemption_code=" + this.redemption_code + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", area_name=" + this.area_name + ", possible_areas=" + this.possible_areas + ", customer_id=" + this.customer_id + ", site_id=" + this.site_id + ", site_partner_identifier=" + this.site_partner_identifier + ", spot_identifier=" + this.spot_identifier + ", customer_name=" + this.customer_name + ", customer_car_type=" + this.customer_car_type + ", customer_car_color=" + this.customer_car_color + ", customer_license_plate=" + this.customer_license_plate + ", customer_rating_value=" + this.customer_rating_value + ", customer_rating_value_string=" + this.customer_rating_value_string + ", customer_rating_comments=" + this.customer_rating_comments + ", pickup_window=" + this.pickup_window + ", pickup_type=" + this.pickup_type + ", push_token=" + this.push_token + ", tag_ids=" + this.tag_ids + ", delivery_error_reviewed_at=" + this.delivery_error_reviewed_at + ", delivery_errored_at=" + this.delivery_errored_at + ')';
    }

    public FlyBuyOrderData(@g(name = "type") String str, @g(name = NotificationsManager.INTENT_EXTRA_ORDER_ID) Integer num, @g(name = "order_state") String str2, @g(name = "redemption_url") String str3, @g(name = "customer_state") String str4, @g(name = PreferencesHelper.PREF_ID) Integer num2, @g(name = "arrived_at") String str5, @g(name = "eta_at") String str6, @g(name = "partner_identifier") String str7, @g(name = "partner_display_identifier") String str8, @g(name = "partner_identifier_for_crew") String str9, @g(name = "partner_identifier_for_customer") String str10, @g(name = "state") String str11, @g(name = "redemption_code") String str12, @g(name = "created_at") String str13, @g(name = "updated_at") String str14, @g(name = "area_name") String str15, @g(name = "possible_areas") List<FlyBuyAreaJson> list, @g(name = "customer_id") Integer num3, @g(name = NotificationsManager.INTENT_EXTRA_SITE_ID) Integer num4, @g(name = "site_partner_identifier") String str16, @g(name = "spot_identifier") String str17, @g(name = "customer_name") String str18, @g(name = "customer_car_type") String str19, @g(name = "customer_car_color") String str20, @g(name = "customer_license_plate") String str21, @g(name = "customer_rating_value") String str22, @g(name = "customer_rating_value_string") String str23, @g(name = "customer_rating_comments") String str24, @g(name = "pickup_window") String str25, @g(name = "pickup_type") String str26, @g(name = "push_token") String str27, @g(name = "tag_ids") List<Integer> list2, @g(name = "delivery_error_reviewed_at") String str28, @g(name = "delivery_errored_at") String str29) {
        this.type = str;
        this.order_id = num;
        this.order_state = str2;
        this.redemption_url = str3;
        this.customer_state = str4;
        this.id = num2;
        this.arrived_at = str5;
        this.eta_at = str6;
        this.partner_identifier = str7;
        this.partner_display_identifier = str8;
        this.partner_identifier_for_crew = str9;
        this.partner_identifier_for_customer = str10;
        this.state = str11;
        this.redemption_code = str12;
        this.created_at = str13;
        this.updated_at = str14;
        this.area_name = str15;
        this.possible_areas = list;
        this.customer_id = num3;
        this.site_id = num4;
        this.site_partner_identifier = str16;
        this.spot_identifier = str17;
        this.customer_name = str18;
        this.customer_car_type = str19;
        this.customer_car_color = str20;
        this.customer_license_plate = str21;
        this.customer_rating_value = str22;
        this.customer_rating_value_string = str23;
        this.customer_rating_comments = str24;
        this.pickup_window = str25;
        this.pickup_type = str26;
        this.push_token = str27;
        this.tag_ids = list2;
        this.delivery_error_reviewed_at = str28;
        this.delivery_errored_at = str29;
    }

    /* renamed from: A, reason: from getter */
    public final String getRedemption_code() {
        return this.redemption_code;
    }

    /* renamed from: B, reason: from getter */
    public final String getRedemption_url() {
        return this.redemption_url;
    }

    /* renamed from: C, reason: from getter */
    public final Integer getSite_id() {
        return this.site_id;
    }

    /* renamed from: D, reason: from getter */
    public final String getSite_partner_identifier() {
        return this.site_partner_identifier;
    }

    /* renamed from: E, reason: from getter */
    public final String getSpot_identifier() {
        return this.spot_identifier;
    }

    /* renamed from: F, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final List<Integer> G() {
        return this.tag_ids;
    }

    /* renamed from: H, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: I, reason: from getter */
    public final String getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: a, reason: from getter */
    public final String getArea_name() {
        return this.area_name;
    }

    /* renamed from: b, reason: from getter */
    public final String getArrived_at() {
        return this.arrived_at;
    }

    /* renamed from: c, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* renamed from: d, reason: from getter */
    public final String getCustomer_car_color() {
        return this.customer_car_color;
    }

    /* renamed from: e, reason: from getter */
    public final String getCustomer_car_type() {
        return this.customer_car_type;
    }

    /* renamed from: f, reason: from getter */
    public final Integer getCustomer_id() {
        return this.customer_id;
    }

    /* renamed from: g, reason: from getter */
    public final String getCustomer_license_plate() {
        return this.customer_license_plate;
    }

    /* renamed from: h, reason: from getter */
    public final String getCustomer_name() {
        return this.customer_name;
    }

    /* renamed from: i, reason: from getter */
    public final String getCustomer_rating_comments() {
        return this.customer_rating_comments;
    }

    /* renamed from: j, reason: from getter */
    public final String getCustomer_rating_value() {
        return this.customer_rating_value;
    }

    /* renamed from: k, reason: from getter */
    public final String getCustomer_rating_value_string() {
        return this.customer_rating_value_string;
    }

    /* renamed from: l, reason: from getter */
    public final String getCustomer_state() {
        return this.customer_state;
    }

    /* renamed from: m, reason: from getter */
    public final String getDelivery_error_reviewed_at() {
        return this.delivery_error_reviewed_at;
    }

    /* renamed from: n, reason: from getter */
    public final String getDelivery_errored_at() {
        return this.delivery_errored_at;
    }

    /* renamed from: o, reason: from getter */
    public final String getEta_at() {
        return this.eta_at;
    }

    /* renamed from: p, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: q, reason: from getter */
    public final Integer getOrder_id() {
        return this.order_id;
    }

    /* renamed from: r, reason: from getter */
    public final String getOrder_state() {
        return this.order_state;
    }

    /* renamed from: s, reason: from getter */
    public final String getPartner_display_identifier() {
        return this.partner_display_identifier;
    }

    /* renamed from: t, reason: from getter */
    public final String getPartner_identifier() {
        return this.partner_identifier;
    }

    /* renamed from: u, reason: from getter */
    public final String getPartner_identifier_for_crew() {
        return this.partner_identifier_for_crew;
    }

    /* renamed from: v, reason: from getter */
    public final String getPartner_identifier_for_customer() {
        return this.partner_identifier_for_customer;
    }

    /* renamed from: w, reason: from getter */
    public final String getPickup_type() {
        return this.pickup_type;
    }

    /* renamed from: x, reason: from getter */
    public final String getPickup_window() {
        return this.pickup_window;
    }

    public final List<FlyBuyAreaJson> y() {
        return this.possible_areas;
    }

    /* renamed from: z, reason: from getter */
    public final String getPush_token() {
        return this.push_token;
    }

    public /* synthetic */ FlyBuyOrderData(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, Integer num3, Integer num4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List list2, String str28, String str29, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0 : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? 0 : num2, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, (i10 & 1024) != 0 ? null : str9, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str10, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str11, (i10 & 8192) != 0 ? null : str12, (i10 & 16384) != 0 ? null : str13, (i10 & 32768) != 0 ? null : str14, (i10 & 65536) != 0 ? null : str15, (i10 & 131072) != 0 ? null : list, (i10 & 262144) != 0 ? null : num3, (i10 & 524288) == 0 ? num4 : 0, (i10 & 1048576) != 0 ? null : str16, (i10 & 2097152) != 0 ? null : str17, (i10 & 4194304) != 0 ? null : str18, (i10 & 8388608) != 0 ? null : str19, (i10 & 16777216) != 0 ? null : str20, (i10 & 33554432) != 0 ? null : str21, (i10 & 67108864) != 0 ? null : str22, (i10 & 134217728) != 0 ? null : str23, (i10 & 268435456) != 0 ? null : str24, (i10 & 536870912) != 0 ? null : str25, (i10 & 1073741824) != 0 ? null : str26, (i10 & Integer.MIN_VALUE) != 0 ? null : str27, (i11 & 1) != 0 ? CollectionsKt.m() : list2, (i11 & 2) != 0 ? null : str28, (i11 & 4) != 0 ? null : str29);
    }
}

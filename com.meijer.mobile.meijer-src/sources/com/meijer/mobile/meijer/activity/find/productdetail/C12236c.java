package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Kp.ProductReviewFullDetails;
import Xr.CouponListItemDecorator;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import cn.ProductVariantGroupDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12328b;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductCartEntryDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductComplexPromoDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductStoreLocationDecorator;
import gi.GoogleAdData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b@\b\u0002\u0018\u00002\u00020\u0001B\u00ad\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00060\t\u0012\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00060\t\u0012\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\t\u0012\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00060\t\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\t\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\t\u0012\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\t\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\t\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\t\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002060\t\u0012\u0018\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:090\t\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0018\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:090\t¢\u0006\u0004\b>\u0010?R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bD\u0010KR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010KR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010KR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010KR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bS\u0010KR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010KR&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\bO\u0010KR&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bT\u0010KR\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bM\u0010KR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010KR \u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010KR \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010I\u001a\u0004\b^\u0010KR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010I\u001a\u0004\b\"\u0010KR \u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\b`\u0010KR\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010a\u001a\u0004\bL\u0010bR \u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bc\u0010KR \u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\bd\u0010KR \u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010I\u001a\u0004\bf\u0010KR \u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010I\u001a\u0004\b)\u0010KR \u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010KR \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010I\u001a\u0004\bk\u0010KR \u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010I\u001a\u0004\b,\u0010KR \u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010I\u001a\u0004\b-\u0010KR\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010I\u001a\u0004\bW\u0010KR \u00101\u001a\b\u0012\u0004\u0012\u0002000\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010I\u001a\u0004\bH\u0010KR\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010I\u001a\u0004\be\u0010KR \u00105\u001a\b\u0012\u0004\u0012\u0002040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010I\u001a\u0004\bQ\u0010KR \u00107\u001a\b\u0012\u0004\u0012\u0002060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010I\u001a\u0004\bV\u0010KR \u00108\u001a\b\u0012\u0004\u0012\u0002060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010KR,\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:090\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010I\u001a\u0004\b_\u0010KR&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR,\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:090\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010I\u001a\u0004\bg\u0010K¨\u0006z"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "onUpdate", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "effectsInMotion", "Landroidx/compose/runtime/l0;", "", "isLoadingVisible", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "bottomActionBarState", "LCo/h;", "domain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "product", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "storeLocation", "Lvs/m;", "price", "Lvs/l;", "nutritionLabel", "LXr/c;", "coupons", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "frequentlyBoughtTogether", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "complexPromo", "Lcn/j;", "productVariants", "isOnShoppingList", "isOnFavoritesList", "isFromCLP", "isVariantInteracted", "Landroidx/compose/runtime/j0;", "cartItemCount", "isEligibleForCart", "isBuyAgain", "isInStoreOnly", "isAvailable", "isLowStock", "isOutOfStock", "isDelivery", "isPickup", "Lgi/d;", "googleAdData", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "cartEntry", "LKp/c;", "reviews", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "criteoBeaconTracker", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "frequentlyBoughtTogetherProductsLoadingStatus", "bazaarVoiceProductDisplayStatus", "", "", "initialSelectedVariants", "allInteractedVariants", "selectedVariant", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/j0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Ljava/util/Map;Landroidx/compose/runtime/l0;)V", "a", "Lkotlin/jvm/functions/Function1;", "I", "()Lkotlin/jvm/functions/Function1;", "b", "Ljava/util/List;", "J", "()Ljava/util/List;", "c", "Landroidx/compose/runtime/l0;", "Z", "()Landroidx/compose/runtime/l0;", "d", "e", "h", "f", "s", "g", "V", "r", "i", "q", "j", "k", "l", "m", "t", "n", "c0", "o", "b0", "p", "e0", "Landroidx/compose/runtime/j0;", "()Landroidx/compose/runtime/j0;", "X", "W", "u", "Y", "v", "w", "a0", "x", "d0", "y", "z", "A", "B", "C", "D", "E", "F", "getBazaarVoiceProductDisplayStatus", "G", "H", "Ljava/util/Map;", "K", "()Ljava/util/Map;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C12236c implements C12358e0.InterfaceC12362d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<GoogleAdData> googleAdData;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductCartEntryDecorator> cartEntry;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductReviewFullDetails> reviews;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<C12328b> criteoBeaconTracker;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Map<String, String>> initialSelectedVariants;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> allInteractedVariants;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Map<String, String>> selectedVariant;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<C12358e0.InterfaceC12364f, Unit> onUpdate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<C12358e0.InterfaceC12363e> effectsInMotion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLoadingVisible;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<C12358e0.InterfaceC12359a> bottomActionBarState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductFullDetails> domain;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductDetailsDecorator> product;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductStoreLocationDecorator> storeLocation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductPriceDecorator> price;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductNutritionLabelDecorator> nutritionLabel;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<List<CouponListItemDecorator>> coupons;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<ProductComplexPromoDecorator> complexPromo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<List<ProductVariantGroupDecorator>> productVariants;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isOnShoppingList;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isOnFavoritesList;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isFromCLP;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isVariantInteracted;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5868j0 cartItemCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isEligibleForCart;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isBuyAgain;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isInStoreOnly;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isAvailable;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLowStock;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isOutOfStock;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isDelivery;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isPickup;

    /* JADX WARN: Multi-variable type inference failed */
    public C12236c(Function1<? super C12358e0.InterfaceC12364f, Unit> onUpdate, List<? extends C12358e0.InterfaceC12363e> effectsInMotion, InterfaceC5872l0<Boolean> isLoadingVisible, InterfaceC5872l0<C12358e0.InterfaceC12359a> bottomActionBarState, InterfaceC5872l0<ProductFullDetails> domain, InterfaceC5872l0<ProductDetailsDecorator> product, InterfaceC5872l0<ProductStoreLocationDecorator> storeLocation, InterfaceC5872l0<ProductPriceDecorator> price, InterfaceC5872l0<ProductNutritionLabelDecorator> nutritionLabel, InterfaceC5872l0<List<CouponListItemDecorator>> coupons, InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether, InterfaceC5872l0<ProductComplexPromoDecorator> complexPromo, InterfaceC5872l0<List<ProductVariantGroupDecorator>> productVariants, InterfaceC5872l0<Boolean> isOnShoppingList, InterfaceC5872l0<Boolean> isOnFavoritesList, InterfaceC5872l0<Boolean> isFromCLP, InterfaceC5872l0<Boolean> isVariantInteracted, InterfaceC5868j0 cartItemCount, InterfaceC5872l0<Boolean> isEligibleForCart, InterfaceC5872l0<Boolean> isBuyAgain, InterfaceC5872l0<Boolean> isInStoreOnly, InterfaceC5872l0<Boolean> isAvailable, InterfaceC5872l0<Boolean> isLowStock, InterfaceC5872l0<Boolean> isOutOfStock, InterfaceC5872l0<Boolean> isDelivery, InterfaceC5872l0<Boolean> isPickup, InterfaceC5872l0<GoogleAdData> googleAdData, InterfaceC5872l0<ProductCartEntryDecorator> cartEntry, InterfaceC5872l0<ProductReviewFullDetails> reviews, InterfaceC5872l0<C12328b> criteoBeaconTracker, InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus, InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus, InterfaceC5872l0<Map<String, String>> initialSelectedVariants, Map<String, String> allInteractedVariants, InterfaceC5872l0<Map<String, String>> selectedVariant) {
        Intrinsics.j(onUpdate, "onUpdate");
        Intrinsics.j(effectsInMotion, "effectsInMotion");
        Intrinsics.j(isLoadingVisible, "isLoadingVisible");
        Intrinsics.j(bottomActionBarState, "bottomActionBarState");
        Intrinsics.j(domain, "domain");
        Intrinsics.j(product, "product");
        Intrinsics.j(storeLocation, "storeLocation");
        Intrinsics.j(price, "price");
        Intrinsics.j(nutritionLabel, "nutritionLabel");
        Intrinsics.j(coupons, "coupons");
        Intrinsics.j(frequentlyBoughtTogether, "frequentlyBoughtTogether");
        Intrinsics.j(complexPromo, "complexPromo");
        Intrinsics.j(productVariants, "productVariants");
        Intrinsics.j(isOnShoppingList, "isOnShoppingList");
        Intrinsics.j(isOnFavoritesList, "isOnFavoritesList");
        Intrinsics.j(isFromCLP, "isFromCLP");
        Intrinsics.j(isVariantInteracted, "isVariantInteracted");
        Intrinsics.j(cartItemCount, "cartItemCount");
        Intrinsics.j(isEligibleForCart, "isEligibleForCart");
        Intrinsics.j(isBuyAgain, "isBuyAgain");
        Intrinsics.j(isInStoreOnly, "isInStoreOnly");
        Intrinsics.j(isAvailable, "isAvailable");
        Intrinsics.j(isLowStock, "isLowStock");
        Intrinsics.j(isOutOfStock, "isOutOfStock");
        Intrinsics.j(isDelivery, "isDelivery");
        Intrinsics.j(isPickup, "isPickup");
        Intrinsics.j(googleAdData, "googleAdData");
        Intrinsics.j(cartEntry, "cartEntry");
        Intrinsics.j(reviews, "reviews");
        Intrinsics.j(criteoBeaconTracker, "criteoBeaconTracker");
        Intrinsics.j(frequentlyBoughtTogetherProductsLoadingStatus, "frequentlyBoughtTogetherProductsLoadingStatus");
        Intrinsics.j(bazaarVoiceProductDisplayStatus, "bazaarVoiceProductDisplayStatus");
        Intrinsics.j(initialSelectedVariants, "initialSelectedVariants");
        Intrinsics.j(allInteractedVariants, "allInteractedVariants");
        Intrinsics.j(selectedVariant, "selectedVariant");
        this.onUpdate = onUpdate;
        this.effectsInMotion = effectsInMotion;
        this.isLoadingVisible = isLoadingVisible;
        this.bottomActionBarState = bottomActionBarState;
        this.domain = domain;
        this.product = product;
        this.storeLocation = storeLocation;
        this.price = price;
        this.nutritionLabel = nutritionLabel;
        this.coupons = coupons;
        this.frequentlyBoughtTogether = frequentlyBoughtTogether;
        this.complexPromo = complexPromo;
        this.productVariants = productVariants;
        this.isOnShoppingList = isOnShoppingList;
        this.isOnFavoritesList = isOnFavoritesList;
        this.isFromCLP = isFromCLP;
        this.isVariantInteracted = isVariantInteracted;
        this.cartItemCount = cartItemCount;
        this.isEligibleForCart = isEligibleForCart;
        this.isBuyAgain = isBuyAgain;
        this.isInStoreOnly = isInStoreOnly;
        this.isAvailable = isAvailable;
        this.isLowStock = isLowStock;
        this.isOutOfStock = isOutOfStock;
        this.isDelivery = isDelivery;
        this.isPickup = isPickup;
        this.googleAdData = googleAdData;
        this.cartEntry = cartEntry;
        this.reviews = reviews;
        this.criteoBeaconTracker = criteoBeaconTracker;
        this.frequentlyBoughtTogetherProductsLoadingStatus = frequentlyBoughtTogetherProductsLoadingStatus;
        this.bazaarVoiceProductDisplayStatus = bazaarVoiceProductDisplayStatus;
        this.initialSelectedVariants = initialSelectedVariants;
        this.allInteractedVariants = allInteractedVariants;
        this.selectedVariant = selectedVariant;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    public Function1<C12358e0.InterfaceC12364f, Unit> I() {
        return this.onUpdate;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    public List<C12358e0.InterfaceC12363e> J() {
        return this.effectsInMotion;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    public Map<String, String> K() {
        return this.allInteractedVariants;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductStoreLocationDecorator> P() {
        return this.storeLocation;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> B() {
        return this.isBuyAgain;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> o() {
        return this.isEligibleForCart;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> C() {
        return this.isInStoreOnly;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> y() {
        return this.isLoadingVisible;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> x() {
        return this.isLowStock;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<C12358e0.InterfaceC12359a> G() {
        return this.bottomActionBarState;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> L() {
        return this.isOnFavoritesList;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductCartEntryDecorator> Q() {
        return this.cartEntry;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> H() {
        return this.isOnShoppingList;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: d, reason: from getter */
    public InterfaceC5868j0 getCartItemCount() {
        return this.cartItemCount;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> n() {
        return this.isOutOfStock;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductComplexPromoDecorator> T() {
        return this.complexPromo;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Boolean> z() {
        return this.isVariantInteracted;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<List<CouponListItemDecorator>> a() {
        return this.coupons;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<C12328b> M() {
        return this.criteoBeaconTracker;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductFullDetails> w() {
        return this.domain;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> O() {
        return this.frequentlyBoughtTogether;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> U() {
        return this.frequentlyBoughtTogetherProductsLoadingStatus;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<GoogleAdData> R() {
        return this.googleAdData;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Map<String, String>> S() {
        return this.initialSelectedVariants;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductNutritionLabelDecorator> A() {
        return this.nutritionLabel;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductPriceDecorator> l() {
        return this.price;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductDetailsDecorator> m() {
        return this.product;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<List<ProductVariantGroupDecorator>> D() {
        return this.productVariants;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<ProductReviewFullDetails> F() {
        return this.reviews;
    }

    @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC5872l0<Map<String, String>> E() {
        return this.selectedVariant;
    }
}

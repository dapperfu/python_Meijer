package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Image;
import Co.ProductFullDetails;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Kp.ProductReviewFullDetails;
import Tq.SimpleStoreSummary;
import Xr.CouponListItemDecorator;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.GoogleAdData;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import nk.InterfaceC15960a;
import us.C17457C;
import vs.ProductLocationDecorator;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;
import wk.C17898a;
import wl.CartEntry;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e\u0012\b\b\u0002\u0010%\u001a\u00020!\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0094\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020!2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e2\b\b\u0002\u0010%\u001a\u00020!2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b\u0012\u0010QR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bR\u0010\\R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\bV\u00103R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b=\u0010]\u001a\u0004\bO\u0010^R\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b_\u0010]\u001a\u0004\b`\u0010^R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\be\u0010P\u001a\u0004\bf\u0010QR\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bg\u0010P\u001a\u0004\bh\u0010QR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bm\u0010NR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bk\u0010j\u001a\u0004\bK\u0010lR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bI\u0010pR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\b_\u0010sR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bn\u0010vR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010P\u001a\u0005\b\u0082\u0001\u0010QR\u0013\u0010\u0085\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010QR\u0013\u0010\u0087\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010QR\u0013\u0010\u0089\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010QR\u0013\u0010\u008b\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010QR\u0013\u0010\u008d\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010QR\u0013\u0010\u008f\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u00101R\u0012\u0010\u0090\u0001\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bi\u00101R\u0012\u0010\u0091\u0001\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bx\u0010QR\u0012\u0010\u0092\u0001\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bt\u0010QR\u0012\u0010\u0093\u0001\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bq\u0010QR\u0013\u0010\u0095\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u00101R\u0013\u0010\u0097\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010QR\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\be\u00101R\u0013\u0010\u009a\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010QR\u0013\u0010\u009c\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010QR\u0016\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\u0007\u001a\u0005\bE\u0010\u009e\u0001R\u0013\u0010 \u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010QR\u0015\u0010¢\u0001\u001a\u00030\u009d\u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009e\u0001R\u0012\u0010£\u0001\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b|\u0010QR\u0015\u0010§\u0001\u001a\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0013\u0010©\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010QR\u0014\u0010ª\u0001\u001a\u00030\u009d\u00018F¢\u0006\u0007\u001a\u0005\ba\u0010\u009e\u0001R\u0015\u0010¬\u0001\u001a\u00030\u009d\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010\u009e\u0001R\u0019\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bg\u0010NR\u0017\u0010°\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u009e\u0001R\u0016\u0010±\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\u0007\u001a\u0005\bZ\u0010\u009e\u0001¨\u0006²\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;", "", "LCo/h;", "product", "", "complexPromoString", "", "complexPromoId", "LTq/k;", "storeDetails", "Lvs/l;", "nutritionLabel", "", "couponCount", "", "LXr/c;", "coupons", "", "isUpdatingShoppingList", "LFq/c;", "shoppingListEntry", "LFq/a;", "favoriteListEntry", "Lwl/a;", "cartEntry", "cartItemCount", "Lwl/b$a;", "cartEligibility", "storeAvailability", "Lfj/n;", "fulfillmentMode", "isFromCLP", "isBuyAgain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "frequentlyBoughtTogetherProductsLoadingStatus", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "frequentlyBoughtTogetherProducts", "bazaarVoiceProductDisplayStatus", "LKp/c;", "bazaarVoiceProductDisplay", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "criteoBeaconTracker", "Lgi/d;", "googleAdData", "<init>", "(LCo/h;Ljava/lang/String;Ljava/lang/Long;LTq/k;Lvs/l;ILjava/util/List;ZLFq/c;LFq/a;Lwl/a;ILwl/b$a;Lwl/b$a;Lfj/n;ZZLcom/meijer/mobile/meijer/activity/find/viewmodel/r;Ljava/util/List;Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;LKp/c;Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;Lgi/d;)V", "c", "(LCo/h;Ljava/lang/String;Ljava/lang/Long;LTq/k;Lvs/l;ILjava/util/List;ZLFq/c;LFq/a;Lwl/a;ILwl/b$a;Lwl/b$a;Lfj/n;ZZLcom/meijer/mobile/meijer/activity/find/viewmodel/r;Ljava/util/List;Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;LKp/c;Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;Lgi/d;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "I", "()LCo/h;", "b", "Ljava/lang/String;", "m", "Ljava/lang/Long;", "l", "()Ljava/lang/Long;", "d", "LTq/k;", "getStoreDetails", "()LTq/k;", "e", "Lvs/l;", "G", "()Lvs/l;", "f", "getCouponCount", "g", "Ljava/util/List;", "getCoupons", "()Ljava/util/List;", "h", "Z", "()Z", "i", "LFq/c;", "getShoppingListEntry", "()LFq/c;", "j", "LFq/a;", "getFavoriteListEntry", "()LFq/a;", "k", "Lwl/a;", "()Lwl/a;", "Lwl/b$a;", "()Lwl/b$a;", "n", "L", "o", "Lfj/n;", "getFulfillmentMode", "()Lfj/n;", "p", "R", "q", "P", "r", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "t", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "s", "u", "LKp/c;", "()LKp/c;", "v", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "w", "Lgi/d;", "()Lgi/d;", "Lvs/m;", "x", "Lvs/m;", "priceDecorator", "Lvs/i;", "y", "Lvs/i;", "E", "()Lvs/i;", "location", "z", "K", "showWeightInfo", "V", "isOnShoppingList", "T", "isOnFavoriteList", "U", "isOnSale", "C", "hasIngredients", "B", "hasDisclaimers", "D", "ingredients", "disclaimers", "hasChokingWarning", "hasAlcoholWaring", "hasAgeRestriction", "M", "title", "A", "hasDescription", "description", "S", "isInStoreOnly", "Q", "isEligibleForCart", "Lbk/a;", "()Lbk/a;", "amountSaved", "hasDeposit", "J", "regularPrice", "hasCoupons", "", "F", "()D", "maxOrderQuantity", "O", "isBopas", "currentPriceNoDeposit", "N", "weightInfo", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "detailImages", "H", "priceGoodThroughDate", "complexPromo", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j1, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductDetailsState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String complexPromoString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long complexPromoId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Tq.k storeDetails;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductNutritionLabelDecorator nutritionLabel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int couponCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponListItemDecorator> coupons;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUpdatingShoppingList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingListItem shoppingListEntry;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final FavoriteListItem favoriteListEntry;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartEntry cartEntry;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a cartEligibility;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a storeAvailability;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final fj.n fulfillmentMode;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromCLP;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuyAgain;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final r frequentlyBoughtTogetherProductsLoadingStatus;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SuggestedProductCarouselDecorator> frequentlyBoughtTogetherProducts;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final r bazaarVoiceProductDisplayStatus;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductReviewFullDetails bazaarVoiceProductDisplay;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final C12328b criteoBeaconTracker;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final GoogleAdData googleAdData;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final ProductPriceDecorator priceDecorator;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final ProductLocationDecorator location;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean showWeightInfo;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j1$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((ProductImageViewModel) t11).z()), Boolean.valueOf(((ProductImageViewModel) t10).z()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.j1$c */
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f109787a;

        public c(Comparator comparator) {
            this.f109787a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f109787a.compare(t10, t11);
            return iCompare != 0 ? iCompare : ComparisonsKt.d(((ProductImageViewModel) t10).Z0(), ((ProductImageViewModel) t11).Z0());
        }
    }

    public ProductDetailsState(ProductFullDetails product, String str, Long l10, Tq.k storeDetails, ProductNutritionLabelDecorator productNutritionLabelDecorator, int i10, List<CouponListItemDecorator> coupons, boolean z10, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, CartEntry cartEntry, int i11, ProductEligibility.a cartEligibility, ProductEligibility.a storeAvailability, fj.n nVar, boolean z11, boolean z12, r frequentlyBoughtTogetherProductsLoadingStatus, List<SuggestedProductCarouselDecorator> list, r bazaarVoiceProductDisplayStatus, ProductReviewFullDetails productReviewFullDetails, C12328b criteoBeaconTracker, GoogleAdData googleAdData) {
        Intrinsics.j(product, "product");
        Intrinsics.j(storeDetails, "storeDetails");
        Intrinsics.j(coupons, "coupons");
        Intrinsics.j(cartEntry, "cartEntry");
        Intrinsics.j(cartEligibility, "cartEligibility");
        Intrinsics.j(storeAvailability, "storeAvailability");
        Intrinsics.j(frequentlyBoughtTogetherProductsLoadingStatus, "frequentlyBoughtTogetherProductsLoadingStatus");
        Intrinsics.j(bazaarVoiceProductDisplayStatus, "bazaarVoiceProductDisplayStatus");
        Intrinsics.j(criteoBeaconTracker, "criteoBeaconTracker");
        this.product = product;
        this.complexPromoString = str;
        this.complexPromoId = l10;
        this.storeDetails = storeDetails;
        this.nutritionLabel = productNutritionLabelDecorator;
        this.couponCount = i10;
        this.coupons = coupons;
        this.isUpdatingShoppingList = z10;
        this.shoppingListEntry = shoppingListItem;
        this.favoriteListEntry = favoriteListItem;
        this.cartEntry = cartEntry;
        this.cartItemCount = i11;
        this.cartEligibility = cartEligibility;
        this.storeAvailability = storeAvailability;
        this.fulfillmentMode = nVar;
        this.isFromCLP = z11;
        this.isBuyAgain = z12;
        this.frequentlyBoughtTogetherProductsLoadingStatus = frequentlyBoughtTogetherProductsLoadingStatus;
        this.frequentlyBoughtTogetherProducts = list;
        this.bazaarVoiceProductDisplayStatus = bazaarVoiceProductDisplayStatus;
        this.bazaarVoiceProductDisplay = productReviewFullDetails;
        this.criteoBeaconTracker = criteoBeaconTracker;
        this.googleAdData = googleAdData;
        ProductPriceDecorator productPriceDecorator = new ProductPriceDecorator(product, false, 0.0d, 6, null);
        this.priceDecorator = productPriceDecorator;
        ProductLocationDecorator.Companion companion = ProductLocationDecorator.INSTANCE;
        String name = storeDetails.getName();
        this.location = companion.a(product, name == null ? "" : name);
        this.showWeightInfo = productPriceDecorator.getIsEstimatedUnitPrice() && !product.getIsMap();
    }

    public static /* synthetic */ ProductDetailsState d(ProductDetailsState productDetailsState, ProductFullDetails productFullDetails, String str, Long l10, Tq.k kVar, ProductNutritionLabelDecorator productNutritionLabelDecorator, int i10, List list, boolean z10, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, CartEntry cartEntry, int i11, ProductEligibility.a aVar, ProductEligibility.a aVar2, fj.n nVar, boolean z11, boolean z12, r rVar, List list2, r rVar2, ProductReviewFullDetails productReviewFullDetails, C12328b c12328b, GoogleAdData googleAdData, int i12, Object obj) {
        GoogleAdData googleAdData2;
        C12328b c12328b2;
        ProductFullDetails productFullDetails2 = (i12 & 1) != 0 ? productDetailsState.product : productFullDetails;
        String str2 = (i12 & 2) != 0 ? productDetailsState.complexPromoString : str;
        Long l11 = (i12 & 4) != 0 ? productDetailsState.complexPromoId : l10;
        Tq.k kVar2 = (i12 & 8) != 0 ? productDetailsState.storeDetails : kVar;
        ProductNutritionLabelDecorator productNutritionLabelDecorator2 = (i12 & 16) != 0 ? productDetailsState.nutritionLabel : productNutritionLabelDecorator;
        int i13 = (i12 & 32) != 0 ? productDetailsState.couponCount : i10;
        List list3 = (i12 & 64) != 0 ? productDetailsState.coupons : list;
        boolean z13 = (i12 & 128) != 0 ? productDetailsState.isUpdatingShoppingList : z10;
        ShoppingListItem shoppingListItem2 = (i12 & 256) != 0 ? productDetailsState.shoppingListEntry : shoppingListItem;
        FavoriteListItem favoriteListItem2 = (i12 & 512) != 0 ? productDetailsState.favoriteListEntry : favoriteListItem;
        CartEntry cartEntry2 = (i12 & 1024) != 0 ? productDetailsState.cartEntry : cartEntry;
        int i14 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? productDetailsState.cartItemCount : i11;
        ProductEligibility.a aVar3 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productDetailsState.cartEligibility : aVar;
        ProductEligibility.a aVar4 = (i12 & 8192) != 0 ? productDetailsState.storeAvailability : aVar2;
        ProductFullDetails productFullDetails3 = productFullDetails2;
        fj.n nVar2 = (i12 & 16384) != 0 ? productDetailsState.fulfillmentMode : nVar;
        boolean z14 = (i12 & 32768) != 0 ? productDetailsState.isFromCLP : z11;
        boolean z15 = (i12 & 65536) != 0 ? productDetailsState.isBuyAgain : z12;
        r rVar3 = (i12 & 131072) != 0 ? productDetailsState.frequentlyBoughtTogetherProductsLoadingStatus : rVar;
        List list4 = (i12 & 262144) != 0 ? productDetailsState.frequentlyBoughtTogetherProducts : list2;
        r rVar4 = (i12 & 524288) != 0 ? productDetailsState.bazaarVoiceProductDisplayStatus : rVar2;
        ProductReviewFullDetails productReviewFullDetails2 = (i12 & 1048576) != 0 ? productDetailsState.bazaarVoiceProductDisplay : productReviewFullDetails;
        C12328b c12328b3 = (i12 & 2097152) != 0 ? productDetailsState.criteoBeaconTracker : c12328b;
        if ((i12 & 4194304) != 0) {
            c12328b2 = c12328b3;
            googleAdData2 = productDetailsState.googleAdData;
        } else {
            googleAdData2 = googleAdData;
            c12328b2 = c12328b3;
        }
        return productDetailsState.c(productFullDetails3, str2, l11, kVar2, productNutritionLabelDecorator2, i13, list3, z13, shoppingListItem2, favoriteListItem2, cartEntry2, i14, aVar3, aVar4, nVar2, z14, z15, rVar3, list4, rVar4, productReviewFullDetails2, c12328b2, googleAdData2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsState)) {
            return false;
        }
        ProductDetailsState productDetailsState = (ProductDetailsState) other;
        return Intrinsics.e(this.product, productDetailsState.product) && Intrinsics.e(this.complexPromoString, productDetailsState.complexPromoString) && Intrinsics.e(this.complexPromoId, productDetailsState.complexPromoId) && Intrinsics.e(this.storeDetails, productDetailsState.storeDetails) && Intrinsics.e(this.nutritionLabel, productDetailsState.nutritionLabel) && this.couponCount == productDetailsState.couponCount && Intrinsics.e(this.coupons, productDetailsState.coupons) && this.isUpdatingShoppingList == productDetailsState.isUpdatingShoppingList && Intrinsics.e(this.shoppingListEntry, productDetailsState.shoppingListEntry) && Intrinsics.e(this.favoriteListEntry, productDetailsState.favoriteListEntry) && Intrinsics.e(this.cartEntry, productDetailsState.cartEntry) && this.cartItemCount == productDetailsState.cartItemCount && Intrinsics.e(this.cartEligibility, productDetailsState.cartEligibility) && Intrinsics.e(this.storeAvailability, productDetailsState.storeAvailability) && Intrinsics.e(this.fulfillmentMode, productDetailsState.fulfillmentMode) && this.isFromCLP == productDetailsState.isFromCLP && this.isBuyAgain == productDetailsState.isBuyAgain && this.frequentlyBoughtTogetherProductsLoadingStatus == productDetailsState.frequentlyBoughtTogetherProductsLoadingStatus && Intrinsics.e(this.frequentlyBoughtTogetherProducts, productDetailsState.frequentlyBoughtTogetherProducts) && this.bazaarVoiceProductDisplayStatus == productDetailsState.bazaarVoiceProductDisplayStatus && Intrinsics.e(this.bazaarVoiceProductDisplay, productDetailsState.bazaarVoiceProductDisplay) && Intrinsics.e(this.criteoBeaconTracker, productDetailsState.criteoBeaconTracker) && Intrinsics.e(this.googleAdData, productDetailsState.googleAdData);
    }

    public int hashCode() {
        int iHashCode = this.product.hashCode() * 31;
        String str = this.complexPromoString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.complexPromoId;
        int iHashCode3 = (((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.storeDetails.hashCode()) * 31;
        ProductNutritionLabelDecorator productNutritionLabelDecorator = this.nutritionLabel;
        int iHashCode4 = (((((((iHashCode3 + (productNutritionLabelDecorator == null ? 0 : productNutritionLabelDecorator.hashCode())) * 31) + Integer.hashCode(this.couponCount)) * 31) + this.coupons.hashCode()) * 31) + Boolean.hashCode(this.isUpdatingShoppingList)) * 31;
        ShoppingListItem shoppingListItem = this.shoppingListEntry;
        int iHashCode5 = (iHashCode4 + (shoppingListItem == null ? 0 : shoppingListItem.hashCode())) * 31;
        FavoriteListItem favoriteListItem = this.favoriteListEntry;
        int iHashCode6 = (((((((((iHashCode5 + (favoriteListItem == null ? 0 : favoriteListItem.hashCode())) * 31) + this.cartEntry.hashCode()) * 31) + Integer.hashCode(this.cartItemCount)) * 31) + this.cartEligibility.hashCode()) * 31) + this.storeAvailability.hashCode()) * 31;
        fj.n nVar = this.fulfillmentMode;
        int iHashCode7 = (((((((iHashCode6 + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.isFromCLP)) * 31) + Boolean.hashCode(this.isBuyAgain)) * 31) + this.frequentlyBoughtTogetherProductsLoadingStatus.hashCode()) * 31;
        List<SuggestedProductCarouselDecorator> list = this.frequentlyBoughtTogetherProducts;
        int iHashCode8 = (((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.bazaarVoiceProductDisplayStatus.hashCode()) * 31;
        ProductReviewFullDetails productReviewFullDetails = this.bazaarVoiceProductDisplay;
        int iHashCode9 = (((iHashCode8 + (productReviewFullDetails == null ? 0 : productReviewFullDetails.hashCode())) * 31) + this.criteoBeaconTracker.hashCode()) * 31;
        GoogleAdData googleAdData = this.googleAdData;
        return iHashCode9 + (googleAdData != null ? googleAdData.hashCode() : 0);
    }

    public String toString() {
        return "ProductDetailsState(product=" + this.product + ", complexPromoString=" + this.complexPromoString + ", complexPromoId=" + this.complexPromoId + ", storeDetails=" + this.storeDetails + ", nutritionLabel=" + this.nutritionLabel + ", couponCount=" + this.couponCount + ", coupons=" + this.coupons + ", isUpdatingShoppingList=" + this.isUpdatingShoppingList + ", shoppingListEntry=" + this.shoppingListEntry + ", favoriteListEntry=" + this.favoriteListEntry + ", cartEntry=" + this.cartEntry + ", cartItemCount=" + this.cartItemCount + ", cartEligibility=" + this.cartEligibility + ", storeAvailability=" + this.storeAvailability + ", fulfillmentMode=" + this.fulfillmentMode + ", isFromCLP=" + this.isFromCLP + ", isBuyAgain=" + this.isBuyAgain + ", frequentlyBoughtTogetherProductsLoadingStatus=" + this.frequentlyBoughtTogetherProductsLoadingStatus + ", frequentlyBoughtTogetherProducts=" + this.frequentlyBoughtTogetherProducts + ", bazaarVoiceProductDisplayStatus=" + this.bazaarVoiceProductDisplayStatus + ", bazaarVoiceProductDisplay=" + this.bazaarVoiceProductDisplay + ", criteoBeaconTracker=" + this.criteoBeaconTracker + ", googleAdData=" + this.googleAdData + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Image it) {
        Intrinsics.j(it, "it");
        return it.h();
    }

    public final String D() {
        String ingredients = this.product.getIngredients();
        return ingredients == null ? "" : ingredients;
    }

    /* renamed from: E, reason: from getter */
    public final ProductLocationDecorator getLocation() {
        return this.location;
    }

    public final double F() {
        if (this.product.getMaxOrderQuantity() != null) {
            return r0.intValue();
        }
        return 2.147483647E9d;
    }

    /* renamed from: G, reason: from getter */
    public final ProductNutritionLabelDecorator getNutritionLabel() {
        return this.nutritionLabel;
    }

    public final AbstractC6392a H() {
        OffsetDateTime priceGoodThrough;
        InterfaceC15960a discount = this.product.getDiscount();
        if (discount == null || (priceGoodThrough = discount.getPriceGoodThrough()) == null) {
            return null;
        }
        return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101022kc, priceGoodThrough.format(C17898a.DATE_SLASHES_SHORT));
    }

    /* renamed from: I, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    public final AbstractC6392a J() {
        return this.priceDecorator.getRegularPrice();
    }

    /* renamed from: K, reason: from getter */
    public final boolean getShowWeightInfo() {
        return this.showWeightInfo;
    }

    /* renamed from: L, reason: from getter */
    public final ProductEligibility.a getStoreAvailability() {
        return this.storeAvailability;
    }

    public final String M() {
        return this.product.getName();
    }

    public final AbstractC6392a N() {
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = C17457C.f164403V;
        Object objK = this.priceDecorator.k();
        if (objK == null) {
            objK = "";
        }
        Object objN = this.priceDecorator.n();
        return companion.d(i10, objK, objN != null ? objN : "");
    }

    public final boolean O() {
        return this.product.getIsBopas();
    }

    /* renamed from: P, reason: from getter */
    public final boolean getIsBuyAgain() {
        return this.isBuyAgain;
    }

    public final boolean Q() {
        ProductEligibility.a aVar = this.cartEligibility;
        qw.a.INSTANCE.a("Eligibility checked: " + aVar, new Object[0]);
        return Intrinsics.e(aVar, ProductEligibility.a.C2660a.f167269a) || Intrinsics.e(this.cartEligibility, ProductEligibility.a.c.f167271a);
    }

    /* renamed from: R, reason: from getter */
    public final boolean getIsFromCLP() {
        return this.isFromCLP;
    }

    public final boolean S() {
        return Intrinsics.e(this.storeAvailability, ProductEligibility.a.C2661b.f167270a);
    }

    public final boolean T() {
        return this.favoriteListEntry != null;
    }

    public final boolean U() {
        return (this.product.getDiscount() == null || this.product.getDiscountedPrice() == null || this.product.getIsMap()) ? false : true;
    }

    public final boolean V() {
        ShoppingListItem shoppingListItem = this.shoppingListEntry;
        return (shoppingListItem == null || shoppingListItem.getIsComplete()) ? false : true;
    }

    public final ProductDetailsState c(ProductFullDetails product, String complexPromoString, Long complexPromoId, Tq.k storeDetails, ProductNutritionLabelDecorator nutritionLabel, int couponCount, List<CouponListItemDecorator> coupons, boolean isUpdatingShoppingList, ShoppingListItem shoppingListEntry, FavoriteListItem favoriteListEntry, CartEntry cartEntry, int cartItemCount, ProductEligibility.a cartEligibility, ProductEligibility.a storeAvailability, fj.n fulfillmentMode, boolean isFromCLP, boolean isBuyAgain, r frequentlyBoughtTogetherProductsLoadingStatus, List<SuggestedProductCarouselDecorator> frequentlyBoughtTogetherProducts, r bazaarVoiceProductDisplayStatus, ProductReviewFullDetails bazaarVoiceProductDisplay, C12328b criteoBeaconTracker, GoogleAdData googleAdData) {
        Intrinsics.j(product, "product");
        Intrinsics.j(storeDetails, "storeDetails");
        Intrinsics.j(coupons, "coupons");
        Intrinsics.j(cartEntry, "cartEntry");
        Intrinsics.j(cartEligibility, "cartEligibility");
        Intrinsics.j(storeAvailability, "storeAvailability");
        Intrinsics.j(frequentlyBoughtTogetherProductsLoadingStatus, "frequentlyBoughtTogetherProductsLoadingStatus");
        Intrinsics.j(bazaarVoiceProductDisplayStatus, "bazaarVoiceProductDisplayStatus");
        Intrinsics.j(criteoBeaconTracker, "criteoBeaconTracker");
        return new ProductDetailsState(product, complexPromoString, complexPromoId, storeDetails, nutritionLabel, couponCount, coupons, isUpdatingShoppingList, shoppingListEntry, favoriteListEntry, cartEntry, cartItemCount, cartEligibility, storeAvailability, fulfillmentMode, isFromCLP, isBuyAgain, frequentlyBoughtTogetherProductsLoadingStatus, frequentlyBoughtTogetherProducts, bazaarVoiceProductDisplayStatus, bazaarVoiceProductDisplay, criteoBeaconTracker, googleAdData);
    }

    public final AbstractC6392a e() {
        return this.priceDecorator.j();
    }

    /* renamed from: f, reason: from getter */
    public final ProductReviewFullDetails getBazaarVoiceProductDisplay() {
        return this.bazaarVoiceProductDisplay;
    }

    /* renamed from: g, reason: from getter */
    public final r getBazaarVoiceProductDisplayStatus() {
        return this.bazaarVoiceProductDisplayStatus;
    }

    /* renamed from: h, reason: from getter */
    public final ProductEligibility.a getCartEligibility() {
        return this.cartEligibility;
    }

    /* renamed from: i, reason: from getter */
    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    /* renamed from: j, reason: from getter */
    public final int getCartItemCount() {
        return this.cartItemCount;
    }

    public final AbstractC6392a k() {
        String str = this.complexPromoString;
        if (str != null) {
            return AbstractC6392a.INSTANCE.c(str);
        }
        return null;
    }

    /* renamed from: l, reason: from getter */
    public final Long getComplexPromoId() {
        return this.complexPromoId;
    }

    /* renamed from: m, reason: from getter */
    public final String getComplexPromoString() {
        return this.complexPromoString;
    }

    /* renamed from: n, reason: from getter */
    public final C12328b getCriteoBeaconTracker() {
        return this.criteoBeaconTracker;
    }

    public final AbstractC6392a o() {
        return this.priceDecorator.i();
    }

    public final String p() {
        String description = this.product.getDescription();
        if (description == null || StringsKt.s0(description)) {
            return null;
        }
        return description;
    }

    public final List<ProductImageViewModel> q() {
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(this.product.j()), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ProductDetailsState.b((Image) obj));
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceB) {
            String strZ0 = ((Image) obj).Z0();
            Object arrayList = linkedHashMap.get(strZ0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strZ0, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList<Pair> arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List listZ0 = CollectionsKt.Z0((List) ((Map.Entry) it.next()).getValue(), new a());
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listZ0) {
                if (((Image) obj2).f() <= 200) {
                    arrayList3.add(obj2);
                } else {
                    arrayList4.add(obj2);
                }
            }
            arrayList2.add(new Pair(arrayList3, arrayList4));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        for (Pair pair : arrayList2) {
            List list = (List) pair.a();
            List list2 = (List) pair.b();
            Image imageJ = (Image) CollectionsKt.F0(list);
            if (imageJ == null) {
                imageJ = ((Image) CollectionsKt.s0(list2)).j(HttpResponseStatus.SUCCESS_OK);
            }
            Image imageJ2 = (Image) CollectionsKt.F0(list2);
            if (imageJ2 == null) {
                imageJ2 = ((Image) CollectionsKt.D0(list)).j(1200);
            }
            arrayList5.add(new ProductImageViewModel(imageJ, imageJ2, false, 4, null));
        }
        return CollectionsKt.j1(CollectionsKt.Z0(arrayList5, new c(new b())));
    }

    public final String r() {
        return StringsKt.Q(this.product.getDisclaimer(), "\\n", "\n", false, 4, null);
    }

    public final List<SuggestedProductCarouselDecorator> s() {
        return this.frequentlyBoughtTogetherProducts;
    }

    /* renamed from: t, reason: from getter */
    public final r getFrequentlyBoughtTogetherProductsLoadingStatus() {
        return this.frequentlyBoughtTogetherProductsLoadingStatus;
    }

    /* renamed from: u, reason: from getter */
    public final GoogleAdData getGoogleAdData() {
        return this.googleAdData;
    }

    public final boolean v() {
        return this.product.getIsAgeRestricted();
    }

    public final boolean w() {
        return this.product.getIsAlcohol();
    }

    public final boolean x() {
        return this.product.getIsChokingHazard();
    }

    public final boolean y() {
        return this.product.getHasMPerksOffers();
    }

    public final boolean z() {
        return this.priceDecorator.r();
    }

    public final boolean A() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        return !StringsKt.s0(r());
    }

    public final boolean C() {
        return !StringsKt.s0(D());
    }

    public /* synthetic */ ProductDetailsState(ProductFullDetails productFullDetails, String str, Long l10, Tq.k kVar, ProductNutritionLabelDecorator productNutritionLabelDecorator, int i10, List list, boolean z10, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, CartEntry cartEntry, int i11, ProductEligibility.a aVar, ProductEligibility.a aVar2, fj.n nVar, boolean z11, boolean z12, r rVar, List list2, r rVar2, ProductReviewFullDetails productReviewFullDetails, C12328b c12328b, GoogleAdData googleAdData, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(productFullDetails, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : l10, (i12 & 8) != 0 ? new SimpleStoreSummary(0, null, null, 0.0d, 14, null) : kVar, (i12 & 16) != 0 ? null : productNutritionLabelDecorator, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? CollectionsKt.m() : list, (i12 & 128) != 0 ? false : z10, (i12 & 256) != 0 ? null : shoppingListItem, (i12 & 512) != 0 ? null : favoriteListItem, (i12 & 1024) != 0 ? new CartEntry(0, 0.0d, new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null), null, 0.0d, 0.0d, 59, null) : cartEntry, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : i11, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? ProductEligibility.a.e.f167273a : aVar, (i12 & 8192) != 0 ? ProductEligibility.a.e.f167273a : aVar2, (i12 & 16384) != 0 ? null : nVar, (i12 & 32768) != 0 ? false : z11, (i12 & 65536) == 0 ? z12 : false, (i12 & 131072) != 0 ? r.f109824d : rVar, (i12 & 262144) != 0 ? null : list2, (i12 & 524288) != 0 ? r.f109824d : rVar2, (i12 & 1048576) != 0 ? null : productReviewFullDetails, (i12 & 2097152) != 0 ? new C12328b(null, null, null, null, null, 31, null) : c12328b, (i12 & 4194304) != 0 ? null : googleAdData);
    }
}

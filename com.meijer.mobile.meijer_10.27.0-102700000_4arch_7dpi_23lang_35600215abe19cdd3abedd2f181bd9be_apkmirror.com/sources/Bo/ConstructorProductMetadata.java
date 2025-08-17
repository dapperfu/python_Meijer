package Bo;

import Ho.ProductSponsorship;
import Ho.SponsoredData;
import com.meijer.mobile.product.model.constructor.SponsoredProductsResponseInner;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.common.ResultData;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010 \n\u0002\b9\b\u0086\b\u0018\u0000 Ê\u00012\u00020\u0001:\u0001)BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\f\b\u0002\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b5\u00104R\u0013\u00107\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0019\u0010:\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`88F¢\u0006\u0006\u001a\u0004\b9\u0010\"R\u0013\u0010<\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0013\u0010>\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010\"R\u0013\u0010@\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u001d\u0010D\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bA\u0010\"*\u0004\bB\u0010CR\u001d\u0010G\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bE\u0010\"*\u0004\bF\u0010CR\u001d\u0010K\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bH\u0010I*\u0004\bJ\u0010CR\u001d\u0010N\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bL\u0010\"*\u0004\bM\u0010CR\u001d\u0010Q\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bO\u0010\"*\u0004\bP\u0010CR\u001d\u0010T\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bR\u0010I*\u0004\bS\u0010CR\u001d\u0010W\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bU\u0010\u000e*\u0004\bV\u0010CR\u001d\u0010Z\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bX\u0010\"*\u0004\bY\u0010CR\u001d\u0010]\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b[\u0010\"*\u0004\b\\\u0010CR\u001d\u0010`\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b^\u0010\"*\u0004\b_\u0010CR\u001d\u0010c\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010\u000e*\u0004\bb\u0010CR\u001d\u0010f\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bd\u0010\u000e*\u0004\be\u0010CR\u001d\u0010i\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bg\u0010\u000e*\u0004\bh\u0010CR\u001d\u0010l\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bj\u0010\"*\u0004\bk\u0010CR\u001d\u0010o\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bm\u0010\u000e*\u0004\bn\u0010CR\u001d\u0010r\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bp\u0010I*\u0004\bq\u0010CR\u001d\u0010u\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bs\u0010I*\u0004\bt\u0010CR\u001d\u0010x\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bv\u0010I*\u0004\bw\u0010CR\u001d\u0010{\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\by\u0010\"*\u0004\bz\u0010CR\u001d\u0010~\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b|\u0010\"*\u0004\b}\u0010CR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\r\u001a\u0004\b\u007f\u0010I*\u0005\b\u0080\u0001\u0010CR \u0010\u0084\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010I*\u0005\b\u0083\u0001\u0010CR \u0010\u0087\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010I*\u0005\b\u0086\u0001\u0010CR \u0010\u008a\u0001\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010\u000e*\u0005\b\u0089\u0001\u0010CR \u0010\u008d\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010I*\u0005\b\u008c\u0001\u0010CR\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000eR \u0010\u0091\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010I*\u0005\b\u0090\u0001\u0010CR(\u0010\u0096\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0092\u00018FX\u0086\u0084\u0002¢\u0006\u000f\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001*\u0005\b\u0095\u0001\u0010CR(\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0092\u00018FX\u0086\u0084\u0002¢\u0006\u000f\u001a\u0006\b\u0097\u0001\u0010\u0094\u0001*\u0005\b\u0098\u0001\u0010CR \u0010\u009c\u0001\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010\u000e*\u0005\b\u009b\u0001\u0010CR \u0010\u009f\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b\u009d\u0001\u0010I*\u0005\b\u009e\u0001\u0010CR \u0010¢\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b \u0001\u0010I*\u0005\b¡\u0001\u0010CR \u0010¥\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b£\u0001\u0010\"*\u0005\b¤\u0001\u0010CR \u0010¨\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010\"*\u0005\b§\u0001\u0010CR \u0010«\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b©\u0001\u0010\"*\u0005\bª\u0001\u0010CR \u0010®\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010\"*\u0005\b\u00ad\u0001\u0010CR \u0010±\u0001\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b¯\u0001\u0010\u000e*\u0005\b°\u0001\u0010CR \u0010´\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b²\u0001\u0010\"*\u0005\b³\u0001\u0010CR \u0010·\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\bµ\u0001\u0010\"*\u0005\b¶\u0001\u0010CR \u0010º\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b¸\u0001\u0010\"*\u0005\b¹\u0001\u0010CR \u0010½\u0001\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b»\u0001\u0010I*\u0005\b¼\u0001\u0010CR \u0010À\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\b¾\u0001\u0010\"*\u0005\b¿\u0001\u0010CR \u0010Ã\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\bÁ\u0001\u0010\"*\u0005\bÂ\u0001\u0010CR \u0010Æ\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\bÄ\u0001\u0010\"*\u0005\bÅ\u0001\u0010CR \u0010É\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u000e\u001a\u0005\bÇ\u0001\u0010\"*\u0005\bÈ\u0001\u0010C¨\u0006Ë\u0001"}, d2 = {"LBo/b;", "", "Lio/constructor/data/model/common/Result;", "result", "Lio/constructor/data/model/common/ResultData;", "resultData", "", "", "rawMap", "map", "<init>", "(Lio/constructor/data/model/common/Result;Lio/constructor/data/model/common/ResultData;Ljava/util/Map;Ljava/util/Map;)V", "", "m", "()Ljava/lang/Double;", "key", "d", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Double;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LHo/c;", "sponsoredData", "LCo/h;", "e0", "(ILHo/c;)LCo/h;", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "inner", "d0", "(Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;)LHo/c;", "LHo/a;", "f0", "(Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;)LHo/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/constructor/data/model/common/Result;", "getResult", "()Lio/constructor/data/model/common/Result;", "b", "Lio/constructor/data/model/common/ResultData;", "getResultData", "()Lio/constructor/data/model/common/ResultData;", "c", "Ljava/util/Map;", "getRawMap", "()Ljava/util/Map;", "getMap", "V", "url", "Lcom/meijer/mobile/core/models/products/ProductCode;", "g", "code", "N", "productName", "l", "description", "x", "imageUrl", "C", "getName$delegate", "(LBo/b;)Ljava/lang/Object;", "name", "U", "getSummary$delegate", "summary", "f", "()Ljava/lang/Boolean;", "getChokingHazard$delegate", "chokingHazard", "M", "getPriceUnit$delegate", "priceUnit", "L", "getPriceText$delegate", "priceText", "S", "getSale$delegate", "sale", "r", "getDiscountValue$delegate", "discountValue", "q", "getDiscountSavingsText$delegate", "discountSavingsText", "n", "getDiscountSalePriceText$delegate", "discountSalePriceText", "o", "getDiscountSalePriceType$delegate", "discountSalePriceType", "p", "getDiscountSalePriceValue$delegate", "discountSalePriceValue", "k", "getDepositValue$delegate", "depositValue", "B", "getMaxOrderQuantity$delegate", "maxOrderQuantity", "K", "getPriceGoodThrough$delegate", "priceGoodThrough", "R", "getQtyIncrement$delegate", "qtyIncrement", "c0", "isPurchasable$delegate", "isPurchasable", "Z", "isBuyable$delegate", "isBuyable", "W", "isAgeRestricted$delegate", "isAgeRestricted", "H", "getPackageSize$delegate", "packageSize", "O", "getProductUnit$delegate", "productUnit", "t", "getEbtFoodstampable$delegate", "ebtFoodstampable", "b0", "isMap$delegate", "isMap", "I", "getPickupAvailableFlag$delegate", "pickupAvailableFlag", "s", "getEan$delegate", "ean", "w", "getHomeDeliveryNotAvailable$delegate", "homeDeliveryNotAvailable", "averagePoundEach", "v", "getHasMPerks$delegate", "hasMPerks", "", "u", "()Ljava/util/List;", "getGroup_ids$delegate", "group_ids", "z", "getMPerksOfferID$delegate", "MPerksOfferID", "J", "getPrice$delegate", "price", "X", "isAlcohol$delegate", "isAlcohol", "Y", "isBopas$delegate", "isBopas", "y", "getIngredients$delegate", "ingredients", "T", "getStockLevelStatus$delegate", "stockLevelStatus", "A", "getManufacturerName$delegate", "manufacturerName", "Q", "getPromoText$delegate", "promoText", "P", "getPromoId$delegate", "promoId", "j", "getCriteoOnViewBeacon$delegate", "criteoOnViewBeacon", "h", "getCriteoOnClickBeacon$delegate", "criteoOnClickBeacon", "i", "getCriteoOnLoadBeacon$delegate", "criteoOnLoadBeacon", "a0", "isCriteoSponsored$delegate", "isCriteoSponsored", "G", "getOnViewBeacon$delegate", "OnViewBeacon", "E", "getOnClickBeacon$delegate", "OnClickBeacon", "F", "getOnLoadBeacon$delegate", "OnLoadBeacon", "D", "getOnBasketChangeBeacon$delegate", "OnBasketChangeBeacon", "e", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Bo.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ConstructorProductMetadata {

    /* renamed from: g, reason: collision with root package name */
    private static final NumberFormat f3212g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Result result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultData resultData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> rawMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> map;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f3211f = {Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "name", "getName()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "summary", "getSummary()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "chokingHazard", "getChokingHazard()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "priceUnit", "getPriceUnit()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "priceText", "getPriceText()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "sale", "getSale()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "discountValue", "getDiscountValue()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "discountSavingsText", "getDiscountSavingsText()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "discountSalePriceText", "getDiscountSalePriceText()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "discountSalePriceType", "getDiscountSalePriceType()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "discountSalePriceValue", "getDiscountSalePriceValue()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "depositValue", "getDepositValue()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "maxOrderQuantity", "getMaxOrderQuantity()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "inStockFlag", "getInStockFlag()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "ilcPrimary", "getIlcPrimary()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "priceGoodThrough", "getPriceGoodThrough()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isAvailable", "isAvailable()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "qtyIncrement", "getQtyIncrement()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isPurchasable", "isPurchasable()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isBuyable", "isBuyable()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isAgeRestricted", "isAgeRestricted()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "packageSize", "getPackageSize()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "productUnit", "getProductUnit()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "deactivated", "getDeactivated()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "ebtFoodstampable", "getEbtFoodstampable()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isMap", "isMap()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "pickupAvailableFlag", "getPickupAvailableFlag()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "ean", "getEan()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "homeDeliveryNotAvailable", "getHomeDeliveryNotAvailable()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "hasMPerks", "getHasMPerks()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "variation_id", "getVariation_id()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "group_ids", "getGroup_ids()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "MPerksOfferID", "getMPerksOfferID()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "originalPrice", "getOriginalPrice()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "price", "getPrice()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isAlcohol", "isAlcohol()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isBopas", "isBopas()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "ingredients", "getIngredients()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "stockLevelStatus", "getStockLevelStatus()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "manufacturerName", "getManufacturerName()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "promoText", "getPromoText()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "promoId", "getPromoId()Ljava/lang/Double;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "criteoOnViewBeacon", "getCriteoOnViewBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "criteoOnClickBeacon", "getCriteoOnClickBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "criteoOnLoadBeacon", "getCriteoOnLoadBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "isCriteoSponsored", "isCriteoSponsored()Ljava/lang/Boolean;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "OnViewBeacon", "getOnViewBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "OnClickBeacon", "getOnClickBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "OnLoadBeacon", "getOnLoadBeacon()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(ConstructorProductMetadata.class, "OnBasketChangeBeacon", "getOnBasketChangeBeacon()Ljava/lang/String;", 0))};

    static {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        Intrinsics.i(currencyInstance, "getCurrencyInstance(...)");
        f3212g = currencyInstance;
    }

    public ConstructorProductMetadata() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(String it) {
        Intrinsics.j(it, "it");
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConstructorProductMetadata)) {
            return false;
        }
        ConstructorProductMetadata constructorProductMetadata = (ConstructorProductMetadata) other;
        return Intrinsics.e(this.result, constructorProductMetadata.result) && Intrinsics.e(this.resultData, constructorProductMetadata.resultData) && Intrinsics.e(this.rawMap, constructorProductMetadata.rawMap) && Intrinsics.e(this.map, constructorProductMetadata.map);
    }

    public ConstructorProductMetadata(Result result, ResultData resultData, Map<String, ? extends Object> rawMap, Map<String, ? extends Object> map) {
        Intrinsics.j(rawMap, "rawMap");
        Intrinsics.j(map, "map");
        this.result = result;
        this.resultData = resultData;
        this.rawMap = rawMap;
        this.map = map;
    }

    static /* synthetic */ Double e(ConstructorProductMetadata constructorProductMetadata, Map map, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "averagePoundEach";
        }
        return constructorProductMetadata.d(map, str);
    }

    public final String A() {
        return (String) MapsKt.a(this.map, f3211f[39].getName());
    }

    public final Double B() {
        return (Double) MapsKt.a(this.map, f3211f[12].getName());
    }

    public final String C() {
        return (String) MapsKt.a(this.map, f3211f[0].getName());
    }

    public final String D() {
        return (String) MapsKt.a(this.map, f3211f[49].getName());
    }

    public final String E() {
        return (String) MapsKt.a(this.map, f3211f[47].getName());
    }

    public final String F() {
        return (String) MapsKt.a(this.map, f3211f[48].getName());
    }

    public final String G() {
        return (String) MapsKt.a(this.map, f3211f[46].getName());
    }

    public final String H() {
        return (String) MapsKt.a(this.map, f3211f[21].getName());
    }

    public final Boolean I() {
        return (Boolean) MapsKt.a(this.map, f3211f[26].getName());
    }

    public final Double J() {
        return (Double) MapsKt.a(this.map, f3211f[34].getName());
    }

    public final String K() {
        return (String) MapsKt.a(this.map, f3211f[15].getName());
    }

    public final String L() {
        return (String) MapsKt.a(this.map, f3211f[4].getName());
    }

    public final String M() {
        return (String) MapsKt.a(this.map, f3211f[3].getName());
    }

    public final String N() {
        String value;
        Result result = this.result;
        return (result == null || (value = result.getValue()) == null) ? C() : value;
    }

    public final String O() {
        return (String) MapsKt.a(this.map, f3211f[22].getName());
    }

    public final Double P() {
        return (Double) MapsKt.a(this.map, f3211f[41].getName());
    }

    public final String Q() {
        return (String) MapsKt.a(this.map, f3211f[40].getName());
    }

    public final Double R() {
        return (Double) MapsKt.a(this.map, f3211f[17].getName());
    }

    public final Boolean S() {
        return (Boolean) MapsKt.a(this.map, f3211f[5].getName());
    }

    public final String T() {
        return (String) MapsKt.a(this.map, f3211f[38].getName());
    }

    public final String U() {
        return (String) MapsKt.a(this.map, f3211f[1].getName());
    }

    public final String V() {
        ResultData resultData = this.resultData;
        if (resultData != null) {
            return resultData.getUrl();
        }
        return null;
    }

    public final Boolean W() {
        return (Boolean) MapsKt.a(this.map, f3211f[20].getName());
    }

    public final Boolean X() {
        return (Boolean) MapsKt.a(this.map, f3211f[35].getName());
    }

    public final Boolean Y() {
        return (Boolean) MapsKt.a(this.map, f3211f[36].getName());
    }

    public final Boolean Z() {
        return (Boolean) MapsKt.a(this.map, f3211f[19].getName());
    }

    public final Boolean a0() {
        return (Boolean) MapsKt.a(this.map, f3211f[45].getName());
    }

    public final Boolean b0() {
        return (Boolean) MapsKt.a(this.map, f3211f[25].getName());
    }

    public final Double c() {
        return e(this, this.map, null, 2, null);
    }

    public final Boolean c0() {
        return (Boolean) MapsKt.a(this.map, f3211f[18].getName());
    }

    public final SponsoredData d0(SponsoredProductsResponseInner inner) {
        Intrinsics.j(inner, "inner");
        String strG = g();
        if (strG == null) {
            strG = "";
        }
        List listQ = CollectionsKt.q(j());
        List listQ2 = CollectionsKt.q(h());
        String strI = i();
        if (strI == null) {
            strI = "";
        }
        String onClickBeacon = inner.getOnClickBeacon();
        String str = onClickBeacon == null ? "" : onClickBeacon;
        String onViewBeacon = inner.getOnViewBeacon();
        String str2 = onViewBeacon == null ? "" : onViewBeacon;
        String onLoadBeacon = inner.getOnLoadBeacon();
        return new SponsoredData(strG, listQ, listQ2, strI, null, str, str2, onLoadBeacon == null ? "" : onLoadBeacon, 16, null);
    }

    public final Boolean f() {
        return (Boolean) MapsKt.a(this.map, f3211f[2].getName());
    }

    public final ProductSponsorship f0(SponsoredProductsResponseInner inner) {
        Intrinsics.j(inner, "inner");
        String strG = g();
        if (strG == null) {
            strG = "";
        }
        Ho.b bVar = Ho.b.f13065c;
        String strG2 = g();
        if (strG2 == null) {
            strG2 = "";
        }
        List listQ = CollectionsKt.q(j());
        List listQ2 = CollectionsKt.q(j());
        String strI = i();
        if (strI == null) {
            strI = "";
        }
        String onClickBeacon = inner.getOnClickBeacon();
        String str = onClickBeacon == null ? "" : onClickBeacon;
        String onViewBeacon = inner.getOnViewBeacon();
        String str2 = onViewBeacon == null ? "" : onViewBeacon;
        String onLoadBeacon = inner.getOnLoadBeacon();
        return new ProductSponsorship(strG, bVar, new SponsoredData(strG2, listQ, listQ2, strI, null, str, str2, onLoadBeacon == null ? "" : onLoadBeacon, 16, null));
    }

    public final String g() {
        ResultData resultData = this.resultData;
        if (resultData != null) {
            return resultData.getId();
        }
        return null;
    }

    public final String h() {
        return (String) MapsKt.a(this.map, f3211f[43].getName());
    }

    public int hashCode() {
        Result result = this.result;
        int iHashCode = (result == null ? 0 : result.hashCode()) * 31;
        ResultData resultData = this.resultData;
        return ((((iHashCode + (resultData != null ? resultData.hashCode() : 0)) * 31) + this.rawMap.hashCode()) * 31) + this.map.hashCode();
    }

    public final String i() {
        return (String) MapsKt.a(this.map, f3211f[44].getName());
    }

    public final String j() {
        return (String) MapsKt.a(this.map, f3211f[42].getName());
    }

    public final Double k() {
        return (Double) MapsKt.a(this.map, f3211f[11].getName());
    }

    public final String l() {
        ResultData resultData = this.resultData;
        if (resultData != null) {
            return resultData.getDescription();
        }
        return null;
    }

    public final String n() {
        return (String) MapsKt.a(this.map, f3211f[8].getName());
    }

    public final String o() {
        return (String) MapsKt.a(this.map, f3211f[9].getName());
    }

    public final Double p() {
        return (Double) MapsKt.a(this.map, f3211f[10].getName());
    }

    public final String q() {
        return (String) MapsKt.a(this.map, f3211f[7].getName());
    }

    public final Double r() {
        return (Double) MapsKt.a(this.map, f3211f[6].getName());
    }

    public final Double s() {
        return (Double) MapsKt.a(this.map, f3211f[27].getName());
    }

    public final Boolean t() {
        return (Boolean) MapsKt.a(this.map, f3211f[24].getName());
    }

    public String toString() {
        return "ConstructorProductMetadata(result=" + this.result + ", resultData=" + this.resultData + ", rawMap=" + this.rawMap + ", map=" + this.map + ')';
    }

    public final List<String> u() {
        return (List) MapsKt.a(this.map, f3211f[31].getName());
    }

    public final Boolean v() {
        return (Boolean) MapsKt.a(this.map, f3211f[29].getName());
    }

    public final Boolean w() {
        return (Boolean) MapsKt.a(this.map, f3211f[28].getName());
    }

    public final String x() {
        ResultData resultData = this.resultData;
        if (resultData != null) {
            return resultData.getImageUrl();
        }
        return null;
    }

    public final String y() {
        return (String) MapsKt.a(this.map, f3211f[37].getName());
    }

    public final List<String> z() {
        return (List) MapsKt.a(this.map, f3211f[32].getName());
    }

    private final Double d(Map<String, ? extends Object> map, String key) {
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException e10) {
                uw.a.INSTANCE.f(e10, "Could not parse " + ((String) obj), new Object[0]);
                return null;
            }
        }
        uw.a.INSTANCE.d("Unexpected type " + obj.getClass().getName() + " for " + obj, new Object[0]);
        return null;
    }

    private final Double m() {
        if (p() != null && c() != null) {
            Double dP = p();
            Intrinsics.g(dP);
            double dDoubleValue = dP.doubleValue();
            Double dC = c();
            Intrinsics.g(dC);
            return Double.valueOf(dDoubleValue / dC.doubleValue());
        }
        return p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0415 A[PHI: r5
      0x0415: PHI (r5v12 java.lang.String) = (r5v11 java.lang.String), (r5v47 java.lang.String) binds: [B:247:0x0406, B:251:0x0410] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046e A[PHI: r5
      0x046e: PHI (r5v22 java.lang.String) = (r5v21 java.lang.String), (r5v36 java.lang.String) binds: [B:269:0x045f, B:273:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Co.ProductFullDetails e0(int r73, Ho.SponsoredData r74) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bo.ConstructorProductMetadata.e0(int, Ho.c):Co.h");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConstructorProductMetadata(Result result, ResultData resultData, Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        result = (i10 & 1) != 0 ? null : result;
        resultData = (i10 & 2) != 0 ? result != null ? result.getData() : null : resultData;
        if ((i10 & 4) != 0) {
            Map<String, Object> metadata = resultData != null ? resultData.getMetadata() : null;
            map = metadata == null ? MapsKt.k() : metadata;
        }
        this(result, resultData, map, (i10 & 8) != 0 ? MapsKt.b(map, new Function1() { // from class: Bo.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConstructorProductMetadata.b((String) obj);
            }
        }) : map2);
    }
}

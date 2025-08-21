package com.meijer.mobile.instoreshopping.service.productimages.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001:\u0002WXBï\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!¢\u0006\u0004\b&\u0010'Jø\u0002\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0010\b\u0003\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b1\u00106R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b4\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b;\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b<\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b=\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b>\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b?\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b3\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bL\u0010:R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bM\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bN\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00102\u001a\u0004\bO\u0010+R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bP\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\bQ\u0010+R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bR\u0010+R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00102\u001a\u0004\bS\u0010+R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u00102\u001a\u0004\bT\u0010+R\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bS\u0010U\u001a\u0004\b7\u0010VR\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b@\u0010V¨\u0006Y"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse;", "", "", "itemSku", "", "activeInventoryItemIndicator", "casePackItemIndicator", "", "documentEventTypeId", PreferencesHelper.PREF_ID, "initialRetailPrice", "itemCodeCheckDigitId", "itemConversionQuantity", "itemDescription", "itemImageActiveDate", "itemImageApprovalDate", "itemImageDefaultIdentifier", "itemImageExpirationDate", "itemPointOfSaleDiscountAmount", "itemPointOfSaleDiscountPercent", "itemPrimaryIndicator", "itemUnitOfMeasureSizeCategory", "", "itemUnitOfMeasureSizeQuantity", "legacyPrimaryKeyId", "legacyProductCategoryId", "mProductId", "productFeatureValue", "productItemIndicator", "rowUpdatedTimeStamp", "unitOfMeasureCompareCategory", "unitOfMeasureName", "upcTypeName", "", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$CustomerFacingAttributes;", "customerFacingAttributes", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$ItemDocument;", "itemDocuments", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "r", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "s", "Ljava/lang/Double;", "t", "()Ljava/lang/Double;", "u", "v", "w", "x", "y", "z", "A", "B", "C", "Ljava/util/List;", "()Ljava/util/List;", "CustomerFacingAttributes", "ItemDocument", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EDaAItemDetailsResponse {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upcTypeName;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CustomerFacingAttributes> customerFacingAttributes;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ItemDocument> itemDocuments;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemSku;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean activeInventoryItemIndicator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String casePackItemIndicator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer documentEventTypeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initialRetailPrice;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemCodeCheckDigitId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer itemConversionQuantity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemDescription;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemImageActiveDate;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemImageApprovalDate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemImageDefaultIdentifier;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemImageExpirationDate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPointOfSaleDiscountAmount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPointOfSaleDiscountPercent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemPrimaryIndicator;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemUnitOfMeasureSizeCategory;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double itemUnitOfMeasureSizeQuantity;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer legacyPrimaryKeyId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer legacyProductCategoryId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer mProductId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productFeatureValue;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productItemIndicator;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rowUpdatedTimeStamp;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasureCompareCategory;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasureName;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015JÐ\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b,\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b \u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b/\u0010\u0019¨\u00063"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$CustomerFacingAttributes;", "", "", PreferencesHelper.PREF_ID, "", "mProductGroupId", "productHierarchyLevelId", "sequenceId", "standardValueSequenceId", "valueDescription", "updateProtectedIndicator", "logicalDeleteIndicator", "displayLocationCategory", "displaySequenceId", "helpDescription", "requiredIndicator", "name", "secureLevelCategory", "displayTypeCategory", "multipleValueIndicator", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$CustomerFacingAttributes;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "g", "c", "j", "d", "m", "n", "f", "p", "o", "h", "i", "k", "l", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomerFacingAttributes {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mProductGroupId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer productHierarchyLevelId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer sequenceId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer standardValueSequenceId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String valueDescription;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String updateProtectedIndicator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String logicalDeleteIndicator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayLocationCategory;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer displaySequenceId;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String helpDescription;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requiredIndicator;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secureLevelCategory;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayTypeCategory;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String multipleValueIndicator;

        public final CustomerFacingAttributes copy(@g(name = "CustomerFacingProductAttributeId") Integer id2, @g(name = "mProductGroupId") String mProductGroupId, @g(name = "ProductHierarchyLevelId") Integer productHierarchyLevelId, @g(name = "CustomerFacingProductAttributeSequenceId") Integer sequenceId, @g(name = "CustomerFacingProductAttributeStandardValueSequenceId") Integer standardValueSequenceId, @g(name = "CustomerFacingProductAttributeValueDescription") String valueDescription, @g(name = "CustomerFacingProductAttributeUpdateProtectedIndicator") String updateProtectedIndicator, @g(name = "CustomerFacingProductAttributeLogicalDeleteIndicator") String logicalDeleteIndicator, @g(name = "CustomerFacingProductAttributeDisplayLocationCategory") String displayLocationCategory, @g(name = "CustomerFacingProductAttributeDisplaySequenceId") Integer displaySequenceId, @g(name = "CustomerFacingProductAttributeHelpDescription") String helpDescription, @g(name = "CustomerFacingProductAttributeRequiredIndicator") String requiredIndicator, @g(name = "CustomerFacingProductAttributeName") String name, @g(name = "CustomerFacingProductAttributeSecureLevelCategory") String secureLevelCategory, @g(name = "CustomerFacingProductAttributeDisplayTypeCategory") String displayTypeCategory, @g(name = "CustomerFacingProductAttributeMultipleValueIndicator") String multipleValueIndicator) {
            return new CustomerFacingAttributes(id2, mProductGroupId, productHierarchyLevelId, sequenceId, standardValueSequenceId, valueDescription, updateProtectedIndicator, logicalDeleteIndicator, displayLocationCategory, displaySequenceId, helpDescription, requiredIndicator, name, secureLevelCategory, displayTypeCategory, multipleValueIndicator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerFacingAttributes)) {
                return false;
            }
            CustomerFacingAttributes customerFacingAttributes = (CustomerFacingAttributes) other;
            return Intrinsics.e(this.id, customerFacingAttributes.id) && Intrinsics.e(this.mProductGroupId, customerFacingAttributes.mProductGroupId) && Intrinsics.e(this.productHierarchyLevelId, customerFacingAttributes.productHierarchyLevelId) && Intrinsics.e(this.sequenceId, customerFacingAttributes.sequenceId) && Intrinsics.e(this.standardValueSequenceId, customerFacingAttributes.standardValueSequenceId) && Intrinsics.e(this.valueDescription, customerFacingAttributes.valueDescription) && Intrinsics.e(this.updateProtectedIndicator, customerFacingAttributes.updateProtectedIndicator) && Intrinsics.e(this.logicalDeleteIndicator, customerFacingAttributes.logicalDeleteIndicator) && Intrinsics.e(this.displayLocationCategory, customerFacingAttributes.displayLocationCategory) && Intrinsics.e(this.displaySequenceId, customerFacingAttributes.displaySequenceId) && Intrinsics.e(this.helpDescription, customerFacingAttributes.helpDescription) && Intrinsics.e(this.requiredIndicator, customerFacingAttributes.requiredIndicator) && Intrinsics.e(this.name, customerFacingAttributes.name) && Intrinsics.e(this.secureLevelCategory, customerFacingAttributes.secureLevelCategory) && Intrinsics.e(this.displayTypeCategory, customerFacingAttributes.displayTypeCategory) && Intrinsics.e(this.multipleValueIndicator, customerFacingAttributes.multipleValueIndicator);
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.mProductGroupId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.productHierarchyLevelId;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.sequenceId;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.standardValueSequenceId;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str2 = this.valueDescription;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.updateProtectedIndicator;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logicalDeleteIndicator;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.displayLocationCategory;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num5 = this.displaySequenceId;
            int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str6 = this.helpDescription;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.requiredIndicator;
            int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.name;
            int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.secureLevelCategory;
            int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.displayTypeCategory;
            int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.multipleValueIndicator;
            return iHashCode15 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "CustomerFacingAttributes(id=" + this.id + ", mProductGroupId=" + this.mProductGroupId + ", productHierarchyLevelId=" + this.productHierarchyLevelId + ", sequenceId=" + this.sequenceId + ", standardValueSequenceId=" + this.standardValueSequenceId + ", valueDescription=" + this.valueDescription + ", updateProtectedIndicator=" + this.updateProtectedIndicator + ", logicalDeleteIndicator=" + this.logicalDeleteIndicator + ", displayLocationCategory=" + this.displayLocationCategory + ", displaySequenceId=" + this.displaySequenceId + ", helpDescription=" + this.helpDescription + ", requiredIndicator=" + this.requiredIndicator + ", name=" + this.name + ", secureLevelCategory=" + this.secureLevelCategory + ", displayTypeCategory=" + this.displayTypeCategory + ", multipleValueIndicator=" + this.multipleValueIndicator + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getDisplayLocationCategory() {
            return this.displayLocationCategory;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getDisplaySequenceId() {
            return this.displaySequenceId;
        }

        /* renamed from: c, reason: from getter */
        public final String getDisplayTypeCategory() {
            return this.displayTypeCategory;
        }

        /* renamed from: d, reason: from getter */
        public final String getHelpDescription() {
            return this.helpDescription;
        }

        /* renamed from: e, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: f, reason: from getter */
        public final String getLogicalDeleteIndicator() {
            return this.logicalDeleteIndicator;
        }

        /* renamed from: g, reason: from getter */
        public final String getMProductGroupId() {
            return this.mProductGroupId;
        }

        /* renamed from: h, reason: from getter */
        public final String getMultipleValueIndicator() {
            return this.multipleValueIndicator;
        }

        /* renamed from: i, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: j, reason: from getter */
        public final Integer getProductHierarchyLevelId() {
            return this.productHierarchyLevelId;
        }

        /* renamed from: k, reason: from getter */
        public final String getRequiredIndicator() {
            return this.requiredIndicator;
        }

        /* renamed from: l, reason: from getter */
        public final String getSecureLevelCategory() {
            return this.secureLevelCategory;
        }

        /* renamed from: m, reason: from getter */
        public final Integer getSequenceId() {
            return this.sequenceId;
        }

        /* renamed from: n, reason: from getter */
        public final Integer getStandardValueSequenceId() {
            return this.standardValueSequenceId;
        }

        /* renamed from: o, reason: from getter */
        public final String getUpdateProtectedIndicator() {
            return this.updateProtectedIndicator;
        }

        /* renamed from: p, reason: from getter */
        public final String getValueDescription() {
            return this.valueDescription;
        }

        public CustomerFacingAttributes(@g(name = "CustomerFacingProductAttributeId") Integer num, @g(name = "mProductGroupId") String str, @g(name = "ProductHierarchyLevelId") Integer num2, @g(name = "CustomerFacingProductAttributeSequenceId") Integer num3, @g(name = "CustomerFacingProductAttributeStandardValueSequenceId") Integer num4, @g(name = "CustomerFacingProductAttributeValueDescription") String str2, @g(name = "CustomerFacingProductAttributeUpdateProtectedIndicator") String str3, @g(name = "CustomerFacingProductAttributeLogicalDeleteIndicator") String str4, @g(name = "CustomerFacingProductAttributeDisplayLocationCategory") String str5, @g(name = "CustomerFacingProductAttributeDisplaySequenceId") Integer num5, @g(name = "CustomerFacingProductAttributeHelpDescription") String str6, @g(name = "CustomerFacingProductAttributeRequiredIndicator") String str7, @g(name = "CustomerFacingProductAttributeName") String str8, @g(name = "CustomerFacingProductAttributeSecureLevelCategory") String str9, @g(name = "CustomerFacingProductAttributeDisplayTypeCategory") String str10, @g(name = "CustomerFacingProductAttributeMultipleValueIndicator") String str11) {
            this.id = num;
            this.mProductGroupId = str;
            this.productHierarchyLevelId = num2;
            this.sequenceId = num3;
            this.standardValueSequenceId = num4;
            this.valueDescription = str2;
            this.updateProtectedIndicator = str3;
            this.logicalDeleteIndicator = str4;
            this.displayLocationCategory = str5;
            this.displaySequenceId = num5;
            this.helpDescription = str6;
            this.requiredIndicator = str7;
            this.name = str8;
            this.secureLevelCategory = str9;
            this.displayTypeCategory = str10;
            this.multipleValueIndicator = str11;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$ItemDocument;", "", "", "itemDocumentTypeId", "", "itemDocumentNote", "itemDocumentValue", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse$ItemDocument;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ItemDocument {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer itemDocumentTypeId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String itemDocumentNote;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String itemDocumentValue;

        public final ItemDocument copy(@g(name = "ItemDocumentTypeId") Integer itemDocumentTypeId, @g(name = "ItemDocumentNote") String itemDocumentNote, @g(name = "ItemDocumentValue") String itemDocumentValue) {
            return new ItemDocument(itemDocumentTypeId, itemDocumentNote, itemDocumentValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDocument)) {
                return false;
            }
            ItemDocument itemDocument = (ItemDocument) other;
            return Intrinsics.e(this.itemDocumentTypeId, itemDocument.itemDocumentTypeId) && Intrinsics.e(this.itemDocumentNote, itemDocument.itemDocumentNote) && Intrinsics.e(this.itemDocumentValue, itemDocument.itemDocumentValue);
        }

        public int hashCode() {
            Integer num = this.itemDocumentTypeId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.itemDocumentNote;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.itemDocumentValue;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ItemDocument(itemDocumentTypeId=" + this.itemDocumentTypeId + ", itemDocumentNote=" + this.itemDocumentNote + ", itemDocumentValue=" + this.itemDocumentValue + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getItemDocumentNote() {
            return this.itemDocumentNote;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getItemDocumentTypeId() {
            return this.itemDocumentTypeId;
        }

        /* renamed from: c, reason: from getter */
        public final String getItemDocumentValue() {
            return this.itemDocumentValue;
        }

        public ItemDocument(@g(name = "ItemDocumentTypeId") Integer num, @g(name = "ItemDocumentNote") String str, @g(name = "ItemDocumentValue") String str2) {
            this.itemDocumentTypeId = num;
            this.itemDocumentNote = str;
            this.itemDocumentValue = str2;
        }
    }

    public EDaAItemDetailsResponse(@g(name = "ItemSku") String str, @g(name = "ActiveInventoryItemIndicator") Boolean bool, @g(name = "CasePackItemIndicator") String str2, @g(name = "DocumentEventTypeId") Integer num, @g(name = PreferencesHelper.PREF_ID) String str3, @g(name = "InitialRetailPrice") String str4, @g(name = "ItemCodeCheckDigitId") Integer num2, @g(name = "ItemConversionQuantity") Integer num3, @g(name = "ItemDescription") String str5, @g(name = "ItemImageActiveDate") String str6, @g(name = "ItemImageApprovalDate") String str7, @g(name = "ItemImageDefaultIdentifier") String str8, @g(name = "ItemImageExpirationDate") String str9, @g(name = "ItemPointOfSaleDiscountAmount") String str10, @g(name = "ItemPointOfSaleDiscountPercent") String str11, @g(name = "ItemPrimaryIndicator") String str12, @g(name = "ItemUnitOfMeasureSizeCategory") String str13, @g(name = "ItemUnitOfMeasureSizeQuantity") Double d10, @g(name = "LegacyPrimaryKeyId") Integer num4, @g(name = "LegacyProductCategoryId") Integer num5, @g(name = "mProductId") Integer num6, @g(name = "ProductFeatureValue") String str14, @g(name = "ProductItemIndicator") String str15, @g(name = "RowUpdatedTimeStamp") String str16, @g(name = "UnitOfMeasureCompareCategory") String str17, @g(name = "UnitOfMeasureName") String str18, @g(name = "UPCTypeName") String str19, @g(name = "CustomerFacingAttributes") List<CustomerFacingAttributes> list, @g(name = "ItemDocuments") List<ItemDocument> list2) {
        this.itemSku = str;
        this.activeInventoryItemIndicator = bool;
        this.casePackItemIndicator = str2;
        this.documentEventTypeId = num;
        this.id = str3;
        this.initialRetailPrice = str4;
        this.itemCodeCheckDigitId = num2;
        this.itemConversionQuantity = num3;
        this.itemDescription = str5;
        this.itemImageActiveDate = str6;
        this.itemImageApprovalDate = str7;
        this.itemImageDefaultIdentifier = str8;
        this.itemImageExpirationDate = str9;
        this.itemPointOfSaleDiscountAmount = str10;
        this.itemPointOfSaleDiscountPercent = str11;
        this.itemPrimaryIndicator = str12;
        this.itemUnitOfMeasureSizeCategory = str13;
        this.itemUnitOfMeasureSizeQuantity = d10;
        this.legacyPrimaryKeyId = num4;
        this.legacyProductCategoryId = num5;
        this.mProductId = num6;
        this.productFeatureValue = str14;
        this.productItemIndicator = str15;
        this.rowUpdatedTimeStamp = str16;
        this.unitOfMeasureCompareCategory = str17;
        this.unitOfMeasureName = str18;
        this.upcTypeName = str19;
        this.customerFacingAttributes = list;
        this.itemDocuments = list2;
    }

    public final EDaAItemDetailsResponse copy(@g(name = "ItemSku") String itemSku, @g(name = "ActiveInventoryItemIndicator") Boolean activeInventoryItemIndicator, @g(name = "CasePackItemIndicator") String casePackItemIndicator, @g(name = "DocumentEventTypeId") Integer documentEventTypeId, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "InitialRetailPrice") String initialRetailPrice, @g(name = "ItemCodeCheckDigitId") Integer itemCodeCheckDigitId, @g(name = "ItemConversionQuantity") Integer itemConversionQuantity, @g(name = "ItemDescription") String itemDescription, @g(name = "ItemImageActiveDate") String itemImageActiveDate, @g(name = "ItemImageApprovalDate") String itemImageApprovalDate, @g(name = "ItemImageDefaultIdentifier") String itemImageDefaultIdentifier, @g(name = "ItemImageExpirationDate") String itemImageExpirationDate, @g(name = "ItemPointOfSaleDiscountAmount") String itemPointOfSaleDiscountAmount, @g(name = "ItemPointOfSaleDiscountPercent") String itemPointOfSaleDiscountPercent, @g(name = "ItemPrimaryIndicator") String itemPrimaryIndicator, @g(name = "ItemUnitOfMeasureSizeCategory") String itemUnitOfMeasureSizeCategory, @g(name = "ItemUnitOfMeasureSizeQuantity") Double itemUnitOfMeasureSizeQuantity, @g(name = "LegacyPrimaryKeyId") Integer legacyPrimaryKeyId, @g(name = "LegacyProductCategoryId") Integer legacyProductCategoryId, @g(name = "mProductId") Integer mProductId, @g(name = "ProductFeatureValue") String productFeatureValue, @g(name = "ProductItemIndicator") String productItemIndicator, @g(name = "RowUpdatedTimeStamp") String rowUpdatedTimeStamp, @g(name = "UnitOfMeasureCompareCategory") String unitOfMeasureCompareCategory, @g(name = "UnitOfMeasureName") String unitOfMeasureName, @g(name = "UPCTypeName") String upcTypeName, @g(name = "CustomerFacingAttributes") List<CustomerFacingAttributes> customerFacingAttributes, @g(name = "ItemDocuments") List<ItemDocument> itemDocuments) {
        return new EDaAItemDetailsResponse(itemSku, activeInventoryItemIndicator, casePackItemIndicator, documentEventTypeId, id2, initialRetailPrice, itemCodeCheckDigitId, itemConversionQuantity, itemDescription, itemImageActiveDate, itemImageApprovalDate, itemImageDefaultIdentifier, itemImageExpirationDate, itemPointOfSaleDiscountAmount, itemPointOfSaleDiscountPercent, itemPrimaryIndicator, itemUnitOfMeasureSizeCategory, itemUnitOfMeasureSizeQuantity, legacyPrimaryKeyId, legacyProductCategoryId, mProductId, productFeatureValue, productItemIndicator, rowUpdatedTimeStamp, unitOfMeasureCompareCategory, unitOfMeasureName, upcTypeName, customerFacingAttributes, itemDocuments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EDaAItemDetailsResponse)) {
            return false;
        }
        EDaAItemDetailsResponse eDaAItemDetailsResponse = (EDaAItemDetailsResponse) other;
        return Intrinsics.e(this.itemSku, eDaAItemDetailsResponse.itemSku) && Intrinsics.e(this.activeInventoryItemIndicator, eDaAItemDetailsResponse.activeInventoryItemIndicator) && Intrinsics.e(this.casePackItemIndicator, eDaAItemDetailsResponse.casePackItemIndicator) && Intrinsics.e(this.documentEventTypeId, eDaAItemDetailsResponse.documentEventTypeId) && Intrinsics.e(this.id, eDaAItemDetailsResponse.id) && Intrinsics.e(this.initialRetailPrice, eDaAItemDetailsResponse.initialRetailPrice) && Intrinsics.e(this.itemCodeCheckDigitId, eDaAItemDetailsResponse.itemCodeCheckDigitId) && Intrinsics.e(this.itemConversionQuantity, eDaAItemDetailsResponse.itemConversionQuantity) && Intrinsics.e(this.itemDescription, eDaAItemDetailsResponse.itemDescription) && Intrinsics.e(this.itemImageActiveDate, eDaAItemDetailsResponse.itemImageActiveDate) && Intrinsics.e(this.itemImageApprovalDate, eDaAItemDetailsResponse.itemImageApprovalDate) && Intrinsics.e(this.itemImageDefaultIdentifier, eDaAItemDetailsResponse.itemImageDefaultIdentifier) && Intrinsics.e(this.itemImageExpirationDate, eDaAItemDetailsResponse.itemImageExpirationDate) && Intrinsics.e(this.itemPointOfSaleDiscountAmount, eDaAItemDetailsResponse.itemPointOfSaleDiscountAmount) && Intrinsics.e(this.itemPointOfSaleDiscountPercent, eDaAItemDetailsResponse.itemPointOfSaleDiscountPercent) && Intrinsics.e(this.itemPrimaryIndicator, eDaAItemDetailsResponse.itemPrimaryIndicator) && Intrinsics.e(this.itemUnitOfMeasureSizeCategory, eDaAItemDetailsResponse.itemUnitOfMeasureSizeCategory) && Intrinsics.e(this.itemUnitOfMeasureSizeQuantity, eDaAItemDetailsResponse.itemUnitOfMeasureSizeQuantity) && Intrinsics.e(this.legacyPrimaryKeyId, eDaAItemDetailsResponse.legacyPrimaryKeyId) && Intrinsics.e(this.legacyProductCategoryId, eDaAItemDetailsResponse.legacyProductCategoryId) && Intrinsics.e(this.mProductId, eDaAItemDetailsResponse.mProductId) && Intrinsics.e(this.productFeatureValue, eDaAItemDetailsResponse.productFeatureValue) && Intrinsics.e(this.productItemIndicator, eDaAItemDetailsResponse.productItemIndicator) && Intrinsics.e(this.rowUpdatedTimeStamp, eDaAItemDetailsResponse.rowUpdatedTimeStamp) && Intrinsics.e(this.unitOfMeasureCompareCategory, eDaAItemDetailsResponse.unitOfMeasureCompareCategory) && Intrinsics.e(this.unitOfMeasureName, eDaAItemDetailsResponse.unitOfMeasureName) && Intrinsics.e(this.upcTypeName, eDaAItemDetailsResponse.upcTypeName) && Intrinsics.e(this.customerFacingAttributes, eDaAItemDetailsResponse.customerFacingAttributes) && Intrinsics.e(this.itemDocuments, eDaAItemDetailsResponse.itemDocuments);
    }

    public int hashCode() {
        String str = this.itemSku;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.activeInventoryItemIndicator;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.casePackItemIndicator;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.documentEventTypeId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.initialRetailPrice;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.itemCodeCheckDigitId;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemConversionQuantity;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.itemDescription;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.itemImageActiveDate;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.itemImageApprovalDate;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.itemImageDefaultIdentifier;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.itemImageExpirationDate;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.itemPointOfSaleDiscountAmount;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.itemPointOfSaleDiscountPercent;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.itemPrimaryIndicator;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.itemUnitOfMeasureSizeCategory;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d10 = this.itemUnitOfMeasureSizeQuantity;
        int iHashCode18 = (iHashCode17 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num4 = this.legacyPrimaryKeyId;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.legacyProductCategoryId;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.mProductId;
        int iHashCode21 = (iHashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str14 = this.productFeatureValue;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.productItemIndicator;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rowUpdatedTimeStamp;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.unitOfMeasureCompareCategory;
        int iHashCode25 = (iHashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.unitOfMeasureName;
        int iHashCode26 = (iHashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.upcTypeName;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<CustomerFacingAttributes> list = this.customerFacingAttributes;
        int iHashCode28 = (iHashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        List<ItemDocument> list2 = this.itemDocuments;
        return iHashCode28 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "EDaAItemDetailsResponse(itemSku=" + this.itemSku + ", activeInventoryItemIndicator=" + this.activeInventoryItemIndicator + ", casePackItemIndicator=" + this.casePackItemIndicator + ", documentEventTypeId=" + this.documentEventTypeId + ", id=" + this.id + ", initialRetailPrice=" + this.initialRetailPrice + ", itemCodeCheckDigitId=" + this.itemCodeCheckDigitId + ", itemConversionQuantity=" + this.itemConversionQuantity + ", itemDescription=" + this.itemDescription + ", itemImageActiveDate=" + this.itemImageActiveDate + ", itemImageApprovalDate=" + this.itemImageApprovalDate + ", itemImageDefaultIdentifier=" + this.itemImageDefaultIdentifier + ", itemImageExpirationDate=" + this.itemImageExpirationDate + ", itemPointOfSaleDiscountAmount=" + this.itemPointOfSaleDiscountAmount + ", itemPointOfSaleDiscountPercent=" + this.itemPointOfSaleDiscountPercent + ", itemPrimaryIndicator=" + this.itemPrimaryIndicator + ", itemUnitOfMeasureSizeCategory=" + this.itemUnitOfMeasureSizeCategory + ", itemUnitOfMeasureSizeQuantity=" + this.itemUnitOfMeasureSizeQuantity + ", legacyPrimaryKeyId=" + this.legacyPrimaryKeyId + ", legacyProductCategoryId=" + this.legacyProductCategoryId + ", mProductId=" + this.mProductId + ", productFeatureValue=" + this.productFeatureValue + ", productItemIndicator=" + this.productItemIndicator + ", rowUpdatedTimeStamp=" + this.rowUpdatedTimeStamp + ", unitOfMeasureCompareCategory=" + this.unitOfMeasureCompareCategory + ", unitOfMeasureName=" + this.unitOfMeasureName + ", upcTypeName=" + this.upcTypeName + ", customerFacingAttributes=" + this.customerFacingAttributes + ", itemDocuments=" + this.itemDocuments + ')';
    }

    /* renamed from: A, reason: from getter */
    public final String getUnitOfMeasureCompareCategory() {
        return this.unitOfMeasureCompareCategory;
    }

    /* renamed from: B, reason: from getter */
    public final String getUnitOfMeasureName() {
        return this.unitOfMeasureName;
    }

    /* renamed from: C, reason: from getter */
    public final String getUpcTypeName() {
        return this.upcTypeName;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getActiveInventoryItemIndicator() {
        return this.activeInventoryItemIndicator;
    }

    /* renamed from: b, reason: from getter */
    public final String getCasePackItemIndicator() {
        return this.casePackItemIndicator;
    }

    public final List<CustomerFacingAttributes> c() {
        return this.customerFacingAttributes;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getDocumentEventTypeId() {
        return this.documentEventTypeId;
    }

    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: f, reason: from getter */
    public final String getInitialRetailPrice() {
        return this.initialRetailPrice;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getItemCodeCheckDigitId() {
        return this.itemCodeCheckDigitId;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getItemConversionQuantity() {
        return this.itemConversionQuantity;
    }

    /* renamed from: i, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    public final List<ItemDocument> j() {
        return this.itemDocuments;
    }

    /* renamed from: k, reason: from getter */
    public final String getItemImageActiveDate() {
        return this.itemImageActiveDate;
    }

    /* renamed from: l, reason: from getter */
    public final String getItemImageApprovalDate() {
        return this.itemImageApprovalDate;
    }

    /* renamed from: m, reason: from getter */
    public final String getItemImageDefaultIdentifier() {
        return this.itemImageDefaultIdentifier;
    }

    /* renamed from: n, reason: from getter */
    public final String getItemImageExpirationDate() {
        return this.itemImageExpirationDate;
    }

    /* renamed from: o, reason: from getter */
    public final String getItemPointOfSaleDiscountAmount() {
        return this.itemPointOfSaleDiscountAmount;
    }

    /* renamed from: p, reason: from getter */
    public final String getItemPointOfSaleDiscountPercent() {
        return this.itemPointOfSaleDiscountPercent;
    }

    /* renamed from: q, reason: from getter */
    public final String getItemPrimaryIndicator() {
        return this.itemPrimaryIndicator;
    }

    /* renamed from: r, reason: from getter */
    public final String getItemSku() {
        return this.itemSku;
    }

    /* renamed from: s, reason: from getter */
    public final String getItemUnitOfMeasureSizeCategory() {
        return this.itemUnitOfMeasureSizeCategory;
    }

    /* renamed from: t, reason: from getter */
    public final Double getItemUnitOfMeasureSizeQuantity() {
        return this.itemUnitOfMeasureSizeQuantity;
    }

    /* renamed from: u, reason: from getter */
    public final Integer getLegacyPrimaryKeyId() {
        return this.legacyPrimaryKeyId;
    }

    /* renamed from: v, reason: from getter */
    public final Integer getLegacyProductCategoryId() {
        return this.legacyProductCategoryId;
    }

    /* renamed from: w, reason: from getter */
    public final Integer getMProductId() {
        return this.mProductId;
    }

    /* renamed from: x, reason: from getter */
    public final String getProductFeatureValue() {
        return this.productFeatureValue;
    }

    /* renamed from: y, reason: from getter */
    public final String getProductItemIndicator() {
        return this.productItemIndicator;
    }

    /* renamed from: z, reason: from getter */
    public final String getRowUpdatedTimeStamp() {
        return this.rowUpdatedTimeStamp;
    }
}

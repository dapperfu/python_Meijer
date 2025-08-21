package Ql;

import Pk.Coupon;
import Pl.CartTotals;
import Pl.Header;
import Pl.Transaction;
import com.meijer.mobile.greenville.model.domain.CartItem;
import com.meijer.mobile.greenville.model.response.CartItemResponse;
import com.meijer.mobile.greenville.model.response.CartTotalsResponse;
import com.meijer.mobile.greenville.model.response.RejectedBarcodeResponse;
import com.meijer.mobile.greenville.model.response.SpecialItemResponse;
import com.meijer.mobile.greenville.model.response.TransactionHeaderResponse;
import com.meijer.mobile.greenville.model.response.TransactionResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import qm.ProductImage;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "Lqm/a;", "image", "LPk/a;", "coupon", "LPl/e;", "c", "(Lcom/meijer/mobile/greenville/model/response/TransactionResponse;Lqm/a;LPk/a;)LPl/e;", "Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;", "LPl/c;", "b", "(Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;)LPl/c;", "Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "", "tax", "LPl/a;", "a", "(Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;Ljava/lang/Double;)LPl/a;", "", "Lcom/meijer/mobile/greenville/model/response/CartItemResponse;", "", "", "Lcom/meijer/mobile/greenville/model/response/SpecialItemResponse;", "specialItemsMap", "Lcom/meijer/mobile/greenville/model/domain/a;", "d", "(Ljava/util/List;Ljava/util/Map;Lqm/a;LPk/a;)Ljava/util/List;", "Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "barcode", "f", "(Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;)Ljava/util/List;", "greenville_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {
    private static final CartTotals a(CartTotalsResponse cartTotalsResponse, Double d10) {
        return new CartTotals(cartTotalsResponse.getCartWasTotal(), cartTotalsResponse.getCartNowTotal(), cartTotalsResponse.getCartSavingsTotal(), cartTotalsResponse.getCartRewardTotal(), d10 != null ? d10.doubleValue() : 0.0d, cartTotalsResponse.getCartTmdDiscount(), cartTotalsResponse.getCartDepositTotal(), cartTotalsResponse.getCartTotalWithTax());
    }

    private static final Header b(TransactionHeaderResponse transactionHeaderResponse) {
        return new Header(transactionHeaderResponse.getStoreId(), transactionHeaderResponse.getTransactionDateTime(), transactionHeaderResponse.getTransactionDateTimeUTC(), transactionHeaderResponse.getEventTimeStamp(), transactionHeaderResponse.getEventTimeStampUTC(), transactionHeaderResponse.getDeviceId(), transactionHeaderResponse.getDeviceOS(), transactionHeaderResponse.getDeviceAppVersion(), transactionHeaderResponse.getDeviceOSVersion(), transactionHeaderResponse.getTransactionStatus(), transactionHeaderResponse.getTransactionId(), transactionHeaderResponse.getTrackingId(), transactionHeaderResponse.getTransactionNumber(), transactionHeaderResponse.getTerminal());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Pl.Transaction c(com.meijer.mobile.greenville.model.response.TransactionResponse r9, qm.ProductImage r10, Pk.Coupon r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            com.meijer.mobile.greenville.model.response.TransactionObjectResponse r0 = r9.getTransactionObject()
            r1 = 0
            if (r0 == 0) goto L11
            java.util.List r0 = r0.a()
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L6f
            java.util.List r0 = r9.c()
            if (r0 == 0) goto L6f
            java.util.List r0 = r9.c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r0.next()
            com.meijer.mobile.greenville.model.response.SpecialItemResponse r3 = (com.meijer.mobile.greenville.model.response.SpecialItemResponse) r3
            java.util.List r4 = r3.c()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.x(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r6 = kotlin.TuplesKt.a(r6, r3)
            r5.add(r6)
            goto L4a
        L66:
            kotlin.collections.CollectionsKt.C(r2, r5)
            goto L29
        L6a:
            java.util.Map r0 = kotlin.collections.MapsKt.y(r2)
            goto L70
        L6f:
            r0 = r1
        L70:
            Pl.e r2 = new Pl.e
            com.meijer.mobile.greenville.model.response.TransactionHeaderResponse r3 = r9.getTransactionHeader()
            if (r3 == 0) goto L7e
            Pl.c r3 = b(r3)
            if (r3 != 0) goto L84
        L7e:
            Pl.c$a r3 = Pl.Header.INSTANCE
            Pl.c r3 = r3.a()
        L84:
            com.meijer.mobile.greenville.model.response.TransactionObjectResponse r4 = r9.getTransactionObject()
            if (r4 == 0) goto Lab
            com.meijer.mobile.greenville.model.response.CartTotalsResponse r4 = r4.getCartTotals()
            if (r4 == 0) goto Lab
            com.meijer.mobile.greenville.model.response.TransactionObjectResponse r5 = r9.getTransactionObject()
            com.meijer.mobile.greenville.model.response.TaxResponse r5 = r5.getTax()
            if (r5 == 0) goto La2
            double r5 = r5.getTotalTax()
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
        La2:
            Pl.a r1 = a(r4, r1)
            if (r1 != 0) goto La9
            goto Lab
        La9:
            r4 = r1
            goto Lb0
        Lab:
            Pl.a r1 = Pl.b.a()
            goto La9
        Lb0:
            com.meijer.mobile.greenville.model.response.TransactionObjectResponse r1 = r9.getTransactionObject()
            if (r1 == 0) goto Lc5
            java.util.List r1 = r1.a()
            if (r1 == 0) goto Lc5
            java.util.List r10 = d(r1, r0, r10, r11)
            if (r10 != 0) goto Lc3
            goto Lc5
        Lc3:
            r5 = r10
            goto Ld4
        Lc5:
            com.meijer.mobile.greenville.model.response.RejectedBarcodeResponse r9 = r9.getRejectedBarcode()
            java.util.List r10 = f(r9)
            if (r10 != 0) goto Lc3
            java.util.List r10 = kotlin.collections.CollectionsKt.m()
            goto Lc3
        Ld4:
            r7 = 8
            r8 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ql.a.c(com.meijer.mobile.greenville.model.response.TransactionResponse, qm.a, Pk.a):Pl.e");
    }

    private static final List<CartItem> d(List<CartItemResponse> list, Map<Integer, SpecialItemResponse> map, ProductImage productImage, Coupon coupon) {
        SpecialItemResponse specialItemResponse;
        Map<Integer, SpecialItemResponse> map2 = map;
        List<CartItemResponse> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (CartItemResponse cartItemResponse : list2) {
            int remoteId = cartItemResponse.getRemoteId();
            String correlationId = cartItemResponse.getCorrelationId();
            String upc = cartItemResponse.getUpc();
            String scannedUpc = cartItemResponse.getScannedUpc();
            double quantityWeight = cartItemResponse.getQuantityWeight();
            String itemDesc = cartItemResponse.getItemDesc();
            String pricingText = cartItemResponse.getPricingText();
            double wasPrice = cartItemResponse.getWasPrice();
            double nowPrice = cartItemResponse.getNowPrice();
            double netPrice = cartItemResponse.getNetPrice();
            double netPriceWithDeposit = cartItemResponse.getNetPriceWithDeposit();
            double postAllocationPrice = cartItemResponse.getPostAllocationPrice();
            double deposit = cartItemResponse.getDeposit();
            double savings = cartItemResponse.getSavings();
            CartItem.Restriction restriction = null;
            String url = productImage != null ? productImage.getUrl() : null;
            boolean z10 = !cartItemResponse.getProhibitQuantity();
            boolean isAutoVoided = cartItemResponse.getIsAutoVoided();
            if (map2 != null && (specialItemResponse = map2.get(Integer.valueOf(cartItemResponse.getRemoteId()))) != null) {
                restriction = new CartItem.Restriction(specialItemResponse.getCustomerMessageTitle(), specialItemResponse.getCustomerMessage());
            }
            arrayList.add(new CartItem(remoteId, correlationId, upc, scannedUpc, quantityWeight, itemDesc, pricingText, wasPrice, nowPrice, netPrice, netPriceWithDeposit, postAllocationPrice, deposit, savings, z10, isAutoVoided, url, coupon, restriction, null, 524288, null));
            map2 = map;
        }
        return arrayList;
    }

    public static /* synthetic */ Transaction e(TransactionResponse transactionResponse, ProductImage productImage, Coupon coupon, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productImage = null;
        }
        if ((i10 & 2) != 0) {
            coupon = null;
        }
        return c(transactionResponse, productImage, coupon);
    }

    private static final List<CartItem> f(RejectedBarcodeResponse rejectedBarcodeResponse) {
        if (rejectedBarcodeResponse != null) {
            return CollectionsKt.e(new CartItem(0, rejectedBarcodeResponse.getCorrelationId(), "", "", 0.0d, rejectedBarcodeResponse.getMessage(), "", 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, true, null, null, new CartItem.Restriction(rejectedBarcodeResponse.getTitle(), rejectedBarcodeResponse.getMessage()), null, 524288, null));
        }
        return null;
    }
}

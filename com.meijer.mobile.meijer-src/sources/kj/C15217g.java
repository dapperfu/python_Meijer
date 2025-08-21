package kj;

import Co.ProductFullDetails;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import fj.AllDiscountDetails;
import fj.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "Lfj/i;", "b", "(Lcom/meijer/mobile/cart/model/hybris/EntryJson;)Lfj/i;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "a", "(Lcom/meijer/mobile/cart/model/hybris/EntryJson;I)Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kj.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15217g {
    public static final EntryJson a(EntryJson entryJson, int i10) {
        Intrinsics.j(entryJson, "<this>");
        return EntryJson.a(entryJson, 0, null, Io.d.a(entryJson.getProduct(), i10), 0.0d, 0.0d, null, null, null, null, null, null, 0.0d, 0L, false, null, null, null, false, 262139, null);
    }

    public static final Entry b(EntryJson entryJson) {
        HybrisProduct hybrisProduct;
        Intrinsics.j(entryJson, "<this>");
        int entryNumber = entryJson.getEntryNumber();
        ProductFullDetails productFullDetailsB = Io.d.b(entryJson.getProduct());
        double avgPoundsEach = entryJson.getAvgPoundsEach();
        double actualQuantity = entryJson.getActualQuantity();
        String substitutionNotes = entryJson.getSubstitutionNotes();
        HybrisPrice basePrice = entryJson.getBasePrice();
        ProductFullDetails productFullDetailsB2 = null;
        nk.b bVarA = basePrice != null ? Lo.b.a(basePrice) : null;
        nk.b bVarA2 = Lo.b.a(entryJson.getDepositPrice());
        nk.b bVarA3 = Lo.b.a(entryJson.getPricePerUnit());
        nk.b bVarA4 = Lo.b.a(entryJson.getTotalPrice());
        String unit = entryJson.getUnit();
        AllDiscountDetails allDiscountDetailsA = m.a(entryJson.getAllDiscountDetails());
        List<HybrisProduct> listM = entryJson.m();
        if (listM != null && (hybrisProduct = (HybrisProduct) CollectionsKt.u0(listM)) != null) {
            productFullDetailsB2 = Io.d.b(hybrisProduct);
        }
        return new Entry(entryNumber, productFullDetailsB, avgPoundsEach, actualQuantity, 0.0d, substitutionNotes, productFullDetailsB2, bVarA, bVarA2, bVarA3, bVarA4, unit, allDiscountDetailsA, entryJson.getSubstitutionStatus(), entryJson.getIsDoNotSubstitute(), 16, null);
    }
}

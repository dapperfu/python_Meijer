package sn;

import Co.Image;
import Co.ProductFullDetails;
import androidx.recyclerview.widget.RecyclerView;
import es.FetchSubstitutedProducts;
import hj.OrderDetail;
import im.C14782d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les/a;", "Lhj/c;", "order", "", "LCo/h;", "allProducts", "Lvo/a;", "a", "(Les/a;Lhj/c;Ljava/util/List;)Lvo/a;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class M {
    public static final OrderSubstitutionItem a(FetchSubstitutedProducts fetchSubstitutedProducts, OrderDetail order, List<ProductFullDetails> allProducts) {
        ProductFullDetails productFullDetails;
        Object next;
        Intrinsics.j(fetchSubstitutedProducts, "<this>");
        Intrinsics.j(order, "order");
        Intrinsics.j(allProducts, "allProducts");
        String productIdentityOriginal = fetchSubstitutedProducts.getProductIdentityOriginal();
        nk.b bVarF = null;
        ProductFullDetails productFullDetailsE = productIdentityOriginal != null ? C14782d.f138348a.e(order, productIdentityOriginal) : null;
        String productIdentitySubstituted = fetchSubstitutedProducts.getProductIdentitySubstituted();
        if (productIdentitySubstituted != null) {
            Iterator<T> it = allProducts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(((ProductFullDetails) next).getCode(), productIdentitySubstituted)) {
                    break;
                }
            }
            productFullDetails = (ProductFullDetails) next;
        } else {
            productFullDetails = null;
        }
        Integer itemId = fetchSubstitutedProducts.getItemId();
        int iIntValue = itemId != null ? itemId.intValue() : 0;
        List<Image> listJ = productFullDetailsE != null ? productFullDetailsE.j() : null;
        List<Image> listJ2 = productFullDetails != null ? productFullDetails.j() : null;
        String name = productFullDetailsE != null ? productFullDetailsE.getName() : null;
        String nameSubstituted = fetchSubstitutedProducts.getNameSubstituted();
        Double quantity = fetchSubstitutedProducts.getQuantity();
        double dDoubleValue = quantity != null ? quantity.doubleValue() : 0.0d;
        nk.b price = productFullDetailsE != null ? productFullDetailsE.getPrice() : null;
        Double pricePerUnit = fetchSubstitutedProducts.getPricePerUnit();
        if (pricePerUnit != null) {
            double dDoubleValue2 = pricePerUnit.doubleValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('$');
            sb2.append(fetchSubstitutedProducts.getPricePerUnit());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append('$');
            sb3.append(fetchSubstitutedProducts.getPricePerUnit());
            bVarF = Co.l.f(null, null, dDoubleValue2, sb3.toString(), 0.0d, string, 19, null);
        }
        return new OrderSubstitutionItem(iIntValue, name, nameSubstituted, listJ, listJ2, dDoubleValue, price, bVarF, productFullDetailsE, productFullDetails, fetchSubstitutedProducts.getCustomerSubstitutionPreference(), false, RecyclerView.m.FLAG_MOVED, null);
    }
}

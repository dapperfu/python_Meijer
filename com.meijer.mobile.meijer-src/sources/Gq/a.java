package Gq;

import Co.ProductFullDetails;
import Fq.ShoppingListItem;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LFq/c;", "Lbk/a;", "a", "(LFq/c;)Lbk/a;", "productPrice", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {
    public static final AbstractC6392a a(ShoppingListItem shoppingListItem) {
        Intrinsics.j(shoppingListItem, "<this>");
        ProductFullDetails productDetails = shoppingListItem.getProductDetails();
        if (productDetails != null) {
            return new ProductPriceDecorator(productDetails, false, 0.0d, 6, null).b();
        }
        return null;
    }
}

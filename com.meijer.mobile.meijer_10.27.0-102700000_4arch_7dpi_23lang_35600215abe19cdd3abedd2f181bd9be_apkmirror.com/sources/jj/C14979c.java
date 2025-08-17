package jj;

import com.meijer.mobile.cart.model.hybris.CartModification;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import ej.Entry;
import ej.EntryChange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CartModification;", "Lej/j;", "b", "(Lcom/meijer/mobile/cart/model/hybris/CartModification;)Lej/j;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "a", "(Lcom/meijer/mobile/cart/model/hybris/CartModification;I)Lcom/meijer/mobile/cart/model/hybris/CartModification;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jj.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14979c {
    public static final CartModification a(CartModification cartModification, int i10) {
        Intrinsics.j(cartModification, "<this>");
        EntryJson entry = cartModification.getEntry();
        return cartModification.copy((254 & 1) != 0 ? cartModification.entry : entry != null ? C14983g.a(entry, i10) : null, (254 & 2) != 0 ? cartModification.quantityValue : 0.0d, (254 & 4) != 0 ? cartModification.quantity : 0L, (254 & 8) != 0 ? cartModification.quantityValueAdded : 0.0d, (254 & 16) != 0 ? cartModification.quantityAdded : 0L, (254 & 32) != 0 ? cartModification.statusCode : null, (254 & 64) != 0 ? cartModification.actualQuantity : 0.0d, (254 & 128) != 0 ? cartModification.actualQuantityAdded : 0.0d);
    }

    public static final EntryChange b(CartModification cartModification) {
        Entry entryB;
        EntryChange.c next;
        Entry entryB2;
        Intrinsics.j(cartModification, "<this>");
        Iterator<EntryChange.c> it = EntryChange.c.e().iterator();
        while (true) {
            entryB = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(next.getCode(), cartModification.getStatusCode())) {
                break;
            }
        }
        EntryChange.c cVar = next;
        if (cVar == null) {
            cVar = EntryChange.c.f128931b;
        }
        EntryChange.c cVar2 = cVar;
        EntryJson entry = cartModification.getEntry();
        if (entry != null && (entryB2 = C14983g.b(entry)) != null) {
            entryB = cVar2 == EntryChange.c.f128935f ? Entry.b(entryB2, 0, null, 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32759, null) : entryB2;
        }
        return new EntryChange(entryB, null, cVar2, cartModification.getActualQuantity(), cartModification.getActualQuantityAdded(), 2, null);
    }
}

package jj;

import Co.ProductFullDetails;
import com.meijer.mobile.cart.model.hybris.CartModification;
import com.meijer.mobile.cart.model.hybris.CartModifications;
import ej.CartChanges;
import ej.Entry;
import ej.EntryChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import xk.C18066d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lmk/i;", "requestedChanges", "totalUnitCount", "Lej/e;", "b", "(Lcom/meijer/mobile/cart/model/hybris/CartModifications;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lej/e;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jj.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14981e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final CartChanges b(CartModifications cartModifications, Integer num, List<? extends mk.i> list, Integer num2) {
        List<EntryChange> listM1;
        List listM;
        List listJ1;
        Entry entry;
        List<CartModification> listA;
        Map mapA = list != null ? mk.k.a(list) : null;
        if (mapA != null) {
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry entry2 : mapA.entrySet()) {
                String str = (String) entry2.getKey();
                mk.i iVar = (mk.i) entry2.getValue();
                ProductFullDetails hVarA = Co.l.a(iVar.getProduct());
                mk.b bVarJ0 = hVarA.getDiscountedPrice();
                if (bVarJ0 == null) {
                    bVarJ0 = hVarA.getPrice();
                }
                int i10 = 0;
                arrayList.add(new EntryChange(new Entry(i10, new ProductFullDetails(str, null, i10, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null), C18066d.a(bVarJ0.getAveragePoundEach(), new Function0() { // from class: jj.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(C14981e.d());
                    }
                }), iVar.getQuantity(), 0.0d, null, null, Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null), null, null, null, hVarA.getItemUnitOfMeasure(), 0 == true ? 1 : 0, null, false, 30577, null), null, EntryChange.c.f128937h, iVar.getQuantity(), 0.0d, 2, 0 == true ? 1 : 0));
            }
            listM1 = CollectionsKt.m1(arrayList);
        } else {
            listM1 = null;
        }
        if (cartModifications == null || (listA = cartModifications.a()) == null) {
            listM = null;
        } else {
            List<CartModification> list2 = listA;
            listM = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                listM.add(C14979c.b((CartModification) it.next()));
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List listM12 = CollectionsKt.m1(listM);
        ArrayList arrayList2 = new ArrayList();
        if (listM1 != null) {
            for (EntryChange entryChangeB : listM1) {
                EntryChange entryChange = (EntryChange) CollectionsKt.u0(listM12);
                if ((entryChange != null ? entryChange.getEntry() : null) == null) {
                    CollectionsKt.L(listM12);
                    entryChangeB = EntryChange.b(entryChangeB, entryChangeB.getEntry(), entryChangeB.getProductQuantity(), EntryChange.c.f128936g, 0.0d, 0.0d, 24, null);
                } else {
                    EntryChange entryChange2 = (EntryChange) CollectionsKt.u0(listM12);
                    String strH2 = (entryChange2 == null || (entry = entryChange2.getEntry()) == null) ? null : entry.h2();
                    mk.i productQuantity = entryChangeB.getProductQuantity();
                    if (Intrinsics.e(strH2, productQuantity != null ? productQuantity.h2() : null)) {
                        entryChangeB = (EntryChange) CollectionsKt.L(listM12);
                    }
                }
                if (entryChangeB != null) {
                    arrayList2.add(entryChangeB);
                }
            }
        }
        ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
        if (arrayList3 == null || (listJ1 = CollectionsKt.j1(arrayList3)) == null) {
            listJ1 = CollectionsKt.j1(listM12);
        }
        return new CartChanges(num, listJ1, num2);
    }

    public static /* synthetic */ CartChanges c(CartModifications cartModifications, Integer num, List list, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return b(cartModifications, num, list, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d() {
        return 0.0d;
    }
}

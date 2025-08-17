package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import ej.HighValuePromoData;
import ej.ShoppingCart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/r;", "LDk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "Ltk/c;", "Lej/C;", "resource", "<init>", "(Ltk/c;)V", "oldState", "d", "(Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;)Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "b", "Ltk/c;", "getResource", "()Ltk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class r extends Dk.b<HighValuePromoSelectionsViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tk.c<ShoppingCart> resource;

    public r(tk.c<ShoppingCart> resource) {
        Intrinsics.j(resource, "resource");
        this.resource = resource;
    }

    @Override // Dk.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public HighValuePromoSelectionsViewState b(HighValuePromoSelectionsViewState oldState) {
        List listM;
        Intrinsics.j(oldState, "oldState");
        ShoppingCart shoppingCartA = this.resource.a();
        if (shoppingCartA != null) {
            List<HighValuePromoData> listT = shoppingCartA.t();
            listM = new ArrayList(CollectionsKt.x(listT, 10));
            Iterator<T> it = listT.iterator();
            while (it.hasNext()) {
                listM.add(HighValuePromoOfferDecorator.INSTANCE.a((HighValuePromoData) it.next()));
            }
        } else {
            listM = CollectionsKt.m();
        }
        List list = listM;
        List list2 = list;
        boolean z10 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((HighValuePromoOfferDecorator) it2.next()).getIsChecked()) {
                    z10 = true;
                    break;
                }
            }
        }
        return HighValuePromoSelectionsViewState.b(oldState, false, list, list, 0, z10, false, 40, null);
    }
}

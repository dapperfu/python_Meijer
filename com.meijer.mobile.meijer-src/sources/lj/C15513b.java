package lj;

import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import gj.PickupPerson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "Lgj/b;", "a", "(Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;)Lgj/b;", "b", "(Lgj/b;)Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lj.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15513b {
    public static final PickupPerson a(HybrisPickupPerson hybrisPickupPerson) {
        Intrinsics.j(hybrisPickupPerson, "<this>");
        return new PickupPerson(hybrisPickupPerson.getFirstName(), hybrisPickupPerson.getLastName(), hybrisPickupPerson.getEmail(), hybrisPickupPerson.getPhoneNumber());
    }

    public static final HybrisPickupPerson b(PickupPerson pickupPerson) {
        Intrinsics.j(pickupPerson, "<this>");
        return new HybrisPickupPerson(pickupPerson.getFirstName(), pickupPerson.getLastName(), pickupPerson.getEmail(), pickupPerson.getPhoneNumber());
    }
}

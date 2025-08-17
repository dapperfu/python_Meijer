package kj;

import com.meijer.mobile.cart.model.hybris.checkout.HybrisContactInformation;
import fj.ContactInformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj/a;", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "a", "(Lfj/a;)Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisContactInformation;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15168a {
    public static final HybrisContactInformation a(ContactInformation contactInformation) {
        Intrinsics.j(contactInformation, "<this>");
        return new HybrisContactInformation(contactInformation.getEmailAddress(), contactInformation.getPhoneNumber());
    }
}

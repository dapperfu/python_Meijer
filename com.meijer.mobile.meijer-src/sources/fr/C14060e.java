package fr;

import com.meijer.mobile.subscription.service.api.models.CustomerNameRequestJson;
import dr.CustomerNameRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/c;", "Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "a", "(Ldr/c;)Lcom/meijer/mobile/subscription/service/api/models/CustomerNameRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14060e {
    public static final CustomerNameRequestJson a(CustomerNameRequest customerNameRequest) {
        Intrinsics.j(customerNameRequest, "<this>");
        return new CustomerNameRequestJson(customerNameRequest.getFirstName(), customerNameRequest.getLastName());
    }
}

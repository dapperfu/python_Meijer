package fr;

import Tq.SimpleStoreSummary;
import com.meijer.mobile.subscription.service.api.models.StoreInfoResponseJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "LTq/e;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;)LTq/e;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14069n {
    public static final SimpleStoreSummary a(StoreInfoResponseJson storeInfoResponseJson) {
        Intrinsics.j(storeInfoResponseJson, "<this>");
        return new SimpleStoreSummary(storeInfoResponseJson.getStoreId(), storeInfoResponseJson.getStoreName(), null, 0.0d, 12, null);
    }
}

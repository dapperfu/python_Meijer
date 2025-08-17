package Eh;

import Dh.SpiffItem;
import com.meijer.mobile.accounts.service.models.network.SpiffItemJson;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/SpiffItemJson;", "LDh/z;", "a", "(Lcom/meijer/mobile/accounts/service/models/network/SpiffItemJson;)LDh/z;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    public static final SpiffItem a(SpiffItemJson spiffItemJson) {
        Intrinsics.j(spiffItemJson, "<this>");
        String name = spiffItemJson.getName();
        String description = spiffItemJson.getDescription();
        String displayEndDate = spiffItemJson.getDisplayEndDate();
        LocalDateTime localDateTime = displayEndDate != null ? (LocalDateTime) vk.d.b(displayEndDate, C17590a.f164803a.s(), new j()) : null;
        String redemptionEndDate = spiffItemJson.getRedemptionEndDate();
        return new SpiffItem(name, description, localDateTime, redemptionEndDate != null ? (LocalDateTime) vk.d.b(redemptionEndDate, C17590a.f164803a.s(), new j()) : null, spiffItemJson.getImageUrl());
    }
}

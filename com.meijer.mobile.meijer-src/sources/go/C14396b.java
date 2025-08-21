package go;

import co.AbstractC6530b;
import co.AutoClaimReward;
import com.meijer.mobile.mperks.networking.api.models.AvailableAutoClaimOptionJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AvailableAutoClaimOptionJson;", "Lco/a;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/AvailableAutoClaimOptionJson;)Lco/a;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14396b {
    public static final AutoClaimReward a(AvailableAutoClaimOptionJson availableAutoClaimOptionJson) {
        Intrinsics.j(availableAutoClaimOptionJson, "<this>");
        double autoClaimAmount = availableAutoClaimOptionJson.getAutoClaimAmount();
        AbstractC6530b abstractC6530bA = AbstractC6530b.INSTANCE.a(availableAutoClaimOptionJson.getAutoClaimType());
        if (abstractC6530bA == null) {
            abstractC6530bA = new AbstractC6530b.Unknown(availableAutoClaimOptionJson.getAutoClaimType());
        }
        return new AutoClaimReward(autoClaimAmount, abstractC6530bA, availableAutoClaimOptionJson.getImageURL(), availableAutoClaimOptionJson.getTitle(), availableAutoClaimOptionJson.getDescription(), availableAutoClaimOptionJson.getTerms(), availableAutoClaimOptionJson.getIsEnabled(), Intrinsics.e(availableAutoClaimOptionJson.getIsSelected(), Boolean.TRUE), false, false, 768, null);
    }
}

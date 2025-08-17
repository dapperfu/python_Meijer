package jj;

import com.meijer.mobile.cart.model.hybris.HybrisLightningCartReward;
import ej.LightningCartReward;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "Lej/q;", "a", "(Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;)Lej/q;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q {
    public static final LightningCartReward a(HybrisLightningCartReward hybrisLightningCartReward) {
        Intrinsics.j(hybrisLightningCartReward, "<this>");
        return new LightningCartReward(hybrisLightningCartReward.getPromoDesc(), hybrisLightningCartReward.getRewardAmount(), hybrisLightningCartReward.getLineNumber(), hybrisLightningCartReward.getLinChildInstance(), hybrisLightningCartReward.getPromoNum(), hybrisLightningCartReward.getRewardCode(), hybrisLightningCartReward.getRewardType(), hybrisLightningCartReward.getCustomOfferCode(), hybrisLightningCartReward.getGrantSequence(), hybrisLightningCartReward.getExecutionCycle());
    }
}

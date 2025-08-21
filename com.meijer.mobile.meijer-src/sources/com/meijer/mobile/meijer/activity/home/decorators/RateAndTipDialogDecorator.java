package com.meijer.mobile.meijer.activity.home.decorators;

import bk.AbstractC6392a;
import com.meijer.mobile.home.ux.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pl.TipData;
import tp.Builder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0001%B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u00060\u0002j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00060\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\b\u0002\u0010\b\u001a\u00060\u0002j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "", "", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lbk/a;", "shopperName", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Ltp/b;", "rateAndTipBuilder", "<init>", "(Ljava/lang/String;Lbk/a;Ljava/lang/String;Ltp/b;)V", "component1", "()Ljava/lang/String;", "component2", "()Lbk/a;", "component3", "component4", "()Ltp/b;", "copy", "(Ljava/lang/String;Lbk/a;Ljava/lang/String;Ltp/b;)Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExternalShopperId", "Lbk/a;", "getShopperName", "getOrderId", "Ltp/b;", "getRateAndTipBuilder", "Companion", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateAndTipDialogDecorator {
    private final String externalShopperId;
    private final String orderId;
    private final Builder rateAndTipBuilder;
    private final AbstractC6392a shopperName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator$Companion;", "", "<init>", "()V", "Lpl/a;", "tipData", "Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "decorate", "(Lpl/a;)Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RateAndTipDialogDecorator decorate(TipData tipData) {
            Intrinsics.j(tipData, "tipData");
            String externalShopperId = tipData.getExternalShopperId();
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(r0.f99358q, tipData.getShopperName());
            String orderId = tipData.getOrderId();
            Builder builder = new Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
            builder.A(tipData.getOrderId());
            builder.C(tipData.getShopperName());
            builder.B(tipData.getShopperImageURL());
            Unit unit = Unit.f143329a;
            return new RateAndTipDialogDecorator(externalShopperId, abstractC6392aD, orderId, builder);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getExternalShopperId() {
        return this.externalShopperId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAndTipDialogDecorator)) {
            return false;
        }
        RateAndTipDialogDecorator rateAndTipDialogDecorator = (RateAndTipDialogDecorator) other;
        return Intrinsics.e(this.externalShopperId, rateAndTipDialogDecorator.externalShopperId) && Intrinsics.e(this.shopperName, rateAndTipDialogDecorator.shopperName) && Intrinsics.e(this.orderId, rateAndTipDialogDecorator.orderId) && Intrinsics.e(this.rateAndTipBuilder, rateAndTipDialogDecorator.rateAndTipBuilder);
    }

    public int hashCode() {
        return (((((this.externalShopperId.hashCode() * 31) + this.shopperName.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.rateAndTipBuilder.hashCode();
    }

    public String toString() {
        return "RateAndTipDialogDecorator(externalShopperId=" + this.externalShopperId + ", shopperName=" + this.shopperName + ", orderId=" + this.orderId + ", rateAndTipBuilder=" + this.rateAndTipBuilder + ')';
    }

    public RateAndTipDialogDecorator(String externalShopperId, AbstractC6392a shopperName, String orderId, Builder rateAndTipBuilder) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(shopperName, "shopperName");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
        this.externalShopperId = externalShopperId;
        this.shopperName = shopperName;
        this.orderId = orderId;
        this.rateAndTipBuilder = rateAndTipBuilder;
    }

    public static /* synthetic */ RateAndTipDialogDecorator copy$default(RateAndTipDialogDecorator rateAndTipDialogDecorator, String str, AbstractC6392a abstractC6392a, String str2, Builder builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rateAndTipDialogDecorator.externalShopperId;
        }
        if ((i10 & 2) != 0) {
            abstractC6392a = rateAndTipDialogDecorator.shopperName;
        }
        if ((i10 & 4) != 0) {
            str2 = rateAndTipDialogDecorator.orderId;
        }
        if ((i10 & 8) != 0) {
            builder = rateAndTipDialogDecorator.rateAndTipBuilder;
        }
        return rateAndTipDialogDecorator.copy(str, abstractC6392a, str2, builder);
    }

    /* renamed from: component2, reason: from getter */
    public final AbstractC6392a getShopperName() {
        return this.shopperName;
    }

    /* renamed from: component4, reason: from getter */
    public final Builder getRateAndTipBuilder() {
        return this.rateAndTipBuilder;
    }

    public final RateAndTipDialogDecorator copy(String externalShopperId, AbstractC6392a shopperName, String orderId, Builder rateAndTipBuilder) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(shopperName, "shopperName");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
        return new RateAndTipDialogDecorator(externalShopperId, shopperName, orderId, rateAndTipBuilder);
    }

    public final String getExternalShopperId() {
        return this.externalShopperId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Builder getRateAndTipBuilder() {
        return this.rateAndTipBuilder;
    }

    public final AbstractC6392a getShopperName() {
        return this.shopperName;
    }
}

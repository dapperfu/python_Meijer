package com.meijer.mobile.digitalshopping.api.orders.model.tipandrate;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B3\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipAndRateRequest;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "rate", "shopperName", "", "tipAmount", "<init>", "(Ljava/lang/String;ILjava/lang/String;D)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "I", "()I", "c", "d", "D", "()D", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TipAndRateRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String orderId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int rate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String shopperName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final double tipAmount;

    public TipAndRateRequest(@g(name = "orderId") String orderId, @g(name = "rate") int i10, @g(name = "shopperName") String shopperName, @g(name = "tipAmount") double d10) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(shopperName, "shopperName");
        this.orderId = orderId;
        this.rate = i10;
        this.shopperName = shopperName;
        this.tipAmount = d10;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: b, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    /* renamed from: c, reason: from getter */
    public final String getShopperName() {
        return this.shopperName;
    }

    /* renamed from: d, reason: from getter */
    public final double getTipAmount() {
        return this.tipAmount;
    }
}

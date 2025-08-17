package com.meijer.mobile.digitalshopping.api.orders.model.tipandrate;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0015B-\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0003\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;", "", "", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "modalState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UpdateTipNotificationRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalShopperId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String modalState;

    public UpdateTipNotificationRequest(@g(name = "externalShopperId") String externalShopperId, @g(name = "orderId") String orderId, @g(name = "modalState") String modalState) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(modalState, "modalState");
        this.externalShopperId = externalShopperId;
        this.orderId = orderId;
        this.modalState = modalState;
    }

    public final UpdateTipNotificationRequest copy(@g(name = "externalShopperId") String externalShopperId, @g(name = "orderId") String orderId, @g(name = "modalState") String modalState) {
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(modalState, "modalState");
        return new UpdateTipNotificationRequest(externalShopperId, orderId, modalState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTipNotificationRequest)) {
            return false;
        }
        UpdateTipNotificationRequest updateTipNotificationRequest = (UpdateTipNotificationRequest) other;
        return Intrinsics.e(this.externalShopperId, updateTipNotificationRequest.externalShopperId) && Intrinsics.e(this.orderId, updateTipNotificationRequest.orderId) && Intrinsics.e(this.modalState, updateTipNotificationRequest.modalState);
    }

    public int hashCode() {
        return (((this.externalShopperId.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.modalState.hashCode();
    }

    public String toString() {
        return "UpdateTipNotificationRequest(externalShopperId=" + this.externalShopperId + ", orderId=" + this.orderId + ", modalState=" + this.modalState + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getExternalShopperId() {
        return this.externalShopperId;
    }

    /* renamed from: b, reason: from getter */
    public final String getModalState() {
        return this.modalState;
    }

    /* renamed from: c, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public /* synthetic */ UpdateTipNotificationRequest(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "closed" : str3);
    }
}

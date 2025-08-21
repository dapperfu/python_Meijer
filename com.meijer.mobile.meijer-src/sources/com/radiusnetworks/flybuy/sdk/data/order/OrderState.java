package com.radiusnetworks.flybuy.sdk.data.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/OrderState;", "", "()V", "CANCELLED", "", "COMPLETED", "CREATED", "DELAYED", "EXPIRED", "GONE", "PREPARING", "READY", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderState {
    public static final String CANCELLED = "cancelled";
    public static final String COMPLETED = "completed";
    public static final String CREATED = "created";
    public static final String DELAYED = "delayed";
    public static final String EXPIRED = "expired";
    public static final String GONE = "gone";
    public static final OrderState INSTANCE = new OrderState();
    public static final String PREPARING = "preparing";
    public static final String READY = "ready";

    private OrderState() {
    }
}

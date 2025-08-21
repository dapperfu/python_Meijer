package com.radiusnetworks.flybuy.sdk.data.customer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerState;", "", "()V", "ARRIVED", "", "COMPLETED", "CREATED", "EN_ROUTE", "NEARBY", "WAITING", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomerState {
    public static final String ARRIVED = "arrived";
    public static final String COMPLETED = "completed";
    public static final String CREATED = "created";
    public static final String EN_ROUTE = "en_route";
    public static final CustomerState INSTANCE = new CustomerState();
    public static final String NEARBY = "nearby";
    public static final String WAITING = "waiting";

    private CustomerState() {
    }
}

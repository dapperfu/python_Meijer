package com.meijer.mobile.meijer.activity.orders.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/exceptions/EbtOrderNotCompletedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EbtOrderNotCompletedException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public static final int f110529b = 8;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "EBT-Order is not Completed!";
    }
}

package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionRequest;", "", "", "transactionId", "lane", "storeNumber", "", "transactionDate", "transactionTime", "<init>", "(IIILjava/lang/String;Ljava/lang/String;)V", "a", "I", "d", "()I", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubmitTransactionRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int transactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int storeNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String transactionDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String transactionTime;

    public SubmitTransactionRequest(@g(name = "transactionId") int i10, @g(name = "lane") int i11, @g(name = "storeNumber") int i12, @g(name = "transactionDate") String transactionDate, @g(name = "transactionTime") String transactionTime) {
        Intrinsics.j(transactionDate, "transactionDate");
        Intrinsics.j(transactionTime, "transactionTime");
        this.transactionId = i10;
        this.lane = i11;
        this.storeNumber = i12;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
    }

    /* renamed from: a, reason: from getter */
    public final int getLane() {
        return this.lane;
    }

    /* renamed from: b, reason: from getter */
    public final int getStoreNumber() {
        return this.storeNumber;
    }

    /* renamed from: c, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: d, reason: from getter */
    public final int getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTransactionTime() {
        return this.transactionTime;
    }
}

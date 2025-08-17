package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import ej.H;
import ej.TransactionDetail;
import j$.time.OffsetDateTime;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;
import vk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PaymentCreditDetailInfoResponse;", "", "", "amount", "", "transactionDateTime", "transactionId", "type", "", "sequence", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Lej/I;", "f", "()Lej/I;", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/meijer/mobile/cart/model/hybris/PaymentCreditDetailInfoResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "c", "d", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaymentCreditDetailInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double amount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sequence;

    public final PaymentCreditDetailInfoResponse copy(@g(name = "amount") Double amount, @g(name = "transactionDateTime") String transactionDateTime, @g(name = "transactionId") String transactionId, @g(name = "type") String type, @g(name = "sequence") Integer sequence) {
        return new PaymentCreditDetailInfoResponse(amount, transactionDateTime, transactionId, type, sequence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCreditDetailInfoResponse)) {
            return false;
        }
        PaymentCreditDetailInfoResponse paymentCreditDetailInfoResponse = (PaymentCreditDetailInfoResponse) other;
        return Intrinsics.e(this.amount, paymentCreditDetailInfoResponse.amount) && Intrinsics.e(this.transactionDateTime, paymentCreditDetailInfoResponse.transactionDateTime) && Intrinsics.e(this.transactionId, paymentCreditDetailInfoResponse.transactionId) && Intrinsics.e(this.type, paymentCreditDetailInfoResponse.type) && Intrinsics.e(this.sequence, paymentCreditDetailInfoResponse.sequence);
    }

    public int hashCode() {
        Double d10 = this.amount;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        String str = this.transactionDateTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transactionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.sequence;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaymentCreditDetailInfoResponse(amount=" + this.amount + ", transactionDateTime=" + this.transactionDateTime + ", transactionId=" + this.transactionId + ", type=" + this.type + ", sequence=" + this.sequence + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    /* renamed from: c, reason: from getter */
    public final String getTransactionDateTime() {
        return this.transactionDateTime;
    }

    /* renamed from: d, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final TransactionDetail f() {
        String str = this.transactionId;
        H.Companion companion = H.INSTANCE;
        String str2 = this.type;
        if (str2 == null) {
            str2 = "";
        }
        H hA = companion.a(str2);
        String str3 = this.transactionDateTime;
        return new TransactionDetail(str, hA, str3 != null ? (OffsetDateTime) d.b(str3, C17590a.f164803a.s(), new r()) : null, this.amount);
    }

    public PaymentCreditDetailInfoResponse(@g(name = "amount") Double d10, @g(name = "transactionDateTime") String str, @g(name = "transactionId") String str2, @g(name = "type") String str3, @g(name = "sequence") Integer num) {
        this.amount = d10;
        this.transactionDateTime = str;
        this.transactionId = str2;
        this.type = str3;
        this.sequence = num;
    }
}

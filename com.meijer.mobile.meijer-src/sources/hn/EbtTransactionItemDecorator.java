package hn;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import fj.PaymentRefundDetailInfo;
import fj.TransactionDetails;
import hj.EbtTransaction;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\u0015B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {"Lhn/d;", "", "", "key", "Lbk/a;", "transactionId", "date", "amount", "", "isOriginal", "isRefund", "<init>", "(Ljava/lang/String;Lbk/a;Lbk/a;Lbk/a;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "Lbk/a;", "c", "()Lbk/a;", "d", "e", "Z", "()Z", "f", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class EbtTransactionItemDecorator {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f135899h = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a transactionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a date;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOriginal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRefund;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhn/d$a;", "", "<init>", "()V", "Lhj/b;", "", "isRefund", "isOriginal", "Lhn/d;", "c", "(Lhj/b;ZZ)Lhn/d;", "Lfj/w;", "a", "(Lfj/w;)Lhn/d;", "Lfj/J;", "b", "(Lfj/J;Z)Lhn/d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ EbtTransactionItemDecorator d(Companion companion, EbtTransaction ebtTransaction, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            return companion.c(ebtTransaction, z10, z11);
        }

        public final EbtTransactionItemDecorator a(PaymentRefundDetailInfo paymentRefundDetailInfo) {
            Intrinsics.j(paymentRefundDetailInfo, "<this>");
            String strValueOf = String.valueOf(paymentRefundDetailInfo.getSequence());
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aD = companion.d(Y.f101274x4, String.valueOf(paymentRefundDetailInfo.getRefundTransactionId()));
            int i10 = Y.f100356C4;
            OffsetDateTime refundDateTime = paymentRefundDetailInfo.getRefundDateTime();
            AbstractC6392a abstractC6392aD2 = companion.d(i10, String.valueOf(refundDateTime != null ? refundDateTime.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null));
            int i11 = Y.f100336B4;
            Double refundAmount = paymentRefundDetailInfo.getRefundAmount();
            return new EbtTransactionItemDecorator(strValueOf, abstractC6392aD, abstractC6392aD2, companion.d(i11, Double.valueOf((refundAmount != null ? refundAmount.doubleValue() : 0.0d) / 100)), false, true);
        }

        public final EbtTransactionItemDecorator b(TransactionDetails transactionDetails, boolean z10) {
            AbstractC6392a abstractC6392aD;
            AbstractC6392a abstractC6392aD2;
            Intrinsics.j(transactionDetails, "<this>");
            String strValueOf = String.valueOf(transactionDetails.getReferenceKey());
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aD3 = companion.d(Y.f101274x4, String.valueOf(transactionDetails.getEbtCaptureTranId()));
            if (z10) {
                int i10 = Y.f101294y4;
                OffsetDateTime ebtCaptureDateTime = transactionDetails.getEbtCaptureDateTime();
                abstractC6392aD = companion.d(i10, String.valueOf(ebtCaptureDateTime != null ? ebtCaptureDateTime.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null));
            } else {
                int i11 = Y.f100316A4;
                OffsetDateTime ebtCaptureDateTime2 = transactionDetails.getEbtCaptureDateTime();
                abstractC6392aD = companion.d(i11, String.valueOf(ebtCaptureDateTime2 != null ? ebtCaptureDateTime2.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null));
            }
            if (z10) {
                int i12 = Y.f101314z4;
                Double approvedAmount = transactionDetails.getApprovedAmount();
                abstractC6392aD2 = companion.d(i12, Double.valueOf((approvedAmount != null ? approvedAmount.doubleValue() : 0.0d) / 100));
            } else {
                int i13 = Y.f101314z4;
                Double ebtCapturedAmount = transactionDetails.getEbtCapturedAmount();
                abstractC6392aD2 = companion.d(i13, Double.valueOf((ebtCapturedAmount != null ? ebtCapturedAmount.doubleValue() : 0.0d) / 100));
            }
            return new EbtTransactionItemDecorator(strValueOf, abstractC6392aD3, abstractC6392aD, abstractC6392aD2, z10, false);
        }

        public final EbtTransactionItemDecorator c(EbtTransaction ebtTransaction, boolean z10, boolean z11) {
            Intrinsics.j(ebtTransaction, "<this>");
            if (z10) {
                String key = ebtTransaction.getKey();
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                return new EbtTransactionItemDecorator(key, companion.d(Y.f101274x4, ebtTransaction.getEbtDetails().getEbtRefundTransactionId()), companion.d(Y.f100356C4, ebtTransaction.getEbtDetails().getEbtRefundTime().format(C17898a.DATE_FORMAT_MM_DD_YYYY)), companion.d(Y.f100336B4, Double.valueOf(ebtTransaction.getEbtDetails().getEbtRefundAmount())), false, true);
            }
            if (z11) {
                String key2 = ebtTransaction.getKey();
                AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                return new EbtTransactionItemDecorator(key2, companion2.d(Y.f101274x4, ebtTransaction.getEbtDetails().getEbtCaptureTransactionId()), companion2.d(Y.f101294y4, ebtTransaction.getEbtDetails().getEbtCaptureTime().format(C17898a.DATE_FORMAT_MM_DD_YYYY)), companion2.d(Y.f101314z4, Double.valueOf(ebtTransaction.getEbtDetails().getEbtCapturedAmount())), true, false);
            }
            String key3 = ebtTransaction.getKey();
            AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
            return new EbtTransactionItemDecorator(key3, companion3.d(Y.f101274x4, ebtTransaction.getEbtDetails().getEbtCaptureTransactionId()), companion3.d(Y.f100316A4, ebtTransaction.getEbtDetails().getEbtCaptureTime().format(C17898a.DATE_FORMAT_MM_DD_YYYY)), companion3.d(Y.f101314z4, Double.valueOf(ebtTransaction.getEbtDetails().getEbtCapturedAmount())), false, false);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtTransactionItemDecorator)) {
            return false;
        }
        EbtTransactionItemDecorator ebtTransactionItemDecorator = (EbtTransactionItemDecorator) other;
        return Intrinsics.e(this.key, ebtTransactionItemDecorator.key) && Intrinsics.e(this.transactionId, ebtTransactionItemDecorator.transactionId) && Intrinsics.e(this.date, ebtTransactionItemDecorator.date) && Intrinsics.e(this.amount, ebtTransactionItemDecorator.amount) && this.isOriginal == ebtTransactionItemDecorator.isOriginal && this.isRefund == ebtTransactionItemDecorator.isRefund;
    }

    public EbtTransactionItemDecorator(String key, AbstractC6392a transactionId, AbstractC6392a date, AbstractC6392a amount, boolean z10, boolean z11) {
        Intrinsics.j(key, "key");
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(date, "date");
        Intrinsics.j(amount, "amount");
        this.key = key;
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.isOriginal = z10;
        this.isRefund = z11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsRefund() {
        return this.isRefund;
    }

    public int hashCode() {
        return (((((((((this.key.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.date.hashCode()) * 31) + this.amount.hashCode()) * 31) + Boolean.hashCode(this.isOriginal)) * 31) + Boolean.hashCode(this.isRefund);
    }

    public String toString() {
        return "EbtTransactionItemDecorator(key=" + this.key + ", transactionId=" + this.transactionId + ", date=" + this.date + ", amount=" + this.amount + ", isOriginal=" + this.isOriginal + ", isRefund=" + this.isRefund + ')';
    }
}

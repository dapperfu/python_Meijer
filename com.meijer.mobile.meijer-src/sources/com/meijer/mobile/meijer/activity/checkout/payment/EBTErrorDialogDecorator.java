package com.meijer.mobile.meijer.activity.checkout.payment;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0017\u0010#\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/o0;", "", "LHm/a;", "errorCode", "", "inSufficientBalance", "<init>", "(LHm/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHm/a;", "()LHm/a;", "b", "Ljava/lang/String;", "getInSufficientBalance", "Lbk/a;", "c", "Lbk/a;", "e", "()Lbk/a;", "title", "d", "message", "Z", "()Z", "inSufficientBalanceStatus", "f", "inSufficientMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.o0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class EBTErrorDialogDecorator {

    /* renamed from: g, reason: collision with root package name */
    public static final int f104902g = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Hm.a errorCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inSufficientBalance;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a message;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean inSufficientBalanceStatus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a inSufficientMessage;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EBTErrorDialogDecorator)) {
            return false;
        }
        EBTErrorDialogDecorator eBTErrorDialogDecorator = (EBTErrorDialogDecorator) other;
        return this.errorCode == eBTErrorDialogDecorator.errorCode && Intrinsics.e(this.inSufficientBalance, eBTErrorDialogDecorator.inSufficientBalance);
    }

    public int hashCode() {
        int iHashCode = this.errorCode.hashCode() * 31;
        String str = this.inSufficientBalance;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EBTErrorDialogDecorator(errorCode=" + this.errorCode + ", inSufficientBalance=" + this.inSufficientBalance + ')';
    }

    public EBTErrorDialogDecorator(Hm.a errorCode, String str) {
        Intrinsics.j(errorCode, "errorCode");
        this.errorCode = errorCode;
        this.inSufficientBalance = str;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        this.title = companion.d(errorCode.getHeaderResourceId(), new Object[0]);
        this.message = companion.d(errorCode.getMessageResourceId(), new Object[0]);
        this.inSufficientBalanceStatus = errorCode == Hm.a.f13713i;
        this.inSufficientMessage = companion.d(com.meijer.mobile.meijer.Y.f101157r7, str == null ? 0 : str);
    }

    /* renamed from: a, reason: from getter */
    public final Hm.a getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getInSufficientBalanceStatus() {
        return this.inSufficientBalanceStatus;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getInSufficientMessage() {
        return this.inSufficientMessage;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getMessage() {
        return this.message;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }
}

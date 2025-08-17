package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/ViewDigitalReceiptRequest;", "", "", "receiptId", "", "format", "<init>", "(JI)V", "copy", "(JI)Lcom/meijer/mobile/receipt/service/api/models/ViewDigitalReceiptRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "setReceiptId", "(J)V", "I", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ViewDigitalReceiptRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long receiptId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int format;

    public ViewDigitalReceiptRequest() {
        this(0L, 0, 3, null);
    }

    public final ViewDigitalReceiptRequest copy(@g(name = "receiptId") long receiptId, @g(name = "formatType") int format) {
        return new ViewDigitalReceiptRequest(receiptId, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewDigitalReceiptRequest)) {
            return false;
        }
        ViewDigitalReceiptRequest viewDigitalReceiptRequest = (ViewDigitalReceiptRequest) other;
        return this.receiptId == viewDigitalReceiptRequest.receiptId && this.format == viewDigitalReceiptRequest.format;
    }

    public int hashCode() {
        return (Long.hashCode(this.receiptId) * 31) + Integer.hashCode(this.format);
    }

    public String toString() {
        return "ViewDigitalReceiptRequest(receiptId=" + this.receiptId + ", format=" + this.format + ')';
    }

    public ViewDigitalReceiptRequest(@g(name = "receiptId") long j10, @g(name = "formatType") int i10) {
        this.receiptId = j10;
        this.format = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    /* renamed from: b, reason: from getter */
    public final long getReceiptId() {
        return this.receiptId;
    }

    public /* synthetic */ ViewDigitalReceiptRequest(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 1 : i10);
    }
}

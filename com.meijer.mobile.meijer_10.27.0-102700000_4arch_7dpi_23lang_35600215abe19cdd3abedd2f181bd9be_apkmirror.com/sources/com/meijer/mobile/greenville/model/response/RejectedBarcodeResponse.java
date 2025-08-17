package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "", "", "correlationId", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RejectedBarcodeResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String correlationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public final RejectedBarcodeResponse copy(@g(name = "correlationId") String correlationId, @g(name = "title") String title, @g(name = "message") String message) {
        Intrinsics.j(correlationId, "correlationId");
        Intrinsics.j(title, "title");
        Intrinsics.j(message, "message");
        return new RejectedBarcodeResponse(correlationId, title, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RejectedBarcodeResponse)) {
            return false;
        }
        RejectedBarcodeResponse rejectedBarcodeResponse = (RejectedBarcodeResponse) other;
        return Intrinsics.e(this.correlationId, rejectedBarcodeResponse.correlationId) && Intrinsics.e(this.title, rejectedBarcodeResponse.title) && Intrinsics.e(this.message, rejectedBarcodeResponse.message);
    }

    public int hashCode() {
        return (((this.correlationId.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "RejectedBarcodeResponse(correlationId=" + this.correlationId + ", title=" + this.title + ", message=" + this.message + ')';
    }

    public RejectedBarcodeResponse(@g(name = "correlationId") String correlationId, @g(name = "title") String title, @g(name = "message") String message) {
        Intrinsics.j(correlationId, "correlationId");
        Intrinsics.j(title, "title");
        Intrinsics.j(message, "message");
        this.correlationId = correlationId;
        this.title = title;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

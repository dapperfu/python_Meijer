package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/NextGenReceiptByIdResponse;", "", "", "pdfData", "extension", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/receipt/service/api/models/NextGenReceiptByIdResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NextGenReceiptByIdResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pdfData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extension;

    /* JADX WARN: Multi-variable type inference failed */
    public NextGenReceiptByIdResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final NextGenReceiptByIdResponse copy(@g(name = "pdfData") String pdfData, @g(name = "extension") String extension) {
        return new NextGenReceiptByIdResponse(pdfData, extension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextGenReceiptByIdResponse)) {
            return false;
        }
        NextGenReceiptByIdResponse nextGenReceiptByIdResponse = (NextGenReceiptByIdResponse) other;
        return Intrinsics.e(this.pdfData, nextGenReceiptByIdResponse.pdfData) && Intrinsics.e(this.extension, nextGenReceiptByIdResponse.extension);
    }

    public int hashCode() {
        String str = this.pdfData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extension;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NextGenReceiptByIdResponse(pdfData=" + this.pdfData + ", extension=" + this.extension + ')';
    }

    public NextGenReceiptByIdResponse(@g(name = "pdfData") String str, @g(name = "extension") String str2) {
        this.pdfData = str;
        this.extension = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* renamed from: b, reason: from getter */
    public final String getPdfData() {
        return this.pdfData;
    }

    public /* synthetic */ NextGenReceiptByIdResponse(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}

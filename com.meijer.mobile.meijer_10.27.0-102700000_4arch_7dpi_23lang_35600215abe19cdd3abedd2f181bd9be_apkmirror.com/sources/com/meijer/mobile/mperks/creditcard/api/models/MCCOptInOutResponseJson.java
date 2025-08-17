package com.meijer.mobile.mperks.creditcard.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/MCCOptInOutResponseJson;", "", "", "statusCode", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/meijer/mobile/mperks/creditcard/api/models/MCCOptInOutResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MCCOptInOutResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public MCCOptInOutResponseJson() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final MCCOptInOutResponseJson copy(@g(name = "statusCodeEnum") Integer statusCode, @g(name = "message") String message) {
        return new MCCOptInOutResponseJson(statusCode, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MCCOptInOutResponseJson)) {
            return false;
        }
        MCCOptInOutResponseJson mCCOptInOutResponseJson = (MCCOptInOutResponseJson) other;
        return Intrinsics.e(this.statusCode, mCCOptInOutResponseJson.statusCode) && Intrinsics.e(this.message, mCCOptInOutResponseJson.message);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MCCOptInOutResponseJson(statusCode=" + this.statusCode + ", message=" + this.message + ')';
    }

    public MCCOptInOutResponseJson(@g(name = "statusCodeEnum") Integer num, @g(name = "message") String str) {
        this.statusCode = num;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ MCCOptInOutResponseJson(Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
    }
}

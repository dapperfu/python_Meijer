package com.meijer.mobile.greenville.model.response.picklist;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PicklistResponse;", "", "", "Lcom/meijer/mobile/greenville/model/response/picklist/PayloadResponse;", "payload", "", "isSuccess", "<init>", "(Ljava/util/List;Z)V", "copy", "(Ljava/util/List;Z)Lcom/meijer/mobile/greenville/model/response/picklist/PicklistResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PicklistResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PayloadResponse> payload;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    public final PicklistResponse copy(@g(name = "payload") List<PayloadResponse> payload, @g(name = "isSuccess") boolean isSuccess) {
        Intrinsics.j(payload, "payload");
        return new PicklistResponse(payload, isSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicklistResponse)) {
            return false;
        }
        PicklistResponse picklistResponse = (PicklistResponse) other;
        return Intrinsics.e(this.payload, picklistResponse.payload) && this.isSuccess == picklistResponse.isSuccess;
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + Boolean.hashCode(this.isSuccess);
    }

    public String toString() {
        return "PicklistResponse(payload=" + this.payload + ", isSuccess=" + this.isSuccess + ')';
    }

    public PicklistResponse(@g(name = "payload") List<PayloadResponse> payload, @g(name = "isSuccess") boolean z10) {
        Intrinsics.j(payload, "payload");
        this.payload = payload;
        this.isSuccess = z10;
    }

    public final List<PayloadResponse> a() {
        return this.payload;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }
}

package com.meijer.mobile.shoppinglist.service.requests;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/requests/ClearCompletedItemsRequest;", "", "", "onlyCompleted", "<init>", "(Z)V", "copy", "(Z)Lcom/meijer/mobile/shoppinglist/service/requests/ClearCompletedItemsRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClearCompletedItemsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean onlyCompleted;

    public ClearCompletedItemsRequest() {
        this(false, 1, null);
    }

    public final ClearCompletedItemsRequest copy(@g(name = "onlyCompleted") boolean onlyCompleted) {
        return new ClearCompletedItemsRequest(onlyCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearCompletedItemsRequest) && this.onlyCompleted == ((ClearCompletedItemsRequest) other).onlyCompleted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.onlyCompleted);
    }

    public String toString() {
        return "ClearCompletedItemsRequest(onlyCompleted=" + this.onlyCompleted + ')';
    }

    public ClearCompletedItemsRequest(@g(name = "onlyCompleted") boolean z10) {
        this.onlyCompleted = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getOnlyCompleted() {
        return this.onlyCompleted;
    }

    public /* synthetic */ ClearCompletedItemsRequest(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}

package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionsRequest;", "", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "selectedEligibility", "", "supplementalEligibility", "<init>", "(Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;Ljava/util/List;)V", "copy", "(Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionsRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "()Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "b", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FulfillmentOptionsRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentOptionEligibility selectedEligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentOptionEligibility> supplementalEligibility;

    public FulfillmentOptionsRequest(@g(name = "selectedEligibility") FulfillmentOptionEligibility selectedEligibility, @g(name = "supplementalEligibility") List<FulfillmentOptionEligibility> list) {
        Intrinsics.j(selectedEligibility, "selectedEligibility");
        this.selectedEligibility = selectedEligibility;
        this.supplementalEligibility = list;
    }

    public final FulfillmentOptionsRequest copy(@g(name = "selectedEligibility") FulfillmentOptionEligibility selectedEligibility, @g(name = "supplementalEligibility") List<FulfillmentOptionEligibility> supplementalEligibility) {
        Intrinsics.j(selectedEligibility, "selectedEligibility");
        return new FulfillmentOptionsRequest(selectedEligibility, supplementalEligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentOptionsRequest)) {
            return false;
        }
        FulfillmentOptionsRequest fulfillmentOptionsRequest = (FulfillmentOptionsRequest) other;
        return Intrinsics.e(this.selectedEligibility, fulfillmentOptionsRequest.selectedEligibility) && Intrinsics.e(this.supplementalEligibility, fulfillmentOptionsRequest.supplementalEligibility);
    }

    public int hashCode() {
        int iHashCode = this.selectedEligibility.hashCode() * 31;
        List<FulfillmentOptionEligibility> list = this.supplementalEligibility;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "FulfillmentOptionsRequest(selectedEligibility=" + this.selectedEligibility + ", supplementalEligibility=" + this.supplementalEligibility + ')';
    }

    /* renamed from: a, reason: from getter */
    public final FulfillmentOptionEligibility getSelectedEligibility() {
        return this.selectedEligibility;
    }

    public final List<FulfillmentOptionEligibility> b() {
        return this.supplementalEligibility;
    }

    public /* synthetic */ FulfillmentOptionsRequest(FulfillmentOptionEligibility fulfillmentOptionEligibility, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fulfillmentOptionEligibility, (i10 & 2) != 0 ? null : list);
    }
}

package com.meijer.mobile.product.model.hybris.api.models.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/search/HybrisSuggestion;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/meijer/mobile/product/model/hybris/api/models/search/HybrisSuggestion;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisSuggestion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    public final HybrisSuggestion copy(@g(name = "value") String value) {
        Intrinsics.j(value, "value");
        return new HybrisSuggestion(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HybrisSuggestion) && Intrinsics.e(this.value, ((HybrisSuggestion) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "HybrisSuggestion(value=" + this.value + ')';
    }

    public HybrisSuggestion(@g(name = "value") String value) {
        Intrinsics.j(value, "value");
        this.value = value;
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

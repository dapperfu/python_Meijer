package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisHighValuePromoRequest;", "", "", "", "applied", "notApplied", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/HybrisHighValuePromoRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisHighValuePromoRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> applied;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> notApplied;

    /* JADX WARN: Multi-variable type inference failed */
    public HybrisHighValuePromoRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final HybrisHighValuePromoRequest copy(@g(name = "applied") List<String> applied, @g(name = "notApplied") List<String> notApplied) {
        Intrinsics.j(applied, "applied");
        Intrinsics.j(notApplied, "notApplied");
        return new HybrisHighValuePromoRequest(applied, notApplied);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisHighValuePromoRequest)) {
            return false;
        }
        HybrisHighValuePromoRequest hybrisHighValuePromoRequest = (HybrisHighValuePromoRequest) other;
        return Intrinsics.e(this.applied, hybrisHighValuePromoRequest.applied) && Intrinsics.e(this.notApplied, hybrisHighValuePromoRequest.notApplied);
    }

    public int hashCode() {
        return (this.applied.hashCode() * 31) + this.notApplied.hashCode();
    }

    public String toString() {
        return "HybrisHighValuePromoRequest(applied=" + this.applied + ", notApplied=" + this.notApplied + ')';
    }

    public HybrisHighValuePromoRequest(@g(name = "applied") List<String> applied, @g(name = "notApplied") List<String> notApplied) {
        Intrinsics.j(applied, "applied");
        Intrinsics.j(notApplied, "notApplied");
        this.applied = applied;
        this.notApplied = notApplied;
    }

    public final List<String> a() {
        return this.applied;
    }

    public final List<String> b() {
        return this.notApplied;
    }

    public /* synthetic */ HybrisHighValuePromoRequest(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? CollectionsKt.m() : list2);
    }
}

package com.meijer.mobile.store.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreListings;", "", "", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "pointOfServices", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/store/model/hybris/HybrisStoreListings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisStoreListings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPointOfService> pointOfServices;

    /* JADX WARN: Multi-variable type inference failed */
    public HybrisStoreListings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final HybrisStoreListings copy(@g(name = "pointOfServices") List<HybrisPointOfService> pointOfServices) {
        Intrinsics.j(pointOfServices, "pointOfServices");
        return new HybrisStoreListings(pointOfServices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HybrisStoreListings) && Intrinsics.e(this.pointOfServices, ((HybrisStoreListings) other).pointOfServices);
    }

    public int hashCode() {
        return this.pointOfServices.hashCode();
    }

    public String toString() {
        return "HybrisStoreListings(pointOfServices=" + this.pointOfServices + ')';
    }

    public HybrisStoreListings(@g(name = "pointOfServices") List<HybrisPointOfService> pointOfServices) {
        Intrinsics.j(pointOfServices, "pointOfServices");
        this.pointOfServices = pointOfServices;
    }

    public final List<HybrisPointOfService> a() {
        return this.pointOfServices;
    }

    public /* synthetic */ HybrisStoreListings(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}

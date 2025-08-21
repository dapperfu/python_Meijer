package com.meijer.mobile.meijer.activity.find.viewmodel;

import Gp.ProductInfoForReviewSubmit;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/l0;", "", "Ljava/util/UUID;", "uuid", "LGp/a;", "productInfo", "<init>", "(Ljava/util/UUID;LGp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "LGp/a;", "()LGp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.l0, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class WriteReview implements C12358e0.InterfaceC12363e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID uuid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductInfoForReviewSubmit productInfo;

    public WriteReview(UUID uuid, ProductInfoForReviewSubmit productInfo) {
        Intrinsics.j(uuid, "uuid");
        Intrinsics.j(productInfo, "productInfo");
        this.uuid = uuid;
        this.productInfo = productInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WriteReview)) {
            return false;
        }
        WriteReview writeReview = (WriteReview) other;
        return Intrinsics.e(this.uuid, writeReview.uuid) && Intrinsics.e(this.productInfo, writeReview.productInfo);
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.productInfo.hashCode();
    }

    public String toString() {
        return "WriteReview(uuid=" + this.uuid + ", productInfo=" + this.productInfo + ')';
    }

    /* renamed from: a, reason: from getter */
    public final ProductInfoForReviewSubmit getProductInfo() {
        return this.productInfo;
    }

    public /* synthetic */ WriteReview(UUID uuid, ProductInfoForReviewSubmit productInfoForReviewSubmit, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, productInfoForReviewSubmit);
    }
}

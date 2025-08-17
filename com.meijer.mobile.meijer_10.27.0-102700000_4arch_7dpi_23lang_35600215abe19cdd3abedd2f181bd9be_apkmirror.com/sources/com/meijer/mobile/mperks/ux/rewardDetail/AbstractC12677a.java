package com.meijer.mobile.mperks.ux.rewardDetail;

import Co.ProductFullDetails;
import bo.RewardDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/a;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a$a;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC12677a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/a$a;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a;", "", "maxItemCount", "Lbo/j;", "rewardDetail", "<init>", "(ILbo/j;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMaxItemCount", "b", "Lbo/j;", "()Lbo/j;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class GetProductsDetail extends AbstractC12677a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxItemCount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RewardDetail rewardDetail;

        public /* synthetic */ GetProductsDetail(int i10, RewardDetail rewardDetail, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 10 : i10, rewardDetail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetProductsDetail)) {
                return false;
            }
            GetProductsDetail getProductsDetail = (GetProductsDetail) other;
            return this.maxItemCount == getProductsDetail.maxItemCount && Intrinsics.e(this.rewardDetail, getProductsDetail.rewardDetail);
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxItemCount) * 31) + this.rewardDetail.hashCode();
        }

        public String toString() {
            return "GetProductsDetail(maxItemCount=" + this.maxItemCount + ", rewardDetail=" + this.rewardDetail + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProductsDetail(int i10, RewardDetail rewardDetail) {
            super(null);
            Intrinsics.j(rewardDetail, "rewardDetail");
            this.maxItemCount = i10;
            this.rewardDetail = rewardDetail;
        }

        /* renamed from: a, reason: from getter */
        public final RewardDetail getRewardDetail() {
            return this.rewardDetail;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/a$b;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.a$b, reason: from toString */
    public static final /* data */ class StepperChange extends AbstractC12677a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepperChange)) {
                return false;
            }
            StepperChange stepperChange = (StepperChange) other;
            return Intrinsics.e(this.product, stepperChange.product) && Double.compare(this.quantityToUpdate, stepperChange.quantityToUpdate) == 0;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
        }

        public String toString() {
            return "StepperChange(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StepperChange(ProductFullDetails product, double d10) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.quantityToUpdate = d10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantityToUpdate() {
            return this.quantityToUpdate;
        }
    }

    public /* synthetic */ AbstractC12677a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12677a() {
    }
}

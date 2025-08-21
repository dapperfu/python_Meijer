package com.meijer.mobile.meijer.activity.find.productdetail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "", "<init>", "()V", "b", "a", "c", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class n2 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "a", "Lnk/f;", "()Lnk/f;", "product", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.n2$a, reason: from toString */
    public static final /* data */ class BazaarVoiceReviews extends n2 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BazaarVoiceReviews) && Intrinsics.e(this.product, ((BazaarVoiceReviews) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "BazaarVoiceReviews(product=" + this.product + ')';
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "Lnk/f;", "product", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.n2$b, reason: from toString */
    public static final /* data */ class FrequentlyBoughtTogether extends n2 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrequentlyBoughtTogether) && Intrinsics.e(this.product, ((FrequentlyBoughtTogether) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "FrequentlyBoughtTogether(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrequentlyBoughtTogether(nk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/n2$c;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "Lnk/f;", "product", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.n2$c, reason: from toString */
    public static final /* data */ class Product extends n2 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Product) && Intrinsics.e(this.product, ((Product) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "Product(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(nk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProduct() {
            return this.product;
        }
    }

    public /* synthetic */ n2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n2() {
    }
}

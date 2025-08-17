package com.meijer.mobile.meijer.activity.find.productdetail;

import Gp.ReviewItem;
import Kp.ProductReviewDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\n\u000b\u0006\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "", "Lmk/f;", "product", "<init>", "(Lmk/f;)V", "a", "Lmk/f;", "getProduct", "()Lmk/f;", "g", "d", "b", "f", "e", "c", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$e;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mk.f product;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/m;", "product", "LGp/e;", "reviewItem", "<init>", "(Lmk/m;LGp/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/m;", "getProduct", "()Lmk/m;", "c", "LGp/e;", "a", "()LGp/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$a, reason: from toString */
    public static final /* data */ class ReadMore extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.m product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReviewItem reviewItem;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMore)) {
                return false;
            }
            ReadMore readMore = (ReadMore) other;
            return Intrinsics.e(this.product, readMore.product) && Intrinsics.e(this.reviewItem, readMore.reviewItem);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.reviewItem.hashCode();
        }

        public String toString() {
            return "ReadMore(product=" + this.product + ", reviewItem=" + this.reviewItem + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadMore(mk.m product, ReviewItem reviewItem) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(reviewItem, "reviewItem");
            this.product = product;
            this.reviewItem = reviewItem;
        }

        /* renamed from: a, reason: from getter */
        public final ReviewItem getReviewItem() {
            return this.reviewItem;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$b;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/f;", "product", "LKp/b;", "reviewDetails", "<init>", "(Lmk/f;LKp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/f;", "getProduct", "()Lmk/f;", "c", "LKp/b;", "a", "()LKp/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$b, reason: from toString */
    public static final /* data */ class Report extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductReviewDetails reviewDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Report)) {
                return false;
            }
            Report report = (Report) other;
            return Intrinsics.e(this.product, report.product) && Intrinsics.e(this.reviewDetails, report.reviewDetails);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.reviewDetails.hashCode();
        }

        public String toString() {
            return "Report(product=" + this.product + ", reviewDetails=" + this.reviewDetails + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Report(mk.f product, ProductReviewDetails reviewDetails) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(reviewDetails, "reviewDetails");
            this.product = product;
            this.reviewDetails = reviewDetails;
        }

        /* renamed from: a, reason: from getter */
        public final ProductReviewDetails getReviewDetails() {
            return this.reviewDetails;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/c;", "product", "", "imageUrl", "<init>", "(Lmk/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/c;", "()Lmk/c;", "c", "Ljava/lang/String;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$c, reason: from toString */
    public static final /* data */ class SeeAll extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeeAll)) {
                return false;
            }
            SeeAll seeAll = (SeeAll) other;
            return Intrinsics.e(this.product, seeAll.product) && Intrinsics.e(this.imageUrl, seeAll.imageUrl);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.imageUrl.hashCode();
        }

        public String toString() {
            return "SeeAll(product=" + this.product + ", imageUrl=" + this.imageUrl + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SeeAll(mk.c product, String imageUrl) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(imageUrl, "imageUrl");
            this.product = product;
            this.imageUrl = imageUrl;
        }

        /* renamed from: a, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: b, reason: from getter */
        public mk.c getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "", "index", "Lmk/f;", "product", "LGp/e;", "reviewItem", "<init>", "(ILmk/f;LGp/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "c", "Lmk/f;", "getProduct", "()Lmk/f;", "d", "LGp/e;", "()LGp/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$d, reason: from toString */
    public static final /* data */ class ShowReviewGallery extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReviewItem reviewItem;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowReviewGallery)) {
                return false;
            }
            ShowReviewGallery showReviewGallery = (ShowReviewGallery) other;
            return this.index == showReviewGallery.index && Intrinsics.e(this.product, showReviewGallery.product) && Intrinsics.e(this.reviewItem, showReviewGallery.reviewItem);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + this.product.hashCode()) * 31) + this.reviewItem.hashCode();
        }

        public String toString() {
            return "ShowReviewGallery(index=" + this.index + ", product=" + this.product + ", reviewItem=" + this.reviewItem + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowReviewGallery(int i10, mk.f product, ReviewItem reviewItem) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(reviewItem, "reviewItem");
            this.index = i10;
            this.product = product;
            this.reviewItem = reviewItem;
        }

        /* renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: b, reason: from getter */
        public final ReviewItem getReviewItem() {
            return this.reviewItem;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$e;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/f;", "product", "LKp/b;", "reviewDetails", "<init>", "(Lmk/f;LKp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/f;", "getProduct", "()Lmk/f;", "c", "LKp/b;", "a", "()LKp/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$e, reason: from toString */
    public static final /* data */ class VoteNegative extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductReviewDetails reviewDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoteNegative)) {
                return false;
            }
            VoteNegative voteNegative = (VoteNegative) other;
            return Intrinsics.e(this.product, voteNegative.product) && Intrinsics.e(this.reviewDetails, voteNegative.reviewDetails);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.reviewDetails.hashCode();
        }

        public String toString() {
            return "VoteNegative(product=" + this.product + ", reviewDetails=" + this.reviewDetails + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoteNegative(mk.f product, ProductReviewDetails reviewDetails) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(reviewDetails, "reviewDetails");
            this.product = product;
            this.reviewDetails = reviewDetails;
        }

        /* renamed from: a, reason: from getter */
        public final ProductReviewDetails getReviewDetails() {
            return this.reviewDetails;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/f;", "product", "LKp/b;", "reviewDetails", "<init>", "(Lmk/f;LKp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/f;", "getProduct", "()Lmk/f;", "c", "LKp/b;", "a", "()LKp/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$f, reason: from toString */
    public static final /* data */ class VotePositive extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductReviewDetails reviewDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VotePositive)) {
                return false;
            }
            VotePositive votePositive = (VotePositive) other;
            return Intrinsics.e(this.product, votePositive.product) && Intrinsics.e(this.reviewDetails, votePositive.reviewDetails);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.reviewDetails.hashCode();
        }

        public String toString() {
            return "VotePositive(product=" + this.product + ", reviewDetails=" + this.reviewDetails + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VotePositive(mk.f product, ProductReviewDetails reviewDetails) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(reviewDetails, "reviewDetails");
            this.product = product;
            this.reviewDetails = reviewDetails;
        }

        /* renamed from: a, reason: from getter */
        public final ProductReviewDetails getReviewDetails() {
            return this.reviewDetails;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Lmk/c;", "product", "", "imageUrl", "<init>", "(Lmk/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/c;", "()Lmk/c;", "c", "Ljava/lang/String;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.productdetail.a2$g, reason: from toString */
    public static final /* data */ class WriteReview extends a2 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.c product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WriteReview)) {
                return false;
            }
            WriteReview writeReview = (WriteReview) other;
            return Intrinsics.e(this.product, writeReview.product) && Intrinsics.e(this.imageUrl, writeReview.imageUrl);
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.imageUrl.hashCode();
        }

        public String toString() {
            return "WriteReview(product=" + this.product + ", imageUrl=" + this.imageUrl + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriteReview(mk.c product, String imageUrl) {
            super(product, null);
            Intrinsics.j(product, "product");
            Intrinsics.j(imageUrl, "imageUrl");
            this.product = product;
            this.imageUrl = imageUrl;
        }

        /* renamed from: a, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: b, reason: from getter */
        public mk.c getProduct() {
            return this.product;
        }
    }

    public /* synthetic */ a2(mk.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    private a2(mk.f fVar) {
        this.product = fVar;
    }
}

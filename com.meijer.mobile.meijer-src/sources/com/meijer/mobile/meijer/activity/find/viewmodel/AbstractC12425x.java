package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ProductFullDetails;
import gi.GoogleAdAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "", "<init>", "()V", "g", "d", "f", "b", "a", "e", "c", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC12425x {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "Lnk/f;", "productIdentity", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$a, reason: from toString */
    public static final /* data */ class GetBazaarVoiceReviews extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f productIdentity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetBazaarVoiceReviews) && Intrinsics.e(this.productIdentity, ((GetBazaarVoiceReviews) other).productIdentity);
        }

        public int hashCode() {
            return this.productIdentity.hashCode();
        }

        public String toString() {
            return "GetBazaarVoiceReviews(productIdentity=" + this.productIdentity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetBazaarVoiceReviews(nk.f productIdentity) {
            super(null);
            Intrinsics.j(productIdentity, "productIdentity");
            this.productIdentity = productIdentity;
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProductIdentity() {
            return this.productIdentity;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "Lnk/f;", "productIdentity", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$b, reason: from toString */
    public static final /* data */ class GetFrequentlyBoughtTogetherProducts extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.f productIdentity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetFrequentlyBoughtTogetherProducts) && Intrinsics.e(this.productIdentity, ((GetFrequentlyBoughtTogetherProducts) other).productIdentity);
        }

        public int hashCode() {
            return this.productIdentity.hashCode();
        }

        public String toString() {
            return "GetFrequentlyBoughtTogetherProducts(productIdentity=" + this.productIdentity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetFrequentlyBoughtTogetherProducts(nk.f productIdentity) {
            super(null);
            Intrinsics.j(productIdentity, "productIdentity");
            this.productIdentity = productIdentity;
        }

        /* renamed from: a, reason: from getter */
        public final nk.f getProductIdentity() {
            return this.productIdentity;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$c, reason: from toString */
    public static final /* data */ class GoogleAdClicked extends AbstractC12425x {

        /* renamed from: b, reason: collision with root package name */
        public static final int f109906b = GoogleAdAnalytics.f134240f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdAnalytics analytics;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleAdClicked) && Intrinsics.e(this.analytics, ((GoogleAdClicked) other).analytics);
        }

        public int hashCode() {
            return this.analytics.hashCode();
        }

        public String toString() {
            return "GoogleAdClicked(analytics=" + this.analytics + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAdClicked(GoogleAdAnalytics analytics) {
            super(null);
            Intrinsics.j(analytics, "analytics");
            this.analytics = analytics;
        }

        /* renamed from: a, reason: from getter */
        public final GoogleAdAnalytics getAnalytics() {
            return this.analytics;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "", "isFromCLP", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$d, reason: from toString */
    public static final /* data */ class IsFromCLP extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromCLP;

        public IsFromCLP(boolean z10) {
            super(null);
            this.isFromCLP = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsFromCLP) && this.isFromCLP == ((IsFromCLP) other).isFromCLP;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromCLP);
        }

        public String toString() {
            return "IsFromCLP(isFromCLP=" + this.isFromCLP + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsFromCLP() {
            return this.isFromCLP;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$e */
    public static final /* data */ class e extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name */
        public static final e f109909a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 905029413;
        }

        public String toString() {
            return "ReviewSubmittedSuccessAction";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$f, reason: from toString */
    public static final /* data */ class UpdateCarouselProductEntry extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateCarouselProductEntry)) {
                return false;
            }
            UpdateCarouselProductEntry updateCarouselProductEntry = (UpdateCarouselProductEntry) other;
            return Intrinsics.e(this.product, updateCarouselProductEntry.product) && Double.compare(this.quantityToUpdate, updateCarouselProductEntry.quantityToUpdate) == 0;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
        }

        public String toString() {
            return "UpdateCarouselProductEntry(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCarouselProductEntry(ProductFullDetails product, double d10) {
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/x$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "", "quantityRequested", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.x$g, reason: from toString */
    public static final /* data */ class UpdateEntry extends AbstractC12425x {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityRequested;

        public UpdateEntry(double d10) {
            super(null);
            this.quantityRequested = d10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateEntry) && Double.compare(this.quantityRequested, ((UpdateEntry) other).quantityRequested) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.quantityRequested);
        }

        public String toString() {
            return "UpdateEntry(quantityRequested=" + this.quantityRequested + ')';
        }

        /* renamed from: a, reason: from getter */
        public final double getQuantityRequested() {
            return this.quantityRequested;
        }
    }

    public /* synthetic */ AbstractC12425x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12425x() {
    }
}

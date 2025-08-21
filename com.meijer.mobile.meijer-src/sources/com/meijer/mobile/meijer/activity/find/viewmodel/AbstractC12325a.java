package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ProductFullDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "", "<init>", "()V", "a", "b", "e", "c", "d", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC12325a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "", "LCo/h;", "productList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class CarouselIsVisible extends AbstractC12325a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> productList;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CarouselIsVisible) && Intrinsics.e(this.productList, ((CarouselIsVisible) other).productList);
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        public String toString() {
            return "CarouselIsVisible(productList=" + this.productList + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselIsVisible(List<ProductFullDetails> productList) {
            super(null);
            Intrinsics.j(productList, "productList");
            this.productList = productList;
        }

        public final List<ProductFullDetails> a() {
            return this.productList;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "", "LCo/h;", "productList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a$b, reason: from toString */
    public static final /* data */ class NewItemScrolling extends AbstractC12325a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> productList;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewItemScrolling) && Intrinsics.e(this.productList, ((NewItemScrolling) other).productList);
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        public String toString() {
            return "NewItemScrolling(productList=" + this.productList + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewItemScrolling(List<ProductFullDetails> productList) {
            super(null);
            Intrinsics.j(productList, "productList");
            this.productList = productList;
        }

        public final List<ProductFullDetails> a() {
            return this.productList;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "LCo/h;", "productList", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a$c, reason: from toString */
    public static final /* data */ class OnClickCriteoBeacon extends AbstractC12325a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails productList;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnClickCriteoBeacon) && Intrinsics.e(this.productList, ((OnClickCriteoBeacon) other).productList);
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        public String toString() {
            return "OnClickCriteoBeacon(productList=" + this.productList + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnClickCriteoBeacon(ProductFullDetails productList) {
            super(null);
            Intrinsics.j(productList, "productList");
            this.productList = productList;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProductList() {
            return this.productList;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "LCo/h;", "productList", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a$d, reason: from toString */
    public static final /* data */ class OnLoadCriteoBeacon extends AbstractC12325a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails productList;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnLoadCriteoBeacon) && Intrinsics.e(this.productList, ((OnLoadCriteoBeacon) other).productList);
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        public String toString() {
            return "OnLoadCriteoBeacon(productList=" + this.productList + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadCriteoBeacon(ProductFullDetails productList) {
            super(null);
            Intrinsics.j(productList, "productList");
            this.productList = productList;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProductList() {
            return this.productList;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/a$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "LCo/h;", "productList", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.a$e, reason: from toString */
    public static final /* data */ class OnViewCriteoBeacon extends AbstractC12325a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails productList;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnViewCriteoBeacon) && Intrinsics.e(this.productList, ((OnViewCriteoBeacon) other).productList);
        }

        public int hashCode() {
            return this.productList.hashCode();
        }

        public String toString() {
            return "OnViewCriteoBeacon(productList=" + this.productList + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCriteoBeacon(ProductFullDetails productList) {
            super(null);
            Intrinsics.j(productList, "productList");
            this.productList = productList;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProductList() {
            return this.productList;
        }
    }

    public /* synthetic */ AbstractC12325a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12325a() {
    }
}

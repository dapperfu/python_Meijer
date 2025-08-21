package Xr;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LXr/a;", "", "<init>", "()V", "b", "c", "a", "d", "e", "LXr/a$a;", "LXr/a$b;", "LXr/a$c;", "LXr/a$d;", "LXr/a$e;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001d\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u001e\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"LXr/a$a;", "LXr/a;", "", "imageURL", "title", "bundleTag", "analyticTag", "imageDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "setImageURL", "(Ljava/lang/String;)V", "b", "e", "setTitle", "c", "setBundleTag", "setAnalyticTag", "setImageDescription", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Ad extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String imageURL;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String title;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String bundleTag;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private String analyticTag;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private String imageDescription;

        public /* synthetic */ Ad(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ad)) {
                return false;
            }
            Ad ad2 = (Ad) other;
            return Intrinsics.e(this.imageURL, ad2.imageURL) && Intrinsics.e(this.title, ad2.title) && Intrinsics.e(this.bundleTag, ad2.bundleTag) && Intrinsics.e(this.analyticTag, ad2.analyticTag) && Intrinsics.e(this.imageDescription, ad2.imageDescription);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(String imageURL, String str, String str2, String str3, String str4) {
            super(null);
            Intrinsics.j(imageURL, "imageURL");
            this.imageURL = imageURL;
            this.title = str;
            this.bundleTag = str2;
            this.analyticTag = str3;
            this.imageDescription = str4;
        }

        /* renamed from: a, reason: from getter */
        public final String getAnalyticTag() {
            return this.analyticTag;
        }

        /* renamed from: b, reason: from getter */
        public final String getBundleTag() {
            return this.bundleTag;
        }

        /* renamed from: c, reason: from getter */
        public final String getImageDescription() {
            return this.imageDescription;
        }

        /* renamed from: d, reason: from getter */
        public final String getImageURL() {
            return this.imageURL;
        }

        /* renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.imageURL.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bundleTag;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.analyticTag;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageDescription;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Ad(imageURL=" + this.imageURL + ", title=" + this.title + ", bundleTag=" + this.bundleTag + ", analyticTag=" + this.analyticTag + ", imageDescription=" + this.imageDescription + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LXr/a$b;", "LXr/a;", "LXr/c;", "couponListItemDecorator", "<init>", "(LXr/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXr/c;", "()LXr/c;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.a$b, reason: from toString */
    public static final /* data */ class Coupon extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponListItemDecorator couponListItemDecorator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Coupon) && Intrinsics.e(this.couponListItemDecorator, ((Coupon) other).couponListItemDecorator);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Coupon(CouponListItemDecorator couponListItemDecorator) {
            super(null);
            Intrinsics.j(couponListItemDecorator, "couponListItemDecorator");
            this.couponListItemDecorator = couponListItemDecorator;
        }

        /* renamed from: a, reason: from getter */
        public final CouponListItemDecorator getCouponListItemDecorator() {
            return this.couponListItemDecorator;
        }

        public int hashCode() {
            return this.couponListItemDecorator.hashCode();
        }

        public String toString() {
            return "Coupon(couponListItemDecorator=" + this.couponListItemDecorator + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"LXr/a$c;", "LXr/a;", "", "name", "", "size", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.a$c, reason: from toString */
    public static final /* data */ class Header extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int size;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.e(this.name, header.name) && this.size == header.size;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(String name, int i10) {
            super(null);
            Intrinsics.j(name, "name");
            this.name = name;
            this.size = i10;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.size);
        }

        public String toString() {
            return "Header(name=" + this.name + ", size=" + this.size + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LXr/a$d;", "LXr/a;", "", "specialOffersUrl", "", "isClickable", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.a$d, reason: from toString */
    public static final /* data */ class SpecialOffersBanner extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String specialOffersUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isClickable;

        public /* synthetic */ SpecialOffersBanner(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? true : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpecialOffersBanner)) {
                return false;
            }
            SpecialOffersBanner specialOffersBanner = (SpecialOffersBanner) other;
            return Intrinsics.e(this.specialOffersUrl, specialOffersBanner.specialOffersUrl) && this.isClickable == specialOffersBanner.isClickable;
        }

        public SpecialOffersBanner(String str, boolean z10) {
            super(null);
            this.specialOffersUrl = str;
            this.isClickable = z10;
        }

        /* renamed from: a, reason: from getter */
        public final String getSpecialOffersUrl() {
            return this.specialOffersUrl;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsClickable() {
            return this.isClickable;
        }

        public int hashCode() {
            String str = this.specialOffersUrl;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isClickable);
        }

        public String toString() {
            return "SpecialOffersBanner(specialOffersUrl=" + this.specialOffersUrl + ", isClickable=" + this.isClickable + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LXr/a$e;", "LXr/a;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xr.a$e, reason: from toString */
    public static final /* data */ class SpecialOffersHeader extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpecialOffersHeader) && Intrinsics.e(this.title, ((SpecialOffersHeader) other).title);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpecialOffersHeader(String title) {
            super(null);
            Intrinsics.j(title, "title");
            this.title = title;
        }

        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "SpecialOffersHeader(title=" + this.title + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}

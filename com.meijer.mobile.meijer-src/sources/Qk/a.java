package Qk;

import ii.TrackingData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LQk/a;", "", "<init>", "()V", "a", "c", "b", "d", "e", "LQk/a$a;", "LQk/a$b;", "LQk/a$c;", "LQk/a$d;", "LQk/a$e;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LQk/a$a;", "LQk/a;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Lii/f;", "()Lii/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qk.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Clip extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ Clip(Pk.c cVar, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Clip)) {
                return false;
            }
            Clip clip = (Clip) other;
            return Intrinsics.e(this.coupon, clip.coupon) && Intrinsics.e(this.trackingData, clip.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Clip(Pk.c coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = this.coupon.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "Clip(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LQk/a$b;", "LQk/a;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Lii/f;", "getTrackingData", "()Lii/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qk.a$b, reason: from toString */
    public static final /* data */ class NotInterested extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ NotInterested(Pk.c cVar, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotInterested)) {
                return false;
            }
            NotInterested notInterested = (NotInterested) other;
            return Intrinsics.e(this.coupon, notInterested.coupon) && Intrinsics.e(this.trackingData, notInterested.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotInterested(Pk.c coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        public int hashCode() {
            int iHashCode = this.coupon.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "NotInterested(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LQk/a$c;", "LQk/a;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Lii/f;", "getTrackingData", "()Lii/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qk.a$c, reason: from toString */
    public static final /* data */ class Unclip extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ Unclip(Pk.c cVar, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unclip)) {
                return false;
            }
            Unclip unclip = (Unclip) other;
            return Intrinsics.e(this.coupon, unclip.coupon) && Intrinsics.e(this.trackingData, unclip.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unclip(Pk.c coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        public int hashCode() {
            int iHashCode = this.coupon.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "Unclip(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LQk/a$d;", "LQk/a;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Lii/f;", "()Lii/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qk.a$d, reason: from toString */
    public static final /* data */ class ViewCouponDetails extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ ViewCouponDetails(Pk.c cVar, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewCouponDetails)) {
                return false;
            }
            ViewCouponDetails viewCouponDetails = (ViewCouponDetails) other;
            return Intrinsics.e(this.coupon, viewCouponDetails.coupon) && Intrinsics.e(this.trackingData, viewCouponDetails.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewCouponDetails(Pk.c coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = this.coupon.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "ViewCouponDetails(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LQk/a$e;", "LQk/a;", "LQk/c;", "page", "Lii/f;", "trackingData", "<init>", "(LQk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQk/c;", "getPage", "()LQk/c;", "b", "Lii/f;", "getTrackingData", "()Lii/f;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qk.a$e, reason: from toString */
    public static final /* data */ class ViewCouponList extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c page;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public /* synthetic */ ViewCouponList(c cVar, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i10 & 2) != 0 ? null : trackingData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewCouponList)) {
                return false;
            }
            ViewCouponList viewCouponList = (ViewCouponList) other;
            return this.page == viewCouponList.page && Intrinsics.e(this.trackingData, viewCouponList.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewCouponList(c page, TrackingData trackingData) {
            super(null);
            Intrinsics.j(page, "page");
            this.page = page;
            this.trackingData = trackingData;
        }

        public int hashCode() {
            int iHashCode = this.page.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "ViewCouponList(page=" + this.page + ", trackingData=" + this.trackingData + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}

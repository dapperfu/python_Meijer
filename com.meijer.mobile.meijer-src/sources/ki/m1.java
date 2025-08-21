package ki;

import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001:\u0002\u0005\u0003J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lki/m1;", "", "Lki/q1$r;", "a", "(Lki/q1$r;)Lki/q1$r;", "b", "Lki/m1$a;", "Lki/m1$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public interface m1 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lki/m1$a;", "Lki/m1;", "Lki/q1$r;", "clipped", "incentive", "loading", "success", "error", "<init>", "(Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;)V", "c", "()Lki/m1$a;", "d", "(Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;)Lki/m1$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$r;", "e", "()Lki/q1$r;", "b", "g", "h", "i", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.m1$a, reason: from toString */
    public static final /* data */ class ClippableCouponTagTemplates implements m1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag clipped;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag incentive;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag loading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag success;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag error;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClippableCouponTagTemplates)) {
                return false;
            }
            ClippableCouponTagTemplates clippableCouponTagTemplates = (ClippableCouponTagTemplates) other;
            return Intrinsics.e(this.clipped, clippableCouponTagTemplates.clipped) && Intrinsics.e(this.incentive, clippableCouponTagTemplates.incentive) && Intrinsics.e(this.loading, clippableCouponTagTemplates.loading) && Intrinsics.e(this.success, clippableCouponTagTemplates.success) && Intrinsics.e(this.error, clippableCouponTagTemplates.error);
        }

        public ClippableCouponTagTemplates(q1.Tag clipped, q1.Tag incentive, q1.Tag loading, q1.Tag success, q1.Tag error) {
            Intrinsics.j(clipped, "clipped");
            Intrinsics.j(incentive, "incentive");
            Intrinsics.j(loading, "loading");
            Intrinsics.j(success, "success");
            Intrinsics.j(error, "error");
            this.clipped = clipped;
            this.incentive = incentive;
            this.loading = loading;
            this.success = success;
            this.error = error;
        }

        public final ClippableCouponTagTemplates c() {
            return d(b(this.clipped), b(this.incentive), b(this.loading), b(this.success), b(this.error));
        }

        public final ClippableCouponTagTemplates d(q1.Tag clipped, q1.Tag incentive, q1.Tag loading, q1.Tag success, q1.Tag error) {
            Intrinsics.j(clipped, "clipped");
            Intrinsics.j(incentive, "incentive");
            Intrinsics.j(loading, "loading");
            Intrinsics.j(success, "success");
            Intrinsics.j(error, "error");
            return new ClippableCouponTagTemplates(clipped, incentive, loading, success, error);
        }

        /* renamed from: e, reason: from getter */
        public final q1.Tag getClipped() {
            return this.clipped;
        }

        /* renamed from: f, reason: from getter */
        public final q1.Tag getError() {
            return this.error;
        }

        /* renamed from: g, reason: from getter */
        public final q1.Tag getIncentive() {
            return this.incentive;
        }

        /* renamed from: h, reason: from getter */
        public final q1.Tag getLoading() {
            return this.loading;
        }

        public int hashCode() {
            return (((((((this.clipped.hashCode() * 31) + this.incentive.hashCode()) * 31) + this.loading.hashCode()) * 31) + this.success.hashCode()) * 31) + this.error.hashCode();
        }

        /* renamed from: i, reason: from getter */
        public final q1.Tag getSuccess() {
            return this.success;
        }

        public String toString() {
            return "ClippableCouponTagTemplates(clipped=" + this.clipped + ", incentive=" + this.incentive + ", loading=" + this.loading + ", success=" + this.success + ", error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b$\u0010\u001d¨\u0006%"}, d2 = {"Lki/m1$b;", "Lki/m1;", "Lki/q1$r;", "lowStock", "pickupOnly", "outOfStock", "complexPromo", "sponsored", "mperks", "<init>", "(Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;)V", "c", "()Lki/m1$b;", "d", "(Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;Lki/q1$r;)Lki/m1$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$r;", "g", "()Lki/q1$r;", "b", "j", "i", "f", "e", "k", "h", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.m1$b, reason: from toString */
    public static final /* data */ class ProductCardTags implements m1 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f142158g = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag lowStock;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag pickupOnly;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag outOfStock;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag complexPromo;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag sponsored;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.Tag mperks;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductCardTags)) {
                return false;
            }
            ProductCardTags productCardTags = (ProductCardTags) other;
            return Intrinsics.e(this.lowStock, productCardTags.lowStock) && Intrinsics.e(this.pickupOnly, productCardTags.pickupOnly) && Intrinsics.e(this.outOfStock, productCardTags.outOfStock) && Intrinsics.e(this.complexPromo, productCardTags.complexPromo) && Intrinsics.e(this.sponsored, productCardTags.sponsored) && Intrinsics.e(this.mperks, productCardTags.mperks);
        }

        public ProductCardTags(q1.Tag lowStock, q1.Tag pickupOnly, q1.Tag outOfStock, q1.Tag complexPromo, q1.Tag sponsored, q1.Tag mperks) {
            Intrinsics.j(lowStock, "lowStock");
            Intrinsics.j(pickupOnly, "pickupOnly");
            Intrinsics.j(outOfStock, "outOfStock");
            Intrinsics.j(complexPromo, "complexPromo");
            Intrinsics.j(sponsored, "sponsored");
            Intrinsics.j(mperks, "mperks");
            this.lowStock = lowStock;
            this.pickupOnly = pickupOnly;
            this.outOfStock = outOfStock;
            this.complexPromo = complexPromo;
            this.sponsored = sponsored;
            this.mperks = mperks;
        }

        public static /* synthetic */ ProductCardTags e(ProductCardTags productCardTags, q1.Tag tag, q1.Tag tag2, q1.Tag tag3, q1.Tag tag4, q1.Tag tag5, q1.Tag tag6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                tag = productCardTags.lowStock;
            }
            if ((i10 & 2) != 0) {
                tag2 = productCardTags.pickupOnly;
            }
            if ((i10 & 4) != 0) {
                tag3 = productCardTags.outOfStock;
            }
            if ((i10 & 8) != 0) {
                tag4 = productCardTags.complexPromo;
            }
            if ((i10 & 16) != 0) {
                tag5 = productCardTags.sponsored;
            }
            if ((i10 & 32) != 0) {
                tag6 = productCardTags.mperks;
            }
            q1.Tag tag7 = tag5;
            q1.Tag tag8 = tag6;
            return productCardTags.d(tag, tag2, tag3, tag4, tag7, tag8);
        }

        public final ProductCardTags c() {
            return d(a(this.lowStock), a(this.pickupOnly), a(this.outOfStock), a(this.complexPromo), a(this.sponsored), a(this.mperks));
        }

        public final ProductCardTags d(q1.Tag lowStock, q1.Tag pickupOnly, q1.Tag outOfStock, q1.Tag complexPromo, q1.Tag sponsored, q1.Tag mperks) {
            Intrinsics.j(lowStock, "lowStock");
            Intrinsics.j(pickupOnly, "pickupOnly");
            Intrinsics.j(outOfStock, "outOfStock");
            Intrinsics.j(complexPromo, "complexPromo");
            Intrinsics.j(sponsored, "sponsored");
            Intrinsics.j(mperks, "mperks");
            return new ProductCardTags(lowStock, pickupOnly, outOfStock, complexPromo, sponsored, mperks);
        }

        /* renamed from: f, reason: from getter */
        public final q1.Tag getComplexPromo() {
            return this.complexPromo;
        }

        /* renamed from: g, reason: from getter */
        public final q1.Tag getLowStock() {
            return this.lowStock;
        }

        /* renamed from: h, reason: from getter */
        public final q1.Tag getMperks() {
            return this.mperks;
        }

        public int hashCode() {
            return (((((((((this.lowStock.hashCode() * 31) + this.pickupOnly.hashCode()) * 31) + this.outOfStock.hashCode()) * 31) + this.complexPromo.hashCode()) * 31) + this.sponsored.hashCode()) * 31) + this.mperks.hashCode();
        }

        /* renamed from: i, reason: from getter */
        public final q1.Tag getOutOfStock() {
            return this.outOfStock;
        }

        /* renamed from: j, reason: from getter */
        public final q1.Tag getPickupOnly() {
            return this.pickupOnly;
        }

        /* renamed from: k, reason: from getter */
        public final q1.Tag getSponsored() {
            return this.sponsored;
        }

        public String toString() {
            return "ProductCardTags(lowStock=" + this.lowStock + ", pickupOnly=" + this.pickupOnly + ", outOfStock=" + this.outOfStock + ", complexPromo=" + this.complexPromo + ", sponsored=" + this.sponsored + ", mperks=" + this.mperks + ')';
        }
    }

    default q1.Tag a(q1.Tag tag) {
        q1.h icon;
        Intrinsics.j(tag, "<this>");
        q1.Label label = tag.getLabel();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 2;
        q1.Label labelY = q1.Label.y(label, androidx.compose.foundation.layout.D.l(companion, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10)), null, null, null, 0, false, 0, null, null, 510, null);
        q1.h icon2 = tag.getIcon();
        if (icon2 instanceof q1.h.AnimatedIcon) {
            float f11 = 0;
            icon = q1.h.AnimatedIcon.y((q1.h.AnimatedIcon) tag.getIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.l(companion, H1.h.p(f11), H1.h.p(f10), H1.h.p(f11), H1.h.p(f10)), H1.h.p(16)), 63, null);
        } else if (icon2 instanceof q1.h.DrawableIcon) {
            float f12 = 0;
            icon = q1.h.DrawableIcon.y((q1.h.DrawableIcon) tag.getIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.l(companion, H1.h.p(f12), H1.h.p(f10), H1.h.p(f12), H1.h.p(f10)), H1.h.p(16)), 63, null);
        } else {
            if (!Intrinsics.e(icon2, q1.h.c.f142330a)) {
                throw new NoWhenBranchMatchedException();
            }
            icon = tag.getIcon();
        }
        return q1.Tag.y(tag, null, labelY, icon, null, 9, null);
    }

    default q1.Tag b(q1.Tag tag) {
        q1.h icon;
        Intrinsics.j(tag, "<this>");
        q1.Label label = tag.getLabel();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 2;
        q1.Label labelY = q1.Label.y(label, androidx.compose.foundation.layout.D.l(companion, H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10)), null, null, null, 0, false, 0, null, null, 510, null);
        q1.h icon2 = tag.getIcon();
        if (icon2 instanceof q1.h.AnimatedIcon) {
            icon = q1.h.AnimatedIcon.y((q1.h.AnimatedIcon) tag.getIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.l(companion, H1.h.p(0), H1.h.p(f10), H1.h.p(4), H1.h.p(f10)), H1.h.p(18)), 63, null);
        } else if (icon2 instanceof q1.h.DrawableIcon) {
            icon = q1.h.DrawableIcon.y((q1.h.DrawableIcon) tag.getIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.l(companion, H1.h.p(0), H1.h.p(f10), H1.h.p(4), H1.h.p(f10)), H1.h.p(18)), 63, null);
        } else {
            if (!Intrinsics.e(icon2, q1.h.c.f142330a)) {
                throw new NoWhenBranchMatchedException();
            }
            icon = tag.getIcon();
        }
        return q1.Tag.y(tag, null, labelY, icon, null, 9, null);
    }
}

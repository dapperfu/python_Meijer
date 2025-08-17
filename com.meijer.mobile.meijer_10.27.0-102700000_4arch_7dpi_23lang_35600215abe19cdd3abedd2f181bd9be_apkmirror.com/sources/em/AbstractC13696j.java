package em;

import Ul.MarketingBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lem/j;", "", "<init>", "()V", "a", "Lem/j$a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: em.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13696j {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lem/j$a;", "Lem/j;", "LUl/i;", "marketingBanner", "<init>", "(LUl/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUl/i;", "()LUl/i;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: em.j$a, reason: from toString */
    public static final /* data */ class BannerClicked extends AbstractC13696j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MarketingBanner marketingBanner;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BannerClicked) && Intrinsics.e(this.marketingBanner, ((BannerClicked) other).marketingBanner);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerClicked(MarketingBanner marketingBanner) {
            super(null);
            Intrinsics.j(marketingBanner, "marketingBanner");
            this.marketingBanner = marketingBanner;
        }

        /* renamed from: a, reason: from getter */
        public final MarketingBanner getMarketingBanner() {
            return this.marketingBanner;
        }

        public int hashCode() {
            return this.marketingBanner.hashCode();
        }

        public String toString() {
            return "BannerClicked(marketingBanner=" + this.marketingBanner + ')';
        }
    }

    public /* synthetic */ AbstractC13696j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13696j() {
    }
}

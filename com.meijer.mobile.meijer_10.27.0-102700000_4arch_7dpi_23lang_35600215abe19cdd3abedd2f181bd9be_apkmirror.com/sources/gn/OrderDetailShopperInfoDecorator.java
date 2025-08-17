package gn;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import es.AbstractC13757b;
import es.K;
import gj.OrderDetail;
import gj.RateDetails;
import gj.TipAmount;
import gj.TipDetails;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tp.EnumC17127a;
import vk.C17590a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u00016B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b'\u00103R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b7\u00103R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b8\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b4\u0010>R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b.\u0010AR\u0017\u0010C\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\b<\u00103R\u0017\u0010E\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\b?\u00103R\u0011\u0010H\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\b+\u0010G¨\u0006J"}, d2 = {"Lgn/l;", "Les/b;", "Lgn/l$a$c;", "shopperInfo", "Lgn/l$a$a;", "rateAndTipInfo", "Lak/a;", "description", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "visibility", "descriptionVisibility", "buttonVisibility", "ratingVisibility", "tipAmountVisibility", "tipInfoVisibility", "Lgn/l$a$d;", "tipInfo", "Lgn/l$a$b;", "rateInfo", "Lgj/f;", "orderStatus", "<init>", "(Lgn/l$a$c;Lgn/l$a$a;Lak/a;Ljava/lang/String;ZZZZZZLgn/l$a$d;Lgn/l$a$b;Lgj/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lgn/l$a$c;", "i", "()Lgn/l$a$c;", "c", "Lgn/l$a$a;", "f", "()Lgn/l$a$a;", "d", "Lak/a;", "()Lak/a;", "e", "Ljava/lang/String;", "getOrderId", "Z", "getVisibility", "()Z", "g", "h", "a", "j", "k", "l", "Lgn/l$a$d;", "()Lgn/l$a$d;", "m", "Lgn/l$a$b;", "()Lgn/l$a$b;", "n", "Lgj/f;", "()Lgj/f;", "o", "isRated", "p", "isTipped", "Ltp/a;", "()Ltp/a;", "flowType", "q", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailShopperInfoDecorator extends AbstractC13757b {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f133880r;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.ShopperInfo shopperInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.RateAndTipInfo rateAndTipInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean visibility;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean descriptionVisibility;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean buttonVisibility;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ratingVisibility;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipAmountVisibility;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipInfoVisibility;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.TipInfo tipInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Companion.RateInfo rateInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final gj.f orderStatus;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isRated;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isTipped;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\u0015\u001d\r\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgn/l$a;", "", "<init>", "()V", "Lgj/c;", "", "g", "(Lgj/c;)Z", "orderDetail", "Lak/a;", "e", "(Lgj/c;)Lak/a;", "Lgn/l$a$c;", "d", "(Lgj/c;)Lgn/l$a$c;", "Lgn/l$a$a;", "b", "(Lgj/c;)Lgn/l$a$a;", "Lgj/k;", "rateDetails", "Lgn/l$a$b;", "c", "(Lgj/k;)Lgn/l$a$b;", "Lgj/o;", "tipDetails", "Lgn/l$a$d;", "f", "(Lgj/o;)Lgn/l$a$d;", "Lgn/l;", "a", "(Lgj/c;)Lgn/l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.l$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, d2 = {"Lgn/l$a$a;", "", "", "rating", "Lak/a;", "tipId", "tipDate", "tipAmount", "authCode", "<init>", "(ILak/a;Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRating", "b", "Lak/a;", "d", "()Lak/a;", "c", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.l$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class RateAndTipInfo {

            /* renamed from: f, reason: collision with root package name */
            public static final int f133896f = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rating;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipDate;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipAmount;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a authCode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateAndTipInfo)) {
                    return false;
                }
                RateAndTipInfo rateAndTipInfo = (RateAndTipInfo) other;
                return this.rating == rateAndTipInfo.rating && Intrinsics.e(this.tipId, rateAndTipInfo.tipId) && Intrinsics.e(this.tipDate, rateAndTipInfo.tipDate) && Intrinsics.e(this.tipAmount, rateAndTipInfo.tipAmount) && Intrinsics.e(this.authCode, rateAndTipInfo.authCode);
            }

            public RateAndTipInfo(int i10, AbstractC5607a tipId, AbstractC5607a tipDate, AbstractC5607a tipAmount, AbstractC5607a authCode) {
                Intrinsics.j(tipId, "tipId");
                Intrinsics.j(tipDate, "tipDate");
                Intrinsics.j(tipAmount, "tipAmount");
                Intrinsics.j(authCode, "authCode");
                this.rating = i10;
                this.tipId = tipId;
                this.tipDate = tipDate;
                this.tipAmount = tipAmount;
                this.authCode = authCode;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAuthCode() {
                return this.authCode;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getTipAmount() {
                return this.tipAmount;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC5607a getTipDate() {
                return this.tipDate;
            }

            /* renamed from: d, reason: from getter */
            public final AbstractC5607a getTipId() {
                return this.tipId;
            }

            public int hashCode() {
                return (((((((Integer.hashCode(this.rating) * 31) + this.tipId.hashCode()) * 31) + this.tipDate.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + this.authCode.hashCode();
            }

            public String toString() {
                return "RateAndTipInfo(rating=" + this.rating + ", tipId=" + this.tipId + ", tipDate=" + this.tipDate + ", tipAmount=" + this.tipAmount + ", authCode=" + this.authCode + ')';
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgn/l$a$b;", "", "", "rating", "", "rated", "Lak/a;", "rateDate", "<init>", "(IZLak/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "c", "Lak/a;", "getRateDate", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.l$a$b, reason: from toString */
        public static final /* data */ class RateInfo {

            /* renamed from: d, reason: collision with root package name */
            public static final int f133902d = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rating;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean rated;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a rateDate;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateInfo)) {
                    return false;
                }
                RateInfo rateInfo = (RateInfo) other;
                return this.rating == rateInfo.rating && this.rated == rateInfo.rated && Intrinsics.e(this.rateDate, rateInfo.rateDate);
            }

            public RateInfo(int i10, boolean z10, AbstractC5607a rateDate) {
                Intrinsics.j(rateDate, "rateDate");
                this.rating = i10;
                this.rated = z10;
                this.rateDate = rateDate;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getRated() {
                return this.rated;
            }

            /* renamed from: b, reason: from getter */
            public final int getRating() {
                return this.rating;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.rating) * 31) + Boolean.hashCode(this.rated)) * 31) + this.rateDate.hashCode();
            }

            public String toString() {
                return "RateInfo(rating=" + this.rating + ", rated=" + this.rated + ", rateDate=" + this.rateDate + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lgn/l$a$c;", "", "", "shopperName", "", "shopperImage", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.l$a$c, reason: from toString */
        public static final /* data */ class ShopperInfo {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String shopperName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int shopperImage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShopperInfo)) {
                    return false;
                }
                ShopperInfo shopperInfo = (ShopperInfo) other;
                return Intrinsics.e(this.shopperName, shopperInfo.shopperName) && this.shopperImage == shopperInfo.shopperImage;
            }

            public ShopperInfo(String shopperName, int i10) {
                Intrinsics.j(shopperName, "shopperName");
                this.shopperName = shopperName;
                this.shopperImage = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getShopperImage() {
                return this.shopperImage;
            }

            /* renamed from: b, reason: from getter */
            public final String getShopperName() {
                return this.shopperName;
            }

            public int hashCode() {
                return (this.shopperName.hashCode() * 31) + Integer.hashCode(this.shopperImage);
            }

            public String toString() {
                return "ShopperInfo(shopperName=" + this.shopperName + ", shopperImage=" + this.shopperImage + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgn/l$a$d;", "", "", "tipped", "Lak/a;", "tipDate", "tipAmount", "authCode", "tipId", "<init>", "(ZLak/a;Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Lak/a;", "c", "()Lak/a;", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.l$a$d, reason: from toString */
        public static final /* data */ class TipInfo {

            /* renamed from: f, reason: collision with root package name */
            public static final int f133908f = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean tipped;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipDate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipAmount;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a authCode;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a tipId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TipInfo)) {
                    return false;
                }
                TipInfo tipInfo = (TipInfo) other;
                return this.tipped == tipInfo.tipped && Intrinsics.e(this.tipDate, tipInfo.tipDate) && Intrinsics.e(this.tipAmount, tipInfo.tipAmount) && Intrinsics.e(this.authCode, tipInfo.authCode) && Intrinsics.e(this.tipId, tipInfo.tipId);
            }

            public TipInfo(boolean z10, AbstractC5607a tipDate, AbstractC5607a tipAmount, AbstractC5607a authCode, AbstractC5607a tipId) {
                Intrinsics.j(tipDate, "tipDate");
                Intrinsics.j(tipAmount, "tipAmount");
                Intrinsics.j(authCode, "authCode");
                Intrinsics.j(tipId, "tipId");
                this.tipped = z10;
                this.tipDate = tipDate;
                this.tipAmount = tipAmount;
                this.authCode = authCode;
                this.tipId = tipId;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAuthCode() {
                return this.authCode;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getTipAmount() {
                return this.tipAmount;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC5607a getTipDate() {
                return this.tipDate;
            }

            /* renamed from: d, reason: from getter */
            public final AbstractC5607a getTipId() {
                return this.tipId;
            }

            /* renamed from: e, reason: from getter */
            public final boolean getTipped() {
                return this.tipped;
            }

            public int hashCode() {
                return (((((((Boolean.hashCode(this.tipped) * 31) + this.tipDate.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + this.authCode.hashCode()) * 31) + this.tipId.hashCode();
            }

            public String toString() {
                return "TipInfo(tipped=" + this.tipped + ", tipDate=" + this.tipDate + ", tipAmount=" + this.tipAmount + ", authCode=" + this.authCode + ", tipId=" + this.tipId + ')';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final RateAndTipInfo b(OrderDetail orderDetail) {
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            Integer rating = orderDetail.getRating();
            int iIntValue = rating != null ? rating.intValue() : 0;
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            String tipCode = orderDetail.getTipCode();
            if (tipCode == null) {
                tipCode = "";
            }
            AbstractC5607a abstractC5607aC = companion.c(tipCode);
            OffsetDateTime tipDate = orderDetail.getTipDate();
            String str = (tipDate == null || (zonedDateTimeAtZoneSameInstant = tipDate.atZoneSameInstant(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZoneSameInstant.format(C17590a.f164803a.l());
            if (str == null) {
                str = "";
            }
            AbstractC5607a abstractC5607aC2 = companion.c(str);
            AbstractC5607a abstractC5607aE = e(orderDetail);
            String tipAuthCode = orderDetail.getTipAuthCode();
            if (tipAuthCode == null) {
                tipAuthCode = "";
            }
            return new RateAndTipInfo(iIntValue, abstractC5607aC, abstractC5607aC2, abstractC5607aE, companion.c(tipAuthCode));
        }

        private final RateInfo c(RateDetails rateDetails) {
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            int rating = rateDetails.getRating();
            boolean rated = rateDetails.getRated();
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            OffsetDateTime date = rateDetails.getDate();
            String str = (date == null || (zonedDateTimeAtZoneSameInstant = date.atZoneSameInstant(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZoneSameInstant.format(C17590a.f164803a.l());
            if (str == null) {
                str = "";
            }
            return new RateInfo(rating, rated, companion.c(str));
        }

        private final ShopperInfo d(OrderDetail orderDetail) {
            gj.ShopperInfo shopperInfo = orderDetail.getShopperInfo();
            String name = shopperInfo != null ? shopperInfo.getName() : null;
            if (name == null) {
                name = "";
            }
            return new ShopperInfo(name, Bj.i.f2743h);
        }

        private final AbstractC5607a e(OrderDetail orderDetail) {
            String formattedValue;
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            TipAmount tipAmount = orderDetail.getTipAmount();
            if (tipAmount == null || (formattedValue = tipAmount.getFormattedValue()) == null) {
                formattedValue = "$0.00";
            }
            return companion.c(formattedValue);
        }

        private final TipInfo f(TipDetails tipDetails) {
            ZonedDateTime zonedDateTimeAtZoneSameInstant;
            boolean tipped = tipDetails.getTipped();
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            OffsetDateTime date = tipDetails.getDate();
            String str = (date == null || (zonedDateTimeAtZoneSameInstant = date.atZoneSameInstant(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZoneSameInstant.format(C17590a.f164803a.l());
            if (str == null) {
                str = "";
            }
            return new TipInfo(tipped, companion.c(str), companion.c(tipDetails.getTipAmount().getFormattedValue()), companion.c(tipDetails.getAuthCode()), companion.c(tipDetails.getTipOrderCode()));
        }

        public final OrderDetailShopperInfoDecorator a(OrderDetail orderDetail) {
            Intrinsics.j(orderDetail, "orderDetail");
            if (!orderDetail.getTipAndRateDetails().getTippablePartner()) {
                return new OrderDetailShopperInfoDecorator(d(orderDetail), b(orderDetail), null, orderDetail.getCode(), g(orderDetail), false, false, false, false, false, f(orderDetail.getTipAndRateDetails().getTipDetails()), c(orderDetail.getTipAndRateDetails().getRateDetails()), orderDetail.getOrderStatus());
            }
            if (orderDetail.getShopperInfo() != null && !K.f129818a.e(orderDetail)) {
                return new OrderDetailShopperInfoDecorator(d(orderDetail), b(orderDetail), AbstractC5607a.INSTANCE.d(Y.f99519D7, new Object[0]), orderDetail.getCode(), g(orderDetail), true, false, false, false, false, f(orderDetail.getTipAndRateDetails().getTipDetails()), c(orderDetail.getTipAndRateDetails().getRateDetails()), orderDetail.getOrderStatus());
            }
            return new OrderDetailShopperInfoDecorator(d(orderDetail), b(orderDetail), !orderDetail.getIsMfc() ? AbstractC5607a.INSTANCE.d(Y.f100116i7, new Object[0]) : null, orderDetail.getCode(), g(orderDetail), (orderDetail.getIsMfc() || orderDetail.getTipAndRateDetails().getRateDetails().getRated()) ? false : true, (orderDetail.getIsMfc() || (orderDetail.getTipAndRateDetails().getTipDetails().getTipped() && orderDetail.getTipAndRateDetails().getRateDetails().getRated())) ? false : true, orderDetail.getTipAndRateDetails().getRateDetails().getRated(), orderDetail.getTipAndRateDetails().getTipDetails().getTipped(), orderDetail.getTipAndRateDetails().getTipDetails().getTipped(), f(orderDetail.getTipAndRateDetails().getTipDetails()), c(orderDetail.getTipAndRateDetails().getRateDetails()), orderDetail.getOrderStatus());
        }

        private final boolean g(OrderDetail orderDetail) {
            if (orderDetail.getShopperInfo() != null) {
                return true;
            }
            return false;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailShopperInfoDecorator)) {
            return false;
        }
        OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator = (OrderDetailShopperInfoDecorator) other;
        return Intrinsics.e(this.shopperInfo, orderDetailShopperInfoDecorator.shopperInfo) && Intrinsics.e(this.rateAndTipInfo, orderDetailShopperInfoDecorator.rateAndTipInfo) && Intrinsics.e(this.description, orderDetailShopperInfoDecorator.description) && Intrinsics.e(this.orderId, orderDetailShopperInfoDecorator.orderId) && this.visibility == orderDetailShopperInfoDecorator.visibility && this.descriptionVisibility == orderDetailShopperInfoDecorator.descriptionVisibility && this.buttonVisibility == orderDetailShopperInfoDecorator.buttonVisibility && this.ratingVisibility == orderDetailShopperInfoDecorator.ratingVisibility && this.tipAmountVisibility == orderDetailShopperInfoDecorator.tipAmountVisibility && this.tipInfoVisibility == orderDetailShopperInfoDecorator.tipInfoVisibility && Intrinsics.e(this.tipInfo, orderDetailShopperInfoDecorator.tipInfo) && Intrinsics.e(this.rateInfo, orderDetailShopperInfoDecorator.rateInfo) && this.orderStatus == orderDetailShopperInfoDecorator.orderStatus;
    }

    static {
        int i10 = AbstractC13757b.f129827a;
        int i11 = AbstractC5607a.f45514b;
        f133880r = i10 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11 | i11;
    }

    public OrderDetailShopperInfoDecorator(Companion.ShopperInfo shopperInfo, Companion.RateAndTipInfo rateAndTipInfo, AbstractC5607a abstractC5607a, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Companion.TipInfo tipInfo, Companion.RateInfo rateInfo, gj.f orderStatus) {
        Intrinsics.j(shopperInfo, "shopperInfo");
        Intrinsics.j(rateAndTipInfo, "rateAndTipInfo");
        Intrinsics.j(orderStatus, "orderStatus");
        this.shopperInfo = shopperInfo;
        this.rateAndTipInfo = rateAndTipInfo;
        this.description = abstractC5607a;
        this.orderId = str;
        this.visibility = z10;
        this.descriptionVisibility = z11;
        this.buttonVisibility = z12;
        this.ratingVisibility = z13;
        this.tipAmountVisibility = z14;
        this.tipInfoVisibility = z15;
        this.tipInfo = tipInfo;
        this.rateInfo = rateInfo;
        this.orderStatus = orderStatus;
        boolean z16 = false;
        this.isRated = rateInfo != null && rateInfo.getRated();
        if (tipInfo != null && tipInfo.getTipped()) {
            z16 = true;
        }
        this.isTipped = z16;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getButtonVisibility() {
        return this.buttonVisibility;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    public final EnumC17127a d() {
        boolean z10 = this.isTipped;
        return (!z10 || this.isRated) ? (z10 || !this.isRated) ? EnumC17127a.f161939c : EnumC17127a.f161941e : EnumC17127a.f161940d;
    }

    /* renamed from: e, reason: from getter */
    public final gj.f getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: f, reason: from getter */
    public final Companion.RateAndTipInfo getRateAndTipInfo() {
        return this.rateAndTipInfo;
    }

    /* renamed from: g, reason: from getter */
    public final Companion.RateInfo getRateInfo() {
        return this.rateInfo;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getRatingVisibility() {
        return this.ratingVisibility;
    }

    public int hashCode() {
        int iHashCode = ((this.shopperInfo.hashCode() * 31) + this.rateAndTipInfo.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.description;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        String str = this.orderId;
        int iHashCode3 = (((((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.visibility)) * 31) + Boolean.hashCode(this.descriptionVisibility)) * 31) + Boolean.hashCode(this.buttonVisibility)) * 31) + Boolean.hashCode(this.ratingVisibility)) * 31) + Boolean.hashCode(this.tipAmountVisibility)) * 31) + Boolean.hashCode(this.tipInfoVisibility)) * 31;
        Companion.TipInfo tipInfo = this.tipInfo;
        int iHashCode4 = (iHashCode3 + (tipInfo == null ? 0 : tipInfo.hashCode())) * 31;
        Companion.RateInfo rateInfo = this.rateInfo;
        return ((iHashCode4 + (rateInfo != null ? rateInfo.hashCode() : 0)) * 31) + this.orderStatus.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final Companion.ShopperInfo getShopperInfo() {
        return this.shopperInfo;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getTipAmountVisibility() {
        return this.tipAmountVisibility;
    }

    /* renamed from: k, reason: from getter */
    public final Companion.TipInfo getTipInfo() {
        return this.tipInfo;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getTipInfoVisibility() {
        return this.tipInfoVisibility;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsRated() {
        return this.isRated;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsTipped() {
        return this.isTipped;
    }

    public String toString() {
        return "OrderDetailShopperInfoDecorator(shopperInfo=" + this.shopperInfo + ", rateAndTipInfo=" + this.rateAndTipInfo + ", description=" + this.description + ", orderId=" + this.orderId + ", visibility=" + this.visibility + ", descriptionVisibility=" + this.descriptionVisibility + ", buttonVisibility=" + this.buttonVisibility + ", ratingVisibility=" + this.ratingVisibility + ", tipAmountVisibility=" + this.tipAmountVisibility + ", tipInfoVisibility=" + this.tipInfoVisibility + ", tipInfo=" + this.tipInfo + ", rateInfo=" + this.rateInfo + ", orderStatus=" + this.orderStatus + ')';
    }
}

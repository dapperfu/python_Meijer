package es;

import Hl.FlyBuyOrderDetail;
import androidx.recyclerview.widget.RecyclerView;
import as.C6293f;
import bk.AbstractC6392a;
import com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse;
import fj.DeliveryMode;
import hj.OrderDetail;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import wk.C17898a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001 Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0084\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b@\u0010=R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\bC\u0010=R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\bD\u0010=R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b0\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bA\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\b:\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\b4\u00109R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010+\u001a\u0004\bI\u0010#R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bG\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bH\u00103R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\b-\u0010KR\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=¨\u0006M"}, d2 = {"Les/d;", "Les/b;", "", "orderStatus", "", "orderProgress", "Lbk/a;", "orderStatusDescription", "mperksMessage", "progressBarResId", "mperksItemResId", "", "isOrderProgressBarVisible", "shouldAnimateProgressValue", "shouldShowCustomerOnWay", "shouldShowCustomerHere", "shouldShowParkingSpotInfo", "isOrderCompleted", "isOrderCanceled", "isOutForDelivery", "displayMperksPoints", "parkingSpotLabel", "mperksPoints", "flyBuyOrderId", "parkingSpot", "statusUpdateReason", "statusUpdateTimestampString", "Les/J;", "decoratorOrderSubstitutionBannerDecorator", "shouldShowFlyBuyButtonSection", "<init>", "(Ljava/lang/String;ILbk/a;Lbk/a;Ljava/lang/Integer;IZZZZZZZZZLbk/a;Lbk/a;Ljava/lang/Integer;Ljava/lang/String;Lbk/a;Lbk/a;Les/J;Z)V", "a", "(Ljava/lang/String;ILbk/a;Lbk/a;Ljava/lang/Integer;IZZZZZZZZZLbk/a;Lbk/a;Ljava/lang/Integer;Ljava/lang/String;Lbk/a;Lbk/a;Les/J;Z)Les/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "j", "c", "I", "i", "d", "Lbk/a;", "k", "()Lbk/a;", "e", "g", "f", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "h", "Z", "w", "()Z", "n", "p", "o", "l", "r", "v", "u", "x", "q", "s", "t", "getParkingSpot", "Les/J;", "()Les/J;", "y", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class OrderDetailStatusDecorator extends AbstractC13866b {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f130677z = AbstractC6392a.f60445b;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderStatus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int orderProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a orderStatusDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a mperksMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer progressBarResId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mperksItemResId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderProgressBarVisible;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldAnimateProgressValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowCustomerOnWay;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowCustomerHere;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowParkingSpotInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderCompleted;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderCanceled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOutForDelivery;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayMperksPoints;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a parkingSpotLabel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a mperksPoints;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer flyBuyOrderId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parkingSpot;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a statusUpdateReason;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a statusUpdateTimestampString;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderSubstitutionsDetailBannerDecorator decoratorOrderSubstitutionBannerDecorator;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowFlyBuyButtonSection;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u0017J\u0015\u0010(\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Les/d$a;", "", "<init>", "()V", "", "status", "Lhj/f;", "type", "c", "(Ljava/lang/String;Lhj/f;)Ljava/lang/String;", "j$/time/ZonedDateTime", "updateTimeStamp", "Lbk/a;", "i", "(Lj$/time/ZonedDateTime;)Lbk/a;", "Lhj/c;", "orderDetail", "", "j", "(Lhj/c;)Z", "LHl/b$c;", "flyBuyOrder", "f", "(Lhj/c;LHl/b$c;)Z", "d", "orderStatus", "", "h", "(Lhj/f;)I", "k", "(Lhj/f;)Z", "flyBuyDetails", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "mperksPointsForOrder", "Les/J;", "decoratorOrderSubstitutionBannerDecorator", "Les/d;", "a", "(Lhj/c;LHl/b$c;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;Les/J;)Les/d;", "e", "g", "(LHl/b$c;)I", "SPOT_IDENTIFIER_UNKNOWN", "I", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: es.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: es.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2064a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[FlyBuyOrderDetail.Companion.EnumC0214b.values().length];
                try {
                    iArr[FlyBuyOrderDetail.Companion.EnumC0214b.f13665a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FlyBuyOrderDetail.Companion.EnumC0214b.f13666b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[hj.f.values().length];
                try {
                    iArr2[hj.f.f135703t.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[hj.f.f135701r.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[hj.f.f135700q.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[hj.f.f135699p.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[hj.f.f135689f.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ OrderDetailStatusDecorator b(Companion companion, OrderDetail orderDetail, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder, OrderRewardPointsForOrderResponse orderRewardPointsForOrderResponse, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                flyBuyOrder = null;
            }
            if ((i10 & 4) != 0) {
                orderRewardPointsForOrderResponse = null;
            }
            if ((i10 & 8) != 0) {
                orderSubstitutionsDetailBannerDecorator = null;
            }
            return companion.a(orderDetail, flyBuyOrder, orderRewardPointsForOrderResponse, orderSubstitutionsDetailBannerDecorator);
        }

        private final String c(String status, hj.f type) {
            return type == hj.f.f135696m ? "Out for Delivery" : status;
        }

        private final int h(hj.f orderStatus) {
            int i10 = C2064a.$EnumSwitchMapping$1[orderStatus.ordinal()];
            return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? Cj.g.f4675q : i10 != 5 ? Cj.g.f4661c : Cj.g.f4680v;
        }

        private final AbstractC6392a i(ZonedDateTime updateTimeStamp) {
            if (updateTimeStamp == null) {
                return null;
            }
            C17898a c17898a = C17898a.f167225a;
            String str = updateTimeStamp.format(c17898a.m());
            if (str != null) {
                return AbstractC6392a.INSTANCE.d(C6293f.f59642B, str, updateTimeStamp.format(c17898a.q()));
            }
            return null;
        }

        private final boolean j(OrderDetail orderDetail) {
            return K.f130659a.f(orderDetail);
        }

        private final boolean k(hj.f orderStatus) {
            int i10 = C2064a.$EnumSwitchMapping$1[orderStatus.ordinal()];
            return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final es.OrderDetailStatusDecorator a(hj.OrderDetail r59, Hl.FlyBuyOrderDetail.FlyBuyOrder r60, com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse r61, es.OrderSubstitutionsDetailBannerDecorator r62) {
            /*
                Method dump skipped, instructions count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: es.OrderDetailStatusDecorator.Companion.a(hj.c, Hl.b$c, com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse, es.J):es.d");
        }

        public final boolean e(OrderDetail orderDetail, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
            Intrinsics.j(orderDetail, "orderDetail");
            Intrinsics.j(flyBuyOrder, "flyBuyOrder");
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            if (deliveryMode != null && deliveryMode.f()) {
                boolean z10 = flyBuyOrder.getCustomerState() == FlyBuyOrderDetail.Companion.EnumC0213a.f13659e;
                boolean z11 = g(flyBuyOrder) > 0;
                if (z10 && z11) {
                    return true;
                }
            }
            return false;
        }

        public final int g(FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
            Integer numV;
            Intrinsics.j(flyBuyOrder, "flyBuyOrder");
            String spotIdentifier = flyBuyOrder.getSpotIdentifier();
            if (spotIdentifier == null || (numV = StringsKt.v(spotIdentifier)) == null) {
                return -1;
            }
            return numV.intValue();
        }

        private final boolean d(OrderDetail orderDetail, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
            int i10;
            boolean z10;
            boolean z11;
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            if (deliveryMode == null || !deliveryMode.f()) {
                return false;
            }
            FlyBuyOrderDetail.Companion.EnumC0214b orderState = flyBuyOrder.getOrderState();
            if (orderState == null) {
                i10 = -1;
            } else {
                i10 = C2064a.$EnumSwitchMapping$0[orderState.ordinal()];
            }
            if (i10 != 1 && i10 != 2) {
                return false;
            }
            if (flyBuyOrder.getCustomerState() != FlyBuyOrderDetail.Companion.EnumC0213a.f13659e && flyBuyOrder.getCustomerState() != FlyBuyOrderDetail.Companion.EnumC0213a.f13657c) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (g(flyBuyOrder) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                return false;
            }
            return true;
        }

        private final boolean f(OrderDetail orderDetail, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
            int i10;
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            if (deliveryMode != null && deliveryMode.f()) {
                FlyBuyOrderDetail.Companion.EnumC0214b orderState = flyBuyOrder.getOrderState();
                if (orderState == null) {
                    i10 = -1;
                } else {
                    i10 = C2064a.$EnumSwitchMapping$0[orderState.ordinal()];
                }
                if (i10 == 1 || i10 == 2) {
                    if (flyBuyOrder.getCustomerState() != FlyBuyOrderDetail.Companion.EnumC0213a.f13662h && flyBuyOrder.getCustomerState() != FlyBuyOrderDetail.Companion.EnumC0213a.f13655a) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OrderDetailStatusDecorator(java.lang.String r28, int r29, bk.AbstractC6392a r30, bk.AbstractC6392a r31, java.lang.Integer r32, int r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, bk.AbstractC6392a r43, bk.AbstractC6392a r44, java.lang.Integer r45, java.lang.String r46, bk.AbstractC6392a r47, bk.AbstractC6392a r48, es.OrderSubstitutionsDetailBannerDecorator r49, boolean r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.OrderDetailStatusDecorator.<init>(java.lang.String, int, bk.a, bk.a, java.lang.Integer, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, bk.a, bk.a, java.lang.Integer, java.lang.String, bk.a, bk.a, es.J, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ OrderDetailStatusDecorator b(OrderDetailStatusDecorator orderDetailStatusDecorator, String str, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Integer num, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, Integer num2, String str2, AbstractC6392a abstractC6392a5, AbstractC6392a abstractC6392a6, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, boolean z19, int i12, Object obj) {
        boolean z20;
        OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator2;
        String str3 = (i12 & 1) != 0 ? orderDetailStatusDecorator.orderStatus : str;
        int i13 = (i12 & 2) != 0 ? orderDetailStatusDecorator.orderProgress : i10;
        AbstractC6392a abstractC6392a7 = (i12 & 4) != 0 ? orderDetailStatusDecorator.orderStatusDescription : abstractC6392a;
        AbstractC6392a abstractC6392a8 = (i12 & 8) != 0 ? orderDetailStatusDecorator.mperksMessage : abstractC6392a2;
        Integer num3 = (i12 & 16) != 0 ? orderDetailStatusDecorator.progressBarResId : num;
        int i14 = (i12 & 32) != 0 ? orderDetailStatusDecorator.mperksItemResId : i11;
        boolean z21 = (i12 & 64) != 0 ? orderDetailStatusDecorator.isOrderProgressBarVisible : z10;
        boolean z22 = (i12 & 128) != 0 ? orderDetailStatusDecorator.shouldAnimateProgressValue : z11;
        boolean z23 = (i12 & 256) != 0 ? orderDetailStatusDecorator.shouldShowCustomerOnWay : z12;
        boolean z24 = (i12 & 512) != 0 ? orderDetailStatusDecorator.shouldShowCustomerHere : z13;
        boolean z25 = (i12 & 1024) != 0 ? orderDetailStatusDecorator.shouldShowParkingSpotInfo : z14;
        boolean z26 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? orderDetailStatusDecorator.isOrderCompleted : z15;
        boolean z27 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderDetailStatusDecorator.isOrderCanceled : z16;
        boolean z28 = (i12 & 8192) != 0 ? orderDetailStatusDecorator.isOutForDelivery : z17;
        String str4 = str3;
        boolean z29 = (i12 & 16384) != 0 ? orderDetailStatusDecorator.displayMperksPoints : z18;
        AbstractC6392a abstractC6392a9 = (i12 & 32768) != 0 ? orderDetailStatusDecorator.parkingSpotLabel : abstractC6392a3;
        AbstractC6392a abstractC6392a10 = (i12 & 65536) != 0 ? orderDetailStatusDecorator.mperksPoints : abstractC6392a4;
        Integer num4 = (i12 & 131072) != 0 ? orderDetailStatusDecorator.flyBuyOrderId : num2;
        String str5 = (i12 & 262144) != 0 ? orderDetailStatusDecorator.parkingSpot : str2;
        AbstractC6392a abstractC6392a11 = (i12 & 524288) != 0 ? orderDetailStatusDecorator.statusUpdateReason : abstractC6392a5;
        AbstractC6392a abstractC6392a12 = (i12 & 1048576) != 0 ? orderDetailStatusDecorator.statusUpdateTimestampString : abstractC6392a6;
        OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator3 = (i12 & 2097152) != 0 ? orderDetailStatusDecorator.decoratorOrderSubstitutionBannerDecorator : orderSubstitutionsDetailBannerDecorator;
        if ((i12 & 4194304) != 0) {
            orderSubstitutionsDetailBannerDecorator2 = orderSubstitutionsDetailBannerDecorator3;
            z20 = orderDetailStatusDecorator.shouldShowFlyBuyButtonSection;
        } else {
            z20 = z19;
            orderSubstitutionsDetailBannerDecorator2 = orderSubstitutionsDetailBannerDecorator3;
        }
        return orderDetailStatusDecorator.a(str4, i13, abstractC6392a7, abstractC6392a8, num3, i14, z21, z22, z23, z24, z25, z26, z27, z28, z29, abstractC6392a9, abstractC6392a10, num4, str5, abstractC6392a11, abstractC6392a12, orderSubstitutionsDetailBannerDecorator2, z20);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailStatusDecorator)) {
            return false;
        }
        OrderDetailStatusDecorator orderDetailStatusDecorator = (OrderDetailStatusDecorator) other;
        return Intrinsics.e(this.orderStatus, orderDetailStatusDecorator.orderStatus) && this.orderProgress == orderDetailStatusDecorator.orderProgress && Intrinsics.e(this.orderStatusDescription, orderDetailStatusDecorator.orderStatusDescription) && Intrinsics.e(this.mperksMessage, orderDetailStatusDecorator.mperksMessage) && Intrinsics.e(this.progressBarResId, orderDetailStatusDecorator.progressBarResId) && this.mperksItemResId == orderDetailStatusDecorator.mperksItemResId && this.isOrderProgressBarVisible == orderDetailStatusDecorator.isOrderProgressBarVisible && this.shouldAnimateProgressValue == orderDetailStatusDecorator.shouldAnimateProgressValue && this.shouldShowCustomerOnWay == orderDetailStatusDecorator.shouldShowCustomerOnWay && this.shouldShowCustomerHere == orderDetailStatusDecorator.shouldShowCustomerHere && this.shouldShowParkingSpotInfo == orderDetailStatusDecorator.shouldShowParkingSpotInfo && this.isOrderCompleted == orderDetailStatusDecorator.isOrderCompleted && this.isOrderCanceled == orderDetailStatusDecorator.isOrderCanceled && this.isOutForDelivery == orderDetailStatusDecorator.isOutForDelivery && this.displayMperksPoints == orderDetailStatusDecorator.displayMperksPoints && Intrinsics.e(this.parkingSpotLabel, orderDetailStatusDecorator.parkingSpotLabel) && Intrinsics.e(this.mperksPoints, orderDetailStatusDecorator.mperksPoints) && Intrinsics.e(this.flyBuyOrderId, orderDetailStatusDecorator.flyBuyOrderId) && Intrinsics.e(this.parkingSpot, orderDetailStatusDecorator.parkingSpot) && Intrinsics.e(this.statusUpdateReason, orderDetailStatusDecorator.statusUpdateReason) && Intrinsics.e(this.statusUpdateTimestampString, orderDetailStatusDecorator.statusUpdateTimestampString) && Intrinsics.e(this.decoratorOrderSubstitutionBannerDecorator, orderDetailStatusDecorator.decoratorOrderSubstitutionBannerDecorator) && this.shouldShowFlyBuyButtonSection == orderDetailStatusDecorator.shouldShowFlyBuyButtonSection;
    }

    public final OrderDetailStatusDecorator a(String orderStatus, int orderProgress, AbstractC6392a orderStatusDescription, AbstractC6392a mperksMessage, Integer progressBarResId, int mperksItemResId, boolean isOrderProgressBarVisible, boolean shouldAnimateProgressValue, boolean shouldShowCustomerOnWay, boolean shouldShowCustomerHere, boolean shouldShowParkingSpotInfo, boolean isOrderCompleted, boolean isOrderCanceled, boolean isOutForDelivery, boolean displayMperksPoints, AbstractC6392a parkingSpotLabel, AbstractC6392a mperksPoints, Integer flyBuyOrderId, String parkingSpot, AbstractC6392a statusUpdateReason, AbstractC6392a statusUpdateTimestampString, OrderSubstitutionsDetailBannerDecorator decoratorOrderSubstitutionBannerDecorator, boolean shouldShowFlyBuyButtonSection) {
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(orderStatusDescription, "orderStatusDescription");
        Intrinsics.j(mperksMessage, "mperksMessage");
        Intrinsics.j(parkingSpot, "parkingSpot");
        return new OrderDetailStatusDecorator(orderStatus, orderProgress, orderStatusDescription, mperksMessage, progressBarResId, mperksItemResId, isOrderProgressBarVisible, shouldAnimateProgressValue, shouldShowCustomerOnWay, shouldShowCustomerHere, shouldShowParkingSpotInfo, isOrderCompleted, isOrderCanceled, isOutForDelivery, displayMperksPoints, parkingSpotLabel, mperksPoints, flyBuyOrderId, parkingSpot, statusUpdateReason, statusUpdateTimestampString, decoratorOrderSubstitutionBannerDecorator, shouldShowFlyBuyButtonSection);
    }

    /* renamed from: c, reason: from getter */
    public final OrderSubstitutionsDetailBannerDecorator getDecoratorOrderSubstitutionBannerDecorator() {
        return this.decoratorOrderSubstitutionBannerDecorator;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getDisplayMperksPoints() {
        return this.displayMperksPoints;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getFlyBuyOrderId() {
        return this.flyBuyOrderId;
    }

    /* renamed from: f, reason: from getter */
    public final int getMperksItemResId() {
        return this.mperksItemResId;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getMperksMessage() {
        return this.mperksMessage;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getMperksPoints() {
        return this.mperksPoints;
    }

    public int hashCode() {
        int iHashCode = ((((((this.orderStatus.hashCode() * 31) + Integer.hashCode(this.orderProgress)) * 31) + this.orderStatusDescription.hashCode()) * 31) + this.mperksMessage.hashCode()) * 31;
        Integer num = this.progressBarResId;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.mperksItemResId)) * 31) + Boolean.hashCode(this.isOrderProgressBarVisible)) * 31) + Boolean.hashCode(this.shouldAnimateProgressValue)) * 31) + Boolean.hashCode(this.shouldShowCustomerOnWay)) * 31) + Boolean.hashCode(this.shouldShowCustomerHere)) * 31) + Boolean.hashCode(this.shouldShowParkingSpotInfo)) * 31) + Boolean.hashCode(this.isOrderCompleted)) * 31) + Boolean.hashCode(this.isOrderCanceled)) * 31) + Boolean.hashCode(this.isOutForDelivery)) * 31) + Boolean.hashCode(this.displayMperksPoints)) * 31;
        AbstractC6392a abstractC6392a = this.parkingSpotLabel;
        int iHashCode3 = (iHashCode2 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.mperksPoints;
        int iHashCode4 = (iHashCode3 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        Integer num2 = this.flyBuyOrderId;
        int iHashCode5 = (((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.parkingSpot.hashCode()) * 31;
        AbstractC6392a abstractC6392a3 = this.statusUpdateReason;
        int iHashCode6 = (iHashCode5 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.statusUpdateTimestampString;
        int iHashCode7 = (iHashCode6 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31;
        OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator = this.decoratorOrderSubstitutionBannerDecorator;
        return ((iHashCode7 + (orderSubstitutionsDetailBannerDecorator != null ? orderSubstitutionsDetailBannerDecorator.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowFlyBuyButtonSection);
    }

    /* renamed from: i, reason: from getter */
    public final int getOrderProgress() {
        return this.orderProgress;
    }

    /* renamed from: j, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC6392a getOrderStatusDescription() {
        return this.orderStatusDescription;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC6392a getParkingSpotLabel() {
        return this.parkingSpotLabel;
    }

    /* renamed from: m, reason: from getter */
    public final Integer getProgressBarResId() {
        return this.progressBarResId;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getShouldAnimateProgressValue() {
        return this.shouldAnimateProgressValue;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getShouldShowCustomerHere() {
        return this.shouldShowCustomerHere;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getShouldShowCustomerOnWay() {
        return this.shouldShowCustomerOnWay;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getShouldShowFlyBuyButtonSection() {
        return this.shouldShowFlyBuyButtonSection;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getShouldShowParkingSpotInfo() {
        return this.shouldShowParkingSpotInfo;
    }

    /* renamed from: s, reason: from getter */
    public final AbstractC6392a getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    /* renamed from: t, reason: from getter */
    public final AbstractC6392a getStatusUpdateTimestampString() {
        return this.statusUpdateTimestampString;
    }

    public String toString() {
        return "OrderDetailStatusDecorator(orderStatus=" + this.orderStatus + ", orderProgress=" + this.orderProgress + ", orderStatusDescription=" + this.orderStatusDescription + ", mperksMessage=" + this.mperksMessage + ", progressBarResId=" + this.progressBarResId + ", mperksItemResId=" + this.mperksItemResId + ", isOrderProgressBarVisible=" + this.isOrderProgressBarVisible + ", shouldAnimateProgressValue=" + this.shouldAnimateProgressValue + ", shouldShowCustomerOnWay=" + this.shouldShowCustomerOnWay + ", shouldShowCustomerHere=" + this.shouldShowCustomerHere + ", shouldShowParkingSpotInfo=" + this.shouldShowParkingSpotInfo + ", isOrderCompleted=" + this.isOrderCompleted + ", isOrderCanceled=" + this.isOrderCanceled + ", isOutForDelivery=" + this.isOutForDelivery + ", displayMperksPoints=" + this.displayMperksPoints + ", parkingSpotLabel=" + this.parkingSpotLabel + ", mperksPoints=" + this.mperksPoints + ", flyBuyOrderId=" + this.flyBuyOrderId + ", parkingSpot=" + this.parkingSpot + ", statusUpdateReason=" + this.statusUpdateReason + ", statusUpdateTimestampString=" + this.statusUpdateTimestampString + ", decoratorOrderSubstitutionBannerDecorator=" + this.decoratorOrderSubstitutionBannerDecorator + ", shouldShowFlyBuyButtonSection=" + this.shouldShowFlyBuyButtonSection + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsOrderCanceled() {
        return this.isOrderCanceled;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsOrderCompleted() {
        return this.isOrderCompleted;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsOrderProgressBarVisible() {
        return this.isOrderProgressBarVisible;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsOutForDelivery() {
        return this.isOutForDelivery;
    }

    public OrderDetailStatusDecorator(String orderStatus, int i10, AbstractC6392a orderStatusDescription, AbstractC6392a mperksMessage, Integer num, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Integer num2, String parkingSpot, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecorator, boolean z19) {
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(orderStatusDescription, "orderStatusDescription");
        Intrinsics.j(mperksMessage, "mperksMessage");
        Intrinsics.j(parkingSpot, "parkingSpot");
        this.orderStatus = orderStatus;
        this.orderProgress = i10;
        this.orderStatusDescription = orderStatusDescription;
        this.mperksMessage = mperksMessage;
        this.progressBarResId = num;
        this.mperksItemResId = i11;
        this.isOrderProgressBarVisible = z10;
        this.shouldAnimateProgressValue = z11;
        this.shouldShowCustomerOnWay = z12;
        this.shouldShowCustomerHere = z13;
        this.shouldShowParkingSpotInfo = z14;
        this.isOrderCompleted = z15;
        this.isOrderCanceled = z16;
        this.isOutForDelivery = z17;
        this.displayMperksPoints = z18;
        this.parkingSpotLabel = abstractC6392a;
        this.mperksPoints = abstractC6392a2;
        this.flyBuyOrderId = num2;
        this.parkingSpot = parkingSpot;
        this.statusUpdateReason = abstractC6392a3;
        this.statusUpdateTimestampString = abstractC6392a4;
        this.decoratorOrderSubstitutionBannerDecorator = orderSubstitutionsDetailBannerDecorator;
        this.shouldShowFlyBuyButtonSection = z19;
    }
}

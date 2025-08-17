package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ao.W;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import fi.C13902c;
import fi.C13904e;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import gj.OrderDetail;
import hi.C14476c;
import hi.TrackingData;
import j$.net.URLEncoder;
import j$.time.OffsetDateTime;
import j2.C14835c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import vk.C17590a;
import wj.C17828d;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002*(B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\"028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lgi/a;", "analyticsEngine", "Lwj/d;", "firebaseLoggingUtil", "Lyl/k;", "featureManager", "Lyo/k;", "userManager", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lgi/a;Lwj/d;Lyl/k;Lyo/k;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "s", "(Ljava/lang/String;)V", "Lgj/c;", "orderDetail", "x", "(Lgj/c;)V", "C", "()V", "resourceId", "t", "(Ljava/lang/String;)Ljava/lang/String;", "onCleared", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "action", "w", "(Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;)V", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "viewState", "y", "(Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;)V", "input", "r", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lgi/a;", "c", "Lwj/d;", "d", "Lyl/k;", "e", "Lyo/k;", "Ltv/B;", "f", "Ltv/B;", "_viewState", "Ltv/P;", "g", "Ltv/P;", "u", "()Ltv/P;", "LNu/a;", "h", "LNu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "i", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "j", "Z", "sendPreTipAnalytics", "v", "()Z", "isRoktAdEnabled", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Y extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17828d firebaseLoggingUtil;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private z1.OrderConfirmationInfo information;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean sendPreTipAnalytics;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "", "<init>", "()V", "c", "b", "a", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "Lfi/a;", "analytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.Y$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoogleAdClicked extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f102099b = GoogleAdAnalytics.f131141f;

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f102101a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1878778640;
            }

            public String toString() {
                return "LoadGoogleAdData";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$c;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "isBopasEligibleCart", "sendPreTipAnalytics", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "c", "Z", "d", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.Y$a$c, reason: from toString */
        public static final /* data */ class LoadOrderDetail extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final z1.OrderConfirmationInfo information;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isBopasEligibleCart;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean sendPreTipAnalytics;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadOrderDetail)) {
                    return false;
                }
                LoadOrderDetail loadOrderDetail = (LoadOrderDetail) other;
                return Intrinsics.e(this.orderId, loadOrderDetail.orderId) && Intrinsics.e(this.information, loadOrderDetail.information) && this.isBopasEligibleCart == loadOrderDetail.isBopasEligibleCart && this.sendPreTipAnalytics == loadOrderDetail.sendPreTipAnalytics;
            }

            public int hashCode() {
                int iHashCode = this.orderId.hashCode() * 31;
                z1.OrderConfirmationInfo kVar = this.information;
                return ((((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + Boolean.hashCode(this.isBopasEligibleCart)) * 31) + Boolean.hashCode(this.sendPreTipAnalytics);
            }

            public String toString() {
                return "LoadOrderDetail(orderId=" + this.orderId + ", information=" + this.information + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", sendPreTipAnalytics=" + this.sendPreTipAnalytics + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadOrderDetail(String orderId, z1.OrderConfirmationInfo kVar, boolean z10, boolean z11) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                this.orderId = orderId;
                this.information = kVar;
                this.isBopasEligibleCart = z10;
                this.sendPreTipAnalytics = z11;
            }

            /* renamed from: a, reason: from getter */
            public final z1.OrderConfirmationInfo getInformation() {
                return this.information;
            }

            /* renamed from: b, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getSendPreTipAnalytics() {
                return this.sendPreTipAnalytics;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsBopasEligibleCart() {
                return this.isBopasEligibleCart;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "", "", "isLoading", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "isBopasEligibleCart", "Lfi/d;", "googleAdData", "<init>", "(ZLcom/meijer/mobile/meijer/activity/checkout/confirmation/p;ZLfi/d;)V", "a", "(ZLcom/meijer/mobile/meijer/activity/checkout/confirmation/p;ZLfi/d;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "d", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "c", "e", "Lfi/d;", "()Lfi/d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.Y$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderConfirmationDecorator order;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBopasEligibleCart;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdData;

        public ViewState() {
            this(false, null, false, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isLoading == viewState.isLoading && Intrinsics.e(this.order, viewState.order) && this.isBopasEligibleCart == viewState.isBopasEligibleCart && Intrinsics.e(this.googleAdData, viewState.googleAdData);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            OrderConfirmationDecorator c11795p = this.order;
            int iHashCode2 = (((iHashCode + (c11795p == null ? 0 : c11795p.hashCode())) * 31) + Boolean.hashCode(this.isBopasEligibleCart)) * 31;
            GoogleAdData googleAdData = this.googleAdData;
            return iHashCode2 + (googleAdData != null ? googleAdData.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(isLoading=" + this.isLoading + ", order=" + this.order + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", googleAdData=" + this.googleAdData + ')';
        }

        public ViewState(boolean z10, OrderConfirmationDecorator c11795p, boolean z11, GoogleAdData googleAdData) {
            this.isLoading = z10;
            this.order = c11795p;
            this.isBopasEligibleCart = z11;
            this.googleAdData = googleAdData;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, OrderConfirmationDecorator c11795p, boolean z11, GoogleAdData googleAdData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                c11795p = viewState.order;
            }
            if ((i10 & 4) != 0) {
                z11 = viewState.isBopasEligibleCart;
            }
            if ((i10 & 8) != 0) {
                googleAdData = viewState.googleAdData;
            }
            return viewState.a(z10, c11795p, z11, googleAdData);
        }

        public final ViewState a(boolean isLoading, OrderConfirmationDecorator order, boolean isBopasEligibleCart, GoogleAdData googleAdData) {
            return new ViewState(isLoading, order, isBopasEligibleCart, googleAdData);
        }

        /* renamed from: c, reason: from getter */
        public final GoogleAdData getGoogleAdData() {
            return this.googleAdData;
        }

        /* renamed from: d, reason: from getter */
        public final OrderConfirmationDecorator getOrder() {
            return this.order;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsBopasEligibleCart() {
            return this.isBopasEligibleCart;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ViewState(boolean z10, OrderConfirmationDecorator c11795p, boolean z11, GoogleAdData googleAdData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : c11795p, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : googleAdData);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationViewModel$fetchOrderDetail$1", f = "OrderConfirmationViewModel.kt", l = {130, 130}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f102110a;

        /* renamed from: b, reason: collision with root package name */
        Object f102111b;

        /* renamed from: c, reason: collision with root package name */
        Object f102112c;

        /* renamed from: d, reason: collision with root package name */
        Object f102113d;

        /* renamed from: e, reason: collision with root package name */
        int f102114e;

        /* renamed from: f, reason: collision with root package name */
        int f102115f;

        /* renamed from: g, reason: collision with root package name */
        int f102116g;

        /* renamed from: h, reason: collision with root package name */
        int f102117h;

        /* renamed from: i, reason: collision with root package name */
        int f102118i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f102119j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f102121l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f102121l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = Y.this.new c(this.f102121l, continuation);
            cVar.f102119j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        
            if (r13 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.Y.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Y(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, InterfaceC14261a analyticsEngine, C17828d firebaseLoggingUtil, yl.k featureManager, yo.k userManager) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(firebaseLoggingUtil, "firebaseLoggingUtil");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(userManager, "userManager");
        this.ordersRepository = ordersRepository;
        this.analyticsEngine = analyticsEngine;
        this.firebaseLoggingUtil = firebaseLoggingUtil;
        this.featureManager = featureManager;
        this.userManager = userManager;
        InterfaceC17140B<ViewState> interfaceC17140BA = tv.S.a(new ViewState(true, null, false, null, 14, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        this.disposables = new Nu.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence A(EntryDecorator entry) {
        Intrinsics.j(entry, "entry");
        return entry.getUpc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(OrderConfirmationDecorator c11795p, String str, Y y10, Ref.DoubleRef doubleRef, Ref.DoubleRef doubleRef2, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("purchaseID", String.valueOf(c11795p.getOrderNumber()));
        track.h("fulfillmentType", str);
        String strE = c11795p.getSubstitutionPreference();
        if (strE == null) {
            strE = "";
        }
        track.h("brandSubstitution", strE);
        String strD = c11795p.getStoreId();
        if (strD == null) {
            strD = "";
        }
        track.h("pickupStore", strD);
        OrderDetailsPickUpTimeDecorator j0VarG = c11795p.getTimeSlot();
        String strH = j0VarG != null ? j0VarG.getTimeForAdobeTag() : null;
        if (strH == null) {
            strH = "";
        }
        track.h("timeslotSelected", strH);
        OrderDetailsPickUpTimeDecorator j0VarG2 = c11795p.getTimeSlot();
        String strC = j0VarG2 != null ? j0VarG2.getAnalyticsDate() : null;
        if (strC == null) {
            strC = "";
        }
        track.h("pickupDate", strC);
        track.h("orderTaxAmount", String.valueOf(c11795p.getTotalTax()));
        track.h("orderFees", String.valueOf(c11795p.getDeliveryCost()));
        String strB = c11795p.getPhoneNumber();
        if (strB == null) {
            strB = "";
        }
        track.h("phoneNumber", strB);
        String strO = c11795p.getZipCode();
        track.h("zipcode", strO != null ? strO : "");
        track.h("orderSavings", Ak.b.e(c11795p.getTotalSavings()));
        track.h("digitalId", String.valueOf(y10.userManager.c()));
        track.h("pageName", String.valueOf(y10.userManager.c()));
        track.h("total_revenue", String.valueOf(doubleRef.f142831a));
        track.h("total_quantity", String.valueOf(doubleRef2.f142831a));
        track.n(y10.r("Meijer:Order Confirmation"));
        if (y10.sendPreTipAnalytics) {
            OrderConfirmationDecorator.PreTipDecorator dVarC = c11795p.getPreTipAndRateDetails();
            track.h("preTipSubmitted", String.valueOf(dVarC != null ? Boolean.valueOf(dVarC.getIsPreTipped()) : null));
            OrderConfirmationDecorator.PreTipDecorator dVarC2 = c11795p.getPreTipAndRateDetails();
            if (dVarC2 != null && dVarC2.getIsPreTipped()) {
                track.h("preTipAmount", new DecimalFormat("###.##").format(c11795p.getPreTipAndRateDetails().getAmount()));
                OffsetDateTime offsetDateTimeB = c11795p.getPreTipAndRateDetails().getDate();
                track.h("preTipDate", offsetDateTimeB != null ? offsetDateTimeB.format(C17590a.DATE_FORMAT_MM_DD_YYYY) : null);
                if (c11795p.getPreTipAndRateDetails().getPercentage() != 0.0d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((int) c11795p.getPreTipAndRateDetails().getPercentage());
                    sb2.append('%');
                    track.h("preTipPercentage", sb2.toString());
                }
            }
        }
        String strT = c11795p.getFulfillmentEligibility();
        if (strT != null) {
            track.h("fulfillmentEligibility", strT);
        }
        track.e(Ao.W.m(list, 0, 2, null));
        track.e(Ao.W.j(list));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, OrderConfirmationDecorator.INSTANCE.e(this.information), false, null, 12, null)));
    }

    private final String t(String resourceId) {
        return Intrinsics.e(resourceId, "pickup") ? "pickup" : Intrinsics.e(resourceId, "delivery") ? "delivery" : "None Selected";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(OrderDetail orderDetail) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            OrderDetail orderDetail2 = orderDetail;
            ViewState viewStateB = ViewState.b(value, false, OrderConfirmationDecorator.INSTANCE.b(orderDetail2, this.featureManager.e(AbstractC18227f.C18235i.f170582h), this.featureManager.e(AbstractC18227f.C18248v.f170608h), this.featureManager.e(AbstractC18227f.C18252z.f170616h), this.featureManager.e(AbstractC18227f.C18237k.f170586h)), false, null, 12, null);
            y(viewStateB);
            if (interfaceC17140B.e(value, viewStateB)) {
                return;
            } else {
                orderDetail = orderDetail2;
            }
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final String r(String input) throws UnsupportedEncodingException {
        Intrinsics.j(input, "input");
        String strEncode = URLEncoder.encode(" ", StandardCharsets.UTF_8.toString());
        Intrinsics.i(strEncode, "encode(...)");
        return StringsKt.Q(input, " ", StringsKt.Q(strEncode, "+", "%20", false, 4, null), false, 4, null);
    }

    public final tv.P<ViewState> u() {
        return this.viewState;
    }

    public final boolean v() {
        return this.featureManager.e(AbstractC18227f.a0.f170567h);
    }

    public final void w(a action) {
        ViewState value;
        ViewState value2;
        Intrinsics.j(action, "action");
        if (!(action instanceof a.LoadOrderDetail)) {
            if (Intrinsics.e(action, a.b.f102101a)) {
                InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, false, C13904e.b(C13904e.f131155a, EnumC13905f.f131158f, "confirmation", this.featureManager.e(AbstractC18227f.C.f170544h), null, this.userManager.y(), null, 40, null), 7, null)));
                return;
            } else {
                if (!(action instanceof a.GoogleAdClicked)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsEngine.e(C13902c.b(((a.GoogleAdClicked) action).getAnalytics(), "order confirmation page"));
                return;
            }
        }
        a.LoadOrderDetail loadOrderDetail = (a.LoadOrderDetail) action;
        this.information = loadOrderDetail.getInformation();
        this.sendPreTipAnalytics = loadOrderDetail.getSendPreTipAnalytics();
        InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewState;
        do {
            value2 = interfaceC17140B2.getValue();
        } while (!interfaceC17140B2.e(value2, ViewState.b(value2, false, null, loadOrderDetail.getIsBopasEligibleCart(), null, 11, null)));
        if (loadOrderDetail.getOrderId().length() == 0) {
            C();
        } else {
            s(loadOrderDetail.getOrderId());
        }
    }

    public final void y(ViewState viewState) {
        List listM;
        List<EntryDecorator> listD;
        List<EntryDecorator> listD2;
        Intrinsics.j(viewState, "viewState");
        final OrderConfirmationDecorator order = viewState.getOrder();
        if (order != null) {
            final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
            final Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
            final String strT = t(order.getDeliveryMode());
            CartItemsDecorator c11997uC = order.getCartItems();
            String strB0 = null;
            if (c11997uC == null || (listD2 = c11997uC.d()) == null) {
                listM = null;
            } else {
                List<EntryDecorator> list = listD2;
                listM = new ArrayList(CollectionsKt.x(list, 10));
                for (EntryDecorator entryDecorator : list) {
                    doubleRef.f142831a += entryDecorator.getQuantity();
                    doubleRef2.f142831a += entryDecorator.getTotalPrice();
                    listM.add(new W.Details(entryDecorator.getUpc(), null, null, Double.valueOf(entryDecorator.getQuantity()), Double.valueOf(entryDecorator.getTotalPrice()), null, null, null, null, null, null, null, null, null, null, null, null, null, entryDecorator.getDiscountDetails(), null, null, null, null, Boolean.valueOf(viewState.getOrder().getIsBopasSlot()), Boolean.valueOf(viewState.getIsBopasEligibleCart()), null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(viewState.getOrder().getIsEBTOrder()), null, viewState.getOrder().getEbtDesiredChargeAmount(), Boolean.valueOf(viewState.getOrder().getIsEZCDOrder()), null, null, null, null, null, -25427994, 15967, null));
                }
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            CartItemsDecorator c11997uC2 = order.getCartItems();
            if (c11997uC2 != null && (listD = c11997uC2.d()) != null) {
                strB0 = CollectionsKt.B0(listD, ";", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Y.A((EntryDecorator) obj);
                    }
                }, 30, null);
            }
            String str = strB0;
            final List list2 = listM;
            this.analyticsEngine.h(C14476c.h("Meijer:Order Confirmation"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y.B(order, strT, this, doubleRef2, doubleRef, list2, (TrackingData) obj);
                }
            });
            this.firebaseLoggingUtil.a("order_placed", C14835c.b(TuplesKt.a("order_id", order.getOrderNumber()), TuplesKt.a("fulfillment_type", strT), TuplesKt.a("value", Double.valueOf(order.getTotalPriceWithTax())), TuplesKt.a("currency", order.getTotalPriceCurrency()), TuplesKt.a("upcs", str)));
        }
    }

    private final void s(String orderId) {
        C16648k.d(androidx.view.d0.a(this), null, null, new c(orderId, null), 3, null);
    }
}

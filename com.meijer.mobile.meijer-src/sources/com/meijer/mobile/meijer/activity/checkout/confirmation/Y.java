package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ao.W;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import gi.C14375c;
import gi.C14377e;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import hj.OrderDetail;
import ii.C14756c;
import ii.TrackingData;
import j$.net.URLEncoder;
import j$.time.OffsetDateTime;
import j2.C14923c;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import wk.C17898a;
import xj.C18187d;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002*(B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\"028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0011\u0010I\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lhi/a;", "analyticsEngine", "Lxj/d;", "firebaseLoggingUtil", "Lzl/k;", "featureManager", "Lyo/k;", "userManager", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lhi/a;Lxj/d;Lzl/k;Lyo/k;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "s", "(Ljava/lang/String;)V", "Lhj/c;", "orderDetail", "x", "(Lhj/c;)V", "C", "()V", "resourceId", "t", "(Ljava/lang/String;)Ljava/lang/String;", "onCleared", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "action", "w", "(Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;)V", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "viewState", "y", "(Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;)V", "input", "r", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lhi/a;", "c", "Lxj/d;", "d", "Lzl/k;", "e", "Lyo/k;", "Lpv/B;", "f", "Lpv/B;", "_viewState", "Lpv/P;", "g", "Lpv/P;", "u", "()Lpv/P;", "LJu/a;", "h", "LJu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "i", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "j", "Z", "sendPreTipAnalytics", "v", "()Z", "isRoktAdEnabled", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Y extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C18187d firebaseLoggingUtil;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private z1.OrderConfirmationInfo information;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean sendPreTipAnalytics;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "", "<init>", "()V", "c", "b", "a", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$a;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.Y$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoogleAdClicked extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f102954b = GoogleAdAnalytics.f134240f;

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
            public static final b f102956a = new b();

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "", "", "isLoading", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "isBopasEligibleCart", "Lgi/d;", "googleAdData", "<init>", "(ZLcom/meijer/mobile/meijer/activity/checkout/confirmation/p;ZLgi/d;)V", "a", "(ZLcom/meijer/mobile/meijer/activity/checkout/confirmation/p;ZLgi/d;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "d", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "c", "e", "Lgi/d;", "()Lgi/d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            OrderConfirmationDecorator c11920p = this.order;
            int iHashCode2 = (((iHashCode + (c11920p == null ? 0 : c11920p.hashCode())) * 31) + Boolean.hashCode(this.isBopasEligibleCart)) * 31;
            GoogleAdData googleAdData = this.googleAdData;
            return iHashCode2 + (googleAdData != null ? googleAdData.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(isLoading=" + this.isLoading + ", order=" + this.order + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", googleAdData=" + this.googleAdData + ')';
        }

        public ViewState(boolean z10, OrderConfirmationDecorator c11920p, boolean z11, GoogleAdData googleAdData) {
            this.isLoading = z10;
            this.order = c11920p;
            this.isBopasEligibleCart = z11;
            this.googleAdData = googleAdData;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, OrderConfirmationDecorator c11920p, boolean z11, GoogleAdData googleAdData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                c11920p = viewState.order;
            }
            if ((i10 & 4) != 0) {
                z11 = viewState.isBopasEligibleCart;
            }
            if ((i10 & 8) != 0) {
                googleAdData = viewState.googleAdData;
            }
            return viewState.a(z10, c11920p, z11, googleAdData);
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

        public /* synthetic */ ViewState(boolean z10, OrderConfirmationDecorator c11920p, boolean z11, GoogleAdData googleAdData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : c11920p, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : googleAdData);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationViewModel$fetchOrderDetail$1", f = "OrderConfirmationViewModel.kt", l = {130, 130}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f102965a;

        /* renamed from: b, reason: collision with root package name */
        Object f102966b;

        /* renamed from: c, reason: collision with root package name */
        Object f102967c;

        /* renamed from: d, reason: collision with root package name */
        Object f102968d;

        /* renamed from: e, reason: collision with root package name */
        int f102969e;

        /* renamed from: f, reason: collision with root package name */
        int f102970f;

        /* renamed from: g, reason: collision with root package name */
        int f102971g;

        /* renamed from: h, reason: collision with root package name */
        int f102972h;

        /* renamed from: i, reason: collision with root package name */
        int f102973i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f102974j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f102976l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f102976l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = Y.this.new c(this.f102976l, continuation);
            cVar.f102974j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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

    public Y(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, InterfaceC14523a analyticsEngine, C18187d firebaseLoggingUtil, zl.k featureManager, yo.k userManager) {
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
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(true, null, false, null, 14, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.disposables = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence A(EntryDecorator entry) {
        Intrinsics.j(entry, "entry");
        return entry.getUpc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(OrderConfirmationDecorator c11920p, String str, Y y10, Ref.DoubleRef doubleRef, Ref.DoubleRef doubleRef2, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("purchaseID", String.valueOf(c11920p.getOrderNumber()));
        track.h("fulfillmentType", str);
        String strE = c11920p.getSubstitutionPreference();
        if (strE == null) {
            strE = "";
        }
        track.h("brandSubstitution", strE);
        String strD = c11920p.getStoreId();
        if (strD == null) {
            strD = "";
        }
        track.h("pickupStore", strD);
        OrderDetailsPickUpTimeDecorator j0VarG = c11920p.getTimeSlot();
        String strH = j0VarG != null ? j0VarG.getTimeForAdobeTag() : null;
        if (strH == null) {
            strH = "";
        }
        track.h("timeslotSelected", strH);
        OrderDetailsPickUpTimeDecorator j0VarG2 = c11920p.getTimeSlot();
        String strC = j0VarG2 != null ? j0VarG2.getAnalyticsDate() : null;
        if (strC == null) {
            strC = "";
        }
        track.h("pickupDate", strC);
        track.h("orderTaxAmount", String.valueOf(c11920p.getTotalTax()));
        track.h("orderFees", String.valueOf(c11920p.getDeliveryCost()));
        String strB = c11920p.getPhoneNumber();
        if (strB == null) {
            strB = "";
        }
        track.h("phoneNumber", strB);
        String strO = c11920p.getZipCode();
        track.h("zipcode", strO != null ? strO : "");
        track.h("orderSavings", Bk.b.e(c11920p.getTotalSavings()));
        track.h("digitalId", String.valueOf(y10.userManager.c()));
        track.h("pageName", String.valueOf(y10.userManager.c()));
        track.h("total_revenue", String.valueOf(doubleRef.f143738a));
        track.h("total_quantity", String.valueOf(doubleRef2.f143738a));
        track.n(y10.r("Meijer:Order Confirmation"));
        if (y10.sendPreTipAnalytics) {
            OrderConfirmationDecorator.PreTipDecorator dVarC = c11920p.getPreTipAndRateDetails();
            track.h("preTipSubmitted", String.valueOf(dVarC != null ? Boolean.valueOf(dVarC.getIsPreTipped()) : null));
            OrderConfirmationDecorator.PreTipDecorator dVarC2 = c11920p.getPreTipAndRateDetails();
            if (dVarC2 != null && dVarC2.getIsPreTipped()) {
                track.h("preTipAmount", new DecimalFormat("###.##").format(c11920p.getPreTipAndRateDetails().getAmount()));
                OffsetDateTime offsetDateTimeB = c11920p.getPreTipAndRateDetails().getDate();
                track.h("preTipDate", offsetDateTimeB != null ? offsetDateTimeB.format(C17898a.DATE_FORMAT_MM_DD_YYYY) : null);
                if (c11920p.getPreTipAndRateDetails().getPercentage() != 0.0d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((int) c11920p.getPreTipAndRateDetails().getPercentage());
                    sb2.append('%');
                    track.h("preTipPercentage", sb2.toString());
                }
            }
        }
        String strT = c11920p.getFulfillmentEligibility();
        if (strT != null) {
            track.h("fulfillmentEligibility", strT);
        }
        track.e(Ao.W.m(list, 0, 2, null));
        track.e(Ao.W.j(list));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, false, OrderConfirmationDecorator.INSTANCE.e(this.information), false, null, 12, null)));
    }

    private final String t(String resourceId) {
        return Intrinsics.e(resourceId, "pickup") ? "pickup" : Intrinsics.e(resourceId, "delivery") ? "delivery" : "None Selected";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(OrderDetail orderDetail) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            OrderDetail orderDetail2 = orderDetail;
            ViewState viewStateB = ViewState.b(value, false, OrderConfirmationDecorator.INSTANCE.b(orderDetail2, this.featureManager.e(AbstractC18503f.C18511i.f172882h), this.featureManager.e(AbstractC18503f.C18524v.f172908h), this.featureManager.e(AbstractC18503f.C18528z.f172916h), this.featureManager.e(AbstractC18503f.C18513k.f172886h)), false, null, 12, null);
            y(viewStateB);
            if (interfaceC16549B.e(value, viewStateB)) {
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

    public final pv.P<ViewState> u() {
        return this.viewState;
    }

    public final boolean v() {
        return this.featureManager.e(AbstractC18503f.a0.f172867h);
    }

    public final void w(a action) {
        ViewState value;
        ViewState value2;
        Intrinsics.j(action, "action");
        if (!(action instanceof a.LoadOrderDetail)) {
            if (Intrinsics.e(action, a.b.f102956a)) {
                InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b(value, false, null, false, C14377e.b(C14377e.f134254a, EnumC14378f.f134257f, "confirmation", this.featureManager.e(AbstractC18503f.C.f172844h), null, this.userManager.y(), null, 40, null), 7, null)));
                return;
            } else {
                if (!(action instanceof a.GoogleAdClicked)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsEngine.k(C14375c.b(((a.GoogleAdClicked) action).getAnalytics(), "order confirmation page"));
                return;
            }
        }
        a.LoadOrderDetail loadOrderDetail = (a.LoadOrderDetail) action;
        this.information = loadOrderDetail.getInformation();
        this.sendPreTipAnalytics = loadOrderDetail.getSendPreTipAnalytics();
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        do {
            value2 = interfaceC16549B2.getValue();
        } while (!interfaceC16549B2.e(value2, ViewState.b(value2, false, null, loadOrderDetail.getIsBopasEligibleCart(), null, 11, null)));
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
            CartItemsDecorator c12122uC = order.getCartItems();
            String strB0 = null;
            if (c12122uC == null || (listD2 = c12122uC.d()) == null) {
                listM = null;
            } else {
                List<EntryDecorator> list = listD2;
                listM = new ArrayList(CollectionsKt.x(list, 10));
                for (EntryDecorator entryDecorator : list) {
                    doubleRef.f143738a += entryDecorator.getQuantity();
                    doubleRef2.f143738a += entryDecorator.getTotalPrice();
                    listM.add(new W.Details(entryDecorator.getUpc(), null, null, Double.valueOf(entryDecorator.getQuantity()), Double.valueOf(entryDecorator.getTotalPrice()), null, null, null, null, null, null, null, null, null, null, null, null, null, entryDecorator.getDiscountDetails(), null, null, null, null, Boolean.valueOf(viewState.getOrder().getIsBopasSlot()), Boolean.valueOf(viewState.getIsBopasEligibleCart()), null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(viewState.getOrder().getIsEBTOrder()), null, viewState.getOrder().getEbtDesiredChargeAmount(), Boolean.valueOf(viewState.getOrder().getIsEZCDOrder()), null, null, null, null, null, -25427994, 15967, null));
                }
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            CartItemsDecorator c12122uC2 = order.getCartItems();
            if (c12122uC2 != null && (listD = c12122uC2.d()) != null) {
                strB0 = CollectionsKt.B0(listD, ";", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Y.A((EntryDecorator) obj);
                    }
                }, 30, null);
            }
            String str = strB0;
            final List list2 = listM;
            this.analyticsEngine.b(C14756c.h("Meijer:Order Confirmation"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y.B(order, strT, this, doubleRef2, doubleRef, list2, (TrackingData) obj);
                }
            });
            this.firebaseLoggingUtil.a("order_placed", C14923c.b(TuplesKt.a(NotificationsManager.INTENT_EXTRA_ORDER_ID, order.getOrderNumber()), TuplesKt.a("fulfillment_type", strT), TuplesKt.a("value", Double.valueOf(order.getTotalPriceWithTax())), TuplesKt.a("currency", order.getTotalPriceCurrency()), TuplesKt.a("upcs", str)));
        }
    }

    private final void s(String orderId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new c(orderId, null), 3, null);
    }
}

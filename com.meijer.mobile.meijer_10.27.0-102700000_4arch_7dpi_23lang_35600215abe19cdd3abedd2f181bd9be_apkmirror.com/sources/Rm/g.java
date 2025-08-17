package Rm;

import Dh.CustomerPropertiesResponse;
import Lm.a;
import Oj.a;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import com.meijer.mobile.meijer.activity.find.model.ChartDataType;
import com.meijer.mobile.serverapi.response.receiptsandsavings.ReceiptsAndSavingsResponse;
import com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.TrackingData;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;
import zp.CustomerSavings;
import zp.DigitalReceipt;
import zp.MonthSavingsSummary;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0004,($\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020'0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000202068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"LRm/g;", "Landroidx/lifecycle/c0;", "Lyo/k;", "userManager", "Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "receiptsAndSavingsDataSource", "<init>", "(Lyo/k;Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;)V", "j$/time/YearMonth", "now", "", "w", "(Lj$/time/YearMonth;)Ljava/util/List;", "Lzp/b;", "receipts", "", "D", "(Ljava/util/List;)Ljava/util/Map;", "Lzp/e;", "savings", "LRm/g$b;", "C", "Lzp/a;", "customerSavings", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "v", "(Lzp/a;)Ljava/util/List;", "", "y", "()V", "LLm/a;", "action", "E", "(LLm/a;)V", "a", "Lyo/k;", "b", "Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "Ltv/B;", "LRm/g$d;", "c", "Ltv/B;", "_viewStateFlow", "Ltv/P;", "d", "Ltv/P;", "B", "()Ltv/P;", "viewStateFlow", "Ltv/A;", "LRm/g$a;", "e", "Ltv/A;", "_effectsFlow", "Ltv/F;", "f", "Ltv/F;", "A", "()Ltv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<a> effectsFlow;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LRm/g$a;", "", "<init>", "()V", "d", "c", "a", "b", "e", "LRm/g$a$a;", "LRm/g$a$b;", "LRm/g$a$c;", "LRm/g$a$d;", "LRm/g$a$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LRm/g$a$a;", "LRm/g$a;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.g$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class StartCustomerResubmitDetailActivity extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public StartCustomerResubmitDetailActivity(TrackingData trackingData) {
                super(null);
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartCustomerResubmitDetailActivity) && Intrinsics.e(this.trackingData, ((StartCustomerResubmitDetailActivity) other).trackingData);
            }

            /* renamed from: a, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public int hashCode() {
                TrackingData trackingData = this.trackingData;
                if (trackingData == null) {
                    return 0;
                }
                return trackingData.hashCode();
            }

            public String toString() {
                return "StartCustomerResubmitDetailActivity(trackingData=" + this.trackingData + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LRm/g$a$b;", "LRm/g$a;", "Lzp/b;", "receipt", "Lhi/f;", "trackingData", "<init>", "(Lzp/b;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/b;", "()Lzp/b;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.g$a$b, reason: from toString */
        public static final /* data */ class StartDigitalReceiptsActivity extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DigitalReceipt receipt;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartDigitalReceiptsActivity)) {
                    return false;
                }
                StartDigitalReceiptsActivity startDigitalReceiptsActivity = (StartDigitalReceiptsActivity) other;
                return Intrinsics.e(this.receipt, startDigitalReceiptsActivity.receipt) && Intrinsics.e(this.trackingData, startDigitalReceiptsActivity.trackingData);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartDigitalReceiptsActivity(DigitalReceipt receipt, TrackingData trackingData) {
                super(null);
                Intrinsics.j(receipt, "receipt");
                this.receipt = receipt;
                this.trackingData = trackingData;
            }

            /* renamed from: a, reason: from getter */
            public final DigitalReceipt getReceipt() {
                return this.receipt;
            }

            /* renamed from: b, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public int hashCode() {
                int iHashCode = this.receipt.hashCode() * 31;
                TrackingData trackingData = this.trackingData;
                return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
            }

            public String toString() {
                return "StartDigitalReceiptsActivity(receipt=" + this.receipt + ", trackingData=" + this.trackingData + ')';
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LRm/g$a$c;", "LRm/g$a;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/Long;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.g$a$c, reason: from toString */
        public static final /* data */ class StartOrderDetailsActivity extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Long orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public StartOrderDetailsActivity(Long l10, TrackingData trackingData) {
                super(null);
                this.orderId = l10;
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartOrderDetailsActivity)) {
                    return false;
                }
                StartOrderDetailsActivity startOrderDetailsActivity = (StartOrderDetailsActivity) other;
                return Intrinsics.e(this.orderId, startOrderDetailsActivity.orderId) && Intrinsics.e(this.trackingData, startOrderDetailsActivity.trackingData);
            }

            /* renamed from: a, reason: from getter */
            public final Long getOrderId() {
                return this.orderId;
            }

            /* renamed from: b, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public int hashCode() {
                Long l10 = this.orderId;
                int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
                TrackingData trackingData = this.trackingData;
                return iHashCode + (trackingData != null ? trackingData.hashCode() : 0);
            }

            public String toString() {
                return "StartOrderDetailsActivity(orderId=" + this.orderId + ", trackingData=" + this.trackingData + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LRm/g$a$d;", "LRm/g$a;", "Lzp/a;", "savingsDetails", "Lhi/f;", "trackingData", "<init>", "(Lzp/a;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/a;", "()Lzp/a;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.g$a$d, reason: from toString */
        public static final /* data */ class StartSavingsDetailActivity extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CustomerSavings savingsDetails;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public StartSavingsDetailActivity(CustomerSavings customerSavings, TrackingData trackingData) {
                super(null);
                this.savingsDetails = customerSavings;
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartSavingsDetailActivity)) {
                    return false;
                }
                StartSavingsDetailActivity startSavingsDetailActivity = (StartSavingsDetailActivity) other;
                return Intrinsics.e(this.savingsDetails, startSavingsDetailActivity.savingsDetails) && Intrinsics.e(this.trackingData, startSavingsDetailActivity.trackingData);
            }

            /* renamed from: a, reason: from getter */
            public final CustomerSavings getSavingsDetails() {
                return this.savingsDetails;
            }

            /* renamed from: b, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public int hashCode() {
                CustomerSavings customerSavings = this.savingsDetails;
                int iHashCode = (customerSavings == null ? 0 : customerSavings.hashCode()) * 31;
                TrackingData trackingData = this.trackingData;
                return iHashCode + (trackingData != null ? trackingData.hashCode() : 0);
            }

            public String toString() {
                return "StartSavingsDetailActivity(savingsDetails=" + this.savingsDetails + ", trackingData=" + this.trackingData + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LRm/g$a$e;", "LRm/g$a;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Rm.g$a$e, reason: from toString */
        public static final /* data */ class StartSelfRemediationActivity extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public StartSelfRemediationActivity(TrackingData trackingData) {
                super(null);
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartSelfRemediationActivity) && Intrinsics.e(this.trackingData, ((StartSelfRemediationActivity) other).trackingData);
            }

            /* renamed from: a, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public int hashCode() {
                TrackingData trackingData = this.trackingData;
                if (trackingData == null) {
                    return 0;
                }
                return trackingData.hashCode();
            }

            public String toString() {
                return "StartSelfRemediationActivity(trackingData=" + this.trackingData + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LRm/g$b;", "", "", "totalSpending", "totalSavings", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rm.g$b, reason: from toString */
    public static final /* data */ class ReceiptSummary {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalSpending;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalSavings;

        public ReceiptSummary() {
            this(0.0d, 0.0d, 3, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceiptSummary)) {
                return false;
            }
            ReceiptSummary receiptSummary = (ReceiptSummary) other;
            return Double.compare(this.totalSpending, receiptSummary.totalSpending) == 0 && Double.compare(this.totalSavings, receiptSummary.totalSavings) == 0;
        }

        public ReceiptSummary(double d10, double d11) {
            this.totalSpending = d10;
            this.totalSavings = d11;
        }

        /* renamed from: a, reason: from getter */
        public final double getTotalSavings() {
            return this.totalSavings;
        }

        /* renamed from: b, reason: from getter */
        public final double getTotalSpending() {
            return this.totalSpending;
        }

        public int hashCode() {
            return (Double.hashCode(this.totalSpending) * 31) + Double.hashCode(this.totalSavings);
        }

        public String toString() {
            return "ReceiptSummary(totalSpending=" + this.totalSpending + ", totalSavings=" + this.totalSavings + ')';
        }

        public /* synthetic */ ReceiptSummary(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, d2 = {"LRm/g$c;", "", "", "shouldShowReceipts", "", "j$/time/YearMonth", "allMonths", "", "Lzp/b;", "yearMonthReceipts", "LRm/g$b;", "yearMonthReceiptSummary", "j$/time/LocalDate", "receiptsSinceDate", "<init>", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lj$/time/LocalDate;)V", "a", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lj$/time/LocalDate;)LRm/g$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowReceipts", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "d", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rm.g$c, reason: from toString */
    public static final /* data */ class ReceiptsAndSavingsListViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowReceipts;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<YearMonth> allMonths;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<YearMonth, List<DigitalReceipt>> yearMonthReceipts;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<YearMonth, ReceiptSummary> yearMonthReceiptSummary;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate receiptsSinceDate;

        public ReceiptsAndSavingsListViewState() {
            this(false, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceiptsAndSavingsListViewState)) {
                return false;
            }
            ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState = (ReceiptsAndSavingsListViewState) other;
            return this.shouldShowReceipts == receiptsAndSavingsListViewState.shouldShowReceipts && Intrinsics.e(this.allMonths, receiptsAndSavingsListViewState.allMonths) && Intrinsics.e(this.yearMonthReceipts, receiptsAndSavingsListViewState.yearMonthReceipts) && Intrinsics.e(this.yearMonthReceiptSummary, receiptsAndSavingsListViewState.yearMonthReceiptSummary) && Intrinsics.e(this.receiptsSinceDate, receiptsAndSavingsListViewState.receiptsSinceDate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiptsAndSavingsListViewState(boolean z10, List<YearMonth> allMonths, Map<YearMonth, ? extends List<DigitalReceipt>> yearMonthReceipts, Map<YearMonth, ReceiptSummary> yearMonthReceiptSummary, LocalDate receiptsSinceDate) {
            Intrinsics.j(allMonths, "allMonths");
            Intrinsics.j(yearMonthReceipts, "yearMonthReceipts");
            Intrinsics.j(yearMonthReceiptSummary, "yearMonthReceiptSummary");
            Intrinsics.j(receiptsSinceDate, "receiptsSinceDate");
            this.shouldShowReceipts = z10;
            this.allMonths = allMonths;
            this.yearMonthReceipts = yearMonthReceipts;
            this.yearMonthReceiptSummary = yearMonthReceiptSummary;
            this.receiptsSinceDate = receiptsSinceDate;
        }

        public final ReceiptsAndSavingsListViewState a(boolean shouldShowReceipts, List<YearMonth> allMonths, Map<YearMonth, ? extends List<DigitalReceipt>> yearMonthReceipts, Map<YearMonth, ReceiptSummary> yearMonthReceiptSummary, LocalDate receiptsSinceDate) {
            Intrinsics.j(allMonths, "allMonths");
            Intrinsics.j(yearMonthReceipts, "yearMonthReceipts");
            Intrinsics.j(yearMonthReceiptSummary, "yearMonthReceiptSummary");
            Intrinsics.j(receiptsSinceDate, "receiptsSinceDate");
            return new ReceiptsAndSavingsListViewState(shouldShowReceipts, allMonths, yearMonthReceipts, yearMonthReceiptSummary, receiptsSinceDate);
        }

        public final List<YearMonth> b() {
            return this.allMonths;
        }

        /* renamed from: c, reason: from getter */
        public final LocalDate getReceiptsSinceDate() {
            return this.receiptsSinceDate;
        }

        public final Map<YearMonth, ReceiptSummary> d() {
            return this.yearMonthReceiptSummary;
        }

        public final Map<YearMonth, List<DigitalReceipt>> e() {
            return this.yearMonthReceipts;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.shouldShowReceipts) * 31) + this.allMonths.hashCode()) * 31) + this.yearMonthReceipts.hashCode()) * 31) + this.yearMonthReceiptSummary.hashCode()) * 31) + this.receiptsSinceDate.hashCode();
        }

        public String toString() {
            return "ReceiptsAndSavingsListViewState(shouldShowReceipts=" + this.shouldShowReceipts + ", allMonths=" + this.allMonths + ", yearMonthReceipts=" + this.yearMonthReceipts + ", yearMonthReceiptSummary=" + this.yearMonthReceiptSummary + ", receiptsSinceDate=" + this.receiptsSinceDate + ')';
        }

        public /* synthetic */ ReceiptsAndSavingsListViewState(boolean z10, List list, Map map, Map map2, LocalDate localDate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? MapsKt.k() : map, (i10 & 8) != 0 ? MapsKt.k() : map2, (i10 & 16) != 0 ? LocalDate.now().minusYears(2L) : localDate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012Jl\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b,\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b&\u0010%¨\u00061"}, d2 = {"LRm/g$d;", "", "LDh/l;", "customerPropertiesResponse", "", "Lzp/e;", "savingsByMonth", "Lzp/b;", "receiptsList", "Lzp/a;", "savingsDetails", "LOj/a;", "loadingState", "LRm/g$c;", "receiptsAndSavingsListViewState", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "chartDataList", "<init>", "(LDh/l;Ljava/util/List;Ljava/util/List;Lzp/a;LOj/a;LRm/g$c;Ljava/util/List;)V", "a", "(LDh/l;Ljava/util/List;Ljava/util/List;Lzp/a;LOj/a;LRm/g$c;Ljava/util/List;)LRm/g$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LDh/l;", "getCustomerPropertiesResponse", "()LDh/l;", "b", "Ljava/util/List;", "getSavingsByMonth", "()Ljava/util/List;", "c", "f", "d", "Lzp/a;", "g", "()Lzp/a;", "e", "LOj/a;", "()LOj/a;", "LRm/g$c;", "()LRm/g$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rm.g$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerPropertiesResponse customerPropertiesResponse;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<MonthSavingsSummary> savingsByMonth;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DigitalReceipt> receiptsList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerSavings savingsDetails;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Oj.a loadingState;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ChartData> chartDataList;

        public ViewState() {
            this(null, null, null, null, null, null, null, l3.f92485d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.customerPropertiesResponse, viewState.customerPropertiesResponse) && Intrinsics.e(this.savingsByMonth, viewState.savingsByMonth) && Intrinsics.e(this.receiptsList, viewState.receiptsList) && Intrinsics.e(this.savingsDetails, viewState.savingsDetails) && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.receiptsAndSavingsListViewState, viewState.receiptsAndSavingsListViewState) && Intrinsics.e(this.chartDataList, viewState.chartDataList);
        }

        public ViewState(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings customerSavings, Oj.a loadingState, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List<ChartData> chartDataList) {
            Intrinsics.j(savingsByMonth, "savingsByMonth");
            Intrinsics.j(receiptsList, "receiptsList");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(receiptsAndSavingsListViewState, "receiptsAndSavingsListViewState");
            Intrinsics.j(chartDataList, "chartDataList");
            this.customerPropertiesResponse = customerPropertiesResponse;
            this.savingsByMonth = savingsByMonth;
            this.receiptsList = receiptsList;
            this.savingsDetails = customerSavings;
            this.loadingState = loadingState;
            this.receiptsAndSavingsListViewState = receiptsAndSavingsListViewState;
            this.chartDataList = chartDataList;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, Oj.a aVar, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerPropertiesResponse = viewState.customerPropertiesResponse;
            }
            if ((i10 & 2) != 0) {
                list = viewState.savingsByMonth;
            }
            if ((i10 & 4) != 0) {
                list2 = viewState.receiptsList;
            }
            if ((i10 & 8) != 0) {
                customerSavings = viewState.savingsDetails;
            }
            if ((i10 & 16) != 0) {
                aVar = viewState.loadingState;
            }
            if ((i10 & 32) != 0) {
                receiptsAndSavingsListViewState = viewState.receiptsAndSavingsListViewState;
            }
            if ((i10 & 64) != 0) {
                list3 = viewState.chartDataList;
            }
            ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState2 = receiptsAndSavingsListViewState;
            List list4 = list3;
            Oj.a aVar2 = aVar;
            List list5 = list2;
            return viewState.a(customerPropertiesResponse, list, list5, customerSavings, aVar2, receiptsAndSavingsListViewState2, list4);
        }

        public final ViewState a(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings savingsDetails, Oj.a loadingState, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List<ChartData> chartDataList) {
            Intrinsics.j(savingsByMonth, "savingsByMonth");
            Intrinsics.j(receiptsList, "receiptsList");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(receiptsAndSavingsListViewState, "receiptsAndSavingsListViewState");
            Intrinsics.j(chartDataList, "chartDataList");
            return new ViewState(customerPropertiesResponse, savingsByMonth, receiptsList, savingsDetails, loadingState, receiptsAndSavingsListViewState, chartDataList);
        }

        public final List<ChartData> c() {
            return this.chartDataList;
        }

        /* renamed from: d, reason: from getter */
        public final Oj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: e, reason: from getter */
        public final ReceiptsAndSavingsListViewState getReceiptsAndSavingsListViewState() {
            return this.receiptsAndSavingsListViewState;
        }

        public final List<DigitalReceipt> f() {
            return this.receiptsList;
        }

        /* renamed from: g, reason: from getter */
        public final CustomerSavings getSavingsDetails() {
            return this.savingsDetails;
        }

        public int hashCode() {
            CustomerPropertiesResponse customerPropertiesResponse = this.customerPropertiesResponse;
            int iHashCode = (((((customerPropertiesResponse == null ? 0 : customerPropertiesResponse.hashCode()) * 31) + this.savingsByMonth.hashCode()) * 31) + this.receiptsList.hashCode()) * 31;
            CustomerSavings customerSavings = this.savingsDetails;
            return ((((((iHashCode + (customerSavings != null ? customerSavings.hashCode() : 0)) * 31) + this.loadingState.hashCode()) * 31) + this.receiptsAndSavingsListViewState.hashCode()) * 31) + this.chartDataList.hashCode();
        }

        public String toString() {
            return "ViewState(customerPropertiesResponse=" + this.customerPropertiesResponse + ", savingsByMonth=" + this.savingsByMonth + ", receiptsList=" + this.receiptsList + ", savingsDetails=" + this.savingsDetails + ", loadingState=" + this.loadingState + ", receiptsAndSavingsListViewState=" + this.receiptsAndSavingsListViewState + ", chartDataList=" + this.chartDataList + ')';
        }

        public /* synthetic */ ViewState(CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, Oj.a aVar, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : customerPropertiesResponse, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? null : customerSavings, (i10 & 16) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 32) != 0 ? new ReceiptsAndSavingsListViewState(false, null, null, null, null, 31, null) : receiptsAndSavingsListViewState, (i10 & 64) != 0 ? CollectionsKt.m() : list3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$fetchReceipts$1", f = "DigitalReceiptsViewModel.kt", l = {73}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f32495a;

        /* renamed from: b, reason: collision with root package name */
        Object f32496b;

        /* renamed from: c, reason: collision with root package name */
        Object f32497c;

        /* renamed from: d, reason: collision with root package name */
        Object f32498d;

        /* renamed from: e, reason: collision with root package name */
        int f32499e;

        /* renamed from: f, reason: collision with root package name */
        int f32500f;

        /* renamed from: g, reason: collision with root package name */
        int f32501g;

        /* renamed from: h, reason: collision with root package name */
        int f32502h;

        /* renamed from: i, reason: collision with root package name */
        int f32503i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f32504j;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(continuation);
            eVar.f32504j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            ViewState viewState;
            CustomerSavings savingsDetails;
            List<DigitalReceipt> receiptsList;
            List<MonthSavingsSummary> savingsByMonth;
            ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState;
            boolean z10;
            List<YearMonth> listW;
            Map<YearMonth, ? extends List<DigitalReceipt>> mapD;
            Map<YearMonth, ReceiptSummary> mapC;
            LocalDate localDateL;
            Object value3;
            Object customerProperties$default;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32503i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f32504j;
                    g gVar = g.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC17140B interfaceC17140B = gVar._viewStateFlow;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, ViewState.b((ViewState) value3, null, null, null, null, new a.Loading(null, AbstractC5607a.INSTANCE.d(Y.f99506Cd, new Object[0]), 1, null), null, null, 111, null)));
                    ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource = gVar.receiptsAndSavingsDataSource;
                    LocalDateTime localDateTimeU = yo.k.u(gVar.userManager, null, 1, null);
                    this.f32504j = interfaceC16622O;
                    this.f32495a = interfaceC16622O;
                    this.f32496b = this;
                    this.f32497c = this;
                    this.f32498d = interfaceC16622O;
                    this.f32499e = 0;
                    this.f32500f = 0;
                    this.f32501g = 0;
                    this.f32502h = 0;
                    this.f32503i = 1;
                    customerProperties$default = ReceiptsAndSavingsDataSource.getCustomerProperties$default(receiptsAndSavingsDataSource, localDateTimeU, null, this, 2, null);
                    if (customerProperties$default == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    customerProperties$default = obj;
                }
                objB = Result.b(customerProperties$default);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            g gVar2 = g.this;
            if (Result.h(objB)) {
                ReceiptsAndSavingsResponse receiptsAndSavingsResponse = (ReceiptsAndSavingsResponse) objB;
                InterfaceC17140B interfaceC17140B2 = gVar2._viewStateFlow;
                do {
                    value2 = interfaceC17140B2.getValue();
                    viewState = (ViewState) value2;
                    savingsDetails = receiptsAndSavingsResponse.getSavingsDetails();
                    receiptsList = receiptsAndSavingsResponse.getReceiptsList();
                    savingsByMonth = receiptsAndSavingsResponse.getSavingsByMonth();
                    receiptsAndSavingsListViewState = viewState.getReceiptsAndSavingsListViewState();
                    z10 = !receiptsAndSavingsResponse.getReceiptsList().isEmpty();
                    YearMonth yearMonthNow = YearMonth.now();
                    Intrinsics.i(yearMonthNow, "now(...)");
                    listW = gVar2.w(yearMonthNow);
                    mapD = gVar2.D(CollectionsKt.j1(receiptsAndSavingsResponse.getReceiptsList()));
                    mapC = gVar2.C(receiptsAndSavingsResponse.getSavingsByMonth());
                    localDateL = yo.k.u(gVar2.userManager, null, 1, null).l();
                    Intrinsics.i(localDateL, "toLocalDate(...)");
                } while (!interfaceC17140B2.e(value2, ViewState.b(viewState, null, savingsByMonth, receiptsList, savingsDetails, new a.NotLoading(null, 1, null), receiptsAndSavingsListViewState.a(z10, listW, mapD, mapC, localDateL), gVar2.v(receiptsAndSavingsResponse.getSavingsDetails()), 1, null)));
            }
            g gVar3 = g.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Error loading receipts", new Object[0]);
                InterfaceC17140B interfaceC17140B3 = gVar3._viewStateFlow;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, ViewState.b((ViewState) value, null, null, null, null, new a.Failed(null, AbstractC5607a.INSTANCE.d(Y.f99866Vc, new Object[0]), 1, null), null, null, 111, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$1", f = "DigitalReceiptsViewModel.kt", l = {188}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32506a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lm.a f32508c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Lm.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f32508c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new f(this.f32508c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32506a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = g.this._effectsFlow;
                a.StartOrderDetailsActivity startOrderDetailsActivity = new a.StartOrderDetailsActivity(((a.DisplayOrderDetails) this.f32508c).getOrderId(), ((a.DisplayOrderDetails) this.f32508c).getTrackingData());
                this.f32506a = 1;
                if (interfaceC17139A.emit(startOrderDetailsActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$2", f = "DigitalReceiptsViewModel.kt", l = {197}, m = "invokeSuspend")
    /* renamed from: Rm.g$g, reason: collision with other inner class name */
    static final class C0727g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32509a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lm.a f32511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0727g(Lm.a aVar, Continuation<? super C0727g> continuation) {
            super(2, continuation);
            this.f32511c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new C0727g(this.f32511c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C0727g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32509a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = g.this._effectsFlow;
                a.StartDigitalReceiptsActivity startDigitalReceiptsActivity = new a.StartDigitalReceiptsActivity(((a.DisplayReceiptsDetail) this.f32511c).getReceipt(), ((a.DisplayReceiptsDetail) this.f32511c).getTrackingData());
                this.f32509a = 1;
                if (interfaceC17139A.emit(startDigitalReceiptsActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$3", f = "DigitalReceiptsViewModel.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32512a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lm.a f32514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Lm.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f32514c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new h(this.f32514c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32512a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = g.this._effectsFlow;
                a.StartSavingsDetailActivity startSavingsDetailActivity = new a.StartSavingsDetailActivity(((a.DisplaySavingsDetails) this.f32514c).getSavingsDetail(), ((a.DisplaySavingsDetails) this.f32514c).getTrackingData());
                this.f32512a = 1;
                if (interfaceC17139A.emit(startSavingsDetailActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$4", f = "DigitalReceiptsViewModel.kt", l = {215}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32515a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lm.a f32517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Lm.a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f32517c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new i(this.f32517c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32515a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = g.this._effectsFlow;
                a.StartCustomerResubmitDetailActivity startCustomerResubmitDetailActivity = new a.StartCustomerResubmitDetailActivity(((a.ResubmitCustomerDetail) this.f32517c).getTrackingData());
                this.f32515a = 1;
                if (interfaceC17139A.emit(startCustomerResubmitDetailActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$5", f = "DigitalReceiptsViewModel.kt", l = {223}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32518a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lm.a f32520c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Lm.a aVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f32520c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new j(this.f32520c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f32518a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = g.this._effectsFlow;
                a.StartSelfRemediationActivity startSelfRemediationActivity = new a.StartSelfRemediationActivity(((a.AddTransaction) this.f32520c).getTrackingData());
                this.f32518a = 1;
                if (interfaceC17139A.emit(startSelfRemediationActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public g(yo.k userManager, ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource) {
        ViewState value;
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(receiptsAndSavingsDataSource, "receiptsAndSavingsDataSource");
        this.userManager = userManager;
        this.receiptsAndSavingsDataSource = receiptsAndSavingsDataSource;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, null, null, null, null, null, l3.f92485d, null));
        this._viewStateFlow = interfaceC17140BA;
        this.viewStateFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<a> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC17139AB;
        this.effectsFlow = C17154h.b(interfaceC17139AB);
        do {
            value = interfaceC17140BA.getValue();
        } while (!interfaceC17140BA.e(value, ViewState.b(value, new CustomerPropertiesResponse(this.userManager.I(), false, yo.k.x(this.userManager, null, 1, null)), null, null, null, null, null, null, 126, null)));
        if (this.userManager.b()) {
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<YearMonth, ReceiptSummary> C(List<MonthSavingsSummary> savings) {
        List<MonthSavingsSummary> list = savings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (MonthSavingsSummary monthSavingsSummary : list) {
            linkedHashMap.put(monthSavingsSummary.getYearMonth(), new ReceiptSummary(monthSavingsSummary.getSpendingAmount(), monthSavingsSummary.getSavingsTotal()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<YearMonth, List<DigitalReceipt>> D(List<DigitalReceipt> receipts) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : receipts) {
            YearMonth yearMonthFrom = YearMonth.from(((DigitalReceipt) obj).getTransactionDateTime());
            Intrinsics.i(yearMonthFrom, "from(...)");
            Object arrayList = linkedHashMap.get(yearMonthFrom);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(yearMonthFrom, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ChartData> v(CustomerSavings customerSavings) {
        if (customerSavings != null) {
            double d10 = 360;
            ChartData chartData = new ChartData(ChartDataType.MPERKS, customerSavings.getMPerksTotal(), 0, (int) ((customerSavings.getMPerksTotal() / customerSavings.getSavingsTotal()) * d10));
            ChartData chartData2 = new ChartData(ChartDataType.COUPONS, customerSavings.getCouponsTotal(), (int) ((customerSavings.getCouponsTotal() / customerSavings.getSavingsTotal()) * d10), (int) (((customerSavings.getMPerksTotal() + customerSavings.getCouponsTotal()) / customerSavings.getSavingsTotal()) * d10));
            ChartData chartData3 = new ChartData(ChartDataType.SPECIALS, customerSavings.getSpecialsTotal(), (int) (((customerSavings.getMPerksTotal() + customerSavings.getCouponsTotal()) / customerSavings.getSavingsTotal()) * d10), (int) ((((customerSavings.getMPerksTotal() + customerSavings.getCouponsTotal()) + customerSavings.getSpecialsTotal()) / customerSavings.getSavingsTotal()) * d10));
            ChartData chartData4 = new ChartData(ChartDataType.TEAM_MEMBER, customerSavings.getTeamMemberTotal(), (int) ((((customerSavings.getMPerksTotal() + customerSavings.getCouponsTotal()) + customerSavings.getSpecialsTotal()) / customerSavings.getSavingsTotal()) * d10), 360);
            if (chartData4.getValue() == 0.0d) {
                chartData4 = null;
            }
            List<ChartData> listR = CollectionsKt.r(chartData, chartData2, chartData3, chartData4);
            if (listR != null) {
                return listR;
            }
        }
        return CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<YearMonth> w(YearMonth now) {
        yo.k kVar = this.userManager;
        LocalDateTime localDateTimeAtStartOfDay = now.atDay(1).atStartOfDay();
        Intrinsics.i(localDateTimeAtStartOfDay, "atStartOfDay(...)");
        return CollectionsKt.T(SequencesKt.W(vk.c.b(YearMonth.from(kVar.t(localDateTimeAtStartOfDay)), now, new Function1() { // from class: Rm.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.x((YearMonth) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YearMonth x(YearMonth yearMonth) {
        return yearMonth.plusMonths(1L);
    }

    public final InterfaceC17144F<a> A() {
        return this.effectsFlow;
    }

    public final P<ViewState> B() {
        return this.viewStateFlow;
    }

    public final void E(Lm.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.DisplayOrderDetails) {
            C16648k.d(d0.a(this), null, null, new f(action, null), 3, null);
            return;
        }
        if (action instanceof a.DisplayReceiptsDetail) {
            C16648k.d(d0.a(this), null, null, new C0727g(action, null), 3, null);
            return;
        }
        if (action instanceof a.DisplaySavingsDetails) {
            C16648k.d(d0.a(this), null, null, new h(action, null), 3, null);
            return;
        }
        if (action instanceof a.ResubmitCustomerDetail) {
            C16648k.d(d0.a(this), null, null, new i(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, a.e.f18551a)) {
            y();
            Unit unit = Unit.f142422a;
        } else {
            if (!(action instanceof a.AddTransaction)) {
                throw new NoWhenBranchMatchedException();
            }
            C16648k.d(d0.a(this), null, null, new j(action, null), 3, null);
        }
    }

    public final void y() {
        C16648k.d(d0.a(this), null, null, new e(null), 3, null);
    }
}

package Sm;

import Eh.CustomerPropertiesResponse;
import Mm.a;
import Pj.a;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import com.meijer.mobile.meijer.activity.find.model.ChartDataType;
import com.meijer.mobile.serverapi.response.receiptsandsavings.ReceiptsAndSavingsResponse;
import com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ii.TrackingData;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import zp.CustomerSavings;
import zp.DigitalReceipt;
import zp.MonthSavingsSummary;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0004,($\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020'0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000202068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"LSm/g;", "Landroidx/lifecycle/c0;", "Lyo/k;", "userManager", "Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "receiptsAndSavingsDataSource", "<init>", "(Lyo/k;Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;)V", "j$/time/YearMonth", "now", "", "w", "(Lj$/time/YearMonth;)Ljava/util/List;", "Lzp/b;", "receipts", "", "D", "(Ljava/util/List;)Ljava/util/Map;", "Lzp/e;", "savings", "LSm/g$b;", "C", "Lzp/a;", "customerSavings", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "v", "(Lzp/a;)Ljava/util/List;", "", "y", "()V", "LMm/a;", "action", "E", "(LMm/a;)V", "a", "Lyo/k;", "b", "Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "Lpv/B;", "LSm/g$d;", "c", "Lpv/B;", "_viewStateFlow", "Lpv/P;", "d", "Lpv/P;", "B", "()Lpv/P;", "viewStateFlow", "Lpv/A;", "LSm/g$a;", "e", "Lpv/A;", "_effectsFlow", "Lpv/F;", "f", "Lpv/F;", "A", "()Lpv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class g extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<a> effectsFlow;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSm/g$a;", "", "<init>", "()V", "d", "c", "a", "b", "e", "LSm/g$a$a;", "LSm/g$a$b;", "LSm/g$a$c;", "LSm/g$a$d;", "LSm/g$a$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LSm/g$a$a;", "LSm/g$a;", "Lii/f;", "trackingData", "<init>", "(Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.g$a$a, reason: collision with other inner class name and from toString */
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LSm/g$a$b;", "LSm/g$a;", "Lzp/b;", "receipt", "Lii/f;", "trackingData", "<init>", "(Lzp/b;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/b;", "()Lzp/b;", "b", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.g$a$b, reason: from toString */
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

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LSm/g$a$c;", "LSm/g$a;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "Lii/f;", "trackingData", "<init>", "(Ljava/lang/Long;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.g$a$c, reason: from toString */
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LSm/g$a$d;", "LSm/g$a;", "Lzp/a;", "savingsDetails", "Lii/f;", "trackingData", "<init>", "(Lzp/a;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/a;", "()Lzp/a;", "b", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.g$a$d, reason: from toString */
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LSm/g$a$e;", "LSm/g$a;", "Lii/f;", "trackingData", "<init>", "(Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.g$a$e, reason: from toString */
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LSm/g$b;", "", "", "totalSpending", "totalSavings", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sm.g$b, reason: from toString */
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, d2 = {"LSm/g$c;", "", "", "shouldShowReceipts", "", "j$/time/YearMonth", "allMonths", "", "Lzp/b;", "yearMonthReceipts", "LSm/g$b;", "yearMonthReceiptSummary", "j$/time/LocalDate", "receiptsSinceDate", "<init>", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lj$/time/LocalDate;)V", "a", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lj$/time/LocalDate;)LSm/g$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowReceipts", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "d", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sm.g$c, reason: from toString */
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

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012Jl\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b,\u00100R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b&\u0010%¨\u00061"}, d2 = {"LSm/g$d;", "", "LEh/l;", "customerPropertiesResponse", "", "Lzp/e;", "savingsByMonth", "Lzp/b;", "receiptsList", "Lzp/a;", "savingsDetails", "LPj/a;", "loadingState", "LSm/g$c;", "receiptsAndSavingsListViewState", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "chartDataList", "<init>", "(LEh/l;Ljava/util/List;Ljava/util/List;Lzp/a;LPj/a;LSm/g$c;Ljava/util/List;)V", "a", "(LEh/l;Ljava/util/List;Ljava/util/List;Lzp/a;LPj/a;LSm/g$c;Ljava/util/List;)LSm/g$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LEh/l;", "getCustomerPropertiesResponse", "()LEh/l;", "b", "Ljava/util/List;", "getSavingsByMonth", "()Ljava/util/List;", "c", "f", "d", "Lzp/a;", "g", "()Lzp/a;", "e", "LPj/a;", "()LPj/a;", "LSm/g$c;", "()LSm/g$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sm.g$d, reason: from toString */
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
        private final Pj.a loadingState;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ChartData> chartDataList;

        public ViewState() {
            this(null, null, null, null, null, null, null, l3.f93324d, null);
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

        public ViewState(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings customerSavings, Pj.a loadingState, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List<ChartData> chartDataList) {
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

        public static /* synthetic */ ViewState b(ViewState viewState, CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, Pj.a aVar, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List list3, int i10, Object obj) {
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
            Pj.a aVar2 = aVar;
            List list5 = list2;
            return viewState.a(customerPropertiesResponse, list, list5, customerSavings, aVar2, receiptsAndSavingsListViewState2, list4);
        }

        public final ViewState a(CustomerPropertiesResponse customerPropertiesResponse, List<MonthSavingsSummary> savingsByMonth, List<DigitalReceipt> receiptsList, CustomerSavings savingsDetails, Pj.a loadingState, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List<ChartData> chartDataList) {
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
        public final Pj.a getLoadingState() {
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

        public /* synthetic */ ViewState(CustomerPropertiesResponse customerPropertiesResponse, List list, List list2, CustomerSavings customerSavings, Pj.a aVar, ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : customerPropertiesResponse, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? null : customerSavings, (i10 & 16) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 32) != 0 ? new ReceiptsAndSavingsListViewState(false, null, null, null, null, 31, null) : receiptsAndSavingsListViewState, (i10 & 64) != 0 ? CollectionsKt.m() : list3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$fetchReceipts$1", f = "DigitalReceiptsViewModel.kt", l = {73}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f34851a;

        /* renamed from: b, reason: collision with root package name */
        Object f34852b;

        /* renamed from: c, reason: collision with root package name */
        Object f34853c;

        /* renamed from: d, reason: collision with root package name */
        Object f34854d;

        /* renamed from: e, reason: collision with root package name */
        int f34855e;

        /* renamed from: f, reason: collision with root package name */
        int f34856f;

        /* renamed from: g, reason: collision with root package name */
        int f34857g;

        /* renamed from: h, reason: collision with root package name */
        int f34858h;

        /* renamed from: i, reason: collision with root package name */
        int f34859i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f34860j;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(continuation);
            eVar.f34860j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f34859i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f34860j;
                    g gVar = g.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = gVar._viewStateFlow;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, ViewState.b((ViewState) value3, null, null, null, null, new a.Loading(null, AbstractC6392a.INSTANCE.d(Y.f100425Fd, new Object[0]), 1, null), null, null, 111, null)));
                    ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource = gVar.receiptsAndSavingsDataSource;
                    LocalDateTime localDateTimeU = yo.k.u(gVar.userManager, null, 1, null);
                    this.f34860j = interfaceC15783O;
                    this.f34851a = interfaceC15783O;
                    this.f34852b = this;
                    this.f34853c = this;
                    this.f34854d = interfaceC15783O;
                    this.f34855e = 0;
                    this.f34856f = 0;
                    this.f34857g = 0;
                    this.f34858h = 0;
                    this.f34859i = 1;
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
                InterfaceC16549B interfaceC16549B2 = gVar2._viewStateFlow;
                do {
                    value2 = interfaceC16549B2.getValue();
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
                } while (!interfaceC16549B2.e(value2, ViewState.b(viewState, null, savingsByMonth, receiptsList, savingsDetails, new a.NotLoading(null, 1, null), receiptsAndSavingsListViewState.a(z10, listW, mapD, mapC, localDateL), gVar2.v(receiptsAndSavingsResponse.getSavingsDetails()), 1, null)));
            }
            g gVar3 = g.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Error loading receipts", new Object[0]);
                InterfaceC16549B interfaceC16549B3 = gVar3._viewStateFlow;
                do {
                    value = interfaceC16549B3.getValue();
                } while (!interfaceC16549B3.e(value, ViewState.b((ViewState) value, null, null, null, null, new a.Failed(null, AbstractC6392a.INSTANCE.d(Y.f100785Yc, new Object[0]), 1, null), null, null, 111, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$1", f = "DigitalReceiptsViewModel.kt", l = {188}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34862a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.a f34864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Mm.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f34864c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new f(this.f34864c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34862a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                a.StartOrderDetailsActivity startOrderDetailsActivity = new a.StartOrderDetailsActivity(((a.DisplayOrderDetails) this.f34864c).getOrderId(), ((a.DisplayOrderDetails) this.f34864c).getTrackingData());
                this.f34862a = 1;
                if (interfaceC16548A.emit(startOrderDetailsActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$2", f = "DigitalReceiptsViewModel.kt", l = {197}, m = "invokeSuspend")
    /* renamed from: Sm.g$g, reason: collision with other inner class name */
    static final class C0777g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34865a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.a f34867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0777g(Mm.a aVar, Continuation<? super C0777g> continuation) {
            super(2, continuation);
            this.f34867c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new C0777g(this.f34867c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C0777g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34865a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                a.StartDigitalReceiptsActivity startDigitalReceiptsActivity = new a.StartDigitalReceiptsActivity(((a.DisplayReceiptsDetail) this.f34867c).getReceipt(), ((a.DisplayReceiptsDetail) this.f34867c).getTrackingData());
                this.f34865a = 1;
                if (interfaceC16548A.emit(startDigitalReceiptsActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$3", f = "DigitalReceiptsViewModel.kt", l = {HttpResponseStatus.SUCCESS_PARTIAL_CONTENT}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34868a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.a f34870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Mm.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f34870c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new h(this.f34870c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34868a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                a.StartSavingsDetailActivity startSavingsDetailActivity = new a.StartSavingsDetailActivity(((a.DisplaySavingsDetails) this.f34870c).getSavingsDetail(), ((a.DisplaySavingsDetails) this.f34870c).getTrackingData());
                this.f34868a = 1;
                if (interfaceC16548A.emit(startSavingsDetailActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$4", f = "DigitalReceiptsViewModel.kt", l = {215}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34871a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.a f34873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Mm.a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f34873c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new i(this.f34873c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34871a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                a.StartCustomerResubmitDetailActivity startCustomerResubmitDetailActivity = new a.StartCustomerResubmitDetailActivity(((a.ResubmitCustomerDetail) this.f34873c).getTrackingData());
                this.f34871a = 1;
                if (interfaceC16548A.emit(startCustomerResubmitDetailActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.DigitalReceiptsViewModel$onAction$5", f = "DigitalReceiptsViewModel.kt", l = {223}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34874a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.a f34876c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Mm.a aVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f34876c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new j(this.f34876c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34874a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                a.StartSelfRemediationActivity startSelfRemediationActivity = new a.StartSelfRemediationActivity(((a.AddTransaction) this.f34876c).getTrackingData());
                this.f34874a = 1;
                if (interfaceC16548A.emit(startSelfRemediationActivity, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public g(yo.k userManager, ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource) {
        ViewState value;
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(receiptsAndSavingsDataSource, "receiptsAndSavingsDataSource");
        this.userManager = userManager;
        this.receiptsAndSavingsDataSource = receiptsAndSavingsDataSource;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, null, null, null, null, null, null, l3.f93324d, null));
        this._viewStateFlow = interfaceC16549BA;
        this.viewStateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<a> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
        do {
            value = interfaceC16549BA.getValue();
        } while (!interfaceC16549BA.e(value, ViewState.b(value, new CustomerPropertiesResponse(this.userManager.I(), false, yo.k.x(this.userManager, null, 1, null)), null, null, null, null, null, null, 126, null)));
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
        return CollectionsKt.T(SequencesKt.X(wk.c.b(YearMonth.from(kVar.t(localDateTimeAtStartOfDay)), now, new Function1() { // from class: Sm.f
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

    public final InterfaceC16553F<a> A() {
        return this.effectsFlow;
    }

    public final P<ViewState> B() {
        return this.viewStateFlow;
    }

    public final void E(Mm.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.DisplayOrderDetails) {
            C15809k.d(d0.a(this), null, null, new f(action, null), 3, null);
            return;
        }
        if (action instanceof a.DisplayReceiptsDetail) {
            C15809k.d(d0.a(this), null, null, new C0777g(action, null), 3, null);
            return;
        }
        if (action instanceof a.DisplaySavingsDetails) {
            C15809k.d(d0.a(this), null, null, new h(action, null), 3, null);
            return;
        }
        if (action instanceof a.ResubmitCustomerDetail) {
            C15809k.d(d0.a(this), null, null, new i(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, a.e.f20360a)) {
            y();
            Unit unit = Unit.f143329a;
        } else {
            if (!(action instanceof a.AddTransaction)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new j(action, null), 3, null);
        }
    }

    public final void y() {
        C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }
}

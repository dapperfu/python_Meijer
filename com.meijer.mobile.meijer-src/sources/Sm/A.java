package Sm;

import Mm.b;
import Om.Q0;
import Pj.a;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.meijer.Y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.InterfaceC14523a;
import ii.TrackingData;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lj.C15514c;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import wk.C17898a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 H2\u00020\u0001:\u0003/+)B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u0002090=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020!088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020!0=8\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A¨\u0006I"}, d2 = {"LSm/A;", "Landroidx/lifecycle/c0;", "LEp/i;", "submitTransactionDataSource", "Lhi/a;", "analyticsEngine", "<init>", "(LEp/i;Lhi/a;)V", "", "A", "()V", "", "dateString", "D", "(Ljava/lang/String;)V", "txNumber", "H", "tmNumber", "G", "storeNumber", "E", "timeStr", "F", "j$/time/LocalDate", "B", "(Ljava/lang/String;)Lj$/time/LocalDate;", "receiptBarcode", "C", "y", "", "exception", "x", "(Ljava/lang/Throwable;)V", "LOm/Q0;", "screen", "v", "(LOm/Q0;)V", "LMm/b;", "action", "w", "(LMm/b;)V", "a", "LEp/i;", "b", "Lhi/a;", "Lpv/B;", "LSm/A$c;", "c", "Lpv/B;", "_stateFlow", "Lpv/P;", "d", "Lpv/P;", "u", "()Lpv/P;", "stateFlow", "Lpv/A;", "LSm/A$b;", "e", "Lpv/A;", "_effectsFlow", "Lpv/F;", "f", "Lpv/F;", "s", "()Lpv/F;", "effectsFlow", "g", "_screenFlow", "h", "t", "screenFlow", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class A extends c0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f34756j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ep.i submitTransactionDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _stateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> stateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<b> effectsFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<Q0> _screenFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<Q0> screenFlow;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSm/A$b;", "", "<init>", "()V", "a", "b", "d", "c", "e", "LSm/A$b$a;", "LSm/A$b$b;", "LSm/A$b$c;", "LSm/A$b$d;", "LSm/A$b$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LSm/A$b$a;", "LSm/A$b;", "", "title", "message", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.A$b$a, reason: from toString */
        public static final /* data */ class DisplayValidationError extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            public DisplayValidationError(int i10, int i11) {
                super(null);
                this.title = i10;
                this.message = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayValidationError)) {
                    return false;
                }
                DisplayValidationError displayValidationError = (DisplayValidationError) other;
                return this.title == displayValidationError.title && this.message == displayValidationError.message;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message);
            }

            public String toString() {
                return "DisplayValidationError(title=" + this.title + ", message=" + this.message + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LSm/A$b$b;", "LSm/A$b;", "Lii/f;", "trackingData", "<init>", "(Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lii/f;", "()Lii/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.A$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class NavigateToReceiptScan extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public NavigateToReceiptScan(TrackingData trackingData) {
                super(null);
                this.trackingData = trackingData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToReceiptScan) && Intrinsics.e(this.trackingData, ((NavigateToReceiptScan) other).trackingData);
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
                return "NavigateToReceiptScan(trackingData=" + this.trackingData + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LSm/A$b$c;", "LSm/A$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.A$b$c, reason: from toString */
        public static final /* data */ class SubmitReceiptFailure extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable throwable;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitReceiptFailure) && Intrinsics.e(this.throwable, ((SubmitReceiptFailure) other).throwable);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmitReceiptFailure(Throwable throwable) {
                super(null);
                Intrinsics.j(throwable, "throwable");
                this.throwable = throwable;
            }

            /* renamed from: a, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "SubmitReceiptFailure(throwable=" + this.throwable + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSm/A$b$d;", "LSm/A$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f34769a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "SubmitReceiptSuccess";
            }

            public int hashCode() {
                return 1802338181;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSm/A$b$e;", "LSm/A$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f34770a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "TrackSubmitRemediationAnalytics";
            }

            public int hashCode() {
                return 156317410;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jn\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/¨\u00060"}, d2 = {"LSm/A$c;", "", "LPj/a;", "loadingState", "j$/time/LocalDate", "date", "j$/time/LocalTime", "time", "", "txNumber", "tmNumber", "storeNumber", "", "dateStr", "timeStr", "", "displaySubmitButton", "<init>", "(LPj/a;Lj$/time/LocalDate;Lj$/time/LocalTime;IIILjava/lang/String;Ljava/lang/String;Z)V", "a", "(LPj/a;Lj$/time/LocalDate;Lj$/time/LocalTime;IIILjava/lang/String;Ljava/lang/String;Z)LSm/A$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LPj/a;", "f", "()LPj/a;", "b", "Lj$/time/LocalDate;", "c", "()Lj$/time/LocalDate;", "Lj$/time/LocalTime;", "h", "()Lj$/time/LocalTime;", "d", "I", "k", "e", "j", "g", "Ljava/lang/String;", "i", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sm.A$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate date;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalTime time;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int txNumber;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int tmNumber;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeNumber;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dateStr;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String timeStr;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displaySubmitButton;

        public ViewState() {
            this(null, null, null, 0, 0, 0, null, null, false, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.date, viewState.date) && Intrinsics.e(this.time, viewState.time) && this.txNumber == viewState.txNumber && this.tmNumber == viewState.tmNumber && this.storeNumber == viewState.storeNumber && Intrinsics.e(this.dateStr, viewState.dateStr) && Intrinsics.e(this.timeStr, viewState.timeStr) && this.displaySubmitButton == viewState.displaySubmitButton;
        }

        public ViewState(Pj.a loadingState, LocalDate localDate, LocalTime localTime, int i10, int i11, int i12, String dateStr, String timeStr, boolean z10) {
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(dateStr, "dateStr");
            Intrinsics.j(timeStr, "timeStr");
            this.loadingState = loadingState;
            this.date = localDate;
            this.time = localTime;
            this.txNumber = i10;
            this.tmNumber = i11;
            this.storeNumber = i12;
            this.dateStr = dateStr;
            this.timeStr = timeStr;
            this.displaySubmitButton = z10;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, Pj.a aVar, LocalDate localDate, LocalTime localTime, int i10, int i11, int i12, String str, String str2, boolean z10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                aVar = viewState.loadingState;
            }
            if ((i13 & 2) != 0) {
                localDate = viewState.date;
            }
            if ((i13 & 4) != 0) {
                localTime = viewState.time;
            }
            if ((i13 & 8) != 0) {
                i10 = viewState.txNumber;
            }
            if ((i13 & 16) != 0) {
                i11 = viewState.tmNumber;
            }
            if ((i13 & 32) != 0) {
                i12 = viewState.storeNumber;
            }
            if ((i13 & 64) != 0) {
                str = viewState.dateStr;
            }
            if ((i13 & 128) != 0) {
                str2 = viewState.timeStr;
            }
            if ((i13 & 256) != 0) {
                z10 = viewState.displaySubmitButton;
            }
            String str3 = str2;
            boolean z11 = z10;
            int i14 = i12;
            String str4 = str;
            int i15 = i11;
            LocalTime localTime2 = localTime;
            return viewState.a(aVar, localDate, localTime2, i10, i15, i14, str4, str3, z11);
        }

        public final ViewState a(Pj.a loadingState, LocalDate date, LocalTime time, int txNumber, int tmNumber, int storeNumber, String dateStr, String timeStr, boolean displaySubmitButton) {
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(dateStr, "dateStr");
            Intrinsics.j(timeStr, "timeStr");
            return new ViewState(loadingState, date, time, txNumber, tmNumber, storeNumber, dateStr, timeStr, displaySubmitButton);
        }

        /* renamed from: c, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* renamed from: d, reason: from getter */
        public final String getDateStr() {
            return this.dateStr;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getDisplaySubmitButton() {
            return this.displaySubmitButton;
        }

        /* renamed from: f, reason: from getter */
        public final Pj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: g, reason: from getter */
        public final int getStoreNumber() {
            return this.storeNumber;
        }

        /* renamed from: h, reason: from getter */
        public final LocalTime getTime() {
            return this.time;
        }

        public int hashCode() {
            int iHashCode = this.loadingState.hashCode() * 31;
            LocalDate localDate = this.date;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalTime localTime = this.time;
            return ((((((((((((iHashCode2 + (localTime != null ? localTime.hashCode() : 0)) * 31) + Integer.hashCode(this.txNumber)) * 31) + Integer.hashCode(this.tmNumber)) * 31) + Integer.hashCode(this.storeNumber)) * 31) + this.dateStr.hashCode()) * 31) + this.timeStr.hashCode()) * 31) + Boolean.hashCode(this.displaySubmitButton);
        }

        /* renamed from: i, reason: from getter */
        public final String getTimeStr() {
            return this.timeStr;
        }

        /* renamed from: j, reason: from getter */
        public final int getTmNumber() {
            return this.tmNumber;
        }

        /* renamed from: k, reason: from getter */
        public final int getTxNumber() {
            return this.txNumber;
        }

        public String toString() {
            return "ViewState(loadingState=" + this.loadingState + ", date=" + this.date + ", time=" + this.time + ", txNumber=" + this.txNumber + ", tmNumber=" + this.tmNumber + ", storeNumber=" + this.storeNumber + ", dateStr=" + this.dateStr + ", timeStr=" + this.timeStr + ", displaySubmitButton=" + this.displaySubmitButton + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(Pj.a r3, j$.time.LocalDate r4, j$.time.LocalTime r5, int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r2 = this;
                r13 = r12 & 1
                r0 = 0
                r1 = 1
                if (r13 == 0) goto Lb
                Pj.a$c r3 = new Pj.a$c
                r3.<init>(r0, r1, r0)
            Lb:
                r13 = r12 & 2
                if (r13 == 0) goto L10
                r4 = r0
            L10:
                r13 = r12 & 4
                if (r13 == 0) goto L15
                r5 = r0
            L15:
                r13 = r12 & 8
                r0 = 0
                if (r13 == 0) goto L1b
                r6 = r0
            L1b:
                r13 = r12 & 16
                if (r13 == 0) goto L20
                r7 = r0
            L20:
                r13 = r12 & 32
                if (r13 == 0) goto L25
                r8 = r0
            L25:
                r13 = r12 & 64
                java.lang.String r0 = ""
                if (r13 == 0) goto L2c
                r9 = r0
            L2c:
                r13 = r12 & 128(0x80, float:1.8E-43)
                if (r13 == 0) goto L31
                r10 = r0
            L31:
                r12 = r12 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L40
                r13 = r1
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L4a
            L40:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L4a:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sm.A.ViewState.<init>(Pj.a, j$.time.LocalDate, j$.time.LocalTime, int, int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$navigateTo$1", f = "SelfRemediationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34780a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q0 f34782c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Q0 q02, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f34782c = q02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new d(this.f34782c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f34780a == 0) {
                ResultKt.b(obj);
                A.this._screenFlow.b(this.f34782c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$onAction$1", f = "SelfRemediationViewModel.kt", l = {66}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34783a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Mm.b f34785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Mm.b bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f34785c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new e(this.f34785c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34783a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.NavigateToReceiptScan navigateToReceiptScan = new b.NavigateToReceiptScan(((b.ScanReceiptBarcode) this.f34785c).getTrackingData());
                this.f34783a = 1;
                if (interfaceC16548A.emit(navigateToReceiptScan, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$onResubmitTransactionFailure$1", f = "SelfRemediationViewModel.kt", l = {276}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34786a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f34788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Throwable th2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f34788c = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new f(this.f34788c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34786a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.SubmitReceiptFailure submitReceiptFailure = new b.SubmitReceiptFailure(this.f34788c);
                this.f34786a = 1;
                if (interfaceC16548A.emit(submitReceiptFailure, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$onResubmitTransactionSuccess$1", f = "SelfRemediationViewModel.kt", l = {266}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34789a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34789a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.d dVar = b.d.f34769a;
                this.f34789a = 1;
                if (interfaceC16548A.emit(dVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$submitRemediation$2", f = "SelfRemediationViewModel.kt", l = {237}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34791a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34791a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.e eVar = b.e.f34770a;
                this.f34791a = 1;
                if (interfaceC16548A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$submitRemediation$3", f = "SelfRemediationViewModel.kt", l = {242, 245}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f34793a;

        /* renamed from: b, reason: collision with root package name */
        Object f34794b;

        /* renamed from: c, reason: collision with root package name */
        Object f34795c;

        /* renamed from: d, reason: collision with root package name */
        Object f34796d;

        /* renamed from: e, reason: collision with root package name */
        Object f34797e;

        /* renamed from: f, reason: collision with root package name */
        int f34798f;

        /* renamed from: g, reason: collision with root package name */
        int f34799g;

        /* renamed from: h, reason: collision with root package name */
        int f34800h;

        /* renamed from: i, reason: collision with root package name */
        int f34801i;

        /* renamed from: j, reason: collision with root package name */
        int f34802j;

        /* renamed from: k, reason: collision with root package name */
        int f34803k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f34804l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f34805m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ A f34806n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, A a10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f34805m = str;
            this.f34806n = a10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = new i(this.f34805m, this.f34806n, continuation);
            iVar.f34804l = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
        
            if (r3.d(r6, r12) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Sm.A.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$validateDate$2", f = "SelfRemediationViewModel.kt", l = {114}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34807a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34807a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.DisplayValidationError displayValidationError = new b.DisplayValidationError(Y.f101163rd, Y.f101023kd);
                this.f34807a = 1;
                if (interfaceC16548A.emit(displayValidationError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$validateStoreNumber$2", f = "SelfRemediationViewModel.kt", l = {169}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34809a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34809a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.DisplayValidationError displayValidationError = new b.DisplayValidationError(Y.f101143qd, Y.f101043ld);
                this.f34809a = 1;
                if (interfaceC16548A.emit(displayValidationError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$validateTime$2", f = "SelfRemediationViewModel.kt", l = {194}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34811a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34811a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.DisplayValidationError displayValidationError = new b.DisplayValidationError(Y.f101163rd, Y.f101063md);
                this.f34811a = 1;
                if (interfaceC16548A.emit(displayValidationError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$validateTmNumber$2", f = "SelfRemediationViewModel.kt", l = {148}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34813a;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34813a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.DisplayValidationError displayValidationError = new b.DisplayValidationError(Y.f101143qd, Y.f101083nd);
                this.f34813a = 1;
                if (interfaceC16548A.emit(displayValidationError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.SelfRemediationViewModel$validateTxNumber$2", f = "SelfRemediationViewModel.kt", l = {130}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34815a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34815a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = A.this._effectsFlow;
                b.DisplayValidationError displayValidationError = new b.DisplayValidationError(Y.f101143qd, Y.f101103od);
                this.f34815a = 1;
                if (interfaceC16548A.emit(displayValidationError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public A(Ep.i submitTransactionDataSource, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(submitTransactionDataSource, "submitTransactionDataSource");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.submitTransactionDataSource = submitTransactionDataSource;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, null, null, 0, 0, 0, null, null, false, 511, null));
        this._stateFlow = interfaceC16549BA;
        this.stateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<b> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
        InterfaceC16548A<Q0> interfaceC16548AB2 = C16555H.b(0, 1, null, 5, null);
        this._screenFlow = interfaceC16548AB2;
        this.screenFlow = C16563h.b(interfaceC16548AB2);
    }

    private final void A() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, 0, 0, 0, "", "", true, 1, null)));
    }

    private final LocalDate B(String dateString) {
        Regex regex = new Regex("[^\\d]");
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMddyy");
        Intrinsics.i(dateTimeFormatterOfPattern, "ofPattern(...)");
        LocalDate localDate = (LocalDate) wk.d.b(dateString, dateTimeFormatterOfPattern, new Dh.a());
        if (localDate != null) {
            String str = localDate.format(C17898a.f167225a.f());
            Intrinsics.i(str, "format(...)");
            if (Intrinsics.e(regex.k(str, ""), dateString)) {
                return localDate;
            }
        }
        return null;
    }

    private final void C(String receiptBarcode) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new a.Loading(null, null, 3, null), null, null, 0, 0, 0, null, null, false, 510, null)));
        C15809k.d(d0.a(this), null, null, new h(null), 3, null);
        C15809k.d(d0.a(this), null, null, new i(receiptBarcode, this, null), 3, null);
    }

    private final void F(String timeStr) {
        String str = timeStr;
        String strB0 = CollectionsKt.B0(StringsKt.H1(str, 2), ":", null, null, 0, null, null, 62, null);
        if (!Ds.h.f6648a.c(strB0)) {
            C15809k.d(d0.a(this), null, null, new l(null), 3, null);
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ViewState.b(value, null, null, (LocalTime) wk.d.b(strB0, C17898a.f167225a.u(), new C15514c()), 0, 0, 0, null, str, false, 379, null))) {
                v(Q0.g.f24599c);
                return;
            }
            str = timeStr;
        }
    }

    private final void H(String txNumber) {
        ViewState value;
        if (!Ds.h.f6648a.b(txNumber, 1, 100000)) {
            C15809k.d(d0.a(this), null, null, new n(null), 3, null);
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, Integer.parseInt(txNumber), 0, 0, null, null, false, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null)));
        v(Q0.d.f24596c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Throwable exception) {
        ViewState value;
        C15809k.d(d0.a(this), null, null, new f(exception, null), 3, null);
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new a.Failed(null, null, 3, null), null, null, 0, 0, 0, null, null, false, 254, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        ViewState value;
        C15809k.d(d0.a(this), null, null, new g(null), 3, null);
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new a.NotLoading(null, 1, null), null, null, 0, 0, 0, null, null, false, 254, null)));
    }

    public final InterfaceC16553F<b> s() {
        return this.effectsFlow;
    }

    public final InterfaceC16553F<Q0> t() {
        return this.screenFlow;
    }

    public final P<ViewState> u() {
        return this.stateFlow;
    }

    public final void v(Q0 screen) {
        Intrinsics.j(screen, "screen");
        C15809k.d(d0.a(this), null, null, new d(screen, null), 3, null);
    }

    public final void w(Mm.b action) {
        Intrinsics.j(action, "action");
        if (action instanceof b.EnterDate) {
            D(((b.EnterDate) action).getDate());
            return;
        }
        if (action instanceof b.EnterStoreInformation) {
            E(((b.EnterStoreInformation) action).getStoreNumber());
            return;
        }
        if (action instanceof b.EnterTimeInformation) {
            F(((b.EnterTimeInformation) action).getTime());
            return;
        }
        if (action instanceof b.EnterTmNumber) {
            G(((b.EnterTmNumber) action).getTmNumber());
            return;
        }
        if (action instanceof b.EnterTxNumber) {
            H(((b.EnterTxNumber) action).getTxNumber());
            return;
        }
        if (action instanceof b.ScanReceiptBarcode) {
            C15809k.d(d0.a(this), null, null, new e(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, b.j.f20371a)) {
            C(null);
            return;
        }
        if (action instanceof b.SubmitReceiptBarcode) {
            C(((b.SubmitReceiptBarcode) action).getBarcode());
            return;
        }
        if (action instanceof b.EnterReceiptDetails) {
            A();
            v(Q0.a.f24593c);
            this.analyticsEngine.k(((b.EnterReceiptDetails) action).getTrackingData());
        } else if (Intrinsics.e(action, b.a.f20362a)) {
            A();
        } else {
            if (!Intrinsics.e(action, b.h.f20369a)) {
                throw new NoWhenBranchMatchedException();
            }
            A();
            v(Q0.f.f24598c);
        }
    }

    private final void D(String dateString) {
        LocalDate localDateB = B(dateString);
        if (localDateB == null || !localDateB.isAfter(LocalDate.of(1900, Month.JANUARY.getValue(), 1)) || !localDateB.isBefore(LocalDate.now().plusDays(1L))) {
            C15809k.d(d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            String str = dateString;
            if (interfaceC16549B.e(value, ViewState.b(value, null, localDateB, null, 0, 0, 0, str, null, false, 445, null))) {
                v(Q0.e.f24597c);
                return;
            }
            dateString = str;
        }
    }

    private final void E(String storeNumber) {
        ViewState value;
        if ((storeNumber.length() != 2 && storeNumber.length() != 3 && storeNumber.length() != 5) || !Ds.h.f6648a.b(storeNumber, 1, 99999)) {
            C15809k.d(d0.a(this), null, null, new k(null), 3, null);
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, 0, 0, Integer.parseInt(storeNumber), null, null, false, 479, null)));
        v(Q0.c.f24595c);
    }

    private final void G(String tmNumber) {
        ViewState value;
        if (tmNumber.length() != 3 && (tmNumber.length() != 4 || !Ds.h.f6648a.b(tmNumber, 1, 9999))) {
            C15809k.d(d0.a(this), null, null, new m(null), 3, null);
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, 0, Integer.parseInt(tmNumber), 0, null, null, false, 495, null)));
        v(Q0.b.f24594c);
    }
}

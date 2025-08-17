package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.mperks.networking.domain.models.GetBalancePayload;
import com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse;
import ej.ShoppingCart;
import eo.C13719g;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import uw.a;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u000226B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u001d\u0010 \u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0004\b-\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020:0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010N\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0017\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u0002050O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lhl/m;", "cartRepository", "Leo/g;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Lhl/m;Leo/g;Lgi/a;)V", "Ltk/c;", "Lej/C;", "resource", "", "F", "(Ltk/c;)V", "y", "()V", "", "promoNum", "", "isChecked", "I", "(Ljava/lang/String;Z)V", "G", "isFromDialog", "J", "(Z)V", "M", "", "selectedOfferList", "K", "(Ljava/util/List;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "rewardAction", "D", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "action", "E", "(Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;)V", "onCleared", "a", "Lhl/m;", "b", "Leo/g;", "c", "Lgi/a;", "Ltv/A;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;", "d", "Ltv/A;", "_viewEvent", "Ltv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "e", "Ltv/B;", "_viewState", "Ltv/P;", "f", "Ltv/P;", "C", "()Ltv/P;", "viewState", "LNu/a;", "g", "LNu/a;", "disposables", "", "h", "A", "()I", "H", "(I)V", "initialMperksPoints", "Ltv/F;", "B", "()Ltv/F;", "viewEvent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class G extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13719g rewardsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<d> _viewEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<HighValuePromoSelectionsViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<HighValuePromoSelectionsViewState> viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int initialMperksPoints;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<tk.c<ShoppingCart>, Unit> {
        a(Object obj) {
            super(1, obj, G.class, "onNewOfferState", "onNewOfferState(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(tk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((G) this.receiver).F(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(tk.c<ShoppingCart> cVar) {
            a(cVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "", "<init>", "()V", "c", "d", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$a;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$b;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$c;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$a;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103227a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 890495793;
            }

            public String toString() {
                return "ApplyPromoOffer";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$b;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f103228a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 754964508;
            }

            public String toString() {
                return "FetchPointBalance";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$c;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "", "promoNum", "", "isChecked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetSelectedPromoAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String promoNum;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetSelectedPromoAction)) {
                    return false;
                }
                SetSelectedPromoAction setSelectedPromoAction = (SetSelectedPromoAction) other;
                return Intrinsics.e(this.promoNum, setSelectedPromoAction.promoNum) && this.isChecked == setSelectedPromoAction.isChecked;
            }

            public int hashCode() {
                return (this.promoNum.hashCode() * 31) + Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "SetSelectedPromoAction(promoNum=" + this.promoNum + ", isChecked=" + this.isChecked + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetSelectedPromoAction(String promoNum, boolean z10) {
                super(null);
                Intrinsics.j(promoNum, "promoNum");
                this.promoNum = promoNum;
                this.isChecked = z10;
            }

            /* renamed from: a, reason: from getter */
            public final String getPromoNum() {
                return this.promoNum;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c$d;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$c;", "", "isFromDialog", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$c$d, reason: from toString */
        public static final /* data */ class SetSourcePageAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromDialog;

            public SetSourcePageAction(boolean z10) {
                super(null);
                this.isFromDialog = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetSourcePageAction) && this.isFromDialog == ((SetSourcePageAction) other).isFromDialog;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFromDialog);
            }

            public String toString() {
                return "SetSourcePageAction(isFromDialog=" + this.isFromDialog + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsFromDialog() {
                return this.isFromDialog;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d$a;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d$a;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;", "", "newAppliedPromoAmount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d$a, reason: from toString */
        public static final /* data */ class GoToCartActivityEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int newAppliedPromoAmount;

            public GoToCartActivityEvent(int i10) {
                super(null);
                this.newAppliedPromoAmount = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToCartActivityEvent) && this.newAppliedPromoAmount == ((GoToCartActivityEvent) other).newAppliedPromoAmount;
            }

            public int hashCode() {
                return Integer.hashCode(this.newAppliedPromoAmount);
            }

            public String toString() {
                return "GoToCartActivityEvent(newAppliedPromoAmount=" + this.newAppliedPromoAmount + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getNewAppliedPromoAmount() {
                return this.newAppliedPromoAmount;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d$b;", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/G$d;", "", "messageId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G$d$b, reason: from toString */
        public static final /* data */ class ShowErrorToast extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageId;

            public ShowErrorToast(int i10) {
                super(null);
                this.messageId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowErrorToast) && this.messageId == ((ShowErrorToast) other).messageId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageId);
            }

            public String toString() {
                return "ShowErrorToast(messageId=" + this.messageId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageId() {
                return this.messageId;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartViewModel$applyPromoOffer$2$1", f = "MperksInCartViewModel.kt", l = {75, 81, 84}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103234a;

        /* renamed from: b, reason: collision with root package name */
        Object f103235b;

        /* renamed from: c, reason: collision with root package name */
        Object f103236c;

        /* renamed from: d, reason: collision with root package name */
        Object f103237d;

        /* renamed from: e, reason: collision with root package name */
        int f103238e;

        /* renamed from: f, reason: collision with root package name */
        int f103239f;

        /* renamed from: g, reason: collision with root package name */
        int f103240g;

        /* renamed from: h, reason: collision with root package name */
        int f103241h;

        /* renamed from: i, reason: collision with root package name */
        int f103242i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103243j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ HighValuePromoSelectionsViewState f103245l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HighValuePromoSelectionsViewState highValuePromoSelectionsViewState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f103245l = highValuePromoSelectionsViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = G.this.new e(this.f103245l, continuation);
            eVar.f103243j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fd A[PHI: r0 r5
          0x00fd: PHI (r0v13 java.lang.Object) = (r0v10 java.lang.Object), (r0v16 java.lang.Object) binds: [B:27:0x00b1, B:35:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          0x00fd: PHI (r5v7 qv.O) = (r5v5 qv.O), (r5v8 qv.O) binds: [B:27:0x00b1, B:35:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartViewModel$retrieveMperksPoints$1", f = "MperksInCartViewModel.kt", l = {105}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103246a;

        /* renamed from: b, reason: collision with root package name */
        Object f103247b;

        /* renamed from: c, reason: collision with root package name */
        Object f103248c;

        /* renamed from: d, reason: collision with root package name */
        Object f103249d;

        /* renamed from: e, reason: collision with root package name */
        int f103250e;

        /* renamed from: f, reason: collision with root package name */
        int f103251f;

        /* renamed from: g, reason: collision with root package name */
        int f103252g;

        /* renamed from: h, reason: collision with root package name */
        int f103253h;

        /* renamed from: i, reason: collision with root package name */
        int f103254i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103255j;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = G.this.new f(continuation);
            fVar.f103255j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object value3;
            HighValuePromoSelectionsViewState highValuePromoSelectionsViewState;
            int totalPoints;
            Integer numD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103254i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f103255j;
                    G g10 = G.this;
                    Result.Companion companion = Result.INSTANCE;
                    C13719g c13719g = g10.rewardsRepository;
                    this.f103255j = interfaceC16622O;
                    this.f103246a = interfaceC16622O;
                    this.f103247b = this;
                    this.f103248c = this;
                    this.f103249d = interfaceC16622O;
                    this.f103250e = 0;
                    this.f103251f = 0;
                    this.f103252g = 0;
                    this.f103253h = 0;
                    this.f103254i = 1;
                    obj = c13719g.p(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            G g11 = G.this;
            if (Result.h(objB)) {
                MperksGetBalanceResponse mperksGetBalanceResponse = (MperksGetBalanceResponse) objB;
                if (mperksGetBalanceResponse.getSuccess()) {
                    InterfaceC17140B interfaceC17140B = g11._viewState;
                    do {
                        value3 = interfaceC17140B.getValue();
                        highValuePromoSelectionsViewState = (HighValuePromoSelectionsViewState) value3;
                        GetBalancePayload payload = mperksGetBalanceResponse.getPayload();
                        if (payload != null) {
                            totalPoints = payload.getTotalPoints();
                        } else {
                            totalPoints = 0;
                        }
                    } while (!interfaceC17140B.e(value3, HighValuePromoSelectionsViewState.b(highValuePromoSelectionsViewState, false, null, null, totalPoints, false, false, 55, null)));
                    a.b bVarX = uw.a.INSTANCE.x("mPerks_get_balance_response_hvp_viewmodel");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Point balance: ");
                    GetBalancePayload payload2 = mperksGetBalanceResponse.getPayload();
                    if (payload2 != null) {
                        numD = Boxing.d(payload2.getTotalPoints());
                    } else {
                        numD = null;
                    }
                    sb2.append(numD);
                    bVarX.q(sb2.toString(), new Object[0]);
                } else {
                    uw.a.INSTANCE.x("mPerks_get_balance_response_hvp_viewmodel").q("Not successful.", new Object[0]);
                    InterfaceC17140B interfaceC17140B2 = g11._viewState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value2, HighValuePromoSelectionsViewState.b((HighValuePromoSelectionsViewState) value2, false, null, null, g11.getInitialMperksPoints(), false, false, 55, null)));
                }
            }
            G g12 = G.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Failed to load Mperks Points balance.", new Object[0]);
                InterfaceC17140B interfaceC17140B3 = g12._viewState;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, HighValuePromoSelectionsViewState.b((HighValuePromoSelectionsViewState) value, false, null, null, g12.getInitialMperksPoints(), false, false, 55, null)));
            }
            return Unit.f142422a;
        }
    }

    public G(hl.m cartRepository, C13719g rewardsRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.cartRepository = cartRepository;
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        this._viewEvent = C17146H.b(0, 0, null, 7, null);
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140BA = S.a(new HighValuePromoSelectionsViewState(true, null, null, 0, false, false, 62, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l<tk.c<ShoppingCart>> lVarC = cartRepository.c();
        final a aVar2 = new a(this);
        Pu.g<? super tk.c<ShoppingCart>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.E
            @Override // Pu.g
            public final void accept(Object obj) {
                G.r(aVar2, obj);
            }
        };
        final b bVar = new b(uw.a.INSTANCE);
        Ck.a.a(lVarC.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.F
            @Override // Pu.g
            public final void accept(Object obj) {
                G.s(bVar, obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(tk.c<ShoppingCart> resource) {
        HighValuePromoSelectionsViewState value;
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, new r(resource).b(value)));
    }

    private final void I(String promoNum, boolean isChecked) {
        HighValuePromoSelectionsViewState value;
        HighValuePromoSelectionsViewState highValuePromoSelectionsViewState;
        ArrayList arrayList;
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            highValuePromoSelectionsViewState = value;
            List<HighValuePromoOfferDecorator> listD = highValuePromoSelectionsViewState.d();
            arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            for (HighValuePromoOfferDecorator highValuePromoOfferDecorator : listD) {
                HighValuePromoOfferDecorator highValuePromoOfferDecoratorB = HighValuePromoOfferDecorator.b(highValuePromoOfferDecorator, null, null, null, null, null, isChecked, 31, null);
                if (!Intrinsics.e(highValuePromoOfferDecorator.getPromoNum(), promoNum)) {
                    highValuePromoOfferDecoratorB = null;
                }
                if (highValuePromoOfferDecoratorB != null) {
                    highValuePromoOfferDecorator = highValuePromoOfferDecoratorB;
                }
                arrayList.add(highValuePromoOfferDecorator);
            }
        } while (!interfaceC17140B.e(value, HighValuePromoSelectionsViewState.b(highValuePromoSelectionsViewState, false, arrayList, null, 0, false, false, 61, null)));
    }

    private final void J(boolean isFromDialog) {
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140B = this._viewState;
        while (true) {
            HighValuePromoSelectionsViewState value = interfaceC17140B.getValue();
            boolean z10 = isFromDialog;
            if (interfaceC17140B.e(value, HighValuePromoSelectionsViewState.b(value, false, null, null, 0, false, z10, 31, null))) {
                return;
            } else {
                isFromDialog = z10;
            }
        }
    }

    private final void K(final List<String> selectedOfferList) {
        this.analyticsEngine.h(C14476c.a("High Value Prompt Detail Page: apply offers"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.L(selectedOfferList, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("listOfOffersSelected", CollectionsKt.B0(list, "; ", null, null, 0, null, null, 62, null));
        return Unit.f142422a;
    }

    private final void M() {
        HighValuePromoSelectionsViewState value;
        final HighValuePromoSelectionsViewState highValuePromoSelectionsViewState;
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            highValuePromoSelectionsViewState = value;
        } while (!interfaceC17140B.e(value, highValuePromoSelectionsViewState));
        this.analyticsEngine.h(C14476c.h("Meijer: High Value Prompt Detail Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.N(highValuePromoSelectionsViewState, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(HighValuePromoSelectionsViewState highValuePromoSelectionsViewState, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("clickAction", !highValuePromoSelectionsViewState.getIsFromDialog() ? "Cart Page" : "High Value Prompt Alert");
        track.h("listOfOffersAvailable", CollectionsKt.B0(highValuePromoSelectionsViewState.e(), "; ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.O((HighValuePromoOfferDecorator) obj);
            }
        }, 30, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence O(HighValuePromoOfferDecorator it) {
        Intrinsics.j(it, "it");
        return it.getPromoNum();
    }

    private final void y() {
        HighValuePromoSelectionsViewState value;
        HighValuePromoSelectionsViewState highValuePromoSelectionsViewStateB;
        InterfaceC17140B<HighValuePromoSelectionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            highValuePromoSelectionsViewStateB = HighValuePromoSelectionsViewState.b(value, true, null, null, 0, false, false, 62, null);
        } while (!interfaceC17140B.e(value, highValuePromoSelectionsViewStateB));
        K(highValuePromoSelectionsViewStateB.h());
        C16648k.d(d0.a(this), null, null, new e(highValuePromoSelectionsViewStateB, null), 3, null);
    }

    /* renamed from: A, reason: from getter */
    public final int getInitialMperksPoints() {
        return this.initialMperksPoints;
    }

    public final InterfaceC17144F<d> B() {
        return C17154h.b(this._viewEvent);
    }

    public final P<HighValuePromoSelectionsViewState> C() {
        return this.viewState;
    }

    public final void D(String rewardAction) {
        Intrinsics.j(rewardAction, "rewardAction");
        this.analyticsEngine.e(Ao.I.f1165a.b(rewardAction, String.valueOf(this.viewState.getValue().getMPerksPoints())));
    }

    public final void E(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.SetSelectedPromoAction) {
            c.SetSelectedPromoAction setSelectedPromoAction = (c.SetSelectedPromoAction) action;
            I(setSelectedPromoAction.getPromoNum(), setSelectedPromoAction.getIsChecked());
        } else if (action instanceof c.a) {
            y();
            D("mPerks:Cart Page:Rewards Applied");
        } else if (action instanceof c.SetSourcePageAction) {
            J(((c.SetSourcePageAction) action).getIsFromDialog());
        } else {
            if (!(action instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            G();
        }
    }

    public final void H(int i10) {
        this.initialMperksPoints = i10;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        M();
        G();
    }

    private final void G() {
        C16648k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}

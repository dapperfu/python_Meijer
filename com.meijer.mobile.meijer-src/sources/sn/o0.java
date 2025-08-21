package sn;

import Hk.UIEvent;
import Rn.FlyBuyState;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import ev.C13889a;
import hi.InterfaceC14523a;
import hn.C14543b;
import hn.OrderOutOfStockListDecorator;
import hn.OrderSubstitutionsListDecorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16549B;
import qw.a;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003C?AB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00102\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u001f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u00102\n\u0010%\u001a\u00060\u0018j\u0002`$H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)J3\u00100\u001a\u00020\u00102\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001c2\u0006\u0010-\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001cH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010#J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010#J\u000f\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010#J\u0015\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0010H\u0014¢\u0006\u0004\b:\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020F0J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020*0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010QR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lsn/o0;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "LTq/j;", "storeProvider", "LRn/I;", "flyBuyManager", "Lhi/a;", "analyticsEngine", "LZq/b;", "storeInfoRepository", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;LTq/j;LRn/I;Lhi/a;LZq/b;)V", "LRn/K;", "flyBuyState", "", "J", "(LRn/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "D", "(I)V", "", "orderType", "F", "(Ljava/lang/String;)V", "", "selectedItems", "rejectedItems", "", "A", "(Ljava/util/List;Ljava/util/List;)Z", "C", "()V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "H", "isSuccess", "N", "(Z)V", "Lvo/a;", "substitutedItems", "Lvo/b;", "substitutionScreenType", "Luo/a;", "outOfStockItems", "B", "(Ljava/util/List;Lvo/b;Ljava/util/List;)V", "I", "K", "M", "L", "Lsn/o0$c;", "action", "G", "(Lsn/o0$c;)V", "onCleared", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "LTq/j;", "c", "LRn/I;", "d", "Lhi/a;", "e", "LZq/b;", "Lpv/B;", "Lsn/o0$e;", "f", "Lpv/B;", "_viewState", "Lpv/P;", "g", "Lpv/P;", "E", "()Lpv/P;", "viewState", "h", "Ljava/util/List;", "listSubstitutionItems", "", "i", "listAcceptedItems", "j", "listRejectedItems", "k", "Ljava/lang/String;", "l", "Z", "isOnMyWayClicked", "m", "isSubsAnalyticsSent", "LJu/a;", "n", "LJu/a;", "compositeDisposable", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o0 extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Rn.I flyBuyManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<OrderSubstitutionItem> listSubstitutionItems;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<Integer> listAcceptedItems;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private List<Integer> listRejectedItems;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String orderType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isOnMyWayClicked;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isSubsAnalyticsSent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ju.a compositeDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<FlyBuyState, Unit> {
        a(Object obj) {
            super(1, obj, o0.class, "onNewFlyBuyState", "onNewFlyBuyState(Lcom/meijer/mobile/meijer/managers/FlyBuyState;)V", 0);
        }

        public final void a(FlyBuyState p02) {
            Intrinsics.j(p02, "p0");
            ((o0) this.receiver).J(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlyBuyState flyBuyState) {
            a(flyBuyState);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lsn/o0$c;", "", "<init>", "()V", "d", "c", "f", "b", "e", "a", "Lsn/o0$c$a;", "Lsn/o0$c$b;", "Lsn/o0$c$c;", "Lsn/o0$c$d;", "Lsn/o0$c$e;", "Lsn/o0$c$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lsn/o0$c$a;", "Lsn/o0$c;", "", "Lvo/a;", "substitutedItems", "Luo/a;", "outOfStockItems", "Lvo/b;", "substitutionScreenType", "<init>", "(Ljava/util/List;Ljava/util/List;Lvo/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Lvo/b;", "()Lvo/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$c$a, reason: from toString */
        public static final /* data */ class BuildSubstitutionViewAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderSubstitutionItem> substitutedItems;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderOutOfStockItem> outOfStockItems;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final vo.b substitutionScreenType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BuildSubstitutionViewAction)) {
                    return false;
                }
                BuildSubstitutionViewAction buildSubstitutionViewAction = (BuildSubstitutionViewAction) other;
                return Intrinsics.e(this.substitutedItems, buildSubstitutionViewAction.substitutedItems) && Intrinsics.e(this.outOfStockItems, buildSubstitutionViewAction.outOfStockItems) && this.substitutionScreenType == buildSubstitutionViewAction.substitutionScreenType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuildSubstitutionViewAction(List<OrderSubstitutionItem> substitutedItems, List<OrderOutOfStockItem> outOfStockItems, vo.b substitutionScreenType) {
                super(null);
                Intrinsics.j(substitutedItems, "substitutedItems");
                Intrinsics.j(outOfStockItems, "outOfStockItems");
                Intrinsics.j(substitutionScreenType, "substitutionScreenType");
                this.substitutedItems = substitutedItems;
                this.outOfStockItems = outOfStockItems;
                this.substitutionScreenType = substitutionScreenType;
            }

            public final List<OrderOutOfStockItem> a() {
                return this.outOfStockItems;
            }

            public final List<OrderSubstitutionItem> b() {
                return this.substitutedItems;
            }

            /* renamed from: c, reason: from getter */
            public final vo.b getSubstitutionScreenType() {
                return this.substitutionScreenType;
            }

            public int hashCode() {
                return (((this.substitutedItems.hashCode() * 31) + this.outOfStockItems.hashCode()) * 31) + this.substitutionScreenType.hashCode();
            }

            public String toString() {
                return "BuildSubstitutionViewAction(substitutedItems=" + this.substitutedItems + ", outOfStockItems=" + this.outOfStockItems + ", substitutionScreenType=" + this.substitutionScreenType + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lsn/o0$c$b;", "Lsn/o0$c;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$c$b, reason: from toString */
        public static final /* data */ class ConfirmSubstitutionAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmSubstitutionAction) && Intrinsics.e(this.orderId, ((ConfirmSubstitutionAction) other).orderId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmSubstitutionAction(String orderId) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                this.orderId = orderId;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return this.orderId.hashCode();
            }

            public String toString() {
                return "ConfirmSubstitutionAction(orderId=" + this.orderId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lsn/o0$c$c;", "Lsn/o0$c;", "", "acceptedItemId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class OnAcceptedSubstitutionAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int acceptedItemId;

            public OnAcceptedSubstitutionAction(int i10) {
                super(null);
                this.acceptedItemId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnAcceptedSubstitutionAction) && this.acceptedItemId == ((OnAcceptedSubstitutionAction) other).acceptedItemId;
            }

            /* renamed from: a, reason: from getter */
            public final int getAcceptedItemId() {
                return this.acceptedItemId;
            }

            public int hashCode() {
                return Integer.hashCode(this.acceptedItemId);
            }

            public String toString() {
                return "OnAcceptedSubstitutionAction(acceptedItemId=" + this.acceptedItemId + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/o0$c$d;", "Lsn/o0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f161469a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "OnClearSubstitutedAction";
            }

            public int hashCode() {
                return -1143197903;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u001f"}, d2 = {"Lsn/o0$c$e;", "Lsn/o0$c;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lvo/b;", "substitutionScreenType", "", "isOnMyWayClicked", "orderType", "<init>", "(Ljava/lang/String;Lvo/b;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrderId", "b", "Lvo/b;", "()Lvo/b;", "c", "Z", "()Z", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$c$e, reason: from toString */
        public static final /* data */ class OnClickConfirmAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final vo.b substitutionScreenType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOnMyWayClicked;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnClickConfirmAction)) {
                    return false;
                }
                OnClickConfirmAction onClickConfirmAction = (OnClickConfirmAction) other;
                return Intrinsics.e(this.orderId, onClickConfirmAction.orderId) && this.substitutionScreenType == onClickConfirmAction.substitutionScreenType && this.isOnMyWayClicked == onClickConfirmAction.isOnMyWayClicked && Intrinsics.e(this.orderType, onClickConfirmAction.orderType);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnClickConfirmAction(String orderId, vo.b substitutionScreenType, boolean z10, String orderType) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                Intrinsics.j(substitutionScreenType, "substitutionScreenType");
                Intrinsics.j(orderType, "orderType");
                this.orderId = orderId;
                this.substitutionScreenType = substitutionScreenType;
                this.isOnMyWayClicked = z10;
                this.orderType = orderType;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderType() {
                return this.orderType;
            }

            /* renamed from: b, reason: from getter */
            public final vo.b getSubstitutionScreenType() {
                return this.substitutionScreenType;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsOnMyWayClicked() {
                return this.isOnMyWayClicked;
            }

            public int hashCode() {
                return (((((this.orderId.hashCode() * 31) + this.substitutionScreenType.hashCode()) * 31) + Boolean.hashCode(this.isOnMyWayClicked)) * 31) + this.orderType.hashCode();
            }

            public String toString() {
                return "OnClickConfirmAction(orderId=" + this.orderId + ", substitutionScreenType=" + this.substitutionScreenType + ", isOnMyWayClicked=" + this.isOnMyWayClicked + ", orderType=" + this.orderType + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lsn/o0$c$f;", "Lsn/o0$c;", "", "rejectedItemId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$c$f, reason: from toString */
        public static final /* data */ class OnRejectedSubstitutionAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rejectedItemId;

            public OnRejectedSubstitutionAction(int i10) {
                super(null);
                this.rejectedItemId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnRejectedSubstitutionAction) && this.rejectedItemId == ((OnRejectedSubstitutionAction) other).rejectedItemId;
            }

            /* renamed from: a, reason: from getter */
            public final int getRejectedItemId() {
                return this.rejectedItemId;
            }

            public int hashCode() {
                return Integer.hashCode(this.rejectedItemId);
            }

            public String toString() {
                return "OnRejectedSubstitutionAction(rejectedItemId=" + this.rejectedItemId + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lsn/o0$d;", "", "<init>", "()V", "c", "d", "a", "b", "e", "Lsn/o0$d$a;", "Lsn/o0$d$b;", "Lsn/o0$d$c;", "Lsn/o0$d$d;", "Lsn/o0$d$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lsn/o0$d$a;", "Lsn/o0$d;", "", "title", "message", "positiveButton", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$d$a, reason: from toString */
        public static final /* data */ class FailureDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            public FailureDialogEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButton = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailureDialogEvent)) {
                    return false;
                }
                FailureDialogEvent failureDialogEvent = (FailureDialogEvent) other;
                return this.title == failureDialogEvent.title && this.message == failureDialogEvent.message && this.positiveButton == failureDialogEvent.positiveButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButton);
            }

            public String toString() {
                return "FailureDialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lsn/o0$d$b;", "Lsn/o0$d;", "", "title", "positiveButton", "negativeButton", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$d$b, reason: from toString */
        public static final /* data */ class FailureSubstitutionDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int negativeButton;

            public FailureSubstitutionDialogEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.positiveButton = i11;
                this.negativeButton = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailureSubstitutionDialogEvent)) {
                    return false;
                }
                FailureSubstitutionDialogEvent failureSubstitutionDialogEvent = (FailureSubstitutionDialogEvent) other;
                return this.title == failureSubstitutionDialogEvent.title && this.positiveButton == failureSubstitutionDialogEvent.positiveButton && this.negativeButton == failureSubstitutionDialogEvent.negativeButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getNegativeButton() {
                return this.negativeButton;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.positiveButton)) * 31) + Integer.hashCode(this.negativeButton);
            }

            public String toString() {
                return "FailureSubstitutionDialogEvent(title=" + this.title + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/o0$d$c;", "Lsn/o0$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final c f161481a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "LaunchOrderDetailsActivity";
            }

            public int hashCode() {
                return -2004298441;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsn/o0$d$d;", "Lsn/o0$d;", "", "orderType", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class NavigateToCheckIn extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToCheckIn) && Intrinsics.e(this.orderType, ((NavigateToCheckIn) other).orderType);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToCheckIn(String orderType) {
                super(null);
                Intrinsics.j(orderType, "orderType");
                this.orderType = orderType;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderType() {
                return this.orderType;
            }

            public int hashCode() {
                return this.orderType.hashCode();
            }

            public String toString() {
                return "NavigateToCheckIn(orderType=" + this.orderType + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lsn/o0$d$e;", "Lsn/o0$d;", "", "title", "message", "positiveButton", "negativeButton", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.o0$d$e, reason: from toString */
        public static final /* data */ class SuccessDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int negativeButton;

            public SuccessDialogEvent(int i10, int i11, int i12, int i13) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButton = i12;
                this.negativeButton = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessDialogEvent)) {
                    return false;
                }
                SuccessDialogEvent successDialogEvent = (SuccessDialogEvent) other;
                return this.title == successDialogEvent.title && this.message == successDialogEvent.message && this.positiveButton == successDialogEvent.positiveButton && this.negativeButton == successDialogEvent.negativeButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getNegativeButton() {
                return this.negativeButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: d, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButton)) * 31) + Integer.hashCode(this.negativeButton);
            }

            public String toString() {
                return "SuccessDialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0082\u0001\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b(\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b-\u00102¨\u00063"}, d2 = {"Lsn/o0$e;", "", "", "Lhn/q;", "finalOrderSubstitutionItemsList", "Lhn/p;", "finalOrderOutOfStockItemsList", "LHk/a;", "Lsn/o0$d;", "orderSubstitutionUIEvent", "", "listAcceptedItems", "listRejectedItems", "", "shouldUpdateList", "LRn/K;", "flyBuyState", "Lpk/h;", "storeInfo", "<init>", "(Ljava/util/List;Ljava/util/List;LHk/a;Ljava/util/List;Ljava/util/List;ZLRn/K;Lpk/h;)V", "a", "(Ljava/util/List;Ljava/util/List;LHk/a;Ljava/util/List;Ljava/util/List;ZLRn/K;Lpk/h;)Lsn/o0$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "LHk/a;", "f", "()LHk/a;", "getListAcceptedItems", "e", "getListRejectedItems", "Z", "getShouldUpdateList", "()Z", "g", "LRn/K;", "()LRn/K;", "h", "Lpk/h;", "()Lpk/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.o0$e, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderSubstitutionsListDecorator> finalOrderSubstitutionItemsList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderOutOfStockListDecorator> finalOrderOutOfStockItemsList;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<d> orderSubstitutionUIEvent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> listAcceptedItems;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> listRejectedItems;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldUpdateList;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final FlyBuyState flyBuyState;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeInfo;

        public ViewState() {
            this(null, null, null, null, null, false, null, null, l3.f93323c, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.finalOrderSubstitutionItemsList, viewState.finalOrderSubstitutionItemsList) && Intrinsics.e(this.finalOrderOutOfStockItemsList, viewState.finalOrderOutOfStockItemsList) && Intrinsics.e(this.orderSubstitutionUIEvent, viewState.orderSubstitutionUIEvent) && Intrinsics.e(this.listAcceptedItems, viewState.listAcceptedItems) && Intrinsics.e(this.listRejectedItems, viewState.listRejectedItems) && this.shouldUpdateList == viewState.shouldUpdateList && Intrinsics.e(this.flyBuyState, viewState.flyBuyState) && Intrinsics.e(this.storeInfo, viewState.storeInfo);
        }

        public ViewState(List<OrderSubstitutionsListDecorator> finalOrderSubstitutionItemsList, List<OrderOutOfStockListDecorator> finalOrderOutOfStockItemsList, UIEvent<d> orderSubstitutionUIEvent, List<Integer> listAcceptedItems, List<Integer> listRejectedItems, boolean z10, FlyBuyState flyBuyState, StoreDetails storeDetails) {
            Intrinsics.j(finalOrderSubstitutionItemsList, "finalOrderSubstitutionItemsList");
            Intrinsics.j(finalOrderOutOfStockItemsList, "finalOrderOutOfStockItemsList");
            Intrinsics.j(orderSubstitutionUIEvent, "orderSubstitutionUIEvent");
            Intrinsics.j(listAcceptedItems, "listAcceptedItems");
            Intrinsics.j(listRejectedItems, "listRejectedItems");
            this.finalOrderSubstitutionItemsList = finalOrderSubstitutionItemsList;
            this.finalOrderOutOfStockItemsList = finalOrderOutOfStockItemsList;
            this.orderSubstitutionUIEvent = orderSubstitutionUIEvent;
            this.listAcceptedItems = listAcceptedItems;
            this.listRejectedItems = listRejectedItems;
            this.shouldUpdateList = z10;
            this.flyBuyState = flyBuyState;
            this.storeInfo = storeDetails;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, List list, List list2, UIEvent uIEvent, List list3, List list4, boolean z10, FlyBuyState flyBuyState, StoreDetails storeDetails, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.finalOrderSubstitutionItemsList;
            }
            if ((i10 & 2) != 0) {
                list2 = viewState.finalOrderOutOfStockItemsList;
            }
            if ((i10 & 4) != 0) {
                uIEvent = viewState.orderSubstitutionUIEvent;
            }
            if ((i10 & 8) != 0) {
                list3 = viewState.listAcceptedItems;
            }
            if ((i10 & 16) != 0) {
                list4 = viewState.listRejectedItems;
            }
            if ((i10 & 32) != 0) {
                z10 = viewState.shouldUpdateList;
            }
            if ((i10 & 64) != 0) {
                flyBuyState = viewState.flyBuyState;
            }
            if ((i10 & 128) != 0) {
                storeDetails = viewState.storeInfo;
            }
            FlyBuyState flyBuyState2 = flyBuyState;
            StoreDetails storeDetails2 = storeDetails;
            List list5 = list4;
            boolean z11 = z10;
            return viewState.a(list, list2, uIEvent, list3, list5, z11, flyBuyState2, storeDetails2);
        }

        public final ViewState a(List<OrderSubstitutionsListDecorator> finalOrderSubstitutionItemsList, List<OrderOutOfStockListDecorator> finalOrderOutOfStockItemsList, UIEvent<d> orderSubstitutionUIEvent, List<Integer> listAcceptedItems, List<Integer> listRejectedItems, boolean shouldUpdateList, FlyBuyState flyBuyState, StoreDetails storeInfo) {
            Intrinsics.j(finalOrderSubstitutionItemsList, "finalOrderSubstitutionItemsList");
            Intrinsics.j(finalOrderOutOfStockItemsList, "finalOrderOutOfStockItemsList");
            Intrinsics.j(orderSubstitutionUIEvent, "orderSubstitutionUIEvent");
            Intrinsics.j(listAcceptedItems, "listAcceptedItems");
            Intrinsics.j(listRejectedItems, "listRejectedItems");
            return new ViewState(finalOrderSubstitutionItemsList, finalOrderOutOfStockItemsList, orderSubstitutionUIEvent, listAcceptedItems, listRejectedItems, shouldUpdateList, flyBuyState, storeInfo);
        }

        public final List<OrderOutOfStockListDecorator> c() {
            return this.finalOrderOutOfStockItemsList;
        }

        public final List<OrderSubstitutionsListDecorator> d() {
            return this.finalOrderSubstitutionItemsList;
        }

        /* renamed from: e, reason: from getter */
        public final FlyBuyState getFlyBuyState() {
            return this.flyBuyState;
        }

        public final UIEvent<d> f() {
            return this.orderSubstitutionUIEvent;
        }

        /* renamed from: g, reason: from getter */
        public final StoreDetails getStoreInfo() {
            return this.storeInfo;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.finalOrderSubstitutionItemsList.hashCode() * 31) + this.finalOrderOutOfStockItemsList.hashCode()) * 31) + this.orderSubstitutionUIEvent.hashCode()) * 31) + this.listAcceptedItems.hashCode()) * 31) + this.listRejectedItems.hashCode()) * 31) + Boolean.hashCode(this.shouldUpdateList)) * 31;
            FlyBuyState flyBuyState = this.flyBuyState;
            int iHashCode2 = (iHashCode + (flyBuyState == null ? 0 : flyBuyState.hashCode())) * 31;
            StoreDetails storeDetails = this.storeInfo;
            return iHashCode2 + (storeDetails != null ? storeDetails.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(finalOrderSubstitutionItemsList=" + this.finalOrderSubstitutionItemsList + ", finalOrderOutOfStockItemsList=" + this.finalOrderOutOfStockItemsList + ", orderSubstitutionUIEvent=" + this.orderSubstitutionUIEvent + ", listAcceptedItems=" + this.listAcceptedItems + ", listRejectedItems=" + this.listRejectedItems + ", shouldUpdateList=" + this.shouldUpdateList + ", flyBuyState=" + this.flyBuyState + ", storeInfo=" + this.storeInfo + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(java.util.List r2, java.util.List r3, Hk.UIEvent r4, java.util.List r5, java.util.List r6, boolean r7, Rn.FlyBuyState r8, pk.StoreDetails r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.m()
            L8:
                r11 = r10 & 2
                if (r11 == 0) goto L10
                java.util.List r3 = kotlin.collections.CollectionsKt.m()
            L10:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L1b
                Hk.a r4 = new Hk.a
                r11 = 1
                r4.<init>(r0, r11, r0)
            L1b:
                r11 = r10 & 8
                if (r11 == 0) goto L23
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
            L23:
                r11 = r10 & 16
                if (r11 == 0) goto L2b
                java.util.List r6 = kotlin.collections.CollectionsKt.m()
            L2b:
                r11 = r10 & 32
                if (r11 == 0) goto L30
                r7 = 0
            L30:
                r11 = r10 & 64
                if (r11 == 0) goto L35
                r8 = r0
            L35:
                r10 = r10 & 128(0x80, float:1.8E-43)
                if (r10 == 0) goto L43
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L4c
            L43:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L4c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.o0.ViewState.<init>(java.util.List, java.util.List, Hk.a, java.util.List, java.util.List, boolean, Rn.K, pk.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.SubstitutionViewModel$fetchStoreInfo$1", f = "SubstitutionViewModel.kt", l = {179}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161495a;

        /* renamed from: b, reason: collision with root package name */
        int f161496b;

        /* renamed from: c, reason: collision with root package name */
        int f161497c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161498d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f161500f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f161500f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = o0.this.new f(this.f161500f, continuation);
            fVar.f161498d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161497c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f161498d;
                    o0 o0Var = o0.this;
                    int i11 = this.f161500f;
                    Result.Companion companion = Result.INSTANCE;
                    Zq.b bVar = o0Var.storeInfoRepository;
                    this.f161498d = r23;
                    this.f161495a = r23;
                    this.f161496b = 0;
                    this.f161497c = 1;
                    objE = bVar.e(i11, this);
                    i10 = r23;
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f161498d;
                    ResultKt.b(obj);
                    objE = obj;
                    i10 = r24;
                }
                objB = Result.b((StoreInfo) objE);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            o0 o0Var2 = o0.this;
            if (Result.h(objB)) {
                StoreInfo storeInfo = (StoreInfo) objB;
                InterfaceC16549B interfaceC16549B = o0Var2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, null, null, null, false, null, C14543b.a(storeInfo), l3.f93324d, null)));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                qw.a.INSTANCE.f(thE, "Error in getting storeInfo", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.SubstitutionViewModel$onConfirmSubstitution$1", f = "SubstitutionViewModel.kt", l = {221}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161501a;

        /* renamed from: b, reason: collision with root package name */
        int f161502b;

        /* renamed from: c, reason: collision with root package name */
        int f161503c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161504d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f161506f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f161506f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = o0.this.new g(this.f161506f, continuation);
            gVar.f161504d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f161503c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r10.f161501a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r10.f161504d
                r1 = r0
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1a
                r9 = r10
                goto L58
            L1a:
                r0 = move-exception
                r11 = r0
                r9 = r10
                goto L65
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f161504d
                r1 = r11
                mv.O r1 = (mv.InterfaceC15783O) r1
                sn.o0 r11 = sn.o0.this
                java.lang.String r5 = r10.f161506f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L62
                com.meijer.mobile.digitalshopping.api.orders.a r4 = sn.o0.s(r11)     // Catch: java.lang.Throwable -> L62
                Tq.j r6 = sn.o0.u(r11)     // Catch: java.lang.Throwable -> L62
                int r6 = r6.g()     // Catch: java.lang.Throwable -> L62
                java.util.List r7 = sn.o0.q(r11)     // Catch: java.lang.Throwable -> L62
                java.util.List r8 = sn.o0.r(r11)     // Catch: java.lang.Throwable -> L62
                r10.f161504d = r1     // Catch: java.lang.Throwable -> L62
                r10.f161501a = r1     // Catch: java.lang.Throwable -> L62
                r10.f161502b = r2     // Catch: java.lang.Throwable -> L62
                r10.f161503c = r3     // Catch: java.lang.Throwable -> L62
                r9 = r10
                java.lang.Object r11 = r4.I(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5f
                if (r11 != r0) goto L58
                return r0
            L58:
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse r11 = (com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse) r11     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r11 = kotlin.Result.b(r11)     // Catch: java.lang.Throwable -> L5f
                goto L6f
            L5f:
                r0 = move-exception
            L60:
                r11 = r0
                goto L65
            L62:
                r0 = move-exception
                r9 = r10
                goto L60
            L65:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r11 = kotlin.ResultKt.a(r11)
                java.lang.Object r11 = kotlin.Result.b(r11)
            L6f:
                sn.o0 r0 = sn.o0.this
                boolean r4 = kotlin.Result.h(r11)
                if (r4 == 0) goto L83
                r4 = r11
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse r4 = (com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse) r4
                boolean r4 = r4.getIsSuccessful()
                if (r4 == 0) goto L83
                sn.o0.y(r0, r3)
            L83:
                sn.o0 r0 = sn.o0.this
                java.lang.Throwable r11 = kotlin.Result.e(r11)
                if (r11 == 0) goto L9e
                kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
                mv.E0.i(r1)
                boolean r1 = r11 instanceof java.lang.Error
                if (r1 != 0) goto L9d
                sn.o0.y(r0, r2)
                sn.o0.x(r0)
                goto L9e
            L9d:
                throw r11
            L9e:
                kotlin.Unit r11 = kotlin.Unit.f143329a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.o0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o0(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, Tq.j storeProvider, Rn.I flyBuyManager, InterfaceC14523a analyticsEngine, Zq.b storeInfoRepository) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        this.ordersRepository = ordersRepository;
        this.storeProvider = storeProvider;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        this.storeInfoRepository = storeInfoRepository;
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, null, null, null, null, false, null, null, l3.f93323c, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.listSubstitutionItems = CollectionsKt.m();
        this.listAcceptedItems = new ArrayList();
        this.listRejectedItems = new ArrayList();
        Ju.a aVar = new Ju.a();
        this.compositeDisposable = aVar;
        io.reactivex.l<FlyBuyState> lVarSubscribeOn = flyBuyManager.J().take(2L).subscribeOn(C13889a.b());
        final a aVar2 = new a(this);
        Lu.g<? super FlyBuyState> gVar = new Lu.g() { // from class: sn.m0
            @Override // Lu.g
            public final void accept(Object obj) {
                o0.o(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: sn.n0
            @Override // Lu.g
            public final void accept(Object obj) {
                o0.p(bVar, obj);
            }
        }), aVar);
    }

    private final boolean A(List<Integer> selectedItems, List<Integer> rejectedItems) {
        int size = this.listSubstitutionItems.size();
        if (selectedItems == null) {
            selectedItems = CollectionsKt.m();
        }
        int size2 = selectedItems.size();
        if (rejectedItems == null) {
            rejectedItems = CollectionsKt.m();
        }
        return size == size2 + rejectedItems.size();
    }

    private final void B(List<OrderSubstitutionItem> substitutedItems, vo.b substitutionScreenType, List<OrderOutOfStockItem> outOfStockItems) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<OrderSubstitutionItem> list = substitutedItems;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderSubstitutionsListDecorator.Companion.b(OrderSubstitutionsListDecorator.INSTANCE, (OrderSubstitutionItem) it.next(), substitutionScreenType, null, 4, null));
            }
            List<OrderOutOfStockItem> list2 = outOfStockItems;
            arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OrderOutOfStockListDecorator.INSTANCE.a((OrderOutOfStockItem) it2.next()));
            }
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, arrayList, arrayList2, null, null, null, true, null, null, 220, null)));
    }

    private final void F(String orderType) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, new UIEvent(new d.NavigateToCheckIn(orderType)), null, null, false, null, null, 251, null)));
    }

    private final void I() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, new UIEvent(d.c.f161481a), null, null, false, null, null, 251, null)));
    }

    private final void K() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, new UIEvent(new d.SuccessDialogEvent(com.meijer.mobile.meijer.Y.f101186sg, com.meijer.mobile.meijer.Y.f101166rg, yr.Q.f171761b, Cj.o.f5084r)), this.listAcceptedItems, this.listRejectedItems, false, null, null, 195, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, new UIEvent(new d.FailureDialogEvent(com.meijer.mobile.meijer.Y.f100725V9, com.meijer.mobile.meijer.Y.f100706U9, yr.Q.f171761b)), CollectionsKt.m(), CollectionsKt.m(), false, null, null, 195, null)));
    }

    private final void M() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, new UIEvent(new d.FailureSubstitutionDialogEvent(com.meijer.mobile.meijer.Y.f101175s5, yr.Q.f171761b, Cj.o.f5084r)), this.listAcceptedItems, this.listRejectedItems, false, null, null, 195, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean isSuccess) {
        this.flyBuyManager.V(isSuccess, this.isOnMyWayClicked, this.listSubstitutionItems);
    }

    public final pv.P<ViewState> E() {
        return this.viewState;
    }

    public final void G(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.ConfirmSubstitutionAction) {
            H(((c.ConfirmSubstitutionAction) action).getOrderId());
            return;
        }
        if (action instanceof c.OnClickConfirmAction) {
            c.OnClickConfirmAction onClickConfirmAction = (c.OnClickConfirmAction) action;
            this.isOnMyWayClicked = onClickConfirmAction.getIsOnMyWayClicked();
            this.orderType = onClickConfirmAction.getOrderType();
            if (onClickConfirmAction.getSubstitutionScreenType() == vo.b.f166128g || onClickConfirmAction.getSubstitutionScreenType() == vo.b.f166130i) {
                I();
                return;
            } else if (A(this.listAcceptedItems, this.listRejectedItems)) {
                K();
                return;
            } else {
                M();
                return;
            }
        }
        if (action instanceof c.BuildSubstitutionViewAction) {
            c.BuildSubstitutionViewAction buildSubstitutionViewAction = (c.BuildSubstitutionViewAction) action;
            this.listSubstitutionItems = buildSubstitutionViewAction.b();
            B(buildSubstitutionViewAction.b(), buildSubstitutionViewAction.getSubstitutionScreenType(), buildSubstitutionViewAction.a());
            return;
        }
        if (Intrinsics.e(action, c.d.f161469a)) {
            C();
            return;
        }
        Object obj = null;
        if (action instanceof c.OnRejectedSubstitutionAction) {
            c.OnRejectedSubstitutionAction onRejectedSubstitutionAction = (c.OnRejectedSubstitutionAction) action;
            if (this.listAcceptedItems.contains(Integer.valueOf(onRejectedSubstitutionAction.getRejectedItemId()))) {
                this.listAcceptedItems.remove(this.listAcceptedItems.indexOf(Integer.valueOf(onRejectedSubstitutionAction.getRejectedItemId())));
                this.listRejectedItems.add(Integer.valueOf(onRejectedSubstitutionAction.getRejectedItemId()));
            } else {
                this.listRejectedItems.add(Integer.valueOf(onRejectedSubstitutionAction.getRejectedItemId()));
            }
            Iterator<T> it = this.listSubstitutionItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((OrderSubstitutionItem) next).getItemId() == onRejectedSubstitutionAction.getRejectedItemId()) {
                    obj = next;
                    break;
                }
            }
            OrderSubstitutionItem orderSubstitutionItem = (OrderSubstitutionItem) obj;
            if (orderSubstitutionItem != null) {
                orderSubstitutionItem.o(false);
                return;
            }
            return;
        }
        if (!(action instanceof c.OnAcceptedSubstitutionAction)) {
            throw new NoWhenBranchMatchedException();
        }
        c.OnAcceptedSubstitutionAction onAcceptedSubstitutionAction = (c.OnAcceptedSubstitutionAction) action;
        if (this.listRejectedItems.contains(Integer.valueOf(onAcceptedSubstitutionAction.getAcceptedItemId()))) {
            this.listRejectedItems.remove(this.listRejectedItems.indexOf(Integer.valueOf(onAcceptedSubstitutionAction.getAcceptedItemId())));
            this.listAcceptedItems.add(Integer.valueOf(onAcceptedSubstitutionAction.getAcceptedItemId()));
        } else {
            this.listAcceptedItems.add(Integer.valueOf(onAcceptedSubstitutionAction.getAcceptedItemId()));
        }
        Iterator<T> it2 = this.listSubstitutionItems.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((OrderSubstitutionItem) next2).getItemId() == onAcceptedSubstitutionAction.getAcceptedItemId()) {
                obj = next2;
                break;
            }
        }
        OrderSubstitutionItem orderSubstitutionItem2 = (OrderSubstitutionItem) obj;
        if (orderSubstitutionItem2 != null) {
            orderSubstitutionItem2.o(true);
        }
    }

    private final void C() {
        ViewState value;
        this.listSubstitutionItems = CollectionsKt.m();
        this.listAcceptedItems = new ArrayList();
        this.listRejectedItems = new ArrayList();
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, CollectionsKt.m(), CollectionsKt.m(), false, null, null, 231, null)));
    }

    private final void D(int storeId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new f(storeId, null), 3, null);
    }

    private final void H(String orderId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new g(orderId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(FlyBuyState flyBuyState) {
        ViewState value;
        if (flyBuyState.getStoreInfo() == null) {
            D(this.storeProvider.g());
        } else {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, null, false, null, C14543b.a(flyBuyState.getStoreInfo()), l3.f93324d, null)));
        }
        Boolean isSubstitutionsSubmissionsSuccessful = flyBuyState.getIsSubstitutionsSubmissionsSuccessful();
        if (Intrinsics.e(isSubstitutionsSubmissionsSuccessful, Boolean.TRUE)) {
            if (this.isOnMyWayClicked) {
                qw.a.INSTANCE.k("FlyBuy: navigate to FlyBuyCheckIn screen from Substitution screen: " + Rn.I.INSTANCE.c(this._viewState.getValue().getFlyBuyState()), new Object[0]);
                String str = this.orderType;
                if (str == null) {
                    str = "";
                }
                F(str);
                return;
            }
            I();
            return;
        }
        if (Intrinsics.e(isSubstitutionsSubmissionsSuccessful, Boolean.FALSE)) {
            L();
            return;
        }
        if (!this.isSubsAnalyticsSent) {
            this.isSubsAnalyticsSent = true;
            this.analyticsEngine.k(Kn.n.f17594a.P(flyBuyState));
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
            while (true) {
                ViewState value2 = interfaceC16549B2.getValue();
                FlyBuyState flyBuyState2 = flyBuyState;
                if (!interfaceC16549B2.e(value2, ViewState.b(value2, null, null, null, null, null, false, flyBuyState2, null, 191, null))) {
                    flyBuyState = flyBuyState2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}

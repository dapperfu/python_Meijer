package rn;

import Gk.UIEvent;
import Gl.FlyBuyOrderDetail;
import Qn.FlyBuyState;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import gi.InterfaceC14261a;
import gj.OrderDetail;
import gn.CheckInStoreDetailsDecorator;
import java.util.List;
import jn.C15063b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.StoreDetails;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003,&(B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020+0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lrn/q;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Ljn/b;", "navigationCommandManager", "LQn/I;", "flyBuyManager", "Lgi/a;", "analyticsEngine", "LCl/e;", "meijerIntent", "<init>", "(Ljn/b;LQn/I;Lgi/a;LCl/e;)V", "LQn/K;", "flyBuyState", "", "w", "(LQn/K;)V", "Lok/h;", "storeDetails", "p", "(Lok/h;)V", "u", "(LCl/e;)V", "r", "()V", "x", "y", "t", "Lrn/q$c;", "action", "v", "(Lrn/q$c;)V", "onCleared", "a", "Ljn/b;", "b", "LQn/I;", "c", "Lgi/a;", "d", "LCl/e;", "Ltv/B;", "Lrn/q$e;", "e", "Ltv/B;", "_viewState", "Ltv/P;", "f", "Ltv/P;", "q", "()Ltv/P;", "viewState", "LNu/a;", "g", "LNu/a;", "compositeDisposable", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rn.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16816q extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15063b navigationCommandManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Qn.I flyBuyManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerIntent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Nu.a compositeDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.q$a */
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<FlyBuyState, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, C16816q.class, "onNewFlyBuyState", "onNewFlyBuyState(Lcom/meijer/mobile/meijer/managers/FlyBuyState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlyBuyState flyBuyState, Continuation<? super Unit> continuation) {
            return C16816q.n((C16816q) this.f142801a, flyBuyState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "LQn/K;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.FlyBuyImHereViewModel$2", f = "FlyBuyImHereViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rn.q$b */
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super FlyBuyState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159739a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f159740b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super FlyBuyState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f159740b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f159739a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f159740b, "Error observing flybuy state", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrn/q$c;", "", "<init>", "()V", "f", "b", "d", "e", "a", "g", "c", "Lrn/q$c$a;", "Lrn/q$c$b;", "Lrn/q$c$c;", "Lrn/q$c$d;", "Lrn/q$c$e;", "Lrn/q$c$f;", "Lrn/q$c$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.q$c */
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/q$c$a;", "Lrn/q$c;", "Lok/h;", "storeDetails", "<init>", "(Lok/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lok/h;", "()Lok/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$a, reason: from toString */
        public static final /* data */ class DisplayCheckInStoreAddress extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoreDetails storeDetails;

            public DisplayCheckInStoreAddress(StoreDetails storeDetails) {
                super(null);
                this.storeDetails = storeDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayCheckInStoreAddress) && Intrinsics.e(this.storeDetails, ((DisplayCheckInStoreAddress) other).storeDetails);
            }

            /* renamed from: a, reason: from getter */
            public final StoreDetails getStoreDetails() {
                return this.storeDetails;
            }

            public int hashCode() {
                StoreDetails storeDetails = this.storeDetails;
                if (storeDetails == null) {
                    return 0;
                }
                return storeDetails.hashCode();
            }

            public String toString() {
                return "DisplayCheckInStoreAddress(storeDetails=" + this.storeDetails + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$b;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f159742a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "LocationPermissionsUpdated";
            }

            public int hashCode() {
                return 1672888011;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$c;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$c, reason: collision with other inner class name */
        public static final /* data */ class C2489c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C2489c f159743a = new C2489c();

            private C2489c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2489c);
            }

            public String toString() {
                return "NavigateBack";
            }

            public int hashCode() {
                return -1370378537;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$d;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$d */
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f159744a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "NavigateToCheckIn";
            }

            public int hashCode() {
                return 1969566050;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$e;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$e */
        public static final /* data */ class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f159745a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToMap";
            }

            public int hashCode() {
                return 484957425;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$f;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$f */
        public static final /* data */ class f extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final f f159746a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "NeedLocationPermission";
            }

            public int hashCode() {
                return 1461712057;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$c$g;", "Lrn/q$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$c$g */
        public static final /* data */ class g extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final g f159747a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "RouteToCustomerCheckIn";
            }

            public int hashCode() {
                return -372489878;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrn/q$d;", "", "<init>", "()V", "c", "b", "e", "f", "d", "g", "a", "Lrn/q$d$a;", "Lrn/q$d$b;", "Lrn/q$d$c;", "Lrn/q$d$d;", "Lrn/q$d$e;", "Lrn/q$d$f;", "Lrn/q$d$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.q$d */
    public static abstract class d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$d$a;", "Lrn/q$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$a */
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f159748a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "CheckLocationPermissions";
            }

            public int hashCode() {
                return -2116624017;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lrn/q$d$b;", "Lrn/q$d;", "", "title", "message", "positiveBtnTxt", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$b, reason: from toString */
        public static final /* data */ class FailEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveBtnTxt;

            public FailEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveBtnTxt = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailEvent)) {
                    return false;
                }
                FailEvent failEvent = (FailEvent) other;
                return this.title == failEvent.title && this.message == failEvent.message && this.positiveBtnTxt == failEvent.positiveBtnTxt;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveBtnTxt() {
                return this.positiveBtnTxt;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveBtnTxt);
            }

            public String toString() {
                return "FailEvent(title=" + this.title + ", message=" + this.message + ", positiveBtnTxt=" + this.positiveBtnTxt + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrn/q$d$c;", "Lrn/q$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$c */
        public static final /* data */ class c extends d {
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lrn/q$d$d;", "Lrn/q$d;", "", "title", "message", "positiveButton", "negativeButton", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class LocationPermissionInfoDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int negativeButton;

            public LocationPermissionInfoDialogEvent(int i10, int i11, int i12, int i13) {
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
                if (!(other instanceof LocationPermissionInfoDialogEvent)) {
                    return false;
                }
                LocationPermissionInfoDialogEvent locationPermissionInfoDialogEvent = (LocationPermissionInfoDialogEvent) other;
                return this.title == locationPermissionInfoDialogEvent.title && this.message == locationPermissionInfoDialogEvent.message && this.positiveButton == locationPermissionInfoDialogEvent.positiveButton && this.negativeButton == locationPermissionInfoDialogEvent.negativeButton;
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
                return "LocationPermissionInfoDialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/q$d$e;", "Lrn/q$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$e */
        public static final /* data */ class e extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f159756a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToCheckIn";
            }

            public int hashCode() {
                return -1038277159;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/q$d$f;", "Lrn/q$d;", "LCl/e;", "meijerIntent", "<init>", "(LCl/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCl/e;", "()LCl/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$f, reason: from toString */
        public static final /* data */ class NavigateToStoreAddressMap extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Cl.e meijerIntent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToStoreAddressMap) && Intrinsics.e(this.meijerIntent, ((NavigateToStoreAddressMap) other).meijerIntent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToStoreAddressMap(Cl.e meijerIntent) {
                super(null);
                Intrinsics.j(meijerIntent, "meijerIntent");
                this.meijerIntent = meijerIntent;
            }

            /* renamed from: a, reason: from getter */
            public final Cl.e getMeijerIntent() {
                return this.meijerIntent;
            }

            public int hashCode() {
                return this.meijerIntent.hashCode();
            }

            public String toString() {
                return "NavigateToStoreAddressMap(meijerIntent=" + this.meijerIntent + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrn/q$d$g;", "Lrn/q$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.q$d$g */
        public static final /* data */ class g extends d {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lrn/q$e;", "", "LGk/a;", "Lrn/q$d;", "customerCheckInIntroUIEvents", "", "progressIsVisible", "LQn/K;", "flyBuyState", "Lak/a;", "storeAddressDetails", "<init>", "(LGk/a;ZLQn/K;Lak/a;)V", "a", "(LGk/a;ZLQn/K;Lak/a;)Lrn/q$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LGk/a;", "c", "()LGk/a;", "b", "Z", "e", "()Z", "LQn/K;", "d", "()LQn/K;", "Lak/a;", "f", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.q$e, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<d> customerCheckInIntroUIEvents;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean progressIsVisible;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FlyBuyState flyBuyState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a storeAddressDetails;

        public ViewState() {
            this(null, false, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.customerCheckInIntroUIEvents, viewState.customerCheckInIntroUIEvents) && this.progressIsVisible == viewState.progressIsVisible && Intrinsics.e(this.flyBuyState, viewState.flyBuyState) && Intrinsics.e(this.storeAddressDetails, viewState.storeAddressDetails);
        }

        public ViewState(UIEvent<d> customerCheckInIntroUIEvents, boolean z10, FlyBuyState flyBuyState, AbstractC5607a abstractC5607a) {
            Intrinsics.j(customerCheckInIntroUIEvents, "customerCheckInIntroUIEvents");
            this.customerCheckInIntroUIEvents = customerCheckInIntroUIEvents;
            this.progressIsVisible = z10;
            this.flyBuyState = flyBuyState;
            this.storeAddressDetails = abstractC5607a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, UIEvent uIEvent, boolean z10, FlyBuyState flyBuyState, AbstractC5607a abstractC5607a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uIEvent = viewState.customerCheckInIntroUIEvents;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.progressIsVisible;
            }
            if ((i10 & 4) != 0) {
                flyBuyState = viewState.flyBuyState;
            }
            if ((i10 & 8) != 0) {
                abstractC5607a = viewState.storeAddressDetails;
            }
            return viewState.a(uIEvent, z10, flyBuyState, abstractC5607a);
        }

        public final ViewState a(UIEvent<d> customerCheckInIntroUIEvents, boolean progressIsVisible, FlyBuyState flyBuyState, AbstractC5607a storeAddressDetails) {
            Intrinsics.j(customerCheckInIntroUIEvents, "customerCheckInIntroUIEvents");
            return new ViewState(customerCheckInIntroUIEvents, progressIsVisible, flyBuyState, storeAddressDetails);
        }

        public final UIEvent<d> c() {
            return this.customerCheckInIntroUIEvents;
        }

        /* renamed from: d, reason: from getter */
        public final FlyBuyState getFlyBuyState() {
            return this.flyBuyState;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getProgressIsVisible() {
            return this.progressIsVisible;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC5607a getStoreAddressDetails() {
            return this.storeAddressDetails;
        }

        public int hashCode() {
            int iHashCode = ((this.customerCheckInIntroUIEvents.hashCode() * 31) + Boolean.hashCode(this.progressIsVisible)) * 31;
            FlyBuyState flyBuyState = this.flyBuyState;
            int iHashCode2 = (iHashCode + (flyBuyState == null ? 0 : flyBuyState.hashCode())) * 31;
            AbstractC5607a abstractC5607a = this.storeAddressDetails;
            return iHashCode2 + (abstractC5607a != null ? abstractC5607a.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(customerCheckInIntroUIEvents=" + this.customerCheckInIntroUIEvents + ", progressIsVisible=" + this.progressIsVisible + ", flyBuyState=" + this.flyBuyState + ", storeAddressDetails=" + this.storeAddressDetails + ')';
        }

        public /* synthetic */ ViewState(UIEvent uIEvent, boolean z10, FlyBuyState flyBuyState, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : flyBuyState, (i10 & 8) != 0 ? null : abstractC5607a);
        }
    }

    public C16816q(C15063b navigationCommandManager, Qn.I flyBuyManager, InterfaceC14261a analyticsEngine, Cl.e meijerIntent) {
        Intrinsics.j(navigationCommandManager, "navigationCommandManager");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(meijerIntent, "meijerIntent");
        this.navigationCommandManager = navigationCommandManager;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        this.meijerIntent = meijerIntent;
        InterfaceC17140B<ViewState> interfaceC17140BA = tv.S.a(new ViewState(null, false, null, null, 15, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        this.compositeDisposable = new Nu.a();
        C17154h.J(C17154h.g(C17154h.O(C17154h.Z(xv.h.b(flyBuyManager.J()), 1), new a(this)), new b(null)), androidx.view.d0.a(this));
    }

    private final void p(StoreDetails storeDetails) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, false, null, CheckInStoreDetailsDecorator.INSTANCE.a(storeDetails).getStoreAddress(), 7, null)));
    }

    private final void r() throws Exception {
        List<FlyBuyOrderDetail.FlyBuyOrder> listA;
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder;
        Integer orderId;
        List<FlyBuyOrderDetail.FlyBuyOrder> listA2;
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder2;
        FlyBuyState flyBuyState = this._viewState.getValue().getFlyBuyState();
        if (flyBuyState != null) {
            FlyBuyOrderDetail flyBuyOrder3 = flyBuyState.getFlyBuyOrder();
            String redemptionCode = (flyBuyOrder3 == null || (listA2 = flyBuyOrder3.a()) == null || (flyBuyOrder2 = (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA2)) == null) ? null : flyBuyOrder2.getRedemptionCode();
            if (redemptionCode == null) {
                redemptionCode = "";
            }
            FlyBuyOrderDetail flyBuyOrder4 = flyBuyState.getFlyBuyOrder();
            int iIntValue = (flyBuyOrder4 == null || (listA = flyBuyOrder4.a()) == null || (flyBuyOrder = (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA)) == null || (orderId = flyBuyOrder.getOrderId()) == null) ? 0 : orderId.intValue();
            OrderDetail currentOrderDetails = flyBuyState.getCurrentOrderDetails();
            this.flyBuyManager.x(String.valueOf(iIntValue), redemptionCode, currentOrderDetails != null ? currentOrderDetails.getPickUpPerson() : null, new Function1() { // from class: rn.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16816q.s(this.f159731a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(C16816q c16816q, boolean z10) {
        ViewState value;
        if (!z10) {
            InterfaceC17140B<ViewState> interfaceC17140B = c16816q._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b(value, new UIEvent(new d.FailEvent(com.meijer.mobile.meijer.Y.f99806S9, com.meijer.mobile.meijer.Y.f99787R9, yr.Q.f170986b)), false, null, null, 14, null)));
        }
        return Unit.f142422a;
    }

    private final void t() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, new UIEvent(d.e.f159756a), false, null, null, 12, null)));
    }

    private final void u(Cl.e meijerIntent) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, new UIEvent(new d.NavigateToStoreAddressMap(meijerIntent)), false, null, null, 14, null)));
    }

    private final void x() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, new UIEvent(new d.LocationPermissionInfoDialogEvent(com.meijer.mobile.meijer.Y.f99541Ea, com.meijer.mobile.meijer.Y.f99484Ba, com.meijer.mobile.meijer.Y.f99503Ca, com.meijer.mobile.meijer.Y.f99522Da)), false, null, null, 12, null)));
    }

    public final tv.P<ViewState> q() {
        return this.viewState;
    }

    public final void v(c action) throws Exception {
        Intrinsics.j(action, "action");
        if (action instanceof c.f) {
            x();
            return;
        }
        if (action instanceof c.b) {
            y();
            return;
        }
        if (action instanceof c.d) {
            FlyBuyState flyBuyState = this._viewState.getValue().getFlyBuyState();
            if (flyBuyState != null) {
                this.analyticsEngine.e(Jn.n.G(Jn.n.f16050a, flyBuyState, false, 2, null));
            }
            t();
            return;
        }
        if (action instanceof c.DisplayCheckInStoreAddress) {
            StoreDetails storeDetails = ((c.DisplayCheckInStoreAddress) action).getStoreDetails();
            if (storeDetails != null) {
                p(storeDetails);
                return;
            }
            return;
        }
        if (action instanceof c.e) {
            u(this.meijerIntent);
        } else if (action instanceof c.g) {
            this.navigationCommandManager.d(nn.T.f152011a.a());
        } else {
            if (!(action instanceof c.C2489c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigationCommandManager.d(nn.T.f152011a.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object n(C16816q c16816q, FlyBuyState flyBuyState, Continuation continuation) {
        c16816q.w(flyBuyState);
        return Unit.f142422a;
    }

    private final void w(FlyBuyState flyBuyState) {
        if (flyBuyState.getIsCheckInSubstitutionsTrackStateEnabled()) {
            this.analyticsEngine.e(Jn.n.f16050a.p(flyBuyState));
            this.flyBuyManager.r0(false);
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            FlyBuyState flyBuyState2 = flyBuyState;
            if (interfaceC17140B.e(value, ViewState.b(value, new UIEvent(d.a.f159748a), false, flyBuyState2, null, 10, null))) {
                return;
            } else {
                flyBuyState = flyBuyState2;
            }
        }
    }

    private final void y() throws Exception {
        r();
        this.flyBuyManager.o0();
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}

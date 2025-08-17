package com.meijer.mobile.mperks.ux.rewardDetail;

import Ao.C2930u;
import Co.ProductFullDetails;
import Oj.a;
import Qo.l;
import Yr.CouponsProductDecorator;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import bo.RewardDetail;
import com.meijer.mobile.mperks.ux.rewardDetail.AbstractC12677a;
import com.meijer.mobile.product.service.multi.api.NoProductAvailableException;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import eo.C13714b;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlin.ranges.RangesKt;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import ur.AbstractC17302a;
import vl.ProductEligibility;
import vr.AbstractC17604a;
import wr.InterfaceC17847a;
import yr.Q;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0003HJFB9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u001b\u0010!\u001a\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0017J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0017J\u001d\u00104\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020 H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020X0\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0017\u0010t\u001a\b\u0012\u0004\u0012\u00020S0q8F¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lyo/k;", "userManager", "Lhl/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lyo/f;", "storeManager", "Leo/b;", "productQueryPagingDataSource", "Lgi/a;", "analyticsEngine", "<init>", "(Lyo/k;Lhl/m;Lwr/f;Lyo/f;Leo/b;Lgi/a;)V", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "()V", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a;", "action", "K", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/a;)V", "O", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "", "E", "(Ljava/lang/String;)D", "Lcom/meijer/mobile/mperks/ux/rewardDetail/D;", "snackbarType", "", "messageResId", "Q", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/D;I)V", "Lej/j;", "entryChange", "", "cartAddition", "P", "(Lej/j;Z)V", "J", "I", "", "LOj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "Lbo/j;", "rewardDetail", "G", "(Lbo/j;)V", "LCo/h;", "product", "quantityToUpdate", "L", "(LCo/h;D)V", "errorMessage", "M", "(Ljava/lang/String;)V", "a", "Lyo/k;", "b", "Lhl/m;", "c", "Lwr/f;", "d", "Lyo/f;", "e", "Leo/b;", "f", "Lgi/a;", "LOj/c;", "g", "LOj/c;", "loadingStatesManager", "Ltv/B;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "h", "Ltv/B;", "_rewardDetailStateFlow", "Ltv/A;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "i", "Ltv/A;", "_eventFlow", "Ltv/F;", "j", "Ltv/F;", "F", "()Ltv/F;", "eventFlow", "LNu/a;", "k", "LNu/a;", "disposables", "", "l", "Ljava/util/Map;", "lastKnownCartQuantities", "Lej/C;", "m", "Lej/C;", "cart", "n", "Lbo/j;", "rewardDetailItem", "Ltv/P;", "H", "()Ltv/P;", "rewardDetailStateFlow", "o", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class y extends c0 implements InterfaceC6015f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f114553p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13714b productQueryPagingDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Oj.c loadingStatesManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<RewardsDetailsViewState> _rewardDetailStateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<d> _eventFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<d> eventFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Double> lastKnownCartQuantities;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ShoppingCart cart;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private RewardDetail rewardDetailItem;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, y.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return y.n((y) this.f142801a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LOj/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends Oj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114568a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f114569b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<? extends Oj.a>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f114569b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f114568a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f114569b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "", "<init>", "()V", "a", "c", "b", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$a;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$b;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$a;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "", "titleResId", "messageResId", "", "requireAcknowledgement", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.y$d$a, reason: from toString */
        public static final /* data */ class SimpleOkAlertDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean requireAcknowledgement;

            public SimpleOkAlertDialogEvent(int i10, int i11, boolean z10) {
                super(null);
                this.titleResId = i10;
                this.messageResId = i11;
                this.requireAcknowledgement = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SimpleOkAlertDialogEvent)) {
                    return false;
                }
                SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = (SimpleOkAlertDialogEvent) other;
                return this.titleResId == simpleOkAlertDialogEvent.titleResId && this.messageResId == simpleOkAlertDialogEvent.messageResId && this.requireAcknowledgement == simpleOkAlertDialogEvent.requireAcknowledgement;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Boolean.hashCode(this.requireAcknowledgement);
            }

            public String toString() {
                return "SimpleOkAlertDialogEvent(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", requireAcknowledgement=" + this.requireAcknowledgement + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getRequireAcknowledgement() {
                return this.requireAcknowledgement;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$b;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.y$d$b, reason: from toString */
        public static final /* data */ class UpdateCartFailedEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public UpdateCartFailedEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateCartFailedEvent) && this.messageResId == ((UpdateCartFailedEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateCartFailedEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d$c;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "", "messageResId", "actionResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.y$d$c, reason: from toString */
        public static final /* data */ class UpdateCartSuccessEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            public UpdateCartSuccessEvent(int i10, int i11) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartSuccessEvent)) {
                    return false;
                }
                UpdateCartSuccessEvent updateCartSuccessEvent = (UpdateCartSuccessEvent) other;
                return this.messageResId == updateCartSuccessEvent.messageResId && this.actionResId == updateCartSuccessEvent.actionResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId);
            }

            public String toString() {
                return "UpdateCartSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\tJ%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$e;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/y;)V", "Ltk/c;", "Lej/j;", "entryChange", "", "a", "(Ltk/c;)V", "d", "b", "", "Lej/i;", "entries", "c", "(Ljava/util/List;)V", "Lej/C;", "cartResource", "observeCart", "Lur/a;", "processedRequest", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "LNu/a;", "getDisposable", "()LNu/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private final class e implements InterfaceC17847a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f128931b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f128933d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f128932c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f128934e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EntryChange.c.f128935f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EntryChange.c.f128936g.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EntryChange.c.f128937h.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$observeCart$1", f = "RewardsDetailsViewModel.kt", l = {294}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114577a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f114578b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y yVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f114578b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f114578b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114577a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f114578b._eventFlow;
                    d.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new d.SimpleOkAlertDialogEvent(Q.f170963F, Q.f170962E, true);
                    this.f114577a = 1;
                    if (interfaceC17139A.emit(simpleOkAlertDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$processedRequest$1", f = "RewardsDetailsViewModel.kt", l = {317}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f114579a;

            /* renamed from: b, reason: collision with root package name */
            Object f114580b;

            /* renamed from: c, reason: collision with root package name */
            Object f114581c;

            /* renamed from: d, reason: collision with root package name */
            Object f114582d;

            /* renamed from: e, reason: collision with root package name */
            int f114583e;

            /* renamed from: f, reason: collision with root package name */
            int f114584f;

            /* renamed from: g, reason: collision with root package name */
            int f114585g;

            /* renamed from: h, reason: collision with root package name */
            int f114586h;

            /* renamed from: i, reason: collision with root package name */
            int f114587i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f114588j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ y f114589k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y yVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f114589k = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f114589k, continuation);
                cVar.f114588j = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114587i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f114588j;
                        y yVar = this.f114589k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = yVar.cartInteractor;
                        this.f114588j = interfaceC16622O;
                        this.f114579a = interfaceC16622O;
                        this.f114580b = this;
                        this.f114581c = this;
                        this.f114582d = interfaceC16622O;
                        this.f114583e = 0;
                        this.f114584f = 0;
                        this.f114585g = 0;
                        this.f114586h = 0;
                        this.f114587i = 1;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f142422a);
                } catch (Exception e10) {
                    E0.i(getContext());
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    uw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$processedRequest$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f114591b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17302a f114592c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f114591b, this.f114592c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(y yVar, AbstractC17302a abstractC17302a, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f114591b = yVar;
                this.f114592c = abstractC17302a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                RewardsDetailsViewState rewardsDetailsViewState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f114590a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f114591b._rewardDetailStateFlow;
                AbstractC17302a abstractC17302a = this.f114592c;
                do {
                    value = interfaceC17140B.getValue();
                    rewardsDetailsViewState = (RewardsDetailsViewState) value;
                    List<CouponsProductDecorator> listE = rewardsDetailsViewState.e();
                    if (listE != null) {
                        List<CouponsProductDecorator> list = listE;
                        arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list) {
                            if (Intrinsics.e(couponsProductDecoratorV.getProduct().getCode(), abstractC17302a.getProductCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null);
                            }
                            arrayList.add(couponsProductDecoratorV);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$syncSteppersWithCartData$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.y$e$e, reason: collision with other inner class name */
        static final class C1817e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114593a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f114594b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f114595c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1817e(y yVar, List<String> list, Continuation<? super C1817e> continuation) {
                super(2, continuation);
                this.f114594b = yVar;
                this.f114595c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1817e(this.f114594b, this.f114595c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1817e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                RewardsDetailsViewState rewardsDetailsViewState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f114593a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f114594b._rewardDetailStateFlow;
                List<String> list = this.f114595c;
                y yVar = this.f114594b;
                do {
                    value = interfaceC17140B.getValue();
                    rewardsDetailsViewState = (RewardsDetailsViewState) value;
                    List<CouponsProductDecorator> listE = rewardsDetailsViewState.e();
                    if (listE != null) {
                        List<CouponsProductDecorator> list2 = listE;
                        arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list2) {
                            if (list.contains(couponsProductDecoratorV.getProduct().getCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, yVar.E(couponsProductDecoratorV.getProduct().getCode()), false, false, null, null, null, null, null, false, null, 33521663, null);
                            }
                            arrayList.add(couponsProductDecoratorV);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$throwChallenge$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f114596a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f114597b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17604a.ChokingHazardChallenge f114598c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f114597b, this.f114598c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(y yVar, AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f114597b = yVar;
                this.f114598c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.f();
                if (this.f114596a == 0) {
                    ResultKt.b(obj);
                    InterfaceC17140B interfaceC17140B = this.f114597b._rewardDetailStateFlow;
                    AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge = this.f114598c;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, 0, null, false, null, chokingHazardChallenge.a(), 31, null)));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public e() {
        }

        private final void a(tk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                if (entryChange instanceof c.Failure) {
                    uw.a.INSTANCE.f(((c.Failure) entryChange).getError(), "Resource.Failure<EntryChange>", new Object[0]);
                    y.this.Q(D.f114323b, C17135b.f161993P0);
                    return;
                }
                return;
            }
            c.Success success = (c.Success) entryChange;
            EntryChange entryChange2 = (EntryChange) success.a();
            EntryChange.c statusCode = entryChange2 != null ? entryChange2.getStatusCode() : null;
            switch (statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
                case -1:
                case 5:
                    y.this.O();
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        y.this.P(entryChange3, true);
                    }
                    y.this.Q(D.f114322a, C17135b.f162019f);
                    return;
                case 3:
                    y.this.Q(D.f114323b, C17135b.f161979I0);
                    return;
                case 4:
                    y.this.Q(D.f114323b, C17135b.f161981J0);
                    return;
                case 6:
                case 7:
                    return;
            }
        }

        private final void b(tk.c<EntryChange> entryChange) {
            if (entryChange instanceof c.Success) {
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f128935f) {
                    y.this.Q(D.f114322a, C17135b.f161988N);
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        y.this.P(entryChange3, false);
                        return;
                    }
                    return;
                }
            }
            y.this.Q(D.f114323b, C17135b.f161993P0);
        }

        private final void c(List<Entry> entries) {
            Map mapK;
            List listM;
            y.this.lastKnownCartQuantities.clear();
            Map map = y.this.lastKnownCartQuantities;
            if (entries != null) {
                List<Entry> list = entries;
                mapK = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
                for (Entry entry : list) {
                    Pair pairA = TuplesKt.a(entry.m().getCode(), Double.valueOf(entry.getActualQuantity()));
                    mapK.put(pairA.c(), pairA.d());
                }
            } else {
                mapK = MapsKt.k();
            }
            map.putAll(mapK);
            List<CouponsProductDecorator> listE = ((RewardsDetailsViewState) y.this._rewardDetailStateFlow.getValue()).e();
            if (listE != null) {
                y yVar = y.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : listE) {
                    CouponsProductDecorator couponsProductDecorator = (CouponsProductDecorator) obj;
                    if (!couponsProductDecorator.getInQtyStepperTransition() && couponsProductDecorator.getActualQuantity() != yVar.E(couponsProductDecorator.getProduct().getCode())) {
                        arrayList.add(obj);
                    }
                }
                listM = new ArrayList(CollectionsKt.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listM.add(((CouponsProductDecorator) it.next()).getProduct().getCode());
                }
            } else {
                listM = null;
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            List listM1 = CollectionsKt.m1(listM);
            if (listM1.isEmpty()) {
                return;
            }
            C16648k.d(d0.a(y.this), null, null, new C1817e(y.this, listM1, null), 3, null);
        }

        private final void d(tk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                y.this.Q(D.f114323b, C17135b.f161993P0);
                return;
            }
            c.Success success = (c.Success) entryChange;
            EntryChange entryChange2 = (EntryChange) success.a();
            EntryChange.c statusCode = entryChange2 != null ? entryChange2.getStatusCode() : null;
            switch (statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
                case -1:
                case 5:
                    y.this.O();
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                    y.this.Q(D.f114322a, C17135b.f162057y);
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        y yVar = y.this;
                        if (entryChange3.getActualQuantityChange() > 0.0d) {
                            yVar.P(entryChange3, true);
                            return;
                        } else {
                            if (entryChange3.getActualQuantityChange() < 0.0d) {
                                yVar.P(entryChange3, false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                case 3:
                    y.this.Q(D.f114323b, C17135b.f161979I0);
                    return;
                case 4:
                    y.this.Q(D.f114323b, C17135b.f161981J0);
                    return;
                case 6:
                case 7:
                    return;
            }
        }

        @Override // wr.InterfaceC17847a
        /* renamed from: getDisposable */
        public Nu.a getDisposables() {
            return y.this.disposables;
        }

        @Override // wr.InterfaceC17847a
        public void observeCart(tk.c<ShoppingCart> cartResource) {
            ShoppingCart shoppingCartA;
            if (y.this.userManager.b()) {
                y.this.cart = cartResource != null ? cartResource.a() : null;
                if (cartResource instanceof c.Failure) {
                    Throwable error = ((c.Failure) cartResource).getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException != null && httpException.code() == 503) {
                        C16648k.d(d0.a(y.this), null, null, new b(y.this, null), 3, null);
                    }
                }
                if (cartResource == null || (shoppingCartA = cartResource.a()) == null) {
                    return;
                }
                c(shoppingCartA.p());
            }
        }

        @Override // wr.InterfaceC17847a
        public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                y.this.O();
                C16648k.d(d0.a(y.this), null, null, new c(y.this, null), 3, null);
            } else {
                C16648k.d(d0.a(y.this), null, null, new d(y.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17302a.Add) {
                a(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17302a.Update) {
                d(entryChange);
            } else if (processedRequest instanceof AbstractC17302a.Remove) {
                b(entryChange);
            } else {
                if (!(processedRequest instanceof AbstractC17302a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y.this.O();
            }
        }

        @Override // wr.InterfaceC17847a
        public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17604a abstractC17604aF = challenge.f();
            Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C16648k.d(d0.a(y.this), null, null, new f(y.this, (AbstractC17604a.ChokingHazardChallenge) abstractC17604aF, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$getProductDetails$1", f = "RewardsDetailsViewModel.kt", l = {172}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114599a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f114601c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new f(this.f114601c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RewardDetail rewardDetail, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f114601c = rewardDetail;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object value;
            String strValueOf;
            Object value2;
            RewardsDetailsViewState rewardsDetailsViewState;
            ArrayList arrayList;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114599a;
            if (i10 == 0) {
                ResultKt.b(obj);
                y.this.loadingStatesManager.b(new a.Loading(null, null, 3, null));
                y.this.rewardDetailItem = this.f114601c;
                C13714b c13714b = y.this.productQueryPagingDataSource;
                l.Reward reward = new l.Reward(String.valueOf(this.f114601c.getRewardId()), String.valueOf(this.f114601c.getName()), 0, 0, null, null, null, 0, null, false, null, 2044, null);
                this.f114599a = 1;
                objA = c13714b.a(reward, this);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = obj;
            }
            Qo.l lVar = (Qo.l) objA;
            y yVar = y.this;
            if (!lVar.j() && !lVar.getIsPending()) {
                l.Reward reward2 = (l.Reward) lVar;
                InterfaceC17140B interfaceC17140B = yVar._rewardDetailStateFlow;
                do {
                    value2 = interfaceC17140B.getValue();
                    rewardsDetailsViewState = (RewardsDetailsViewState) value2;
                    List<ProductFullDetails> listB1 = CollectionsKt.b1(reward2.f(), 5);
                    arrayList = new ArrayList(CollectionsKt.x(listB1, 10));
                    for (ProductFullDetails productFullDetails : listB1) {
                        arrayList.add(CouponsProductDecorator.INSTANCE.a(productFullDetails, yVar.E(productFullDetails.getCode()), new ProductEligibility(productFullDetails, yVar.storeManager.a(), yVar.cart).k()));
                    }
                } while (!interfaceC17140B.e(value2, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 51, null)));
            }
            y yVar2 = y.this;
            if (lVar.getError() != null) {
                l.Reward reward3 = (l.Reward) lVar;
                InterfaceC17140B interfaceC17140B2 = yVar2._rewardDetailStateFlow;
                do {
                    value = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, 0, null, true, reward3.getError() instanceof NoProductAvailableException ? AbstractC5607a.INSTANCE.d(Bj.o.f3028l0, new Object[0]) : AbstractC5607a.INSTANCE.d(Bj.o.f2995R0, new Object[0]), null, 39, null)));
                if (reward3.getError() instanceof NoProductAvailableException) {
                    strValueOf = "Sorry! These items are not available at this time.";
                } else {
                    Throwable error = reward3.getError();
                    strValueOf = String.valueOf(error != null ? error.getMessage() : null);
                }
                yVar2.M(strValueOf);
            }
            y.this.loadingStatesManager.b(new a.NotLoading(null, 1, null));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$observeCartCount$1", f = "RewardsDetailsViewModel.kt", l = {147}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114602a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f114604a;

            a(y yVar) {
                this.f114604a = yVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f114604a._rewardDetailStateFlow;
                do {
                    value = interfaceC17140B.getValue();
                    Intrinsics.g(num);
                } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, num.intValue(), null, false, null, null, 61, null)));
                return Unit.f142422a;
            }
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114602a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fB = xv.h.b(y.this.cartRepository.Q());
                a aVar = new a(y.this);
                this.f114602a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$observeCartInteractor$1", f = "RewardsDetailsViewModel.kt", l = {136}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114605a;

        /* renamed from: b, reason: collision with root package name */
        Object f114606b;

        /* renamed from: c, reason: collision with root package name */
        Object f114607c;

        /* renamed from: d, reason: collision with root package name */
        Object f114608d;

        /* renamed from: e, reason: collision with root package name */
        int f114609e;

        /* renamed from: f, reason: collision with root package name */
        int f114610f;

        /* renamed from: g, reason: collision with root package name */
        int f114611g;

        /* renamed from: h, reason: collision with root package name */
        int f114612h;

        /* renamed from: i, reason: collision with root package name */
        int f114613i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f114614j;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = y.this.new h(continuation);
            hVar.f114614j = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114613i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f114614j;
                    y yVar = y.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = yVar.cartInteractor;
                    this.f114614j = interfaceC16622O;
                    this.f114605a = interfaceC16622O;
                    this.f114606b = this;
                    this.f114607c = this;
                    this.f114608d = interfaceC16622O;
                    this.f114609e = 0;
                    this.f114610f = 0;
                    this.f114611g = 0;
                    this.f114612h = 0;
                    this.f114613i = 1;
                    if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$onStepperChange$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114616a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            RewardsDetailsViewState rewardsDetailsViewState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f114616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = y.this._rewardDetailStateFlow;
            do {
                value = interfaceC17140B.getValue();
                rewardsDetailsViewState = (RewardsDetailsViewState) value;
                List<CouponsProductDecorator> listE = rewardsDetailsViewState.e();
                if (listE != null) {
                    List<CouponsProductDecorator> list = listE;
                    arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CouponsProductDecorator.v((CouponsProductDecorator) it.next(), null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33423359, null));
                    }
                } else {
                    arrayList = null;
                }
            } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$resetQuantitySteppers$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114618a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            RewardsDetailsViewState rewardsDetailsViewState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f114618a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = y.this._rewardDetailStateFlow;
            y yVar = y.this;
            do {
                value = interfaceC17140B.getValue();
                rewardsDetailsViewState = (RewardsDetailsViewState) value;
                List<CouponsProductDecorator> listE = rewardsDetailsViewState.e();
                if (listE != null) {
                    List<CouponsProductDecorator> list = listE;
                    arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    for (CouponsProductDecorator couponsProductDecorator : list) {
                        arrayList.add(CouponsProductDecorator.v(couponsProductDecorator, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, yVar.E(couponsProductDecorator.getProduct().getCode()), false, true, null, null, null, null, null, false, null, 33325055, null));
                    }
                } else {
                    arrayList = null;
                }
            } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$updateState$1", f = "RewardsDetailsViewModel.kt", l = {527, 531}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f114621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f114622c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f114623d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(D d10, y yVar, int i10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f114621b = d10;
            this.f114622c = yVar;
            this.f114623d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f114621b, this.f114622c, this.f114623d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f114620a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L55
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.b(r6)
                goto L5a
            L1e:
                kotlin.ResultKt.b(r6)
                com.meijer.mobile.mperks.ux.rewardDetail.D r6 = r5.f114621b
                com.meijer.mobile.mperks.ux.rewardDetail.D r1 = com.meijer.mobile.mperks.ux.rewardDetail.D.f114322a
                if (r6 != r1) goto L3f
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f114622c
                tv.A r6 = com.meijer.mobile.mperks.ux.rewardDetail.y.y(r6)
                com.meijer.mobile.mperks.ux.rewardDetail.y$d$c r1 = new com.meijer.mobile.mperks.ux.rewardDetail.y$d$c
                int r2 = r5.f114623d
                int r4 = tr.C17135b.f162001T0
                r1.<init>(r2, r4)
                r5.f114620a = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L5a
                goto L54
            L3f:
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f114622c
                tv.A r6 = com.meijer.mobile.mperks.ux.rewardDetail.y.y(r6)
                com.meijer.mobile.mperks.ux.rewardDetail.y$d$b r1 = new com.meijer.mobile.mperks.ux.rewardDetail.y$d$b
                int r3 = r5.f114623d
                r1.<init>(r3)
                r5.f114620a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f114622c
                r6.O()
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.y.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y(yo.k userManager, hl.m cartRepository, wr.f cartInteractor, yo.f storeManager, C13714b productQueryPagingDataSource, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(productQueryPagingDataSource, "productQueryPagingDataSource");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.userManager = userManager;
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        this.storeManager = storeManager;
        this.productQueryPagingDataSource = productQueryPagingDataSource;
        this.analyticsEngine = analyticsEngine;
        Oj.c cVar = new Oj.c();
        this.loadingStatesManager = cVar;
        this._rewardDetailStateFlow = S.a(new RewardsDetailsViewState(false, 0, null, false, null, null, 63, null));
        InterfaceC17139A<d> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        this.disposables = new Nu.a();
        this.lastKnownCartQuantities = new LinkedHashMap();
        if (userManager.b()) {
            wr.f.r(cartInteractor, false, new e(), 1, null);
        }
        C17154h.J(C17154h.g(C17154h.O(cVar.a(), new a(this)), new b(null)), d0.a(this));
    }

    private final void I() {
        if (this.userManager.b()) {
            C16648k.d(d0.a(this), null, null, new g(null), 3, null);
        }
    }

    private final void J() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new e(), 1, null);
            this.cartInteractor.p();
            C16648k.d(d0.a(this), null, null, new h(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(final String errorMessage) {
        this.analyticsEngine.h(C14476c.h("mPerks Rewards: Product carousel failed to load"), new Function1() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.N(errorMessage, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("errorMessage", str);
        return Unit.f142422a;
    }

    private final void onLoadingStates(List<? extends Oj.a> loadingStates) {
        RewardsDetailsViewState value;
        List<? extends Oj.a> list = loadingStates;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Oj.a) it.next()) instanceof a.Loading) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean z11 = z10;
        InterfaceC17140B<RewardsDetailsViewState> interfaceC17140B = this._rewardDetailStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, RewardsDetailsViewState.b(value, z11, 0, null, false, null, null, 62, null)));
    }

    public final double E(String code) {
        Intrinsics.j(code, "code");
        Double d10 = this.lastKnownCartQuantities.get(code);
        if (d10 != null) {
            return d10.doubleValue();
        }
        return 0.0d;
    }

    public final InterfaceC17144F<d> F() {
        return this.eventFlow;
    }

    public final P<RewardsDetailsViewState> H() {
        return C17154h.c(this._rewardDetailStateFlow);
    }

    public final void K(AbstractC12677a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12677a.GetProductsDetail) {
            AbstractC12677a.GetProductsDetail getProductsDetail = (AbstractC12677a.GetProductsDetail) action;
            if (getProductsDetail.getRewardDetail().getRewardId() != null) {
                G(getProductsDetail.getRewardDetail());
                return;
            }
            return;
        }
        if (!(action instanceof AbstractC12677a.StepperChange)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12677a.StepperChange stepperChange = (AbstractC12677a.StepperChange) action;
        L(stepperChange.getProduct(), stepperChange.getQuantityToUpdate());
    }

    public final void P(EntryChange entryChange, boolean cartAddition) {
        Intrinsics.j(entryChange, "entryChange");
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        ShoppingCart shoppingCart = this.cart;
        String code = shoppingCart != null ? shoppingCart.getCode() : null;
        StringBuilder sb2 = new StringBuilder();
        RewardDetail rewardDetail = this.rewardDetailItem;
        if (rewardDetail == null) {
            Intrinsics.y("rewardDetailItem");
            rewardDetail = null;
        }
        sb2.append(rewardDetail.getRewardId());
        sb2.append(": ");
        RewardDetail rewardDetail2 = this.rewardDetailItem;
        if (rewardDetail2 == null) {
            Intrinsics.y("rewardDetailItem");
            rewardDetail2 = null;
        }
        sb2.append(rewardDetail2.getName());
        String string = sb2.toString();
        String strValueOf = String.valueOf(this._rewardDetailStateFlow.getValue().getCartItemCount());
        List<CouponsProductDecorator> listE = this._rewardDetailStateFlow.getValue().e();
        Intrinsics.g(listE);
        Iterator<CouponsProductDecorator> it = listE.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            String code2 = it.next().getProduct().getCode();
            Entry entry = entryChange.getEntry();
            if (Intrinsics.e(code2, entry != null ? entry.h2() : null)) {
                break;
            } else {
                i10++;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        interfaceC14261a.e(c2930u.n0(cartAddition, entryChange, code, string, strValueOf, numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null, "mPerks:Reward Details Page", "mPerks: Earn", "lowStock"));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        I();
        J();
    }

    private final void G(RewardDetail rewardDetail) {
        C16648k.d(d0.a(this), null, null, new f(rewardDetail, null), 3, null);
    }

    private final void L(ProductFullDetails product, double quantityToUpdate) {
        C16648k.d(d0.a(this), null, null, new i(null), 3, null);
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object n(y yVar, List list, Continuation continuation) {
        yVar.onLoadingStates(list);
        return Unit.f142422a;
    }

    public final void O() {
        C16648k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    public final void Q(D snackbarType, int messageResId) {
        C16648k.d(d0.a(this), null, null, new k(snackbarType, this, messageResId, null), 3, null);
    }
}

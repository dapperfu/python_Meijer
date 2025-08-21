package com.meijer.mobile.mperks.ux.rewardDetail;

import Ao.C2898u;
import Co.ProductFullDetails;
import Pj.a;
import Qo.l;
import Yr.CouponsProductDecorator;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import co.RewardDetail;
import com.meijer.mobile.mperks.ux.rewardDetail.AbstractC12803a;
import com.meijer.mobile.product.service.multi.api.NoProductAvailableException;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import fo.C14046b;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import retrofit2.HttpException;
import tr.C17284b;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import wl.ProductEligibility;
import wr.InterfaceC17909a;
import yr.Q;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0003HJFB9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u001b\u0010!\u001a\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0017J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0017J\u001d\u00104\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020 H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020X0\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0017\u0010t\u001a\b\u0012\u0004\u0012\u00020S0q8F¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lyo/f;", "storeManager", "Lfo/b;", "productQueryPagingDataSource", "Lhi/a;", "analyticsEngine", "<init>", "(Lyo/k;Lil/m;Lwr/f;Lyo/f;Lfo/b;Lhi/a;)V", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "()V", "Lcom/meijer/mobile/mperks/ux/rewardDetail/a;", "action", "K", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/a;)V", "O", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "", "E", "(Ljava/lang/String;)D", "Lcom/meijer/mobile/mperks/ux/rewardDetail/D;", "snackbarType", "", "messageResId", "Q", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/D;I)V", "Lfj/j;", "entryChange", "", "cartAddition", "P", "(Lfj/j;Z)V", "J", "I", "", "LPj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "Lco/k;", "rewardDetail", "G", "(Lco/k;)V", "LCo/h;", "product", "quantityToUpdate", "L", "(LCo/h;D)V", "errorMessage", "M", "(Ljava/lang/String;)V", "a", "Lyo/k;", "b", "Lil/m;", "c", "Lwr/f;", "d", "Lyo/f;", "e", "Lfo/b;", "f", "Lhi/a;", "LPj/c;", "g", "LPj/c;", "loadingStatesManager", "Lpv/B;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "h", "Lpv/B;", "_rewardDetailStateFlow", "Lpv/A;", "Lcom/meijer/mobile/mperks/ux/rewardDetail/y$d;", "i", "Lpv/A;", "_eventFlow", "Lpv/F;", "j", "Lpv/F;", "F", "()Lpv/F;", "eventFlow", "LJu/a;", "k", "LJu/a;", "disposables", "", "l", "Ljava/util/Map;", "lastKnownCartQuantities", "Lfj/C;", "m", "Lfj/C;", "cart", "n", "Lco/k;", "rewardDetailItem", "Lpv/P;", "H", "()Lpv/P;", "rewardDetailStateFlow", "o", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class y extends c0 implements InterfaceC6157f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f115498p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C14046b productQueryPagingDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStatesManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<RewardsDetailsViewState> _rewardDetailStateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _eventFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<d> eventFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Double> lastKnownCartQuantities;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ShoppingCart cart;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private RewardDetail rewardDetailItem;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, y.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return y.n((y) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115513a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f115514b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f115514b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f115513a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f115514b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f143329a;
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

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\tJ%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/y$e;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/mperks/ux/rewardDetail/y;)V", "Luk/c;", "Lfj/j;", "entryChange", "", "a", "(Luk/c;)V", "d", "b", "", "Lfj/i;", "entries", "c", "(Ljava/util/List;)V", "Lfj/C;", "cartResource", "observeCart", "Lur/a;", "processedRequest", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "LJu/a;", "getDisposable", "()LJu/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private final class e implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131921c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f131923e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EntryChange.c.f131924f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EntryChange.c.f131925g.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EntryChange.c.f131926h.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$observeCart$1", f = "RewardsDetailsViewModel.kt", l = {294}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f115523b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y yVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f115523b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f115523b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115522a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f115523b._eventFlow;
                    d.SimpleOkAlertDialogEvent simpleOkAlertDialogEvent = new d.SimpleOkAlertDialogEvent(Q.f171738F, Q.f171737E, true);
                    this.f115522a = 1;
                    if (interfaceC16548A.emit(simpleOkAlertDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$processedRequest$1", f = "RewardsDetailsViewModel.kt", l = {317}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f115524a;

            /* renamed from: b, reason: collision with root package name */
            Object f115525b;

            /* renamed from: c, reason: collision with root package name */
            Object f115526c;

            /* renamed from: d, reason: collision with root package name */
            Object f115527d;

            /* renamed from: e, reason: collision with root package name */
            int f115528e;

            /* renamed from: f, reason: collision with root package name */
            int f115529f;

            /* renamed from: g, reason: collision with root package name */
            int f115530g;

            /* renamed from: h, reason: collision with root package name */
            int f115531h;

            /* renamed from: i, reason: collision with root package name */
            int f115532i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f115533j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ y f115534k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y yVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f115534k = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f115534k, continuation);
                cVar.f115533j = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f115532i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f115533j;
                        y yVar = this.f115534k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = yVar.cartInteractor;
                        this.f115533j = interfaceC15783O;
                        this.f115524a = interfaceC15783O;
                        this.f115525b = this;
                        this.f115526c = this;
                        this.f115527d = interfaceC15783O;
                        this.f115528e = 0;
                        this.f115529f = 0;
                        this.f115530g = 0;
                        this.f115531h = 0;
                        this.f115532i = 1;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f143329a);
                } catch (Exception e10) {
                    E0.i(getContext());
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    qw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$processedRequest$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f115536b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17454a f115537c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f115536b, this.f115537c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(y yVar, AbstractC17454a abstractC17454a, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f115536b = yVar;
                this.f115537c = abstractC17454a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                RewardsDetailsViewState rewardsDetailsViewState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f115535a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f115536b._rewardDetailStateFlow;
                AbstractC17454a abstractC17454a = this.f115537c;
                do {
                    value = interfaceC16549B.getValue();
                    rewardsDetailsViewState = (RewardsDetailsViewState) value;
                    List<CouponsProductDecorator> listE = rewardsDetailsViewState.e();
                    if (listE != null) {
                        List<CouponsProductDecorator> list = listE;
                        arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        for (CouponsProductDecorator couponsProductDecoratorV : list) {
                            if (Intrinsics.e(couponsProductDecoratorV.getProduct().getCode(), abstractC17454a.getProductCode())) {
                                couponsProductDecoratorV = CouponsProductDecorator.v(couponsProductDecoratorV, null, null, null, null, null, false, null, null, null, false, false, false, false, false, null, 0.0d, false, false, null, null, null, null, null, false, null, 33488895, null);
                            }
                            arrayList.add(couponsProductDecoratorV);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$syncSteppersWithCartData$2", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.y$e$e, reason: collision with other inner class name */
        static final class C1824e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f115539b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f115540c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1824e(y yVar, List<String> list, Continuation<? super C1824e> continuation) {
                super(2, continuation);
                this.f115539b = yVar;
                this.f115540c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1824e(this.f115539b, this.f115540c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1824e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                RewardsDetailsViewState rewardsDetailsViewState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f115538a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f115539b._rewardDetailStateFlow;
                List<String> list = this.f115540c;
                y yVar = this.f115539b;
                do {
                    value = interfaceC16549B.getValue();
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
                } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$RewardDetailCartInteractionListener$throwChallenge$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f115541a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f115542b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f115543c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f115542b, this.f115543c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(y yVar, AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f115542b = yVar;
                this.f115543c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.f();
                if (this.f115541a == 0) {
                    ResultKt.b(obj);
                    InterfaceC16549B interfaceC16549B = this.f115542b._rewardDetailStateFlow;
                    AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge = this.f115543c;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, 0, null, false, null, chokingHazardChallenge.a(), 31, null)));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public e() {
        }

        private final void a(uk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                if (entryChange instanceof c.Failure) {
                    qw.a.INSTANCE.f(((c.Failure) entryChange).getError(), "Resource.Failure<EntryChange>", new Object[0]);
                    y.this.Q(D.f115268b, C17284b.f163293P0);
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
                    y.this.Q(D.f115267a, C17284b.f163319f);
                    return;
                case 3:
                    y.this.Q(D.f115268b, C17284b.f163279I0);
                    return;
                case 4:
                    y.this.Q(D.f115268b, C17284b.f163281J0);
                    return;
                case 6:
                case 7:
                    return;
            }
        }

        private final void b(uk.c<EntryChange> entryChange) {
            if (entryChange instanceof c.Success) {
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f131924f) {
                    y.this.Q(D.f115267a, C17284b.f163288N);
                    EntryChange entryChange3 = (EntryChange) success.a();
                    if (entryChange3 != null) {
                        y.this.P(entryChange3, false);
                        return;
                    }
                    return;
                }
            }
            y.this.Q(D.f115268b, C17284b.f163293P0);
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
            C15809k.d(d0.a(y.this), null, null, new C1824e(y.this, listM1, null), 3, null);
        }

        private final void d(uk.c<EntryChange> entryChange) {
            if (!(entryChange instanceof c.Success)) {
                y.this.Q(D.f115268b, C17284b.f163293P0);
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
                    y.this.Q(D.f115267a, C17284b.f163357y);
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
                    y.this.Q(D.f115268b, C17284b.f163279I0);
                    return;
                case 4:
                    y.this.Q(D.f115268b, C17284b.f163281J0);
                    return;
                case 6:
                case 7:
                    return;
            }
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getDisposables() {
            return y.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            ShoppingCart shoppingCartA;
            if (y.this.userManager.b()) {
                y.this.cart = cartResource != null ? cartResource.a() : null;
                if (cartResource instanceof c.Failure) {
                    Throwable error = ((c.Failure) cartResource).getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException != null && httpException.code() == 503) {
                        C15809k.d(d0.a(y.this), null, null, new b(y.this, null), 3, null);
                    }
                }
                if (cartResource == null || (shoppingCartA = cartResource.a()) == null) {
                    return;
                }
                c(shoppingCartA.p());
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                y.this.O();
                C15809k.d(d0.a(y.this), null, null, new c(y.this, null), 3, null);
            } else {
                C15809k.d(d0.a(y.this), null, null, new d(y.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17454a.Add) {
                a(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17454a.Update) {
                d(entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                b(entryChange);
            } else {
                if (!(processedRequest instanceof AbstractC17454a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y.this.O();
            }
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17720a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17720a abstractC17720aF = challenge.f();
            Intrinsics.h(abstractC17720aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C15809k.d(d0.a(y.this), null, null, new f(y.this, (AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$getProductDetails$1", f = "RewardsDetailsViewModel.kt", l = {172}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115544a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RewardDetail f115546c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new f(this.f115546c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RewardDetail rewardDetail, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f115546c = rewardDetail;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f115544a;
            if (i10 == 0) {
                ResultKt.b(obj);
                y.this.loadingStatesManager.b(new a.Loading(null, null, 3, null));
                y.this.rewardDetailItem = this.f115546c;
                C14046b c14046b = y.this.productQueryPagingDataSource;
                l.Reward reward = new l.Reward(String.valueOf(this.f115546c.getRewardId()), this.f115546c.getName().toString(), 0, 0, null, null, null, 0, null, false, null, 2044, null);
                this.f115544a = 1;
                objA = c14046b.a(reward, this);
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
                InterfaceC16549B interfaceC16549B = yVar._rewardDetailStateFlow;
                do {
                    value2 = interfaceC16549B.getValue();
                    rewardsDetailsViewState = (RewardsDetailsViewState) value2;
                    List<ProductFullDetails> listB1 = CollectionsKt.b1(reward2.f(), 5);
                    arrayList = new ArrayList(CollectionsKt.x(listB1, 10));
                    for (ProductFullDetails productFullDetails : listB1) {
                        arrayList.add(CouponsProductDecorator.INSTANCE.a(productFullDetails, yVar.E(productFullDetails.getCode()), new ProductEligibility(productFullDetails, yVar.storeManager.a(), yVar.cart).k()));
                    }
                } while (!interfaceC16549B.e(value2, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 51, null)));
            }
            y yVar2 = y.this;
            if (lVar.getError() != null) {
                l.Reward reward3 = (l.Reward) lVar;
                InterfaceC16549B interfaceC16549B2 = yVar2._rewardDetailStateFlow;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, 0, null, true, reward3.getError() instanceof NoProductAvailableException ? AbstractC6392a.INSTANCE.d(Cj.o.f5073l0, new Object[0]) : AbstractC6392a.INSTANCE.d(Cj.o.f5040R0, new Object[0]), null, 39, null)));
                if (reward3.getError() instanceof NoProductAvailableException) {
                    strValueOf = "Sorry! These items are not available at this time.";
                } else {
                    Throwable error = reward3.getError();
                    strValueOf = String.valueOf(error != null ? error.getMessage() : null);
                }
                yVar2.M(strValueOf);
            }
            y.this.loadingStatesManager.b(new a.NotLoading(null, 1, null));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$observeCartCount$1", f = "RewardsDetailsViewModel.kt", l = {147}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115547a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f115549a;

            a(y yVar) {
                this.f115549a = yVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f115549a._rewardDetailStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                    Intrinsics.g(num);
                } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b((RewardsDetailsViewState) value, false, num.intValue(), null, false, null, null, 61, null)));
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115547a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fB = tv.h.b(y.this.cartRepository.Q());
                a aVar = new a(y.this);
                this.f115547a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$observeCartInteractor$1", f = "RewardsDetailsViewModel.kt", l = {136}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115550a;

        /* renamed from: b, reason: collision with root package name */
        Object f115551b;

        /* renamed from: c, reason: collision with root package name */
        Object f115552c;

        /* renamed from: d, reason: collision with root package name */
        Object f115553d;

        /* renamed from: e, reason: collision with root package name */
        int f115554e;

        /* renamed from: f, reason: collision with root package name */
        int f115555f;

        /* renamed from: g, reason: collision with root package name */
        int f115556g;

        /* renamed from: h, reason: collision with root package name */
        int f115557h;

        /* renamed from: i, reason: collision with root package name */
        int f115558i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f115559j;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = y.this.new h(continuation);
            hVar.f115559j = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115558i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f115559j;
                    y yVar = y.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = yVar.cartInteractor;
                    this.f115559j = interfaceC15783O;
                    this.f115550a = interfaceC15783O;
                    this.f115551b = this;
                    this.f115552c = this;
                    this.f115553d = interfaceC15783O;
                    this.f115554e = 0;
                    this.f115555f = 0;
                    this.f115556g = 0;
                    this.f115557h = 0;
                    this.f115558i = 1;
                    if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.l(thE, "fetchLatestCart failed in CouponDetailViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$onStepperChange$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115561a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            RewardsDetailsViewState rewardsDetailsViewState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f115561a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = y.this._rewardDetailStateFlow;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$resetQuantitySteppers$1", f = "RewardsDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115563a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            RewardsDetailsViewState rewardsDetailsViewState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f115563a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = y.this._rewardDetailStateFlow;
            y yVar = y.this;
            do {
                value = interfaceC16549B.getValue();
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
            } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b(rewardsDetailsViewState, false, 0, arrayList, false, null, null, 59, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsViewModel$updateState$1", f = "RewardsDetailsViewModel.kt", l = {527, 531}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f115566b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f115567c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f115568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(D d10, y yVar, int i10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f115566b = d10;
            this.f115567c = yVar;
            this.f115568d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f115566b, this.f115567c, this.f115568d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f115565a
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
                com.meijer.mobile.mperks.ux.rewardDetail.D r6 = r5.f115566b
                com.meijer.mobile.mperks.ux.rewardDetail.D r1 = com.meijer.mobile.mperks.ux.rewardDetail.D.f115267a
                if (r6 != r1) goto L3f
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f115567c
                pv.A r6 = com.meijer.mobile.mperks.ux.rewardDetail.y.y(r6)
                com.meijer.mobile.mperks.ux.rewardDetail.y$d$c r1 = new com.meijer.mobile.mperks.ux.rewardDetail.y$d$c
                int r2 = r5.f115568d
                int r4 = tr.C17284b.f163301T0
                r1.<init>(r2, r4)
                r5.f115565a = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L5a
                goto L54
            L3f:
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f115567c
                pv.A r6 = com.meijer.mobile.mperks.ux.rewardDetail.y.y(r6)
                com.meijer.mobile.mperks.ux.rewardDetail.y$d$b r1 = new com.meijer.mobile.mperks.ux.rewardDetail.y$d$b
                int r3 = r5.f115568d
                r1.<init>(r3)
                r5.f115565a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                com.meijer.mobile.mperks.ux.rewardDetail.y r6 = r5.f115567c
                r6.O()
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.rewardDetail.y.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y(yo.k userManager, il.m cartRepository, wr.f cartInteractor, yo.f storeManager, C14046b productQueryPagingDataSource, InterfaceC14523a analyticsEngine) {
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
        Pj.c cVar = new Pj.c();
        this.loadingStatesManager = cVar;
        this._rewardDetailStateFlow = S.a(new RewardsDetailsViewState(false, 0, null, false, null, null, 63, null));
        InterfaceC16548A<d> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        this.disposables = new Ju.a();
        this.lastKnownCartQuantities = new LinkedHashMap();
        if (userManager.b()) {
            wr.f.r(cartInteractor, false, new e(), 1, null);
        }
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new a(this)), new b(null)), d0.a(this));
    }

    private final void I() {
        if (this.userManager.b()) {
            C15809k.d(d0.a(this), null, null, new g(null), 3, null);
        }
    }

    private final void J() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new e(), 1, null);
            this.cartInteractor.p();
            C15809k.d(d0.a(this), null, null, new h(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(final String errorMessage) {
        this.analyticsEngine.b(C14756c.h("mPerks Rewards: Product carousel failed to load"), new Function1() { // from class: com.meijer.mobile.mperks.ux.rewardDetail.x
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
        return Unit.f143329a;
    }

    private final void onLoadingStates(List<? extends Pj.a> loadingStates) {
        RewardsDetailsViewState value;
        List<? extends Pj.a> list = loadingStates;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Pj.a) it.next()) instanceof a.Loading) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean z11 = z10;
        InterfaceC16549B<RewardsDetailsViewState> interfaceC16549B = this._rewardDetailStateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, RewardsDetailsViewState.b(value, z11, 0, null, false, null, null, 62, null)));
    }

    public final double E(String code) {
        Intrinsics.j(code, "code");
        Double d10 = this.lastKnownCartQuantities.get(code);
        if (d10 != null) {
            return d10.doubleValue();
        }
        return 0.0d;
    }

    public final InterfaceC16553F<d> F() {
        return this.eventFlow;
    }

    public final P<RewardsDetailsViewState> H() {
        return C16563h.c(this._rewardDetailStateFlow);
    }

    public final void K(AbstractC12803a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12803a.GetProductsDetail) {
            AbstractC12803a.GetProductsDetail getProductsDetail = (AbstractC12803a.GetProductsDetail) action;
            getProductsDetail.getRewardDetail().getRewardId();
            G(getProductsDetail.getRewardDetail());
        } else {
            if (!(action instanceof AbstractC12803a.StepperChange)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC12803a.StepperChange stepperChange = (AbstractC12803a.StepperChange) action;
            L(stepperChange.getProduct(), stepperChange.getQuantityToUpdate());
        }
    }

    public final void P(EntryChange entryChange, boolean cartAddition) {
        Intrinsics.j(entryChange, "entryChange");
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        ShoppingCart shoppingCart = this.cart;
        String code = shoppingCart != null ? shoppingCart.getCode() : null;
        StringBuilder sb2 = new StringBuilder();
        RewardDetail rewardDetail = this.rewardDetailItem;
        if (rewardDetail == null) {
            Intrinsics.x("rewardDetailItem");
            rewardDetail = null;
        }
        sb2.append(rewardDetail.getRewardId());
        sb2.append(": ");
        RewardDetail rewardDetail2 = this.rewardDetailItem;
        if (rewardDetail2 == null) {
            Intrinsics.x("rewardDetailItem");
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
            if (Intrinsics.e(code2, entry != null ? entry.g2() : null)) {
                break;
            } else {
                i10++;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        interfaceC14523a.k(c2898u.p0(cartAddition, entryChange, code, string, strValueOf, numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null, "mPerks:Reward Details Page", "mPerks: Earn", "lowStock"));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        I();
        J();
    }

    private final void G(RewardDetail rewardDetail) {
        C15809k.d(d0.a(this), null, null, new f(rewardDetail, null), 3, null);
    }

    private final void L(ProductFullDetails product, double quantityToUpdate) {
        C15809k.d(d0.a(this), null, null, new i(null), 3, null);
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object n(y yVar, List list, Continuation continuation) {
        yVar.onLoadingStates(list);
        return Unit.f143329a;
    }

    public final void O() {
        C15809k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    public final void Q(D snackbarType, int messageResId) {
        C15809k.d(d0.a(this), null, null, new k(snackbarType, this, messageResId, null), 3, null);
    }
}

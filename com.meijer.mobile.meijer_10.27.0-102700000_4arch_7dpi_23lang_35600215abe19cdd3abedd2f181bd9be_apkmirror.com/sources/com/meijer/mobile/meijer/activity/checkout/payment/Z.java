package com.meijer.mobile.meijer.activity.checkout.payment;

import Fm.EbtBalance;
import Hk.Validation;
import Il.C3755c;
import Tq.PointOfService;
import ak.AbstractC5607a;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import ci.CustomerAddress;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.checkout.payment.PaymentOptionDecorator;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkDeliveryAddress;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkRequest;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import ej.DeliveryMode;
import ej.ShoppingCart;
import gi.InterfaceC14261a;
import gk.CardHolderName;
import gk.EbtPaymentOption;
import gk.MultiTenderPaymentOption;
import gk.PaymentOption;
import hi.C14476c;
import hi.TrackingData;
import hv.C14574b;
import j$.time.LocalDate;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jl.CheckoutFlowState;
import jl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import th.PaymentOptions;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;
import uh.AccountCreditCard;
import uw.a;
import vk.C17590a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0087\u0001\u0082\u0001|yB]\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J)\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u001c2\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J#\u0010C\u001a\u00020\u001c2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00010#2\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001cH\u0002¢\u0006\u0004\bG\u00106J\u0017\u0010I\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020,H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001cH\u0002¢\u0006\u0004\bK\u00106J\u000f\u0010L\u001a\u00020\u001cH\u0002¢\u0006\u0004\bL\u00106J\u0019\u0010N\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u001c2\u0006\u0010P\u001a\u000207H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001c2\u0006\u0010P\u001a\u000207H\u0002¢\u0006\u0004\bS\u0010RJ\u0017\u0010U\u001a\u00020\u001c2\u0006\u0010T\u001a\u000207H\u0002¢\u0006\u0004\bU\u0010RJ\u0017\u0010X\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020,H\u0002¢\u0006\u0004\bZ\u0010JJ\u000f\u0010[\u001a\u00020\u001cH\u0002¢\u0006\u0004\b[\u00106J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u00106J\u001d\u0010_\u001a\u000207*\u00020]2\b\u0010^\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0004\b_\u0010`J\u001d\u0010a\u001a\u000207*\u00020]2\b\u0010^\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0004\ba\u0010`J\u0017\u0010d\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u0015\u0010h\u001a\u00020\u001c2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u001cH\u0014¢\u0006\u0004\bj\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u0002070{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R*\u0010\u0086\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010}R$\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010\u0089\u00018\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0099\u0001\u001a\u00020#8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u0002070\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u008d\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lth/f;", "paymentOptionsRepository", "Lth/k;", "paymentsRepository", "Ljl/t;", "checkoutRepository", "Lyl/k;", "featureManager", "Ljl/d;", "checkoutFlowRepository", "Lgi/a;", "analyticsEngine", "Lhl/m;", "cartRepository", "Lyo/k;", "userManager", "Landroid/content/SharedPreferences;", "sharedPreferences", "LXi/a;", "userTokenProvider", "<init>", "(Lth/f;Lth/k;Ljl/t;Lyl/k;Ljl/d;Lgi/a;Lhl/m;Lyo/k;Landroid/content/SharedPreferences;LXi/a;)V", "Ljl/v;", "checkoutState", "", "f0", "(Ljl/v;)V", "Ljl/f;", "checkoutFlowState", "e0", "(Ljl/f;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "bearerToken", "y0", "(Ljava/lang/String;Lcom/meijer/mobile/authentication/core/model/BearerToken;)V", "", "LHk/b;", "Lgk/f;", "paymentOptionList", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "Y", "(Ljava/util/List;)Ljava/util/List;", "ebtToken", "cardExpiration", "s0", "(Ljava/lang/String;Ljava/lang/String;)V", "i0", "()V", "", "z0", "()Z", "Lak/a;", "cardMask", "balance", "T", "(Lak/a;Lak/a;)V", "LFm/a;", "ebtBalance", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "n0", "(LFm/a;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;)V", "S", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "U", "paymentOption", "l0", "(Lgk/f;)V", "h0", "q0", "errorMessage", "t0", "(Ljava/lang/String;)V", "isLoading", "p0", "(Z)V", "m0", "isProcessing", "o0", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "g0", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "r0", "v0", "j0", "j$/time/LocalDate", "other", "a0", "(Lj$/time/LocalDate;Lj$/time/LocalDate;)Z", "b0", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "action", "d0", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;)V", "onCleared", "a", "Lth/f;", "b", "Lth/k;", "c", "Ljl/t;", "d", "Lyl/k;", "e", "Lgi/a;", "f", "Lyo/k;", "g", "Landroid/content/SharedPreferences;", "h", "LXi/a;", "Ltv/B;", "i", "Ltv/B;", "_isValid", "LLk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "j", "LLk/b;", "W", "()LLk/b;", "flow", "k", "_viewState", "Ltv/P;", "l", "Ltv/P;", "Z", "()Ltv/P;", "viewState", "LNu/a;", "m", "LNu/a;", "disposables", "", "V", "()I", "checkEBTBalanceCounter", "X", "()Ljava/lang/String;", "mostRecentCheckBalanceDate", "c0", "isValid", "n", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Z extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: o, reason: collision with root package name */
    public static final int f103713o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final th.f paymentOptionsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final th.k paymentsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jl.t checkoutRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenProvider;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _isValid;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lk.b<PaymentOptionsViewState, j> flow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<PaymentOptionsViewState> _viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final tv.P<PaymentOptionsViewState> viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<PaymentOptionsViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, Lk.b.class, "update", "update(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOptionsViewState paymentOptionsViewState, Continuation<? super Unit> continuation) {
            return Z.C((Lk.b) this.f142801a, paymentOptionsViewState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$2", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super PaymentOptionsViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103727a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f103728b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super PaymentOptionsViewState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f103728b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103727a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f103728b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$3", f = "CheckoutPaymentOptionsViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103729a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lth/a;", "paymentOptions", "", "<anonymous>", "(Lth/a;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$3$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<PaymentOptions, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103731a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f103732b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Z f103733c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103733c = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f103733c, continuation);
                aVar.f103732b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                IntrinsicsKt.f();
                if (this.f103731a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                PaymentOptions paymentOptions = (PaymentOptions) this.f103732b;
                if (!((PaymentOptionsViewState) this.f103733c._viewState.getValue()).getPaymentOptions().getCompletePayment()) {
                    InterfaceC17140B interfaceC17140B = this.f103733c._viewState;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b((PaymentOptionsViewState) value, paymentOptions.l(), null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388598, null)));
                    InterfaceC17140B interfaceC17140B2 = this.f103733c._viewState;
                    Z z10 = this.f103733c;
                    do {
                        value2 = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value2, PaymentOptionsViewState.b((PaymentOptionsViewState) value2, null, z10.Y(paymentOptions.h()), null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388605, null)));
                }
                String savedPaymentOptionsError = paymentOptions.getSavedPaymentOptionsError();
                if (savedPaymentOptionsError != null && savedPaymentOptionsError.length() > 0) {
                    this.f103733c.W().a(new j.ShowPaymentErrorDialog(com.meijer.mobile.meijer.Y.f99466Ab, com.meijer.mobile.meijer.Y.f100459zb, com.meijer.mobile.meijer.Y.f100439yb));
                }
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PaymentOptions paymentOptions, Continuation<? super Unit> continuation) {
                return ((a) create(paymentOptions, continuation)).invokeSuspend(Unit.f142422a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103729a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                tv.P<PaymentOptions> pK = Z.this.paymentOptionsRepository.k();
                a aVar = new a(Z.this, null);
                this.f103729a = 1;
                if (C17154h.k(pK, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        d(Object obj) {
            super(1, obj, Z.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((Z) this.receiver).e0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState checkoutFlowState) {
            a(checkoutFlowState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        e(Object obj) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        f(Object obj) {
            super(1, obj, Z.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((Z) this.receiver).f0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        g(Object obj) {
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

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "<init>", "()V", "s", "o", "n", "l", "k", "g", "q", "h", "f", "e", "d", "c", "t", "m", "r", "i", "p", "b", "a", "v", "u", "j", "w", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$d;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$e;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$f;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$g;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$i;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$j;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$k;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$l;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$m;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$n;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$o;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$p;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$q;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$r;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$s;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$t;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$u;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$v;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$w;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class i {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103734a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -2116380888;
            }

            public String toString() {
                return "AddNewCardClicked";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "changeCardClicked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$b, reason: from toString */
        public static final /* data */ class ChangeCard extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean changeCardClicked;

            public ChangeCard(boolean z10) {
                super(null);
                this.changeCardClicked = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeCard) && this.changeCardClicked == ((ChangeCard) other).changeCardClicked;
            }

            public int hashCode() {
                return Boolean.hashCode(this.changeCardClicked);
            }

            public String toString() {
                return "ChangeCard(changeCardClicked=" + this.changeCardClicked + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getChangeCardClicked() {
                return this.changeCardClicked;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final c f103736a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -946383550;
            }

            public String toString() {
                return "CloseBottomSheetAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$d;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final d f103737a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1343998014;
            }

            public String toString() {
                return "CloseEBTLoadingIndicator";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$e;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final e f103738a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1440253243;
            }

            public String toString() {
                return "CloseLoadingIndicator";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$f;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final f f103739a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -342073160;
            }

            public String toString() {
                return "DisplayEBTLoadingIndicator";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$g;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "cardMask", "LFm/a;", "balance", "", "isSinglePageCheckout", "<init>", "(Ljava/lang/String;LFm/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LFm/a;", "()LFm/a;", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$g, reason: from toString */
        public static final /* data */ class DisplayEbtBalanceAction extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String cardMask;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EbtBalance balance;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSinglePageCheckout;

            public /* synthetic */ DisplayEbtBalanceAction(String str, EbtBalance ebtBalance, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, ebtBalance, (i10 & 4) != 0 ? false : z10);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayEbtBalanceAction)) {
                    return false;
                }
                DisplayEbtBalanceAction displayEbtBalanceAction = (DisplayEbtBalanceAction) other;
                return Intrinsics.e(this.cardMask, displayEbtBalanceAction.cardMask) && Intrinsics.e(this.balance, displayEbtBalanceAction.balance) && this.isSinglePageCheckout == displayEbtBalanceAction.isSinglePageCheckout;
            }

            public int hashCode() {
                return (((this.cardMask.hashCode() * 31) + this.balance.hashCode()) * 31) + Boolean.hashCode(this.isSinglePageCheckout);
            }

            public String toString() {
                return "DisplayEbtBalanceAction(cardMask=" + this.cardMask + ", balance=" + this.balance + ", isSinglePageCheckout=" + this.isSinglePageCheckout + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayEbtBalanceAction(String cardMask, EbtBalance balance, boolean z10) {
                super(null);
                Intrinsics.j(cardMask, "cardMask");
                Intrinsics.j(balance, "balance");
                this.cardMask = cardMask;
                this.balance = balance;
                this.isSinglePageCheckout = z10;
            }

            /* renamed from: a, reason: from getter */
            public final EbtBalance getBalance() {
                return this.balance;
            }

            /* renamed from: b, reason: from getter */
            public final String getCardMask() {
                return this.cardMask;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsSinglePageCheckout() {
                return this.isSinglePageCheckout;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final h f103743a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -506728443;
            }

            public String toString() {
                return "DisplayLoadingIndicator";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$i;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "errorCode", "errorMessage", "insufficientBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$i, reason: collision with other inner class name and from toString */
        public static final /* data */ class EBTErrorResponseHandler extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorMessage;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String insufficientBalance;

            public EBTErrorResponseHandler(String str, String str2, String str3) {
                super(null);
                this.errorCode = str;
                this.errorMessage = str2;
                this.insufficientBalance = str3;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EBTErrorResponseHandler)) {
                    return false;
                }
                EBTErrorResponseHandler eBTErrorResponseHandler = (EBTErrorResponseHandler) other;
                return Intrinsics.e(this.errorCode, eBTErrorResponseHandler.errorCode) && Intrinsics.e(this.errorMessage, eBTErrorResponseHandler.errorMessage) && Intrinsics.e(this.insufficientBalance, eBTErrorResponseHandler.insufficientBalance);
            }

            public int hashCode() {
                String str = this.errorCode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.errorMessage;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.insufficientBalance;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "EBTErrorResponseHandler(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", insufficientBalance=" + this.insufficientBalance + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getErrorCode() {
                return this.errorCode;
            }

            /* renamed from: b, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: c, reason: from getter */
            public final String getInsufficientBalance() {
                return this.insufficientBalance;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$j;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final j f103747a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -1074459531;
            }

            public String toString() {
                return "HidePinPadView";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$k;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final k f103748a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return -2034994783;
            }

            public String toString() {
                return "PreAuthCardAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$l;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final l f103749a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 1538891983;
            }

            public String toString() {
                return "ReFetchPaymentOptions";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$m;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final m f103750a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return 1974813939;
            }

            public String toString() {
                return "RemoveEBTCard";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$n;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final n f103751a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public int hashCode() {
                return 821843112;
            }

            public String toString() {
                return "SendFailureAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$o;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "Lgk/f;", "paymentOption", "<init>", "(Lgk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgk/f;", "()Lgk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$o, reason: from toString */
        public static final /* data */ class SetCardCVVAction extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentOption paymentOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetCardCVVAction) && Intrinsics.e(this.paymentOption, ((SetCardCVVAction) other).paymentOption);
            }

            public int hashCode() {
                return this.paymentOption.hashCode();
            }

            public String toString() {
                return "SetCardCVVAction(paymentOption=" + this.paymentOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetCardCVVAction(PaymentOption paymentOption) {
                super(null);
                Intrinsics.j(paymentOption, "paymentOption");
                this.paymentOption = paymentOption;
            }

            /* renamed from: a, reason: from getter */
            public final PaymentOption getPaymentOption() {
                return this.paymentOption;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$p;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$p, reason: from toString */
        public static final /* data */ class SetEBTCardInputError extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String error;

            public SetEBTCardInputError(String str) {
                super(null);
                this.error = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEBTCardInputError) && Intrinsics.e(this.error, ((SetEBTCardInputError) other).error);
            }

            public int hashCode() {
                String str = this.error;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetEBTCardInputError(error=" + this.error + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$q;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "LFm/a;", "ebtBalance", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "<init>", "(LFm/a;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFm/a;", "()LFm/a;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$q, reason: from toString */
        public static final /* data */ class SetEbtPaymentOption extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final EbtBalance ebtBalance;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EbtPanResponse ebtPanResponse;

            public SetEbtPaymentOption(EbtBalance ebtBalance, EbtPanResponse ebtPanResponse) {
                super(null);
                this.ebtBalance = ebtBalance;
                this.ebtPanResponse = ebtPanResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetEbtPaymentOption)) {
                    return false;
                }
                SetEbtPaymentOption setEbtPaymentOption = (SetEbtPaymentOption) other;
                return Intrinsics.e(this.ebtBalance, setEbtPaymentOption.ebtBalance) && Intrinsics.e(this.ebtPanResponse, setEbtPaymentOption.ebtPanResponse);
            }

            public int hashCode() {
                EbtBalance ebtBalance = this.ebtBalance;
                int iHashCode = (ebtBalance == null ? 0 : ebtBalance.hashCode()) * 31;
                EbtPanResponse ebtPanResponse = this.ebtPanResponse;
                return iHashCode + (ebtPanResponse != null ? ebtPanResponse.hashCode() : 0);
            }

            public String toString() {
                return "SetEbtPaymentOption(ebtBalance=" + this.ebtBalance + ", ebtPanResponse=" + this.ebtPanResponse + ')';
            }

            /* renamed from: a, reason: from getter */
            public final EbtBalance getEbtBalance() {
                return this.ebtBalance;
            }

            /* renamed from: b, reason: from getter */
            public final EbtPanResponse getEbtPanResponse() {
                return this.ebtPanResponse;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$r;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "isProcessing", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$r, reason: from toString */
        public static final /* data */ class SetIsProcessingEbtPanResponse extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isProcessing;

            public SetIsProcessingEbtPanResponse(boolean z10) {
                super(null);
                this.isProcessing = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetIsProcessingEbtPanResponse) && this.isProcessing == ((SetIsProcessingEbtPanResponse) other).isProcessing;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isProcessing);
            }

            public String toString() {
                return "SetIsProcessingEbtPanResponse(isProcessing=" + this.isProcessing + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsProcessing() {
                return this.isProcessing;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$s;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "Lgk/f;", "paymentOption", "<init>", "(Lgk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgk/f;", "()Lgk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$s, reason: from toString */
        public static final /* data */ class SetPaymentMethodAction extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentOption paymentOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPaymentMethodAction) && Intrinsics.e(this.paymentOption, ((SetPaymentMethodAction) other).paymentOption);
            }

            public int hashCode() {
                return this.paymentOption.hashCode();
            }

            public String toString() {
                return "SetPaymentMethodAction(paymentOption=" + this.paymentOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPaymentMethodAction(PaymentOption paymentOption) {
                super(null);
                Intrinsics.j(paymentOption, "paymentOption");
                this.paymentOption = paymentOption;
            }

            /* renamed from: a, reason: from getter */
            public final PaymentOption getPaymentOption() {
                return this.paymentOption;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$t;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "ebtToken", "cardExpiration", "", "isRetry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$t, reason: from toString */
        public static final /* data */ class ShowEbtPinPad extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ebtToken;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String cardExpiration;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRetry;

            public ShowEbtPinPad(String str, String str2, boolean z10) {
                super(null);
                this.ebtToken = str;
                this.cardExpiration = str2;
                this.isRetry = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowEbtPinPad)) {
                    return false;
                }
                ShowEbtPinPad showEbtPinPad = (ShowEbtPinPad) other;
                return Intrinsics.e(this.ebtToken, showEbtPinPad.ebtToken) && Intrinsics.e(this.cardExpiration, showEbtPinPad.cardExpiration) && this.isRetry == showEbtPinPad.isRetry;
            }

            public int hashCode() {
                String str = this.ebtToken;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.cardExpiration;
                return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRetry);
            }

            public String toString() {
                return "ShowEbtPinPad(ebtToken=" + this.ebtToken + ", cardExpiration=" + this.cardExpiration + ", isRetry=" + this.isRetry + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getCardExpiration() {
                return this.cardExpiration;
            }

            /* renamed from: b, reason: from getter */
            public final String getEbtToken() {
                return this.ebtToken;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsRetry() {
                return this.isRetry;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$u;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "acculynkPostBody", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$u, reason: from toString */
        public static final /* data */ class UpdatePinPadBody extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String acculynkPostBody;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePinPadBody) && Intrinsics.e(this.acculynkPostBody, ((UpdatePinPadBody) other).acculynkPostBody);
            }

            public int hashCode() {
                return this.acculynkPostBody.hashCode();
            }

            public String toString() {
                return "UpdatePinPadBody(acculynkPostBody=" + this.acculynkPostBody + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePinPadBody(String acculynkPostBody) {
                super(null);
                Intrinsics.j(acculynkPostBody, "acculynkPostBody");
                this.acculynkPostBody = acculynkPostBody;
            }

            /* renamed from: a, reason: from getter */
            public final String getAcculynkPostBody() {
                return this.acculynkPostBody;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$v;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "selectedCardID", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$v, reason: from toString */
        public static final /* data */ class UpdateSelectCardID extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selectedCardID;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateSelectCardID) && Intrinsics.e(this.selectedCardID, ((UpdateSelectCardID) other).selectedCardID);
            }

            public int hashCode() {
                return this.selectedCardID.hashCode();
            }

            public String toString() {
                return "UpdateSelectCardID(selectedCardID=" + this.selectedCardID + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateSelectCardID(String selectedCardID) {
                super(null);
                Intrinsics.j(selectedCardID, "selectedCardID");
                this.selectedCardID = selectedCardID;
            }

            /* renamed from: a, reason: from getter */
            public final String getSelectedCardID() {
                return this.selectedCardID;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i$w;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$i;", "", "isWebPageLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$i$w, reason: from toString */
        public static final /* data */ class UpdateWebPageLoading extends i {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isWebPageLoading;

            public UpdateWebPageLoading(boolean z10) {
                super(null);
                this.isWebPageLoading = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateWebPageLoading) && this.isWebPageLoading == ((UpdateWebPageLoading) other).isWebPageLoading;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isWebPageLoading);
            }

            public String toString() {
                return "UpdateWebPageLoading(isWebPageLoading=" + this.isWebPageLoading + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsWebPageLoading() {
                return this.isWebPageLoading;
            }
        }

        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private i() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "", "<init>", "()V", "f", "a", "b", "j", "d", "e", "c", "i", "g", "h", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$d;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$e;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$f;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$g;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$i;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class j {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$a, reason: from toString */
        public static final /* data */ class CardErrorEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException retrofitException;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardErrorEvent) && Intrinsics.e(this.retrofitException, ((CardErrorEvent) other).retrofitException);
            }

            public int hashCode() {
                return this.retrofitException.hashCode();
            }

            public String toString() {
                return "CardErrorEvent(retrofitException=" + this.retrofitException + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardErrorEvent(RetrofitException retrofitException) {
                super(null);
                Intrinsics.j(retrofitException, "retrofitException");
                this.retrofitException = retrofitException;
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getRetrofitException() {
                return this.retrofitException;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "Lak/a;", "formattedString", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$b, reason: from toString */
        public static final /* data */ class CardFailEvent extends j {

            /* renamed from: b, reason: collision with root package name */
            public static final int f103765b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a formattedString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardFailEvent) && Intrinsics.e(this.formattedString, ((CardFailEvent) other).formattedString);
            }

            public int hashCode() {
                return this.formattedString.hashCode();
            }

            public String toString() {
                return "CardFailEvent(formattedString=" + this.formattedString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardFailEvent(AbstractC5607a formattedString) {
                super(null);
                Intrinsics.j(formattedString, "formattedString");
                this.formattedString = formattedString;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getFormattedString() {
                return this.formattedString;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$c;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final c f103767a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1833832600;
            }

            public String toString() {
                return "CloseBottomSheet";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$d;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final d f103768a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -700737079;
            }

            public String toString() {
                return "CompletePaymentEvent";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$e;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends j {
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$f;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "messageId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$f, reason: from toString */
        public static final /* data */ class PaymentCardRelatedFailedEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentCardRelatedFailedEvent) && this.messageId == ((PaymentCardRelatedFailedEvent) other).messageId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageId);
            }

            public String toString() {
                return "PaymentCardRelatedFailedEvent(messageId=" + this.messageId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageId() {
                return this.messageId;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$g;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "Lak/a;", "errorTitle", "errorMessage", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$g, reason: from toString */
        public static final /* data */ class ShowEBTCheckBalanceLimitReached extends j {

            /* renamed from: c, reason: collision with root package name */
            public static final int f103770c = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a errorTitle;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a errorMessage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowEBTCheckBalanceLimitReached)) {
                    return false;
                }
                ShowEBTCheckBalanceLimitReached showEBTCheckBalanceLimitReached = (ShowEBTCheckBalanceLimitReached) other;
                return Intrinsics.e(this.errorTitle, showEBTCheckBalanceLimitReached.errorTitle) && Intrinsics.e(this.errorMessage, showEBTCheckBalanceLimitReached.errorMessage);
            }

            public int hashCode() {
                return (this.errorTitle.hashCode() * 31) + this.errorMessage.hashCode();
            }

            public String toString() {
                return "ShowEBTCheckBalanceLimitReached(errorTitle=" + this.errorTitle + ", errorMessage=" + this.errorMessage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowEBTCheckBalanceLimitReached(AbstractC5607a errorTitle, AbstractC5607a errorMessage) {
                super(null);
                Intrinsics.j(errorTitle, "errorTitle");
                Intrinsics.j(errorMessage, "errorMessage");
                this.errorTitle = errorTitle;
                this.errorMessage = errorMessage;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getErrorTitle() {
                return this.errorTitle;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final h f103773a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1063105320;
            }

            public String toString() {
                return "ShowEbtErrorDialogEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$i;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "", "acculynkPostBody", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$i, reason: from toString */
        public static final /* data */ class ShowEbtPinPadEvent extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String acculynkPostBody;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowEbtPinPadEvent) && Intrinsics.e(this.acculynkPostBody, ((ShowEbtPinPadEvent) other).acculynkPostBody);
            }

            public int hashCode() {
                return this.acculynkPostBody.hashCode();
            }

            public String toString() {
                return "ShowEbtPinPadEvent(acculynkPostBody=" + this.acculynkPostBody + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowEbtPinPadEvent(String acculynkPostBody) {
                super(null);
                Intrinsics.j(acculynkPostBody, "acculynkPostBody");
                this.acculynkPostBody = acculynkPostBody;
            }

            /* renamed from: a, reason: from getter */
            public final String getAcculynkPostBody() {
                return this.acculynkPostBody;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j$j;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "", "title", "message", "buttonText", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$j$j, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowPaymentErrorDialog extends j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int buttonText;

            public ShowPaymentErrorDialog(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.buttonText = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowPaymentErrorDialog)) {
                    return false;
                }
                ShowPaymentErrorDialog showPaymentErrorDialog = (ShowPaymentErrorDialog) other;
                return this.title == showPaymentErrorDialog.title && this.message == showPaymentErrorDialog.message && this.buttonText == showPaymentErrorDialog.buttonText;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.buttonText);
            }

            public String toString() {
                return "ShowPaymentErrorDialog(title=" + this.title + ", message=" + this.message + ", buttonText=" + this.buttonText + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getButtonText() {
                return this.buttonText;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0094\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010G\u001a\u0004\bF\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bD\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bM\u0010R\u001a\u0004\b@\u0010SR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bX\u0010?R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\bT\u0010*R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bN\u0010?R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\bH\u0010?R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b<\u0010?R\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010G\u001a\u0004\bL\u0010*R\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010G\u001a\u0004\b8\u0010*R\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bX\u0010=\u001a\u0004\b\\\u0010?R\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\\\u0010=\u001a\u0004\b]\u0010?¨\u0006^"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "", "Lth/a;", "paymentOptions", "", "Lcom/meijer/mobile/meijer/activity/checkout/payment/q0;", "paymentOptionsDecorated", "Lgk/d;", "ebtPaymentOption", "", "isLoading", "isEBTFlowLoading", "Ljl/f;", "checkoutFlowState", "", "cartCode", "cartId", "Lak/a;", "ebtCardMask", "ebtBalance", "Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "mjrEbtPanData", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "addressDetails", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "bearerToken", "isProcessingEbtPanResponse", "Lcom/meijer/mobile/meijer/activity/checkout/payment/o0;", "ebtErrorDialogDecorator", "ebtCardInputError", "displayEbtFields", "changeCardClicked", "addNewCardClicked", "currentSelectCardID", "acculynkPostBody", "isShowPinPad", "isWebPageLoading", "<init>", "(Lth/a;Ljava/util/List;Lgk/d;ZZLjl/f;Ljava/lang/String;Ljava/lang/String;Lak/a;Lak/a;Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Lcom/meijer/mobile/authentication/core/model/BearerToken;ZLcom/meijer/mobile/meijer/activity/checkout/payment/o0;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZZ)V", "a", "(Lth/a;Ljava/util/List;Lgk/d;ZZLjl/f;Ljava/lang/String;Ljava/lang/String;Lak/a;Lak/a;Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Lcom/meijer/mobile/authentication/core/model/BearerToken;ZLcom/meijer/mobile/meijer/activity/checkout/payment/o0;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ZZ)Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lth/a;", "r", "()Lth/a;", "b", "Ljava/util/List;", "s", "()Ljava/util/List;", "c", "Lgk/d;", "p", "()Lgk/d;", "d", "Z", "u", "()Z", "e", "t", "f", "Ljl/f;", "i", "()Ljl/f;", "g", "Ljava/lang/String;", "h", "Lak/a;", "n", "()Lak/a;", "j", "l", "k", "Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "q", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "m", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "getBearerToken", "()Lcom/meijer/mobile/authentication/core/model/BearerToken;", "v", "o", "Lcom/meijer/mobile/meijer/activity/checkout/payment/o0;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/o0;", "w", "x", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.Z$k, reason: from toString */
    public static final /* data */ class PaymentOptionsViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentOptions paymentOptions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentOptionDecorator> paymentOptionsDecorated;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EbtPaymentOption ebtPaymentOption;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEBTFlowLoading;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckoutFlowState checkoutFlowState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartCode;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartId;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a ebtCardMask;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a ebtBalance;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final EbtPanData mjrEbtPanData;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final AcculynkDeliveryAddress addressDetails;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final BearerToken bearerToken;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessingEbtPanResponse;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final EBTErrorDialogDecorator ebtErrorDialogDecorator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtCardInputError;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displayEbtFields;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean changeCardClicked;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean addNewCardClicked;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currentSelectCardID;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String acculynkPostBody;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isShowPinPad;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWebPageLoading;

        public PaymentOptionsViewState() {
            this(null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388607, null);
        }

        public static /* synthetic */ PaymentOptionsViewState b(PaymentOptionsViewState paymentOptionsViewState, PaymentOptions paymentOptions, List list, EbtPaymentOption ebtPaymentOption, boolean z10, boolean z11, CheckoutFlowState checkoutFlowState, String str, String str2, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, EbtPanData ebtPanData, AcculynkDeliveryAddress acculynkDeliveryAddress, BearerToken bearerToken, boolean z12, EBTErrorDialogDecorator eBTErrorDialogDecorator, String str3, boolean z13, boolean z14, boolean z15, String str4, String str5, boolean z16, boolean z17, int i10, Object obj) {
            boolean z18;
            boolean z19;
            PaymentOptions paymentOptions2 = (i10 & 1) != 0 ? paymentOptionsViewState.paymentOptions : paymentOptions;
            List list2 = (i10 & 2) != 0 ? paymentOptionsViewState.paymentOptionsDecorated : list;
            EbtPaymentOption ebtPaymentOption2 = (i10 & 4) != 0 ? paymentOptionsViewState.ebtPaymentOption : ebtPaymentOption;
            boolean z20 = (i10 & 8) != 0 ? paymentOptionsViewState.isLoading : z10;
            boolean z21 = (i10 & 16) != 0 ? paymentOptionsViewState.isEBTFlowLoading : z11;
            CheckoutFlowState checkoutFlowState2 = (i10 & 32) != 0 ? paymentOptionsViewState.checkoutFlowState : checkoutFlowState;
            String str6 = (i10 & 64) != 0 ? paymentOptionsViewState.cartCode : str;
            String str7 = (i10 & 128) != 0 ? paymentOptionsViewState.cartId : str2;
            AbstractC5607a abstractC5607a3 = (i10 & 256) != 0 ? paymentOptionsViewState.ebtCardMask : abstractC5607a;
            AbstractC5607a abstractC5607a4 = (i10 & 512) != 0 ? paymentOptionsViewState.ebtBalance : abstractC5607a2;
            EbtPanData ebtPanData2 = (i10 & 1024) != 0 ? paymentOptionsViewState.mjrEbtPanData : ebtPanData;
            AcculynkDeliveryAddress acculynkDeliveryAddress2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? paymentOptionsViewState.addressDetails : acculynkDeliveryAddress;
            BearerToken bearerToken2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? paymentOptionsViewState.bearerToken : bearerToken;
            boolean z22 = (i10 & 8192) != 0 ? paymentOptionsViewState.isProcessingEbtPanResponse : z12;
            PaymentOptions paymentOptions3 = paymentOptions2;
            EBTErrorDialogDecorator eBTErrorDialogDecorator2 = (i10 & 16384) != 0 ? paymentOptionsViewState.ebtErrorDialogDecorator : eBTErrorDialogDecorator;
            String str8 = (i10 & 32768) != 0 ? paymentOptionsViewState.ebtCardInputError : str3;
            boolean z23 = (i10 & 65536) != 0 ? paymentOptionsViewState.displayEbtFields : z13;
            boolean z24 = (i10 & 131072) != 0 ? paymentOptionsViewState.changeCardClicked : z14;
            boolean z25 = (i10 & 262144) != 0 ? paymentOptionsViewState.addNewCardClicked : z15;
            String str9 = (i10 & 524288) != 0 ? paymentOptionsViewState.currentSelectCardID : str4;
            String str10 = (i10 & 1048576) != 0 ? paymentOptionsViewState.acculynkPostBody : str5;
            boolean z26 = (i10 & 2097152) != 0 ? paymentOptionsViewState.isShowPinPad : z16;
            if ((i10 & 4194304) != 0) {
                z19 = z26;
                z18 = paymentOptionsViewState.isWebPageLoading;
            } else {
                z18 = z17;
                z19 = z26;
            }
            return paymentOptionsViewState.a(paymentOptions3, list2, ebtPaymentOption2, z20, z21, checkoutFlowState2, str6, str7, abstractC5607a3, abstractC5607a4, ebtPanData2, acculynkDeliveryAddress2, bearerToken2, z22, eBTErrorDialogDecorator2, str8, z23, z24, z25, str9, str10, z19, z18);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentOptionsViewState)) {
                return false;
            }
            PaymentOptionsViewState paymentOptionsViewState = (PaymentOptionsViewState) other;
            return Intrinsics.e(this.paymentOptions, paymentOptionsViewState.paymentOptions) && Intrinsics.e(this.paymentOptionsDecorated, paymentOptionsViewState.paymentOptionsDecorated) && Intrinsics.e(this.ebtPaymentOption, paymentOptionsViewState.ebtPaymentOption) && this.isLoading == paymentOptionsViewState.isLoading && this.isEBTFlowLoading == paymentOptionsViewState.isEBTFlowLoading && Intrinsics.e(this.checkoutFlowState, paymentOptionsViewState.checkoutFlowState) && Intrinsics.e(this.cartCode, paymentOptionsViewState.cartCode) && Intrinsics.e(this.cartId, paymentOptionsViewState.cartId) && Intrinsics.e(this.ebtCardMask, paymentOptionsViewState.ebtCardMask) && Intrinsics.e(this.ebtBalance, paymentOptionsViewState.ebtBalance) && Intrinsics.e(this.mjrEbtPanData, paymentOptionsViewState.mjrEbtPanData) && Intrinsics.e(this.addressDetails, paymentOptionsViewState.addressDetails) && Intrinsics.e(this.bearerToken, paymentOptionsViewState.bearerToken) && this.isProcessingEbtPanResponse == paymentOptionsViewState.isProcessingEbtPanResponse && Intrinsics.e(this.ebtErrorDialogDecorator, paymentOptionsViewState.ebtErrorDialogDecorator) && Intrinsics.e(this.ebtCardInputError, paymentOptionsViewState.ebtCardInputError) && this.displayEbtFields == paymentOptionsViewState.displayEbtFields && this.changeCardClicked == paymentOptionsViewState.changeCardClicked && this.addNewCardClicked == paymentOptionsViewState.addNewCardClicked && Intrinsics.e(this.currentSelectCardID, paymentOptionsViewState.currentSelectCardID) && Intrinsics.e(this.acculynkPostBody, paymentOptionsViewState.acculynkPostBody) && this.isShowPinPad == paymentOptionsViewState.isShowPinPad && this.isWebPageLoading == paymentOptionsViewState.isWebPageLoading;
        }

        public int hashCode() {
            int iHashCode = ((this.paymentOptions.hashCode() * 31) + this.paymentOptionsDecorated.hashCode()) * 31;
            EbtPaymentOption ebtPaymentOption = this.ebtPaymentOption;
            int iHashCode2 = (((((iHashCode + (ebtPaymentOption == null ? 0 : ebtPaymentOption.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isEBTFlowLoading)) * 31;
            CheckoutFlowState checkoutFlowState = this.checkoutFlowState;
            int iHashCode3 = (iHashCode2 + (checkoutFlowState == null ? 0 : checkoutFlowState.hashCode())) * 31;
            String str = this.cartCode;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cartId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AbstractC5607a abstractC5607a = this.ebtCardMask;
            int iHashCode6 = (iHashCode5 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.ebtBalance;
            int iHashCode7 = (iHashCode6 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            EbtPanData ebtPanData = this.mjrEbtPanData;
            int iHashCode8 = (iHashCode7 + (ebtPanData == null ? 0 : ebtPanData.hashCode())) * 31;
            AcculynkDeliveryAddress acculynkDeliveryAddress = this.addressDetails;
            int iHashCode9 = (iHashCode8 + (acculynkDeliveryAddress == null ? 0 : acculynkDeliveryAddress.hashCode())) * 31;
            BearerToken bearerToken = this.bearerToken;
            int iHashCode10 = (((((iHashCode9 + (bearerToken == null ? 0 : bearerToken.hashCode())) * 31) + Boolean.hashCode(this.isProcessingEbtPanResponse)) * 31) + this.ebtErrorDialogDecorator.hashCode()) * 31;
            String str3 = this.ebtCardInputError;
            int iHashCode11 = (((((((iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.displayEbtFields)) * 31) + Boolean.hashCode(this.changeCardClicked)) * 31) + Boolean.hashCode(this.addNewCardClicked)) * 31;
            String str4 = this.currentSelectCardID;
            int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acculynkPostBody;
            return ((((iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isShowPinPad)) * 31) + Boolean.hashCode(this.isWebPageLoading);
        }

        public String toString() {
            return "PaymentOptionsViewState(paymentOptions=" + this.paymentOptions + ", paymentOptionsDecorated=" + this.paymentOptionsDecorated + ", ebtPaymentOption=" + this.ebtPaymentOption + ", isLoading=" + this.isLoading + ", isEBTFlowLoading=" + this.isEBTFlowLoading + ", checkoutFlowState=" + this.checkoutFlowState + ", cartCode=" + this.cartCode + ", cartId=" + this.cartId + ", ebtCardMask=" + this.ebtCardMask + ", ebtBalance=" + this.ebtBalance + ", mjrEbtPanData=" + this.mjrEbtPanData + ", addressDetails=" + this.addressDetails + ", bearerToken=" + this.bearerToken + ", isProcessingEbtPanResponse=" + this.isProcessingEbtPanResponse + ", ebtErrorDialogDecorator=" + this.ebtErrorDialogDecorator + ", ebtCardInputError=" + this.ebtCardInputError + ", displayEbtFields=" + this.displayEbtFields + ", changeCardClicked=" + this.changeCardClicked + ", addNewCardClicked=" + this.addNewCardClicked + ", currentSelectCardID=" + this.currentSelectCardID + ", acculynkPostBody=" + this.acculynkPostBody + ", isShowPinPad=" + this.isShowPinPad + ", isWebPageLoading=" + this.isWebPageLoading + ')';
        }

        public PaymentOptionsViewState(PaymentOptions paymentOptions, List<PaymentOptionDecorator> paymentOptionsDecorated, EbtPaymentOption ebtPaymentOption, boolean z10, boolean z11, CheckoutFlowState checkoutFlowState, String str, String str2, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, EbtPanData ebtPanData, AcculynkDeliveryAddress acculynkDeliveryAddress, BearerToken bearerToken, boolean z12, EBTErrorDialogDecorator ebtErrorDialogDecorator, String str3, boolean z13, boolean z14, boolean z15, String str4, String str5, boolean z16, boolean z17) {
            Intrinsics.j(paymentOptions, "paymentOptions");
            Intrinsics.j(paymentOptionsDecorated, "paymentOptionsDecorated");
            Intrinsics.j(ebtErrorDialogDecorator, "ebtErrorDialogDecorator");
            this.paymentOptions = paymentOptions;
            this.paymentOptionsDecorated = paymentOptionsDecorated;
            this.ebtPaymentOption = ebtPaymentOption;
            this.isLoading = z10;
            this.isEBTFlowLoading = z11;
            this.checkoutFlowState = checkoutFlowState;
            this.cartCode = str;
            this.cartId = str2;
            this.ebtCardMask = abstractC5607a;
            this.ebtBalance = abstractC5607a2;
            this.mjrEbtPanData = ebtPanData;
            this.addressDetails = acculynkDeliveryAddress;
            this.bearerToken = bearerToken;
            this.isProcessingEbtPanResponse = z12;
            this.ebtErrorDialogDecorator = ebtErrorDialogDecorator;
            this.ebtCardInputError = str3;
            this.displayEbtFields = z13;
            this.changeCardClicked = z14;
            this.addNewCardClicked = z15;
            this.currentSelectCardID = str4;
            this.acculynkPostBody = str5;
            this.isShowPinPad = z16;
            this.isWebPageLoading = z17;
        }

        public final PaymentOptionsViewState a(PaymentOptions paymentOptions, List<PaymentOptionDecorator> paymentOptionsDecorated, EbtPaymentOption ebtPaymentOption, boolean isLoading, boolean isEBTFlowLoading, CheckoutFlowState checkoutFlowState, String cartCode, String cartId, AbstractC5607a ebtCardMask, AbstractC5607a ebtBalance, EbtPanData mjrEbtPanData, AcculynkDeliveryAddress addressDetails, BearerToken bearerToken, boolean isProcessingEbtPanResponse, EBTErrorDialogDecorator ebtErrorDialogDecorator, String ebtCardInputError, boolean displayEbtFields, boolean changeCardClicked, boolean addNewCardClicked, String currentSelectCardID, String acculynkPostBody, boolean isShowPinPad, boolean isWebPageLoading) {
            Intrinsics.j(paymentOptions, "paymentOptions");
            Intrinsics.j(paymentOptionsDecorated, "paymentOptionsDecorated");
            Intrinsics.j(ebtErrorDialogDecorator, "ebtErrorDialogDecorator");
            return new PaymentOptionsViewState(paymentOptions, paymentOptionsDecorated, ebtPaymentOption, isLoading, isEBTFlowLoading, checkoutFlowState, cartCode, cartId, ebtCardMask, ebtBalance, mjrEbtPanData, addressDetails, bearerToken, isProcessingEbtPanResponse, ebtErrorDialogDecorator, ebtCardInputError, displayEbtFields, changeCardClicked, addNewCardClicked, currentSelectCardID, acculynkPostBody, isShowPinPad, isWebPageLoading);
        }

        /* renamed from: c, reason: from getter */
        public final String getAcculynkPostBody() {
            return this.acculynkPostBody;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getAddNewCardClicked() {
            return this.addNewCardClicked;
        }

        /* renamed from: e, reason: from getter */
        public final AcculynkDeliveryAddress getAddressDetails() {
            return this.addressDetails;
        }

        /* renamed from: f, reason: from getter */
        public final String getCartCode() {
            return this.cartCode;
        }

        /* renamed from: g, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getChangeCardClicked() {
            return this.changeCardClicked;
        }

        /* renamed from: i, reason: from getter */
        public final CheckoutFlowState getCheckoutFlowState() {
            return this.checkoutFlowState;
        }

        /* renamed from: j, reason: from getter */
        public final String getCurrentSelectCardID() {
            return this.currentSelectCardID;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getDisplayEbtFields() {
            return this.displayEbtFields;
        }

        /* renamed from: l, reason: from getter */
        public final AbstractC5607a getEbtBalance() {
            return this.ebtBalance;
        }

        /* renamed from: m, reason: from getter */
        public final String getEbtCardInputError() {
            return this.ebtCardInputError;
        }

        /* renamed from: n, reason: from getter */
        public final AbstractC5607a getEbtCardMask() {
            return this.ebtCardMask;
        }

        /* renamed from: o, reason: from getter */
        public final EBTErrorDialogDecorator getEbtErrorDialogDecorator() {
            return this.ebtErrorDialogDecorator;
        }

        /* renamed from: p, reason: from getter */
        public final EbtPaymentOption getEbtPaymentOption() {
            return this.ebtPaymentOption;
        }

        /* renamed from: q, reason: from getter */
        public final EbtPanData getMjrEbtPanData() {
            return this.mjrEbtPanData;
        }

        /* renamed from: r, reason: from getter */
        public final PaymentOptions getPaymentOptions() {
            return this.paymentOptions;
        }

        public final List<PaymentOptionDecorator> s() {
            return this.paymentOptionsDecorated;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getIsEBTFlowLoading() {
            return this.isEBTFlowLoading;
        }

        /* renamed from: u, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getIsProcessingEbtPanResponse() {
            return this.isProcessingEbtPanResponse;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsShowPinPad() {
            return this.isShowPinPad;
        }

        /* renamed from: x, reason: from getter */
        public final boolean getIsWebPageLoading() {
            return this.isWebPageLoading;
        }

        public /* synthetic */ PaymentOptionsViewState(PaymentOptions paymentOptions, List list, EbtPaymentOption ebtPaymentOption, boolean z10, boolean z11, CheckoutFlowState checkoutFlowState, String str, String str2, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, EbtPanData ebtPanData, AcculynkDeliveryAddress acculynkDeliveryAddress, BearerToken bearerToken, boolean z12, EBTErrorDialogDecorator eBTErrorDialogDecorator, String str3, boolean z13, boolean z14, boolean z15, String str4, String str5, boolean z16, boolean z17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            List list2;
            String str6;
            EBTErrorDialogDecorator eBTErrorDialogDecorator2;
            PaymentOptions paymentOptions2 = (i10 & 1) != 0 ? new PaymentOptions(null, null, null, false, null, 31, null) : paymentOptions;
            List listM = (i10 & 2) != 0 ? CollectionsKt.m() : list;
            EbtPaymentOption ebtPaymentOption2 = (i10 & 4) != 0 ? null : ebtPaymentOption;
            boolean z18 = (i10 & 8) != 0 ? true : z10;
            boolean z19 = (i10 & 16) != 0 ? false : z11;
            CheckoutFlowState checkoutFlowState2 = (i10 & 32) != 0 ? null : checkoutFlowState;
            String str7 = (i10 & 64) != 0 ? null : str;
            String str8 = (i10 & 128) != 0 ? null : str2;
            AbstractC5607a abstractC5607a3 = (i10 & 256) != 0 ? null : abstractC5607a;
            AbstractC5607a abstractC5607a4 = (i10 & 512) != 0 ? null : abstractC5607a2;
            EbtPanData ebtPanData2 = (i10 & 1024) != 0 ? null : ebtPanData;
            AcculynkDeliveryAddress acculynkDeliveryAddress2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : acculynkDeliveryAddress;
            BearerToken bearerToken2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : bearerToken;
            boolean z20 = (i10 & 8192) != 0 ? false : z12;
            if ((i10 & 16384) != 0) {
                list2 = listM;
                str6 = null;
                eBTErrorDialogDecorator2 = new EBTErrorDialogDecorator(Gm.a.f11643n, null);
            } else {
                list2 = listM;
                str6 = null;
                eBTErrorDialogDecorator2 = eBTErrorDialogDecorator;
            }
            this(paymentOptions2, list2, ebtPaymentOption2, z18, z19, checkoutFlowState2, str7, str8, abstractC5607a3, abstractC5607a4, ebtPanData2, acculynkDeliveryAddress2, bearerToken2, z20, eBTErrorDialogDecorator2, (i10 & 32768) != 0 ? str6 : str3, (i10 & 65536) != 0 ? false : z13, (i10 & 131072) != 0 ? false : z14, (i10 & 262144) != 0 ? false : z15, (i10 & 524288) != 0 ? str6 : str4, (i10 & 1048576) == 0 ? str5 : str6, (i10 & 2097152) != 0 ? false : z16, (i10 & 4194304) != 0 ? true : z17);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$fetchSavedPaymentOptions$2", f = "CheckoutPaymentOptionsViewModel.kt", l = {606}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103801a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103801a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                th.f fVar = Z.this.paymentOptionsRepository;
                this.f103801a = 1;
                if (fVar.j(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$getPaymentOptionDecorators$2", f = "CheckoutPaymentOptionsViewModel.kt", l = {455}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103803a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Validation<PaymentOption>> f103805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List<Validation<PaymentOption>> list, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f103805c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new m(this.f103805c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103803a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f103803a = 1;
                if (qv.Z.b(500L, this) == objF) {
                    return objF;
                }
            }
            Z.this.r0((PaymentOption) ((Validation) CollectionsKt.s0(this.f103805c)).e());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$onAction$3", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103806a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103806a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(j.c.f103767a);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$onAction$4", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103808a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103808a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(j.c.f103767a);
                Lk.b<PaymentOptionsViewState, j> bVarW = Z.this.W();
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                bVarW.a(new j.ShowEBTCheckBalanceLimitReached(companion.d(com.meijer.mobile.meijer.Y.f100372v4, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100392w4, Boxing.d(2))));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$onAction$8", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103810a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103810a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(j.h.f103773a);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$postFailureMessage$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RetrofitException f103813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Z f103814c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(RetrofitException retrofitException, Z z10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f103813b = retrofitException;
            this.f103814c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f103813b, this.f103814c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103812a == 0) {
                ResultKt.b(obj);
                if (this.f103813b.getExceptionKind() == RetrofitException.b.f96149i) {
                    this.f103814c.W().a(new j.CardFailEvent(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100041ec, new Object[0])));
                } else {
                    this.f103814c.W().a(new j.CardErrorEvent(this.f103813b));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$preAuthCard$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103815a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103815a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(new j.CardFailEvent(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100041ec, new Object[0])));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$preAuthCard$2", f = "CheckoutPaymentOptionsViewModel.kt", l = {640}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103817a;

        /* renamed from: b, reason: collision with root package name */
        Object f103818b;

        /* renamed from: c, reason: collision with root package name */
        Object f103819c;

        /* renamed from: d, reason: collision with root package name */
        Object f103820d;

        /* renamed from: e, reason: collision with root package name */
        int f103821e;

        /* renamed from: f, reason: collision with root package name */
        int f103822f;

        /* renamed from: g, reason: collision with root package name */
        int f103823g;

        /* renamed from: h, reason: collision with root package name */
        int f103824h;

        /* renamed from: i, reason: collision with root package name */
        int f103825i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103826j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AccountCreditCard f103828l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = Z.this.new s(this.f103828l, continuation);
            sVar.f103826j = obj;
            return sVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(AccountCreditCard accountCreditCard, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f103828l = accountCreditCard;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            Object objB;
            Object value3;
            Object value4;
            Object objK;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103825i;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f103826j;
                        Z z10 = Z.this;
                        AccountCreditCard accountCreditCard = this.f103828l;
                        Result.Companion companion = Result.INSTANCE;
                        th.k kVar = z10.paymentsRepository;
                        String cartCode = ((PaymentOptionsViewState) z10._viewState.getValue()).getCartCode();
                        if (cartCode == null) {
                            cartCode = "";
                        }
                        this.f103826j = interfaceC16622O;
                        this.f103817a = interfaceC16622O;
                        this.f103818b = this;
                        this.f103819c = this;
                        this.f103820d = interfaceC16622O;
                        this.f103821e = 0;
                        this.f103822f = 0;
                        this.f103823g = 0;
                        this.f103824h = 0;
                        this.f103825i = 1;
                        objK = th.k.k(kVar, accountCreditCard, false, null, cartCode, this, 4, null);
                        if (objK == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                        objK = obj;
                    }
                    objB = Result.b(objK);
                } catch (Exception e10) {
                    E0.i(getContext());
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                Z z11 = Z.this;
                if (Result.h(objB)) {
                    InterfaceC17140B interfaceC17140B = z11._viewState;
                    do {
                        value4 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value4, PaymentOptionsViewState.b((PaymentOptionsViewState) value4, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
                    z11.q0();
                }
                Z z12 = Z.this;
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    InterfaceC17140B interfaceC17140B2 = z12._viewState;
                    do {
                        value3 = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value3, PaymentOptionsViewState.b((PaymentOptionsViewState) value3, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
                    RetrofitException retrofitExceptionA = com.meijer.mobile.core.networking.exceptions.a.a(thE);
                    uw.a.INSTANCE.f(retrofitExceptionA, "Error adding new credit card", new Object[0]);
                    z12.g0(retrofitExceptionA);
                }
            } catch (SocketTimeoutException e11) {
                InterfaceC17140B interfaceC17140B3 = Z.this._viewState;
                do {
                    value2 = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value2, PaymentOptionsViewState.b((PaymentOptionsViewState) value2, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
                uw.a.INSTANCE.f(e11, "SocketTimeoutException during preAuthCard", new Object[0]);
                Z.this.W().a(new j.CardFailEvent(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100342te, new Object[0])));
            } catch (Exception e12) {
                InterfaceC17140B interfaceC17140B4 = Z.this._viewState;
                do {
                    value = interfaceC17140B4.getValue();
                } while (!interfaceC17140B4.e(value, PaymentOptionsViewState.b((PaymentOptionsViewState) value, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
                uw.a.INSTANCE.f(e12, "Unexpected exception during preAuthCard", new Object[0]);
                Z.this.W().a(new j.CardFailEvent(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100342te, new Object[0])));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$removeEBTCard$1$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {498}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103829a;

        /* renamed from: b, reason: collision with root package name */
        Object f103830b;

        /* renamed from: c, reason: collision with root package name */
        Object f103831c;

        /* renamed from: d, reason: collision with root package name */
        Object f103832d;

        /* renamed from: e, reason: collision with root package name */
        int f103833e;

        /* renamed from: f, reason: collision with root package name */
        int f103834f;

        /* renamed from: g, reason: collision with root package name */
        int f103835g;

        /* renamed from: h, reason: collision with root package name */
        int f103836h;

        /* renamed from: i, reason: collision with root package name */
        int f103837i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103838j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaymentOption f103840l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            t tVar = Z.this.new t(this.f103840l, continuation);
            tVar.f103838j = obj;
            return tVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(PaymentOption paymentOption, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f103840l = paymentOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103837i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f103838j;
                    Z.this.p0(true);
                    Z z10 = Z.this;
                    PaymentOption paymentOption = this.f103840l;
                    Result.Companion companion = Result.INSTANCE;
                    jl.t tVar = z10.checkoutRepository;
                    MultiTenderPaymentOption multiTenderPaymentOption = new MultiTenderPaymentOption(paymentOption, null);
                    this.f103838j = interfaceC16622O;
                    this.f103829a = interfaceC16622O;
                    this.f103830b = this;
                    this.f103831c = this;
                    this.f103832d = interfaceC16622O;
                    this.f103833e = 0;
                    this.f103834f = 0;
                    this.f103835g = 0;
                    this.f103836h = 0;
                    this.f103837i = 1;
                    objB2 = jl.t.B(tVar, false, multiTenderPaymentOption, this, 1, null);
                    if (objB2 == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objB2 = obj;
                }
                objB = Result.b(objB2);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Z z11 = Z.this;
            if (Result.h(objB)) {
                z11.checkoutRepository.Q((MultiTenderPaymentOption) ((Validation) objB).e());
                InterfaceC17140B interfaceC17140B = z11._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b((PaymentOptionsViewState) value, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8387835, null)));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Remove EBT Payment failed", new Object[0]);
            }
            Z.this.p0(false);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$setPaymentMethod$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103841a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103841a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(j.d.f103768a);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$setPaymentMethod$2$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {676, 695}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103843a;

        /* renamed from: b, reason: collision with root package name */
        Object f103844b;

        /* renamed from: c, reason: collision with root package name */
        Object f103845c;

        /* renamed from: d, reason: collision with root package name */
        Object f103846d;

        /* renamed from: e, reason: collision with root package name */
        int f103847e;

        /* renamed from: f, reason: collision with root package name */
        int f103848f;

        /* renamed from: g, reason: collision with root package name */
        int f103849g;

        /* renamed from: h, reason: collision with root package name */
        int f103850h;

        /* renamed from: i, reason: collision with root package name */
        int f103851i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f103852j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaymentOption f103854l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$setPaymentMethod$2$1$2$2", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103855a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Z f103856b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103856b = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f103856b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f103855a == 0) {
                    ResultKt.b(obj);
                    this.f103856b.W().a(j.d.f103768a);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$setPaymentMethod$2$1$3$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103857a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Z f103858b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Z z10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f103858b = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f103858b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f103857a == 0) {
                    ResultKt.b(obj);
                    this.f103858b.W().a(new j.CardFailEvent(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100342te, new Object[0])));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            v vVar = Z.this.new v(this.f103854l, continuation);
            vVar.f103852j = obj;
            return vVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(PaymentOption paymentOption, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f103854l = paymentOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r42) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.payment.Z.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsViewModel$showEBTPinPadScreen$1$1", f = "CheckoutPaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103859a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f103861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f103861c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Z.this.new w(this.f103861c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103859a == 0) {
                ResultKt.b(obj);
                Z.this.W().a(new j.ShowEbtPinPadEvent(this.f103861c));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaymentOptionDecorator> Y(List<Validation<PaymentOption>> paymentOptionList) {
        List<Validation<PaymentOption>> list = paymentOptionList;
        if (!CollectionsKt.e0(list)) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        boolean z10 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String authToken = ((PaymentOption) ((Validation) it.next()).e()).getAuthToken();
            PaymentOption paymentOptionE = this.viewState.getValue().getPaymentOptions().k().e();
            if (Intrinsics.e(authToken, paymentOptionE != null ? paymentOptionE.getAuthToken() : null)) {
                z10 = true;
            }
            arrayList.add(Unit.f142422a);
        }
        if (!z10 && !paymentOptionList.isEmpty()) {
            C16648k.d(C16623P.a(C16639f0.c()), null, null, new m(paymentOptionList, null), 3, null);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Validation validation = (Validation) it2.next();
            PaymentOptionDecorator.Companion companion = PaymentOptionDecorator.INSTANCE;
            String authToken2 = ((PaymentOption) validation.e()).getAuthToken();
            PaymentOption paymentOptionE2 = this.viewState.getValue().getPaymentOptions().k().e();
            arrayList2.add(PaymentOptionDecorator.Companion.b(companion, validation, Intrinsics.e(authToken2, paymentOptionE2 != null ? paymentOptionE2.getAuthToken() : null), null, 4, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((PaymentOptionDecorator) obj).getIsSelected()) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            d0(new i.UpdateSelectCardID(((PaymentOptionDecorator) CollectionsKt.s0(arrayList3)).getId()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z(th.f paymentOptionsRepository, th.k paymentsRepository, jl.t checkoutRepository, yl.k featureManager, jl.d checkoutFlowRepository, InterfaceC14261a analyticsEngine, hl.m cartRepository, yo.k userManager, SharedPreferences sharedPreferences, Xi.a userTokenProvider) {
        Intrinsics.j(paymentOptionsRepository, "paymentOptionsRepository");
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(checkoutFlowRepository, "checkoutFlowRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        this.paymentOptionsRepository = paymentOptionsRepository;
        this.paymentsRepository = paymentsRepository;
        this.checkoutRepository = checkoutRepository;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        this.sharedPreferences = sharedPreferences;
        this.userTokenProvider = userTokenProvider;
        this._isValid = tv.S.a(Boolean.FALSE);
        boolean z10 = false;
        String str = null;
        AbstractC5607a abstractC5607a = null;
        boolean z11 = false;
        boolean z12 = false;
        String str2 = null;
        boolean z13 = false;
        Lk.b<PaymentOptionsViewState, j> bVar = new Lk.b<>(new PaymentOptionsViewState(null, null, null, false, z10, null, null, str, null, abstractC5607a, null, null, null, false, null, null, false, z11, z12, null, str2, false, z13, 8388607, null));
        this.flow = bVar;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140BA = tv.S.a(new PaymentOptionsViewState(objArr, objArr2, null, z10, false, objArr3, str, objArr4, abstractC5607a, objArr5, objArr6, objArr7, null, false, objArr8, null, z11, z12, false, str2, null, z13, false, 8388607, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        C17154h.J(C17154h.g(C17154h.O(C17154h.c(interfaceC17140BA), new a(bVar)), new b(null)), androidx.view.d0.a(this));
        C16648k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final d dVar = new d(this);
        Pu.g<? super CheckoutFlowState> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.S
            @Override // Pu.g
            public final void accept(Object obj) {
                Z.v(dVar, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final e eVar = new e(companion);
        Ck.a.a(lVarG.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.T
            @Override // Pu.g
            public final void accept(Object obj) {
                Z.w(eVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutState> lVarTake = checkoutRepository.s().take(1L);
        final f fVar = new f(this);
        Pu.g<? super CheckoutState> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.U
            @Override // Pu.g
            public final void accept(Object obj) {
                Z.x(fVar, obj);
            }
        };
        final g gVar3 = new g(companion);
        Ck.a.a(lVarTake.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.V
            @Override // Pu.g
            public final void accept(Object obj) {
                Z.y(gVar3, obj);
            }
        }), aVar);
        io.reactivex.l lVarA = C14574b.f136404a.a(cartRepository.N(), userTokenProvider.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.A(this.f103710a, (Pair) obj);
            }
        };
        Ck.a.a(lVarA.map(new Pu.o() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.X
            @Override // Pu.o
            public final Object apply(Object obj) {
                return Z.B(function1, obj);
            }
        }).subscribe(), aVar);
        v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Z z10, Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        z10.y0((String) pair.a(), (BearerToken) pair.b());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Unit) function1.invoke(p02);
    }

    private final String S(String ebtToken, String cardExpiration) {
        HttpUrl.a aVarI;
        HttpUrl httpUrlG;
        BearerToken bearerToken;
        try {
            EbtPanData mjrEbtPanData = this._viewState.getValue().getMjrEbtPanData();
            String accessToken = (mjrEbtPanData == null || (bearerToken = mjrEbtPanData.getBearerToken()) == null) ? null : bearerToken.getAccessToken();
            if (accessToken == null) {
                accessToken = "";
            }
            String str = accessToken;
            String cartId = this._viewState.getValue().getCartId();
            if (cartId == null) {
                cartId = "-1";
            }
            String str2 = cartId;
            AcculynkDeliveryAddress addressDetails = this._viewState.getValue().getAddressDetails();
            String strG = Gm.e.f11650a.g(new AcculynkRequest(str, null, null, null, "balance", null, null, null, null, addressDetails == null ? new AcculynkDeliveryAddress(null, null, null, null, null, 31, null) : addressDetails, ebtToken, cardExpiration, str2, null, null, null, null, null, null, null, null, 2089454, null));
            HttpUrl.a aVarL = C3755c.f14105a.h().l("DRTrxPan/Ebt/InitiatePinpad");
            if (aVarL == null || (aVarI = aVarL.i(strG)) == null || (httpUrlG = aVarI.g()) == null) {
                return null;
            }
            return httpUrlG.getUrl();
        } catch (Exception e10) {
            uw.a.INSTANCE.b(e10);
            return null;
        }
    }

    private final void T(AbstractC5607a cardMask, AbstractC5607a balance) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, false, false, null, null, null, cardMask, balance, null, null, null, false, null, null, false, false, false, null, null, false, false, 8387839, null)));
    }

    private final void U() {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, true, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
        C16648k.d(androidx.view.d0.a(this), null, null, new l(null), 3, null);
    }

    private final int V() {
        return this.sharedPreferences.getInt("ebt_check_balance_counter", 0);
    }

    private final String X() {
        String string = this.sharedPreferences.getString("ebt_check_balance_date_attempted", "");
        return string == null ? "" : string;
    }

    private final boolean a0(LocalDate localDate, LocalDate localDate2) {
        if (localDate2 != null) {
            return localDate.isAfter(localDate2);
        }
        return true;
    }

    private final boolean b0(LocalDate localDate, LocalDate localDate2) {
        if (localDate2 != null) {
            return localDate.isEqual(localDate2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(CheckoutFlowState checkoutFlowState) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, false, false, checkoutFlowState, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388575, null)));
    }

    private final void h0() {
        AccountCreditCard accountCreditCardB;
        String cardCvNumber;
        p0(true);
        PaymentOptions paymentOptions = this.viewState.getValue().getPaymentOptions();
        PaymentOption paymentOptionE = paymentOptions.k().e();
        if (paymentOptionE != null && (cardCvNumber = paymentOptionE.getCardCvNumber()) != null) {
            for (AccountCreditCard accountCreditCard : paymentOptions.g()) {
                String cardAuthToken = accountCreditCard.getCardAuthToken();
                PaymentOption paymentOptionE2 = paymentOptions.k().e();
                if (Intrinsics.e(cardAuthToken, paymentOptionE2 != null ? paymentOptionE2.getAuthToken() : null)) {
                    accountCreditCardB = AccountCreditCard.b(accountCreditCard, 0L, null, null, null, null, null, null, null, null, false, false, null, null, null, cardCvNumber, 0L, 0L, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, null, false, -16385, 1, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        accountCreditCardB = null;
        if (accountCreditCardB == null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new r(null), 3, null);
        } else {
            C16648k.d(androidx.view.d0.a(this), null, null, new s(accountCreditCardB, null), 3, null);
        }
    }

    private final void i0() {
        PaymentOption paymentOptionE = this.viewState.getValue().getPaymentOptions().k().e();
        if (paymentOptionE != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new t(paymentOptionE, null), 3, null);
        }
    }

    private final void j0() {
        this.analyticsEngine.h(C14476c.a("checkout:billing"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.k0((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("error", "Set payment method Error");
        return Unit.f142422a;
    }

    private final void l0(PaymentOption paymentOption) {
        PaymentOptionsViewState value;
        PaymentOptionsViewState paymentOptionsViewState;
        if (this.viewState.getValue().getPaymentOptions().k().e() != null) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
                paymentOptionsViewState = value;
            } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(paymentOptionsViewState, PaymentOptions.f(paymentOptionsViewState.getPaymentOptions(), null, null, new Validation(paymentOption, null, 2, null), false, null, 27, null).l(), null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388606, null)));
        }
    }

    private final void m0(boolean isLoading) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, false, isLoading, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388591, null)));
    }

    private final void n0(EbtBalance ebtBalance, EbtPanResponse ebtPanResponse) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, ebtBalance != null ? Fm.b.a(ebtBalance, new CardHolderName(this.userManager.p(), this.userManager.q(), null, 4, null), ebtPanResponse) : null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388603, null)));
    }

    private final void o0(boolean isProcessing) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, false, false, null, null, null, null, null, null, null, null, isProcessing, null, null, false, false, false, null, null, false, false, 8380415, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(boolean isLoading) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, isLoading, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388599, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        if (!this.featureManager.e(AbstractC18227f.i0.f170583h)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new u(null), 3, null);
        }
        PaymentOption paymentOptionE = this.viewState.getValue().getPaymentOptions().k().e();
        if (paymentOptionE != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new v(paymentOptionE, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(PaymentOption paymentOption) {
        PaymentOptionsViewState value;
        PaymentOptionsViewState paymentOptionsViewState;
        PaymentOptions paymentOptionsL;
        ArrayList arrayList;
        PaymentOptionDecorator paymentOptionDecoratorB;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B;
        PaymentOptionsViewState value2;
        PaymentOptionsViewState paymentOptionsViewState2;
        List<PaymentOptionDecorator> listS = this._viewState.getValue().s();
        if ((listS instanceof Collection) && listS.isEmpty()) {
            paymentOptionDecoratorB = PaymentOptionDecorator.Companion.b(PaymentOptionDecorator.INSTANCE, new Validation(paymentOption, null, 2, null), true, null, 4, null);
            interfaceC17140B = this._viewState;
            do {
                value2 = interfaceC17140B.getValue();
                paymentOptionsViewState2 = value2;
            } while (!interfaceC17140B.e(value2, PaymentOptionsViewState.b(paymentOptionsViewState2, null, CollectionsKt.Q0(paymentOptionsViewState2.s(), paymentOptionDecoratorB), null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388605, null)));
        } else {
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                if (Intrinsics.e(((PaymentOptionDecorator) it.next()).getId(), paymentOption.getId())) {
                    break;
                }
            }
            paymentOptionDecoratorB = PaymentOptionDecorator.Companion.b(PaymentOptionDecorator.INSTANCE, new Validation(paymentOption, null, 2, null), true, null, 4, null);
            interfaceC17140B = this._viewState;
            do {
                value2 = interfaceC17140B.getValue();
                paymentOptionsViewState2 = value2;
            } while (!interfaceC17140B.e(value2, PaymentOptionsViewState.b(paymentOptionsViewState2, null, CollectionsKt.Q0(paymentOptionsViewState2.s(), paymentOptionDecoratorB), null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388605, null)));
        }
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B2 = this._viewState;
        do {
            value = interfaceC17140B2.getValue();
            paymentOptionsViewState = value;
            paymentOptionsL = PaymentOptions.f(paymentOptionsViewState.getPaymentOptions(), null, null, new Validation(paymentOption, null, 2, null), false, null, 27, null).l();
            List<PaymentOptionDecorator> listS2 = paymentOptionsViewState.s();
            arrayList = new ArrayList(CollectionsKt.x(listS2, 10));
            for (PaymentOptionDecorator paymentOptionDecorator : listS2) {
                arrayList.add(PaymentOptionDecorator.b(paymentOptionDecorator, null, false, null, false, null, Intrinsics.e(paymentOptionDecorator.getId(), paymentOption.getId()), null, 0, null, null, 991, null));
            }
        } while (!interfaceC17140B2.e(value, PaymentOptionsViewState.b(paymentOptionsViewState, paymentOptionsL, arrayList, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388604, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(final String errorMessage) {
        this.analyticsEngine.h(C14476c.a("ebt error"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.u0(errorMessage, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        gl.c cVar = gl.c.f133775a;
        if (str == null) {
            str = "";
        }
        track.e(cVar.b(str));
        return Unit.f142422a;
    }

    private final void v0() {
        this.analyticsEngine.h(C14476c.h("Meijer: Payment select card"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.x0((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout select card");
        return Unit.f142422a;
    }

    private final void y0(String cartId, BearerToken bearerToken) {
        PaymentOptionsViewState value;
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(value, null, null, null, false, false, null, null, cartId, null, null, new EbtPanData(cartId, bearerToken), null, null, false, null, null, false, false, false, null, null, false, false, 8387455, null)));
    }

    public final Lk.b<PaymentOptionsViewState, j> W() {
        return this.flow;
    }

    public final tv.P<PaymentOptionsViewState> Z() {
        return this.viewState;
    }

    public tv.P<Boolean> c0() {
        return this._isValid;
    }

    public final void d0(i action) {
        PaymentOptionsViewState value;
        PaymentOptionsViewState value2;
        PaymentOptionsViewState value3;
        PaymentOptionsViewState value4;
        PaymentOptionsViewState paymentOptionsViewState;
        PaymentOptionsViewState value5;
        i.SetEBTCardInputError setEBTCardInputError;
        PaymentOptionsViewState value6;
        PaymentOptionsViewState value7;
        PaymentOptionsViewState value8;
        PaymentOptionsViewState value9;
        AbstractC5607a abstractC5607aD;
        Intrinsics.j(action, "action");
        if (action instanceof i.SetPaymentMethodAction) {
            r0(((i.SetPaymentMethodAction) action).getPaymentOption());
            return;
        }
        if (action instanceof i.SetCardCVVAction) {
            l0(((i.SetCardCVVAction) action).getPaymentOption());
            return;
        }
        if (action instanceof i.n) {
            j0();
            return;
        }
        if (action instanceof i.k) {
            h0();
            return;
        }
        if (action instanceof i.l) {
            U();
            return;
        }
        if (action instanceof i.DisplayEbtBalanceAction) {
            i.DisplayEbtBalanceAction displayEbtBalanceAction = (i.DisplayEbtBalanceAction) action;
            if (displayEbtBalanceAction.getIsSinglePageCheckout()) {
                abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99954a5, displayEbtBalanceAction.getCardMask().length() >= 4 ? StringsKt.K1(displayEbtBalanceAction.getCardMask(), 4) : displayEbtBalanceAction.getCardMask());
            } else {
                abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99705N3, displayEbtBalanceAction.getCardMask());
            }
            T(abstractC5607aD, AbstractC5607a.INSTANCE.d(displayEbtBalanceAction.getIsSinglePageCheckout() ? com.meijer.mobile.meijer.Y.f99648K3 : com.meijer.mobile.meijer.Y.f99667L3, Gm.c.f11649a.a(displayEbtBalanceAction.getBalance().getRemainingBalanceSnap())));
            return;
        }
        if (action instanceof i.SetEbtPaymentOption) {
            i.SetEbtPaymentOption setEbtPaymentOption = (i.SetEbtPaymentOption) action;
            n0(setEbtPaymentOption.getEbtBalance(), setEbtPaymentOption.getEbtPanResponse());
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
            do {
                value9 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value9, PaymentOptionsViewState.b(value9, null, Y(this.viewState.getValue().getPaymentOptions().h()), null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, false, 8388605, null)));
            return;
        }
        if (action instanceof i.h) {
            p0(true);
            return;
        }
        if (action instanceof i.f) {
            m0(true);
            return;
        }
        if (action instanceof i.e) {
            p0(false);
            return;
        }
        if (action instanceof i.d) {
            m0(false);
            return;
        }
        if (action instanceof i.c) {
            C16648k.d(androidx.view.d0.a(this), null, null, new n(null), 3, null);
            return;
        }
        if (action instanceof i.ShowEbtPinPad) {
            if (this.viewState.getValue().getIsProcessingEbtPanResponse()) {
                return;
            }
            o0(true);
            m0(true);
            p0(true);
            i.ShowEbtPinPad showEbtPinPad = (i.ShowEbtPinPad) action;
            if (showEbtPinPad.getIsRetry()) {
                String ebtToken = showEbtPinPad.getEbtToken();
                if (ebtToken == null) {
                    ebtToken = "";
                }
                String cardExpiration = showEbtPinPad.getCardExpiration();
                s0(ebtToken, cardExpiration != null ? cardExpiration : "");
                return;
            }
            if (z0()) {
                m0(false);
                p0(false);
                C16648k.d(androidx.view.d0.a(this), null, null, new o(null), 3, null);
                t0("EBT check balance limit reached");
                return;
            }
            String ebtToken2 = showEbtPinPad.getEbtToken();
            if (ebtToken2 == null) {
                ebtToken2 = "";
            }
            String cardExpiration2 = showEbtPinPad.getCardExpiration();
            s0(ebtToken2, cardExpiration2 != null ? cardExpiration2 : "");
            return;
        }
        if (action instanceof i.m) {
            i0();
            return;
        }
        if (action instanceof i.ChangeCard) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B2 = this._viewState;
            do {
                value8 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value8, PaymentOptionsViewState.b(value8, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, ((i.ChangeCard) action).getChangeCardClicked(), false, null, null, false, false, 7995391, null)));
            return;
        }
        if (action instanceof i.a) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B3 = this._viewState;
            do {
                value7 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value7, PaymentOptionsViewState.b(value7, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, true, null, null, false, false, 7995391, null)));
            return;
        }
        if (action instanceof i.SetIsProcessingEbtPanResponse) {
            o0(((i.SetIsProcessingEbtPanResponse) action).getIsProcessing());
            return;
        }
        if (action instanceof i.EBTErrorResponseHandler) {
            i.EBTErrorResponseHandler eBTErrorResponseHandler = (i.EBTErrorResponseHandler) action;
            t0(eBTErrorResponseHandler.getErrorMessage());
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B4 = this._viewState;
            do {
                value6 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value6, PaymentOptionsViewState.b(value6, null, null, null, false, false, null, null, null, null, null, null, null, null, false, new EBTErrorDialogDecorator(Gm.a.INSTANCE.a(eBTErrorResponseHandler.getErrorCode()), eBTErrorResponseHandler.getInsufficientBalance()), null, false, false, false, null, null, false, false, 6275071, null)));
            C16648k.d(androidx.view.d0.a(this), null, null, new p(null), 3, null);
            return;
        }
        if (action instanceof i.SetEBTCardInputError) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B5 = this._viewState;
            do {
                value5 = interfaceC17140B5.getValue();
                setEBTCardInputError = (i.SetEBTCardInputError) action;
            } while (!interfaceC17140B5.e(value5, PaymentOptionsViewState.b(value5, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, setEBTCardInputError.getError(), false, false, false, null, null, false, false, 8355839, null)));
            String error = setEBTCardInputError.getError();
            if (error != null) {
                t0(error);
                return;
            }
            return;
        }
        if (action instanceof i.UpdateSelectCardID) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B6 = this._viewState;
            do {
                value4 = interfaceC17140B6.getValue();
                paymentOptionsViewState = value4;
            } while (!interfaceC17140B6.e(value4, PaymentOptionsViewState.b(paymentOptionsViewState, PaymentOptions.f(paymentOptionsViewState.getPaymentOptions(), null, null, null, false, null, 23, null).l(), null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, ((i.UpdateSelectCardID) action).getSelectedCardID(), null, false, false, 7864318, null)));
            return;
        }
        if (action instanceof i.UpdatePinPadBody) {
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B7 = this._viewState;
            do {
                value3 = interfaceC17140B7.getValue();
            } while (!interfaceC17140B7.e(value3, PaymentOptionsViewState.b(value3, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, ((i.UpdatePinPadBody) action).getAcculynkPostBody(), true, false, 5242879, null)));
        } else {
            if (!(action instanceof i.j)) {
                if (!(action instanceof i.UpdateWebPageLoading)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B8 = this._viewState;
                do {
                    value = interfaceC17140B8.getValue();
                } while (!interfaceC17140B8.e(value, PaymentOptionsViewState.b(value, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, false, ((i.UpdateWebPageLoading) action).getIsWebPageLoading(), 4194303, null)));
                return;
            }
            InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B9 = this._viewState;
            do {
                value2 = interfaceC17140B9.getValue();
            } while (!interfaceC17140B9.e(value2, PaymentOptionsViewState.b(value2, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, "", false, false, 5242879, null)));
            o0(false);
            p0(false);
            m0(false);
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        U();
        p0(false);
        m0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object C(Lk.b bVar, PaymentOptionsViewState paymentOptionsViewState, Continuation continuation) {
        bVar.d(paymentOptionsViewState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(CheckoutState checkoutState) {
        CustomerAddress address;
        PaymentOptionsViewState value;
        PaymentOptionsViewState paymentOptionsViewState;
        String code;
        AcculynkDeliveryAddress acculynkDeliveryAddressB;
        boolean zN;
        DeliveryMode deliveryModeE = checkoutState.m().e();
        if (deliveryModeE != null && deliveryModeE.c()) {
            address = checkoutState.k().e();
        } else {
            PointOfService pointOfServiceE = checkoutState.v().e();
            if (pointOfServiceE != null) {
                address = pointOfServiceE.getAddress();
            } else {
                address = null;
            }
        }
        InterfaceC17140B<PaymentOptionsViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            paymentOptionsViewState = value;
            ShoppingCart shoppingCartE = checkoutState.i().e();
            if (shoppingCartE != null) {
                code = shoppingCartE.getCode();
            } else {
                code = null;
            }
            if (address != null) {
                acculynkDeliveryAddressB = Gm.b.b(address);
            } else {
                acculynkDeliveryAddressB = null;
            }
            ShoppingCart shoppingCartE2 = checkoutState.i().e();
            if (shoppingCartE2 != null) {
                zN = shoppingCartE2.N();
            } else {
                zN = false;
            }
        } while (!interfaceC17140B.e(value, PaymentOptionsViewState.b(paymentOptionsViewState, null, null, null, false, false, null, code, null, null, null, null, acculynkDeliveryAddressB, null, false, null, null, zN, false, false, null, null, false, false, 8320959, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(RetrofitException retrofitException) {
        C16648k.d(androidx.view.d0.a(this), null, null, new q(retrofitException, this, null), 3, null);
    }

    private final void s0(String ebtToken, String cardExpiration) {
        String strS = S(ebtToken, cardExpiration);
        if (strS != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new w(strS, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final boolean z0() {
        LocalDate localDate = (LocalDate) vk.d.b(X(), C17590a.ISO_LOCAL_DATE, new Ch.a());
        LocalDate localDateNow = LocalDate.now();
        if (V() >= 2) {
            Intrinsics.g(localDateNow);
            if (b0(localDateNow, localDate) && !this.featureManager.e(AbstractC18227f.C18249w.f170610h)) {
                return true;
            }
        }
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        Intrinsics.g(localDateNow);
        if (a0(localDateNow, localDate)) {
            editorEdit.putInt("ebt_check_balance_counter", 0);
        }
        editorEdit.putInt("ebt_check_balance_counter", V() + 1);
        editorEdit.putString("ebt_check_balance_date_attempted", localDateNow.toString());
        editorEdit.apply();
        return false;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}

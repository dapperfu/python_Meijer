package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Hk.Validation;
import Hk.d;
import androidx.view.InterfaceC6015f;
import androidx.view.c0;
import androidx.view.d0;
import ci.Region;
import ci.StoreAddress;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.OrderTypeHeaderDataDecorator;
import ej.ShoppingCart;
import fj.PickupPerson;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import ij.FulfillmentSlot;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl.CheckoutFlowState;
import jl.CheckoutState;
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
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qh.C16527b;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;
import tv.S;
import uw.a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003X[]B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010\u0014J#\u0010.\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010-\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020%H\u0002¢\u0006\u0004\b1\u0010(J\u000f\u00102\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u0010\u0014J\u001f\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020%2\u0006\u00100\u001a\u00020%H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u0010\u001cJ7\u0010<\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%H\u0002¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0012H\u0002¢\u0006\u0004\b@\u0010\u0014J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020%H\u0002¢\u0006\u0004\bB\u0010(J\u0013\u0010C\u001a\u00020%*\u00020\u0019H\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR#\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020P0O8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020%0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020%0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00190_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u00106R\u0016\u0010m\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u00106R\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020%0e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010iR\u0014\u0010,\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Ljl/t;", "checkoutRepository", "Lqh/b;", "accountLinkingRepository", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "Ljl/d;", "checkoutFlowRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Ljl/t;Lqh/b;Lyo/k;Lyl/k;Ljl/d;Lgi/a;)V", "", "onCleared", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "action", "K", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;)V", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "viewState", "P", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)V", "Ljl/f;", "checkoutFlowState", "L", "(Ljl/f;)V", "Ljl/v;", "checkoutState", "M", "(Ljl/v;)V", "", "isContactInfoProvided", "R", "(Z)V", "Q", "T", "Lfj/b;", "pickupPerson", "optIn", "O", "(Lfj/b;Z)V", "isBopasTimeSlot", "U", "V", "isEditMode", "N", "(ZZ)V", "Z", "E", "isFirstNameFocused", "isLastNameFocused", "isEmailFocused", "isPhoneNumberFocused", "Y", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;ZZZZ)V", "X", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;ZZ)V", "a0", "isLoading", "S", "I", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)Z", "a", "Ljl/t;", "b", "Lqh/b;", "c", "Lyo/k;", "d", "Lyl/k;", "e", "Lgi/a;", "LLk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "f", "LLk/b;", "F", "()LLk/b;", "flow", "LHk/b;", "", "g", "LHk/b;", "initialEmailAddress", "h", "initialPhoneNumber", "i", "initialAgreedToTermsAndConditions", "Ltv/B;", "j", "Ltv/B;", "_isValid", "k", "_viewState", "Ltv/P;", "l", "Ltv/P;", "H", "()Ltv/P;", "m", "isSetPickupPerson", "n", "initialPickupPersonSet", "LNu/a;", "o", "LNu/a;", "disposables", "J", "isValid", "G", "()Lfj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11932p extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jl.t checkoutRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16527b accountLinkingRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lk.b<PickupPersonViewState, h> flow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Validation<String> initialEmailAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Validation<String> initialPhoneNumber;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Validation<Boolean> initialAgreedToTermsAndConditions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _isValid;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<PickupPersonViewState> _viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final tv.P<PickupPersonViewState> viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isSetPickupPerson;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean initialPickupPersonSet;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, C11932p.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((C11932p) this.receiver).M(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$b */
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$c */
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, C11932p.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((C11932p) this.receiver).L(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState checkoutFlowState) {
            a(checkoutFlowState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$e */
    /* synthetic */ class e extends AdaptedFunctionReference implements Function2<PickupPersonViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        e(Object obj) {
            super(2, obj, C11932p.class, "onNewViewState", "onNewViewState(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonViewState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PickupPersonViewState pickupPersonViewState, Continuation<? super Unit> continuation) {
            return C11932p.v((C11932p) this.f142801a, pickupPersonViewState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormViewModel$6", f = "PickupPersonFormViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$f */
    static final class f extends SuspendLambda implements Function3<InterfaceC17153g<? super PickupPersonViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104286a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f104287b;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super PickupPersonViewState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.f104287b = th2;
            return fVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f104286a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f104287b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "<init>", "()V", "m", "n", "c", "b", "i", "a", "e", "f", "d", "h", "j", "g", "l", "k", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$l;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$m;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$n;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g */
    public static abstract class g {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$a */
        public static final /* data */ class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final a f104288a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 174709800;
            }

            public String toString() {
                return "EditContactInfo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$b */
        public static final /* data */ class b extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final b f104289a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1532788818;
            }

            public String toString() {
                return "OnCancelClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$c */
        public static final /* data */ class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final c f104290a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -892762167;
            }

            public String toString() {
                return "OnEditIconClicked";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "emailAddress", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$d, reason: from toString */
        public static final /* data */ class SetEmailAddress extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean optIn;

            public SetEmailAddress(String str, boolean z10) {
                super(null);
                this.emailAddress = str;
                this.optIn = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetEmailAddress)) {
                    return false;
                }
                SetEmailAddress setEmailAddress = (SetEmailAddress) other;
                return Intrinsics.e(this.emailAddress, setEmailAddress.emailAddress) && this.optIn == setEmailAddress.optIn;
            }

            public int hashCode() {
                String str = this.emailAddress;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.optIn);
            }

            public String toString() {
                return "SetEmailAddress(emailAddress=" + this.emailAddress + ", optIn=" + this.optIn + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getOptIn() {
                return this.optIn;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "firstName", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$e, reason: from toString */
        public static final /* data */ class SetFirstName extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean optIn;

            public SetFirstName(String str, boolean z10) {
                super(null);
                this.firstName = str;
                this.optIn = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetFirstName)) {
                    return false;
                }
                SetFirstName setFirstName = (SetFirstName) other;
                return Intrinsics.e(this.firstName, setFirstName.firstName) && this.optIn == setFirstName.optIn;
            }

            public int hashCode() {
                String str = this.firstName;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.optIn);
            }

            public String toString() {
                return "SetFirstName(firstName=" + this.firstName + ", optIn=" + this.optIn + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getOptIn() {
                return this.optIn;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "lastName", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$f, reason: from toString */
        public static final /* data */ class SetLastName extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lastName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean optIn;

            public SetLastName(String str, boolean z10) {
                super(null);
                this.lastName = str;
                this.optIn = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetLastName)) {
                    return false;
                }
                SetLastName setLastName = (SetLastName) other;
                return Intrinsics.e(this.lastName, setLastName.lastName) && this.optIn == setLastName.optIn;
            }

            public int hashCode() {
                String str = this.lastName;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.optIn);
            }

            public String toString() {
                return "SetLastName(lastName=" + this.lastName + ", optIn=" + this.optIn + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getOptIn() {
                return this.optIn;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "optIn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$g, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetOptIn extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean optIn;

            public SetOptIn(boolean z10) {
                super(null);
                this.optIn = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetOptIn) && this.optIn == ((SetOptIn) other).optIn;
            }

            public int hashCode() {
                return Boolean.hashCode(this.optIn);
            }

            public String toString() {
                return "SetOptIn(optIn=" + this.optIn + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getOptIn() {
                return this.optIn;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "phoneNumber", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$h, reason: from toString */
        public static final /* data */ class SetPhoneNumber extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean optIn;

            public SetPhoneNumber(String str, boolean z10) {
                super(null);
                this.phoneNumber = str;
                this.optIn = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetPhoneNumber)) {
                    return false;
                }
                SetPhoneNumber setPhoneNumber = (SetPhoneNumber) other;
                return Intrinsics.e(this.phoneNumber, setPhoneNumber.phoneNumber) && this.optIn == setPhoneNumber.optIn;
            }

            public int hashCode() {
                String str = this.phoneNumber;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.optIn);
            }

            public String toString() {
                return "SetPhoneNumber(phoneNumber=" + this.phoneNumber + ", optIn=" + this.optIn + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getOptIn() {
                return this.optIn;
            }

            /* renamed from: b, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$i */
        public static final /* data */ class i extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final i f104300a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 968996460;
            }

            public String toString() {
                return "StoreExistingFieldValues";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "isEditMode", "isBopasTimeSlot", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$j, reason: from toString */
        public static final /* data */ class UpdateFlow extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEditMode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isBopasTimeSlot;

            public UpdateFlow(boolean z10, boolean z11) {
                super(null);
                this.isEditMode = z10;
                this.isBopasTimeSlot = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateFlow)) {
                    return false;
                }
                UpdateFlow updateFlow = (UpdateFlow) other;
                return this.isEditMode == updateFlow.isEditMode && this.isBopasTimeSlot == updateFlow.isBopasTimeSlot;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isEditMode) * 31) + Boolean.hashCode(this.isBopasTimeSlot);
            }

            public String toString() {
                return "UpdateFlow(isEditMode=" + this.isEditMode + ", isBopasTimeSlot=" + this.isBopasTimeSlot + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsBopasTimeSlot() {
                return this.isBopasTimeSlot;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsEditMode() {
                return this.isEditMode;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "isEmailFocused", "isPhoneNumberFocused", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$k, reason: from toString */
        public static final /* data */ class ValidateAllField extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEmailFocused;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPhoneNumberFocused;

            public ValidateAllField(boolean z10, boolean z11) {
                super(null);
                this.isEmailFocused = z10;
                this.isPhoneNumberFocused = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateAllField)) {
                    return false;
                }
                ValidateAllField validateAllField = (ValidateAllField) other;
                return this.isEmailFocused == validateAllField.isEmailFocused && this.isPhoneNumberFocused == validateAllField.isPhoneNumberFocused;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isEmailFocused) * 31) + Boolean.hashCode(this.isPhoneNumberFocused);
            }

            public String toString() {
                return "ValidateAllField(isEmailFocused=" + this.isEmailFocused + ", isPhoneNumberFocused=" + this.isPhoneNumberFocused + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsEmailFocused() {
                return this.isEmailFocused;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsPhoneNumberFocused() {
                return this.isPhoneNumberFocused;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$l;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "", "isFirstNameFocused", "isLastNameFocused", "isEmailFocused", "isPhoneNumberFocused", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$l, reason: from toString */
        public static final /* data */ class ValidateEachField extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFirstNameFocused;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLastNameFocused;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEmailFocused;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPhoneNumberFocused;

            public ValidateEachField(boolean z10, boolean z11, boolean z12, boolean z13) {
                super(null);
                this.isFirstNameFocused = z10;
                this.isLastNameFocused = z11;
                this.isEmailFocused = z12;
                this.isPhoneNumberFocused = z13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateEachField)) {
                    return false;
                }
                ValidateEachField validateEachField = (ValidateEachField) other;
                return this.isFirstNameFocused == validateEachField.isFirstNameFocused && this.isLastNameFocused == validateEachField.isLastNameFocused && this.isEmailFocused == validateEachField.isEmailFocused && this.isPhoneNumberFocused == validateEachField.isPhoneNumberFocused;
            }

            public int hashCode() {
                return (((((Boolean.hashCode(this.isFirstNameFocused) * 31) + Boolean.hashCode(this.isLastNameFocused)) * 31) + Boolean.hashCode(this.isEmailFocused)) * 31) + Boolean.hashCode(this.isPhoneNumberFocused);
            }

            public String toString() {
                return "ValidateEachField(isFirstNameFocused=" + this.isFirstNameFocused + ", isLastNameFocused=" + this.isLastNameFocused + ", isEmailFocused=" + this.isEmailFocused + ", isPhoneNumberFocused=" + this.isPhoneNumberFocused + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsEmailFocused() {
                return this.isEmailFocused;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsFirstNameFocused() {
                return this.isFirstNameFocused;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsLastNameFocused() {
                return this.isLastNameFocused;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsPhoneNumberFocused() {
                return this.isPhoneNumberFocused;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$m;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$m */
        public static final /* data */ class m extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final m f104309a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return -1225586221;
            }

            public String toString() {
                return "ValidatePickupPersonFormField";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g$n;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$g$n */
        public static final /* data */ class n extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final n f104310a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public int hashCode() {
                return -1343775479;
            }

            public String toString() {
                return "ViewTermsAndConditions";
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "", "<init>", "()V", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h */
    public static abstract class h {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$a;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h$a */
        public static final /* data */ class a extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final a f104311a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1983495330;
            }

            public String toString() {
                return "ProceedToNextStepEvent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h$b */
        public static final /* data */ class b extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final b f104312a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 699557260;
            }

            public String toString() {
                return "TextUpdateDialogEvent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h$c;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$h$c */
        public static final /* data */ class c extends h {

            /* renamed from: a, reason: collision with root package name */
            public static final c f104313a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1031454461;
            }

            public String toString() {
                return "ViewTermsAndConditionsEvent";
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f104314a = new i("FIRST_NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final i f104315b = new i("LAST_NAME", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final i f104316c = new i("EMAIL_ADDRESS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final i f104317d = new i("PHONE_NUMBER", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final i f104318e = new i("TERMS_OF_SERVICE", 4);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ i[] f104319f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f104320g;

        private static final /* synthetic */ i[] a() {
            return new i[]{f104314a, f104315b, f104316c, f104317d, f104318e};
        }

        static {
            i[] iVarArrA = a();
            f104319f = iVarArrA;
            f104320g = EnumEntriesKt.a(iVarArrA);
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f104319f.clone();
        }

        private i(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormViewModel$validatePhoneNumber$1", f = "PickupPersonFormViewModel.kt", l = {345}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.p$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f104321a;

        /* renamed from: b, reason: collision with root package name */
        int f104322b;

        /* renamed from: c, reason: collision with root package name */
        int f104323c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f104324d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f104326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f104326f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = C11932p.this.new j(this.f104326f, continuation);
            jVar.f104324d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f104323c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f104324d;
                    C11932p.this.S(true);
                    C11932p c11932p = C11932p.this;
                    String str = this.f104326f;
                    Result.Companion companion = Result.INSTANCE;
                    C16527b c16527b = c11932p.accountLinkingRepository;
                    this.f104324d = interfaceC16622O;
                    this.f104321a = interfaceC16622O;
                    this.f104322b = 0;
                    this.f104323c = 1;
                    obj = c16527b.a(str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Boxing.a(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            C11932p c11932p2 = C11932p.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Error validating phone number", new Object[0]);
                c11932p2.F().a(h.b.f104312a);
            }
            C11932p c11932p3 = C11932p.this;
            if (Result.h(objB)) {
                if (((Boolean) objB).booleanValue()) {
                    c11932p3.isSetPickupPerson = true;
                    c11932p3.T();
                } else {
                    c11932p3.F().a(h.b.f104312a);
                }
            }
            C11932p.this.S(false);
            return Unit.f142422a;
        }
    }

    public C11932p(jl.t checkoutRepository, C16527b accountLinkingRepository, yo.k userManager, yl.k featureManager, jl.d checkoutFlowRepository, InterfaceC14261a analyticsEngine) {
        PickupPersonViewState value;
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(accountLinkingRepository, "accountLinkingRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(checkoutFlowRepository, "checkoutFlowRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.checkoutRepository = checkoutRepository;
        this.accountLinkingRepository = accountLinkingRepository;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.flow = new Lk.b<>(new PickupPersonViewState(null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, false, null, 131071, null));
        this.initialEmailAddress = new Validation<>("", null, 2, null);
        this.initialPhoneNumber = new Validation<>("", null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.initialAgreedToTermsAndConditions = new Validation<>(bool, null, 2, null);
        this._isValid = S.a(bool);
        InterfaceC17140B<PickupPersonViewState> interfaceC17140BA = S.a(new PickupPersonViewState(null, null, null, null, null, true, false, null, null, null, null, null, false, false, false, false, null, 131039, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarS = checkoutRepository.s();
        final a aVar2 = new a(this);
        Pu.g<? super CheckoutState> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.l
            @Override // Pu.g
            public final void accept(Object obj) {
                C11932p.r(aVar2, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final b bVar = new b(companion);
        Ck.a.a(lVarS.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.m
            @Override // Pu.g
            public final void accept(Object obj) {
                C11932p.s(bVar, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Pu.g<? super CheckoutFlowState> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.n
            @Override // Pu.g
            public final void accept(Object obj) {
                C11932p.t(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Ck.a.a(lVarG.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.o
            @Override // Pu.g
            public final void accept(Object obj) {
                C11932p.u(dVar, obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(interfaceC17140BA, new e(this)), new f(null)), d0.a(this));
        do {
            value = interfaceC17140BA.getValue();
        } while (!interfaceC17140BA.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, false, null, null, null, null, null, false, this._viewState.getValue().w(), false, false, null, 122879, null)));
        this.initialEmailAddress = this.flow.c().getValue().i();
        this.initialPhoneNumber = this.flow.c().getValue().p();
        this.initialAgreedToTermsAndConditions = this.flow.c().getValue().g();
    }

    private final PickupPerson G() {
        PickupPersonViewState value = this.flow.c().getValue();
        String strE = value.j().e();
        if (strE == null) {
            strE = "";
        }
        String strE2 = value.m().e();
        if (strE2 == null) {
            strE2 = "";
        }
        String strE3 = value.i().e();
        if (strE3 == null) {
            strE3 = "";
        }
        String strE4 = value.p().e();
        return new PickupPerson(strE, strE2, strE3, strE4 != null ? strE4 : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(CheckoutFlowState checkoutFlowState) {
        PickupPersonViewState value;
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, false, null, null, null, checkoutFlowState, null, false, false, false, false, null, 130047, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(CheckoutState checkoutState) {
        PickupPersonViewState value;
        PickupPersonViewState pickupPersonViewState;
        LocalDate date;
        LocalTime startTime;
        FulfillmentSlot fulfillmentSlotE;
        PickupPersonViewState value2;
        PickupPersonViewState value3;
        PickupPersonViewState pickupPersonViewState2;
        String line1;
        String strB0;
        Region region;
        Region region2;
        PickupPersonViewState value4;
        Validation<PickupPerson> validationU = checkoutState.u();
        if (validationU.getResult() instanceof d.c) {
            O(validationU.e(), this.flow.c().getValue().g().e().booleanValue());
            if (this.isSetPickupPerson) {
                this.isSetPickupPerson = false;
                if (this.featureManager.e(AbstractC18227f.i0.f170583h)) {
                    R(true);
                    InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
                    do {
                        value4 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value4, PickupPersonViewState.f(value4, null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, false, null, 122879, null)));
                } else {
                    this.flow.a(h.a.f104311a);
                }
            }
        } else {
            Q();
        }
        Validation<FulfillmentSlot> validationX = checkoutState.x();
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B2 = this._viewState;
        do {
            value = interfaceC17140B2.getValue();
            pickupPersonViewState = value;
            FulfillmentSlot fulfillmentSlotE2 = validationX.e();
            date = fulfillmentSlotE2 != null ? fulfillmentSlotE2.getDate() : null;
            FulfillmentSlot fulfillmentSlotE3 = validationX.e();
            startTime = fulfillmentSlotE3 != null ? fulfillmentSlotE3.getStartTime() : null;
            fulfillmentSlotE = validationX.e();
        } while (!interfaceC17140B2.e(value, PickupPersonViewState.f(pickupPersonViewState, null, null, null, null, null, false, false, null, new SlotData(date, startTime, fulfillmentSlotE != null ? fulfillmentSlotE.getEndTime() : null), null, null, null, false, false, false, false, null, 130815, null)));
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            InterfaceC17140B<PickupPersonViewState> interfaceC17140B3 = this._viewState;
            do {
                value3 = interfaceC17140B3.getValue();
                pickupPersonViewState2 = value3;
                StoreAddress address = shoppingCartE.getPointOfService().getAddress();
                String line2 = address != null ? address.getLine2() : null;
                if (line2 == null || line2.length() == 0) {
                    StoreAddress address2 = shoppingCartE.getPointOfService().getAddress();
                    line1 = address2 != null ? address2.getLine1() : null;
                } else {
                    StoreAddress address3 = shoppingCartE.getPointOfService().getAddress();
                    String line12 = address3 != null ? address3.getLine1() : null;
                    StoreAddress address4 = shoppingCartE.getPointOfService().getAddress();
                    String line22 = address4 != null ? address4.getLine2() : null;
                    if (line22 == null) {
                        line22 = "";
                    }
                    line1 = CollectionsKt.B0(CollectionsKt.p(line12, line22), ", ", null, null, 0, null, null, 62, null);
                }
                StoreAddress address5 = shoppingCartE.getPointOfService().getAddress();
                String isoCodeShort = (address5 == null || (region2 = address5.getRegion()) == null) ? null : region2.getIsoCodeShort();
                if (isoCodeShort == null || isoCodeShort.length() == 0) {
                    StoreAddress address6 = shoppingCartE.getPointOfService().getAddress();
                    String town = address6 != null ? address6.getTown() : null;
                    StoreAddress address7 = shoppingCartE.getPointOfService().getAddress();
                    strB0 = CollectionsKt.B0(CollectionsKt.p(town, address7 != null ? address7.getPostalCode() : null), ", ", null, null, 0, null, null, 62, null);
                } else {
                    StoreAddress address8 = shoppingCartE.getPointOfService().getAddress();
                    String town2 = address8 != null ? address8.getTown() : null;
                    StoreAddress address9 = shoppingCartE.getPointOfService().getAddress();
                    String isoCodeShort2 = (address9 == null || (region = address9.getRegion()) == null) ? null : region.getIsoCodeShort();
                    String str = isoCodeShort2 != null ? isoCodeShort2 : "";
                    StoreAddress address10 = shoppingCartE.getPointOfService().getAddress();
                    strB0 = CollectionsKt.B0(CollectionsKt.p(town2, str, address10 != null ? address10.getPostalCode() : null), ", ", null, null, 0, null, null, 62, null);
                }
            } while (!interfaceC17140B3.e(value3, PickupPersonViewState.f(pickupPersonViewState2, null, null, null, null, null, false, false, null, null, new LocationData(line1, strB0, String.valueOf(shoppingCartE.getPointOfService().getDisplayName()), "pickup"), null, null, false, false, false, false, null, 130559, null)));
        }
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B4 = this._viewState;
        do {
            value2 = interfaceC17140B4.getValue();
        } while (!interfaceC17140B4.e(value2, PickupPersonViewState.f(value2, null, null, null, null, null, false, false, OrderTypeHeaderDataDecorator.INSTANCE.a(this._viewState.getValue().getSlotData(), this._viewState.getValue().getLocationData(), false), null, null, null, null, false, false, false, false, null, 130943, null)));
    }

    private final void N(boolean isEditMode, boolean isBopasTimeSlot) {
        PickupPersonViewState value;
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, isEditMode, null, null, null, null, null, false, false, false, false, null, 131007, null)));
        if (isEditMode) {
            V();
        } else {
            U(isBopasTimeSlot);
        }
    }

    private final void O(PickupPerson pickupPerson, boolean optIn) {
        if (pickupPerson != null) {
            InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
            while (true) {
                PickupPersonViewState value = interfaceC17140B.getValue();
                boolean z10 = optIn;
                if (interfaceC17140B.e(value, new O(pickupPerson.getFirstName(), pickupPerson.getLastName(), pickupPerson.getEmail(), pickupPerson.getPhoneNumber(), z10, !this.initialPickupPersonSet ? pickupPerson : null).b(value))) {
                    break;
                } else {
                    optIn = z10;
                }
            }
        }
        if (this.initialPickupPersonSet) {
            return;
        }
        this.initialPickupPersonSet = true;
    }

    private final void P(PickupPersonViewState viewState) {
        this.flow.d(PickupPersonViewState.f(viewState, null, null, null, null, null, false, false, null, null, null, null, null, I(viewState), false, false, false, null, 126975, null));
    }

    private final void Q() {
        PickupPersonViewState value;
        PickupPersonViewState pickupPersonViewState;
        String strP;
        String strQ;
        String strH;
        String strB;
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            pickupPersonViewState = value;
            strP = this.userManager.p();
            strQ = this.userManager.q();
            strH = this.userManager.h();
            strB = this.userManager.B();
            if (strB.length() == 0) {
                strB = this.userManager.e();
            }
        } while (!interfaceC17140B.e(value, new O(strP, strQ, strH, strB, false, new PickupPerson(this.userManager.p(), this.userManager.q(), this.userManager.h(), null, 8, null), 16, null).b(pickupPersonViewState)));
        this.initialPickupPersonSet = true;
    }

    private final void R(boolean isContactInfoProvided) {
        PickupPersonViewState value;
        Boolean value2;
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, isContactInfoProvided, null, 98271, null)));
        InterfaceC17140B<Boolean> interfaceC17140B2 = this._isValid;
        do {
            value2 = interfaceC17140B2.getValue();
            value2.getClass();
        } while (!interfaceC17140B2.e(value2, Boolean.valueOf(isContactInfoProvided)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(boolean isLoading) {
        PickupPersonViewState value;
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PickupPersonViewState.f(value, null, null, null, null, null, isLoading, false, null, null, null, null, null, false, false, false, false, null, 131039, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        K(g.i.f104300a);
        this.initialEmailAddress = this.flow.c().getValue().i();
        this.initialPhoneNumber = this.flow.c().getValue().p();
        this.initialAgreedToTermsAndConditions = this.flow.c().getValue().g();
        this.checkoutRepository.S(G());
    }

    private final void U(boolean isBopasTimeSlot) {
        this.analyticsEngine.e(Ao.E.f1161a.b(isBopasTimeSlot));
    }

    private final void V() {
        this.analyticsEngine.h(C14476c.h("Meijer: Edit Pickup Person Info"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11932p.W((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout edit pickup person");
        return Unit.f142422a;
    }

    private final void Z() {
        PickupPersonViewState value;
        PickupPersonViewState pickupPersonViewState;
        if (this.flow.c().getValue().isValid()) {
            a0();
            return;
        }
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            pickupPersonViewState = value;
        } while (!interfaceC17140B.e(value, pickupPersonViewState));
        E(pickupPersonViewState);
    }

    public final Lk.b<PickupPersonViewState, h> F() {
        return this.flow;
    }

    public final tv.P<PickupPersonViewState> H() {
        return this.viewState;
    }

    public tv.P<Boolean> J() {
        return this._isValid;
    }

    public final void K(g action) {
        PickupPersonViewState value;
        PickupPersonViewState value2;
        PickupPersonViewState value3;
        Intrinsics.j(action, "action");
        if (action instanceof g.SetFirstName) {
            g.SetFirstName setFirstName = (g.SetFirstName) action;
            O(PickupPerson.b(G(), String.valueOf(setFirstName.getFirstName()), null, null, null, 14, null), setFirstName.getOptIn());
            return;
        }
        if (action instanceof g.SetLastName) {
            g.SetLastName setLastName = (g.SetLastName) action;
            O(PickupPerson.b(G(), null, String.valueOf(setLastName.getLastName()), null, null, 13, null), setLastName.getOptIn());
            return;
        }
        if (action instanceof g.SetEmailAddress) {
            g.SetEmailAddress setEmailAddress = (g.SetEmailAddress) action;
            O(PickupPerson.b(G(), null, null, String.valueOf(setEmailAddress.getEmailAddress()), null, 11, null), setEmailAddress.getOptIn());
            return;
        }
        if (action instanceof g.SetPhoneNumber) {
            g.SetPhoneNumber setPhoneNumber = (g.SetPhoneNumber) action;
            O(PickupPerson.b(G(), null, null, null, String.valueOf(setPhoneNumber.getPhoneNumber()), 7, null), setPhoneNumber.getOptIn());
            return;
        }
        if (action instanceof g.c) {
            InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
            do {
                value3 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value3, PickupPersonViewState.f(value3, null, null, null, null, null, false, false, null, null, null, null, null, false, true, false, false, null, 90111, null)));
            return;
        }
        if (action instanceof g.b) {
            if (this.featureManager.e(AbstractC18227f.i0.f170583h)) {
                InterfaceC17140B<PickupPersonViewState> interfaceC17140B2 = this._viewState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, PickupPersonViewState.f(value2, null, null, this.initialEmailAddress, this.initialPhoneNumber, this.initialAgreedToTermsAndConditions, false, false, null, null, null, null, null, false, false, false, false, null, 122851, null)));
                return;
            } else {
                InterfaceC17140B<PickupPersonViewState> interfaceC17140B3 = this._viewState;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, false, null, 122879, null)));
                return;
            }
        }
        if (action instanceof g.i) {
            PickupPersonViewState value4 = this.flow.c().getValue();
            yo.k kVar = this.userManager;
            String strE = value4.i().e();
            if (strE == null) {
                strE = "";
            }
            kVar.Y(strE);
            yo.k kVar2 = this.userManager;
            String strE2 = value4.p().e();
            kVar2.Z(strE2 != null ? strE2 : "");
            return;
        }
        if (action instanceof g.UpdateFlow) {
            g.UpdateFlow updateFlow = (g.UpdateFlow) action;
            N(updateFlow.getIsEditMode(), updateFlow.getIsBopasTimeSlot());
            return;
        }
        if (action instanceof g.SetOptIn) {
            O(G(), ((g.SetOptIn) action).getOptIn());
            return;
        }
        if (action instanceof g.m) {
            Z();
            return;
        }
        if (action instanceof g.n) {
            this.flow.a(h.c.f104313a);
            return;
        }
        if (action instanceof g.ValidateEachField) {
            g.ValidateEachField validateEachField = (g.ValidateEachField) action;
            Y(this._viewState.getValue(), validateEachField.getIsFirstNameFocused(), validateEachField.getIsLastNameFocused(), validateEachField.getIsEmailFocused(), validateEachField.getIsPhoneNumberFocused());
        } else if (action instanceof g.ValidateAllField) {
            g.ValidateAllField validateAllField = (g.ValidateAllField) action;
            X(this._viewState.getValue(), validateAllField.getIsEmailFocused(), validateAllField.getIsPhoneNumberFocused());
        } else {
            if (!(action instanceof g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            R(false);
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void E(PickupPersonViewState viewState) {
        List<Validation<? extends Object>> listA = viewState.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Validation validation = (Validation) it.next();
            i iVar = null;
            if (!validation.getIsValid()) {
                if (Intrinsics.e(validation, viewState.j())) {
                    iVar = i.f104314a;
                } else if (Intrinsics.e(validation, viewState.m())) {
                    iVar = i.f104315b;
                } else if (Intrinsics.e(validation, viewState.i())) {
                    iVar = i.f104316c;
                } else if (Intrinsics.e(validation, viewState.p())) {
                    iVar = i.f104317d;
                } else if (Intrinsics.e(validation, viewState.g())) {
                    iVar = i.f104318e;
                }
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        InterfaceC17140B<PickupPersonViewState> interfaceC17140B = this._viewState;
        while (true) {
            PickupPersonViewState value = interfaceC17140B.getValue();
            ArrayList arrayList2 = arrayList;
            if (interfaceC17140B.e(value, PickupPersonViewState.f(value, null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, false, arrayList2, 65535, null))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    private final boolean I(PickupPersonViewState pickupPersonViewState) {
        String firstName;
        String lastName;
        String email;
        String strE = pickupPersonViewState.p().e();
        String str = "";
        if (strE == null) {
            strE = "";
        }
        if (strE.length() <= 0) {
            return false;
        }
        PickupPerson initialPickupPerson = pickupPersonViewState.getInitialPickupPerson();
        String phoneNumber = null;
        if (initialPickupPerson != null) {
            firstName = initialPickupPerson.getFirstName();
        } else {
            firstName = null;
        }
        if (firstName == null) {
            firstName = "";
        }
        String strE2 = pickupPersonViewState.j().e();
        if (strE2 == null) {
            strE2 = "";
        }
        if (firstName.contentEquals(strE2)) {
            PickupPerson initialPickupPerson2 = pickupPersonViewState.getInitialPickupPerson();
            if (initialPickupPerson2 != null) {
                lastName = initialPickupPerson2.getLastName();
            } else {
                lastName = null;
            }
            if (lastName == null) {
                lastName = "";
            }
            String strE3 = pickupPersonViewState.m().e();
            if (strE3 == null) {
                strE3 = "";
            }
            if (lastName.contentEquals(strE3)) {
                PickupPerson initialPickupPerson3 = pickupPersonViewState.getInitialPickupPerson();
                if (initialPickupPerson3 != null) {
                    email = initialPickupPerson3.getEmail();
                } else {
                    email = null;
                }
                if (email == null) {
                    email = "";
                }
                String strE4 = pickupPersonViewState.i().e();
                if (strE4 == null) {
                    strE4 = "";
                }
                if (email.contentEquals(strE4)) {
                    PickupPerson initialPickupPerson4 = pickupPersonViewState.getInitialPickupPerson();
                    if (initialPickupPerson4 != null) {
                        phoneNumber = initialPickupPerson4.getPhoneNumber();
                    }
                    if (phoneNumber != null) {
                        str = phoneNumber;
                    }
                    if (str.contentEquals(this.checkoutRepository.r(pickupPersonViewState.p()))) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
      0x0030: PHI (r2v9 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i) = 
      (r2v7 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v7 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v8 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v10 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
     binds: [B:23:0x0061, B:24:0x0063, B:15:0x003e, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r24, boolean r25, boolean r26) {
        /*
            r23 = this;
            java.util.List r0 = r24.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()
            Hk.b r2 = (Hk.Validation) r2
            boolean r3 = r2.getIsValid()
            r4 = 0
            if (r3 != 0) goto L66
            Hk.b r3 = r24.i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 == 0) goto L32
            com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i r2 = com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.i.f104316c
            if (r25 == 0) goto L66
        L30:
            r4 = r2
            goto L66
        L32:
            Hk.b r3 = r24.p()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 == 0) goto L41
            com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i r2 = com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.i.f104317d
            if (r26 == 0) goto L66
            goto L30
        L41:
            Hk.b r3 = r24.g()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r2 == 0) goto L66
            com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i r2 = com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.i.f104318e
            Hk.b r3 = r24.i()
            boolean r3 = r3.getIsValid()
            if (r3 != 0) goto L59
            if (r25 == 0) goto L66
        L59:
            Hk.b r3 = r24.p()
            boolean r3 = r3.getIsValid()
            if (r3 != 0) goto L30
            if (r26 == 0) goto L66
            goto L30
        L66:
            if (r4 == 0) goto Lf
            r1.add(r4)
            goto Lf
        L6c:
            r2 = r23
            tv.B<com.meijer.mobile.meijer.activity.checkout.pickupperson.N> r0 = r2._viewState
        L70:
            java.lang.Object r3 = r0.getValue()
            r18 = r1
            r1 = r3
            com.meijer.mobile.meijer.activity.checkout.pickupperson.N r1 = (com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState) r1
            r19 = 65535(0xffff, float:9.1834E-41)
            r20 = 0
            r2 = 0
            r4 = r3
            r3 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r21 = r17
            r17 = 0
            r22 = r21
            com.meijer.mobile.meijer.activity.checkout.pickupperson.N r1 = com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = r22
            boolean r1 = r0.e(r4, r1)
            if (r1 == 0) goto Lb1
            return
        Lb1:
            r2 = r23
            r1 = r18
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.X(com.meijer.mobile.meijer.activity.checkout.pickupperson.N, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
      0x0030: PHI (r2v11 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i) = 
      (r2v7 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v7 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v8 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v9 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v10 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
      (r2v12 com.meijer.mobile.meijer.activity.checkout.pickupperson.p$i)
     binds: [B:39:0x0098, B:40:0x009a, B:25:0x005d, B:20:0x004e, B:15:0x003f, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y(com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonViewState r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p.Y(com.meijer.mobile.meijer.activity.checkout.pickupperson.N, boolean, boolean, boolean, boolean):void");
    }

    private final void a0() {
        String strC = Ds.g.c(G().getPhoneNumber());
        if (strC == null) {
            strC = "-1";
        }
        C16648k.d(d0.a(this), null, null, new j(strC, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object v(C11932p c11932p, PickupPersonViewState pickupPersonViewState, Continuation continuation) {
        c11932p.P(pickupPersonViewState);
        return Unit.f142422a;
    }
}

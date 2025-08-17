package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Hk.Validation;
import Hk.d;
import androidx.view.InterfaceC6015f;
import androidx.view.c0;
import androidx.view.d0;
import ci.CustomerAddress;
import ci.Region;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.LocationData;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.SlotData;
import ej.ShoppingCart;
import fj.ContactInformation;
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
import uw.a;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004PXUSB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010 J!\u0010-\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010 J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020%H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020%H\u0002¢\u0006\u0004\b7\u00103J\u000f\u00108\u001a\u00020\u0014H\u0014¢\u0006\u0004\b8\u0010 J\u0015\u0010;\u001a\u00020\u00142\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR#\u0010M\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020%0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020%0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020!0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u001dR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020%0]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010a¨\u0006k"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Ljl/t;", "checkoutRepository", "Lqh/b;", "accountLinkingRepository", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "Ljl/d;", "checkoutFlowRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Ljl/t;Lqh/b;Lyo/k;Lyl/k;Ljl/d;Lgi/a;)V", "Ljl/f;", "checkoutFlowState", "", "L", "(Ljl/f;)V", "Ljl/v;", "checkoutState", "M", "(Ljl/v;)V", "Lfj/a;", "contactInformation", "Z", "(Lfj/a;)V", "Y", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "viewState", "G", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)V", "", "isEmailFocused", "isPhoneNumberFocused", "X", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;ZZ)V", "P", "F", "optIn", "N", "(Lfj/a;Z)V", "R", "T", "isEditMode", "O", "(Z)V", "editPhoneNumber", "V", "isContactInfoProvided", "Q", "onCleared", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "action", "K", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;)V", "a", "Ljl/t;", "b", "Lqh/b;", "c", "Lyo/k;", "d", "Lyl/k;", "e", "Lgi/a;", "LLk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "f", "LLk/b;", "H", "()LLk/b;", "flow", "LHk/b;", "", "g", "LHk/b;", "initialEmailAddress", "h", "initialPhoneNumber", "i", "initialAgreedToTermsAndConditions", "Ltv/B;", "j", "Ltv/B;", "_isValid", "k", "_viewState", "Ltv/P;", "l", "Ltv/P;", "I", "()Ltv/P;", "m", "isContactInfoSet", "LNu/a;", "n", "LNu/a;", "disposables", "J", "isValid", "o", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class H extends c0 implements InterfaceC6015f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f102366p = 8;

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
    private final Lk.b<DeliveryContactInformationViewState, j> flow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Validation<String> initialEmailAddress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Validation<String> initialPhoneNumber;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Validation<Boolean> initialAgreedToTermsAndConditions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _isValid;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<DeliveryContactInformationViewState> _viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final tv.P<DeliveryContactInformationViewState> viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isContactInfoSet;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, H.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((H) this.receiver).M(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, H.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((H) this.receiver).L(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState checkoutFlowState) {
            a(checkoutFlowState);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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
    /* synthetic */ class e extends AdaptedFunctionReference implements Function2<DeliveryContactInformationViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        e(Object obj) {
            super(2, obj, Lk.b.class, "update", "update(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeliveryContactInformationViewState deliveryContactInformationViewState, Continuation<? super Unit> continuation) {
            return H.x((Lk.b) this.f142801a, deliveryContactInformationViewState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormViewModel$6", f = "DeliveryContactInformationFormViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function3<InterfaceC17153g<? super DeliveryContactInformationViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102381a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f102382b;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super DeliveryContactInformationViewState> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.f102382b = th2;
            return fVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f102381a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.e((Throwable) this.f102382b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "<init>", "()V", "g", "j", "k", "d", "e", "c", "a", "b", "m", "f", "i", "h", "l", "n", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$l;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$m;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$n;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final a f102383a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -614171300;
            }

            public String toString() {
                return "EditContactInfo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final b f102384a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 743907718;
            }

            public String toString() {
                return "OnCancelClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final c f102385a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1201712125;
            }

            public String toString() {
                return "OnEditIconClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final d f102386a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -728112870;
            }

            public String toString() {
                return "OnReadAgreementClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final e f102387a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1590732742;
            }

            public String toString() {
                return "SetContactInformation";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "emailAddress", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$f, reason: from toString */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$g, reason: collision with other inner class name */
        public static final /* data */ class C1443g extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final C1443g f102390a = new C1443g();

            private C1443g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1443g);
            }

            public int hashCode() {
                return 1828119350;
            }

            public String toString() {
                return "SetInitialContactInformation";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "optIn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$h, reason: from toString */
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "phoneNumber", "", "optIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$i, reason: from toString */
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final j f102394a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -439683245;
            }

            public String toString() {
                return "StartValidation";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final k f102395a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return -1323880520;
            }

            public String toString() {
                return "StoreExistingFieldValues";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$l;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "editPhoneNumber", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$l, reason: from toString */
        public static final /* data */ class TrackUpdateTextAlertAction extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean editPhoneNumber;

            public TrackUpdateTextAlertAction(boolean z10) {
                super(null);
                this.editPhoneNumber = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrackUpdateTextAlertAction) && this.editPhoneNumber == ((TrackUpdateTextAlertAction) other).editPhoneNumber;
            }

            public int hashCode() {
                return Boolean.hashCode(this.editPhoneNumber);
            }

            public String toString() {
                return "TrackUpdateTextAlertAction(editPhoneNumber=" + this.editPhoneNumber + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getEditPhoneNumber() {
                return this.editPhoneNumber;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$m;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "isEditMode", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$m, reason: from toString */
        public static final /* data */ class UpdateFlow extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEditMode;

            public UpdateFlow(boolean z10) {
                super(null);
                this.isEditMode = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateFlow) && this.isEditMode == ((UpdateFlow) other).isEditMode;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEditMode);
            }

            public String toString() {
                return "UpdateFlow(isEditMode=" + this.isEditMode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsEditMode() {
                return this.isEditMode;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$n;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "isEmailFocused", "isPhoneNumberFocused", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$n, reason: from toString */
        public static final /* data */ class ValidateEachField extends g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEmailFocused;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPhoneNumberFocused;

            public ValidateEachField(boolean z10, boolean z11) {
                super(null);
                this.isEmailFocused = z10;
                this.isPhoneNumberFocused = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateEachField)) {
                    return false;
                }
                ValidateEachField validateEachField = (ValidateEachField) other;
                return this.isEmailFocused == validateEachField.isEmailFocused && this.isPhoneNumberFocused == validateEachField.isPhoneNumberFocused;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isEmailFocused) * 31) + Boolean.hashCode(this.isPhoneNumberFocused);
            }

            public String toString() {
                return "ValidateEachField(isEmailFocused=" + this.isEmailFocused + ", isPhoneNumberFocused=" + this.isPhoneNumberFocused + ')';
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

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f102400a = new i("EMAIL_ADDRESS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final i f102401b = new i("PHONE_NUMBER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final i f102402c = new i("TERMS_OF_SERVICE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ i[] f102403d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f102404e;

        private static final /* synthetic */ i[] a() {
            return new i[]{f102400a, f102401b, f102402c};
        }

        static {
            i[] iVarArrA = a();
            f102403d = iVarArrA;
            f102404e = EnumEntriesKt.a(iVarArrA);
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f102403d.clone();
        }

        private i(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "", "<init>", "()V", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f102405a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1380210986;
            }

            public String toString() {
                return "ProceedToNextStepEvent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final b f102406a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -101686056;
            }

            public String toString() {
                return "TextUpdateDialogEvent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$c;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final c f102407a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 894899529;
            }

            public String toString() {
                return "ViewTermsAndConditionsEvent";
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormViewModel$validatePhoneNumber$2", f = "DeliveryContactInformationFormViewModel.kt", l = {195}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f102408a;

        /* renamed from: b, reason: collision with root package name */
        int f102409b;

        /* renamed from: c, reason: collision with root package name */
        int f102410c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f102411d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f102413f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContactInformation f102414g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = H.this.new k(this.f102413f, this.f102414g, continuation);
            kVar.f102411d = obj;
            return kVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ContactInformation contactInformation, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f102413f = str;
            this.f102414g = contactInformation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102410c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f102411d;
                    H h10 = H.this;
                    String str = this.f102413f;
                    Result.Companion companion = Result.INSTANCE;
                    C16527b c16527b = h10.accountLinkingRepository;
                    this.f102411d = interfaceC16622O;
                    this.f102408a = interfaceC16622O;
                    this.f102409b = 0;
                    this.f102410c = 1;
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
            H h11 = H.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                h11.F();
                h11.K(new g.TrackUpdateTextAlertAction(false));
                h11.K(g.e.f102387a);
                uw.a.INSTANCE.f(thE, "Error validating phone number", new Object[0]);
            }
            H h12 = H.this;
            ContactInformation contactInformation = this.f102414g;
            if (Result.h(objB)) {
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                h12.F();
                if (zBooleanValue) {
                    h12.P(contactInformation);
                } else {
                    h12.H().a(j.b.f102406a);
                }
            }
            return Unit.f142422a;
        }
    }

    public H(jl.t checkoutRepository, C16527b accountLinkingRepository, yo.k userManager, yl.k featureManager, jl.d checkoutFlowRepository, InterfaceC14261a analyticsEngine) {
        DeliveryContactInformationViewState value;
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
        DefaultConstructorMarker defaultConstructorMarker = null;
        Validation validation = null;
        Validation validation2 = null;
        Validation validation3 = null;
        OrderTypeHeaderDataDecorator orderTypeHeaderDataDecorator = null;
        SlotData slotData = null;
        LocationData locationData = null;
        boolean z10 = false;
        boolean z11 = false;
        CheckoutFlowState checkoutFlowState = null;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        List list = null;
        Lk.b<DeliveryContactInformationViewState, j> bVar = new Lk.b<>(new DeliveryContactInformationViewState(validation, validation2, validation3, orderTypeHeaderDataDecorator, slotData, locationData, z10, false, z11, checkoutFlowState, z12, z13, z14, list, 16383, defaultConstructorMarker));
        this.flow = bVar;
        this.initialEmailAddress = new Validation<>("", null, 2, null);
        this.initialPhoneNumber = new Validation<>("", null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.initialAgreedToTermsAndConditions = new Validation<>(bool, null, 2, null);
        this._isValid = tv.S.a(bool);
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140BA = tv.S.a(new DeliveryContactInformationViewState(validation, validation2, validation3, orderTypeHeaderDataDecorator, slotData, locationData, z10, true, z11, checkoutFlowState, z12, z13, z14, list, 16255, defaultConstructorMarker));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarS = checkoutRepository.s();
        final a aVar2 = new a(this);
        Pu.g<? super CheckoutState> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.D
            @Override // Pu.g
            public final void accept(Object obj) {
                H.t(aVar2, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final b bVar2 = new b(companion);
        Ck.a.a(lVarS.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.E
            @Override // Pu.g
            public final void accept(Object obj) {
                H.u(bVar2, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Pu.g<? super CheckoutFlowState> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.F
            @Override // Pu.g
            public final void accept(Object obj) {
                H.v(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Ck.a.a(lVarG.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.G
            @Override // Pu.g
            public final void accept(Object obj) {
                H.w(dVar, obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(interfaceC17140BA, new e(bVar)), new f(null)), d0.a(this));
        do {
            value = interfaceC17140BA.getValue();
        } while (!interfaceC17140BA.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, this._viewState.getValue().v(), false, false, null, 15359, null)));
        this.initialEmailAddress = this.flow.c().getValue().m();
        this.initialPhoneNumber = this.flow.c().getValue().p();
        this.initialAgreedToTermsAndConditions = this.flow.c().getValue().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        DeliveryContactInformationViewState value;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, null, 16255, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(CheckoutFlowState checkoutFlowState) {
        DeliveryContactInformationViewState value;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, checkoutFlowState, false, false, false, null, 15871, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(CheckoutState checkoutState) {
        DeliveryContactInformationViewState value;
        DeliveryContactInformationViewState deliveryContactInformationViewState;
        LocalDate date;
        LocalTime startTime;
        FulfillmentSlot fulfillmentSlotE;
        DeliveryContactInformationViewState value2;
        DeliveryContactInformationViewState value3;
        DeliveryContactInformationViewState deliveryContactInformationViewState2;
        LocationData locationData;
        String line1;
        String strB0;
        String partnerEligibility;
        Region region;
        Region region2;
        DeliveryContactInformationViewState value4;
        Validation<ContactInformation> validationJ = checkoutState.j();
        if (!(validationJ.getResult() instanceof d.c)) {
            K(g.C1443g.f102390a);
        } else if (this.isContactInfoSet) {
            this.isContactInfoSet = false;
            F();
            if (this.featureManager.e(AbstractC18227f.i0.f170583h)) {
                Q(true);
                InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
                do {
                    value4 = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value4, DeliveryContactInformationViewState.i(value4, null, null, null, null, null, null, false, false, false, null, false, false, false, null, 15359, null)));
            } else {
                this.flow.a(j.a.f102405a);
            }
        } else {
            N(validationJ.e(), false);
        }
        Validation<FulfillmentSlot> validationX = checkoutState.x();
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B2 = this._viewState;
        do {
            value = interfaceC17140B2.getValue();
            deliveryContactInformationViewState = value;
            FulfillmentSlot fulfillmentSlotE2 = validationX.e();
            date = fulfillmentSlotE2 != null ? fulfillmentSlotE2.getDate() : null;
            FulfillmentSlot fulfillmentSlotE3 = validationX.e();
            startTime = fulfillmentSlotE3 != null ? fulfillmentSlotE3.getStartTime() : null;
            fulfillmentSlotE = validationX.e();
        } while (!interfaceC17140B2.e(value, DeliveryContactInformationViewState.i(deliveryContactInformationViewState, null, null, null, null, new SlotData(date, startTime, fulfillmentSlotE != null ? fulfillmentSlotE.getEndTime() : null), null, false, false, false, null, false, false, false, null, 16367, null)));
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B3 = this._viewState;
            do {
                value3 = interfaceC17140B3.getValue();
                deliveryContactInformationViewState2 = value3;
                CustomerAddress deliveryAddress = shoppingCartE.getDeliveryAddress();
                String line2 = deliveryAddress != null ? deliveryAddress.getLine2() : null;
                if (line2 == null || line2.length() == 0) {
                    CustomerAddress deliveryAddress2 = shoppingCartE.getDeliveryAddress();
                    line1 = deliveryAddress2 != null ? deliveryAddress2.getLine1() : null;
                    if (line1 == null) {
                        line1 = "";
                    }
                } else {
                    CustomerAddress deliveryAddress3 = shoppingCartE.getDeliveryAddress();
                    String line12 = deliveryAddress3 != null ? deliveryAddress3.getLine1() : null;
                    if (line12 == null) {
                        line12 = "";
                    }
                    CustomerAddress deliveryAddress4 = shoppingCartE.getDeliveryAddress();
                    String line22 = deliveryAddress4 != null ? deliveryAddress4.getLine2() : null;
                    if (line22 == null) {
                        line22 = "";
                    }
                    line1 = CollectionsKt.B0(CollectionsKt.p(line12, line22), ", ", null, null, 0, null, null, 62, null);
                }
                CustomerAddress deliveryAddress5 = shoppingCartE.getDeliveryAddress();
                String isoCodeShort = (deliveryAddress5 == null || (region2 = deliveryAddress5.getRegion()) == null) ? null : region2.getIsoCodeShort();
                if (isoCodeShort == null || isoCodeShort.length() == 0) {
                    CustomerAddress deliveryAddress6 = shoppingCartE.getDeliveryAddress();
                    String town = deliveryAddress6 != null ? deliveryAddress6.getTown() : null;
                    CustomerAddress deliveryAddress7 = shoppingCartE.getDeliveryAddress();
                    strB0 = CollectionsKt.B0(CollectionsKt.p(town, deliveryAddress7 != null ? deliveryAddress7.getPostalCode() : null), ", ", null, null, 0, null, null, 62, null);
                } else {
                    CustomerAddress deliveryAddress8 = shoppingCartE.getDeliveryAddress();
                    String town2 = deliveryAddress8 != null ? deliveryAddress8.getTown() : null;
                    CustomerAddress deliveryAddress9 = shoppingCartE.getDeliveryAddress();
                    String isoCodeShort2 = (deliveryAddress9 == null || (region = deliveryAddress9.getRegion()) == null) ? null : region.getIsoCodeShort();
                    String str = isoCodeShort2 != null ? isoCodeShort2 : "";
                    CustomerAddress deliveryAddress10 = shoppingCartE.getDeliveryAddress();
                    strB0 = CollectionsKt.B0(CollectionsKt.p(town2, str, deliveryAddress10 != null ? deliveryAddress10.getPostalCode() : null), ", ", null, null, 0, null, null, 62, null);
                }
                locationData = new LocationData(line1, strB0, String.valueOf(shoppingCartE.getPointOfService().getDisplayName()), "delivery");
                partnerEligibility = shoppingCartE.getPartnerEligibility();
            } while (!interfaceC17140B3.e(value3, DeliveryContactInformationViewState.i(deliveryContactInformationViewState2, null, null, null, null, null, locationData, false, false, false, null, false, false, partnerEligibility != null ? Intrinsics.e(partnerEligibility, ej.o.f128952f.getPartnerName()) : false, null, 12255, null)));
        }
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B4 = this._viewState;
        do {
            value2 = interfaceC17140B4.getValue();
        } while (!interfaceC17140B4.e(value2, DeliveryContactInformationViewState.i(value2, null, null, null, OrderTypeHeaderDataDecorator.INSTANCE.a(this._viewState.getValue().getSlotData(), this._viewState.getValue().getLocationData(), this._viewState.getValue().getIsBunchaOrder()), null, null, false, false, false, null, false, false, false, null, 16375, null)));
    }

    private final void N(ContactInformation contactInformation, boolean optIn) {
        DeliveryContactInformationViewState value;
        if (contactInformation != null) {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, new P(contactInformation.getEmailAddress(), contactInformation.getPhoneNumber(), optIn).b(value)));
        }
    }

    private final void O(boolean isEditMode) {
        DeliveryContactInformationViewState value;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, isEditMode, false, false, null, false, false, false, null, 16319, null)));
        if (isEditMode) {
            T();
        } else {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(ContactInformation contactInformation) {
        DeliveryContactInformationViewState value;
        this.initialEmailAddress = this.flow.c().getValue().m();
        this.initialPhoneNumber = this.flow.c().getValue().p();
        this.initialAgreedToTermsAndConditions = this.flow.c().getValue().j();
        this.isContactInfoSet = true;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, true, false, null, false, false, false, null, 16255, null)));
        N(contactInformation, true);
        K(g.k.f102395a);
        this.checkoutRepository.K(contactInformation);
    }

    private final void Q(boolean isContactInfoProvided) {
        DeliveryContactInformationViewState value;
        Boolean value2;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, isContactInfoProvided, null, false, false, false, null, 15999, null)));
        InterfaceC17140B<Boolean> interfaceC17140B2 = this._isValid;
        do {
            value2 = interfaceC17140B2.getValue();
            value2.getClass();
        } while (!interfaceC17140B2.e(value2, Boolean.valueOf(isContactInfoProvided)));
    }

    private final void R() {
        this.analyticsEngine.h(C14476c.h("Meijer: Contact info selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.S((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout contact info");
        track.h("fulfillmentType", "delivery");
        return Unit.f142422a;
    }

    private final void T() {
        this.analyticsEngine.h(C14476c.h("Meijer:Edit Delivery Contact Info"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.U((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout edit contact info");
        return Unit.f142422a;
    }

    private final void V(final boolean editPhoneNumber) {
        this.analyticsEngine.h(C14476c.a("Meijer: Contact info selection Invalid Number Alert"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.W(editPhoneNumber, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Meijer: Contact info selection Invalid Number Alert");
        track.h("textPhoneRevalidateMessage", z10 ? "Re-enter valid number" : "continue without");
        return Unit.f142422a;
    }

    private final void Y() {
        DeliveryContactInformationViewState value;
        DeliveryContactInformationViewState deliveryContactInformationViewState;
        DeliveryContactInformationViewState value2 = this.flow.c().getValue();
        if (value2.isValid()) {
            Z(new ContactInformation(value2.m().e(), value2.p().e()));
            return;
        }
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            deliveryContactInformationViewState = value;
        } while (!interfaceC17140B.e(value, deliveryContactInformationViewState));
        G(deliveryContactInformationViewState);
    }

    private final void Z(ContactInformation contactInformation) {
        DeliveryContactInformationViewState value;
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, true, false, null, false, false, false, null, 16255, null)));
        String strC = Ds.g.c(contactInformation.getPhoneNumber());
        if (strC == null) {
            strC = "-1";
        }
        C16648k.d(d0.a(this), null, null, new k(strC, contactInformation, null), 3, null);
    }

    public final Lk.b<DeliveryContactInformationViewState, j> H() {
        return this.flow;
    }

    public final tv.P<DeliveryContactInformationViewState> I() {
        return this.viewState;
    }

    public tv.P<Boolean> J() {
        return this._isValid;
    }

    public final void K(g action) {
        DeliveryContactInformationViewState value;
        DeliveryContactInformationViewState value2;
        DeliveryContactInformationViewState value3;
        DeliveryContactInformationViewState value4;
        Intrinsics.j(action, "action");
        if (action instanceof g.C1443g) {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
            do {
                value4 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value4, new P(this.userManager.h(), this.userManager.B().length() > 0 ? this.userManager.B() : this.userManager.e(), false).b(value4)));
            return;
        }
        if (action instanceof g.e) {
            DeliveryContactInformationViewState value5 = this.flow.c().getValue();
            String strE = value5.m().e();
            if (strE == null) {
                strE = "";
            }
            String strE2 = value5.p().e();
            P(new ContactInformation(strE, strE2 != null ? strE2 : ""));
            return;
        }
        if (action instanceof g.SetEmailAddress) {
            g.SetEmailAddress setEmailAddress = (g.SetEmailAddress) action;
            String emailAddress = setEmailAddress.getEmailAddress();
            String strE3 = this.flow.c().getValue().p().e();
            N(new ContactInformation(emailAddress, strE3 != null ? strE3 : ""), setEmailAddress.getOptIn());
            return;
        }
        if (action instanceof g.SetPhoneNumber) {
            String strE4 = this.flow.c().getValue().m().e();
            g.SetPhoneNumber setPhoneNumber = (g.SetPhoneNumber) action;
            N(new ContactInformation(strE4 != null ? strE4 : "", setPhoneNumber.getPhoneNumber()), setPhoneNumber.getOptIn());
            return;
        }
        if (action instanceof g.SetOptIn) {
            DeliveryContactInformationViewState value6 = this.flow.c().getValue();
            String strE5 = value6.m().e();
            if (strE5 == null) {
                strE5 = "";
            }
            String strE6 = value6.p().e();
            N(new ContactInformation(strE5, strE6 != null ? strE6 : ""), ((g.SetOptIn) action).getOptIn());
            return;
        }
        if (action instanceof g.k) {
            DeliveryContactInformationViewState value7 = this.flow.c().getValue();
            yo.k kVar = this.userManager;
            String strE7 = value7.m().e();
            if (strE7 == null) {
                strE7 = "";
            }
            kVar.Y(strE7);
            yo.k kVar2 = this.userManager;
            String strE8 = value7.p().e();
            kVar2.Z(strE8 != null ? strE8 : "");
            return;
        }
        if (action instanceof g.j) {
            Y();
            return;
        }
        if (action instanceof g.d) {
            this.flow.a(j.c.f102407a);
            return;
        }
        if (action instanceof g.c) {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B2 = this._viewState;
            do {
                value3 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value3, DeliveryContactInformationViewState.i(value3, null, null, null, null, null, null, false, false, false, null, true, false, false, null, 15103, null)));
            return;
        }
        if (action instanceof g.UpdateFlow) {
            O(((g.UpdateFlow) action).getIsEditMode());
            return;
        }
        if (action instanceof g.TrackUpdateTextAlertAction) {
            V(((g.TrackUpdateTextAlertAction) action).getEditPhoneNumber());
            return;
        }
        if (action instanceof g.ValidateEachField) {
            g.ValidateEachField validateEachField = (g.ValidateEachField) action;
            X(this._viewState.getValue(), validateEachField.getIsEmailFocused(), validateEachField.getIsPhoneNumberFocused());
            return;
        }
        if (action instanceof g.a) {
            Q(false);
            return;
        }
        if (!(action instanceof g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.featureManager.e(AbstractC18227f.i0.f170583h)) {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B3 = this._viewState;
            do {
                value2 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value2, DeliveryContactInformationViewState.i(value2, this.initialEmailAddress, this.initialPhoneNumber, this.initialAgreedToTermsAndConditions, null, null, null, false, false, false, null, false, false, false, null, 15352, null)));
        } else {
            InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B4 = this._viewState;
            do {
                value = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, null, 15359, null)));
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void G(DeliveryContactInformationViewState viewState) {
        DeliveryContactInformationViewState value;
        List<Validation<? extends Object>> listA = viewState.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Validation validation = (Validation) it.next();
            i iVar = null;
            if (!validation.getIsValid()) {
                if (Intrinsics.e(validation, viewState.m())) {
                    iVar = i.f102400a;
                } else if (Intrinsics.e(validation, viewState.p())) {
                    iVar = i.f102401b;
                } else if (Intrinsics.e(validation, viewState.j())) {
                    iVar = i.f102402c;
                }
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        InterfaceC17140B<DeliveryContactInformationViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, arrayList, 8191, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1
      0x0030: PHI (r1v12 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i) = 
      (r1v10 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r1v10 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r1v11 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r1v13 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
     binds: [B:23:0x0061, B:24:0x0063, B:15:0x003e, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            java.util.List r0 = r21.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            Hk.b r1 = (Hk.Validation) r1
            boolean r2 = r1.getIsValid()
            r3 = 0
            if (r2 != 0) goto L66
            Hk.b r2 = r21.m()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r2 == 0) goto L32
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f102400a
            if (r22 == 0) goto L66
        L30:
            r3 = r1
            goto L66
        L32:
            Hk.b r2 = r21.p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r2 == 0) goto L41
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f102401b
            if (r23 == 0) goto L66
            goto L30
        L41:
            Hk.b r2 = r21.j()
            boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r1 == 0) goto L66
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f102402c
            Hk.b r2 = r21.m()
            boolean r2 = r2.getIsValid()
            if (r2 != 0) goto L59
            if (r22 == 0) goto L66
        L59:
            Hk.b r2 = r21.p()
            boolean r2 = r2.getIsValid()
            if (r2 != 0) goto L30
            if (r23 == 0) goto L66
            goto L30
        L66:
            if (r3 == 0) goto Lf
            r15.add(r3)
            goto Lf
        L6c:
            r1 = r20
            tv.B<com.meijer.mobile.meijer.activity.checkout.contactinformation.O> r0 = r1._viewState
        L70:
            java.lang.Object r2 = r0.getValue()
            r1 = r2
            com.meijer.mobile.meijer.activity.checkout.contactinformation.O r1 = (com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState) r1
            r16 = 8191(0x1fff, float:1.1478E-41)
            r17 = 0
            r3 = r2
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
            r18 = r14
            r14 = 0
            r19 = r18
            com.meijer.mobile.meijer.activity.checkout.contactinformation.O r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r19
            boolean r1 = r0.e(r3, r1)
            if (r1 == 0) goto La5
            return
        La5:
            r1 = r20
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.H.X(com.meijer.mobile.meijer.activity.checkout.contactinformation.O, boolean, boolean):void");
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
    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object x(Lk.b bVar, DeliveryContactInformationViewState deliveryContactInformationViewState, Continuation continuation) {
        bVar.d(deliveryContactInformationViewState);
        return Unit.f142422a;
    }
}

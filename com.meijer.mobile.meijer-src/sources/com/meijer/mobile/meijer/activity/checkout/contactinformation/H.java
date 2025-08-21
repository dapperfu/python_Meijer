package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Ik.Validation;
import Ik.d;
import androidx.view.InterfaceC6157f;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.LocationData;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.SlotData;
import com.meijer.mobile.singlepagecheckout.InitialContactInfo;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import di.CustomerAddress;
import di.Region;
import fj.ShoppingCart;
import gj.ContactInformation;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj.FulfillmentSlot;
import kl.CheckoutFlowState;
import kl.CheckoutState;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16562g;
import qw.a;
import rh.C16908b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004PXUSB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010 J!\u0010-\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010 J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020%H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020%H\u0002¢\u0006\u0004\b7\u00103J\u000f\u00108\u001a\u00020\u0014H\u0014¢\u0006\u0004\b8\u0010 J\u0015\u0010;\u001a\u00020\u00142\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR#\u0010M\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020%0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020!0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010QR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010(R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020%0W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010[¨\u0006e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "Lkl/t;", "checkoutRepository", "Lrh/b;", "accountLinkingRepository", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lkl/d;", "checkoutFlowRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lkl/t;Lrh/b;Lyo/k;Lzl/k;Lkl/d;Lhi/a;)V", "Lkl/f;", "checkoutFlowState", "", "N", "(Lkl/f;)V", "Lkl/v;", "checkoutState", "O", "(Lkl/v;)V", "Lgj/a;", "contactInformation", "b0", "(Lgj/a;)V", "a0", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "viewState", "I", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)V", "", "isEmailFocused", "isPhoneNumberFocused", "Z", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;ZZ)V", "R", "H", "optIn", "P", "(Lgj/a;Z)V", "T", "V", "isEditMode", "Q", "(Z)V", "editPhoneNumber", "X", "isContactInfoProvided", "S", "onCleared", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "action", "M", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;)V", "a", "Lkl/t;", "b", "Lrh/b;", "c", "Lyo/k;", "d", "Lzl/k;", "e", "Lhi/a;", "LMk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "f", "LMk/b;", "J", "()LMk/b;", "flow", "Lpv/B;", "Lcom/meijer/mobile/singlepagecheckout/m0;", "g", "Lpv/B;", "_initialPickupPersonSnapshot", "h", "_isValid", "i", "_viewState", "Lpv/P;", "j", "Lpv/P;", "K", "()Lpv/P;", "k", "isContactInfoSet", "LJu/a;", "l", "LJu/a;", "disposables", "L", "isValid", "m", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class H extends c0 implements InterfaceC6157f {

    /* renamed from: n, reason: collision with root package name */
    public static final int f103221n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kl.t checkoutRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16908b accountLinkingRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mk.b<DeliveryContactInformationViewState, j> flow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<InitialContactInfo> _initialPickupPersonSnapshot;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Boolean> _isValid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<DeliveryContactInformationViewState> _viewState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final pv.P<DeliveryContactInformationViewState> viewState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isContactInfoSet;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, H.class, "onNewCheckoutState", "onNewCheckoutState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((H) this.receiver).O(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<CheckoutFlowState, Unit> {
        c(Object obj) {
            super(1, obj, H.class, "onGetCheckoutFlowState", "onGetCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutFlowState;)V", 0);
        }

        public final void a(CheckoutFlowState p02) {
            Intrinsics.j(p02, "p0");
            ((H) this.receiver).N(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutFlowState checkoutFlowState) {
            a(checkoutFlowState);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends AdaptedFunctionReference implements Function2<DeliveryContactInformationViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        e(Object obj) {
            super(2, obj, Mk.b.class, "update", "update(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeliveryContactInformationViewState deliveryContactInformationViewState, Continuation<? super Unit> continuation) {
            return H.x((Mk.b) this.f143708a, deliveryContactInformationViewState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormViewModel$6", f = "DeliveryContactInformationFormViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function3<InterfaceC16562g<? super DeliveryContactInformationViewState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f103234a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f103235b;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super DeliveryContactInformationViewState> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.f103235b = th2;
            return fVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f103234a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f103235b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "<init>", "()V", "g", "j", "k", "d", "e", "c", "a", "b", "n", "m", "f", "i", "h", "l", "o", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$c;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$d;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$e;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$f;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$g;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$h;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$i;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$j;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$k;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$l;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$m;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$n;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103236a = new a();

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
            public static final b f103237a = new b();

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
            public static final c f103238a = new c();

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
            public static final d f103239a = new d();

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
            public static final e f103240a = new e();

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
        public static final /* data */ class C1452g extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final C1452g f103243a = new C1452g();

            private C1452g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1452g);
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
            public static final j f103247a = new j();

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
            public static final k f103248a = new k();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$n;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends g {

            /* renamed from: a, reason: collision with root package name */
            public static final n f103251a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public int hashCode() {
                return 1046358548;
            }

            public String toString() {
                return "UpdateNonTextablePhoneNumber";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g$o;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$g;", "", "isEmailFocused", "isPhoneNumberFocused", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.H$g$o, reason: from toString */
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
        public static final i f103254a = new i("EMAIL_ADDRESS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final i f103255b = new i("PHONE_NUMBER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final i f103256c = new i("TERMS_OF_SERVICE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ i[] f103257d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f103258e;

        private static final /* synthetic */ i[] a() {
            return new i[]{f103254a, f103255b, f103256c};
        }

        static {
            i[] iVarArrA = a();
            f103257d = iVarArrA;
            f103258e = EnumEntriesKt.a(iVarArrA);
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f103257d.clone();
        }

        private i(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "", "<init>", "()V", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j$a;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f103259a = new a();

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
            public static final b f103260a = new b();

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
            public static final c f103261a = new c();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormViewModel$validatePhoneNumber$2", f = "DeliveryContactInformationFormViewModel.kt", l = {HttpResponseStatus.SUCCESS_CREATED}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f103262a;

        /* renamed from: b, reason: collision with root package name */
        int f103263b;

        /* renamed from: c, reason: collision with root package name */
        int f103264c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f103265d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f103267f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContactInformation f103268g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = H.this.new k(this.f103267f, this.f103268g, continuation);
            kVar.f103265d = obj;
            return kVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ContactInformation contactInformation, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f103267f = str;
            this.f103268g = contactInformation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f103264c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f103265d;
                    H h10 = H.this;
                    String str = this.f103267f;
                    Result.Companion companion = Result.INSTANCE;
                    C16908b c16908b = h10.accountLinkingRepository;
                    this.f103265d = interfaceC15783O;
                    this.f103262a = interfaceC15783O;
                    this.f103263b = 0;
                    this.f103264c = 1;
                    obj = c16908b.a(str, this);
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
                h11.H();
                h11.M(new g.TrackUpdateTextAlertAction(false));
                h11.M(g.e.f103240a);
                qw.a.INSTANCE.f(thE, "Error validating phone number", new Object[0]);
            }
            H h12 = H.this;
            ContactInformation contactInformation = this.f103268g;
            if (Result.h(objB)) {
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                h12.H();
                if (zBooleanValue || (h12.featureManager.e(AbstractC18503f.i0.f172883h) && ((DeliveryContactInformationViewState) h12._viewState.getValue()).getByPassNonTextablePhoneNumber())) {
                    h12.R(contactInformation);
                } else {
                    h12.J().a(j.b.f103260a);
                }
            }
            return Unit.f143329a;
        }
    }

    public H(kl.t checkoutRepository, C16908b accountLinkingRepository, yo.k userManager, zl.k featureManager, kl.d checkoutFlowRepository, InterfaceC14523a analyticsEngine) {
        DeliveryContactInformationViewState value;
        InitialContactInfo value2;
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
        Mk.b<DeliveryContactInformationViewState, j> bVar = new Mk.b<>(new DeliveryContactInformationViewState(null, null, null, null, null, null, false, false, false, null, false, false, false, false, null, 32767, null));
        this.flow = bVar;
        this._initialPickupPersonSnapshot = pv.S.a(new InitialContactInfo(new Validation("", null, 2, null), new Validation("", null, 2, null)));
        this._isValid = pv.S.a(Boolean.FALSE);
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549BA = pv.S.a(new DeliveryContactInformationViewState(null, null, null, null, null, null, false, true, false, null, false, false, false, false, null, 32639, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        io.reactivex.l<CheckoutState> lVarS = checkoutRepository.s();
        final a aVar2 = new a(this);
        Lu.g<? super CheckoutState> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.D
            @Override // Lu.g
            public final void accept(Object obj) {
                H.t(aVar2, obj);
            }
        };
        a.Companion companion = qw.a.INSTANCE;
        final b bVar2 = new b(companion);
        Dk.a.a(lVarS.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.E
            @Override // Lu.g
            public final void accept(Object obj) {
                H.u(bVar2, obj);
            }
        }), aVar);
        io.reactivex.l<CheckoutFlowState> lVarG = checkoutFlowRepository.g();
        final c cVar = new c(this);
        Lu.g<? super CheckoutFlowState> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.F
            @Override // Lu.g
            public final void accept(Object obj) {
                H.v(cVar, obj);
            }
        };
        final d dVar = new d(companion);
        Dk.a.a(lVarG.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.G
            @Override // Lu.g
            public final void accept(Object obj) {
                H.w(dVar, obj);
            }
        }), aVar);
        C16563h.J(C16563h.g(C16563h.O(interfaceC16549BA, new e(bVar)), new f(null)), d0.a(this));
        do {
            value = interfaceC16549BA.getValue();
        } while (!interfaceC16549BA.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, this._viewState.getValue().w(), false, false, false, null, 31743, null)));
        InterfaceC16549B<InitialContactInfo> interfaceC16549B = this._initialPickupPersonSnapshot;
        do {
            value2 = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value2, value2.a(this.flow.c().getValue().n(), this.flow.c().getValue().q())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        DeliveryContactInformationViewState value;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, false, null, 32639, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(CheckoutFlowState checkoutFlowState) {
        DeliveryContactInformationViewState value;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, checkoutFlowState, false, false, false, false, null, 32255, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(CheckoutState checkoutState) {
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
            M(g.C1452g.f103243a);
        } else if (this.isContactInfoSet) {
            this.isContactInfoSet = false;
            H();
            if (this.featureManager.e(AbstractC18503f.i0.f172883h)) {
                S(true);
                InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
                do {
                    value4 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value4, DeliveryContactInformationViewState.i(value4, null, null, null, null, null, null, false, false, false, null, false, false, false, false, null, 31743, null)));
            } else {
                this.flow.a(j.a.f103259a);
            }
        } else {
            P(validationJ.e(), false);
        }
        Validation<FulfillmentSlot> validationX = checkoutState.x();
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B2 = this._viewState;
        do {
            value = interfaceC16549B2.getValue();
            deliveryContactInformationViewState = value;
            FulfillmentSlot fulfillmentSlotE2 = validationX.e();
            date = fulfillmentSlotE2 != null ? fulfillmentSlotE2.getDate() : null;
            FulfillmentSlot fulfillmentSlotE3 = validationX.e();
            startTime = fulfillmentSlotE3 != null ? fulfillmentSlotE3.getStartTime() : null;
            fulfillmentSlotE = validationX.e();
        } while (!interfaceC16549B2.e(value, DeliveryContactInformationViewState.i(deliveryContactInformationViewState, null, null, null, null, new SlotData(date, startTime, fulfillmentSlotE != null ? fulfillmentSlotE.getEndTime() : null), null, false, false, false, null, false, false, false, false, null, 32751, null)));
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if (shoppingCartE != null) {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B3 = this._viewState;
            do {
                value3 = interfaceC16549B3.getValue();
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
            } while (!interfaceC16549B3.e(value3, DeliveryContactInformationViewState.i(deliveryContactInformationViewState2, null, null, null, null, null, locationData, false, false, false, null, false, false, partnerEligibility != null ? Intrinsics.e(partnerEligibility, fj.o.f131941f.getPartnerName()) : false, false, null, 28639, null)));
        }
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B4 = this._viewState;
        do {
            value2 = interfaceC16549B4.getValue();
        } while (!interfaceC16549B4.e(value2, DeliveryContactInformationViewState.i(value2, null, null, null, OrderTypeHeaderDataDecorator.INSTANCE.a(this._viewState.getValue().getSlotData(), this._viewState.getValue().getLocationData(), this._viewState.getValue().getIsBunchaOrder()), null, null, false, false, false, null, false, false, false, false, null, 32759, null)));
    }

    private final void P(ContactInformation contactInformation, boolean optIn) {
        DeliveryContactInformationViewState value;
        if (contactInformation != null) {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, new P(contactInformation.getEmailAddress(), contactInformation.getPhoneNumber(), optIn).b(value)));
        }
    }

    private final void Q(boolean isEditMode) {
        DeliveryContactInformationViewState value;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, isEditMode, false, false, null, false, false, false, false, null, 32703, null)));
        if (isEditMode) {
            V();
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(ContactInformation contactInformation) {
        InitialContactInfo value;
        DeliveryContactInformationViewState value2;
        InterfaceC16549B<InitialContactInfo> interfaceC16549B = this._initialPickupPersonSnapshot;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, value.a(this.flow.c().getValue().n(), this.flow.c().getValue().q())));
        this.isContactInfoSet = true;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B2 = this._viewState;
        do {
            value2 = interfaceC16549B2.getValue();
        } while (!interfaceC16549B2.e(value2, DeliveryContactInformationViewState.i(value2, null, null, null, null, null, null, false, true, false, null, false, false, false, false, null, 32639, null)));
        P(contactInformation, true);
        M(g.k.f103248a);
        this.checkoutRepository.K(contactInformation);
    }

    private final void S(boolean isContactInfoProvided) {
        DeliveryContactInformationViewState value;
        Boolean value2;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, isContactInfoProvided, null, false, false, false, false, null, 32383, null)));
        InterfaceC16549B<Boolean> interfaceC16549B2 = this._isValid;
        do {
            value2 = interfaceC16549B2.getValue();
            value2.getClass();
        } while (!interfaceC16549B2.e(value2, Boolean.valueOf(isContactInfoProvided)));
    }

    private final void T() {
        this.analyticsEngine.b(C14756c.h("Meijer: Contact info selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.U((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout contact info");
        track.h("fulfillmentType", "delivery");
        return Unit.f143329a;
    }

    private final void V() {
        this.analyticsEngine.b(C14756c.h("Meijer:Edit Delivery Contact Info"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.W((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout edit contact info");
        return Unit.f143329a;
    }

    private final void X(final boolean editPhoneNumber) {
        this.analyticsEngine.b(C14756c.a("Meijer: Contact info selection Invalid Number Alert"), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.Y(editPhoneNumber, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Meijer: Contact info selection Invalid Number Alert");
        track.h("textPhoneRevalidateMessage", z10 ? "Re-enter valid number" : "continue without");
        return Unit.f143329a;
    }

    private final void a0() {
        DeliveryContactInformationViewState value;
        DeliveryContactInformationViewState deliveryContactInformationViewState;
        DeliveryContactInformationViewState value2 = this.flow.c().getValue();
        if (value2.isValid()) {
            b0(new ContactInformation(value2.n().e(), value2.q().e()));
            return;
        }
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            deliveryContactInformationViewState = value;
        } while (!interfaceC16549B.e(value, deliveryContactInformationViewState));
        I(deliveryContactInformationViewState);
    }

    private final void b0(ContactInformation contactInformation) {
        DeliveryContactInformationViewState value;
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, true, false, null, false, false, false, false, null, 32639, null)));
        String strC = Ds.g.c(contactInformation.getPhoneNumber());
        if (strC == null) {
            strC = "-1";
        }
        C15809k.d(d0.a(this), null, null, new k(strC, contactInformation, null), 3, null);
    }

    public final Mk.b<DeliveryContactInformationViewState, j> J() {
        return this.flow;
    }

    public final pv.P<DeliveryContactInformationViewState> K() {
        return this.viewState;
    }

    public pv.P<Boolean> L() {
        return this._isValid;
    }

    public final void M(g action) {
        DeliveryContactInformationViewState value;
        DeliveryContactInformationViewState value2;
        DeliveryContactInformationViewState value3;
        DeliveryContactInformationViewState value4;
        DeliveryContactInformationViewState value5;
        Intrinsics.j(action, "action");
        if (action instanceof g.C1452g) {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
            do {
                value5 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value5, new P(this.userManager.h(), this.userManager.B().length() > 0 ? this.userManager.B() : this.userManager.e(), false).b(value5)));
            return;
        }
        if (action instanceof g.e) {
            DeliveryContactInformationViewState value6 = this.flow.c().getValue();
            String strE = value6.n().e();
            if (strE == null) {
                strE = "";
            }
            String strE2 = value6.q().e();
            R(new ContactInformation(strE, strE2 != null ? strE2 : ""));
            return;
        }
        if (action instanceof g.SetEmailAddress) {
            g.SetEmailAddress setEmailAddress = (g.SetEmailAddress) action;
            String emailAddress = setEmailAddress.getEmailAddress();
            String strE3 = this.flow.c().getValue().q().e();
            P(new ContactInformation(emailAddress, strE3 != null ? strE3 : ""), setEmailAddress.getOptIn());
            return;
        }
        if (action instanceof g.SetPhoneNumber) {
            String strE4 = this.flow.c().getValue().n().e();
            g.SetPhoneNumber setPhoneNumber = (g.SetPhoneNumber) action;
            P(new ContactInformation(strE4 != null ? strE4 : "", setPhoneNumber.getPhoneNumber()), setPhoneNumber.getOptIn());
            return;
        }
        if (action instanceof g.SetOptIn) {
            DeliveryContactInformationViewState value7 = this.flow.c().getValue();
            String strE5 = value7.n().e();
            if (strE5 == null) {
                strE5 = "";
            }
            String strE6 = value7.q().e();
            P(new ContactInformation(strE5, strE6 != null ? strE6 : ""), ((g.SetOptIn) action).getOptIn());
            return;
        }
        if (action instanceof g.k) {
            DeliveryContactInformationViewState value8 = this.flow.c().getValue();
            yo.k kVar = this.userManager;
            String strE7 = value8.n().e();
            if (strE7 == null) {
                strE7 = "";
            }
            kVar.Y(strE7);
            yo.k kVar2 = this.userManager;
            String strE8 = value8.q().e();
            kVar2.Z(strE8 != null ? strE8 : "");
            return;
        }
        if (action instanceof g.j) {
            a0();
            return;
        }
        if (action instanceof g.d) {
            this.flow.a(j.c.f103261a);
            return;
        }
        if (action instanceof g.c) {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B2 = this._viewState;
            do {
                value4 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value4, DeliveryContactInformationViewState.i(value4, null, null, null, null, null, null, false, false, false, null, true, false, false, false, null, 31487, null)));
            return;
        }
        if (action instanceof g.UpdateFlow) {
            Q(((g.UpdateFlow) action).getIsEditMode());
            return;
        }
        if (action instanceof g.TrackUpdateTextAlertAction) {
            X(((g.TrackUpdateTextAlertAction) action).getEditPhoneNumber());
            return;
        }
        if (action instanceof g.ValidateEachField) {
            g.ValidateEachField validateEachField = (g.ValidateEachField) action;
            Z(this._viewState.getValue(), validateEachField.getIsEmailFocused(), validateEachField.getIsPhoneNumberFocused());
            return;
        }
        if (action instanceof g.a) {
            S(false);
            return;
        }
        if (!(action instanceof g.b)) {
            if (!Intrinsics.e(action, g.n.f103251a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B3 = this._viewState;
            do {
                value = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, true, null, 24575, null)));
            R(new ContactInformation(this.flow.c().getValue().n().e(), this.flow.c().getValue().q().e()));
            return;
        }
        if (this.featureManager.e(AbstractC18503f.i0.f172883h)) {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B4 = this._viewState;
            do {
                value3 = interfaceC16549B4.getValue();
            } while (!interfaceC16549B4.e(value3, DeliveryContactInformationViewState.i(value3, this._initialPickupPersonSnapshot.getValue().b(), this._initialPickupPersonSnapshot.getValue().c(), null, null, null, null, false, false, false, null, false, false, false, false, null, 31740, null)));
        } else {
            InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B5 = this._viewState;
            do {
                value2 = interfaceC16549B5.getValue();
            } while (!interfaceC16549B5.e(value2, DeliveryContactInformationViewState.i(value2, null, null, null, null, null, null, false, false, false, null, false, false, false, false, null, 31743, null)));
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void I(DeliveryContactInformationViewState viewState) {
        List<Validation<? extends Object>> listA = viewState.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Validation validation = (Validation) it.next();
            i iVar = null;
            if (!validation.getIsValid()) {
                if (Intrinsics.e(validation, viewState.n())) {
                    iVar = i.f103254a;
                } else if (Intrinsics.e(validation, viewState.q())) {
                    iVar = i.f103255b;
                } else if (Intrinsics.e(validation, viewState.j())) {
                    iVar = i.f103256c;
                }
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        InterfaceC16549B<DeliveryContactInformationViewState> interfaceC16549B = this._viewState;
        while (true) {
            DeliveryContactInformationViewState value = interfaceC16549B.getValue();
            ArrayList arrayList2 = arrayList;
            if (interfaceC16549B.e(value, DeliveryContactInformationViewState.i(value, null, null, null, null, null, null, false, false, false, null, false, false, false, false, arrayList2, 16383, null))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
      0x0030: PHI (r2v9 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i) = 
      (r2v7 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r2v7 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r2v8 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
      (r2v10 com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i)
     binds: [B:23:0x0061, B:24:0x0063, B:15:0x003e, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z(com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState r22, boolean r23, boolean r24) {
        /*
            r21 = this;
            java.util.List r0 = r22.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()
            Ik.b r2 = (Ik.Validation) r2
            boolean r3 = r2.getIsValid()
            r4 = 0
            if (r3 != 0) goto L66
            Ik.b r3 = r22.n()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 == 0) goto L32
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r2 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f103254a
            if (r23 == 0) goto L66
        L30:
            r4 = r2
            goto L66
        L32:
            Ik.b r3 = r22.q()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 == 0) goto L41
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r2 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f103255b
            if (r24 == 0) goto L66
            goto L30
        L41:
            Ik.b r3 = r22.j()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r2 == 0) goto L66
            com.meijer.mobile.meijer.activity.checkout.contactinformation.H$i r2 = com.meijer.mobile.meijer.activity.checkout.contactinformation.H.i.f103256c
            Ik.b r3 = r22.n()
            boolean r3 = r3.getIsValid()
            if (r3 != 0) goto L59
            if (r23 == 0) goto L66
        L59:
            Ik.b r3 = r22.q()
            boolean r3 = r3.getIsValid()
            if (r3 != 0) goto L30
            if (r24 == 0) goto L66
            goto L30
        L66:
            if (r4 == 0) goto Lf
            r1.add(r4)
            goto Lf
        L6c:
            r2 = r21
            pv.B<com.meijer.mobile.meijer.activity.checkout.contactinformation.O> r0 = r2._viewState
        L70:
            java.lang.Object r3 = r0.getValue()
            r16 = r1
            r1 = r3
            com.meijer.mobile.meijer.activity.checkout.contactinformation.O r1 = (com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState) r1
            r17 = 16383(0x3fff, float:2.2957E-41)
            r18 = 0
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
            r19 = r15
            r15 = 0
            r20 = r19
            com.meijer.mobile.meijer.activity.checkout.contactinformation.O r1 = com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationViewState.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r20
            boolean r1 = r0.e(r4, r1)
            if (r1 == 0) goto La8
            return
        La8:
            r2 = r21
            r1 = r16
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.contactinformation.H.Z(com.meijer.mobile.meijer.activity.checkout.contactinformation.O, boolean, boolean):void");
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
    public static final /* synthetic */ Object x(Mk.b bVar, DeliveryContactInformationViewState deliveryContactInformationViewState, Continuation continuation) {
        bVar.d(deliveryContactInformationViewState);
        return Unit.f143329a;
    }
}

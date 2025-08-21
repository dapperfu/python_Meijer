package com.meijer.mobile.coupon.list;

import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import Pr.C4635o;
import Qk.a;
import Sk.CouponOptions;
import V2.CreationExtras;
import Xr.ToolBarDecorator;
import Yk.CouponState;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.coupon.list.CouponListDecorator;
import com.meijer.mobile.coupon.list.S;
import com.meijer.mobile.coupon.list.W;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import dk.C13698b;
import e.C13737e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mv.InterfaceC15783O;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001d\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010!R#\u0010(\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b/\u0010,R\u001d\u00103\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u0010,R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010;\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0014\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/meijer/mobile/coupon/list/CouponListActivity;", "Lcom/meijer/mobile/coupon/di/CouponFeatureActivity;", "<init>", "()V", "Lkotlin/Function0;", "", "initContentBlock", "f2", "(Lkotlin/jvm/functions/Function0;)V", "S1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LQk/a;", "action", "c2", "(LQk/a;)V", "Lcom/meijer/mobile/coupon/list/S;", "C", "Lkotlin/Lazy;", "a2", "()Lcom/meijer/mobile/coupon/list/S;", "viewModel", "LQk/c;", "Lcom/meijer/mobile/coupon/list/LegacyCouponPage;", "D", "X1", "()LQk/c;", "legacyCouponPage", "LSk/a;", "E", "W1", "()LSk/a;", "couponOptions", "", "LFq/c;", "F", "Y1", "()Ljava/util/List;", "shoppingList", "", "G", "V1", "()Ljava/lang/String;", "adImageUrl", "H", "U1", "adBannerTitle", "I", "T1", "adBannerDescription", "Lcom/meijer/mobile/coupon/list/W;", "J", "Lcom/meijer/mobile/coupon/list/W;", "couponPage", "K", "Z1", "()Lcom/meijer/mobile/coupon/list/W;", "validatedCouponPage", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CouponListActivity extends Hilt_CouponListActivity {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private W couponPage;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(S.class), new d(this), new c(this), new e(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy legacyCouponPage = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.b2(this.f97701a);
        }
    });

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy couponOptions = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.R1(this.f97702a);
        }
    });

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy shoppingList = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.e2(this.f97703a);
        }
    });

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Lazy adImageUrl = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.Q1(this.f97704a);
        }
    });

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Lazy adBannerTitle = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.P1(this.f97705a);
        }
    });

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Lazy adBannerDescription = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.O1(this.f97706a);
        }
    });

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Lazy validatedCouponPage = LazyKt.b(new Function0() { // from class: com.meijer.mobile.coupon.list.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponListActivity.g2(this.f97707a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Qk.c.values().length];
            try {
                iArr[Qk.c.f31046j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Qk.c.f31047k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Qk.c.f31048l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Qk.c.f31049m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CouponListActivity f97345a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.coupon.list.CouponListActivity$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1377a extends FunctionReferenceImpl implements Function0<Unit> {
                C1377a(Object obj) {
                    super(0, obj, CouponListActivity.class, "fetchCoupons", "fetchCoupons()V", 0);
                }

                public final void a() {
                    ((CouponListActivity) this.receiver).S1();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.coupon.list.CouponListActivity$b$a$b, reason: collision with other inner class name */
            /* synthetic */ class C1378b extends FunctionReferenceImpl implements Function0<Unit> {
                C1378b(Object obj) {
                    super(0, obj, CouponListActivity.class, "finish", "finish()V", 0);
                }

                public final void a() {
                    ((CouponListActivity) this.receiver).finish();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CouponListActivity f97346a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ S.ViewState f97347b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97348c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListActivity$b$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1379a extends FunctionReferenceImpl implements Function1<Qk.a, Unit> {
                    C1379a(Object obj) {
                        super(1, obj, CouponListActivity.class, "onAction", "onAction(Lcom/meijer/mobile/coupon/model/common/action/CouponAction;)V", 0);
                    }

                    public final void a(Qk.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((CouponListActivity) this.receiver).c2(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Qk.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                c(CouponListActivity couponListActivity, S.ViewState viewState, LocalThemeScope localThemeScope) {
                    this.f97346a = couponListActivity;
                    this.f97347b = viewState;
                    this.f97348c = localThemeScope;
                }

                public final void a(Modifier modifier, Composer composer, int i10) {
                    int i11;
                    W w10;
                    Intrinsics.j(modifier, "modifier");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(modifier) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2143567694, i11, -1, "com.meijer.mobile.coupon.list.CouponListActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CouponListActivity.kt:113)");
                    }
                    String strV1 = this.f97346a.V1();
                    String strU1 = this.f97346a.U1();
                    String strT1 = this.f97346a.T1();
                    CouponListDecorator.Companion companion = CouponListDecorator.INSTANCE;
                    List<CouponState> listC = this.f97347b.getCouponListDecorator().c();
                    String specialOffersBannerUrl = this.f97347b.getCouponListDecorator().getSpecialOffersBannerUrl();
                    boolean hasSpecialOffers = this.f97347b.getCouponListDecorator().getHasSpecialOffers();
                    String strV12 = this.f97346a.V1();
                    String strU12 = this.f97346a.U1();
                    String strT12 = this.f97346a.T1();
                    W w11 = this.f97346a.couponPage;
                    W w12 = null;
                    if (w11 == null) {
                        Intrinsics.x("couponPage");
                        w11 = null;
                    }
                    AbstractC6392a abstractC6392aB = w11.b(this.f97347b.getCouponListDecorator().getCouponsCount());
                    int i12 = AbstractC6392a.f60445b;
                    String strA = C13698b.a(abstractC6392aB, composer, i12);
                    W w13 = this.f97346a.couponPage;
                    if (w13 == null) {
                        Intrinsics.x("couponPage");
                        w10 = null;
                    } else {
                        w10 = w13;
                    }
                    List<Xr.a> listA = companion.a(listC, w10, hasSpecialOffers, specialOffersBannerUrl, strV12, strU12, strT12, strA, this.f97346a.Y1());
                    CouponListActivity couponListActivity = this.f97346a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(couponListActivity);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1379a(couponListActivity);
                        composer.t(objB);
                    }
                    KFunction kFunction = (KFunction) objB;
                    composer.P();
                    W w14 = this.f97346a.couponPage;
                    if (w14 == null) {
                        Intrinsics.x("couponPage");
                    } else {
                        w12 = w14;
                    }
                    C4635o.f(this.f97348c, listA, this.f97347b.getCouponListDecorator().getCouponsCount() == 0, w12.getNoCouponsMsg(), modifier, strV1, strU1, strT1, (Function1) kFunction, composer, ((i11 << 12) & 57344) | (i12 << 9) | LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListActivity$onCreate$1$1$1$4$1", f = "CouponListActivity.kt", l = {138}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f97349a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CouponListActivity f97350b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97351c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.coupon.list.CouponListActivity$b$a$d$a, reason: collision with other inner class name */
                static final class C1380a<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CouponListActivity f97352a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97353b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.meijer.mobile.coupon.list.CouponListActivity$onCreate$1$1$1$4$1$1", f = "CouponListActivity.kt", l = {BinsView.TOTE_WIDTH_DP, BinsView.TOTE_WIDTH_DP, 166, 166, 186, 186}, m = "emit")
                    /* renamed from: com.meijer.mobile.coupon.list.CouponListActivity$b$a$d$a$a, reason: collision with other inner class name */
                    static final class C1381a extends ContinuationImpl {

                        /* renamed from: a, reason: collision with root package name */
                        Object f97354a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f97355b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ C1380a<T> f97356c;

                        /* renamed from: d, reason: collision with root package name */
                        int f97357d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1381a(C1380a<? super T> c1380a, Continuation<? super C1381a> continuation) {
                            super(continuation);
                            this.f97356c = c1380a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f97355b = obj;
                            this.f97357d |= Integer.MIN_VALUE;
                            return this.f97356c.emit(null, this);
                        }
                    }

                    C1380a(CouponListActivity couponListActivity, LocalThemeScope localThemeScope) {
                        this.f97352a = couponListActivity;
                        this.f97353b = localThemeScope;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
                    
                        if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L30;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
                    
                        if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L40;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x0166, code lost:
                    
                        if (Hi.i.i(r1, r15, r3, null, false, r6, r7, null, null, r10, com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus.SUCCESS_NO_CONTENT, null) != r0) goto L50;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                    @Override // pv.InterfaceC16562g
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(final com.meijer.mobile.coupon.list.S.e r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
                        /*
                            Method dump skipped, instructions count: 396
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.coupon.list.CouponListActivity.b.a.d.C1380a.emit(com.meijer.mobile.coupon.list.S$e, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean i(CouponListActivity couponListActivity, S.e eVar) {
                        couponListActivity.a2().onAction(new a.Clip(((S.e.ShowClipCouponErrorSnackBar) eVar).getCoupon(), null, 2, null));
                        return true;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean j(CouponListActivity couponListActivity, S.e eVar) {
                        couponListActivity.startActivity(couponListActivity.v1().f(((S.e.ShowCouponClippedSnackBar) eVar).getCoupon(), true, true, false, null));
                        return true;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean k(CouponListActivity couponListActivity) {
                        couponListActivity.startActivity(Dl.e.j(couponListActivity.v1(), couponListActivity, null, true, false, 1, 10, null));
                        return true;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f97350b, this.f97351c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(CouponListActivity couponListActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f97350b = couponListActivity;
                    this.f97351c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f97349a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16553F<S.e> interfaceC16553FD = this.f97350b.a2().D();
                        C1380a c1380a = new C1380a(this.f97350b, this.f97351c);
                        this.f97349a = 1;
                        if (interfaceC16553FD.collect(c1380a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            a(CouponListActivity couponListActivity) {
                this.f97345a = couponListActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                ToolBarDecorator toolBarDecorator;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1911062320, i11, -1, "com.meijer.mobile.coupon.list.CouponListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CouponListActivity.kt:94)");
                }
                S.ViewState viewState = (S.ViewState) o1.b(this.f97345a.a2().C(), null, composer, 0, 1).getValue();
                C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                W w10 = this.f97345a.couponPage;
                if (w10 == null) {
                    Intrinsics.x("couponPage");
                    w10 = null;
                }
                if (w10 instanceof W.AdCoupons) {
                    toolBarDecorator = null;
                } else {
                    W w11 = this.f97345a.couponPage;
                    if (w11 == null) {
                        Intrinsics.x("couponPage");
                        w11 = null;
                    }
                    toolBarDecorator = new ToolBarDecorator(w11.getTitle());
                }
                boolean isCouponsLoading = viewState.getIsCouponsLoading();
                String strV1 = this.f97345a.V1();
                String strU1 = this.f97345a.U1();
                String strT1 = this.f97345a.T1();
                boolean isFetchCouponsFailed = viewState.getIsFetchCouponsFailed();
                CouponListActivity couponListActivity = this.f97345a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(couponListActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1377a(couponListActivity);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                CouponListActivity couponListActivity2 = this.f97345a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(couponListActivity2);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1378b(couponListActivity2);
                    composer.t(objB2);
                }
                composer.P();
                int i12 = i11 & 14;
                int i13 = i11;
                C4635o.i(AdsTheme, c17993c1G, isCouponsLoading, isFetchCouponsFailed, modifierFsUnmask, toolBarDecorator, strV1, strU1, strT1, (Function0) ((KFunction) objB2), (Function0) kFunction, ComposableLambdaKt.c(-2143567694, true, new c(this.f97345a, viewState, AdsTheme), composer, 54), composer, LocalThemeScope.f17314g | i12 | (ToolBarDecorator.f42664b << 15), 48, 0);
                Boolean bool = Boolean.TRUE;
                composer.startReplaceGroup(-1633490746);
                boolean zD3 = composer.D(this.f97345a) | (i12 == 4 || ((i13 & 8) != 0 && composer.D(AdsTheme)));
                CouponListActivity couponListActivity3 = this.f97345a;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new d(couponListActivity3, AdsTheme, null);
                    composer.t(objB3);
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB3, composer, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1079858625, i10, -1, "com.meijer.mobile.coupon.list.CouponListActivity.onCreate.<anonymous>.<anonymous> (CouponListActivity.kt:93)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1911062320, true, new a(CouponListActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f97358f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97358f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f97359f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f97359f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97360f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97361g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97360f = function0;
            this.f97361g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97360f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97361g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String T1() {
        return (String) this.adBannerDescription.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String U1() {
        return (String) this.adBannerTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String V1() {
        return (String) this.adImageUrl.getValue();
    }

    private final CouponOptions W1() {
        return (CouponOptions) this.couponOptions.getValue();
    }

    private final Qk.c X1() {
        return (Qk.c) this.legacyCouponPage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ShoppingListItem> Y1() {
        return (List) this.shoppingList.getValue();
    }

    private final W Z1() {
        return (W) this.validatedCouponPage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S a2() {
        return (S) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(CouponListActivity couponListActivity) {
        C13737e.b(couponListActivity, null, ComposableLambdaKt.composableLambdaInstance(-1079858625, true, couponListActivity.new b()), 1, null);
        return Unit.f143329a;
    }

    public final void c2(Qk.a action) {
        Intrinsics.j(action, "action");
        if ((action instanceof a.Clip) || (action instanceof a.NotInterested) || (action instanceof a.Unclip)) {
            a2().onAction(action);
        } else if (action instanceof a.ViewCouponDetails) {
            startActivity(v1().f(((a.ViewCouponDetails) action).getCoupon(), true, true, false, null));
        } else {
            if (!(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(Dl.e.l(v1(), this, null, null, u1().e(AbstractC18503f.M.f172852h), 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O1(CouponListActivity couponListActivity) {
        return couponListActivity.getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_DESCRIPTION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String P1(CouponListActivity couponListActivity) {
        return couponListActivity.getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_TITLE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q1(CouponListActivity couponListActivity) {
        return couponListActivity.getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_URL");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CouponOptions R1(CouponListActivity couponListActivity) {
        Parcelable parcelable;
        Intent intent = couponListActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", CouponOptions.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS");
            if (!(parcelableExtra instanceof CouponOptions)) {
                parcelableExtra = null;
            }
            parcelable = (CouponOptions) parcelableExtra;
        }
        return (CouponOptions) parcelable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        S sA2 = a2();
        W w10 = this.couponPage;
        if (w10 == null) {
            Intrinsics.x("couponPage");
            w10 = null;
        }
        sA2.E(w10.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Qk.c b2(CouponListActivity couponListActivity) {
        Object serializableExtra;
        Intent intent = couponListActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Qk.c.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE");
            if (!(serializableExtra2 instanceof Qk.c)) {
                serializableExtra2 = null;
            }
            serializableExtra = (Qk.c) serializableExtra2;
        }
        return (Qk.c) serializableExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList e2(CouponListActivity couponListActivity) {
        Intent intent = couponListActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_SHOPPING_LIST", ShoppingListItem.class);
        }
        return intent.getParcelableArrayListExtra("com.meijer.intent.extra.EXTRA_SHOPPING_LIST");
    }

    private final void f2(Function0<Unit> initContentBlock) {
        W wZ1 = Z1();
        if (wZ1 != null) {
            this.couponPage = wZ1;
            S1();
            initContentBlock.invoke();
        } else {
            qw.a.INSTANCE.d("Invalid Coupon Page " + X1(), new Object[0]);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W g2(CouponListActivity couponListActivity) {
        Qk.c cVarX1 = couponListActivity.X1();
        if (cVarX1 == null) {
            return null;
        }
        int i10 = a.$EnumSwitchMapping$0[cVarX1.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    CouponOptions couponOptionsW1 = couponListActivity.W1();
                    Intrinsics.g(couponOptionsW1);
                    return new W.RelatedShoppingList(couponOptionsW1);
                }
                return W.d.f97697d;
            }
            CouponOptions couponOptionsW12 = couponListActivity.W1();
            Intrinsics.g(couponOptionsW12);
            return new W.BundleCoupons(couponOptionsW12);
        }
        CouponOptions couponOptionsW13 = couponListActivity.W1();
        Intrinsics.g(couponOptionsW13);
        return new W.AdCoupons(couponOptionsW13);
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(a2());
        f2(new Function0() { // from class: com.meijer.mobile.coupon.list.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponListActivity.d2(this.f97700a);
            }
        });
    }
}

package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Bm.C3011v;
import Bm.C3013x;
import Bm.I0;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C12057p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import e.C13736d;
import e.C13737e;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.EnumC17961N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import le.C15485b;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.S;
import r0.C16806i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "s", "Lkotlin/Lazy;", "E1", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "viewModel", "Lpv/B;", "", "t", "Lpv/B;", "_isValid", "G1", "()Z", "isEditMode", "F1", "isBopasTimeSlot", "u", "a", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PickupPersonFormActivity extends Hilt_PickupPersonFormActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f105062v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C12057p.class), new d(this), new c(this), new e(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Boolean> _isValid = S.a(Boolean.FALSE);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isEditMode", "isBopasTimeSlot", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZZ)Landroid/content/Intent;", "", "EXTRA_IS_EDIT_MODE", "Ljava/lang/String;", "EXTRA_IS_BOPAS_SLOT", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return companion.a(context, z10, z11);
        }

        @JvmStatic
        public final Intent a(Context context, boolean isEditMode, boolean isBopasTimeSlot) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) PickupPersonFormActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.PickupPersonFormActivity.IS_EDIT_MODE", isEditMode).putExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.PickupPersonFormActivity.IS_BOPAS_SLOT", isBopasTimeSlot);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f105066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f105067b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PickupPersonFormActivity f105068c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17993c1 f105069d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<PickupPersonViewState> f105070e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$a, reason: collision with other inner class name */
            static final class C1509a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105071a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PickupPersonFormActivity f105072b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f105073c;

                /* JADX WARN: Multi-variable type inference failed */
                C1509a(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0) {
                    this.f105071a = localThemeScope;
                    this.f105072b = pickupPersonFormActivity;
                    this.f105073c = function0;
                }

                public final void b(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(559394418, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:105)");
                    }
                    LocalThemeScope localThemeScope = this.f105071a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f105072b) | composer.V(this.f105073c);
                    final PickupPersonFormActivity pickupPersonFormActivity = this.f105072b;
                    final Function0<C0> function0 = this.f105073c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PickupPersonFormActivity.b.a.C1509a.c(pickupPersonFormActivity, function0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    I0.b(localThemeScope, (Function0) objB, composer, LocalThemeScope.f17314g);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    b(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity, Function0 function0) {
                    pickupPersonFormActivity.E1().M(new C12057p.g.SetOptIn(true));
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b, reason: collision with other inner class name */
            static final class C1510b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17993c1 f105074a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105075b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PickupPersonFormActivity f105076c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<PickupPersonViewState> f105077d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f105078e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1511a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105079a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f105080b;

                    C1511a(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity) {
                        this.f105079a = localThemeScope;
                        this.f105080b = pickupPersonFormActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1444608436, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:118)");
                        }
                        LocalThemeScope localThemeScope = this.f105079a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                        Integer numValueOf = this.f105080b.G1() ? Integer.valueOf(Y.f100575Nb) : null;
                        String strC = C16338g.c(numValueOf != null ? numValueOf.intValue() : Y.f100670Sb, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f105080b);
                        final PickupPersonFormActivity pickupPersonFormActivity = this.f105080b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PickupPersonFormActivity.b.a.C1510b.C1511a.c(pickupPersonFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C3011v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f17314g | 48, 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity) {
                        pickupPersonFormActivity.finish();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1512b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105081a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f105082b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<PickupPersonViewState> f105083c;

                    C1512b(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, z1<PickupPersonViewState> z1Var) {
                        this.f105081a = localThemeScope;
                        this.f105082b = pickupPersonFormActivity;
                        this.f105083c = z1Var;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-427253293, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:168)");
                        }
                        LocalThemeScope localThemeScope = this.f105081a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f105082b);
                        final PickupPersonFormActivity pickupPersonFormActivity = this.f105082b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PickupPersonFormActivity.b.a.C1510b.C1512b.c(pickupPersonFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        C3013x.b(localThemeScope, modifierH, function0, C16338g.c(this.f105082b.G1() ? Y.f101007jh : Y.f100987ih, composer, 0), !this.f105082b.G1() ? b.c(this.f105083c).getIsEnableContinueButton() : b.c(this.f105083c).getHasPickupPersonChanged(), null, null, false, composer, LocalThemeScope.f17314g | 48, 112);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity) {
                        pickupPersonFormActivity.E1().M(C12057p.g.n.f105164a);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105084a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f105085b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function0<C0> f105086c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<PickupPersonViewState> f105087d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$a, reason: collision with other inner class name */
                    /* synthetic */ class C1513a extends FunctionReferenceImpl implements Function1<C12057p.g, Unit> {
                        C1513a(Object obj) {
                            super(1, obj, C12057p.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormViewModel$Action;)V", 0);
                        }

                        public final void a(C12057p.g p02) {
                            Intrinsics.j(p02, "p0");
                            ((C12057p) this.receiver).M(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C12057p.g gVar) {
                            a(gVar);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$3$3$2$1", f = "PickupPersonFormActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1514b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f105088a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ PickupPersonFormActivity f105089b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function0<C0> f105090c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1514b(PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, Continuation<? super C1514b> continuation) {
                            super(2, continuation);
                            this.f105089b = pickupPersonFormActivity;
                            this.f105090c = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1514b(this.f105089b, this.f105090c, continuation);
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$3$3$2$1$1", f = "PickupPersonFormActivity.kt", l = {}, m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1515a extends SuspendLambda implements Function2<C12057p.h, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f105091a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f105092b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ PickupPersonFormActivity f105093c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<C0> f105094d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1515a(PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, Continuation<? super C1515a> continuation) {
                                super(2, continuation);
                                this.f105093c = pickupPersonFormActivity;
                                this.f105094d = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1515a c1515a = new C1515a(this.f105093c, this.f105094d, continuation);
                                c1515a.f105092b = obj;
                                return c1515a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(C12057p.h hVar, Continuation<? super Unit> continuation) {
                                return ((C1515a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void k(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.f();
                                if (this.f105091a == 0) {
                                    ResultKt.b(obj);
                                    C12057p.h hVar = (C12057p.h) this.f105092b;
                                    if (hVar instanceof C12057p.h.a) {
                                        PickupPersonFormActivity pickupPersonFormActivity = this.f105093c;
                                        Intent intentB = null;
                                        Intent intentB2 = CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, pickupPersonFormActivity, null, 2, null);
                                        if (this.f105093c.G1()) {
                                            intentB = intentB2;
                                        }
                                        if (intentB == null) {
                                            intentB = CheckoutPaymentHostActivity.Companion.b(CheckoutPaymentHostActivity.INSTANCE, this.f105093c, false, false, true, 6, null);
                                        }
                                        pickupPersonFormActivity.startActivity(intentB);
                                        Unit unit = Unit.f143329a;
                                    } else if (hVar instanceof C12057p.h.b) {
                                        new C15485b(this.f105093c).setCancelable(false).setTitle(Y.f100561Mg).setMessage(Y.f100523Kg).setPositiveButton(Y.f100542Lg, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.i
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                                PickupPersonFormActivity.b.a.C1510b.c.C1514b.C1515a.k(dialogInterface, i10);
                                            }
                                        }).show();
                                    } else if (hVar instanceof C12057p.h.c) {
                                        this.f105094d.invoke();
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f143329a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1514b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f105088a == 0) {
                                ResultKt.b(obj);
                                C16563h.J(C16563h.O(this.f105089b.E1().H().b(), new C1515a(this.f105089b, this.f105090c, null)), C6173t.a(this.f105089b));
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, z1<PickupPersonViewState> z1Var) {
                        this.f105084a = localThemeScope;
                        this.f105085b = pickupPersonFormActivity;
                        this.f105086c = function0;
                        this.f105087d = z1Var;
                    }

                    public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
                        Intrinsics.j(paddingValues, "paddingValues");
                        if ((i10 & 6) == 0) {
                            i10 |= composer.V(paddingValues) ? 4 : 2;
                        }
                        if ((i10 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(456903899, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:126)");
                        }
                        LocalThemeScope localThemeScope = this.f105084a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                        boolean zG1 = this.f105085b.G1();
                        PickupPersonViewState pickupPersonViewStateC = b.c(this.f105087d);
                        C12057p c12057pE1 = this.f105085b.E1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(c12057pE1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1513a(c12057pE1);
                            composer.t(objB);
                        }
                        composer.P();
                        C.t(localThemeScope, modifierH, zG1, pickupPersonViewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 0);
                        Unit unit = Unit.f143329a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(this.f105085b) | composer.V(this.f105086c);
                        PickupPersonFormActivity pickupPersonFormActivity = this.f105085b;
                        Function0<C0> function0 = this.f105086c;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new C1514b(pickupPersonFormActivity, function0, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit, (Function2) objB2, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                        a(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1510b(C17993c1 c17993c1, LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, z1<PickupPersonViewState> z1Var, Function0<? extends C0> function0) {
                    this.f105074a = c17993c1;
                    this.f105075b = localThemeScope;
                    this.f105076c = pickupPersonFormActivity;
                    this.f105077d = z1Var;
                    this.f105078e = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2086029863, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:114)");
                    }
                    C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f105074a, ComposableLambdaKt.c(1444608436, true, new C1511a(this.f105075b, this.f105076c), composer, 54), ComposableLambdaKt.c(-427253293, true, new C1512b(this.f105075b, this.f105076c, this.f105077d), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(456903899, true, new c(this.f105075b, this.f105076c, this.f105078e, this.f105077d), composer, 54), composer, 3456, 12582912, 131056);
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$closeSheet$1$1$1", f = "PickupPersonFormActivity.kt", l = {90}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105095a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f105096b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f105096b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C17959M0 c17959m0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f105096b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f105095a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f105096b;
                        this.f105095a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$openSheet$1$1$1", f = "PickupPersonFormActivity.kt", l = {87}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105097a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f105098b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f105098b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17959M0 c17959m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f105098b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f105097a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f105098b;
                        this.f105097a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, PickupPersonFormActivity pickupPersonFormActivity, C17993c1 c17993c1, z1<PickupPersonViewState> z1Var) {
                this.f105066a = interfaceC15783O;
                this.f105067b = c17959m0;
                this.f105068c = pickupPersonFormActivity;
                this.f105069d = c17993c1;
                this.f105070e = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 e(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
                return C15809k.d(interfaceC15783O, null, null, new d(c17959m0, null), 3, null);
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
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
                    ComposerKt.U(-1318731680, i11, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:86)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f105066a) | composer.D(this.f105067b);
                final InterfaceC15783O interfaceC15783O = this.f105066a;
                final C17959M0 c17959m0 = this.f105067b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.e(interfaceC15783O, c17959m0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f105068c) | composer.D(this.f105066a) | composer.D(this.f105067b);
                final PickupPersonFormActivity pickupPersonFormActivity = this.f105068c;
                final InterfaceC15783O interfaceC15783O2 = this.f105066a;
                final C17959M0 c17959m02 = this.f105067b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.f(pickupPersonFormActivity, interfaceC15783O2, c17959m02);
                        }
                    };
                    composer.t(objB2);
                }
                final Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(this.f105067b) | composer.V(function02) | composer.D(this.f105068c);
                final C17959M0 c17959m03 = this.f105067b;
                final PickupPersonFormActivity pickupPersonFormActivity2 = this.f105068c;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.g(c17959m03, function02, pickupPersonFormActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13736d.a(false, (Function0) objB3, composer, 0, 1);
                float f10 = 10;
                C17957L0.b(ComposableLambdaKt.c(559394418, true, new C1509a(AdsTheme, this.f105068c, function02), composer, 54), null, this.f105067b, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-2086029863, true, new C1510b(this.f105069d, AdsTheme, this.f105068c, this.f105070e, function0), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 f(PickupPersonFormActivity pickupPersonFormActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
                Ds.p.d(pickupPersonFormActivity.getWindow());
                return C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C17959M0 c17959m0, Function0 function0, PickupPersonFormActivity pickupPersonFormActivity) {
                if (c17959m0.k()) {
                    function0.invoke();
                } else {
                    pickupPersonFormActivity.finish();
                }
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1818646769, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous> (PickupPersonFormActivity.kt:78)");
            }
            z1 z1VarB = o1.b(PickupPersonFormActivity.this.E1().H().c(), null, composer, 0, 1);
            C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1318731680, true, new a((InterfaceC15783O) objB, C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6), PickupPersonFormActivity.this, c17993c1G, z1VarB), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PickupPersonViewState c(z1<PickupPersonViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f105099f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105099f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105100f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f105100f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105100f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105101f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105102g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105101f = function0;
            this.f105102g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105101f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105102g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12057p E1() {
        return (C12057p) this.viewModel.getValue();
    }

    private final boolean F1() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.PickupPersonFormActivity.IS_BOPAS_SLOT", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G1() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.PickupPersonFormActivity.IS_EDIT_MODE", false);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        E1().M(new C12057p.g.UpdateFlow(G1(), F1()));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1818646769, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Checkout | Add Contact Info").start();
    }
}

package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Am.C2906v;
import Am.C2908x;
import Am.I0;
import Ji.LocalThemeScope;
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
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import e.C13588d;
import e.C13589e;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import je.C14886b;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.EnumC17895N0;
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
import p1.C16193g;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "s", "Lkotlin/Lazy;", "E1", "()Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p;", "viewModel", "Ltv/B;", "", "t", "Ltv/B;", "_isValid", "G1", "()Z", "isEditMode", "F1", "isBopasTimeSlot", "u", "a", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PickupPersonFormActivity extends Hilt_PickupPersonFormActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f104206v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C11932p.class), new d(this), new c(this), new e(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _isValid = S.a(Boolean.FALSE);

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
            final /* synthetic */ InterfaceC16622O f104210a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f104211b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PickupPersonFormActivity f104212c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17927c1 f104213d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<PickupPersonViewState> f104214e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$a, reason: collision with other inner class name */
            static final class C1500a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104215a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PickupPersonFormActivity f104216b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f104217c;

                /* JADX WARN: Multi-variable type inference failed */
                C1500a(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0) {
                    this.f104215a = localThemeScope;
                    this.f104216b = pickupPersonFormActivity;
                    this.f104217c = function0;
                }

                public final void b(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(559394418, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:105)");
                    }
                    LocalThemeScope localThemeScope = this.f104215a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f104216b) | composer.V(this.f104217c);
                    final PickupPersonFormActivity pickupPersonFormActivity = this.f104216b;
                    final Function0<C0> function0 = this.f104217c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PickupPersonFormActivity.b.a.C1500a.c(pickupPersonFormActivity, function0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    I0.b(localThemeScope, (Function0) objB, composer, LocalThemeScope.f15770g);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    b(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity, Function0 function0) {
                    pickupPersonFormActivity.E1().K(new C11932p.g.SetOptIn(true));
                    function0.invoke();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b, reason: collision with other inner class name */
            static final class C1501b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17927c1 f104218a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104219b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PickupPersonFormActivity f104220c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<PickupPersonViewState> f104221d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f104222e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1502a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104223a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f104224b;

                    C1502a(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity) {
                        this.f104223a = localThemeScope;
                        this.f104224b = pickupPersonFormActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1444608436, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:118)");
                        }
                        LocalThemeScope localThemeScope = this.f104223a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                        Integer numValueOf = this.f104224b.G1() ? Integer.valueOf(Y.f99656Kb) : null;
                        String strC = C16193g.c(numValueOf != null ? numValueOf.intValue() : Y.f99751Pb, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f104224b);
                        final PickupPersonFormActivity pickupPersonFormActivity = this.f104224b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PickupPersonFormActivity.b.a.C1501b.C1502a.c(pickupPersonFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C2906v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f15770g | 48, 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity) {
                        pickupPersonFormActivity.finish();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1503b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104225a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f104226b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<PickupPersonViewState> f104227c;

                    C1503b(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, z1<PickupPersonViewState> z1Var) {
                        this.f104225a = localThemeScope;
                        this.f104226b = pickupPersonFormActivity;
                        this.f104227c = z1Var;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-427253293, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:168)");
                        }
                        LocalThemeScope localThemeScope = this.f104225a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f104226b);
                        final PickupPersonFormActivity pickupPersonFormActivity = this.f104226b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PickupPersonFormActivity.b.a.C1501b.C1503b.c(pickupPersonFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        C2908x.b(localThemeScope, modifierH, function0, C16193g.c(this.f104226b.G1() ? Y.f100046eh : Y.f100026dh, composer, 0), !this.f104226b.G1() ? b.c(this.f104227c).getIsEnableContinueButton() : b.c(this.f104227c).getHasPickupPersonChanged(), null, null, false, composer, LocalThemeScope.f15770g | 48, 112);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(PickupPersonFormActivity pickupPersonFormActivity) {
                        pickupPersonFormActivity.E1().K(C11932p.g.m.f104309a);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104228a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PickupPersonFormActivity f104229b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function0<C0> f104230c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<PickupPersonViewState> f104231d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$a, reason: collision with other inner class name */
                    /* synthetic */ class C1504a extends FunctionReferenceImpl implements Function1<C11932p.g, Unit> {
                        C1504a(Object obj) {
                            super(1, obj, C11932p.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/PickupPersonFormViewModel$Action;)V", 0);
                        }

                        public final void a(C11932p.g p02) {
                            Intrinsics.j(p02, "p0");
                            ((C11932p) this.receiver).K(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C11932p.g gVar) {
                            a(gVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$3$3$2$1", f = "PickupPersonFormActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1505b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f104232a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ PickupPersonFormActivity f104233b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function0<C0> f104234c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1505b(PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, Continuation<? super C1505b> continuation) {
                            super(2, continuation);
                            this.f104233b = pickupPersonFormActivity;
                            this.f104234c = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1505b(this.f104233b, this.f104234c, continuation);
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/p$h;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$3$3$2$1$1", f = "PickupPersonFormActivity.kt", l = {}, m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1506a extends SuspendLambda implements Function2<C11932p.h, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f104235a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f104236b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ PickupPersonFormActivity f104237c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<C0> f104238d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1506a(PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, Continuation<? super C1506a> continuation) {
                                super(2, continuation);
                                this.f104237c = pickupPersonFormActivity;
                                this.f104238d = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1506a c1506a = new C1506a(this.f104237c, this.f104238d, continuation);
                                c1506a.f104236b = obj;
                                return c1506a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(C11932p.h hVar, Continuation<? super Unit> continuation) {
                                return ((C1506a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void k(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.f();
                                if (this.f104235a == 0) {
                                    ResultKt.b(obj);
                                    C11932p.h hVar = (C11932p.h) this.f104236b;
                                    if (hVar instanceof C11932p.h.a) {
                                        PickupPersonFormActivity pickupPersonFormActivity = this.f104237c;
                                        Intent intentB = null;
                                        Intent intentB2 = CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, pickupPersonFormActivity, null, 2, null);
                                        if (this.f104237c.G1()) {
                                            intentB = intentB2;
                                        }
                                        if (intentB == null) {
                                            intentB = CheckoutPaymentHostActivity.Companion.b(CheckoutPaymentHostActivity.INSTANCE, this.f104237c, false, false, true, 6, null);
                                        }
                                        pickupPersonFormActivity.startActivity(intentB);
                                        Unit unit = Unit.f142422a;
                                    } else if (hVar instanceof C11932p.h.b) {
                                        new C14886b(this.f104237c).setCancelable(false).setTitle(Y.f99642Jg).setMessage(Y.f99604Hg).setPositiveButton(Y.f99623Ig, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.i
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                                PickupPersonFormActivity.b.a.C1501b.c.C1505b.C1506a.k(dialogInterface, i10);
                                            }
                                        }).show();
                                    } else if (hVar instanceof C11932p.h.c) {
                                        this.f104238d.invoke();
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f142422a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1505b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f104232a == 0) {
                                ResultKt.b(obj);
                                C17154h.J(C17154h.O(this.f104233b.E1().F().b(), new C1506a(this.f104233b, this.f104234c, null)), C6031t.a(this.f104233b));
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, Function0<? extends C0> function0, z1<PickupPersonViewState> z1Var) {
                        this.f104228a = localThemeScope;
                        this.f104229b = pickupPersonFormActivity;
                        this.f104230c = function0;
                        this.f104231d = z1Var;
                    }

                    public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
                        LocalThemeScope localThemeScope = this.f104228a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                        boolean zG1 = this.f104229b.G1();
                        PickupPersonViewState pickupPersonViewStateC = b.c(this.f104231d);
                        C11932p c11932pE1 = this.f104229b.E1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(c11932pE1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1504a(c11932pE1);
                            composer.t(objB);
                        }
                        composer.P();
                        C.t(localThemeScope, modifierH, zG1, pickupPersonViewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 0);
                        Unit unit = Unit.f142422a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(this.f104229b) | composer.V(this.f104230c);
                        PickupPersonFormActivity pickupPersonFormActivity = this.f104229b;
                        Function0<C0> function0 = this.f104230c;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new C1505b(pickupPersonFormActivity, function0, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit, (Function2) objB2, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        a(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1501b(C17927c1 c17927c1, LocalThemeScope localThemeScope, PickupPersonFormActivity pickupPersonFormActivity, z1<PickupPersonViewState> z1Var, Function0<? extends C0> function0) {
                    this.f104218a = c17927c1;
                    this.f104219b = localThemeScope;
                    this.f104220c = pickupPersonFormActivity;
                    this.f104221d = z1Var;
                    this.f104222e = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2086029863, i10, -1, "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PickupPersonFormActivity.kt:114)");
                    }
                    C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f104218a, ComposableLambdaKt.c(1444608436, true, new C1502a(this.f104219b, this.f104220c), composer, 54), ComposableLambdaKt.c(-427253293, true, new C1503b(this.f104219b, this.f104220c, this.f104221d), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(456903899, true, new c(this.f104219b, this.f104220c, this.f104222e, this.f104221d), composer, 54), composer, 3456, 12582912, 131056);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$closeSheet$1$1$1", f = "PickupPersonFormActivity.kt", l = {90}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104239a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f104240b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f104240b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C17893M0 c17893m0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f104240b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f104239a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f104240b;
                        this.f104239a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity$onCreate$1$1$openSheet$1$1$1", f = "PickupPersonFormActivity.kt", l = {87}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104241a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f104242b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f104242b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17893M0 c17893m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f104242b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f104241a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f104242b;
                        this.f104241a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, PickupPersonFormActivity pickupPersonFormActivity, C17927c1 c17927c1, z1<PickupPersonViewState> z1Var) {
                this.f104210a = interfaceC16622O;
                this.f104211b = c17893m0;
                this.f104212c = pickupPersonFormActivity;
                this.f104213d = c17927c1;
                this.f104214e = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 e(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                return C16648k.d(interfaceC16622O, null, null, new d(c17893m0, null), 3, null);
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
                boolean zD = composer.D(this.f104210a) | composer.D(this.f104211b);
                final InterfaceC16622O interfaceC16622O = this.f104210a;
                final C17893M0 c17893m0 = this.f104211b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.e(interfaceC16622O, c17893m0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f104212c) | composer.D(this.f104210a) | composer.D(this.f104211b);
                final PickupPersonFormActivity pickupPersonFormActivity = this.f104212c;
                final InterfaceC16622O interfaceC16622O2 = this.f104210a;
                final C17893M0 c17893m02 = this.f104211b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.f(pickupPersonFormActivity, interfaceC16622O2, c17893m02);
                        }
                    };
                    composer.t(objB2);
                }
                final Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(this.f104211b) | composer.V(function02) | composer.D(this.f104212c);
                final C17893M0 c17893m03 = this.f104211b;
                final PickupPersonFormActivity pickupPersonFormActivity2 = this.f104212c;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.pickupperson.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PickupPersonFormActivity.b.a.g(c17893m03, function02, pickupPersonFormActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13588d.a(false, (Function0) objB3, composer, 0, 1);
                float f10 = 10;
                C17891L0.b(ComposableLambdaKt.c(559394418, true, new C1500a(AdsTheme, this.f104212c, function02), composer, 54), null, this.f104211b, false, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-2086029863, true, new C1501b(this.f104213d, AdsTheme, this.f104212c, this.f104214e, function0), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 490);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 f(PickupPersonFormActivity pickupPersonFormActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                Ds.p.d(pickupPersonFormActivity.getWindow());
                return C16648k.d(interfaceC16622O, null, null, new c(c17893m0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C17893M0 c17893m0, Function0 function0, PickupPersonFormActivity pickupPersonFormActivity) {
                if (c17893m0.k()) {
                    function0.invoke();
                } else {
                    pickupPersonFormActivity.finish();
                }
                return Unit.f142422a;
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
            z1 z1VarB = o1.b(PickupPersonFormActivity.this.E1().F().c(), null, composer, 0, 1);
            C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1318731680, true, new a((InterfaceC16622O) objB, C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6), PickupPersonFormActivity.this, c17927c1G, z1VarB), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PickupPersonViewState c(z1<PickupPersonViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f104243f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104243f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f104244f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f104244f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104245f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104246g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104245f = function0;
            this.f104246g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104245f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104246g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C11932p E1() {
        return (C11932p) this.viewModel.getValue();
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
        E1().K(new C11932p.g.UpdateFlow(G1(), F1()));
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1818646769, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Checkout | Add Contact Info").start();
    }
}

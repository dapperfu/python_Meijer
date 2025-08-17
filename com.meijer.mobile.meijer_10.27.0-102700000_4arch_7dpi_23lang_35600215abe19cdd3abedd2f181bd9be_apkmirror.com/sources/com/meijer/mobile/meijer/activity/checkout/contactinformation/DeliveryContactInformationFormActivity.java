package com.meijer.mobile.meijer.activity.checkout.contactinformation;

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
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "s", "Lkotlin/Lazy;", "E1", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "viewModel", "", "F1", "()Z", "isEditMode", "t", "a", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DeliveryContactInformationFormActivity extends Hilt_DeliveryContactInformationFormActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f102322u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(H.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isEditMode", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Z)Landroid/content/Intent;", "", "EXTRA_IS_EDIT_MODE", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(context, z10);
        }

        @JvmStatic
        public final Intent a(Context context, boolean isEditMode) {
            Intrinsics.j(context, "context");
            Intent intent = new Intent(context, (Class<?>) DeliveryContactInformationFormActivity.class);
            intent.putExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationFormActivity.IS_EDIT_MODE", isEditMode);
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f102325a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f102326b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DeliveryContactInformationFormActivity f102327c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17927c1 f102328d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<DeliveryContactInformationViewState> f102329e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$a, reason: collision with other inner class name */
            static final class C1436a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102330a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationFormActivity f102331b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f102332c;

                /* JADX WARN: Multi-variable type inference failed */
                C1436a(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0) {
                    this.f102330a = localThemeScope;
                    this.f102331b = deliveryContactInformationFormActivity;
                    this.f102332c = function0;
                }

                public final void b(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-161389831, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:93)");
                    }
                    LocalThemeScope localThemeScope = this.f102330a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f102331b) | composer.V(this.f102332c);
                    final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102331b;
                    final Function0<C0> function0 = this.f102332c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DeliveryContactInformationFormActivity.b.a.C1436a.c(deliveryContactInformationFormActivity, function0);
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
                public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0 function0) {
                    deliveryContactInformationFormActivity.E1().K(new H.g.SetOptIn(true));
                    function0.invoke();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b, reason: collision with other inner class name */
            static final class C1437b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17927c1 f102333a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102334b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationFormActivity f102335c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<DeliveryContactInformationViewState> f102336d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f102337e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1438a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102338a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f102339b;

                    C1438a(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        this.f102338a = localThemeScope;
                        this.f102339b = deliveryContactInformationFormActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1047748027, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:105)");
                        }
                        LocalThemeScope localThemeScope = this.f102338a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                        Integer numValueOf = this.f102339b.F1() ? Integer.valueOf(Y.f99551F1) : null;
                        String strC = C16193g.c(numValueOf != null ? numValueOf.intValue() : Y.f99665L1, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f102339b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102339b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.v
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1437b.C1438a.c(deliveryContactInformationFormActivity);
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
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.finish();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1439b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102340a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f102341b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<DeliveryContactInformationViewState> f102342c;

                    C1439b(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, z1<DeliveryContactInformationViewState> z1Var) {
                        this.f102340a = localThemeScope;
                        this.f102341b = deliveryContactInformationFormActivity;
                        this.f102342c = z1Var;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(632700442, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:156)");
                        }
                        LocalThemeScope localThemeScope = this.f102340a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f102341b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102341b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1437b.C1439b.c(deliveryContactInformationFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        Integer numValueOf = this.f102341b.F1() ? Integer.valueOf(Y.f100046eh) : null;
                        C2908x.b(localThemeScope, modifierH, function0, C16193g.c(numValueOf != null ? numValueOf.intValue() : Y.f100026dh, composer, 0), b.c(this.f102342c).getIsEnableContinueButton(), null, null, false, composer, LocalThemeScope.f15770g | 48, 112);
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
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.E1().K(H.g.j.f102394a);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102343a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f102344b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function0<C0> f102345c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<DeliveryContactInformationViewState> f102346d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$a, reason: collision with other inner class name */
                    /* synthetic */ class C1440a extends FunctionReferenceImpl implements Function1<H.g, Unit> {
                        C1440a(Object obj) {
                            super(1, obj, H.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormViewModel$Action;)V", 0);
                        }

                        public final void a(H.g p02) {
                            Intrinsics.j(p02, "p0");
                            ((H) this.receiver).K(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(H.g gVar) {
                            a(gVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$3$3$3$1", f = "DeliveryContactInformationFormActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1441b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f102347a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ DeliveryContactInformationFormActivity f102348b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function0<C0> f102349c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1441b(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, Continuation<? super C1441b> continuation) {
                            super(2, continuation);
                            this.f102348b = deliveryContactInformationFormActivity;
                            this.f102349c = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1441b(this.f102348b, this.f102349c, continuation);
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$3$3$3$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {}, m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1442a extends SuspendLambda implements Function2<H.j, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f102350a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f102351b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ DeliveryContactInformationFormActivity f102352c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<C0> f102353d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1442a(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, Continuation<? super C1442a> continuation) {
                                super(2, continuation);
                                this.f102352c = deliveryContactInformationFormActivity;
                                this.f102353d = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1442a c1442a = new C1442a(this.f102352c, this.f102353d, continuation);
                                c1442a.f102351b = obj;
                                return c1442a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(H.j jVar, Continuation<? super Unit> continuation) {
                                return ((C1442a) create(jVar, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void k(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.f();
                                if (this.f102350a == 0) {
                                    ResultKt.b(obj);
                                    H.j jVar = (H.j) this.f102351b;
                                    if (jVar instanceof H.j.a) {
                                        DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102352c;
                                        Intent intentB = null;
                                        Intent intentB2 = CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, deliveryContactInformationFormActivity, null, 2, null);
                                        if (this.f102352c.F1()) {
                                            intentB = intentB2;
                                        }
                                        if (intentB == null) {
                                            intentB = CheckoutPaymentHostActivity.Companion.b(CheckoutPaymentHostActivity.INSTANCE, this.f102352c, false, false, true, 6, null);
                                        }
                                        deliveryContactInformationFormActivity.startActivity(intentB);
                                        Unit unit = Unit.f142422a;
                                    } else if (jVar instanceof H.j.b) {
                                        new C14886b(this.f102352c).setCancelable(false).setTitle(Y.f99680Lg).setMessage(Y.f99661Kg).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.y
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                                DeliveryContactInformationFormActivity.b.a.C1437b.c.C1441b.C1442a.k(dialogInterface, i10);
                                            }
                                        }).show();
                                    } else if (jVar instanceof H.j.c) {
                                        this.f102353d.invoke();
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
                            return ((C1441b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f102347a == 0) {
                                ResultKt.b(obj);
                                C17154h.J(C17154h.O(this.f102348b.E1().H().b(), new C1442a(this.f102348b, this.f102349c, null)), C6031t.a(this.f102348b));
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, z1<DeliveryContactInformationViewState> z1Var) {
                        this.f102343a = localThemeScope;
                        this.f102344b = deliveryContactInformationFormActivity;
                        this.f102345c = function0;
                        this.f102346d = z1Var;
                    }

                    public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
                        Intrinsics.j(paddingValues, "paddingValues");
                        if ((i10 & 6) == 0) {
                            i10 |= composer.V(paddingValues) ? 4 : 2;
                        }
                        if ((i10 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(212117282, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:113)");
                        }
                        LocalThemeScope localThemeScope = this.f102343a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        boolean zF1 = this.f102344b.F1();
                        DeliveryContactInformationViewState oC = b.c(this.f102346d);
                        H hE1 = this.f102344b.E1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(hE1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1440a(hE1);
                            composer.t(objB);
                        }
                        composer.P();
                        Function1 function1 = (Function1) ((KFunction) objB);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f102344b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102344b;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1437b.c.c(deliveryContactInformationFormActivity);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        C11816l.s(localThemeScope, modifierH, zF1, oC, function1, (Function0) objB2, composer, LocalThemeScope.f15770g, 0);
                        Unit unit = Unit.f142422a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD3 = composer.D(this.f102344b) | composer.V(this.f102345c);
                        DeliveryContactInformationFormActivity deliveryContactInformationFormActivity2 = this.f102344b;
                        Function0<C0> function0 = this.f102345c;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new C1441b(deliveryContactInformationFormActivity2, function0, null);
                            composer.t(objB3);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit, (Function2) objB3, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        b(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.E1().K(H.g.c.f102385a);
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1437b(C17927c1 c17927c1, LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, z1<DeliveryContactInformationViewState> z1Var, Function0<? extends C0> function0) {
                    this.f102333a = c17927c1;
                    this.f102334b = localThemeScope;
                    this.f102335c = deliveryContactInformationFormActivity;
                    this.f102336d = z1Var;
                    this.f102337e = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1834561376, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:101)");
                    }
                    C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f102333a, ComposableLambdaKt.c(1047748027, true, new C1438a(this.f102334b, this.f102335c), composer, 54), ComposableLambdaKt.c(632700442, true, new C1439b(this.f102334b, this.f102335c, this.f102336d), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(212117282, true, new c(this.f102334b, this.f102335c, this.f102337e, this.f102336d), composer, 54), composer, 3456, 12582912, 131056);
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
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$closeSheet$1$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {79}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f102354a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f102355b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f102355b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C17893M0 c17893m0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f102355b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f102354a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f102355b;
                        this.f102354a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$openSheet$1$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {76}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f102356a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f102357b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f102357b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17893M0 c17893m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f102357b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f102356a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f102357b;
                        this.f102356a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, C17927c1 c17927c1, z1<DeliveryContactInformationViewState> z1Var) {
                this.f102325a = interfaceC16622O;
                this.f102326b = c17893m0;
                this.f102327c = deliveryContactInformationFormActivity;
                this.f102328d = c17927c1;
                this.f102329e = z1Var;
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
                    ComposerKt.U(86866279, i11, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:75)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f102325a) | composer.D(this.f102326b);
                final InterfaceC16622O interfaceC16622O = this.f102325a;
                final C17893M0 c17893m0 = this.f102326b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.e(interfaceC16622O, c17893m0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f102327c) | composer.D(this.f102325a) | composer.D(this.f102326b);
                final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f102327c;
                final InterfaceC16622O interfaceC16622O2 = this.f102325a;
                final C17893M0 c17893m02 = this.f102326b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.f(deliveryContactInformationFormActivity, interfaceC16622O2, c17893m02);
                        }
                    };
                    composer.t(objB2);
                }
                final Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(this.f102326b) | composer.V(function02) | composer.D(this.f102327c);
                final C17893M0 c17893m03 = this.f102326b;
                final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity2 = this.f102327c;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.g(c17893m03, function02, deliveryContactInformationFormActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13588d.a(false, (Function0) objB3, composer, 0, 1);
                float f10 = 10;
                C17891L0.b(ComposableLambdaKt.c(-161389831, true, new C1436a(AdsTheme, this.f102327c, function02), composer, 54), null, this.f102326b, false, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-1834561376, true, new C1437b(this.f102328d, AdsTheme, this.f102327c, this.f102329e, function0), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 490);
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
            public static final C0 f(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                Ds.p.d(deliveryContactInformationFormActivity.getWindow());
                return C16648k.d(interfaceC16622O, null, null, new c(c17893m0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C17893M0 c17893m0, Function0 function0, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                if (c17893m0.k()) {
                    function0.invoke();
                } else {
                    deliveryContactInformationFormActivity.finish();
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
                ComposerKt.U(-1525484458, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous> (DeliveryContactInformationFormActivity.kt:66)");
            }
            z1 z1VarB = o1.b(DeliveryContactInformationFormActivity.this.E1().H().c(), null, composer, 0, 1);
            C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            Ji.K.b(null, ComposableLambdaKt.c(86866279, true, new a((InterfaceC16622O) objB, C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6), DeliveryContactInformationFormActivity.this, c17927c1G, z1VarB), composer, 54), composer, 48, 1);
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
        public static final DeliveryContactInformationViewState c(z1<DeliveryContactInformationViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f102358f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102358f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f102359f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f102359f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102360f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102361g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102360f = function0;
            this.f102361g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102360f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102361g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H E1() {
        return (H) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F1() {
        return getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationFormActivity.IS_EDIT_MODE", false);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        E1().K(new H.g.UpdateFlow(F1()));
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1525484458, true, new b()), 1, null);
    }
}

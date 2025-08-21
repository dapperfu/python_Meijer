package com.meijer.mobile.meijer.activity.checkout.contactinformation;

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
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.H;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
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
import r0.C16806i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "s", "Lkotlin/Lazy;", "E1", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H;", "viewModel", "", "F1", "()Z", "isEditMode", "t", "a", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DeliveryContactInformationFormActivity extends Hilt_DeliveryContactInformationFormActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f103177u = 8;

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
            final /* synthetic */ InterfaceC15783O f103180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f103181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DeliveryContactInformationFormActivity f103182c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17993c1 f103183d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<DeliveryContactInformationViewState> f103184e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$a, reason: collision with other inner class name */
            static final class C1445a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103185a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationFormActivity f103186b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f103187c;

                /* JADX WARN: Multi-variable type inference failed */
                C1445a(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0) {
                    this.f103185a = localThemeScope;
                    this.f103186b = deliveryContactInformationFormActivity;
                    this.f103187c = function0;
                }

                public final void b(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-161389831, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:93)");
                    }
                    LocalThemeScope localThemeScope = this.f103185a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f103186b) | composer.V(this.f103187c);
                    final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103186b;
                    final Function0<C0> function0 = this.f103187c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DeliveryContactInformationFormActivity.b.a.C1445a.c(deliveryContactInformationFormActivity, function0);
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
                public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0 function0) {
                    deliveryContactInformationFormActivity.E1().M(new H.g.SetOptIn(true));
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b, reason: collision with other inner class name */
            static final class C1446b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17993c1 f103188a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103189b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ DeliveryContactInformationFormActivity f103190c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<DeliveryContactInformationViewState> f103191d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f103192e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1447a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103193a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f103194b;

                    C1447a(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        this.f103193a = localThemeScope;
                        this.f103194b = deliveryContactInformationFormActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1047748027, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:105)");
                        }
                        LocalThemeScope localThemeScope = this.f103193a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                        Integer numValueOf = this.f103194b.F1() ? Integer.valueOf(Y.f100413F1) : null;
                        String strC = C16338g.c(numValueOf != null ? numValueOf.intValue() : Y.f100527L1, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f103194b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103194b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.v
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1446b.C1447a.c(deliveryContactInformationFormActivity);
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
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.finish();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1448b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103195a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f103196b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<DeliveryContactInformationViewState> f103197c;

                    C1448b(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, z1<DeliveryContactInformationViewState> z1Var) {
                        this.f103195a = localThemeScope;
                        this.f103196b = deliveryContactInformationFormActivity;
                        this.f103197c = z1Var;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(632700442, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:156)");
                        }
                        LocalThemeScope localThemeScope = this.f103195a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f103196b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103196b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1446b.C1448b.c(deliveryContactInformationFormActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        Integer numValueOf = this.f103196b.F1() ? Integer.valueOf(Y.f101007jh) : null;
                        C3013x.b(localThemeScope, modifierH, function0, C16338g.c(numValueOf != null ? numValueOf.intValue() : Y.f100987ih, composer, 0), b.c(this.f103197c).getIsEnableContinueButton(), null, null, false, composer, LocalThemeScope.f17314g | 48, 112);
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
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.E1().M(H.g.j.f103247a);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103198a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ DeliveryContactInformationFormActivity f103199b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function0<C0> f103200c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<DeliveryContactInformationViewState> f103201d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$a, reason: collision with other inner class name */
                    /* synthetic */ class C1449a extends FunctionReferenceImpl implements Function1<H.g, Unit> {
                        C1449a(Object obj) {
                            super(1, obj, H.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/DeliveryContactInformationFormViewModel$Action;)V", 0);
                        }

                        public final void a(H.g p02) {
                            Intrinsics.j(p02, "p0");
                            ((H) this.receiver).M(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(H.g gVar) {
                            a(gVar);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$3$3$3$1", f = "DeliveryContactInformationFormActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1450b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f103202a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ DeliveryContactInformationFormActivity f103203b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function0<C0> f103204c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1450b(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, Continuation<? super C1450b> continuation) {
                            super(2, continuation);
                            this.f103203b = deliveryContactInformationFormActivity;
                            this.f103204c = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1450b(this.f103203b, this.f103204c, continuation);
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/H$j;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$3$3$3$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {}, m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1451a extends SuspendLambda implements Function2<H.j, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f103205a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f103206b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ DeliveryContactInformationFormActivity f103207c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<C0> f103208d;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1451a(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, Continuation<? super C1451a> continuation) {
                                super(2, continuation);
                                this.f103207c = deliveryContactInformationFormActivity;
                                this.f103208d = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1451a c1451a = new C1451a(this.f103207c, this.f103208d, continuation);
                                c1451a.f103206b = obj;
                                return c1451a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: g, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(H.j jVar, Continuation<? super Unit> continuation) {
                                return ((C1451a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void k(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.f();
                                if (this.f103205a == 0) {
                                    ResultKt.b(obj);
                                    H.j jVar = (H.j) this.f103206b;
                                    if (jVar instanceof H.j.a) {
                                        DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103207c;
                                        Intent intentB = null;
                                        Intent intentB2 = CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, deliveryContactInformationFormActivity, null, 2, null);
                                        if (this.f103207c.F1()) {
                                            intentB = intentB2;
                                        }
                                        if (intentB == null) {
                                            intentB = CheckoutPaymentHostActivity.Companion.b(CheckoutPaymentHostActivity.INSTANCE, this.f103207c, false, false, true, 6, null);
                                        }
                                        deliveryContactInformationFormActivity.startActivity(intentB);
                                        Unit unit = Unit.f143329a;
                                    } else if (jVar instanceof H.j.b) {
                                        new C15485b(this.f103207c).setCancelable(false).setTitle(Y.f100637Qg).setMessage(Y.f100580Ng).setPositiveButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.y
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                                DeliveryContactInformationFormActivity.b.a.C1446b.c.C1450b.C1451a.k(dialogInterface, i10);
                                            }
                                        }).show();
                                    } else if (jVar instanceof H.j.c) {
                                        this.f103208d.invoke();
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
                            return ((C1450b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f103202a == 0) {
                                ResultKt.b(obj);
                                C16563h.J(C16563h.O(this.f103203b.E1().J().b(), new C1451a(this.f103203b, this.f103204c, null)), C6173t.a(this.f103203b));
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, Function0<? extends C0> function0, z1<DeliveryContactInformationViewState> z1Var) {
                        this.f103198a = localThemeScope;
                        this.f103199b = deliveryContactInformationFormActivity;
                        this.f103200c = function0;
                        this.f103201d = z1Var;
                    }

                    public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
                        LocalThemeScope localThemeScope = this.f103198a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        boolean zF1 = this.f103199b.F1();
                        DeliveryContactInformationViewState oC = b.c(this.f103201d);
                        H hE1 = this.f103199b.E1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(hE1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1449a(hE1);
                            composer.t(objB);
                        }
                        composer.P();
                        Function1 function1 = (Function1) ((KFunction) objB);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f103199b);
                        final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103199b;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DeliveryContactInformationFormActivity.b.a.C1446b.c.c(deliveryContactInformationFormActivity);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        C11941l.s(localThemeScope, modifierH, zF1, oC, function1, (Function0) objB2, composer, LocalThemeScope.f17314g, 0);
                        Unit unit = Unit.f143329a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD3 = composer.D(this.f103199b) | composer.V(this.f103200c);
                        DeliveryContactInformationFormActivity deliveryContactInformationFormActivity2 = this.f103199b;
                        Function0<C0> function0 = this.f103200c;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new C1450b(deliveryContactInformationFormActivity2, function0, null);
                            composer.t(objB3);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit, (Function2) objB3, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                        b(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                        deliveryContactInformationFormActivity.E1().M(H.g.c.f103238a);
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1446b(C17993c1 c17993c1, LocalThemeScope localThemeScope, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, z1<DeliveryContactInformationViewState> z1Var, Function0<? extends C0> function0) {
                    this.f103188a = c17993c1;
                    this.f103189b = localThemeScope;
                    this.f103190c = deliveryContactInformationFormActivity;
                    this.f103191d = z1Var;
                    this.f103192e = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1834561376, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:101)");
                    }
                    C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), this.f103188a, ComposableLambdaKt.c(1047748027, true, new C1447a(this.f103189b, this.f103190c), composer, 54), ComposableLambdaKt.c(632700442, true, new C1448b(this.f103189b, this.f103190c, this.f103191d), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(212117282, true, new c(this.f103189b, this.f103190c, this.f103192e, this.f103191d), composer, 54), composer, 3456, 12582912, 131056);
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
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$closeSheet$1$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {79}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f103209a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f103210b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f103210b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C17959M0 c17959m0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f103210b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f103209a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f103210b;
                        this.f103209a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity$onCreate$1$1$openSheet$1$1$1", f = "DeliveryContactInformationFormActivity.kt", l = {76}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f103211a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f103212b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f103212b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17959M0 c17959m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f103212b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f103211a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f103212b;
                        this.f103211a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, C17993c1 c17993c1, z1<DeliveryContactInformationViewState> z1Var) {
                this.f103180a = interfaceC15783O;
                this.f103181b = c17959m0;
                this.f103182c = deliveryContactInformationFormActivity;
                this.f103183d = c17993c1;
                this.f103184e = z1Var;
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
                    ComposerKt.U(86866279, i11, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous>.<anonymous> (DeliveryContactInformationFormActivity.kt:75)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f103180a) | composer.D(this.f103181b);
                final InterfaceC15783O interfaceC15783O = this.f103180a;
                final C17959M0 c17959m0 = this.f103181b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.e(interfaceC15783O, c17959m0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f103182c) | composer.D(this.f103180a) | composer.D(this.f103181b);
                final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity = this.f103182c;
                final InterfaceC15783O interfaceC15783O2 = this.f103180a;
                final C17959M0 c17959m02 = this.f103181b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.f(deliveryContactInformationFormActivity, interfaceC15783O2, c17959m02);
                        }
                    };
                    composer.t(objB2);
                }
                final Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(this.f103181b) | composer.V(function02) | composer.D(this.f103182c);
                final C17959M0 c17959m03 = this.f103181b;
                final DeliveryContactInformationFormActivity deliveryContactInformationFormActivity2 = this.f103182c;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.contactinformation.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeliveryContactInformationFormActivity.b.a.g(c17959m03, function02, deliveryContactInformationFormActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13736d.a(false, (Function0) objB3, composer, 0, 1);
                float f10 = 10;
                C17957L0.b(ComposableLambdaKt.c(-161389831, true, new C1445a(AdsTheme, this.f103182c, function02), composer, 54), null, this.f103181b, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-1834561376, true, new C1446b(this.f103183d, AdsTheme, this.f103182c, this.f103184e, function0), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
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
            public static final C0 f(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
                Ds.p.d(deliveryContactInformationFormActivity.getWindow());
                return C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C17959M0 c17959m0, Function0 function0, DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
                if (c17959m0.k()) {
                    function0.invoke();
                } else {
                    deliveryContactInformationFormActivity.finish();
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
                ComposerKt.U(-1525484458, i10, -1, "com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity.onCreate.<anonymous> (DeliveryContactInformationFormActivity.kt:66)");
            }
            z1 z1VarB = o1.b(DeliveryContactInformationFormActivity.this.E1().J().c(), null, composer, 0, 1);
            C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            Ki.K.b(null, ComposableLambdaKt.c(86866279, true, new a((InterfaceC15783O) objB, C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6), DeliveryContactInformationFormActivity.this, c17993c1G, z1VarB), composer, 54), composer, 48, 1);
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
        public static final DeliveryContactInformationViewState c(z1<DeliveryContactInformationViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103213f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f103213f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f103213f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f103214f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f103214f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f103215f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f103216g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f103215f = function0;
            this.f103216g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f103215f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f103216g.getDefaultViewModelCreationExtras() : creationExtras;
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
        E1().M(new H.g.UpdateFlow(F1()));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1525484458, true, new b()), 1, null);
    }
}

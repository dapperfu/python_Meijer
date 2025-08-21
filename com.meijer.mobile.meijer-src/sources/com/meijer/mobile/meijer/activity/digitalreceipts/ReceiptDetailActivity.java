package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ki.LocalThemeScope;
import Sm.p;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import e.C13737e;
import j$.time.LocalDateTime;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import wk.C17898a;
import zp.ReceiptIdentifier;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/ReceiptDetailActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LSm/p;", "s", "Lkotlin/Lazy;", "E1", "()LSm/p;", "viewModel", "LSm/p$c;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ReceiptDetailActivity extends Hilt_ReceiptDetailActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Sm.p.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity$a$a, reason: collision with other inner class name */
        static final class C1557a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReceiptDetailActivity f106349a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<p.ViewState> f106350b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1558a extends FunctionReferenceImpl implements Function1<p.b, Unit> {
                C1558a(Object obj) {
                    super(1, obj, Sm.p.class, "setError", "setError(Lcom/meijer/mobile/meijer/activity/digitalreceipts/viewmodel/ReceiptDetailViewModel$Error;)V", 0);
                }

                public final void a(p.b p02) {
                    Intrinsics.j(p02, "p0");
                    ((Sm.p) this.receiver).H(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(p.b bVar) {
                    a(bVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
                b(Object obj) {
                    super(0, obj, ReceiptDetailActivity.class, "finish", "finish()V", 0);
                }

                public final void a() {
                    ((ReceiptDetailActivity) this.receiver).finish();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            C1557a(ReceiptDetailActivity receiptDetailActivity, z1<p.ViewState> z1Var) {
                this.f106349a = receiptDetailActivity;
                this.f106350b = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2053388136, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity.onCreate.<anonymous>.<anonymous> (ReceiptDetailActivity.kt:43)");
                }
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                p.ViewState viewStateC = a.c(this.f106350b);
                Sm.p pVarE1 = this.f106349a.E1();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(pVarE1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1558a(pVarE1);
                    composer.t(objB);
                }
                composer.P();
                Function1 function1 = (Function1) ((KFunction) objB);
                ReceiptDetailActivity receiptDetailActivity = this.f106349a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(receiptDetailActivity);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(receiptDetailActivity);
                    composer.t(objB2);
                }
                composer.P();
                Rm.m.x(AdsTheme, modifierFsUnmask, viewStateC, function1, (Function0) ((KFunction) objB2), composer, LocalThemeScope.f17314g | (i10 & 14), 0);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity$onCreate$1$2$1", f = "ReceiptDetailActivity.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f106351a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptDetailActivity f106352b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ReceiptDetailActivity receiptDetailActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f106352b = receiptDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f106352b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f106351a == 0) {
                    ResultKt.b(obj);
                    this.f106352b.F1();
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-38703977, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity.onCreate.<anonymous> (ReceiptDetailActivity.kt:41)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(2053388136, true, new C1557a(ReceiptDetailActivity.this, o1.b(ReceiptDetailActivity.this.E1().w(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
            Boolean bool = Boolean.TRUE;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(ReceiptDetailActivity.this);
            ReceiptDetailActivity receiptDetailActivity = ReceiptDetailActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(receiptDetailActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
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
        public static final p.ViewState c(z1<p.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106353f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f106353f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106353f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106354f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f106354f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106354f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106355f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106356g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106355f = function0;
            this.f106356g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106355f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106356g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sm.p E1() {
        return (Sm.p) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1() {
        Object serializableExtra;
        if (getIntent().hasExtra("com.meijer.intent.extra.EXTRA_RECEIPT_ID_TAG")) {
            Sm.p pVarE1 = E1();
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            LocalDateTime localDateTime = null;
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_RECEIPT_ID_TAG", Long.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_RECEIPT_ID_TAG");
                if (!(serializableExtra2 instanceof Long)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Long) serializableExtra2;
            }
            Long l10 = (Long) serializableExtra;
            String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_NEXT_GEN_RECEIPT_ID_TAG");
            String stringExtra2 = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_REWARDS_TRANSACTION_DATE");
            if (stringExtra2 != null) {
                localDateTime = (LocalDateTime) wk.d.b(stringExtra2, C17898a.ISO_LOCAL_DATE_TIME, new uh.j());
            }
            pVarE1.v(new ReceiptIdentifier(l10, stringExtra, localDateTime));
            return;
        }
        if (getIntent().hasExtra("com.meijer.intent.extra.EXTRA_CUSTOMER_RESUBMIT_RECEIPT_TYPE_TAG")) {
            E1().G(getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_CUSTOMER_RESUBMIT_RECEIPT_TYPE_TAG", false));
            return;
        }
        qw.a.INSTANCE.k(ReceiptDetailActivity.class.getSimpleName() + " requires the receipt ID.", new Object[0]);
        E1().H(p.b.c.f34893b);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(E1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-38703977, true, new a()), 1, null);
    }
}

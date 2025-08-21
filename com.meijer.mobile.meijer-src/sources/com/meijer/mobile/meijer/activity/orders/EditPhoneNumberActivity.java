package com.meijer.mobile.meijer.activity.orders;

import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import e.C13737e;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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
import nn.C15986r;
import sn.C17085a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/EditPhoneNumberActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lsn/a;", "s", "Lkotlin/Lazy;", "D1", "()Lsn/a;", "viewModel", "t", "a", "Lsn/a$c;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class EditPhoneNumberActivity extends Hilt_EditPhoneNumberActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f111030u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(C17085a.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/EditPhoneNumberActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, String orderId) {
            Intrinsics.j(context, "context");
            Intrinsics.j(orderId, "orderId");
            Intent intent = new Intent(context, (Class<?>) EditPhoneNumberActivity.class);
            intent.putExtra("orderID", orderId);
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
            final /* synthetic */ EditPhoneNumberActivity f111033a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<C17085a.ViewState> f111034b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1687a extends FunctionReferenceImpl implements Function1<C17085a.AbstractC2511a, Unit> {
                C1687a(Object obj) {
                    super(1, obj, C17085a.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/orders/viewmodel/EditPhoneNumberViewModel$EditPhoneNumberAction;)V", 0);
                }

                public final void a(C17085a.AbstractC2511a p02) {
                    Intrinsics.j(p02, "p0");
                    ((C17085a) this.receiver).x(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C17085a.AbstractC2511a abstractC2511a) {
                    a(abstractC2511a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity$b$a$b, reason: collision with other inner class name */
            /* synthetic */ class C1688b extends FunctionReferenceImpl implements Function0<Unit> {
                C1688b(Object obj) {
                    super(0, obj, EditPhoneNumberActivity.class, "finish", "finish()V", 0);
                }

                public final void a() {
                    ((EditPhoneNumberActivity) this.receiver).finish();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            a(EditPhoneNumberActivity editPhoneNumberActivity, z1<C17085a.ViewState> z1Var) {
                this.f111033a = editPhoneNumberActivity;
                this.f111034b = z1Var;
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
                    ComposerKt.U(-1708864630, i10, -1, "com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity.onCreate.<anonymous>.<anonymous> (EditPhoneNumberActivity.kt:35)");
                }
                String stringExtra = this.f111033a.getIntent().getStringExtra("orderID");
                C17085a.ViewState viewStateC = b.c(this.f111034b);
                C17085a c17085aD1 = this.f111033a.D1();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(c17085aD1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1687a(c17085aD1);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                EditPhoneNumberActivity editPhoneNumberActivity = this.f111033a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(editPhoneNumberActivity);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1688b(editPhoneNumberActivity);
                    composer.t(objB2);
                }
                composer.P();
                C15986r.G(AdsTheme, modifierFsUnmask, stringExtra, viewStateC, (Function1) kFunction, (Function0) ((KFunction) objB2), composer, LocalThemeScope.f17314g | (i10 & 14), 0);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1506333947, i10, -1, "com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity.onCreate.<anonymous> (EditPhoneNumberActivity.kt:33)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1708864630, true, new a(EditPhoneNumberActivity.this, o1.b(EditPhoneNumberActivity.this.D1().w(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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
        public static final C17085a.ViewState c(z1<C17085a.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111035f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111035f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111035f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111036f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111036f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111037f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111038g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111037f = function0;
            this.f111038g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111037f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111038g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17085a D1() {
        return (C17085a) this.viewModel.getValue();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        D1().x(C17085a.AbstractC2511a.C2512a.f161227a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(D1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1506333947, true, new b()), 1, null);
    }
}

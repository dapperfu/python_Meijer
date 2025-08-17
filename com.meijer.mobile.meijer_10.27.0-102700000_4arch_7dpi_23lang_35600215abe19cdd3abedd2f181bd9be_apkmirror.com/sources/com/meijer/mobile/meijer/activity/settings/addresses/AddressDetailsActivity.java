package com.meijer.mobile.meijer.activity.settings.addresses;

import Bn.SplitAddress;
import Dh.AccountAddress;
import Dn.w;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import P0.e;
import V0.C5346q0;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.F;
import androidx.view.I;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.settings.AddressChooserDialogFragment;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity;
import e.C13589e;
import j0.C14801J;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import je.C14886b;
import ji.C14949n;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.j1;
import ji.q1;
import kotlin.C17921a1;
import kotlin.C17988z0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import tv.C17154h;
import wk.C17829a;
import yl.AbstractC18227f;
import zn.O;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J-\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressDetailsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/settings/a;", "<init>", "()V", "", "R1", "", "shouldDisplayDialog", "L1", "(Z)V", "LBn/e;", "suggestedAddress", "originalAddress", "W1", "(LBn/e;LBn/e;)V", "P1", "isSaveCheckBoxSelected", "isAddressRemoved", "", "serviceTier", "U1", "(ZZLjava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "splitAddress", "isSuggested", "l", "(LBn/e;Z)V", "Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment;", "s", "Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment;", "addressDialogFragment", "LDn/w;", "t", "Lkotlin/Lazy;", "O1", "()LDn/w;", "addressDetailsViewModel", "u", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AddressDetailsActivity extends Hilt_AddressDetailsActivity implements com.meijer.mobile.meijer.activity.settings.a {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f111735v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AddressChooserDialogFragment addressDialogFragment;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy addressDetailsViewModel = new e0(Reflection.b(Dn.w.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/AddressDetailsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LDh/a;", "accountAddress", "", "fromOrderOptions", "", "accountAddressSize", "Landroid/content/Intent;", "a", "(Landroid/content/Context;LDh/a;ZLjava/lang/Integer;)Landroid/content/Intent;", "", "EXTRA_ACCOUNT_ADDRESS", "Ljava/lang/String;", "EXTRA_FROM_ORDER_OPTIONS", "EXTRA_ACCOUNT_ADDRESS_SIZE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, AccountAddress accountAddress, boolean fromOrderOptions, Integer accountAddressSize) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) AddressDetailsActivity.class).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_ACCOUNT_ADDRESS", accountAddress).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_FROM_ORDER_OPTIONS", fromOrderOptions).putExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", accountAddressSize);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111764f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111764f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111764f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111765f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f111765f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111765f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111767g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111766f = function0;
            this.f111767g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111766f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111767g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn/w$g;", "viewState", "", "<anonymous>", "(LDn/w$g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$onCreate$2", f = "AddressDetailsActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<w.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111738a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111739b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w.ViewState f111741a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AddressDetailsActivity f111742b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a, reason: collision with other inner class name */
            static final class C1740a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w.ViewState f111743a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AddressDetailsActivity f111744b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1741a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111745a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ w.ViewState f111746b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AddressDetailsActivity f111747c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$a$a, reason: collision with other inner class name */
                    static final class C1742a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111748a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ w.ViewState f111749b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ AddressDetailsActivity f111750c;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$a$a$a, reason: collision with other inner class name */
                        static final class C1743a implements Function3<j1, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f111751a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ w.ViewState f111752b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ AddressDetailsActivity f111753c;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$a$a$a$a, reason: collision with other inner class name */
                            static final class C1744a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ LocalThemeScope f111754a;

                                C1744a(LocalThemeScope localThemeScope) {
                                    this.f111754a = localThemeScope;
                                }

                                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                                    Intrinsics.j(AdsButton, "$this$AdsButton");
                                    if ((i10 & 17) == 16 && composer.j()) {
                                        composer.K();
                                        return;
                                    }
                                    if (ComposerKt.M()) {
                                        ComposerKt.U(1904595926, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:131)");
                                    }
                                    C17988z0.a(C16190d.c(C.f.o.f15522e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C6408b.a(AbstractC5607a.INSTANCE.d(Y.f99653K8, new Object[0]), composer, AbstractC5607a.f45514b), null, this.f111754a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
                                    if (ComposerKt.M()) {
                                        ComposerKt.T();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                                    a(interfaceC14800I, composer, num.intValue());
                                    return Unit.f142422a;
                                }
                            }

                            C1743a(LocalThemeScope localThemeScope, w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                                this.f111751a = localThemeScope;
                                this.f111752b = gVar;
                                this.f111753c = addressDetailsActivity;
                            }

                            public final void b(j1 Assemble, Composer composer, int i10) {
                                Intrinsics.j(Assemble, "$this$Assemble");
                                if (ComposerKt.M()) {
                                    ComposerKt.U(-2122049047, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:117)");
                                }
                                LocalThemeScope localThemeScope = this.f111751a;
                                q1.d.StandardButton enabledButton = Assemble.d().getEnabledButton();
                                composer.startReplaceGroup(-1633490746);
                                boolean zD = composer.D(this.f111752b) | composer.D(this.f111753c);
                                final w.ViewState gVar = this.f111752b;
                                final AddressDetailsActivity addressDetailsActivity = this.f111753c;
                                Object objB = composer.B();
                                if (zD || objB == Composer.INSTANCE.a()) {
                                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.h
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AddressDetailsActivity.b.a.C1740a.C1741a.C1742a.C1743a.c(gVar, addressDetailsActivity);
                                        }
                                    };
                                    composer.t(objB);
                                }
                                composer.P();
                                E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1904595926, true, new C1744a(this.f111751a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                                b(j1Var, composer, num.intValue());
                                return Unit.f142422a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit c(w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                                if (gVar.getViewMode() == w.e.f6976c) {
                                    addressDetailsActivity.O1().G(new w.c.UpdateAddressMode(w.e.f6975b));
                                } else {
                                    addressDetailsActivity.getOnBackPressedDispatcher().l();
                                }
                                return Unit.f142422a;
                            }
                        }

                        C1742a(LocalThemeScope localThemeScope, w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                            this.f111748a = localThemeScope;
                            this.f111749b = gVar;
                            this.f111750c = addressDetailsActivity;
                        }

                        public final void a(InterfaceC14800I AdsTopBar, Composer composer, int i10) {
                            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(-981344735, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:115)");
                            }
                            LocalThemeScope localThemeScope = this.f111748a;
                            w.ViewState gVar = this.f111749b;
                            AddressDetailsActivity addressDetailsActivity = this.f111750c;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                            int iA = C5717f.a(composer, 0);
                            InterfaceC5742s interfaceC5742sR = composer.r();
                            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                            Function0<InterfaceC5811g> function0A = companion2.a();
                            if (composer.k() == null) {
                                C5717f.c();
                            }
                            composer.F();
                            if (composer.h()) {
                                composer.I(function0A);
                            } else {
                                composer.s();
                            }
                            Composer composerA = D1.a(composer);
                            D1.c(composerA, measurePolicyB, companion2.e());
                            D1.c(composerA, interfaceC5742sR, companion2.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                composerA.t(Integer.valueOf(iA));
                                composerA.n(Integer.valueOf(iA), function2B);
                            }
                            D1.c(composerA, modifierE, companion2.f());
                            C14801J c14801j = C14801J.f139030a;
                            Q.e(localThemeScope, C14949n.f139910a, ComposableLambdaKt.c(-2122049047, true, new C1743a(localThemeScope, gVar, addressDetailsActivity), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14949n.f139911b << 3));
                            composer.v();
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                            a(interfaceC14800I, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$a$b, reason: collision with other inner class name */
                    static final class C1745b implements Function2<Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111755a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ w.ViewState f111756b;

                        C1745b(LocalThemeScope localThemeScope, w.ViewState gVar) {
                            this.f111755a = localThemeScope;
                            this.f111756b = gVar;
                        }

                        public final void a(Composer composer, int i10) {
                            if ((i10 & 3) == 2 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(526577543, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:99)");
                            }
                            Dr.g.g(this.f111755a, C16193g.c(this.f111756b.getScreenTitle(), composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(537533127, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:96)");
                        }
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f99653K8, new Object[0]);
                        LocalThemeScope localThemeScope = this.f111745a;
                        ComposableLambda composableLambdaC = ComposableLambdaKt.c(-981344735, true, new C1742a(localThemeScope, this.f111746b, this.f111747c), composer, 54);
                        ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(526577543, true, new C1745b(this.f111745a, this.f111746b), composer, 54);
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(this.f111746b) | composer.D(this.f111747c);
                        final w.ViewState gVar = this.f111746b;
                        final AddressDetailsActivity addressDetailsActivity = this.f111747c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddressDetailsActivity.b.a.C1740a.C1741a.c(gVar, addressDetailsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, null, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24960 | (AbstractC5607a.f45514b << 27), 229);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    C1741a(LocalThemeScope localThemeScope, w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                        this.f111745a = localThemeScope;
                        this.f111746b = gVar;
                        this.f111747c = addressDetailsActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                        if (gVar.getViewMode() == w.e.f6976c) {
                            addressDetailsActivity.O1().G(new w.c.UpdateAddressMode(w.e.f6975b));
                        } else {
                            addressDetailsActivity.getOnBackPressedDispatcher().l();
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$b, reason: collision with other inner class name */
                static final class C1746b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ w.ViewState f111757a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AddressDetailsActivity f111758b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111759c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$b$a, reason: collision with other inner class name */
                    /* synthetic */ class C1747a extends FunctionReferenceImpl implements Function1<w.c, Unit> {
                        C1747a(Object obj) {
                            super(1, obj, Dn.w.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/settings/viewmodel/AddressDetailsViewModel$Action;)V", 0);
                        }

                        public final void a(w.c p02) {
                            Intrinsics.j(p02, "p0");
                            ((Dn.w) this.receiver).G(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(w.c cVar) {
                            a(cVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$b$b, reason: collision with other inner class name */
                    /* synthetic */ class C1748b extends FunctionReferenceImpl implements Function0<Unit> {
                        C1748b(Object obj) {
                            super(0, obj, AddressDetailsActivity.class, "onDeleteButtonClicked", "onDeleteButtonClicked()V", 0);
                        }

                        public final void a() {
                            ((AddressDetailsActivity) this.receiver).R1();
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            a();
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$b$a$a$b$c */
                    static final class c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111760a;

                        c(LocalThemeScope localThemeScope) {
                            this.f111760a = localThemeScope;
                        }

                        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                            Intrinsics.j(Assemble, "$this$Assemble");
                            if (ComposerKt.M()) {
                                ComposerKt.U(-304767917, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:193)");
                            }
                            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                            Bi.o oVar = Bi.o.f2584a;
                            Bi.m.d(this.f111760a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                            a(interfaceC14920X, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    C1746b(w.ViewState gVar, AddressDetailsActivity addressDetailsActivity, LocalThemeScope localThemeScope) {
                        this.f111757a = gVar;
                        this.f111758b = addressDetailsActivity;
                        this.f111759c = localThemeScope;
                    }

                    public final void c(InterfaceC14794C contentPadding, Composer composer, int i10) {
                        int i11;
                        LocalThemeScope localThemeScope;
                        Composer composer2 = composer;
                        Intrinsics.j(contentPadding, "contentPadding");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer2.V(contentPadding) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer2.j()) {
                            composer2.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1036796480, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:150)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierH = D.h(companion, contentPadding);
                        w.ViewState gVar = this.f111757a;
                        final AddressDetailsActivity addressDetailsActivity = this.f111758b;
                        LocalThemeScope localThemeScope2 = this.f111759c;
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                        int iA = C5717f.a(composer2, 0);
                        InterfaceC5742s interfaceC5742sR = composer2.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierH);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
                        if (composer2.k() == null) {
                            C5717f.c();
                        }
                        composer2.F();
                        if (composer2.h()) {
                            composer2.I(function0A);
                        } else {
                            composer2.s();
                        }
                        Composer composerA = D1.a(composer2);
                        D1.c(composerA, measurePolicyG, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C5664j c5664j = C5664j.f48612a;
                        composer2.startReplaceGroup(99696609);
                        if (gVar.getViewMode() != w.e.f6976c) {
                            composer2.startReplaceGroup(-2042623784);
                            Dn.w wVarO1 = addressDetailsActivity.O1();
                            composer2.startReplaceGroup(5004770);
                            boolean zD = composer2.D(wVarO1);
                            Object objB = composer2.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new C1747a(wVarO1);
                                composer2.t(objB);
                            }
                            KFunction kFunction = (KFunction) objB;
                            composer2.P();
                            composer2.startReplaceGroup(5004770);
                            boolean zD2 = composer2.D(addressDetailsActivity);
                            Object objB2 = composer2.B();
                            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new C1748b(addressDetailsActivity);
                                composer2.t(objB2);
                            }
                            composer2.P();
                            localThemeScope = localThemeScope2;
                            zn.C.d(localThemeScope, companion, gVar, addressDetailsActivity.getFeatureManager().e(AbstractC18227f.K.f170550h), (Function1) kFunction, (Function0) ((KFunction) objB2), composer2, (AbstractC5607a.f45514b << 6) | LocalThemeScope.f15770g | 48, 0);
                            composer2 = composer2;
                            composer2.P();
                        } else {
                            localThemeScope = localThemeScope2;
                            composer2.startReplaceGroup(-2041973621);
                            composer2.startReplaceGroup(5004770);
                            boolean zD3 = composer2.D(addressDetailsActivity);
                            Object objB3 = composer2.B();
                            if (zD3 || objB3 == Composer.INSTANCE.a()) {
                                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.i
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddressDetailsActivity.b.a.C1740a.C1746b.d(addressDetailsActivity);
                                    }
                                };
                                composer2.t(objB3);
                            }
                            Function0 function0 = (Function0) objB3;
                            composer2.P();
                            composer2.startReplaceGroup(5004770);
                            boolean zD4 = composer2.D(addressDetailsActivity);
                            Object objB4 = composer2.B();
                            if (zD4 || objB4 == Composer.INSTANCE.a()) {
                                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddressDetailsActivity.b.a.C1740a.C1746b.e(addressDetailsActivity);
                                    }
                                };
                                composer2.t(objB4);
                            }
                            composer2.P();
                            O.c(localThemeScope, companion, gVar, function0, (Function0) objB4, composer2, LocalThemeScope.f15770g | 48 | (AbstractC5607a.f45514b << 6), 0);
                            composer2.P();
                        }
                        composer2.startReplaceGroup(99751821);
                        if (gVar.getNetworkCallInProgress()) {
                            Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(J.f(companion, 0.0f, 1, null)), C5346q0.q(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
                            int iA2 = C5717f.a(composer2, 0);
                            InterfaceC5742s interfaceC5742sR2 = composer2.r();
                            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierD);
                            Function0<InterfaceC5811g> function0A2 = companion3.a();
                            if (composer2.k() == null) {
                                C5717f.c();
                            }
                            composer2.F();
                            if (composer2.h()) {
                                composer2.I(function0A2);
                            } else {
                                composer2.s();
                            }
                            Composer composerA2 = D1.a(composer2);
                            D1.c(composerA2, measurePolicyG2, companion3.e());
                            D1.c(composerA2, interfaceC5742sR2, companion3.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                                composerA2.t(Integer.valueOf(iA2));
                                composerA2.n(Integer.valueOf(iA2), function2B2);
                            }
                            D1.c(composerA2, modifierE2, companion3.f());
                            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-304767917, true, new c(localThemeScope), composer2, 54), composer2, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                            composer2.v();
                        }
                        composer2.P();
                        Unit unit = Unit.f142422a;
                        composer2.P();
                        composer2.v();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        c(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit d(AddressDetailsActivity addressDetailsActivity) {
                        addressDetailsActivity.O1().G(w.c.b.f6953a);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(AddressDetailsActivity addressDetailsActivity) {
                        addressDetailsActivity.O1().G(new w.c.UpdateAddressMode(w.e.f6975b));
                        return Unit.f142422a;
                    }
                }

                C1740a(w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                    this.f111743a = gVar;
                    this.f111744b = addressDetailsActivity;
                }

                public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                        ComposerKt.U(-1757717758, i11, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AddressDetailsActivity.kt:94)");
                    }
                    C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(537533127, true, new C1741a(AdsTheme, this.f111743a, this.f111744b), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1036796480, true, new C1746b(this.f111743a, this.f111744b, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    a(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(w.ViewState gVar, AddressDetailsActivity addressDetailsActivity) {
                this.f111741a = gVar;
                this.f111742b = addressDetailsActivity;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-931898765, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.onCreate.<anonymous>.<anonymous> (AddressDetailsActivity.kt:93)");
                }
                K.b(null, ComposableLambdaKt.c(-1757717758, true, new C1740a(this.f111741a, this.f111742b), composer, 54), composer, 48, 1);
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

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = AddressDetailsActivity.this.new b(continuation);
            bVar.f111739b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.ViewState gVar, Continuation<? super Unit> continuation) {
            return ((b) create(gVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111738a == 0) {
                ResultKt.b(obj);
                w.ViewState gVar = (w.ViewState) this.f111739b;
                AddressDetailsActivity addressDetailsActivity = AddressDetailsActivity.this;
                C13589e.b(addressDetailsActivity, null, ComposableLambdaKt.composableLambdaInstance(-931898765, true, new a(gVar, addressDetailsActivity)), 1, null);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn/w$d;", "event", "", "<anonymous>", "(LDn/w$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity$onCreate$3", f = "AddressDetailsActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<w.d, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111761a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111762b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = AddressDetailsActivity.this.new c(continuation);
            cVar.f111762b = obj;
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111761a == 0) {
                ResultKt.b(obj);
                w.d dVar = (w.d) this.f111762b;
                if (dVar instanceof w.d.NetworkErrorEvent) {
                    new C14886b(AddressDetailsActivity.this).setCancelable(false).setMessage(((w.d.NetworkErrorEvent) dVar).getRetrofitException().c(AddressDetailsActivity.this)).setPositiveButton(AddressDetailsActivity.this.getString(yr.Q.f170986b), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.k
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            AddressDetailsActivity.c.l(dialogInterface, i10);
                        }
                    }).show();
                } else if (dVar instanceof w.d.b) {
                    AddressDetailsActivity.V1(AddressDetailsActivity.this, false, true, null, 4, null);
                } else if (dVar instanceof w.d.SaveAddressSucceededEvent) {
                    w.d.SaveAddressSucceededEvent c0106d = (w.d.SaveAddressSucceededEvent) dVar;
                    AddressDetailsActivity.V1(AddressDetailsActivity.this, c0106d.getWasSavedToAccountAddresses(), false, c0106d.getServiceTier(), 2, null);
                } else if (dVar instanceof w.d.VertexResponseEvent) {
                    w.d.VertexResponseEvent fVar = (w.d.VertexResponseEvent) dVar;
                    AddressDetailsActivity.this.W1(fVar.getSuggestedAddress(), fVar.getOriginalAddress());
                } else if (dVar instanceof w.d.CheckFormModifiedEvent) {
                    AddressDetailsActivity.this.L1(((w.d.CheckFormModifiedEvent) dVar).getShouldDisplayDialog());
                } else if (Intrinsics.e(dVar, w.d.e.f6971a)) {
                    new C14886b(AddressDetailsActivity.this).setCancelable(false).setMessage(Hl.h.f12756D).setPositiveButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.l
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            AddressDetailsActivity.c.o(dialogInterface, i10);
                        }
                    }).show();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.d dVar, Continuation<? super Unit> continuation) {
            return ((c) create(dVar, continuation)).invokeSuspend(Unit.f142422a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1(boolean shouldDisplayDialog) {
        if (shouldDisplayDialog) {
            new C14886b(this).setCancelable(false).setTitle(Y.f99643Jh).setMessage(Y.f99624Ih).setPositiveButton(Y.f99779R1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AddressDetailsActivity.M1(dialogInterface, i10);
                }
            }).setNegativeButton(Y.f100371v3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AddressDetailsActivity.N1(this.f111836a, dialogInterface, i10);
                }
            }).show();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dn.w O1() {
        return (Dn.w) this.addressDetailsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(AddressDetailsActivity addressDetailsActivity, F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        addressDetailsActivity.O1().G(w.c.d.f6956a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1() {
        new C14886b(this).setCancelable(false).setTitle(Y.f99780R2).setMessage(Y.f99761Q2).setNegativeButton(getString(Y.f100316s8), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AddressDetailsActivity.S1(dialogInterface, i10);
            }
        }).setPositiveButton(getString(Y.f100336t8), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AddressDetailsActivity.T1(this.f111837a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(AddressDetailsActivity addressDetailsActivity, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        addressDetailsActivity.O1().G(w.c.b.f6953a);
        dialog.dismiss();
    }

    static /* synthetic */ void V1(AddressDetailsActivity addressDetailsActivity, boolean z10, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        addressDetailsActivity.U1(z10, z11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(SplitAddress suggestedAddress, SplitAddress originalAddress) {
        AddressChooserDialogFragment addressChooserDialogFragmentA = AddressChooserDialogFragment.INSTANCE.a(originalAddress, suggestedAddress);
        this.addressDialogFragment = addressChooserDialogFragmentA;
        addressChooserDialogFragmentA.A0(this);
        C17829a c17829a = C17829a.f166179a;
        AddressChooserDialogFragment addressChooserDialogFragment = this.addressDialogFragment;
        if (addressChooserDialogFragment == null) {
            Intrinsics.y("addressDialogFragment");
            addressChooserDialogFragment = null;
        }
        c17829a.a(addressChooserDialogFragment, this, "suggested_address_dialog_fragment_tag");
    }

    @Override // com.meijer.mobile.meijer.activity.settings.a
    public void l(SplitAddress splitAddress, boolean isSuggested) {
        Intrinsics.j(splitAddress, "splitAddress");
        AddressChooserDialogFragment addressChooserDialogFragment = this.addressDialogFragment;
        if (addressChooserDialogFragment == null) {
            Intrinsics.y("addressDialogFragment");
            addressChooserDialogFragment = null;
        }
        addressChooserDialogFragment.dismiss();
        O1().G(new w.c.AddressChosenAction(splitAddress, isSuggested));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(AddressDetailsActivity addressDetailsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        addressDetailsActivity.finish();
    }

    private final void P1() {
        Parcelable parcelable;
        Dn.w wVarO1 = O1();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_ACCOUNT_ADDRESS", AccountAddress.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_ACCOUNT_ADDRESS");
            if (!(parcelableExtra instanceof AccountAddress)) {
                parcelableExtra = null;
            }
            parcelable = (AccountAddress) parcelableExtra;
        }
        wVarO1.G(new w.c.InitializeAccountAddress((AccountAddress) parcelable, getFeatureManager().e(AbstractC18227f.K.f170550h)));
    }

    private final void U1(boolean isSaveCheckBoxSelected, boolean isAddressRemoved, String serviceTier) {
        if (getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_FROM_ORDER_OPTIONS", false)) {
            Intent intent = new Intent();
            intent.putExtra("com.meijer.intent.extra.AddressDetailsActivity.IS_ADDRESS_REMOVED", isAddressRemoved);
            intent.putExtra("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_DELIVERY_ADDRESS", O1().C());
            intent.putExtra("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_ADDRESS_SAVED_TO_ACCOUNT_ADDRESSES", isSaveCheckBoxSelected);
            intent.putExtra("com.meijer.intent.extra.AddressDetailsActivity.EXTRA_ADDRESS_SERVICE_TIER", serviceTier);
            setResult(-1, intent);
            finish();
            return;
        }
        finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.addresses.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressDetailsActivity.Q1(this.f111835a, (F) obj);
            }
        }, 3, null);
        O1().G(new w.c.SetCameFromOrderOptions(getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_FROM_ORDER_OPTIONS", false), getIntent().getIntExtra("com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity.EXTRA_ACCOUNT_ADDRESS_SIZE", 0), getFeatureManager().e(AbstractC18227f.K.f170550h)));
        P1();
        C17154h.J(C17154h.O(O1().E(), new b(null)), C6031t.a(this));
        C17154h.J(C17154h.O(O1().getEvents(), new c(null)), C6031t.a(this));
    }
}

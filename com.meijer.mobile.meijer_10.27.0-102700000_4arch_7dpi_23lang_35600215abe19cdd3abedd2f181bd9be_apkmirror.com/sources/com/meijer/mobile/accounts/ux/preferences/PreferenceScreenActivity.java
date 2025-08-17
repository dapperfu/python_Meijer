package com.meijer.mobile.accounts.ux.preferences;

import Fh.a;
import Ji.K;
import Ji.LocalThemeScope;
import Oh.n;
import V2.CreationExtras;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.J;
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
import com.fullstory.FS;
import com.meijer.mobile.accounts.ux.preferences.g;
import e.C13589e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import tv.C17154h;
import tv.InterfaceC17152f;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/PreferenceScreenActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/meijer/mobile/accounts/ux/preferences/g$a;", "event", "", "r1", "(Lcom/meijer/mobile/accounts/ux/preferences/g$a;)V", "p1", "LFh/a;", "accountNavigationRequest", "s1", "(LFh/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lyl/k;", "v", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "Lcom/meijer/mobile/accounts/ux/preferences/g;", "w", "Lkotlin/Lazy;", "q1", "()Lcom/meijer/mobile/accounts/ux/preferences/g;", "viewModel", "Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PreferenceScreenActivity extends Hilt_PreferenceScreenActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(g.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity$a$a, reason: collision with other inner class name */
        static final class C1336a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PreferenceScreenActivity f94594a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Fh.a, Unit> {
                b(Object obj) {
                    super(1, obj, PreferenceScreenActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Fh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((PreferenceScreenActivity) this.receiver).s1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fh.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity$a$a$c */
            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<k, Unit> {
                c(Object obj) {
                    super(1, obj, g.class, "onAction", "onAction(Lcom/meijer/mobile/accounts/ux/preferences/PreferencesResourceAction;)V", 0);
                }

                public final void a(k p02) {
                    Intrinsics.j(p02, "p0");
                    ((g) this.receiver).E(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(k kVar) {
                    a(kVar);
                    return Unit.f142422a;
                }
            }

            C1336a(PreferenceScreenActivity preferenceScreenActivity) {
                this.f94594a = preferenceScreenActivity;
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/g$a;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/preferences/g$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity$onCreate$1$1$1$1", f = "PreferenceScreenActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity$a$a$a, reason: collision with other inner class name */
            static final class C1337a extends SuspendLambda implements Function2<g.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f94595a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f94596b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PreferenceScreenActivity f94597c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1337a(PreferenceScreenActivity preferenceScreenActivity, Continuation<? super C1337a> continuation) {
                    super(2, continuation);
                    this.f94597c = preferenceScreenActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1337a c1337a = new C1337a(this.f94597c, continuation);
                    c1337a.f94596b = obj;
                    return c1337a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1337a) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f94595a == 0) {
                        ResultKt.b(obj);
                        this.f94597c.r1((g.a) this.f94596b);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1284448055, i11, -1, "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity.onCreate.<anonymous>.<anonymous> (PreferenceScreenActivity.kt:62)");
                }
                z1 z1VarB = o1.b(this.f94594a.q1().y(), null, composer, 0, 1);
                composer.startReplaceGroup(1849434622);
                PreferenceScreenActivity preferenceScreenActivity = this.f94594a;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = C17154h.O(preferenceScreenActivity.q1().w(), new C1337a(preferenceScreenActivity, null));
                    composer.t(objB);
                }
                composer.P();
                o1.a((InterfaceC17152f) objB, this.f94594a, null, composer, 0, 2);
                Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zE = this.f94594a.getFeatureManager().e(AbstractC18227f.C18228a.f170566h);
                g.PreferenceScreenViewState preferenceScreenViewStateB = b(z1VarB);
                PreferenceScreenActivity preferenceScreenActivity2 = this.f94594a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(preferenceScreenActivity2);
                Object objB2 = composer.B();
                if (zD || objB2 == companion.a()) {
                    objB2 = new b(preferenceScreenActivity2);
                    composer.t(objB2);
                }
                KFunction kFunction = (KFunction) objB2;
                composer.P();
                g gVarQ1 = this.f94594a.q1();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(gVarQ1);
                Object objB3 = composer.B();
                if (zD2 || objB3 == companion.a()) {
                    objB3 = new c(gVarQ1);
                    composer.t(objB3);
                }
                composer.P();
                n.b(AdsTheme, preferenceScreenViewStateB, zE, modifierF, (Function1) kFunction, (Function1) ((KFunction) objB3), composer, (i11 & 14) | LocalThemeScope.f15770g | 3072, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final g.PreferenceScreenViewState b(z1<g.PreferenceScreenViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(630691256, i10, -1, "com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity.onCreate.<anonymous> (PreferenceScreenActivity.kt:61)");
            }
            K.b(null, ComposableLambdaKt.c(-1284448055, true, new C1336a(PreferenceScreenActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f94598f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94598f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f94599f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94599f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94601g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94600f = function0;
            this.f94601g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94600f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94601g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g q1() {
        return (g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(g.a event) {
        if (!(event instanceof g.a.C1339a)) {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(Fh.a accountNavigationRequest) {
        if (Intrinsics.e(accountNavigationRequest, a.k.f10423a)) {
            p1();
        }
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    private final void p1() {
        finish();
        bk.c.b(this, 1, Bj.d.f2592a, Bj.d.f2595d, 0, 8, null);
    }

    @Override // com.meijer.mobile.accounts.ux.preferences.Hilt_PreferenceScreenActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        boolean z10;
        super.onCreate(savedInstanceState);
        g gVarQ1 = q1();
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g.D(gVarQ1, z10, null, 2, null);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(630691256, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        boolean z10;
        super.onResume();
        FS.page("Account Preferences").start();
        g gVarQ1 = q1();
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        gVarQ1.L(z10);
    }
}

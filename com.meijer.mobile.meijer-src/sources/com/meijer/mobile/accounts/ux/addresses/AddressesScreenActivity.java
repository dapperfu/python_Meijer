package com.meijer.mobile.accounts.ux.addresses;

import Gh.a;
import Kh.G;
import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6162j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity;
import com.meijer.mobile.accounts.ux.addresses.i;
import e.C13737e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/addresses/AddressesScreenActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "n1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "addressesViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddressesScreenActivity extends Hilt_AddressesScreenActivity {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity$a$a, reason: collision with other inner class name */
        static final class C1326a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AddressesScreenActivity f94895a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1327a extends FunctionReferenceImpl implements Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> {
                C1327a(Object obj) {
                    super(1, obj, i.class, "onAction", "onAction(Lcom/meijer/mobile/accounts/ux/addresses/AddressesResourceAction;)V", 0);
                }

                public final void a(com.meijer.mobile.accounts.ux.addresses.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((i) this.receiver).I(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(com.meijer.mobile.accounts.ux.addresses.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            C1326a(AddressesScreenActivity addressesScreenActivity) {
                this.f94895a = addressesScreenActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(AddressesScreenActivity addressesScreenActivity, Gh.a accountNavigationRequest) {
                Intrinsics.j(accountNavigationRequest, "accountNavigationRequest");
                if (Intrinsics.e(accountNavigationRequest, a.k.f12614a)) {
                    addressesScreenActivity.n1();
                }
                return Unit.f143329a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1476577067, i10, -1, "com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity.onCreate.<anonymous>.<anonymous> (AddressesScreenActivity.kt:31)");
                }
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f40696a.c(composer, W2.b.f40698c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0 c0VarB = W2.d.b(i.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6162j ? ((InterfaceC6162j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f39630c, composer, 36936, 0);
                composer.U();
                composer.U();
                i iVar = (i) c0VarB;
                z1 z1VarB = o1.b(iVar.F(), null, composer, 0, 1);
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                i.AddressesScreenViewState addressesScreenViewStateC = c(z1VarB);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(iVar);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1327a(iVar);
                    composer.t(objB);
                }
                composer.P();
                Function1 function1 = (Function1) ((KFunction) objB);
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f94895a);
                final AddressesScreenActivity addressesScreenActivity = this.f94895a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.accounts.ux.addresses.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddressesScreenActivity.a.C1326a.d(addressesScreenActivity, (Gh.a) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                G.c(AdsTheme, addressesScreenViewStateC, modifierFsUnmask, function1, (Function1) objB2, composer, LocalThemeScope.f17314g | (i10 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final i.AddressesScreenViewState c(z1<i.AddressesScreenViewState> z1Var) {
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
                ComposerKt.U(1441745818, i10, -1, "com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity.onCreate.<anonymous> (AddressesScreenActivity.kt:30)");
            }
            K.b(null, ComposableLambdaKt.c(1476577067, true, new C1326a(AddressesScreenActivity.this), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        finish();
        ck.c.b(this, 1, Cj.d.f4637a, Cj.d.f4640d, 0, 8, null);
    }

    @Override // com.meijer.mobile.accounts.ux.addresses.Hilt_AddressesScreenActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1441745818, true, new a()), 1, null);
    }
}

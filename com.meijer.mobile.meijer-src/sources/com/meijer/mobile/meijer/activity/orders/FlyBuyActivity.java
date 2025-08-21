package com.meijer.mobile.meijer.activity.orders;

import Ki.LocalThemeScope;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.meijer.mobile.meijer.activity.orders.FlyBuyActivity;
import e.C13737e;
import kn.C15297b;
import kn.InterfaceC15296a;
import kotlin.AbstractC14656B;
import kotlin.C14670k;
import kotlin.C14680u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pk.StoreDetails;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u0003R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/FlyBuyActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Li4/u;", "E1", "(Li4/u;Landroidx/compose/runtime/Composer;I)Li4/u;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lkn/b;", "s", "Lkn/b;", "D1", "()Lkn/b;", "setNavigationCommandManager", "(Lkn/b;)V", "navigationCommandManager", "t", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlyBuyActivity extends Hilt_FlyBuyActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f111089u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public C15297b navigationCommandManager;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0006j\u0002`\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/FlyBuyActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "startDestination", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "orderType", "Lpk/h;", "storeAddress", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpk/h;)Landroid/content/Intent;", "START_DESTINATION", "Ljava/lang/String;", "ORDER_ID", "ORDER_TYPE", "STORE_DETAILS", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orders.FlyBuyActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, String startDestination, String orderId, String orderType, StoreDetails storeAddress) {
            Intrinsics.j(context, "context");
            Intrinsics.j(startDestination, "startDestination");
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(orderType, "orderType");
            Intent intent = new Intent(context, (Class<?>) FlyBuyActivity.class);
            intent.putExtra("START_DESTINATION", startDestination);
            intent.putExtra("ORDER_ID", orderId);
            intent.putExtra("ORDER_TYPE", orderType);
            intent.putExtra("STORE_ADDRESS", storeAddress);
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlyBuyActivity f111092a;

            a(FlyBuyActivity flyBuyActivity) {
                this.f111092a = flyBuyActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) throws Resources.NotFoundException {
                Parcelable parcelable;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-716829660, i10, -1, "com.meijer.mobile.meijer.activity.orders.FlyBuyActivity.onCreate.<anonymous>.<anonymous> (FlyBuyActivity.kt:41)");
                }
                C14680u c14680uE1 = this.f111092a.E1(j4.j.e(new AbstractC14656B[0], composer, 0), composer, 0);
                String stringExtra = this.f111092a.getIntent().getStringExtra("START_DESTINATION");
                if (stringExtra == null) {
                    stringExtra = "im_here";
                }
                String str = stringExtra;
                FlyBuyActivity flyBuyActivity = this.f111092a;
                String string = flyBuyActivity.getString(com.meijer.mobile.meijer.Y.f100517Ka, flyBuyActivity.getIntent().getStringExtra("ORDER_TYPE"), this.f111092a.getIntent().getStringExtra("ORDER_ID"));
                Intrinsics.i(string, "getString(...)");
                Intent intent = this.f111092a.getIntent();
                Intrinsics.i(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("STORE_ADDRESS", StoreDetails.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("STORE_ADDRESS");
                    if (!(parcelableExtra instanceof StoreDetails)) {
                        parcelableExtra = null;
                    }
                    parcelable = (StoreDetails) parcelableExtra;
                }
                StoreDetails storeDetails = (StoreDetails) parcelable;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f111092a);
                final FlyBuyActivity flyBuyActivity2 = this.f111092a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FlyBuyActivity.b.a.c(flyBuyActivity2);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                on.P.c(AdsTheme, c14680uE1, str, string, storeDetails, (Function0) objB, composer, LocalThemeScope.f17314g | (i10 & 14));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) throws Resources.NotFoundException {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(FlyBuyActivity flyBuyActivity) {
                flyBuyActivity.finish();
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
                ComposerKt.U(2112045013, i10, -1, "com.meijer.mobile.meijer.activity.orders.FlyBuyActivity.onCreate.<anonymous> (FlyBuyActivity.kt:40)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-716829660, true, new a(FlyBuyActivity.this), composer, 54), composer, 48, 1);
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

    public final C15297b D1() {
        C15297b c15297b = this.navigationCommandManager;
        if (c15297b != null) {
            return c15297b;
        }
        Intrinsics.x("navigationCommandManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C14680u E1(C14680u c14680u, Composer composer, int i10) throws Resources.NotFoundException {
        C14680u c14680u2;
        composer.startReplaceGroup(-1824083886);
        if (ComposerKt.M()) {
            ComposerKt.U(-1824083886, i10, -1, "com.meijer.mobile.meijer.activity.orders.FlyBuyActivity.setupNavigation (FlyBuyActivity.kt:58)");
        }
        InterfaceC15296a interfaceC15296a = (InterfaceC15296a) K0.a.a(D1().c(), C15297b.INSTANCE.a(), composer, 0).getValue();
        if (interfaceC15296a.a().length() > 0) {
            if (Intrinsics.e(interfaceC15296a.a(), "exitFlyBuy")) {
                finish();
                c14680u2 = c14680u;
            } else {
                c14680u2 = c14680u;
                C14670k.T(c14680u2, interfaceC15296a.a(), null, null, 6, null);
                D1().b();
            }
        } else {
            c14680u2 = c14680u;
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return c14680u2;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(2112045013, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        D1().b();
    }
}

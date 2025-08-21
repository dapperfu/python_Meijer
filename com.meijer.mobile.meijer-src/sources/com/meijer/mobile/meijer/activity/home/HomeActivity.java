package com.meijer.mobile.meijer.activity.home;

import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Nn.AbstractC4310y;
import Ul.ToastMessageData;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.view.C6173t;
import androidx.view.f0;
import com.fullstory.FS;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.meijer.activity.home.HomeActivity;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.widget.UnauthFooterViewNewHomeScreen;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import ki.InterfaceC15162c0;
import ki.q1;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import ps.d0;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import wj.C17897b;
import zl.AbstractC18503f;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0006J#\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\tH\u0003¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0006J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u0012J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u0012J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010\u0006R\"\u0010<\u001a\u00020;8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010TR\"\u0010h\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010T\u001a\u0004\bi\u0010j\"\u0004\bk\u00101R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000f0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001c0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010n¨\u0006p"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LQj/g;", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem$NavBarActionListener;", "Lps/d0$c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "", "previousTrackAction", "trackHomeScreenState", "(Ljava/lang/String;)V", "onDestroy", "onShowAccount", "onShowShoppingList", "onShowCart", "onShowOrderOptions", "onSearch", "onSearchNoStoreSelected", "onScan", "onScanNoStoreSelected", "Landroid/content/Intent;", "intent", "handleLaunchActivityForResult", "(Landroid/content/Intent;)V", "onNewIntent", "onCreateAccount", "onSignIn", "showNavBar", "message", "Lnk/c;", "product", "showBeaconDebugInfo", "(Ljava/lang/String;Lnk/c;)V", "checkForAppUpdate", "showFooter", "setFooterMargin", "requestNotificationPermission", "showNotificationEnrollmentAlert", "", "enabled", "updateNotificationPreference", "(Z)V", "page", "trackPageAnalytics", "action", "trackActionAnalytics", "Lg/a;", "result", "handleMenuNavigationActivityResult", "(Lg/a;)V", "onLogout", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;", "navBarItem", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;", "getNavBarItem$Meijer_playstoreRelease", "()Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;", "setNavBarItem$Meijer_playstoreRelease", "(Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;)V", "LGh/b;", "inboxManager", "LGh/b;", "getInboxManager$Meijer_playstoreRelease", "()LGh/b;", "setInboxManager$Meijer_playstoreRelease", "(LGh/b;)V", "LCh/d;", "preferencesRepository", "LCh/d;", "getPreferencesRepository$Meijer_playstoreRelease", "()LCh/d;", "setPreferencesRepository$Meijer_playstoreRelease", "(LCh/d;)V", "LJu/a;", "disposables", "LJu/a;", "isShowingUpdatePrompt", "Z", "Landroidx/appcompat/app/c;", "notificationDialog", "Landroidx/appcompat/app/c;", "isNewAccountAnalyticSent", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "getHomeViewModel", "()Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "homeViewModel", "LIl/b;", "fulfillmentBarViewModel$delegate", "getFulfillmentBarViewModel", "()LIl/b;", "fulfillmentBarViewModel", "LNn/y;", "binding", "LNn/y;", "isHomeScreenTrackStateSent", "leavingHomeScreen", "getLeavingHomeScreen", "()Z", "setLeavingHomeScreen", "Lg/c;", "requestPermissionLauncher", "Lg/c;", "navigatorResultLauncher", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HomeActivity extends Hilt_HomeActivity implements Qj.g, NavBarItem.NavBarActionListener, d0.c {
    public static final int $stable = 8;
    private AbstractC4310y binding;

    /* renamed from: fulfillmentBarViewModel$delegate, reason: from kotlin metadata */
    private final Lazy fulfillmentBarViewModel;

    /* renamed from: homeViewModel$delegate, reason: from kotlin metadata */
    private final Lazy homeViewModel;
    public Gh.b inboxManager;
    private boolean isHomeScreenTrackStateSent;
    private boolean isNewAccountAnalyticSent;
    private boolean isShowingUpdatePrompt;
    private boolean leavingHomeScreen;
    public NavBarItem navBarItem;
    private androidx.appcompat.app.c notificationDialog;
    public Ch.d preferencesRepository;
    private final Ju.a disposables = new Ju.a();
    private final AbstractC14276c<String> requestPermissionLauncher = registerForActivityResult(new h.h(), new InterfaceC14275b() { // from class: com.meijer.mobile.meijer.activity.home.o
        @Override // g.InterfaceC14275b
        public final void a(Object obj) {
            HomeActivity.requestPermissionLauncher$lambda$0(this.f110644a, ((Boolean) obj).booleanValue());
        }
    });
    private final AbstractC14276c<Intent> navigatorResultLauncher = registerForActivityResult(new h.i(), new a());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14275b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, HomeActivity.this, HomeActivity.class, "handleMenuNavigationActivityResult", "handleMenuNavigationActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            HomeActivity.this.handleMenuNavigationActivityResult(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeActivity$onCreate$4", f = "HomeActivity.kt", l = {170}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110050a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeActivity f110052a;

            a(HomeActivity homeActivity) {
                this.f110052a = homeActivity;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ToastMessageData toastMessageData, Continuation<? super Unit> continuation) {
                this.f110052a.showBeaconDebugInfo(toastMessageData.getMessage(), toastMessageData.getProduct());
                return Unit.f143329a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110050a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<ToastMessageData> toastMessageData = HomeActivity.this.getHomeViewModel().getToastMessageData();
                a aVar = new a(HomeActivity.this);
                this.f110050a = 1;
                if (toastMessageData.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f110053a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f110054a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.home.HomeActivity$c$a$a, reason: collision with other inner class name */
            static final class C1667a implements Function3<InterfaceC15162c0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110055a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f110056b;

                C1667a(LocalThemeScope localThemeScope, String str) {
                    this.f110055a = localThemeScope;
                    this.f110056b = str;
                }

                public final void a(InterfaceC15162c0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(447405021, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeActivity.showBeaconDebugInfo.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:284)");
                    }
                    Di.j.l(this.f110055a, null, this.f110056b, Assemble.getToastVariant().getSuccess(), null, composer, LocalThemeScope.f17314g | (q1.m.Toast.f142384h << 9), 9);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15162c0 interfaceC15162c0, Composer composer, Integer num) {
                    a(interfaceC15162c0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(String str) {
                this.f110054a = str;
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
                    ComposerKt.U(-352531106, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeActivity.showBeaconDebugInfo.<anonymous>.<anonymous> (HomeActivity.kt:283)");
                }
                Ki.Q.e(AdsTheme, ki.b1.f142020a, ComposableLambdaKt.c(447405021, true, new C1667a(AdsTheme, this.f110054a), composer, 54), composer, (i10 & 14) | LocalThemeScope.f17314g | 384 | (ki.b1.f142021b << 3));
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

        c(String str) {
            this.f110053a = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(819756431, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeActivity.showBeaconDebugInfo.<anonymous> (HomeActivity.kt:282)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-352531106, true, new a(this.f110053a), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeActivity$showBeaconDebugInfo$2", f = "HomeActivity.kt", l = {294}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110057a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110057a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f110057a = 1;
                if (mv.Z.b(4000L, this) == objF) {
                    return objF;
                }
            }
            AbstractC4310y abstractC4310y = HomeActivity.this.binding;
            if (abstractC4310y == null) {
                Intrinsics.x("binding");
                abstractC4310y = null;
            }
            ComposeView composeToastView = abstractC4310y.f22454A;
            Intrinsics.i(composeToastView, "composeToastView");
            composeToastView.setVisibility(8);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1<FulfillmentBarDecorator> f110060a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeActivity f110061b;

            a(z1<FulfillmentBarDecorator> z1Var, HomeActivity homeActivity) {
                this.f110060a = z1Var;
                this.f110061b = homeActivity;
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
                    ComposerKt.U(530560757, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeActivity.showNavBar.<anonymous>.<anonymous> (HomeActivity.kt:264)");
                }
                FulfillmentBarDecorator value = this.f110060a.getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f110061b);
                final HomeActivity homeActivity = this.f110061b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeActivity.e.a.c(homeActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Il.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(HomeActivity homeActivity) {
                homeActivity.onShowOrderOptions();
                return Unit.f143329a;
            }
        }

        e() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961337830, i10, -1, "com.meijer.mobile.meijer.activity.home.HomeActivity.showNavBar.<anonymous> (HomeActivity.kt:262)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(530560757, true, new a(o1.b(HomeActivity.this.getFulfillmentBarViewModel().n(), null, composer, 0, 1), HomeActivity.this), composer, 54), composer, 48, 1);
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeActivity$updateNotificationPreference$1", f = "HomeActivity.kt", l = {HttpResponseStatus.ERROR_NOT_FOUND}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110062a;

        /* renamed from: b, reason: collision with root package name */
        Object f110063b;

        /* renamed from: c, reason: collision with root package name */
        Object f110064c;

        /* renamed from: d, reason: collision with root package name */
        Object f110065d;

        /* renamed from: e, reason: collision with root package name */
        int f110066e;

        /* renamed from: f, reason: collision with root package name */
        int f110067f;

        /* renamed from: g, reason: collision with root package name */
        int f110068g;

        /* renamed from: h, reason: collision with root package name */
        int f110069h;

        /* renamed from: i, reason: collision with root package name */
        int f110070i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110071j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f110073l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f110073l = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = HomeActivity.this.new f(this.f110073l, continuation);
            fVar.f110071j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110070i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110071j;
                    HomeActivity homeActivity = HomeActivity.this;
                    boolean z10 = this.f110073l;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.d preferencesRepository$Meijer_playstoreRelease = homeActivity.getPreferencesRepository$Meijer_playstoreRelease();
                    this.f110071j = interfaceC15783O;
                    this.f110062a = interfaceC15783O;
                    this.f110063b = this;
                    this.f110064c = this;
                    this.f110065d = interfaceC15783O;
                    this.f110066e = 0;
                    this.f110067f = 0;
                    this.f110068g = 0;
                    this.f110069h = 0;
                    this.f110070i = 1;
                    obj = preferencesRepository$Meijer_playstoreRelease.g(z10, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                Result.b(ResultKt.a(e10));
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForAppUpdate$lambda$16(final HomeActivity homeActivity) {
        homeActivity.isShowingUpdatePrompt = true;
        new Qj.j(homeActivity, com.meijer.mobile.meijer.Y.f100677T, new Object[0]).n().r(com.meijer.mobile.meijer.Y.f100696U, new Object[0]).o(com.meijer.mobile.meijer.Y.f100619Ph, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f110640a.openMeijerPlayStorePage();
            }
        }).q(new DialogInterface.OnDismissListener() { // from class: com.meijer.mobile.meijer.activity.home.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f110642a.isShowingUpdatePrompt = false;
            }
        }).g();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForAppUpdate$lambda$17(HomeActivity homeActivity, C17897b config) {
        Intrinsics.j(config, "config");
        yo.k.b0(homeActivity.getUserManager(), 0L, 1, null);
        homeActivity.getNotificationManager().s(config.getUpdateAppMessageTitle(), config.getUpdateAppMessage(), homeActivity);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b getFulfillmentBarViewModel() {
        return (Il.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModel getHomeViewModel() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(HomeActivity homeActivity, WalkThroughType walkThroughType, boolean z10, boolean z11) {
        Intrinsics.j(walkThroughType, "<unused var>");
        if (z10) {
            homeActivity.trackActionAnalytics("Shopping Onboarding action: accepted");
        } else {
            homeActivity.trackActionAnalytics("Shopping Onboarding action: denied");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(HomeActivity homeActivity, int i10) {
        String str = "Meijer: Shopping Onboarding: pg1";
        if (i10 != 0) {
            if (i10 == 1) {
                str = "Meijer: Shopping Onboarding: pg2";
            } else if (i10 == 2) {
                str = "Meijer: Shopping Onboarding: pg3";
            } else if (i10 == 3) {
                str = "Meijer: Shopping Onboarding: pg4";
            }
        }
        homeActivity.trackPageAnalytics(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSearch$lambda$26(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "event: home search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowAccount$lambda$23(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("home page");
        track.v("header");
        return Unit.f143329a;
    }

    private final void requestNotificationPermission() {
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            updateNotificationPreference(true);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            showNotificationEnrollmentAlert();
        } else if (getInboxManager$Meijer_playstoreRelease().g() && Gh.b.f(getInboxManager$Meijer_playstoreRelease(), 0L, 1, null)) {
            showNotificationEnrollmentAlert();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermissionLauncher$lambda$0(HomeActivity homeActivity, boolean z10) {
        if (z10) {
            homeActivity.updateNotificationPreference(true);
        } else {
            homeActivity.updateNotificationPreference(false);
            new Qj.j(homeActivity, com.meijer.mobile.home.ux.r0.f99351j, new Object[0]).r(com.meijer.mobile.home.ux.r0.f99355n, new Object[0]).g();
        }
    }

    private final void setFooterMargin() {
        AbstractC4310y abstractC4310y = this.binding;
        AbstractC4310y abstractC4310y2 = null;
        if (abstractC4310y == null) {
            Intrinsics.x("binding");
            abstractC4310y = null;
        }
        UnauthFooterViewNewHomeScreen homeUnauthFooter = abstractC4310y.f22457D;
        Intrinsics.i(homeUnauthFooter, "homeUnauthFooter");
        if (!homeUnauthFooter.isLaidOut() || homeUnauthFooter.isLayoutRequested()) {
            homeUnauthFooter.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$setFooterMargin$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    AbstractC4310y abstractC4310y3 = this.f110040a.binding;
                    AbstractC4310y abstractC4310y4 = null;
                    if (abstractC4310y3 == null) {
                        Intrinsics.x("binding");
                        abstractC4310y3 = null;
                    }
                    int height = abstractC4310y3.f22457D.getHeight();
                    AbstractC4310y abstractC4310y5 = this.f110040a.binding;
                    if (abstractC4310y5 == null) {
                        Intrinsics.x("binding");
                    } else {
                        abstractC4310y4 = abstractC4310y5;
                    }
                    CoordinatorLayout coordinatorLayout = abstractC4310y4.f22461z;
                    ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
                    Intrinsics.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    if (this.f110040a.getUserManager().b()) {
                        height = 0;
                    }
                    bVar.setMargins(0, 0, 0, height);
                    coordinatorLayout.setLayoutParams(bVar);
                }
            });
            return;
        }
        AbstractC4310y abstractC4310y3 = this.binding;
        if (abstractC4310y3 == null) {
            Intrinsics.x("binding");
            abstractC4310y3 = null;
        }
        int height = abstractC4310y3.f22457D.getHeight();
        AbstractC4310y abstractC4310y4 = this.binding;
        if (abstractC4310y4 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4310y2 = abstractC4310y4;
        }
        CoordinatorLayout coordinatorLayout = abstractC4310y2.f22461z;
        ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
        Intrinsics.h(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (getUserManager().b()) {
            height = 0;
        }
        bVar.setMargins(0, 0, 0, height);
        coordinatorLayout.setLayoutParams(bVar);
    }

    private final void showFooter() {
        AbstractC4310y abstractC4310y = this.binding;
        if (abstractC4310y == null) {
            Intrinsics.x("binding");
            abstractC4310y = null;
        }
        UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen = abstractC4310y.f22457D;
        unauthFooterViewNewHomeScreen.setVisibility(unauthFooterViewNewHomeScreen.getUserManager().b() ? 8 : 0);
        unauthFooterViewNewHomeScreen.setListener(this);
        setFooterMargin();
    }

    private final void showNotificationEnrollmentAlert() {
        this.notificationDialog = new Qj.m(this, com.meijer.mobile.home.ux.r0.f99350i, new String[0]).r(com.meijer.mobile.home.ux.r0.f99354m, new Object[0]).C(com.meijer.mobile.home.ux.r0.f99352k, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeActivity.showNotificationEnrollmentAlert$lambda$21(this.f110621a, dialogInterface, i10);
            }
        }).o(com.meijer.mobile.home.ux.r0.f99353l, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeActivity.showNotificationEnrollmentAlert$lambda$22(this.f110625a, dialogInterface, i10);
            }
        }).n().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotificationEnrollmentAlert$lambda$21(HomeActivity homeActivity, DialogInterface dialogInterface, int i10) {
        if (Build.VERSION.SDK_INT < 33) {
            homeActivity.updateNotificationPreference(false);
        } else {
            homeActivity.getInboxManager$Meijer_playstoreRelease().b(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotificationEnrollmentAlert$lambda$22(HomeActivity homeActivity, DialogInterface dialogInterface, int i10) {
        if (Build.VERSION.SDK_INT >= 33) {
            homeActivity.requestPermissionLauncher.a("android.permission.POST_NOTIFICATIONS");
        } else {
            homeActivity.updateNotificationPreference(true);
        }
    }

    public static /* synthetic */ void trackHomeScreenState$default(HomeActivity homeActivity, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        homeActivity.trackHomeScreenState(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackHomeScreenState$lambda$12(HomeActivity homeActivity, String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("home");
        track.h("pageName", "Meijer : Home Page");
        track.h("fulfillmentType", homeActivity.getNavBarItem$Meijer_playstoreRelease().getFulfillmentType());
        track.h("screenName", "New home screen");
        track.p(str);
        if (!homeActivity.isNewAccountAnalyticSent && homeActivity.getIntent().getBooleanExtra("isFirstSignIn", false)) {
            track.h("accountCreationSuccessful", "1");
            homeActivity.isNewAccountAnalyticSent = true;
        }
        return Unit.f143329a;
    }

    public final Gh.b getInboxManager$Meijer_playstoreRelease() {
        Gh.b bVar = this.inboxManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("inboxManager");
        return null;
    }

    public final boolean getLeavingHomeScreen() {
        return this.leavingHomeScreen;
    }

    public final NavBarItem getNavBarItem$Meijer_playstoreRelease() {
        NavBarItem navBarItem = this.navBarItem;
        if (navBarItem != null) {
            return navBarItem;
        }
        Intrinsics.x("navBarItem");
        return null;
    }

    public final Ch.d getPreferencesRepository$Meijer_playstoreRelease() {
        Ch.d dVar = this.preferencesRepository;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.x("preferencesRepository");
        return null;
    }

    @Override // ps.d0.c
    public void handleLaunchActivityForResult(Intent intent) {
        Intrinsics.j(intent, "intent");
        this.navigatorResultLauncher.a(intent);
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.j(intent, "intent");
        super.onNewIntent(intent);
        if (intent.hasExtra("intent.extra.authenticated") && !intent.getBooleanExtra("intent.extra.authenticated", true)) {
            onLogout();
        }
        if (intent.hasExtra("com.meijer.intent.extra.FROM_NAV_MENU")) {
            getHomeViewModel().onAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onScanNoStoreSelected() {
        new Cl.a(this, 536873012).g();
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onSearchNoStoreSelected() {
        new Cl.a(this, 536872912).g();
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
    }

    public final void setInboxManager$Meijer_playstoreRelease(Gh.b bVar) {
        Intrinsics.j(bVar, "<set-?>");
        this.inboxManager = bVar;
    }

    public final void setLeavingHomeScreen(boolean z10) {
        this.leavingHomeScreen = z10;
    }

    public final void setNavBarItem$Meijer_playstoreRelease(NavBarItem navBarItem) {
        Intrinsics.j(navBarItem, "<set-?>");
        this.navBarItem = navBarItem;
    }

    public final void setPreferencesRepository$Meijer_playstoreRelease(Ch.d dVar) {
        Intrinsics.j(dVar, "<set-?>");
        this.preferencesRepository = dVar;
    }

    public final void trackHomeScreenState(final String previousTrackAction) {
        if (this.leavingHomeScreen) {
            return;
        }
        getAnalyticsEngine().b(C14756c.h("Meijer : Home Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeActivity.trackHomeScreenState$lambda$12(this.f110618a, previousTrackAction, (TrackingData) obj);
            }
        });
    }

    public HomeActivity() {
        final Function0 function0 = null;
        this.homeViewModel = new androidx.view.e0(Reflection.b(HomeViewModel.class), new Function0<androidx.view.g0>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.g0 invoke() {
                return this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            }
        }, new Function0<f0.c>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final f0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        this.fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new Function0<androidx.view.g0>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.g0 invoke() {
                return this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            }
        }, new Function0<f0.c>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final f0.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.meijer.mobile.meijer.activity.home.HomeActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final void checkForAppUpdate() {
        getAppUpdateConfigManager().h(new Function0() { // from class: com.meijer.mobile.meijer.activity.home.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeActivity.checkForAppUpdate$lambda$16(this.f110646a);
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.home.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeActivity.checkForAppUpdate$lambda$17(this.f110648a, (C17897b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMenuNavigationActivityResult(C14274a result) {
        if (result.getResultCode() == 223418) {
            getHomeViewModel().onAction(HomeViewModel.Action.RefreshScreen.INSTANCE);
        }
    }

    private final void onLogout() {
        finish();
        startActivity(getIntent());
        getHomeViewModel().onAction(HomeViewModel.Action.UserLoggedOutAction.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBeaconDebugInfo(String message, nk.c product) {
        if (getFeatureManager().e(AbstractC18503f.C18510h.f172880h)) {
            AbstractC4310y abstractC4310y = this.binding;
            if (abstractC4310y == null) {
                Intrinsics.x("binding");
                abstractC4310y = null;
            }
            ComposeView composeToastView = abstractC4310y.f22454A;
            Intrinsics.i(composeToastView, "composeToastView");
            composeToastView.setVisibility(0);
            String str = message + Ul.d.a(product);
            AbstractC4310y abstractC4310y2 = this.binding;
            if (abstractC4310y2 == null) {
                Intrinsics.x("binding");
                abstractC4310y2 = null;
            }
            abstractC4310y2.f22454A.setContent(ComposableLambdaKt.composableLambdaInstance(819756431, true, new c(str)));
            C15809k.d(C6173t.a(this), null, null, new d(null), 3, null);
        }
    }

    private final void showNavBar() {
        getNavBarItem$Meijer_playstoreRelease().onAttached(this);
        AbstractC4310y abstractC4310y = this.binding;
        AbstractC4310y abstractC4310y2 = null;
        if (abstractC4310y == null) {
            Intrinsics.x("binding");
            abstractC4310y = null;
        }
        abstractC4310y.f22456C.setData(getNavBarItem$Meijer_playstoreRelease());
        AbstractC4310y abstractC4310y3 = this.binding;
        if (abstractC4310y3 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4310y2 = abstractC4310y3;
        }
        abstractC4310y2.f22456C.getFulfillmentBar().setContent(ComposableLambdaKt.composableLambdaInstance(1961337830, true, new e()));
    }

    private final void trackActionAnalytics(String action) {
        getAnalyticsEngine().h(C14756c.a(action), new AbstractC14762i[0]);
    }

    private final void trackPageAnalytics(String page) {
        getAnalyticsEngine().h(C14756c.h(page), new AbstractC14762i[0]);
    }

    private final void updateNotificationPreference(boolean enabled) {
        getInboxManager$Meijer_playstoreRelease().a();
        getInboxManager$Meijer_playstoreRelease().d(enabled, getUserManager().b());
        getUserManager().R(enabled);
        C15809k.d(C6173t.a(this), null, null, new f(enabled, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getNavBarItem$Meijer_playstoreRelease().onDetached();
        this.disposables.d();
        super.onDestroy();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        ps.d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.V(false);
        }
        androidx.appcompat.app.c cVar = this.notificationDialog;
        if (cVar != null) {
            if (!cVar.isShowing()) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.dismiss();
            }
        }
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Meijer Home Page").start();
        ps.d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.V(true);
        }
        if (!this.isShowingUpdatePrompt) {
            checkForAppUpdate();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onScan() {
        if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            startActivity(Bl.h.d(this, true));
        } else {
            startActivity(Bl.h.h(this, true));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onSearch() {
        if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            startActivity(Bl.h.c(this, Pp.b.f26238a, null, null, false, null, 60, null));
        } else {
            startActivity(Bl.h.g(this, Pp.b.f26238a, null, null, false, null, 60, null));
        }
        getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeActivity.onSearch$lambda$26((TrackingData) obj);
            }
        });
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onShowAccount() {
        if (getUserManager().b()) {
            getAnalyticsEngine().b(C14756c.a("event: header manage account"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeActivity.onShowAccount$lambda$23((TrackingData) obj);
                }
            });
            startActivity(Bl.a.f3119a.h(this, getFeatureManager().e(AbstractC18503f.C18504a.f172866h)));
        } else if (getFeatureManager().e(AbstractC18503f.h0.f172881h)) {
            startActivity(Bl.u.f3153a.a(this));
        } else {
            onSignIn();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onShowCart() {
        startActivity(Dl.e.t(getMeijerIntent(), this, 268437856, null, 4, null));
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onShowOrderOptions() {
        if (getUserManager().b()) {
            startActivity(OrderOptionsActivity.INSTANCE.a(this));
        } else {
            new C15485b(this).setMessage(C18546a.f173198e).setPositiveButton(Cj.o.f5016F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f110634a.onSignIn();
                }
            }).setNegativeButton(Cj.o.f5090u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.home.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f110637a.onCreateAccount();
                }
            }).show();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem.NavBarActionListener
    public void onShowShoppingList() {
        startActivity(getMeijerIntent().D(this, getFeatureManager().e(AbstractC18503f.O.f172854h)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.isHomeScreenTrackStateSent = false;
    }
}

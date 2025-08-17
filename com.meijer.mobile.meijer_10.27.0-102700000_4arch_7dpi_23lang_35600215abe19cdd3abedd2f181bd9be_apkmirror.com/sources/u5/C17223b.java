package u5;

import C5.h;
import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.adobe.marketing.mobile.assurance.internal.C6419a;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import j4.i;
import j4.j;
import j4.k;
import kotlin.AbstractC14653B;
import kotlin.C14664h;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u5.AbstractC17222a;
import u5.AbstractC17224c;
import w5.C17773a;
import y5.C18163b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li4/u;", "navHostController", "Lcom/adobe/marketing/mobile/assurance/internal/a$b;", "sessionPhase", "", "a", "(Li4/u;Lcom/adobe/marketing/mobile/assurance/internal/a$b;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17223b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: u5.b$a */
    static final class a extends Lambda implements Function1<C14675s, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC17222a f162666f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f162667g;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: u5.b$a$a, reason: collision with other inner class name */
        static final class C2570a extends Lambda implements Function3<C14664h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17222a f162668f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f162669g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2570a(AbstractC17222a abstractC17222a, Activity activity) {
                super(3);
                this.f162668f = abstractC17222a;
                this.f162669g = activity;
            }

            public final void a(C14664h it, Composer composer, int i10) {
                C6419a.AbstractC1229a.PinConnect pinConnect;
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(-940005337, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:43)");
                }
                AbstractC17222a abstractC17222a = this.f162668f;
                AbstractC17222a.PinDestination pinDestination = abstractC17222a instanceof AbstractC17222a.PinDestination ? (AbstractC17222a.PinDestination) abstractC17222a : null;
                if (pinDestination != null && (pinConnect = pinDestination.getPinConnect()) != null) {
                    C18163b.a(pinConnect.getSessionId(), pinConnect.getEnvironment(), composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                Activity activity = this.f162669g;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h, Composer composer, Integer num) {
                a(c14664h, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: u5.b$a$b, reason: collision with other inner class name */
        static final class C2571b extends Lambda implements Function3<C14664h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17222a f162670f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f162671g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2571b(AbstractC17222a abstractC17222a, Activity activity) {
                super(3);
                this.f162670f = abstractC17222a;
                this.f162671g = activity;
            }

            public final void a(C14664h it, Composer composer, int i10) {
                C6419a.AbstractC1229a.QuickConnect quickConnect;
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(-174861346, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:54)");
                }
                AbstractC17222a abstractC17222a = this.f162670f;
                AbstractC17222a.QuickConnectDestination quickConnectDestination = abstractC17222a instanceof AbstractC17222a.QuickConnectDestination ? (AbstractC17222a.QuickConnectDestination) abstractC17222a : null;
                if (quickConnectDestination != null && (quickConnect = quickConnectDestination.getQuickConnect()) != null) {
                    h.a(quickConnect.getEnvironment(), composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                Activity activity = this.f162671g;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h, Composer composer, Integer num) {
                a(c14664h, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: u5.b$a$c */
        static final class c extends Lambda implements Function3<C14664h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17222a f162672f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f162673g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC17222a abstractC17222a, Activity activity) {
                super(3);
                this.f162672f = abstractC17222a;
                this.f162673g = activity;
            }

            public final void a(C14664h it, Composer composer, int i10) {
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(2039522272, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:69)");
                }
                AbstractC17222a abstractC17222a = this.f162672f;
                AbstractC17222a.ErrorDestination errorDestination = abstractC17222a instanceof AbstractC17222a.ErrorDestination ? (AbstractC17222a.ErrorDestination) abstractC17222a : null;
                if (errorDestination == null) {
                    Activity activity = this.f162673g;
                    if (activity != null) {
                        activity.finish();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                EnumC6425g error = errorDestination.getDisconnected().getError();
                if (error == null) {
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                } else {
                    C17773a.a(error, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h, Composer composer, Integer num) {
                a(c14664h, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: u5.b$a$d */
        static final class d extends Lambda implements Function3<C14664h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Activity f162674f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Activity activity) {
                super(3);
                this.f162674f = activity;
            }

            public final void a(C14664h it, Composer composer, int i10) {
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(999230433, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:81)");
                }
                Activity activity = this.f162674f;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14664h c14664h, Composer composer, Integer num) {
                a(c14664h, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC17222a abstractC17222a, Activity activity) {
            super(1);
            this.f162666f = abstractC17222a;
            this.f162667g = activity;
        }

        public final void a(C14675s NavHost) {
            Intrinsics.j(NavHost, "$this$NavHost");
            i.d(NavHost, AbstractC17224c.b.f162681b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(-940005337, true, new C2570a(this.f162666f, this.f162667g)), 6, null);
            i.d(NavHost, AbstractC17224c.C2573c.f162682b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(-174861346, true, new C2571b(this.f162666f, this.f162667g)), 6, null);
            i.d(NavHost, AbstractC17224c.d.f162683b.getPath(), null, null, C17225d.f162685a.a(), 6, null);
            i.d(NavHost, AbstractC17224c.a.f162680b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(2039522272, true, new c(this.f162666f, this.f162667g)), 6, null);
            i.d(NavHost, AbstractC17224c.e.f162684b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(999230433, true, new d(this.f162667g)), 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14675s c14675s) {
            a(c14675s);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: u5.b$b, reason: collision with other inner class name */
    static final class C2572b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14677u f162675f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6419a.b f162676g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f162677h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f162678i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2572b(C14677u c14677u, C6419a.b bVar, int i10, int i11) {
            super(2);
            this.f162675f = c14677u;
            this.f162676g = bVar;
            this.f162677h = i10;
            this.f162678i = i11;
        }

        public final void a(Composer composer, int i10) {
            C17223b.a(this.f162675f, this.f162676g, composer, J0.a(this.f162677h | 1), this.f162678i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(C14677u c14677u, C6419a.b sessionPhase, Composer composer, int i10, int i11) {
        Intrinsics.j(sessionPhase, "sessionPhase");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1764799326);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.V(sessionPhase) ? 32 : 16;
        }
        if (i12 == 1 && (i13 & 91) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            composerStartRestartGroup.E();
            if ((i10 & 1) != 0 && !composerStartRestartGroup.N()) {
                composerStartRestartGroup.K();
            } else if (i12 != 0) {
                c14677u = j.e(new AbstractC14653B[0], composerStartRestartGroup, 8);
            }
            C14677u c14677u2 = c14677u;
            composerStartRestartGroup.w();
            if (ComposerKt.M()) {
                ComposerKt.U(-1764799326, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost (AssuranceNavHost.kt:33)");
            }
            Object objO = composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Activity activity = objO instanceof Activity ? (Activity) objO : null;
            AbstractC17222a abstractC17222aA = AbstractC17222a.INSTANCE.a(sessionPhase);
            k.c(c14677u2, abstractC17222aA.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String().getPath(), null, null, new a(abstractC17222aA, activity), composerStartRestartGroup, 8, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            c14677u = c14677u2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C2572b(c14677u, sessionPhase, i10, i11));
    }
}

package v5;

import D5.h;
import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.adobe.marketing.mobile.assurance.internal.C6544a;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import j4.i;
import j4.j;
import j4.k;
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14678s;
import kotlin.C14680u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.AbstractC17635a;
import v5.AbstractC17637c;
import x5.C18094a;
import z5.C18445b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li4/u;", "navHostController", "Lcom/adobe/marketing/mobile/assurance/internal/a$b;", "sessionPhase", "", "a", "(Li4/u;Lcom/adobe/marketing/mobile/assurance/internal/a$b;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17636b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.b$a */
    static final class a extends Lambda implements Function1<C14678s, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC17635a f165595f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Activity f165596g;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: v5.b$a$a, reason: collision with other inner class name */
        static final class C2617a extends Lambda implements Function3<C14667h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17635a f165597f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f165598g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2617a(AbstractC17635a abstractC17635a, Activity activity) {
                super(3);
                this.f165597f = abstractC17635a;
                this.f165598g = activity;
            }

            public final void a(C14667h it, Composer composer, int i10) {
                C6544a.AbstractC1239a.PinConnect pinConnect;
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(-940005337, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:43)");
                }
                AbstractC17635a abstractC17635a = this.f165597f;
                AbstractC17635a.PinDestination pinDestination = abstractC17635a instanceof AbstractC17635a.PinDestination ? (AbstractC17635a.PinDestination) abstractC17635a : null;
                if (pinDestination != null && (pinConnect = pinDestination.getPinConnect()) != null) {
                    C18445b.a(pinConnect.getSessionId(), pinConnect.getEnvironment(), composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                Activity activity = this.f165598g;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h, Composer composer, Integer num) {
                a(c14667h, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: v5.b$a$b, reason: collision with other inner class name */
        static final class C2618b extends Lambda implements Function3<C14667h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17635a f165599f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f165600g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2618b(AbstractC17635a abstractC17635a, Activity activity) {
                super(3);
                this.f165599f = abstractC17635a;
                this.f165600g = activity;
            }

            public final void a(C14667h it, Composer composer, int i10) {
                C6544a.AbstractC1239a.QuickConnect quickConnect;
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(-174861346, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:54)");
                }
                AbstractC17635a abstractC17635a = this.f165599f;
                AbstractC17635a.QuickConnectDestination quickConnectDestination = abstractC17635a instanceof AbstractC17635a.QuickConnectDestination ? (AbstractC17635a.QuickConnectDestination) abstractC17635a : null;
                if (quickConnectDestination != null && (quickConnect = quickConnectDestination.getQuickConnect()) != null) {
                    h.a(quickConnect.getEnvironment(), composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                Activity activity = this.f165600g;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h, Composer composer, Integer num) {
                a(c14667h, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: v5.b$a$c */
        static final class c extends Lambda implements Function3<C14667h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC17635a f165601f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Activity f165602g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC17635a abstractC17635a, Activity activity) {
                super(3);
                this.f165601f = abstractC17635a;
                this.f165602g = activity;
            }

            public final void a(C14667h it, Composer composer, int i10) {
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(2039522272, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:69)");
                }
                AbstractC17635a abstractC17635a = this.f165601f;
                AbstractC17635a.ErrorDestination errorDestination = abstractC17635a instanceof AbstractC17635a.ErrorDestination ? (AbstractC17635a.ErrorDestination) abstractC17635a : null;
                if (errorDestination == null) {
                    Activity activity = this.f165602g;
                    if (activity != null) {
                        activity.finish();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                        return;
                    }
                    return;
                }
                EnumC6550g error = errorDestination.getDisconnected().getError();
                if (error == null) {
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                } else {
                    C18094a.a(error, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h, Composer composer, Integer num) {
                a(c14667h, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: v5.b$a$d */
        static final class d extends Lambda implements Function3<C14667h, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Activity f165603f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Activity activity) {
                super(3);
                this.f165603f = activity;
            }

            public final void a(C14667h it, Composer composer, int i10) {
                Intrinsics.j(it, "it");
                if (ComposerKt.M()) {
                    ComposerKt.U(999230433, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost.<anonymous>.<anonymous> (AssuranceNavHost.kt:81)");
                }
                Activity activity = this.f165603f;
                if (activity != null) {
                    activity.finish();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(C14667h c14667h, Composer composer, Integer num) {
                a(c14667h, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC17635a abstractC17635a, Activity activity) {
            super(1);
            this.f165595f = abstractC17635a;
            this.f165596g = activity;
        }

        public final void a(C14678s NavHost) {
            Intrinsics.j(NavHost, "$this$NavHost");
            i.d(NavHost, AbstractC17637c.b.f165610b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(-940005337, true, new C2617a(this.f165595f, this.f165596g)), 6, null);
            i.d(NavHost, AbstractC17637c.C2620c.f165611b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(-174861346, true, new C2618b(this.f165595f, this.f165596g)), 6, null);
            i.d(NavHost, AbstractC17637c.d.f165612b.getPath(), null, null, C17638d.f165614a.a(), 6, null);
            i.d(NavHost, AbstractC17637c.a.f165609b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(2039522272, true, new c(this.f165595f, this.f165596g)), 6, null);
            i.d(NavHost, AbstractC17637c.e.f165613b.getPath(), null, null, ComposableLambdaKt.composableLambdaInstance(999230433, true, new d(this.f165596g)), 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14678s c14678s) {
            a(c14678s);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.b$b, reason: collision with other inner class name */
    static final class C2619b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14680u f165604f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6544a.b f165605g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f165606h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f165607i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2619b(C14680u c14680u, C6544a.b bVar, int i10, int i11) {
            super(2);
            this.f165604f = c14680u;
            this.f165605g = bVar;
            this.f165606h = i10;
            this.f165607i = i11;
        }

        public final void a(Composer composer, int i10) {
            C17636b.a(this.f165604f, this.f165605g, composer, J0.a(this.f165606h | 1), this.f165607i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(C14680u c14680u, C6544a.b sessionPhase, Composer composer, int i10, int i11) {
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
                c14680u = j.e(new AbstractC14656B[0], composerStartRestartGroup, 8);
            }
            C14680u c14680u2 = c14680u;
            composerStartRestartGroup.w();
            if (ComposerKt.M()) {
                ComposerKt.U(-1764799326, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.AssuranceNavHost (AssuranceNavHost.kt:33)");
            }
            Object objO = composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Activity activity = objO instanceof Activity ? (Activity) objO : null;
            AbstractC17635a abstractC17635aA = AbstractC17635a.INSTANCE.a(sessionPhase);
            k.c(c14680u2, abstractC17635aA.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String().getPath(), null, null, new a(abstractC17635aA, activity), composerStartRestartGroup, 8, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            c14680u = c14680u2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C2619b(c14680u, sessionPhase, i10, i11));
    }
}

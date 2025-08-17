package com.meijer.mobile.meijer.activity.settings.debug;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.security.keystore.UserNotAuthenticatedException;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5881p0;
import androidx.compose.ui.platform.InterfaceC5884q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.InterfaceC6030s;
import com.fullstory.FS;
import com.meijer.mobile.gateway.apim.BuildConfig;
import com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity;
import com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity;
import com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity;
import com.meijer.mobile.meijer.activity.settings.debug.AbstractC12504a;
import com.meijer.mobile.meijer.activity.settings.debug.K;
import com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import ji.ChipButtons;
import ji.DefaultTextInputs;
import ji.InterfaceC14905H;
import ji.InterfaceC14919W;
import ji.InterfaceC14971y;
import ji.L0;
import ji.q1;
import kotlin.C17738x;
import kotlin.C17917Z;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import kotlin.text.StringsKt;
import l0.InterfaceC15343c;
import ni.C15837j;
import ni.C15851n1;
import ni.P0;
import ni.o1;
import qv.C16648k;
import qv.InterfaceC16622O;
import yo.MeijerUser;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0099\u0001\u0010\u0013\u001a\u00020\r*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t2#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\t2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\r*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u001a\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010\u001f\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001aE\u0010$\u001a\u00020\r*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0001¢\u0006\u0004\b$\u0010%\u001aD\u0010)\u001a\u00020\r*\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0001¢\u0006\u0004\b)\u0010*\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00067²\u0006\u000e\u00102\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u00103\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u00104\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lyo/c;", "userDetails", "", "fcmToken", "", "isPicassoLogging", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "actionCode", "", "onNavigateToAction", "universalLink", "onTestUniversalLink", "Lcom/meijer/mobile/meijer/activity/settings/debug/a;", "onAction", "o", "(LJi/M;Lyo/c;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "C", "(LJi/M;Lyo/c;Landroidx/compose/runtime/Composer;I)V", "title", "value", "isCopyable", "u", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "description", "Lkotlin/Function0;", "onClick", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "onSendPushNotification", "onResetPushRegistration", "w", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/meijer/mobile/meijer/activity/settings/debug/f0;", "destinations", "k", "(LJi/M;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Ljava/util/List;", "DESTINATIONS", "Lj0/C;", "L", "()Lj0/C;", "ContentPadding", "universalLinkState", "action", "lastAction", "deeplinkFieldState", "pushMessageSource", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"UnsafeOptInUsageError"})
    private static final List<QuickLinkDestination> f112018a = CollectionsKt.p(new QuickLinkDestination(Reflection.b(ScannerDemoActivity.class).u(), "action.com.meijer.mobile.scanner.demo"), new QuickLinkDestination(Reflection.b(PersonalizedShoppingListActivity.class).u(), "action.com.meijer.mobile.personalized_shoppinglist"), new QuickLinkDestination(Reflection.b(AvailableMccDetailsActivity.class).u(), "action.com.meijer.mobile.rewards.available_mcc_detail"), new QuickLinkDestination(Reflection.b(InProgressMccDetailActivity.class).u(), "action.com.meijer.mobile.rewards.inprogress_mcc_detail"));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<QuickLinkDestination> f112019a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112020b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112021c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$a$a, reason: collision with other inner class name */
        static final class C1769a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112022a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ QuickLinkDestination f112023b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112024c;

            /* JADX WARN: Multi-variable type inference failed */
            C1769a(LocalThemeScope localThemeScope, QuickLinkDestination quickLinkDestination, Function1<? super String, Unit> function1) {
                this.f112022a = localThemeScope;
                this.f112023b = quickLinkDestination;
                this.f112024c = function1;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1977397074, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:518)");
                }
                e.c cVarI = P0.e.INSTANCE.i();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f112022a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f112022a;
                final QuickLinkDestination quickLinkDestination = this.f112023b;
                final Function1<String, Unit> function1 = this.f112024c;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(16), 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                String activity = quickLinkDestination.getActivity();
                if (activity == null) {
                    activity = quickLinkDestination.getActionCode();
                }
                int i11 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, activity, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
                ni.Q q10 = ni.Q.f151657a;
                C.f.i iVar = C.f.i.f15513e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Navigate to ");
                String activity2 = quickLinkDestination.getActivity();
                if (activity2 == null) {
                    activity2 = quickLinkDestination.getActionCode();
                }
                sb2.append(activity2);
                String string = sb2.toString();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(function1) | composer.V(quickLinkDestination);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.C1769a.c(function1, quickLinkDestination);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.i(localThemeScope, q10, (Function0) objB, iVar, string, null, false, false, 0L, composer, (ni.Q.f151658b << 3) | i11 | (C.f.i.f15514f << 9), 240);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, QuickLinkDestination quickLinkDestination) {
                function1.invoke(quickLinkDestination.getActionCode());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(List<QuickLinkDestination> list, Function1<? super String, Unit> function1, LocalThemeScope localThemeScope) {
            this.f112019a = list;
            this.f112020b = function1;
            this.f112021c = localThemeScope;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1033009839, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory.<anonymous> (OtherDebugControls.kt:512)");
            }
            List<QuickLinkDestination> list = this.f112019a;
            final Function1<String, Unit> function1 = this.f112020b;
            LocalThemeScope localThemeScope = this.f112021c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer2, 0);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            composer2.startReplaceGroup(327046999);
            for (final QuickLinkDestination quickLinkDestination : list) {
                Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zV = composer2.V(function1) | composer2.V(quickLinkDestination);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.I
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.c(function1, quickLinkDestination);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                LocalThemeScope localThemeScope2 = localThemeScope;
                Function1<String, Unit> function12 = function1;
                List<QuickLinkDestination> list2 = list;
                t1.b((Function0) objB, modifierH, false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1977397074, true, new C1769a(localThemeScope, quickLinkDestination, function1), composer2, 54), composer2, 805306416, 508);
                composer2.startReplaceGroup(327088308);
                if (!Intrinsics.e(quickLinkDestination, CollectionsKt.D0(list2))) {
                    C17917Z.a(null, 0L, 0.0f, 0.0f, composer2, 0, 15);
                }
                composer.P();
                composer2 = composer;
                list = list2;
                localThemeScope = localThemeScope2;
                function1 = function12;
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, QuickLinkDestination quickLinkDestination) {
            function1.invoke(quickLinkDestination.getActionCode());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f112026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12504a, Unit> f112027c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112028a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f112029b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12504a, Unit> f112030c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$b$a$a, reason: collision with other inner class name */
            static final class C1770a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112031a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f112032b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<AbstractC12504a, Unit> f112033c;

                /* JADX WARN: Multi-variable type inference failed */
                C1770a(LocalThemeScope localThemeScope, boolean z10, Function1<? super AbstractC12504a, Unit> function1) {
                    this.f112031a = localThemeScope;
                    this.f112032b = z10;
                    this.f112033c = function1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function1 function1, boolean z10) {
                    function1.invoke(new AbstractC12504a.EnablePicassoLogging(z10));
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1934456845, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:93)");
                    }
                    LocalThemeScope localThemeScope = this.f112031a;
                    boolean z10 = this.f112032b;
                    final Function1<AbstractC12504a, Unit> function1 = this.f112033c;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14815g c14815g = C14815g.f139108a;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(function1);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.L
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.b.a.C1770a.c(function1, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Li.h.o(localThemeScope, "Enable Picasso Logging", z10, null, (Function1) objB, composer, LocalThemeScope.f15770g | 48, 4);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, boolean z10, Function1<? super AbstractC12504a, Unit> function1) {
                this.f112028a = localThemeScope;
                this.f112029b = z10;
                this.f112030c = function1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1021338352, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:92)");
                }
                C17985y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(-1934456845, true, new C1770a(this.f112028a, this.f112029b, this.f112030c), composer, 54), composer, 1572864, 63);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, boolean z10, Function1<? super AbstractC12504a, Unit> function1) {
            this.f112025a = localThemeScope;
            this.f112026b = z10;
            this.f112027c = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(425952841, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:91)");
            }
            Sj.f.c(this.f112025a, "Logging", null, K.L(), false, null, ComposableLambdaKt.c(-1021338352, true, new a(this.f112025a, this.f112026b, this.f112027c), composer, 54), composer, LocalThemeScope.f15770g | 1572912, 26);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MeijerUser f112035b;

        c(LocalThemeScope localThemeScope, MeijerUser meijerUser) {
            this.f112034a = localThemeScope;
            this.f112035b = meijerUser;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1366884658, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:104)");
            }
            K.C(this.f112034a, this.f112035b, composer, LocalThemeScope.f15770g);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112037b;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112036a = localThemeScope;
            this.f112037b = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1130632175, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:108)");
            }
            K.k(this.f112036a, K.f112018a, this.f112037b, composer, LocalThemeScope.f15770g);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12504a, Unit> f112040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f112041d;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, String str, Function1<? super AbstractC12504a, Unit> function1, Context context) {
            this.f112038a = localThemeScope;
            this.f112039b = str;
            this.f112040c = function1;
            this.f112041d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, Context context, String deepLink, String source) {
            Intrinsics.j(deepLink, "deepLink");
            Intrinsics.j(source, "source");
            function1.invoke(new AbstractC12504a.SendPushNotification(deepLink, source, context));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(AbstractC12504a.d.f112128a);
            return Unit.f142422a;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(666818288, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:112)");
            }
            LocalThemeScope localThemeScope = this.f112038a;
            String str = this.f112039b;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f112040c) | composer.D(this.f112041d);
            final Function1<AbstractC12504a, Unit> function1 = this.f112040c;
            final Context context = this.f112041d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.M
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return K.e.d(function1, context, (String) obj, (String) obj2);
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f112040c);
            final Function1<AbstractC12504a, Unit> function12 = this.f112040c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K.e.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            K.w(localThemeScope, str, function2, (Function0) objB2, composer, LocalThemeScope.f15770g);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112043b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112044a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112045b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f112046c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$f$a$a, reason: collision with other inner class name */
            static final class C1771a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112047a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<String, Unit> f112048b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f112049c;

                /* JADX WARN: Multi-variable type inference failed */
                C1771a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5730l0<String> interfaceC5730l0) {
                    this.f112047a = localThemeScope;
                    this.f112048b = function1;
                    this.f112049c = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC5730l0 interfaceC5730l0, String it) {
                    Intrinsics.j(it, "it");
                    f.e(interfaceC5730l0, it);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC14919W interfaceC14919W, final Function1 function1, final InterfaceC5730l0 interfaceC5730l0, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), BuildConfig.MEIJER_WEB_BASE_URL);
                    AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Enter Test Universal link");
                    AdsInputField.t0(interfaceC14919W.getIcons().getTrailingIcon(), C.a.C0244C.f15322e, "Test Universal Link", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.f.a.C1771a.g(function1, interfaceC5730l0);
                        }
                    });
                    return Unit.f142422a;
                }

                public final void d(final InterfaceC14919W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(2050094401, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:131)");
                    }
                    LocalThemeScope localThemeScope = this.f112047a;
                    String strD = f.d(this.f112049c);
                    q1.f.TextInput textInputF = Cr.f.f(Assemble.getInputFields(), false, false, false, null, 15, null);
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f112049c;
                    Object objB = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.O
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.f.a.C1771a.e(interfaceC5730l0, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function1 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112048b);
                    final Function1<String, Unit> function12 = this.f112048b;
                    final InterfaceC5730l0<String> interfaceC5730l02 = this.f112049c;
                    Object objB2 = composer.B();
                    if (zD || objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.P
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.f.a.C1771a.f(Assemble, function12, interfaceC5730l02, (H1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C18504m0.i(localThemeScope, strD, textInputF, null, function1, (Function1) objB2, composer, LocalThemeScope.f15770g | 24576 | (q1.f.TextInput.f140038m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
                    d(interfaceC14919W, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
                    function1.invoke(f.d(interfaceC5730l0));
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5730l0<String> interfaceC5730l0) {
                this.f112044a = localThemeScope;
                this.f112045b = function1;
                this.f112046c = interfaceC5730l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1108131114, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:129)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f112044a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f112044a;
                Function1<String, Unit> function1 = this.f112045b;
                InterfaceC5730l0<String> interfaceC5730l0 = this.f112046c;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                Ji.Q.e(localThemeScope, L0.f139675a, ComposableLambdaKt.c(2050094401, true, new C1771a(localThemeScope, function1, interfaceC5730l0), composer, 54), composer, LocalThemeScope.f15770g | 384 | (L0.f139676b << 3));
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                composer.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112042a = localThemeScope;
            this.f112043b = function1;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1830698545, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:122)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.t1.e("https://www.meijer.com/shopping/search.html?text=banana&sort_order=relevance-descending&discountSalePriceValue=%22-inf%22-%225%22&healthAndWellnessValues=Organic", null, 2, null);
                composer.t(objB);
            }
            composer.P();
            Sj.f.c(this.f112042a, "Test Universal Links", null, K.L(), false, null, ComposableLambdaKt.c(-1108131114, true, new a(this.f112042a, this.f112043b, (InterfaceC5730l0) objB), composer, 54), composer, LocalThemeScope.f15770g | 1572912, 26);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112050a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112051b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112052a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112053b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$g$a$a, reason: collision with other inner class name */
            static final class C1772a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112054a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<String, Unit> f112055b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f112056c;

                /* JADX WARN: Multi-variable type inference failed */
                C1772a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5730l0<String> interfaceC5730l0) {
                    this.f112054a = localThemeScope;
                    this.f112055b = function1;
                    this.f112056c = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function1 function1, String it) {
                    Intrinsics.j(it, "it");
                    function1.invoke(it);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC14919W interfaceC14919W, final Function1 function1, final InterfaceC5730l0 interfaceC5730l0, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "com.meijer.mobile.androidacres.showcase.demo");
                    AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Enter Action Code");
                    AdsInputField.e(interfaceC14919W.getLabels().getDescription(), "Refer to the <action> tag for the target Activity in the AndroidManifest.xml file.");
                    AdsInputField.t0(interfaceC14919W.getIcons().getTrailingIcon(), C.a.C0244C.f15322e, "Launch Activity", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.U
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.g.a.C1772a.g(function1, interfaceC5730l0);
                        }
                    });
                    return Unit.f142422a;
                }

                public final void d(final InterfaceC14919W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-447422432, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:165)");
                    }
                    LocalThemeScope localThemeScope = this.f112054a;
                    String strC = a.c(this.f112056c);
                    if (StringsKt.r0(strC)) {
                        strC = null;
                    }
                    if (strC == null) {
                        strC = "com.meijer.mobile.";
                    }
                    String str = strC;
                    q1.f.TextInput textInputF = Cr.f.f(Assemble.getInputFields(), false, false, false, null, 15, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f112055b);
                    final Function1<String, Unit> function1 = this.f112055b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.S
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.g.a.C1772a.e(function1, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function12 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112055b);
                    final Function1<String, Unit> function13 = this.f112055b;
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f112056c;
                    Object objB2 = composer.B();
                    if (zD || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.T
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.g.a.C1772a.f(Assemble, function13, interfaceC5730l0, (H1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C18504m0.i(localThemeScope, str, textInputF, null, function12, (Function1) objB2, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
                    d(interfaceC14919W, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
                    function1.invoke(a.c(interfaceC5730l0));
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
                this.f112052a = localThemeScope;
                this.f112053b = function1;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(689319349, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:157)");
                }
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.t1.e("", null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                composer.P();
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f112052a.getAdsSpacing().getFive().getDp(), this.f112052a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112052a;
                Function1<String, Unit> function1 = this.f112053b;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                Ji.Q.e(localThemeScope, L0.f139675a, ComposableLambdaKt.c(-447422432, true, new C1772a(localThemeScope, function1, interfaceC5730l0), composer, 54), composer, LocalThemeScope.f15770g | 384 | (L0.f139676b << 3));
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c(InterfaceC5730l0<String> interfaceC5730l0) {
                return interfaceC5730l0.getValue();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112050a = localThemeScope;
            this.f112051b = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-33248082, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:153)");
            }
            Sj.f.c(this.f112050a, "Launch Activity by Action", null, K.L(), false, null, ComposableLambdaKt.c(689319349, true, new a(this.f112050a, this.f112051b), composer, 54), composer, LocalThemeScope.f15770g | 1572912, 26);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12504a, Unit> f112058b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112059a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12504a, Unit> f112060b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super AbstractC12504a, Unit> function1) {
                this.f112059a = localThemeScope;
                this.f112060b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(AbstractC12504a.c.f112127a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(new AbstractC12504a.Throw(new UserNotAuthenticatedException("Thrown from debug menu")));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(AbstractC12504a.C1774a.f112125a);
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1808197484, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:197)");
                }
                LocalThemeScope localThemeScope = this.f112059a;
                final Function1<AbstractC12504a, Unit> function1 = this.f112060b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.V
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.h.a.e(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                K.m(localThemeScope, null, "Force Logout", "Will trigger a forced logout scenario as if getToken() would throw a UserNotAuthenticatedException.", (Function0) objB, composer, i11 | 3456, 1);
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.W
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.h.a.f(function1);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                K.m(localThemeScope, null, "Throw UNAException", "Throws a `UserNotAuthenticatedException` as if it were thrown from somewhere other than the authenticator.", (Function0) objB2, composer, i11 | 3456, 1);
                C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.X
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.h.a.g(function1);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                K.m(localThemeScope, null, "Force Unloaded Account State", "Use to test scenario where account data fails to fetch after successful authentication.", (Function0) objB3, composer, i11 | 3456, 1);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, Function1<? super AbstractC12504a, Unit> function1) {
            this.f112057a = localThemeScope;
            this.f112058b = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1764202381, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:193)");
            }
            Sj.f.c(this.f112057a, "Trigger Error States", null, K.L(), false, null, ComposableLambdaKt.c(-1808197484, true, new a(this.f112057a, this.f112058b), composer, 54), composer, LocalThemeScope.f15770g | 1572912, 26);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112062b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f112063c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6030s f112064d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5884q0 f112065e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f112066f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f112067g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112068a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f112069b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f112068a = localThemeScope;
                this.f112069b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(445191437, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PropertyField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:300)");
                }
                LocalThemeScope localThemeScope = this.f112068a;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, 1, localThemeScope.getAdsTypography().getBody().getOne(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null), this.f112069b, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControlsKt$PropertyField$1$1$1$2$1$1", f = "OtherDebugControls.kt", l = {318}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112070a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5884q0 f112071b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f112072c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f112073d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f112074e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC5884q0 interfaceC5884q0, String str, String str2, Context context, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f112071b = interfaceC5884q0;
                this.f112072c = str;
                this.f112073d = str2;
                this.f112074e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f112071b, this.f112072c, this.f112073d, this.f112074e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112070a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC5884q0 interfaceC5884q0 = this.f112071b;
                    ClipData clipDataNewPlainText = ClipData.newPlainText(this.f112072c, this.f112073d);
                    Intrinsics.i(clipDataNewPlainText, "newPlainText(...)");
                    C5881p0 c5881p0 = new C5881p0(clipDataNewPlainText);
                    this.f112070a = 1;
                    if (interfaceC5884q0.b(c5881p0, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f142422a;
                Toast.makeText(this.f112074e, "Copied to clipboard", 0).show();
                return Unit.f142422a;
            }
        }

        i(LocalThemeScope localThemeScope, String str, boolean z10, InterfaceC6030s interfaceC6030s, InterfaceC5884q0 interfaceC5884q0, String str2, Context context) {
            this.f112061a = localThemeScope;
            this.f112062b = str;
            this.f112063c = z10;
            this.f112064d = interfaceC6030s;
            this.f112065e = interfaceC5884q0;
            this.f112066f = str2;
            this.f112067g = context;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(737744144, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PropertyField.<anonymous> (OtherDebugControls.kt:288)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112061a.getAdsSpacing().getFive().getDp(), this.f112061a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f112061a;
            final String str = this.f112062b;
            boolean z10 = this.f112063c;
            final InterfaceC6030s interfaceC6030s = this.f112064d;
            final InterfaceC5884q0 interfaceC5884q0 = this.f112065e;
            final String str2 = this.f112066f;
            final Context context = this.f112067g;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null);
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope, label, str, null, composer, i11 | (q1.Label.f140080j << 3), 4);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C17738x.a(InterfaceC14800I.b(c14801j, companion, 5.0f, false, 2, null), ComposableLambdaKt.c(445191437, true, new a(localThemeScope, str2), composer, 54), composer, 48, 0);
            composer.startReplaceGroup(-460849779);
            if (z10) {
                C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
                ni.N n10 = ni.N.f151529a;
                C.b.h.g gVar = C.b.h.g.f15469e;
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(interfaceC6030s) | composer.D(interfaceC5884q0) | composer.V(str) | composer.V(str2) | composer.D(context);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    Object obj = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.i.c(interfaceC6030s, interfaceC5884q0, str, str2, context);
                        }
                    };
                    composer.t(obj);
                    objB = obj;
                }
                composer.P();
                P0.i(localThemeScope, n10, (Function0) objB, gVar, "Copy to Clipboard", null, false, false, 0L, composer, i11 | 24576 | (ni.N.f151530b << 3) | (C.b.h.g.f15470f << 9), 240);
            }
            composer.P();
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC6030s interfaceC6030s, InterfaceC5884q0 interfaceC5884q0, String str, String str2, Context context) {
            C16648k.d(C6031t.a(interfaceC6030s), null, null, new b(interfaceC5884q0, str, str2, context, null), 3, null);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f112077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<String, String, Unit> f112078d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f112079e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f112080f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112081a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f112082b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f112081a = localThemeScope;
                this.f112082b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(273672366, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:407)");
                }
                LocalThemeScope localThemeScope = this.f112081a;
                String str = this.f112082b;
                K.u(localThemeScope, "FCM Token", str == null ? "Not Available" : str, null, !(str == null || StringsKt.r0(str)), composer, LocalThemeScope.f15770g | 48, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112083a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f112084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<String, String, Unit> f112085c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f112086d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f112087a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112088b;

                a(InterfaceC5730l0<String> interfaceC5730l0, LocalThemeScope localThemeScope) {
                    this.f112087a = interfaceC5730l0;
                    this.f112088b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(boolean z10, InterfaceC14905H interfaceC14905H, String str, o1 AdsChip) {
                    Intrinsics.j(AdsChip, "$this$AdsChip");
                    AdsChip.d(z10 ? interfaceC14905H.getLabels().getEnabledSelectedLabel() : interfaceC14905H.getLabels().getEnabledRestingLabel(), str);
                    return Unit.f142422a;
                }

                public final void c(final InterfaceC14905H Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(669718156, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:422)");
                    }
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f112087a;
                    LocalThemeScope localThemeScope = this.f112088b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyB, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14801J c14801j = C14801J.f139030a;
                    composer.startReplaceGroup(771940314);
                    for (final String str : CollectionsKt.p("Emarsys", "Adobe")) {
                        composer.startReplaceGroup(771942826);
                        final boolean zE = Intrinsics.e(str, K.z(interfaceC5730l0));
                        ChipButtons chipButtonsD = Assemble.getButtons();
                        q1.d.ChipButton enabledSelected = zE ? chipButtonsD.getEnabledSelected() : chipButtonsD.getEnabledResting();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(str);
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return K.j.b.a.d(str, interfaceC5730l0);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zA = composer.a(zE) | composer.D(Assemble) | composer.V(str);
                        Object objB2 = composer.B();
                        if (zA || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return K.j.b.a.e(zE, Assemble, str, (o1) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Composer composer2 = composer;
                        C15851n1.h(localThemeScope, null, function0, enabledSelected, (Function1) objB2, composer2, LocalThemeScope.f15770g | (q1.d.ChipButton.f139940k << 9), 1);
                        C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
                        composer2.P();
                        composer = composer2;
                    }
                    Composer composer3 = composer;
                    composer3.P();
                    composer3.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
                    c(interfaceC14905H, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(String str, InterfaceC5730l0 interfaceC5730l0) {
                    K.A(interfaceC5730l0, str);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$j$b$b, reason: collision with other inner class name */
            static final class C1773b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112089a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14814f f112090b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function2<String, String, Unit> f112091c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f112092d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f112093e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$j$b$b$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112094a;

                    a(LocalThemeScope localThemeScope) {
                        this.f112094a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1120963770, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:467)");
                        }
                        ri.j.h(this.f112094a, new q1.Label(null, null, null, null, 0, false, 0, this.f112094a.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "Note: If you don't see a test notification, check App Settings for Meijer and ensure that notifications are enabled.", null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                /* JADX WARN: Multi-variable type inference failed */
                C1773b(LocalThemeScope localThemeScope, InterfaceC14814f interfaceC14814f, Function2<? super String, ? super String, Unit> function2, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02) {
                    this.f112089a = localThemeScope;
                    this.f112090b = interfaceC14814f;
                    this.f112091c = function2;
                    this.f112092d = interfaceC5730l0;
                    this.f112093e = interfaceC5730l02;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final q1.f.TextInput f(InterfaceC14814f interfaceC14814f, q1.f.TextInput it) {
                    Intrinsics.j(it, "it");
                    return q1.f.TextInput.y(it, InterfaceC14814f.b(interfaceC14814f, it.getModifier(), 5.0f, false, 2, null), false, null, null, null, null, null, false, 0, null, null, null, 4094, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String it) {
                    Intrinsics.j(it, "it");
                    K.y(interfaceC5730l0, it);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(InterfaceC14919W interfaceC14919W, final Function2 function2, final InterfaceC5730l0 interfaceC5730l0, final InterfaceC5730l0 interfaceC5730l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), "meijerapp://");
                    AdsInputField.d(interfaceC14919W.getLabels().getLabel(), "Enter Test Deeplink");
                    AdsInputField.t0(interfaceC14919W.getIcons().getTrailingIcon(), C.a.C0244C.f15322e, "Copy to Clipboard", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.j.b.C1773b.l(function2, interfaceC5730l0, interfaceC5730l02);
                        }
                    });
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(-1120963770, true, new a(localThemeScope)));
                    return Unit.f142422a;
                }

                public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-10810891, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:445)");
                    }
                    LocalThemeScope localThemeScope = this.f112089a;
                    String strX = K.x(this.f112092d);
                    if (StringsKt.r0(strX)) {
                        strX = null;
                    }
                    if (strX == null) {
                        strX = "meijerapp://";
                    }
                    String str = strX;
                    DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f112090b);
                    final InterfaceC14814f interfaceC14814f = this.f112090b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.j.b.C1773b.f(interfaceC14814f, (q1.f.TextInput) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, false, false, false, (Function1) objB, 7, null);
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f112092d;
                    Object objB2 = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.j.b.C1773b.g(interfaceC5730l0, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function1 function1 = (Function1) objB2;
                    composer.P();
                    composer.startReplaceGroup(-1224400529);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112091c) | composer.D(this.f112089a);
                    final Function2<String, String, Unit> function2 = this.f112091c;
                    final InterfaceC5730l0<String> interfaceC5730l02 = this.f112092d;
                    final InterfaceC5730l0<String> interfaceC5730l03 = this.f112093e;
                    final LocalThemeScope localThemeScope2 = this.f112089a;
                    Object objB3 = composer.B();
                    if (zD || objB3 == companion.a()) {
                        Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.d0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.j.b.C1773b.k(Assemble, function2, interfaceC5730l02, interfaceC5730l03, localThemeScope2, (H1) obj);
                            }
                        };
                        composer.t(function12);
                        objB3 = function12;
                    }
                    composer.P();
                    C18504m0.i(localThemeScope, str, textInputF, null, function1, (Function1) objB3, composer, LocalThemeScope.f15770g | 24576 | (q1.f.TextInput.f140038m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
                    e(interfaceC14919W, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02) {
                    function2.invoke(K.x(interfaceC5730l0), K.z(interfaceC5730l02));
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, InterfaceC5730l0<String> interfaceC5730l0, Function2<? super String, ? super String, Unit> function2, InterfaceC5730l0<String> interfaceC5730l02) {
                this.f112083a = localThemeScope;
                this.f112084b = interfaceC5730l0;
                this.f112085c = function2;
                this.f112086d = interfaceC5730l02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(50586583, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:415)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112083a.getAdsSpacing().getFive().getDp(), this.f112083a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112083a;
                InterfaceC5730l0<String> interfaceC5730l0 = this.f112084b;
                Function2<String, String, Unit> function2 = this.f112085c;
                InterfaceC5730l0<String> interfaceC5730l02 = this.f112086d;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                InterfaceC14971y.a.C2218a c2218a = InterfaceC14971y.a.C2218a.f140286a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(669718156, true, new a(interfaceC5730l0, localThemeScope), composer, 54);
                int i11 = LocalThemeScope.f15770g;
                Ji.Q.e(localThemeScope, c2218a, composableLambdaC, composer, i11 | 384 | (InterfaceC14971y.a.C2218a.f140287b << 3));
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                Ji.Q.e(localThemeScope, L0.f139675a, ComposableLambdaKt.c(-10810891, true, new C1773b(localThemeScope, c14815g, function2, interfaceC5730l02, interfaceC5730l0), composer, 54), composer, i11 | 384 | (L0.f139676b << 3));
                composer.v();
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112095a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f112096b;

            c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f112095a = localThemeScope;
                this.f112096b = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1905560330, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:479)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112095a.getAdsSpacing().getFive().getDp(), this.f112095a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112095a;
                Function0<Unit> function0 = this.f112096b;
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null);
                int i11 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, "If you are experiencing issues with push notifications, try resetting the registration.", null, composer, i11 | 384 | (q1.Label.f140080j << 3), 4);
                C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                P0.h(localThemeScope, C15837j.f151718a, function0, C.a.y.f15366e, "Reset Emarsys Registration", null, null, true, false, false, 0L, composer, 12607488 | i11 | (C15837j.f151719b << 3) | (C.a.y.f15367f << 9), 0, 944);
                composer.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, String str, InterfaceC5730l0<String> interfaceC5730l0, Function2<? super String, ? super String, Unit> function2, InterfaceC5730l0<String> interfaceC5730l02, Function0<Unit> function0) {
            this.f112075a = localThemeScope;
            this.f112076b = str;
            this.f112077c = interfaceC5730l0;
            this.f112078d = function2;
            this.f112079e = interfaceC5730l02;
            this.f112080f = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961755047, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous> (OtherDebugControls.kt:405)");
            }
            LocalThemeScope localThemeScope = this.f112075a;
            String str = this.f112076b;
            InterfaceC5730l0<String> interfaceC5730l0 = this.f112077c;
            Function2<String, String, Unit> function2 = this.f112078d;
            InterfaceC5730l0<String> interfaceC5730l02 = this.f112079e;
            Function0<Unit> function0 = this.f112080f;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            C17985y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(273672366, true, new a(localThemeScope, str), composer, 54), composer, 1572864, 63);
            C17985y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(50586583, true, new b(localThemeScope, interfaceC5730l0, function2, interfaceC5730l02), composer, 54), composer, 1572864, 63);
            C17985y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(-1905560330, true, new c(localThemeScope, function0), composer, 54), composer, 1572864, 63);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MeijerUser f112098b;

        k(LocalThemeScope localThemeScope, MeijerUser meijerUser) {
            this.f112097a = localThemeScope;
            this.f112098b = meijerUser;
        }

        public final void a(Composer composer, int i10) {
            String userPhone;
            String strA;
            String lastName;
            String firstName;
            String email;
            String externalShopperId;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2136109494, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.UserDetailsCard.<anonymous> (OtherDebugControls.kt:230)");
            }
            LocalThemeScope localThemeScope = this.f112097a;
            MeijerUser meijerUser = this.f112098b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            String str = (meijerUser == null || (externalShopperId = meijerUser.getExternalShopperId()) == null) ? "Not Available" : externalShopperId;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String externalShopperId2 = meijerUser != null ? meijerUser.getExternalShopperId() : null;
            boolean z10 = !(externalShopperId2 == null || StringsKt.r0(externalShopperId2));
            int i11 = LocalThemeScope.f15770g;
            K.u(localThemeScope, "External Shopper ID", str, modifierH, z10, composer, i11 | 3120, 0);
            String str2 = (meijerUser == null || (email = meijerUser.getEmail()) == null) ? "Not Available" : email;
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String email2 = meijerUser != null ? meijerUser.getEmail() : null;
            K.u(localThemeScope, "Email", str2, modifierH2, !(email2 == null || StringsKt.r0(email2)), composer, i11 | 3120, 0);
            String str3 = (meijerUser == null || (firstName = meijerUser.getFirstName()) == null) ? "Not Available" : firstName;
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String firstName2 = meijerUser != null ? meijerUser.getFirstName() : null;
            K.u(localThemeScope, "First Name", str3, modifierH3, !(firstName2 == null || StringsKt.r0(firstName2)), composer, i11 | 3120, 0);
            String str4 = (meijerUser == null || (lastName = meijerUser.getLastName()) == null) ? "Not Available" : lastName;
            Modifier modifierH4 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String lastName2 = meijerUser != null ? meijerUser.getLastName() : null;
            K.u(localThemeScope, "Last Name", str4, modifierH4, !(lastName2 == null || StringsKt.r0(lastName2)), composer, i11 | 3120, 0);
            String str5 = (meijerUser == null || (userPhone = meijerUser.getUserPhone()) == null || (strA = Fk.a.f10894a.a(userPhone)) == null) ? "Not Available" : strA;
            Modifier modifierH5 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String userPhone2 = meijerUser != null ? meijerUser.getUserPhone() : null;
            K.u(localThemeScope, "Phone", str5, modifierH5, !(userPhone2 == null || StringsKt.r0(userPhone2)), composer, i11 | 3120, 0);
            String currentSession = FS.getCurrentSession();
            String str6 = currentSession == null ? "Not Available" : currentSession;
            Modifier modifierH6 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String currentSession2 = FS.getCurrentSession();
            K.u(localThemeScope, "FS Session", str6, modifierH6, !(currentSession2 == null || StringsKt.r0(currentSession2)), composer, i11 | 3120, 0);
            composer.v();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC14794C L() {
        return androidx.compose.foundation.layout.D.a(H1.h.p(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, String str, Function2 function2, Function0 function0, int i10, Composer composer, int i11) {
        w(localThemeScope, str, function2, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, MeijerUser meijerUser, int i10, Composer composer, int i11) {
        C(localThemeScope, meijerUser, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @SuppressLint({"ComposableStringLiteral"})
    public static final void k(LocalThemeScope localThemeScope, final List<QuickLinkDestination> destinations, final Function1<? super String, Unit> onNavigateToAction, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(destinations, "destinations");
        Intrinsics.j(onNavigateToAction, "onNavigateToAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-905268872);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(destinations) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onNavigateToAction) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-905268872, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory (OtherDebugControls.kt:510)");
            }
            localThemeScope2 = localThemeScope;
            Sj.f.c(localThemeScope2, "Quick-Link Destinations", null, L(), false, null, ComposableLambdaKt.c(-1033009839, true, new a(destinations, onNavigateToAction, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f15770g | (i11 & 14), 26);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.l(localThemeScope2, destinations, onNavigateToAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, List list, Function1 function1, int i10, Composer composer, int i11) {
        k(localThemeScope, list, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final java.lang.String r36, java.lang.String r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.m(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, str, str2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r23, final yo.MeijerUser r24, final java.lang.String r25, final boolean r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.settings.debug.AbstractC12504a, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.o(Ji.M, yo.c, java.lang.String, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(AbstractC12504a it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, boolean z10, Function1 function1, MeijerUser meijerUser, Function1 function12, String str, Context context, Function1 function13, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(425952841, true, new b(localThemeScope, z10, function1)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1366884658, true, new c(localThemeScope, meijerUser)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1130632175, true, new d(localThemeScope, function12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(666818288, true, new e(localThemeScope, str, function1, context)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1830698545, true, new f(localThemeScope, function13)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-33248082, true, new g(localThemeScope, function12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1764202381, true, new h(localThemeScope, function1)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, MeijerUser meijerUser, String str, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, meijerUser, str, z10, modifier, function1, function12, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ji.LocalThemeScope r21, final java.lang.String r22, final java.lang.String r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.u(Ji.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, boolean z10, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, str, str2, modifier, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    @SuppressLint({"ComposableStringLiteral"})
    public static final void w(final LocalThemeScope localThemeScope, final String str, final Function2<? super String, ? super String, Unit> onSendPushNotification, final Function0<Unit> onResetPushRegistration, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onSendPushNotification, "onSendPushNotification");
        Intrinsics.j(onResetPushRegistration, "onResetPushRegistration");
        Composer composerStartRestartGroup = composer.startRestartGroup(-736154802);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onSendPushNotification) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onResetPushRegistration) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-736154802, i12, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard (OtherDebugControls.kt:400)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e("", null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e("Emarsys", null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Sj.f.c(localThemeScope, "Push Notifications", null, L(), false, null, ComposableLambdaKt.c(1961755047, true, new j(localThemeScope, str, (InterfaceC5730l0) objB2, onSendPushNotification, interfaceC5730l0, onResetPushRegistration), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f15770g | (i12 & 14), 26);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.B(localThemeScope, str, onSendPushNotification, onResetPushRegistration, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ComposableStringLiteral"})
    public static final void C(LocalThemeScope localThemeScope, final MeijerUser meijerUser, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-498766031);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(meijerUser)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-498766031, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.UserDetailsCard (OtherDebugControls.kt:228)");
            }
            localThemeScope2 = localThemeScope;
            Sj.f.c(localThemeScope2, "User Info", null, L(), false, null, ComposableLambdaKt.c(-2136109494, true, new k(localThemeScope, meijerUser), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f15770g | (i11 & 14), 26);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.D(localThemeScope2, meijerUser, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }
}

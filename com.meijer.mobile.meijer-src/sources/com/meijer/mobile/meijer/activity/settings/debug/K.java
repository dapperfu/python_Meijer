package com.meijer.mobile.meijer.activity.settings.debug;

import Ai.C2832m0;
import Ai.H1;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.security.keystore.UserNotAuthenticatedException;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6023p0;
import androidx.compose.ui.platform.InterfaceC6026q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.InterfaceC6172s;
import com.fullstory.FS;
import com.meijer.mobile.gateway.apim.BuildConfig;
import com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity;
import com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity;
import com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity;
import com.meijer.mobile.meijer.activity.settings.debug.AbstractC12630a;
import com.meijer.mobile.meijer.activity.settings.debug.K;
import com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import ki.ChipButtons;
import ki.DefaultTextInputs;
import ki.InterfaceC15139H;
import ki.InterfaceC15153W;
import ki.InterfaceC15205y;
import ki.L0;
import ki.q1;
import kotlin.C17808x;
import kotlin.C17983Z;
import kotlin.C18051y;
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
import l0.InterfaceC15433c;
import mv.C15809k;
import mv.InterfaceC15783O;
import oi.C16171j;
import oi.C16185n1;
import oi.P0;
import oi.o1;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0091\u0001\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000b0\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aE\u0010#\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0001¢\u0006\u0004\b#\u0010$\u001aD\u0010(\u001a\u00020\u000b*\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007H\u0001¢\u0006\u0004\b(\u0010)\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066²\u0006\u000e\u00101\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u00102\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u00103\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lyo/c;", "userDetails", "", "fcmToken", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "actionCode", "", "onNavigateToAction", "universalLink", "onTestUniversalLink", "Lcom/meijer/mobile/meijer/activity/settings/debug/a;", "onAction", "o", "(LKi/M;Lyo/c;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "C", "(LKi/M;Lyo/c;Landroidx/compose/runtime/Composer;I)V", "title", "value", "", "isCopyable", "u", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "description", "Lkotlin/Function0;", "onClick", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "onSendPushNotification", "onResetPushRegistration", "w", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/meijer/mobile/meijer/activity/settings/debug/e0;", "destinations", "k", "(LKi/M;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "a", "Ljava/util/List;", "DESTINATIONS", "Lj0/C;", "L", "()Lj0/C;", "ContentPadding", "universalLinkState", "action", "lastAction", "deeplinkFieldState", "pushMessageSource", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"UnsafeOptInUsageError"})
    private static final List<QuickLinkDestination> f112883a = CollectionsKt.p(new QuickLinkDestination(Reflection.b(ScannerDemoActivity.class).u(), "action.com.meijer.mobile.scanner.demo"), new QuickLinkDestination(Reflection.b(PersonalizedShoppingListActivity.class).u(), "action.com.meijer.mobile.personalized_shoppinglist"), new QuickLinkDestination(Reflection.b(AvailableMccDetailsActivity.class).u(), "action.com.meijer.mobile.rewards.available_mcc_detail"), new QuickLinkDestination(Reflection.b(InProgressMccDetailActivity.class).u(), "action.com.meijer.mobile.rewards.inprogress_mcc_detail"));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<QuickLinkDestination> f112884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112886c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$a$a, reason: collision with other inner class name */
        static final class C1778a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112887a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ QuickLinkDestination f112888b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112889c;

            /* JADX WARN: Multi-variable type inference failed */
            C1778a(LocalThemeScope localThemeScope, QuickLinkDestination quickLinkDestination, Function1<? super String, Unit> function1) {
                this.f112887a = localThemeScope;
                this.f112888b = quickLinkDestination;
                this.f112889c = function1;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1977397074, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:502)");
                }
                e.c cVarI = P0.e.INSTANCE.i();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f112887a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f112887a;
                final QuickLinkDestination quickLinkDestination = this.f112888b;
                final Function1<String, Unit> function1 = this.f112889c;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), cVarI, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.k(companion, 0.0f, H1.h.p(16), 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                String activity = quickLinkDestination.getActivity();
                if (activity == null) {
                    activity = quickLinkDestination.getActionCode();
                }
                int i11 = LocalThemeScope.f17314g;
                si.j.h(localThemeScope, label, activity, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                oi.Q q10 = oi.Q.f154116a;
                C.f.i iVar = C.f.i.f17057e;
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
                            return K.a.C1778a.c(function1, quickLinkDestination);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.i(localThemeScope, q10, (Function0) objB, iVar, string, null, false, false, 0L, composer, (oi.Q.f154117b << 3) | i11 | (C.f.i.f17058f << 9), 240);
                composer.v();
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
            public static final Unit c(Function1 function1, QuickLinkDestination quickLinkDestination) {
                function1.invoke(quickLinkDestination.getActionCode());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(List<QuickLinkDestination> list, Function1<? super String, Unit> function1, LocalThemeScope localThemeScope) {
            this.f112884a = list;
            this.f112885b = function1;
            this.f112886c = localThemeScope;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1033009839, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory.<anonymous> (OtherDebugControls.kt:496)");
            }
            List<QuickLinkDestination> list = this.f112884a;
            final Function1<String, Unit> function1 = this.f112885b;
            LocalThemeScope localThemeScope = this.f112886c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
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
                t1.b((Function0) objB, modifierH, false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1977397074, true, new C1778a(localThemeScope, quickLinkDestination, function1), composer2, 54), composer2, 805306416, 508);
                composer2.startReplaceGroup(327088308);
                if (!Intrinsics.e(quickLinkDestination, CollectionsKt.D0(list2))) {
                    C17983Z.a(null, 0L, 0.0f, 0.0f, composer2, 0, 15);
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, QuickLinkDestination quickLinkDestination) {
            function1.invoke(quickLinkDestination.getActionCode());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MeijerUser f112891b;

        b(LocalThemeScope localThemeScope, MeijerUser meijerUser) {
            this.f112890a = localThemeScope;
            this.f112891b = meijerUser;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-484742163, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:88)");
            }
            K.C(this.f112890a, this.f112891b, composer, LocalThemeScope.f17314g);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112893b;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112892a = localThemeScope;
            this.f112893b = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-905257002, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:92)");
            }
            K.k(this.f112892a, K.f112883a, this.f112893b, composer, LocalThemeScope.f17314g);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12630a, Unit> f112896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f112897d;

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, String str, Function1<? super AbstractC12630a, Unit> function1, Context context) {
            this.f112894a = localThemeScope;
            this.f112895b = str;
            this.f112896c = function1;
            this.f112897d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1, Context context, String deepLink, String source) {
            Intrinsics.j(deepLink, "deepLink");
            Intrinsics.j(source, "source");
            function1.invoke(new AbstractC12630a.SendPushNotification(deepLink, source, context));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(AbstractC12630a.c.f112985a);
            return Unit.f143329a;
        }

        public final void c(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(265951669, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:96)");
            }
            LocalThemeScope localThemeScope = this.f112894a;
            String str = this.f112895b;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f112896c) | composer.D(this.f112897d);
            final Function1<AbstractC12630a, Unit> function1 = this.f112896c;
            final Context context = this.f112897d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.debug.L
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return K.d.d(function1, context, (String) obj, (String) obj2);
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f112896c);
            final Function1<AbstractC12630a, Unit> function12 = this.f112896c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K.d.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            K.w(localThemeScope, str, function2, (Function0) objB2, composer, LocalThemeScope.f17314g);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            c(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112899b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112900a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112901b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f112902c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$e$a$a, reason: collision with other inner class name */
            static final class C1779a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112903a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<String, Unit> f112904b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f112905c;

                /* JADX WARN: Multi-variable type inference failed */
                C1779a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
                    this.f112903a = localThemeScope;
                    this.f112904b = function1;
                    this.f112905c = interfaceC5872l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC5872l0 interfaceC5872l0, String it) {
                    Intrinsics.j(it, "it");
                    e.e(interfaceC5872l0, it);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC15153W interfaceC15153W, final Function1 function1, final InterfaceC5872l0 interfaceC5872l0, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), BuildConfig.MEIJER_WEB_BASE_URL);
                    AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Enter Test Universal link");
                    AdsInputField.q0(interfaceC15153W.getIcons().getTrailingIcon(), C.a.C0286C.f16866e, "Test Universal Link", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.e.a.C1779a.g(function1, interfaceC5872l0);
                        }
                    });
                    return Unit.f143329a;
                }

                public final void d(final InterfaceC15153W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(672471302, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:115)");
                    }
                    LocalThemeScope localThemeScope = this.f112903a;
                    String strD = e.d(this.f112905c);
                    q1.f.TextInput textInputF = Cr.f.f(Assemble.getInputFields(), false, false, false, null, 15, null);
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f112905c;
                    Object objB = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.N
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.e.a.C1779a.e(interfaceC5872l0, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function1 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112904b);
                    final Function1<String, Unit> function12 = this.f112904b;
                    final InterfaceC5872l0<String> interfaceC5872l02 = this.f112905c;
                    Object objB2 = composer.B();
                    if (zD || objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.O
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.e.a.C1779a.f(Assemble, function12, interfaceC5872l02, (H1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C2832m0.i(localThemeScope, strD, textInputF, null, function1, (Function1) objB2, composer, LocalThemeScope.f17314g | 24576 | (q1.f.TextInput.f142293m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
                    d(interfaceC15153W, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                    function1.invoke(e.d(interfaceC5872l0));
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f112900a = localThemeScope;
                this.f112901b = function1;
                this.f112902c = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(684968859, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:113)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f112900a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f112900a;
                Function1<String, Unit> function1 = this.f112901b;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f112902c;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                Ki.Q.e(localThemeScope, L0.f141930a, ComposableLambdaKt.c(672471302, true, new C1779a(localThemeScope, function1, interfaceC5872l0), composer, 54), composer, LocalThemeScope.f17314g | 384 | (L0.f141931b << 3));
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                composer.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112898a = localThemeScope;
            this.f112899b = function1;
        }

        public final void c(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1437160340, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:106)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.t1.e("https://www.meijer.com/shopping/search.html?text=banana&sort_order=relevance-descending&discountSalePriceValue=%22-inf%22-%225%22&healthAndWellnessValues=Organic", null, 2, null);
                composer.t(objB);
            }
            composer.P();
            Tj.f.c(this.f112898a, "Test Universal Links", null, K.L(), false, null, ComposableLambdaKt.c(684968859, true, new a(this.f112898a, this.f112899b, (InterfaceC5872l0) objB), composer, 54), composer, LocalThemeScope.f17314g | 1572912, 26);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            c(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f112907b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112908a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f112909b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$f$a$a, reason: collision with other inner class name */
            static final class C1780a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112910a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<String, Unit> f112911b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f112912c;

                /* JADX WARN: Multi-variable type inference failed */
                C1780a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
                    this.f112910a = localThemeScope;
                    this.f112911b = function1;
                    this.f112912c = interfaceC5872l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function1 function1, String it) {
                    Intrinsics.j(it, "it");
                    function1.invoke(it);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC15153W interfaceC15153W, final Function1 function1, final InterfaceC5872l0 interfaceC5872l0, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "com.meijer.mobile.androidacres.showcase.demo");
                    AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Enter Action Code");
                    AdsInputField.f(interfaceC15153W.getLabels().getDescription(), "Refer to the <action> tag for the target Activity in the AndroidManifest.xml file.");
                    AdsInputField.q0(interfaceC15153W.getIcons().getTrailingIcon(), C.a.C0286C.f16866e, "Launch Activity", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.T
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.f.a.C1780a.g(function1, interfaceC5872l0);
                        }
                    });
                    return Unit.f143329a;
                }

                public final void d(final InterfaceC15153W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1843679973, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:149)");
                    }
                    LocalThemeScope localThemeScope = this.f112910a;
                    String strC = a.c(this.f112912c);
                    if (StringsKt.s0(strC)) {
                        strC = null;
                    }
                    if (strC == null) {
                        strC = "com.meijer.mobile.";
                    }
                    String str = strC;
                    q1.f.TextInput textInputF = Cr.f.f(Assemble.getInputFields(), false, false, false, null, 15, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f112911b);
                    final Function1<String, Unit> function1 = this.f112911b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.f.a.C1780a.e(function1, (String) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function12 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(-1746271574);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112911b);
                    final Function1<String, Unit> function13 = this.f112911b;
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f112912c;
                    Object objB2 = composer.B();
                    if (zD || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.S
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.f.a.C1780a.f(Assemble, function13, interfaceC5872l0, (H1) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    C2832m0.i(localThemeScope, str, textInputF, null, function12, (Function1) objB2, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
                    d(interfaceC15153W, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                    function1.invoke(a.c(interfaceC5872l0));
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
                this.f112908a = localThemeScope;
                this.f112909b = function1;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1856177530, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:141)");
                }
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.t1.e("", null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                composer.P();
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f112908a.getAdsSpacing().getFive().getDp(), this.f112908a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112908a;
                Function1<String, Unit> function1 = this.f112909b;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                Ki.Q.e(localThemeScope, L0.f141930a, ComposableLambdaKt.c(1843679973, true, new C1780a(localThemeScope, function1, interfaceC5872l0), composer, 54), composer, LocalThemeScope.f17314g | 384 | (L0.f141931b << 3));
                composer.v();
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
            public static final String c(InterfaceC5872l0<String> interfaceC5872l0) {
                return interfaceC5872l0.getValue();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, Function1<? super String, Unit> function1) {
            this.f112906a = localThemeScope;
            this.f112907b = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1686598285, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:137)");
            }
            Tj.f.c(this.f112906a, "Launch Activity by Action", null, K.L(), false, null, ComposableLambdaKt.c(1856177530, true, new a(this.f112906a, this.f112907b), composer, 54), composer, LocalThemeScope.f17314g | 1572912, 26);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112913a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC12630a, Unit> f112914b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112915a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC12630a, Unit> f112916b;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, Function1<? super AbstractC12630a, Unit> function1) {
                this.f112915a = localThemeScope;
                this.f112916b = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1) {
                function1.invoke(AbstractC12630a.b.f112984a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function1 function1) {
                function1.invoke(new AbstractC12630a.Throw(new UserNotAuthenticatedException("Thrown from debug menu")));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function1 function1) {
                function1.invoke(AbstractC12630a.C1782a.f112983a);
                return Unit.f143329a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1267581095, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:181)");
                }
                LocalThemeScope localThemeScope = this.f112915a;
                final Function1<AbstractC12630a, Unit> function1 = this.f112916b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.U
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.g.a.e(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                K.m(localThemeScope, null, "Force Logout", "Will trigger a forced logout scenario as if getToken() would throw a UserNotAuthenticatedException.", (Function0) objB, composer, i11 | 3456, 1);
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function1);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.V
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.g.a.f(function1);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                K.m(localThemeScope, null, "Throw UNAException", "Throws a `UserNotAuthenticatedException` as if it were thrown from somewhere other than the authenticator.", (Function0) objB2, composer, i11 | 3456, 1);
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.W
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.g.a.g(function1);
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
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(LocalThemeScope localThemeScope, Function1<? super AbstractC12630a, Unit> function1) {
            this.f112913a = localThemeScope;
            this.f112914b = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-515389614, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControls.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:177)");
            }
            Tj.f.c(this.f112913a, "Trigger Error States", null, K.L(), false, null, ComposableLambdaKt.c(-1267581095, true, new a(this.f112913a, this.f112914b), composer, 54), composer, LocalThemeScope.f17314g | 1572912, 26);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112918b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f112919c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f112920d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6026q0 f112921e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f112922f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f112923g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112924a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f112925b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f112924a = localThemeScope;
                this.f112925b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(445191437, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PropertyField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:284)");
                }
                LocalThemeScope localThemeScope = this.f112924a;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, 1, localThemeScope.getAdsTypography().getBody().getOne(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null), this.f112925b, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.OtherDebugControlsKt$PropertyField$1$1$1$2$1$1", f = "OtherDebugControls.kt", l = {HttpResponseStatus.REDIRECTION_FOUND}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112926a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6026q0 f112927b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f112928c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f112929d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f112930e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6026q0 interfaceC6026q0, String str, String str2, Context context, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f112927b = interfaceC6026q0;
                this.f112928c = str;
                this.f112929d = str2;
                this.f112930e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f112927b, this.f112928c, this.f112929d, this.f112930e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112926a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC6026q0 interfaceC6026q0 = this.f112927b;
                    ClipData clipDataNewPlainText = ClipData.newPlainText(this.f112928c, this.f112929d);
                    Intrinsics.i(clipDataNewPlainText, "newPlainText(...)");
                    C6023p0 c6023p0 = new C6023p0(clipDataNewPlainText);
                    this.f112926a = 1;
                    if (interfaceC6026q0.b(c6023p0, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f143329a;
                Toast.makeText(this.f112930e, "Copied to clipboard", 0).show();
                return Unit.f143329a;
            }
        }

        h(LocalThemeScope localThemeScope, String str, boolean z10, InterfaceC6172s interfaceC6172s, InterfaceC6026q0 interfaceC6026q0, String str2, Context context) {
            this.f112917a = localThemeScope;
            this.f112918b = str;
            this.f112919c = z10;
            this.f112920d = interfaceC6172s;
            this.f112921e = interfaceC6026q0;
            this.f112922f = str2;
            this.f112923g = context;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(737744144, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PropertyField.<anonymous> (OtherDebugControls.kt:272)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112917a.getAdsSpacing().getFive().getDp(), this.f112917a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f112917a;
            final String str = this.f112918b;
            boolean z10 = this.f112919c;
            final InterfaceC6172s interfaceC6172s = this.f112920d;
            final InterfaceC6026q0 interfaceC6026q0 = this.f112921e;
            final String str2 = this.f112922f;
            final Context context = this.f112923g;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, label, str, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C17808x.a(InterfaceC14888I.b(c14889j, companion, 5.0f, false, 2, null), ComposableLambdaKt.c(445191437, true, new a(localThemeScope, str2), composer, 54), composer, 48, 0);
            composer.startReplaceGroup(-460849779);
            if (z10) {
                C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                oi.N n10 = oi.N.f153988a;
                C.b.h.g gVar = C.b.h.g.f17013e;
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(interfaceC6172s) | composer.D(interfaceC6026q0) | composer.V(str) | composer.V(str2) | composer.D(context);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    Object obj = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.X
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.h.c(interfaceC6172s, interfaceC6026q0, str, str2, context);
                        }
                    };
                    composer.t(obj);
                    objB = obj;
                }
                composer.P();
                P0.i(localThemeScope, n10, (Function0) objB, gVar, "Copy to Clipboard", null, false, false, 0L, composer, i11 | 24576 | (oi.N.f153989b << 3) | (C.b.h.g.f17014f << 9), 240);
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC6172s interfaceC6172s, InterfaceC6026q0 interfaceC6026q0, String str, String str2, Context context) {
            C15809k.d(C6173t.a(interfaceC6172s), null, null, new b(interfaceC6026q0, str, str2, context, null), 3, null);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112932b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f112933c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<String, String, Unit> f112934d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f112935e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f112936f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112937a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f112938b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f112937a = localThemeScope;
                this.f112938b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(273672366, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:391)");
                }
                LocalThemeScope localThemeScope = this.f112937a;
                String str = this.f112938b;
                K.u(localThemeScope, "FCM Token", str == null ? "Not Available" : str, null, !(str == null || StringsKt.s0(str)), composer, LocalThemeScope.f17314g | 48, 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112939a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f112940b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<String, String, Unit> f112941c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f112942d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f112943a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112944b;

                a(InterfaceC5872l0<String> interfaceC5872l0, LocalThemeScope localThemeScope) {
                    this.f112943a = interfaceC5872l0;
                    this.f112944b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(boolean z10, InterfaceC15139H interfaceC15139H, String str, o1 AdsChip) {
                    Intrinsics.j(AdsChip, "$this$AdsChip");
                    AdsChip.d(z10 ? interfaceC15139H.getLabels().getEnabledSelectedLabel() : interfaceC15139H.getLabels().getEnabledRestingLabel(), str);
                    return Unit.f143329a;
                }

                public final void c(final InterfaceC15139H Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(669718156, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:406)");
                    }
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f112943a;
                    LocalThemeScope localThemeScope = this.f112944b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyB, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14889J c14889j = C14889J.f139620a;
                    composer.startReplaceGroup(771940314);
                    for (final String str : CollectionsKt.p("Emarsys", "Adobe")) {
                        composer.startReplaceGroup(771942826);
                        final boolean zE = Intrinsics.e(str, K.z(interfaceC5872l0));
                        ChipButtons chipButtonsD = Assemble.getButtons();
                        q1.d.ChipButton enabledSelected = zE ? chipButtonsD.getEnabledSelected() : chipButtonsD.getEnabledResting();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(str);
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return K.i.b.a.d(str, interfaceC5872l0);
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
                            objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.Z
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return K.i.b.a.e(zE, Assemble, str, (o1) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Composer composer2 = composer;
                        C16185n1.h(localThemeScope, null, function0, enabledSelected, (Function1) objB2, composer2, LocalThemeScope.f17314g | (q1.d.ChipButton.f142195k << 9), 1);
                        C14890K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
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
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
                    c(interfaceC15139H, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(String str, InterfaceC5872l0 interfaceC5872l0) {
                    K.A(interfaceC5872l0, str);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$i$b$b, reason: collision with other inner class name */
            static final class C1781b implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112945a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14902f f112946b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function2<String, String, Unit> f112947c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f112948d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f112949e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.K$i$b$b$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112950a;

                    a(LocalThemeScope localThemeScope) {
                        this.f112950a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1120963770, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:451)");
                        }
                        si.j.h(this.f112950a, new q1.Label(null, null, null, null, 0, false, 0, this.f112950a.getAdsTypography().getBodyCompact().getTwo(), null, 383, null), "Note: If you don't see a test notification, check App Settings for Meijer and ensure that notifications are enabled.", null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                /* JADX WARN: Multi-variable type inference failed */
                C1781b(LocalThemeScope localThemeScope, InterfaceC14902f interfaceC14902f, Function2<? super String, ? super String, Unit> function2, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
                    this.f112945a = localThemeScope;
                    this.f112946b = interfaceC14902f;
                    this.f112947c = function2;
                    this.f112948d = interfaceC5872l0;
                    this.f112949e = interfaceC5872l02;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final q1.f.TextInput f(InterfaceC14902f interfaceC14902f, q1.f.TextInput it) {
                    Intrinsics.j(it, "it");
                    return q1.f.TextInput.y(it, InterfaceC14902f.b(interfaceC14902f, it.getModifier(), 5.0f, false, 2, null), false, null, null, null, null, null, false, 0, null, null, null, 4094, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String it) {
                    Intrinsics.j(it, "it");
                    K.y(interfaceC5872l0, it);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(InterfaceC15153W interfaceC15153W, final Function2 function2, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5872l0 interfaceC5872l02, LocalThemeScope localThemeScope, H1 AdsInputField) {
                    Intrinsics.j(AdsInputField, "$this$AdsInputField");
                    AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), "meijerapp://");
                    AdsInputField.d(interfaceC15153W.getLabels().getLabel(), "Enter Test Deeplink");
                    AdsInputField.q0(interfaceC15153W.getIcons().getTrailingIcon(), C.a.C0286C.f16866e, "Copy to Clipboard", new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.i.b.C1781b.l(function2, interfaceC5872l0, interfaceC5872l02);
                        }
                    });
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getInformationBlock(), ComposableLambdaKt.composableLambdaInstance(-1120963770, true, new a(localThemeScope)));
                    return Unit.f143329a;
                }

                public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-10810891, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:429)");
                    }
                    LocalThemeScope localThemeScope = this.f112945a;
                    String strX = K.x(this.f112948d);
                    if (StringsKt.s0(strX)) {
                        strX = null;
                    }
                    if (strX == null) {
                        strX = "meijerapp://";
                    }
                    String str = strX;
                    DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f112946b);
                    final InterfaceC14902f interfaceC14902f = this.f112946b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.i.b.C1781b.f(interfaceC14902f, (q1.f.TextInput) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, false, false, false, (Function1) objB, 7, null);
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f112948d;
                    Object objB2 = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB2 == companion.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.b0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.i.b.C1781b.g(interfaceC5872l0, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function1 function1 = (Function1) objB2;
                    composer.P();
                    composer.startReplaceGroup(-1224400529);
                    boolean zD = composer.D(Assemble) | composer.V(this.f112947c) | composer.D(this.f112945a);
                    final Function2<String, String, Unit> function2 = this.f112947c;
                    final InterfaceC5872l0<String> interfaceC5872l02 = this.f112948d;
                    final InterfaceC5872l0<String> interfaceC5872l03 = this.f112949e;
                    final LocalThemeScope localThemeScope2 = this.f112945a;
                    Object objB3 = composer.B();
                    if (zD || objB3 == companion.a()) {
                        Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return K.i.b.C1781b.k(Assemble, function2, interfaceC5872l02, interfaceC5872l03, localThemeScope2, (H1) obj);
                            }
                        };
                        composer.t(function12);
                        objB3 = function12;
                    }
                    composer.P();
                    C2832m0.i(localThemeScope, str, textInputF, null, function1, (Function1) objB3, composer, LocalThemeScope.f17314g | 24576 | (q1.f.TextInput.f142293m << 6), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
                    e(interfaceC15153W, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
                    function2.invoke(K.x(interfaceC5872l0), K.z(interfaceC5872l02));
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, Function2<? super String, ? super String, Unit> function2, InterfaceC5872l0<String> interfaceC5872l02) {
                this.f112939a = localThemeScope;
                this.f112940b = interfaceC5872l0;
                this.f112941c = function2;
                this.f112942d = interfaceC5872l02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(50586583, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:399)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112939a.getAdsSpacing().getFive().getDp(), this.f112939a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112939a;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f112940b;
                Function2<String, String, Unit> function2 = this.f112941c;
                InterfaceC5872l0<String> interfaceC5872l02 = this.f112942d;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                InterfaceC15205y.a.C2257a c2257a = InterfaceC15205y.a.C2257a.f142541a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(669718156, true, new a(interfaceC5872l0, localThemeScope), composer, 54);
                int i11 = LocalThemeScope.f17314g;
                Ki.Q.e(localThemeScope, c2257a, composableLambdaC, composer, i11 | 384 | (InterfaceC15205y.a.C2257a.f142542b << 3));
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                Ki.Q.e(localThemeScope, L0.f141930a, ComposableLambdaKt.c(-10810891, true, new C1781b(localThemeScope, c14903g, function2, interfaceC5872l02, interfaceC5872l0), composer, 54), composer, i11 | 384 | (L0.f141931b << 3));
                composer.v();
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f112951a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f112952b;

            c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f112951a = localThemeScope;
                this.f112952b = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1905560330, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous>.<anonymous>.<anonymous> (OtherDebugControls.kt:463)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f112951a.getAdsSpacing().getFive().getDp(), this.f112951a.getAdsSpacing().getThree().getDp());
                LocalThemeScope localThemeScope = this.f112951a;
                Function0<Unit> function0 = this.f112952b;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 383, null);
                int i11 = LocalThemeScope.f17314g;
                si.j.h(localThemeScope, label, "If you are experiencing issues with push notifications, try resetting the registration.", null, composer, i11 | 384 | (q1.Label.f142335j << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                P0.h(localThemeScope, C16171j.f154177a, function0, C.a.y.f16910e, "Reset Emarsys Registration", null, null, true, false, false, 0L, composer, 12607488 | i11 | (C16171j.f154178b << 3) | (C.a.y.f16911f << 9), 0, 944);
                composer.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, String str, InterfaceC5872l0<String> interfaceC5872l0, Function2<? super String, ? super String, Unit> function2, InterfaceC5872l0<String> interfaceC5872l02, Function0<Unit> function0) {
            this.f112931a = localThemeScope;
            this.f112932b = str;
            this.f112933c = interfaceC5872l0;
            this.f112934d = function2;
            this.f112935e = interfaceC5872l02;
            this.f112936f = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961755047, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard.<anonymous> (OtherDebugControls.kt:389)");
            }
            LocalThemeScope localThemeScope = this.f112931a;
            String str = this.f112932b;
            InterfaceC5872l0<String> interfaceC5872l0 = this.f112933c;
            Function2<String, String, Unit> function2 = this.f112934d;
            InterfaceC5872l0<String> interfaceC5872l02 = this.f112935e;
            Function0<Unit> function0 = this.f112936f;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C18051y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(273672366, true, new a(localThemeScope, str), composer, 54), composer, 1572864, 63);
            C18051y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(50586583, true, new b(localThemeScope, interfaceC5872l0, function2, interfaceC5872l02), composer, 54), composer, 1572864, 63);
            C18051y.a(null, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.c(-1905560330, true, new c(localThemeScope, function0), composer, 54), composer, 1572864, 63);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f112953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MeijerUser f112954b;

        j(LocalThemeScope localThemeScope, MeijerUser meijerUser) {
            this.f112953a = localThemeScope;
            this.f112954b = meijerUser;
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
                ComposerKt.U(-2136109494, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.UserDetailsCard.<anonymous> (OtherDebugControls.kt:214)");
            }
            LocalThemeScope localThemeScope = this.f112953a;
            MeijerUser meijerUser = this.f112954b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            String str = (meijerUser == null || (externalShopperId = meijerUser.getExternalShopperId()) == null) ? "Not Available" : externalShopperId;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String externalShopperId2 = meijerUser != null ? meijerUser.getExternalShopperId() : null;
            boolean z10 = !(externalShopperId2 == null || StringsKt.s0(externalShopperId2));
            int i11 = LocalThemeScope.f17314g;
            K.u(localThemeScope, "External Shopper ID", str, modifierH, z10, composer, i11 | 3120, 0);
            String str2 = (meijerUser == null || (email = meijerUser.getEmail()) == null) ? "Not Available" : email;
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String email2 = meijerUser != null ? meijerUser.getEmail() : null;
            K.u(localThemeScope, "Email", str2, modifierH2, !(email2 == null || StringsKt.s0(email2)), composer, i11 | 3120, 0);
            String str3 = (meijerUser == null || (firstName = meijerUser.getFirstName()) == null) ? "Not Available" : firstName;
            Modifier modifierH3 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String firstName2 = meijerUser != null ? meijerUser.getFirstName() : null;
            K.u(localThemeScope, "First Name", str3, modifierH3, !(firstName2 == null || StringsKt.s0(firstName2)), composer, i11 | 3120, 0);
            String str4 = (meijerUser == null || (lastName = meijerUser.getLastName()) == null) ? "Not Available" : lastName;
            Modifier modifierH4 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String lastName2 = meijerUser != null ? meijerUser.getLastName() : null;
            K.u(localThemeScope, "Last Name", str4, modifierH4, !(lastName2 == null || StringsKt.s0(lastName2)), composer, i11 | 3120, 0);
            String str5 = (meijerUser == null || (userPhone = meijerUser.getUserPhone()) == null || (strA = Gk.a.f13085a.a(userPhone)) == null) ? "Not Available" : strA;
            Modifier modifierH5 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String userPhone2 = meijerUser != null ? meijerUser.getUserPhone() : null;
            K.u(localThemeScope, "Phone", str5, modifierH5, !(userPhone2 == null || StringsKt.s0(userPhone2)), composer, i11 | 3120, 0);
            String currentSession = FS.getCurrentSession();
            String str6 = currentSession == null ? "Not Available" : currentSession;
            Modifier modifierH6 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            String currentSession2 = FS.getCurrentSession();
            K.u(localThemeScope, "FS Session", str6, modifierH6, !(currentSession2 == null || StringsKt.s0(currentSession2)), composer, i11 | 3120, 0);
            composer.v();
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
    public static final InterfaceC14882C L() {
        return androidx.compose.foundation.layout.D.a(H1.h.p(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, String str, Function2 function2, Function0 function0, int i10, Composer composer, int i11) {
        w(localThemeScope, str, function2, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, MeijerUser meijerUser, int i10, Composer composer, int i11) {
        C(localThemeScope, meijerUser, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
                ComposerKt.U(-905268872, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DestinationsDirectory (OtherDebugControls.kt:494)");
            }
            localThemeScope2 = localThemeScope;
            Tj.f.c(localThemeScope2, "Quick-Link Destinations", null, L(), false, null, ComposableLambdaKt.c(-1033009839, true, new a(destinations, onNavigateToAction, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f17314g | (i11 & 14), 26);
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
        return Unit.f143329a;
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
    public static final void m(final Ki.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final java.lang.String r36, java.lang.String r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.m(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, str, str2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r22, final yo.MeijerUser r23, final java.lang.String r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r27, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.settings.debug.AbstractC12630a, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.o(Ki.M, yo.c, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(AbstractC12630a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, MeijerUser meijerUser, Function1 function1, String str, Function1 function12, Context context, Function1 function13, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-484742163, true, new b(localThemeScope, meijerUser)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-905257002, true, new c(localThemeScope, function1)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(265951669, true, new d(localThemeScope, str, function12, context)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1437160340, true, new e(localThemeScope, function13)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1686598285, true, new f(localThemeScope, function1)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-515389614, true, new g(localThemeScope, function12)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, MeijerUser meijerUser, String str, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, meijerUser, str, modifier, function1, function12, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void u(final Ki.LocalThemeScope r21, final java.lang.String r22, final java.lang.String r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.K.u(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, boolean z10, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, str, str2, modifier, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
                ComposerKt.U(-736154802, i12, -1, "com.meijer.mobile.meijer.activity.settings.debug.PushNotificationsCard (OtherDebugControls.kt:384)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e("", null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e("Emarsys", null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Tj.f.c(localThemeScope, "Push Notifications", null, L(), false, null, ComposableLambdaKt.c(1961755047, true, new i(localThemeScope, str, (InterfaceC5872l0) objB2, onSendPushNotification, interfaceC5872l0, onResetPushRegistration), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f17314g | (i12 & 14), 26);
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
    public static final void A(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
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
                ComposerKt.U(-498766031, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.UserDetailsCard (OtherDebugControls.kt:212)");
            }
            localThemeScope2 = localThemeScope;
            Tj.f.c(localThemeScope2, "User Info", null, L(), false, null, ComposableLambdaKt.c(-2136109494, true, new j(localThemeScope, meijerUser), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912 | LocalThemeScope.f17314g | (i11 & 14), 26);
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
    public static final String x(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }
}

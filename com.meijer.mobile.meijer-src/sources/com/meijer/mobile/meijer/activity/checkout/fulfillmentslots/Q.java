package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Cm.FulfillmentPartnerDecorator;
import Cm.FulfillmentSlotDayDecorator;
import Cm.FulfillmentSlotErrorDecorator;
import Cm.FulfillmentSlotTimeDecorator;
import F1.j;
import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11978l;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11980m;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import d0.C13590y;
import dk.C13698b;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ki.InterfaceC15148Q;
import ki.InterfaceC15154X;
import ki.InterfaceC15160b0;
import ki.q1;
import ki.s1;
import kotlin.C17983Z;
import kotlin.FontWeight;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import l0.C15429A;
import l0.InterfaceC15433c;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import r1.C16819m;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001as\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a5\u0010\u001f\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b!\u0010\u0017\u001a`\u0010(\u001a\u00020\u000b*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b(\u0010)\u001aK\u0010,\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010+\u001a\u00020*2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b,\u0010-\u001a%\u00100\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0003¢\u0006\u0004\b0\u00101\u001a%\u00104\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105\u001a!\u00108\u001a\b\u0012\u0004\u0012\u000207062\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b8\u00109\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "isEditMode", "isBopasEnabled", "isBunchaEnabled", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "onAction", "Lkotlin/Function0;", "onInformationButtonClick", "updateActivityExtra", "P", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isSinglePageCheckout", "content", "a0", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "k0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Landroidx/compose/runtime/Composer;II)V", "G", "(LKi/M;ZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "formattedString", "", "x0", "(Lbk/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "B", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Y", "LCm/m;", "dayDecorator", "Lkotlin/ParameterName;", "name", "isSelected", "onSelectedDay", "K", "(LKi/M;LCm/m;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;", "slotItem", "e0", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;", "headerItem", "V", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;", "footerItem", "E", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m;", "w0", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)Ljava/util/List;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "a", "Ljava/util/List;", "pickupOptions", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final List<G1> f103574a = CollectionsKt.p(G1.a.f103503a, G1.b.f103504a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f103576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f103577c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a, reason: collision with other inner class name */
        static final class C1458a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f103579b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<q1.g, Unit> f103580c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a$a, reason: collision with other inner class name */
            static final class C1459a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f103581a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15148Q f103582b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f103583c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function1<q1.g, Unit> f103584d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a$a$a, reason: collision with other inner class name */
                static final class C1460a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f103585a;

                    C1460a(LocalThemeScope localThemeScope) {
                        this.f103585a = localThemeScope;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1943743478, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:447)");
                        }
                        LocalThemeScope localThemeScope = this.f103585a;
                        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f103585a.getAdsTypography().getBody().getOne().g(FontWeight.INSTANCE.f()), null, 383, null);
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100513K6, composer, 0);
                        int i11 = LocalThemeScope.f17314g;
                        int i12 = q1.Label.f142335j;
                        si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        si.j.h(this.f103585a, new q1.Label(null, null, null, null, 0, false, 0, this.f103585a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(com.meijer.mobile.meijer.Y.f100494J6, composer, 0), null, composer, i11 | (i12 << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        a(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1459a(LocalThemeScope localThemeScope, InterfaceC15148Q interfaceC15148Q, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super q1.g, Unit> function1) {
                    this.f103581a = localThemeScope;
                    this.f103582b = interfaceC15148Q;
                    this.f103583c = interfaceC5872l0;
                    this.f103584d = function1;
                }

                public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(166052544, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:434)");
                    }
                    LocalThemeScope localThemeScope = this.f103581a;
                    q1.s.Checkbox trailingToggleButton = this.f103582b.getToggleButtons().getTrailingToggleButton();
                    boolean zBooleanValue = this.f103583c.getValue().booleanValue();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f103584d);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f103583c;
                    final Function1<q1.g, Unit> function1 = this.f103584d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.P
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Q.a.C1458a.C1459a.c(interfaceC5872l0, function1, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    int i11 = LocalThemeScope.f17314g;
                    wi.s.b(localThemeScope, trailingToggleButton, zBooleanValue, false, false, (Function1) objB, composer, i11 | (q1.s.Checkbox.f142428e << 3), 12);
                    C16453n.e(this.f103581a, this.f103582b.getContainers().getList(), ComposableLambdaKt.c(-1943743478, true, new C1460a(this.f103581a), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    b(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0, Function1 function1, boolean z10) {
                    interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                    function1.invoke(new q1.g.SetEarlyDeliveryAction(((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1458a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super q1.g, Unit> function1) {
                this.f103578a = localThemeScope;
                this.f103579b = interfaceC5872l0;
                this.f103580c = function1;
            }

            public final void b(InterfaceC15148Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1229250944, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:415)");
                }
                LocalThemeScope localThemeScope = this.f103578a;
                q1.Row item = Assemble.getContainers().getItem();
                Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f103578a.getAdsSpacing().getFive().getDp()), true, null, 2, null);
                boolean zBooleanValue = this.f103579b.getValue().booleanValue();
                Role roleJ = Role.j(Role.INSTANCE.c());
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f103580c);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f103579b;
                final Function1<q1.g, Unit> function1 = this.f103580c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Q.a.C1458a.c(interfaceC5872l0, function1, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C16453n.i(localThemeScope, q1.Row.y(item, ToggleableKt.c(modifierB, zBooleanValue, false, roleJ, (Function1) objB, 2, null), null, null, 6, null), ComposableLambdaKt.c(166052544, true, new C1459a(this.f103578a, Assemble, this.f103579b, this.f103580c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                b(interfaceC15148Q, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5872l0 interfaceC5872l0, Function1 function1, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                function1.invoke(new q1.g.SetEarlyDeliveryAction(((Boolean) interfaceC5872l0.getValue()).booleanValue()));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super q1.g, Unit> function1) {
            this.f103575a = localThemeScope;
            this.f103576b = interfaceC5872l0;
            this.f103577c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(342798524, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous> (FulfillmentScreenRedesigned.kt:414)");
            }
            LocalThemeScope localThemeScope = this.f103575a;
            Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(-1229250944, true, new C1458a(localThemeScope, this.f103576b, this.f103577c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (s1.b.f142452b << 3));
            C17983Z.a(null, this.f103575a.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
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
    static final class b implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f103586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15429A f103587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103588c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentScreenRedesignedKt$FulfillmentDays$2$1$1$1$1$1$1", f = "FulfillmentScreenRedesigned.kt", l = {369}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f103589a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15429A f103590b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f103591c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f103590b, this.f103591c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15429A c15429a, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f103590b = c15429a;
                this.f103591c = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f103589a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15429A c15429a = this.f103590b;
                    int i11 = this.f103591c;
                    this.f103589a = 1;
                    if (C15429A.l(c15429a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        b(InterfaceC15783O interfaceC15783O, C15429A c15429a, int i10) {
            this.f103586a = interfaceC15783O;
            this.f103587b = c15429a;
            this.f103588c = i10;
        }

        public final void a(boolean z10) {
            if (z10) {
                C15809k.d(this.f103586a, null, null, new a(this.f103587b, this.f103588c, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f103592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f103592f = list;
        }

        public final Object a(int i10) {
            this.f103592f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f103593f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103594g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f103595h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f103596i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15429A f103597j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC15783O interfaceC15783O, C15429A c15429a) {
            super(4);
            this.f103593f = list;
            this.f103594g = localThemeScope;
            this.f103595h = function1;
            this.f103596i = interfaceC15783O;
            this.f103597j = c15429a;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) this.f103593f.get(i10);
            composer.startReplaceGroup(672937765);
            LocalThemeScope localThemeScope = this.f103594g;
            Function1 function1 = this.f103595h;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f103596i) | composer.V(this.f103597j) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f103596i, this.f103597j, i10);
                composer.t(objB);
            }
            composer.P();
            Q.K(localThemeScope, fulfillmentSlotDayDecorator, null, function1, (Function1) objB, composer, LocalThemeScope.f17314g, 2);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f103598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103599b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotDayDecorator f103600c;

        e(String str, LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
            this.f103598a = str;
            this.f103599b = localThemeScope;
            this.f103600c = fulfillmentSlotDayDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-437371711, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsDayItem.<anonymous> (FulfillmentScreenRedesigned.kt:577)");
            }
            C5800d.f fVarB = C5800d.f48779a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f103598a);
            final String str = this.f103598a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Q.e.c(str, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(C16819m.d(companion, false, (Function1) objB, 1, null), this.f103599b.getAdsSpacing().getFive().getDp(), this.f103599b.getAdsSpacing().getFour().getDp());
            LocalThemeScope localThemeScope = this.f103599b;
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = this.f103600c;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.I iD = !fulfillmentSlotDayDecorator.K() ? localThemeScope.getAdsTypography().getHeadings().getSeven().d(localThemeScope.getAdsColors().getAdsColorsDisabled()) : localThemeScope.getAdsTypography().getHeadings().getSeven();
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, iD, null, 375, null);
            String strC = fulfillmentSlotDayDecorator.C();
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, !fulfillmentSlotDayDecorator.K() ? localThemeScope.getAdsTypography().getBody().getTwo().d(localThemeScope.getAdsColors().getAdsColorsDisabled()) : localThemeScope.getAdsTypography().getBody().getTwo(), null, 375, null), fulfillmentSlotDayDecorator.E(), null, composer, i11 | (i12 << 3), 4);
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
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f103601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103602b;

        f(boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f103601a = z10;
            this.f103602b = fulfillmentSlotsViewState;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-944566218, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:119)");
            }
            boolean z10 = this.f103601a;
            FulfillmentSlotsViewState fulfillmentSlotsViewState = this.f103602b;
            Bm.A.c(z10, fulfillmentSlotsViewState != null ? fulfillmentSlotsViewState.getCheckoutFlowState() : null, false, composer, 0, 4);
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
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103603a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f103605c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103606d;

        /* JADX WARN: Multi-variable type inference failed */
        g(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1<? super q1.g, Unit> function1, Function0<Unit> function0) {
            this.f103603a = fulfillmentSlotsViewState;
            this.f103604b = localThemeScope;
            this.f103605c = function1;
            this.f103606d = function0;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1366075333, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:127)");
            }
            List<FulfillmentPartnerDecorator> listE = this.f103603a.E();
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100834b3, composer, 0);
            LocalThemeScope localThemeScope = this.f103604b;
            Function1<q1.g, Unit> function1 = this.f103605c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f103606d);
            final Function0<Unit> function0 = this.f103606d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.T
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Q.g.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C11960e.c(localThemeScope, strC, listE, null, false, function1, (Function0) objB, composer, LocalThemeScope.f17314g, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f103608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103609c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103610d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f103611e;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0<Unit> function0, Function1<? super q1.g, Unit> function1) {
            this.f103607a = localThemeScope;
            this.f103608b = z10;
            this.f103609c = fulfillmentSlotsViewState;
            this.f103610d = function0;
            this.f103611e = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1417789604, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:143)");
            }
            Q.a0(this.f103607a, null, false, this.f103608b, this.f103609c, this.f103610d, this.f103611e, null, composer, LocalThemeScope.f17314g, 67);
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
    static final class i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103613b;

        i(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f103612a = localThemeScope;
            this.f103613b = fulfillmentSlotsViewState;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(item) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1533844001, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:152)");
            }
            Q.Y(this.f103612a, InterfaceC15433c.f(item, Modifier.INSTANCE, 0.0f, 1, null), this.f103613b, composer, LocalThemeScope.f17314g, 0);
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
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103615b;

        j(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f103614a = localThemeScope;
            this.f103615b = fulfillmentSlotsViewState;
        }

        public final void a(Composer composer, int i10) {
            AbstractC11978l.Error error;
            AbstractC11978l.Error error2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-654574894, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:493)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f103614a.getAdsSpacing().getEight().getDp(), this.f103614a.getAdsSpacing().getFive().getDp());
            C5800d.f fVarB = C5800d.f48779a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f103614a;
            FulfillmentSlotsViewState fulfillmentSlotsViewState = this.f103615b;
            MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C13590y.a(C16335d.c(com.meijer.mobile.meijer.S.f99583h0, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Ki.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 375, null);
            AbstractC6392a errorTitle = (fulfillmentSlotsViewState == null || (error2 = (AbstractC11978l.Error) fulfillmentSlotsViewState.getErrorState()) == null) ? null : error2.getErrorTitle();
            composer.startReplaceGroup(1686471966);
            String strB = errorTitle == null ? null : errorTitle.b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            composer.P();
            String str = strB == null ? "" : strB;
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            q1.Label label2 = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 375, null);
            AbstractC6392a errorDescription = (fulfillmentSlotsViewState == null || (error = (AbstractC11978l.Error) fulfillmentSlotsViewState.getErrorState()) == null) ? null : error.getErrorDescription();
            composer.startReplaceGroup(1686488183);
            String strA = errorDescription != null ? C13698b.a(errorDescription, composer, AbstractC6392a.f60445b) : null;
            composer.P();
            si.j.h(localThemeScope, label2, strA == null ? "" : strA, null, composer, i11 | (i12 << 3), 4);
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
    static final class k implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f103616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103617b;

        k(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f103616a = modifier;
            this.f103617b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1261855885, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous> (FulfillmentScreenRedesigned.kt:534)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f103617b, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(this.f103616a, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103618a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f103619b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f103620c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f103621d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f103622e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f103623f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103624g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103625a;

            a(LocalThemeScope localThemeScope) {
                this.f103625a = localThemeScope;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(809401728, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.PickupOptionSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:264)");
                }
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100968hh, composer, 0);
                Di.j.i(this.f103625a, null, C16338g.c(com.meijer.mobile.meijer.Y.f100948gh, composer, 0), strC, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
                a(interfaceC15160b0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z11, Function1<? super q1.g, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0) {
            this.f103618a = localThemeScope;
            this.f103619b = z10;
            this.f103620c = fulfillmentSlotsViewState;
            this.f103621d = z11;
            this.f103622e = function1;
            this.f103623f = function2;
            this.f103624g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, G1 g12, boolean z10) {
            function1.invoke(new q1.g.SetPickupOption(g12));
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x027a A[PHI: r10
          0x027a: PHI (r10v10 ??) = (r10v26 ??), (r10v24 ?? I:??[boolean, int, float, short, byte, char]) binds: [B:66:0x0278, B:59:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r10v24 */
        /* JADX WARN: Type inference failed for: r10v26 */
        /* JADX WARN: Type inference failed for: r11v7, types: [androidx.compose.ui.Modifier] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(androidx.compose.runtime.Composer r30, int r31) {
            /*
                Method dump skipped, instructions count: 1329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.l.b(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotErrorDecorator.DisclaimerDecorator f103626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103627b;

        m(FulfillmentSlotErrorDecorator.DisclaimerDecorator disclaimerDecorator, LocalThemeScope localThemeScope) {
            this.f103626a = disclaimerDecorator;
            this.f103627b = localThemeScope;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2108021318, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.TimeslotsHeaderSection.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:324)");
            }
            String strB = this.f103626a.getTitle().b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            Di.j.i(this.f103627b, null, this.f103626a.getBody().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), strB, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final Ki.LocalThemeScope r18, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r19, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.B(Ki.M, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11980m.FooterItem r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.E(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$b, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11980m.FooterItem footerItem, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, footerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ki.LocalThemeScope r34, boolean r35, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r36, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.G(Ki.M, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC15783O interfaceC15783O, C15429A c15429a, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
        LazyRow.i(listE.size(), null, new c(listE), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new d(listE, localThemeScope, function1, interfaceC15783O, c15429a)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, z10, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(final Ki.LocalThemeScope r26, final Cm.FulfillmentSlotDayDecorator r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r29, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.K(Ki.M, Cm.m, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(boolean z10) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        function1.invoke(new q1.g.SelectDay(fulfillmentSlotDayDecorator));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, fulfillmentSlotDayDecorator, modifier, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r28, boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.P(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[EDGE_INSN: B:36:0x0096->B:32:0x0096 BREAK  A[LOOP:0: B:25:0x0079->B:37:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit T(boolean r8, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r9, boolean r10, Ki.LocalThemeScope r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function0 r13, boolean r14, kotlin.jvm.functions.Function0 r15, l0.w r16) {
        /*
            java.lang.String r0 = "$this$LazyColumn"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$f r0 = new com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$f
            r0.<init>(r10, r9)
            r10 = -944566218(0xffffffffc7b31036, float:-91680.42)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r10, r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            l0.w.g(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L51
            if (r9 == 0) goto L51
            java.util.List r8 = r9.E()
            if (r8 == 0) goto L51
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r7
            if (r8 != r7) goto L51
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l r8 = r9.getErrorState()
            boolean r8 = r8 instanceof com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11978l.b
            if (r8 == 0) goto L51
            boolean r8 = r9.getIsLoading()
            if (r8 != 0) goto L51
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$g r8 = new com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$g
            r8.<init>(r9, r11, r12, r13)
            r10 = -1366075333(0xffffffffae93583b, float:-6.700459E-11)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r10, r7, r8)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r16
            l0.w.g(r1, r2, r3, r4, r5, r6)
        L51:
            if (r9 == 0) goto Lb0
            boolean r8 = r9.getIsLoading()
            if (r8 != 0) goto Lb0
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l r8 = r9.getErrorState()
            boolean r8 = r8 instanceof com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11978l.b
            if (r8 == 0) goto Lb0
            java.util.List r8 = r9.E()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r10 = r8 instanceof java.util.Collection
            if (r10 == 0) goto L75
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L75
            goto L8c
        L75:
            java.util.Iterator r8 = r8.iterator()
        L79:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r8.next()
            Cm.a r10 = (Cm.FulfillmentPartnerDecorator) r10
            boolean r10 = r10.getIsPartnerSelected()
            if (r10 == 0) goto L79
            goto L96
        L8c:
            java.util.List r8 = r9.E()
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto Lb0
        L96:
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$h r0 = new com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$h
            r3 = r9
            r1 = r11
            r5 = r12
            r2 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r12 = 1417789604(0x5481c0a4, float:4.458262E12)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r12, r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r16
            l0.w.g(r1, r2, r3, r4, r5, r6)
        Lb0:
            com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$i r12 = new com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$i
            r12.<init>(r11, r9)
            r8 = -1533844001(0xffffffffa49365df, float:-6.3923664E-17)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r8, r7, r12)
            r12 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = r8
            r8 = r16
            l0.w.g(r8, r9, r10, r11, r12, r13)
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.T(boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, Ki.M, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, l0.w):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, boolean z11, boolean z12, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, fulfillmentSlotsViewState, z10, z11, z12, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11980m.HeaderItem r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.V(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11980m.HeaderItem headerItem, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, modifier, headerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Y(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.Y(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, modifier, fulfillmentSlotsViewState, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a0(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, boolean r21, boolean r22, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.a0(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0 function0, Function1 function1, Function2 function2, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, modifier, z10, z11, fulfillmentSlotsViewState, function0, function1, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e0(final Ki.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11980m.SlotItem r38, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.e0(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11980m.SlotItem slotItem, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, slotItem, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, modifier, fulfillmentSlotsViewState, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AbstractC11980m> w0(FulfillmentSlotsViewState fulfillmentSlotsViewState) {
        Object next;
        if (fulfillmentSlotsViewState != null && !fulfillmentSlotsViewState.getIsLoading() && !fulfillmentSlotsViewState.F().e().isEmpty()) {
            Iterator<T> it = fulfillmentSlotsViewState.F().e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((FulfillmentSlotDayDecorator) next).getIsDaySelected()) {
                    break;
                }
            }
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) next;
            if (fulfillmentSlotDayDecorator != null) {
                boolean zR = fulfillmentSlotsViewState.R(fulfillmentSlotDayDecorator);
                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                spreadBuilder.a(AbstractC11980m.a.f103877a);
                AbstractC11980m.HeaderItem headerItem = new AbstractC11980m.HeaderItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101298y8, new Object[0]), null, 2, null);
                if (zR) {
                    headerItem = null;
                }
                spreadBuilder.a(headerItem);
                List<FulfillmentSlotTimeDecorator> listF = fulfillmentSlotDayDecorator.F();
                List arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                Iterator<T> it2 = listF.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new AbstractC11980m.SlotItem((FulfillmentSlotTimeDecorator) it2.next()));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    AbstractC11980m.FooterItem footerItem = new AbstractC11980m.FooterItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100920f9, new Object[0]));
                    if (zR) {
                        footerItem = null;
                    }
                    arrayList = CollectionsKt.q(footerItem);
                }
                spreadBuilder.b(arrayList.toArray(new AbstractC11980m[0]));
                spreadBuilder.a(new AbstractC11980m.HeaderItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100582O, new Object[0]), null, 2, null));
                List<FulfillmentSlotTimeDecorator> listX = fulfillmentSlotDayDecorator.x();
                List arrayList2 = new ArrayList(CollectionsKt.x(listX, 10));
                Iterator<T> it3 = listX.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new AbstractC11980m.SlotItem((FulfillmentSlotTimeDecorator) it3.next()));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = CollectionsKt.e(new AbstractC11980m.FooterItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100920f9, new Object[0])));
                }
                spreadBuilder.b(arrayList2.toArray(new AbstractC11980m[0]));
                spreadBuilder.a(new AbstractC11980m.HeaderItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101195t5, new Object[0]), null, 2, null));
                List<FulfillmentSlotTimeDecorator> listD = fulfillmentSlotDayDecorator.D();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it4 = listD.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new AbstractC11980m.SlotItem((FulfillmentSlotTimeDecorator) it4.next()));
                }
                List listE = arrayList3.isEmpty() ? null : arrayList3;
                if (listE == null) {
                    listE = CollectionsKt.e(new AbstractC11980m.FooterItem(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100920f9, new Object[0])));
                }
                spreadBuilder.b(listE.toArray(new AbstractC11980m[0]));
                return CollectionsKt.r(spreadBuilder.d(new AbstractC11980m[spreadBuilder.c()]));
            }
        }
        return CollectionsKt.m();
    }

    public static final String x0(AbstractC6392a formattedString, Composer composer, int i10) {
        String strB;
        Intrinsics.j(formattedString, "formattedString");
        composer.startReplaceGroup(1969440696);
        if (ComposerKt.M()) {
            ComposerKt.U(1969440696, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.modifyHeaderTitle (FulfillmentScreenRedesigned.kt:379)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        String string = StringsKt.C1(formattedString.b(context)).toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        String string2 = context.getString(com.meijer.mobile.meijer.Y.f100358C6);
        Intrinsics.i(string2, "getString(...)");
        String lowerCase2 = StringsKt.C1(string2).toString().toLowerCase(locale);
        Intrinsics.i(lowerCase2, "toLowerCase(...)");
        String string3 = context.getString(com.meijer.mobile.meijer.Y.f101296y6);
        Intrinsics.i(string3, "getString(...)");
        String lowerCase3 = StringsKt.C1(string3).toString().toLowerCase(locale);
        Intrinsics.i(lowerCase3, "toLowerCase(...)");
        if (Intrinsics.e(lowerCase, lowerCase2)) {
            composer.startReplaceGroup(-1448050798);
            strB = C16338g.c(com.meijer.mobile.meijer.Y.f100378D6, composer, 0);
            composer.P();
        } else if (Intrinsics.e(lowerCase, lowerCase3)) {
            composer.startReplaceGroup(-1448047119);
            strB = C16338g.c(com.meijer.mobile.meijer.Y.f101316z6, composer, 0);
            composer.P();
        } else {
            composer.startReplaceGroup(-1448043283);
            composer.P();
            strB = formattedString.b(context);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(InterfaceC5872l0 interfaceC5872l0, Function0 function0, Function1 function1, AbstractC11980m.SlotItem slotItem) {
        interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
        function0.invoke();
        function1.invoke(new q1.g.SelectTimeSlot(slotItem.getSlotDecorator().getTimeSlot().getId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(InterfaceC5872l0 interfaceC5872l0, Function0 function0, Function1 function1, AbstractC11980m.SlotItem slotItem, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
        function0.invoke();
        function1.invoke(new q1.g.SelectTimeSlot(slotItem.getSlotDecorator().getTimeSlot().getId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(final LocalThemeScope localThemeScope, Modifier modifier, final FulfillmentSlotsViewState fulfillmentSlotsViewState, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        boolean z10;
        FulfillmentSlotErrorDecorator.DisclaimerDecorator noSlotsTodayDisclaimer;
        Composer composerStartRestartGroup = composer.startRestartGroup(1856271489);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
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
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(fulfillmentSlotsViewState)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1856271489, i12, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.TimeslotsHeaderSection (FulfillmentScreenRedesigned.kt:319)");
            }
            if (fulfillmentSlotsViewState != null && !fulfillmentSlotsViewState.getIsLoading()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (noSlotsTodayDisclaimer = fulfillmentSlotsViewState.getFulfillmentSlotError().getNoSlotsTodayDisclaimer()) != null) {
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
                int iA = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14903g c14903g = C14903g.f139698a;
                Ki.Q.e(localThemeScope, ki.a1.f142015a, ComposableLambdaKt.c(-2108021318, true, new m(noSlotsTodayDisclaimer, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (ki.a1.f142016b << 3));
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Q.l0(localThemeScope, modifier2, fulfillmentSlotsViewState, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

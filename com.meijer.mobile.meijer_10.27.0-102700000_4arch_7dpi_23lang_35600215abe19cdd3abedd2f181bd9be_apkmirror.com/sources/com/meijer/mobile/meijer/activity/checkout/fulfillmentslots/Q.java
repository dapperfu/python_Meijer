package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Bm.FulfillmentPartnerDecorator;
import Bm.FulfillmentSlotDayDecorator;
import Bm.FulfillmentSlotErrorDecorator;
import Bm.FulfillmentSlotTimeDecorator;
import F1.j;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11853l;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14914Q;
import ji.InterfaceC14920X;
import ji.InterfaceC14926b0;
import ji.q1;
import ji.s1;
import kotlin.C17917Z;
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
import l0.C15339A;
import l0.InterfaceC15343c;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001as\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u0017\u001a`\u0010#\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2#\b\u0002\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b#\u0010$\u001aK\u0010'\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b'\u0010(\u001a%\u0010+\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,\u001a%\u0010/\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100\u001a!\u00103\u001a\b\u0012\u0004\u0012\u000202012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b3\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "isEditMode", "isBopasEnabled", "isBunchaEnabled", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "onAction", "Lkotlin/Function0;", "onInformationButtonClick", "updateActivityExtra", "P", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isSinglePageCheckout", "content", "a0", "(LJi/M;Landroidx/compose/ui/Modifier;ZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "k0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Landroidx/compose/runtime/Composer;II)V", "G", "(LJi/M;ZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "B", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Y", "LBm/m;", "dayDecorator", "Lkotlin/ParameterName;", "name", "isSelected", "onSelectedDay", "K", "(LJi/M;LBm/m;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;", "slotItem", "e0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;", "headerItem", "V", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;", "footerItem", "E", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m;", "w0", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)Ljava/util/List;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "a", "Ljava/util/List;", "pickupOptions", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final List<G1> f102719a = CollectionsKt.p(G1.a.f102648a, G1.b.f102649a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102721b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102722c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a, reason: collision with other inner class name */
        static final class C1449a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102723a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f102724b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<q1.g, Unit> f102725c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a$a, reason: collision with other inner class name */
            static final class C1450a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102726a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14914Q f102727b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f102728c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function1<q1.g, Unit> f102729d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q$a$a$a$a, reason: collision with other inner class name */
                static final class C1451a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102730a;

                    C1451a(LocalThemeScope localThemeScope) {
                        this.f102730a = localThemeScope;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1943743478, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:427)");
                        }
                        LocalThemeScope localThemeScope = this.f102730a;
                        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f102730a.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.f()), null, 383, null);
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99594H6, composer, 0);
                        int i11 = LocalThemeScope.f15770g;
                        int i12 = q1.Label.f140080j;
                        ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        ri.j.h(this.f102730a, new q1.Label(null, null, null, null, 0, false, 0, this.f102730a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(com.meijer.mobile.meijer.Y.f99575G6, composer, 0), null, composer, i11 | (i12 << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1450a(LocalThemeScope localThemeScope, InterfaceC14914Q interfaceC14914Q, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super q1.g, Unit> function1) {
                    this.f102726a = localThemeScope;
                    this.f102727b = interfaceC14914Q;
                    this.f102728c = interfaceC5730l0;
                    this.f102729d = function1;
                }

                public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(166052544, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:414)");
                    }
                    LocalThemeScope localThemeScope = this.f102726a;
                    q1.s.Checkbox trailingToggleButton = this.f102727b.getToggleButtons().getTrailingToggleButton();
                    boolean zBooleanValue = this.f102728c.getValue().booleanValue();
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f102729d);
                    final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f102728c;
                    final Function1<q1.g, Unit> function1 = this.f102729d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.P
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Q.a.C1449a.C1450a.c(interfaceC5730l0, function1, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    int i11 = LocalThemeScope.f15770g;
                    vi.s.b(localThemeScope, trailingToggleButton, zBooleanValue, false, false, (Function1) objB, composer, i11 | (q1.s.Checkbox.f140173e << 3), 12);
                    C16088n.e(this.f102726a, this.f102727b.getContainers().getList(), ComposableLambdaKt.c(-1943743478, true, new C1451a(this.f102726a), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    b(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0, Function1 function1, boolean z10) {
                    interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                    function1.invoke(new q1.g.SetEarlyDeliveryAction(((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1449a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super q1.g, Unit> function1) {
                this.f102723a = localThemeScope;
                this.f102724b = interfaceC5730l0;
                this.f102725c = function1;
            }

            public final void b(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1229250944, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:395)");
                }
                LocalThemeScope localThemeScope = this.f102723a;
                q1.Row item = Assemble.getContainers().getItem();
                Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f102723a.getAdsSpacing().getFive().getDp()), true, null, 2, null);
                boolean zBooleanValue = this.f102724b.getValue().booleanValue();
                Role roleJ = Role.j(Role.INSTANCE.c());
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f102725c);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f102724b;
                final Function1<q1.g, Unit> function1 = this.f102725c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Q.a.C1449a.c(interfaceC5730l0, function1, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C16088n.i(localThemeScope, q1.Row.y(item, ToggleableKt.c(modifierB, zBooleanValue, false, roleJ, (Function1) objB, 2, null), null, null, 6, null), ComposableLambdaKt.c(166052544, true, new C1450a(this.f102723a, Assemble, this.f102724b, this.f102725c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                b(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5730l0 interfaceC5730l0, Function1 function1, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                function1.invoke(new q1.g.SetEarlyDeliveryAction(((Boolean) interfaceC5730l0.getValue()).booleanValue()));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super q1.g, Unit> function1) {
            this.f102720a = localThemeScope;
            this.f102721b = interfaceC5730l0;
            this.f102722c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(342798524, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous> (FulfillmentScreenRedesigned.kt:394)");
            }
            LocalThemeScope localThemeScope = this.f102720a;
            Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-1229250944, true, new C1449a(localThemeScope, this.f102721b, this.f102722c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (s1.b.f140197b << 3));
            C17917Z.a(null, this.f102720a.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 384, 9);
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
    static final class b implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f102731a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f102732b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f102733c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentScreenRedesignedKt$FulfillmentDays$2$1$1$1$1$1$1", f = "FulfillmentScreenRedesigned.kt", l = {369}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f102734a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f102735b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f102736c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f102735b, this.f102736c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15339A c15339a, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f102735b = c15339a;
                this.f102736c = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f102734a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15339A c15339a = this.f102735b;
                    int i11 = this.f102736c;
                    this.f102734a = 1;
                    if (C15339A.l(c15339a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b(InterfaceC16622O interfaceC16622O, C15339A c15339a, int i10) {
            this.f102731a = interfaceC16622O;
            this.f102732b = c15339a;
            this.f102733c = i10;
        }

        public final void a(boolean z10) {
            if (z10) {
                C16648k.d(this.f102731a, null, null, new a(this.f102732b, this.f102733c, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f102737f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f102737f = list;
        }

        public final Object a(int i10) {
            this.f102737f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f102738f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102739g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f102740h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f102741i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15339A f102742j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a) {
            super(4);
            this.f102738f = list;
            this.f102739g = localThemeScope;
            this.f102740h = function1;
            this.f102741i = interfaceC16622O;
            this.f102742j = c15339a;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) this.f102738f.get(i10);
            composer.startReplaceGroup(672937765);
            LocalThemeScope localThemeScope = this.f102739g;
            Function1 function1 = this.f102740h;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f102741i) | composer.V(this.f102742j) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f102741i, this.f102742j, i10);
                composer.t(objB);
            }
            composer.P();
            Q.K(localThemeScope, fulfillmentSlotDayDecorator, null, function1, (Function1) objB, composer, LocalThemeScope.f15770g, 2);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f102743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotDayDecorator f102745c;

        e(String str, LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
            this.f102743a = str;
            this.f102744b = localThemeScope;
            this.f102745c = fulfillmentSlotDayDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-437371711, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsDayItem.<anonymous> (FulfillmentScreenRedesigned.kt:557)");
            }
            C5658d.f fVarB = C5658d.f48555a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f102743a);
            final String str = this.f102743a;
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
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(C16705m.d(companion, false, (Function1) objB, 1, null), this.f102744b.getAdsSpacing().getFive().getDp(), this.f102744b.getAdsSpacing().getFour().getDp());
            LocalThemeScope localThemeScope = this.f102744b;
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = this.f102745c;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.I iD = !fulfillmentSlotDayDecorator.K() ? localThemeScope.getAdsTypography().getHeadings().getSeven().d(localThemeScope.getAdsColors().getAdsColorsDisabled()) : localThemeScope.getAdsTypography().getHeadings().getSeven();
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, iD, null, 375, null);
            String strC = fulfillmentSlotDayDecorator.C();
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, !fulfillmentSlotDayDecorator.K() ? localThemeScope.getAdsTypography().getBody().getTwo().d(localThemeScope.getAdsColors().getAdsColorsDisabled()) : localThemeScope.getAdsTypography().getBody().getTwo(), null, 375, null), fulfillmentSlotDayDecorator.E(), null, composer, i11 | (i12 << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f102746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102747b;

        f(boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f102746a = z10;
            this.f102747b = fulfillmentSlotsViewState;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-944566218, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:119)");
            }
            boolean z10 = this.f102746a;
            FulfillmentSlotsViewState fulfillmentSlotsViewState = this.f102747b;
            Am.A.c(z10, fulfillmentSlotsViewState != null ? fulfillmentSlotsViewState.getCheckoutFlowState() : null, false, composer, 0, 4);
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
    static final class g implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102751d;

        /* JADX WARN: Multi-variable type inference failed */
        g(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1<? super q1.g, Unit> function1, Function0<Unit> function0) {
            this.f102748a = fulfillmentSlotsViewState;
            this.f102749b = localThemeScope;
            this.f102750c = function1;
            this.f102751d = function0;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1366075333, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:127)");
            }
            List<FulfillmentPartnerDecorator> listE = this.f102748a.E();
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99972b3, composer, 0);
            LocalThemeScope localThemeScope = this.f102749b;
            Function1<q1.g, Unit> function1 = this.f102750c;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f102751d);
            final Function0<Unit> function0 = this.f102751d;
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
            C11835e.c(localThemeScope, strC, listE, null, false, function1, (Function0) objB, composer, LocalThemeScope.f15770g, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f102753b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102754c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102755d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102756e;

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0<Unit> function0, Function1<? super q1.g, Unit> function1) {
            this.f102752a = localThemeScope;
            this.f102753b = z10;
            this.f102754c = fulfillmentSlotsViewState;
            this.f102755d = function0;
            this.f102756e = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1417789604, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenRedesigned.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:143)");
            }
            Q.a0(this.f102752a, null, false, this.f102753b, this.f102754c, this.f102755d, this.f102756e, null, composer, LocalThemeScope.f15770g, 67);
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
    static final class i implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102758b;

        i(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f102757a = localThemeScope;
            this.f102758b = fulfillmentSlotsViewState;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
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
            Q.Y(this.f102757a, InterfaceC15343c.f(item, Modifier.INSTANCE, 0.0f, 1, null), this.f102758b, composer, LocalThemeScope.f15770g, 0);
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
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102760b;

        j(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            this.f102759a = localThemeScope;
            this.f102760b = fulfillmentSlotsViewState;
        }

        public final void a(Composer composer, int i10) {
            AbstractC11853l.Error error;
            AbstractC11853l.Error error2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-654574894, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:473)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, this.f102759a.getAdsSpacing().getEight().getDp(), this.f102759a.getAdsSpacing().getFive().getDp());
            C5658d.f fVarB = C5658d.f48555a.b();
            e.b bVarG = P0.e.INSTANCE.g();
            LocalThemeScope localThemeScope = this.f102759a;
            FulfillmentSlotsViewState fulfillmentSlotsViewState = this.f102760b;
            MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            C13457y.a(C16190d.c(com.meijer.mobile.meijer.S.f98726h0, composer, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Ji.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion3 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, six, null, 375, null);
            AbstractC5607a errorTitle = (fulfillmentSlotsViewState == null || (error2 = (AbstractC11853l.Error) fulfillmentSlotsViewState.getErrorState()) == null) ? null : error2.getErrorTitle();
            composer.startReplaceGroup(1686471966);
            String strB = errorTitle == null ? null : errorTitle.b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            composer.P();
            String str = strB == null ? "" : strB;
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            q1.Label label2 = new q1.Label(null, null, null, F1.j.h(companion3.a()), 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 375, null);
            AbstractC5607a errorDescription = (fulfillmentSlotsViewState == null || (error = (AbstractC11853l.Error) fulfillmentSlotsViewState.getErrorState()) == null) ? null : error.getErrorDescription();
            composer.startReplaceGroup(1686488183);
            String strA = errorDescription != null ? C6408b.a(errorDescription, composer, AbstractC5607a.f45514b) : null;
            composer.P();
            ri.j.h(localThemeScope, label2, strA == null ? "" : strA, null, composer, i11 | (i12 << 3), 4);
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
    static final class k implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f102761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102762b;

        k(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f102761a = modifier;
            this.f102762b = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1261855885, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous> (FulfillmentScreenRedesigned.kt:514)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f102762b, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(this.f102761a, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f102764b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102765c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f102766d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102767e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f102768f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102769g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102770a;

            a(LocalThemeScope localThemeScope) {
                this.f102770a = localThemeScope;
            }

            public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(809401728, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.PickupOptionSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:264)");
                }
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100006ch, composer, 0);
                Ci.j.i(this.f102770a, null, C16193g.c(com.meijer.mobile.meijer.Y.f99986bh, composer, 0), strC, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 17);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
                a(interfaceC14926b0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z11, Function1<? super q1.g, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0) {
            this.f102763a = localThemeScope;
            this.f102764b = z10;
            this.f102765c = fulfillmentSlotsViewState;
            this.f102766d = z11;
            this.f102767e = function1;
            this.f102768f = function2;
            this.f102769g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, G1 g12, boolean z10) {
            function1.invoke(new q1.g.SetPickupOption(g12));
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0535  */
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
                Method dump skipped, instructions count: 1337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.l.b(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotErrorDecorator.DisclaimerDecorator f102771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102772b;

        m(FulfillmentSlotErrorDecorator.DisclaimerDecorator disclaimerDecorator, LocalThemeScope localThemeScope) {
            this.f102771a = disclaimerDecorator;
            this.f102772b = localThemeScope;
        }

        public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2108021318, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.TimeslotsHeaderSection.<anonymous>.<anonymous>.<anonymous> (FulfillmentScreenRedesigned.kt:324)");
            }
            String strB = this.f102771a.getTitle().b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            Ci.j.i(this.f102772b, null, this.f102771a.getBody().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), strB, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 17);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
            a(interfaceC14926b0, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void B(final Ji.LocalThemeScope r18, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r19, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.B(Ji.M, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void E(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.FooterItem r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.E(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$b, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.FooterItem footerItem, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, footerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void G(final Ji.LocalThemeScope r34, boolean r35, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r36, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.G(Ji.M, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
        LazyRow.i(listE.size(), null, new c(listE), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new d(listE, localThemeScope, function1, interfaceC16622O, c15339a)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, z10, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void K(final Ji.LocalThemeScope r26, final Bm.FulfillmentSlotDayDecorator r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r29, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.K(Ji.M, Bm.m, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        function1.invoke(new q1.g.SelectDay(fulfillmentSlotDayDecorator));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, fulfillmentSlotDayDecorator, modifier, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void P(final Ji.LocalThemeScope r26, androidx.compose.ui.Modifier r27, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r28, boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.P(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[EDGE_INSN: B:36:0x0096->B:32:0x0096 BREAK  A[LOOP:0: B:25:0x0079->B:37:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit T(boolean r8, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r9, boolean r10, Ji.LocalThemeScope r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function0 r13, boolean r14, kotlin.jvm.functions.Function0 r15, l0.w r16) {
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
            boolean r8 = r8 instanceof com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11853l.b
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
            boolean r8 = r8 instanceof com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11853l.b
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
            Bm.a r10 = (Bm.FulfillmentPartnerDecorator) r10
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
            kotlin.Unit r8 = kotlin.Unit.f142422a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.T(boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, Ji.M, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, l0.w):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, boolean z11, boolean z12, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, modifier, fulfillmentSlotsViewState, z10, z11, z12, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void V(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.HeaderItem r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.V(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.HeaderItem headerItem, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, modifier, headerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void Y(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.Y(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, modifier, fulfillmentSlotsViewState, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void a0(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, boolean r21, boolean r22, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.a0(Ji.M, androidx.compose.ui.Modifier, boolean, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0 function0, Function1 function1, Function2 function2, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, modifier, z10, z11, fulfillmentSlotsViewState, function0, function1, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void e0(final Ji.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.SlotItem r38, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Q.e0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.SlotItem slotItem, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, slotItem, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, modifier, fulfillmentSlotsViewState, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AbstractC11855m> w0(FulfillmentSlotsViewState fulfillmentSlotsViewState) {
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
                spreadBuilder.a(AbstractC11855m.a.f103022a);
                AbstractC11855m.HeaderItem headerItem = new AbstractC11855m.HeaderItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100376v8, new Object[0]), null, 2, null);
                if (zR) {
                    headerItem = null;
                }
                spreadBuilder.a(headerItem);
                List<FulfillmentSlotTimeDecorator> listF = fulfillmentSlotDayDecorator.F();
                List arrayList = new ArrayList(CollectionsKt.x(listF, 10));
                Iterator<T> it2 = listF.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new AbstractC11855m.SlotItem((FulfillmentSlotTimeDecorator) it2.next()));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    AbstractC11855m.FooterItem footerItem = new AbstractC11855m.FooterItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99998c9, new Object[0]));
                    if (zR) {
                        footerItem = null;
                    }
                    arrayList = CollectionsKt.q(footerItem);
                }
                spreadBuilder.b(arrayList.toArray(new AbstractC11855m[0]));
                spreadBuilder.a(new AbstractC11855m.HeaderItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99720O, new Object[0]), null, 2, null));
                List<FulfillmentSlotTimeDecorator> listX = fulfillmentSlotDayDecorator.x();
                List arrayList2 = new ArrayList(CollectionsKt.x(listX, 10));
                Iterator<T> it3 = listX.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new AbstractC11855m.SlotItem((FulfillmentSlotTimeDecorator) it3.next()));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = CollectionsKt.e(new AbstractC11855m.FooterItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99998c9, new Object[0])));
                }
                spreadBuilder.b(arrayList2.toArray(new AbstractC11855m[0]));
                spreadBuilder.a(new AbstractC11855m.HeaderItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100333t5, new Object[0]), null, 2, null));
                List<FulfillmentSlotTimeDecorator> listD = fulfillmentSlotDayDecorator.D();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listD, 10));
                Iterator<T> it4 = listD.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new AbstractC11855m.SlotItem((FulfillmentSlotTimeDecorator) it4.next()));
                }
                List listE = arrayList3.isEmpty() ? null : arrayList3;
                if (listE == null) {
                    listE = CollectionsKt.e(new AbstractC11855m.FooterItem(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99998c9, new Object[0])));
                }
                spreadBuilder.b(listE.toArray(new AbstractC11855m[0]));
                return CollectionsKt.r(spreadBuilder.d(new AbstractC11855m[spreadBuilder.c()]));
            }
        }
        return CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(InterfaceC5730l0 interfaceC5730l0, Function0 function0, Function1 function1, AbstractC11855m.SlotItem slotItem) {
        interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function0.invoke();
        function1.invoke(new q1.g.SelectTimeSlot(slotItem.getSlotDecorator().getTimeSlot().getId()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(InterfaceC5730l0 interfaceC5730l0, Function0 function0, Function1 function1, AbstractC11855m.SlotItem slotItem, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function0.invoke();
        function1.invoke(new q1.g.SelectTimeSlot(slotItem.getSlotDecorator().getTimeSlot().getId()));
        return Unit.f142422a;
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
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
                int iA = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                C14815g c14815g = C14815g.f139108a;
                Ji.Q.e(localThemeScope, ji.a1.f139760a, ComposableLambdaKt.c(-2108021318, true, new m(noSlotsTodayDisclaimer, localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (ji.a1.f139761b << 3));
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

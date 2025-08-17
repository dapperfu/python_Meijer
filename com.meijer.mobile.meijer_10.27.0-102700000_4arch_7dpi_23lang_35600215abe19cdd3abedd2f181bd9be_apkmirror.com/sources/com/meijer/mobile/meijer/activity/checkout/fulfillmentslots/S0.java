package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Bm.FulfillmentSlotDayDecorator;
import Bm.FulfillmentSlotErrorDecorator;
import Bm.FulfillmentSlotTimeDecorator;
import Ji.LocalThemeScope;
import V0.C5346q0;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.F1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13442i;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji.AdsRadioButtonColors;
import ji.InterfaceC14914Q;
import ji.InterfaceC14920X;
import ji.InterfaceC14926b0;
import ji.InterfaceC14930d0;
import ji.InterfaceC14971y;
import ji.q1;
import ji.s1;
import kotlin.AbstractC18142l;
import kotlin.C17917Z;
import kotlin.C17979v;
import kotlin.C18143m;
import kotlin.C18147q;
import kotlin.FontWeight;
import kotlin.InterfaceC17977u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import r0.RoundedCornerShape;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\u000e\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u001a\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001e\u001a\u00020\n*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010 \u001a\u00020\n*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b \u0010\u001f\u001a?\u0010!\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b!\u0010\"\u001aV\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2#\b\u0002\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b)\u0010*\u001aK\u0010-\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0003¢\u0006\u0004\b-\u0010.\u001a%\u00101\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00100\u001a\u00020/H\u0003¢\u0006\u0004\b1\u00102\u001a%\u00105\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b5\u00106\u001a!\u00109\u001a\b\u0012\u0004\u0012\u000208072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b9\u0010:\u001a\u001b\u0010>\u001a\u00020;*\u00020;2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?\"\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006F²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "isEditMode", "isBopasEnabled", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "onAction", "Lkotlin/Function0;", "updateActivityExtra", "X", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "F", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "h0", "(LJi/M;ZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "body", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "pickupOption", "selectedPickupOption", "l0", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Landroidx/compose/runtime/Composer;II)V", "P", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "K", "e0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LBm/m;", "dayDecorator", "Lkotlin/ParameterName;", "name", "isSelected", "onSelectedDay", "T", "(LJi/M;LBm/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;", "slotItem", "o0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;", "headerItem", "b0", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$c;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;", "footerItem", "N", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m$b;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/m;", "D0", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)Ljava/util/List;", "LJi/I;", "Ly1/l;", "fontFamily", "E0", "(LJi/I;Ly1/l;)LJi/I;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/F1;", "a", "Ljava/util/List;", "mainGroup", "b", "pickupOptions", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<F1> f102779a = CollectionsKt.p(F1.b.f102602a, F1.a.f102601a, F1.c.f102603a);

    /* renamed from: b, reason: collision with root package name */
    private static final List<G1> f102780b = CollectionsKt.p(G1.a.f102648a, G1.b.f102649a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102783c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1<? super q1.g, Unit> function1) {
            this.f102781a = localThemeScope;
            this.f102782b = fulfillmentSlotsViewState;
            this.f102783c = function1;
        }

        public final void a(InterfaceC15343c stickyHeader, int i10, Composer composer, int i11) {
            Intrinsics.j(stickyHeader, "$this$stickyHeader");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1747116244, i11, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.DayAndTimeSlotSelections.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:141)");
            }
            S0.P(this.f102781a, this.f102782b, this.f102783c, composer, LocalThemeScope.f15770g, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f102784f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(F1.b bVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f102785f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f102786g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f102785f = function1;
            this.f102786g = list;
        }

        public final Object a(int i10) {
            return this.f102785f.invoke(this.f102786g.get(i10));
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
        final /* synthetic */ List f102787f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102788g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f102789h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102790i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState) {
            super(4);
            this.f102787f = list;
            this.f102788g = localThemeScope;
            this.f102789h = modifier;
            this.f102790i = fulfillmentSlotsViewState;
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
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            composer.startReplaceGroup(-845736985);
            S0.t0(this.f102788g, this.f102789h, this.f102790i, composer, LocalThemeScope.f15770g, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final e f102791f = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC11855m abstractC11855m) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f102792f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f102793g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, List list) {
            super(1);
            this.f102792f = function1;
            this.f102793g = list;
        }

        public final Object a(int i10) {
            return this.f102792f.invoke(this.f102793g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f102794f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102795g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f102796h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f102797i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f102798j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, Function0 function0) {
            super(4);
            this.f102794f = list;
            this.f102795g = localThemeScope;
            this.f102796h = fulfillmentSlotsViewState;
            this.f102797i = function1;
            this.f102798j = function0;
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
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AbstractC11855m abstractC11855m = (AbstractC11855m) this.f102794f.get(i10);
            composer.startReplaceGroup(-102001555);
            if (abstractC11855m instanceof AbstractC11855m.a) {
                composer.startReplaceGroup(-1250214815);
                S0.K(this.f102795g, this.f102796h, this.f102797i, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            } else if (abstractC11855m instanceof AbstractC11855m.HeaderItem) {
                composer.startReplaceGroup(-101748968);
                S0.b0(this.f102795g, androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16), H1.h.p(20)), (AbstractC11855m.HeaderItem) abstractC11855m, composer, LocalThemeScope.f15770g | 48 | (AbstractC5607a.f45514b << 6), 0);
                composer.P();
            } else if (abstractC11855m instanceof AbstractC11855m.SlotItem) {
                composer.startReplaceGroup(-1250194602);
                S0.o0(this.f102795g, null, (AbstractC11855m.SlotItem) abstractC11855m, this.f102797i, this.f102798j, composer, LocalThemeScope.f15770g, 1);
                composer.P();
            } else {
                if (!(abstractC11855m instanceof AbstractC11855m.FooterItem)) {
                    composer.startReplaceGroup(-1250216362);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1250185481);
                S0.N(this.f102795g, androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16)), (AbstractC11855m.FooterItem) abstractC11855m, composer, LocalThemeScope.f15770g | 48 | (AbstractC5607a.f45514b << 6), 0);
                composer.P();
            }
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
    static final class h implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102799a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f102800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102801c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14914Q f102803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f102804c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<q1.g, Unit> f102805d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0$h$a$a, reason: collision with other inner class name */
            static final class C1452a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102806a;

                C1452a(LocalThemeScope localThemeScope) {
                    this.f102806a = localThemeScope;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1348568810, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:388)");
                    }
                    LocalThemeScope localThemeScope = this.f102806a;
                    q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f102806a.getAdsTypography().getBody().getOne().f(FontWeight.INSTANCE.f()), null, 383, null);
                    String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99594H6, composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    ri.j.h(this.f102806a, new q1.Label(null, null, null, null, 0, false, 0, this.f102806a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(com.meijer.mobile.meijer.Y.f99575G6, composer, 0), null, composer, i11 | (i12 << 3), 4);
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
            a(LocalThemeScope localThemeScope, InterfaceC14914Q interfaceC14914Q, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super q1.g, Unit> function1) {
                this.f102802a = localThemeScope;
                this.f102803b = interfaceC14914Q;
                this.f102804c = interfaceC5730l0;
                this.f102805d = function1;
            }

            public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(705484236, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:375)");
                }
                LocalThemeScope localThemeScope = this.f102802a;
                q1.s.Checkbox leadingToggleButton = this.f102803b.getToggleButtons().getLeadingToggleButton();
                boolean zBooleanValue = this.f102804c.getValue().booleanValue();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f102805d);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f102804c;
                final Function1<q1.g, Unit> function1 = this.f102805d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.U0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return S0.h.a.c(interfaceC5730l0, function1, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                vi.s.b(localThemeScope, leadingToggleButton, zBooleanValue, false, false, (Function1) objB, composer, i11 | (q1.s.Checkbox.f140173e << 3), 12);
                C16088n.e(this.f102802a, this.f102803b.getContainers().getList(), ComposableLambdaKt.c(-1348568810, true, new C1452a(this.f102802a), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
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
        h(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super q1.g, Unit> function1) {
            this.f102799a = localThemeScope;
            this.f102800b = interfaceC5730l0;
            this.f102801c = function1;
        }

        public final void b(InterfaceC14914Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(372830604, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection.<anonymous> (FulfillmentSlotsScreenLegacy.kt:356)");
            }
            LocalThemeScope localThemeScope = this.f102799a;
            q1.Row item = Assemble.getContainers().getItem();
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, this.f102799a.getAdsSpacing().getFive().getDp()), true, null, 2, null);
            boolean zBooleanValue = this.f102800b.getValue().booleanValue();
            Role roleJ = Role.j(Role.INSTANCE.c());
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f102801c);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f102800b;
            final Function1<q1.g, Unit> function1 = this.f102801c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.T0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.h.c(interfaceC5730l0, function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16088n.i(localThemeScope, q1.Row.y(item, ToggleableKt.c(modifierB, zBooleanValue, false, roleJ, (Function1) objB, 2, null), null, null, 6, null), ComposableLambdaKt.c(705484236, true, new a(this.f102799a, Assemble, this.f102800b, this.f102801c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f102807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f102808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f102809c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsScreenLegacyKt$FulfillmentDays$2$1$1$1$1$1$1", f = "FulfillmentSlotsScreenLegacy.kt", l = {333}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f102810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f102811b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f102812c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f102811b, this.f102812c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15339A c15339a, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f102811b = c15339a;
                this.f102812c = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f102810a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15339A c15339a = this.f102811b;
                    int i11 = this.f102812c;
                    this.f102810a = 1;
                    if (C15339A.l(c15339a, i11, 0, this, 2, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        i(InterfaceC16622O interfaceC16622O, C15339A c15339a, int i10) {
            this.f102807a = interfaceC16622O;
            this.f102808b = c15339a;
            this.f102809c = i10;
        }

        public final void a(boolean z10) {
            if (z10) {
                C16648k.d(this.f102807a, null, null, new a(this.f102808b, this.f102809c, null), 3, null);
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
    public static final class j extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f102813f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list) {
            super(1);
            this.f102813f = list;
        }

        public final Object a(int i10) {
            this.f102813f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class k extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f102814f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102815g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f102816h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f102817i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C15339A f102818j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a) {
            super(4);
            this.f102814f = list;
            this.f102815g = localThemeScope;
            this.f102816h = function1;
            this.f102817i = interfaceC16622O;
            this.f102818j = c15339a;
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
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) this.f102814f.get(i10);
            composer.startReplaceGroup(-460704789);
            LocalThemeScope localThemeScope = this.f102815g;
            Function1 function1 = this.f102816h;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f102817i) | composer.V(this.f102818j) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new i(this.f102817i, this.f102818j, i10);
                composer.t(objB);
            }
            composer.P();
            S0.T(localThemeScope, fulfillmentSlotDayDecorator, function1, (Function1) objB, composer, LocalThemeScope.f15770g, 0);
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
    static final class l implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotDayDecorator f102820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102821c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f102822d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102823a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FulfillmentSlotDayDecorator f102824b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f102825c;

            a(LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, String str) {
                this.f102823a = localThemeScope;
                this.f102824b = fulfillmentSlotDayDecorator;
                this.f102825c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(String str, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            public final void b(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2037628891, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsDayItem.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:485)");
                }
                LocalThemeScope localThemeScope = this.f102823a;
                Ji.I iE0 = this.f102824b.getIsDaySelected() ? S0.E0(this.f102823a.getAdsTypography().getBody().getOne(), C18143m.a(C18147q.b(Bj.j.f2806d, FontWeight.INSTANCE.f(), 0, 0, 12, null))) : !this.f102824b.getIsDaySelected() ? this.f102823a.getAdsTypography().getBody().getOne() : this.f102823a.getAdsTypography().getBody().getOne();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f102825c);
                final String str = this.f102825c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.W0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return S0.l.a.c(str, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope, new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), this.f102824b.getIsDaySelected() ? this.f102823a.getAdsColors().getAdsColorText03() : this.f102823a.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, iE0, null, 372, null), C6408b.a(this.f102824b.A(), composer, AbstractC5607a.f45514b), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, Function1<? super q1.g, Unit> function1, String str) {
            this.f102819a = localThemeScope;
            this.f102820b = fulfillmentSlotDayDecorator;
            this.f102821c = function1;
            this.f102822d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
            function1.invoke(new q1.g.SelectDay(fulfillmentSlotDayDecorator));
            return Unit.f142422a;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1978852920, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsDayItem.<anonymous> (FulfillmentSlotsScreenLegacy.kt:464)");
            }
            LocalThemeScope localThemeScope = this.f102819a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            float f10 = 1;
            InterfaceC14794C interfaceC14794CA = androidx.compose.foundation.layout.D.a(H1.h.p(f10));
            Modifier modifierB = androidx.compose.foundation.g.b(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.F(Modifier.INSTANCE, null, false, 3, null), H1.h.p(BinsView.TOTE_HEIGHT_DP)), H1.h.p(90)), this.f102820b.K(), null, 2, null);
            RoundedCornerShape roundedCornerShapeC = C16692i.c(H1.h.p(8));
            boolean zK = this.f102820b.K();
            C17979v c17979v = C17979v.f168713a;
            C5346q0 c5346q0M = C5346q0.m(this.f102819a.getAdsColors().getAdsColorsEnabled02().getColor());
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = this.f102820b;
            c5346q0M.getValue();
            if (!fulfillmentSlotDayDecorator.getIsDaySelected()) {
                c5346q0M = null;
            }
            InterfaceC17977u interfaceC17977uA = c17979v.a(c5346q0M != null ? c5346q0M.getValue() : this.f102819a.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, 0L, 0L, composer, C17979v.f168724l << 12, 14);
            float fP = H1.h.p(f10);
            C5346q0 c5346q0M2 = C5346q0.m(this.f102819a.getAdsColors().getAdsColorBrandPrimary().getColor());
            FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator2 = this.f102820b;
            c5346q0M2.getValue();
            if (!fulfillmentSlotDayDecorator2.getIsDaySelected()) {
                c5346q0M2 = null;
            }
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, zK, null, null, roundedCornerShapeC, C13442i.a(fP, c5346q0M2 != null ? c5346q0M2.getValue() : this.f102819a.getAdsColors().getAdsColorText02().getColor()), interfaceC17977uA, interfaceC14794CA, modifierB, false, null, 774, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f102821c) | composer.D(this.f102820b);
            final Function1<q1.g, Unit> function1 = this.f102821c;
            final FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator3 = this.f102820b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.V0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return S0.l.c(function1, fulfillmentSlotDayDecorator3);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-2037628891, true, new a(this.f102819a, this.f102820b, this.f102822d), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class m implements Function3<ji.j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102827b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102828a;

            a(LocalThemeScope localThemeScope) {
                this.f102828a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(780537137, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:432)");
                }
                LocalThemeScope localThemeScope = this.f102828a;
                q1.Label label = new q1.Label(null, this.f102828a.getAdsColors().getAdsColorText03(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String upperCase = C16193g.c(Bj.o.f3056z0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(LocalThemeScope localThemeScope, Function1<? super q1.g, Unit> function1) {
            this.f102826a = localThemeScope;
            this.f102827b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(q1.g.d.f103077a);
            return Unit.f142422a;
        }

        public final void b(ji.j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1426120380, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:428)");
            }
            LocalThemeScope localThemeScope = this.f102826a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f102827b);
            final Function1<q1.g, Unit> function1 = this.f102827b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.X0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return S0.m.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(780537137, true, new a(this.f102826a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102829a;

        n(LocalThemeScope localThemeScope) {
            this.f102829a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1814916104, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.LoadingState.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:443)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f102829a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 56);
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
    static final class o implements Function3<InterfaceC14930d0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G1 f102831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G1 f102832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f102833d;

        /* JADX WARN: Multi-variable type inference failed */
        o(LocalThemeScope localThemeScope, G1 g12, G1 g13, Function1<? super q1.g, Unit> function1) {
            this.f102830a = localThemeScope;
            this.f102831b = g12;
            this.f102832c = g13;
            this.f102833d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, G1 g12, boolean z10) {
            function1.invoke(new q1.g.SetPickupOption(g12));
            return Unit.f142422a;
        }

        public final void b(InterfaceC14930d0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1678093408, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.PickupSelectionItem.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:256)");
            }
            LocalThemeScope localThemeScope = this.f102830a;
            q1.s.RadioButton radioButton = new q1.s.RadioButton(androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(20)), false, null, new AdsRadioButtonColors(this.f102830a.getAdsColors().getAdsColorEnabled01(), this.f102830a.getAdsColors().getAdsColorUIBorder01(), this.f102830a.getAdsColors().getAdsColorInverse(), this.f102830a.getAdsColors().getAdsColorsDisabled()), 6, null);
            boolean zE = Intrinsics.e(this.f102831b, this.f102832c);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f102833d) | composer.V(this.f102831b);
            final Function1<q1.g, Unit> function1 = this.f102833d;
            final G1 g12 = this.f102831b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.Y0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return S0.o.c(function1, g12, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            vi.s.b(localThemeScope, radioButton, zE, false, false, (Function1) objB, composer, LocalThemeScope.f15770g | (q1.s.RadioButton.f140178e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14930d0 interfaceC14930d0, Composer composer, Integer num) {
            b(interfaceC14930d0, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class p implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotErrorDecorator.DisclaimerDecorator f102834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102835b;

        p(FulfillmentSlotErrorDecorator.DisclaimerDecorator disclaimerDecorator, LocalThemeScope localThemeScope) {
            this.f102834a = disclaimerDecorator;
            this.f102835b = localThemeScope;
        }

        public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1777230130, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.TimeslotsHeaderSection.<anonymous>.<anonymous>.<anonymous> (FulfillmentSlotsScreenLegacy.kt:298)");
            }
            String strB = this.f102834a.getTitle().b((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            Ci.j.i(this.f102835b, null, this.f102834a.getBody().b((Context) composer.o(AndroidCompositionLocals_androidKt.g())), strB, Assemble.getToastVariant().getWarning(), null, composer, LocalThemeScope.f15770g | (q1.m.Inline.f140121h << 12), 17);
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

    private static final List<AbstractC11855m> D0(FulfillmentSlotsViewState fulfillmentSlotsViewState) {
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
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.a(AbstractC11855m.a.f103022a);
                AbstractC11855m.HeaderItem headerItem = new AbstractC11855m.HeaderItem(fulfillmentSlotsViewState.I(), fulfillmentSlotDayDecorator.G());
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
                    AbstractC11855m.FooterItem footerItem = new AbstractC11855m.FooterItem(fulfillmentSlotsViewState.H());
                    if (zR) {
                        footerItem = null;
                    }
                    arrayList = CollectionsKt.q(footerItem);
                }
                spreadBuilder.b(arrayList.toArray(new AbstractC11855m[0]));
                spreadBuilder.a(new AbstractC11855m.HeaderItem(fulfillmentSlotsViewState.o(), fulfillmentSlotDayDecorator.w()));
                List<FulfillmentSlotTimeDecorator> listV = fulfillmentSlotDayDecorator.v();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listV, 10));
                Iterator<T> it3 = listV.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new AbstractC11855m.SlotItem((FulfillmentSlotTimeDecorator) it3.next()));
                }
                List listE = arrayList2.isEmpty() ? null : arrayList2;
                if (listE == null) {
                    listE = CollectionsKt.e(new AbstractC11855m.FooterItem(fulfillmentSlotsViewState.n()));
                }
                spreadBuilder.b(listE.toArray(new AbstractC11855m[0]));
                return CollectionsKt.r(spreadBuilder.d(new AbstractC11855m[spreadBuilder.c()]));
            }
        }
        return CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ji.I E0(final Ji.I i10, final AbstractC18142l abstractC18142l) {
        return new Ji.I() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.u0
            @Override // Ji.I
            public final TextStyle getStyle() {
                return S0.F0(i10, abstractC18142l);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void F(final Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r22, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.F(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, Function0 function0, l0.w wVar) {
        l0.w wVar2;
        l0.w LazyColumn = wVar;
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        for (F1 f12 : f102779a) {
            if (f12 instanceof F1.b) {
                List listE = CollectionsKt.e(F1.b.f102602a);
                LazyColumn.i(listE.size(), null, new c(b.f102784f, listE), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(listE, localThemeScope, modifier, fulfillmentSlotsViewState)));
            } else if (f12 instanceof F1.a) {
                l0.w.d(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1747116244, true, new a(localThemeScope, fulfillmentSlotsViewState, function1)), 3, null);
            } else {
                wVar2 = LazyColumn;
                if (f12 instanceof F1.c) {
                    List<AbstractC11855m> listD0 = D0(fulfillmentSlotsViewState);
                    wVar2.i(listD0.size(), null, new f(e.f102791f, listD0), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new g(listD0, localThemeScope, fulfillmentSlotsViewState, function1, function0)));
                }
                LazyColumn = wVar2;
            }
            wVar2 = LazyColumn;
            LazyColumn = wVar2;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        F(localThemeScope, modifier, fulfillmentSlotsViewState, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(final Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.FooterItem r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.N(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$b, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.FooterItem footerItem, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, modifier, footerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ji.LocalThemeScope r26, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r27, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.P(Ji.M, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC16622O interfaceC16622O, C15339A c15339a, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
        LazyRow.i(listE.size(), null, new j(listE), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new k(listE, localThemeScope, function1, interfaceC16622O, c15339a)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        T(localThemeScope, fulfillmentSlotDayDecorator, function1, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void X(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r20, boolean r21, boolean r22, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.X(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, boolean z11, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        X(localThemeScope, modifier, fulfillmentSlotsViewState, z10, z11, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
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
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b0(final Ji.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.HeaderItem r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.b0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.HeaderItem headerItem, int i10, int i11, Composer composer, int i12) {
        b0(localThemeScope, modifier, headerItem, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e0(final Ji.LocalThemeScope r25, androidx.compose.ui.Modifier r26, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r27, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.e0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, fulfillmentSlotsViewState, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void h0(final Ji.LocalThemeScope r23, boolean r24, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.h0(Ji.M, boolean, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(LocalThemeScope localThemeScope, boolean z10, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h0(localThemeScope, z10, fulfillmentSlotsViewState, function0, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void l0(final Ji.LocalThemeScope r30, androidx.compose.ui.Modifier r31, java.lang.String r32, java.lang.String r33, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1 r34, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1 r35, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.l0(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, G1 g12, G1 g13, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l0(localThemeScope, modifier, str, str2, g12, g13, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o0(final Ji.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m.SlotItem r33, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.o0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.m$d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(LocalThemeScope localThemeScope, Modifier modifier, AbstractC11855m.SlotItem slotItem, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        o0(localThemeScope, modifier, slotItem, function1, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t0(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.S0.t0(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, int i10, int i11, Composer composer, int i12) {
        t0(localThemeScope, modifier, fulfillmentSlotsViewState, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle F0(Ji.I i10, AbstractC18142l abstractC18142l) {
        return TextStyle.c(i10.getStyle(), 0L, 0L, null, null, null, abstractC18142l, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(final LocalThemeScope localThemeScope, FulfillmentSlotsViewState fulfillmentSlotsViewState, Function1<? super q1.g, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145328445);
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
            if (composerStartRestartGroup.D(fulfillmentSlotsViewState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
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
                fulfillmentSlotsViewState = null;
            }
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.n0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return S0.L((q1.g) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1145328445, i12, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.EarlyDeliverySection (FulfillmentSlotsScreenLegacy.kt:352)");
            }
            boolean z10 = false;
            if (fulfillmentSlotsViewState != null && fulfillmentSlotsViewState.getCanDisplayEarlyTimeSlotsBanner()) {
                z10 = true;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB2 = composerStartRestartGroup.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(372830604, true, new h(localThemeScope, (InterfaceC5730l0) objB2, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (s1.b.f140197b << 3));
                C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 384, 9);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final FulfillmentSlotsViewState fulfillmentSlotsViewState2 = fulfillmentSlotsViewState;
        final Function1<? super q1.g, Unit> function12 = function1;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.M(localThemeScope, fulfillmentSlotsViewState2, function12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(final LocalThemeScope localThemeScope, final FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, Function1<? super q1.g, Unit> function1, Function1<? super Boolean, Unit> function12, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(1559452628);
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
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(fulfillmentSlotDayDecorator)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function12)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return S0.U((q1.g) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function1 = (Function1) objB;
                composerStartRestartGroup.P();
            }
            if (i18 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB2 = composerStartRestartGroup.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return S0.V(((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                function12 = (Function1) objB2;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1559452628, i12, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsDayItem (FulfillmentSlotsScreenLegacy.kt:461)");
            }
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(1978852920, true, new l(localThemeScope, fulfillmentSlotDayDecorator, function1, C6408b.a(fulfillmentSlotDayDecorator.B(), composerStartRestartGroup, AbstractC5607a.f45514b)), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.e.f140295b << 3));
            function12.invoke(Boolean.valueOf(fulfillmentSlotDayDecorator.getIsDaySelected()));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Function1<? super q1.g, Unit> function13 = function1;
        final Function1<? super Boolean, Unit> function14 = function12;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.t0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return S0.W(localThemeScope, fulfillmentSlotDayDecorator, function13, function14, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(InterfaceC5730l0 interfaceC5730l0, Function0 function0, Function1 function1, AbstractC11855m.SlotItem slotItem) {
        interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
        function0.invoke();
        function1.invoke(new q1.g.SelectTimeSlot(slotItem.getSlotDecorator().getTimeSlot().getId()));
        return Unit.f142422a;
    }
}

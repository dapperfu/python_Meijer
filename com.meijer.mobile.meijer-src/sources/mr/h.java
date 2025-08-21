package mr;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState;
import di.CustomerAddress;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import l0.C15432b;
import l0.InterfaceC15433c;
import mr.h;
import oi.C16136F;
import oi.P0;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import yr.N;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aG\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001d²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "onAction", "Lkotlin/Function0;", "onExit", "g", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/I;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "q", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ldi/c;", "addresses", "", "isChecked", "onSelectAddress", "k", "(LKi/M;Ldi/c;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedAddresses", "n", "(LKi/M;Ldi/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isSubscriptionLoading", "showMaxAddresses", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f151497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f151498c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.h$a$a, reason: collision with other inner class name */
        static final class C2334a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151499a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f151500b;

            C2334a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f151499a = localThemeScope;
                this.f151500b = function0;
            }

            public final void a(InterfaceC14888I SubscriptionToolbar, Composer composer, int i10) {
                Intrinsics.j(SubscriptionToolbar, "$this$SubscriptionToolbar");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1389737081, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous>.<anonymous> (DeliveryAddressesContent.kt:75)");
                }
                P0.i(this.f151499a, C16136F.f153892a, this.f151500b, C.f.o.f17066e, C16338g.c(C15410d.f148810u, composer, 0), null, false, false, 0L, composer, LocalThemeScope.f17314g | (C16136F.f153893b << 3) | (C.f.o.f17067f << 9), 240);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC13119k, Unit> function1, Function0<Unit> function0) {
            this.f151496a = localThemeScope;
            this.f151497b = function1;
            this.f151498c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(AbstractC13119k.f.f120023a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-159359059, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous> (DeliveryAddressesContent.kt:67)");
            }
            String strC = C16338g.c(C15410d.f148774c, composer, 0);
            C.f.d dVar = C.f.d.f17051e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]);
            LocalThemeScope localThemeScope = this.f151496a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151497b);
            final Function1<AbstractC13119k, Unit> function1 = this.f151497b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mr.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            jr.m.c(localThemeScope, null, strC, abstractC6392aD, dVar, (Function0) objB, ComposableLambdaKt.c(-1389737081, true, new C2334a(this.f151496a, this.f151498c), composer, 54), composer, 1572864 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9) | (C.f.d.f17052f << 12), 1);
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
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionViewState f151501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f151503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<CustomerAddress> f151504d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<CustomerAddress, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC13119k, Unit> f151505a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<CustomerAddress> f151506b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super AbstractC13119k, Unit> function1, InterfaceC5872l0<CustomerAddress> interfaceC5872l0) {
                this.f151505a = function1;
                this.f151506b = interfaceC5872l0;
            }

            public final void a(CustomerAddress it) {
                Intrinsics.j(it, "it");
                h.i(this.f151506b, it);
                this.f151505a.invoke(new AbstractC13119k.SetSelectedDeliveryAddress(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerAddress customerAddress) {
                a(customerAddress);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.h$b$b, reason: collision with other inner class name */
        static final class C2335b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151507a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionViewState f151508b;

            C2335b(LocalThemeScope localThemeScope, SubscriptionViewState subscriptionViewState) {
                this.f151507a = localThemeScope;
                this.f151508b = subscriptionViewState;
            }

            public final void a(InterfaceC15433c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1578392513, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryAddressesContent.kt:124)");
                }
                si.j.h(this.f151507a, new q1.Label(null, null, null, null, 0, false, 0, this.f151507a.getAdsTypography().getDetail().getOne(), null, 383, null), C16338g.d(C15410d.f148746G0, new Object[]{Integer.valueOf(this.f151508b.getNumberOfSavedAddresses())}, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        public static final class c extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final c f151509f = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(CustomerAddress customerAddress) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class d extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f151510f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f151511g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Function1 function1, List list) {
                super(1);
                this.f151510f = function1;
                this.f151511g = list;
            }

            public final Object a(int i10) {
                return this.f151510f.invoke(this.f151511g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class e extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f151512f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151513g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f151514h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f151515i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list, LocalThemeScope localThemeScope, Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
                super(4);
                this.f151512f = list;
                this.f151513g = localThemeScope;
                this.f151514h = function1;
                this.f151515i = interfaceC5872l0;
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
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                CustomerAddress customerAddress = (CustomerAddress) this.f151512f.get(i10);
                composer.startReplaceGroup(-1613394421);
                LocalThemeScope localThemeScope = this.f151513g;
                CustomerAddress customerAddressH = h.h(this.f151515i);
                boolean zE = Intrinsics.e(customerAddressH != null ? customerAddressH.getId() : null, customerAddress.getId());
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f151514h);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(this.f151514h, this.f151515i);
                    composer.t(objB);
                }
                composer.P();
                h.k(localThemeScope, customerAddress, zE, null, (Function1) objB, composer, LocalThemeScope.f17314g, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, Function1<? super AbstractC13119k, Unit> function1, InterfaceC5872l0<CustomerAddress> interfaceC5872l0) {
            this.f151501a = subscriptionViewState;
            this.f151502b = localThemeScope;
            this.f151503c = function1;
            this.f151504d = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, Function1 function1, InterfaceC5872l0 interfaceC5872l0, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<CustomerAddress> listC = subscriptionViewState.c();
            LazyColumn.i(listC.size(), null, new d(c.f151509f, listC), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(listC, localThemeScope, function1, interfaceC5872l0)));
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1578392513, true, new C2335b(localThemeScope, subscriptionViewState)), 3, null);
            return Unit.f143329a;
        }

        public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(188118292, i11, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous> (DeliveryAddressesContent.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            final SubscriptionViewState subscriptionViewState = this.f151501a;
            final LocalThemeScope localThemeScope = this.f151502b;
            final Function1<AbstractC13119k, Unit> function1 = this.f151503c;
            final InterfaceC5872l0<CustomerAddress> interfaceC5872l0 = this.f151504d;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            if (subscriptionViewState.getIsSubscriptionLoading()) {
                composer.startReplaceGroup(2144420359);
                N.b(localThemeScope, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(2144541879);
                Modifier modifierH = J.h(D.h(companion, paddingValues), 0.0f, 1, null);
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                Modifier modifierD = J.D(companion, null, false, 3, null);
                int i12 = LocalThemeScope.f17314g;
                h.q(localThemeScope, modifierD, composer, i12 | 48, 0);
                Modifier modifierH2 = J.h(InterfaceC14902f.b(c14903g, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                C5800d.f fVarO = c5800d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                InterfaceC14882C interfaceC14882CD = D.d(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp());
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(subscriptionViewState) | composer.D(localThemeScope) | composer.V(function1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: mr.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h.b.c(subscriptionViewState, localThemeScope, function1, interfaceC5872l0, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15432b.a(modifierH2, null, interfaceC14882CD, false, fVarO, null, null, false, null, (Function1) objB, composer, 0, 490);
                h.n(localThemeScope, h.h(interfaceC5872l0), null, function1, composer, i12, 2);
                composer.v();
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            b(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151516a;

        c(LocalThemeScope localThemeScope) {
            this.f151516a = localThemeScope;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(513303753, i10, -1, "com.meijer.mobile.subscription.ux.checkout.HeaderSection.<anonymous> (DeliveryAddressesContent.kt:159)");
            }
            LocalThemeScope localThemeScope = this.f151516a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f16951e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(J.z(Modifier.INSTANCE, this.f151516a.getAdsSpacing().getThree().getDp()), composer, 0);
            si.j.h(this.f151516a, new q1.Label(null, null, null, null, 0, false, 0, this.f151516a.getAdsTypography().getHeadings().getSix(), null, 383, null), C16338g.c(C15410d.f148808t, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r34, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.h.g(Ki.M, com.meijer.mobile.subscription.ux.subscription.I, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, SubscriptionViewState subscriptionViewState, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, subscriptionViewState, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0124 A[EDGE_INSN: B:106:0x0124->B:80:0x0124 BREAK  A[LOOP:1: B:73:0x0108->B:108:0x0108], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed A[LOOP:0: B:69:0x00e7->B:71:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r25, final di.CustomerAddress r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super di.CustomerAddress, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.h.k(Ki.M, di.c, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, CustomerAddress customerAddress, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, customerAddress, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r19, final di.CustomerAddress r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.h.n(Ki.M, di.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1) {
        function1.invoke(AbstractC13119k.g.f120024a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, CustomerAddress customerAddress, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, customerAddress, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerAddress h(InterfaceC5872l0<CustomerAddress> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5872l0<CustomerAddress> interfaceC5872l0, CustomerAddress customerAddress) {
        interfaceC5872l0.setValue(customerAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, CustomerAddress customerAddress, boolean z10) {
        function1.invoke(customerAddress);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(881582345);
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
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(881582345, i12, -1, "com.meijer.mobile.subscription.ux.checkout.HeaderSection (DeliveryAddressesContent.kt:148)");
            }
            C16453n.i(localThemeScope, new q1.Row(D.m(modifier2, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(513303753, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (q1.Row.f142392d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mr.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.r(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

package mr;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ci.CustomerAddress;
import com.meijer.mobile.subscription.ux.subscription.j;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.List;
import ji.q1;
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
import kr.C15307d;
import l0.C15342b;
import l0.InterfaceC15343c;
import mr.C15700l;
import ni.C15802F;
import ni.P0;
import oi.C16088n;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a[\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001e²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lmr/n;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lci/c;", "", "onSetSelectedAddress", "Lcom/meijer/mobile/subscription/ux/subscription/j;", "onAction", "Lkotlin/Function0;", "onExit", "g", "(LJi/M;Lmr/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "q", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "addresses", "", "isChecked", "onSelectAddress", "k", "(LJi/M;Lci/c;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedAddresses", "n", "(LJi/M;Lci/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "isCheckoutSubscriptionLoading", "showMaxAddresses", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mr.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15700l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mr.l$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> f150668b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150669c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.l$a$a, reason: collision with other inner class name */
        static final class C2320a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f150671b;

            C2320a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f150670a = localThemeScope;
                this.f150671b = function0;
            }

            public final void a(InterfaceC14800I SubscriptionToolbar, Composer composer, int i10) {
                Intrinsics.j(SubscriptionToolbar, "$this$SubscriptionToolbar");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1950053811, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous>.<anonymous> (DeliveryAddressesContent.kt:75)");
                }
                P0.i(this.f150670a, C15802F.f151433a, this.f150671b, C.f.o.f15522e, C16193g.c(C15307d.f147900u, composer, 0), null, false, false, 0L, composer, LocalThemeScope.f15770g | (C15802F.f151434b << 3) | (C.f.o.f15523f << 9), 240);
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
        a(LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.subscription.ux.subscription.j, Unit> function1, Function0<Unit> function0) {
            this.f150667a = localThemeScope;
            this.f150668b = function1;
            this.f150669c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(j.g.f119048a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1934957209, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous> (DeliveryAddressesContent.kt:67)");
            }
            String strC = C16193g.c(C15307d.f147864c, composer, 0);
            C.f.d dVar = C.f.d.f15507e;
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(C15307d.f147872g, new Object[0]);
            LocalThemeScope localThemeScope = this.f150667a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f150668b);
            final Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> function1 = this.f150668b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mr.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15700l.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            jr.m.c(localThemeScope, null, strC, abstractC5607aD, dVar, (Function0) objB, ComposableLambdaKt.c(-1950053811, true, new C2320a(this.f150667a, this.f150669c), composer, 54), composer, 1572864 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9) | (C.f.d.f15508f << 12), 1);
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
    @SourceDebugExtension
    /* renamed from: mr.l$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeliveryAddressesViewState f150672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<CustomerAddress, Unit> f150674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> f150675d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<CustomerAddress> f150676e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.l$b$a */
        static final class a implements Function1<CustomerAddress, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<CustomerAddress> f150677a;

            a(InterfaceC5730l0<CustomerAddress> interfaceC5730l0) {
                this.f150677a = interfaceC5730l0;
            }

            public final void a(CustomerAddress it) {
                Intrinsics.j(it, "it");
                C15700l.i(this.f150677a, it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerAddress customerAddress) {
                a(customerAddress);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.l$b$b, reason: collision with other inner class name */
        static final class C2321b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150678a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeliveryAddressesViewState f150679b;

            C2321b(LocalThemeScope localThemeScope, DeliveryAddressesViewState deliveryAddressesViewState) {
                this.f150678a = localThemeScope;
                this.f150679b = deliveryAddressesViewState;
            }

            public final void a(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1577080171, i10, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeliveryAddressesContent.kt:118)");
                }
                ri.j.h(this.f150678a, new q1.Label(null, null, null, null, 0, false, 0, this.f150678a.getAdsTypography().getDetail().getOne(), null, 383, null), C16193g.d(C15307d.f147834E0, new Object[]{Integer.valueOf(this.f150679b.getNumberOfSavedAddresses())}, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: mr.l$b$c */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final c f150680f = new c();

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
        /* renamed from: mr.l$b$d */
        public static final class d extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f150681f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f150682g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Function1 function1, List list) {
                super(1);
                this.f150681f = function1;
                this.f150682g = list;
            }

            public final Object a(int i10) {
                return this.f150681f.invoke(this.f150682g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        /* renamed from: mr.l$b$e */
        public static final class e extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f150683f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f150684g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0 f150685h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(List list, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0) {
                super(4);
                this.f150683f = list;
                this.f150684g = localThemeScope;
                this.f150685h = interfaceC5730l0;
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
                CustomerAddress customerAddress = (CustomerAddress) this.f150683f.get(i10);
                composer.startReplaceGroup(758002093);
                LocalThemeScope localThemeScope = this.f150684g;
                CustomerAddress customerAddressH = C15700l.h(this.f150685h);
                boolean zE = Intrinsics.e(customerAddressH != null ? customerAddressH.getId() : null, customerAddress.getId());
                composer.startReplaceGroup(5004770);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new a(this.f150685h);
                    composer.t(objB);
                }
                composer.P();
                C15700l.k(localThemeScope, customerAddress, zE, null, (Function1) objB, composer, LocalThemeScope.f15770g | 24576, 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(DeliveryAddressesViewState deliveryAddressesViewState, LocalThemeScope localThemeScope, Function1<? super CustomerAddress, Unit> function1, Function1<? super com.meijer.mobile.subscription.ux.subscription.j, Unit> function12, InterfaceC5730l0<CustomerAddress> interfaceC5730l0) {
            this.f150672a = deliveryAddressesViewState;
            this.f150673b = localThemeScope;
            this.f150674c = function1;
            this.f150675d = function12;
            this.f150676e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(DeliveryAddressesViewState deliveryAddressesViewState, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, l0.w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            List<CustomerAddress> listC = deliveryAddressesViewState.c();
            LazyColumn.i(listC.size(), null, new d(c.f150680f, listC), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(listC, localThemeScope, interfaceC5730l0)));
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1577080171, true, new C2321b(localThemeScope, deliveryAddressesViewState)), 3, null);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14794C paddingValues, Composer composer, int i10) {
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
                ComposerKt.U(1847096608, i11, -1, "com.meijer.mobile.subscription.ux.checkout.DeliveryAddressesContent.<anonymous> (DeliveryAddressesContent.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            final DeliveryAddressesViewState deliveryAddressesViewState = this.f150672a;
            final LocalThemeScope localThemeScope = this.f150673b;
            Function1<CustomerAddress, Unit> function1 = this.f150674c;
            Function1<com.meijer.mobile.subscription.ux.subscription.j, Unit> function12 = this.f150675d;
            final InterfaceC5730l0<CustomerAddress> interfaceC5730l0 = this.f150676e;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            if (deliveryAddressesViewState.getIsCheckoutSubscriptionLoading()) {
                composer.startReplaceGroup(1959563183);
                yr.N.b(localThemeScope, null, composer, LocalThemeScope.f15770g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1959676178);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null);
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                Modifier modifierD = androidx.compose.foundation.layout.J.D(companion, null, false, 3, null);
                int i12 = LocalThemeScope.f15770g;
                C15700l.q(localThemeScope, modifierD, composer, i12 | 48, 0);
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(InterfaceC14814f.b(c14815g, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                C5658d.f fVarO = c5658d.o(localThemeScope.getAdsSpacing().getFour().getDp());
                InterfaceC14794C interfaceC14794CD = androidx.compose.foundation.layout.D.d(localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFour().getDp());
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(deliveryAddressesViewState) | composer.D(localThemeScope);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: mr.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C15700l.b.c(deliveryAddressesViewState, localThemeScope, interfaceC5730l0, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15342b.a(modifierH2, null, interfaceC14794CD, false, fVarO, null, null, false, null, (Function1) objB, composer, 0, 490);
                C15700l.n(localThemeScope, C15700l.h(interfaceC5730l0), null, function1, function12, composer, i12, 2);
                composer.v();
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            b(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mr.l$c */
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150686a;

        c(LocalThemeScope localThemeScope) {
            this.f150686a = localThemeScope;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(513303753, i10, -1, "com.meijer.mobile.subscription.ux.checkout.HeaderSection.<anonymous> (DeliveryAddressesContent.kt:154)");
            }
            LocalThemeScope localThemeScope = this.f150686a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.c.k.f15407e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, this.f150686a.getAdsSpacing().getThree().getDp()), composer, 0);
            ri.j.h(this.f150686a, new q1.Label(null, null, null, null, 0, false, 0, this.f150686a.getAdsTypography().getHeadings().getSix(), null, 383, null), C16193g.c(C15307d.f147898t, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r36, final mr.DeliveryAddressesViewState r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function1<? super ci.CustomerAddress, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.j, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.C15700l.g(Ji.M, mr.n, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, DeliveryAddressesViewState deliveryAddressesViewState, Modifier modifier, Function1 function1, Function1 function12, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, deliveryAddressesViewState, modifier, function1, function12, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void k(final Ji.LocalThemeScope r25, final ci.CustomerAddress r26, final boolean r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function1<? super ci.CustomerAddress, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.C15700l.k(Ji.M, ci.c, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, CustomerAddress customerAddress, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, customerAddress, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ji.LocalThemeScope r19, final ci.CustomerAddress r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super ci.CustomerAddress, kotlin.Unit> r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.j, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.C15700l.n(Ji.M, ci.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(CustomerAddress customerAddress, Function1 function1, Function1 function12) {
        if (customerAddress != null) {
            function12.invoke(customerAddress);
        }
        function1.invoke(j.h.f119049a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, CustomerAddress customerAddress, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, customerAddress, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerAddress h(InterfaceC5730l0<CustomerAddress> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5730l0<CustomerAddress> interfaceC5730l0, CustomerAddress customerAddress) {
        interfaceC5730l0.setValue(customerAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, CustomerAddress customerAddress, boolean z10) {
        function1.invoke(customerAddress);
        return Unit.f142422a;
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
                ComposerKt.U(881582345, i12, -1, "com.meijer.mobile.subscription.ux.checkout.HeaderSection (DeliveryAddressesContent.kt:143)");
            }
            C16088n.i(localThemeScope, new q1.Row(androidx.compose.foundation.layout.D.m(modifier2, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, P0.e.INSTANCE.i(), 2, null), ComposableLambdaKt.c(513303753, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i12 & 14) | (q1.Row.f140137d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mr.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15700l.r(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

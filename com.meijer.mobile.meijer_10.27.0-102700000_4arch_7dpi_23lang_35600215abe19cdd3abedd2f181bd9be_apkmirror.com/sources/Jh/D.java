package Jh;

import Ih.C3734b;
import Ih.C3739g;
import Jh.D;
import Ji.LocalThemeScope;
import P0.e;
import Sh.AddressDecorator;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.meijer.mobile.accounts.ux.addresses.a;
import com.meijer.mobile.accounts.ux.addresses.i;
import j0.C14802K;
import j0.C14815g;
import java.util.List;
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
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\n¨\u0006\u0013²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "j", "(LJi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "g", "", "lastAction", "", "showMaxAddresses", "showEmptyAddressesCard", "showErrorCard", "showSuccessNotification", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class D {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15108a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AddressDecorator f15109b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1, AddressDecorator addressDecorator) {
            this.f15108a = function1;
            this.f15109b = addressDecorator;
        }

        public final void a() {
            this.f15108a.invoke(new a.EditAddress(this.f15109b));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15110a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f15111b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f15112c;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
            this.f15110a = localThemeScope;
            this.f15111b = addressesScreenViewState;
            this.f15112c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.C1319a.f94056a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-282562094, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.AddressList.<anonymous>.<anonymous>.<anonymous> (AddressesScreenContent.kt:91)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10)), 0.0f, 1, null);
            e.Companion companion2 = P0.e.INSTANCE;
            e.b bVarG = companion2.g();
            LocalThemeScope localThemeScope = this.f15110a;
            i.AddressesScreenViewState addressesScreenViewState = this.f15111b;
            final Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> function1 = this.f15112c;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), bVarG, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
            int i11 = Fh.h.f10683e;
            int size = addressesScreenViewState.d().size();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function1);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Jh.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return D.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            int i12 = LocalThemeScope.f15770g;
            C3734b.b(localThemeScope, i11, null, false, size, (Function0) objB, composer, i12, 6);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            AbstractC5607a disclaimerPart1 = addressesScreenViewState.getDisclaimerPart1();
            AbstractC5607a disclaimerPart2 = addressesScreenViewState.getDisclaimerPart2();
            int size2 = addressesScreenViewState.d().size();
            Modifier modifierC = c14815g.c(companion, companion2.g());
            int i13 = AbstractC5607a.f45514b;
            C3739g.b(localThemeScope, disclaimerPart1, disclaimerPart2, size2, modifierC, composer, (i13 << 6) | i12 | (i13 << 3), 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f15113f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f15113f = list;
        }

        public final Object a(int i10) {
            this.f15113f.get(i10);
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
        final /* synthetic */ List f15114f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15115g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f15116h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f15114f = list;
            this.f15115g = localThemeScope;
            this.f15116h = function1;
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
            AddressDecorator addressDecorator = (AddressDecorator) this.f15114f.get(i10);
            composer.startReplaceGroup(244165687);
            composer.startReplaceGroup(-407765930);
            if (i10 == 0) {
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(16)), composer, 6);
            }
            composer.P();
            LocalThemeScope localThemeScope = this.f15115g;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f15116h) | composer.D(addressDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(this.f15116h, addressDecorator);
                composer.t(objB);
            }
            composer.P();
            C3807b.b(localThemeScope, addressDecorator, null, (Function0) objB, composer, LocalThemeScope.f15770g, 2);
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(16)), composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void g(final Ji.LocalThemeScope r19, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.D.g(Ji.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(i.AddressesScreenViewState addressesScreenViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List<AddressDecorator> listD = addressesScreenViewState.d();
        LazyColumn.i(listD.size(), null, new c(listD), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new d(listD, localThemeScope, function1)));
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-282562094, true, new b(localThemeScope, addressesScreenViewState, function1)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, addressesScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r20, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.D.j(Ji.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(a.f.f94061a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1) {
        function1.invoke(a.C1319a.f94056a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(a.i.f94064a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, addressesScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}

package Jh;

import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Sh.AddressSuggestionDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import com.meijer.mobile.accounts.ux.addresses.a;
import com.meijer.mobile.accounts.ux.addresses.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001c²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "h", "(LJi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lqv/O;", "coroutineScope", "Ld0/V;", "scrollState", "q", "(Lqv/O;Ld0/V;Lkotlin/jvm/functions/Function1;Lcom/meijer/mobile/accounts/ux/addresses/i$a;)V", "o", "(LJi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "", "LSh/c;", "addressSuggestions", "", "isLoading", "LSh/e;", "deleteAddressDecorator", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class X {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f15197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f15197f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f15197f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f15199g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f15200h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i.AddressesScreenViewState f15201i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15202j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f15203k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, i.AddressesScreenViewState addressesScreenViewState, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f15199g = nVar;
            this.f15200h = function0;
            this.f15201i = addressesScreenViewState;
            this.f15202j = localThemeScope;
            this.f15203k = function1;
            this.f15198f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f15199g.getHelpersHashCode();
            this.f15199g.i();
            L1.n nVar = this.f15199g;
            composer.startReplaceGroup(-1748284666);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            if (!this.f15201i.c().isEmpty()) {
                composer.startReplaceGroup(-1748178523);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = c.f15204a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
                C3825u.g(this.f15202j, this.f15201i.c(), modifierK, this.f15203k, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            } else if (this.f15201i.getDeleteAddressDecorator() != null) {
                composer.startReplaceGroup(-1747688661);
                O.b(this.f15202j, this.f15201i.getDeleteAddressDecorator(), null, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            } else {
                composer.startReplaceGroup(-1747539241);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = d.f15205a;
                    composer.t(objB2);
                }
                composer.P();
                C3821p.m(this.f15202j, this.f15201i, nVar.k(companion2, hVarC, (Function1) objB2), this.f15203k, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            }
            composer.P();
            if (this.f15199g.getHelpersHashCode() != helpersHashCode) {
                this.f15200h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15204a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15205a = new d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.composables.addresses.EditOrAddAddressContentKt$onSecondaryButtonClick$1", f = "EditOrAddAddressContent.kt", l = {161}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f15206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.V f15207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(d0.V v10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f15207b = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f15207b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f15206a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                d0.V v10 = this.f15207b;
                this.f15206a = 1;
                if (v10.p(0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(InterfaceC5772o interfaceC5772o) {
        InterfaceC5772o.l(interfaceC5772o, false, 1, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(InterfaceC5772o interfaceC5772o) {
        InterfaceC5772o.l(interfaceC5772o, false, 1, null);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r39, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r40, androidx.compose.ui.Modifier r41, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.X.h(Ji.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, addressesScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void o(final LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        final i.AddressesScreenViewState addressesScreenViewState2;
        final Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1330167722);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(addressesScreenViewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            addressesScreenViewState2 = addressesScreenViewState;
            function12 = function1;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1330167722, i11, -1, "com.meijer.mobile.accounts.ux.composables.addresses.MainContent (EditOrAddAddressContent.kt:182)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16705m.d(modifierF, false, new a(a10), 1, null);
            b bVar = new b(nVar, 6, function0B, addressesScreenViewState, localThemeScope, function1);
            addressesScreenViewState2 = addressesScreenViewState;
            function12 = function1;
            androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, bVar), measurePolicyA, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Jh.W
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return X.p(localThemeScope, addressesScreenViewState2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Function1 function1, int i10, Composer composer, int i11) {
        o(localThemeScope, addressesScreenViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    private static final void q(InterfaceC16622O interfaceC16622O, d0.V v10, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1, i.AddressesScreenViewState addressesScreenViewState) {
        C16648k.d(interfaceC16622O, null, null, new e(v10, null), 3, null);
        function1.invoke(!addressesScreenViewState.c().isEmpty() ? a.h.f94063a : addressesScreenViewState.getDeleteAddressDecorator() != null ? a.d.f94059a : a.b.f94057a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC16622O interfaceC16622O, d0.V v10, Function1 function1, i.AddressesScreenViewState addressesScreenViewState) {
        q(interfaceC16622O, v10, function1, addressesScreenViewState);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, i.AddressesScreenViewState addressesScreenViewState) {
        com.meijer.mobile.accounts.ux.addresses.a validate;
        Object next;
        if (!addressesScreenViewState.c().isEmpty()) {
            Iterator<T> it = addressesScreenViewState.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((AddressSuggestionDecorator) next).getIsSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Intrinsics.g(next);
            validate = new a.SaveAddress((AddressSuggestionDecorator) next, addressesScreenViewState.getUnsavedFormChanges());
        } else if (addressesScreenViewState.getDeleteAddressDecorator() != null) {
            validate = new a.DeleteAddress(addressesScreenViewState.getDeleteAddressDecorator().getId());
        } else {
            validate = new a.Validate(addressesScreenViewState.getUnsavedFormChanges());
        }
        function1.invoke(validate);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(InterfaceC16622O interfaceC16622O, d0.V v10, Function1 function1, i.AddressesScreenViewState addressesScreenViewState) {
        q(interfaceC16622O, v10, function1, addressesScreenViewState);
        return Unit.f142422a;
    }
}

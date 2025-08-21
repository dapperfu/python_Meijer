package Kh;

import Hh.a;
import Ik.Validation;
import Kh.C3906o;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.accounts.ux.addresses.a;
import com.meijer.mobile.accounts.ux.addresses.i;
import ki.InterfaceC15166e0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/addresses/i$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/addresses/a;", "", "onResourceAction", "l", "(LKi/M;Lcom/meijer/mobile/accounts/ux/addresses/i$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "checked", "w", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "showDeleteAddressButton", "Lbk/a;", "saveAddressErrorMessage", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Kh.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3906o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kh.o$a */
    static final class a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> f16819c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, Function1<? super com.meijer.mobile.accounts.ux.addresses.a, Unit> function1) {
            this.f16817a = localThemeScope;
            this.f16818b = z10;
            this.f16819c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, boolean z10) {
            function1.invoke(new a.SetAsPrimaryAddress(z10));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15166e0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(687220089, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.SetAsPrimaryAddressToggle.<anonymous>.<anonymous> (AddressForm.kt:226)");
            }
            LocalThemeScope localThemeScope = this.f16817a;
            q1.s.Switch trailingToggleButton = Assemble.getToggleButtons().getTrailingToggleButton();
            boolean z10 = this.f16818b;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f16819c);
            final Function1<com.meijer.mobile.accounts.ux.addresses.a, Unit> function1 = this.f16819c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Kh.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3906o.a.c(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            wi.s.b(localThemeScope, trailingToggleButton, z10, false, false, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.s.Switch.f142438e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
            b(interfaceC15166e0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r62, final com.meijer.mobile.accounts.ux.addresses.i.AddressesScreenViewState r63, androidx.compose.ui.Modifier r64, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r65, androidx.compose.runtime.Composer r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C3906o.l(Ki.M, com.meijer.mobile.accounts.ux.addresses.i$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(a.e.f94905a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, String updatedCity) {
        Intrinsics.j(updatedCity, "updatedCity");
        function1.invoke(new a.OnFormFieldChange(new a.City(new Validation(updatedCity, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, String updateState, int i10) {
        Intrinsics.j(updateState, "updateState");
        function1.invoke(new a.OnFormFieldChange(new a.State(new Validation(updateState, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, String updatedZip) {
        Intrinsics.j(updatedZip, "updatedZip");
        function1.invoke(new a.OnFormFieldChange(new a.ZipCode(new Validation(updatedZip, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, i.AddressesScreenViewState addressesScreenViewState) {
        function1.invoke(new a.ShowDeleteAddressConfirmationView(addressesScreenViewState.getUnsavedFormChanges()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedFirstName) {
        Intrinsics.j(updatedFirstName, "updatedFirstName");
        function1.invoke(new a.OnFormFieldChange(new a.FirstName(new Validation(updatedFirstName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, String updatedLastName) {
        Intrinsics.j(updatedLastName, "updatedLastName");
        function1.invoke(new a.OnFormFieldChange(new a.LastName(new Validation(updatedLastName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, String updatedStreetAddress) {
        Intrinsics.j(updatedStreetAddress, "updatedStreetAddress");
        function1.invoke(new a.OnFormFieldChange(new a.StreetAddress(new Validation(updatedStreetAddress, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, String updatedApartment) {
        Intrinsics.j(updatedApartment, "updatedApartment");
        function1.invoke(new a.OnFormFieldChange(new a.Apartment(null, updatedApartment, 1, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, i.AddressesScreenViewState addressesScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, addressesScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void w(final Ki.LocalThemeScope r27, final boolean r28, androidx.compose.ui.Modifier r29, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.addresses.a, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C3906o.w(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, z10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

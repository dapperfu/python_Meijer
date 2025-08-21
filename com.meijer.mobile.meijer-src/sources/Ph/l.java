package Ph;

import Ki.LocalThemeScope;
import Ph.l;
import Qh.K;
import Xh.PreferenceGroup;
import Xh.PreferenceItem;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.accounts.ux.preferences.g;
import com.meijer.mobile.accounts.ux.preferences.k;
import j0.C14890K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import yr.C18355j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0015²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/accounts/ux/preferences/g$b;", "viewState", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/preferences/k;", "", "onAction", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/accounts/ux/preferences/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isLoading", "isSaveEnabled", "showSuccessNotification", "showErrorNotification", "Lbk/a;", "errorMessage", "showErrorCard", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.PreferenceScreenViewState f25825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25826b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> f25827c;

        /* JADX WARN: Multi-variable type inference failed */
        a(g.PreferenceScreenViewState preferenceScreenViewState, LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.preferences.k, Unit> function1) {
            this.f25825a = preferenceScreenViewState;
            this.f25826b = localThemeScope;
            this.f25827c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(k.d.f95540a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1) {
            function1.invoke(k.c.f95539a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1) {
            function1.invoke(k.b.f95538a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1, PreferenceGroup preferenceGroup, PreferenceItem updatedPreference) {
            Intrinsics.j(updatedPreference, "updatedPreference");
            function1.invoke(new k.OnPreferenceChange(updatedPreference, preferenceGroup));
            return Unit.f143329a;
        }

        public final void e(InterfaceC15433c item, Composer composer, int i10) {
            Composer composer2 = composer;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1982379722, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PreferenceScreenContent.kt:62)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            C14890K.a(J.i(companion, H1.h.p(f10)), composer2, 6);
            composer2.startReplaceGroup(1898569527);
            if (this.f25825a.getShowSuccessNotification()) {
                LocalThemeScope localThemeScope = this.f25826b;
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(this.f25827c);
                final Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function1 = this.f25827c;
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Ph.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.a.f(function1);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                K.b(localThemeScope, null, (Function0) objB, composer2, LocalThemeScope.f17314g, 1);
                C14890K.a(J.i(companion, H1.h.p(f10)), composer2, 6);
            }
            composer2.P();
            composer2.startReplaceGroup(1898578598);
            if (!C6393b.a(this.f25825a.getErrorMessage())) {
                Modifier modifierK = D.k(companion, H1.h.p(f10), 0.0f, 2, null);
                AbstractC6392a errorMessage = this.f25825a.getErrorMessage();
                LocalThemeScope localThemeScope2 = this.f25826b;
                composer2.startReplaceGroup(5004770);
                boolean zV2 = composer2.V(this.f25827c);
                final Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function12 = this.f25827c;
                Object objB2 = composer2.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Ph.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.a.g(function12);
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                Qh.o.b(localThemeScope2, errorMessage, modifierK, (Function0) objB2, composer, (AbstractC6392a.f60445b << 3) | LocalThemeScope.f17314g | 384, 0);
                composer2 = composer;
                C14890K.a(J.i(companion, H1.h.p(f10)), composer2, 6);
            }
            composer2.P();
            if (this.f25825a.getShowErrorCard()) {
                composer2.startReplaceGroup(-1273134373);
                LocalThemeScope localThemeScope3 = this.f25826b;
                composer2.startReplaceGroup(5004770);
                boolean zV3 = composer2.V(this.f25827c);
                final Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function13 = this.f25827c;
                Object objB3 = composer2.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Ph.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.a.k(function13);
                        }
                    };
                    composer2.t(objB3);
                }
                composer2.P();
                C18355j.b(localThemeScope3, null, 0, null, 0, null, null, 0, null, null, null, null, null, null, (Function0) objB3, composer, LocalThemeScope.f17314g, 0, 8191);
                C14890K.a(J.i(companion, H1.h.p(f10)), composer, 6);
                composer.P();
            } else {
                composer2.startReplaceGroup(-1272881909);
                List<PreferenceGroup> listN = this.f25825a.n();
                g.PreferenceScreenViewState preferenceScreenViewState = this.f25825a;
                LocalThemeScope localThemeScope4 = this.f25826b;
                final Function1<com.meijer.mobile.accounts.ux.preferences.k, Unit> function14 = this.f25827c;
                int i11 = 0;
                for (Object obj : listN) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    final PreferenceGroup preferenceGroup = (PreferenceGroup) obj;
                    int i13 = i11;
                    boolean isVerificationLoading = preferenceScreenViewState.getIsVerificationLoading();
                    boolean showUnverifiedEmailMessage = preferenceScreenViewState.getShowUnverifiedEmailMessage();
                    boolean showVerificationSentMessage = preferenceScreenViewState.getShowVerificationSentMessage();
                    AbstractC6392a categoryTitle = preferenceGroup.getCategoryTitle();
                    List<PreferenceItem> listD = preferenceGroup.d();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV4 = composer2.V(function14) | composer2.D(preferenceGroup);
                    Object objB4 = composer2.B();
                    if (zV4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: Ph.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return l.a.l(function14, preferenceGroup, (PreferenceItem) obj2);
                            }
                        };
                        composer2.t(objB4);
                    }
                    composer2.P();
                    d.b(localThemeScope4, isVerificationLoading, showUnverifiedEmailMessage, showVerificationSentMessage, categoryTitle, listD, null, (Function1) objB4, function14, composer, (AbstractC6392a.f60445b << 12) | LocalThemeScope.f17314g, 32);
                    composer2 = composer;
                    C14890K.a(J.i(Modifier.INSTANCE, i13 == CollectionsKt.o(preferenceScreenViewState.f()) ? H1.h.p(32) : H1.h.p(f10)), composer2, 0);
                    i11 = i12;
                }
                composer2.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            e(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, final com.meijer.mobile.accounts.ux.preferences.g.PreferenceScreenViewState r31, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.preferences.k, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ph.l.d(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.accounts.ux.preferences.g$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(g.PreferenceScreenViewState preferenceScreenViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1982379722, true, new a(preferenceScreenViewState, localThemeScope, function1)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(k.i.f95546a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, g.PreferenceScreenViewState preferenceScreenViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, preferenceScreenViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

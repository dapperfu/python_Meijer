package Ph;

import Ki.LocalThemeScope;
import Ki.Q;
import Ph.r;
import Xh.PreferenceItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import ki.InterfaceC15166e0;
import ki.q1;
import ki.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LXh/b;", "preferenceItem", "Lkotlin/Function1;", "", "onPreferenceCheckChange", "b", "(LKi/M;LXh/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f25872a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreferenceItem f25873b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<PreferenceItem, Unit> f25874c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, PreferenceItem preferenceItem, Function1<? super PreferenceItem, Unit> function1) {
            this.f25872a = localThemeScope;
            this.f25873b = preferenceItem;
            this.f25874c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, PreferenceItem preferenceItem, boolean z10) {
            function1.invoke(PreferenceItem.b(preferenceItem, null, null, z10, false, null, null, 59, null));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15166e0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-886717784, i10, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceSwitch.<anonymous> (PreferenceSwitch.kt:31)");
            }
            LocalThemeScope localThemeScope = this.f25872a;
            q1.s.Switch trailingToggleButton = Assemble.getToggleButtons().getTrailingToggleButton();
            boolean checked = this.f25873b.getChecked();
            boolean enabled = this.f25873b.getEnabled();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f25874c) | composer.D(this.f25873b);
            final Function1<PreferenceItem, Unit> function1 = this.f25874c;
            final PreferenceItem preferenceItem = this.f25873b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ph.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.c(function1, preferenceItem, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            wi.s.b(localThemeScope, trailingToggleButton, checked, enabled, false, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.s.Switch.f142438e << 3), 8);
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

    public static final void b(final LocalThemeScope localThemeScope, final PreferenceItem preferenceItem, final Function1<? super PreferenceItem, Unit> onPreferenceCheckChange, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(preferenceItem, "preferenceItem");
        Intrinsics.j(onPreferenceCheckChange, "onPreferenceCheckChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-615760325);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(preferenceItem) : composerStartRestartGroup.D(preferenceItem) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onPreferenceCheckChange) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-615760325, i11, -1, "com.meijer.mobile.accounts.ux.composables.preferences.PreferenceSwitch (PreferenceSwitch.kt:29)");
            }
            Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(-886717784, true, new a(localThemeScope, preferenceItem, onPreferenceCheckChange), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (s1.i.f142483b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ph.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.c(localThemeScope, preferenceItem, onPreferenceCheckChange, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, PreferenceItem preferenceItem, Function1 function1, int i10, Composer composer, int i11) {
        b(localThemeScope, preferenceItem, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}

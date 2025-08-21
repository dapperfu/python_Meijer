package oo;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import co.AbstractC6536h;
import co.AbstractC6537i;
import co.EnumC6534f;
import com.meijer.mobile.mperks.ux.j0;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.MccEnrollmentState;
import no.PointsExpState;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a·\u0001\u0010\u001c\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0081\u0001\u0010\u001f\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006\"²\u0006\u000e\u0010!\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lno/d;", "pointsExpirationState", "Loo/o;", "earnAvailableViewState", "Lno/c;", "mccEnrollmentState", "Loo/v;", "earnInProgressState", "", "earnTabIndex", "", "isDashboardSimplifiedUIEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lgi/d;", "googleAdData", "Lkotlin/Function1;", "", "onEarnTabSelected", "Lkotlin/Function0;", "onViewDisclaimersBottomSheetClick", "Lco/h;", "onNavigationRequest", "Lco/i;", "onResourceAction", "Lgi/a;", "onGoogleAdClicked", "i", "(LKi/M;Lno/d;Loo/o;Lno/c;Loo/v;IZLandroidx/compose/ui/Modifier;Lgi/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "onEarnPillsSelected", "m", "(LKi/M;Lno/c;Loo/v;Loo/o;IZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "subHeaderTextResId", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class W {
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147 A[PHI: r25
      0x0147: PHI (r25v14 int) = (r25v4 int), (r25v10 int), (r25v11 int) binds: [B:89:0x0145, B:99:0x0162, B:98:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r28, final no.PointsExpState r29, final oo.EarnAvailableViewState r30, final no.MccEnrollmentState r31, final oo.EarnInProgressState r32, final int r33, final boolean r34, androidx.compose.ui.Modifier r35, gi.GoogleAdData r36, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super gi.GoogleAdAnalytics, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.W.i(Ki.M, no.d, oo.o, no.c, oo.v, int, boolean, androidx.compose.ui.Modifier, gi.d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m(final Ki.LocalThemeScope r64, final no.MccEnrollmentState r65, final oo.EarnInProgressState r66, final oo.EarnAvailableViewState r67, final int r68, final boolean r69, androidx.compose.ui.Modifier r70, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r71, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r72, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r73, androidx.compose.runtime.Composer r74, final int r75, final int r76) {
        /*
            Method dump skipped, instructions count: 2141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.W.m(Ki.M, no.c, oo.v, oo.o, int, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(AbstractC6536h.m.f62753a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, GoogleAdAnalytics googleAdAnalytics) {
        Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
        function1.invoke(googleAdAnalytics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, PointsExpState pointsExpState, EarnAvailableViewState earnAvailableViewState, MccEnrollmentState mccEnrollmentState, EarnInProgressState earnInProgressState, int i10, boolean z10, Modifier modifier, GoogleAdData googleAdData, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Function1 function14, int i11, int i12, int i13, Composer composer, int i14) {
        i(localThemeScope, pointsExpState, earnAvailableViewState, mccEnrollmentState, earnInProgressState, i10, z10, modifier, googleAdData, function1, function0, function12, function13, function14, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, Function1 function12, InterfaceC5868j0 interfaceC5868j0) {
        EnumC6534f enumC6534f = EnumC6534f.f62714a;
        function1.invoke(Integer.valueOf(enumC6534f.ordinal()));
        n(interfaceC5868j0, j0.f115168j0);
        function12.invoke(new AbstractC6537i.EarnTabAnalyticsFlagUpdate(false, enumC6534f));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, Function1 function12, InterfaceC5868j0 interfaceC5868j0) {
        EnumC6534f enumC6534f = EnumC6534f.f62715b;
        function1.invoke(Integer.valueOf(enumC6534f.ordinal()));
        n(interfaceC5868j0, j0.f115168j0);
        function12.invoke(new AbstractC6537i.EarnTabAnalyticsFlagUpdate(false, enumC6534f));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, Function1 function12, InterfaceC5868j0 interfaceC5868j0) {
        EnumC6534f enumC6534f = EnumC6534f.f62716c;
        function1.invoke(Integer.valueOf(enumC6534f.ordinal()));
        n(interfaceC5868j0, j0.f115164i0);
        function12.invoke(new AbstractC6537i.EarnTabAnalyticsFlagUpdate(false, enumC6534f));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, MccEnrollmentState mccEnrollmentState, EarnInProgressState earnInProgressState, EarnAvailableViewState earnAvailableViewState, int i10, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i11, int i12, Composer composer, int i13) {
        m(localThemeScope, mccEnrollmentState, earnInProgressState, earnAvailableViewState, i10, z10, modifier, function1, function12, function13, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    private static final void n(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    private static final int t(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }
}

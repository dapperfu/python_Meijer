package Dm;

import H1.h;
import Ki.C;
import Ki.LocalThemeScope;
import Nr.g;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import co.AbstractC6537i;
import co.ClaimReward;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j0.C14890K;
import j0.InterfaceC14888I;
import ki.j1;
import ki.q1;
import ko.ClaimTabState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;
import qi.C16671b;
import si.j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aY\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LKi/M;", "", "mPerksPointBalance", "Lko/d;", "claimTabState", "Landroidx/compose/ui/Modifier;", "modifier", "", "isFromCart", "Lkotlin/Function0;", "", "onDismiss", "Lkotlin/Function1;", "Lco/i;", "onResourceAction", "d", "(LKi/M;ILko/d;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onRetry", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "a", "Lko/d;", "mockClaimTabState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ClaimTabState f6341a = new ClaimTabState(false, false, false, CollectionsKt.e(new ClaimReward(100773, "https://static.meijer.com/DigitalCoupon/pharmacyicon.jpg", "testing", "for every qualifying prescription filled at Meijer Pharmacy", ZonedDateTime.of(2022, 12, 3, 12, 20, 59, 90000, ZoneId.systemDefault()), ZonedDateTime.of(2032, 12, 3, 12, 20, 59, 90000, ZoneId.systemDefault()), "excludes free prescriptions ", 90, null, false, false, 1792, null)), null, false, null, false, false, false, 1014, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6342a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f6343b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dm.d$a$a, reason: collision with other inner class name */
        static final class C0120a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6344a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f6345b;

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1539250001, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.claimrewards.ClaimableRewardsError.<anonymous>.<anonymous>.<anonymous> (ClaimRewardsBottomSheet.kt:193)");
                }
                LocalThemeScope localThemeScope = this.f6344a;
                q1.h.DrawableIcon drawableIconY = q1.h.DrawableIcon.y(this.f6345b.getIcons().getEnabledIcon(), C.a.y.f16910e, null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIconY, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                C14890K.a(J.z(Modifier.INSTANCE, h.p(8)), composer, 6);
                j.h(this.f6344a, this.f6345b.getLabels().getEnabledLabel(), C16338g.c(g.f22679b0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            C0120a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f6344a = localThemeScope;
                this.f6345b = j1Var;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f6342a = localThemeScope;
            this.f6343b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1196139132, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.claimrewards.ClaimableRewardsError.<anonymous>.<anonymous> (ClaimRewardsBottomSheet.kt:187)");
            }
            E0.b(this.f6342a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, D.m(Modifier.INSTANCE, 0.0f, h.p(32), 0.0f, 0.0f, 13, null), false, null, 895, null), this.f6343b, ComposableLambdaKt.c(-1539250001, true, new C0120a(this.f6342a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r50, final int r51, final ko.ClaimTabState r52, androidx.compose.ui.Modifier r53, boolean r54, final kotlin.jvm.functions.Function0<kotlin.Unit> r55, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dm.d.d(Ki.M, int, ko.d, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(AbstractC6537i.j.f62770a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, int i10, ClaimTabState claimTabState, Modifier modifier, boolean z10, Function0 function0, Function1 function1, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, i10, claimTabState, modifier, z10, function0, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dm.d.g(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

package wp;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.meijer.mobile.rateandtip.ux.C12702a;
import j0.C14802K;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import oi.C16088n;
import p1.C16193g;
import pi.C16307b;
import yp.AbstractC18267a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "orderTotalPrice", "Lyp/a;", "cardDetails", "", "b", "(LJi/M;Landroidx/compose/ui/Modifier;DLyp/a;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wp.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17845b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wp.b$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f166275b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC18267a f166276c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$a$a, reason: collision with other inner class name */
        static final class C2638a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f166278b;

            C2638a(LocalThemeScope localThemeScope, double d10) {
                this.f166277a = localThemeScope;
                this.f166278b = d10;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-908122216, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous>.<anonymous> (OrderInfoSection.kt:42)");
                }
                LocalThemeScope localThemeScope = this.f166277a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f166277a.getAdsTypography().getBodyCompact().getOne(), null, 383, null);
                String strC = C16193g.c(C12702a.f115110r, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                int i12 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                C14802K.a(J.z(Modifier.INSTANCE, this.f166277a.getAdsSpacing().getTwo().getDp()), composer, 0);
                ri.j.h(this.f166277a, new q1.Label(null, null, null, null, 0, false, 0, this.f166277a.getAdsTypography().getValues().getThree(), null, 383, null), C16193g.d(C12702a.f115102j, new Object[]{Double.valueOf(this.f166278b)}, composer, 0), null, composer, i11 | (i12 << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$a$b, reason: collision with other inner class name */
        static final class C2639b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f166279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18267a f166280b;

            C2639b(LocalThemeScope localThemeScope, AbstractC18267a abstractC18267a) {
                this.f166279a = localThemeScope;
                this.f166280b = abstractC18267a;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1531753137, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous>.<anonymous> (OrderInfoSection.kt:56)");
                }
                LocalThemeScope localThemeScope = this.f166279a;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f166280b.getCardIcon(), null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
                C14802K.a(J.z(Modifier.INSTANCE, this.f166279a.getAdsSpacing().getFour().getDp()), composer, 0);
                ri.j.h(this.f166279a, new q1.Label(null, null, null, null, 0, false, 0, this.f166279a.getAdsTypography().getBody().getOne(), null, 383, null), C6408b.a(this.f166280b.getMaskedCardNumber(), composer, AbstractC5607a.f45514b), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

        a(LocalThemeScope localThemeScope, double d10, AbstractC18267a abstractC18267a) {
            this.f166274a = localThemeScope;
            this.f166275b = d10;
            this.f166276c = abstractC18267a;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1084058664, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous> (OrderInfoSection.kt:41)");
            }
            LocalThemeScope localThemeScope = this.f166274a;
            q1.Row row = new q1.Row(null, null, null, 7, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-908122216, true, new C2638a(this.f166274a, this.f166275b), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Row.f140137d;
            C16088n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
            C14802K.a(J.i(Modifier.INSTANCE, this.f166274a.getAdsSpacing().getTwo().getDp()), composer, 0);
            C16088n.i(this.f166274a, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(-1531753137, true, new C2639b(this.f166274a, this.f166276c), composer, 54), composer, i11 | 384 | (i12 << 3));
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

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final double d10, final AbstractC18267a cardDetails, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(cardDetails, "cardDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357628830);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.g(d10) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(cardDetails) : composerStartRestartGroup.D(cardDetails) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1357628830, i12, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection (OrderInfoSection.kt:33)");
            }
            C16088n.e(localThemeScope, new q1.Column(modifier3, null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(-1084058664, true, new a(localThemeScope, d10, cardDetails), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wp.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17845b.c(localThemeScope, modifier2, d10, cardDetails, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, double d10, AbstractC18267a abstractC18267a, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, d10, abstractC18267a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}

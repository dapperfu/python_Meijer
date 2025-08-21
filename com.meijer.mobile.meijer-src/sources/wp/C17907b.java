package wp;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.rateandtip.ux.C12828a;
import dk.C13698b;
import j0.C14890K;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import yp.AbstractC18338a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "orderTotalPrice", "Lyp/a;", "cardDetails", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;DLyp/a;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17907b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wp.b$a */
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167342a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f167343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC18338a f167344c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$a$a, reason: collision with other inner class name */
        static final class C2663a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167345a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f167346b;

            C2663a(LocalThemeScope localThemeScope, double d10) {
                this.f167345a = localThemeScope;
                this.f167346b = d10;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-908122216, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous>.<anonymous> (OrderInfoSection.kt:42)");
                }
                LocalThemeScope localThemeScope = this.f167345a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f167345a.getAdsTypography().getBodyCompact().getOne(), null, 383, null);
                String strC = C16338g.c(C12828a.f116055r, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.z(Modifier.INSTANCE, this.f167345a.getAdsSpacing().getTwo().getDp()), composer, 0);
                si.j.h(this.f167345a, new q1.Label(null, null, null, null, 0, false, 0, this.f167345a.getAdsTypography().getValues().getThree(), null, 383, null), C16338g.d(C12828a.f116047j, new Object[]{Double.valueOf(this.f167346b)}, composer, 0), null, composer, i11 | (i12 << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$a$b, reason: collision with other inner class name */
        static final class C2664b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167347a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC18338a f167348b;

            C2664b(LocalThemeScope localThemeScope, AbstractC18338a abstractC18338a) {
                this.f167347a = localThemeScope;
                this.f167348b = abstractC18338a;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1531753137, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous>.<anonymous> (OrderInfoSection.kt:56)");
                }
                LocalThemeScope localThemeScope = this.f167347a;
                q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f167348b.getCardIcon(), null, null, null, 0.0f, null, null, 126, null);
                int i11 = LocalThemeScope.f17314g;
                C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
                C14890K.a(J.z(Modifier.INSTANCE, this.f167347a.getAdsSpacing().getFour().getDp()), composer, 0);
                si.j.h(this.f167347a, new q1.Label(null, null, null, null, 0, false, 0, this.f167347a.getAdsTypography().getBody().getOne(), null, 383, null), C13698b.a(this.f167348b.getMaskedCardNumber(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, double d10, AbstractC18338a abstractC18338a) {
            this.f167342a = localThemeScope;
            this.f167343b = d10;
            this.f167344c = abstractC18338a;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1084058664, i10, -1, "com.meijer.mobile.rateandtip.ux.compose.OrderInfoSection.<anonymous> (OrderInfoSection.kt:41)");
            }
            LocalThemeScope localThemeScope = this.f167342a;
            q1.Row row = new q1.Row(null, null, null, 7, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-908122216, true, new C2663a(this.f167342a, this.f167343b), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Row.f142392d;
            C16453n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
            C14890K.a(J.i(Modifier.INSTANCE, this.f167342a.getAdsSpacing().getTwo().getDp()), composer, 0);
            C16453n.i(this.f167342a, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(-1531753137, true, new C2664b(this.f167342a, this.f167344c), composer, 54), composer, i11 | 384 | (i12 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final double d10, final AbstractC18338a cardDetails, Composer composer, final int i10, final int i11) {
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
            C16453n.e(localThemeScope, new q1.Column(modifier3, null, P0.e.INSTANCE.g(), 2, null), ComposableLambdaKt.c(-1084058664, true, new a(localThemeScope, d10, cardDetails), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
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
                    return C17907b.c(localThemeScope, modifier2, d10, cardDetails, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, double d10, AbstractC18338a abstractC18338a, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, d10, abstractC18338a, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

package Hn;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14815g;
import java.util.List;
import ji.q1;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ok.GasStationAmenity;
import p1.C16193g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aC\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LHn/J;", "viewState", "", "expandedContentDescription", "collapsedContentDescription", "servicesAmenitiesHeaderText", "", "g", "(LJi/M;Landroidx/compose/ui/Modifier;LHn/J;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "Lok/d;", "amenities", "e", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "", "rotationState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Hn.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3679h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Hn.h$a */
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f12993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoreDetailState f12994b;

        a(LocalThemeScope localThemeScope, StoreDetailState storeDetailState) {
            this.f12993a = localThemeScope;
            this.f12994b = storeDetailState;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-795465790, i10, -1, "com.meijer.mobile.meijer.activity.store.compose.GasStationAmenitiesSection.<anonymous>.<anonymous> (GasStationAmenitiesSection.kt:106)");
            }
            LocalThemeScope localThemeScope = this.f12993a;
            StoreDetailState storeDetailState = this.f12994b;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            List<List<GasStationAmenity>> listH = storeDetailState.h();
            int i11 = LocalThemeScope.f15770g;
            C3679h.e(localThemeScope, null, listH, composer, i11, 1);
            ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.j(companion, H1.h.p(14), H1.h.p(20)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 382, null), C16193g.c(Vq.c.f37753m, composer, 0), null, composer, (q1.Label.f140080j << 3) | i11, 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r36, androidx.compose.ui.Modifier r37, final Hn.StoreDetailState r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.C3679h.g(Ji.M, androidx.compose.ui.Modifier, Hn.J, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ji.LocalThemeScope r37, androidx.compose.ui.Modifier r38, final java.util.List<? extends java.util.List<ok.GasStationAmenity>> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.C3679h.e(Ji.M, androidx.compose.ui.Modifier, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, List list, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, list, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(String str, String str2, String str3, InterfaceC5730l0 interfaceC5730l0, r1.u clearAndSetSemantics) {
        Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(". ");
        if (!h(interfaceC5730l0)) {
            str2 = str3;
        }
        sb2.append(str2);
        r1.s.g0(clearAndSetSemantics, sb2.toString());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, StoreDetailState storeDetailState, String str, String str2, String str3, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, storeDetailState, str, str2, str3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final boolean h(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final float i(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC5730l0 interfaceC5730l0) {
        m(interfaceC5730l0, !h(interfaceC5730l0));
        return Unit.f142422a;
    }

    private static final void m(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}

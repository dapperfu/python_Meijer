package Kh;

import Fh.a;
import Hh.s;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16190d;
import p1.C16193g;
import yr.C18299z;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0015\u001aA\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010\f\u001a\u001d\u0010 \u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b \u0010\f\u001a\u001d\u0010!\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b!\u0010\f¨\u0006'²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LHh/s$b;", "profileCardViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "t", "(LJi/M;LHh/s$b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "A", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LHh/s$a;", "profileCardInfo", "w", "(LJi/M;LHh/s$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lak/a;", "emptyStateTitle", "emptyStateDescription", "y", "(LJi/M;Lak/a;Lak/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "firstName", "lastName", "l", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "", "label", "C", "(LJi/M;LJi/C;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "p", "r", "n", "lastAction", "", "isLoading", "showEmptyState", "showEmptyBirthdayUI", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class D0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16575a;

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1582242493, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.MperksPinAndPassword.<anonymous> (ProfileCard.kt:283)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.x.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), j0.x.f139159a), this.f16575a.getAdsSpacing().getFour().getDp(), this.f16575a.getAdsSpacing().getTwo().getDp());
            C5658d.f fVarD = C5658d.f48555a.d();
            LocalThemeScope localThemeScope = this.f16575a;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarD, companion2.l(), composer, 6);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            int i11 = LocalThemeScope.f15770g;
            D0.r(localThemeScope, null, composer, i11, 1);
            C17917Z.a(c14801j.d(androidx.compose.foundation.layout.J.c(androidx.compose.foundation.layout.J.z(companion, H1.h.p(1)), 0.8f), companion2.i()), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), 0.0f, 0.0f, composer, 0, 12);
            D0.n(localThemeScope, null, composer, i11, 1);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope) {
            this.f16575a = localThemeScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f16577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.ProfileCardViewState f16578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f16579d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Modifier modifier, s.ProfileCardViewState profileCardViewState, Function1<? super Fh.a, Unit> function1) {
            this.f16576a = localThemeScope;
            this.f16577b = modifier;
            this.f16578c = profileCardViewState;
            this.f16579d = function1;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-612842326, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.ProfileCard.<anonymous> (ProfileCard.kt:77)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f16576a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope2 = this.f16576a;
            Modifier modifier = this.f16577b;
            s.ProfileCardViewState profileCardViewState = this.f16578c;
            Function1<Fh.a, Unit> function1 = this.f16579d;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            int i11 = LocalThemeScope.f15770g;
            D0.A(localThemeScope2, modifierH, composer, i11 | 48, 0);
            C14802K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope2.getAdsSpacing().getThree().getDp()), composer, 0);
            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            Composer composer2 = composer;
            if (profileCardViewState.getIsLoading()) {
                composer2.startReplaceGroup(1543028597);
                yr.N.b(localThemeScope2, null, composer2, i11, 1);
                composer2.P();
            } else {
                composer2.startReplaceGroup(1543132168);
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope2.getAdsSpacing().getFive().getDp()), composer2, 0);
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer2, 0);
                int iA2 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierH2);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                Modifier modifierF = C18299z.f(companion, "profile_image", null, 2, null);
                Z0.c cVarC = C16190d.c(Fh.e.f10442C, composer2, 0);
                int i12 = Fh.h.f10786s4;
                s.ProfileCardInfo profileCardInfo = profileCardViewState.getProfileCardInfo();
                AbstractC5607a firstName = profileCardInfo != null ? profileCardInfo.getFirstName() : null;
                composer2.startReplaceGroup(-835699512);
                String strB = firstName == null ? null : firstName.b((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                composer2.P();
                if (strB == null) {
                    strB = "";
                }
                s.ProfileCardInfo profileCardInfo2 = profileCardViewState.getProfileCardInfo();
                AbstractC5607a lastName = profileCardInfo2 != null ? profileCardInfo2.getLastName() : null;
                composer2.startReplaceGroup(-835693624);
                String strB2 = lastName == null ? null : lastName.b((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                composer2.P();
                C13457y.a(cVarC, C16193g.d(i12, new Object[]{strB, strB2 != null ? strB2 : ""}, composer2, 0), modifierF, null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                composer2 = composer;
                C14802K.a(androidx.compose.foundation.layout.J.z(modifier, localThemeScope2.getAdsSpacing().getSeven().getDp()), composer2, 0);
                if (profileCardViewState.getProfileCardInfo() != null) {
                    composer2.startReplaceGroup(-136407197);
                    localThemeScope = localThemeScope2;
                    D0.w(localThemeScope, profileCardViewState.getProfileCardInfo(), null, function1, composer2, i11 | (AbstractC5607a.f45514b << 3), 2);
                    composer2.P();
                } else {
                    localThemeScope = localThemeScope2;
                    composer2.startReplaceGroup(-136155353);
                    AbstractC5607a emptyStateTitle = profileCardViewState.getEmptyStateTitle();
                    AbstractC5607a emptyStateDescription = profileCardViewState.getEmptyStateDescription();
                    int i13 = AbstractC5607a.f45514b;
                    D0.y(localThemeScope, emptyStateTitle, emptyStateDescription, null, composer2, (i13 << 3) | i11 | (i13 << 6), 4);
                    composer2.P();
                }
                composer2.v();
                C14802K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
                if (profileCardViewState.getProfileCardInfo() != null) {
                    D0.p(localThemeScope, null, composer2, i11, 1);
                }
                composer2.P();
            }
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(Ji.LocalThemeScope r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.A(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void C(final Ji.LocalThemeScope r34, final Ji.C r35, java.lang.String r36, androidx.compose.ui.Modifier r37, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.C(Ji.M, Ji.C, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function1 function1) {
        function1.invoke(new a.Profile(false, true));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, Ji.C c10, String str, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        C(localThemeScope, c10, str, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void l(final Ji.LocalThemeScope r30, final ak.AbstractC5607a r31, final ak.AbstractC5607a r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.l(Ji.M, ak.a, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, abstractC5607a, abstractC5607a2, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(Ji.LocalThemeScope r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.n(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = -1192261216(0xffffffffb8ef89a0, float:-1.1422043E-4)
            r4 = r18
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            r5 = 4
            if (r4 == 0) goto L18
            r4 = r1 | 6
            goto L31
        L18:
            r4 = r1 & 6
            if (r4 != 0) goto L30
            r4 = r1 & 8
            if (r4 != 0) goto L25
            boolean r4 = r13.V(r0)
            goto L29
        L25:
            boolean r4 = r13.D(r0)
        L29:
            if (r4 == 0) goto L2d
            r4 = r5
            goto L2e
        L2d:
            r4 = 2
        L2e:
            r4 = r4 | r1
            goto L31
        L30:
            r4 = r1
        L31:
            r6 = r2 & 1
            if (r6 == 0) goto L3a
            r4 = r4 | 48
        L37:
            r7 = r17
            goto L4c
        L3a:
            r7 = r1 & 48
            if (r7 != 0) goto L37
            r7 = r17
            boolean r8 = r13.V(r7)
            if (r8 == 0) goto L49
            r8 = 32
            goto L4b
        L49:
            r8 = 16
        L4b:
            r4 = r4 | r8
        L4c:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L5e
            boolean r8 = r13.j()
            if (r8 != 0) goto L59
            goto L5e
        L59:
            r13.K()
            r4 = r7
            goto Lb5
        L5e:
            if (r6 == 0) goto L63
            androidx.compose.ui.Modifier$a r6 = androidx.compose.ui.Modifier.INSTANCE
            goto L64
        L63:
            r6 = r7
        L64:
            boolean r7 = androidx.compose.runtime.ComposerKt.M()
            if (r7 == 0) goto L70
            r7 = -1
            java.lang.String r8 = "com.meijer.mobile.accounts.ux.composables.basescreen.MperksPinAndPassword (ProfileCard.kt:276)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r7, r8)
        L70:
            Ji.z r3 = r0.getAdsColors()
            Ji.T r3 = r3.getAdsColorUIBackground02()
            long r7 = r3.getColor()
            float r3 = (float) r5
            float r3 = H1.h.p(r3)
            r0.h r5 = r0.C16692i.c(r3)
            r3 = 0
            float r3 = (float) r3
            float r11 = H1.h.p(r3)
            Kh.D0$a r3 = new Kh.D0$a
            r3.<init>(r0)
            r9 = 54
            r10 = -1582242493(0xffffffffa1b0e543, float:-1.1986909E-18)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r10, r12, r3, r13, r9)
            int r3 = r4 >> 3
            r3 = r3 & 14
            r4 = 1769472(0x1b0000, float:2.479558E-39)
            r14 = r3 | r4
            r15 = 24
            r4 = r6
            r6 = r7
            r8 = 0
            r10 = 0
            kotlin.C17985y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.M()
            if (r3 == 0) goto Lb5
            androidx.compose.runtime.ComposerKt.T()
        Lb5:
            androidx.compose.runtime.T0 r3 = r13.l()
            if (r3 == 0) goto Lc3
            Kh.y0 r5 = new Kh.y0
            r5.<init>()
            r3.a(r5)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.p(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(Ji.LocalThemeScope r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.r(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ji.LocalThemeScope r21, final Hh.s.ProfileCardViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.t(Ji.M, Hh.s$b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(new a.Profile(false, false, 2, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, s.ProfileCardViewState profileCardViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, profileCardViewState, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r33, final Hh.s.ProfileCardInfo r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.w(Ji.M, Hh.s$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, s.ProfileCardInfo profileCardInfo, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, profileCardInfo, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final Ji.LocalThemeScope r39, final ak.AbstractC5607a r40, final ak.AbstractC5607a r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.D0.y(Ji.M, ak.a, ak.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, abstractC5607a, abstractC5607a2, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}

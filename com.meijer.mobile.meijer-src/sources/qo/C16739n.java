package qo;

import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import com.meijer.mobile.mperks.ux.g0;
import com.meijer.mobile.mperks.ux.j0;
import d0.C13590y;
import h6.C14478i;
import j0.C14890K;
import j0.C14903g;
import java.util.Locale;
import ki.q1;
import kotlin.C18280w;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15464h;
import l6.InterfaceC15467k;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\b\u0010\u0005\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001a²\u0006\u000e\u0010\u0014\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "w", "y", "k", "", "title", "A", "(LKi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "iconId", "description", "", "isChooseHowYouAreRewardedSection", "u", "(LKi/M;ILjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "isVisible", "Lh6/i;", "composition", "", "progress", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qo.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16739n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.n$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158868a;

        a(LocalThemeScope localThemeScope) {
            this.f158868a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2044599119, i10, -1, "com.meijer.mobile.mperks.ux.rewards.ChooseHowYouAreRewardedSection.<anonymous> (MperksVisualEducation.kt:182)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 20;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(32));
            LocalThemeScope localThemeScope = this.f158868a;
            C5800d.m mVarH = C5800d.f48779a.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            String strC = C16338g.c(j0.f115053A, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            C16739n.A(localThemeScope, strC, composer, i11);
            C16739n.u(localThemeScope, g0.f115016p, C16338g.c(j0.f115150e2, composer, 0), C16338g.c(j0.f115088L1, composer, 0), null, true, composer, i11 | 196608, 8);
            C16739n.u(localThemeScope, g0.f115020t, C16338g.c(j0.f115224z0, composer, 0), C16338g.c(j0.f115085K1, composer, 0), null, true, composer, i11 | 196608, 8);
            C16739n.u(localThemeScope, g0.f115021u, C16338g.c(j0.f115221y0, composer, 0), C16338g.c(j0.f115223z, composer, 0), null, true, composer, i11 | 196608, 8);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(16)), composer, 6);
            C13590y.a(C16335d.c(g0.f114992A, composer, 0), null, androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), companion2.e(), InterfaceC5926k.INSTANCE.e(), 0.0f, null, composer, 28080, 96);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qo.n$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f158869a;

        b(LocalThemeScope localThemeScope) {
            this.f158869a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2109349160, i10, -1, "com.meijer.mobile.mperks.ux.rewards.TheresAlwaysAWayToEarnSection.<anonymous> (MperksVisualEducation.kt:138)");
            }
            float f10 = 20;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(32));
            LocalThemeScope localThemeScope = this.f158869a;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            String strC = C16338g.c(j0.f115134a2, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            C16739n.A(localThemeScope, strC, composer, i11);
            C16739n.u(localThemeScope, g0.f115017q, C16338g.c(j0.f115193p1, composer, 0), C16338g.c(j0.f115113U, composer, 0), null, false, composer, i11, 24);
            C16739n.u(localThemeScope, g0.f115019s, C16338g.c(j0.f115081J0, composer, 0), C16338g.c(j0.f115110T, composer, 0), null, false, composer, i11, 24);
            C16739n.u(localThemeScope, g0.f115023w, C16338g.c(j0.f115185n1, composer, 0), C16338g.c(j0.f115116V, composer, 0), null, false, composer, i11, 24);
            C16739n.u(localThemeScope, g0.f115022v, C16338g.c(j0.f115181m1, composer, 0), C16338g.c(j0.f115220y, composer, 0), null, false, composer, i11, 24);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r55, final int r56, final java.lang.String r57, final java.lang.String r58, androidx.compose.ui.Modifier r59, boolean r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16739n.u(Ki.M, int, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final LocalThemeScope localThemeScope, final String str, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(207946650);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(207946650, i11, -1, "com.meijer.mobile.mperks.ux.rewards.VisualEducationHeader (MperksVisualEducation.kt:223)");
            }
            SpanStyle spanStyle = new SpanStyle(localThemeScope.getAdsColors().getAdsColorText03().getColor(), localThemeScope.getAdsTypography().getHeadings().getTransformations().getAdsFontSize06(), FontWeight.INSTANCE.a(), C18280w.c(C18280w.INSTANCE.a()), null, localThemeScope.getAdsTypography().getHeadings().getTransformations().getAdsFontFamilyProduct(), null, 0L, null, null, null, 0L, null, null, null, null, 65488, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i12 = i11 & 14;
            boolean z10 = i12 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Ki.I() { // from class: qo.g
                    @Override // Ki.I
                    public final TextStyle getStyle() {
                        return C16739n.B(localThemeScope);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Ki.I i13 = (Ki.I) objB;
            composerStartRestartGroup.P();
            int iA = F1.j.INSTANCE.a();
            Modifier modifierK = androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: qo.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16739n.C((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            q1.Label label = new q1.Label(C16819m.d(modifierK, false, (Function1) objB2, 1, null), null, null, F1.j.h(iA), 0, false, 0, i13, null, 374, null);
            AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
            int iN = bVar.n(spanStyle);
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                bVar.g(upperCase);
                Unit unit = Unit.f143329a;
                bVar.k(iN);
                si.j.g(localThemeScope, label, bVar.q(), null, null, composerStartRestartGroup, i12 | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 12);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            } catch (Throwable th2) {
                bVar.k(iN);
                throw th2;
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: qo.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16739n.D(localThemeScope, str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, String str, int i10, Composer composer, int i11) {
        A(localThemeScope, str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void k(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = -1998911692(0xffffffff88db0734, float:-1.31822765E-33)
            r4 = r19
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            if (r4 == 0) goto L17
            r4 = r1 | 6
            goto L30
        L17:
            r4 = r1 & 6
            if (r4 != 0) goto L2f
            r4 = r1 & 8
            if (r4 != 0) goto L24
            boolean r4 = r13.V(r0)
            goto L28
        L24:
            boolean r4 = r13.D(r0)
        L28:
            if (r4 == 0) goto L2c
            r4 = 4
            goto L2d
        L2c:
            r4 = 2
        L2d:
            r4 = r4 | r1
            goto L30
        L2f:
            r4 = r1
        L30:
            r5 = r2 & 1
            if (r5 == 0) goto L39
            r4 = r4 | 48
        L36:
            r6 = r18
            goto L4b
        L39:
            r6 = r1 & 48
            if (r6 != 0) goto L36
            r6 = r18
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L48
            r7 = 32
            goto L4a
        L48:
            r7 = 16
        L4a:
            r4 = r4 | r7
        L4b:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L5d
            boolean r7 = r13.j()
            if (r7 != 0) goto L58
            goto L5d
        L58:
            r13.K()
            r3 = r6
            goto Lc4
        L5d:
            if (r5 == 0) goto L62
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            goto L63
        L62:
            r5 = r6
        L63:
            boolean r6 = androidx.compose.runtime.ComposerKt.M()
            if (r6 == 0) goto L6f
            r6 = -1
            java.lang.String r7 = "com.meijer.mobile.mperks.ux.rewards.ChooseHowYouAreRewardedSection (MperksVisualEducation.kt:173)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r6, r7)
        L6f:
            Ki.A r3 = r0.getAdsCornerRadii()
            Ki.S r3 = r3.getRadius06()
            float r3 = r3.getDp()
            r0.h r3 = r0.C16806i.c(r3)
            r4 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.J.h(r5, r4, r6, r7)
            r8 = 3
            r9 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.J.D(r4, r7, r9, r8, r7)
            Ki.z r7 = r0.getAdsColors()
            Ki.T r7 = r7.getAdsColorUIBackground01()
            long r7 = r7.getColor()
            float r9 = (float) r9
            float r11 = H1.h.p(r9)
            qo.n$a r9 = new qo.n$a
            r9.<init>(r0)
            r10 = 54
            r12 = -2044599119(0xffffffff8621e4b1, float:-3.044875E-35)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r6, r9, r13, r10)
            r14 = 1769472(0x1b0000, float:2.479558E-39)
            r15 = 24
            r6 = r7
            r8 = 0
            r10 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            kotlin.C18051y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r4 = androidx.compose.runtime.ComposerKt.M()
            if (r4 == 0) goto Lc4
            androidx.compose.runtime.ComposerKt.T()
        Lc4:
            androidx.compose.runtime.T0 r4 = r13.l()
            if (r4 == 0) goto Ld2
            qo.e r5 = new qo.e
            r5.<init>()
            r4.a(r5)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16739n.k(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16739n.m(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(float f10, InterfaceC5872l0 interfaceC5872l0, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinatesKt.f(coordinates) & 4294967295L));
        if (!n(interfaceC5872l0) && 0.0f <= fIntBitsToFloat && fIntBitsToFloat <= f10) {
            s(interfaceC5872l0, true);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, int i10, String str, String str2, Modifier modifier, boolean z10, int i11, int i12, Composer composer, int i13) {
        u(localThemeScope, i10, str, str2, modifier, z10, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void y(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = -1075765691(0xffffffffbfe11e45, float:-1.7587363)
            r4 = r19
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            if (r4 == 0) goto L17
            r4 = r1 | 6
            goto L30
        L17:
            r4 = r1 & 6
            if (r4 != 0) goto L2f
            r4 = r1 & 8
            if (r4 != 0) goto L24
            boolean r4 = r13.V(r0)
            goto L28
        L24:
            boolean r4 = r13.D(r0)
        L28:
            if (r4 == 0) goto L2c
            r4 = 4
            goto L2d
        L2c:
            r4 = 2
        L2d:
            r4 = r4 | r1
            goto L30
        L2f:
            r4 = r1
        L30:
            r5 = r2 & 1
            if (r5 == 0) goto L39
            r4 = r4 | 48
        L36:
            r6 = r18
            goto L4b
        L39:
            r6 = r1 & 48
            if (r6 != 0) goto L36
            r6 = r18
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L48
            r7 = 32
            goto L4a
        L48:
            r7 = 16
        L4a:
            r4 = r4 | r7
        L4b:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L5d
            boolean r7 = r13.j()
            if (r7 != 0) goto L58
            goto L5d
        L58:
            r13.K()
            r3 = r6
            goto Lc4
        L5d:
            if (r5 == 0) goto L62
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.INSTANCE
            goto L63
        L62:
            r5 = r6
        L63:
            boolean r6 = androidx.compose.runtime.ComposerKt.M()
            if (r6 == 0) goto L6f
            r6 = -1
            java.lang.String r7 = "com.meijer.mobile.mperks.ux.rewards.TheresAlwaysAWayToEarnSection (MperksVisualEducation.kt:129)"
            androidx.compose.runtime.ComposerKt.U(r3, r4, r6, r7)
        L6f:
            Ki.A r3 = r0.getAdsCornerRadii()
            Ki.S r3 = r3.getRadius06()
            float r3 = r3.getDp()
            r0.h r3 = r0.C16806i.c(r3)
            r4 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.J.h(r5, r4, r6, r7)
            r8 = 3
            r9 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.J.D(r4, r7, r9, r8, r7)
            Ki.z r7 = r0.getAdsColors()
            Ki.T r7 = r7.getAdsColorUIBackground01()
            long r7 = r7.getColor()
            float r9 = (float) r9
            float r11 = H1.h.p(r9)
            qo.n$b r9 = new qo.n$b
            r9.<init>(r0)
            r10 = 54
            r12 = 2109349160(0x7dba1d28, float:3.0923474E37)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r6, r9, r13, r10)
            r14 = 1769472(0x1b0000, float:2.479558E-39)
            r15 = 24
            r6 = r7
            r8 = 0
            r10 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            kotlin.C18051y.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r4 = androidx.compose.runtime.ComposerKt.M()
            if (r4 == 0) goto Lc4
            androidx.compose.runtime.ComposerKt.T()
        Lc4:
            androidx.compose.runtime.T0 r4 = r13.l()
            if (r4 == 0) goto Ld2
            qo.d r5 = new qo.d
            r5.<init>()
            r4.a(r5)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.C16739n.y(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle B(LocalThemeScope localThemeScope) {
        return TextStyle.c(localThemeScope.getAdsTypography().getDetail().getOne().getStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, H1.w.i(28), null, null, null, 0, 0, null, 16646143, null);
    }

    private static final boolean n(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final C14478i o(InterfaceC15467k interfaceC15467k) {
        return interfaceC15467k.getValue();
    }

    private static final float p(InterfaceC15464h interfaceC15464h) {
        return interfaceC15464h.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q(InterfaceC15464h interfaceC15464h) {
        return p(interfaceC15464h);
    }

    private static final void s(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final void w(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-3958035);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-3958035, i12, -1, "com.meijer.mobile.mperks.ux.rewards.RewardsTabPointsDetails (MperksVisualEducation.kt:113)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.o(H1.h.p(16)), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            int i16 = LocalThemeScope.f17314g;
            int i17 = i12 & 14;
            y(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            k(localThemeScope, null, composerStartRestartGroup, i16 | i17, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(8)), composerStartRestartGroup, 6);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: qo.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16739n.x(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

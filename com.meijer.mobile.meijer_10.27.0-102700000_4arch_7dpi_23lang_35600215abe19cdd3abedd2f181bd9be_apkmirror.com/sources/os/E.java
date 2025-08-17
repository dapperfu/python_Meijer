package os;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import j$.time.ZonedDateTime;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import pi.C16307b;
import vk.C17590a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a%\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000b\u001a\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00020\u0010*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012¨\u0006\u001d²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LVl/f;", "reward", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onClick", "s", "(LJi/M;LVl/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "v", "(LJi/M;LVl/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "m", "k", "j$/time/ZonedDateTime", "now", "", "A", "(Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;)Z", "", "date", "LJi/T;", "daysLeftColor", "q", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;LJi/T;Landroidx/compose/runtime/Composer;II)V", "i", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "C", "lastAction", "mperks_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vl.f f154935b;

        a(LocalThemeScope localThemeScope, Vl.f fVar) {
            this.f154934a = localThemeScope;
            this.f154935b = fVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1405107839, i10, -1, "com.meijer.mobile.ui.mperks.homescreen.YourRewardsCard.<anonymous> (HomeScreenMperksYourRewardsCard.kt:73)");
            }
            E.v(this.f154934a, this.f154935b, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 384, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f154936f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.A a10) {
            super(1);
            this.f154936f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f154936f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f154937f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f154938g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f154939h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f154940i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Vl.f f154941j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Vl.f fVar) {
            super(2);
            this.f154938g = nVar;
            this.f154939h = function0;
            this.f154940i = localThemeScope;
            this.f154941j = fVar;
            this.f154937f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f154938g.getHelpersHashCode();
            this.f154938g.i();
            L1.n nVar = this.f154938g;
            composer.startReplaceGroup(-1068553342);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            LocalThemeScope localThemeScope = this.f154940i;
            C.i.h hVar = C.i.h.f15557d;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = d.f154942a;
                composer.t(objB);
            }
            composer.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(hVar, null, null, null, 0.0f, null, androidx.compose.foundation.layout.D.i(nVar.k(companion, hVarD, (Function1) objB), this.f154940i.getAdsSpacing().getThree().getDp()), 62, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C15372h c15372hC = new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f154941j.getImageUrl()).p(ns.s.f152673e).j(ns.s.f152673e).c();
            Z4.h hVarA2 = Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            P0.e eVarE = P0.e.INSTANCE.e();
            ZonedDateTime expirationDate = this.f154941j.getExpirationDate();
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.v(companion, H1.h.p((expirationDate == null || !E.B(expirationDate, null, 1, null)) ? 125 : 100)), this.f154940i.getAdsSpacing().getFive().getDp());
            ZonedDateTime expirationDate2 = this.f154941j.getExpirationDate();
            Modifier modifierA = T0.a.a(modifierI, (expirationDate2 == null || !E.B(expirationDate2, null, 1, null)) ? 1.0f : 0.3f);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = e.f154943a;
                composer.t(objB2);
            }
            composer.P();
            C6197c.e(c15372hC, null, hVarA2, nVar.k(modifierA, hVarA, (Function1) objB2), null, null, eVarE, InterfaceC5784k.INSTANCE.d(), 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
            LocalThemeScope localThemeScope2 = this.f154940i;
            Vl.f fVar = this.f154941j;
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(hVarA) | composer.V(hVarD) | composer.V(hVarE);
            Object objB3 = composer.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new f(hVarA, hVarD, hVarE);
                composer.t(objB3);
            }
            composer.P();
            E.k(localThemeScope2, fVar, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarC, (Function1) objB3), 0.0f, this.f154940i.getAdsSpacing().getFive().getDp(), this.f154940i.getAdsSpacing().getThree().getDp(), this.f154940i.getAdsSpacing().getSix().getDp(), 1, null), composer, i11, 0);
            LocalThemeScope localThemeScope3 = this.f154940i;
            Vl.f fVar2 = this.f154941j;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new g(hVarC);
                composer.t(objB4);
            }
            composer.P();
            E.m(localThemeScope3, fVar2, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarE, (Function1) objB4), 0.0f, 0.0f, 0.0f, this.f154940i.getAdsSpacing().getFive().getDp(), 7, null), composer, i11, 0);
            composer.P();
            if (this.f154938g.getHelpersHashCode() != helpersHashCode) {
                this.f154939h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f154942a = new d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f154943a = new e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f154944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f154945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f154946c;

        f(L1.h hVar, L1.h hVar2, L1.h hVar3) {
            this.f154944a = hVar;
            this.f154945b = hVar2;
            this.f154946c = hVar3;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f154944a.getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f154944a.getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f154945b.getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f154946c.getTop(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f154947a;

        g(L1.h hVar) {
            this.f154947a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f154947a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    public static final boolean A(ZonedDateTime zonedDateTime, ZonedDateTime now) {
        Intrinsics.j(zonedDateTime, "<this>");
        Intrinsics.j(now, "now");
        return now.isAfter(zonedDateTime);
    }

    public static /* synthetic */ boolean B(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime2 = ZonedDateTime.now();
        }
        return A(zonedDateTime, zonedDateTime2);
    }

    private static final boolean C(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        return zonedDateTime.isBefore(zonedDateTime2.plusDays(7L));
    }

    static /* synthetic */ boolean D(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime2 = ZonedDateTime.now();
        }
        return C(zonedDateTime, zonedDateTime2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void i(final Ji.LocalThemeScope r21, final java.lang.String r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.E.i(Ji.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r38, Vl.f r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.E.k(Ji.M, Vl.f, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Vl.f fVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, fVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Vl.f fVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, fVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(final Ji.LocalThemeScope r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, final Ji.T r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.E.q(Ji.M, java.lang.String, androidx.compose.ui.Modifier, Ji.T, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, String str, Modifier modifier, Ji.T t10, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, str, modifier, t10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r26, final Vl.f r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.E.s(Ji.M, Vl.f, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, Vl.f fVar, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, fVar, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ji.LocalThemeScope r15, final Vl.f r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.E.v(Ji.M, Vl.f, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, Vl.f fVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, fVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final LocalThemeScope localThemeScope, final Vl.f fVar, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Boolean boolValueOf;
        LocalThemeScope localThemeScope2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(247769585);
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
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(fVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            modifier2 = modifier;
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(247769585, i12, -1, "com.meijer.mobile.ui.mperks.homescreen.ValidOrExpiredDate (HomeScreenMperksYourRewardsCard.kt:148)");
            }
            ZonedDateTime expirationDate = fVar.getExpirationDate();
            boolean z10 = false;
            String str = null;
            if (expirationDate != null && B(expirationDate, null, 1, null)) {
                z10 = true;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1744891567);
                ZonedDateTime expirationDate2 = fVar.getExpirationDate();
                if (expirationDate2 != null) {
                    str = expirationDate2.format(C17590a.f164803a.f());
                }
                localThemeScope2 = localThemeScope;
                i(localThemeScope2, str, modifier3, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (i12 & 896), 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1744714712);
                ZonedDateTime expirationDate3 = fVar.getExpirationDate();
                if (expirationDate3 != null) {
                    boolValueOf = Boolean.valueOf(D(expirationDate3, null, 1, null));
                } else {
                    boolValueOf = null;
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zV = composerStartRestartGroup.V(boolValueOf);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = o1.e(new Function0() { // from class: os.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return E.n(fVar, localThemeScope);
                        }
                    });
                    composerStartRestartGroup.t(objB);
                }
                z1 z1Var = (z1) objB;
                composerStartRestartGroup.P();
                ZonedDateTime expirationDate4 = fVar.getExpirationDate();
                if (expirationDate4 != null) {
                    str = expirationDate4.format(C17590a.f164803a.f());
                }
                localThemeScope2 = localThemeScope;
                q(localThemeScope2, str, modifier3, o(z1Var), composerStartRestartGroup, (i12 & 896) | LocalThemeScope.f15770g | (i12 & 14) | (Ji.T.f15798b << 9), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            t0L.a(new Function2() { // from class: os.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return E.p(localThemeScope3, fVar, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ji.T n(Vl.f fVar, LocalThemeScope localThemeScope) {
        ZonedDateTime expirationDate = fVar.getExpirationDate();
        if (expirationDate != null && D(expirationDate, null, 1, null)) {
            return localThemeScope.getAdsColors().getAdsColorBrandSecondary();
        }
        return localThemeScope.getAdsColors().getAdsColorText02();
    }

    private static final Ji.T o(z1<? extends Ji.T> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}

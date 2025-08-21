package com.meijer.mobile.singlepagecheckout;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.semantics.Role;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001aY\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isPickupOrder", "isTimeslotSelected", "", "header", "line1", "Landroidx/compose/ui/Modifier;", "modifier", "line2", "Lkotlin/Function0;", "", "onEdit", "f", "(LKi/M;ZZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "useCard", "content", "d", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isValidated", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.singlepagecheckout.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13025a0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.a0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f119144a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f119144a = function2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(405879735, i10, -1, "com.meijer.mobile.singlepagecheckout.ConditionalContainer.<anonymous> (FulfillmentSlotsAddressInfo.kt:166)");
            }
            this.f119144a.invoke(composer, 0);
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
    /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f119145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ki.I f119147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f119148d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119149e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f119150f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f119151g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$a */
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f119152a = new a();

            a() {
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$b, reason: collision with other inner class name */
        static final class C1926b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C1926b f119153a = new C1926b();

            C1926b() {
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$c */
        static final class c implements Function1<r1.u, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f119154a = new c();

            c() {
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.s0(semantics, Role.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$d */
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f119155a;

            d(Function0<Unit> function0) {
                this.f119155a = function0;
            }

            public final void a() {
                this.f119155a.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$e */
        static final class e implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f119156a;

            e(L1.h hVar) {
                this.f119156a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f119156a.getBottom(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$f */
        public static final class f extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f119157f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(L1.A a10) {
                super(1);
                this.f119157f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f119157f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.a0$b$g */
        public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f119158f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f119159g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f119160h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f119161i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Ki.I f119162j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f119163k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f119164l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function0 f119165m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f119166n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f119167o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Ki.I i11, String str, boolean z10, Function0 function02, String str2, boolean z11) {
                super(2);
                this.f119159g = nVar;
                this.f119160h = function0;
                this.f119161i = localThemeScope;
                this.f119162j = i11;
                this.f119163k = str;
                this.f119164l = z10;
                this.f119165m = function02;
                this.f119166n = str2;
                this.f119167o = z11;
                this.f119158f = i10;
            }

            public final void a(Composer composer, int i10) {
                int i11;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f119159g.getHelpersHashCode();
                this.f119159g.i();
                L1.n nVar = this.f119159g;
                composer.startReplaceGroup(1094823723);
                n.b bVarM = nVar.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                LocalThemeScope localThemeScope = this.f119161i;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f119162j, null, 383, null);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = a.f119152a;
                    composer.t(objB);
                }
                composer.P();
                q1.Label labelY = q1.Label.y(label, nVar.k(companion, hVarA, (Function1) objB), null, null, null, 0, false, 0, null, null, 510, null);
                String str = this.f119163k;
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, str, null, composer, (i13 << 3) | i12, 4);
                composer.startReplaceGroup(1974992778);
                if (this.f119164l) {
                    LocalThemeScope localThemeScope2 = this.f119161i;
                    q1.Label label2 = new q1.Label(null, this.f119161i.getAdsColors().getAdsColorLink(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C1926b.f119153a;
                        composer.t(objB2);
                    }
                    composer.P();
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarC, (Function1) objB2), 0.0f, 0.0f, this.f119161i.getAdsSpacing().getFour().getDp(), 0.0f, 11, null);
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion2.a()) {
                        objB3 = c.f119154a;
                        composer.t(objB3);
                    }
                    composer.P();
                    Modifier modifierD = C16819m.d(modifierM, false, (Function1) objB3, 1, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f119165m);
                    Object objB4 = composer.B();
                    if (zV || objB4 == companion2.a()) {
                        objB4 = new d(this.f119165m);
                        composer.t(objB4);
                    }
                    composer.P();
                    i11 = 5004770;
                    si.j.h(localThemeScope2, q1.Label.y(label2, ClickableKt.d(modifierD, false, null, null, (Function0) objB4, 7, null), null, null, null, 0, false, 0, null, null, 510, null), C16338g.c(com.meijer.mobile.meijer.Y.f100551M6, composer, 0), null, composer, i12 | (i13 << 3), 4);
                } else {
                    i11 = 5004770;
                }
                composer.P();
                composer.startReplaceGroup(1975021239);
                if (this.f119166n != null) {
                    LocalThemeScope localThemeScope3 = this.f119161i;
                    q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, (!this.f119167o || this.f119164l) ? this.f119162j : this.f119161i.getAdsTypography().getBody().getTwo(), null, 383, null);
                    composer.startReplaceGroup(i11);
                    boolean zV2 = composer.V(hVarA);
                    Object objB5 = composer.B();
                    if (zV2 || objB5 == companion2.a()) {
                        objB5 = new e(hVarA);
                        composer.t(objB5);
                    }
                    composer.P();
                    si.j.h(localThemeScope3, q1.Label.y(label3, androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarD, (Function1) objB5), 0.0f, this.f119161i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, null, null, 510, null), this.f119166n, null, composer, i12 | (i13 << 3), 4);
                }
                composer.P();
                composer.P();
                if (this.f119159g.getHelpersHashCode() != helpersHashCode) {
                    this.f119160h.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(boolean z10, LocalThemeScope localThemeScope, Ki.I i10, String str, Function0<Unit> function0, String str2, boolean z11) {
            this.f119145a = z10;
            this.f119146b = localThemeScope;
            this.f119147c = i10;
            this.f119148d = str;
            this.f119149e = function0;
            this.f119150f = str2;
            this.f119151g = z11;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-60581818, i10, -1, "com.meijer.mobile.singlepagecheckout.FulfillmentSlotsAddressInfo.<anonymous>.<anonymous> (FulfillmentSlotsAddressInfo.kt:89)");
            }
            Modifier modifierL = androidx.compose.foundation.layout.D.l(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f119145a ? H1.h.p(0) : this.f119146b.getAdsSpacing().getFive().getDp(), this.f119145a ? H1.h.p(0) : this.f119146b.getAdsSpacing().getFive().getDp(), this.f119145a ? H1.h.p(0) : this.f119146b.getAdsSpacing().getFive().getDp(), this.f119146b.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f119146b;
            Ki.I i11 = this.f119147c;
            String str = this.f119148d;
            boolean z10 = this.f119145a;
            Function0<Unit> function0 = this.f119149e;
            String str2 = this.f119150f;
            boolean z11 = this.f119151g;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierL, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new g(nVar, 0, pairH.b(), localThemeScope, i11, str, z10, function0, str2, z11)), pairH.a(), composer, 48, 0);
            composer.U();
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r19, final boolean r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C13025a0.d(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, z10, modifier, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r37, final boolean r38, final boolean r39, final java.lang.String r40, final java.lang.String r41, androidx.compose.ui.Modifier r42, java.lang.String r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C13025a0.f(Ki.M, boolean, boolean, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, boolean z10, boolean z11, String str, String str2, Modifier modifier, String str3, Function0 function0, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, z10, z11, str, str2, modifier, str3, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

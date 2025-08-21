package Bm;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aE\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "headerText", "contentFirst", "contentSecond", "Lkotlin/Function0;", "", "onClose", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "header", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Bm.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2985b0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.b0$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f3343f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f3343f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f3343f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bm.b0$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3344f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f3345g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f3346h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3347i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f3348j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f3349k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f3350l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f3351m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, Function0 function02, String str, String str2, String str3) {
            super(2);
            this.f3345g = nVar;
            this.f3346h = function0;
            this.f3347i = localThemeScope;
            this.f3348j = function02;
            this.f3349k = str;
            this.f3350l = str2;
            this.f3351m = str3;
            this.f3344f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f3345g.getHelpersHashCode();
            this.f3345g.i();
            L1.n nVar = this.f3345g;
            composer.startReplaceGroup(-815283514);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            LocalThemeScope localThemeScope = this.f3347i;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f3352a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierI, hVarA, (Function1) objB);
            Function0 function0 = this.f3348j;
            String str = this.f3349k;
            int i11 = LocalThemeScope.f17314g;
            C2985b0.d(localThemeScope, modifierK, function0, str, composer, i11, 0);
            long color = this.f3347i.getAdsColors().getAdsColorUIDivider().getColor();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(24), 7, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new d(hVarA);
                composer.t(objB2);
            }
            composer.P();
            C17983Z.a(nVar.k(modifierM, hVarC, (Function1) objB2), color, 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope2 = this.f3347i;
            Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarC);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new e(hVarC);
                composer.t(objB3);
            }
            composer.P();
            C3001k.b(localThemeScope2, nVar.k(modifierK2, hVarD, (Function1) objB3), this.f3350l, this.f3351m, composer, i11, 0);
            long color2 = this.f3347i.getAdsColors().getAdsColorUIDivider().getColor();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(hVarF);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion2.a()) {
                objB4 = new f(hVarF);
                composer.t(objB4);
            }
            composer.P();
            C17983Z.a(nVar.k(companion, hVarE, (Function1) objB4), color2, 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope3 = this.f3347i;
            Ki.Q.e(localThemeScope3, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(1651774111, true, new g(localThemeScope3, nVar, hVarF, this.f3348j), composer, 54), composer, i11 | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            composer.P();
            if (this.f3345g.getHelpersHashCode() != helpersHashCode) {
                this.f3346h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.b0$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3352a = new c();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.b0$d */
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f3353a;

        d(L1.h hVar) {
            this.f3353a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f3353a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.b0$e */
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f3354a;

        e(L1.h hVar) {
            this.f3354a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f3354a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.b0$f */
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f3355a;

        f(L1.h hVar) {
            this.f3355a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f3355a.getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bm.b0$g */
    static final class g implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.n f3357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f3358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3359d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.b0$g$a */
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3360a = new a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bm.b0$g$b */
        static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f3362b;

            b(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f3361a = localThemeScope;
                this.f3362b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(519224652, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.InformationBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (InformationBottomSheetContent.kt:109)");
                }
                si.j.h(this.f3361a, this.f3362b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f101306yg, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        g(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, Function0<Unit> function0) {
            this.f3356a = localThemeScope;
            this.f3357b = nVar;
            this.f3358c = hVar;
            this.f3359d = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1651774111, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.InformationBottomSheetContent.<anonymous>.<anonymous> (InformationBottomSheetContent.kt:95)");
            }
            LocalThemeScope localThemeScope = this.f3356a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            L1.n nVar = this.f3357b;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16));
            L1.h hVar = this.f3358c;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f3360a;
                composer.t(objB);
            }
            composer.P();
            oi.E0.b(localThemeScope, q1.d.StandardButton.y(enabledButton, false, null, null, C16806i.c(H1.h.p(12)), null, null, null, nVar.k(modifierI, hVar, (Function1) objB), false, null, 887, null), this.f3359d, ComposableLambdaKt.c(519224652, true, new b(this.f3356a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, final java.lang.String r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.C2985b0.d(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, String str, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, function0, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, final java.lang.String r19, java.lang.String r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.C2985b0.g(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, str, str2, str3, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}

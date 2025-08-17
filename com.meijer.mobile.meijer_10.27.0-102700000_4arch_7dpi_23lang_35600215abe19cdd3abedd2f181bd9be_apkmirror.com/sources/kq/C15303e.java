package kq;

import F1.j;
import Ji.I;
import Ji.LocalThemeScope;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import g6.C14209i;
import ji.q1;
import k6.C15102e;
import k6.InterfaceC15105h;
import k6.InterfaceC15108k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001a²\u0006\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lak/a;", "text", "", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lak/a;Landroidx/compose/runtime/Composer;II)V", "", "title", "description", "", "isAnimating", "", "resource", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZILandroidx/compose/runtime/Composer;II)V", "contentDescription", "Lkotlin/Function0;", "onClick", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Lak/a;Lak/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lg6/i;", "composition", "", "progress", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kq.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15303e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kq.e$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f147577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f147577f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f147577f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kq.e$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f147578f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f147579g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f147580h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f147581i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f147582j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f147583k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC15105h f147584l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC15108k f147585m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, String str, String str2, InterfaceC15105h interfaceC15105h, InterfaceC15108k interfaceC15108k) {
            super(2);
            this.f147579g = nVar;
            this.f147580h = function0;
            this.f147581i = localThemeScope;
            this.f147582j = str;
            this.f147583k = str2;
            this.f147584l = interfaceC15105h;
            this.f147585m = interfaceC15108k;
            this.f147578f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f147579g.getHelpersHashCode();
            this.f147579g.i();
            L1.n nVar = this.f147579g;
            composer.startReplaceGroup(441095645);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = c.f147586a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            C14209i c14209iE = C15303e.e(this.f147585m);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f147584l);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new d(this.f147584l);
                composer.t(objB2);
            }
            composer.P();
            C15102e.a(c14209iE, (Function0) objB2, null, false, false, false, false, null, false, null, null, null, false, false, null, null, false, composer, 0, 0, 131068);
            composer.v();
            LocalThemeScope localThemeScope = this.f147581i;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new C2271e(hVarA);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarC, (Function1) objB3);
            I six = this.f147581i.getAdsTypography().getHeadings().getSix();
            j.Companion companion4 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierK2, null, null, F1.j.h(companion4.a()), 0, false, 0, six, null, 374, null);
            String str = this.f147582j;
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f147581i;
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(hVarC);
            Object objB4 = composer.B();
            if (zV3 || objB4 == companion2.a()) {
                objB4 = new f(hVarC);
                composer.t(objB4);
            }
            composer.P();
            ri.j.h(localThemeScope2, new q1.Label(nVar.k(companion, hVarD, (Function1) objB4), null, null, F1.j.h(companion4.a()), 0, false, 0, this.f147581i.getAdsTypography().getBodyCompact().getOne(), null, 374, null), this.f147583k, null, composer, i11 | (i12 << 3), 4);
            composer.P();
            if (this.f147579g.getHelpersHashCode() != helpersHashCode) {
                this.f147580h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kq.e$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f147586a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kq.e$d */
    static final class d implements Function0<Float> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15105h f147587a;

        d(InterfaceC15105h interfaceC15105h) {
            this.f147587a = interfaceC15105h;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(C15303e.f(this.f147587a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kq.e$e, reason: collision with other inner class name */
    static final class C2271e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f147588a;

        C2271e(L1.h hVar) {
            this.f147588a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f147588a.getBottom(), H1.h.p(24), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kq.e$f */
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f147589a;

        f(L1.h hVar) {
            this.f147589a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f147589a.getBottom(), H1.h.p(8), 0.0f, 4, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final java.lang.String r26, final java.lang.String r27, final boolean r28, final int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.C15303e.d(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, boolean z10, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, modifier, str, str2, z10, i10, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final ak.AbstractC5607a r19, final ak.AbstractC5607a r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.C15303e.h(Ji.M, androidx.compose.ui.Modifier, ak.a, ak.a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, abstractC5607a, abstractC5607a2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final ak.AbstractC5607a r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.C15303e.j(Ji.M, androidx.compose.ui.Modifier, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, AbstractC5607a abstractC5607a, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, abstractC5607a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14209i e(InterfaceC15108k interfaceC15108k) {
        return interfaceC15108k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(InterfaceC15105h interfaceC15105h) {
        return interfaceC15105h.getValue().floatValue();
    }
}

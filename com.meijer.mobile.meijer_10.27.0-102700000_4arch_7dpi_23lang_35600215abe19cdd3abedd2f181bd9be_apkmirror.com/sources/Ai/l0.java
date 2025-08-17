package Ai;

import Ji.C;
import Ji.LocalThemeScope;
import L1.C4038f;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import android.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aA\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "", "index", "", "value", "Landroidx/compose/ui/Modifier;", "modifier", "", "isLast", "isSelected", "", "b", "(LJi/M;ILjava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class l0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f431a;

        a(L1.h hVar) {
            this.f431a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f431a.getStart(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f432a;

        b(L1.h hVar) {
            this.f432a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f432a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f433f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L1.A a10) {
            super(1);
            this.f433f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f433f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f434f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f435g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f436h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f437i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f438j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f439k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, String str) {
            super(2);
            this.f435g = nVar;
            this.f436h = function0;
            this.f437i = localThemeScope;
            this.f438j = z10;
            this.f439k = str;
            this.f434f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f435g.getHelpersHashCode();
            this.f435g.i();
            L1.n nVar = this.f435g;
            composer.startReplaceGroup(R.attr.animationDuration);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            nVar.e(new L1.h[]{hVarA, hVarC}, C4038f.INSTANCE.c());
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(hVarC);
                composer.t(objB);
            }
            composer.P();
            ri.j.h(this.f437i, new q1.Label(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(nVar.k(companion, hVarA, (Function1) objB), 0.0f, 1, null), 0.0f, 0.0f, this.f437i.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), null, null, null, F1.t.INSTANCE.b(), false, 0, this.f438j ? this.f437i.getAdsTypography().getHeadings().getSeven() : this.f437i.getAdsTypography().getBodyCompact().getOne(), null, 366, null), this.f439k, null, composer, 0, 4);
            composer.startReplaceGroup(1801690819);
            if (this.f438j) {
                LocalThemeScope localThemeScope = this.f437i;
                C.f.m mVar = C.f.m.f15519e;
                Modifier modifierV = androidx.compose.foundation.layout.J.v(companion, H1.h.p(20));
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(hVarA);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(hVarA);
                    composer.t(objB2);
                }
                composer.P();
                C16307b.b(localThemeScope, new q1.h.DrawableIcon(mVar, C16193g.c(P0.l.f24567m, composer, 0), null, null, 0.0f, this.f437i.getAdsColors().getAdsColorIcon03(), nVar.k(modifierV, hVarC, (Function1) objB2), 28, null), null, null, composer, 0, 6);
            }
            composer.P();
            composer.P();
            if (this.f435g.getHelpersHashCode() != helpersHashCode) {
                this.f436h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r18, final int r19, final java.lang.String r20, androidx.compose.ui.Modifier r21, boolean r22, boolean r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.l0.b(Ji.M, int, java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, int i10, String str, Modifier modifier, boolean z10, boolean z11, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, i10, str, modifier, z10, z11, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}

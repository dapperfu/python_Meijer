package Cq;

import Fq.ShoppingListItem;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14815g;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LJi/M;", "LFq/c;", "item", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "g", "(LJi/M;LFq/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isShoppingListIterationThreeEnabled", "Lkotlin/Function0;", "onClearAllClicked", "d", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Cq.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C3050g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$a */
    static final class a implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4683a = new a();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$b */
    static final class b implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f4684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f4685b;

        b(L1.h hVar, L1.h hVar2) {
            this.f4684a = hVar;
            this.f4685b = hVar2;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f4684a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f4685b.getStart(), 0.0f, 0.0f, 6, null);
            C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$c */
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4686a = new c();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
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
    /* renamed from: Cq.g$d */
    static final class d implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4687a = new d();

        public final void a(boolean z10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$e */
    public static final class e extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f4688f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.A a10) {
            super(1);
            this.f4688f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f4688f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.g$f */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4689f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f4690g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f4691h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4692i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f4693j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f4694k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f4695l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1 function1, Function1 function12) {
            super(2);
            this.f4690g = nVar;
            this.f4691h = function0;
            this.f4692i = localThemeScope;
            this.f4693j = shoppingListItem;
            this.f4694k = function1;
            this.f4695l = function12;
            this.f4689f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            String itemDescription;
            String itemDescription2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f4690g.getHelpersHashCode();
            this.f4690g.i();
            L1.n nVar = this.f4690g;
            composer.startReplaceGroup(704725980);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f4692i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = a.f4683a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            ShoppingListItem shoppingListItem = this.f4693j;
            int i11 = Aq.b.f1486g;
            mk.c cVarJ = shoppingListItem.j();
            if ((cVarJ == null || (itemDescription = cVarJ.getName()) == null) && (itemDescription = this.f4693j.getItemDescription()) == null) {
                itemDescription = "";
            }
            String strD = C16193g.d(i11, new Object[]{itemDescription}, composer, 0);
            Function1 function1 = this.f4694k;
            int i12 = LocalThemeScope.f15770g;
            U.g(localThemeScope, modifierK, null, shoppingListItem, strD, function1, composer, i12, 2);
            LocalThemeScope localThemeScope2 = this.f4692i;
            Ji.I one = localThemeScope2.getAdsTypography().getBody().getOne();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(18), H1.h.p(2), H1.h.p(14), 0.0f, 8, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.V(hVarD);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new b(hVarA, hVarD);
                composer.t(objB2);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(modifierM, hVarC, (Function1) objB2), null, null, null, F1.t.INSTANCE.b(), false, 2, one, null, HttpResponseStatus.REDIRECTION_FOUND, null);
            mk.c cVarJ2 = this.f4693j.j();
            if ((cVarJ2 == null || (itemDescription2 = cVarJ2.getName()) == null) && (itemDescription2 = this.f4693j.getItemDescription()) == null) {
                itemDescription2 = "";
            }
            ri.j.h(localThemeScope2, label, itemDescription2, null, composer, i12 | (q1.Label.f140080j << 3), 4);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = c.f4686a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB3);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
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
            LocalThemeScope localThemeScope3 = this.f4692i;
            ShoppingListItem shoppingListItem2 = this.f4693j;
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = d.f4687a;
                composer.t(objB4);
            }
            composer.P();
            U.i(localThemeScope3, shoppingListItem2, false, (Function1) objB4, this.f4695l, composer, i12 | 3456);
            composer.v();
            composer.P();
            if (this.f4690g.getHelpersHashCode() != helpersHashCode) {
                this.f4691h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r29, androidx.compose.ui.Modifier r30, boolean r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.C3050g.d(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r22, final Fq.ShoppingListItem r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.C3050g.g(Ji.M, Fq.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, shoppingListItem, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}

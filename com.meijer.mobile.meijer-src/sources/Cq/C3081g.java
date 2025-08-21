package Cq;

import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LKi/M;", "LFq/c;", "item", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "g", "(LKi/M;LFq/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isShoppingListIterationThreeEnabled", "Lkotlin/Function0;", "onClearAllClicked", "d", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Cq.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C3081g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$a */
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5643a = new a();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
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
    /* renamed from: Cq.g$b */
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f5644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f5645b;

        b(L1.h hVar, L1.h hVar2) {
            this.f5644a = hVar;
            this.f5645b = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f5644a.getEnd(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f5645b.getStart(), 0.0f, 0.0f, 6, null);
            C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5646a = new c();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
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
    /* renamed from: Cq.g$d */
    static final class d implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f5647a = new d();

        public final void a(boolean z10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.g$e */
    public static final class e extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f5648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.A a10) {
            super(1);
            this.f5648f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f5648f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.g$f */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f5650g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f5651h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5652i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f5653j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f5654k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f5655l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1 function1, Function1 function12) {
            super(2);
            this.f5650g = nVar;
            this.f5651h = function0;
            this.f5652i = localThemeScope;
            this.f5653j = shoppingListItem;
            this.f5654k = function1;
            this.f5655l = function12;
            this.f5649f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            String itemDescription;
            String itemDescription2;
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f5650g.getHelpersHashCode();
            this.f5650g.i();
            L1.n nVar = this.f5650g;
            composer.startReplaceGroup(704725980);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f5652i;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = a.f5643a;
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            ShoppingListItem shoppingListItem = this.f5653j;
            int i11 = Aq.b.f1983g;
            nk.c cVarJ = shoppingListItem.j();
            if ((cVarJ == null || (itemDescription = cVarJ.getName()) == null) && (itemDescription = this.f5653j.getItemDescription()) == null) {
                itemDescription = "";
            }
            String strD = C16338g.d(i11, new Object[]{itemDescription}, composer, 0);
            Function1 function1 = this.f5654k;
            int i12 = LocalThemeScope.f17314g;
            U.g(localThemeScope, modifierK, null, shoppingListItem, strD, function1, composer, i12, 2);
            LocalThemeScope localThemeScope2 = this.f5652i;
            Ki.I one = localThemeScope2.getAdsTypography().getBody().getOne();
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
            nk.c cVarJ2 = this.f5653j.j();
            if ((cVarJ2 == null || (itemDescription2 = cVarJ2.getName()) == null) && (itemDescription2 = this.f5653j.getItemDescription()) == null) {
                itemDescription2 = "";
            }
            si.j.h(localThemeScope2, label, itemDescription2, null, composer, i12 | (q1.Label.f142335j << 3), 4);
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = c.f5646a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK2 = nVar.k(companion, hVarD, (Function1) objB3);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK2);
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
            LocalThemeScope localThemeScope3 = this.f5652i;
            ShoppingListItem shoppingListItem2 = this.f5653j;
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = d.f5647a;
                composer.t(objB4);
            }
            composer.P();
            U.i(localThemeScope3, shoppingListItem2, false, (Function1) objB4, this.f5655l, composer, i12 | 3456);
            composer.v();
            composer.P();
            if (this.f5650g.getHelpersHashCode() != helpersHashCode) {
                this.f5651h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void d(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, boolean r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.C3081g.d(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void g(final Ki.LocalThemeScope r22, final Fq.ShoppingListItem r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.C3081g.g(Ki.M, Fq.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, shoppingListItem, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}

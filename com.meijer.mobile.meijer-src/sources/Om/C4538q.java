package Om;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import Mm.b;
import Om.Q0;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.view.InterfaceC6172s;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16335d;
import p1.C16338g;
import yk.C18327c;
import yr.C18370z;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u000f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "storeNum", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LOm/Q0;", "", "trackScreen", "LMm/b;", "onAction", "Lkotlin/Function0;", "onBackPressed", "e", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "storeNumber", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Om.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4538q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$a */
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24735a = new a();

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

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$b */
    static final class b implements Function1<InterfaceC5834y, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Mm.b, Unit> f24736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f24737b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Mm.b, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
            this.f24736a = function1;
            this.f24737b = interfaceC5872l0;
        }

        public final void a(InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            this.f24736a.invoke(new b.EnterStoreInformation(C4538q.f(this.f24737b)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5834y interfaceC5834y) {
            a(interfaceC5834y);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$c */
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f24738a;

        c(L1.h hVar) {
            this.f24738a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f24738a.getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f24738a.getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$d */
    static final class d implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f24739a;

        d(InterfaceC5872l0<String> interfaceC5872l0) {
            this.f24739a = interfaceC5872l0;
        }

        public final void a(String it) {
            Intrinsics.j(it, "it");
            if (C18327c.a(it) || it.length() == 0) {
                C4538q.g(this.f24739a, StringsKt.N1(it, 5));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$e */
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24740a;

        e(Function0<Unit> function0) {
            this.f24740a = function0;
        }

        public final void a() {
            this.f24740a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.q$f */
    public static final class f extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f24741f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.A a10) {
            super(1);
            this.f24741f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f24741f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Om.q$g */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f24742f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f24743g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f24744h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f24745i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24746j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f24747k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f24748l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f24749m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f24750n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L1.n nVar, int i10, Function0 function0, Function1 function1, LocalThemeScope localThemeScope, String str, androidx.compose.ui.focus.y yVar, Function0 function02, InterfaceC5872l0 interfaceC5872l0) {
            super(2);
            this.f24743g = nVar;
            this.f24744h = function0;
            this.f24745i = function1;
            this.f24746j = localThemeScope;
            this.f24747k = str;
            this.f24748l = yVar;
            this.f24749m = function02;
            this.f24750n = interfaceC5872l0;
            this.f24742f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f24743g.getHelpersHashCode();
            this.f24743g.i();
            L1.n nVar = this.f24743g;
            composer.startReplaceGroup(-1009026985);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Z0.c cVarC = C16335d.c(com.meijer.mobile.meijer.S.f99593m0, composer, 0);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100906ef, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = a.f24735a;
                composer.t(objB);
            }
            composer.P();
            C13590y.a(cVarC, strC, nVar.k(modifierH, hVarA, (Function1) objB), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            String strF = C4538q.f(this.f24750n);
            KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f24745i);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new b(this.f24745i, this.f24750n);
                composer.t(objB2);
            }
            composer.P();
            C5835z c5835z = new C5835z(null, null, (Function1) objB2, null, null, null, 59, null);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.g(companion, 0.5f), 0.0f, 0.0f, this.f24746j.getAdsSpacing().getFive().getDp(), 0.0f, 11, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new c(hVarA);
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierF = C18370z.f(nVar.k(modifierM, hVarC, (Function1) objB3), "enter_store_edit_text", null, 2, null);
            LocalThemeScope localThemeScope = this.f24746j;
            String str = this.f24747k;
            androidx.compose.ui.focus.y yVar = this.f24748l;
            composer.startReplaceGroup(5004770);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = new d(this.f24750n);
                composer.t(objB4);
            }
            Function1 function1 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f24749m);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new e(this.f24749m);
                composer.t(objB5);
            }
            composer.P();
            Z.b(localThemeScope, strF, str, yVar, c5835z, keyboardOptionsC, modifierF, null, function1, (Function0) objB5, composer, LocalThemeScope.f17314g | 100666368, 64);
            composer.P();
            if (this.f24743g.getHelpersHashCode() != helpersHashCode) {
                this.f24744h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Om/q$h", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Om.q$h */
    public static final class h implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f24751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4512d f24752b;

        public h(InterfaceC6172s interfaceC6172s, C4512d c4512d) {
            this.f24751a = interfaceC6172s;
            this.f24752b = c4512d;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f24751a.getLifecycle().d(this.f24752b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.focus.y yVar) {
        androidx.compose.ui.focus.y.h(yVar, 0, 1, null);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r33, final java.lang.String r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super Om.Q0, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Mm.b, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Om.C4538q.e(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E h(InterfaceC6172s interfaceC6172s, final Function1 function1, final androidx.compose.ui.focus.y yVar, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        C4512d c4512d = new C4512d(new Function0() { // from class: Om.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4538q.i(function1);
            }
        }, new Function0() { // from class: Om.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4538q.j(yVar);
            }
        });
        interfaceC6172s.getLifecycle().a(c4512d);
        return new h(interfaceC6172s, c4512d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(Q0.b.f24594c);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function1 function12, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, str, modifier, function1, function12, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}

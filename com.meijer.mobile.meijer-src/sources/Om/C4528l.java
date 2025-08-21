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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u000f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "dateStr", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LOm/Q0;", "", "trackScreen", "Lkotlin/Function0;", "onBackPressed", "LMm/b;", "onAction", "e", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "date", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Om.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4528l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.l$a */
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24704a = new a();

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
    /* renamed from: Om.l$b */
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f24705a;

        b(L1.h hVar) {
            this.f24705a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), this.f24705a.getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f24705a.getTop(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.l$c */
    static final class c implements Function1<InterfaceC5834y, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Mm.b, Unit> f24706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f24707b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Mm.b, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0) {
            this.f24706a = function1;
            this.f24707b = interfaceC5872l0;
        }

        public final void a(InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            this.f24706a.invoke(new b.EnterDate(C4528l.f(this.f24707b)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5834y interfaceC5834y) {
            a(interfaceC5834y);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.l$d */
    static final class d implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f24708a;

        d(InterfaceC5872l0<String> interfaceC5872l0) {
            this.f24708a = interfaceC5872l0;
        }

        public final void a(String it) {
            Intrinsics.j(it, "it");
            if (C18327c.a(it) || it.length() == 0) {
                C4528l.g(this.f24708a, StringsKt.N1(it, 6));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.l$e */
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24709a;

        e(Function0<Unit> function0) {
            this.f24709a = function0;
        }

        public final void a() {
            this.f24709a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Om.l$f */
    public static final class f extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f24710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.A a10) {
            super(1);
            this.f24710f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f24710f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Om.l$g */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f24711f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f24712g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f24713h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f24714i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24715j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f24716k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f24717l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0 f24718m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f24719n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L1.n nVar, int i10, Function0 function0, Function1 function1, LocalThemeScope localThemeScope, String str, androidx.compose.ui.focus.y yVar, Function0 function02, InterfaceC5872l0 interfaceC5872l0) {
            super(2);
            this.f24712g = nVar;
            this.f24713h = function0;
            this.f24714i = function1;
            this.f24715j = localThemeScope;
            this.f24716k = str;
            this.f24717l = yVar;
            this.f24718m = function02;
            this.f24719n = interfaceC5872l0;
            this.f24711f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f24712g.getHelpersHashCode();
            this.f24712g.i();
            L1.n nVar = this.f24712g;
            composer.startReplaceGroup(1940473632);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Z0.c cVarC = C16335d.c(com.meijer.mobile.meijer.S.f99591l0, composer, 0);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100846bf, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = a.f24704a;
                composer.t(objB);
            }
            composer.P();
            C13590y.a(cVarC, strC, nVar.k(modifierH, hVarA, (Function1) objB), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
            Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.g(companion, 0.5f), 0.0f, 0.0f, H1.h.p(16), 0.0f, 11, null), "enter_date_edit_text", null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarA);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new b(hVarA);
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK = nVar.k(modifierF, hVarC, (Function1) objB2);
            String strF = C4528l.f(this.f24719n);
            KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f24714i);
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion2.a()) {
                objB3 = new c(this.f24714i, this.f24719n);
                composer.t(objB3);
            }
            composer.P();
            C5835z c5835z = new C5835z(null, null, (Function1) objB3, null, null, null, 59, null);
            C4506a c4506a = new C4506a();
            LocalThemeScope localThemeScope = this.f24715j;
            String str = this.f24716k;
            androidx.compose.ui.focus.y yVar = this.f24717l;
            composer.startReplaceGroup(5004770);
            Object objB4 = composer.B();
            if (objB4 == companion2.a()) {
                objB4 = new d(this.f24719n);
                composer.t(objB4);
            }
            Function1 function1 = (Function1) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f24718m);
            Object objB5 = composer.B();
            if (zV3 || objB5 == companion2.a()) {
                objB5 = new e(this.f24718m);
                composer.t(objB5);
            }
            composer.P();
            Z.b(localThemeScope, strF, str, yVar, c5835z, keyboardOptionsC, modifierK, c4506a, function1, (Function0) objB5, composer, LocalThemeScope.f17314g | 100666368, 0);
            composer.P();
            if (this.f24712g.getHelpersHashCode() != helpersHashCode) {
                this.f24713h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Om/l$h", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Om.l$h */
    public static final class h implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6172s f24720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4512d f24721b;

        public h(InterfaceC6172s interfaceC6172s, C4512d c4512d) {
            this.f24720a = interfaceC6172s;
            this.f24721b = c4512d;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f24720a.getLifecycle().d(this.f24721b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.focus.y yVar) {
        androidx.compose.ui.focus.y.h(yVar, 0, 1, null);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r34, final java.lang.String r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function1<? super Om.Q0, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final kotlin.jvm.functions.Function1<? super Mm.b, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Om.C4528l.e(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, Modifier modifier, Function1 function1, Function0 function0, Function1 function12, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, str, modifier, function1, function0, function12, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E i(InterfaceC6172s interfaceC6172s, final Function1 function1, final androidx.compose.ui.focus.y yVar, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        C4512d c4512d = new C4512d(new Function0() { // from class: Om.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4528l.j(function1);
            }
        }, new Function0() { // from class: Om.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4528l.k(yVar);
            }
        });
        interfaceC6172s.getLifecycle().a(c4512d);
        return new h(interfaceC6172s, c4512d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(Q0.a.f24593c);
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

package yr;

import Ai.C2832m0;
import Ai.G1;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ki.InterfaceC15152V;
import ki.InterfaceC15153W;
import ki.K0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16208z0;
import oi.P0;
import yr.I;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¹\u0001\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKi/M;", "", "viewModeTitle", "notesOrExplainer", "placeholderText", "addEditButtonText", "Lkotlin/Function0;", "", "onAddEditButtonClicked", "onPrimaryButtonClick", "", "isEditMode", "noteValue", "primaryButtonText", "secondaryButtonText", "Lkotlin/Function1;", "onNoteValueChange", "", "maxNoteLength", "isPrimaryButtonDestructive", "secondaryButtonEnabled", "onNoteUpdated", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171688a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f171689b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f171690c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f171691d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f171692e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f171693f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f171694g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f171695h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f171696i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f171697j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f171698k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: yr.I$a$a, reason: collision with other inner class name */
        static final class C2769a implements Function3<InterfaceC15152V, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f171699a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f171700b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f171701c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f171702d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f171703e;

            /* JADX WARN: Multi-variable type inference failed */
            C2769a(LocalThemeScope localThemeScope, String str, int i10, Function1<? super String, Unit> function1, String str2) {
                this.f171699a = localThemeScope;
                this.f171700b = str;
                this.f171701c = i10;
                this.f171702d = function1;
                this.f171703e = str2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC15152V interfaceC15152V, String str, G1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.i(interfaceC15152V.getLabels().getPlaceholder(), str);
                G1.W(AdsInputField, interfaceC15152V.getLabels().getDescription(), null, 2, null);
                return Unit.f143329a;
            }

            public final void b(final InterfaceC15152V Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-339681229, i10, -1, "com.meijer.mobile.ui.common.NoteEntry.<anonymous>.<anonymous>.<anonymous> (NoteEntry.kt:56)");
                }
                q1.f.TextArea textArea = Assemble.getInputFields().getDefault();
                LocalThemeScope localThemeScope = this.f171699a;
                String str = this.f171700b;
                Integer numValueOf = Integer.valueOf(this.f171701c);
                Function1<String, Unit> function1 = this.f171702d;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(Assemble) | composer.V(this.f171703e);
                final String str2 = this.f171703e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: yr.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return I.a.C2769a.c(Assemble, str2, (G1) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C2832m0.g(localThemeScope, str, null, numValueOf, textArea, function1, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.f.TextArea.f142280m << 12), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15152V interfaceC15152V, Composer composer, Integer num) {
                b(interfaceC15152V, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, String str3, boolean z10, boolean z11, int i10, Function1<? super String, Unit> function12, String str4) {
            this.f171688a = localThemeScope;
            this.f171689b = str;
            this.f171690c = str2;
            this.f171691d = function0;
            this.f171692e = function1;
            this.f171693f = str3;
            this.f171694g = z10;
            this.f171695h = z11;
            this.f171696i = i10;
            this.f171697j = function12;
            this.f171698k = str4;
        }

        public final void b(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-496179455, i10, -1, "com.meijer.mobile.ui.common.NoteEntry.<anonymous>.<anonymous> (NoteEntry.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f171688a;
            K0 k02 = K0.f141928a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-339681229, true, new C2769a(localThemeScope, this.f171693f, this.f171696i, this.f171697j, this.f171698k), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            Ki.Q.e(localThemeScope, k02, composableLambdaC, composer, i11 | 384 | (K0.f141929b << 3));
            Modifier modifierK = androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, this.f171688a.getAdsSpacing().getFive().getDp(), 1, null);
            LocalThemeScope localThemeScope2 = this.f171688a;
            String str = this.f171689b;
            String str2 = this.f171690c;
            Function0<Unit> function0 = this.f171691d;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f171692e) | composer.V(this.f171693f);
            final Function1<String, Unit> function1 = this.f171692e;
            final String str3 = this.f171693f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: yr.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I.a.c(function1, str3);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Y.b(localThemeScope2, str, str2, function0, (Function0) objB, modifierK, false, this.f171694g, this.f171695h, composer, i11, 32);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            b(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, String str) {
            function1.invoke(str);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f171704a = new b();

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

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f171705a = new c();

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

        c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f171706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f171707b;

        d(L1.h hVar, L1.h hVar2) {
            this.f171706a = hVar;
            this.f171707b = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f171706a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f171707b.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f171708f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.A a10) {
            super(1);
            this.f171708f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f171708f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f171709f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f171710g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f171711h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171712i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f171713j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f171714k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f171715l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f171716m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, String str, String str2, Function0 function02, String str3) {
            super(2);
            this.f171710g = nVar;
            this.f171711h = function0;
            this.f171712i = localThemeScope;
            this.f171713j = str;
            this.f171714k = str2;
            this.f171715l = function02;
            this.f171716m = str3;
            this.f171709f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f171710g.getHelpersHashCode();
            this.f171710g.i();
            L1.n nVar = this.f171710g;
            composer.startReplaceGroup(-39945224);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            LocalThemeScope localThemeScope = this.f171712i;
            Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = b.f171704a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(nVar.k(companion, hVarA, (Function1) objB), 0.0f, this.f171712i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, seven, null, 382, null);
            String str = this.f171713j;
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, str, null, composer, i11 | (i12 << 3), 4);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion2.a()) {
                objB2 = c.f171705a;
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarC, (Function1) objB2);
            P0.k(this.f171712i, C16208z0.f154285a, this.f171714k, this.f171715l, modifierK, null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 240);
            LocalThemeScope localThemeScope2 = this.f171712i;
            q1.Label label2 = new q1.Label(null, null, null, null, F1.t.INSTANCE.b(), false, 3, localThemeScope2.getAdsTypography().getBody().getTwo(), null, HttpResponseStatus.REDIRECTION_SEE_OTHER, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarC) | composer.V(hVarA);
            Object objB3 = composer.B();
            if (zV || objB3 == companion2.a()) {
                objB3 = new d(hVarC, hVarA);
                composer.t(objB3);
            }
            composer.P();
            si.j.h(localThemeScope2, q1.Label.y(label2, nVar.k(companion, hVarD, (Function1) objB3), null, null, null, 0, false, 0, null, null, 510, null), this.f171716m, null, composer, i11 | (i12 << 3), 4);
            composer.P();
            if (this.f171710g.getHelpersHashCode() != helpersHashCode) {
                this.f171711h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r34, final java.lang.String r35, final java.lang.String r36, final java.lang.String r37, final java.lang.String r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final boolean r41, final java.lang.String r42, final java.lang.String r43, final java.lang.String r44, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r45, final int r46, final boolean r47, final boolean r48, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r49, androidx.compose.ui.Modifier r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.I.b(Ki.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, boolean z10, String str5, String str6, String str7, Function1 function1, int i10, boolean z11, boolean z12, Function1 function12, Modifier modifier, int i11, int i12, int i13, Composer composer, int i14) {
        b(localThemeScope, str, str2, str3, str4, function0, function02, z10, str5, str6, str7, function1, i10, z11, z12, function12, modifier, composer, J0.a(i11 | 1), J0.a(i12), i13);
        return Unit.f143329a;
    }
}

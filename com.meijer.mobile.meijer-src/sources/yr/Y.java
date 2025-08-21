package yr;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.B0;
import oi.C16181m0;
import oi.C16194s0;
import oi.C16200v0;
import oi.P0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ag\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKi/M;", "", "primaryButtonText", "secondaryButtonText", "Lkotlin/Function0;", "", "onPrimaryButtonClick", "onSecondaryButtonClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "primaryButtonEnabled", "secondaryButtonEnabled", "isPrimaryButtonDestructive", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLandroidx/compose/runtime/Composer;II)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f171834f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f171834f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f171834f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f171835f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f171836g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f171837h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f171838i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171839j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f171840k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0 f171841l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f171842m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f171843n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f171844o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f171845p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, boolean z10, LocalThemeScope localThemeScope, String str, Function0 function02, boolean z11, String str2, Function0 function03, boolean z12) {
            super(2);
            this.f171836g = nVar;
            this.f171837h = function0;
            this.f171838i = z10;
            this.f171839j = localThemeScope;
            this.f171840k = str;
            this.f171841l = function02;
            this.f171842m = z11;
            this.f171843n = str2;
            this.f171844o = function03;
            this.f171845p = z12;
            this.f171835f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f171836g.getHelpersHashCode();
            this.f171836g.i();
            L1.n nVar = this.f171836g;
            composer.startReplaceGroup(1507691366);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(hVarC);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(hVarC);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            B0 b02 = this.f171838i ? C16181m0.f154192a : C16200v0.f154265a;
            LocalThemeScope localThemeScope = this.f171839j;
            String str = this.f171840k;
            B0 b03 = b02;
            Function0 function0 = this.f171841l;
            boolean z10 = this.f171842m;
            int i11 = LocalThemeScope.f17314g;
            P0.k(localThemeScope, b03, str, function0, modifierK, null, false, 0L, z10, composer, i11, 112);
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(hVarA) | composer.D(this.f171839j);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new d(hVarA, this.f171839j);
                composer.t(objB2);
            }
            composer.P();
            P0.k(this.f171839j, C16194s0.f154251a, this.f171843n, this.f171844o, nVar.k(companion, hVarC, (Function1) objB2), null, false, 0L, this.f171845p, composer, i11 | (C16194s0.f154252b << 3), 112);
            composer.P();
            if (this.f171836g.getHelpersHashCode() != helpersHashCode) {
                this.f171837h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f171846a;

        c(L1.h hVar) {
            this.f171846a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), this.f171846a.getStart(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f171847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171848b;

        d(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f171847a = hVar;
            this.f171848b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f171847a.getEnd(), this.f171848b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r21, final java.lang.String r22, final java.lang.String r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, boolean r28, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.Y.b(Ki.M, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Function0 function0, Function0 function02, Modifier modifier, boolean z10, boolean z11, boolean z12, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, function0, function02, modifier, z10, z11, z12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

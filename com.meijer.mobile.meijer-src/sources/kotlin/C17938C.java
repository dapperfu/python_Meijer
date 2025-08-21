package kotlin;

import V0.C5489q0;
import V0.F1;
import X0.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.C6453j;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import t1.EnumC17174a;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00102\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lh0/l;", "interactionSource", "Lx0/A;", "colors", "a", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/A;Landroidx/compose/runtime/Composer;II)V", "Lt1/a;", "state", "Lkotlin/Function0;", "onClick", "h", "(Lt1/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/A;Landroidx/compose/runtime/Composer;II)V", "value", "b", "(ZLt1/a;Landroidx/compose/ui/Modifier;Lx0/A;Landroidx/compose/runtime/Composer;I)V", "LX0/f;", "LV0/q0;", "boxColor", "borderColor", "", "radius", "strokeWidth", "s", "(LX0/f;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Lx0/z;", "drawingCache", "t", "(LX0/f;JFFFLx0/z;)V", "LH1/h;", "F", "CheckboxRippleRadius", "CheckboxDefaultPadding", "c", "CheckboxSize", "d", "StrokeWidth", "e", "RadiusSize", "checkDrawFraction", "checkCenterGravitationShiftFraction", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17938C {

    /* renamed from: b, reason: collision with root package name */
    private static final float f167822b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f167824d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f167825e;

    /* renamed from: a, reason: collision with root package name */
    private static final float f167821a = H1.h.p(24);

    /* renamed from: c, reason: collision with root package name */
    private static final float f167823c = H1.h.p(20);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f167826f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167827g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f167826f = function1;
            this.f167827g = z10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f167826f.invoke(Boolean.valueOf(!this.f167827g));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167828f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f167829g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167830h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167831i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f167832j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC17934A f167833k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f167834l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, h0.l lVar, InterfaceC17934A interfaceC17934A, int i10, int i11) {
            super(2);
            this.f167828f = z10;
            this.f167829g = function1;
            this.f167830h = modifier;
            this.f167831i = z11;
            this.f167832j = lVar;
            this.f167833k = interfaceC17934A;
            this.f167834l = i10;
            this.f167835m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17938C.a(this.f167828f, this.f167829g, this.f167830h, this.f167831i, this.f167832j, this.f167833k, composer, J0.a(this.f167834l | 1), this.f167835m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$c */
    static final class c extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C18053z f167836f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f167837g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f167838h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f167839i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Float> f167840j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<Float> f167841k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C18053z c18053z, z1<C5489q0> z1Var, z1<C5489q0> z1Var2, z1<C5489q0> z1Var3, z1<Float> z1Var4, z1<Float> z1Var5) {
            super(1);
            this.f167836f = c18053z;
            this.f167837g = z1Var;
            this.f167838h = z1Var2;
            this.f167839i = z1Var3;
            this.f167840j = z1Var4;
            this.f167841k = z1Var5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }

        public final void a(X0.f fVar) {
            float fFloor = (float) Math.floor(fVar.I1(C17938C.f167824d));
            C17938C.s(fVar, C17938C.f(this.f167837g), C17938C.g(this.f167838h), fVar.I1(C17938C.f167825e), fFloor);
            C17938C.t(fVar, C17938C.e(this.f167839i), C17938C.c(this.f167840j), C17938C.d(this.f167841k), fFloor, this.f167836f);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f167842f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC17174a f167843g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167844h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC17934A f167845i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f167846j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, EnumC17174a enumC17174a, Modifier modifier, InterfaceC17934A interfaceC17934A, int i10) {
            super(2);
            this.f167842f = z10;
            this.f167843g = enumC17174a;
            this.f167844h = modifier;
            this.f167845i = interfaceC17934A;
            this.f167846j = i10;
        }

        public final void a(Composer composer, int i10) {
            C17938C.b(this.f167842f, this.f167843g, this.f167844h, this.f167845i, composer, J0.a(this.f167846j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lt1/a;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$e */
    static final class e extends Lambda implements Function3<k0.b<EnumC17174a>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f167847f = new e();

        e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<EnumC17174a> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<EnumC17174a> bVar, Composer composer, int i10) {
            InterfaceC6419F<Float> interfaceC6419FL;
            composer.startReplaceGroup(1075283605);
            if (ComposerKt.M()) {
                ComposerKt.U(1075283605, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
            }
            EnumC17174a enumC17174aB = bVar.b();
            EnumC17174a enumC17174a = EnumC17174a.f162166b;
            if (enumC17174aB == enumC17174a) {
                interfaceC6419FL = C6453j.h(0, 1, null);
            } else if (bVar.a() == enumC17174a) {
                interfaceC6419FL = C6453j.g(100);
            } else {
                interfaceC6419FL = C6453j.l(100, 0, null, 6, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC6419FL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lt1/a;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$f */
    static final class f extends Lambda implements Function3<k0.b<EnumC17174a>, Composer, Integer, InterfaceC6419F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f167848f = new f();

        f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(k0.b<EnumC17174a> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6419F<Float> a(k0.b<EnumC17174a> bVar, Composer composer, int i10) {
            InterfaceC6419F<Float> interfaceC6419FJ;
            composer.startReplaceGroup(-1707702900);
            if (ComposerKt.M()) {
                ComposerKt.U(-1707702900, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:263)");
            }
            EnumC17174a enumC17174aB = bVar.b();
            EnumC17174a enumC17174a = EnumC17174a.f162166b;
            if (enumC17174aB == enumC17174a) {
                interfaceC6419FJ = C6453j.l(100, 0, null, 6, null);
            } else if (bVar.a() == enumC17174a) {
                interfaceC6419FJ = C6453j.g(100);
            } else {
                interfaceC6419FJ = C6453j.j(0.0f, 0.0f, null, 7, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC6419FJ;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17174a f167849f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f167850g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f167851h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f167852i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f167853j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC17934A f167854k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f167855l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167856m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(EnumC17174a enumC17174a, Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, InterfaceC17934A interfaceC17934A, int i10, int i11) {
            super(2);
            this.f167849f = enumC17174a;
            this.f167850g = function0;
            this.f167851h = modifier;
            this.f167852i = z10;
            this.f167853j = lVar;
            this.f167854k = interfaceC17934A;
            this.f167855l = i10;
            this.f167856m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17938C.h(this.f167849f, this.f167850g, this.f167851h, this.f167852i, this.f167853j, this.f167854k, composer, J0.a(this.f167855l | 1), this.f167856m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r35, t1.EnumC17174a r36, androidx.compose.ui.Modifier r37, kotlin.InterfaceC17934A r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17938C.b(boolean, t1.a, androidx.compose.ui.Modifier, x0.A, androidx.compose.runtime.Composer, int):void");
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$h */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17174a.values().length];
            try {
                iArr[EnumC17174a.f162165a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17174a.f162166b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17174a.f162167c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = 2;
        f167822b = H1.h.p(f10);
        f167824d = H1.h.p(f10);
        f167825e = H1.h.p(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r27, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, h0.l r31, kotlin.InterfaceC17934A r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17938C.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, h0.l, x0.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(t1.EnumC17174a r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, h0.l r28, kotlin.InterfaceC17934A r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17938C.h(t1.a, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, h0.l, x0.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(X0.f fVar, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        Stroke stroke = new Stroke(f11, 0.0f, 0, 0, null, 30, null);
        float fI = U0.k.i(fVar.b());
        if (C5489q0.s(j10, j11)) {
            X0.f.U0(fVar, j10, 0L, U0.l.a(fI, fI), U0.b.a(f10, 0.0f, 2, null), X0.j.f41494a, 0.0f, null, 0, 226, null);
            return;
        }
        float f13 = fI - (2 * f11);
        X0.f.U0(fVar, j10, U0.g.a(f11, f11), U0.l.a(f13, f13), U0.b.a(Math.max(0.0f, f10 - f11), 0.0f, 2, null), X0.j.f41494a, 0.0f, null, 0, 224, null);
        float f14 = fI - f11;
        X0.f.U0(fVar, j11, U0.g.a(f12, f12), U0.l.a(f14, f14), U0.b.a(f10 - f12, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(X0.f fVar, long j10, float f10, float f11, float f12, C18053z c18053z) {
        Stroke stroke = new Stroke(f12, 0.0f, F1.INSTANCE.c(), 0, null, 26, null);
        float fI = U0.k.i(fVar.b());
        float fB = J1.b.b(0.4f, 0.5f, f11);
        float fB2 = J1.b.b(0.7f, 0.5f, f11);
        float fB3 = J1.b.b(0.5f, 0.5f, f11);
        float fB4 = J1.b.b(0.3f, 0.5f, f11);
        c18053z.getCheckPath().reset();
        c18053z.getCheckPath().r(0.2f * fI, fB3 * fI);
        c18053z.getCheckPath().u(fB * fI, fB2 * fI);
        c18053z.getCheckPath().u(0.8f * fI, fI * fB4);
        c18053z.getPathMeasure().a(c18053z.getCheckPath(), false);
        c18053z.getPathToDraw().reset();
        c18053z.getPathMeasure().b(0.0f, c18053z.getPathMeasure().getLength() * f10, c18053z.getPathToDraw(), true);
        X0.f.W1(fVar, c18053z.getPathToDraw(), j10, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(z1<C5489q0> z1Var) {
        return z1Var.getValue().getValue();
    }
}

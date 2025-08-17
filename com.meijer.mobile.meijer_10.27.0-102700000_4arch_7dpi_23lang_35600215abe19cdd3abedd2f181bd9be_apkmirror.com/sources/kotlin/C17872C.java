package kotlin;

import V0.C5346q0;
import V0.F1;
import X0.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.C6327j;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00102\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lh0/l;", "interactionSource", "Lx0/A;", "colors", "a", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/A;Landroidx/compose/runtime/Composer;II)V", "Lt1/a;", "state", "Lkotlin/Function0;", "onClick", "h", "(Lt1/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/A;Landroidx/compose/runtime/Composer;II)V", "value", "b", "(ZLt1/a;Landroidx/compose/ui/Modifier;Lx0/A;Landroidx/compose/runtime/Composer;I)V", "LX0/f;", "LV0/q0;", "boxColor", "borderColor", "", "radius", "strokeWidth", "s", "(LX0/f;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Lx0/z;", "drawingCache", "t", "(LX0/f;JFFFLx0/z;)V", "LH1/h;", "F", "CheckboxRippleRadius", "CheckboxDefaultPadding", "c", "CheckboxSize", "d", "StrokeWidth", "e", "RadiusSize", "checkDrawFraction", "checkCenterGravitationShiftFraction", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17872C {

    /* renamed from: b, reason: collision with root package name */
    private static final float f166734b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f166736d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f166737e;

    /* renamed from: a, reason: collision with root package name */
    private static final float f166733a = H1.h.p(24);

    /* renamed from: c, reason: collision with root package name */
    private static final float f166735c = H1.h.p(20);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f166738f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f166739g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f166738f = function1;
            this.f166739g = z10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f166738f.invoke(Boolean.valueOf(!this.f166739g));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f166740f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f166741g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f166742h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f166743i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f166744j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC17868A f166745k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f166746l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f166747m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, h0.l lVar, InterfaceC17868A interfaceC17868A, int i10, int i11) {
            super(2);
            this.f166740f = z10;
            this.f166741g = function1;
            this.f166742h = modifier;
            this.f166743i = z11;
            this.f166744j = lVar;
            this.f166745k = interfaceC17868A;
            this.f166746l = i10;
            this.f166747m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17872C.a(this.f166740f, this.f166741g, this.f166742h, this.f166743i, this.f166744j, this.f166745k, composer, J0.a(this.f166746l | 1), this.f166747m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$c */
    static final class c extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17987z f166748f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f166749g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f166750h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f166751i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Float> f166752j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<Float> f166753k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17987z c17987z, z1<C5346q0> z1Var, z1<C5346q0> z1Var2, z1<C5346q0> z1Var3, z1<Float> z1Var4, z1<Float> z1Var5) {
            super(1);
            this.f166748f = c17987z;
            this.f166749g = z1Var;
            this.f166750h = z1Var2;
            this.f166751i = z1Var3;
            this.f166752j = z1Var4;
            this.f166753k = z1Var5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }

        public final void a(X0.f fVar) {
            float fFloor = (float) Math.floor(fVar.I1(C17872C.f166736d));
            C17872C.s(fVar, C17872C.f(this.f166749g), C17872C.g(this.f166750h), fVar.I1(C17872C.f166737e), fFloor);
            C17872C.t(fVar, C17872C.e(this.f166751i), C17872C.c(this.f166752j), C17872C.d(this.f166753k), fFloor, this.f166748f);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f166754f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC17055a f166755g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f166756h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC17868A f166757i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f166758j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, EnumC17055a enumC17055a, Modifier modifier, InterfaceC17868A interfaceC17868A, int i10) {
            super(2);
            this.f166754f = z10;
            this.f166755g = enumC17055a;
            this.f166756h = modifier;
            this.f166757i = interfaceC17868A;
            this.f166758j = i10;
        }

        public final void a(Composer composer, int i10) {
            C17872C.b(this.f166754f, this.f166755g, this.f166756h, this.f166757i, composer, J0.a(this.f166758j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lt1/a;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$e */
    static final class e extends Lambda implements Function3<k0.b<EnumC17055a>, Composer, Integer, InterfaceC6293F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f166759f = new e();

        e() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6293F<Float> invoke(k0.b<EnumC17055a> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6293F<Float> a(k0.b<EnumC17055a> bVar, Composer composer, int i10) {
            InterfaceC6293F<Float> interfaceC6293FL;
            composer.startReplaceGroup(1075283605);
            if (ComposerKt.M()) {
                ComposerKt.U(1075283605, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
            }
            EnumC17055a enumC17055aB = bVar.b();
            EnumC17055a enumC17055a = EnumC17055a.f161356b;
            if (enumC17055aB == enumC17055a) {
                interfaceC6293FL = C6327j.h(0, 1, null);
            } else if (bVar.a() == enumC17055a) {
                interfaceC6293FL = C6327j.g(100);
            } else {
                interfaceC6293FL = C6327j.l(100, 0, null, 6, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC6293FL;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/k0$b;", "Lt1/a;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.C$f */
    static final class f extends Lambda implements Function3<k0.b<EnumC17055a>, Composer, Integer, InterfaceC6293F<Float>> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f166760f = new f();

        f() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC6293F<Float> invoke(k0.b<EnumC17055a> bVar, Composer composer, Integer num) {
            return a(bVar, composer, num.intValue());
        }

        public final InterfaceC6293F<Float> a(k0.b<EnumC17055a> bVar, Composer composer, int i10) {
            InterfaceC6293F<Float> interfaceC6293FJ;
            composer.startReplaceGroup(-1707702900);
            if (ComposerKt.M()) {
                ComposerKt.U(-1707702900, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:263)");
            }
            EnumC17055a enumC17055aB = bVar.b();
            EnumC17055a enumC17055a = EnumC17055a.f161356b;
            if (enumC17055aB == enumC17055a) {
                interfaceC6293FJ = C6327j.l(100, 0, null, 6, null);
            } else if (bVar.a() == enumC17055a) {
                interfaceC6293FJ = C6327j.g(100);
            } else {
                interfaceC6293FJ = C6327j.j(0.0f, 0.0f, null, 7, null);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return interfaceC6293FJ;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC17055a f166761f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166762g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f166763h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f166764i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f166765j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC17868A f166766k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f166767l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f166768m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(EnumC17055a enumC17055a, Function0<Unit> function0, Modifier modifier, boolean z10, h0.l lVar, InterfaceC17868A interfaceC17868A, int i10, int i11) {
            super(2);
            this.f166761f = enumC17055a;
            this.f166762g = function0;
            this.f166763h = modifier;
            this.f166764i = z10;
            this.f166765j = lVar;
            this.f166766k = interfaceC17868A;
            this.f166767l = i10;
            this.f166768m = i11;
        }

        public final void a(Composer composer, int i10) {
            C17872C.h(this.f166761f, this.f166762g, this.f166763h, this.f166764i, this.f166765j, this.f166766k, composer, J0.a(this.f166767l | 1), this.f166768m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
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
    public static final void b(boolean r35, t1.EnumC17055a r36, androidx.compose.ui.Modifier r37, kotlin.InterfaceC17868A r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17872C.b(boolean, t1.a, androidx.compose.ui.Modifier, x0.A, androidx.compose.runtime.Composer, int):void");
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.C$h */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17055a.values().length];
            try {
                iArr[EnumC17055a.f161355a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17055a.f161356b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17055a.f161357c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = 2;
        f166734b = H1.h.p(f10);
        f166736d = H1.h.p(f10);
        f166737e = H1.h.p(f10);
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
    public static final void a(boolean r27, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, h0.l r31, kotlin.InterfaceC17868A r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17872C.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, h0.l, x0.A, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void h(t1.EnumC17055a r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, h0.l r28, kotlin.InterfaceC17868A r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17872C.h(t1.a, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, h0.l, x0.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(X0.f fVar, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        Stroke stroke = new Stroke(f11, 0.0f, 0, 0, null, 30, null);
        float fI = U0.k.i(fVar.b());
        if (C5346q0.s(j10, j11)) {
            X0.f.U0(fVar, j10, 0L, U0.l.a(fI, fI), U0.b.a(f10, 0.0f, 2, null), X0.j.f39072a, 0.0f, null, 0, 226, null);
            return;
        }
        float f13 = fI - (2 * f11);
        X0.f.U0(fVar, j10, U0.g.a(f11, f11), U0.l.a(f13, f13), U0.b.a(Math.max(0.0f, f10 - f11), 0.0f, 2, null), X0.j.f39072a, 0.0f, null, 0, 224, null);
        float f14 = fI - f11;
        X0.f.U0(fVar, j11, U0.g.a(f12, f12), U0.l.a(f14, f14), U0.b.a(f10 - f12, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(X0.f fVar, long j10, float f10, float f11, float f12, C17987z c17987z) {
        Stroke stroke = new Stroke(f12, 0.0f, F1.INSTANCE.c(), 0, null, 26, null);
        float fI = U0.k.i(fVar.b());
        float fB = J1.b.b(0.4f, 0.5f, f11);
        float fB2 = J1.b.b(0.7f, 0.5f, f11);
        float fB3 = J1.b.b(0.5f, 0.5f, f11);
        float fB4 = J1.b.b(0.3f, 0.5f, f11);
        c17987z.getCheckPath().reset();
        c17987z.getCheckPath().r(0.2f * fI, fB3 * fI);
        c17987z.getCheckPath().u(fB * fI, fB2 * fI);
        c17987z.getCheckPath().u(0.8f * fI, fI * fB4);
        c17987z.getPathMeasure().a(c17987z.getCheckPath(), false);
        c17987z.getPathToDraw().reset();
        c17987z.getPathMeasure().b(0.0f, c17987z.getPathMeasure().getLength() * f10, c17987z.getPathToDraw(), true);
        X0.f.W1(fVar, c17987z.getPathToDraw(), j10, 0.0f, stroke, null, 0, 52, null);
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
    public static final long e(z1<C5346q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(z1<C5346q0> z1Var) {
        return z1Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(z1<C5346q0> z1Var) {
        return z1Var.getValue().getValue();
    }
}

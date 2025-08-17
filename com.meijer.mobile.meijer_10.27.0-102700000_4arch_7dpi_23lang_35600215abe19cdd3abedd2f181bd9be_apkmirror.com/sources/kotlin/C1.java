package kotlin;

import H1.o;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.C6292E;
import kotlin.C6317c;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d²\u0006\f\u0010\u001b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lx0/C1;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "LH1/h;", "thickness", "LV0/q0;", "color", "", "a", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "height", "b", "Lx0/B1;", "currentTabPosition", "e", "(Landroidx/compose/ui/Modifier;Lx0/B1;)Landroidx/compose/ui/Modifier;", "F", "getDividerThickness-D9Ej5fM", "()F", "DividerThickness", "c", "IndicatorHeight", "d", "ScrollableTabRowPadding", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1 f166781a = new C1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float DividerThickness = H1.h.p(1);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IndicatorHeight = H1.h.p(2);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ScrollableTabRowPadding = H1.h.p(52);

    /* renamed from: e, reason: collision with root package name */
    public static final int f166785e = 0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f166787g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f166788h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f166789i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f166790j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f166791k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, float f10, long j10, int i10, int i11) {
            super(2);
            this.f166787g = modifier;
            this.f166788h = f10;
            this.f166789i = j10;
            this.f166790j = i10;
            this.f166791k = i11;
        }

        public final void a(Composer composer, int i10) {
            C1.this.a(this.f166787g, this.f166788h, this.f166789i, composer, J0.a(this.f166790j | 1), this.f166791k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f166793g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f166794h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f166795i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f166796j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f166797k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, float f10, long j10, int i10, int i11) {
            super(2);
            this.f166793g = modifier;
            this.f166794h = f10;
            this.f166795i = j10;
            this.f166796j = i10;
            this.f166797k = i11;
        }

        public final void a(Composer composer, int i10) {
            C1.this.b(this.f166793g, this.f166794h, this.f166795i, composer, J0.a(this.f166796j | 1), this.f166797k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TabPosition f166798f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TabPosition tabPosition) {
            super(1);
            this.f166798f = tabPosition;
        }

        public final void a(N0 n02) {
            n02.b("tabIndicatorOffset");
            n02.c(this.f166798f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TabPosition f166799f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LH1/n;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<H1.d, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<H1.h> f166800f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<H1.h> z1Var) {
                super(1);
                this.f166800f = z1Var;
            }

            public final long a(H1.d dVar) {
                return o.a(dVar.E0(d.d(this.f166800f)), 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ H1.n invoke(H1.d dVar) {
                return H1.n.c(a(dVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TabPosition tabPosition) {
            super(3);
            this.f166799f = tabPosition;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return b(modifier, composer, num.intValue());
        }

        private static final float c(z1<H1.h> z1Var) {
            return z1Var.getValue().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float d(z1<H1.h> z1Var) {
            return z1Var.getValue().getValue();
        }

        public final Modifier b(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-398757863);
            if (ComposerKt.M()) {
                ComposerKt.U(-398757863, i10, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
            }
            z1<H1.h> z1VarC = C6317c.c(this.f166799f.getWidth(), C6327j.l(250, 0, C6292E.c(), 2, null), null, null, composer, 0, 12);
            z1<H1.h> z1VarC2 = C6317c.c(this.f166799f.getLeft(), C6327j.l(250, 0, C6292E.c(), 2, null), null, null, composer, 0, 12);
            Modifier modifierF = J.F(J.h(modifier, 0.0f, 1, null), P0.e.INSTANCE.d(), false, 2, null);
            boolean zV = composer.V(z1VarC2);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(z1VarC2);
                composer.t(objB);
            }
            Modifier modifierZ = J.z(A.a(modifierF, (Function1) objB), c(z1VarC));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(androidx.compose.ui.Modifier r22, float r23, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1.a(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.compose.ui.Modifier r21, float r22, long r23, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1.b(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float c() {
        return IndicatorHeight;
    }

    public final float d() {
        return ScrollableTabRowPadding;
    }

    private C1() {
    }

    public final Modifier e(Modifier modifier, TabPosition tabPosition) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new c(tabPosition);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new d(tabPosition));
    }
}

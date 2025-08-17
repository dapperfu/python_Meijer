package androidx.compose.foundation.text;

import V0.C5347r0;
import V0.InterfaceC5316f1;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14802K;
import kotlin.C17693B;
import kotlin.C17713W;
import kotlin.C17715a;
import kotlin.EnumC17740z;
import kotlin.InterfaceC17727m;
import kotlin.Metadata;
import kotlin.SelectionColors;
import kotlin.SelectionHandleInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lw0/m;", "offsetProvider", "Landroidx/compose/ui/Modifier;", "modifier", "LH1/k;", "minTouchTargetSize", "", "a", "(Lw0/m;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "d", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "LH1/h;", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5669a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f49304a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f49305b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.a$a, reason: collision with other inner class name */
    static final class C1015a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f49306f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49307g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1015a(long j10, Modifier modifier) {
            super(2);
            this.f49306f = j10;
            this.f49307g = modifier;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1653527038, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (this.f49306f != 9205357640488583168L) {
                composer.startReplaceGroup(1828931592);
                Modifier modifierR = androidx.compose.foundation.layout.J.r(this.f49307g, H1.k.h(this.f49306f), H1.k.g(this.f49306f), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.m(), false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierR);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
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
                D1.c(composerA, measurePolicyG, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C5664j c5664j = C5664j.f48612a;
                C5669a.b(null, composer, 0, 1);
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(1829298756);
                C5669a.b(this.f49307g, composer, 0, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f49308f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49309g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f49310h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49311i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49312j;

        public final void a(Composer composer, int i10) {
            C5669a.a(this.f49308f, this.f49309g, this.f49310h, composer, J0.a(this.f49311i | 1), this.f49312j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC17727m interfaceC17727m, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f49308f = interfaceC17727m;
            this.f49309g = modifier;
            this.f49310h = j10;
            this.f49311i = i10;
            this.f49312j = i11;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.a$c */
    static final class c extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17727m f49313f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC17727m interfaceC17727m) {
            super(1);
            this.f49313f = interfaceC17727m;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }

        public final void a(r1.u uVar) {
            uVar.a(C17693B.d(), new SelectionHandleInfo(EnumC5682n.f49690a, this.f49313f.a(), EnumC17740z.f165633b, true, null));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.a$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f49314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49315g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49316h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, int i10, int i11) {
            super(2);
            this.f49314f = modifier;
            this.f49315g = i10;
            this.f49316h = i11;
        }

        public final void a(Composer composer, int i10) {
            C5669a.b(this.f49314f, composer, J0.a(this.f49315g | 1), this.f49316h);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.a$e */
    static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f49317f = new e();

        e() {
            super(3);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LT0/d;", "LT0/i;", "a", "(LT0/d;)LT0/i;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.text.a$e$a, reason: collision with other inner class name */
        static final class C1016a extends Lambda implements Function1<T0.d, T0.i> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f49318f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.a$e$a$a, reason: collision with other inner class name */
            static final class C1017a extends Lambda implements Function1<X0.c, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f49319f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5316f1 f49320g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ C5347r0 f49321h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1017a(float f10, InterfaceC5316f1 interfaceC5316f1, C5347r0 c5347r0) {
                    super(1);
                    this.f49319f = f10;
                    this.f49320g = interfaceC5316f1;
                    this.f49321h = c5347r0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
                    a(cVar);
                    return Unit.f142422a;
                }

                public final void a(X0.c cVar) {
                    cVar.a2();
                    float f10 = this.f49319f;
                    InterfaceC5316f1 interfaceC5316f1 = this.f49320g;
                    C5347r0 c5347r0 = this.f49321h;
                    X0.d drawContext = cVar.getDrawContext();
                    long jB = drawContext.b();
                    drawContext.g().save();
                    try {
                        X0.h transform = drawContext.getTransform();
                        X0.h.k(transform, f10, 0.0f, 2, null);
                        transform.g(45.0f, U0.f.INSTANCE.c());
                        X0.f.X0(cVar, interfaceC5316f1, 0L, 0.0f, null, c5347r0, 0, 46, null);
                    } finally {
                        drawContext.g().i();
                        drawContext.h(jB);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1016a(long j10) {
                super(1);
                this.f49318f = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T0.i invoke(T0.d dVar) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32)) / 2.0f;
                return dVar.q(new C1017a(fIntBitsToFloat, C17715a.d(dVar, fIntBitsToFloat), C5347r0.Companion.c(C5347r0.INSTANCE, this.f49318f, 0, 2, null)));
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-2126899193);
            if (ComposerKt.M()) {
                ComposerKt.U(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long selectionHandleColor = ((SelectionColors) composer.o(C17713W.b())).getSelectionHandleColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zE = composer.e(selectionHandleColor);
            Object objB = composer.B();
            if (zE || objB == Composer.INSTANCE.a()) {
                objB = new C1016a(selectionHandleColor);
                composer.t(objB);
            }
            Modifier modifierThen = modifier.then(androidx.compose.ui.draw.b.c(companion, (Function1) objB));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierThen;
        }
    }

    static {
        float fP = H1.h.p(25);
        f49304a = fP;
        f49305b = H1.h.p(H1.h.p(fP * 2.0f) / 2.4142137f);
    }

    private static final Modifier d(Modifier modifier) {
        return androidx.compose.ui.b.c(modifier, null, e.f49317f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.InterfaceC17727m r8, androidx.compose.ui.Modifier r9, long r10, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5669a.a(w0.m, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Modifier modifier, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(694251107);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            C14802K.a(d(androidx.compose.foundation.layout.J.w(modifier, f49305b, f49304a)), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(modifier, i10, i11));
        }
    }
}

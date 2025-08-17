package Ci;

import Ci.j;
import Ji.LocalThemeScope;
import Ji.Q;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ji.InterfaceC14928c0;
import ji.b1;
import ji.q1;
import kotlin.FractionalThreshold;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.O1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.w1;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aR\u0010\u0011\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00102\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "description", "Lji/q1$m$c;", "template", "Lkotlin/Function1;", "LCi/o;", "", "Lkotlin/ExtensionFunctionType;", "content", "l", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lji/q1$m$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bodyLabel", "titleLabel", "Lji/q1$m$b;", "i", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lji/q1$m$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LGi/i;", "toastState", "localThemeScope", "o", "(LGi/i;Landroidx/compose/ui/Modifier;LJi/M;Landroidx/compose/runtime/Composer;II)V", "LU0/k;", "size", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class j {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Ii.c<Integer, t, t> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<t, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<t> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final t initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ci.j$a$a, reason: collision with other inner class name */
        public static final class C0075a implements Function0<t> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f4194a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f4195b;

            public C0075a(Ii.h hVar, a aVar) {
                this.f4194a = hVar;
                this.f4195b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ci.t, Ii.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t invoke() {
                ?? r02 = this.f4194a;
                this.f4195b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<t> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public t getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<t, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C0075a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ii.c<Integer, t, t> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<t, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<t> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final t initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<t> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f4199a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4200b;

            public a(Ii.h hVar, b bVar) {
                this.f4199a = hVar;
                this.f4200b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ci.t, Ii.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t invoke() {
                ?? r02 = this.f4199a;
                this.f4200b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<t> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public t getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<t, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<Gi.d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Gi.i f4203c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14928c0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f4204a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Gi.d f4205b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Gi.i f4206c;

            a(LocalThemeScope localThemeScope, Gi.d dVar, Gi.i iVar) {
                this.f4204a = localThemeScope;
                this.f4205b = dVar;
                this.f4206c = iVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(final Gi.d dVar, final Gi.i iVar, o AdsToast) {
                Intrinsics.j(AdsToast, "$this$AdsToast");
                String actionLabel = dVar.getActionLabel();
                if (actionLabel != null) {
                    AdsToast.D(actionLabel, new Function0() { // from class: Ci.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.c.a.f(dVar, iVar);
                        }
                    });
                }
                if (dVar.getShowCloseIcon()) {
                    AdsToast.Q(new Function0() { // from class: Ci.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.c.a.g(dVar, iVar);
                        }
                    });
                }
                return Unit.f142422a;
            }

            public final void d(InterfaceC14928c0 Assemble, Composer composer, int i10) {
                q1.m.Toast informational;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1285568352, i10, -1, "com.meijer.mobile.android_acres_library.composables.notification.SwipeableNotificationHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationComposable.kt:318)");
                }
                LocalThemeScope localThemeScope = this.f4204a;
                String bodyLabel = this.f4205b.getBodyLabel();
                q1.m.a toastState = this.f4205b.getToastState();
                if (Intrinsics.e(toastState, q1.m.a.C2217a.f140112a)) {
                    informational = Assemble.getToastVariant().getDefault();
                } else if (Intrinsics.e(toastState, q1.m.a.b.f140113a)) {
                    informational = Assemble.getToastVariant().getError();
                } else if (Intrinsics.e(toastState, q1.m.a.d.f140117a)) {
                    informational = Assemble.getToastVariant().getSuccess();
                } else if (Intrinsics.e(toastState, q1.m.a.e.f140119a)) {
                    informational = Assemble.getToastVariant().getWarning();
                } else {
                    if (!Intrinsics.e(toastState, q1.m.a.c.f140115a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    informational = Assemble.getToastVariant().getInformational();
                }
                q1.m.Toast toast = informational;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f4205b) | composer.V(this.f4206c);
                final Gi.d dVar = this.f4205b;
                final Gi.i iVar = this.f4206c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Ci.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.c.a.e(dVar, iVar, (o) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                j.l(localThemeScope, null, bodyLabel, toast, (Function1) objB, composer, 0, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14928c0 interfaceC14928c0, Composer composer, Integer num) {
                d(interfaceC14928c0, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Gi.d dVar, Gi.i iVar) {
                Gi.d dVarF;
                if (dVar.k().invoke().booleanValue() && (dVarF = iVar.f()) != null) {
                    dVarF.g(true);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Gi.d dVar, Gi.i iVar) {
                Gi.d dVarF;
                if (dVar.j().invoke().booleanValue() && (dVarF = iVar.f()) != null) {
                    dVarF.g(true);
                }
                return Unit.f142422a;
            }
        }

        c(float f10, LocalThemeScope localThemeScope, Gi.i iVar) {
            this.f4201a = f10;
            this.f4202b = localThemeScope;
            this.f4203c = iVar;
        }

        public final void a(Gi.d toastData, Composer composer, int i10) {
            Intrinsics.j(toastData, "toastData");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(toastData) : composer.D(toastData) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-914899621, i10, -1, "com.meijer.mobile.android_acres_library.composables.notification.SwipeableNotificationHost.<anonymous>.<anonymous> (NotificationComposable.kt:313)");
            }
            Modifier modifierC = A.c(Modifier.INSTANCE, this.f4201a, 0.0f, 2, null);
            LocalThemeScope localThemeScope = this.f4202b;
            Gi.i iVar = this.f4203c;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
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
            Q.e(localThemeScope, b1.f139765a, ComposableLambdaKt.c(-1285568352, true, new a(localThemeScope, toastData, iVar), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Gi.d dVar, Composer composer, Integer num) {
            a(dVar, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ci/j$d", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w1 f4207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gi.i f4208b;

        public d(w1 w1Var, Gi.i iVar) {
            this.f4207a = w1Var;
            this.f4208b = iVar;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            Gi.d dVarF;
            int i10 = e.$EnumSwitchMapping$0[((u) this.f4207a.o()).ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && (dVarF = this.f4208b.f()) != null) {
                    dVarF.g(true);
                    return;
                }
                return;
            }
            Gi.d dVarF2 = this.f4208b.f();
            if (dVarF2 != null) {
                dVarF2.g(true);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.f4231c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.f4229a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, final java.lang.String r18, java.lang.String r19, final ji.q1.m.Inline r20, kotlin.jvm.functions.Function1<? super Ci.o, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.j.i(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, ji.q1$m$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o oVar) {
        Intrinsics.j(oVar, "<this>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, q1.m.Inline inline, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, str, str2, inline, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r14, androidx.compose.ui.Modifier r15, final java.lang.String r16, final ji.q1.m.Toast r17, kotlin.jvm.functions.Function1<? super Ci.o, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.j.l(Ji.M, androidx.compose.ui.Modifier, java.lang.String, ji.q1$m$c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(o oVar) {
        Intrinsics.j(oVar, "<this>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, String str, q1.m.Toast toast, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, modifier, str, toast, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Gi.i r28, androidx.compose.ui.Modifier r29, final Ji.LocalThemeScope r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.j.o(Gi.i, androidx.compose.ui.Modifier, Ji.M, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O1 s(u uVar, u uVar2) {
        Intrinsics.j(uVar, "<unused var>");
        Intrinsics.j(uVar2, "<unused var>");
        return new FractionalThreshold(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Gi.i iVar, Modifier modifier, LocalThemeScope localThemeScope, int i10, int i11, Composer composer, int i12) {
        o(iVar, modifier, localThemeScope, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E u(w1 w1Var, Gi.i iVar, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        return new d(w1Var, iVar);
    }

    private static final long p(InterfaceC5730l0<U0.k> interfaceC5730l0) {
        return interfaceC5730l0.getValue().getPackedValue();
    }

    private static final void q(InterfaceC5730l0<U0.k> interfaceC5730l0, long j10) {
        interfaceC5730l0.setValue(U0.k.c(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5730l0 interfaceC5730l0, H1.r rVar) {
        float packedValue = (int) (rVar.getPackedValue() >> 32);
        float packedValue2 = (int) (rVar.getPackedValue() & 4294967295L);
        q(interfaceC5730l0, U0.k.d((Float.floatToRawIntBits(packedValue) << 32) | (Float.floatToRawIntBits(packedValue2) & 4294967295L)));
        return Unit.f142422a;
    }
}

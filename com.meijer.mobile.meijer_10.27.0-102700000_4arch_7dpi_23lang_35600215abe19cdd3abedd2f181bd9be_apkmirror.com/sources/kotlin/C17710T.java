package kotlin;

import H1.r;
import android.os.Build;
import androidx.compose.foundation.text.C5679k;
import androidx.compose.foundation.text.G;
import androidx.compose.foundation.text.M;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.y;
import d0.C13430D;
import d0.N;
import e0.C13600g;
import e0.ContextMenuState;
import g1.C14185q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a:\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lw0/Q;", "manager", "c", "(Landroidx/compose/ui/Modifier;Lw0/Q;)Landroidx/compose/ui/Modifier;", "Le0/i;", "contextMenuState", "Landroidx/compose/runtime/z1;", "Landroidx/compose/foundation/text/G;", "itemsAvailability", "Lkotlin/Function1;", "Le0/g;", "", "Lkotlin/ExtensionFunctionType;", "a", "(Lw0/Q;Le0/i;Landroidx/compose/runtime/z1;)Lkotlin/jvm/functions/Function1;", "Lg1/q;", "", "b", "(Lg1/q;)Z", "isShiftPressed", "LH1/r;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17710T {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le0/g;", "", "a", "(Le0/g;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.T$a */
    static final class a extends Lambda implements Function1<C13600g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<G> f165431f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f165432g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17708Q f165433h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$a, reason: collision with other inner class name */
        public static final class C2613a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f165434f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17708Q f165435g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2613a(ContextMenuState contextMenuState, C17708Q c17708q) {
                super(0);
                this.f165434f = contextMenuState;
                this.f165435g = c17708q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f165435g.u();
                e0.j.a(this.f165434f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$b */
        public static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f165436f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17708Q f165437g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ContextMenuState contextMenuState, C17708Q c17708q) {
                super(0);
                this.f165436f = contextMenuState;
                this.f165437g = c17708q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f165437g.q(false);
                e0.j.a(this.f165436f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$c */
        public static final class c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f165438f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17708Q f165439g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ContextMenuState contextMenuState, C17708Q c17708q) {
                super(0);
                this.f165438f = contextMenuState;
                this.f165439g = c17708q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f165439g.Z();
                e0.j.a(this.f165438f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$d */
        public static final class d extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f165440f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17708Q f165441g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ContextMenuState contextMenuState, C17708Q c17708q) {
                super(0);
                this.f165440f = contextMenuState;
                this.f165441g = c17708q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f165441g.a0();
                e0.j.a(this.f165440f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$e */
        public static final class e extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f165442f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17708Q f165443g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ContextMenuState contextMenuState, C17708Q c17708q) {
                super(0);
                this.f165442f = contextMenuState;
                this.f165443g = c17708q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f165443g.o();
                e0.j.a(this.f165442f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1<G> z1Var, ContextMenuState contextMenuState, C17708Q c17708q) {
            super(1);
            this.f165431f = z1Var;
            this.f165432g = contextMenuState;
            this.f165433h = c17708q;
        }

        public final void a(C13600g c13600g) {
            int value = this.f165431f.getValue().getValue();
            ContextMenuState contextMenuState = this.f165432g;
            M m10 = M.f49231b;
            boolean zG = G.g(value);
            C17708Q c17708q = this.f165433h;
            if (zG) {
                C13600g.d(c13600g, new C5679k(m10), null, false, null, new C2613a(contextMenuState, c17708q), 14, null);
            }
            ContextMenuState contextMenuState2 = this.f165432g;
            M m11 = M.f49232c;
            boolean zF = G.f(value);
            C17708Q c17708q2 = this.f165433h;
            if (zF) {
                C13600g.d(c13600g, new C5679k(m11), null, false, null, new b(contextMenuState2, c17708q2), 14, null);
            }
            ContextMenuState contextMenuState3 = this.f165432g;
            M m12 = M.f49233d;
            boolean zH = G.h(value);
            C17708Q c17708q3 = this.f165433h;
            if (zH) {
                C13600g.d(c13600g, new C5679k(m12), null, false, null, new c(contextMenuState3, c17708q3), 14, null);
            }
            ContextMenuState contextMenuState4 = this.f165432g;
            M m13 = M.f49234e;
            boolean zI = G.i(value);
            C17708Q c17708q4 = this.f165433h;
            if (zI) {
                C13600g.d(c13600g, new C5679k(m13), null, false, null, new d(contextMenuState4, c17708q4), 14, null);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ContextMenuState contextMenuState5 = this.f165432g;
                M m14 = M.f49235f;
                boolean z10 = this.f165433h.G() && y.h(this.f165433h.U().getSelection());
                C17708Q c17708q5 = this.f165433h;
                if (z10) {
                    C13600g.d(c13600g, new C5679k(m14), null, false, null, new e(contextMenuState5, c17708q5), 14, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13600g c13600g) {
            a(c13600g);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.T$b */
    static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17708Q f165444f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.T$b$a */
        static final class a extends Lambda implements kotlin.jvm.functions.Function0<U0.f> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17708Q f165445f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<r> f165446g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17708Q c17708q, InterfaceC5730l0<r> interfaceC5730l0) {
                super(0);
                this.f165445f = c17708q;
                this.f165446g = interfaceC5730l0;
            }

            public final long c() {
                return C17709S.b(this.f165445f, b.d(this.f165446g));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ U0.f invoke() {
                return U0.f.d(c());
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "LU0/f;", "center", "Landroidx/compose/ui/Modifier;", "b", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.T$b$b, reason: from Kotlin metadata */
        static final class Function0 extends Lambda implements Function1<kotlin.jvm.functions.Function0<? extends U0.f>, Modifier> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ H1.d f165447f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<r> f165448g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LU0/f;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w0.T$b$b$a */
            static final class a extends Lambda implements Function1<H1.d, U0.f> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.functions.Function0<U0.f> f165449f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(kotlin.jvm.functions.Function0<U0.f> function0) {
                    super(1);
                    this.f165449f = function0;
                }

                public final long a(H1.d dVar) {
                    return this.f165449f.invoke().getPackedValue();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ U0.f invoke(H1.d dVar) {
                    return U0.f.d(a(dVar));
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/k;", "size", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.T$b$b$b, reason: collision with other inner class name */
            static final class C2614b extends Lambda implements Function1<H1.k, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ H1.d f165450f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<r> f165451g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2614b(H1.d dVar, InterfaceC5730l0<r> interfaceC5730l0) {
                    super(1);
                    this.f165450f = dVar;
                    this.f165451g = interfaceC5730l0;
                }

                public final void a(long j10) {
                    b.e(this.f165451g, r.c((r1.E0(H1.k.g(j10)) & 4294967295L) | (this.f165450f.E0(H1.k.h(j10)) << 32)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(H1.k kVar) {
                    a(kVar.getPackedValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Function0(H1.d dVar, InterfaceC5730l0<r> interfaceC5730l0) {
                super(1);
                this.f165447f = dVar;
                this.f165448g = interfaceC5730l0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(kotlin.jvm.functions.Function0<U0.f> function0) {
                return C13430D.f(Modifier.INSTANCE, new a(function0), null, new C2614b(this.f165447f, this.f165448g), 0.0f, true, 0L, 0.0f, 0.0f, false, N.INSTANCE.a(), 490, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17708Q c17708q) {
            super(3);
            this.f165444f = c17708q;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return c(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long d(InterfaceC5730l0<r> interfaceC5730l0) {
            return interfaceC5730l0.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5730l0<r> interfaceC5730l0, long j10) {
            interfaceC5730l0.setValue(r.b(j10));
        }

        public final Modifier c(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(1980580247);
            if (ComposerKt.M()) {
                ComposerKt.U(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
            }
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(r.b(r.INSTANCE.a()), null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            boolean zD = composer.D(this.f165444f);
            C17708Q c17708q = this.f165444f;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new a(c17708q, interfaceC5730l0);
                composer.t(objB2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) objB2;
            boolean zV = composer.V(dVar);
            Object objB3 = composer.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new Function0(dVar, interfaceC5730l0);
                composer.t(objB3);
            }
            Modifier modifierD = C17697F.d(modifier, function0, (Function1) objB3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierD;
        }
    }

    public static final boolean b(C14185q c14185q) {
        return false;
    }

    public static final Modifier c(Modifier modifier, C17708Q c17708q) {
        return !C13430D.d(0, 1, null) ? modifier : androidx.compose.ui.b.c(modifier, null, new b(c17708q), 1, null);
    }

    public static final Function1<C13600g, Unit> a(C17708Q c17708q, ContextMenuState contextMenuState, z1<G> z1Var) {
        return new a(z1Var, contextMenuState, c17708q);
    }
}

package kotlin;

import H1.r;
import android.os.Build;
import androidx.compose.foundation.text.C5821k;
import androidx.compose.foundation.text.G;
import androidx.compose.foundation.text.M;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.y;
import d0.C13563D;
import d0.N;
import e0.C13748g;
import e0.ContextMenuState;
import g1.C14314q;
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
public final class C17780T {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le0/g;", "", "a", "(Le0/g;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.T$a */
    static final class a extends Lambda implements Function1<C13748g, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<G> f166642f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f166643g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17778Q f166644h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$a, reason: collision with other inner class name */
        public static final class C2637a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f166645f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17778Q f166646g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2637a(ContextMenuState contextMenuState, C17778Q c17778q) {
                super(0);
                this.f166645f = contextMenuState;
                this.f166646g = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166646g.u();
                e0.j.a(this.f166645f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$b */
        public static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f166647f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17778Q f166648g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ContextMenuState contextMenuState, C17778Q c17778q) {
                super(0);
                this.f166647f = contextMenuState;
                this.f166648g = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166648g.q(false);
                e0.j.a(this.f166647f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$c */
        public static final class c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f166649f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17778Q f166650g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ContextMenuState contextMenuState, C17778Q c17778q) {
                super(0);
                this.f166649f = contextMenuState;
                this.f166650g = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166650g.Z();
                e0.j.a(this.f166649f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$d */
        public static final class d extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f166651f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17778Q f166652g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ContextMenuState contextMenuState, C17778Q c17778q) {
                super(0);
                this.f166651f = contextMenuState;
                this.f166652g = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166652g.a0();
                e0.j.a(this.f166651f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: w0.T$a$e */
        public static final class e extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f166653f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C17778Q f166654g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ContextMenuState contextMenuState, C17778Q c17778q) {
                super(0);
                this.f166653f = contextMenuState;
                this.f166654g = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166654g.o();
                e0.j.a(this.f166653f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1<G> z1Var, ContextMenuState contextMenuState, C17778Q c17778q) {
            super(1);
            this.f166642f = z1Var;
            this.f166643g = contextMenuState;
            this.f166644h = c17778q;
        }

        public final void a(C13748g c13748g) {
            int value = this.f166642f.getValue().getValue();
            ContextMenuState contextMenuState = this.f166643g;
            M m10 = M.f49455b;
            boolean zG = G.g(value);
            C17778Q c17778q = this.f166644h;
            if (zG) {
                C13748g.d(c13748g, new C5821k(m10), null, false, null, new C2637a(contextMenuState, c17778q), 14, null);
            }
            ContextMenuState contextMenuState2 = this.f166643g;
            M m11 = M.f49456c;
            boolean zF = G.f(value);
            C17778Q c17778q2 = this.f166644h;
            if (zF) {
                C13748g.d(c13748g, new C5821k(m11), null, false, null, new b(contextMenuState2, c17778q2), 14, null);
            }
            ContextMenuState contextMenuState3 = this.f166643g;
            M m12 = M.f49457d;
            boolean zH = G.h(value);
            C17778Q c17778q3 = this.f166644h;
            if (zH) {
                C13748g.d(c13748g, new C5821k(m12), null, false, null, new c(contextMenuState3, c17778q3), 14, null);
            }
            ContextMenuState contextMenuState4 = this.f166643g;
            M m13 = M.f49458e;
            boolean zI = G.i(value);
            C17778Q c17778q4 = this.f166644h;
            if (zI) {
                C13748g.d(c13748g, new C5821k(m13), null, false, null, new d(contextMenuState4, c17778q4), 14, null);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ContextMenuState contextMenuState5 = this.f166643g;
                M m14 = M.f49459f;
                boolean z10 = this.f166644h.G() && y.h(this.f166644h.U().getSelection());
                C17778Q c17778q5 = this.f166644h;
                if (z10) {
                    C13748g.d(c13748g, new C5821k(m14), null, false, null, new e(contextMenuState5, c17778q5), 14, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13748g c13748g) {
            a(c13748g);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.T$b */
    static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17778Q f166655f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w0.T$b$a */
        static final class a extends Lambda implements kotlin.jvm.functions.Function0<U0.f> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166656f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<r> f166657g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17778Q c17778q, InterfaceC5872l0<r> interfaceC5872l0) {
                super(0);
                this.f166656f = c17778q;
                this.f166657g = interfaceC5872l0;
            }

            public final long c() {
                return C17779S.b(this.f166656f, b.d(this.f166657g));
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
            final /* synthetic */ H1.d f166658f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<r> f166659g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH1/d;", "LU0/f;", "a", "(LH1/d;)J"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w0.T$b$b$a */
            static final class a extends Lambda implements Function1<H1.d, U0.f> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.functions.Function0<U0.f> f166660f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(kotlin.jvm.functions.Function0<U0.f> function0) {
                    super(1);
                    this.f166660f = function0;
                }

                public final long a(H1.d dVar) {
                    return this.f166660f.invoke().getPackedValue();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ U0.f invoke(H1.d dVar) {
                    return U0.f.d(a(dVar));
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/k;", "size", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: w0.T$b$b$b, reason: collision with other inner class name */
            static final class C2638b extends Lambda implements Function1<H1.k, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ H1.d f166661f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<r> f166662g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2638b(H1.d dVar, InterfaceC5872l0<r> interfaceC5872l0) {
                    super(1);
                    this.f166661f = dVar;
                    this.f166662g = interfaceC5872l0;
                }

                public final void a(long j10) {
                    b.e(this.f166662g, r.c((r1.E0(H1.k.g(j10)) & 4294967295L) | (this.f166661f.E0(H1.k.h(j10)) << 32)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(H1.k kVar) {
                    a(kVar.getPackedValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Function0(H1.d dVar, InterfaceC5872l0<r> interfaceC5872l0) {
                super(1);
                this.f166658f = dVar;
                this.f166659g = interfaceC5872l0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(kotlin.jvm.functions.Function0<U0.f> function0) {
                return C13563D.f(Modifier.INSTANCE, new a(function0), null, new C2638b(this.f166658f, this.f166659g), 0.0f, true, 0L, 0.0f, 0.0f, false, N.INSTANCE.a(), 490, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17778Q c17778q) {
            super(3);
            this.f166655f = c17778q;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return c(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long d(InterfaceC5872l0<r> interfaceC5872l0) {
            return interfaceC5872l0.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5872l0<r> interfaceC5872l0, long j10) {
            interfaceC5872l0.setValue(r.b(j10));
        }

        public final Modifier c(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(1980580247);
            if (ComposerKt.M()) {
                ComposerKt.U(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
            }
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(r.b(r.INSTANCE.a()), null, 2, null);
                composer.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            boolean zD = composer.D(this.f166655f);
            C17778Q c17778q = this.f166655f;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new a(c17778q, interfaceC5872l0);
                composer.t(objB2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) objB2;
            boolean zV = composer.V(dVar);
            Object objB3 = composer.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new Function0(dVar, interfaceC5872l0);
                composer.t(objB3);
            }
            Modifier modifierD = C17767F.d(modifier, function0, (Function1) objB3);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierD;
        }
    }

    public static final boolean b(C14314q c14314q) {
        return false;
    }

    public static final Modifier c(Modifier modifier, C17778Q c17778q) {
        return !C13563D.d(0, 1, null) ? modifier : androidx.compose.ui.b.c(modifier, null, new b(c17778q), 1, null);
    }

    public static final Function1<C13748g, Unit> a(C17778Q c17778q, ContextMenuState contextMenuState, z1<G> z1Var) {
        return new a(z1Var, contextMenuState, c17778q);
    }
}

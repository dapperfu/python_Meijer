package Ii;

import Ki.LocalThemeScope;
import Ki.T;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13561B;
import j0.C14889J;
import java.util.Arrays;
import ki.q1;
import kotlin.C17982Y0;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16673d;
import r0.C16806i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aH\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LKi/T;", "backgroundColor", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "LIi/i;", "Lkotlin/ExtensionFunctionType;", "content", "g", "(LKi/M;Landroidx/compose/ui/Modifier;LKi/T;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lki/q1$r;", "tagTemplate", "i", "(LKi/M;Lki/q1$r;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "tagText", "h", "(LKi/M;Lki/q1$r;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LIi/a;", "o", "(LIi/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Ji.c<Integer, l, l> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<l, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<l> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ii.h$a$a, reason: collision with other inner class name */
        public static final class C0237a implements Function0<l> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f14779a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f14780b;

            public C0237a(Ji.h hVar, a aVar) {
                this.f14779a = hVar;
                this.f14780b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.l, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                ?? r02 = this.f14779a;
                this.f14780b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<l> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public l getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<l, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C0237a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ji.c<Integer, l, l> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<l, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<l> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<l> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f14784a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f14785b;

            public a(Ji.h hVar, b bVar) {
                this.f14784a = hVar;
                this.f14785b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.l, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                ?? r02 = this.f14784a;
                this.f14785b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<l> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public l getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<l, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    public static final class c implements Function1<l, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14786a = new c();

        public final void a(l lVar) {
            Intrinsics.j(lVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            a(lVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Ji.c<Integer, l, l> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<l, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<l> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<l> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f14790a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f14791b;

            public a(Ji.h hVar, d dVar) {
                this.f14790a = hVar;
                this.f14791b = dVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.l, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke() {
                ?? r02 = this.f14790a;
                this.f14791b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<l> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public l getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<l, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ii.a f14792a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function1<C16673d, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f14793a = new a();

            public final void a(C16673d c16673d) {
                Intrinsics.j(c16673d, "<this>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C16673d c16673d) {
                a(c16673d);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b extends Ji.c<Integer, C16673d, C16673d> {

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final z1<Function1<C16673d, Unit>> latestContent;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final z1<C16673d> state;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final C16673d initialScope;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Function0<C16673d> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ji.h f14797a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f14798b;

                public a(Ji.h hVar, b bVar) {
                    this.f14797a = hVar;
                    this.f14798b = bVar;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, qi.d] */
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C16673d invoke() {
                    ?? r02 = this.f14797a;
                    this.f14798b.t().getValue().invoke(r02);
                    return r02;
                }
            }

            @Override // Ji.c
            public z1<C16673d> r() {
                return this.state;
            }

            @Override // Ji.i
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C16673d getInitialScope() {
                return this.initialScope;
            }

            public z1<Function1<C16673d, Unit>> t() {
                return this.latestContent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(626588522, i10, -1, "com.meijer.mobile.android_acres_library.composables.tag.Tag.<anonymous>.<anonymous> (Tag.kt:184)");
            }
            C16673d c16673dT = this.f14792a.t();
            composer.startReplaceGroup(327606171);
            Modifier.Companion companion = Modifier.INSTANCE;
            Object[] objArr = {c16673dT};
            composer.startReplaceGroup(-2104237158);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f14793a;
                composer.t(objB);
            }
            composer.P();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
            composer.startReplaceGroup(1252494947);
            b bVar = new b((Function1) objB, composer, 0, objArrCopyOf, c16673dT);
            composer.P();
            bVar.k(0, companion).invoke(composer, 0);
            composer.P();
            composer.P();
            Ji.g.l(this.f14792a.G(), 0, null, 2, null).invoke(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        e(Ii.a aVar) {
            this.f14792a = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, Ki.T r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, kotlin.jvm.functions.Function1<? super Ii.i, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.h.g(Ki.M, androidx.compose.ui.Modifier, Ki.T, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r15, final ki.q1.Tag r16, final java.lang.String r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.h.h(Ki.M, ki.q1$r, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r14, final ki.q1.Tag r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function1<? super Ii.i, kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.h.i(Ki.M, ki.q1$r, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(i iVar) {
        Intrinsics.j(iVar, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, T t10, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, t10, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(i iVar) {
        Intrinsics.j(iVar, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, q1.Tag tag, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, tag, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, q1.Tag tag, String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, tag, str, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void o(final Ii.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Modifier modifierC;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1857398030);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1857398030, i11, -1, "com.meijer.mobile.android_acres_library.composables.tag.Tag (Tag.kt:164)");
            }
            composerStartRestartGroup.startReplaceGroup(1746891663);
            if (aVar.l() != null) {
                Modifier modifierC2 = androidx.compose.foundation.b.c(modifier, aVar.getBackgroundColor(), C16806i.c(H1.h.p(4)));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = h0.k.a();
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                InterfaceC13561B interfaceC13561BF = C17982Y0.f(true, aVar.c().getAdsSpacing().getTwelve().getDp(), 0L, 4, null);
                Role roleJ = Role.j(Role.INSTANCE.a());
                Function0<Unit> function0L = aVar.l();
                Intrinsics.g(function0L);
                modifierC = ClickableKt.c(modifierC2, (h0.l) objB, interfaceC13561BF, false, null, roleJ, function0L, 12, null);
            } else {
                modifierC = androidx.compose.foundation.b.c(modifier, aVar.getBackgroundColor(), C16806i.c(H1.h.p(4)));
            }
            composerStartRestartGroup.P();
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            C4107g.e(null, 0.0f, ComposableLambdaKt.c(626588522, true, new e(aVar), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ii.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.p(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Ii.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        o(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}

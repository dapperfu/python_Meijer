package vi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import ki.q1;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qc.C16629j;
import qc.InterfaceC16624e;
import qc.PagerState;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001af\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102)\b\u0002\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001af\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102)\b\u0002\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aa\u0010(\u001a\u00020\u0006*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00102,\u0010\u0019\u001a(\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0002\b'H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"LKi/M;", "Lki/q1$q;", "template", "", "selected", "Lkotlin/Function0;", "", "onClick", "enabled", "", "text", "i", "(LKi/M;Lki/q1$q;ZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lki/q1$p;", "", "selectedTabIndex", "Lqc/g;", "pagerState", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "indicator", "content", "k", "(LKi/M;Lki/q1$p;ILqc/g;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lki/q1$o;", "g", "(LKi/M;Lki/q1$o;ILqc/g;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lki/q1$g;", "count", "state", "Lkotlin/Function2;", "Lqc/e;", "page", "Lkotlin/ExtensionFunctionType;", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Lki/q1$g;ILqc/g;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<C17679a, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f165940a = new a();

        public final void a(C17679a c17679a) {
            Intrinsics.j(c17679a, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17679a c17679a) {
            a(c17679a);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Ji.c<Integer, C17679a, C17679a> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C17679a, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C17679a> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C17679a initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<C17679a> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f165944a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f165945b;

            public a(Ji.h hVar, b bVar) {
                this.f165944a = hVar;
                this.f165945b = bVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, vi.a] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C17679a invoke() {
                ?? r02 = this.f165944a;
                this.f165945b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<C17679a> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C17679a getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C17679a, Unit>> t() {
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
    public static final class c implements Function1<C17680b, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f165946a = new c();

        public final void a(C17680b c17680b) {
            Intrinsics.j(c17680b, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17680b c17680b) {
            a(c17680b);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends Ji.c<Integer, C17680b, C17680b> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C17680b, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C17680b> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C17680b initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<C17680b> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f165950a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f165951b;

            public a(Ji.h hVar, d dVar) {
                this.f165950a = hVar;
                this.f165951b = dVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, vi.b] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C17680b invoke() {
                ?? r02 = this.f165950a;
                this.f165951b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<C17680b> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C17680b getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C17680b, Unit>> t() {
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
    static final class e implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f165952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f165953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f165954c;

        e(PagerState pagerState, int i10, LocalThemeScope localThemeScope) {
            this.f165952a = pagerState;
            this.f165953b = i10;
            this.f165954c = localThemeScope;
        }

        public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
            Intrinsics.j(tabPositions, "tabPositions");
            if (ComposerKt.M()) {
                ComposerKt.U(1521474136, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.AdsScrollableTabRow.<anonymous> (TabProviders.kt:87)");
            }
            C1 c12 = C1.f167869a;
            float fP = H1.h.p(3);
            PagerState pagerState = this.f165952a;
            c12.b(pagerState != null ? C16629j.c(Modifier.INSTANCE, pagerState, tabPositions, null, 4, null) : c12.e(Modifier.INSTANCE, tabPositions.get(this.f165953b)), fP, this.f165954c.getAdsColors().getAdsColorEnabled01().getColor(), composer, (C1.f167873e << 9) | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f implements Function1<vi.i, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f165955a = new f();

        public final void a(vi.i iVar) {
            Intrinsics.j(iVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(vi.i iVar) {
            a(iVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vi.g$g, reason: collision with other inner class name */
    public static final class C2624g extends Ji.c<Integer, vi.i, vi.i> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<vi.i, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<vi.i> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final vi.i initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vi.g$g$a */
        public static final class a implements Function0<vi.i> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f165959a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2624g f165960b;

            public a(Ji.h hVar, C2624g c2624g) {
                this.f165959a = hVar;
                this.f165960b = c2624g;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, vi.i] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final vi.i invoke() {
                ?? r02 = this.f165959a;
                this.f165960b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<vi.i> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public vi.i getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<vi.i, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2624g(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    public static final class h implements Function1<vi.h, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f165961a = new h();

        public final void a(vi.h hVar) {
            Intrinsics.j(hVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(vi.h hVar) {
            a(hVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class i extends Ji.c<Integer, vi.h, vi.h> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<vi.h, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<vi.h> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final vi.h initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Function0<vi.h> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f165965a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f165966b;

            public a(Ji.h hVar, i iVar) {
                this.f165965a = hVar;
                this.f165966b = iVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, vi.h] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final vi.h invoke() {
                ?? r02 = this.f165965a;
                this.f165966b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<vi.h> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public vi.h getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<vi.h, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    static final class j implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f165967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f165968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f165969c;

        j(PagerState pagerState, int i10, LocalThemeScope localThemeScope) {
            this.f165967a = pagerState;
            this.f165968b = i10;
            this.f165969c = localThemeScope;
        }

        public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
            Intrinsics.j(tabPositions, "tabPositions");
            if (ComposerKt.M()) {
                ComposerKt.U(333903288, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.AdsTabRow.<anonymous> (TabProviders.kt:53)");
            }
            C1 c12 = C1.f167869a;
            float fP = H1.h.p(3);
            PagerState pagerState = this.f165967a;
            c12.b(pagerState != null ? C16629j.c(Modifier.INSTANCE, pagerState, tabPositions, null, 4, null) : c12.e(Modifier.INSTANCE, tabPositions.get(this.f165968b)), fP, this.f165969c.getAdsColors().getAdsColorEnabled01().getColor(), composer, (C1.f167873e << 9) | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void e(final LocalThemeScope localThemeScope, final Modifier modifier, final q1.HorizontalPagerTemplate template, final int i10, final PagerState state, final Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i11) {
        int i12;
        int i13;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(template, "template");
        Intrinsics.j(state, "state");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2124186298);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(template) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 = i10;
            i12 |= composerStartRestartGroup.d(i13) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            i13 = i10;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.V(state) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2124186298, i12, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.AdsHorizontalPager (TabProviders.kt:122)");
            }
            Object[] objArr = {template, Integer.valueOf(i13), modifier, state};
            C17679a c17679a = new C17679a(template, i13, modifier, state, content, localThemeScope);
            composerStartRestartGroup.startReplaceGroup(-2104237158);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f165940a;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
            composerStartRestartGroup.startReplaceGroup(1252494947);
            composer2 = composerStartRestartGroup;
            b bVar = new b((Function1) objB, composer2, 0, objArrCopyOf, c17679a);
            composer2.P();
            bVar.k(0, companion).invoke(composer2, 0);
            composer2.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: vi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.f(localThemeScope, modifier, template, i10, state, content, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, q1.HorizontalPagerTemplate horizontalPagerTemplate, int i10, PagerState pagerState, Function4 function4, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, horizontalPagerTemplate, i10, pagerState, function4, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r15, final ki.q1.ScrollableTabRowTemplate r16, final int r17, final qc.PagerState r18, kotlin.jvm.functions.Function3<? super java.util.List<kotlin.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.g.g(Ki.M, ki.q1$o, int, qc.g, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, q1.ScrollableTabRowTemplate scrollableTabRowTemplate, int i10, PagerState pagerState, Function3 function3, Function2 function2, int i11, int i12, Composer composer, int i13) {
        g(localThemeScope, scrollableTabRowTemplate, i10, pagerState, function3, function2, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final q1.TabTemplate template, final boolean z10, final Function0<Unit> onClick, final boolean z11, final String text, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1179325260);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(template) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.a(z11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1179325260, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.AdsTab (TabProviders.kt:30)");
            }
            Object[] objArr = {template, Boolean.valueOf(z10), onClick, Boolean.valueOf(z11), text};
            vi.i iVar = new vi.i(template, z10, onClick, z11, text, localThemeScope);
            composerStartRestartGroup.startReplaceGroup(-2104237158);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = f.f165955a;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 5);
            composerStartRestartGroup.startReplaceGroup(1252494947);
            composer2 = composerStartRestartGroup;
            C2624g c2624g = new C2624g((Function1) objB, composer2, 0, objArrCopyOf, iVar);
            composer2.P();
            c2624g.k(0, companion).invoke(composer2, 0);
            composer2.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: vi.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.j(localThemeScope, template, z10, onClick, z11, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, q1.TabTemplate tabTemplate, boolean z10, Function0 function0, boolean z11, String str, int i10, Composer composer, int i11) {
        i(localThemeScope, tabTemplate, z10, function0, z11, str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r15, final ki.q1.TabRowTemplate r16, final int r17, final qc.PagerState r18, kotlin.jvm.functions.Function3<? super java.util.List<kotlin.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.g.k(Ki.M, ki.q1$p, int, qc.g, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, q1.TabRowTemplate tabRowTemplate, int i10, PagerState pagerState, Function3 function3, Function2 function2, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, tabRowTemplate, i10, pagerState, function3, function2, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}

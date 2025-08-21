package androidx.compose.ui.node;

import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.Q1;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\ba\u0018\u0000 ,2\u00020\u0001:\u0001\u0011R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/g;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "k", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "LH1/t;", "getLayoutDirection", "()LH1/t;", "d", "(LH1/t;)V", "layoutDirection", "LH1/d;", "getDensity", "()LH1/d;", "a", "(LH1/d;)V", "density", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "i", "(Landroidx/compose/ui/platform/Q1;)V", "viewConfiguration", "Landroidx/compose/runtime/s;", "getCompositionLocalMap", "()Landroidx/compose/runtime/s;", "o", "(Landroidx/compose/runtime/s;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "e", "(I)V", "compositeKeyHash", "Y2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
/* renamed from: androidx.compose.ui.node.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5953g {

    /* renamed from: Y2, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f51738a;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR.\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u000b\u0010\u0015R.\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R.\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R.\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R.\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b \u0010\u0015R.\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b\u0006\u0010\u0015¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/g$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/g;", "b", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "Constructor", "c", "i", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function2;", "f", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "LH1/d;", "e", "SetDensity", "Landroidx/compose/runtime/s;", "g", "SetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "SetMeasurePolicy", "LH1/t;", "h", "SetLayoutDirection", "Landroidx/compose/ui/platform/Q1;", "SetViewConfiguration", "", "j", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f51738a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Function0<InterfaceC5953g> Constructor = LayoutNode.INSTANCE.a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final Function0<InterfaceC5953g> VirtualConstructor = h.f51755f;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, Modifier, Unit> SetModifier = e.f51752f;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, H1.d, Unit> SetDensity = b.f51749f;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, InterfaceC5884s, Unit> SetResolvedCompositionLocals = f.f51753f;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, MeasurePolicy, Unit> SetMeasurePolicy = d.f51751f;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, H1.t, Unit> SetLayoutDirection = c.f51750f;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, Q1, Unit> SetViewConfiguration = C1070g.f51754f;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final Function2<InterfaceC5953g, Integer, Unit> SetCompositeKeyHash = C1069a.f51748f;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "", "it", "", "a", "(Landroidx/compose/ui/node/g;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$a, reason: collision with other inner class name */
        static final class C1069a extends Lambda implements Function2<InterfaceC5953g, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1069a f51748f = new C1069a();

            C1069a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, Integer num) {
                a(interfaceC5953g, num.intValue());
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, int i10) {
                interfaceC5953g.e(i10);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "LH1/d;", "it", "", "a", "(Landroidx/compose/ui/node/g;LH1/d;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$b */
        static final class b extends Lambda implements Function2<InterfaceC5953g, H1.d, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f51749f = new b();

            b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, H1.d dVar) {
                a(interfaceC5953g, dVar);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, H1.d dVar) {
                interfaceC5953g.a(dVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "LH1/t;", "it", "", "a", "(Landroidx/compose/ui/node/g;LH1/t;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$c */
        static final class c extends Lambda implements Function2<InterfaceC5953g, H1.t, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final c f51750f = new c();

            c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, H1.t tVar) {
                a(interfaceC5953g, tVar);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, H1.t tVar) {
                interfaceC5953g.d(tVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/layout/MeasurePolicy;", "it", "", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/layout/MeasurePolicy;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$d */
        static final class d extends Lambda implements Function2<InterfaceC5953g, MeasurePolicy, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final d f51751f = new d();

            d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, MeasurePolicy measurePolicy) {
                a(interfaceC5953g, measurePolicy);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, MeasurePolicy measurePolicy) {
                interfaceC5953g.k(measurePolicy);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/Modifier;", "it", "", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/Modifier;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$e */
        static final class e extends Lambda implements Function2<InterfaceC5953g, Modifier, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final e f51752f = new e();

            e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, Modifier modifier) {
                a(interfaceC5953g, modifier);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, Modifier modifier) {
                interfaceC5953g.setModifier(modifier);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/runtime/s;", "it", "", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/runtime/s;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$f */
        static final class f extends Lambda implements Function2<InterfaceC5953g, InterfaceC5884s, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final f f51753f = new f();

            f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, InterfaceC5884s interfaceC5884s) {
                a(interfaceC5953g, interfaceC5884s);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, InterfaceC5884s interfaceC5884s) {
                interfaceC5953g.o(interfaceC5884s);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/platform/Q1;", "it", "", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/platform/Q1;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$g, reason: collision with other inner class name */
        static final class C1070g extends Lambda implements Function2<InterfaceC5953g, Q1, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1070g f51754f = new C1070g();

            C1070g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5953g interfaceC5953g, Q1 q12) {
                a(interfaceC5953g, q12);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5953g interfaceC5953g, Q1 q12) {
                interfaceC5953g.i(q12);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "c", "()Landroidx/compose/ui/node/LayoutNode;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.g$a$h */
        static final class h extends Lambda implements Function0<LayoutNode> {

            /* renamed from: f, reason: collision with root package name */
            public static final h f51755f = new h();

            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        }

        public final Function0<InterfaceC5953g> a() {
            return Constructor;
        }

        public final Function2<InterfaceC5953g, Integer, Unit> b() {
            return SetCompositeKeyHash;
        }

        public final Function2<InterfaceC5953g, H1.d, Unit> c() {
            return SetDensity;
        }

        public final Function2<InterfaceC5953g, H1.t, Unit> d() {
            return SetLayoutDirection;
        }

        public final Function2<InterfaceC5953g, MeasurePolicy, Unit> e() {
            return SetMeasurePolicy;
        }

        public final Function2<InterfaceC5953g, Modifier, Unit> f() {
            return SetModifier;
        }

        public final Function2<InterfaceC5953g, InterfaceC5884s, Unit> g() {
            return SetResolvedCompositionLocals;
        }

        public final Function2<InterfaceC5953g, Q1, Unit> h() {
            return SetViewConfiguration;
        }

        public final Function0<InterfaceC5953g> i() {
            return VirtualConstructor;
        }

        private Companion() {
        }
    }

    void a(H1.d dVar);

    void d(H1.t tVar);

    void e(int i10);

    void i(Q1 q12);

    void k(MeasurePolicy measurePolicy);

    void o(InterfaceC5884s interfaceC5884s);

    void setModifier(Modifier modifier);
}

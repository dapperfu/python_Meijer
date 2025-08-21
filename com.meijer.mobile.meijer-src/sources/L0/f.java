package L0;

import Z.W;
import Z.i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001\u0016B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00020\u000f*\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006)"}, d2 = {"LL0/f;", "LL0/e;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "i", "()Ljava/util/Map;", "LL0/h;", "map", "key", "", "j", "(LL0/h;Ljava/util/Map;Ljava/lang/Object;)V", "Lkotlin/Function0;", "content", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "c", "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "LZ/W;", "b", "LZ/W;", "registries", "LL0/h;", "h", "()LL0/h;", "k", "(LL0/h;)V", "parentSaveableStateRegistry", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "canBeSaved", "e", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class f implements L0.e {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final k<f, ?> f17743f = l.a(a.f17748f, b.f17749f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W<Object, h> registries;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private h parentSaveableStateRegistry;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Boolean> canBeSaved;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "LL0/f;", "a", "(Ljava/util/Map;)LL0/f;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, f> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f17749f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(Map<Object, Map<String, List<Object>>> map) {
            return new f(map);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LL0/f$c;", "", "<init>", "()V", "LL0/k;", "LL0/f;", "Saver", "LL0/k;", "a", "()LL0/k;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: L0.f$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final k<f, ?> a() {
            return f.f17743f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<F, E> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f17751g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f17752h;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L0/f$d$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f17753a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f17754b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f17755c;

            public a(f fVar, Object obj, h hVar) {
                this.f17753a = fVar;
                this.f17754b = obj;
                this.f17755c = hVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                Object objU = this.f17753a.registries.u(this.f17754b);
                h hVar = this.f17755c;
                if (objU == hVar) {
                    f fVar = this.f17753a;
                    fVar.j(hVar, fVar.savedStates, this.f17754b);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, h hVar) {
            super(1);
            this.f17751g = obj;
            this.f17752h = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            boolean zB = f.this.registries.b(this.f17751g);
            Object obj = this.f17751g;
            if (!zB) {
                f.this.savedStates.remove(this.f17751g);
                f.this.registries.x(this.f17751g, this.f17752h);
                return new a(f.this, this.f17751g, this.f17752h);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<Object, Boolean> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            h parentSaveableStateRegistry = f.this.getParentSaveableStateRegistry();
            return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(obj) : true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LL0/m;", "LL0/f;", "it", "", "", "", "", "", "a", "(LL0/m;LL0/f;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<m, f, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f17748f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(m mVar, f fVar) {
            return fVar.i();
        }
    }

    public f(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = i0.c();
        this.canBeSaved = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> i() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> r1 = r0.savedStates
            Z.W<java.lang.Object, L0.h> r2 = r0.registries
            java.lang.Object[] r3 = r2.keys
            java.lang.Object[] r4 = r2.values
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            L0.h r13 = (L0.h) r13
            r0.j(r13, r1, r14)
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L13
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            r1 = 0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.f.i():java.util.Map");
    }

    @Override // L0.e
    public void c(Object key) {
        if (this.registries.u(key) == null) {
            this.savedStates.remove(key);
        }
    }

    /* renamed from: h, reason: from getter */
    public final h getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void k(h hVar) {
        this.parentSaveableStateRegistry = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(h hVar, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapE = hVar.e();
        if (mapE.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapE);
        }
    }

    @Override // L0.e
    public void d(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        composer.startReplaceGroup(-1198538093);
        if (ComposerKt.M()) {
            ComposerKt.U(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:69)");
        }
        composer.startReusableGroup(207, obj);
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            if (this.canBeSaved.invoke(obj).booleanValue()) {
                objB = j.a(this.savedStates.get(obj), this.canBeSaved);
                composer.t(objB);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        h hVar = (h) objB;
        r.a(j.e().d(hVar), function2, composer, (i10 & 112) | G0.f50200i);
        Unit unit = Unit.f143329a;
        boolean zD = composer.D(this) | composer.D(obj) | composer.D(hVar);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            objB2 = new d(obj, hVar);
            composer.t(objB2);
        }
        J.c(unit, (Function1) objB2, composer, 6);
        composer.A();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    public /* synthetic */ f(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}

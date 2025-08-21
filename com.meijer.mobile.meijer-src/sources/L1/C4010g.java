package L1;

import L1.k;
import L1.v;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJU\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\"R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R,\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070(0'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u0002028\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b4\u00105R\u0017\u00108\u001a\u0002028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u0017\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u0002028\u0006¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b>\u00105R\u0017\u0010@\u001a\u0002028\u0006¢\u0006\f\n\u0004\b%\u00103\u001a\u0004\b?\u00105R\u0017\u0010\u0018\u001a\u0002098\u0006¢\u0006\f\n\u0004\b/\u0010;\u001a\u0004\b:\u0010=R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\bC\u0010DR*\u0010M\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010P\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR*\u0010W\u001a\u00020Q2\u0006\u0010G\u001a\u00020Q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010^\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010b\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R*\u0010e\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010Y\u001a\u0004\bc\u0010[\"\u0004\bd\u0010]R3\u0010h\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bU\u0010Y\u001a\u0004\bf\u0010[\"\u0004\bg\u0010]R3\u0010k\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bK\u0010Y\u001a\u0004\bi\u0010[\"\u0004\bj\u0010]R3\u0010o\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bl\u0010Y\u001a\u0004\bm\u0010[\"\u0004\bn\u0010]R*\u0010s\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010[\"\u0004\br\u0010]R*\u0010w\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010Y\u001a\u0004\bu\u0010[\"\u0004\bv\u0010]R*\u0010{\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010Y\u001a\u0004\by\u0010[\"\u0004\bz\u0010]R*\u0010\u007f\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010Y\u001a\u0004\b}\u0010[\"\u0004\b~\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"LL1/g;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/Object;)V", "LL1/B;", "state", "", "a", "(LL1/B;)V", "LL1/k$c;", "start", "end", "LH1/h;", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "", "bias", "m", "(LL1/k$c;LL1/k$c;FFFFF)V", "LL1/k$b;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "l", "(LL1/k$b;LL1/k$b;FFFFF)V", "LL1/h;", "other", "b", "(LL1/h;F)V", "d", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "tasks", "c", "LL1/h;", "i", "()LL1/h;", "parent", "LL1/D;", "LL1/D;", "j", "()LL1/D;", "e", "getAbsoluteLeft", "absoluteLeft", "LL1/x;", "f", "LL1/x;", "k", "()LL1/x;", "g", "getAbsoluteRight", "absoluteRight", "LL1/d;", "LL1/d;", "getBaseline", "()LL1/d;", "baseline", "LL1/v;", "value", "LL1/v;", "getWidth", "()LL1/v;", "r", "(LL1/v;)V", "width", "getHeight", "p", "height", "LL1/G;", "LL1/G;", "getVisibility", "()LL1/G;", "q", "(LL1/G;)V", "visibility", "n", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "o", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "s", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "t", "getPivotX", "setPivotX", "pivotX", "u", "getPivotY", "setPivotY", "pivotY", "v", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "w", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: L1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4010g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<B, Unit>> tasks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h parent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final D start;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D absoluteLeft;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x top;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final D end;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D absoluteRight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x bottom;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4007d baseline;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private v width;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private v height;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private G visibility;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationZ;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float horizontalChainWeight;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float verticalChainWeight;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.g$a */
    static final class a extends Lambda implements Function1<B, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v f17865g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(1);
            this.f17865g = vVar;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            state.b(C4010g.this.getId()).x(((w) this.f17865g).g(state));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.g$b */
    static final class b extends Lambda implements Function1<B, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f17866f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C4010g f17867g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, C4010g c4010g) {
            super(1);
            this.f17866f = f10;
            this.f17867g = c4010g;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            state.b(this.f17867g.getId()).y(state.q() == H1.t.f13339b ? 1 - this.f17866f : this.f17866f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.g$c */
    static final class c extends Lambda implements Function1<B, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f17869g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f17869g = f10;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            state.b(C4010g.this.getId()).W(this.f17869g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.g$d */
    static final class d extends Lambda implements Function1<B, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ G f17871g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g10) {
            super(1);
            this.f17871g = g10;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            O1.a aVarB = state.b(C4010g.this.getId());
            G g10 = this.f17871g;
            aVarB.X(g10.getSolverValue());
            if (Intrinsics.e(g10, G.INSTANCE.b())) {
                aVarB.e(0.0f);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.g$e */
    static final class e extends Lambda implements Function1<B, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v f17873g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(v vVar) {
            super(1);
            this.f17873g = vVar;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            state.b(C4010g.this.getId()).Y(((w) this.f17873g).g(state));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    public C4010g(Object id2) {
        Intrinsics.j(id2, "id");
        this.id = id2;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = O1.e.f23019f;
        Intrinsics.i(PARENT, "PARENT");
        this.parent = new h(PARENT);
        this.start = new t(id2, -2, arrayList);
        this.absoluteLeft = new t(id2, 0, arrayList);
        this.top = new j(id2, 0, arrayList);
        this.end = new t(id2, -1, arrayList);
        this.absoluteRight = new t(id2, 1, arrayList);
        this.bottom = new j(id2, 1, arrayList);
        this.baseline = new i(id2, arrayList);
        v.Companion companion = v.INSTANCE;
        this.width = companion.d();
        this.height = companion.d();
        this.visibility = G.INSTANCE.c();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        float f10 = 0;
        this.translationX = H1.h.p(f10);
        this.translationY = H1.h.p(f10);
        this.translationZ = H1.h.p(f10);
        this.pivotX = 0.5f;
        this.pivotY = 0.5f;
        this.horizontalChainWeight = Float.NaN;
        this.verticalChainWeight = Float.NaN;
    }

    public static /* synthetic */ void c(C4010g c4010g, h hVar, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        c4010g.b(hVar, f10);
    }

    public static /* synthetic */ void e(C4010g c4010g, h hVar, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        c4010g.d(hVar, f10);
    }

    public static /* synthetic */ void n(C4010g c4010g, k.HorizontalAnchor horizontalAnchor, k.HorizontalAnchor horizontalAnchor2, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = H1.h.p(0);
        }
        float f15 = f10;
        if ((i10 & 8) != 0) {
            f11 = H1.h.p(0);
        }
        float f16 = f11;
        if ((i10 & 16) != 0) {
            f12 = H1.h.p(0);
        }
        c4010g.l(horizontalAnchor, horizontalAnchor2, f15, f16, f12, (i10 & 32) != 0 ? H1.h.p(0) : f13, (i10 & 64) != 0 ? 0.5f : f14);
    }

    public static /* synthetic */ void o(C4010g c4010g, k.VerticalAnchor verticalAnchor, k.VerticalAnchor verticalAnchor2, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = H1.h.p(0);
        }
        float f15 = f10;
        if ((i10 & 8) != 0) {
            f11 = H1.h.p(0);
        }
        float f16 = f11;
        if ((i10 & 16) != 0) {
            f12 = H1.h.p(0);
        }
        c4010g.m(verticalAnchor, verticalAnchor2, f15, f16, f12, (i10 & 32) != 0 ? H1.h.p(0) : f13, (i10 & 64) != 0 ? 0.5f : f14);
    }

    public final void a(B state) {
        Intrinsics.j(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
    }

    public final void b(h other, float bias) {
        Intrinsics.j(other, "other");
        o(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    public final void d(h other, float bias) {
        Intrinsics.j(other, "other");
        n(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    /* renamed from: f, reason: from getter */
    public final x getBottom() {
        return this.bottom;
    }

    /* renamed from: g, reason: from getter */
    public final D getEnd() {
        return this.end;
    }

    /* renamed from: h, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    /* renamed from: i, reason: from getter */
    public final h getParent() {
        return this.parent;
    }

    /* renamed from: j, reason: from getter */
    public final D getStart() {
        return this.start;
    }

    /* renamed from: k, reason: from getter */
    public final x getTop() {
        return this.top;
    }

    public final void l(k.HorizontalAnchor top, k.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, float bias) {
        Intrinsics.j(top, "top");
        Intrinsics.j(bottom, "bottom");
        this.top.a(top, topMargin, topGoneMargin);
        this.bottom.a(bottom, bottomMargin, bottomGoneMargin);
        this.tasks.add(new c(bias));
    }

    public final void m(k.VerticalAnchor start, k.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, float bias) {
        Intrinsics.j(start, "start");
        Intrinsics.j(end, "end");
        this.start.a(start, startMargin, startGoneMargin);
        this.end.a(end, endMargin, endGoneMargin);
        this.tasks.add(new b(bias, this));
    }

    public final void p(v value) {
        Intrinsics.j(value, "value");
        this.height = value;
        this.tasks.add(new a(value));
    }

    public final void q(G value) {
        Intrinsics.j(value, "value");
        this.visibility = value;
        this.tasks.add(new d(value));
    }

    public final void r(v value) {
        Intrinsics.j(value, "value");
        this.width = value;
        this.tasks.add(new e(value));
    }
}

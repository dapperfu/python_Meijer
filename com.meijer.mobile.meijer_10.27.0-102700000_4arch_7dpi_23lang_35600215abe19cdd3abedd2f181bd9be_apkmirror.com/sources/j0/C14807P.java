package j0;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010%\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010,\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u00105\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b#\u00104R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b&\u00104R\u0017\u00109\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b8\u00104R\u0017\u0010;\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b:\u00100R\u0017\u0010>\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100R\u0017\u0010A\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0017\u0010D\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u00100R\u0017\u0010G\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\bF\u00100R\u0017\u0010J\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R\u0017\u0010M\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bK\u0010.\u001a\u0004\bL\u00100R\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b\u001c\u0010QR\u0016\u0010U\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lj0/P;", "", "Landroidx/core/view/j;", "insets", "Landroid/view/View;", "view", "<init>", "(Landroidx/core/view/j;Landroid/view/View;)V", "", "j", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", "k", "(Landroidx/core/view/j;I)V", "m", "(Landroidx/core/view/j;)V", "n", "Lj0/a;", "a", "Lj0/a;", "getCaptionBar", "()Lj0/a;", "captionBar", "getDisplayCutout", "displayCutout", "c", "d", "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "navigationBars", "f", "h", "statusBars", "g", "i", "systemBars", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "Lj0/N;", "Lj0/N;", "getWaterfall", "()Lj0/N;", "waterfall", "Lj0/O;", "Lj0/O;", "()Lj0/O;", "safeDrawing", "l", "safeGestures", "getSafeContent", "safeContent", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "()Z", "consumes", "v", "I", "accessCount", "Lj0/s;", "w", "Lj0/s;", "insetsListener", "x", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14807P {

    /* renamed from: A, reason: collision with root package name */
    private static boolean f139039A;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f139041y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final WeakHashMap<View, C14807P> f139042z = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14809a captionBar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14809a displayCutout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14809a ime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14809a mandatorySystemGestures;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C14809a navigationBars;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C14809a statusBars;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C14809a systemBars;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C14809a systemGestures;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C14809a tappableElement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C14805N waterfall;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O safeDrawing;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O safeGestures;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O safeContent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final C14805N captionBarIgnoringVisibility;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C14805N navigationBarsIgnoringVisibility;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C14805N statusBarsIgnoringVisibility;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C14805N systemBarsIgnoringVisibility;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C14805N tappableElementIgnoringVisibility;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C14805N imeAnimationTarget;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final C14805N imeAnimationSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final RunnableC14827s insetsListener;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lj0/P$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lj0/P;", "d", "(Landroid/view/View;)Lj0/P;", "Landroidx/core/view/j;", "windowInsets", "", "type", "", "name", "Lj0/a;", "e", "(Landroidx/core/view/j;ILjava/lang/String;)Lj0/a;", "Lj0/N;", "f", "(Landroidx/core/view/j;ILjava/lang/String;)Lj0/N;", "c", "(Landroidx/compose/runtime/Composer;I)Lj0/P;", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: j0.P$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: j0.P$a$a, reason: collision with other inner class name */
        static final class C2196a extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C14807P f139066f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ View f139067g;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j0/P$a$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: j0.P$a$a$a, reason: collision with other inner class name */
            public static final class C2197a implements androidx.compose.runtime.E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C14807P f139068a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f139069b;

                public C2197a(C14807P c14807p, View view) {
                    this.f139068a = c14807p;
                    this.f139069b = view;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    this.f139068a.b(this.f139069b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2196a(C14807P c14807p, View view) {
                super(1);
                this.f139066f = c14807p;
                this.f139067g = view;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
                this.f139066f.j(this.f139067g);
                return new C2197a(this.f139066f, this.f139067g);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C14809a e(androidx.core.view.j windowInsets, int type, String name) {
            C14809a c14809a = new C14809a(type, name);
            if (windowInsets != null) {
                c14809a.i(windowInsets, type);
            }
            return c14809a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C14805N f(androidx.core.view.j windowInsets, int type, String name) {
            c2.d dVarG;
            if (windowInsets == null || (dVarG = windowInsets.g(type)) == null) {
                dVarG = c2.d.f61361e;
            }
            return W.a(dVarG, name);
        }

        private final C14807P d(View view) {
            C14807P c14807p;
            synchronized (C14807P.f139042z) {
                try {
                    WeakHashMap weakHashMap = C14807P.f139042z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        C14807P c14807p2 = new C14807P(null, view, false ? 1 : 0);
                        weakHashMap.put(view, c14807p2);
                        obj2 = c14807p2;
                    }
                    c14807p = (C14807P) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c14807p;
        }

        public final C14807P c(Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:578)");
            }
            View view = (View) composer.o(AndroidCompositionLocals_androidKt.k());
            C14807P c14807pD = d(view);
            boolean zD = composer.D(c14807pD) | composer.D(view);
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C2196a(c14807pD, view);
                composer.t(objB);
            }
            androidx.compose.runtime.J.c(c14807pD, (Function1) objB, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            return c14807pD;
        }
    }

    public /* synthetic */ C14807P(androidx.core.view.j jVar, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, view);
    }

    private C14807P(androidx.core.view.j jVar, View view) {
        androidx.core.view.b bVarE;
        c2.d dVarE;
        Companion companion = INSTANCE;
        this.captionBar = companion.e(jVar, j.n.b(), "captionBar");
        C14809a c14809aE = companion.e(jVar, j.n.c(), "displayCutout");
        this.displayCutout = c14809aE;
        C14809a c14809aE2 = companion.e(jVar, j.n.d(), "ime");
        this.ime = c14809aE2;
        C14809a c14809aE3 = companion.e(jVar, j.n.f(), "mandatorySystemGestures");
        this.mandatorySystemGestures = c14809aE3;
        this.navigationBars = companion.e(jVar, j.n.g(), "navigationBars");
        this.statusBars = companion.e(jVar, j.n.h(), "statusBars");
        C14809a c14809aE4 = companion.e(jVar, j.n.i(), "systemBars");
        this.systemBars = c14809aE4;
        C14809a c14809aE5 = companion.e(jVar, j.n.j(), "systemGestures");
        this.systemGestures = c14809aE5;
        C14809a c14809aE6 = companion.e(jVar, j.n.k(), "tappableElement");
        this.tappableElement = c14809aE6;
        C14805N c14805nA = W.a((jVar == null || (bVarE = jVar.e()) == null || (dVarE = bVarE.e()) == null) ? c2.d.f61361e : dVarE, "waterfall");
        this.waterfall = c14805nA;
        InterfaceC14806O interfaceC14806OH = C14808Q.h(C14808Q.h(c14809aE4, c14809aE2), c14809aE);
        this.safeDrawing = interfaceC14806OH;
        InterfaceC14806O interfaceC14806OH2 = C14808Q.h(C14808Q.h(C14808Q.h(c14809aE6, c14809aE3), c14809aE5), c14805nA);
        this.safeGestures = interfaceC14806OH2;
        this.safeContent = C14808Q.h(interfaceC14806OH, interfaceC14806OH2);
        this.captionBarIgnoringVisibility = companion.f(jVar, j.n.b(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.f(jVar, j.n.g(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.f(jVar, j.n.h(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.f(jVar, j.n.i(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.f(jVar, j.n.k(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.f(jVar, j.n.d(), "imeAnimationTarget");
        this.imeAnimationSource = companion.f(jVar, j.n.d(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(P0.k.f24525I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new RunnableC14827s(this);
    }

    public static /* synthetic */ void l(C14807P c14807p, androidx.core.view.j jVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        c14807p.k(jVar, i10);
    }

    public final void b(View view) {
        int i10 = this.accessCount - 1;
        this.accessCount = i10;
        if (i10 == 0) {
            ViewCompat.A0(view, null);
            ViewCompat.I0(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* renamed from: c, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    /* renamed from: d, reason: from getter */
    public final C14809a getIme() {
        return this.ime;
    }

    /* renamed from: e, reason: from getter */
    public final C14809a getNavigationBars() {
        return this.navigationBars;
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC14806O getSafeDrawing() {
        return this.safeDrawing;
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC14806O getSafeGestures() {
        return this.safeGestures;
    }

    /* renamed from: h, reason: from getter */
    public final C14809a getStatusBars() {
        return this.statusBars;
    }

    /* renamed from: i, reason: from getter */
    public final C14809a getSystemBars() {
        return this.systemBars;
    }

    public final void j(View view) {
        if (this.accessCount == 0) {
            ViewCompat.A0(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.I0(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void k(androidx.core.view.j windowInsets, int types) {
        if (f139039A) {
            WindowInsets windowInsetsA = windowInsets.A();
            Intrinsics.g(windowInsetsA);
            windowInsets = androidx.core.view.j.B(windowInsetsA);
        }
        this.captionBar.i(windowInsets, types);
        this.ime.i(windowInsets, types);
        this.displayCutout.i(windowInsets, types);
        this.navigationBars.i(windowInsets, types);
        this.statusBars.i(windowInsets, types);
        this.systemBars.i(windowInsets, types);
        this.systemGestures.i(windowInsets, types);
        this.tappableElement.i(windowInsets, types);
        this.mandatorySystemGestures.i(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.f(W.g(windowInsets.g(j.n.b())));
            this.navigationBarsIgnoringVisibility.f(W.g(windowInsets.g(j.n.g())));
            this.statusBarsIgnoringVisibility.f(W.g(windowInsets.g(j.n.h())));
            this.systemBarsIgnoringVisibility.f(W.g(windowInsets.g(j.n.i())));
            this.tappableElementIgnoringVisibility.f(W.g(windowInsets.g(j.n.k())));
            androidx.core.view.b bVarE = windowInsets.e();
            if (bVarE != null) {
                this.waterfall.f(W.g(bVarE.e()));
            }
        }
        androidx.compose.runtime.snapshots.g.INSTANCE.m();
    }

    public final void m(androidx.core.view.j windowInsets) {
        this.imeAnimationSource.f(W.g(windowInsets.f(j.n.d())));
    }

    public final void n(androidx.core.view.j windowInsets) {
        this.imeAnimationTarget.f(W.g(windowInsets.f(j.n.d())));
    }
}

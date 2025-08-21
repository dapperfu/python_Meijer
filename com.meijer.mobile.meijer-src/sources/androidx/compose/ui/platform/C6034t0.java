package androidx.compose.ui.platform;

import Q0.InterfaceC4655l;
import V0.InterfaceC5453d1;
import androidx.compose.runtime.AbstractC5879p;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.node.Owner;
import c1.InterfaceC6470a;
import d1.InterfaceC13593b;
import kotlin.AbstractC18269l;
import kotlin.InterfaceC18268k;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012\"&\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0010\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0012\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012\"\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b*\u0010\u0012\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002000\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b.\u0010\u0012\"&\u00106\u001a\b\u0012\u0004\u0012\u0002030\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0010\u0012\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010\u0012\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002070\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b8\u0010\u0012\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010\u0010\u001a\u0004\b;\u0010\u0012\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\b>\u0010\u0012\"(\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010\u0010\u0012\u0004\bF\u0010\u0018\u001a\u0004\bE\u0010\u0012\"\u001f\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bJ\u0010\u0012\"\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020L0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bM\u0010\u0012\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bO\u0010\u0012\"\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010\u0010\u001a\u0004\bR\u0010\u0012\"\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020T0\u000e8\u0006¢\u0006\f\n\u0004\bR\u0010\u0010\u001a\u0004\bU\u0010\u0012\"\"\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010\u0010\u001a\u0004\bA\u0010\u0012\" \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\bD\u0010\u0012\"\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0]8F¢\u0006\u0006\u001a\u0004\bI\u0010^¨\u0006`"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/L1;", "uriHandler", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/L1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "name", "", "v", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/F0;", "Landroidx/compose/ui/platform/h;", "Landroidx/compose/runtime/F0;", "c", "()Landroidx/compose/runtime/F0;", "LocalAccessibilityManager", "LQ0/l;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "LQ0/J;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "LQ0/H;", "d", "getLocalAutofillManager", "LocalAutofillManager", "Landroidx/compose/ui/platform/r0;", "e", "getLocalClipboardManager$annotations", "LocalClipboardManager", "Landroidx/compose/ui/platform/q0;", "f", "LocalClipboard", "LV0/d1;", "g", "j", "LocalGraphicsContext", "LH1/d;", "h", "LocalDensity", "Landroidx/compose/ui/focus/o;", "i", "LocalFocusManager", "Ly1/k$b;", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Ly1/l$b;", "k", "LocalFontFamilyResolver", "Lc1/a;", "l", "LocalHapticFeedback", "Ld1/b;", "m", "LocalInputModeManager", "LH1/t;", "n", "LocalLayoutDirection", "Lz1/O;", "o", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/D1;", "p", "q", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/H1;", "r", "LocalTextToolbar", "s", "LocalUriHandler", "Landroidx/compose/ui/platform/Q1;", "t", "LocalViewConfiguration", "Landroidx/compose/ui/platform/W1;", "u", "LocalWindowInfo", "Lg1/y;", "LocalPointerIconService", "", "LocalProvidableScrollCaptureInProgress", "w", "LocalCursorBlinkEnabled", "Landroidx/compose/runtime/p;", "()Landroidx/compose/runtime/p;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6034t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC5998h> f52370a = androidx.compose.runtime.r.f(a.f52393f);

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC4655l> f52371b = androidx.compose.runtime.r.f(b.f52394f);

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Q0.J> f52372c = androidx.compose.runtime.r.f(d.f52396f);

    /* renamed from: d, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Q0.H> f52373d = androidx.compose.runtime.r.f(c.f52395f);

    /* renamed from: e, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC6028r0> f52374e = androidx.compose.runtime.r.f(f.f52398f);

    /* renamed from: f, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC6026q0> f52375f = androidx.compose.runtime.r.f(e.f52397f);

    /* renamed from: g, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC5453d1> f52376g = androidx.compose.runtime.r.f(l.f52404f);

    /* renamed from: h, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<H1.d> f52377h = androidx.compose.runtime.r.f(h.f52400f);

    /* renamed from: i, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC5914o> f52378i = androidx.compose.runtime.r.f(i.f52401f);

    /* renamed from: j, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC18268k.b> f52379j = androidx.compose.runtime.r.f(k.f52403f);

    /* renamed from: k, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<AbstractC18269l.b> f52380k = androidx.compose.runtime.r.f(j.f52402f);

    /* renamed from: l, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC6470a> f52381l = androidx.compose.runtime.r.f(m.f52405f);

    /* renamed from: m, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC13593b> f52382m = androidx.compose.runtime.r.f(n.f52406f);

    /* renamed from: n, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<H1.t> f52383n = androidx.compose.runtime.r.f(o.f52407f);

    /* renamed from: o, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<z1.O> f52384o = androidx.compose.runtime.r.f(s.f52411f);

    /* renamed from: p, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<D1> f52385p = androidx.compose.runtime.r.f(r.f52410f);

    /* renamed from: q, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<H1> f52386q = androidx.compose.runtime.r.f(t.f52412f);

    /* renamed from: r, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<L1> f52387r = androidx.compose.runtime.r.f(u.f52413f);

    /* renamed from: s, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Q1> f52388s = androidx.compose.runtime.r.f(v.f52414f);

    /* renamed from: t, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<W1> f52389t = androidx.compose.runtime.r.f(w.f52415f);

    /* renamed from: u, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<g1.y> f52390u = androidx.compose.runtime.r.f(p.f52408f);

    /* renamed from: v, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Boolean> f52391v = androidx.compose.runtime.r.d(null, q.f52409f, 1, null);

    /* renamed from: w, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Boolean> f52392w = androidx.compose.runtime.r.f(g.f52399f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/h;", "c", "()Landroidx/compose/ui/platform/h;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$a */
    static final class a extends Lambda implements Function0<InterfaceC5998h> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52393f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5998h invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQ0/l;", "c", "()LQ0/l;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$b */
    static final class b extends Lambda implements Function0<InterfaceC4655l> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52394f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4655l invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQ0/H;", "c", "()LQ0/H;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$c */
    static final class c extends Lambda implements Function0<Q0.H> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52395f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Q0.H invoke() {
            C6034t0.v("LocalAutofillManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQ0/J;", "c", "()LQ0/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$d */
    static final class d extends Lambda implements Function0<Q0.J> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52396f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Q0.J invoke() {
            C6034t0.v("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/q0;", "c", "()Landroidx/compose/ui/platform/q0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$e */
    static final class e extends Lambda implements Function0<InterfaceC6026q0> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f52397f = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6026q0 invoke() {
            C6034t0.v("LocalClipboard");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/r0;", "c", "()Landroidx/compose/ui/platform/r0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$f */
    static final class f extends Lambda implements Function0<InterfaceC6028r0> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f52398f = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6028r0 invoke() {
            C6034t0.v("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$g */
    static final class g extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f52399f = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/d;", "c", "()LH1/d;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$h */
    static final class h extends Lambda implements Function0<H1.d> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f52400f = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H1.d invoke() {
            C6034t0.v("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/focus/o;", "c", "()Landroidx/compose/ui/focus/o;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$i */
    static final class i extends Lambda implements Function0<InterfaceC5914o> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f52401f = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5914o invoke() {
            C6034t0.v("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly1/l$b;", "c", "()Ly1/l$b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$j */
    static final class j extends Lambda implements Function0<AbstractC18269l.b> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f52402f = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC18269l.b invoke() {
            C6034t0.v("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly1/k$b;", "c", "()Ly1/k$b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$k */
    static final class k extends Lambda implements Function0<InterfaceC18268k.b> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f52403f = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18268k.b invoke() {
            C6034t0.v("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/d1;", "c", "()LV0/d1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$l */
    static final class l extends Lambda implements Function0<InterfaceC5453d1> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f52404f = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5453d1 invoke() {
            C6034t0.v("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc1/a;", "c", "()Lc1/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$m */
    static final class m extends Lambda implements Function0<InterfaceC6470a> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f52405f = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6470a invoke() {
            C6034t0.v("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld1/b;", "c", "()Ld1/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$n */
    static final class n extends Lambda implements Function0<InterfaceC13593b> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f52406f = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13593b invoke() {
            C6034t0.v("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/t;", "c", "()LH1/t;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$o */
    static final class o extends Lambda implements Function0<H1.t> {

        /* renamed from: f, reason: collision with root package name */
        public static final o f52407f = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H1.t invoke() {
            C6034t0.v("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg1/y;", "c", "()Lg1/y;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$p */
    static final class p extends Lambda implements Function0<g1.y> {

        /* renamed from: f, reason: collision with root package name */
        public static final p f52408f = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g1.y invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$q */
    static final class q extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f52409f = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/D1;", "c", "()Landroidx/compose/ui/platform/D1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$r */
    static final class r extends Lambda implements Function0<D1> {

        /* renamed from: f, reason: collision with root package name */
        public static final r f52410f = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final D1 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz1/O;", "c", "()Lz1/O;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$s */
    static final class s extends Lambda implements Function0<z1.O> {

        /* renamed from: f, reason: collision with root package name */
        public static final s f52411f = new s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z1.O invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/H1;", "c", "()Landroidx/compose/ui/platform/H1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$t */
    static final class t extends Lambda implements Function0<H1> {

        /* renamed from: f, reason: collision with root package name */
        public static final t f52412f = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H1 invoke() {
            C6034t0.v("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/L1;", "c", "()Landroidx/compose/ui/platform/L1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$u */
    static final class u extends Lambda implements Function0<L1> {

        /* renamed from: f, reason: collision with root package name */
        public static final u f52413f = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final L1 invoke() {
            C6034t0.v("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/Q1;", "c", "()Landroidx/compose/ui/platform/Q1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$v */
    static final class v extends Lambda implements Function0<Q1> {

        /* renamed from: f, reason: collision with root package name */
        public static final v f52414f = new v();

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Q1 invoke() {
            C6034t0.v("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/W1;", "c", "()Landroidx/compose/ui/platform/W1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.t0$w */
    static final class w extends Lambda implements Function0<W1> {

        /* renamed from: f, reason: collision with root package name */
        public static final w f52415f = new w();

        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final W1 invoke() {
            C6034t0.v("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.t0$x */
    static final class x extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Owner f52416f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1 f52417g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f52418h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f52419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(Owner owner, L1 l12, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f52416f = owner;
            this.f52417g = l12;
            this.f52418h = function2;
            this.f52419i = i10;
        }

        public final void a(Composer composer, int i10) {
            C6034t0.a(this.f52416f, this.f52417g, this.f52418h, composer, androidx.compose.runtime.J0.a(this.f52419i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Owner owner, L1 l12, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(874662829);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(owner) : composerStartRestartGroup.D(owner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(l12) : composerStartRestartGroup.D(l12) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(874662829, i11, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            androidx.compose.runtime.r.b(new androidx.compose.runtime.G0[]{f52370a.d(owner.getAccessibilityManager()), f52371b.d(owner.getAutofill()), f52373d.d(owner.getAutofillManager()), f52372c.d(owner.getAutofillTree()), f52374e.d(owner.getClipboardManager()), f52375f.d(owner.getClipboard()), f52377h.d(owner.getDensity()), f52378i.d(owner.getFocusOwner()), f52379j.e(owner.getFontLoader()), f52380k.e(owner.getFontFamilyResolver()), f52381l.d(owner.getHapticFeedBack()), f52382m.d(owner.getInputModeManager()), f52383n.d(owner.getLayoutDirection()), f52384o.d(owner.getTextInputService()), f52385p.d(owner.getSoftwareKeyboardController()), f52386q.d(owner.getTextToolbar()), f52387r.d(l12), f52388s.d(owner.getViewConfiguration()), f52389t.d(owner.getWindowInfo()), f52390u.d(owner.getPointerIconService()), f52376g.d(owner.getGraphicsContext())}, function2, composerStartRestartGroup, ((i11 >> 3) & 112) | androidx.compose.runtime.G0.f50200i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new x(owner, l12, function2, i10));
        }
    }

    public static final androidx.compose.runtime.F0<InterfaceC5998h> c() {
        return f52370a;
    }

    public static final androidx.compose.runtime.F0<InterfaceC6026q0> d() {
        return f52375f;
    }

    public static final androidx.compose.runtime.F0<InterfaceC6028r0> e() {
        return f52374e;
    }

    public static final androidx.compose.runtime.F0<Boolean> f() {
        return f52392w;
    }

    public static final androidx.compose.runtime.F0<H1.d> g() {
        return f52377h;
    }

    public static final androidx.compose.runtime.F0<InterfaceC5914o> h() {
        return f52378i;
    }

    public static final androidx.compose.runtime.F0<AbstractC18269l.b> i() {
        return f52380k;
    }

    public static final androidx.compose.runtime.F0<InterfaceC5453d1> j() {
        return f52376g;
    }

    public static final androidx.compose.runtime.F0<InterfaceC6470a> k() {
        return f52381l;
    }

    public static final androidx.compose.runtime.F0<InterfaceC13593b> l() {
        return f52382m;
    }

    public static final androidx.compose.runtime.F0<H1.t> m() {
        return f52383n;
    }

    public static final androidx.compose.runtime.F0<g1.y> n() {
        return f52390u;
    }

    public static final androidx.compose.runtime.F0<Boolean> o() {
        return f52391v;
    }

    public static final AbstractC5879p<Boolean> p() {
        return f52391v;
    }

    public static final androidx.compose.runtime.F0<D1> q() {
        return f52385p;
    }

    public static final androidx.compose.runtime.F0<H1> r() {
        return f52386q;
    }

    public static final androidx.compose.runtime.F0<L1> s() {
        return f52387r;
    }

    public static final androidx.compose.runtime.F0<Q1> t() {
        return f52388s;
    }

    public static final androidx.compose.runtime.F0<W1> u() {
        return f52389t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void v(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

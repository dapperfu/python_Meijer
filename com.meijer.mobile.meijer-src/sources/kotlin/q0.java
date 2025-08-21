package kotlin;

import H1.h;
import H1.j;
import H1.n;
import H1.r;
import U0.f;
import U0.k;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b\" \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000b\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000b\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000b\" \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000b\" \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000b\" \u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000b\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020'8F¢\u0006\u0006\u001a\u0004\b%\u0010(\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0006*\u00020-8F¢\u0006\u0006\u001a\u0004\b!\u0010.\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b\u000e\u00100\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0006*\u0002018F¢\u0006\u0006\u001a\u0004\b\u0011\u00102\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0006*\u0002038F¢\u0006\u0006\u001a\u0004\b\u001e\u00104\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u0006*\u0002058F¢\u0006\u0006\u001a\u0004\b\u001b\u00106\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u0006*\u0002078F¢\u0006\u0006\u001a\u0004\b\u0015\u00108\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u0006*\u0002098F¢\u0006\u0006\u001a\u0004\b\u0018\u0010:¨\u0006;"}, d2 = {"T", "Lc0/q;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lc0/o0;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lc0/o0;", "", "Lc0/m;", "Lc0/o0;", "FloatToVector", "", "b", "IntToVector", "LH1/h;", "c", "DpToVector", "LH1/j;", "Lc0/n;", "d", "DpOffsetToVector", "LU0/k;", "e", "SizeToVector", "LU0/f;", "f", "OffsetToVector", "LH1/n;", "g", "IntOffsetToVector", "LH1/r;", "h", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Lc0/p;", "i", "RectToVector", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/FloatCompanionObject;)Lc0/o0;", "VectorConverter", "Lkotlin/Int$Companion;", "j", "(Lkotlin/jvm/internal/IntCompanionObject;)Lc0/o0;", "Landroidx/compose/ui/geometry/Rect$a;", "(Landroidx/compose/ui/geometry/Rect$a;)Lc0/o0;", "LH1/h$a;", "(LH1/h$a;)Lc0/o0;", "LH1/j$a;", "(LH1/j$a;)Lc0/o0;", "LU0/k$a;", "(LU0/k$a;)Lc0/o0;", "LU0/f$a;", "(LU0/f$a;)Lc0/o0;", "LH1/n$a;", "(LH1/n$a;)Lc0/o0;", "LH1/r$a;", "(LH1/r$a;)Lc0/o0;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final o0<Float, C6456m> f61023a = a(e.f61036f, f.f61037f);

    /* renamed from: b, reason: collision with root package name */
    private static final o0<Integer, C6456m> f61024b = a(k.f61042f, l.f61043f);

    /* renamed from: c, reason: collision with root package name */
    private static final o0<H1.h, C6456m> f61025c = a(c.f61034f, d.f61035f);

    /* renamed from: d, reason: collision with root package name */
    private static final o0<H1.j, C6457n> f61026d = a(a.f61032f, b.f61033f);

    /* renamed from: e, reason: collision with root package name */
    private static final o0<U0.k, C6457n> f61027e = a(q.f61048f, r.f61049f);

    /* renamed from: f, reason: collision with root package name */
    private static final o0<U0.f, C6457n> f61028f = a(m.f61044f, n.f61045f);

    /* renamed from: g, reason: collision with root package name */
    private static final o0<H1.n, C6457n> f61029g = a(g.f61038f, h.f61039f);

    /* renamed from: h, reason: collision with root package name */
    private static final o0<H1.r, C6457n> f61030h = a(i.f61040f, j.f61041f);

    /* renamed from: i, reason: collision with root package name */
    private static final o0<Rect, C6459p> f61031i = a(o.f61046f, p.f61047f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/j;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<H1.j, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f61032f = new a();

        a() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n(H1.j.e(j10), H1.j.f(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(H1.j jVar) {
            return a(jVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/j;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<C6457n, H1.j> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f61033f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.j invoke(C6457n c6457n) {
            return H1.j.a(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            float fP = H1.h.p(c6457n.getV1());
            float fP2 = H1.h.p(c6457n.getV2());
            return H1.j.b((Float.floatToRawIntBits(fP) << 32) | (Float.floatToRawIntBits(fP2) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/h;", "it", "Lc0/m;", "b", "(F)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<H1.h, C6456m> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f61034f = new c();

        c() {
            super(1);
        }

        public final C6456m b(float f10) {
            return new C6456m(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6456m invoke(H1.h hVar) {
            return b(hVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "LH1/h;", "a", "(Lc0/m;)F"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<C6456m, H1.h> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f61035f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.h invoke(C6456m c6456m) {
            return H1.h.l(a(c6456m));
        }

        public final float a(C6456m c6456m) {
            return H1.h.p(c6456m.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc0/m;", "b", "(F)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<Float, C6456m> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f61036f = new e();

        e() {
            super(1);
        }

        public final C6456m b(float f10) {
            return new C6456m(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6456m invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/n;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<H1.n, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f61038f = new g();

        g() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n(H1.n.k(j10), H1.n.l(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(H1.n nVar) {
            return a(nVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/n;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class h extends Lambda implements Function1<C6457n, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f61039f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(C6457n c6457n) {
            return H1.n.c(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            return H1.n.f((Math.round(c6457n.getV1()) << 32) | (Math.round(c6457n.getV2()) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class i extends Lambda implements Function1<H1.r, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f61040f = new i();

        i() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(H1.r rVar) {
            return a(rVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/r;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class j extends Lambda implements Function1<C6457n, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f61041f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(C6457n c6457n) {
            return H1.r.b(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            int iRound = Math.round(c6457n.getV1());
            int i10 = 0;
            if (iRound < 0) {
                iRound = 0;
            }
            int iRound2 = Math.round(c6457n.getV2());
            if (iRound2 >= 0) {
                i10 = iRound2;
            }
            return H1.r.c((i10 & 4294967295L) | (iRound << 32));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc0/m;", "a", "(I)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<Integer, C6456m> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f61042f = new k();

        k() {
            super(1);
        }

        public final C6456m a(int i10) {
            return new C6456m(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6456m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class m extends Lambda implements Function1<U0.f, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f61044f = new m();

        m() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(U0.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LU0/f;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class n extends Lambda implements Function1<C6457n, U0.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f61045f = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.f invoke(C6457n c6457n) {
            return U0.f.d(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            float v12 = c6457n.getV1();
            float v22 = c6457n.getV2();
            return U0.f.e((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "it", "Lc0/p;", "a", "(Landroidx/compose/ui/geometry/Rect;)Lc0/p;"}, k = 3, mv = {1, 9, 0})
    static final class o extends Lambda implements Function1<Rect, C6459p> {

        /* renamed from: f, reason: collision with root package name */
        public static final o f61046f = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6459p invoke(Rect rect) {
            return new C6459p(rect.getLeft(), rect.getTop(), rect.l(), rect.i());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/p;", "it", "Landroidx/compose/ui/geometry/Rect;", "a", "(Lc0/p;)Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    static final class p extends Lambda implements Function1<C6459p, Rect> {

        /* renamed from: f, reason: collision with root package name */
        public static final p f61047f = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Rect invoke(C6459p c6459p) {
            return new Rect(c6459p.getV1(), c6459p.getV2(), c6459p.getV3(), c6459p.getV4());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/k;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class q extends Lambda implements Function1<U0.k, C6457n> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f61048f = new q();

        q() {
            super(1);
        }

        public final C6457n a(long j10) {
            return new C6457n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6457n invoke(U0.k kVar) {
            return a(kVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LU0/k;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class r extends Lambda implements Function1<C6457n, U0.k> {

        /* renamed from: f, reason: collision with root package name */
        public static final r f61049f = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.k invoke(C6457n c6457n) {
            return U0.k.c(a(c6457n));
        }

        public final long a(C6457n c6457n) {
            float v12 = c6457n.getV1();
            float v22 = c6457n.getV2();
            return U0.k.d((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "", "a", "(Lc0/m;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<C6456m, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f61037f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(C6456m c6456m) {
            return Float.valueOf(c6456m.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "", "a", "(Lc0/m;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function1<C6456m, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f61043f = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C6456m c6456m) {
            return Integer.valueOf((int) c6456m.getValue());
        }
    }

    public static final <T, V extends AbstractC6460q> o0<T, V> a(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        return new p0(function1, function12);
    }

    public static final o0<H1.h, C6456m> b(h.Companion companion) {
        return f61025c;
    }

    public static final o0<H1.j, C6457n> c(j.Companion companion) {
        return f61026d;
    }

    public static final o0<H1.n, C6457n> d(n.Companion companion) {
        return f61029g;
    }

    public static final o0<H1.r, C6457n> e(r.Companion companion) {
        return f61030h;
    }

    public static final o0<U0.f, C6457n> f(f.Companion companion) {
        return f61028f;
    }

    public static final o0<U0.k, C6457n> g(k.Companion companion) {
        return f61027e;
    }

    public static final o0<Rect, C6459p> h(Rect.Companion companion) {
        return f61031i;
    }

    public static final o0<Float, C6456m> i(FloatCompanionObject floatCompanionObject) {
        return f61023a;
    }

    public static final o0<Integer, C6456m> j(IntCompanionObject intCompanionObject) {
        return f61024b;
    }
}

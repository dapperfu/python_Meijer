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
    private static final o0<Float, C6330m> f61224a = a(e.f61237f, f.f61238f);

    /* renamed from: b, reason: collision with root package name */
    private static final o0<Integer, C6330m> f61225b = a(k.f61243f, l.f61244f);

    /* renamed from: c, reason: collision with root package name */
    private static final o0<H1.h, C6330m> f61226c = a(c.f61235f, d.f61236f);

    /* renamed from: d, reason: collision with root package name */
    private static final o0<H1.j, C6331n> f61227d = a(a.f61233f, b.f61234f);

    /* renamed from: e, reason: collision with root package name */
    private static final o0<U0.k, C6331n> f61228e = a(q.f61249f, r.f61250f);

    /* renamed from: f, reason: collision with root package name */
    private static final o0<U0.f, C6331n> f61229f = a(m.f61245f, n.f61246f);

    /* renamed from: g, reason: collision with root package name */
    private static final o0<H1.n, C6331n> f61230g = a(g.f61239f, h.f61240f);

    /* renamed from: h, reason: collision with root package name */
    private static final o0<H1.r, C6331n> f61231h = a(i.f61241f, j.f61242f);

    /* renamed from: i, reason: collision with root package name */
    private static final o0<Rect, C6333p> f61232i = a(o.f61247f, p.f61248f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/j;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<H1.j, C6331n> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f61233f = new a();

        a() {
            super(1);
        }

        public final C6331n a(long j10) {
            return new C6331n(H1.j.e(j10), H1.j.f(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6331n invoke(H1.j jVar) {
            return a(jVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/j;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<C6331n, H1.j> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f61234f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.j invoke(C6331n c6331n) {
            return H1.j.a(a(c6331n));
        }

        public final long a(C6331n c6331n) {
            float fP = H1.h.p(c6331n.getV1());
            float fP2 = H1.h.p(c6331n.getV2());
            return H1.j.b((Float.floatToRawIntBits(fP) << 32) | (Float.floatToRawIntBits(fP2) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/h;", "it", "Lc0/m;", "b", "(F)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<H1.h, C6330m> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f61235f = new c();

        c() {
            super(1);
        }

        public final C6330m b(float f10) {
            return new C6330m(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6330m invoke(H1.h hVar) {
            return b(hVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "LH1/h;", "a", "(Lc0/m;)F"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<C6330m, H1.h> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f61236f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.h invoke(C6330m c6330m) {
            return H1.h.l(a(c6330m));
        }

        public final float a(C6330m c6330m) {
            return H1.h.p(c6330m.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc0/m;", "b", "(F)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<Float, C6330m> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f61237f = new e();

        e() {
            super(1);
        }

        public final C6330m b(float f10) {
            return new C6330m(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6330m invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/n;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<H1.n, C6331n> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f61239f = new g();

        g() {
            super(1);
        }

        public final C6331n a(long j10) {
            return new C6331n(H1.n.k(j10), H1.n.l(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6331n invoke(H1.n nVar) {
            return a(nVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/n;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class h extends Lambda implements Function1<C6331n, H1.n> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f61240f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.n invoke(C6331n c6331n) {
            return H1.n.c(a(c6331n));
        }

        public final long a(C6331n c6331n) {
            return H1.n.f((Math.round(c6331n.getV1()) << 32) | (Math.round(c6331n.getV2()) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/r;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class i extends Lambda implements Function1<H1.r, C6331n> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f61241f = new i();

        i() {
            super(1);
        }

        public final C6331n a(long j10) {
            return new C6331n((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6331n invoke(H1.r rVar) {
            return a(rVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LH1/r;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class j extends Lambda implements Function1<C6331n, H1.r> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f61242f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ H1.r invoke(C6331n c6331n) {
            return H1.r.b(a(c6331n));
        }

        public final long a(C6331n c6331n) {
            int iRound = Math.round(c6331n.getV1());
            int i10 = 0;
            if (iRound < 0) {
                iRound = 0;
            }
            int iRound2 = Math.round(c6331n.getV2());
            if (iRound2 >= 0) {
                i10 = iRound2;
            }
            return H1.r.c((i10 & 4294967295L) | (iRound << 32));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc0/m;", "a", "(I)Lc0/m;"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<Integer, C6330m> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f61243f = new k();

        k() {
            super(1);
        }

        public final C6330m a(int i10) {
            return new C6330m(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6330m invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class m extends Lambda implements Function1<U0.f, C6331n> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f61245f = new m();

        m() {
            super(1);
        }

        public final C6331n a(long j10) {
            return new C6331n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6331n invoke(U0.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LU0/f;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class n extends Lambda implements Function1<C6331n, U0.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f61246f = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.f invoke(C6331n c6331n) {
            return U0.f.d(a(c6331n));
        }

        public final long a(C6331n c6331n) {
            float v12 = c6331n.getV1();
            float v22 = c6331n.getV2();
            return U0.f.e((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "it", "Lc0/p;", "a", "(Landroidx/compose/ui/geometry/Rect;)Lc0/p;"}, k = 3, mv = {1, 9, 0})
    static final class o extends Lambda implements Function1<Rect, C6333p> {

        /* renamed from: f, reason: collision with root package name */
        public static final o f61247f = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6333p invoke(Rect rect) {
            return new C6333p(rect.getLeft(), rect.getTop(), rect.l(), rect.i());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/p;", "it", "Landroidx/compose/ui/geometry/Rect;", "a", "(Lc0/p;)Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    static final class p extends Lambda implements Function1<C6333p, Rect> {

        /* renamed from: f, reason: collision with root package name */
        public static final p f61248f = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Rect invoke(C6333p c6333p) {
            return new Rect(c6333p.getV1(), c6333p.getV2(), c6333p.getV3(), c6333p.getV4());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/k;", "it", "Lc0/n;", "a", "(J)Lc0/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class q extends Lambda implements Function1<U0.k, C6331n> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f61249f = new q();

        q() {
            super(1);
        }

        public final C6331n a(long j10) {
            return new C6331n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C6331n invoke(U0.k kVar) {
            return a(kVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/n;", "it", "LU0/k;", "a", "(Lc0/n;)J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class r extends Lambda implements Function1<C6331n, U0.k> {

        /* renamed from: f, reason: collision with root package name */
        public static final r f61250f = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ U0.k invoke(C6331n c6331n) {
            return U0.k.c(a(c6331n));
        }

        public final long a(C6331n c6331n) {
            float v12 = c6331n.getV1();
            float v22 = c6331n.getV2();
            return U0.k.d((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "", "a", "(Lc0/m;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<C6330m, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f61238f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(C6330m c6330m) {
            return Float.valueOf(c6330m.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/m;", "it", "", "a", "(Lc0/m;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function1<C6330m, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f61244f = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C6330m c6330m) {
            return Integer.valueOf((int) c6330m.getValue());
        }
    }

    public static final <T, V extends AbstractC6334q> o0<T, V> a(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        return new p0(function1, function12);
    }

    public static final o0<H1.h, C6330m> b(h.Companion companion) {
        return f61226c;
    }

    public static final o0<H1.j, C6331n> c(j.Companion companion) {
        return f61227d;
    }

    public static final o0<H1.n, C6331n> d(n.Companion companion) {
        return f61230g;
    }

    public static final o0<H1.r, C6331n> e(r.Companion companion) {
        return f61231h;
    }

    public static final o0<U0.f, C6331n> f(f.Companion companion) {
        return f61229f;
    }

    public static final o0<U0.k, C6331n> g(k.Companion companion) {
        return f61228e;
    }

    public static final o0<Rect, C6333p> h(Rect.Companion companion) {
        return f61232i;
    }

    public static final o0<Float, C6330m> i(FloatCompanionObject floatCompanionObject) {
        return f61224a;
    }

    public static final o0<Integer, C6330m> j(IntCompanionObject intCompanionObject) {
        return f61225b;
    }
}

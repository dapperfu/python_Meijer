package c6;

import b6.f;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Map;
import kotlin.C6453j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lc6/b;", "", "<init>", "()V", "Lb6/f$c;", "animation", "Landroidx/compose/animation/h;", "a", "(Lb6/f$c;)Landroidx/compose/animation/h;", "Landroidx/compose/animation/j;", "b", "(Lb6/f$c;)Landroidx/compose/animation/j;", "Lb6/f$d;", "gesture", "c", "(Lb6/f$d;)Landroidx/compose/animation/j;", "", "Ljava/util/Map;", "enterAnimationMap", "exitAnimationMap", "d", "gestureAnimationMap", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6489b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6489b f61415a = new C6489b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.c, androidx.compose.animation.h> enterAnimationMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.c, androidx.compose.animation.j> exitAnimationMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.d, androidx.compose.animation.j> gestureAnimationMap;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$a */
    static final class a extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f61419f = new a();

        a() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$b, reason: collision with other inner class name */
    static final class C1224b extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1224b f61420f = new C1224b();

        C1224b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$c */
    static final class c extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f61421f = new c();

        c() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$d */
    static final class d extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f61422f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$e */
    static final class e extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f61423f = new e();

        e() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$f */
    static final class f extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f61424f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$g */
    static final class g extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final g f61425f = new g();

        g() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$h */
    static final class h extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f61426f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$i */
    static final class i extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f61427f = new i();

        i() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$j */
    static final class j extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f61428f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$k */
    static final class k extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f61429f = new k();

        k() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(-i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: c6.b$l */
    static final class l extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f61430f = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    static {
        f.c cVar = f.c.LEFT;
        Pair pairA = TuplesKt.a(cVar, androidx.compose.animation.f.w(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), a.f61419f));
        f.c cVar2 = f.c.RIGHT;
        Pair pairA2 = TuplesKt.a(cVar2, androidx.compose.animation.f.w(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), C1224b.f61420f));
        f.c cVar3 = f.c.TOP;
        Pair pairA3 = TuplesKt.a(cVar3, androidx.compose.animation.f.y(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), c.f61421f));
        f.c cVar4 = f.c.BOTTOM;
        Pair pairA4 = TuplesKt.a(cVar4, androidx.compose.animation.f.y(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), d.f61422f));
        f.c cVar5 = f.c.FADE;
        enterAnimationMap = MapsKt.o(pairA, pairA2, pairA3, pairA4, TuplesKt.a(cVar5, androidx.compose.animation.f.m(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), 0.0f, 2, null)));
        exitAnimationMap = MapsKt.o(TuplesKt.a(cVar, androidx.compose.animation.f.B(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), e.f61423f)), TuplesKt.a(cVar2, androidx.compose.animation.f.B(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), f.f61424f)), TuplesKt.a(cVar3, androidx.compose.animation.f.D(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), g.f61425f)), TuplesKt.a(cVar4, androidx.compose.animation.f.D(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), h.f61426f)), TuplesKt.a(cVar5, androidx.compose.animation.f.o(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), 0.0f, 2, null)));
        gestureAnimationMap = MapsKt.o(TuplesKt.a(f.d.SWIPE_UP, androidx.compose.animation.f.D(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), i.f61427f)), TuplesKt.a(f.d.SWIPE_DOWN, androidx.compose.animation.f.D(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), j.f61428f)), TuplesKt.a(f.d.SWIPE_LEFT, androidx.compose.animation.f.B(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), k.f61429f)), TuplesKt.a(f.d.SWIPE_RIGHT, androidx.compose.animation.f.B(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), l.f61430f)), TuplesKt.a(f.d.TAP_BACKGROUND, androidx.compose.animation.f.o(C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, null, 6, null), 0.0f, 2, null)));
    }

    public final androidx.compose.animation.h a(f.c animation) {
        Intrinsics.j(animation, "animation");
        androidx.compose.animation.h hVar = enterAnimationMap.get(animation);
        return hVar == null ? androidx.compose.animation.h.INSTANCE.a() : hVar;
    }

    public final androidx.compose.animation.j b(f.c animation) {
        Intrinsics.j(animation, "animation");
        androidx.compose.animation.j jVar = exitAnimationMap.get(animation);
        return jVar == null ? androidx.compose.animation.j.INSTANCE.a() : jVar;
    }

    public final androidx.compose.animation.j c(f.d gesture) {
        Intrinsics.j(gesture, "gesture");
        androidx.compose.animation.j jVar = gestureAnimationMap.get(gesture);
        return jVar == null ? androidx.compose.animation.j.INSTANCE.a() : jVar;
    }

    private C6489b() {
    }
}

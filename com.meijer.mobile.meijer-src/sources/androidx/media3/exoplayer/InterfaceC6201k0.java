package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import i3.E1;

/* renamed from: androidx.media3.exoplayer.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6201k0 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final r.b f56525a = new r.b(new Object());

    t3.b k();

    @Deprecated
    default boolean n(a3.F f10, r.b bVar, long j10, float f11, boolean z10, long j11) {
        return j(j10, f11, z10, j11);
    }

    /* renamed from: androidx.media3.exoplayer.k0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final E1 f56526a;

        /* renamed from: b, reason: collision with root package name */
        public final a3.F f56527b;

        /* renamed from: c, reason: collision with root package name */
        public final r.b f56528c;

        /* renamed from: d, reason: collision with root package name */
        public final long f56529d;

        /* renamed from: e, reason: collision with root package name */
        public final long f56530e;

        /* renamed from: f, reason: collision with root package name */
        public final float f56531f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f56532g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f56533h;

        /* renamed from: i, reason: collision with root package name */
        public final long f56534i;

        /* renamed from: j, reason: collision with root package name */
        public final long f56535j;

        public a(E1 e12, a3.F f10, r.b bVar, long j10, long j11, float f11, boolean z10, boolean z11, long j12, long j13) {
            this.f56526a = e12;
            this.f56527b = f10;
            this.f56528c = bVar;
            this.f56529d = j10;
            this.f56530e = j11;
            this.f56531f = f11;
            this.f56532g = z10;
            this.f56533h = z11;
            this.f56534i = j12;
            this.f56535j = j13;
        }
    }

    default boolean a(a aVar) {
        return n(aVar.f56527b, aVar.f56528c, aVar.f56530e, aVar.f56531f, aVar.f56533h, aVar.f56534i);
    }

    @Deprecated
    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean e(a3.F f10, r.b bVar, long j10) {
        d3.r.i("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void f(a aVar, p3.w wVar, s3.y[] yVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    @Deprecated
    default long g() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default void h() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default boolean j(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default void l() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default boolean m(a aVar) {
        return r(aVar.f56529d, aVar.f56530e, aVar.f56531f);
    }

    @Deprecated
    default void p() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default boolean r(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default void c(E1 e12) {
        p();
    }

    default void d(E1 e12) {
        l();
    }

    default void i(E1 e12) {
        h();
    }

    default boolean o(E1 e12) {
        return b();
    }

    default long q(E1 e12) {
        return g();
    }
}

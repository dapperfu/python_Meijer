package kotlin;

import B0.RippleAlpha;
import H1.h;
import V0.C5489q0;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import d0.InterfaceC13561B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "bounded", "LH1/h;", "radius", "LV0/q0;", "color", "Ld0/B;", "e", "(ZFJ)Ld0/B;", "Landroidx/compose/runtime/F0;", "Lx0/W0;", "a", "Landroidx/compose/runtime/F0;", "d", "()Landroidx/compose/runtime/F0;", "LocalRippleConfiguration", "Lx0/Z0;", "b", "Lx0/Z0;", "DefaultBoundedRipple", "c", "DefaultUnboundedRipple", "LB0/b;", "LB0/b;", "LightThemeHighContrastRippleAlpha", "LightThemeLowContrastRippleAlpha", "f", "DarkThemeRippleAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.Y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17982Y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<RippleConfiguration> f168629a = r.d(null, a.f168635f, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C17984Z0 f168630b;

    /* renamed from: c, reason: collision with root package name */
    private static final C17984Z0 f168631c;

    /* renamed from: d, reason: collision with root package name */
    private static final RippleAlpha f168632d;

    /* renamed from: e, reason: collision with root package name */
    private static final RippleAlpha f168633e;

    /* renamed from: f, reason: collision with root package name */
    private static final RippleAlpha f168634f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/W0;", "c", "()Lx0/W0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.Y0$a */
    static final class a extends Lambda implements Function0<RippleConfiguration> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168635f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }

    static {
        h.Companion companion = H1.h.INSTANCE;
        float fC = companion.c();
        C5489q0.Companion companion2 = C5489q0.INSTANCE;
        f168630b = new C17984Z0(true, fC, companion2.j(), (DefaultConstructorMarker) null);
        f168631c = new C17984Z0(false, companion.c(), companion2.j(), (DefaultConstructorMarker) null);
        f168632d = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        f168633e = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        f168634f = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final F0<RippleConfiguration> d() {
        return f168629a;
    }

    public static final InterfaceC13561B e(boolean z10, float f10, long j10) {
        return (H1.h.u(f10, H1.h.INSTANCE.c()) && C5489q0.s(j10, C5489q0.INSTANCE.j())) ? z10 ? f168630b : f168631c : new C17984Z0(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InterfaceC13561B f(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            j10 = C5489q0.INSTANCE.j();
        }
        return e(z10, f10, j10);
    }
}

package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LV0/q0;", "backgroundColor", "LH1/h;", "elevation", "b", "(JFLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/F0;", "Lx0/j0;", "a", "Landroidx/compose/runtime/F0;", "d", "()Landroidx/compose/runtime/F0;", "LocalElevationOverlay", "c", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17950k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<InterfaceC17947j0> f168173a = r.f(b.f168176f);

    /* renamed from: b, reason: collision with root package name */
    private static final F0<H1.h> f168174b = r.d(null, a.f168175f, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/j0;", "c", "()Lx0/j0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.k0$b */
    static final class b extends Lambda implements Function0<InterfaceC17947j0> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f168176f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC17947j0 invoke() {
            return C17903S.f167408a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/h;", "c", "()F"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.k0$a */
    static final class a extends Lambda implements Function0<H1.h> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168175f = new a();

        a() {
            super(0);
        }

        public final float c() {
            return H1.h.p(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ H1.h invoke() {
            return H1.h.l(c());
        }
    }

    public static final F0<H1.h> c() {
        return f168174b;
    }

    public static final F0<InterfaceC17947j0> d() {
        return f168173a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long jQ = C5346q0.q(C17876E.b(j10, composer, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jQ;
    }
}

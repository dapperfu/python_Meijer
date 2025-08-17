package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lx0/B;", "", "<init>", "()V", "LV0/q0;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Lx0/A;", "a", "(JJJJJLandroidx/compose/runtime/Composer;II)Lx0/A;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17870B {

    /* renamed from: a, reason: collision with root package name */
    public static final C17870B f166725a = new C17870B();

    /* renamed from: b, reason: collision with root package name */
    public static final int f166726b = 0;

    public final InterfaceC17868A a(long j10, long j11, long j12, long j13, long j14, Composer composer, int i10, int i11) {
        long j15;
        long jQ;
        long jL = (i11 & 1) != 0 ? C17877E0.f166879a.a(composer, 6).l() : j10;
        long jQ2 = (i11 & 2) != 0 ? C5346q0.q(C17877E0.f166879a.a(composer, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jN = (i11 & 4) != 0 ? C17877E0.f166879a.a(composer, 6).n() : j12;
        long jQ3 = (i11 & 8) != 0 ? C5346q0.q(C17877E0.f166879a.a(composer, 6).i(), C17890L.f167124a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i11 & 16) != 0) {
            long j16 = jL;
            jQ = C5346q0.q(j16, C17890L.f167124a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j15 = j16;
        } else {
            j15 = jL;
            jQ = j14;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(469524104, i10, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.e(j15)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.e(jQ2)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.e(jN)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composer.e(jQ3)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && composer.e(jQ)) || (i10 & 24576) == 16384);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            long j17 = j15;
            long j18 = jQ3;
            C17900Q c17900q = new C17900Q(jN, C5346q0.q(jN, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j17, C5346q0.q(j17, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j18, C5346q0.q(jQ3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jQ, j17, jQ2, jQ3, jQ, null);
            composer.t(c17900q);
            objB = c17900q;
        }
        C17900Q c17900q2 = (C17900Q) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17900q2;
    }

    private C17870B() {
    }
}

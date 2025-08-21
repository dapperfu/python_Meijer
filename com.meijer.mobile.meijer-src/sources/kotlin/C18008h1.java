package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lx0/h1;", "", "<init>", "()V", "LV0/q0;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "Lx0/g1;", "a", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Lx0/g1;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18008h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C18008h1 f169015a = new C18008h1();

    public final InterfaceC18005g1 a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i10, int i11, int i12) {
        long jG;
        long j20;
        long jQ;
        long j21;
        long jQ2;
        long j22;
        long jQ3;
        long j23;
        long jQ4;
        long j24;
        long jQ5;
        long j25;
        long j26 = (i12 & 1) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j10;
        if ((i12 & 2) != 0) {
            C17943E0 c17943e0 = C17943E0.f167967a;
            jG = C5492s0.g(C5489q0.q(c17943e0.a(composer, 6).i(), C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), c17943e0.a(composer, 6).n());
        } else {
            jG = j11;
        }
        long j27 = (i12 & 4) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j12;
        if ((i12 & 8) != 0) {
            long j28 = j27;
            jQ = C5489q0.q(j28, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            j20 = j28;
        } else {
            j20 = j27;
            jQ = j13;
        }
        long jQ6 = (i12 & 16) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i12 & 32) != 0) {
            long j29 = jQ6;
            jQ2 = C5489q0.q(j29, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j21 = j29;
        } else {
            j21 = jQ6;
            jQ2 = j15;
        }
        long jQ7 = (i12 & 64) != 0 ? C5489q0.q(C17942E.b(j20, composer, (i10 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i12 & 128) != 0) {
            long j30 = j20;
            jQ3 = C5489q0.q(j30, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j22 = j30;
        } else {
            j22 = j20;
            jQ3 = j17;
        }
        if ((i12 & 256) != 0) {
            long j31 = jQ7;
            jQ4 = C5489q0.q(j31, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j31;
        } else {
            j23 = jQ7;
            jQ4 = j18;
        }
        if ((i12 & 512) != 0) {
            long j32 = jQ2;
            jQ5 = C5489q0.q(j32, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j32;
        } else {
            j24 = jQ2;
            jQ5 = j19;
        }
        if (ComposerKt.M()) {
            j25 = jQ5;
            ComposerKt.U(436017687, i10, i11, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)");
        } else {
            j25 = jQ5;
        }
        C17975V c17975v = new C17975V(j26, jG, j22, jQ, j21, j24, j23, jQ3, jQ4, j25, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17975v;
    }

    private C18008h1() {
    }
}

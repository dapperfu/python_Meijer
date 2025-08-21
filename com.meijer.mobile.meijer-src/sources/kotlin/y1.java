package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lx0/y1;", "", "<init>", "()V", "LV0/q0;", "checkedThumbColor", "checkedTrackColor", "", "checkedTrackAlpha", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "Lx0/x1;", "a", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Lx0/x1;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f169980a = new y1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f169981b = 0;

    public final x1 a(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, Composer composer, int i10, int i11, int i12) {
        long j18;
        long j19;
        long jG;
        long j20;
        float f12;
        long j21;
        long jG2;
        long j22;
        int i13;
        long jG3;
        long jM = (i12 & 1) != 0 ? C17943E0.f167967a.a(composer, 6).m() : j10;
        long j23 = (i12 & 2) != 0 ? jM : j11;
        float f13 = (i12 & 4) != 0 ? 0.54f : f10;
        long jN = (i12 & 8) != 0 ? C17943E0.f167967a.a(composer, 6).n() : j12;
        long jI = (i12 & 16) != 0 ? C17943E0.f167967a.a(composer, 6).i() : j13;
        float f14 = (i12 & 32) != 0 ? 0.38f : f11;
        if ((i12 & 64) != 0) {
            long j24 = jM;
            long jQ = C5489q0.q(j24, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j18 = j24;
            j19 = j23;
            jG = C5492s0.g(jQ, C17943E0.f167967a.a(composer, 6).n());
        } else {
            j18 = jM;
            j19 = j23;
            jG = j14;
        }
        if ((i12 & 128) != 0) {
            j20 = j19;
            f12 = f13;
            j21 = jG;
            jG2 = C5492s0.g(C5489q0.q(j19, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), C17943E0.f167967a.a(composer, 6).n());
        } else {
            j20 = j19;
            f12 = f13;
            j21 = jG;
            jG2 = j15;
        }
        if ((i12 & 256) != 0) {
            i13 = 6;
            j22 = jG2;
            jG3 = C5492s0.g(C5489q0.q(jN, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), C17943E0.f167967a.a(composer, 6).n());
        } else {
            j22 = jG2;
            i13 = 6;
            jG3 = j16;
        }
        long jG4 = (i12 & 512) != 0 ? C5492s0.g(C5489q0.q(jI, C17956L.f168212a.b(composer, i13), 0.0f, 0.0f, 0.0f, 14, null), C17943E0.f167967a.a(composer, i13).n()) : j17;
        if (ComposerKt.M()) {
            ComposerKt.U(-1032127534, i10, i11, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
        }
        C17977W c17977w = new C17977W(j18, C5489q0.q(j20, f12, 0.0f, 0.0f, 0.0f, 14, null), jN, C5489q0.q(jI, f14, 0.0f, 0.0f, 0.0f, 14, null), j21, C5489q0.q(j22, f12, 0.0f, 0.0f, 0.0f, 14, null), jG3, C5489q0.q(jG4, f14, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17977w;
    }

    private y1() {
    }
}

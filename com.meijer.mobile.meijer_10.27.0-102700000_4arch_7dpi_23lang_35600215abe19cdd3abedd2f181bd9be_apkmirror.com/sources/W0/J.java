package W0;

import V0.C5349s0;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LW0/J;", "LW0/c;", "", "name", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "LV0/q0;", "n", "(FFFFLW0/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J extends AbstractC5391c {
    @Override // W0.AbstractC5391c
    public float[] b(float[] v10) {
        float f10 = v10[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        v10[0] = f10;
        float f11 = v10[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        v10[1] = f11;
        float f12 = v10[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        v10[2] = f13 <= 2.0f ? f13 : 2.0f;
        return v10;
    }

    @Override // W0.AbstractC5391c
    public float[] l(float[] v10) {
        float f10 = v10[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        v10[0] = f10;
        float f11 = v10[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        v10[1] = f11;
        float f12 = v10[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        v10[2] = f13 <= 2.0f ? f13 : 2.0f;
        return v10;
    }

    public J(String str, int i10) {
        super(str, C5390b.INSTANCE.c(), i10, null);
    }

    @Override // W0.AbstractC5391c
    public float e(int component) {
        return 2.0f;
    }

    @Override // W0.AbstractC5391c
    public float f(int component) {
        return -2.0f;
    }

    @Override // W0.AbstractC5391c
    public long j(float v02, float v12, float v22) {
        if (v02 < -2.0f) {
            v02 = -2.0f;
        }
        if (v02 > 2.0f) {
            v02 = 2.0f;
        }
        if (v12 < -2.0f) {
            v12 = -2.0f;
        }
        return (Float.floatToRawIntBits(v02) << 32) | (Float.floatToRawIntBits(v12 <= 2.0f ? v12 : 2.0f) & 4294967295L);
    }

    @Override // W0.AbstractC5391c
    public float m(float v02, float v12, float v22) {
        if (v22 < -2.0f) {
            v22 = -2.0f;
        }
        if (v22 > 2.0f) {
            return 2.0f;
        }
        return v22;
    }

    @Override // W0.AbstractC5391c
    public long n(float x10, float y10, float z10, float a10, AbstractC5391c colorSpace) {
        if (x10 < -2.0f) {
            x10 = -2.0f;
        }
        if (x10 > 2.0f) {
            x10 = 2.0f;
        }
        if (y10 < -2.0f) {
            y10 = -2.0f;
        }
        if (y10 > 2.0f) {
            y10 = 2.0f;
        }
        if (z10 < -2.0f) {
            z10 = -2.0f;
        }
        return C5349s0.a(x10, y10, z10 <= 2.0f ? z10 : 2.0f, a10, colorSpace);
    }
}

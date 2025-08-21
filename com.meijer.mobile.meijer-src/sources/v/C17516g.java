package v;

import F.EnumC3276k;
import F.EnumC3277l;
import F.EnumC3278m;
import F.EnumC3279n;
import F.EnumC3280o;
import F.EnumC3281p;
import F.EnumC3282q;
import G.h;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17516g implements F.r {

    /* renamed from: a, reason: collision with root package name */
    private final F.x0 f165063a;

    /* renamed from: b, reason: collision with root package name */
    private final CaptureResult f165064b;

    public C17516g(F.x0 x0Var, CaptureResult captureResult) {
        this.f165063a = x0Var;
        this.f165064b = captureResult;
    }

    @Override // F.r
    public F.x0 a() {
        return this.f165063a;
    }

    @Override // F.r
    public EnumC3282q c() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC3282q.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC3282q.NONE;
        }
        if (iIntValue == 2) {
            return EnumC3282q.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC3282q.FIRED;
        }
        C.P.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC3282q.UNKNOWN;
    }

    @Override // F.r
    public EnumC3280o d() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC3280o.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC3280o.UNKNOWN;
    }

    @Override // F.r
    public CaptureResult e() {
        return this.f165064b;
    }

    @Override // F.r
    public EnumC3276k f() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC3276k.UNKNOWN;
        }
        int iIntValue = num.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? EnumC3276k.UNKNOWN : Build.VERSION.SDK_INT >= 28 ? EnumC3276k.ON_EXTERNAL_FLASH : EnumC3276k.UNKNOWN : EnumC3276k.ON_AUTO_FLASH_REDEYE : EnumC3276k.ON_ALWAYS_FLASH : EnumC3276k.ON_AUTO_FLASH : EnumC3276k.ON : EnumC3276k.OFF;
    }

    @Override // F.r
    public EnumC3279n g() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC3279n.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                C.P.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC3279n.UNKNOWN;
    }

    @Override // F.r
    public long getTimestamp() {
        Long l10 = (Long) this.f165064b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // F.r
    public EnumC3281p h() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC3281p.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3281p.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC3281p.METERING;
        }
        if (iIntValue == 2) {
            return EnumC3281p.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC3281p.LOCKED;
        }
        C.P.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC3281p.UNKNOWN;
    }

    @Override // F.r
    public EnumC3278m i() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC3278m.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC3278m.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC3278m.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                C.P.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC3278m.UNKNOWN;
            }
        }
        return EnumC3278m.OFF;
    }

    @Override // F.r
    public EnumC3277l j() {
        Integer num = (Integer) this.f165064b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC3277l.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3277l.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC3277l.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC3277l.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC3277l.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                C.P.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC3277l.UNKNOWN;
            }
        }
        return EnumC3277l.SEARCHING;
    }

    @Override // F.r
    public void b(h.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f165064b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C.P.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f165064b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f165064b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer numValueOf = (Integer) this.f165064b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f165064b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f11 = (Float) this.f165064b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num2 = (Integer) this.f165064b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            h.c cVar = h.c.AUTO;
            if (num2.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    public C17516g(CaptureResult captureResult) {
        this(F.x0.b(), captureResult);
    }
}

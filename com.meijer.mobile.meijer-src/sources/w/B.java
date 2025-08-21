package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import z.C18397n;

/* loaded from: classes.dex */
public class B {

    /* renamed from: b, reason: collision with root package name */
    private final a f166360b;

    /* renamed from: c, reason: collision with root package name */
    private final String f166361c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<CameraCharacteristics.Key<?>, Object> f166359a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private U f166362d = null;

    public interface a {
        <T> T get(CameraCharacteristics.Key<T> key);
    }

    private boolean c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static B e(CameraCharacteristics cameraCharacteristics, String str) {
        return new B(cameraCharacteristics, str);
    }

    public U b() {
        if (this.f166362d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f166362d = U.e(streamConfigurationMap, new C18397n(this.f166361c));
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f166362d;
    }

    public boolean d() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f166360b.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private B(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f166360b = new y(cameraCharacteristics);
        } else {
            this.f166360b = new z(cameraCharacteristics);
        }
        this.f166361c = str;
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (c(key)) {
            return (T) this.f166360b.get(key);
        }
        synchronized (this) {
            try {
                T t10 = (T) this.f166359a.get(key);
                if (t10 != null) {
                    return t10;
                }
                T t11 = (T) this.f166360b.get(key);
                if (t11 != null) {
                    this.f166359a.put(key, t11);
                }
                return t11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

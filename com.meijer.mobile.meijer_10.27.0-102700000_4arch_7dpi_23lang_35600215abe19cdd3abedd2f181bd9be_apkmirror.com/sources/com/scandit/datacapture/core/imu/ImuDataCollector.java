package com.scandit.datacapture.core.imu;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.capture.NativeInertialMeasurementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/imu/ImuDataCollector;", "", "Lcom/scandit/datacapture/core/imu/ImuDataCollector$Listener;", "listener", "<init>", "(Lcom/scandit/datacapture/core/imu/ImuDataCollector$Listener;)V", "", "enable", "", "setEnabled", "(Z)V", "Listener", "com/scandit/datacapture/core/imu/a", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ImuDataCollector {

    /* renamed from: a, reason: collision with root package name */
    private final Listener f124192a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f124193b;

    /* renamed from: c, reason: collision with root package name */
    private final List f124194c;

    /* renamed from: d, reason: collision with root package name */
    private final a f124195d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/imu/ImuDataCollector$Listener;", "", "onMeasurement", "", "measurement", "Lcom/scandit/datacapture/core/imu/ImuMeasurement;", "onRotationMeasurement", "Lcom/scandit/datacapture/core/imu/ImuRotationMeasurement;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onMeasurement(ImuMeasurement measurement);

        void onRotationMeasurement(ImuRotationMeasurement measurement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public ImuDataCollector(Listener listener) {
        ?? M10;
        Intrinsics.j(listener, "listener");
        this.f124192a = listener;
        SensorManager sensorManager = (SensorManager) AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService(SensorManager.class);
        this.f124193b = sensorManager;
        if (sensorManager != null) {
            List listS = CollectionsKt.s(1, 4, 9, 15);
            M10 = new ArrayList();
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(((Number) it.next()).intValue());
                if (defaultSensor != null) {
                    M10.add(defaultSensor);
                }
            }
        } else {
            M10 = CollectionsKt.m();
        }
        this.f124194c = M10;
        this.f124195d = new a(this);
    }

    public final void setEnabled(boolean enable) {
        if (enable) {
            for (Sensor sensor : this.f124194c) {
                SensorManager sensorManager = this.f124193b;
                if (sensorManager != null) {
                    sensorManager.registerListener(this.f124195d, sensor, 10000, 0);
                }
            }
            return;
        }
        for (Sensor sensor2 : this.f124194c) {
            SensorManager sensorManager2 = this.f124193b;
            if (sensorManager2 != null) {
                sensorManager2.unregisterListener(this.f124195d, sensor2);
            }
        }
    }

    public static final void access$onSensorEvent(ImuDataCollector imuDataCollector, SensorEvent sensorEvent) {
        imuDataCollector.getClass();
        long j10 = sensorEvent.timestamp;
        int type = sensorEvent.sensor.getType();
        int i10 = 0;
        if (type != 1) {
            if (type != 4) {
                if (type != 9) {
                    if (type != 15) {
                        return;
                    }
                    Listener listener = imuDataCollector.f124192a;
                    float[] fArr = sensorEvent.values;
                    listener.onRotationMeasurement(new ImuRotationMeasurement(new float[]{fArr[3], fArr[0], fArr[1], fArr[2]}, j10));
                    return;
                }
                Listener listener2 = imuDataCollector.f124192a;
                NativeInertialMeasurementType nativeInertialMeasurementType = NativeInertialMeasurementType.GRAVITY;
                float[] fArr2 = new float[3];
                for (int i11 = 0; i11 < 3; i11++) {
                    fArr2[i11] = sensorEvent.values[i11];
                }
                Intrinsics.j(fArr2, "<this>");
                float[] fArr3 = new float[3];
                while (i10 < 3) {
                    fArr3[i10] = fArr2[i10] / (-9.81f);
                    i10++;
                }
                listener2.onMeasurement(new ImuMeasurement(nativeInertialMeasurementType, fArr3, j10));
                return;
            }
            Listener listener3 = imuDataCollector.f124192a;
            NativeInertialMeasurementType nativeInertialMeasurementType2 = NativeInertialMeasurementType.GYROSCOPE;
            float[] fArr4 = new float[3];
            while (i10 < 3) {
                fArr4[i10] = sensorEvent.values[i10];
                i10++;
            }
            listener3.onMeasurement(new ImuMeasurement(nativeInertialMeasurementType2, fArr4, j10));
            return;
        }
        Listener listener4 = imuDataCollector.f124192a;
        NativeInertialMeasurementType nativeInertialMeasurementType3 = NativeInertialMeasurementType.ACCELEROMETER;
        float[] fArr5 = new float[3];
        for (int i12 = 0; i12 < 3; i12++) {
            fArr5[i12] = sensorEvent.values[i12];
        }
        Intrinsics.j(fArr5, "<this>");
        float[] fArr6 = new float[3];
        while (i10 < 3) {
            fArr6[i10] = fArr5[i10] / (-9.81f);
            i10++;
        }
        listener4.onMeasurement(new ImuMeasurement(nativeInertialMeasurementType3, fArr6, j10));
    }
}

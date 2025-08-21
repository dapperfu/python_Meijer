package com.scandit.datacapture.barcode.internal.module.spark.data;

import android.content.SharedPreferences;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientationMapper;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class SparkScanStateManager {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f123821s = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(SparkScanStateManager.class, "torchState", "getTorchState()Lcom/scandit/datacapture/core/source/TorchState;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(SparkScanStateManager.class, "cameraPosition", "getCameraPosition()Lcom/scandit/datacapture/core/source/CameraPosition;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f123822a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeSparkScanStateMachine f123823b;

    /* renamed from: c, reason: collision with root package name */
    private final DeviceOrientationMapper f123824c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f123825d;

    /* renamed from: e, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f123826e;

    /* renamed from: f, reason: collision with root package name */
    private final C13332l f123827f;

    /* renamed from: g, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f123828g;

    /* renamed from: h, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f123829h;

    /* renamed from: i, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f123830i;

    /* renamed from: j, reason: collision with root package name */
    private SparkScanScanningMode f123831j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f123832k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f123833l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f123834m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f123835n;

    /* renamed from: o, reason: collision with root package name */
    private SparkScanMiniPreviewSize f123836o;

    /* renamed from: p, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f123837p;

    /* renamed from: q, reason: collision with root package name */
    private final C13333m f123838q;

    /* renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArraySet f123839r;

    public final void b(SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.j(sparkScanScanningMode, "<set-?>");
        this.f123831j = sparkScanScanningMode;
    }

    public final void c(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-x-location-mini-preview", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-x-location-mini-preview-landscape", f10).apply();
        }
    }

    public final boolean d() {
        return this.f123825d.getBoolean("spark-scan-feedback-haptic-enabled", this.f123822a.getHapticEnabled());
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b e() {
        return this.f123829h;
    }

    public final void f(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-y-location", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-y-location-landscape", f10).apply();
        }
    }

    public SparkScanStateManager(SparkScanViewSettings settings, NativeSparkScanStateMachine nativeStateMachine) {
        C13329i sparkScanMigrationManager = new C13329i();
        DeviceOrientationMapper deviceOrientationMapper = new DeviceOrientationMapper();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(nativeStateMachine, "nativeStateMachine");
        Intrinsics.j(sparkScanMigrationManager, "sparkScanMigrationManager");
        Intrinsics.j(deviceOrientationMapper, "deviceOrientationMapper");
        this.f123822a = settings;
        this.f123823b = nativeStateMachine;
        this.f123824c = deviceOrientationMapper;
        SharedPreferences sharedPreferences = AppAndroidEnvironment.INSTANCE.getApplicationContext().getSharedPreferences("com.scandit.barcode.spark_capture", 0);
        Intrinsics.g(sharedPreferences);
        sparkScanMigrationManager.a(sharedPreferences);
        this.f123825d = sharedPreferences;
        this.f123826e = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultTorchState());
        Delegates delegates = Delegates.f143781a;
        this.f123827f = new C13332l(settings.getDefaultTorchState(), this);
        this.f123828g = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(Boolean.valueOf(s()));
        this.f123829h = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(Boolean.valueOf(d()));
        this.f123830i = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultScanningMode());
        this.f123831j = settings.getDefaultScanningMode();
        this.f123836o = settings.getDefaultMiniPreviewSize();
        this.f123837p = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultCameraPosition());
        this.f123838q = new C13333m(settings.getDefaultCameraPosition(), this);
        this.f123839r = new CopyOnWriteArraySet();
        a(settings.getDefaultScanningMode());
        nativeStateMachine.addScanningModeListenerAsync(new com.scandit.datacapture.barcode.internal.module.spark.internal.v(new C13330j(this), this));
    }

    public final void a(TorchState torchState) {
        Intrinsics.j(torchState, "<set-?>");
        this.f123827f.setValue(this, f123821s[0], torchState);
    }

    public final void b(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-y-location-mini-preview-collapsed", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-y-location-mini-preview-landscape-collapsed", f10).apply();
        }
    }

    public final void e(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-x-location", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-x-location-landscape", f10).apply();
        }
    }

    public final long g() {
        return this.f123822a.getInactiveStateTimeout().asMillis();
    }

    public final boolean h() {
        return this.f123832k;
    }

    public final boolean i() {
        return this.f123834m;
    }

    public final SparkScanMiniPreviewSize l() {
        return this.f123836o;
    }

    public final DeviceOrientation o() {
        return this.f123824c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
    }

    public final SparkScanScanningMode p() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeSparkScanScanningMode scanningMode = this.f123823b.getScanningMode();
        Intrinsics.i(scanningMode, "getScanningMode(...)");
        return barcodeNativeTypeFactory.convert(scanningMode);
    }

    public final SparkScanScanningMode q() {
        return this.f123831j;
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b r() {
        return this.f123830i;
    }

    public final boolean s() {
        return this.f123825d.getBoolean("spark-scan-feedback-sound-enabled", this.f123822a.getSoundEnabled());
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b t() {
        return this.f123828g;
    }

    public final TorchState u() {
        return (TorchState) this.f123827f.getValue(this, f123821s[0]);
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b v() {
        return this.f123826e;
    }

    public final boolean y() {
        return this.f123835n;
    }

    public final boolean z() {
        DeviceOrientation deviceOrientationMapRotationToOrientation = this.f123824c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
        return (deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_LEFT || deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_RIGHT) ? false : true;
    }

    public final void a(SparkScanScanningMode value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.b bVar = this.f123830i;
        bVar.f123885a.setValue(bVar, com.scandit.datacapture.barcode.internal.module.spark.internal.b.f123884c[0], value);
        this.f123823b.setScanningMode(BarcodeNativeTypeFactory.INSTANCE.convert(value));
    }

    public final float j() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-x-location-mini-preview-collapsed", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-x-location-mini-preview-landscape-collapsed", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float k() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-y-location-mini-preview-collapsed", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-y-location-mini-preview-landscape-collapsed", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float m() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-x-location-mini-preview", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-x-location-mini-preview-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float n() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-y-location-mini-preview", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-y-location-mini-preview-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float w() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-x-location", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-x-location-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float x() {
        boolean z10 = z();
        if (z10) {
            return this.f123825d.getFloat("spark-capture-y-location", -1.0f);
        }
        if (!z10) {
            return this.f123825d.getFloat("spark-capture-y-location-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void d(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-y-location-mini-preview", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-y-location-mini-preview-landscape", f10).apply();
        }
    }

    public final void a(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f123825d.edit().putFloat("spark-capture-x-location-mini-preview-collapsed", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f123825d.edit().putFloat("spark-capture-x-location-mini-preview-landscape-collapsed", f10).apply();
        }
    }

    public final boolean c() {
        return this.f123833l;
    }

    public final long f() {
        return this.f123822a.getTriggerButtonCollapseTimeout().asMillis();
    }

    public final void b(boolean z10) {
        if (z10) {
            this.f123831j = p();
            a(SparkScanScanningModeKt.copyWith$default(p(), SparkScanScanningBehavior.CONTINUOUS, null, 2, null));
        } else if (!z10) {
            a(this.f123831j);
        }
        this.f123832k = z10;
    }

    public final void c(boolean z10) {
        this.f123834m = z10;
    }

    public final void d(boolean z10) {
        this.f123835n = z10;
    }

    public final void a(boolean z10) {
        this.f123833l = z10;
    }

    public final void a(SparkScanMiniPreviewSize sparkScanMiniPreviewSize) {
        Intrinsics.j(sparkScanMiniPreviewSize, "<set-?>");
        this.f123836o = sparkScanMiniPreviewSize;
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b b() {
        return this.f123837p;
    }

    public final CameraPosition a() {
        return (CameraPosition) this.f123838q.getValue(this, f123821s[1]);
    }

    public final void b(InterfaceC13331k listener) {
        Intrinsics.j(listener, "listener");
        this.f123839r.remove(listener);
    }

    public final void a(CameraPosition cameraPosition) {
        Intrinsics.j(cameraPosition, "<set-?>");
        this.f123838q.setValue(this, f123821s[1], cameraPosition);
    }

    public final void a(InterfaceC13331k listener) {
        Intrinsics.j(listener, "listener");
        this.f123839r.add(listener);
    }
}

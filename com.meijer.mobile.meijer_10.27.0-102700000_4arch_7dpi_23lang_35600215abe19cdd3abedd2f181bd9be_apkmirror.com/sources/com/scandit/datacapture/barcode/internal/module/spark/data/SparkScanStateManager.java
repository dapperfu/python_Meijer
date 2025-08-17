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

/* loaded from: classes11.dex */
public final class SparkScanStateManager {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f122869s = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(SparkScanStateManager.class, "torchState", "getTorchState()Lcom/scandit/datacapture/core/source/TorchState;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(SparkScanStateManager.class, "cameraPosition", "getCameraPosition()Lcom/scandit/datacapture/core/source/CameraPosition;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f122870a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeSparkScanStateMachine f122871b;

    /* renamed from: c, reason: collision with root package name */
    private final DeviceOrientationMapper f122872c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f122873d;

    /* renamed from: e, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f122874e;

    /* renamed from: f, reason: collision with root package name */
    private final C13199l f122875f;

    /* renamed from: g, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f122876g;

    /* renamed from: h, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f122877h;

    /* renamed from: i, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f122878i;

    /* renamed from: j, reason: collision with root package name */
    private SparkScanScanningMode f122879j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f122880k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f122881l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f122882m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f122883n;

    /* renamed from: o, reason: collision with root package name */
    private SparkScanMiniPreviewSize f122884o;

    /* renamed from: p, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.spark.internal.b f122885p;

    /* renamed from: q, reason: collision with root package name */
    private final C13200m f122886q;

    /* renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArraySet f122887r;

    public final void b(SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.j(sparkScanScanningMode, "<set-?>");
        this.f122879j = sparkScanScanningMode;
    }

    public final void c(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-x-location-mini-preview", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-x-location-mini-preview-landscape", f10).apply();
        }
    }

    public final boolean d() {
        return this.f122873d.getBoolean("spark-scan-feedback-haptic-enabled", this.f122870a.getHapticEnabled());
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b e() {
        return this.f122877h;
    }

    public final void f(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-y-location", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-y-location-landscape", f10).apply();
        }
    }

    public SparkScanStateManager(SparkScanViewSettings settings, NativeSparkScanStateMachine nativeStateMachine) {
        C13196i sparkScanMigrationManager = new C13196i();
        DeviceOrientationMapper deviceOrientationMapper = new DeviceOrientationMapper();
        Intrinsics.j(settings, "settings");
        Intrinsics.j(nativeStateMachine, "nativeStateMachine");
        Intrinsics.j(sparkScanMigrationManager, "sparkScanMigrationManager");
        Intrinsics.j(deviceOrientationMapper, "deviceOrientationMapper");
        this.f122870a = settings;
        this.f122871b = nativeStateMachine;
        this.f122872c = deviceOrientationMapper;
        SharedPreferences sharedPreferences = AppAndroidEnvironment.INSTANCE.getApplicationContext().getSharedPreferences("com.scandit.barcode.spark_capture", 0);
        Intrinsics.g(sharedPreferences);
        sparkScanMigrationManager.a(sharedPreferences);
        this.f122873d = sharedPreferences;
        this.f122874e = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultTorchState());
        Delegates delegates = Delegates.f142874a;
        this.f122875f = new C13199l(settings.getDefaultTorchState(), this);
        this.f122876g = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(Boolean.valueOf(s()));
        this.f122877h = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(Boolean.valueOf(d()));
        this.f122878i = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultScanningMode());
        this.f122879j = settings.getDefaultScanningMode();
        this.f122884o = settings.getDefaultMiniPreviewSize();
        this.f122885p = new com.scandit.datacapture.barcode.internal.module.spark.internal.b(settings.getDefaultCameraPosition());
        this.f122886q = new C13200m(settings.getDefaultCameraPosition(), this);
        this.f122887r = new CopyOnWriteArraySet();
        a(settings.getDefaultScanningMode());
        nativeStateMachine.addScanningModeListenerAsync(new com.scandit.datacapture.barcode.internal.module.spark.internal.v(new C13197j(this), this));
    }

    public final void a(TorchState torchState) {
        Intrinsics.j(torchState, "<set-?>");
        this.f122875f.setValue(this, f122869s[0], torchState);
    }

    public final void b(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-y-location-mini-preview-collapsed", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-y-location-mini-preview-landscape-collapsed", f10).apply();
        }
    }

    public final void e(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-x-location", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-x-location-landscape", f10).apply();
        }
    }

    public final long g() {
        return this.f122870a.getInactiveStateTimeout().asMillis();
    }

    public final boolean h() {
        return this.f122880k;
    }

    public final boolean i() {
        return this.f122882m;
    }

    public final SparkScanMiniPreviewSize l() {
        return this.f122884o;
    }

    public final DeviceOrientation o() {
        return this.f122872c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
    }

    public final SparkScanScanningMode p() {
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeSparkScanScanningMode scanningMode = this.f122871b.getScanningMode();
        Intrinsics.i(scanningMode, "getScanningMode(...)");
        return barcodeNativeTypeFactory.convert(scanningMode);
    }

    public final SparkScanScanningMode q() {
        return this.f122879j;
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b r() {
        return this.f122878i;
    }

    public final boolean s() {
        return this.f122873d.getBoolean("spark-scan-feedback-sound-enabled", this.f122870a.getSoundEnabled());
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b t() {
        return this.f122876g;
    }

    public final TorchState u() {
        return (TorchState) this.f122875f.getValue(this, f122869s[0]);
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b v() {
        return this.f122874e;
    }

    public final boolean y() {
        return this.f122883n;
    }

    public final boolean z() {
        DeviceOrientation deviceOrientationMapRotationToOrientation = this.f122872c.mapRotationToOrientation(ContextExtensionsKt.getRotation(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
        return (deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_LEFT || deviceOrientationMapRotationToOrientation == DeviceOrientation.LANDSCAPE_RIGHT) ? false : true;
    }

    public final void a(SparkScanScanningMode value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.b bVar = this.f122878i;
        bVar.f122933a.setValue(bVar, com.scandit.datacapture.barcode.internal.module.spark.internal.b.f122932c[0], value);
        this.f122871b.setScanningMode(BarcodeNativeTypeFactory.INSTANCE.convert(value));
    }

    public final float j() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-x-location-mini-preview-collapsed", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-x-location-mini-preview-landscape-collapsed", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float k() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-y-location-mini-preview-collapsed", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-y-location-mini-preview-landscape-collapsed", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float m() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-x-location-mini-preview", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-x-location-mini-preview-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float n() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-y-location-mini-preview", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-y-location-mini-preview-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float w() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-x-location", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-x-location-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float x() {
        boolean z10 = z();
        if (z10) {
            return this.f122873d.getFloat("spark-capture-y-location", -1.0f);
        }
        if (!z10) {
            return this.f122873d.getFloat("spark-capture-y-location-landscape", -1.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void d(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-y-location-mini-preview", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-y-location-mini-preview-landscape", f10).apply();
        }
    }

    public final void a(float f10) {
        boolean z10 = z();
        if (z10) {
            this.f122873d.edit().putFloat("spark-capture-x-location-mini-preview-collapsed", f10).apply();
        } else {
            if (z10) {
                return;
            }
            this.f122873d.edit().putFloat("spark-capture-x-location-mini-preview-landscape-collapsed", f10).apply();
        }
    }

    public final boolean c() {
        return this.f122881l;
    }

    public final long f() {
        return this.f122870a.getTriggerButtonCollapseTimeout().asMillis();
    }

    public final void b(boolean z10) {
        if (z10) {
            this.f122879j = p();
            a(SparkScanScanningModeKt.copyWith$default(p(), SparkScanScanningBehavior.CONTINUOUS, null, 2, null));
        } else if (!z10) {
            a(this.f122879j);
        }
        this.f122880k = z10;
    }

    public final void c(boolean z10) {
        this.f122882m = z10;
    }

    public final void d(boolean z10) {
        this.f122883n = z10;
    }

    public final void a(boolean z10) {
        this.f122881l = z10;
    }

    public final void a(SparkScanMiniPreviewSize sparkScanMiniPreviewSize) {
        Intrinsics.j(sparkScanMiniPreviewSize, "<set-?>");
        this.f122884o = sparkScanMiniPreviewSize;
    }

    public final com.scandit.datacapture.barcode.internal.module.spark.internal.b b() {
        return this.f122885p;
    }

    public final CameraPosition a() {
        return (CameraPosition) this.f122886q.getValue(this, f122869s[1]);
    }

    public final void b(InterfaceC13198k listener) {
        Intrinsics.j(listener, "listener");
        this.f122887r.remove(listener);
    }

    public final void a(CameraPosition cameraPosition) {
        Intrinsics.j(cameraPosition, "<set-?>");
        this.f122886q.setValue(this, f122869s[1], cameraPosition);
    }

    public final void a(InterfaceC13198k listener) {
        Intrinsics.j(listener, "listener");
        this.f122887r.add(listener);
    }
}

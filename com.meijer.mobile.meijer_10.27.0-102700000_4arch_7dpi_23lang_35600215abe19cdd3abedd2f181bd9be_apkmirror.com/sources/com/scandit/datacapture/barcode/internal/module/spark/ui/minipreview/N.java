package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewCameraSwitchButton;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewTargetModeButton;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.N;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class N extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f123172q = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarBackgroundColor", "getToolbarBackgroundColor()Ljava/lang/Integer;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarIconActiveTintColor", "getToolbarIconActiveTintColor()Ljava/lang/Integer;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarIconInactiveTintColor", "getToolbarIconInactiveTintColor()Ljava/lang/Integer;", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f123173a;

    /* renamed from: b, reason: collision with root package name */
    public A f123174b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f123175c;

    /* renamed from: d, reason: collision with root package name */
    public final SparkScanViewTargetModeButton f123176d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f123177e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f123178f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f123179g;

    /* renamed from: h, reason: collision with root package name */
    public final SparkScanViewCameraSwitchButton f123180h;

    /* renamed from: i, reason: collision with root package name */
    public final View f123181i;

    /* renamed from: j, reason: collision with root package name */
    public final View f123182j;

    /* renamed from: k, reason: collision with root package name */
    public final View f123183k;

    /* renamed from: l, reason: collision with root package name */
    public final StartStopEventScrollView f123184l;

    /* renamed from: m, reason: collision with root package name */
    public final List f123185m;

    /* renamed from: n, reason: collision with root package name */
    public final K f123186n;

    /* renamed from: o, reason: collision with root package name */
    public final L f123187o;

    /* renamed from: p, reason: collision with root package name */
    public final M f123188p;

    public static final void c(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).z();
        }
    }

    public static final void d(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).I();
        }
    }

    public static final void e(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).H();
        }
    }

    public static final void f(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).x();
        }
    }

    public final ColorStateList a() {
        int iIntValue;
        int iIntValue2;
        L l10 = this.f123187o;
        KProperty<?>[] kPropertyArr = f123172q;
        Integer num = (Integer) l10.getValue(this, kPropertyArr[1]);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconActiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconActiveTintColor();
            Intrinsics.i(nativeColorDefaultToolbarIconActiveTintColor, "defaultToolbarIconActiveTintColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconActiveTintColor);
        }
        Integer num2 = (Integer) this.f123188p.getValue(this, kPropertyArr[2]);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
            Intrinsics.i(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor(...)");
            iIntValue2 = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
        }
        int iArgb = Color.argb(Math.max(0, Color.alpha(iIntValue) - 51), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        int iArgb2 = Color.argb(Math.max(0, Color.alpha(iIntValue2) - 51), Color.red(iIntValue2), Color.green(iIntValue2), Color.blue(iIntValue2));
        Pair pairE = ArraysKt.e(new Pair[]{TuplesKt.a(new int[]{R.attr.state_selected, R.attr.state_pressed}, Integer.valueOf(iArgb)), TuplesKt.a(new int[]{R.attr.state_pressed}, Integer.valueOf(iArgb2)), TuplesKt.a(new int[]{R.attr.state_selected, R.attr.state_enabled}, Integer.valueOf(iIntValue)), TuplesKt.a(new int[]{R.attr.state_selected}, Integer.valueOf(iArgb)), TuplesKt.a(new int[]{R.attr.state_enabled}, Integer.valueOf(iIntValue2)), TuplesKt.a(new int[0], Integer.valueOf(iArgb2))});
        return new ColorStateList((int[][]) ((List) pairE.a()).toArray(new int[0][]), CollectionsKt.i1((List) pairE.b()));
    }

    public final ColorStateList b() {
        int iIntValue;
        Integer num = (Integer) this.f123188p.getValue(this, f123172q[2]);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
            Intrinsics.i(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
        }
        Pair pairE = ArraysKt.e(new Pair[]{TuplesKt.a(new int[]{R.attr.state_enabled}, Integer.valueOf(iIntValue)), TuplesKt.a(new int[0], Integer.valueOf(Color.argb(Math.max(0, Color.alpha(iIntValue) - 51), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue))))});
        return new ColorStateList((int[][]) ((List) pairE.a()).toArray(new int[0][]), CollectionsKt.i1((List) pairE.b()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context, SparkScanStateManager stateManager) {
        int iIntValue;
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(stateManager, "stateManager");
        this.f123173a = stateManager;
        Integer defaultToolbarBackgroundColor = SparkScanViewDefaults.getDefaultToolbarBackgroundColor();
        Delegates delegates = Delegates.f142874a;
        K k10 = new K(defaultToolbarBackgroundColor, this);
        this.f123186n = k10;
        this.f123187o = new L(SparkScanViewDefaults.getDefaultToolbarIconActiveTintColor(), this);
        this.f123188p = new M(SparkScanViewDefaults.getDefaultToolbarIconInactiveTintColor(), this);
        View.inflate(context, com.scandit.datacapture.barcode.R.layout.sc_spark_scan_view_button_triggers_layout, this);
        setId(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122972b);
        View viewFindViewById = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_target_mode_button);
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = (SparkScanViewTargetModeButton) viewFindViewById;
        sparkScanViewTargetModeButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.d(this.f36317a, view);
            }
        });
        SparkScanScanningMode scanningMode = stateManager.p();
        Intrinsics.j(scanningMode, "scanningMode");
        sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
        Intrinsics.i(viewFindViewById, "also(...)");
        this.f123176d = sparkScanViewTargetModeButton;
        View viewFindViewById2 = findViewById(com.scandit.datacapture.barcode.R.id.spark_capture_trigger_continuous_mode_button);
        ImageButton imageButton = (ImageButton) viewFindViewById2;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.e(this.f36318a, view);
            }
        });
        imageButton.setSelected(SparkScanScanningModeKt.getScanningBehavior(stateManager.p()) == SparkScanScanningBehavior.CONTINUOUS);
        Intrinsics.i(viewFindViewById2, "also(...)");
        this.f123175c = imageButton;
        View viewFindViewById3 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_barcode_count_button);
        ImageButton imageButton2 = (ImageButton) viewFindViewById3;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: Ut.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.f(this.f36319a, view);
            }
        });
        Intrinsics.i(viewFindViewById3, "also(...)");
        this.f123177e = imageButton2;
        View viewFindViewById4 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_barcode_find_button);
        ImageButton imageButton3 = (ImageButton) viewFindViewById4;
        imageButton3.setOnClickListener(new View.OnClickListener() { // from class: Ut.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.a(this.f36320a, view);
            }
        });
        Intrinsics.i(viewFindViewById4, "also(...)");
        this.f123178f = imageButton3;
        View viewFindViewById5 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_label_capture_button);
        ImageButton imageButton4 = (ImageButton) viewFindViewById5;
        imageButton4.setOnClickListener(new View.OnClickListener() { // from class: Ut.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.b(this.f36321a, view);
            }
        });
        Intrinsics.i(viewFindViewById5, "also(...)");
        this.f123179g = imageButton4;
        View viewFindViewById6 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_camera_button);
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = (SparkScanViewCameraSwitchButton) viewFindViewById6;
        sparkScanViewCameraSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.c(this.f36322a, view);
            }
        });
        CameraPosition cameraPosition = stateManager.a();
        Intrinsics.j(cameraPosition, "cameraPosition");
        sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
        FS.Resources_setImageResource(sparkScanViewCameraSwitchButton, com.scandit.datacapture.barcode.internal.module.spark.ui.button.a.f123071a[cameraPosition.ordinal()] == 1 ? com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_secondary : com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_primary);
        Intrinsics.i(viewFindViewById6, "also(...)");
        this.f123180h = sparkScanViewCameraSwitchButton;
        this.f123185m = CollectionsKt.p(sparkScanViewTargetModeButton, imageButton, imageButton2, imageButton3, sparkScanViewCameraSwitchButton, imageButton4);
        View viewFindViewById7 = findViewById(com.scandit.datacapture.barcode.R.id.trigger_gradient_right);
        Intrinsics.i(viewFindViewById7, "findViewById(...)");
        this.f123182j = viewFindViewById7;
        View viewFindViewById8 = findViewById(com.scandit.datacapture.barcode.R.id.trigger_gradient_left);
        Intrinsics.i(viewFindViewById8, "findViewById(...)");
        this.f123183k = viewFindViewById8;
        View viewFindViewById9 = findViewById(com.scandit.datacapture.barcode.R.id.external_button_separator);
        Intrinsics.i(viewFindViewById9, "findViewById(...)");
        this.f123181i = viewFindViewById9;
        View viewFindViewById10 = findViewById(com.scandit.datacapture.barcode.R.id.toolbar_scroll_view);
        Intrinsics.i(viewFindViewById10, "findViewById(...)");
        StartStopEventScrollView startStopEventScrollView = (StartStopEventScrollView) viewFindViewById10;
        this.f123184l = startStopEventScrollView;
        imageButton2.setVisibility(!SparkScanViewDefaults.getDefaultBarcodeCountButtonVisible() ? 8 : 0);
        e();
        imageButton3.setVisibility(!SparkScanViewDefaults.getDefaultBarcodeFindButtonVisible() ? 8 : 0);
        e();
        sparkScanViewCameraSwitchButton.setVisibility(!SparkScanViewDefaults.getDefaultCameraSwitchButtonVisible() ? 8 : 0);
        e();
        imageButton.setVisibility(!SparkScanViewDefaults.getDefaultScanningBehaviorButtonVisible() ? 8 : 0);
        e();
        sparkScanViewTargetModeButton.setVisibility(!SparkScanViewDefaults.getDefaultTargetModeButtonVisible() ? 8 : 0);
        e();
        imageButton4.setVisibility(SparkScanViewDefaults.getDefaultLabelCaptureButtonVisible() ? 0 : 8);
        e();
        d();
        Integer num = (Integer) k10.getValue(this, f123172q[0]);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
            Intrinsics.i(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
        }
        setBackgroundColor(iIntValue);
        startStopEventScrollView.a(new I(this));
        startStopEventScrollView.a(new J(this));
        setClipToOutline(true);
        setOutlineProvider(new O());
    }

    public final boolean c() {
        List list = this.f123185m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.f123178f.setImageTintList(b());
        this.f123177e.setImageTintList(b());
        this.f123179g.setImageTintList(b());
        this.f123180h.setImageTintList(a());
        this.f123175c.setImageTintList(a());
        this.f123176d.setImageTintList(a());
        View view = this.f123181i;
        Integer num = (Integer) this.f123188p.getValue(this, f123172q[2]);
        view.setBackgroundColor(num != null ? num.intValue() : getContext().getColor(com.scandit.datacapture.barcode.R.color.sc_spark_scan_default_toolbar_separator_color));
    }

    public final void e() {
        this.f123181i.setVisibility(((this.f123177e.getVisibility() == 0 || this.f123178f.getVisibility() == 0 || this.f123179g.getVisibility() == 0) && (this.f123176d.getVisibility() == 0 || this.f123175c.getVisibility() == 0 || this.f123180h.getVisibility() == 0)) ? 0 : 8);
    }

    public final void f() {
        this.f123175c.setSelected(SparkScanScanningModeKt.getScanningBehavior(this.f123173a.p()) == SparkScanScanningBehavior.CONTINUOUS);
        this.f123175c.setEnabled(!this.f123173a.h());
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = this.f123176d;
        SparkScanScanningMode scanningMode = this.f123173a.p();
        sparkScanViewTargetModeButton.getClass();
        Intrinsics.j(scanningMode, "scanningMode");
        sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = this.f123180h;
        CameraPosition cameraPosition = this.f123173a.a();
        sparkScanViewCameraSwitchButton.getClass();
        Intrinsics.j(cameraPosition, "cameraPosition");
        sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
        FS.Resources_setImageResource(sparkScanViewCameraSwitchButton, com.scandit.datacapture.barcode.internal.module.spark.ui.button.a.f123071a[cameraPosition.ordinal()] == 1 ? com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_secondary : com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_primary);
        this.f123179g.setEnabled(!this.f123173a.h());
        this.f123178f.setEnabled(!this.f123173a.h());
        this.f123177e.setEnabled(!this.f123173a.h());
        this.f123184l.a(new I(this));
        this.f123184l.a(new J(this));
        a(this.f123184l.getScrollX());
    }

    public static final void b(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).C();
        }
    }

    public static final void a(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f123174b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).y();
        }
    }

    public final void a(int i10) {
        float right = this.f123184l.getChildAt(0).getRight() - this.f123184l.getWidth();
        if (right > 0.0f) {
            float f10 = i10 / right;
            this.f123183k.setAlpha(f10);
            this.f123182j.setAlpha(1.0f - f10);
        } else {
            this.f123183k.setAlpha(0.0f);
            this.f123182j.setAlpha(0.0f);
        }
    }
}

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

/* loaded from: classes12.dex */
public final class N extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f124124q = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarBackgroundColor", "getToolbarBackgroundColor()Ljava/lang/Integer;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarIconActiveTintColor", "getToolbarIconActiveTintColor()Ljava/lang/Integer;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(N.class, "toolbarIconInactiveTintColor", "getToolbarIconInactiveTintColor()Ljava/lang/Integer;", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f124125a;

    /* renamed from: b, reason: collision with root package name */
    public A f124126b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f124127c;

    /* renamed from: d, reason: collision with root package name */
    public final SparkScanViewTargetModeButton f124128d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f124129e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f124130f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f124131g;

    /* renamed from: h, reason: collision with root package name */
    public final SparkScanViewCameraSwitchButton f124132h;

    /* renamed from: i, reason: collision with root package name */
    public final View f124133i;

    /* renamed from: j, reason: collision with root package name */
    public final View f124134j;

    /* renamed from: k, reason: collision with root package name */
    public final View f124135k;

    /* renamed from: l, reason: collision with root package name */
    public final StartStopEventScrollView f124136l;

    /* renamed from: m, reason: collision with root package name */
    public final List f124137m;

    /* renamed from: n, reason: collision with root package name */
    public final K f124138n;

    /* renamed from: o, reason: collision with root package name */
    public final L f124139o;

    /* renamed from: p, reason: collision with root package name */
    public final M f124140p;

    public static final void c(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).z();
        }
    }

    public static final void d(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).I();
        }
    }

    public static final void e(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).H();
        }
    }

    public static final void f(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).x();
        }
    }

    public final ColorStateList a() {
        int iIntValue;
        int iIntValue2;
        L l10 = this.f124139o;
        KProperty<?>[] kPropertyArr = f124124q;
        Integer num = (Integer) l10.getValue(this, kPropertyArr[1]);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconActiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconActiveTintColor();
            Intrinsics.i(nativeColorDefaultToolbarIconActiveTintColor, "defaultToolbarIconActiveTintColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconActiveTintColor);
        }
        Integer num2 = (Integer) this.f124140p.getValue(this, kPropertyArr[2]);
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
        Integer num = (Integer) this.f124140p.getValue(this, f124124q[2]);
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
        this.f124125a = stateManager;
        Integer defaultToolbarBackgroundColor = SparkScanViewDefaults.getDefaultToolbarBackgroundColor();
        Delegates delegates = Delegates.f143781a;
        K k10 = new K(defaultToolbarBackgroundColor, this);
        this.f124138n = k10;
        this.f124139o = new L(SparkScanViewDefaults.getDefaultToolbarIconActiveTintColor(), this);
        this.f124140p = new M(SparkScanViewDefaults.getDefaultToolbarIconInactiveTintColor(), this);
        View.inflate(context, com.scandit.datacapture.barcode.R.layout.sc_spark_scan_view_button_triggers_layout, this);
        setId(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123924b);
        View viewFindViewById = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_target_mode_button);
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = (SparkScanViewTargetModeButton) viewFindViewById;
        sparkScanViewTargetModeButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.d(this.f37729a, view);
            }
        });
        SparkScanScanningMode scanningMode = stateManager.p();
        Intrinsics.j(scanningMode, "scanningMode");
        sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
        Intrinsics.i(viewFindViewById, "also(...)");
        this.f124128d = sparkScanViewTargetModeButton;
        View viewFindViewById2 = findViewById(com.scandit.datacapture.barcode.R.id.spark_capture_trigger_continuous_mode_button);
        ImageButton imageButton = (ImageButton) viewFindViewById2;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.e(this.f37730a, view);
            }
        });
        imageButton.setSelected(SparkScanScanningModeKt.getScanningBehavior(stateManager.p()) == SparkScanScanningBehavior.CONTINUOUS);
        Intrinsics.i(viewFindViewById2, "also(...)");
        this.f124127c = imageButton;
        View viewFindViewById3 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_barcode_count_button);
        ImageButton imageButton2 = (ImageButton) viewFindViewById3;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: Ut.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.f(this.f37731a, view);
            }
        });
        Intrinsics.i(viewFindViewById3, "also(...)");
        this.f124129e = imageButton2;
        View viewFindViewById4 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_barcode_find_button);
        ImageButton imageButton3 = (ImageButton) viewFindViewById4;
        imageButton3.setOnClickListener(new View.OnClickListener() { // from class: Ut.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.a(this.f37732a, view);
            }
        });
        Intrinsics.i(viewFindViewById4, "also(...)");
        this.f124130f = imageButton3;
        View viewFindViewById5 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_label_capture_button);
        ImageButton imageButton4 = (ImageButton) viewFindViewById5;
        imageButton4.setOnClickListener(new View.OnClickListener() { // from class: Ut.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.b(this.f37733a, view);
            }
        });
        Intrinsics.i(viewFindViewById5, "also(...)");
        this.f124131g = imageButton4;
        View viewFindViewById6 = findViewById(com.scandit.datacapture.barcode.R.id.spark_scan_camera_button);
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = (SparkScanViewCameraSwitchButton) viewFindViewById6;
        sparkScanViewCameraSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: Ut.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N.c(this.f37734a, view);
            }
        });
        CameraPosition cameraPosition = stateManager.a();
        Intrinsics.j(cameraPosition, "cameraPosition");
        sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
        FS.Resources_setImageResource(sparkScanViewCameraSwitchButton, com.scandit.datacapture.barcode.internal.module.spark.ui.button.a.f124023a[cameraPosition.ordinal()] == 1 ? com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_secondary : com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_primary);
        Intrinsics.i(viewFindViewById6, "also(...)");
        this.f124132h = sparkScanViewCameraSwitchButton;
        this.f124137m = CollectionsKt.p(sparkScanViewTargetModeButton, imageButton, imageButton2, imageButton3, sparkScanViewCameraSwitchButton, imageButton4);
        View viewFindViewById7 = findViewById(com.scandit.datacapture.barcode.R.id.trigger_gradient_right);
        Intrinsics.i(viewFindViewById7, "findViewById(...)");
        this.f124134j = viewFindViewById7;
        View viewFindViewById8 = findViewById(com.scandit.datacapture.barcode.R.id.trigger_gradient_left);
        Intrinsics.i(viewFindViewById8, "findViewById(...)");
        this.f124135k = viewFindViewById8;
        View viewFindViewById9 = findViewById(com.scandit.datacapture.barcode.R.id.external_button_separator);
        Intrinsics.i(viewFindViewById9, "findViewById(...)");
        this.f124133i = viewFindViewById9;
        View viewFindViewById10 = findViewById(com.scandit.datacapture.barcode.R.id.toolbar_scroll_view);
        Intrinsics.i(viewFindViewById10, "findViewById(...)");
        StartStopEventScrollView startStopEventScrollView = (StartStopEventScrollView) viewFindViewById10;
        this.f124136l = startStopEventScrollView;
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
        Integer num = (Integer) k10.getValue(this, f124124q[0]);
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
        List list = this.f124137m;
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
        this.f124130f.setImageTintList(b());
        this.f124129e.setImageTintList(b());
        this.f124131g.setImageTintList(b());
        this.f124132h.setImageTintList(a());
        this.f124127c.setImageTintList(a());
        this.f124128d.setImageTintList(a());
        View view = this.f124133i;
        Integer num = (Integer) this.f124140p.getValue(this, f124124q[2]);
        view.setBackgroundColor(num != null ? num.intValue() : getContext().getColor(com.scandit.datacapture.barcode.R.color.sc_spark_scan_default_toolbar_separator_color));
    }

    public final void e() {
        this.f124133i.setVisibility(((this.f124129e.getVisibility() == 0 || this.f124130f.getVisibility() == 0 || this.f124131g.getVisibility() == 0) && (this.f124128d.getVisibility() == 0 || this.f124127c.getVisibility() == 0 || this.f124132h.getVisibility() == 0)) ? 0 : 8);
    }

    public final void f() {
        this.f124127c.setSelected(SparkScanScanningModeKt.getScanningBehavior(this.f124125a.p()) == SparkScanScanningBehavior.CONTINUOUS);
        this.f124127c.setEnabled(!this.f124125a.h());
        SparkScanViewTargetModeButton sparkScanViewTargetModeButton = this.f124128d;
        SparkScanScanningMode scanningMode = this.f124125a.p();
        sparkScanViewTargetModeButton.getClass();
        Intrinsics.j(scanningMode, "scanningMode");
        sparkScanViewTargetModeButton.setSelected(scanningMode instanceof SparkScanScanningMode.Target);
        SparkScanViewCameraSwitchButton sparkScanViewCameraSwitchButton = this.f124132h;
        CameraPosition cameraPosition = this.f124125a.a();
        sparkScanViewCameraSwitchButton.getClass();
        Intrinsics.j(cameraPosition, "cameraPosition");
        sparkScanViewCameraSwitchButton.setSelected(cameraPosition == CameraPosition.USER_FACING);
        FS.Resources_setImageResource(sparkScanViewCameraSwitchButton, com.scandit.datacapture.barcode.internal.module.spark.ui.button.a.f124023a[cameraPosition.ordinal()] == 1 ? com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_secondary : com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_camera_primary);
        this.f124131g.setEnabled(!this.f124125a.h());
        this.f124130f.setEnabled(!this.f124125a.h());
        this.f124129e.setEnabled(!this.f124125a.h());
        this.f124136l.a(new I(this));
        this.f124136l.a(new J(this));
        a(this.f124136l.getScrollX());
    }

    public static final void b(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).C();
        }
    }

    public static final void a(N this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        A a10 = this$0.f124126b;
        if (a10 != null) {
            ((SparkScanViewPresenter) a10).y();
        }
    }

    public final void a(int i10) {
        float right = this.f124136l.getChildAt(0).getRight() - this.f124136l.getWidth();
        if (right > 0.0f) {
            float f10 = i10 / right;
            this.f124135k.setAlpha(f10);
            this.f124134j.setAlpha(1.0f - f10);
        } else {
            this.f124135k.setAlpha(0.0f);
            this.f124134j.setAlpha(0.0f);
        }
    }
}

package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class q extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final float f121562i = PixelExtensionsKt.pxFromDp$default(5.0f, (Context) null, 1, (Object) null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f121563j = Color.argb(77, 46, 193, 194);

    /* renamed from: k, reason: collision with root package name */
    public static final float f121564k = PixelExtensionsKt.pxFromDp$default(8.0f, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f121565a;

    /* renamed from: b, reason: collision with root package name */
    public final float f121566b;

    /* renamed from: c, reason: collision with root package name */
    public Path f121567c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f121568d;

    /* renamed from: e, reason: collision with root package name */
    public final PointF f121569e;

    /* renamed from: f, reason: collision with root package name */
    public float f121570f;

    /* renamed from: g, reason: collision with root package name */
    public F f121571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f121572h;

    @Override // android.view.View
    public final boolean performClick() {
        this.f121570f = 0.0f;
        this.f121569e.set(0.0f, 0.0f);
        invalidate();
        return super.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(f121563j);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f121564k);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f121565a = paint;
        this.f121566b = context.getResources().getDisplayMetrics().density;
        this.f121568d = new ArrayList();
        this.f121569e = new PointF();
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        Path path = this.f121567c;
        if (path != null) {
            canvas.drawPath(path, this.f121565a);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f121569e.set(event.getX(), event.getY());
            this.f121570f = 0.0f;
            if (!this.f121572h) {
                return super.onTouchEvent(event);
            }
            ArrayList arrayList = this.f121568d;
            float x10 = event.getX();
            float y10 = event.getY();
            float f10 = this.f121566b;
            arrayList.add(new Point(x10 / f10, y10 / f10));
            Path path = new Path();
            path.moveTo(event.getX(), event.getY());
            this.f121567c = path;
            F f11 = this.f121571g;
            if (f11 != null) {
                B b10 = (B) f11;
                NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditorBeginClusterEditing = b10.f121513b.beginClusterEditing();
                b10.f121516e = nativeBarcodeClusterLiveEditorBeginClusterEditing;
                if (nativeBarcodeClusterLiveEditorBeginClusterEditing != null) {
                    nativeBarcodeClusterLiveEditorBeginClusterEditing.beginFreehand();
                }
            }
        } else {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                this.f121570f = Math.max(this.f121570f, Math.max(Math.abs(event.getX() - this.f121569e.x), Math.abs(event.getY() - this.f121569e.y)));
                if (!this.f121572h) {
                    return super.onTouchEvent(event);
                }
                ArrayList arrayList2 = this.f121568d;
                float x11 = event.getX();
                float y11 = event.getY();
                float f12 = this.f121566b;
                arrayList2.add(new Point(x11 / f12, y11 / f12));
                Path path2 = this.f121567c;
                if (path2 != null) {
                    path2.lineTo(event.getX(), event.getY());
                }
                invalidate();
                return true;
            }
            if (this.f121570f < f121562i) {
                performClick();
            }
            Path path3 = this.f121567c;
            if (path3 != null) {
                path3.close();
                F f13 = this.f121571g;
                if (f13 != null) {
                    ArrayList points = this.f121568d;
                    B b11 = (B) f13;
                    Intrinsics.j(points, "points");
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor = b11.f121516e;
                    if (nativeBarcodeClusterLiveEditor != null) {
                        nativeBarcodeClusterLiveEditor.updateFreehand(CollectionsExtensionsKt.toArrayList(points));
                    }
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor2 = b11.f121516e;
                    if (nativeBarcodeClusterLiveEditor2 != null) {
                        nativeBarcodeClusterLiveEditor2.endFreehand();
                    }
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor3 = b11.f121516e;
                    if (nativeBarcodeClusterLiveEditor3 != null) {
                        nativeBarcodeClusterLiveEditor3.endEditing();
                    }
                    b11.f121516e = null;
                }
                this.f121567c = null;
                this.f121568d.clear();
                invalidate();
            }
        }
        return true;
    }
}

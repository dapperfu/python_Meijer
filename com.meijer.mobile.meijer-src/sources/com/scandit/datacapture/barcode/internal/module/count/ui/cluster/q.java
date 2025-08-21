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

/* loaded from: classes12.dex */
public final class q extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final float f122514i = PixelExtensionsKt.pxFromDp$default(5.0f, (Context) null, 1, (Object) null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f122515j = Color.argb(77, 46, 193, 194);

    /* renamed from: k, reason: collision with root package name */
    public static final float f122516k = PixelExtensionsKt.pxFromDp$default(8.0f, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122517a;

    /* renamed from: b, reason: collision with root package name */
    public final float f122518b;

    /* renamed from: c, reason: collision with root package name */
    public Path f122519c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f122520d;

    /* renamed from: e, reason: collision with root package name */
    public final PointF f122521e;

    /* renamed from: f, reason: collision with root package name */
    public float f122522f;

    /* renamed from: g, reason: collision with root package name */
    public F f122523g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f122524h;

    @Override // android.view.View
    public final boolean performClick() {
        this.f122522f = 0.0f;
        this.f122521e.set(0.0f, 0.0f);
        invalidate();
        return super.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(f122515j);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f122516k);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f122517a = paint;
        this.f122518b = context.getResources().getDisplayMetrics().density;
        this.f122520d = new ArrayList();
        this.f122521e = new PointF();
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        Path path = this.f122519c;
        if (path != null) {
            canvas.drawPath(path, this.f122517a);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f122521e.set(event.getX(), event.getY());
            this.f122522f = 0.0f;
            if (!this.f122524h) {
                return super.onTouchEvent(event);
            }
            ArrayList arrayList = this.f122520d;
            float x10 = event.getX();
            float y10 = event.getY();
            float f10 = this.f122518b;
            arrayList.add(new Point(x10 / f10, y10 / f10));
            Path path = new Path();
            path.moveTo(event.getX(), event.getY());
            this.f122519c = path;
            F f11 = this.f122523g;
            if (f11 != null) {
                B b10 = (B) f11;
                NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditorBeginClusterEditing = b10.f122465b.beginClusterEditing();
                b10.f122468e = nativeBarcodeClusterLiveEditorBeginClusterEditing;
                if (nativeBarcodeClusterLiveEditorBeginClusterEditing != null) {
                    nativeBarcodeClusterLiveEditorBeginClusterEditing.beginFreehand();
                }
            }
        } else {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                this.f122522f = Math.max(this.f122522f, Math.max(Math.abs(event.getX() - this.f122521e.x), Math.abs(event.getY() - this.f122521e.y)));
                if (!this.f122524h) {
                    return super.onTouchEvent(event);
                }
                ArrayList arrayList2 = this.f122520d;
                float x11 = event.getX();
                float y11 = event.getY();
                float f12 = this.f122518b;
                arrayList2.add(new Point(x11 / f12, y11 / f12));
                Path path2 = this.f122519c;
                if (path2 != null) {
                    path2.lineTo(event.getX(), event.getY());
                }
                invalidate();
                return true;
            }
            if (this.f122522f < f122514i) {
                performClick();
            }
            Path path3 = this.f122519c;
            if (path3 != null) {
                path3.close();
                F f13 = this.f122523g;
                if (f13 != null) {
                    ArrayList points = this.f122520d;
                    B b11 = (B) f13;
                    Intrinsics.j(points, "points");
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor = b11.f122468e;
                    if (nativeBarcodeClusterLiveEditor != null) {
                        nativeBarcodeClusterLiveEditor.updateFreehand(CollectionsExtensionsKt.toArrayList(points));
                    }
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor2 = b11.f122468e;
                    if (nativeBarcodeClusterLiveEditor2 != null) {
                        nativeBarcodeClusterLiveEditor2.endFreehand();
                    }
                    NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditor3 = b11.f122468e;
                    if (nativeBarcodeClusterLiveEditor3 != null) {
                        nativeBarcodeClusterLiveEditor3.endEditing();
                    }
                    b11.f122468e = null;
                }
                this.f122519c = null;
                this.f122520d.clear();
                invalidate();
            }
        }
        return true;
    }
}

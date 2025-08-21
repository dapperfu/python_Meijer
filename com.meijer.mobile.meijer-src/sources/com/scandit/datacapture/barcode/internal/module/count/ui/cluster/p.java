package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class p extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f122506h = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f122507a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f122508b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f122509c;

    /* renamed from: d, reason: collision with root package name */
    public final o f122510d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f122511e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122512f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f122513g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f122507a = CollectionsKt.m();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f122508b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(PixelExtensionsKt.pxFromDp(1.0f, context));
        this.f122509c = paint2;
        this.f122510d = new o(this);
        this.f122511e = LazyKt.b(new m(context, this));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        for (D d10 : this.f122507a) {
            int i10 = d10.f122478c;
            if (i10 != 0) {
                Path path = d10.f122480e;
                Paint paint = this.f122508b;
                paint.setColor(i10);
                Unit unit = Unit.f143329a;
                canvas.drawPath(path, paint);
                canvas.drawPath(path, this.f122509c);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((GestureDetector) this.f122511e.getValue()).onTouchEvent(event);
    }
}

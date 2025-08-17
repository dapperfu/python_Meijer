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

/* loaded from: classes11.dex */
public final class p extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f121554h = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f121555a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f121556b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f121557c;

    /* renamed from: d, reason: collision with root package name */
    public final o f121558d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f121559e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121560f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f121561g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f121555a = CollectionsKt.m();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f121556b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(PixelExtensionsKt.pxFromDp(1.0f, context));
        this.f121557c = paint2;
        this.f121558d = new o(this);
        this.f121559e = LazyKt.b(new m(context, this));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        for (D d10 : this.f121555a) {
            int i10 = d10.f121526c;
            if (i10 != 0) {
                Path path = d10.f121528e;
                Paint paint = this.f121556b;
                paint.setColor(i10);
                Unit unit = Unit.f142422a;
                canvas.drawPath(path, paint);
                canvas.drawPath(path, this.f121557c);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((GestureDetector) this.f121559e.getValue()).onTouchEvent(event);
    }
}

package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.DrawableExtensionsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f121538h = LazyKt.b(C13086b.f121530a);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f121539i = LazyKt.b(C13087c.f121531a);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f121540j = LazyKt.b(C13088d.f121532a);

    /* renamed from: k, reason: collision with root package name */
    public static final int f121541k = 1293030937;

    /* renamed from: a, reason: collision with root package name */
    public List f121542a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f121543b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f121544c;

    /* renamed from: d, reason: collision with root package name */
    public final i f121545d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f121546e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121547f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f121548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f121542a = CollectionsKt.m();
        this.f121543b = new Paint();
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(context, R.drawable.sc_ic_delete_clusters);
        if (drawableResources_getDrawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.i(drawableResources_getDrawable, "requireNotNull(...)");
        Bitmap bitmap = DrawableExtensionsKt.toBitmap(drawableResources_getDrawable);
        float fFloatValue = ((Number) f121539i.getValue()).floatValue();
        float fFloatValue2 = ((Number) f121540j.getValue()).floatValue();
        int i10 = f121541k;
        Intrinsics.j(bitmap, "<this>");
        Paint paint = new Paint();
        paint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
        paint.setColor(i10);
        float f10 = 2;
        float f11 = fFloatValue * f10;
        int iAbs = (int) ((Math.abs(0.0f) * f10) + bitmap.getWidth() + f11);
        int iAbs2 = (int) ((Math.abs(fFloatValue2) * f10) + bitmap.getHeight() + f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iAbs, iAbs2, Bitmap.Config.ARGB_8888);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawCircle(iAbs / 2.0f, iAbs2 / 2.0f, Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2.0f, paint);
        canvas.drawBitmap(bitmap, (iAbs - bitmap.getWidth()) / 2.0f, (iAbs2 - bitmap.getHeight()) / 2.0f, (Paint) null);
        FS.bitmap_recycle(bitmap);
        this.f121544c = bitmapCreateBitmap;
        this.f121545d = new i(this);
        this.f121546e = LazyKt.b(new g(context, this));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        for (D d10 : this.f121542a) {
            if (this.f121547f && d10.f121524a != null) {
                Point point = d10.f121527d;
                canvas.drawBitmap(this.f121544c, point.getX() - (this.f121544c.getWidth() / 2), point.getY() - (this.f121544c.getHeight() / 2), this.f121543b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        return ((GestureDetector) this.f121546e.getValue()).onTouchEvent(event);
    }
}

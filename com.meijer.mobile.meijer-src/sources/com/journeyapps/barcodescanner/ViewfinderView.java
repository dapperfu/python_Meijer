package com.journeyapps.barcodescanner;

import Gg.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.o;
import com.journeyapps.barcodescanner.CameraPreview;
import com.medallia.digital.mobilesdk.l3;
import gh.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ViewfinderView extends View {

    /* renamed from: n, reason: collision with root package name */
    protected static final int[] f91794n = {0, 64, 128, 192, l3.f93323c, 192, 128, 64};

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f91795a;

    /* renamed from: b, reason: collision with root package name */
    protected Bitmap f91796b;

    /* renamed from: c, reason: collision with root package name */
    protected int f91797c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f91798d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f91799e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f91800f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f91801g;

    /* renamed from: h, reason: collision with root package name */
    protected int f91802h;

    /* renamed from: i, reason: collision with root package name */
    protected List<o> f91803i;

    /* renamed from: j, reason: collision with root package name */
    protected List<o> f91804j;

    /* renamed from: k, reason: collision with root package name */
    protected CameraPreview f91805k;

    /* renamed from: l, reason: collision with root package name */
    protected Rect f91806l;

    /* renamed from: m, reason: collision with root package name */
    protected q f91807m;

    class a implements CameraPreview.f {
        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void b() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void c(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void e() {
        }

        a() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.f
        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }
    }

    public void a(o oVar) {
        if (this.f91803i.size() < 20) {
            this.f91803i.add(oVar);
        }
    }

    protected void b() {
        CameraPreview cameraPreview = this.f91805k;
        if (cameraPreview == null) {
            return;
        }
        Rect framingRect = cameraPreview.getFramingRect();
        q previewSize = this.f91805k.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f91806l = framingRect;
        this.f91807m = previewSize;
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f91805k = cameraPreview;
        cameraPreview.i(new a());
    }

    public void setLaserVisibility(boolean z10) {
        this.f91801g = z10;
    }

    public void setMaskColor(int i10) {
        this.f91797c = i10;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91795a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Gg.o.f12595n);
        this.f91797c = typedArrayObtainStyledAttributes.getColor(Gg.o.f12600s, resources.getColor(j.f12563d));
        this.f91798d = typedArrayObtainStyledAttributes.getColor(Gg.o.f12597p, resources.getColor(j.f12561b));
        this.f91799e = typedArrayObtainStyledAttributes.getColor(Gg.o.f12598q, resources.getColor(j.f12562c));
        this.f91800f = typedArrayObtainStyledAttributes.getColor(Gg.o.f12596o, resources.getColor(j.f12560a));
        this.f91801g = typedArrayObtainStyledAttributes.getBoolean(Gg.o.f12599r, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f91802h = 0;
        this.f91803i = new ArrayList(20);
        this.f91804j = new ArrayList(20);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        q qVar;
        int i10;
        b();
        Rect rect = this.f91806l;
        if (rect != null && (qVar = this.f91807m) != null) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f91795a;
            if (this.f91796b != null) {
                i10 = this.f91798d;
            } else {
                i10 = this.f91797c;
            }
            paint.setColor(i10);
            float f10 = width;
            canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f91795a);
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f91795a);
            canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f91795a);
            canvas.drawRect(0.0f, rect.bottom + 1, f10, height, this.f91795a);
            if (this.f91796b != null) {
                this.f91795a.setAlpha(160);
                canvas.drawBitmap(this.f91796b, (Rect) null, rect, this.f91795a);
                return;
            }
            if (this.f91801g) {
                this.f91795a.setColor(this.f91799e);
                Paint paint2 = this.f91795a;
                int[] iArr = f91794n;
                paint2.setAlpha(iArr[this.f91802h]);
                this.f91802h = (this.f91802h + 1) % iArr.length;
                int iHeight = (rect.height() / 2) + rect.top;
                canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.f91795a);
            }
            float width2 = getWidth() / qVar.f134232a;
            float height2 = getHeight() / qVar.f134233b;
            if (!this.f91804j.isEmpty()) {
                this.f91795a.setAlpha(80);
                this.f91795a.setColor(this.f91800f);
                for (o oVar : this.f91804j) {
                    canvas.drawCircle((int) (oVar.c() * width2), (int) (oVar.d() * height2), 3.0f, this.f91795a);
                }
                this.f91804j.clear();
            }
            if (!this.f91803i.isEmpty()) {
                this.f91795a.setAlpha(160);
                this.f91795a.setColor(this.f91800f);
                for (o oVar2 : this.f91803i) {
                    canvas.drawCircle((int) (oVar2.c() * width2), (int) (oVar2.d() * height2), 6.0f, this.f91795a);
                }
                List<o> list = this.f91803i;
                List<o> list2 = this.f91804j;
                this.f91803i = list2;
                this.f91804j = list;
                list2.clear();
            }
            postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }
}

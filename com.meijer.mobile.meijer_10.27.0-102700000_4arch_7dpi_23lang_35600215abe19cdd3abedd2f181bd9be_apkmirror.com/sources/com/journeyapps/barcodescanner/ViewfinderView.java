package com.journeyapps.barcodescanner;

import Eg.j;
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
import fh.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class ViewfinderView extends View {

    /* renamed from: n, reason: collision with root package name */
    protected static final int[] f90955n = {0, 64, 128, 192, l3.f92484c, 192, 128, 64};

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f90956a;

    /* renamed from: b, reason: collision with root package name */
    protected Bitmap f90957b;

    /* renamed from: c, reason: collision with root package name */
    protected int f90958c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f90959d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f90960e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f90961f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f90962g;

    /* renamed from: h, reason: collision with root package name */
    protected int f90963h;

    /* renamed from: i, reason: collision with root package name */
    protected List<o> f90964i;

    /* renamed from: j, reason: collision with root package name */
    protected List<o> f90965j;

    /* renamed from: k, reason: collision with root package name */
    protected CameraPreview f90966k;

    /* renamed from: l, reason: collision with root package name */
    protected Rect f90967l;

    /* renamed from: m, reason: collision with root package name */
    protected q f90968m;

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
        if (this.f90964i.size() < 20) {
            this.f90964i.add(oVar);
        }
    }

    protected void b() {
        CameraPreview cameraPreview = this.f90966k;
        if (cameraPreview == null) {
            return;
        }
        Rect framingRect = cameraPreview.getFramingRect();
        q previewSize = this.f90966k.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f90967l = framingRect;
        this.f90968m = previewSize;
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f90966k = cameraPreview;
        cameraPreview.i(new a());
    }

    public void setLaserVisibility(boolean z10) {
        this.f90962g = z10;
    }

    public void setMaskColor(int i10) {
        this.f90958c = i10;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90956a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Eg.o.f9043n);
        this.f90958c = typedArrayObtainStyledAttributes.getColor(Eg.o.f9048s, resources.getColor(j.f9011d));
        this.f90959d = typedArrayObtainStyledAttributes.getColor(Eg.o.f9045p, resources.getColor(j.f9009b));
        this.f90960e = typedArrayObtainStyledAttributes.getColor(Eg.o.f9046q, resources.getColor(j.f9010c));
        this.f90961f = typedArrayObtainStyledAttributes.getColor(Eg.o.f9044o, resources.getColor(j.f9008a));
        this.f90962g = typedArrayObtainStyledAttributes.getBoolean(Eg.o.f9047r, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f90963h = 0;
        this.f90964i = new ArrayList(20);
        this.f90965j = new ArrayList(20);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        q qVar;
        int i10;
        b();
        Rect rect = this.f90967l;
        if (rect != null && (qVar = this.f90968m) != null) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f90956a;
            if (this.f90957b != null) {
                i10 = this.f90959d;
            } else {
                i10 = this.f90958c;
            }
            paint.setColor(i10);
            float f10 = width;
            canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f90956a);
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f90956a);
            canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f90956a);
            canvas.drawRect(0.0f, rect.bottom + 1, f10, height, this.f90956a);
            if (this.f90957b != null) {
                this.f90956a.setAlpha(160);
                canvas.drawBitmap(this.f90957b, (Rect) null, rect, this.f90956a);
                return;
            }
            if (this.f90962g) {
                this.f90956a.setColor(this.f90960e);
                Paint paint2 = this.f90956a;
                int[] iArr = f90955n;
                paint2.setAlpha(iArr[this.f90963h]);
                this.f90963h = (this.f90963h + 1) % iArr.length;
                int iHeight = (rect.height() / 2) + rect.top;
                canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.f90956a);
            }
            float width2 = getWidth() / qVar.f131133a;
            float height2 = getHeight() / qVar.f131134b;
            if (!this.f90965j.isEmpty()) {
                this.f90956a.setAlpha(80);
                this.f90956a.setColor(this.f90961f);
                for (o oVar : this.f90965j) {
                    canvas.drawCircle((int) (oVar.c() * width2), (int) (oVar.d() * height2), 3.0f, this.f90956a);
                }
                this.f90965j.clear();
            }
            if (!this.f90964i.isEmpty()) {
                this.f90956a.setAlpha(160);
                this.f90956a.setColor(this.f90961f);
                for (o oVar2 : this.f90964i) {
                    canvas.drawCircle((int) (oVar2.c() * width2), (int) (oVar2.d() * height2), 6.0f, this.f90956a);
                }
                List<o> list = this.f90964i;
                List<o> list2 = this.f90965j;
                this.f90964i = list2;
                this.f90965j = list;
                list2.clear();
            }
            postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }
}

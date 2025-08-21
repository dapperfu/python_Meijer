package dn;

import Z1.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.meijer.mobile.meijer.Q;

/* renamed from: dn.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC13706a extends l.e {

    /* renamed from: d, reason: collision with root package name */
    private Paint f128720d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f128721e;

    /* renamed from: f, reason: collision with root package name */
    private final int f128722f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f128723g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f128724h;

    public AbstractC13706a(Context context, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint();
        this.f128720d = paint;
        paint.setColor(b.c(context, i12));
        Paint paint2 = new Paint();
        this.f128721e = paint2;
        paint2.setColor(b.c(context, i13));
        this.f128722f = context.getResources().getDimensionPixelOffset(Q.f99513b);
        this.f128723g = BitmapFactory.decodeResource(context.getResources(), i10);
        this.f128724h = BitmapFactory.decodeResource(context.getResources(), i11);
    }

    protected abstract void C(View view, boolean z10);

    @Override // androidx.recyclerview.widget.l.e
    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
        View view = f10.itemView;
        if (i10 != 1) {
            if (i10 == 2) {
                super.u(canvas, recyclerView, f10, f11, f12, i10, z10);
                if (z10) {
                    C(f10.itemView, true);
                    return;
                }
                return;
            }
            return;
        }
        view.setAlpha(1.0f - Math.abs(f11 / view.getWidth()));
        if (f11 > 0.0f) {
            float height = (view.getHeight() - this.f128723g.getHeight()) / 2;
            canvas.drawRect(view.getLeft(), view.getTop(), f11, view.getBottom(), this.f128720d);
            canvas.drawBitmap(this.f128723g, this.f128722f, view.getTop() + height, (Paint) null);
        } else {
            float height2 = (view.getHeight() - this.f128724h.getHeight()) / 2;
            canvas.drawRect(view.getRight() + f11, view.getTop(), view.getRight(), view.getBottom(), this.f128721e);
            canvas.drawBitmap(this.f128724h, (view.getRight() - this.f128724h.getWidth()) - this.f128722f, view.getTop() + height2, (Paint) null);
        }
        super.u(canvas, recyclerView, f10, f11, f12, i10, z10);
    }

    @Override // androidx.recyclerview.widget.l.e
    public void c(RecyclerView recyclerView, RecyclerView.F f10) {
        super.c(recyclerView, f10);
        f10.itemView.setAlpha(1.0f);
        C(f10.itemView, false);
    }

    public AbstractC13706a(Context context, int i10, int i11) {
        this(context, i10, i10, i11, i11);
    }
}

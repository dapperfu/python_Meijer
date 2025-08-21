package Fn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public class j extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f10777a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f10778a;

        /* renamed from: b, reason: collision with root package name */
        private int f10779b;

        /* renamed from: c, reason: collision with root package name */
        private Context f10780c;

        public j d() {
            return new j(this);
        }

        public a e(int i10) {
            this.f10778a = i10;
            return this;
        }

        public a(Context context) {
            this.f10780c = context;
        }
    }

    private j(a aVar) {
        Paint paint = new Paint();
        this.f10777a = paint;
        paint.setColor(Z1.b.c(aVar.f10780c, aVar.f10778a));
        paint.setStrokeWidth(aVar.f10779b);
    }

    protected void f(Canvas canvas, RecyclerView recyclerView, int i10, int i11, int i12) {
        View childAt = recyclerView.getChildAt(i10);
        float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).bottomMargin;
        canvas.drawLine(i11, bottom, i12, bottom, this.f10777a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f(canvas, recyclerView, i10, paddingLeft, width);
        }
    }
}

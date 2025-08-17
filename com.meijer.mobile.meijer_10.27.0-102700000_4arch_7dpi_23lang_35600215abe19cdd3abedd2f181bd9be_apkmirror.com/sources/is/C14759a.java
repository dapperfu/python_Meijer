package is;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;

/* renamed from: is.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C14759a extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f138466d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f138467a;

    /* renamed from: b, reason: collision with root package name */
    private int f138468b;

    /* renamed from: c, reason: collision with root package name */
    private int f138469c;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f138468b == 1) {
            rect.set(0, 0, 0, this.f138467a.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f138467a.getIntrinsicWidth(), 0);
        }
    }

    public void h(Drawable drawable) {
        this.f138467a = drawable;
    }

    public void i(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.f138468b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f138468b == 1) {
            g(canvas, recyclerView);
        } else {
            f(canvas, recyclerView);
        }
    }

    public C14759a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f138466d);
        this.f138467a = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 0);
        typedArrayObtainStyledAttributes.recycle();
        i(i10);
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).rightMargin;
            this.f138467a.setBounds(right, paddingTop, this.f138467a.getIntrinsicHeight() + right, height);
            this.f138467a.draw(canvas);
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int i10 = this.f138469c;
        if (i10 > 0) {
            paddingLeft += i10;
            width -= i10;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).bottomMargin;
            this.f138467a.setBounds(paddingLeft, bottom, width, this.f138467a.getIntrinsicHeight() + bottom);
            this.f138467a.draw(canvas);
        }
    }
}

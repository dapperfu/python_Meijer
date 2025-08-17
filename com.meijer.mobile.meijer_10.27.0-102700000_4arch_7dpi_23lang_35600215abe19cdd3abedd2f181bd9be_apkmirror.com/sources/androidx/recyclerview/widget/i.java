package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class i extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f58168d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f58169a;

    /* renamed from: b, reason: collision with root package name */
    private int f58170b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f58171c = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        Drawable drawable = this.f58169a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f58170b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void h(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f58169a = drawable;
    }

    public void i(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f58170b = i10;
    }

    @SuppressLint({"UnknownNullness"})
    public i(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f58168d);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 0);
        this.f58169a = drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 == null) {
            FS.log_w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        i(i10);
    }

    private void f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().h0(childAt, this.f58171c);
            int iRound = this.f58171c.right + Math.round(childAt.getTranslationX());
            this.f58169a.setBounds(iRound - this.f58169a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f58169a.draw(canvas);
        }
        canvas.restore();
    }

    private void g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f58171c);
            int iRound = this.f58171c.bottom + Math.round(childAt.getTranslationY());
            this.f58169a.setBounds(paddingLeft, iRound - this.f58169a.getIntrinsicHeight(), width, iRound);
            this.f58169a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (recyclerView.getLayoutManager() != null && this.f58169a != null) {
            if (this.f58170b == 1) {
                g(canvas, recyclerView);
            } else {
                f(canvas, recyclerView);
            }
        }
    }
}

package is;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: is.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C14848b extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private int f139116a;

    /* renamed from: b, reason: collision with root package name */
    private int f139117b;

    /* renamed from: c, reason: collision with root package name */
    private int f139118c;

    /* renamed from: d, reason: collision with root package name */
    private int f139119d;

    /* renamed from: e, reason: collision with root package name */
    public final int f139120e;

    public C14848b(int i10, int i11, int i12) {
        this(i10, i11, i12, 1);
    }

    public void f(int i10) {
        float f10 = i10 * 0.5f;
        this.f139116a = (int) (0.5f + f10);
        this.f139117b = (int) f10;
    }

    public C14848b(int i10, int i11, int i12, int i13) {
        if (i13 != 1 && i13 != 0) {
            throw new IllegalArgumentException("Invalid orientation for spacing decoration.");
        }
        this.f139118c = i11;
        this.f139119d = i12;
        f(i10);
        this.f139120e = i13;
    }

    public void g(int i10) {
        this.f139118c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        int i10;
        int i11;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition == 0) {
            i10 = this.f139118c;
        } else {
            i10 = this.f139116a;
        }
        if (childLayoutPosition < recyclerView.getAdapter().getItemCount() - 1) {
            i11 = this.f139117b;
        } else {
            i11 = this.f139119d;
        }
        if (this.f139120e == 1) {
            rect.set(0, i10, 0, i11);
        } else {
            rect.set(i10, 0, i11, 0);
        }
    }
}

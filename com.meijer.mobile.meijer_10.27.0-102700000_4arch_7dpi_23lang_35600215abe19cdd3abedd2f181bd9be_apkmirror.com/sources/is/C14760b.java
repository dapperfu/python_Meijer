package is;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: is.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C14760b extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private int f138470a;

    /* renamed from: b, reason: collision with root package name */
    private int f138471b;

    /* renamed from: c, reason: collision with root package name */
    private int f138472c;

    /* renamed from: d, reason: collision with root package name */
    private int f138473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f138474e;

    public C14760b(int i10, int i11, int i12) {
        this(i10, i11, i12, 1);
    }

    public void f(int i10) {
        float f10 = i10 * 0.5f;
        this.f138470a = (int) (0.5f + f10);
        this.f138471b = (int) f10;
    }

    public C14760b(int i10, int i11, int i12, int i13) {
        if (i13 != 1 && i13 != 0) {
            throw new IllegalArgumentException("Invalid orientation for spacing decoration.");
        }
        this.f138472c = i11;
        this.f138473d = i12;
        f(i10);
        this.f138474e = i13;
    }

    public void g(int i10) {
        this.f138472c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        int i10;
        int i11;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition == 0) {
            i10 = this.f138472c;
        } else {
            i10 = this.f138470a;
        }
        if (childLayoutPosition < recyclerView.getAdapter().getItemCount() - 1) {
            i11 = this.f138471b;
        } else {
            i11 = this.f138473d;
        }
        if (this.f138474e == 1) {
            rect.set(0, i10, 0, i11);
        } else {
            rect.set(i10, 0, i11, 0);
        }
    }
}

package Km;

import Ur.d;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%¨\u0006'"}, d2 = {"LKm/b;", "Landroidx/recyclerview/widget/RecyclerView$o;", "<init>", "()V", "", "position", "", "i", "(I)Z", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "g", "(Landroidx/recyclerview/widget/RecyclerView;)I", "LUr/d$m;", "newSection", "", "j", "(Landroidx/recyclerview/widget/RecyclerView;LUr/d$m;)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView$B;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$B;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$B;)V", "LUr/d$k;", "a", "LUr/d$k;", "holder", "b", "Landroid/view/View;", "header", "LUr/d$m;", "section", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d.k holder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View header;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d.Section section;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h() {
        return 0;
    }

    private final boolean i(int position) {
        return position == 0 || position == 4 || position == 8;
    }

    private final void j(RecyclerView parent, d.Section newSection) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (Intrinsics.e(newSection, this.section)) {
            return;
        }
        RecyclerView.h adapter = parent.getAdapter();
        Ur.d dVar = adapter instanceof Ur.d ? (Ur.d) adapter : null;
        if (dVar == null) {
            return;
        }
        int iP = dVar.p(this.section);
        if (iP == -1) {
            this.holder = null;
            this.header = null;
            this.section = null;
            return;
        }
        if (this.holder == null && !Intrinsics.e(this.section, newSection)) {
            RecyclerView.F fCreateViewHolder = dVar.createViewHolder(parent, dVar.getItemViewType(iP));
            d.i iVar = fCreateViewHolder instanceof d.i ? (d.i) fCreateViewHolder : null;
            this.holder = iVar;
            this.header = iVar != null ? iVar.itemView : null;
            if (iVar != null) {
                dVar.bindViewHolder(iVar, iP);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
            int paddingLeft = parent.getPaddingLeft() + parent.getPaddingRight();
            View view = this.header;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, paddingLeft, (view == null || (layoutParams2 = view.getLayoutParams()) == null) ? 0 : layoutParams2.width);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0);
            int paddingTop = parent.getPaddingTop() + parent.getPaddingBottom();
            View view2 = this.header;
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, paddingTop, (view2 == null || (layoutParams = view2.getLayoutParams()) == null) ? 0 : layoutParams.height);
            View view3 = this.header;
            if (view3 != null) {
                view3.measure(childMeasureSpec, childMeasureSpec2);
            }
            View view4 = this.header;
            if (view4 != null) {
                int measuredWidth = view4 != null ? view4.getMeasuredWidth() : 0;
                View view5 = this.header;
                view4.layout(0, 0, measuredWidth, view5 != null ? view5.getMeasuredHeight() : 0);
            }
        }
        this.section = newSection;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getItemOffsets(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.B r7) {
        /*
            r3 = this;
            java.lang.String r0 = "outRect"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.j(r5, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            int r5 = r6.getChildAdapterPosition(r5)
            r7 = -1
            r0 = 0
            if (r5 != r7) goto L20
            r3.j(r6, r0)
            return
        L20:
            boolean r7 = r3.i(r5)
            if (r7 == 0) goto L2b
            r5 = 0
            r4.set(r5, r5, r5, r5)
            return
        L2b:
            androidx.recyclerview.widget.RecyclerView$h r4 = r6.getAdapter()
            boolean r7 = r4 instanceof Ur.d
            if (r7 == 0) goto L36
            Ur.d r4 = (Ur.d) r4
            goto L37
        L36:
            r4 = r0
        L37:
            if (r4 == 0) goto L3e
            Ur.d$j r4 = r4.o(r5)
            goto L3f
        L3e:
            r4 = r0
        L3f:
            if (r4 == 0) goto L7b
            boolean r7 = r4.f()
            r1 = 1
            if (r7 != r1) goto L7b
            androidx.recyclerview.widget.RecyclerView$h r7 = r6.getAdapter()
            if (r7 == 0) goto L57
            int r7 = r7.getTotalNumberOfTabs()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L58
        L57:
            r7 = r0
        L58:
            Km.a r2 = new Km.a
            r2.<init>()
            int r7 = yk.C18328d.b(r7, r2)
            if (r7 <= r1) goto L7b
            androidx.recyclerview.widget.RecyclerView$h r4 = r6.getAdapter()
            boolean r7 = r4 instanceof Ur.d
            if (r7 == 0) goto L6e
            Ur.d r4 = (Ur.d) r4
            goto L6f
        L6e:
            r4 = r0
        L6f:
            if (r4 == 0) goto L7f
            int r5 = r5 + r1
            Ur.d$j r4 = r4.o(r5)
            if (r4 == 0) goto L7f
            Ur.d$m r0 = r4.section
            goto L7f
        L7b:
            if (r4 == 0) goto L7f
            Ur.d$m r0 = r4.section
        L7f:
            Ur.d$m r4 = r3.section
            if (r0 == r4) goto L86
            r3.j(r6, r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Km.b.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$B):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas c10, RecyclerView parent, RecyclerView.B state) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(parent, "parent");
        Intrinsics.j(state, "state");
        View view = this.header;
        if (view != null) {
            float fG = g(parent);
            int iSave = c10.save();
            c10.translate(0.0f, fG);
            try {
                view.draw(c10);
            } finally {
                c10.restoreToCount(iSave);
            }
        }
    }

    private final int g(RecyclerView parent) {
        d.k kVar;
        int height;
        int childCount = parent.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = parent.getChildAt(i10);
            RecyclerView.F childViewHolder = parent.getChildViewHolder(childAt);
            if (childViewHolder instanceof d.k) {
                kVar = (d.k) childViewHolder;
            } else {
                kVar = null;
            }
            if (kVar != null && !Intrinsics.e(kVar.c().section, this.section) && kVar.c().section != null) {
                int top = childAt.getTop();
                View view = this.header;
                if (view != null) {
                    height = view.getHeight();
                } else {
                    height = 0;
                }
                if (top < height) {
                    return top - height;
                }
            } else {
                i10++;
            }
        }
        return 0;
    }
}

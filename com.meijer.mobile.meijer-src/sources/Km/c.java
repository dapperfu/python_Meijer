package Km;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006+"}, d2 = {"LKm/c;", "Landroidx/recyclerview/widget/l$e;", "Landroid/content/Context;", "context", "", "backgroundColorResourceId", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$F;", "viewHolder", "", "dX", "dY", "actionState", "", "isCurrentlyActive", "", "u", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$F;FFIZ)V", "target", "y", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$F;Landroidx/recyclerview/widget/RecyclerView$F;)Z", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "paintText", "e", "paintBackground", "f", "I", "pad", "g", "margin", "", "h", "Ljava/lang/String;", "textNot", "i", "textInterested", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class c extends l.e {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Paint paintText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Paint paintBackground;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int pad;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int margin;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String textNot;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String textInterested;

    @Override // androidx.recyclerview.widget.l.e
    public boolean y(RecyclerView recyclerView, RecyclerView.F viewHolder, RecyclerView.F target) {
        Intrinsics.j(recyclerView, "recyclerView");
        Intrinsics.j(viewHolder, "viewHolder");
        Intrinsics.j(target, "target");
        return false;
    }

    public c(Context context, int i10) {
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        this.paintText = paint;
        Paint paint2 = new Paint();
        this.paintBackground = paint2;
        paint.setColor(Z1.b.c(context, P.f99511g));
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setTextSize(context.getResources().getDimensionPixelSize(Q.f99518g));
        paint.setAntiAlias(true);
        paint2.setColor(Z1.b.c(context, i10));
        this.pad = context.getResources().getDimensionPixelOffset(Q.f99513b);
        this.margin = context.getResources().getDimensionPixelOffset(Q.f99519h);
        String string = context.getString(Nr.g.f22673X);
        Intrinsics.i(string, "getString(...)");
        String strSubstring = string.substring(0, StringsKt.p0(string, ' ', 0, false, 6, null));
        Intrinsics.i(strSubstring, "substring(...)");
        this.textNot = strSubstring;
        String strSubstring2 = string.substring(StringsKt.p0(string, ' ', 0, false, 6, null) + 1);
        Intrinsics.i(strSubstring2, "substring(...)");
        this.textInterested = strSubstring2;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void u(Canvas c10, RecyclerView recyclerView, RecyclerView.F viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(recyclerView, "recyclerView");
        Intrinsics.j(viewHolder, "viewHolder");
        View itemView = viewHolder.itemView;
        Intrinsics.i(itemView, "itemView");
        if (actionState == 1) {
            itemView.setAlpha(1 - Math.abs(dX / itemView.getWidth()));
            Rect rect = new Rect();
            Paint paint = this.paintText;
            String str = this.textInterested;
            paint.getTextBounds(str, 0, str.length(), rect);
            Rect rect2 = new Rect();
            Paint paint2 = this.paintText;
            String str2 = this.textNot;
            paint2.getTextBounds(str2, 0, str2.length(), rect2);
            int top = itemView.getTop() + (itemView.getHeight() / 2);
            if (dX > 0.0f) {
                c10.drawRect(itemView.getLeft(), itemView.getTop(), dX, itemView.getBottom(), this.paintBackground);
                c10.drawText(this.textNot, (this.pad + (rect.width() / 2)) - (rect2.width() / 2), top, this.paintText);
                c10.drawText(this.textInterested, this.pad, top + rect.height() + this.margin, this.paintText);
            } else {
                c10.drawRect(itemView.getRight() + dX, itemView.getTop(), itemView.getRight(), itemView.getBottom(), this.paintBackground);
                c10.drawText(this.textNot, (((itemView.getRight() - rect.width()) - this.pad) + (rect.width() / 2)) - (rect2.width() / 2), top, this.paintText);
                c10.drawText(this.textInterested, (itemView.getRight() - rect.width()) - this.pad, top + rect.height() + this.margin, this.paintText);
            }
            super.u(c10, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        }
    }
}

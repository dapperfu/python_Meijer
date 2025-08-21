package androidx.constraintlayout.widget;

import V1.e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f53346a;

    /* renamed from: b, reason: collision with root package name */
    private View f53347b;

    /* renamed from: c, reason: collision with root package name */
    private int f53348c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f53347b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f53347b.getLayoutParams();
        bVar2.f53309n0.D0(0);
        e.b bVarY = bVar.f53309n0.y();
        e.b bVar3 = e.b.FIXED;
        if (bVarY != bVar3) {
            bVar.f53309n0.E0(bVar2.f53309n0.P());
        }
        if (bVar.f53309n0.M() != bVar3) {
            bVar.f53309n0.h0(bVar2.f53309n0.v());
        }
        bVar2.f53309n0.D0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f53346a == -1 && !isInEditMode()) {
            setVisibility(this.f53348c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f53346a);
        this.f53347b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f53285b0 = true;
            this.f53347b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f53347b;
    }

    public int getEmptyVisibility() {
        return this.f53348c;
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f53346a == i10) {
            return;
        }
        View view = this.f53347b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f53347b.getLayoutParams()).f53285b0 = false;
            this.f53347b = null;
        }
        this.f53346a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f53348c = i10;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(l3.f93323c, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(FS.typefaceCreateDerived(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }
}

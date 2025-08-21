package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5767a extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f47173a;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    private static class C0971a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f47173a;
        if (actionBarContainer.f46601h) {
            Drawable drawable = actionBarContainer.f46600g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f46598e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f47173a;
        Drawable drawable3 = actionBarContainer2.f46599f;
        if (drawable3 == null || !actionBarContainer2.f46602i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f47173a;
        if (actionBarContainer.f46601h) {
            if (actionBarContainer.f46600g != null) {
                C0971a.a(actionBarContainer.f46598e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f46598e;
            if (drawable != null) {
                C0971a.a(drawable, outline);
            }
        }
    }

    public C5767a(ActionBarContainer actionBarContainer) {
        this.f47173a = actionBarContainer;
    }
}

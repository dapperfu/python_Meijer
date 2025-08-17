package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5625a extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f46949a;

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
    private static class C0958a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f46949a;
        if (actionBarContainer.f46377h) {
            Drawable drawable = actionBarContainer.f46376g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f46374e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f46949a;
        Drawable drawable3 = actionBarContainer2.f46375f;
        if (drawable3 == null || !actionBarContainer2.f46378i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f46949a;
        if (actionBarContainer.f46377h) {
            if (actionBarContainer.f46376g != null) {
                C0958a.a(actionBarContainer.f46374e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f46374e;
            if (drawable != null) {
                C0958a.a(drawable, outline);
            }
        }
    }

    public C5625a(ActionBarContainer actionBarContainer) {
        this.f46949a = actionBarContainer;
    }
}

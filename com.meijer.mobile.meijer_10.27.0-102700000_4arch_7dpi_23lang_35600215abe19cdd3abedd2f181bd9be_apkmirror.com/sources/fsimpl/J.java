package fsimpl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.fullstory.FS;

/* loaded from: classes14.dex */
public class J extends EdgeEffect {
    public J(Context context) {
        super(context);
    }

    public J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.EdgeEffect
    public boolean draw(Canvas canvas) {
        if (FS.isFullStoryCanvas(canvas)) {
            return false;
        }
        return super.draw(canvas);
    }
}

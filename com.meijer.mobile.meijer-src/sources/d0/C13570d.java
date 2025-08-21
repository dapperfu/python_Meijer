package d0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.fullstory.FS;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ld0/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;", "edgeEffect", "", "deltaDistance", "displacement", "c", "(Landroid/widget/EdgeEffect;FF)F", "b", "(Landroid/widget/EdgeEffect;)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13570d {

    /* renamed from: a, reason: collision with root package name */
    public static final C13570d f127749a = new C13570d();

    public final EdgeEffect a(Context context, AttributeSet attrs) {
        try {
            return FS.maybeWrapEdgeEffect(new EdgeEffect(context, attrs), context, attrs);
        } catch (Throwable unused) {
            return FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        }
    }

    private C13570d() {
    }

    public final float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        try {
            return edgeEffect.onPullDistance(deltaDistance, displacement);
        } catch (Throwable unused) {
            edgeEffect.onPull(deltaDistance, displacement);
            return 0.0f;
        }
    }
}

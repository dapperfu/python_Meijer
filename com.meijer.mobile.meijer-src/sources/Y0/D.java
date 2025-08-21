package Y0;

import V0.Q;
import V0.q1;
import android.graphics.Outline;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LY0/D;", "", "<init>", "()V", "Landroid/graphics/Outline;", "outline", "LV0/q1;", "path", "", "a", "(Landroid/graphics/Outline;LV0/q1;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f42770a = new D();

    public final void a(Outline outline, q1 path) {
        if (!(path instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((Q) path).getInternalPath());
    }

    private D() {
    }
}

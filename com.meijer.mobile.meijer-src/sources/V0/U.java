package V0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LV0/U;", "LV0/t1;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "LV0/q1;", "destination", "", "startWithMoveTo", "b", "(FFLV0/q1;Z)Z", "path", "forceClosed", "", "a", "(LV0/q1;Z)V", "Landroid/graphics/PathMeasure;", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class U implements t1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PathMeasure internalPathMeasure;

    @Override // V0.t1
    public void a(q1 path, boolean forceClosed) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof Q)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((Q) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, forceClosed);
    }

    @Override // V0.t1
    public boolean b(float startDistance, float stopDistance, q1 destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof Q) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((Q) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // V0.t1
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    public U(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }
}

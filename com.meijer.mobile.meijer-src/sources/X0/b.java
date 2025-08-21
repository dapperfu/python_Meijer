package X0;

import V0.C5468i1;
import V0.q1;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX0/d;", "LX0/h;", "b", "(LX0/d;)LX0/h;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ:\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"X0/b$a", "LX0/h;", "", "left", "top", "right", "bottom", "", "j", "(FFFF)V", "Landroidx/compose/ui/graphics/b;", "clipOp", "c", "(FFFFI)V", "LV0/q1;", "path", "e", "(LV0/q1;I)V", "d", "(FF)V", "degrees", "LU0/f;", "pivot", "g", "(FJ)V", "scaleX", "scaleY", "f", "(FFJ)V", "LV0/k1;", "matrix", "a", "([F)V", "LU0/k;", "b", "()J", "size", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f41487a;

        a(d dVar) {
            this.f41487a = dVar;
        }

        @Override // X0.h
        public void a(float[] matrix) {
            this.f41487a.g().u(matrix);
        }

        @Override // X0.h
        public long b() {
            return this.f41487a.b();
        }

        @Override // X0.h
        public void c(float left, float top, float right, float bottom, int clipOp) {
            this.f41487a.g().c(left, top, right, bottom, clipOp);
        }

        @Override // X0.h
        public void d(float left, float top) {
            this.f41487a.g().d(left, top);
        }

        @Override // X0.h
        public void e(q1 path, int clipOp) {
            this.f41487a.g().e(path, clipOp);
        }

        @Override // X0.h
        public void f(float scaleX, float scaleY, long pivot) {
            Canvas canvasG = this.f41487a.g();
            int i10 = (int) (pivot >> 32);
            int i11 = (int) (pivot & 4294967295L);
            canvasG.d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            canvasG.a(scaleX, scaleY);
            canvasG.d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // X0.h
        public void g(float degrees, long pivot) {
            Canvas canvasG = this.f41487a.g();
            int i10 = (int) (pivot >> 32);
            int i11 = (int) (pivot & 4294967295L);
            canvasG.d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            canvasG.p(degrees);
            canvasG.d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // X0.h
        public void j(float left, float top, float right, float bottom) {
            Canvas canvasG = this.f41487a.g();
            d dVar = this.f41487a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32)) - (right + left);
            long jD = U0.k.d((Float.floatToRawIntBits(Float.intBitsToFloat((int) (b() & 4294967295L)) - (bottom + top)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            if (!(Float.intBitsToFloat((int) (jD >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jD & 4294967295L)) >= 0.0f)) {
                C5468i1.a("Width and height must be greater than or equal to zero");
            }
            dVar.h(jD);
            canvasG.d(left, top);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}

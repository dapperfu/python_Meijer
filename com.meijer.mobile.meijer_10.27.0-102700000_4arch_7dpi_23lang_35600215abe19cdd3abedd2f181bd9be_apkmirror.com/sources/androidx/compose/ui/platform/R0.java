package androidx.compose.ui.platform;

import U0.MutableRect;
import V0.C5331k1;
import V0.C5334l1;
import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cRD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001c\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001c\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/R0;", "T", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "Landroid/graphics/Matrix;", "matrix", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "h", "()V", "c", "LV0/k1;", "b", "(Ljava/lang/Object;)[F", "a", "LU0/d;", "rect", "d", "(Ljava/lang/Object;LU0/d;)V", "f", "LU0/f;", "offset", "e", "(Ljava/lang/Object;J)J", "g", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/Matrix;", "androidMatrixCache", "[F", "matrixCache", "inverseMatrixCache", "", "Z", "isDirty", "isInverseDirty", "isInverseValid", "isIdentity", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class R0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, Matrix, Unit> getMatrix;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Matrix androidMatrixCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseDirty;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float[] matrixCache = C5331k1.c(null, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache = C5331k1.c(null, 1, null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseValid = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isIdentity = true;

    public final void c() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void h() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        C5331k1.h(this.matrixCache);
        C5331k1.h(this.inverseMatrixCache);
    }

    public final float[] a(T target) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = P0.a(b(target), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T target) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        V0.N.b(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = C5334l1.a(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public R0(Function2<? super T, ? super Matrix, Unit> function2) {
        this.getMatrix = function2;
    }

    public final void d(T target, MutableRect rect) {
        float[] fArrB = b(target);
        if (!this.isIdentity) {
            C5331k1.g(fArrB, rect);
        }
    }

    public final long e(T target, long offset) {
        float[] fArrB = b(target);
        if (!this.isIdentity) {
            return C5331k1.f(fArrB, offset);
        }
        return offset;
    }

    public final void f(T target, MutableRect rect) {
        float[] fArrA = a(target);
        if (fArrA == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else if (!this.isIdentity) {
            C5331k1.g(fArrA, rect);
        }
    }

    public final long g(T target, long offset) {
        float[] fArrA = a(target);
        if (fArrA == null) {
            return U0.f.INSTANCE.a();
        }
        if (!this.isIdentity) {
            return C5331k1.f(fArrA, offset);
        }
        return offset;
    }
}

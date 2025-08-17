package kotlin;

import android.os.Build;
import android.view.ViewConfiguration;
import g1.C14185q;
import g1.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lf0/d;", "Lf0/C;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "LH1/d;", "Lg1/q;", "event", "LH1/r;", "bounds", "LU0/f;", "b", "(LH1/d;Lg1/q;J)J", "a", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13805d implements InterfaceC13785C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    @Override // kotlin.InterfaceC13785C
    public long b(H1.d dVar, C14185q c14185q, long j10) {
        int i10 = Build.VERSION.SDK_INT;
        float f10 = -(i10 > 26 ? C13801T.f130301a.b(this.viewConfiguration) : dVar.I1(H1.h.p(64)));
        float f11 = -(i10 > 26 ? C13801T.f130301a.a(this.viewConfiguration) : dVar.I1(H1.h.p(64)));
        List<PointerInputChange> listC = c14185q.c();
        U0.f fVarD = U0.f.d(U0.f.INSTANCE.c());
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            fVarD = U0.f.d(U0.f.q(fVarD.getPackedValue(), listC.get(i11).getScrollDelta()));
        }
        long packedValue = fVarD.getPackedValue();
        return U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (packedValue >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (packedValue & 4294967295L)) * f10) & 4294967295L));
    }

    public C13805d(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }
}

package I4;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: I4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3828i implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    private Rect f14237a;

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
        int i11 = rect.top + ((int) ((rect2.top - r1) * f10));
        int i12 = rect.right + ((int) ((rect2.right - r2) * f10));
        int i13 = rect.bottom + ((int) ((rect2.bottom - r6) * f10));
        Rect rect3 = this.f14237a;
        if (rect3 == null) {
            return new Rect(i10, i11, i12, i13);
        }
        rect3.set(i10, i11, i12, i13);
        return this.f14237a;
    }

    C3828i() {
    }
}

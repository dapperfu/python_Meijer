package kotlin;

import U0.f;
import g1.C14314q;
import g1.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg1/q;", "", "d", "(Lg1/q;)F", "LU0/f;", "c", "(Lg1/q;)J", "", "useCurrent", "b", "(Lg1/q;Z)F", "a", "(Lg1/q;Z)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13909Q {
    public static final long c(C14314q c14314q) {
        long jA = a(c14314q, true);
        f.Companion companion = U0.f.INSTANCE;
        return U0.f.j(jA, companion.b()) ? companion.c() : U0.f.p(jA, a(c14314q, false));
    }

    public static final float d(C14314q c14314q) {
        float fB = b(c14314q, true);
        float fB2 = b(c14314q, false);
        if (fB == 0.0f || fB2 == 0.0f) {
            return 1.0f;
        }
        return fB / fB2;
    }

    public static final long a(C14314q c14314q, boolean z10) {
        long jC = U0.f.INSTANCE.c();
        List<PointerInputChange> listC = c14314q.c();
        int size = listC.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = listC.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jC = U0.f.q(jC, z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i10++;
            }
        }
        return i10 == 0 ? U0.f.INSTANCE.b() : U0.f.h(jC, i10);
    }

    public static final float b(C14314q c14314q, boolean z10) {
        long previousPosition;
        long jA = a(c14314q, z10);
        float fK = 0.0f;
        if (U0.f.j(jA, U0.f.INSTANCE.b())) {
            return 0.0f;
        }
        List<PointerInputChange> listC = c14314q.c();
        int size = listC.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = listC.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z10) {
                    previousPosition = pointerInputChange.getPosition();
                } else {
                    previousPosition = pointerInputChange.getPreviousPosition();
                }
                fK += U0.f.k(U0.f.p(previousPosition, jA));
                i10++;
            }
        }
        return fK / i10;
    }
}

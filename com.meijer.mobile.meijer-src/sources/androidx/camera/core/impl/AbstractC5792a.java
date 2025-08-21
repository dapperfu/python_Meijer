package androidx.camera.core.impl;

import C.C3037w;
import F.v0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.x;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5792a {
    public abstract List<E.b> b();

    public abstract C3037w c();

    public abstract int d();

    public abstract k e();

    public abstract Size f();

    public abstract v0 g();

    public abstract Range<Integer> h();

    public static AbstractC5792a a(v0 v0Var, int i10, Size size, C3037w c3037w, List<E.b> list, k kVar, Range<Integer> range) {
        return new C5793b(v0Var, i10, size, c3037w, list, kVar, range);
    }

    AbstractC5792a() {
    }

    public x i(k kVar) {
        x.a aVarD = x.a(f()).b(c()).d(kVar);
        if (h() != null) {
            aVarD.c(h());
        }
        return aVarD.a();
    }
}

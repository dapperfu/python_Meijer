package qc;

import android.util.SparseArray;
import qc.C16495f;

/* renamed from: qc.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16505p {

    /* renamed from: qc.p$a */
    public static abstract class a {
        public abstract AbstractC16505p a();

        public abstract a b(AbstractC16508s abstractC16508s);

        public abstract a c(b bVar);
    }

    /* renamed from: qc.p$b */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* renamed from: d, reason: collision with root package name */
        private static final SparseArray<b> f157133d;

        /* renamed from: a, reason: collision with root package name */
        private final int f157135a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f157133d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f157135a = i10;
        }
    }

    public abstract AbstractC16508s b();

    public abstract b c();

    public static a a() {
        return new C16495f.b();
    }
}

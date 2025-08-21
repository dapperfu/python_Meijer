package sc;

import android.util.SparseArray;
import sc.C17043f;

/* renamed from: sc.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17053p {

    /* renamed from: sc.p$a */
    public static abstract class a {
        public abstract AbstractC17053p a();

        public abstract a b(AbstractC17056s abstractC17056s);

        public abstract a c(b bVar);
    }

    /* renamed from: sc.p$b */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* renamed from: d, reason: collision with root package name */
        private static final SparseArray<b> f160248d;

        /* renamed from: a, reason: collision with root package name */
        private final int f160250a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f160248d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f160250a = i10;
        }
    }

    public abstract AbstractC17056s b();

    public abstract b c();

    public static a a() {
        return new C17043f.b();
    }
}

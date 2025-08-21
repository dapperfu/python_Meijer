package Xd;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.vision.C11176l1;
import com.google.android.gms.internal.vision.G2;
import com.google.android.gms.internal.vision.k2;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class b extends Wd.b<Xd.a> {

    /* renamed from: c, reason: collision with root package name */
    private final k2 f42168c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f42169a;

        /* renamed from: b, reason: collision with root package name */
        private C11176l1 f42170b = new C11176l1();

        @RecentlyNonNull
        public b a() {
            return new b(new k2(this.f42169a, this.f42170b));
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f42170b.f85407a = i10;
            return this;
        }

        public a(@RecentlyNonNull Context context) {
            this.f42169a = context;
        }
    }

    private b(k2 k2Var) {
        this.f42168c = k2Var;
    }

    @Override // Wd.b
    @RecentlyNonNull
    public final SparseArray<Xd.a> a(@RecentlyNonNull Wd.c cVar) {
        Xd.a[] aVarArrG;
        if (cVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        G2 g2B = G2.B(cVar);
        if (cVar.a() != null) {
            aVarArrG = this.f42168c.f((Bitmap) r.l(cVar.a()), g2B);
            if (aVarArrG == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else if (cVar.d() != null) {
            aVarArrG = this.f42168c.g((ByteBuffer) r.l(((Image.Plane[]) r.l(cVar.d()))[0].getBuffer()), new G2(((Image.Plane[]) r.l(cVar.d()))[0].getRowStride(), g2B.f85144b, g2B.f85145c, g2B.f85146d, g2B.f85147e));
        } else {
            aVarArrG = this.f42168c.g((ByteBuffer) r.l(cVar.b()), g2B);
        }
        SparseArray<Xd.a> sparseArray = new SparseArray<>(aVarArrG.length);
        for (Xd.a aVar : aVarArrG) {
            sparseArray.append(aVar.f42093b.hashCode(), aVar);
        }
        return sparseArray;
    }

    @Override // Wd.b
    public final boolean b() {
        return this.f42168c.c();
    }

    @Override // Wd.b
    public final void d() {
        super.d();
        this.f42168c.d();
    }
}

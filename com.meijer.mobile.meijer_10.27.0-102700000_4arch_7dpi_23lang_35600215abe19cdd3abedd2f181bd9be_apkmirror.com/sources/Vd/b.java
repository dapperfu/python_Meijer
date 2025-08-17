package Vd;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.vision.C11051l1;
import com.google.android.gms.internal.vision.G2;
import com.google.android.gms.internal.vision.k2;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class b extends Ud.b<Vd.a> {

    /* renamed from: c, reason: collision with root package name */
    private final k2 f37456c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f37457a;

        /* renamed from: b, reason: collision with root package name */
        private C11051l1 f37458b = new C11051l1();

        @RecentlyNonNull
        public b a() {
            return new b(new k2(this.f37457a, this.f37458b));
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f37458b.f84567a = i10;
            return this;
        }

        public a(@RecentlyNonNull Context context) {
            this.f37457a = context;
        }
    }

    private b(k2 k2Var) {
        this.f37456c = k2Var;
    }

    @Override // Ud.b
    @RecentlyNonNull
    public final SparseArray<Vd.a> a(@RecentlyNonNull Ud.c cVar) {
        Vd.a[] aVarArrG;
        if (cVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        G2 g2B = G2.B(cVar);
        if (cVar.a() != null) {
            aVarArrG = this.f37456c.f((Bitmap) r.l(cVar.a()), g2B);
            if (aVarArrG == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else if (cVar.d() != null) {
            aVarArrG = this.f37456c.g((ByteBuffer) r.l(((Image.Plane[]) r.l(cVar.d()))[0].getBuffer()), new G2(((Image.Plane[]) r.l(cVar.d()))[0].getRowStride(), g2B.f84304b, g2B.f84305c, g2B.f84306d, g2B.f84307e));
        } else {
            aVarArrG = this.f37456c.g((ByteBuffer) r.l(cVar.b()), g2B);
        }
        SparseArray<Vd.a> sparseArray = new SparseArray<>(aVarArrG.length);
        for (Vd.a aVar : aVarArrG) {
            sparseArray.append(aVar.f37381b.hashCode(), aVar);
        }
        return sparseArray;
    }

    @Override // Ud.b
    public final boolean b() {
        return this.f37456c.c();
    }

    @Override // Ud.b
    public final void d() {
        super.d();
        this.f37456c.d();
    }
}

package B;

import B.j;
import C.InterfaceC3038x;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.v;
import u.C17296a;

/* loaded from: classes.dex */
public class j implements v {

    /* renamed from: I, reason: collision with root package name */
    private final k f2145I;

    public static final class a implements InterfaceC3038x<j> {

        /* renamed from: a, reason: collision with root package name */
        private final s f2146a = s.b0();

        public static a e(final k kVar) {
            final a aVar = new a();
            kVar.d("camera2.captureRequest.option.", new k.b() { // from class: B.i
                @Override // androidx.camera.core.impl.k.b
                public final boolean a(k.a aVar2) {
                    return j.a.c(this.f2143a, kVar, aVar2);
                }
            });
            return aVar;
        }

        @Override // C.InterfaceC3038x
        public r a() {
            return this.f2146a;
        }

        public j d() {
            return new j(t.a0(this.f2146a));
        }

        public static /* synthetic */ boolean c(a aVar, k kVar, k.a aVar2) {
            aVar.a().p(aVar2, kVar.i(aVar2), kVar.a(aVar2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f2146a.r(C17296a.Y(key), valuet);
            return this;
        }
    }

    @Override // androidx.camera.core.impl.v
    public k b() {
        return this.f2145I;
    }

    public j(k kVar) {
        this.f2145I = kVar;
    }
}

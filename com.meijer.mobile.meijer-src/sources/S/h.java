package S;

import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.t;
import java.util.List;

/* loaded from: classes.dex */
public class h implements D<f>, q, J.l {

    /* renamed from: J, reason: collision with root package name */
    static final k.a<List<E.b>> f34260J = k.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* renamed from: I, reason: collision with root package name */
    private final t f34261I;

    public List<E.b> Y() {
        return (List) a(f34260J);
    }

    @Override // androidx.camera.core.impl.v
    public androidx.camera.core.impl.k b() {
        return this.f34261I;
    }

    h(t tVar) {
        this.f34261I = tVar;
    }
}

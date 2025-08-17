package S;

import E.InterfaceC3408j;
import S.f;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.common.util.concurrent.q;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class o extends androidx.camera.core.impl.m {

    /* renamed from: c, reason: collision with root package name */
    private final f.a f33107c;

    o(CameraControlInternal cameraControlInternal, f.a aVar) {
        super(cameraControlInternal);
        this.f33107c = aVar;
    }

    private int m(androidx.camera.core.impl.i iVar) {
        Integer num = (Integer) iVar.g().h(androidx.camera.core.impl.i.f47401j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int n(androidx.camera.core.impl.i iVar) {
        Integer num = (Integer) iVar.g().h(androidx.camera.core.impl.i.f47400i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.m, androidx.camera.core.impl.CameraControlInternal
    public q<List<Void>> b(final List<androidx.camera.core.impl.i> list, int i10, int i11) {
        boolean z10 = true;
        if (list.size() != 1) {
            z10 = false;
        }
        o2.i.b(z10, "Only support one capture config.");
        final q<InterfaceC3408j> qVarH = h(i10, i11);
        return I.n.k(Collections.singletonList(I.d.a(qVarH).e(new I.a() { // from class: S.l
            @Override // I.a
            public final q apply(Object obj) {
                return ((InterfaceC3408j) qVarH.get()).a();
            }
        }, H.a.a()).e(new I.a() { // from class: S.m
            @Override // I.a
            public final q apply(Object obj) {
                o oVar = this.f33104a;
                List list2 = list;
                return oVar.f33107c.a(oVar.m((androidx.camera.core.impl.i) list2.get(0)), oVar.n((androidx.camera.core.impl.i) list2.get(0)));
            }
        }, H.a.a()).e(new I.a() { // from class: S.n
            @Override // I.a
            public final q apply(Object obj) {
                return ((InterfaceC3408j) qVarH.get()).b();
            }
        }, H.a.a())));
    }
}

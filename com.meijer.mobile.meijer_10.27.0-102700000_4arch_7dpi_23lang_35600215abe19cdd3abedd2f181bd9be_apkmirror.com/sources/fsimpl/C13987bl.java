package fsimpl;

import android.graphics.Path;

/* renamed from: fsimpl.bl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13987bl implements InterfaceC13990bo {

    /* renamed from: a, reason: collision with root package name */
    private boolean f131837a;

    C13987bl() {
        Path path = new Path();
        path.addRoundRect(0.0f, 0.0f, 50.0f, 100.0f, 10.0f, 15.0f, Path.Direction.CCW);
        this.f131837a = path.approximate(1.0f).length > 20;
    }

    @Override // fsimpl.InterfaceC13990bo
    public int a(gh ghVar, Path path, int i10) {
        if (path == null || path.isEmpty()) {
            return 0;
        }
        return C14037dh.a(ghVar, i10, C14037dh.a(ghVar, path.approximate(1.0f)), 0);
    }

    @Override // fsimpl.InterfaceC13990bo
    public boolean a() {
        return this.f131837a;
    }
}

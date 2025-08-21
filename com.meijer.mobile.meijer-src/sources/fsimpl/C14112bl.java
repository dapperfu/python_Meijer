package fsimpl;

import android.graphics.Path;

/* renamed from: fsimpl.bl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14112bl implements InterfaceC14115bo {

    /* renamed from: a, reason: collision with root package name */
    private boolean f133087a;

    C14112bl() {
        Path path = new Path();
        path.addRoundRect(0.0f, 0.0f, 50.0f, 100.0f, 10.0f, 15.0f, Path.Direction.CCW);
        this.f133087a = path.approximate(1.0f).length > 20;
    }

    @Override // fsimpl.InterfaceC14115bo
    public int a(gh ghVar, Path path, int i10) {
        if (path == null || path.isEmpty()) {
            return 0;
        }
        return C14162dh.a(ghVar, i10, C14162dh.a(ghVar, path.approximate(1.0f)), 0);
    }

    @Override // fsimpl.InterfaceC14115bo
    public boolean a() {
        return this.f133087a;
    }
}

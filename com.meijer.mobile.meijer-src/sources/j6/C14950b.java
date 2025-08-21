package j6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14950b {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f140001a = new ArrayList();

    void a(u uVar) {
        this.f140001a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f140001a.size() - 1; size >= 0; size--) {
            v6.q.b(path, this.f140001a.get(size));
        }
    }
}

package i6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14691b {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f137466a = new ArrayList();

    void a(u uVar) {
        this.f137466a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f137466a.size() - 1; size >= 0; size--) {
            u6.q.b(path, this.f137466a.get(size));
        }
    }
}

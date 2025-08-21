package M9;

import java.util.List;

/* loaded from: classes4.dex */
public class a<T> implements b<List<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f19699a;

    public a(int i10) {
        this.f19699a = i10;
    }

    @Override // M9.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(List<T> list) {
        if (list.size() >= this.f19699a) {
            return true;
        }
        return false;
    }
}

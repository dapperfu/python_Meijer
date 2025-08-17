package j6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14868h {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC14861a<p6.o, Path>> f139448a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC14861a<Integer, Integer>> f139449b;

    /* renamed from: c, reason: collision with root package name */
    private final List<p6.i> f139450c;

    public List<AbstractC14861a<p6.o, Path>> a() {
        return this.f139448a;
    }

    public List<p6.i> b() {
        return this.f139450c;
    }

    public List<AbstractC14861a<Integer, Integer>> c() {
        return this.f139449b;
    }

    public C14868h(List<p6.i> list) {
        this.f139450c = list;
        this.f139448a = new ArrayList(list.size());
        this.f139449b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f139448a.add(list.get(i10).b().a());
            this.f139449b.add(list.get(i10).c().a());
        }
    }
}

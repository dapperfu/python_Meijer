package k6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15100h {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC15093a<q6.o, Path>> f141646a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC15093a<Integer, Integer>> f141647b;

    /* renamed from: c, reason: collision with root package name */
    private final List<q6.i> f141648c;

    public List<AbstractC15093a<q6.o, Path>> a() {
        return this.f141646a;
    }

    public List<q6.i> b() {
        return this.f141648c;
    }

    public List<AbstractC15093a<Integer, Integer>> c() {
        return this.f141647b;
    }

    public C15100h(List<q6.i> list) {
        this.f141648c = list;
        this.f141646a = new ArrayList(list.size());
        this.f141647b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f141646a.add(list.get(i10).b().a());
            this.f141647b.add(list.get(i10).c().a());
        }
    }
}

package H9;

import Q8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b<T> implements c<List<T>, List<List<T>>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f12368a;

    @Override // Q8.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<List<T>> a(List<T> list) {
        G9.b.c(list, "Shards must not be null!");
        G9.b.b(list, "Shards must not be empty!");
        G9.b.a(list, "Shard elements must not be null!");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = this.f12368a;
            if (i10 + i11 >= size) {
                i11 = size - i10;
            }
            arrayList.add(list.subList(i10, i11 + i10));
            i10 += this.f12368a;
        }
        return arrayList;
    }

    public b(int i10) {
        G9.b.d(Integer.valueOf(i10), "Chunk size must be greater than 0!");
        this.f12368a = i10;
    }
}

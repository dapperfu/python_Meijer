package J9;

import S8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b<T> implements c<List<T>, List<List<T>>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f15678a;

    @Override // S8.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<List<T>> a(List<T> list) {
        I9.b.c(list, "Shards must not be null!");
        I9.b.b(list, "Shards must not be empty!");
        I9.b.a(list, "Shard elements must not be null!");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = this.f15678a;
            if (i10 + i11 >= size) {
                i11 = size - i10;
            }
            arrayList.add(list.subList(i10, i11 + i10));
            i10 += this.f15678a;
        }
        return arrayList;
    }

    public b(int i10) {
        I9.b.d(Integer.valueOf(i10), "Chunk size must be greater than 0!");
        this.f15678a = i10;
    }
}

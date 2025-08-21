package hh;

import android.graphics.Rect;
import com.fullstory.FS;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f135526a = "q";

    class a implements Comparator<gh.q> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gh.q f135527a;

        a(gh.q qVar) {
            this.f135527a = qVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(gh.q qVar, gh.q qVar2) {
            return Float.compare(q.this.c(qVar2, this.f135527a), q.this.c(qVar, this.f135527a));
        }
    }

    protected abstract float c(gh.q qVar, gh.q qVar2);

    public abstract Rect d(gh.q qVar, gh.q qVar2);

    public List<gh.q> a(List<gh.q> list, gh.q qVar) {
        if (qVar == null) {
            return list;
        }
        Collections.sort(list, new a(qVar));
        return list;
    }

    public gh.q b(List<gh.q> list, gh.q qVar) {
        List<gh.q> listA = a(list, qVar);
        String str = f135526a;
        FS.log_i(str, "Viewfinder size: " + qVar);
        FS.log_i(str, "Preview in order of preference: " + listA);
        return listA.get(0);
    }
}

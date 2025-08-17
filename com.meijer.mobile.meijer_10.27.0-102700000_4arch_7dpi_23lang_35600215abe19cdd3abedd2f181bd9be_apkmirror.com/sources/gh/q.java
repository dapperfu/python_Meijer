package gh;

import android.graphics.Rect;
import com.fullstory.FS;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f133460a = "q";

    class a implements Comparator<fh.q> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fh.q f133461a;

        a(fh.q qVar) {
            this.f133461a = qVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(fh.q qVar, fh.q qVar2) {
            return Float.compare(q.this.c(qVar2, this.f133461a), q.this.c(qVar, this.f133461a));
        }
    }

    protected abstract float c(fh.q qVar, fh.q qVar2);

    public abstract Rect d(fh.q qVar, fh.q qVar2);

    public List<fh.q> a(List<fh.q> list, fh.q qVar) {
        if (qVar == null) {
            return list;
        }
        Collections.sort(list, new a(qVar));
        return list;
    }

    public fh.q b(List<fh.q> list, fh.q qVar) {
        List<fh.q> listA = a(list, qVar);
        String str = f133460a;
        FS.log_i(str, "Viewfinder size: " + qVar);
        FS.log_i(str, "Preview in order of preference: " + listA);
        return listA.get(0);
    }
}

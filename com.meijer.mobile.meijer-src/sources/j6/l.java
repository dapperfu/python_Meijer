package j6;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import q6.j;

@TargetApi(19)
/* loaded from: classes4.dex */
public class l implements m, InterfaceC14958j {

    /* renamed from: d, reason: collision with root package name */
    private final String f140068d;

    /* renamed from: f, reason: collision with root package name */
    private final q6.j f140070f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f140065a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f140066b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f140067c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<m> f140069e = new ArrayList();

    private void a() {
        for (int i10 = 0; i10 < this.f140069e.size(); i10++) {
            this.f140067c.addPath(this.f140069e.get(i10).getPath());
        }
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        for (int i10 = 0; i10 < this.f140069e.size(); i10++) {
            this.f140069e.get(i10).b(list, list2);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140071a;

        static {
            int[] iArr = new int[j.a.values().length];
            f140071a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140071a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140071a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f140071a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f140071a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @TargetApi(19)
    private void f(Path.Op op2) {
        this.f140066b.reset();
        this.f140065a.reset();
        for (int size = this.f140069e.size() - 1; size >= 1; size--) {
            m mVar = this.f140069e.get(size);
            if (mVar instanceof C14952d) {
                C14952d c14952d = (C14952d) mVar;
                List<m> listL = c14952d.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = listL.get(size2).getPath();
                    path.transform(c14952d.m());
                    this.f140066b.addPath(path);
                }
            } else {
                this.f140066b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f140069e.get(0);
        if (mVar2 instanceof C14952d) {
            C14952d c14952d2 = (C14952d) mVar2;
            List<m> listL2 = c14952d2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = listL2.get(i10).getPath();
                path2.transform(c14952d2.m());
                this.f140065a.addPath(path2);
            }
        } else {
            this.f140065a.set(mVar2.getPath());
        }
        this.f140067c.op(this.f140065a, this.f140066b, op2);
    }

    @Override // j6.m
    public Path getPath() {
        this.f140067c.reset();
        if (this.f140070f.d()) {
            return this.f140067c;
        }
        int i10 = a.f140071a[this.f140070f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            f(Path.Op.UNION);
        } else if (i10 == 3) {
            f(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            f(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            f(Path.Op.XOR);
        }
        return this.f140067c;
    }

    public l(q6.j jVar) {
        this.f140068d = jVar.c();
        this.f140070f = jVar;
    }

    @Override // j6.InterfaceC14958j
    public void i(ListIterator<InterfaceC14951c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC14951c interfaceC14951cPrevious = listIterator.previous();
            if (interfaceC14951cPrevious instanceof m) {
                this.f140069e.add((m) interfaceC14951cPrevious);
                listIterator.remove();
            }
        }
    }
}

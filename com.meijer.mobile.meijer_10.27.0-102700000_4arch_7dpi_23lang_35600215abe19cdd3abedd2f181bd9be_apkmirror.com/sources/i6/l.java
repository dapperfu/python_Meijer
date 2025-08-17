package i6;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p6.j;

@TargetApi(19)
/* loaded from: classes4.dex */
public class l implements m, InterfaceC14699j {

    /* renamed from: d, reason: collision with root package name */
    private final String f137533d;

    /* renamed from: f, reason: collision with root package name */
    private final p6.j f137535f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f137530a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f137531b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f137532c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<m> f137534e = new ArrayList();

    private void a() {
        for (int i10 = 0; i10 < this.f137534e.size(); i10++) {
            this.f137532c.addPath(this.f137534e.get(i10).getPath());
        }
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        for (int i10 = 0; i10 < this.f137534e.size(); i10++) {
            this.f137534e.get(i10).b(list, list2);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137536a;

        static {
            int[] iArr = new int[j.a.values().length];
            f137536a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137536a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137536a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137536a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137536a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @TargetApi(19)
    private void d(Path.Op op2) {
        this.f137531b.reset();
        this.f137530a.reset();
        for (int size = this.f137534e.size() - 1; size >= 1; size--) {
            m mVar = this.f137534e.get(size);
            if (mVar instanceof C14693d) {
                C14693d c14693d = (C14693d) mVar;
                List<m> listL = c14693d.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path path = listL.get(size2).getPath();
                    path.transform(c14693d.m());
                    this.f137531b.addPath(path);
                }
            } else {
                this.f137531b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f137534e.get(0);
        if (mVar2 instanceof C14693d) {
            C14693d c14693d2 = (C14693d) mVar2;
            List<m> listL2 = c14693d2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path path2 = listL2.get(i10).getPath();
                path2.transform(c14693d2.m());
                this.f137530a.addPath(path2);
            }
        } else {
            this.f137530a.set(mVar2.getPath());
        }
        this.f137532c.op(this.f137530a, this.f137531b, op2);
    }

    @Override // i6.m
    public Path getPath() {
        this.f137532c.reset();
        if (this.f137535f.d()) {
            return this.f137532c;
        }
        int i10 = a.f137536a[this.f137535f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            d(Path.Op.UNION);
        } else if (i10 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            d(Path.Op.XOR);
        }
        return this.f137532c;
    }

    public l(p6.j jVar) {
        this.f137533d = jVar.c();
        this.f137535f = jVar;
    }

    @Override // i6.InterfaceC14699j
    public void h(ListIterator<InterfaceC14692c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC14692c interfaceC14692cPrevious = listIterator.previous();
            if (interfaceC14692cPrevious instanceof m) {
                this.f137534e.add((m) interfaceC14692cPrevious);
                listIterator.remove();
            }
        }
    }
}

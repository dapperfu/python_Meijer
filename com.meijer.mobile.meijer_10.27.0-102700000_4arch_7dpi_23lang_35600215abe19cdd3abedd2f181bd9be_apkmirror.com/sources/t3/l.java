package t3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import t3.l;

/* loaded from: classes.dex */
public class l {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f161408h = new Comparator() { // from class: t3.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l.b((l.b) obj, (l.b) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f161409i = new Comparator() { // from class: t3.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((l.b) obj).f161419c, ((l.b) obj2).f161419c);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f161410a;

    /* renamed from: e, reason: collision with root package name */
    private int f161414e;

    /* renamed from: f, reason: collision with root package name */
    private int f161415f;

    /* renamed from: g, reason: collision with root package name */
    private int f161416g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f161412c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f161411b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f161413d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f161417a;

        /* renamed from: b, reason: collision with root package name */
        public int f161418b;

        /* renamed from: c, reason: collision with root package name */
        public float f161419c;

        private b() {
        }
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f161417a - bVar2.f161417a;
    }

    private void d() {
        if (this.f161413d != 1) {
            Collections.sort(this.f161411b, f161408h);
            this.f161413d = 1;
        }
    }

    private void e() {
        if (this.f161413d != 0) {
            Collections.sort(this.f161411b, f161409i);
            this.f161413d = 0;
        }
    }

    public void g() {
        this.f161411b.clear();
        this.f161413d = -1;
        this.f161414e = 0;
        this.f161415f = 0;
    }

    public l(int i10) {
        this.f161410a = i10;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f161416g;
        if (i11 > 0) {
            b[] bVarArr = this.f161412c;
            int i12 = i11 - 1;
            this.f161416g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f161414e;
        this.f161414e = i13 + 1;
        bVar.f161417a = i13;
        bVar.f161418b = i10;
        bVar.f161419c = f10;
        this.f161411b.add(bVar);
        this.f161415f += i10;
        while (true) {
            int i14 = this.f161415f;
            int i15 = this.f161410a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f161411b.get(0);
                int i17 = bVar2.f161418b;
                if (i17 <= i16) {
                    this.f161415f -= i17;
                    this.f161411b.remove(0);
                    int i18 = this.f161416g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f161412c;
                        this.f161416g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f161418b = i17 - i16;
                    this.f161415f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f161415f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f161411b.size(); i11++) {
            b bVar = this.f161411b.get(i11);
            i10 += bVar.f161418b;
            if (i10 >= f11) {
                return bVar.f161419c;
            }
        }
        if (this.f161411b.isEmpty()) {
            return Float.NaN;
        }
        return this.f161411b.get(r5.size() - 1).f161419c;
    }
}

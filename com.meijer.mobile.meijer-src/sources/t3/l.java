package t3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import t3.l;

/* loaded from: classes.dex */
public class l {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f162218h = new Comparator() { // from class: t3.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l.b((l.b) obj, (l.b) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f162219i = new Comparator() { // from class: t3.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((l.b) obj).f162229c, ((l.b) obj2).f162229c);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f162220a;

    /* renamed from: e, reason: collision with root package name */
    private int f162224e;

    /* renamed from: f, reason: collision with root package name */
    private int f162225f;

    /* renamed from: g, reason: collision with root package name */
    private int f162226g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f162222c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f162221b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f162223d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f162227a;

        /* renamed from: b, reason: collision with root package name */
        public int f162228b;

        /* renamed from: c, reason: collision with root package name */
        public float f162229c;

        private b() {
        }
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f162227a - bVar2.f162227a;
    }

    private void d() {
        if (this.f162223d != 1) {
            Collections.sort(this.f162221b, f162218h);
            this.f162223d = 1;
        }
    }

    private void e() {
        if (this.f162223d != 0) {
            Collections.sort(this.f162221b, f162219i);
            this.f162223d = 0;
        }
    }

    public void g() {
        this.f162221b.clear();
        this.f162223d = -1;
        this.f162224e = 0;
        this.f162225f = 0;
    }

    public l(int i10) {
        this.f162220a = i10;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f162226g;
        if (i11 > 0) {
            b[] bVarArr = this.f162222c;
            int i12 = i11 - 1;
            this.f162226g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f162224e;
        this.f162224e = i13 + 1;
        bVar.f162227a = i13;
        bVar.f162228b = i10;
        bVar.f162229c = f10;
        this.f162221b.add(bVar);
        this.f162225f += i10;
        while (true) {
            int i14 = this.f162225f;
            int i15 = this.f162220a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f162221b.get(0);
                int i17 = bVar2.f162228b;
                if (i17 <= i16) {
                    this.f162225f -= i17;
                    this.f162221b.remove(0);
                    int i18 = this.f162226g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f162222c;
                        this.f162226g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f162228b = i17 - i16;
                    this.f162225f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f162225f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f162221b.size(); i11++) {
            b bVar = this.f162221b.get(i11);
            i10 += bVar.f162228b;
            if (i10 >= f11) {
                return bVar.f162229c;
            }
        }
        if (this.f162221b.isEmpty()) {
            return Float.NaN;
        }
        return this.f162221b.get(r5.size() - 1).f162229c;
    }
}

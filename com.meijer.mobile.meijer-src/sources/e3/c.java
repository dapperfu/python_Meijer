package e3;

import com.medallia.digital.mobilesdk.l3;
import d3.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f129410a;

    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public final long f129411b;

        /* renamed from: c, reason: collision with root package name */
        public final List<C2039c> f129412c;

        /* renamed from: d, reason: collision with root package name */
        public final List<b> f129413d;

        public b(int i10, long j10) {
            super(i10);
            this.f129411b = j10;
            this.f129412c = new ArrayList();
            this.f129413d = new ArrayList();
        }

        public void b(b bVar) {
            this.f129413d.add(bVar);
        }

        public void c(C2039c c2039c) {
            this.f129412c.add(c2039c);
        }

        public b d(int i10) {
            int size = this.f129413d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f129413d.get(i11);
                if (bVar.f129410a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C2039c e(int i10) {
            int size = this.f129412c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C2039c c2039c = this.f129412c.get(i11);
                if (c2039c.f129410a == i10) {
                    return c2039c;
                }
            }
            return null;
        }

        @Override // e3.c
        public String toString() {
            return c.a(this.f129410a) + " leaves: " + Arrays.toString(this.f129412c.toArray()) + " containers: " + Arrays.toString(this.f129413d.toArray());
        }
    }

    /* renamed from: e3.c$c, reason: collision with other inner class name */
    public static final class C2039c extends c {

        /* renamed from: b, reason: collision with root package name */
        public final D f129414b;

        public C2039c(int i10, D d10) {
            super(i10);
            this.f129414b = d10;
        }
    }

    private c(int i10) {
        this.f129410a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & l3.f93323c)) + ((char) ((i10 >> 16) & l3.f93323c)) + ((char) ((i10 >> 8) & l3.f93323c)) + ((char) (i10 & l3.f93323c));
    }

    public String toString() {
        return a(this.f129410a);
    }
}

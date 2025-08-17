package e3;

import com.medallia.digital.mobilesdk.l3;
import d3.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f128074a;

    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public final long f128075b;

        /* renamed from: c, reason: collision with root package name */
        public final List<C2018c> f128076c;

        /* renamed from: d, reason: collision with root package name */
        public final List<b> f128077d;

        public b(int i10, long j10) {
            super(i10);
            this.f128075b = j10;
            this.f128076c = new ArrayList();
            this.f128077d = new ArrayList();
        }

        public void b(b bVar) {
            this.f128077d.add(bVar);
        }

        public void c(C2018c c2018c) {
            this.f128076c.add(c2018c);
        }

        public b d(int i10) {
            int size = this.f128077d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f128077d.get(i11);
                if (bVar.f128074a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C2018c e(int i10) {
            int size = this.f128076c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C2018c c2018c = this.f128076c.get(i11);
                if (c2018c.f128074a == i10) {
                    return c2018c;
                }
            }
            return null;
        }

        @Override // e3.c
        public String toString() {
            return c.a(this.f128074a) + " leaves: " + Arrays.toString(this.f128076c.toArray()) + " containers: " + Arrays.toString(this.f128077d.toArray());
        }
    }

    /* renamed from: e3.c$c, reason: collision with other inner class name */
    public static final class C2018c extends c {

        /* renamed from: b, reason: collision with root package name */
        public final D f128078b;

        public C2018c(int i10, D d10) {
            super(i10);
            this.f128078b = d10;
        }
    }

    private c(int i10) {
        this.f128074a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & l3.f92484c)) + ((char) ((i10 >> 16) & l3.f92484c)) + ((char) ((i10 >> 8) & l3.f92484c)) + ((char) (i10 & l3.f92484c));
    }

    public String toString() {
        return a(this.f128074a);
    }
}

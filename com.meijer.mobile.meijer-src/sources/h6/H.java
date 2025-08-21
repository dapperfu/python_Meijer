package h6;

import Z.C5604b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private boolean f135052a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f135053b = new C5604b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, v6.k> f135054c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<o2.d<String, Float>> f135055d = new a();

    class a implements Comparator<o2.d<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(o2.d<String, Float> dVar, o2.d<String, Float> dVar2) {
            float fFloatValue = dVar.f153584b.floatValue();
            float fFloatValue2 = dVar2.f153584b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f135052a) {
            v6.k kVar = this.f135054c.get(str);
            if (kVar == null) {
                kVar = new v6.k();
                this.f135054c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f135053b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    void b(boolean z10) {
        this.f135052a = z10;
    }
}

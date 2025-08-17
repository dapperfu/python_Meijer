package g6;

import Z.C5504b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private boolean f132876a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f132877b = new C5504b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, u6.k> f132878c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<o2.d<String, Float>> f132879d = new a();

    class a implements Comparator<o2.d<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(o2.d<String, Float> dVar, o2.d<String, Float> dVar2) {
            float fFloatValue = dVar.f153139b.floatValue();
            float fFloatValue2 = dVar2.f153139b.floatValue();
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
        if (this.f132876a) {
            u6.k kVar = this.f132878c.get(str);
            if (kVar == null) {
                kVar = new u6.k();
                this.f132878c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f132877b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    void b(boolean z10) {
        this.f132876a = z10;
    }
}

package j7;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC6023l;
import j7.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    final Map<AbstractC6023l, com.bumptech.glide.k> f139501a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final o.b f139502b;

    class a implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f139503a;

        @Override // j7.l
        public void onStart() {
        }

        @Override // j7.l
        public void onStop() {
        }

        a(AbstractC6023l abstractC6023l) {
            this.f139503a = abstractC6023l;
        }

        @Override // j7.l
        public void onDestroy() {
            m.this.f139501a.remove(this.f139503a);
        }
    }

    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final FragmentManager f139505a;

        b(FragmentManager fragmentManager) {
            this.f139505a = fragmentManager;
        }

        @Override // j7.p
        public Set<com.bumptech.glide.k> a() {
            HashSet hashSet = new HashSet();
            b(this.f139505a, hashSet);
            return hashSet;
        }

        private void b(FragmentManager fragmentManager, Set<com.bumptech.glide.k> set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = fragments.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.k kVarA = m.this.a(fragment.getLifecycle());
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }
    }

    m(o.b bVar) {
        this.f139502b = bVar;
    }

    com.bumptech.glide.k a(AbstractC6023l abstractC6023l) {
        p7.l.a();
        return this.f139501a.get(abstractC6023l);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC6023l abstractC6023l, FragmentManager fragmentManager, boolean z10) {
        p7.l.a();
        com.bumptech.glide.k kVarA = a(abstractC6023l);
        if (kVarA == null) {
            k kVar = new k(abstractC6023l);
            com.bumptech.glide.k kVarA2 = this.f139502b.a(bVar, kVar, new b(fragmentManager), context);
            this.f139501a.put(abstractC6023l, kVarA2);
            kVar.b(new a(abstractC6023l));
            if (z10) {
                kVarA2.onStart();
            }
            return kVarA2;
        }
        return kVarA;
    }
}

package l7;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC6165l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l7.o;

/* loaded from: classes4.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    final Map<AbstractC6165l, com.bumptech.glide.k> f149517a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final o.b f149518b;

    class a implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f149519a;

        @Override // l7.l
        public void onStart() {
        }

        @Override // l7.l
        public void onStop() {
        }

        a(AbstractC6165l abstractC6165l) {
            this.f149519a = abstractC6165l;
        }

        @Override // l7.l
        public void onDestroy() {
            m.this.f149517a.remove(this.f149519a);
        }
    }

    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final FragmentManager f149521a;

        b(FragmentManager fragmentManager) {
            this.f149521a = fragmentManager;
        }

        @Override // l7.p
        public Set<com.bumptech.glide.k> a() {
            HashSet hashSet = new HashSet();
            b(this.f149521a, hashSet);
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
        this.f149518b = bVar;
    }

    com.bumptech.glide.k a(AbstractC6165l abstractC6165l) {
        r7.l.a();
        return this.f149517a.get(abstractC6165l);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC6165l abstractC6165l, FragmentManager fragmentManager, boolean z10) {
        r7.l.a();
        com.bumptech.glide.k kVarA = a(abstractC6165l);
        if (kVarA == null) {
            k kVar = new k(abstractC6165l);
            com.bumptech.glide.k kVarA2 = this.f149518b.a(bVar, kVar, new b(fragmentManager), context);
            this.f149517a.put(abstractC6165l, kVarA2);
            kVar.b(new a(abstractC6165l));
            if (z10) {
                kVarA2.onStart();
            }
            return kVarA2;
        }
        return kVarA;
    }
}

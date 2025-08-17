package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class v extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f58307d;

    /* renamed from: e, reason: collision with root package name */
    private final a f58308e;

    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final v f58309d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f58310e = new WeakHashMap();

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public q2.z b(View view) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) q2.y yVar) {
            if (this.f58309d.o() || this.f58309d.f58307d.getLayoutManager() == null) {
                super.g(view, yVar);
                return;
            }
            this.f58309d.f58307d.getLayoutManager().e1(view, yVar);
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                aVar.g(view, yVar);
            } else {
                super.g(view, yVar);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f58310e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f58309d.o() || this.f58309d.f58307d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f58309d.f58307d.getLayoutManager().y1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f58310e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.a n(View view) {
            return this.f58310e.remove(view);
        }

        public a(v vVar) {
            this.f58309d = vVar;
        }

        void o(View view) {
            androidx.core.view.a aVarM = ViewCompat.m(view);
            if (aVarM != null && aVarM != this) {
                this.f58310e.put(view, aVarM);
            }
        }
    }

    public androidx.core.view.a n() {
        return this.f58308e;
    }

    boolean o() {
        return this.f58307d.hasPendingAdapterUpdates();
    }

    public v(RecyclerView recyclerView) {
        this.f58307d = recyclerView;
        androidx.core.view.a aVarN = n();
        if (aVarN != null && (aVarN instanceof a)) {
            this.f58308e = (a) aVarN;
        } else {
            this.f58308e = new a(this);
        }
    }

    @Override // androidx.core.view.a
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a1(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.a
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) q2.y yVar) {
        super.g(view, yVar);
        if (!o() && this.f58307d.getLayoutManager() != null) {
            this.f58307d.getLayoutManager().d1(yVar);
        }
    }

    @Override // androidx.core.view.a
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (!o() && this.f58307d.getLayoutManager() != null) {
            return this.f58307d.getLayoutManager().w1(i10, bundle);
        }
        return false;
    }
}

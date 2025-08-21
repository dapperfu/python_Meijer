package q2;

import android.view.accessibility.AccessibilityManager;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16596c {

    /* renamed from: q2.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* renamed from: q2.c$b */
    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final a f157810a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f157810a.equals(((b) obj).f157810a);
            }
            return false;
        }

        public int hashCode() {
            return this.f157810a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f157810a.onTouchExplorationStateChanged(z10);
        }

        b(a aVar) {
            this.f157810a = aVar;
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}

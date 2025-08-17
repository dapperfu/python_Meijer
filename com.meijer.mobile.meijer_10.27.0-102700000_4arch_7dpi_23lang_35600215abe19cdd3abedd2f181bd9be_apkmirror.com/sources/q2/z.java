package q2;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f156753a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final z f156754a;

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            y yVarB = this.f156754a.b(i10);
            if (yVarB == null) {
                return null;
            }
            return yVarB.f1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<y> listC = this.f156754a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listC.get(i11).f1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            y yVarD = this.f156754a.d(i10);
            if (yVarD == null) {
                return null;
            }
            return yVarD.f1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f156754a.f(i10, i11, bundle);
        }

        a(z zVar) {
            this.f156754a = zVar;
        }
    }

    static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f156754a.a(i10, y.g1(accessibilityNodeInfo), str, bundle);
        }

        b(z zVar) {
            super(zVar);
        }
    }

    public z() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f156753a = new b(this);
        } else {
            this.f156753a = new a(this);
        }
    }

    public void a(int i10, y yVar, String str, Bundle bundle) {
    }

    public y b(int i10) {
        return null;
    }

    public List<y> c(String str, int i10) {
        return null;
    }

    public y d(int i10) {
        return null;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public Object e() {
        return this.f156753a;
    }

    public z(Object obj) {
        this.f156753a = obj;
    }
}

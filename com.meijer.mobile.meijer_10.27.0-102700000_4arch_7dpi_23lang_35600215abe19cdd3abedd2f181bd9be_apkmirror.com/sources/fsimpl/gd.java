package fsimpl;

import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;

/* loaded from: classes14.dex */
public class gd {
    public static Object a(C14060ee c14060ee, Object obj) {
        aF aFVarB;
        return ((obj instanceof aF) || (aFVarB = c14060ee.b(obj)) == null) ? d(obj) : d(aFVarB);
    }

    public static void a(Object obj) {
    }

    public static aF b(C14060ee c14060ee, Object obj) {
        a(obj);
        aF aFVarB = obj instanceof aF ? (aF) obj : c14060ee.b(obj);
        if (aFVarB == null) {
            return null;
        }
        while (aFVarB.f131465c != null) {
            aFVarB = aFVarB.f131465c;
        }
        return aFVarB;
    }

    public static void b(Object obj) {
    }

    public static long c(Object obj) {
        a(obj);
        Object objD = !(obj instanceof WebView) ? d(obj) : null;
        if (objD == null) {
            objD = obj.getClass();
        }
        return fL.a(System.identityHashCode(objD), System.identityHashCode(obj));
    }

    private static Object d(Object obj) {
        if (obj instanceof aF) {
            aF aFVar = (aF) obj;
            if (aFVar.f131465c != null) {
                return aFVar.f131465c;
            }
            obj = aFVar.f131463a.get();
            if (obj == null) {
                C14103fu.c("getDirectParent backing field should have been non-null for IntermediateNode", new Object[0]);
                return null;
            }
        }
        if (obj instanceof View) {
            ViewParent parent = ((View) obj).getParent();
            if (parent instanceof View) {
                return parent;
            }
            return null;
        }
        if (!(obj instanceof FSComposeLayoutNode)) {
            b(obj);
            return null;
        }
        FSComposeLayoutNode fSComposeLayoutNode = (FSComposeLayoutNode) obj;
        FSComposeLayoutNode fSComposeLayoutNode_fsGetParent = fSComposeLayoutNode._fsGetParent();
        if (fSComposeLayoutNode_fsGetParent != null) {
            return fSComposeLayoutNode_fsGetParent;
        }
        Object obj_fsGetOwner = fSComposeLayoutNode._fsGetOwner();
        if ((obj_fsGetOwner instanceof View) && C13999bx.a((View) obj_fsGetOwner) && ((FSComposeAndroidComposeView) obj_fsGetOwner)._fsGetRoot() == fSComposeLayoutNode) {
            return obj_fsGetOwner;
        }
        return null;
    }
}

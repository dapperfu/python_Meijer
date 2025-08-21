package fsimpl;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAnnotatedString;
import com.fullstory.instrumentation.frameworks.compose.FSComposeCanvas;
import com.fullstory.instrumentation.frameworks.compose.FSComposeDraw;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutCoordinates;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeNodeCoordinator;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRect;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsModifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fsimpl.az, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14099az {
    private static int a(aK aKVar) {
        switch (aKVar.f132742h) {
            case 2:
                return 33;
            case 3:
                return 17;
            case 4:
                return 129;
            case 5:
                return 4;
            case 6:
                return 2;
            case 7:
                return 3;
            default:
                return 1;
        }
    }

    private static int a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, boolean z10, boolean z11, C14252y c14252y, int i10, int i11, int i12, RectF rectF, C14138ck c14138ck) {
        c14096aw.a("scanLayoutNode");
        return !c14096aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2) ? i12 : a(c14096aw, fSComposeAndroidComposeView, fSComposeLayoutNode2, z10, z11, c14252y, i10, i11, i12, rectF, fSComposeLayoutNode2._fsGetOuterCoordinator(), c14138ck);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, Object obj, boolean z10, boolean z11, C14252y c14252y, int i10, int i11, int i12, RectF rectF, FSComposeNodeCoordinator fSComposeNodeCoordinator, C14138ck c14138ck) {
        c14096aw.a("scanIntermediateOrLayoutNodeCommon");
        c14096aw.i();
        aK aKVarA = c14096aw.e().a(obj);
        gh ghVarD = c14096aw.d();
        InterfaceC14101ba interfaceC14101baH = c14096aw.h();
        int iA = c14096aw.a(aKVarA);
        int iA2 = a(c14096aw, ghVarD, obj, aKVarA, z10);
        dE.a(ghVarD);
        dE.k(ghVarD, iA);
        dE.n(ghVarD, iA2);
        if (!(fSComposeNodeCoordinator == null ? false : fSComposeNodeCoordinator._fsIsTransparent())) {
            dE.b(ghVarD, (byte) -1);
        }
        dE.a(ghVarD, C14172ds.a(ghVarD, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        if (z10) {
            C14098ay.a(c14096aw.b(), (View) fSComposeAndroidComposeView, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        String name = c14138ck.y() ? aKVarA.f132739e : null;
        if (name == null) {
            name = obj.getClass().getName();
        }
        dE.c(ghVarD, interfaceC14101baH.a(name));
        if (obj instanceof FSComposeLayoutNode) {
            a(ghVarD, (FSComposeLayoutNode) obj, z10, c14252y, aKVarA, interfaceC14101baH, c14138ck);
        }
        a(ghVarD, z10, z11, aKVarA, c14252y);
        int iB = dE.b(ghVarD);
        dA.a(ghVarD);
        dA.a(ghVarD, gd.c(obj));
        dA.b(ghVarD, i10);
        dA.a(ghVarD, iB);
        dA.c(ghVarD, i11);
        dA.d(ghVarD, i12);
        return dA.b(ghVarD);
    }

    private static int a(C14096aw c14096aw, gh ghVar, Object obj, aK aKVar, boolean z10) {
        c14096aw.f132972a.clear();
        if (!z10 && aKVar.f132742h != 0 && aKVar.f132742h != 4 && aKVar.d()) {
            C14178dy.a(ghVar);
            C14178dy.a(ghVar, true);
            c14096aw.f132972a.add(Integer.valueOf(dD.a(ghVar, (byte) 4, C14178dy.b(ghVar))));
        }
        return C14098ay.a(c14096aw.f132972a, ghVar);
    }

    private static RectF a(RectF rectF) {
        return (rectF.left == 0.0f && rectF.top == 0.0f) ? rectF : new RectF(0.0f, 0.0f, rectF.right - rectF.left, rectF.bottom - rectF.top);
    }

    public static RectF a(FSComposeLayoutNode fSComposeLayoutNode) {
        FSComposeRect fSComposeRect_fsGetBoundsInParent;
        FSComposeLayoutCoordinates fSComposeLayoutCoordinates_fsGetCoordinates = fSComposeLayoutNode._fsGetCoordinates();
        if (fSComposeLayoutCoordinates_fsGetCoordinates == null || (fSComposeRect_fsGetBoundsInParent = fSComposeLayoutCoordinates_fsGetCoordinates._fsGetBoundsInParent()) == null) {
            return null;
        }
        float f_fsGetLeft = fSComposeRect_fsGetBoundsInParent._fsGetLeft();
        float f_fsGetTop = fSComposeRect_fsGetBoundsInParent._fsGetTop();
        return new RectF(f_fsGetLeft, f_fsGetTop, fSComposeRect_fsGetBoundsInParent._fsGetWidth() + f_fsGetLeft, fSComposeRect_fsGetBoundsInParent._fsGetHeight() + f_fsGetTop);
    }

    public static String a(final FSComposeLayoutNode fSComposeLayoutNode, aK aKVar, C14138ck c14138ck) {
        if (!(aKVar.f132742h != 0) || aKVar.f132742h == 4) {
            return null;
        }
        final boolean zD = aKVar.d();
        final StringBuilder[] sbArr = new StringBuilder[1];
        if (c14138ck.A()) {
            a(fSComposeLayoutNode._fsGetCollapsedSemantics(), zD, sbArr);
        } else {
            bG.a(fSComposeLayoutNode._fsGetModifier(), new bH() { // from class: fsimpl.az$$ExternalSyntheticLambda2
                @Override // fsimpl.bH
                public final void accept(FSComposeModifier fSComposeModifier) {
                    C14099az.a(fSComposeLayoutNode, zD, sbArr, fSComposeModifier);
                }
            });
        }
        StringBuilder sb2 = sbArr[0];
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FSComposeLayoutNode fSComposeLayoutNode, boolean z10, StringBuilder[] sbArr, FSComposeModifier fSComposeModifier) {
        if (fSComposeModifier instanceof FSComposeSemanticsModifier) {
            a(fSComposeLayoutNode._fsGetSemanticsConfiguration((FSComposeSemanticsModifier) fSComposeModifier), z10, sbArr);
        }
    }

    public static void a(FSComposeRenderNodeLayer fSComposeRenderNodeLayer, Object obj, Object obj2, boolean z10) {
        boolean z_fsIsDirty = fSComposeRenderNodeLayer.getIsDirty();
        if (z10) {
            fSComposeRenderNodeLayer._fsDrawLayer(obj, obj2);
        } else {
            fSComposeRenderNodeLayer._fsDrawLayer(obj);
        }
        if (!z_fsIsDirty || fSComposeRenderNodeLayer.getIsDirty()) {
            return;
        }
        fSComposeRenderNodeLayer._fsSetDirty(true);
    }

    private static void a(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, boolean z10, StringBuilder[] sbArr) {
        if (fSComposeSemanticsConfiguration == null) {
            return;
        }
        if (z10) {
            a(sbArr, fSComposeSemanticsConfiguration._fsGetEditableText());
            return;
        }
        List list_fsGetText = fSComposeSemanticsConfiguration._fsGetText();
        if (list_fsGetText != null) {
            Iterator it = list_fsGetText.iterator();
            while (it.hasNext()) {
                a(sbArr, (FSComposeAnnotatedString) it.next());
            }
        }
    }

    private static void a(final C14096aw c14096aw, final FSComposeAndroidComposeView fSComposeAndroidComposeView, final FSComposeCanvas fSComposeCanvas, final FSComposeLayoutNode fSComposeLayoutNode, final FSComposeLayoutNode fSComposeLayoutNode2, final int i10, final int i11, final C14138ck c14138ck, Object obj, boolean z10, boolean z11, final C14097ax c14097ax) {
        int[] iArr;
        Map map;
        List list;
        List list2;
        C14252y c14252yE;
        int i12;
        Map map2;
        final int[] iArr2;
        c14096aw.a("scanLayoutNodeAndChildren");
        if (fSComposeLayoutNode2 == null || fSComposeCanvas == null) {
            c14097ax.f132998a = i10;
            return;
        }
        if (!(fSComposeLayoutNode2 instanceof FSComposeDraw)) {
            c14097ax.f132998a = i10;
            return;
        }
        if (!c14096aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2)) {
            c14097ax.f132998a = i10;
            return;
        }
        C14249v c14249vC = c14096aw.c();
        if (c14249vC.a(fSComposeLayoutNode2)) {
            c14097ax.f132998a = i10;
            return;
        }
        RectF rectFA = a(fSComposeLayoutNode2);
        if (rectFA == null) {
            c14097ax.f132998a = i10;
            return;
        }
        RectF rectFA2 = z11 ? a(rectFA) : rectFA;
        int[] iArr3 = new int[1];
        final boolean zB = c14249vC.b(fSComposeLayoutNode2);
        final boolean zD = c14249vC.d(fSComposeLayoutNode2);
        if (zB) {
            iArr = iArr3;
            map = null;
            list = null;
            list2 = null;
            c14252yE = null;
            i12 = 0;
        } else {
            c14252yE = c14249vC.e(fSComposeLayoutNode2);
            C14095av c14095avF = c14096aw.f();
            C14082ai c14082aiG = c14096aw.g();
            iArr = iArr3;
            int iA = c14095avF.a((FSComposeDraw) fSComposeLayoutNode2, c14249vC, fSComposeCanvas, c14082aiG, obj, z10, rectFA, c14138ck);
            List listB = c14082aiG.b();
            List listC = c14082aiG.c();
            Map mapD = c14082aiG.d();
            i12 = iA;
            list2 = listB;
            list = listC;
            map = mapD;
        }
        fN fNVarA = c14096aw.a();
        Map map3 = map;
        final C14252y c14252y = c14252yE;
        Map map4 = map3;
        List list3 = list;
        final int i13 = i12;
        List list4 = list2;
        final int[] iArr4 = iArr;
        List list5 = list3;
        final RectF rectF = rectFA2;
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C14099az.a(c14097ax, c14096aw, fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2, zB, zD, c14252y, i13, iArr4, i10, rectF, c14138ck);
            }
        });
        if (list5 != null) {
            int size = list5.size() - 1;
            while (size >= 0) {
                List list6 = list5;
                final Object obj2 = list6.get(size);
                if ((obj2 instanceof FSComposeLayoutNode) || (obj2 instanceof aF)) {
                    map2 = map4;
                    C14083aj c14083aj = map4 != null ? (C14083aj) map2.get(obj2) : null;
                    final Object obj3 = c14083aj != null ? c14083aj.f132864a : null;
                    final boolean z12 = c14083aj != null ? c14083aj.f132865b : false;
                    final C14097ax c14097ax2 = new C14097ax();
                    final int[] iArr5 = iArr;
                    list5 = list6;
                    Runnable runnable = new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14099az.a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode2, obj2, iArr5, i11, c14138ck, obj3, z12, c14097ax2);
                        }
                    };
                    iArr2 = iArr;
                    fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14099az.b(iArr2, c14097ax2);
                        }
                    });
                    fNVarA.a(runnable);
                } else {
                    map2 = map4;
                    list5 = list6;
                    iArr2 = iArr;
                }
                size--;
                iArr = iArr2;
                map4 = map2;
            }
        }
        final int[] iArr6 = iArr;
        if (list4 != null) {
            for (int size2 = list4.size() - 1; size2 >= 0; size2--) {
                final Pair pair = (Pair) list4.get(size2);
                final C14097ax c14097ax3 = new C14097ax();
                Runnable runnable2 = new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14099az.a(c14096aw, fSComposeLayoutNode2, pair, iArr6, c14097ax3);
                    }
                };
                fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14099az.a(iArr6, c14097ax3);
                    }
                });
                fNVarA.a(runnable2);
            }
        }
    }

    private static void a(final C14096aw c14096aw, final FSComposeAndroidComposeView fSComposeAndroidComposeView, final FSComposeCanvas fSComposeCanvas, final FSComposeLayoutNode fSComposeLayoutNode, final FSComposeLayoutNode fSComposeLayoutNode2, final aF aFVar, final int i10, final int i11, final C14138ck c14138ck, final Object obj, final boolean z10, final C14097ax c14097ax) {
        c14096aw.a("scanIntermediateNodeAndChildren");
        boolean z11 = aFVar.f132715c != null;
        if (aFVar.f132716d == null) {
            a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, i10, i11, c14138ck, obj, z10, z11, c14097ax);
            return;
        }
        final C14249v c14249vC = c14096aw.c();
        if (c14249vC.a(aFVar)) {
            c14097ax.f132998a = i10;
            return;
        }
        if (!c14096aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2)) {
            c14097ax.f132998a = i10;
            return;
        }
        final RectF rectFA = a(fSComposeLayoutNode2);
        if (rectFA == null) {
            c14097ax.f132998a = i10;
            return;
        }
        RectF rectFA2 = z11 ? a(rectFA) : rectFA;
        final C14097ax c14097ax2 = new C14097ax();
        fN fNVarA = c14096aw.a();
        final boolean zB = c14249vC.b(aFVar);
        final boolean zD = c14249vC.d(aFVar);
        final RectF rectF = rectFA2;
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C14099az.a(zB, c14249vC, aFVar, c14096aw, rectFA, fSComposeLayoutNode2, c14097ax, fSComposeAndroidComposeView, zD, c14097ax2, i10, rectF, c14138ck);
            }
        });
        if (zB) {
            return;
        }
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C14099az.a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, aFVar, i11, c14138ck, obj, z10, c14097ax2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, aF aFVar, int i10, C14138ck c14138ck, Object obj, boolean z10, C14097ax c14097ax) {
        a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, aFVar.f132716d, 0, i10 + 1, c14138ck, obj, z10, c14097ax);
    }

    private static void a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, Object obj, int i10, int i11, C14138ck c14138ck, Object obj2, boolean z10, C14097ax c14097ax) {
        if (obj instanceof FSComposeLayoutNode) {
            a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, (FSComposeLayoutNode) obj, i10, i11, c14138ck, obj2, z10, false, c14097ax);
            return;
        }
        if (obj instanceof aF) {
            aF aFVar = (aF) obj;
            Object obj3 = aFVar.f132713a.get();
            if (obj3 instanceof FSComposeLayoutNode) {
                a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, (FSComposeLayoutNode) obj3, aFVar, i10, i11, c14138ck, obj2, z10, c14097ax);
            } else {
                C14228fu.c("scanNodeAndChildren backing field should have been an FSComposeLayoutNode instance for IntermediateNode but was %s", obj3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, Object obj, int[] iArr, int i10, C14138ck c14138ck, Object obj2, boolean z10, C14097ax c14097ax) {
        a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, obj, iArr[0], i10 + 1, c14138ck, obj2, z10, c14097ax);
    }

    public static void a(C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, C14138ck c14138ck, C14097ax c14097ax) {
        c14096aw.a("scanLayoutNodeAndChildren");
        FSComposeLayoutNode fSComposeLayoutNode_fsGetRoot = fSComposeAndroidComposeView._fsGetRoot();
        FSComposeCanvas fSComposeCanvas_fsWrapCanvas = fSComposeLayoutNode_fsGetRoot._fsWrapCanvas(c14096aw.g());
        if (fSComposeCanvas_fsWrapCanvas == null) {
            c14097ax.f132998a = 0;
        } else {
            a(c14096aw, fSComposeAndroidComposeView, fSComposeCanvas_fsWrapCanvas, (FSComposeLayoutNode) null, (Object) fSComposeLayoutNode_fsGetRoot, 0, 0, c14138ck, (Object) null, false, c14097ax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C14096aw c14096aw, FSComposeLayoutNode fSComposeLayoutNode, Pair pair, int[] iArr, C14097ax c14097ax) {
        c14096aw.a(fSComposeLayoutNode, (View) pair.first, iArr[0], (Rect) pair.second, c14097ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C14097ax c14097ax, C14096aw c14096aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, boolean z10, boolean z11, C14252y c14252y, int i10, int[] iArr, int i11, RectF rectF, C14138ck c14138ck) {
        c14097ax.f132998a = a(c14096aw, fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2, z10, z11, c14252y, i10, iArr[0], i11, rectF, c14138ck);
    }

    private static void a(gh ghVar, FSComposeLayoutNode fSComposeLayoutNode, boolean z10, C14252y c14252y, aK aKVar, InterfaceC14101ba interfaceC14101ba, C14138ck c14138ck) {
        if (c14138ck.x() >= 3) {
            if (aKVar.f132742h != 0) {
                String strA = z10 ? null : a(fSComposeLayoutNode, aKVar, c14138ck);
                if (c14138ck.z() || aKVar.f132742h == 4) {
                    C14098ay.a(ghVar, a(aKVar), aKVar.f132742h);
                }
                if (z10 || strA == null || c14252y == null) {
                    return;
                }
                if (!c14252y.b()) {
                    strA = fF.a(fSComposeLayoutNode, strA);
                }
                dE.m(ghVar, interfaceC14101ba.a(strA));
            }
        }
    }

    private static void a(gh ghVar, boolean z10, aK aKVar, C14252y c14252y) {
        int i10 = z10 ? 256 : 0;
        if (c14252y != null && c14252y.a()) {
            i10 |= 32768;
        }
        if (aKVar.e()) {
            i10 |= 1;
        }
        if (aKVar.f()) {
            i10 |= 2;
        }
        if (aKVar.g()) {
            i10 |= 4;
        }
        if (aKVar.h()) {
            i10 |= 8;
        }
        dE.h(ghVar, i10);
    }

    private static void a(gh ghVar, boolean z10, boolean z11, aK aKVar, C14252y c14252y) {
        a(ghVar, z10, aKVar, c14252y);
        C14098ay.a(ghVar, z11, aKVar.c());
    }

    public static void a(Object obj, View view, C14082ai c14082ai) {
        c14082ai.b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, C14249v c14249v, aF aFVar, C14096aw c14096aw, RectF rectF, FSComposeLayoutNode fSComposeLayoutNode, C14097ax c14097ax, FSComposeAndroidComposeView fSComposeAndroidComposeView, boolean z11, C14097ax c14097ax2, int i10, RectF rectF2, C14138ck c14138ck) {
        C14252y c14252yE;
        int iA;
        if (z10) {
            c14252yE = null;
            iA = 0;
        } else {
            c14252yE = c14249v.e(aFVar);
            iA = c14096aw.f().a(aFVar, c14096aw.g(), a(rectF));
        }
        c14097ax.f132998a = a(c14096aw, fSComposeAndroidComposeView, aFVar, z10, z11, c14252yE, iA, c14097ax2.f132998a, i10, rectF2, fSComposeLayoutNode._fsGetOuterCoordinator(), c14138ck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int[] iArr, C14097ax c14097ax) {
        iArr[0] = c14097ax.f132998a;
    }

    private static void a(StringBuilder[] sbArr, FSComposeAnnotatedString fSComposeAnnotatedString) {
        String str_fsGetText;
        if (fSComposeAnnotatedString == null || (str_fsGetText = fSComposeAnnotatedString._fsGetText()) == null) {
            return;
        }
        StringBuilder sb2 = sbArr[0];
        if (sb2 == null) {
            sb2 = new StringBuilder();
            sbArr[0] = sb2;
        } else if (sb2.length() > 0 && !Character.isWhitespace(sb2.charAt(sb2.length() - 1))) {
            sb2.append(" ");
        }
        sb2.append(str_fsGetText);
    }

    public static boolean a(Object obj, C14082ai c14082ai, Object obj2, boolean z10) {
        c14082ai.a(obj, obj2, z10);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int[] iArr, C14097ax c14097ax) {
        iArr[0] = c14097ax.f132998a;
    }
}

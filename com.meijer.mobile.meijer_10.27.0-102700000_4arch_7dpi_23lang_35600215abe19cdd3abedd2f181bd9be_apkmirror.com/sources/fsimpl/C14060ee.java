package fsimpl;

import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSClickModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fsimpl.ee, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14060ee {

    /* renamed from: e, reason: collision with root package name */
    private final aL f132131e;

    /* renamed from: f, reason: collision with root package name */
    private final bC f132132f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14000by f132133g;

    /* renamed from: h, reason: collision with root package name */
    private final C14013ck f132134h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f132127a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f132128b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f132129c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Set f132130d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    private final WeakHashMap f132135i = new WeakHashMap();

    public C14060ee(aL aLVar, bC bCVar, InterfaceC14000by interfaceC14000by, C14013ck c14013ck) {
        this.f132131e = aLVar;
        this.f132132f = bCVar;
        this.f132133g = interfaceC14000by;
        this.f132134h = c14013ck;
    }

    private static FSComposeLayoutNode a(FSClickModifier fSClickModifier) {
        WeakReference weakReference_fsGetLayoutNode = fSClickModifier._fsGetLayoutNode();
        if (weakReference_fsGetLayoutNode == null) {
            return null;
        }
        Object obj = weakReference_fsGetLayoutNode.get();
        if (obj instanceof FSComposeLayoutNode) {
            return (FSComposeLayoutNode) obj;
        }
        return null;
    }

    private void a(aK aKVar, aK aKVar2) {
        aKVar.f131485a = aKVar2.f131485a;
        aKVar.f131489e = aKVar2.f131489e;
        aKVar.f131490f = aKVar2.f131490f;
        aKVar.a(false);
    }

    private static FSComposeLayoutNode b(FSClickModifier fSClickModifier) {
        FSComposeLayoutNode fSComposeLayoutNodeA = a(fSClickModifier);
        if (fSComposeLayoutNodeA == null || !fSComposeLayoutNodeA._fsIsAttached()) {
            return null;
        }
        return fSComposeLayoutNodeA;
    }

    private aK b(View view) {
        aK aKVar = (aK) this.f132128b.get(view);
        if (aKVar != null) {
            return aKVar;
        }
        aK aKVarA = aG.a(view, this.f132131e);
        this.f132128b.put(view, aKVarA);
        return aKVarA;
    }

    private synchronized aK b(FSComposeLayoutNode fSComposeLayoutNode) {
        aK aKVar = (aK) this.f132129c.get(fSComposeLayoutNode);
        if (aKVar != null) {
            return aKVar;
        }
        aK aKVarA = aG.a(fSComposeLayoutNode, this.f132134h);
        aF aFVarA = aG.a(fSComposeLayoutNode, this.f132132f, this.f132133g);
        if (aFVarA != null) {
            this.f132135i.put(fSComposeLayoutNode, aFVarA);
            a(aKVarA, a(aFVarA));
        }
        this.f132129c.put(fSComposeLayoutNode, aKVarA);
        this.f132130d.remove(fSComposeLayoutNode);
        return aKVarA;
    }

    public synchronized FSComposeLayoutNode a(FSComposeModifier fSComposeModifier) {
        FSClickModifier fSClickModifierA = aG.a(fSComposeModifier);
        if (fSClickModifierA == null) {
            return null;
        }
        if (this.f132130d.isEmpty()) {
            return a(fSClickModifierA);
        }
        FSComposeLayoutNode fSComposeLayoutNodeB = b(fSClickModifierA);
        if (fSComposeLayoutNodeB != null) {
            return fSComposeLayoutNodeB;
        }
        for (FSComposeLayoutNode fSComposeLayoutNode : new HashSet(this.f132130d)) {
            if (fSComposeLayoutNode != null && fSComposeLayoutNode._fsIsAttached()) {
                b(fSComposeLayoutNode);
                FSComposeLayoutNode fSComposeLayoutNodeB2 = b(fSClickModifierA);
                if (fSComposeLayoutNodeB2 != null) {
                    return fSComposeLayoutNodeB2;
                }
            }
        }
        return null;
    }

    public aK a(Object obj) {
        if (obj instanceof View) {
            return b((View) obj);
        }
        if (obj instanceof FSComposeLayoutNode) {
            return b((FSComposeLayoutNode) obj);
        }
        if (obj instanceof aF) {
            return ((aF) obj).f131464b;
        }
        gd.b(obj);
        return new aK();
    }

    public void a() {
        this.f132127a.set(true);
    }

    public void a(View view) {
        this.f132128b.remove(view);
        a();
    }

    public synchronized void a(FSComposeLayoutNode fSComposeLayoutNode) {
        this.f132129c.remove(fSComposeLayoutNode);
        this.f132130d.add(fSComposeLayoutNode);
        a();
    }

    public aF b(Object obj) {
        return (aF) this.f132135i.get(obj);
    }

    public boolean b() {
        return this.f132127a.getAndSet(false);
    }
}

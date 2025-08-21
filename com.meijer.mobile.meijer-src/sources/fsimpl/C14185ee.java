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
/* loaded from: classes15.dex */
public class C14185ee {

    /* renamed from: e, reason: collision with root package name */
    private final aL f133381e;

    /* renamed from: f, reason: collision with root package name */
    private final bC f133382f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14125by f133383g;

    /* renamed from: h, reason: collision with root package name */
    private final C14138ck f133384h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f133377a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f133378b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f133379c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Set f133380d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    private final WeakHashMap f133385i = new WeakHashMap();

    public C14185ee(aL aLVar, bC bCVar, InterfaceC14125by interfaceC14125by, C14138ck c14138ck) {
        this.f133381e = aLVar;
        this.f133382f = bCVar;
        this.f133383g = interfaceC14125by;
        this.f133384h = c14138ck;
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
        aKVar.f132735a = aKVar2.f132735a;
        aKVar.f132739e = aKVar2.f132739e;
        aKVar.f132740f = aKVar2.f132740f;
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
        aK aKVar = (aK) this.f133378b.get(view);
        if (aKVar != null) {
            return aKVar;
        }
        aK aKVarA = aG.a(view, this.f133381e);
        this.f133378b.put(view, aKVarA);
        return aKVarA;
    }

    private synchronized aK b(FSComposeLayoutNode fSComposeLayoutNode) {
        aK aKVar = (aK) this.f133379c.get(fSComposeLayoutNode);
        if (aKVar != null) {
            return aKVar;
        }
        aK aKVarA = aG.a(fSComposeLayoutNode, this.f133384h);
        aF aFVarA = aG.a(fSComposeLayoutNode, this.f133382f, this.f133383g);
        if (aFVarA != null) {
            this.f133385i.put(fSComposeLayoutNode, aFVarA);
            a(aKVarA, a(aFVarA));
        }
        this.f133379c.put(fSComposeLayoutNode, aKVarA);
        this.f133380d.remove(fSComposeLayoutNode);
        return aKVarA;
    }

    public synchronized FSComposeLayoutNode a(FSComposeModifier fSComposeModifier) {
        FSClickModifier fSClickModifierA = aG.a(fSComposeModifier);
        if (fSClickModifierA == null) {
            return null;
        }
        if (this.f133380d.isEmpty()) {
            return a(fSClickModifierA);
        }
        FSComposeLayoutNode fSComposeLayoutNodeB = b(fSClickModifierA);
        if (fSComposeLayoutNodeB != null) {
            return fSComposeLayoutNodeB;
        }
        for (FSComposeLayoutNode fSComposeLayoutNode : new HashSet(this.f133380d)) {
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
            return ((aF) obj).f132714b;
        }
        gd.b(obj);
        return new aK();
    }

    public void a() {
        this.f133377a.set(true);
    }

    public void a(View view) {
        this.f133378b.remove(view);
        a();
    }

    public synchronized void a(FSComposeLayoutNode fSComposeLayoutNode) {
        this.f133379c.remove(fSComposeLayoutNode);
        this.f133380d.add(fSComposeLayoutNode);
        a();
    }

    public aF b(Object obj) {
        return (aF) this.f133385i.get(obj);
    }

    public boolean b() {
        return this.f133377a.getAndSet(false);
    }
}

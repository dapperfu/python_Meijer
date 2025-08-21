package com.scandit.datacapture.core.internal.module.source.camera.behavior.torch;

import com.scandit.datacapture.core.source.TorchListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f125981a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f125982b = new CopyOnWriteArraySet();

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void a(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        CopyOnWriteArraySet copyOnWriteArraySet = this.f125982b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArraySet) {
            if (Intrinsics.e(((WeakReference) obj).get(), listener)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f125982b.remove((WeakReference) it.next());
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void c(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125981a.add(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void b(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        CopyOnWriteArraySet copyOnWriteArraySet = this.f125982b;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.e(((WeakReference) it.next()).get(), listener)) {
                    return;
                }
            }
        }
        this.f125982b.add(new WeakReference(listener));
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a
    public final Collection c() {
        return this.f125982b;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a, com.scandit.datacapture.core.internal.module.source.camera.behavior.CameraBehaviorDelegate
    public final void d(TorchListener listener) {
        Intrinsics.j(listener, "listener");
        this.f125981a.remove(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.camera.behavior.torch.a
    public final Collection a() {
        return this.f125981a;
    }
}

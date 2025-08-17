package com.scandit.datacapture.core.internal.module.source.camera.behavior;

import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f125022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TorchState f125023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f125024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, TorchState torchState, Function0 function0) {
        super(1);
        this.f125022a = cVar;
        this.f125023b = torchState;
        this.f125024c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            c cVar = this.f125022a;
            cVar.f125028d = this.f125023b;
            Iterator it = cVar.f125026b.a().iterator();
            while (it.hasNext()) {
                ((TorchListener) it.next()).onTorchStateChanged(this.f125023b);
            }
            Iterator it2 = this.f125022a.f125026b.c().iterator();
            while (it2.hasNext()) {
                TorchListener torchListener = (TorchListener) ((WeakReference) it2.next()).get();
                if (torchListener != null) {
                    torchListener.onTorchStateChanged(this.f125023b);
                }
            }
        }
        this.f125024c.invoke();
        return Unit.f142422a;
    }
}

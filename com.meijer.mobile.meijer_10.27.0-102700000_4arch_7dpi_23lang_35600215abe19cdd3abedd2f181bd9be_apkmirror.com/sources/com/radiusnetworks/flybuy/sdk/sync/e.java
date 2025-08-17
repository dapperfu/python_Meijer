package com.radiusnetworks.flybuy.sdk.sync;

import android.content.Context;
import androidx.work.c;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import j$.time.Clock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.W;

/* loaded from: classes11.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f120088a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f120090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SyncWorker syncWorker, Continuation continuation) {
        super(2, continuation);
        this.f120090c = syncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f120090c, continuation);
        eVar.f120089b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object objF = IntrinsicsKt.f();
        int i10 = this.f120088a;
        if (i10 != 0) {
            if (i10 == 1) {
                booleanRef = (Ref.BooleanRef) this.f120089b;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f120089b;
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Context context = this.f120090c.f120077h;
            Intrinsics.g(clockSystemDefaultZone);
            if (PreferenceExtensionKt.needConfigSync(context, clockSystemDefaultZone)) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                W wB = C16648k.b(interfaceC16622O, null, null, new d(booleanRef2, this.f120090c, clockSystemDefaultZone, null), 3, null);
                this.f120089b = booleanRef2;
                this.f120088a = 1;
                if (wB.B(this) == objF) {
                    return objF;
                }
                booleanRef = booleanRef2;
            } else {
                return c.a.c();
            }
        }
        if (booleanRef.f142828a) {
            return c.a.a();
        }
        return c.a.c();
    }
}

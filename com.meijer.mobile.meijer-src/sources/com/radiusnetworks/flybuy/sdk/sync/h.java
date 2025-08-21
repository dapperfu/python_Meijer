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
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.W;

/* loaded from: classes12.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f121040a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f121042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SyncWorker syncWorker, Continuation continuation) {
        super(2, continuation);
        this.f121042c = syncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f121042c, continuation);
        hVar.f121041b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h hVar = new h(this.f121042c, (Continuation) obj2);
        hVar.f121041b = (InterfaceC15783O) obj;
        return hVar.invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object objF = IntrinsicsKt.f();
        int i10 = this.f121040a;
        if (i10 != 0) {
            if (i10 == 1) {
                booleanRef = (Ref.BooleanRef) this.f121041b;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f121041b;
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Context context = this.f121042c.f121024h;
            Intrinsics.g(clockSystemDefaultZone);
            if (PreferenceExtensionKt.needConfigSync(context, clockSystemDefaultZone)) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                W wB = C15809k.b(interfaceC15783O, null, null, new g(booleanRef2, this.f121042c, clockSystemDefaultZone, null), 3, null);
                this.f121041b = booleanRef2;
                this.f121040a = 1;
                if (wB.H(this) == objF) {
                    return objF;
                }
                booleanRef = booleanRef2;
            } else {
                return c.a.c();
            }
        }
        if (booleanRef.f143735a) {
            return c.a.a();
        }
        return c.a.c();
    }
}

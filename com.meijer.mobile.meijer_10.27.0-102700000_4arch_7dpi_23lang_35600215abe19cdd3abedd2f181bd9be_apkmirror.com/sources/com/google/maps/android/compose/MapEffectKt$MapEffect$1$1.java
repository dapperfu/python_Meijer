package com.google.maps.android.compose;

import Kd.C3945c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$1$1", f = "MapEffect.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class MapEffectKt$MapEffect$1$1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<InterfaceC16622O, C3945c, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ C3945c $map;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapEffectKt$MapEffect$1$1 mapEffectKt$MapEffect$1$1 = new MapEffectKt$MapEffect$1$1(this.$block, this.$map, continuation);
        mapEffectKt$MapEffect$1$1.L$0 = obj;
        return mapEffectKt$MapEffect$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MapEffectKt$MapEffect$1$1(Function3<? super InterfaceC16622O, ? super C3945c, ? super Continuation<? super Unit>, ? extends Object> function3, C3945c c3945c, Continuation<? super MapEffectKt$MapEffect$1$1> continuation) {
        super(2, continuation);
        this.$block = function3;
        this.$map = c3945c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
        return ((MapEffectKt$MapEffect$1$1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.L$0;
        Object objF = IntrinsicsKt.f();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.b(obj);
            Function3<InterfaceC16622O, C3945c, Continuation<? super Unit>, Object> function3 = this.$block;
            C3945c c3945c = this.$map;
            this.L$0 = SpillingKt.a(interfaceC16622O);
            this.label = 1;
            if (function3.invoke(interfaceC16622O, c3945c, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f142422a;
    }
}

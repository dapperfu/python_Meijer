package com.google.maps.android.compose;

import Md.C4110c;
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
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$5$1", f = "MapEffect.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MapEffectKt$MapEffect$5$1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<InterfaceC15783O, C4110c, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ C4110c $map;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapEffectKt$MapEffect$5$1 mapEffectKt$MapEffect$5$1 = new MapEffectKt$MapEffect$5$1(this.$block, this.$map, continuation);
        mapEffectKt$MapEffect$5$1.L$0 = obj;
        return mapEffectKt$MapEffect$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MapEffectKt$MapEffect$5$1(Function3<? super InterfaceC15783O, ? super C4110c, ? super Continuation<? super Unit>, ? extends Object> function3, C4110c c4110c, Continuation<? super MapEffectKt$MapEffect$5$1> continuation) {
        super(2, continuation);
        this.$block = function3;
        this.$map = c4110c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
        return ((MapEffectKt$MapEffect$5$1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.L$0;
        Object objF = IntrinsicsKt.f();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.b(obj);
            Function3<InterfaceC15783O, C4110c, Continuation<? super Unit>, Object> function3 = this.$block;
            C4110c c4110c = this.$map;
            this.L$0 = SpillingKt.a(interfaceC15783O);
            this.label = 1;
            if (function3.invoke(interfaceC15783O, c4110c, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f143329a;
    }
}

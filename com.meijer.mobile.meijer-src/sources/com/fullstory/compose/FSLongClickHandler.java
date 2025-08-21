package com.fullstory.compose;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/fullstory/compose/FSLongClickHandler;", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "onLongClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)V", "getModifier", "()Landroidx/compose/ui/Modifier;", "getOnLongClick", "()Lkotlin/jvm/functions/Function0;", "invoke", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FSLongClickHandler implements Function0<Unit> {
    private final Modifier modifier;
    private final Function0<Unit> onLongClick;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f143329a;
    }

    public FSLongClickHandler(Modifier modifier, Function0<Unit> onLongClick) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(onLongClick, "onLongClick");
        this.modifier = modifier;
        this.onLongClick = onLongClick;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Function0<Unit> getOnLongClick() {
        return this.onLongClick;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        FullStoryAnnotationsKt.__fullstory_onClick(this.modifier, true);
        this.onLongClick.invoke();
    }
}

package com.google.maps.android.compose;

import Md.C4110c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B8\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R-\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\n\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/compose/MapClickListenerNode;", "", "L", "Lcom/google/maps/android/compose/MapNode;", "LMd/c;", "map", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "setter", "listener", "<init>", "(LMd/c;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "listenerOrNull", "setListener", "(Ljava/lang/Object;)V", "onAttached", "()V", "onRemoved", "onCleared", "LMd/c;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Object;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapClickListenerNode<L> implements MapNode {
    public static final int $stable = 8;
    private final L listener;
    private final C4110c map;
    private final Function2<C4110c, L, Unit> setter;

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        setListener(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        setListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapClickListenerNode(C4110c map, Function2<? super C4110c, ? super L, Unit> setter, L listener) {
        Intrinsics.j(map, "map");
        Intrinsics.j(setter, "setter");
        Intrinsics.j(listener, "listener");
        this.map = map;
        this.setter = setter;
        this.listener = listener;
    }

    private final void setListener(L listenerOrNull) {
        this.setter.invoke(this.map, listenerOrNull);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        setListener(this.listener);
    }
}

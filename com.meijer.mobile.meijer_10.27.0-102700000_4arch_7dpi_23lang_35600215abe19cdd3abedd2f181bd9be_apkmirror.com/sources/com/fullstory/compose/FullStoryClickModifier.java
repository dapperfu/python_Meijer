package com.fullstory.compose;

import androidx.compose.ui.Modifier;
import com.fullstory.instrumentation.frameworks.compose.FSClickModifier;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/fullstory/compose/FullStoryClickModifier;", "Landroidx/compose/ui/Modifier$b;", "<init>", "()V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/Object;", "layoutNode", "Ljava/lang/ref/WeakReference;", "getLayoutNode", "()Ljava/lang/ref/WeakReference;", "setLayoutNode", "(Ljava/lang/ref/WeakReference;)V", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FullStoryClickModifier implements Modifier.b, FSClickModifier {
    private WeakReference<Object> layoutNode;

    @Override // com.fullstory.instrumentation.frameworks.compose.FSClickModifier
    public final WeakReference _fsGetLayoutNode() {
        return getLayoutNode();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSClickModifier
    public void _fsSetLayoutNode(WeakReference weakReference) {
        setLayoutNode(weakReference);
    }

    public final WeakReference<Object> getLayoutNode() {
        return this.layoutNode;
    }

    public final void setLayoutNode(WeakReference<Object> weakReference) {
        this.layoutNode = weakReference;
    }

    @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
    public boolean all(Function1<? super Modifier.b, Boolean> function1) {
        return Modifier.b.a.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
    public boolean any(Function1<? super Modifier.b, Boolean> function1) {
        return Modifier.b.a.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
    public <R> R foldIn(R r10, Function2<? super R, ? super Modifier.b, ? extends R> function2) {
        return (R) Modifier.b.a.c(this, r10, function2);
    }

    @Override // androidx.compose.ui.Modifier.b
    public <R> R foldOut(R r10, Function2<? super Modifier.b, ? super R, ? extends R> function2) {
        return (R) Modifier.b.a.d(this, r10, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier) {
        return Modifier.b.a.e(this, modifier);
    }
}

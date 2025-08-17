package com.fullstory.compose;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/fullstory/compose/FullStorySingleValue;", "Landroidx/compose/ui/Modifier$b;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
abstract class FullStorySingleValue implements Modifier.b {
    private final String value;

    public FullStorySingleValue(String value) {
        Intrinsics.j(value, "value");
        this.value = value;
    }

    protected final String getValue() {
        return this.value;
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.value + ')';
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

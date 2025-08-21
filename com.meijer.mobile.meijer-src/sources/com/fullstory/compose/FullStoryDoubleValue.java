package com.fullstory.compose;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\"\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/fullstory/compose/FullStoryDoubleValue;", "Landroidx/compose/ui/Modifier$b;", "", "value0", "value1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue0", "getValue1", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
abstract class FullStoryDoubleValue implements Modifier.b {
    private final String value0;
    private final String value1;

    public FullStoryDoubleValue(String value0, String value1) {
        Intrinsics.j(value0, "value0");
        Intrinsics.j(value1, "value1");
        this.value0 = value0;
        this.value1 = value1;
    }

    protected final String getValue0() {
        return this.value0;
    }

    protected final String getValue1() {
        return this.value1;
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.value0 + ", " + this.value1 + ')';
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

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public abstract class UnwrappedType extends KotlinType {
    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType N0() {
        return this;
    }

    public abstract UnwrappedType O0(boolean z10);

    public abstract UnwrappedType P0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType Q0(TypeAttributes typeAttributes);

    private UnwrappedType() {
        super(null);
    }
}

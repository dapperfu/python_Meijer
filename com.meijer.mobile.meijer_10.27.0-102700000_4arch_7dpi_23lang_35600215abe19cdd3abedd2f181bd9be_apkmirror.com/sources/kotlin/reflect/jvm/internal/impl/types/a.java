package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes13.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f146805a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeCheckerState f146806b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeSystemContext f146807c;

    /* renamed from: d, reason: collision with root package name */
    private final RigidTypeMarker f146808d;

    public a(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        this.f146805a = collection;
        this.f146806b = typeCheckerState;
        this.f146807c = typeSystemContext;
        this.f146808d = rigidTypeMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeChecker.x(this.f146805a, this.f146806b, this.f146807c, this.f146808d, (TypeCheckerState.ForkPointContext) obj);
    }
}
